package com.huawei.digitalpayment.consumer.baselib.config;

import com.huawei.common.util.L;
import com.huawei.http.okhttp.DefaultOkHttpConfig;
import okhttp3.Interceptor;

public class OkHttpConfig extends DefaultOkHttpConfig {
    private static int ShareDataUIState = 1;
    private static int component1;

    private static void component3(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        L.d("OkHttpDebug", str);
        int i4 = component1 + 11;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public Interceptor providerHttpLoggingInterceptor() {
        int i = 2 % 2;
        int i2 = component1 + 73;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }
}
