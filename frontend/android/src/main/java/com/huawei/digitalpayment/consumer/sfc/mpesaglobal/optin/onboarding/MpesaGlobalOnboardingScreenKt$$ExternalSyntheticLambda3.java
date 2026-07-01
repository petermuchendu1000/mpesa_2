package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.optin.onboarding;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.accessensureViewModelStore;
import kotlin.accessgetReportFullyDrawnExecutorp;
import kotlin.jvm.functions.Function2;

public final class MpesaGlobalOnboardingScreenKt$$ExternalSyntheticLambda3 implements Function2 {
    private static int component3 = 1;
    private static int copydefault;
    public final int f$0;

    public MpesaGlobalOnboardingScreenKt$$ExternalSyntheticLambda3(int i) {
        this.f$0 = i;
    }

    public static void copydefault() {
        accessgetReportFullyDrawnExecutorp.component2[0] = accessensureViewModelStore.copydefault[0];
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = copydefault + 25;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Unit unit$r8$lambda$lLoyNst07ZlPdDTdbvS5TbjL5ds = MpesaGlobalOnboardingScreenKt.$r8$lambda$lLoyNst07ZlPdDTdbvS5TbjL5ds(this.f$0, (Composer) obj, ((Integer) obj2).intValue());
        int i4 = component3 + 49;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return unit$r8$lambda$lLoyNst07ZlPdDTdbvS5TbjL5ds;
    }
}
