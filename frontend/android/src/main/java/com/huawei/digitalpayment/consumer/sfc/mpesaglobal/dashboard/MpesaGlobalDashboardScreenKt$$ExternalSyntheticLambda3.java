package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard.model.MpesaGlobalDashboardItem;
import kotlin.addOnTrimMemoryListener;
import kotlin.getActivityResultRegistry;
import kotlin.jvm.functions.Function2;

public final class MpesaGlobalDashboardScreenKt$$ExternalSyntheticLambda3 implements Function2 {
    private static int component1 = 1;
    private static int copydefault;

    public static void ShareDataUIState() {
        addOnTrimMemoryListener.ShareDataUIState[0] = getActivityResultRegistry.ShareDataUIState[0];
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = component1 + 77;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Object objM11007$r8$lambda$lKRFRKcyzXQjZQ0MZSj7RGzYWo = MpesaGlobalDashboardScreenKt.m11007$r8$lambda$lKRFRKcyzXQjZQ0MZSj7RGzYWo(((Integer) obj).intValue(), (MpesaGlobalDashboardItem) obj2);
        int i4 = copydefault + 15;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return objM11007$r8$lambda$lKRFRKcyzXQjZQ0MZSj7RGzYWo;
    }
}
