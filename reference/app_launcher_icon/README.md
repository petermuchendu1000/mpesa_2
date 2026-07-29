# App launcher icon (exact, extracted from My OneApp v5.1.9)

The production app uses an **adaptive launcher icon** (vector foreground + vector background).
These are the byte-exact decoded sources:
- `ic_launcher_foreground.xml`
- `ic_launcher_background.xml`
- `ic_launcher.adaptive.xml` — the `<adaptive-icon>` wrapper

## To adopt (not wired automatically — minSdk is 24, so a raster fallback is required)
1. Copy `ic_launcher_foreground.xml` and `ic_launcher_background.xml` to `app/src/main/res/drawable/`.
2. Copy `ic_launcher.adaptive.xml` to `app/src/main/res/mipmap-anydpi-v26/ic_launcher.xml`
   (and `ic_launcher_round.xml`).
3. Provide an API<26 raster fallback: `mipmap-{h,xh,xxh,xxxh}dpi/ic_launcher.png`.
4. Point the manifest at it: `android:icon="@mipmap/ic_launcher"`.

Left as reference so the app keeps building on API 24–25 without density fallbacks in place.
