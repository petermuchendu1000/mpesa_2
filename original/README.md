# original/ — Ground-truth extraction

Byte-exact material extracted directly from `My OneApp.apk`. This is the **evidence** the
curated `frontend/` and `backend/` trees are derived from.

## Committed (small, human-useful)

| Path | Contents |
|------|----------|
| `config-assets/` | In-APK JSON config (home tabs, login/pay factors, biometric aliases, GRS, languages, schedule types, sensitive keys, transaction templates). |
| `miniprograms/` | Extracted Griver `.amr` bundles (ZIP→TAR→source): appx, appx-ng, h5-embedded frameworks + `Manifest.xml`/`CERT.json`. |
| `framework/` | `assets/framework.zip` unzipped — mini-program `service.js` / `view.js`. |
| `theme/` | `assets/theme.zip` unzipped — Griver theme. |

## Reproducible-only (git-ignored — regenerate via `docs/PROVENANCE.md`)

| Path | Contents | Why ignored |
|------|----------|-------------|
| `apk_raw/` | Raw `unzip` of the APK (2,248 files: 20 DEX, `resources.arsc`, `res/`, `assets/`, native `.so`, certs). | Large; identical to APK. |
| `jadx_full/` | Full DEX→Java decompilation — **33,797 files**, all app code **and** every vendor SDK (Google, Huawei HMS, Ant/Griver, Firebase, ML Kit, Kotlin, AndroidX, …). | Very large; app subset already curated into `frontend/`. |
| `decoded_res/` | jadx resource decode — decoded manifest + **832 layouts**, **1,162 drawables**, mipmaps, rasters, fonts, `values/`. | Large; names obfuscated. Value XMLs copied to `frontend/`. |

> The full vendor-inclusive decompilation (`jadx_full/`) is retained locally for deep
> dives (e.g. inspecting how Griver or HMS is wired) but is intentionally kept out of
> version control. Everything here regenerates deterministically from the APK.

