'use strict';

const fs = require('fs');
const path = require('path');

const DATA_FILE = path.join(__dirname, '..', 'data.json');

/** Default seed matching the app's AppState. */
function seedUser(phone, name) {
  return {
    phone,
    name,
    pin: '0000',
    biometricEnabled: false,
    profilePicture: null, // data URL or remote URL
    balance: 914.88,
    fulizaLimit: 300.0,
    fulizaUsed: 0.0,
    airtime: 20.0,
    transactions: [],
    createdAt: new Date().toISOString(),
  };
}

let db = { users: {} };

function load() {
  try {
    db = JSON.parse(fs.readFileSync(DATA_FILE, 'utf8'));
    if (!db.users) db.users = {};
  } catch {
    db = { users: {} };
    // Seed a demo account so the app works out of the box.
    db.users['0703501549'] = seedUser('0703501549', 'Peter Muchendu');
    save();
  }
}

function save() {
  fs.writeFileSync(DATA_FILE, JSON.stringify(db, null, 2));
}

function getUser(phone) {
  return db.users[phone] || null;
}

function createUser({ phone, name }) {
  const u = seedUser(phone, name);
  db.users[phone] = u;
  save();
  return u;
}

function updateUser(phone, patch) {
  const u = db.users[phone];
  if (!u) return null;
  Object.assign(u, patch);
  save();
  return u;
}

load();

module.exports = { db, seedUser, load, save, getUser, createUser, updateUser };

