// API client for the My OneApp backend.
// Endpoints reconstructed from the decompiled bundle:
//   POST /api/register   { phone, pin, name }   -> 200 {success:true} | 409 already exists
//   POST /api/login      { phone, pin }          -> 200 {user:{name,balance,fuliza}}
//                                                   401 {error:"Invalid PIN"}
//                                                   403 {error:"...pending approval..."}
//                                                   404 {error:"User not found"}
//   GET  /api/balance?phone=...                  -> 200 {balance,fuliza,name}
//
// IMPORTANT FIX (see docs/AUDIT.md §1): the original login screen only checked
// `res.ok`, so a 403 "pending approval" (a CORRECT pin!) and every network error
// were shown as "Wrong PIN" and counted toward a 3-attempt lockout. This client
// branches on the status code and returns a typed outcome so the UI can show the
// truth and only strike/lock on a genuine 401.

import Constants from "expo-constants";

export const API_BASE: string =
  process.env.EXPO_PUBLIC_API_BASE ??
  (Constants.expoConfig?.extra?.apiBase as string) ??
  "https://mpesa.highpesa.com";

export const PIN_LENGTH = 4;
export const MAX_PIN_ATTEMPTS = 3;
const TIMEOUT_MS = 15000;

/** Normalize Kenyan MSISDNs to a single canonical form: 2547XXXXXXXX / 2541XXXXXXXX.
 *  Used for BOTH register and login so identity matching can never silently fail. */
export function normalizePhone(raw: string): string {
  let p = (raw || "").replace(/[^\d+]/g, "");
  if (p.startsWith("+")) p = p.slice(1);
  if (p.startsWith("0")) p = "254" + p.slice(1);
  else if (p.startsWith("7") || p.startsWith("1")) p = "254" + p;
  return p;
}

async function postJson(path: string, body: unknown): Promise<Response> {
  const controller = new AbortController();
  const timer = setTimeout(() => controller.abort(), TIMEOUT_MS);
  try {
    return await fetch(`${API_BASE}${path}`, {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(body),
      signal: controller.signal,
    });
  } finally {
    clearTimeout(timer);
  }
}

async function safeJson(res: Response): Promise<any | null> {
  try {
    return await res.json();
  } catch {
    return null;
  }
}

// ---------------------------------------------------------------------------
// Register
// ---------------------------------------------------------------------------
export type RegisterResult =
  | { kind: "ok" }
  | { kind: "already_exists" }
  | { kind: "error"; message: string }
  | { kind: "network_error"; message: string };

export async function register(rawPhone: string, pin: string, name: string): Promise<RegisterResult> {
  let res: Response;
  try {
    res = await postJson("/api/register", { phone: normalizePhone(rawPhone), pin, name: name.trim() });
  } catch (e: any) {
    return { kind: "network_error", message: networkMessage(e) };
  }
  if (res.ok) return { kind: "ok" };
  if (res.status === 409) return { kind: "already_exists" };
  const body = await safeJson(res);
  return { kind: "error", message: body?.error ?? "Registration failed" };
}

// ---------------------------------------------------------------------------
// Login / verify PIN
// ---------------------------------------------------------------------------
export type LoginOutcome =
  | { kind: "success"; user: { name: string; balance: number; fuliza: number } }
  | { kind: "wrong_pin" }
  | { kind: "pending_approval"; message: string }
  | { kind: "not_registered" }
  | { kind: "network_error"; message: string }
  | { kind: "server_error"; message: string };

export async function login(rawPhone: string, pin: string): Promise<LoginOutcome> {
  let res: Response;
  try {
    res = await postJson("/api/login", { phone: normalizePhone(rawPhone), pin });
  } catch (e: any) {
    return { kind: "network_error", message: networkMessage(e) };
  }

  if (res.ok) {
    const data = await safeJson(res);
    return {
      kind: "success",
      user: {
        name: data?.user?.name ?? "",
        balance: Number(data?.user?.balance ?? 0),
        fuliza: Number(data?.user?.fuliza ?? 0),
      },
    };
  }

  if (res.status === 401) return { kind: "wrong_pin" }; // the ONLY real wrong-PIN case
  if (res.status === 403) {
    const body = await safeJson(res);
    return { kind: "pending_approval", message: body?.error ?? "Your account is pending approval. Please try again later." };
  }
  if (res.status === 404) return { kind: "not_registered" };
  return { kind: "server_error", message: "Something went wrong. Please try again." };
}

// ---------------------------------------------------------------------------
// Balance (polled on the dashboard)
// ---------------------------------------------------------------------------
export type BalanceResult =
  | { kind: "ok"; balance: number; fuliza: number; name: string }
  | { kind: "error"; message: string };

export async function getBalance(rawPhone: string): Promise<BalanceResult> {
  try {
    const res = await fetch(`${API_BASE}/api/balance?phone=${encodeURIComponent(normalizePhone(rawPhone))}`);
    if (!res.ok) return { kind: "error", message: `HTTP ${res.status}` };
    const data = await safeJson(res);
    return { kind: "ok", balance: Number(data?.balance ?? 0), fuliza: Number(data?.fuliza ?? 0), name: data?.name ?? "" };
  } catch (e: any) {
    return { kind: "error", message: networkMessage(e) };
  }
}

function networkMessage(e: any): string {
  return e?.name === "AbortError"
    ? "Request timed out. Check your connection."
    : "Network error. Please try again.";
}
