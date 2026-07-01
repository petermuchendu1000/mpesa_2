package com.huawei.digitalpayment.consumer.manageandviewdata.resp;

import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, d2 = {"getDefaultLimits", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/UsageLimits;", "ConsumerSfcManageAndViewData_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LimitsRespKt {
    private static int component2 = 1;
    private static int copydefault;

    public static final UsageLimits getDefaultLimits() {
        int i = 2 % 2;
        UsageLimits usageLimits = (UsageLimits) new Gson().fromJson("[\n            {\n            \"category\": \"airtime\",\n            \"type\": \"daily\",\n            \"max\": 999999,\n            \"min\": 1\n            },\n            {\n            \"category\": \"airtime\",\n            \"type\": \"weekly\",\n            \"max\": 999999,\n            \"min\": 1\n            },\n            {\n            \"category\": \"airtime\",\n            \"type\": \"monthly\",\n            \"max\": 999999,\n            \"min\": 1\n            },\n            {\n            \"category\": \"data\",\n            \"type\": \"daily\",\n            \"max\": 999999,\n            \"min\": 1\n            },\n            {\n            \"category\": \"data\",\n            \"type\": \"weekly\",\n            \"max\": 999999,\n            \"min\": 1\n            },\n            {\n            \"category\": \"data\",\n            \"type\": \"monthly\",\n            \"max\": 999999,\n            \"min\": 1\n            }\n            ]", UsageLimits.class);
        Intrinsics.checkNotNull(usageLimits);
        int i2 = copydefault + 9;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return usageLimits;
    }
}
