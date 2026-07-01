package com.huawei.digitalpayment.consumer.base.util;

import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.image.UrlUtils;
import com.huawei.digitalpayment.consumer.base.util.interceptors.DecryptionInterceptor;
import com.huawei.digitalpayment.consumer.base.util.interceptors.DeleteHttpMethodInterceptor;
import com.huawei.digitalpayment.consumer.base.util.interceptors.EncryptionInterceptor;
import com.huawei.digitalpayment.consumer.base.util.interceptors.H5TokenInterceptor;
import com.huawei.digitalpayment.consumer.base.util.interceptors.PutHttpMethodInterceptor;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.http.interceptor.ExceptionTransferInterceptor;
import com.huawei.http.BaseRequest;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.appserver.IAppServerHttpConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0013\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0003\u0010\u0007B\u001b\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0003\u0010\nJ\u0010\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0014J\b\u0010\u0011\u001a\u00020\u0006H\u0014J\b\u0010\u0012\u001a\u00020\u0006H\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/util/HaProxyRequest;", "TransferResponse", "Lcom/huawei/http/BaseRequest;", "<init>", "()V", "path", "", "(Ljava/lang/String;)V", "params", "Lcom/huawei/http/BaseRequestParams;", "(Ljava/lang/String;Lcom/huawei/http/BaseRequestParams;)V", "getPath", "()Ljava/lang/String;", "setPath", "getInterceptors", "", "Lokhttp3/Interceptor;", "getUrl", "getApiPath", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class HaProxyRequest<TransferResponse> extends BaseRequest<TransferResponse> {
    private static int ShareDataUIState = 1;
    private static int component3;
    private String component2;

    protected final String getPath() {
        int i = 2 % 2;
        int i2 = component3 + 119;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        throw null;
    }

    protected final void setPath(String str) {
        int i = 2 % 2;
        int i2 = component3 + 73;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.component2 = str;
        if (i4 == 0) {
            int i5 = 96 / 0;
        }
        int i6 = i3 + 67;
        component3 = i6 % 128;
        int i7 = i6 % 2;
    }

    public HaProxyRequest() {
    }

    public HaProxyRequest(String str) {
        this.component2 = str;
    }

    public HaProxyRequest(String str, BaseRequestParams baseRequestParams) {
        Intrinsics.checkNotNullParameter(baseRequestParams, "");
        this.component2 = str;
        addParams(baseRequestParams);
    }

    @Override
    public List<Interceptor> getInterceptors() {
        int i = 2 % 2;
        List<Interceptor> interceptors = ((IAppServerHttpConfig) RouteUtils.getService(IAppServerHttpConfig.class)).getInterceptors();
        if (interceptors != null) {
            int i2 = ShareDataUIState + 47;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                interceptors.iterator();
                throw null;
            }
            for (Interceptor interceptor : interceptors) {
                int i3 = ShareDataUIState + 41;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                if (interceptor instanceof ExceptionTransferInterceptor) {
                    int i5 = ShareDataUIState + 47;
                    component3 = i5 % 128;
                    if (i5 % 2 != 0) {
                        ((ExceptionTransferInterceptor) interceptor).setTransferOnBusinessFail(true);
                    } else {
                        ((ExceptionTransferInterceptor) interceptor).setTransferOnBusinessFail(false);
                    }
                }
            }
        }
        interceptors.add(new H5TokenInterceptor());
        interceptors.add(new EncryptionInterceptor());
        interceptors.add(new DecryptionInterceptor());
        interceptors.add(new PutHttpMethodInterceptor(CollectionsKt.listOf((Object[]) new String[]{"service-pin/api/v1/updatePin", "bill-manager/api/v1/"})));
        interceptors.add(new DeleteHttpMethodInterceptor(CollectionsKt.listOf("bill-manager/api/v1/")));
        int i6 = component3 + 71;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return interceptors;
    }

    @Override
    public String getUrl() {
        int i = 2 % 2;
        String fullUrl = UrlUtils.getFullUrl(AppConfigManager.getAppConfig().getH5BaseUrlByBaseUrl() + "/oneappgsm/gsm/gateway-facade/", super.getUrl());
        Intrinsics.checkNotNullExpressionValue(fullUrl, "");
        int i2 = ShareDataUIState + 79;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 38 / 0;
        }
        return fullUrl;
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component3 + 5;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component2;
        Intrinsics.checkNotNull(str);
        int i4 = ShareDataUIState + 103;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }
}
