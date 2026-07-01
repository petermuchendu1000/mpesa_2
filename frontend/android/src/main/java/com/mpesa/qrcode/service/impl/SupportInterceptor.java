package com.mpesa.qrcode.service.impl;

import com.mpesa.qrcode.constants.ErrorStore;
import com.mpesa.qrcode.model.api.response.AuthResponse;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

class SupportInterceptor implements Interceptor {
    private static String accessToken = null;
    private static String clientID = null;
    private static String clientSecret = null;
    private static SupportInterceptor instance = null;
    private static String scope = "qr/api.write qr/api.read";
    private String error;

    private SupportInterceptor() {
    }

    public static SupportInterceptor getInstance() {
        SupportInterceptor supportInterceptor;
        synchronized (SupportInterceptor.class) {
            if (instance == null) {
                instance = new SupportInterceptor();
            }
            supportInterceptor = instance;
        }
        return supportInterceptor;
    }

    @Override
    public Response intercept(Interceptor.Chain chain) throws IOException {
        NetworkService networkService = NetworkService.getInstance();
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        builderNewBuilder.addHeader("x-correlation-id", "1");
        builderNewBuilder.addHeader("x-source-system", "1");
        builderNewBuilder.addHeader("Authorization", "Bearer " + accessToken);
        Response responseProceed = chain.proceed(builderNewBuilder.build());
        if (responseProceed.code() != 401) {
            return responseProceed;
        }
        networkService.increaseRetryCount();
        if (networkService.getRetryCount() >= 5) {
            return responseProceed;
        }
        fetchAccessToken();
        Request.Builder builderNewBuilder2 = chain.request().newBuilder();
        builderNewBuilder2.addHeader("x-correlation-id", "1");
        builderNewBuilder2.addHeader("x-source-system", "android-sdk");
        builderNewBuilder2.addHeader("Authorization", "Bearer " + accessToken);
        responseProceed.close();
        return chain.proceed(builderNewBuilder2.build());
    }

    void fetchAccessToken() {
        synchronized (this) {
            try {
                retrofit2.Response<AuthResponse> responseExecute = AuthClient.getInstance().getAuthApi().getAuthToken(clientID, clientSecret, "client_credentials", scope).execute();
                if (responseExecute.code() == 400) {
                    this.error = ErrorStore.INVALID_AUTH_CREDENTIALS;
                } else if (responseExecute.code() == 200) {
                    this.error = null;
                    if (responseExecute.body() != null) {
                        accessToken = responseExecute.body().getAccessToken();
                    } else {
                        this.error = ErrorStore.SOMETHING_WENT_WRONG;
                    }
                } else if (responseExecute.code() == 503) {
                    this.error = ErrorStore.SERVICE_UNAVAILABLE;
                } else {
                    this.error = ErrorStore.SOMETHING_WENT_WRONG;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void setClientID(String str) {
        clientID = str;
    }

    public void setClientSecret(String str) {
        clientSecret = str;
    }

    public void setScope(String str) {
        scope = str;
    }

    public boolean isCredentialsSet() {
        return (clientID == null || clientSecret == null) ? false : true;
    }

    public String getError() {
        return this.error;
    }
}
