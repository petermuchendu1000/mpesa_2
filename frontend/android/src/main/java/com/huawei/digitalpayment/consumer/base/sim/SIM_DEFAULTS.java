package com.huawei.digitalpayment.consumer.base.sim;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/sim/SIM_DEFAULTS;", "", "<init>", "()V", "SAFARICOM_SIM_PROVIDER_CODE", "", SIM_DEFAULTS.PREF_SUBSCRIPTION_ID, "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SIM_DEFAULTS {
    public static final SIM_DEFAULTS INSTANCE = new SIM_DEFAULTS();
    public static final String PREF_SUBSCRIPTION_ID = "PREF_SUBSCRIPTION_ID";
    public static final String SAFARICOM_SIM_PROVIDER_CODE = "63902";
    private static int component2 = 1;
    private static int copydefault;

    private SIM_DEFAULTS() {
    }

    static {
        int i = copydefault + 67;
        component2 = i % 128;
        int i2 = i % 2;
    }
}
