'use strict';

/**
 * My OneApp mock backend — a zero-dependency Node HTTP server.
 *
 * Run:  node src/server.js         (defaults to http://localhost:4000)
 * All responses are JSON. CORS is open so the Android app / a browser can call it.
 *
 * Base path: /api/v1
 */

const http = require('http');
const store = require('./store');
const wallet = require('./wallet');

const PORT = process.env.PORT || 4000;
const BASE = '/api/v1';

function send(res, status, body) {
  const payload = JSON.stringify(body);
  res.writeHead(status, {
    'Content-Type': 'application/json',
    'Access-Control-Allow-Origin': '*',
    'Access-Control-Allow-Methods': 'GET,POST,PUT,DELETE,OPTIONS',
    'Access-Control-Allow-Headers': 'Content-Type,Authorization',
  });
  res.end(payload);
}

const ok = (res, data, status = 200) => send(res, status, { success: true, data });
const fail = (res, status, error, message) => send(res, status, { success: false, error, message });

function readBody(req) {
  return new Promise((resolve) => {
    let raw = '';
    req.on('data', (c) => (raw += c));
    req.on('end', () => {
      try {
        resolve(raw ? JSON.parse(raw) : {});
      } catch {
        resolve({});
      }
    });
  });
}

/** Public view of a user (never leaks the PIN). */
function publicUser(u) {
  return {
    phone: u.phone,
    name: u.name,
    biometricEnabled: u.biometricEnabled,
    profilePicture: u.profilePicture,
    ...wallet.balances(u),
    createdAt: u.createdAt,
  };
}

// ------------------------------------------------------------------ routing table

const routes = [];
const route = (method, pattern, handler) => {
  // pattern like "/users/:phone/balances" -> regex with named groups
  const keys = [];
  const rx = new RegExp(
    '^' +
      pattern.replace(/:[^/]+/g, (m) => {
        keys.push(m.slice(1));
        return '([^/]+)';
      }) +
      '/?$'
  );
  routes.push({ method, rx, keys, handler });
};

// Health
route('GET', '/health', async (req, res) => ok(res, { status: 'up', time: new Date().toISOString() }));

// ---- Users / auth / PIN / biometric / profile picture --------------------------

// Create a user (name, phone, [pin], [biometricEnabled], [profilePicture]).
route('POST', '/users', async (req, res, _p, body) => {
  if (!body.phone || !body.name) return fail(res, 400, 'MISSING_FIELDS', 'phone and name are required');
  if (store.getUser(body.phone)) return fail(res, 409, 'USER_EXISTS', 'phone already registered');
  const u = store.createUser({ phone: body.phone, name: body.name });
  if (body.pin) u.pin = String(body.pin);
  if (typeof body.biometricEnabled === 'boolean') u.biometricEnabled = body.biometricEnabled;
  if (body.profilePicture) u.profilePicture = body.profilePicture;
  store.save();
  return ok(res, publicUser(u), 201);
});

// Get a user.
route('GET', '/users/:phone', async (req, res, p) => {
  const u = store.getUser(p.phone);
  return u ? ok(res, publicUser(u)) : fail(res, 404, 'NOT_FOUND', 'user not found');
});

// Verify PIN (login).
route('POST', '/users/:phone/login', async (req, res, p, body) => {
  const u = store.getUser(p.phone);
  if (!u) return fail(res, 404, 'NOT_FOUND', 'user not found');
  if (body.biometric === true && u.biometricEnabled) return ok(res, publicUser(u));
  if (String(body.pin) !== u.pin) return fail(res, 401, 'WRONG_PIN', 'incorrect M-PESA PIN');
  return ok(res, publicUser(u));
});

// Set / change PIN.
route('PUT', '/users/:phone/pin', async (req, res, p, body) => {
  const u = store.getUser(p.phone);
  if (!u) return fail(res, 404, 'NOT_FOUND', 'user not found');
  if (u.pin && body.currentPin != null && String(body.currentPin) !== u.pin) {
    return fail(res, 401, 'WRONG_PIN', 'current PIN is incorrect');
  }
  if (!body.newPin || String(body.newPin).length !== 4) {
    return fail(res, 400, 'INVALID_PIN', 'newPin must be 4 digits');
  }
  u.pin = String(body.newPin);
  store.save();
  return ok(res, { updated: true });
});

// Enable / disable biometric login.
route('PUT', '/users/:phone/biometric', async (req, res, p, body) => {
  const u = store.getUser(p.phone);
  if (!u) return fail(res, 404, 'NOT_FOUND', 'user not found');
  u.biometricEnabled = !!body.enabled;
  store.save();
  return ok(res, { biometricEnabled: u.biometricEnabled });
});

// Set the profile picture (data URL or remote URL).
route('PUT', '/users/:phone/profile-picture', async (req, res, p, body) => {
  const u = store.getUser(p.phone);
  if (!u) return fail(res, 404, 'NOT_FOUND', 'user not found');
  if (!body.profilePicture) return fail(res, 400, 'MISSING_FIELDS', 'profilePicture is required');
  u.profilePicture = body.profilePicture;
  store.save();
  return ok(res, { profilePicture: u.profilePicture });
});

// ---- Balances ------------------------------------------------------------------

route('GET', '/users/:phone/balances', async (req, res, p) => {
  const u = store.getUser(p.phone);
  return u ? ok(res, wallet.balances(u)) : fail(res, 404, 'NOT_FOUND', 'user not found');
});

// Directly set/adjust any balances (balance, airtime, fulizaLimit, fulizaUsed).
route('PUT', '/users/:phone/balances', async (req, res, p, body) => {
  const u = store.getUser(p.phone);
  if (!u) return fail(res, 404, 'NOT_FOUND', 'user not found');
  for (const k of ['balance', 'airtime', 'fulizaLimit', 'fulizaUsed']) {
    if (typeof body[k] === 'number') u[k] = wallet.round2(body[k]);
  }
  store.save();
  return ok(res, wallet.balances(u));
});

// ---- Transactions --------------------------------------------------------------

// Send / pay (debits balance, Fuliza covers shortfall).
route('POST', '/users/:phone/send', async (req, res, p, body) => {
  const u = store.getUser(p.phone);
  if (!u) return fail(res, 404, 'NOT_FOUND', 'user not found');
  const r = wallet.send(u, body);
  if (!r.ok) return fail(res, 400, r.error, 'transaction declined');
  store.save();
  return ok(res, r);
});

// Receive / deposit (credits balance, repays Fuliza first).
route('POST', '/users/:phone/deposit', async (req, res, p, body) => {
  const u = store.getUser(p.phone);
  if (!u) return fail(res, 404, 'NOT_FOUND', 'user not found');
  const r = wallet.deposit(u, body);
  if (!r.ok) return fail(res, 400, r.error, 'deposit failed');
  store.save();
  return ok(res, r);
});

// Statement / transaction history.
route('GET', '/users/:phone/transactions', async (req, res, p) => {
  const u = store.getUser(p.phone);
  return u ? ok(res, u.transactions) : fail(res, 404, 'NOT_FOUND', 'user not found');
});

// ------------------------------------------------------------------ server

const server = http.createServer(async (req, res) => {
  if (req.method === 'OPTIONS') return send(res, 204, {});
  if (!req.url.startsWith(BASE)) return fail(res, 404, 'NOT_FOUND', 'unknown path');

  const urlPath = req.url.slice(BASE.length).split('?')[0] || '/';
  const body = ['POST', 'PUT', 'DELETE'].includes(req.method) ? await readBody(req) : {};

  for (const r of routes) {
    if (r.method !== req.method) continue;
    const m = r.rx.exec(urlPath);
    if (!m) continue;
    const params = {};
    r.keys.forEach((k, i) => (params[k] = decodeURIComponent(m[i + 1])));
    try {
      return await r.handler(req, res, params, body);
    } catch (e) {
      return fail(res, 500, 'SERVER_ERROR', e.message);
    }
  }
  return fail(res, 404, 'NOT_FOUND', `no route for ${req.method} ${urlPath}`);
});

server.listen(PORT, () => {
  console.log(`My OneApp mock backend listening on http://localhost:${PORT}${BASE}`);
});

