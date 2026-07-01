package com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/TunukiwaPurchaseCurrency;", "", "<init>", "()V", "AIRTIME", "", "MPESA", "BONGA", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TunukiwaPurchaseCurrency {
    public static final int $stable = 0;
    public static final int AIRTIME = 1;
    public static final int BONGA = 3;
    public static final TunukiwaPurchaseCurrency INSTANCE = new TunukiwaPurchaseCurrency();
    public static final int MPESA = 2;
    private static int component2 = 0;
    private static int copydefault = 1;

    private TunukiwaPurchaseCurrency() {
    }

    static {
        int i = component2 + 15;
        copydefault = i % 128;
        int i2 = i % 2;
    }
}
