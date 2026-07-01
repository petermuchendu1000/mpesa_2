package com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.share;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import defpackage.ShareDataUIState;
import kotlin.ComponentActivityNonConfigurationInstances;
import kotlin.Unit;
import kotlin.getOnBackInvokedDispatcher;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class ShareDataScreenKt$$ExternalSyntheticLambda2 implements Function2 {
    private static int component1 = 1;
    private static int component2;
    public final ShareDataUIState f$0;
    public final Function1 f$1;
    public final Function0 f$2;
    public final boolean f$3;
    public final Modifier f$4;
    public final int f$5;
    public final int f$6;

    public ShareDataScreenKt$$ExternalSyntheticLambda2(ShareDataUIState shareDataUIState, Function1 function1, Function0 function0, boolean z, Modifier modifier, int i, int i2) {
        this.f$0 = shareDataUIState;
        this.f$1 = function1;
        this.f$2 = function0;
        this.f$3 = z;
        this.f$4 = modifier;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public static void component2() {
        ComponentActivityNonConfigurationInstances.copydefault[0] = getOnBackInvokedDispatcher.copydefault[0];
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = component1 + 25;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Unit unit$r8$lambda$toFW0CHd6OqDda5pquHeHaPXthY = ShareDataScreenKt.$r8$lambda$toFW0CHd6OqDda5pquHeHaPXthY(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (Composer) obj, ((Integer) obj2).intValue());
        int i4 = component2 + 29;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit$r8$lambda$toFW0CHd6OqDda5pquHeHaPXthY;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
