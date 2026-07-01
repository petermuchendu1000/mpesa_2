package com.mpesa.qrcode.service.impl;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {
    private static String baseUrl = "https://mpa.qr.api.m-pesa.com";
    private static APIClient instance;
    private final IQRApi IQRApi;

    private APIClient() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(SupportInterceptor.getInstance());
        this.IQRApi = (IQRApi) new Retrofit.Builder().baseUrl(baseUrl).client(builder.build()).addConverterFactory(GsonConverterFactory.create()).build().create(IQRApi.class);
    }

    public static APIClient getInstance() {
        APIClient aPIClient;
        synchronized (APIClient.class) {
            if (instance == null) {
                instance = new APIClient();
            }
            aPIClient = instance;
        }
        return aPIClient;
    }

    public static void setBaseUrl(String str) {
        baseUrl = str;
    }

    public IQRApi getQrApi() {
        return this.IQRApi;
    }
}
