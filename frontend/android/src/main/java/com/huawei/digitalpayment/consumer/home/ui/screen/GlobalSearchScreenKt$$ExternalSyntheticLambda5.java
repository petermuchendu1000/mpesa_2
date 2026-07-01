package com.huawei.digitalpayment.consumer.home.ui.screen;

import androidx.compose.runtime.Composer;
import kotlin.OnBackInstancejob1;
import kotlin.getJob;
import kotlin.jvm.functions.Function2;

public final class GlobalSearchScreenKt$$ExternalSyntheticLambda5 implements Function2 {
    private static int component1 = 0;
    private static int component2 = 1;
    public final int f$0;

    public GlobalSearchScreenKt$$ExternalSyntheticLambda5(int i) {
        this.f$0 = i;
    }

    public static void component1() {
        OnBackInstancejob1.ShareDataUIState[0] = getJob.ShareDataUIState[0];
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = component1 + 25;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.f$0;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (i3 != 0) {
            return GlobalSearchScreenKt.$r8$lambda$cT_Yg6LDyphC8nF3teUYVi3JMlg(i4, composer, iIntValue);
        }
        GlobalSearchScreenKt.$r8$lambda$cT_Yg6LDyphC8nF3teUYVi3JMlg(i4, composer, iIntValue);
        throw null;
    }
}
