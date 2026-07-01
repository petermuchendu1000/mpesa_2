# frontend/android — Native Android app source

Decompiled, app-owned source of `com.safaricom.mpesa.lifestyle` v5.1.9.

- **5,384** app-owned `.java` files under `src/main/java/`.
- **`AndroidManifest.xml`** — byte-exact decoded (319 activities, services, providers).
- **`src/main/res/values/`** — string/color/style/dimension values (byte-exact; names
  obfuscated → numeric IDs).
- **`ACTIVITIES.txt`** — every screen. **`PACKAGE_TREE.txt`** — directory map.

## Package ownership

| Prefix | Files | Notes |
|--------|------:|-------|
| `com.huawei.digitalpayment.*` | 4,803 | Consumer super-app + checkout engine (Huawei-built for Safaricom). |
| `com.huawei.common` | 221 | Shared base/config/contracts/databinding. |
| `com.huawei.payment` | 53 | Payment lib + MVVM base. |
| `com.huawei.http` | 22 | App HTTP layer (`appserver`, `approute`). |
| `com.huawei.image` | 16 | Image loading + app-server image service. |
| `com.huawei.biometric` | 15 | Fingerprint/FaceId. |
| `com.huawei.customer` | 12 | Checkout/scan glue. |
| `com.huawei.{history,mobileapp,baselibs2}` | 13 | History, resource lib, crypto utils. |
| `com.safaricom.aipay.scantopay.sdk` | 297 | Scan-to-Pay SDK (Jetpack Compose UI). |
| `com.mpesa.qrcode` | 61 | M-PESA QR model/service. |

## Caveats
- These are **decompiled** sources for study, not a ready-to-build Gradle project.
  There is no `build.gradle` — dependencies (AndroidX, Hilt, Retrofit, HMS, Griver, …)
  are not vendored here.
- Local variable/parameter names were stripped by the release build and are
  jadx-synthesized (`p0`, `str`, `i`, …). Class/method/field names of app code are intact.
- Resource references in code use obfuscated IDs; resolve via `res/values/` or the
  git-ignored `original/decoded_res/`.

