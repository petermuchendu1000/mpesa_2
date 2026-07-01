package com.huawei.digitalpayment.consumer.base.util;

import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.image.UrlUtils;
import com.huawei.digitalpayment.consumer.base.util.interceptors.H5TokenInterceptor;
import com.huawei.digitalpayment.consumer.baselib.http.interceptor.ExceptionTransferInterceptor;
import com.huawei.http.BaseRequest;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.appserver.IAppServerHttpConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0013\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0003\u0010\u0007B\u001b\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0003\u0010\nJ\u0010\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0014J\b\u0010\u0011\u001a\u00020\u0006H\u0014J\b\u0010\u0012\u001a\u00020\u0006H\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/util/HaProxyStatementRequest;", "TransferResponse", "Lcom/huawei/http/BaseRequest;", "<init>", "()V", "path", "", "(Ljava/lang/String;)V", "params", "Lcom/huawei/http/BaseRequestParams;", "(Ljava/lang/String;Lcom/huawei/http/BaseRequestParams;)V", "getPath", "()Ljava/lang/String;", "setPath", "getInterceptors", "", "Lokhttp3/Interceptor;", "getUrl", "getApiPath", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class HaProxyStatementRequest<TransferResponse> extends BaseRequest<TransferResponse> {
    private static int ShareDataUIState = 1;
    private static int component1;
    private String copydefault;

    protected final String getPath() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 69;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.copydefault;
            int i4 = 37 / 0;
        } else {
            str = this.copydefault;
        }
        int i5 = i2 + 63;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
        return str;
    }

    protected final void setPath(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 35;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.copydefault = str;
        int i5 = i2 + 13;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public HaProxyStatementRequest() {
    }

    public HaProxyStatementRequest(String str) {
        this.copydefault = str;
    }

    public HaProxyStatementRequest(String str, BaseRequestParams baseRequestParams) {
        Intrinsics.checkNotNullParameter(baseRequestParams, "");
        this.copydefault = str;
        addParams(baseRequestParams);
    }

    @Override
    public List<Interceptor> getInterceptors() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ((IAppServerHttpConfig) RouteUtils.getService(IAppServerHttpConfig.class)).getInterceptors();
            obj.hashCode();
            throw null;
        }
        List<Interceptor> interceptors = ((IAppServerHttpConfig) RouteUtils.getService(IAppServerHttpConfig.class)).getInterceptors();
        if (interceptors != null) {
            Iterator<Interceptor> it = interceptors.iterator();
            while (it.hasNext()) {
                int i3 = ShareDataUIState + 47;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    boolean z = it.next() instanceof ExceptionTransferInterceptor;
                    obj.hashCode();
                    throw null;
                }
                Interceptor next = it.next();
                if (next instanceof ExceptionTransferInterceptor) {
                    ((ExceptionTransferInterceptor) next).setTransferOnBusinessFail(false);
                }
            }
        }
        interceptors.add(new H5TokenInterceptor());
        return interceptors;
    }

    @Override
    public String getUrl() {
        int i = 2 % 2;
        int i2 = component1 + 125;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String fullUrl = UrlUtils.getFullUrl("http://witapp.fsawsprod.safaricom.co.ke/consumerapp-huawei/v1/", super.getUrl());
        Intrinsics.checkNotNullExpressionValue(fullUrl, "");
        int i4 = component1 + 63;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return fullUrl;
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.copydefault;
        Intrinsics.checkNotNull(str);
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        return str;
    }
}
