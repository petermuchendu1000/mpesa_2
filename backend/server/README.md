# My OneApp — mock backend server

A small, **zero-dependency** Node.js HTTP server that provides the API the app uses:
user accounts (PIN, biometric, profile picture), balances, Fuliza and transactions.

It is the runnable companion to the reverse-engineered contract in
[`../api/`](../api) and [`../../docs/BACKEND_API.md`](../../docs/BACKEND_API.md).

## Run

```bash
cd backend/server
node src/server.js            # http://localhost:4000/api/v1  (or set PORT)
```

No `npm install` is required — it only uses Node's built-in `http`. State is persisted
to `data.json` (git-ignored) and seeded with the demo user `0703501549` (PIN `0000`).

## Endpoints (`/api/v1`)

| Method | Path | Purpose |
|--------|------|---------|
| GET  | `/health` | Liveness check |
| POST | `/users` | Create a user `{name, phone, pin?, biometricEnabled?, profilePicture?}` |
| GET  | `/users/:phone` | Fetch a user (PIN never returned) |
| POST | `/users/:phone/login` | Verify PIN `{pin}` or `{biometric:true}` |
| PUT  | `/users/:phone/pin` | Set / change PIN `{currentPin?, newPin}` |
| PUT  | `/users/:phone/biometric` | Enable/disable biometric `{enabled}` |
| PUT  | `/users/:phone/profile-picture` | Set picture `{profilePicture}` (data URL or URL) |
| GET  | `/users/:phone/balances` | `{balance, airtime, fulizaLimit, fulizaUsed, fulizaAvailable}` |
| PUT  | `/users/:phone/balances` | Adjust any of `balance, airtime, fulizaLimit, fulizaUsed` |
| POST | `/users/:phone/send` | Pay/send `{amount, recipient?, title?, actionId?}` — debits balance, Fuliza covers shortfall |
| POST | `/users/:phone/deposit` | Receive `{amount, from?}` — repays Fuliza first, then tops up balance |
| GET  | `/users/:phone/transactions` | Statement (newest first) |

All responses are `{ "success": true, "data": … }` or `{ "success": false, "error", "message" }`.

## How Fuliza works (implemented in `src/wallet.js`)

Fuliza is an overdraft. When a payment exceeds the M-PESA balance, the shortfall is drawn
from Fuliza up to the granted limit (`fulizaUsed` increases, available Fuliza drops).
Money received repays the Fuliza debt first, then tops up the balance. A payment larger
than `balance + fulizaAvailable` is declined with `INSUFFICIENT_FUNDS`.

## Examples

```bash
# create a user
curl -X POST localhost:4000/api/v1/users \
  -H 'Content-Type: application/json' \
  -d '{"name":"Jane Doe","phone":"0722000000","pin":"1234","biometricEnabled":true}'

# send money (Fuliza kicks in automatically when the balance is short)
curl -X POST localhost:4000/api/v1/users/0703501549/send \
  -H 'Content-Type: application/json' \
  -d '{"amount":1000,"recipient":"0722000000","title":"Send Money"}'

# balances
curl localhost:4000/api/v1/users/0703501549/balances
```

