package com.huawei.digitalpayment.consumer.subsui.utils;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/subsui/utils/Constants;", "", "<init>", "()V", "MY_SUBSCRIPTIONS", "", "STOP_PROMO_MESSAGES", "INDIVIDUAL_SUBSCRIPTIONS", "SKIZA_SUBSCRIPTIONS", "SELECTED_SUB_KEY", "CBS", "PRSP", "ConsumerSfcMySubscriptionsUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Constants {
    public static final int $stable = 0;
    public static final String CBS = "cbs";
    public static final String INDIVIDUAL_SUBSCRIPTIONS = "/sfcModule/individualSubs";
    public static final Constants INSTANCE = new Constants();
    public static final String MY_SUBSCRIPTIONS = "/sfcModule/mySubs";
    public static final String PRSP = "sdp";
    public static final String SELECTED_SUB_KEY = "selectedSubKey";
    public static final String SKIZA_SUBSCRIPTIONS = "/sfcModule/skizaTunes";
    public static final String STOP_PROMO_MESSAGES = "/sfcModule/stopPromoMessages";
    private static int ShareDataUIState = 1;
    private static int copydefault;

    private Constants() {
    }

    static {
        int i = ShareDataUIState + 65;
        copydefault = i % 128;
        int i2 = i % 2;
    }
}
