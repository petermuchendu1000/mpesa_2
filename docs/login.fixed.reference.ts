// Corrected PIN login handler for My OneApp (app/pin screen)
// Root cause it fixes: the original code only checked `res.ok`, so a 403
// "pending approval" (CORRECT pin) and 404 / network errors were all shown as
// "Wrong PIN" and counted toward a 3-strike lockout. This branches on status,
// surfaces the real message, and only strikes/locks on a genuine 401.

import * as SecureStore from "expo-secure-store";

const API_BASE = process.env.EXPO_PUBLIC_API_BASE ?? "https://mpesa.highpesa.com";
const MAX_ATTEMPTS = 3;

type LoginOutcome =
  | { kind: "success"; user: { name: string; balance: number; fuliza: number } }
  | { kind: "wrong_pin"; attemptsLeft: number; locked: boolean }
  | { kind: "pending_approval"; message: string }
  | { kind: "not_registered" }
  | { kind: "network_error"; message: string };

/**
 * Verify the PIN against the backend.
 * @param attempts current count of CONSECUTIVE wrong-PIN attempts (401 only)
 */
export async function verifyPin(pin: string, attempts: number): Promise<LoginOutcome> {
  const phone = await SecureStore.getItemAsync("mpesa_phone");
  if (!phone) return { kind: "not_registered" };

  let res: Response;
  try {
    const controller = new AbortController();
    const t = setTimeout(() => controller.abort(), 15000);
    res = await fetch(`${API_BASE}/api/login`, {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ phone: phone.trim(), pin }),
      signal: controller.signal,
    });
    clearTimeout(t);
  } catch (e: any) {
    // Network/timeout: NOT a wrong PIN — do not strike, do not lock.
    const msg =
      e?.name === "AbortError"
        ? "Request timed out. Check your connection."
        : "Network error. Please try again.";
    return { kind: "network_error", message: msg };
  }

  // ---- Branch on the actual status, not just res.ok ----
  if (res.ok) {
    const data = await res.json();
    await Promise.all([
      SecureStore.setItemAsync("mpesa_registered", "true"),
      SecureStore.setItemAsync("mpesa_phone", phone.trim()),
      SecureStore.setItemAsync("mpesa_name", data.user?.name ?? ""),
    ]);
    return {
      kind: "success",
      user: {
        name: data.user?.name ?? "",
        balance: Number(data.user?.balance ?? 0),
        fuliza: Number(data.user?.fuliza ?? 0),
      },
    };
  }

  if (res.status === 403) {
    // Correct PIN, account not yet approved. Do NOT strike or lock.
    const body = await safeJson(res);
    return {
      kind: "pending_approval",
      message: body?.error ?? "Your account is pending approval. Please try again later.",
    };
  }

  if (res.status === 404) {
    // No such account on this phone -> send them to registration.
    return { kind: "not_registered" };
  }

  if (res.status === 401) {
    // The ONLY genuine wrong-PIN case.
    const next = attempts + 1;
    return { kind: "wrong_pin", attemptsLeft: Math.max(0, MAX_ATTEMPTS - next), locked: next >= MAX_ATTEMPTS };
  }

  // 5xx / anything else: treat as a transient server problem, not a wrong PIN.
  return { kind: "network_error", message: "Something went wrong. Please try again." };
}

async function safeJson(res: Response): Promise<any | null> {
  try { return await res.json(); } catch { return null; }
}

/* ---- Example wiring in the PIN screen ----
const outcome = await verifyPin(enteredPin, wrongAttempts);
switch (outcome.kind) {
  case "success":          router.replace("/home"); break;
  case "wrong_pin":
    setWrongAttempts(a => a + 1);                 // only here do we increment
    setError(outcome.locked
      ? "Account locked. Too many wrong attempts."
      : `Wrong PIN, try again. ${outcome.attemptsLeft} attempt${outcome.attemptsLeft === 1 ? "" : "s"} left.`);
    break;
  case "pending_approval": setError(outcome.message); break;       // NOT a strike
  case "not_registered":   router.replace("/register"); break;
  case "network_error":    setError(outcome.message); break;       // NOT a strike
}
setPin("");
------------------------------------------- */
