# Typography & metrics (extracted from My OneApp v5.1.9)

## Fonts — Proxima Nova (byte-exact from `assets/fonts/`)
The app ships **exactly three weights**, loaded from `assets/fonts/`:

| repo file | APK file | family / subfamily | usWeightClass | bytes | byte-identical |
|---|---|---|---|---|---|
| `proxima_nova_regular.otf` | `Regular.ttf` | Proxima Nova / Regular | 400 | 141,796 | ✅ |
| `proxima_nova_semibold.otf` | `Medium.ttf` | Proxima Nova Semibold | 600 | 143,988 | ✅ |
| `proxima_nova_bold.ttf` | `Bold.ttf` | Proxima Nova / Bold | 700 | 148,444 | ✅ (fixed this pass) |

- Shared metrics: **unitsPerEm 1000**, **ascent 920 / descent −298**, **1435 glyphs** per weight.
- The app's `Medium.ttf` is actually **Semibold (600)** — Compose maps both `FontWeight.Medium` and
  `FontWeight.SemiBold` onto it.
- The app has **no Light (300) and no Black (900)** — those files were removed from the repo and the
  single `FontWeight.Black` usage (Home ad banner) was changed to `Bold`, matching the app's heaviest weight.
- Note: Proxima Nova is a **commercial typeface**; it ships inside the official APK. Treat it as a
  licensed asset when redistributing this repo.

### Icon fonts (H5 / Griver shell, reference only)
`assets/griverIconDefault/default.ttf`, `assets/tinyfont/{iconfont,titlebar}.ttf`,
`assets/h5iconfont/{h5titlebar,titlebar}.ttf` — glyph fonts for the mini-program title bars.

## Type scale (sp)
App sp scale (from `resources.arsc` dimens):
`6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,28,30,32,34,36,38,40,42,45,48,56,112`
The repo's hardcoded text sizes (`8,10,11,12,13,14,15,16,17,18,20,22,24,28,30,34`) are **all within**
this scale — no typography drift.

## Spacing / sizing grid (dp)
Dominant app dp values: `4, 8, 12, 16, 20, 24, 28, 32, 40, 48, 56, 64` (a 4/8-dp grid) plus
radii/icon sizes. Full list in `apk_dimen_values.txt`.

## Icon intrinsic sizes (dp)
The 56 imported real icons keep the app's exact declared sizes — see `icon_dimensions.tsv`.
Distribution: 24×24 (9), 25×25 (8), 26×26 (5), 22×22 (4), 23×23 (3), 20×20 (3), plus a few larger
brand marks (e.g. 60×60, 51×52, a 134×57 wordmark). Quick-action icons render at ~24 dp.

## What is NOT extractable (honest scope)
- **No XML layouts** (`res/layout` absent) — native screens are Jetpack Compose (compiled/obfuscated
  in DEX) and the rest is Griver H5, so per-screen pixel placement/margins are not declarative in the APK.
- **Color/string resource names** are obfuscated to numeric IDs (values are exact; the name→value map is not).
- **Home feed composition/order** is server-driven (not in the APK).
