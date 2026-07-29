# Icon fidelity — sourced from the real app

The 56 Safaricom UI vector icons under `app/src/main/res/drawable/` referenced by the
frontend were replaced with the **exact vector drawables** extracted and decoded from the
official app binary:

- **Source:** `My OneApp.apk` — `com.safaricom.mpesa.lifestyle`, version **5.1.9** (build 50031)
- **Method:** APK unpacked; compiled binary vector XML decoded back to source (colors inlined
  as literals, e.g. `#FF35A839`); imported verbatim so on-screen icons are pixel-identical to
  the production app.

## Icons upgraded (now identical to the app)
send_money, withdraw_at_agent, airtime, buy_bundles, fuliza, pochi, mpesa_global, mpesa_pay,
sambaza, tunukiwa, reverse_transaction, hide_balance, pin_scan, and the full `icon_sfc_*`
settings/services set; `ic_one_app_action_send_to_{bank,mobile,western_union}`, `ic_one_app_search`,
`ic_request_money`, `ic_scan_to_pay`, `ic_postpay_bill`, `ic_statement_*`, `ic_frequents_empty_state*`,
`ic_lipa_na_bonga`, `ic_notifications`, `history_transaction_icon_*`.

## Intentionally kept (repo originals)
The bottom-nav tab icons (`home_v3_icon_*`), the assistant glyph (`ic_ask_zuri`), the launcher
icon, and the "Do more"/Life 3D illustration tiles (`ic_gift`, `ic_travel`, `ic_health`, …).
These are delivered remotely / as mipmaps in the production app and are not present as
extractable drawables in the APK, so the repo's transcribed versions are retained.

## Notes on parity
The production app is the Huawei DigitalPayment super-app (native + Jetpack Compose + Alibaba
Griver H5 mini-programs), and its Home feed is server-driven. Icons, brand color (`#43B02A`),
app name, and the Home/Life/My navigation match the app exactly; the feed **composition/ordering**
was transcribed from screenshots by the original author (it is not contained in the APK).
