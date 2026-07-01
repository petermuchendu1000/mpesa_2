package com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.frequent;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/frequent/FrequentsRoutePathConstants;", "", "<init>", "()V", "SEND_MONEY", "", "PAY", "BUNDLES", "MINI_APPS", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FrequentsRoutePathConstants {
    public static final int $stable = 0;
    public static final String BUNDLES = "/sfcModule/buyBundles";
    public static final FrequentsRoutePathConstants INSTANCE = new FrequentsRoutePathConstants();
    public static final String MINI_APPS = "/sfcModule/alipayMiniAppSearch";
    public static final String PAY = "/sfcModule/mpesaPay";
    public static final String SEND_MONEY = "/sfcModule/sendMoney";
    private static int ShareDataUIState = 1;
    private static int component1;

    private FrequentsRoutePathConstants() {
    }

    static {
        int i = component1 + 75;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
