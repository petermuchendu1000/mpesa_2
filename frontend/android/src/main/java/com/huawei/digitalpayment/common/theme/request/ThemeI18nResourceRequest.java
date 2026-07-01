package com.huawei.digitalpayment.common.theme.request;

import com.google.gson.JsonObject;
import com.huawei.digitalpayment.common.theme.request.params.QueryI18nResourceParams;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0014J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0014¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/request/ThemeI18nResourceRequest;", "Lcom/huawei/digitalpayment/consumer/baselib/http/PaymentRequest;", "", "cacheTimestamp", "params", "Lcom/huawei/digitalpayment/common/theme/request/params/QueryI18nResourceParams;", "<init>", "(Ljava/lang/String;Lcom/huawei/digitalpayment/common/theme/request/params/QueryI18nResourceParams;)V", "getApiPath", "convert", "origin", "Lcom/google/gson/JsonObject;", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ThemeI18nResourceRequest extends PaymentRequest<String> {
    private static int component2 = 1;
    private static int component3;

    @Override
    public Object convert(JsonObject jsonObject) {
        int i = 2 % 2;
        int i2 = component3 + 21;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String strConvert = convert(jsonObject);
        int i4 = component2 + 41;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return strConvert;
    }

    public ThemeI18nResourceRequest(String str, QueryI18nResourceParams queryI18nResourceParams) {
        Intrinsics.checkNotNullParameter(queryI18nResourceParams, "");
        super.addParams(queryI18nResourceParams);
        if (str != null) {
            super.addParams("cacheTimestamp", str);
            int i = component2 + 117;
            component3 = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        }
        int i3 = component2 + 25;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component3 + 115;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            int i4 = 51 / 0;
        }
        int i5 = i3 + 21;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return "cache/i18nResources";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public String convert(JsonObject origin) {
        int i = 2 % 2;
        int i2 = component3 + 11;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(origin, "");
            Intrinsics.checkNotNullExpressionValue(origin.toString(), "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(origin, "");
        String string = origin.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i3 = component3 + 101;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }
}
