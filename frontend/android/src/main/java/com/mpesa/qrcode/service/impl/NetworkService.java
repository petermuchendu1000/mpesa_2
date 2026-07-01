package com.mpesa.qrcode.service.impl;

import android.os.Build;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mpesa.qrcode.constants.ErrorStore;
import com.mpesa.qrcode.exception.ApiException;
import com.mpesa.qrcode.exception.FieldValidationException;
import com.mpesa.qrcode.model.QRPayload;
import com.mpesa.qrcode.model.api.request.DecodeQRRequest;
import com.mpesa.qrcode.model.api.request.EncodeQRRequest;
import com.mpesa.qrcode.model.api.request.StaticQRListPayload;
import com.mpesa.qrcode.model.api.response.DecodedQRResponse;
import com.mpesa.qrcode.model.api.response.EncodedQRResponse;
import com.mpesa.qrcode.model.api.response.ErrorResponse;
import com.mpesa.qrcode.model.api.response.GeneratedBulkResponse;
import com.mpesa.qrcode.service.impl.callbacks.IBulkGenerationCallback;
import com.mpesa.qrcode.service.impl.callbacks.IDecodeQRCallback;
import com.mpesa.qrcode.service.impl.callbacks.IEncodeQRCallback;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

class NetworkService {
    private static NetworkService instance;
    private int retryCounter;

    private NetworkService() {
    }

    public static NetworkService getInstance() {
        NetworkService networkService;
        synchronized (NetworkService.class) {
            if (instance == null) {
                instance = new NetworkService();
            }
            networkService = instance;
        }
        return networkService;
    }

    public void generateBulk(StaticQRListPayload staticQRListPayload, final IBulkGenerationCallback iBulkGenerationCallback) {
        if (isOnline()) {
            if (SupportInterceptor.getInstance().isCredentialsSet()) {
                APIClient.getInstance().getQrApi().generateBulk(getRequestBody(staticQRListPayload)).enqueue(new Callback<GeneratedBulkResponse>() {
                    @Override
                    public void onResponse(Call<GeneratedBulkResponse> call, Response<GeneratedBulkResponse> response) {
                        if (response.code() == 200) {
                            GeneratedBulkResponse generatedBulkResponseBody = response.body();
                            if (generatedBulkResponseBody != null) {
                                ArrayList arrayList = new ArrayList();
                                for (int i = 0; i < generatedBulkResponseBody.getQrList().size(); i++) {
                                    arrayList.add(generatedBulkResponseBody.getQrList().get(i).getCode());
                                }
                                iBulkGenerationCallback.onSuccess(arrayList);
                                return;
                            }
                            return;
                        }
                        if (response.code() == 400) {
                            String errors = NetworkService.this.getErrors(response.errorBody());
                            if (!errors.isEmpty()) {
                                iBulkGenerationCallback.onError(new ApiException(errors));
                                return;
                            } else {
                                iBulkGenerationCallback.onError(new ApiException(ErrorStore.SOMETHING_WENT_WRONG));
                                return;
                            }
                        }
                        iBulkGenerationCallback.onError(new ApiException(NetworkService.this.getAuthError()));
                    }

                    @Override
                    public void onFailure(Call<GeneratedBulkResponse> call, Throwable th) {
                        iBulkGenerationCallback.onError(new ApiException(th.getMessage()));
                    }
                });
                return;
            } else {
                iBulkGenerationCallback.onError(new ApiException(ErrorStore.NO_AUTH_CREDENTIALS));
                return;
            }
        }
        iBulkGenerationCallback.onError(new ApiException(ErrorStore.NO_INTERNET));
    }

    public void decodeQR(String str, String str2, final IDecodeQRCallback iDecodeQRCallback) {
        if (isOnline()) {
            if (SupportInterceptor.getInstance().isCredentialsSet()) {
                APIClient.getInstance().getQrApi().decodeQR(getRequestBody(new DecodeQRRequest(str, str2))).enqueue(new Callback<DecodedQRResponse>() {
                    @Override
                    public void onResponse(Call<DecodedQRResponse> call, Response<DecodedQRResponse> response) {
                        if (response.code() == 200) {
                            DecodedQRResponse decodedQRResponseBody = response.body();
                            if (decodedQRResponseBody != null) {
                                if (decodedQRResponseBody.getQrData() != null) {
                                    iDecodeQRCallback.onSuccess(decodedQRResponseBody.getQrData());
                                    return;
                                } else {
                                    iDecodeQRCallback.onError(new ApiException(ErrorStore.EMPTY_RESPONSE));
                                    return;
                                }
                            }
                            return;
                        }
                        if (response.code() == 400) {
                            String decodeQRErrors = NetworkService.this.getDecodeQRErrors(response.errorBody());
                            if (!decodeQRErrors.isEmpty()) {
                                iDecodeQRCallback.onError(new ApiException(decodeQRErrors));
                                return;
                            } else {
                                iDecodeQRCallback.onError(new ApiException(ErrorStore.SOMETHING_WENT_WRONG));
                                return;
                            }
                        }
                        if (response.code() != 503) {
                            iDecodeQRCallback.onError(new ApiException(NetworkService.this.getAuthError()));
                        } else {
                            iDecodeQRCallback.onError(new ApiException(ErrorStore.SERVICE_UNAVAILABLE));
                        }
                    }

                    @Override
                    public void onFailure(Call<DecodedQRResponse> call, Throwable th) {
                        iDecodeQRCallback.onError(new ApiException(th.getMessage()));
                    }
                });
                return;
            } else {
                iDecodeQRCallback.onError(new ApiException(ErrorStore.NO_AUTH_CREDENTIALS));
                return;
            }
        }
        iDecodeQRCallback.onError(new ApiException(ErrorStore.NO_INTERNET));
    }

    public void encodeQR(QRPayload qRPayload, String str, final IEncodeQRCallback iEncodeQRCallback) throws FieldValidationException {
        if (isOnline()) {
            if (SupportInterceptor.getInstance().isCredentialsSet()) {
                if (qRPayload.getCurrencyCode() != null && qRPayload.getCurrencyCode().isEmpty()) {
                    qRPayload.setCurrencyCode(null);
                }
                if (qRPayload.getMerchantCCode() != null && qRPayload.getMerchantCCode().isEmpty()) {
                    qRPayload.setMerchantCCode(null);
                }
                APIClient.getInstance().getQrApi().encodeQR(getRequestBody(new EncodeQRRequest(qRPayload, str))).enqueue(new Callback<EncodedQRResponse>() {
                    @Override
                    public void onResponse(Call<EncodedQRResponse> call, Response<EncodedQRResponse> response) {
                        if (response.code() == 200) {
                            EncodedQRResponse encodedQRResponseBody = response.body();
                            if (encodedQRResponseBody != null) {
                                if (encodedQRResponseBody.getQrData() != null) {
                                    try {
                                        iEncodeQRCallback.onSuccess(encodedQRResponseBody.getQrData().getCode());
                                        return;
                                    } catch (FieldValidationException e) {
                                        e.printStackTrace();
                                        return;
                                    }
                                }
                                iEncodeQRCallback.onError(new ApiException(ErrorStore.SOMETHING_WENT_WRONG));
                                return;
                            }
                            return;
                        }
                        if (response.code() == 400) {
                            String errors = NetworkService.this.getErrors(response.errorBody());
                            if (!errors.isEmpty()) {
                                iEncodeQRCallback.onError(new ApiException(errors));
                                return;
                            } else {
                                iEncodeQRCallback.onError(new ApiException(ErrorStore.SOMETHING_WENT_WRONG));
                                return;
                            }
                        }
                        if (response.code() != 503) {
                            iEncodeQRCallback.onError(new ApiException(NetworkService.this.getAuthError()));
                        } else {
                            iEncodeQRCallback.onError(new ApiException(ErrorStore.SERVICE_UNAVAILABLE));
                        }
                    }

                    @Override
                    public void onFailure(Call<EncodedQRResponse> call, Throwable th) {
                        iEncodeQRCallback.onError(new ApiException(th.getMessage()));
                    }
                });
                return;
            }
            iEncodeQRCallback.onError(new ApiException(ErrorStore.NO_AUTH_CREDENTIALS));
            return;
        }
        iEncodeQRCallback.onError(new ApiException(ErrorStore.NO_INTERNET));
    }

    public String getErrors(ResponseBody responseBody) {
        StringBuilder sb = new StringBuilder();
        if (responseBody != null) {
            try {
                try {
                    ErrorResponse errorResponse = (ErrorResponse) new Gson().fromJson(new JSONObject(responseBody.string()).toString(), ErrorResponse.class);
                    if (errorResponse.getDescription() != null) {
                        return errorResponse.getDescription();
                    }
                    Iterator<List<String>> it = errorResponse.getErrors().values().iterator();
                    while (it.hasNext()) {
                        Iterator<String> it2 = it.next().iterator();
                        while (it2.hasNext()) {
                            sb.append(it2.next());
                            sb.append(", ");
                        }
                    }
                    sb.replace(sb.length() - 2, sb.length(), "");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (IOException | JSONException e2) {
                e2.printStackTrace();
            }
        }
        return sb.toString();
    }

    public String getDecodeQRErrors(ResponseBody responseBody) {
        Object obj;
        if (responseBody != null) {
            try {
                JSONObject jSONObject = new JSONObject(responseBody.string());
                Gson gson = new Gson();
                try {
                    DecodedQRResponse decodedQRResponse = (DecodedQRResponse) gson.fromJson(jSONObject.toString(), DecodedQRResponse.class);
                    Validator validator = new Validator();
                    String responseMsg = decodedQRResponse.getResponseMsg();
                    if (validator.isJSONValid(decodedQRResponse.getResponseMsg())) {
                        Map map = (Map) gson.fromJson(decodedQRResponse.getResponseMsg(), Map.class);
                        if (map.containsKey("Description") && (obj = map.get("Description")) != null) {
                            return obj.toString();
                        }
                    }
                    return responseMsg;
                } catch (Exception e) {
                    e.printStackTrace();
                    return ErrorStore.SOMETHING_WENT_WRONG;
                }
            } catch (IOException | JSONException e2) {
                e2.printStackTrace();
                return ErrorStore.SOMETHING_WENT_WRONG;
            }
        }
        return ErrorStore.SOMETHING_WENT_WRONG;
    }

    private void resetCounter() {
        this.retryCounter = 0;
    }

    public void increaseRetryCount() {
        this.retryCounter++;
    }

    public int getRetryCount() {
        return this.retryCounter;
    }

    private RequestBody getRequestBody(Object obj) {
        resetCounter();
        return RequestBody.create(createGson().toJson(obj), MediaType.parse(com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.constants.MediaType.APPLICATION_JSON_CHARSET));
    }

    private Gson createGson() {
        return new GsonBuilder().serializeNulls().registerTypeAdapter(String.class, new EmptyToNullTypeAdapter()).create();
    }

    public String getAuthError() {
        if (SupportInterceptor.getInstance().getError() != null) {
            return SupportInterceptor.getInstance().getError();
        }
        return ErrorStore.SOMETHING_WENT_WRONG;
    }

    private boolean isOnline() {
        Runtime runtime = Runtime.getRuntime();
        if (isEmulator()) {
            return true;
        }
        try {
            return runtime.exec("/system/bin/ping -c 1 8.8.8.8").waitFor() == 0;
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean isEmulator() {
        return Build.HARDWARE.contains("goldfish") || Build.HARDWARE.contains("ranchu");
    }
}
