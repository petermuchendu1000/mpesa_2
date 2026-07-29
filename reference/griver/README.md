# Griver mini-app front-ends (extracted from My OneApp v5.1.9)

The Lifestyle/mini-program area of the app runs on **Alibaba Griver / Nebula** (an
Alipay-style H5 mini-program container). This folder contains everything about that
front-end that ships inside the APK.

## 1. H5 runtime (`framework/`)
The bundled Griver package is the **generic H5 runtime**, not a per-flow UI:
- `service.html` + `service.js` (240 KB) — the mini-app logic/service worker layer
- `view.js` (484 KB) — the view/render engine
- `package.mf` — Huawei-signed manifest

Individual mini-apps (their HTML/CSS/JS pages) are **downloaded at runtime as Nebula
packages** and are therefore **not present in the APK**. What ships on-device is this
runtime + the theme below.

## 2. Theme tokens (`Theme.json`, `griver_theme_tokens.json`)
The mini-program shell uses a **blue** palette (distinct from the native green home):

| token | value | token | value |
|---|---|---|---|
| colorPrimary | `#366bfc` | colorMainText | `#282828` |
| colorPrimaryClick | `#224CD6` | colorGeneralText | `#5C5C5C` |
| colorSuccessDefault | `#2EBF88` | colorSecondaryText | `#8F8F8F` |
| colorWarningDefault | `#FAAF0C` | colorPlaceholderText | `#c7c7c7` |
| colorUrgentDefault | `#FF4040` | colorFirstLevelBorder | `#e0e0e0` |
| colorImportantDefault | `#FF7420` | colorGround | `#ffffff` |
| colorPromptDefault | `#338BFF` | colorBackgroundFloating | `#f5f5f5` |

## 3. Scheduled-payment flow schemas
`AirtimeRecharge`, `CustomerPayBill`, `P2PTransfer` are **native form schemas** (field
definitions, not H5 pages) used by the Schedule-Payment feature. Field labels/tips are
`@string/schedule_payment_*` refs resolved against the app's native string table (whose
names are obfuscated in the APK, so only the values — not the name→value mapping — survive).
Types registry (`schedulePaymentTypes.json`):
- **P2PTransfer** → icon `icon_transfer_to_customer`, name `@string/schedule_payment_type_title2`
- **AirtimeRecharge** → icon `icon_buy_airtime`, name `@string/schedule_payment_type_title3`
- **CustomerPayBill** → icon `icon_pay_bill`, name `@string/schedule_payment_type_title20`

### P2PTransfer  (8 fields)

| # | key | elementType | dataType | required | maxLen | regex |
|---|-----|-------------|----------|----------|--------|-------|
| 1 | `scheduleName` | TEXT | TEXT | True | 64 | `^([0-9A-Za-z ]{1,64})$` |
| 2 | `receiverMsisdn` | MOBILE | NUMBER | True | 11 | `^([0-9]{13})$` |
| 3 | `amount` | AMOUNT | TEXT | True | 2147483647 | `` |
| 4 | `firstPaymentReminderDate` | DATE_FOREVER | TEXT | True | 2147483647 | `` |
| 5 | `issuePaymentReminderUntil` | DATE_FOREVER | TEXT | True | 2147483647 | `` |
| 6 | `frequency` | SELECT | TEXT | True | 2147483647 | `` |
| 7 | `preWarningPeriod` | SELECT | TEXT | True | 2147483647 | `` |
| 8 | `freeText` | TEXT | TEXT | False | 64 | `^([0-9a-zA-Z,.; ]{0,64})` |

### AirtimeRecharge  (8 fields)

| # | key | elementType | dataType | required | maxLen | regex |
|---|-----|-------------|----------|----------|--------|-------|
| 1 | `scheduleName` | TEXT | TEXT | True | 64 | `^([0-9A-Za-z ]{1,64})$` |
| 2 | `receiverMsisdn` | MOBILE | NUMBER | True | 11 | `^([0-9]{13})$` |
| 3 | `amount` | AMOUNT | TEXT | True | 2147483647 | `` |
| 4 | `firstPaymentReminderDate` | DATE_FOREVER | TEXT | True | 2147483647 | `` |
| 5 | `issuePaymentReminderUntil` | DATE_FOREVER | TEXT | True | 2147483647 | `` |
| 6 | `frequency` | SELECT | TEXT | True | 2147483647 | `` |
| 7 | `preWarningPeriod` | SELECT | TEXT | True | 2147483647 | `` |
| 8 | `freeText` | TEXT | TEXT | False | 64 | `^([0-9a-zA-Z,.; ]{0,64})` |

### CustomerPayBill  (8 fields)

| # | key | elementType | dataType | required | maxLen | regex |
|---|-----|-------------|----------|----------|--------|-------|
| 1 | `scheduleName` | TEXT | TEXT | True | 64 | `^([0-9A-Za-z ]{1,64})$` |
| 2 | `billerCode` | SELECT_BILLER | TEXT | True | 2147483647 | `` |
| 3 | `BillReferenceNumber` | TEXT | TEXT | True | 64 | `^[^/\\:*"'<>|?]{0,64}$` |
| 4 | `firstPaymentReminderDate` | DATE_FOREVER | TEXT | True | 2147483647 | `` |
| 5 | `issuePaymentReminderUntil` | DATE_FOREVER | TEXT | True | 2147483647 | `` |
| 6 | `frequency` | SELECT | TEXT | True | 2147483647 | `` |
| 7 | `preWarningPeriod` | SELECT | TEXT | True | 2147483647 | `` |
| 8 | `freeText` | TEXT | TEXT | False | 64 | `^([0-9a-zA-Z,.; ]{0,64})` |

## 4. Shell i18n (`griver_shell_strings_en.json`)
129 English strings for the mini-program shell (navigator_home/life/my = Home/Life/My,
"Mini Apps", "Cards", "Virtual Cards", "Keyword search…", etc.).
