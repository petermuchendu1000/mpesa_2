package com.huawei.digitalpayment.consumer.manageandviewdata.utils;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/utils/RoutePathConstants;", "", "<init>", "()V", "MANAGE_VIEW_DATA", "", "VIEW_USAGE", "USAGE_LIMITS", "INDIVIDUAL_USAGE", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoutePathConstants {
    public static final int $stable = 0;
    public static final String INDIVIDUAL_USAGE = "/sfcModule/individualUsage";
    public static final RoutePathConstants INSTANCE = new RoutePathConstants();
    public static final String MANAGE_VIEW_DATA = "/sfcModule/manageAndViewData";
    private static int ShareDataUIState = 0;
    public static final String USAGE_LIMITS = "/sfcModule/usageLimits";
    public static final String VIEW_USAGE = "/sfcModule/viewUsage";
    private static int component3 = 1;

    private RoutePathConstants() {
    }

    static {
        int i = component3 + 1;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
