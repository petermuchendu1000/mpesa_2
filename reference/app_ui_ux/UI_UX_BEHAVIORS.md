# UI / UX behaviors (reverse-engineered from My OneApp v5.1.9)

Decompiled with jadx (portable JRE 17) + androguard. This captures the behaviors that are
**actually recoverable** from the binary. Scroll/fling/touch-ripple are stock **Jetpack Compose /
Material3** in this app, so "matching" them means using the same stock behaviors (the repo does).

## 1. Navigation model  ← corrected this pass
- **There is NO Home / Life / My bottom-navigation bar.** The home is a **single scrolling screen**
  (`SFCChildHomeFragment`) that hosts these section fragments, top→bottom:
  `SFCHomeFunctionFragment` (quick-action grid) → `SFCFrequentFragment` (frequents row) →
  `SfcMyFinancesView` → `SFCRecommendedFragment` → `SFCEntertainmentFragment`, with a floating
  `SFCAskZuriButton`.
- **Account / "My"** is a separate native flow (`profileui`: `ProfileActivity`, `ProfileMgtActivity`,
  `ProfileEditActivity`, `ChangeMsisdnActivity`, `PhotoProfileActivity`) opened by tapping the
  **profile avatar** in the home top bar.
- **Repo change applied:** removed the bottom `NavigationBar`; `HomeShell` now renders the single
  home; the avatar pushes `Routes.MY` (a back-navigable account screen). `home_v3_icon_*` tab icons
  are now unused. `LifeTab.kt` is retained but is no longer a bottom tab (placement of "Life" in this
  build is unconfirmed — see Open questions).

## 2. Screen transitions
From the native Navigation graphs (`res/navigation/*.xml`), pushed destinations use a 4-part
animation set — **enterAnim / exitAnim / popEnterAnim / popExitAnim** — i.e. standard
slide-in/slide-out with fade (Navigation Component defaults). Checkout and settings flows all share
the same transition set.

## 3. Touch / press / interaction states
- **Pressed state** darkens the brand green: `bg_filter_button` = `#2C8F2E` (pressed) over
  `#35A839` (normal). Buttons follow this darken-on-press pattern.
- **Ripples:** Material ripple drawables (`m3_selection_control_ripple`, navigation-bar item ripple).
- **Micro-interactions:** animated-vector transitions for checkbox/radio
  (`btn_checkbox_unchecked_to_checked`, `btn_radio_off_to_on`) and a password show/hide AVD
  (`avd_show_password` / `avd_hide_password`).
- Verification-code / OTP inputs use a focused-border state (`acplugin_verification_code_input_bg`:
  focused `#1677FF` → idle `#E5E5E5`).

## 4. Input field behaviors (exact, from bundled schemas)
The Schedule-Payment flows declare field-level input rules (see `../griver/*.json`). Behaviors:

| elementType | keyboard / mask | validation |
|---|---|---|
| `MOBILE` | numeric | `^([0-9]{13})$` (full 254… international MSISDN), maxLength 11 shown |
| `AMOUNT` | numeric/decimal | required, formatted as amount |
| `TEXT` (schedule name) | text | `^([0-9A-Za-z ]{1,64})$`, maxLength 64 |
| `SELECT_BILLER` | picker | required selection |
| `DATE_FOREVER` | date picker | required |
| `SELECT` (frequency) | picker | required |

These give exact keyboard types, max lengths, and regex validation to mirror in the repo's input screens.

## 5. Typography & type scale
Proxima Nova (Regular/Semibold/Bold) — see `../app_design_tokens/TYPOGRAPHY_AND_METRICS.md`.
Text sizes follow the app sp scale; the repo is already within it.

## 6. Scroll / fling / overscroll
The home and lists are Compose `LazyColumn` / `verticalScroll` — **stock Compose fling + stretch
overscroll (Android 12+)**. The repo uses the same primitives, so physics already match. There is no
custom scroll physics in the extractable surface.

## What is NOT byte-extractable (honest)
- Exact per-widget spacing/positions of Compose screens (compiled + obfuscated in DEX; no XML layouts
  for the native Compose UI).
- Home feed item ordering (server-driven).
- Exact "My"/profile screen row inventory beyond the `profileui` Activity/binding names.

## Open questions (need a screen recording of THIS build to finish 100%)
1. Where does **"Life"** content live in this build (separate entry? removed? inside home)?
2. Exact contents/order of the **profile ("My") screen** rows.
3. Home top-bar exact affordances (search, notifications, QR) and their order.
