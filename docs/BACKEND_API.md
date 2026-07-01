# Backend API Contract — My OneApp

> **Important:** An APK is a **client**. There is **no server-side source code** inside it.
> This document is the **reverse-engineered API contract** — the endpoints, hosts, auth
> flow, and request/response DTOs the app is observed to call. It is the maximum "backend"
> information recoverable from a binary, and is sufficient to re-implement a compatible
> server or to write an API client.

Machine-readable lists live in [`../backend/api/`](../backend/api/):
`endpoints.txt` (184), `microservices.txt` (105), `hosts.txt` (10).

---

## 1. Hosts / base URLs

| Host | Purpose |
|------|---------|
| `https://myoneapp.safaricom.co.ke` | **Primary app gateway.** Base path `/appgateway/consumer/appserver/consumer/v1/` — fronts ~100 microservices. |
| `https://identity.safaricom.com` | Identity / auth — `/api/v2/app/getPlainToken`. |
| `https://mpa.qr.api.m-pesa.com` | M-PESA QR payment API. |
| `https://mpa.qr.auth.m-pesa.com` | M-PESA QR auth. |
| `http://witapp.fsawsprod.safaricom.co.ke` | Consumer-app-Huawei service — statements/transactions PDF (`/consumerapp-huawei/v1/…`). |
| `https://myaccount.safaricom.co.ke` | Web account portal (KYC upload, discover, games, e-newspaper). |
| `https://internet.safaricom.co.ke` | Home internet (5G/Fibre coverage, FAQs). |
| `https://www.safaricom.co.ke` | Marketing / FAQ web content. |
| `https://safaricom.com`, `https://preprod.safaricom.com` | ID/passport processing (`/api/v1/process-id`, `process-passport`). |
| `grs.dbankcloud.{com,cn,asia,eu,ru}` | Huawei **GRS** bootstrap for runtime endpoint resolution. |

### Service routing
- The app resolves regional service URLs at runtime via **Huawei GRS** (see
  `original/config-assets/grs_sdk_server_config.json`).
- The concrete base URL is supplied to Retrofit/OkHttp through
  `com.huawei.http.appserver.IAppServerHttpConfig#getBaseUrl()`, with auth/telemetry
  attached via `getInterceptors()`.

---

## 2. Authentication flow

Supported login factors (`original/config-assets/login_config.json`): **OTP, PIN,
Fingerprint, FaceId**. Payment factors (`pay_config.json`): **Fingerprint, FaceId**.

Client request models (in `frontend/android/.../loginModule/login/data/source/local/request/`):

| Model | Meaning |
|-------|---------|
| `QueryLoginTypeParams` | Ask backend which login method(s) this MSISDN/device supports. |
| `OtpLoginParams` | OTP-based login. |
| `PinLoginParams` | mPIN login. |
| `IdentityVerifyParams` | Identity verification (KYC / forgot-PIN). |

Representative auth-related routes:

```
/apiaccess/payment/gateway/payment/v1/token
/apiaccess/payment/gateway/payment/v1/auth/applyH5Token   # H5 mini-app token
GET https://identity.safaricom.com/api/v2/app/getPlainToken
/ms-otp-authentication-revamp/api/v1/…                     # OTP send/verify
```

New-device binding uses an `otpVerifyNewDevice` step before PIN/biometric is allowed.

---

## 3. Endpoint catalogue by domain

The full list is in `backend/api/endpoints.txt`. Grouped highlights:

### 3.1 Money movement (M-PESA)
```
/mpesa-global/send-to-mobile/v1/imtsendtomobile
/mpesa-global/send-to-mobile/v3/countries
/mpesa-global/send-to-mobile/v3/transactions/cost-estimator
/mpesa-global/send-to-agent/SendToAgent           /…/getcountryinfo
/mpesa-global/send-to-bank/SendToBank             /…/getcountryinfo
/mpesa-global/roaming-cashout/customerMoneyTransferAPI/customerMoneyTransfer
/mpesa-global/roaming-cashout/{name-check,pre-validation}
/mpesa-global/customers/v1/custoperations
/ms-mpesa-purchase-wrapper/api/v1/validate
/mpesa-ereceipts/api/v2/generate
/c2b-hakikisha/api/v1/lookup                        # payee name check
/cost-calculator/v1/allCharges                      # tariff/charges
```

### 3.2 Airtime, bundles & data
```
/make-your-bundle/api/v1/{offers,airtime/purchase}
/data-dabodabo/api/v1/digital/channels/airtime/purchase
/dut/api/v1/{raw,aggregated,airtime/raw}
/datasharing/api/v1/{addBeneficiary,deleteBeneficiary,modifyAllocation,queryBeneficiary,querySponsor}
/datalimit/api/v1/{addLimit,changeLimit,deleteLimit,queryLimits}
/data-manager/api/dataManager/v1/changeStatus
/angaza-bundles/api/angaza/v1/subscribe
/ms-data-delight/…   /ms-okoa-minutes-app-and-web/…   /voucher-topup/v1/topup
```

### 3.3 Home internet (4G/5G/Fibre)
```
/home-4g-5g-reactive/api/v1/getPlans
/home/4g/5g/payments/api/v1/{mpesa,postPay,enoughBal}/regular
/home4g/account-details-reactive/api/v1/queryAccountDetails
/home4g/postpay/api/v1/postpay-optout
/ms-home-dxl-wifi-credentials/…   /ms-home-dxl-mpesa-pre-validation-wrapper/…
```

### 3.4 Account, customer & postpay
```
/customer-info/api/subscriber/account/v{1,2}/customer/information
/account-balances-reactive/api/subscriber/account/v2/balances
/accountmigration/v2/api/postpay/accountmigration/v2/{migrateaccount,postpremigration}
/change-plan/api/v1/{change-plan,plan-details}     /postpay-change-plan/…
/postpay-diy/…   /postpay-update-email/…   /bundle-subscription/api/postpay/…/v1/list
/creditrating/api/postpay-credit-rating/v1/rate
/get-puk/v1/puk    /subreg-lines/…    /service-pin/…
```

### 3.5 Bonga loyalty points
```
/bonga-history/api/v3/{accumulated,redeemed}
/bonga-matrix/v1/getAllRedemptionMatrix
/bonga-opt-in/v3/activate     /bonga-redemption/v1/redeem     /bonga-transfer/v3/transfer
/ms-lipa-na-bonga-digital-channels/…
```

### 3.6 Bills & statements
```
/bill-manager/api/v1        /bill-accounts/api/v1
/consumerapp-huawei/v1/statements/transactions/pdf
/consumerapp-huawei/v1/fallback     /statement/…
```

### 3.7 Discover / lifestyle
```
/enewspaper-subscription/api/v1/{monthly,one-off,auto-renew/opt-out}
/epaper-get-products/api/enewspaper/v1/products/{all,release}
/enewspaper-user-information/api/v1/subscription-details
/ms-family-connect-app-and-web/…   /ms-offer-moto-app-and-web/…
/ms-esim-reservation/…             /skiza-tones-unsubscribe/…
/5g-promo/api/v1/{checkEligibility,award}          /diy-product-catalog/api/v1/offer/diy-catalog-products
```

### 3.8 Trust & safety
```
/fraud-reporting/api/v1/{report-fraud,fraud-types,fetch-report,fetch-faqs,
                          send-tip-off,update-fraud,verify-caller-number}
/mtandao-reports/…    /ms-mysafapp-page-favourites/…
```

### 3.9 QR & mini-app
```
/qr/…    /MiniappToPayment/v1/vasGeo/queryGeoFence    /miniapp/v2/service/proxy/
```

---

## 4. Request/response DTOs

Concrete request/response shapes are defined as Java model classes throughout the app
source. Look in these package suffixes:

- `**/data/source/network/model/` — network DTOs (e.g. `ExtResponse`, `NetworkQueryLoginType`).
- `**/resp/` — response objects (e.g. `com/huawei/digitalpayment/checkout/resp/`).
- `**/bean/` — data beans (e.g. `com/huawei/digitalpayment/consumer/bean/`).
- `**/model/` and `**/req(uest)/` — request params.
- `com/mpesa/qrcode/model/{api,dynamic}/` — QR payload models.

To dump every DTO field for an endpoint, grep the app source for the endpoint's
微service name and follow the Retrofit interface + `@SerializedName`/Gson-annotated beans.

---

## 5. Notes for re-implementation

- All traffic is HTTPS to the **app gateway**; requests carry a bearer/session token
  (marked sensitive in `sensitive_keys.json`).
- Charges/tariffs are server-authoritative (`cost-calculator`, `cost-estimator`).
- Name-check (`c2b-hakikisha`, roaming `name-check`) precedes money movement.
- Many features are **feature-flagged** via server config (`basic_config.json`
  `configTypes`, `switchParameterConfig`, `priorityConfig`).

