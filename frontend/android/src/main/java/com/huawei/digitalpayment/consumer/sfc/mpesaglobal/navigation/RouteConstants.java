package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.navigation;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/navigation/RouteConstants;", "", "<init>", "()V", "GLOBAL_CHECK_STATUS", "", "SFC_IDENTITY_PIN", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteConstants {
    public static final int $stable = 0;
    public static final String GLOBAL_CHECK_STATUS = "/sfc/globalCheckStatus";
    public static final RouteConstants INSTANCE = new RouteConstants();
    public static final String SFC_IDENTITY_PIN = "/sfcModule/identityPin";
    private static int ShareDataUIState = 1;
    private static int component2;

    private RouteConstants() {
    }

    static {
        int i = ShareDataUIState + 31;
        component2 = i % 128;
        int i2 = i % 2;
    }
}
