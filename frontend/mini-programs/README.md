# frontend/mini-programs — Ant Group Griver (mPaaS) H5 framework

My OneApp embeds the **Ant Group Griver / mPaaS** mini-program container (the same
technology behind Alipay mini-programs). This folder holds the **framework runtime**
extracted from `assets/Griver/*.amr` (each `.amr` = ZIP → `.tar` → H5/JS/CSS).

## What's bundled (the engine, minified)

| ID | Version | Name | Contents |
|----|---------|------|----------|
| `66666692_1.24.8` | 1.24.8 | **appx framework** | `appx/af-appx.min.js`, `af-appx.worker.min.js`, `af-appx.min.css`, `web-view.min.js`, `worker.min.js`, `es6-promise`, `security-patch`. |
| `66666693_2.0.7.1` | 2.0.7.1 | **h5 embedded app** | `index.html`, `index.js`, `index.worker.js`, `appConfig.json`, `manifest.json`, `api_permission`. |
| `68687209_2.9.17.12` | 2.9.17.12 | **appx-ng framework** | `appx-ng/*` (portal, prerender, worker, web-view). |

Additional engine pieces live in `original/`:
- `original/framework/` — `service.js`, `view.js` (mini-program service/view layers).
- `original/apk_raw/assets/GriverBridge/` — JSAPI bridge (`h5_bridge.js`, `worker.html`,
  `alipay_min_*.js`, `preload_min_*.js`).
- `original/apk_raw/assets/GriverErrorPage/`, `GriverTheme/`.

## What is NOT here (and why)

The **business mini-programs** (the actual lifestyle/merchant mini-apps shown in the
"Life" tab) are **not shipped in the APK**. `assets/Griver/appx.json` shows they are
downloaded on demand from:
- `cdn.marmot-cloud.com`, `gw.alipayobjects.com`, `oss-local-nightly-dev.marmot-cloud.com`

So only the reusable **container/runtime** is recoverable from the binary. To capture a
specific business mini-program you would intercept its runtime download.

> Files are **minified vendor JS** (Ant Group). They are included verbatim for
> completeness and to document the hybrid architecture, not as editable source.

