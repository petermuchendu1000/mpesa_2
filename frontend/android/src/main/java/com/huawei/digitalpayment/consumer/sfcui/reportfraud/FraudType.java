package com.huawei.digitalpayment.consumer.sfcui.reportfraud;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/FraudType;", "", "<init>", "()V", "REPORT_CONMAN", "", "CONNED_ONLINE", "SWAPPED_LINE", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FraudType {
    public static final int $stable = 0;
    public static final String CONNED_ONLINE = "online fraud";
    public static final FraudType INSTANCE = new FraudType();
    public static final String REPORT_CONMAN = "social engineering";
    public static final String SWAPPED_LINE = "sim swap";
    private static int component2 = 1;
    private static int component3;

    private FraudType() {
    }

    static {
        int i = component3 + 51;
        component2 = i % 128;
        int i2 = i % 2;
    }
}
