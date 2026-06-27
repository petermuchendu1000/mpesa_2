# Architecture

## Stack
- **React Native 0.81 + Expo SDK 55** (new architecture / Hermes).
- **expo-router 6** — file-based routing (`app/` directory).
- **expo-secure-store** — keystore-backed local session.
- **react-native-reanimated** — PIN shake animation.
- **@expo/vector-icons** (Ionicons) — iconography.

## Navigation map
```
index (gate)
 ├─ not registered ─────────────► register ──(POST /api/register)──► pin
 └─ registered ─────────────────► pin ──(POST /api/login, 200)─────► home
                                                                       ├─ send
                                                                       ├─ pay / withdraw / airtime / bundles
                                                                       ├─ request / scan / statements
                                                                       └─ profile ─► settings / logout
```

## Auth & session model
The original app has **no server session token**. "Logged in" = three keystore
flags: `mpesa_registered`, `mpesa_phone`, `mpesa_name`. We kept those keys for
compatibility (`src/auth/session.ts`) and reserved a `mpesa_token` slot so a real
server-issued token can be added later without a data migration.

The PIN itself is **never stored on the device** (good) — it is verified server-side
on every login.

## Data flow
```
register.tsx ─ register() ─► POST /api/register {phone,pin,name}
pin.tsx ────── login() ────► POST /api/login {phone,pin}  ─► typed LoginOutcome
home.tsx ───── getBalance()► GET  /api/balance?phone=…     (polled every 10s)
```
`src/api/client.ts` is the single networking layer. It:
- prefixes `API_BASE` (`EXPO_PUBLIC_API_BASE` → app.json `extra.apiBase` → default),
- normalizes phone numbers to `2547XXXXXXXX` for **every** call (`normalizePhone`),
- applies a 15s timeout via `AbortController`,
- returns **typed discriminated unions** so screens never have to inspect raw
  `Response` objects — this is what makes the PIN fix robust.

## Two data sources (known debt)
Balance/Fuliza/name come from the live backend. Recent transactions and the
quick-action grid come from `src/data/mock.ts`. This split is inherited from the
original and is flagged in `AUDIT.md` §6.2 — recents should move to a real
`/api/transactions` endpoint.

## Theming
`src/theme/colors.ts` exposes `usePalette()` which switches light/dark from the OS
color scheme. Brand green `#4CAF50`; dark surfaces `#121212/#1E1E1E/#2A2A2A`;
light surfaces `#FFFFFF/#FAFAFA`. All recovered from the original resources.

## Where the bug fix lives
- `src/api/client.ts` → `login()` maps HTTP status → `LoginOutcome`.
- `app/pin.tsx` → `onDigit()` switch handles each outcome; only `wrong_pin`
  increments attempts / locks.
See `AUDIT.md` §1 for the before/after.
