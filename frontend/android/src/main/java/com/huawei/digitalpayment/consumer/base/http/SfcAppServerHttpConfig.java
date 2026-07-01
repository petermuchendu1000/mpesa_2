package com.huawei.digitalpayment.consumer.base.http;

import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.http.interceptor.CommonExceptionTransferInterceptor;
import com.huawei.digitalpayment.consumer.baselib.http.interceptor.EncryptBodyInterceptor;
import com.huawei.digitalpayment.consumer.baselib.http.interceptor.ExceptionTransferInterceptor;
import com.huawei.digitalpayment.consumer.baselib.http.interceptor.ForceUpdateInterceptor;
import com.huawei.digitalpayment.consumer.baselib.http.interceptor.GrayscaleInterceptor;
import com.huawei.digitalpayment.consumer.baselib.http.interceptor.PostParamsInterceptor;
import com.huawei.http.appserver.IAppServerHttpConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/http/SfcAppServerHttpConfig;", "Lcom/huawei/http/appserver/IAppServerHttpConfig;", "<init>", "()V", "getBaseUrl", "", "getInterceptors", "", "Lokhttp3/Interceptor;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SfcAppServerHttpConfig implements IAppServerHttpConfig {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;

    @Override
    public String getBaseUrl() {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String baseUrl = AppConfigManager.getAppConfig().getBaseUrl();
        Intrinsics.checkNotNullExpressionValue(baseUrl, "");
        int i4 = copydefault + 85;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return baseUrl;
    }

    @Override
    public List<Interceptor> getInterceptors() {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BlackPathInterceptor());
        arrayList.add(new RemoveEmptyTokenInterceptor());
        arrayList.add(new PostParamsInterceptor());
        arrayList.add(new ExceptionTransferInterceptor());
        arrayList.add(new CommonExceptionTransferInterceptor());
        arrayList.add(new ForceUpdateInterceptor());
        arrayList.add(new SfcTokenInterceptor());
        arrayList.add(new GrayscaleInterceptor());
        arrayList.add(new EncryptBodyInterceptor());
        int i2 = copydefault + 73;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return arrayList;
    }
}
