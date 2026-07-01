package com.huawei.digitalpayment.consumer.sfcui.bonga;

import androidx.compose.runtime.MutableState;
import com.huawei.digitalpayment.consumer.sfcui.bonga.viewmodel.BongaViewModel;
import kotlin.Unit;
import kotlin._init_lambda4;
import kotlin.accessaddObserverForBackInvoker;
import kotlin.jvm.functions.Function0;

public final class BongaDashboardRouteKt$$ExternalSyntheticLambda3 implements Function0 {
    private static int component1 = 1;
    private static int component2;
    public final BongaViewModel f$0;
    public final MutableState f$1;
    public final MutableState f$2;

    public BongaDashboardRouteKt$$ExternalSyntheticLambda3(BongaViewModel bongaViewModel, MutableState mutableState, MutableState mutableState2) {
        this.f$0 = bongaViewModel;
        this.f$1 = mutableState;
        this.f$2 = mutableState2;
    }

    public static void copydefault() {
        _init_lambda4.component1[0] = accessaddObserverForBackInvoker.ShareDataUIState[0];
    }

    @Override
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = component1 + 3;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitM11108$r8$lambda$khbgUHm4akFf65CS_8th_nHItU = BongaDashboardRouteKt.m11108$r8$lambda$khbgUHm4akFf65CS_8th_nHItU(this.f$0, this.f$1, this.f$2);
        int i4 = component2 + 47;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return unitM11108$r8$lambda$khbgUHm4akFf65CS_8th_nHItU;
    }
}
