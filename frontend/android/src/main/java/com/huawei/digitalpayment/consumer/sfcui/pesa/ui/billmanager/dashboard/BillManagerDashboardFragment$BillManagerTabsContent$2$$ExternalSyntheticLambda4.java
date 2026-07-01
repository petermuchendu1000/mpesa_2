package com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.dashboard;

import android.os.Process;
import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.dashboard.BillManagerDashboardFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

public final class BillManagerDashboardFragment$BillManagerTabsContent$2$$ExternalSyntheticLambda4 implements Function0 {
    public static int component1 = 0;
    private static int component2 = 0;
    public static int component3 = 0;
    private static int copydefault = 1;
    public final BillManagerDashboardFragment f$0;

    public BillManagerDashboardFragment$BillManagerTabsContent$2$$ExternalSyntheticLambda4(BillManagerDashboardFragment billManagerDashboardFragment) {
        this.f$0 = billManagerDashboardFragment;
    }

    public static int ShareDataUIState() {
        int i = component1;
        int i2 = i % 5341482;
        component1 = i + 1;
        if (i2 != 0) {
            return component3;
        }
        int iMyPid = Process.myPid();
        component3 = iMyPid;
        return iMyPid;
    }

    @Override
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitComponent1 = BillManagerDashboardFragment.copydefault.component1(this.f$0);
        int i4 = copydefault + 11;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitComponent1;
        }
        throw null;
    }
}
