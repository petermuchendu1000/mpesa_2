package com.huawei.digitalpayment.consumer.home.ui.utils;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/utils/ComponentTypeConstants;", "", "<init>", "()V", "TYPE_STATUSBAR", "", "TYPE_GROUP", "TYPE_TOP_BAR", "TYPE_BALANCE", "TYPE_TIPS", "TYPE_BANNER", "TYPE_MINI_APP", "TYPE_TRANSACTIONS", "TYPE_LOG_OUT", "TYPE_TITLE_BAR", "TYPE_HOME_BANK_STYLE", "TYPE_USERINFO", "TYPE_CARD_FUNCTIONS", "TYPE_BANK_CARDS", "TYPE_VIRTUAL_CARDS", "TYPE_FUNCTIONS", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ComponentTypeConstants {
    public static final int $stable = 0;
    public static final ComponentTypeConstants INSTANCE = new ComponentTypeConstants();
    private static int ShareDataUIState = 0;
    public static final String TYPE_BALANCE = "balance";
    public static final String TYPE_BANK_CARDS = "bankCards";
    public static final String TYPE_BANNER = "banner";
    public static final String TYPE_CARD_FUNCTIONS = "cardsFunctions";
    public static final String TYPE_FUNCTIONS = "functions";
    public static final String TYPE_GROUP = "group";
    public static final String TYPE_HOME_BANK_STYLE = "homeBankStyle";
    public static final String TYPE_LOG_OUT = "logout";
    public static final String TYPE_MINI_APP = "miniApps";
    public static final String TYPE_STATUSBAR = "statusBar";
    public static final String TYPE_TIPS = "tips";
    public static final String TYPE_TITLE_BAR = "titleBar";
    public static final String TYPE_TOP_BAR = "topSearchArea";
    public static final String TYPE_TRANSACTIONS = "transactions";
    public static final String TYPE_USERINFO = "userInfo";
    public static final String TYPE_VIRTUAL_CARDS = "virtualCards";
    private static int component1 = 1;

    private ComponentTypeConstants() {
    }

    static {
        int i = ShareDataUIState + 27;
        component1 = i % 128;
        int i2 = i % 2;
    }
}
