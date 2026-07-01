package com.huawei.digitalpayment.customer.dynamics.constants;

import com.alibaba.griver.base.common.utils.NetworkUtils;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/customer/dynamics/constants/GuiOperateModeConstants;", "", "<init>", "()V", NetworkUtils.NETWORK_TYPE_NONE, "", "ONLY_CREATE", "ONLY_EDIT", "CREATE_AND_EDIT", "ONLY_VIEW", "CREATE_AND_VIEW", "EDIT_AND_VIEW", "ALL", "DynamicsView_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GuiOperateModeConstants {
    public static final String ALL = "7";
    public static final String CREATE_AND_EDIT = "3";
    public static final String CREATE_AND_VIEW = "5";
    public static final String EDIT_AND_VIEW = "6";
    public static final GuiOperateModeConstants INSTANCE = new GuiOperateModeConstants();
    public static final String NONE = "0";
    public static final String ONLY_CREATE = "1";
    public static final String ONLY_EDIT = "2";
    public static final String ONLY_VIEW = "4";
    private static int component1 = 1;
    private static int component3;

    private GuiOperateModeConstants() {
    }

    static {
        int i = component1 + 1;
        component3 = i % 128;
        if (i % 2 != 0) {
            int i2 = 35 / 0;
        }
    }
}
