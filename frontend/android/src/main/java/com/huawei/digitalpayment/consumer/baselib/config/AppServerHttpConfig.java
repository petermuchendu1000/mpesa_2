package com.huawei.digitalpayment.consumer.baselib.config;

import com.huawei.digitalpayment.consumer.baselib.http.interceptor.CommonExceptionTransferInterceptor;
import com.huawei.digitalpayment.consumer.baselib.http.interceptor.ExceptionTransferInterceptor;
import com.huawei.digitalpayment.consumer.baselib.http.interceptor.ForceUpdateInterceptor;
import com.huawei.digitalpayment.consumer.baselib.http.interceptor.GrayscaleInterceptor;
import com.huawei.digitalpayment.consumer.baselib.http.interceptor.PostParamsInterceptor;
import com.huawei.digitalpayment.consumer.baselib.http.interceptor.TokenInterceptor;
import com.huawei.http.appserver.IAppServerHttpConfig;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Interceptor;

public class AppServerHttpConfig implements IAppServerHttpConfig {
    private static int ShareDataUIState = 1;
    private static int component2;

    @Override
    public String getBaseUrl() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String baseUrl = AppConfigManager.getAppConfig().getBaseUrl();
        if (i3 != 0) {
            int i4 = 1 / 0;
        }
        return baseUrl;
    }

    @Override
    public List<Interceptor> getInterceptors() {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PostParamsInterceptor());
        arrayList.add(new ExceptionTransferInterceptor());
        arrayList.add(new CommonExceptionTransferInterceptor());
        arrayList.add(new ForceUpdateInterceptor());
        arrayList.add(new TokenInterceptor());
        arrayList.add(new GrayscaleInterceptor());
        int i2 = component2 + 57;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return arrayList;
    }
}
