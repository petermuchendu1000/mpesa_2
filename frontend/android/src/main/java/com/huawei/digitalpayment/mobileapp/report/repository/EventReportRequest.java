package com.huawei.digitalpayment.mobileapp.report.repository;

import com.huawei.arouter.RouteUtils;
import com.huawei.http.BaseRequest;
import com.huawei.http.BaseResp;
import com.huawei.http.appserver.IAppServerHttpConfig;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0005H\u0014J\u0012\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000bH\u0014J\b\u0010\r\u001a\u00020\u0005H\u0014¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/mobileapp/report/repository/EventReportRequest;", "Lcom/huawei/http/BaseRequest;", "Lcom/huawei/http/BaseResp;", "params", "", "", "", "<init>", "(Ljava/util/Map;)V", "getApiPath", "getInterceptors", "", "Lokhttp3/Interceptor;", "getUrl", "ReportingLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EventReportRequest extends BaseRequest<BaseResp> {
    private static int component1 = 0;
    private static int component3 = 1;

    public EventReportRequest(Map<String, ? extends Object> map) {
        addParams((Map<String, Object>) map);
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component3 + 95;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            int i4 = 58 / 0;
        }
        int i5 = i3 + 59;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 1 / 0;
        }
        return "appEventReport";
    }

    @Override
    public List<Interceptor> getInterceptors() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        List<Interceptor> interceptors = ((IAppServerHttpConfig) RouteUtils.getService(IAppServerHttpConfig.class)).getInterceptors();
        int i4 = component3 + 65;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return interceptors;
    }

    @Override
    public String getUrl() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String url = super.getUrl();
        Intrinsics.checkNotNull(url);
        if (!StringsKt.startsWith$default(url, "http", false, 2, (Object) null)) {
            url = ((IAppServerHttpConfig) RouteUtils.getService(IAppServerHttpConfig.class)).getBaseUrl() + url;
        }
        int i4 = component1 + 89;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return url;
    }
}
