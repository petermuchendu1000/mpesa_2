package com.huawei.digitalpayment.consumer.fixeddata.ui.screen;

import androidx.compose.foundation.lazy.grid.LazyGridScope;
import java.util.List;
import kotlin.ActivityViewModelLazyKtviewModels1;
import kotlin.ActivityViewModelLazyKtviewModels3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public final class AccountDetailsScreenKt$$ExternalSyntheticLambda6 implements Function1 {
    private static int component1 = 1;
    private static int component2;
    public final List f$0;
    public final boolean f$1;
    public final Function1 f$2;

    public AccountDetailsScreenKt$$ExternalSyntheticLambda6(List list, boolean z, Function1 function1) {
        this.f$0 = list;
        this.f$1 = z;
        this.f$2 = function1;
    }

    public static void component1() {
        ActivityViewModelLazyKtviewModels3.component2[0] = ActivityViewModelLazyKtviewModels1.copydefault[0];
    }

    @Override
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 55;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unit$r8$lambda$o6DW4ap3MEYmtYv36yeLhNdoCKY = AccountDetailsScreenKt.$r8$lambda$o6DW4ap3MEYmtYv36yeLhNdoCKY(this.f$0, this.f$1, this.f$2, (LazyGridScope) obj);
        int i4 = component1 + 65;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return unit$r8$lambda$o6DW4ap3MEYmtYv36yeLhNdoCKY;
    }
}
