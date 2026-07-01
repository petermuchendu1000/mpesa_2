package com.huawei.digitalpayment.consumer.baselib.http;

import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.image.UrlUtils;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.appserver.IAppServerHttpConfig;
import java.util.List;
import okhttp3.Interceptor;

public class PaymentRequest<TransferResponse> extends com.huawei.http.BaseRequest<TransferResponse> {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private String path;

    public PaymentRequest() {
    }

    public PaymentRequest(String str, BaseRequestParams baseRequestParams) {
        this.path = str;
        addParams(baseRequestParams);
    }

    @Override
    public List<Interceptor> getInterceptors() {
        int i = 2 % 2;
        int i2 = component1 + 25;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        List<Interceptor> interceptors = ((IAppServerHttpConfig) RouteUtils.getService(IAppServerHttpConfig.class)).getInterceptors();
        int i4 = ShareDataUIState + 39;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return interceptors;
    }

    @Override
    public String getUrl() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String fullUrl = UrlUtils.getFullUrl(AppConfigManager.getAppConfig().getBaseUrl(), super.getUrl());
        int i4 = component1 + 19;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return fullUrl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.path;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
