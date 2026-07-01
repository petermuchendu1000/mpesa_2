package com.huawei.digitalpayment.consumer.sfcui.reportfraud;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/FraudChannelNames;", "", "<init>", "()V", "PHONE_NUMBER", "", "AGENT_NUMBER", "PAYBILL_TILL", "ACCOUNT_NUMBER", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FraudChannelNames {
    public static final int $stable = 0;
    public static final String ACCOUNT_NUMBER = "Account number";
    public static final String AGENT_NUMBER = "Agent number";
    public static final FraudChannelNames INSTANCE = new FraudChannelNames();
    public static final String PAYBILL_TILL = "Paybill/Till number";
    public static final String PHONE_NUMBER = "Mobile Number";
    private static int component1 = 1;
    private static int component2;

    private FraudChannelNames() {
    }

    static {
        int i = component1 + 69;
        component2 = i % 128;
        int i2 = i % 2;
    }
}
