// API client — wired to the live **Invest254** backend (the real endpoints).
//
// The M-PESA-style UI is phone + 4-digit PIN, but the backend authenticates with
// phone + username + password (self-managed scrypt auth, HS256 JWT). To bridge the two
// WITHOUT changing any screen, this client deterministically derives a backend-valid
// username and password from the (phone, pin) the user already provides, manages the
// returned Bearer token internally, and exposes the SAME function signatures/return
// shapes the screens + AuthContext already consume.
//
// Backend contract (apps/api, base `/api/v1`):
//   POST /auth/register { phone, username, password } -> 201 { token, userId, role }
//   POST /auth/login    { phone, password }           -> 200 { token, userId, role } | 401 INVALID_CREDENTIALS
//   GET  /wallet        (Bearer)                       -> 200 { real, bonus, currency }   // cents (KES)
//   GET  /auth/me       (Bearer)                       -> 200 { userId, role, username, phone }
// Error envelope (all non-2xx): { error: { code, message } }
//
// Point the app at a different deployment with EXPO_PUBLIC_API_BASE or app.json
// `extra.apiBase` (must include the `/api/v1` suffix). Nothing else changes.

import Constants from "expo-constants";
import * as SecureStore from "expo-secure-store";

export const API_BASE: string =
  process.env.EXPO_PUBLIC_API_BASE ??
  (Constants.expoConfig?.extra?.apiBase as string) ??
  "https://invest254.fly.dev/api/v1";

export const PIN_LENGTH = 4;
export const MAX_PIN_ATTEMPTS = 3;
const TIMEOUT_MS = 15000;

// Reserved keystore slot for the server-issued JWT (see docs/ARCHITECTURE.md).
const KEY_TOKEN = "mpesa_token";
let inMemoryToken: string | null = null;

// ---------------------------------------------------------------------------
// Credential bridge: (phone, pin) -> backend (phone, username, password)
// ---------------------------------------------------------------------------

// Normalize a Kenyan mobile number to MSISDN form `2547XXXXXXXX` / `2541XXXXXXXX`
// (12 digits, no '+'). Mirrors the backend `normalizeMsisdn` so the SAME account is
// addressed on register and login. Returns null on anything the backend would reject.
export function normalizePhone(input: string): string | null {
  const raw = String(input ?? "").replace(/[\s\-()]/g, "").replace(/^\+/, "");
  let msisdn: string;
  if (/^0(7|1)\d{8}$/.test(raw)) msisdn = `254${raw.slice(1)}`;
  else if (/^254(7|1)\d{8}$/.test(raw)) msisdn = raw;
  else if (/^(7|1)\d{8}$/.test(raw)) msisdn = `254${raw}`;
  else return null;
  return /^254(7|1)\d{8}$/.test(msisdn) ? msisdn : null;
}

// Public display username derived from the phone (unique, matches the backend's
// USERNAME charset: starts/ends alphanumeric, 3–20 chars).
function deriveUsername(msisdn: string): string {
  return `u${msisdn}`;
}

// Password derived from phone + pin. Deterministic so the correct PIN reproduces it
// and a wrong PIN yields a different password (-> 401, surfaced as a wrong PIN).
// Satisfies the backend rules: length 8–128, at least one letter and one digit.
function derivePassword(msisdn: string, pin: string): string {
  return `Mpesa-${msisdn}-${pin}`;
}

// ---------------------------------------------------------------------------
// Token helpers
// ---------------------------------------------------------------------------
async function setToken(token: string | null): Promise<void> {
  inMemoryToken = token;
  try {
    if (token) await SecureStore.setItemAsync(KEY_TOKEN, token);
    else await SecureStore.deleteItemAsync(KEY_TOKEN);
  } catch {
    // SecureStore unavailable (e.g. web) — the in-memory copy still serves this session.
  }
}

async function getToken(): Promise<string | null> {
  if (inMemoryToken) return inMemoryToken;
  try {
    inMemoryToken = await SecureStore.getItemAsync(KEY_TOKEN);
  } catch {
    inMemoryToken = null;
  }
  return inMemoryToken;
}

export async function clearToken(): Promise<void> {
  await setToken(null);
}

// ---------------------------------------------------------------------------
// HTTP plumbing
// ---------------------------------------------------------------------------
function withTimeout(): { signal: AbortSignal; done: () => void } {
  const controller = new AbortController();
  const timer = setTimeout(() => controller.abort(), TIMEOUT_MS);
  return { signal: controller.signal, done: () => clearTimeout(timer) };
}

async function safeJson(res: Response): Promise<any | null> {
  try {
    return await res.json();
  } catch {
    return null;
  }
}

// Pull the human-readable message out of the `{ error: { code, message } }` envelope.
function errorMessage(body: any, fallback: string): string {
  return body?.error?.message ?? body?.error?.code ?? body?.message ?? fallback;
}

function networkMessage(e: any): string {
  return e?.name === "AbortError"
    ? "Request timed out. Check your connection."
    : "Network error";
}

// ---------------------------------------------------------------------------
// Register: POST /auth/register { phone, username, password }
// ---------------------------------------------------------------------------
export type RegisterResult =
  | { kind: "ok"; data: any }
  | { kind: "error"; message: string }
  | { kind: "network_error"; message: string };

export async function register(phone: string, pin: string, name: string): Promise<RegisterResult> {
  const msisdn = normalizePhone(phone);
  if (!msisdn) return { kind: "error", message: "Please enter a valid phone number" };
  const { signal, done } = withTimeout();
  try {
    const res = await fetch(`${API_BASE}/auth/register`, {
      method: "POST",
      headers: { "Content-Type": "application/json", Accept: "application/json" },
      body: JSON.stringify({
        phone: msisdn,
        username: deriveUsername(msisdn),
        password: derivePassword(msisdn, pin),
      }),
      signal,
    });
    const body = await safeJson(res);
    if (res.ok) {
      if (body?.token) await setToken(body.token);
      return { kind: "ok", data: body };
    }
    return { kind: "error", message: errorMessage(body, "Registration failed") };
  } catch (e: any) {
    return { kind: "network_error", message: networkMessage(e) };
  } finally {
    done();
  }
}

// ---------------------------------------------------------------------------
// Login / verify PIN: POST /auth/login { phone, password }
// 401 INVALID_CREDENTIALS == wrong PIN (the screen strikes/locks on that).
// ---------------------------------------------------------------------------
export type LoginResult =
  | { kind: "success"; data: any }
  | { kind: "wrong_pin" }
  | { kind: "network_error"; message: string };

export async function login(phone: string, pin: string): Promise<LoginResult> {
  const msisdn = normalizePhone(phone);
  if (!msisdn) return { kind: "wrong_pin" };
  const { signal, done } = withTimeout();
  try {
    const res = await fetch(`${API_BASE}/auth/login`, {
      method: "POST",
      headers: { "Content-Type": "application/json", Accept: "application/json" },
      body: JSON.stringify({ phone: msisdn, password: derivePassword(msisdn, pin) }),
      signal,
    });
    const body = await safeJson(res);
    if (res.ok) {
      if (body?.token) await setToken(body.token);
      return { kind: "success", data: body };
    }
    if (res.status === 401) return { kind: "wrong_pin" };
    // 403 (suspended/banned), 5xx, etc. — surface the message without a PIN strike.
    return { kind: "network_error", message: errorMessage(body, `HTTP ${res.status}`) };
  } catch (e: any) {
    return { kind: "network_error", message: networkMessage(e) };
  } finally {
    done();
  }
}

// ---------------------------------------------------------------------------
// Balance: GET /wallet (Bearer) -> { real, bonus, currency } (cents)
// Mapped to the app's { balance, fuliza, name } shape (KES, not cents).
// ---------------------------------------------------------------------------
export type BalanceResult =
  | { kind: "ok"; balance: number; fuliza: number; name: string | null }
  | { kind: "error"; message: string };

export async function getBalance(_phone: string): Promise<BalanceResult> {
  const token = await getToken();
  if (!token) return { kind: "error", message: "Not signed in" };
  const { signal, done } = withTimeout();
  try {
    const res = await fetch(`${API_BASE}/wallet`, {
      headers: { Accept: "application/json", Authorization: `Bearer ${token}` },
      signal,
    });
    if (!res.ok) return { kind: "error", message: `HTTP ${res.status}` };
    const data = await safeJson(res);
    return {
      kind: "ok",
      balance: Number(data?.real ?? 0) / 100, // cents -> KES
      fuliza: Number(data?.bonus ?? 0) / 100, // bonus wallet -> "fuliza" figure
      name: null,
    };
  } catch (e: any) {
    return { kind: "error", message: networkMessage(e) };
  } finally {
    done();
  }
}

