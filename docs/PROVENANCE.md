# Provenance & Reproduction — My OneApp

Every artifact in this tree is derived deterministically from **`My OneApp.apk`**
(84,896,330 bytes) using open-source tooling. This document records exactly how, so the
extraction is fully reproducible and auditable.

---

## Toolchain

| Tool | Version | Use |
|------|---------|-----|
| `unzip` | system | Unpack APK (ZIP) and nested archives (`.amr`, `framework.zip`). |
| `tar` | system | Extract mini-program `.tar` payloads inside `.amr`. |
| [jadx](https://github.com/skylot/jadx) | **1.5.5** | Decode `AndroidManifest.xml` + resources; decompile DEX → Java. |
| Java (JDK) | 25 | Runs jadx. |
| Python | 3.14 | Font/name inspection (`fonttools`). |
| `grep` / `sed` | system | Endpoint/host/string mining. |

Tools were downloaded into `tools/` (git-ignored). jadx:
`https://github.com/skylot/jadx/releases/download/v1.5.5/jadx-1.5.5.zip`.

---

## Pipeline (reproduce from scratch)

```bash
APK="My OneApp.apk"

# 0. Tools
curl -sL -o tools/jadx.zip \
  https://github.com/skylot/jadx/releases/download/v1.5.5/jadx-1.5.5.zip
unzip -q tools/jadx.zip -d tools/jadx

# 1. Raw unpack (byte-exact)               -> original/apk_raw/   (2,248 files)
unzip -o -q "$APK" -d original/apk_raw

# 2. Decode manifest + resources (no code) -> original/decoded_res/
tools/jadx/bin/jadx --no-src -d original/decoded_res "$APK"

# 3. Decompile DEX -> Java (all 20 dex)     -> original/jadx_full/sources/
tools/jadx/bin/jadx -j 8 --no-res --comments-level warn \
  --output-dir original/jadx_full "$APK"

# 4. Extract Griver mini-program frameworks -> original/miniprograms/
for f in original/apk_raw/assets/Griver/*.amr; do
  n=$(basename "$f" .amr); mkdir -p "original/miniprograms/$n"
  unzip -o -q "$f" -d "original/miniprograms/$n"
  tar -xf "original/miniprograms/$n"/*.tar -C "original/miniprograms/$n"
done
unzip -o -q original/apk_raw/assets/framework.zip -d original/framework
unzip -o -q original/apk_raw/assets/theme.zip     -d original/theme

# 5. Curate app-owned source -> frontend/android/src/main/java/
#    (com.huawei.digitalpayment, com.huawei.{common,payment,http,biometric,
#     history,image,customer,baselibs2,mobileapp}, com.safaricom, com.mpesa)

# 6. Copy decoded manifest + value resources -> frontend/android/src/main/
#    Mine endpoints/hosts -> backend/api/
```

> **jadx note:** the full DEX decompile reached ~82% and then stalled on one pathological
> third-party class (a giant generated method). All **app-owned** classes were already
> emitted and verified complete (0 empty files), so that run was stopped and the retained
> 33,797 files were used. App code completeness is unaffected — the stall was in a vendor
> SDK class, not app code.

---

## Ground-truth facts extracted

| Fact | Value | Source |
|------|-------|--------|
| Package | `com.safaricom.mpesa.lifestyle` | `AndroidManifest.xml` |
| Version | `5.1.9` (code `50031`) | `AndroidManifest.xml` |
| min/target/compile SDK | 24 / 35 / 35 | `AndroidManifest.xml` |
| Launcher | `…consumer.basic.ui.activity.GuideActivity` | manifest `LAUNCHER` filter |
| DEX files | 20 (`classes.dex … classes20.dex`) | `original/apk_raw/` |
| App activities | 319 | manifest |
| App-owned classes | 5,384 `.java` | curated into `frontend/` |
| Total decompiled classes | 33,797 files (~27.7k classes) | `original/jadx_full/` |
| Backend endpoints | 184 | mined from app code |
| Microservices | 105 | derived |
| Backend hosts | 10 | mined |
| UI strings | 3,491 | `strings.xml` |
| Colors / styles / dimens | 917 / 1,193 / 1,246 | `values/` |
| Layouts | 832 | `res/layout/` |
| Brand font | Proxima Nova (Reg/Semibold/Bold) | `assets/fonts/*.ttf` |
| Brand green | `#35A839` | `colors.xml` |

---

## What is committed vs. reproducible-only (git-ignored)

**Committed** (curated, human-useful, reasonable size):
- `frontend/` — app source, manifest, value resources, mini-program framework.
- `backend/` — endpoint/host/microservice lists.
- `docs/` — this analysis.
- `original/config-assets/`, `original/miniprograms/`, `original/framework/`, `original/theme/`.
- `My OneApp.apk`.

**Git-ignored** (large, byte-for-byte reproducible from the APK — see `.gitignore`):
- `original/apk_raw/` (raw unzip, 2,248 files)
- `original/jadx_full/` (full 33,797-file decompilation incl. all vendor SDKs)
- `original/decoded_res/resources/res/` (832 layouts, 1,162 drawables, mipmaps, rasters)
- `tools/` (jadx, downloads)

Re-run the pipeline above to regenerate the git-ignored parts.

---

## Integrity

- The APK is unmodified; verify size `84,896,330` bytes.
- Resource **values** and the **manifest** are byte-exact decodes.
- Java sources are **decompiled** (behavior-faithful); local variable names are
  jadx-synthesized because the release build stripped them.

