# backend/ — Reverse-engineered API contract

> An APK is a **client** — it contains **no server source code**. This folder documents
> the **API surface** the app talks to, mined from the decompiled client. It is the
> maximum "backend" information any APK can provide, and is enough to build a compatible
> server or API client.

Full narrative: [`../docs/BACKEND_API.md`](../docs/BACKEND_API.md).

## Files

| File | Contents |
|------|----------|
| `api/endpoints.txt` | **184** distinct backend endpoint paths mined from app code. |
| `api/microservices.txt` | **105** microservice roots (first path segment). |
| `api/hosts.txt` | **10** backend hosts / base URLs. |

## Key facts

- **Primary gateway:** `https://myoneapp.safaricom.co.ke/appgateway/consumer/appserver/consumer/v1/`
- **Auth token:** `https://identity.safaricom.com/api/v2/app/getPlainToken`
- **QR payment:** `https://mpa.qr.api.m-pesa.com`, `mpa.qr.auth.m-pesa.com`
- **Statements/PDF:** `witapp.fsawsprod.safaricom.co.ke/consumerapp-huawei/v1/…`
- **Runtime routing:** Huawei **GRS** (`grs.dbankcloud.*`) resolves regional endpoints;
  base URL injected via `com.huawei.http.appserver.IAppServerHttpConfig`.

## How the lists were produced

Endpoints were extracted by scanning the app-owned Java for quoted API-style paths
(`/…/api/vN/…`, `/…/vN/…`) and filtering out **in-app ARouter navigation routes**
(`/loginModule/…`, `/sfcModule/…`, `/checkoutModule/…`, `/pochiWalletModule/…`,
`/pwaModule/…`) which are screen routes, not HTTP calls. See `docs/PROVENANCE.md`.

## Finding request/response shapes

DTOs are Java classes in the client. For any endpoint, follow its microservice name into
the source and read the Retrofit interface + Gson-annotated beans under
`**/data/source/network/model/`, `**/resp/`, `**/bean/`, `**/model/`.

