# original/res-images — packaged as a zip (why)

All **253** raster resources extracted from `mpesa.apk` live in **`res-images.zip`**,
byte-for-byte identical to the APK (`res/<name>`), with case preserved.

## Why a zip instead of loose files
The APK's resource shrinker produced **8 pairs of filenames that differ only by
case** (e.g. `9N.9.png` vs `9n.9.png`, `EP.png` vs `Ep.png`). Git tracks those as
253 distinct files, but **case-insensitive filesystems (Windows, default macOS)
can only hold 245 of them** — the other 8 collapse onto the same path. That made
8 files permanently show as "modified" and impossible to check out cleanly.

A zip stores entries case-sensitively, so all 253 distinct images are preserved
exactly on every OS, and the working tree stays clean.

## Extract them
```bash
# all of them
unzip original/res-images.zip -d original/res-images

# or a single asset to stdout (no disk collision)
unzip -p original/res-images.zip sK.webp > icon.png   # launcher icon
```

## Notes
- Names are the APK's shrunk names (e.g. `sK.webp` = launcher icon).
- Bytes are pristine from the APK; verify with `unzip -t original/res-images.zip`.

