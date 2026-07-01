package com.huawei.digitalpayment.consumer.manageandviewdata.resp;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/UsageType;", "", "<init>", "()V", "AIRTIME", "", "DATA", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UsageType {
    public static final int $stable = 0;
    public static final String AIRTIME = "airtime";
    public static final String DATA = "data";
    public static final UsageType INSTANCE = new UsageType();
    private static int component1 = 0;
    private static int copydefault = 1;

    private UsageType() {
    }

    static {
        int i = component1 + 77;
        copydefault = i % 128;
        int i2 = i % 2;
    }
}
