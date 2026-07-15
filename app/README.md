# My OneApp — Frontend-only build (`:app`)

A clean, **buildable** Jetpack Compose reconstruction of the Safaricom **My OneApp**
(M-PESA super-app) UI shell. It **contains no backend and no networking** — every value
is local mock data, so it runs fully offline.

> Why a reconstruction and not the decompiled tree?
> The decompiled sources under `frontend/android/` are a *reading* reference, not a build
> tree: resource names were stripped by AndResGuard (numeric IDs only), Data Binding markup
> is compiled away in the release APK, and several SDKs (Huawei HMS, Ant Griver, ARouter,
> Dynatrace, Adjust) aren't publicly resolvable. That information loss makes a faithful
> recompile impossible. This module rebuilds the frontend so it actually compiles and runs.

## What's implemented
- **Splash** (real `app_icon`) → **Login** (phone + M-PESA PIN, biometric affordance — all mock)
- **Home / Life / My** bottom-tab shell using the app's **real tab-bar icons**
  (`home_v3_icon_home/life/my` + their selected `_hot` variants)
- **Home** dashboard: green header (greeting, balance with hide/reveal via the exact
  `icon_hide_balance`, Fuliza + Bonga stats, scan/notification actions), the real
  **Send & Request Money** quick-action grid, promo banner, and recent transactions with
  the exact `history_transaction_icon_*` status icons
- **All Services** grid (20 services), **Life** services list, **My** menu (4 grouped
  sections) — every tile uses the **exact original vector icon** (`icon_sfc_*`,
  `ic_statement_*`, `ic_one_app_action_*`, …)
- **Transaction flow**: `EntryScreen` (per-service fields) → `PinEntryScreen`
  (M-PESA style 4-dot PIN + numeric keypad) → `ReceiptScreen` (success + receipt)
- **Buy Bundles / Home Internet / Tunukiwa** plan lists (`BundlesListScreen`)
- **History / Statement**, **Notifications**, **Scan to Pay**, generic **Detail**/**Info**
  screens

### Exact assets
The exact original icons are extracted from the decoded APK resources by
`tools/extract_icons.py` (matches real resource names, skips anything referencing
obfuscated resources): **57** self-contained vector drawables + **7** PNG icons
(tab bar + launcher). Brand tokens use the recovered green `#43B02A` / `#35A839` and
accent `#FF2A58`.


## Build & run
```bash
# from the repo root
./gradlew :app:assembleDebug          # outputs app/build/outputs/apk/debug/app-debug.apk
./gradlew :app:installDebug           # install to a connected device/emulator
```
Or open the folder in Android Studio and press **Run**.

- Package: `com.safaricom.mpesa.frontend` · min SDK 24 · target SDK 35
- Toolchain: AGP 8.7.3, Kotlin 2.0.21, Compose BOM 2024.10.01, Gradle 8.11.1, JDK 21

The decompiled reference tree in `frontend/android/` is intentionally **not** part of this
Gradle project (`settings.gradle.kts` includes only `:app`).


