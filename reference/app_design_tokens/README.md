# App design tokens (extracted from My OneApp v5.1.9)

Full value tables decoded from the APK's `resources.arsc`. **Resource *names* for
`color`/`string`/`dimen` are obfuscated to numeric IDs in the build, so only the exact
*values* are recoverable (not a semantic name→value map). Drawable names survive because
they are file paths.

## Files
- `apk_color_values.txt` — 777 unique color values (with usage counts)
- `apk_dimen_values.txt` — 508 unique dimension values (dp/sp)
- `apk_string_values.txt` — all unique user-facing string values
- `icon_palette.txt` — exact fill/stroke colors inside the 56 imported real icons
- `griver_theme_tokens.json` — Griver mini-program shell palette (see ../griver)

## Compose reconciliation (what was aligned)
The repo's core brand/text/surface colors were checked against the APK palette + the
exact colors inside the real icons:

| repo token | value | in app? |
|---|---|---|
| GreenSecondary | `#35A839` | ✅ palette + icons (dominant icon green, 127×) |
| BrandGreen | `#43B02A` | ✅ palette (Safaricom brand green) |
| AccentPink | `#FF2A58` | ✅ palette + icons (send-money accent, 18×) |
| CardWhite / TextPrimary / TextSecondary | `#FFFFFF` / `#1A1A1A` / `#6B6B6B` | ✅ palette |
| **AccentRed / Danger** | was `#D32F2F` → **`#E62634`** | ✅ **corrected** to exact Safaricom red (palette + icons, 69×) |
| **SafErrorRed** (PinLogin) | was `#E1251B` → **`#E62634`** | ✅ **corrected** to exact Safaricom red |

The remaining hardcoded colors in the screens are **decorative pastels** used for the
"Do more" / finance / entertainment feed cards (e.g. `#F5F6F8`, `#FBEEDD`, `#DCE8FB`,
`#F3EAF8`). That feed is **server-driven** and its colors are **not present in the APK**,
so there is no "exact app value" to align them to — they are left as the original
author's screenshot-transcribed choices.
