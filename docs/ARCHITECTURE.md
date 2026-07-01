# Architecture — My OneApp (Safaricom M-PESA Super-App)

This document describes the architecture of `My OneApp.apk` (`com.safaricom.mpesa.lifestyle`,
v5.1.9) as recovered from the shipped binary.

---

## 1. High-level shape

My OneApp is a **native Android super-app**. It combines:

1. A **native Android host app** (Java/Kotlin, MVVM) — the M-PESA wallet, home, login,
   payments, bundles, profile, history, etc. This is the bulk of the UI.
2. An embedded **Ant Group Griver / mPaaS mini-program container** — runs H5/JS
   "mini-apps" (e.g. merchant/lifestyle mini-programs) that are **downloaded at runtime**.
3. A large set of **vendor SDKs** — Huawei HMS, Google Play Services, Firebase, ML Kit.

```
┌─────────────────────────────────────────────────────────────────┐
│                         My OneApp (Android)                        │
│                                                                    │
│  ┌───────────────┐   ┌───────────────┐   ┌────────────────────┐   │
│  │  Native UI    │   │ Griver / mPaaS │   │   Vendor SDKs      │   │
│  │  (MVVM)       │   │ mini-program   │   │  HMS · GMS ·       │   │
│  │  Activities/  │   │ container      │   │  Firebase · ML Kit │   │
│  │  Fragments/   │   │ (appx / appx-ng│   │  Adjust · Dynatrace│   │
│  │  ViewModels   │   │  JS runtime)   │   │                    │   │
│  └───────┬───────┘   └───────┬────────┘   └────────────────────┘   │
│          │                   │                                      │
│          ▼                   ▼                                      │
│  ┌─────────────────────────────────────────────────────────────┐  │
│  │        Networking: OkHttp + Retrofit + Ktor + coroutines     │  │
│  │        Base-URL via IAppServerHttpConfig + Huawei GRS routing │  │
│  └─────────────────────────────────────────────────────────────┘  │
└──────────────────────────────────┬─────────────────────────────────┘
                                   │ HTTPS
                                   ▼
        Safaricom App Gateway  →  100+ backend microservices
        (myoneapp.safaricom.co.ke/appgateway/consumer/appserver/…)
```

---

## 2. App identity & build

| Property | Value |
|----------|-------|
| Application ID | `com.safaricom.mpesa.lifestyle` |
| Version name | `5.1.9` |
| Version code | `50031` |
| minSdkVersion | 24 (Android 7.0) |
| targetSdkVersion / compileSdk | 35 (Android 15) |
| DEX files | 20 (multidex) |
| Launcher activity | `com.huawei.digitalpayment.consumer.basic.ui.activity.GuideActivity` |
| Dynamic feature | `VoucherScannerFeature` (on-demand split) |
| Split config | ABI + density + feature splits (AAB-based delivery) |

---

## 3. Package ownership

The APK contains ~27,700 classes. They fall into three buckets:

### 3.1 App-owned code (recovered into `frontend/android`) — 5,384 classes

| Namespace | Files | Role |
|-----------|------:|------|
| `com.huawei.digitalpayment.consumer.*` | ~3,900 | The consumer super-app: home, login, payments, bundles, profile, history, QR, Pochi, schedule, mini-apps, etc. |
| `com.huawei.digitalpayment.checkout.*` | ~500 | Checkout / payment-confirmation / result flows (Send Money, Pay Bill, Buy Goods, Withdraw, Tunukiwa …). |
| `com.huawei.digitalpayment.common/theme` | — | Shared UI theme + base classes. |
| `com.huawei.common.*` | 221 | Shared base (config, contracts, display, exceptions, databinding). |
| `com.huawei.payment.*` | 53 | Payment lib + MVVM base. |
| `com.huawei.http.*` | 22 | **App HTTP layer** — `appserver` (API base URL/interceptors), `approute` (ARouter table), converters, OkHttp. |
| `com.huawei.biometric.*` | 15 | Fingerprint / FaceId module. |
| `com.huawei.image.*` | 16 | Image loading (Glide) + app-server image service. |
| `com.huawei.customer.*` | 12 | Customer digitalpayment checkout/scan glue. |
| `com.huawei.history.*` | 5 | Transaction history. |
| `com.huawei.mobileapp.resourcelib` | 6 | Resource library. |
| `com.huawei.baselibs2.utils.encrypt` | 2 | Encryption utilities. |
| `com.safaricom.aipay.scantopay.sdk.*` | 297 | **Scan-to-Pay SDK** — Jetpack **Compose** UI (`ui/screens`, `ui/components`) + `core/data/remote`. |
| `com.mpesa.qrcode.*` | 61 | M-PESA QR code model/service (EMVCo-style QR parsing). |

### 3.2 Vendor SDKs (kept in `original/jadx_full`, not in `frontend`)

`com.google.*` (7,739), `com.huawei.hms/agconnect/hmf/secure` (~700), `com.alibaba.*` +
`com.alipay.*` + `com.iap.*` (Griver/mPaaS, ~3,700), `com.dynatrace.*`, `com.adjust.*`,
`com.bumptech.*` (Glide), `com.airbnb.*` (Lottie), `retrofit2`, `okhttp3`, `okio`,
`kotlin*`, `androidx.*`, etc.

### 3.3 Obfuscated helpers

`defpackage/`, `a/`, `b/`, `d/`, `sh/`, `pl/`, `j$/` — R8-renamed helper classes.

---

## 4. UI architecture (MVVM + Data Binding)

The native UI uses **Android Data Binding** and an **MVVM + Repository** pattern with a
clean data-source split. Example — the **Login module**:

```
com/huawei/digitalpayment/consumer/loginModule/login/
├── data/
│   ├── source/
│   │   ├── local/            # LocalLoginInfo, LocalUserInfo, request params
│   │   │   └── request/      # OtpLoginParams, PinLoginParams,
│   │   │                     #   IdentityVerifyParams, QueryLoginTypeParams
│   │   └── network/          # ExtResponse, NetworkQueryLoginType, …
│   └── (repository)
├── (viewmodel)
└── (ui / activities + *Binding)
```

- **Screens** are `Activity`/`Fragment` classes; each has a generated `…Binding` /
  `…BindingImpl` (Data Binding) under a `databinding/` package.
- **State** lives in `ViewModel`s exposing `LiveData`/`Flow`.
- **Repositories** merge `local` (cache, secure storage) and `network` (Retrofit) sources.
- The **Scan-to-Pay SDK** (`com.safaricom.aipay.scantopay`) is newer and uses **Jetpack
  Compose** (`ui/screens`, `ui/components`) rather than XML/Data Binding.

Total **319 app activities** (screens) are declared in the manifest — see
`frontend/android/ACTIVITIES.txt`.

---

## 5. Navigation

Navigation uses Alibaba **ARouter**:

- **Route table:** `com.huawei.http.approute.AppRouteTable` / `AppRouteConstants`.
- **Route paths** look like `/loginModule/login`, `/sfcModule/sendMoney`,
  `/checkoutModule/sfcCheckoutEnter`, `/pochiWalletModule/pochiWalletPay`.
- The **home tab bar** is config-driven (`home_navigation_default_config.json`):
  `native://app/customer/homepage/{home,life,my}` → tabs **Home / Life / My**.

> Note: `/loginModule/…`, `/sfcModule/…`, `/checkoutModule/…` are **in-app screen routes**,
> not HTTP endpoints. The HTTP endpoints are the `/…/api/vN/…` paths (see `docs/BACKEND_API.md`).

---

## 6. Networking & backend routing

- **HTTP clients:** OkHttp + Retrofit (`retrofit2` present), plus Ktor for some flows.
- **Base URL:** provided by `com.huawei.http.appserver.IAppServerHttpConfig`
  (`getBaseUrl()` + `getInterceptors()`), pointing at the Safaricom **app gateway**:
  `https://myoneapp.safaricom.co.ke/appgateway/consumer/appserver/consumer/v1/`.
- **Service discovery:** Huawei **GRS** (Global Routing Service) —
  `grs_sdk_server_config.json` lists `grs.dbankcloud.*` bootstrap hosts that resolve
  regional endpoints at runtime.
- **Auth token:** `https://identity.safaricom.com/api/v2/app/getPlainToken`.
- **QR payment:** `https://mpa.qr.api.m-pesa.com` / `mpa.qr.auth.m-pesa.com`.
- **Statements/PDF:** `witapp.fsawsprod.safaricom.co.ke/consumerapp-huawei/v1/…`.

Full endpoint catalogue: `docs/BACKEND_API.md` and `backend/api/`.

---

## 7. Security features (observed)

- **Auth:** OTP, M-PESA PIN (mPIN), Fingerprint, FaceId (`login_config.json`).
  Biometric key aliases in `biometric_alias.json`.
- **Device binding:** new-device OTP verification flow (`otpVerifyNewDevice`).
- **Sensitive keys:** `sensitive_keys.json` marks `token` for redaction in logs.
- **Crypto:** `com.huawei.baselibs2.utils.encrypt`, Huawei SecureX (`com.huawei.secure`).
- **Session:** `sessionTimeoutSecond` server config; PIN-free payment thresholds.
- **Risk:** dedicated `consumer/risk` + `consumer/riskui` modules.

---

## 8. Mini-program subsystem (Griver / mPaaS)

- Container framework bundled under `assets/Griver/*.amr` (ZIP→TAR→H5/JS):
  - `66666692` — **appx framework** v1.24.8
  - `66666693` — **h5 embedded app** v2.0.7.1
  - `68687209` — **appx-ng framework** v2.9.17.12
- Runtime engine also in `assets/framework.zip` (`service.js`, `view.js`) and
  `assets/GriverBridge/*` (JSAPI bridge).
- **Business mini-programs are NOT bundled** — they are fetched from
  `cdn.marmot-cloud.com` / `gw.alipayobjects.com` at runtime. Only the *engine* ships.

See `frontend/mini-programs/` and `original/miniprograms/`.

---

## 9. What the compiled binary discards (recovery limits)

- **Original file/module boundaries** for Kotlin are approximated by package layout.
- **Local variable & most parameter names** (release build → jadx synthesizes names).
- **Comments, formatting, TypeScript-style types** — n/a (native app).
- **Resource names** — obfuscated by AndResGuard to numeric IDs (values are intact).

Everything that defines **behavior** — control flow, activities, view models, string
literals, styles, colors, route table, endpoint URLs, request/response DTOs — **is
preserved** and present in this tree.

