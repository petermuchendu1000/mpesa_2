package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/BuyAirtimeTypes;", "", "<init>", "()V", "SELF", "", "OTHER", "AIRTIME", "MPESA", "BONGA", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BuyAirtimeTypes {
    public static final int $stable = 0;
    public static final String AIRTIME = "airtime";
    public static final String BONGA = "bonga";
    public static final BuyAirtimeTypes INSTANCE = new BuyAirtimeTypes();
    public static final String MPESA = "mpesa";
    public static final String OTHER = "other";
    public static final String SELF = "self";
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;

    private BuyAirtimeTypes() {
    }

    static {
        int i = copydefault + 23;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }
}
