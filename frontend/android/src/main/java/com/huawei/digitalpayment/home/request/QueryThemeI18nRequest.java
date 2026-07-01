package com.huawei.digitalpayment.home.request;

import com.google.gson.JsonObject;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u0002H\u0014J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/home/request/QueryThemeI18nRequest;", "Lcom/huawei/digitalpayment/consumer/baselib/http/PaymentRequest;", "", "cacheTimestamp", "params", "Lcom/huawei/digitalpayment/home/request/QueryI18nParams;", "<init>", "(Ljava/lang/String;Lcom/huawei/digitalpayment/home/request/QueryI18nParams;)V", "getParams", "()Lcom/huawei/digitalpayment/home/request/QueryI18nParams;", "getApiPath", "convert", "origin", "Lcom/google/gson/JsonObject;", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryThemeI18nRequest extends PaymentRequest<String> {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final QueryI18nParams component1;

    @Override
    public Object convert(JsonObject jsonObject) {
        int i = 2 % 2;
        int i2 = component3 + 77;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String strConvert = convert(jsonObject);
        int i4 = component3 + 37;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return strConvert;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final QueryI18nParams getParams() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        QueryI18nParams queryI18nParams = this.component1;
        int i5 = i3 + 121;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return queryI18nParams;
    }

    public QueryThemeI18nRequest(String str, QueryI18nParams queryI18nParams) {
        Intrinsics.checkNotNullParameter(queryI18nParams, "");
        this.component1 = queryI18nParams;
        addParams(queryI18nParams);
        if (str != null) {
            addParams("cacheTimestamp", str);
            int i = ShareDataUIState + 11;
            component3 = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        }
        int i3 = ShareDataUIState + 57;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 91 / 0;
        }
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 19;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return "cache/i18nResources";
        }
        throw null;
    }

    @Override
    public String convert(JsonObject origin) {
        int i = 2 % 2;
        int i2 = component3 + 23;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(origin, "");
            Intrinsics.checkNotNullExpressionValue(origin.toString(), "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(origin, "");
        String string = origin.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i3 = ShareDataUIState + 111;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }
}
