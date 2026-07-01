package com.huawei.payment.lib.image.crop;

import okhttp3.OkHttpClient;

public class OkHttpClientStore {
    public static final OkHttpClientStore INSTANCE = new OkHttpClientStore();
    private OkHttpClient component2;

    private OkHttpClientStore() {
    }

    public OkHttpClient getClient() {
        if (this.component2 == null) {
            this.component2 = new OkHttpClient();
        }
        return this.component2;
    }

    public void setClient(OkHttpClient okHttpClient) {
        this.component2 = okHttpClient;
    }
}
