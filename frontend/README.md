# frontend/ — Recovered client source

The client of **My OneApp**. Two parts:

## `android/` — the native Android app (the real UI + logic)

```
android/
├── src/main/
│   ├── AndroidManifest.xml           # byte-exact decoded manifest (2,849 lines)
│   ├── java/                          # 5,384 app-owned classes (decompiled Java)
│   │   ├── com/huawei/digitalpayment/ # consumer super-app + checkout engine (4,803)
│   │   ├── com/huawei/{common,payment,http,biometric,history,image,customer,…}
│   │   ├── com/safaricom/aipay/scantopay/  # Scan-to-Pay SDK (Jetpack Compose)
│   │   └── com/mpesa/qrcode/          # M-PESA QR model/service
│   └── res/values/                    # strings(3,491)/colors(917)/styles/dimens/…
├── ACTIVITIES.txt                     # all 319 app screens
└── PACKAGE_TREE.txt                   # full package/directory map
```

- **Only app-owned code** is here. Vendor SDKs (Google, Huawei HMS, Griver/Ant, Firebase,
  ML Kit, OkHttp/Retrofit, Kotlin, AndroidX…) are **not** copied in — they live in the
  git-ignored full dump `original/jadx_full/` if you need to inspect them.
- Sources are **jadx decompilations**: fully readable and behavior-faithful, but not
  guaranteed to recompile as-is (missing SDK deps, synthesized local names, R8 artifacts).
  Treat this as a **reference/reading** tree, not a build tree.
- See `docs/ARCHITECTURE.md` and `docs/FEATURE_MODULES.md` for how to navigate it.

### Suggested entry points
- Launcher: `com/huawei/digitalpayment/consumer/basic/ui/activity/GuideActivity.java`
- Auth: `com/huawei/digitalpayment/consumer/loginModule/…`
- Payments: `com/huawei/digitalpayment/checkout/ui/activity/…`
- Networking: `com/huawei/http/appserver/IAppServerHttpConfig.java`,
  `com/huawei/http/approute/AppRouteTable.java`

## `mini-programs/` — Ant Group Griver H5 framework

The embedded mini-program **engine** (appx / appx-ng / h5-embedded), extracted from
`assets/Griver/*.amr`. This is the JS runtime that hosts lifestyle/merchant mini-apps.
The **business mini-programs themselves are downloaded at runtime** and are not in the APK.
See `mini-programs/README.md`.

