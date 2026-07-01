package com.mpesa.qrcode.service.impl;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

class AuthClient {
    private static String authUrl = "https://mpa.qr.auth.m-pesa.com";
    private static AuthClient instance;
    private final IAuthApi IAuthApi = (IAuthApi) new Retrofit.Builder().baseUrl(authUrl).addConverterFactory(GsonConverterFactory.create()).build().create(IAuthApi.class);

    private AuthClient() {
    }

    public static AuthClient getInstance() {
        AuthClient authClient;
        synchronized (AuthClient.class) {
            if (instance == null) {
                instance = new AuthClient();
            }
            authClient = instance;
        }
        return authClient;
    }

    public static void setAuthUrl(String str) {
        authUrl = str;
    }

    public IAuthApi getAuthApi() {
        return this.IAuthApi;
    }
}
