# My OneApp (mpesa.apk) — Code Audit, PIN Bug Diagnosis & Improvement Plan

**App:** `com.safaricom.mpesa` — "My OneApp" v1.0.0 (slug `mpesa-clone`)
**Stack:** React Native + Expo SDK 55 (new architecture), Hermes bytecode bundle, expo-router, OkHttp.
**Backend:** `https://mpesa.highpesa.com` (live, IP 66.70.178.128)
**Analysis method:** Unzipped APK → decompiled the Hermes bundle (`assets/index.android.bundle`) to readable pseudo-JS → traced the auth flow → reproduced live against the backend.

---

## 1. THE PIN BUG — root cause (CONFIRMED)

**The PIN the user sets is correct. The app misreports it as wrong.**

Your backend puts every newly registered account into a **"pending approval"** state. The login screen treats that — and every other non-200 response — as a wrong PIN, then locks the account after 3 attempts.

### Live reproduction (test account, fresh registration)
| Action | Request | Server returned |
|---|---|---|
| Register | `POST /api/register {phone, pin:"4821", name}` | `200 {"success":true}` |
| Login, **correct** PIN | `POST /api/login {phone, pin:"4821"}` | **`403 {"error":"Your account is pending approval. Please try again later."}`** |
| Login, **wrong** PIN | `POST /api/login {phone, pin:"9999"}` | `401 {"error":"Invalid PIN"}` |

The server clearly distinguishes "right PIN, not approved" (403) from "wrong PIN" (401). The app collapses both into one message.

### The defective client code (login handler, decompiled)
```
const res = await fetch(API_BASE + '/api/login', { method:'POST', body: {phone, pin} });
if (res.ok) {                      // 200 only
    // ... save session, set balance/fuliza, navigate home
} else {
    attempts = attempts + 1;       // <-- 401, 403, 404, 500 ALL land here
    setAttempts(attempts);
    if (attempts >= 3) setLocked(true);
    return false;                  // caller shows "Wrong PIN, try again. N attempts left."
}
```
It never reads `res.status` or `res.json().error`. The string `"pending approval"` does not exist anywhere in the app — it cannot ever be shown. (By contrast the **register** handler *does* inspect status, e.g. it special-cases `409`. Login is the inconsistent one.)

### Net effect for the user
1. User registers, picks a PIN, app sends them to the PIN login screen.
2. They type the **correct** PIN → server says 403 "pending approval".
3. App shows **"Wrong PIN, try again. 2 attempts left."**
4. Two more correct entries → **"Account locked. Too many wrong attempts."**
5. User is permanently convinced the app won't accept their PIN.

### Fixes (do all three)
- **Backend (fastest unblock):** auto-approve accounts on registration, OR return a clear, distinct response the app can act on. If approval is a real business requirement, the *register* response must tell the user "pending approval" — don't send them to a login screen they can't pass.
- **Client (must-fix):** read status + body and branch:
  - `200` → success.
  - `401 Invalid PIN` → count attempt, show "Wrong PIN…".
  - `403 pending approval` → show the approval message, **do not** count it as a failed attempt, **do not** lock.
  - `404 user not found` → route to registration.
  - network/5xx → "Connection problem, try again" (not a wrong-PIN strike).
- **Client:** only decrement attempts / lock on a genuine `401`.

A corrected handler is in `fixes/login.fixed.ts` (section 8).

---

## 2. Architecture & module breakdown

```
mpesa.apk  (com.safaricom.mpesa, 41 MB)
├─ AndroidManifest.xml      package, perms (see §6), minSdk 24 / targetSdk 36
├─ classes*.dex (x3)        Expo/RN native runtime + Kotlin glue (no app logic here)
├─ lib/arm64-v8a/*.so       Hermes, expo-modules-core, reanimated, fbjni, avif/gif decoders
│                           (NOTE: arm64 ONLY — no 32-bit/x86; see §7)
├─ assets/
│   ├─ index.android.bundle  ← ALL app logic (Hermes bytecode, ~2 MB) — JS/TS lives here
│   ├─ app.config            Expo config (name, scheme "mpesa", EAS projectId)
│   └─ dexopt/baseline.prof  startup profile
└─ res/, resources.arsc      icons, splash, strings
```

### App logic (inside the JS bundle) — expo-router screens
| Route | Purpose | Talks to backend? |
|---|---|---|
| `index` | entry / onboarding redirect | — |
| `register` | multi-step sign-up: **details → set PIN → confirm PIN** → `POST /api/register` | yes |
| `pin` | **login / unlock** — enter PIN → `POST /api/login` | yes |
| `home` | dashboard: balance, fuliza, quick actions, recents | balance: `GET /api/balance?phone=` (polled every 10 s) |
| `send` / `pay` / `withdraw` / `airtime` / `bundles` / `request` / `scan` | money-movement screens | **mostly mock — no backend transaction endpoints exist** |
| `statements` / `profile` / `settings` | account screens | partial / mock |

### Data layer — there are TWO competing sources of truth
- **Real:** `/api/login` (returns `user.name/balance/fuliza`) and `/api/balance` feed the dashboard after login.
- **Mock:** a hardcoded module ships in the bundle:
  ```js
  mockUser = { name:'James Nthiga', firstName:'James', initials:'JN',
               phone:'0702283114', status:'Active', tariff:'Prepaid',
               mpesaBalance:27670.76, fulilaAvailable:1500, airtime:0, data:'--',
               pin:'1234' };           // <-- hardcoded, ships in every APK
  mockTransactions = [ ...10 entries with real-looking names & masked phones... ];
  ```
  Recents/transactions and several action screens render from this mock data. So a logged-in user sees their **real balance** but **fake transaction history** and fake send/pay results.

### Local "session" model
There is **no token/JWT/session**. "Logged in" = three SecureStore flags written at login: `mpesa_registered`, `mpesa_phone`, `mpesa_name`. The PIN is **not** stored locally (good) — but neither is any real credential, so the client can't authenticate subsequent calls (see §6 IDOR).

---

## 3. Bugs found (prioritized)

**P0 — blocks core use**
1. **Login mislabels "pending approval" (and all non-200) as wrong PIN, then locks the account.** (§1) This is the reported bug.

**P1 — security (see §6 for detail)**
2. `GET /api/balance?phone=...` is **completely unauthenticated** → anyone can read any customer's balance, fuliza limit and name (IDOR / data exposure). Verified live.
3. No session token; "auth" is just a stored phone number. Trivially spoofable; every backend call trusts a client-supplied phone.
4. **Real PII + a default PIN are hardcoded in the shipped bundle** (`0702283114`, masked numbers, `pin:'1234'`). Anyone who unzips the APK reads them.
5. **Trademark / impersonation:** package id `com.safaricom.mpesa` and name "My OneApp" impersonate Safaricom M-PESA. This will get the app pulled and is a legal exposure.

**P2 — correctness / UX**
6. Client-side 3-strike lockout is **state-only** (resets on app restart) — it both annoys real users and fails to actually rate-limit attackers. Lockout must be server-side.
7. Money-movement screens (send/pay/withdraw) don't hit any backend — they're mock flows, so "transactions" never persist and history is fake.
8. Phone-number handling is inconsistent: register trims the raw input; there's no normalization to a canonical format (e.g. `2547XXXXXXXX`). If the server normalizes on register but not on login lookup (or vice-versa), valid users silently fail to match.
9. Decompiled transaction amounts show as `4294967246` etc. — this is a *display artifact* of unsigned-32-bit rendering of small negatives (e.g. −50), **not** a runtime bug. Flagged so it isn't mistaken for one.

---

## 4. Security improvements (recommended)
1. **Authenticate every endpoint.** Issue a short-lived token on login (JWT/opaque). `/api/balance` and all money endpoints must require it and derive the account from the token — never from a client-supplied `phone`. This closes the IDOR.
2. **Remove all hardcoded PII and the `pin:'1234'` mock** from the bundle. Use empty/neutral placeholders or fetch sample data behind a debug flag only.
3. **Server-side rate limiting & lockout** keyed to account+IP, with cooldown. Keep the client message friendly but make enforcement server-side.
4. **Hash PINs at rest** server-side (bcrypt/argon2 + per-user salt). Never log PINs. (Transport is already HTTPS — good.)
5. **Add biometric unlock** properly — the manifest already requests `USE_BIOMETRIC`/`USE_FINGERPRINT`; wire it to gate re-entry instead of re-typing the PIN.
6. **Drop dangerous/unneeded permissions:** `SYSTEM_ALERT_WINDOW` (overlay — high-risk for a finance app and a Play-policy flag), legacy `WRITE/READ_EXTERNAL_STORAGE`, and deprecated `USE_FINGERPRINT` (keep only `USE_BIOMETRIC`).
7. **`android:allowBackup="false"`** for a finance app (currently `true`).
8. **Certificate pinning** to `mpesa.highpesa.com`, and obfuscate/minify the JS (Hermes helps but strings are still readable).
9. **Rename the package & app** to something you own; remove Safaricom/M-PESA branding to avoid impersonation takedown.

## 5. Usability improvements
1. **Tell the truth on the PIN screen.** Distinct messages for: wrong PIN (with attempts left), account pending approval, account not found (→ offer register), and connection error (→ retry, no strike).
2. **Don't lock on non-credential errors.** A flaky network should never burn a PIN attempt or lock the user out.
3. **Forgot-PIN / reset flow** — currently none. A locked or forgetful user has no recovery path.
4. **Registration → login continuity:** if approval is required, show a "We're reviewing your account" screen after register instead of dropping the user onto a PIN screen that will reject them.
5. **Loading & error states** on the balance poll (every 10 s) so the dashboard doesn't silently show stale/zero values.
6. **Biometric quick-unlock** to reduce PIN friction on repeat opens.
7. **Accessibility:** ensure the PIN keypad and error text have proper labels/contrast.

## 6. Business-logic improvements
1. **One source of truth.** Remove the mock data path or clearly fence it behind a dev build. A finance app showing real balance + fake transactions erodes trust and hides real bugs.
2. **Make money movement real & idempotent.** Send/Pay/Withdraw need real endpoints with server-side validation, idempotency keys (prevent double-spend on retry), and persisted transaction records that the recents list reads from.
3. **Canonical phone normalization** shared by register + login + balance (e.g. always `2547XXXXXXXX`), so identity matching can't silently fail.
4. **Define the approval workflow explicitly:** either auto-approve, or surface status (pending/approved/rejected) to the app and handle each — don't let "pending" masquerade as "wrong PIN".
5. **Server-authoritative limits** (fuliza/overdraw, min/max amounts) returned to the client, not hardcoded.
6. **Audit/event logging** for auth attempts and money movement (server side).

---

## 7. Packaging notes
- **arm64-v8a only.** No `armeabi-v7a`/`x86`/`x86_64` libs → won't install on 32-bit devices or many emulators. Ship a universal APK or per-ABI splits / an AAB.
- `targetSdk 36`, `minSdk 24` — fine. `allowBackup=true` — change to false (§4.7).

---

## 8. Drop-in fix for the login handler
See `fixes/login.fixed.ts`. Core idea: branch on `res.status`, surface the real message, and only strike/lock on a true `401`.
