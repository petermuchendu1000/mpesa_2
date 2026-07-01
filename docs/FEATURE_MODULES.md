# Feature Modules — My OneApp

The app is organized into feature modules under
`frontend/android/src/main/java/com/huawei/digitalpayment/consumer/…` (plus the
`checkout` payment engine and the standalone `com.safaricom.aipay.scantopay` and
`com.mpesa.qrcode` modules). "Ui" suffixed packages hold the screens/data-binding;
the non-Ui sibling holds logic/data.

Total: **319 app activities (screens)** — full list in
[`../frontend/android/ACTIVITIES.txt`](../frontend/android/ACTIVITIES.txt).

---

## Core consumer modules

| Module | Files | What it does |
|--------|------:|--------------|
| `sfc` / `sfcui` | 486 / 1022 | **Safaricom core UX** — the largest module. Home dashboard content, quick actions, service tiles, transaction entry flows (Send Money, Withdraw, Buy Bundles, Airtime, Tunukiwa, Pay Bill, Buy Goods, International/roaming transfers, Home Internet, request money, pay-with-Bonga, roaming bundles, SMS bundles, unlock-app). |
| `home` / `homeui` | 165 / 165 | Home shell + the **Home / Life / My** tab scaffolding and home widgets. |
| `loginModule` | 287 | **Auth**: query-login-type, OTP login, PIN login, identity verify, set-PIN, forgot-PIN, new-device OTP, terms & conditions, biometric enrolment. Clean `data/source/{local,network}` layering. |
| `login` | 76 | Legacy/aux login screens + `*Binding` (OTP, PIN, MPIN, new-device, reset-PIN, forgot-PIN). |
| `mpin` | 28 | M-PESA PIN (mPIN) entry/keypad/validation. |
| `base` / `baselib` / `baseui` | 317 / 219 / 28 | Shared base activities, adapters, dialogs, network base, utilities. |
| `basic` / `basicUi` / `basicModule` | 90 / 111 / 3 | Guide/splash, About, App Share, Change Language, Help & Feedback, settings (Login/Pay/PinFree), Beta consent. Hosts the **launcher** `GuideActivity`. |

## Payments & checkout

| Module | Files | What it does |
|--------|------:|--------------|
| `com.huawei.digitalpayment.checkout` | ~500 | **Checkout engine.** Activities: `EasyCheckoutActivity`, `PaymentConfirmNewActivity`, `PayResultActivity`, `SubscribePinActivity`, plus result screens (`Sfc*ResultActivity` for SendMoney/PayBill/BuyGoods/Withdraw/Tunukiwa/AirtimeTopUp/PochiDepositWithdraw/RequestMoney), receipt view, reverse-transaction. `model/` + `resp/` + `repository/` + `viewmodel/`. |
| `com.mpesa.qrcode` | 61 | QR code model + parsing service (`model/api`, `model/dynamic`, `service/impl`) — EMVCo-style M-PESA QR. |
| `com.safaricom.aipay.scantopay.sdk` | 297 | **Scan-to-Pay SDK** (Jetpack **Compose**): `ui/screens`, `ui/components`, `core/data/remote`. |
| `qrcode` / `sfcqrcode` / `qrcodeModule` | 76 / 35 / 3 | In-app QR generate/scan flows. |
| `scan` | 32 | Camera scan (ML Kit barcode) integration. |
| `nfc` / `nfcui` | 7 / 5 | NFC tap features. |

## Wallets & money management

| Module | Files | What it does |
|--------|------:|--------------|
| `pochiwallet` / `sfcpochiwallet` | 30 / 31 | **Pochi la Biashara** wallet (deposit/withdraw/pay). |
| `fixeddata` / `sfcfixeddata` | 174 / 3 | **Fixed data / Home Internet** — choose plan, add products, confirmation, dashboard, family share, add beneficiary. |
| `manageandviewdata` | 86 | Data usage: sharing, limits, beneficiaries, sponsors. |
| `schedule` / `scheduleui` | 31 / 26 | **Scheduled payments** (P2P, airtime, pay-bill) — see `schedulePaymentTypes.json`. |
| `history` | 31 | Transaction history + statements. |
| `subsui` | 50 | Subscriptions UI (bundles/services). |

## Profile, lifestyle & support

| Module | Files | What it does |
|--------|------:|--------------|
| `profile` / `profileui` / `sfcprofile` | 66 / 54 / 3 | Profile, settings, KYC, account details. |
| `zuriui` | 44 | **Zuri** — Safaricom's virtual assistant / chatbot UI. |
| `webview` / `webviewui` | 53 / 13 | In-app web container (myaccount, FAQs, discover pages). |
| `miniapps` | 21 | Griver mini-program launcher/host glue. |
| `register` | 14 | New-customer registration. |
| `identity` | 2 | Identity verification helpers. |

## Platform, infra & telemetry

| Module | Files | What it does |
|--------|------:|--------------|
| `remoteconfig` | 22 | Server-driven config (Firebase Remote Config + basic_config). |
| `risk` / `riskui` | 22 / 14 | Fraud/risk checks & prompts. |
| `push` / `push_ui` / `pushmessage` | 15 / 19 / 3 | Push notifications (HMS/Firebase). |
| `notification` | 18 | In-app notification centre. |
| `service` | 32 | Cross-module service bindings/facades. |
| `sfcadjust` | 7 | Adjust attribution/analytics. |
| `di` | 7 | Dagger/Hilt dependency-injection modules. |
| `developer` | 15 | **Dev tools** — `DevActivity`, `LogsActivity`, `LogWebViewActivity`, `NetConfigActivity`. |
| `ootb` | 11 | Out-of-the-box / onboarding. |
| `viewmodel` / `model` / `bean` / `request` / `constants` / `utils` | — | Shared MVVM plumbing & DTOs. |

---

## Reading a module

Each feature typically contains:

```
<feature>/
├── ui/ or <feature>ui/          # Activities/Fragments + generated *Binding / *BindingImpl
├── viewmodel/                   # ViewModels (LiveData/Flow)
├── data/source/local/           # cache, secure storage, request param models
├── data/source/network/model/   # Retrofit DTOs
├── repository/ (or repo)        # merges local + network
├── bean/ · model/ · resp/       # data objects
└── di/                          # Hilt modules
```

Start from an `Activity` in `ACTIVITIES.txt`, open its `*Binding`, then follow its
`ViewModel` → `Repository` → `data/source/network` to reach the API call.

