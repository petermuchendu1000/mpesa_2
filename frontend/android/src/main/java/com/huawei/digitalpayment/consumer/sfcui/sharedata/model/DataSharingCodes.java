package com.huawei.digitalpayment.consumer.sfcui.sharedata.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/DataSharingCodes;", "", "<init>", "()V", "WithExpiry", "", "NoExpiry", "PostPay", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataSharingCodes {
    public static final int $stable = 0;
    public static final DataSharingCodes INSTANCE = new DataSharingCodes();
    public static final String NoExpiry = "C_2551";
    public static final String PostPay = "C_5710";
    private static int ShareDataUIState = 0;
    public static final String WithExpiry = "C_4500";
    private static int component1 = 1;

    private DataSharingCodes() {
    }

    static {
        int i = component1 + 3;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }
}
