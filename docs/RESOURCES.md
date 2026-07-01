# Resources — My OneApp

Recovered from `resources.arsc` + `res/` via jadx. **Values are byte-exact.** Resource
**names** were obfuscated by AndResGuard, so identifiers appear as numeric IDs
(`_2131951622_res_0x7f130006`) while the actual text/hex/dimension is intact.

Value resources are in
[`../frontend/android/src/main/res/values/`](../frontend/android/src/main/res/values/).

---

## Inventory

| Resource | Count | Location (values are byte-exact) |
|----------|------:|----------------------------------|
| Strings (default/English) | **3,491** | `res/values/strings.xml` |
| Colors | **917** | `res/values/colors.xml` |
| Styles / themes | **1,193** | `res/values/styles.xml` |
| Dimensions | **1,246** | `res/values/dimens.xml` |
| Arrays / plurals / bools / integers / attrs / drawables map | — | `res/values/*.xml` |
| Layouts (XML screens) | **832** | `original/decoded_res/.../res/layout/` |
| Drawable XML (shapes/selectors/vectors) | **1,162** | `original/decoded_res/.../res/drawable/` |
| Font resources | **8** | `original/decoded_res/.../res/font/` |
| Localizations | en · **zh** (简体中文) · **ar** (العربية) · es · en-rXC | `res/values-*/` |

> Only value resources are copied into `frontend/` (they are human-useful). The 832
> obfuscated-name layouts, 1,162 drawables, mipmaps and rasters live under
> `original/decoded_res/` (git-ignored, reproducible) because their names carry no meaning.

---

## Brand identity (recovered)

### Typeface — **Proxima Nova** (Safaricom brand font)
`assets/fonts/` embeds:

| File | Family | Weight |
|------|--------|--------|
| `Regular.ttf` | Proxima Nova | Regular (400) |
| `Medium.ttf` | Proxima Nova Semibold | Semibold (600) |
| `Bold.ttf` | Proxima Nova | Bold (700) |

### Palette — Safaricom green
Most-used brand hues from `colors.xml`:

| Hex | Role |
|-----|------|
| `#35A839` | **Primary Safaricom green** (brand) |
| `#EAF6EE` | Light green tint (surfaces/highlights) |
| `#FFFFFF` / `#F7F7F7` | Background / surface |
| `#121212` / `#303030` | Dark text / dark surfaces |
| `#000000` | Text (black) |
| `#757575` / `#999999` / `#333333` | Secondary/tertiary text |
| `#E0E0E0` / `#CBD5E1` | Borders / dividers |

A **dark theme** is shipped (`res/values-night/`, `res/drawable-night/`).

---

## In-APK config assets (committed)

Small JSON config that drives runtime behavior — [`../original/config-assets/`](../original/config-assets/):

| File | Purpose |
|------|---------|
| `home_navigation_default_config.json` | Bottom tabs: **Home / Life / My** (`native://app/customer/homepage/*`). |
| `login_config.json` | Enabled login factors: OTP, PIN, Fingerprint, FaceId. |
| `pay_config.json` | Payment auth factors: Fingerprint, FaceId. |
| `biometric_alias.json` | Keystore aliases for biometric login/pay. |
| `basic_config.json` | Server-config `configTypes` (cash-in/out, limits, colors, session timeout, security…). |
| `language.json` / `defaultLanguage.json` | Supported languages (en/zh/ar). |
| `schedulePaymentTypes.json` | Scheduled-payment types (P2P, Airtime, Pay Bill). |
| `grs_sdk_server_config.json` | Huawei GRS bootstrap hosts for endpoint routing. |
| `sensitive_keys.json` | Keys redacted from logs (`token`). |
| `AirtimeRecharge/CustomerPayBill/P2PTransfer.json` | Transaction form/flow templates. |

Other bundled assets: `oneAppTerms.pdf`, `privacy.pdf`, `receive_alert.wav` (payment
received sound), ML Kit barcode models, Griver H5 framework, HMS root CAs (`*.bks`).

---

## Notes on obfuscation

- **AndResGuard** renamed resource entries → the `arsc` no longer holds human names, so
  jadx emits `_<decimalId>_res_0x<hexId>`. The **mapping to values is intact**; e.g.
  `strings.xml` still contains every English string verbatim.
- To trace a string used by a screen: find its `@string/_…` reference in the (obfuscated)
  layout under `original/decoded_res/.../res/layout/`, then look the ID up in `strings.xml`.

