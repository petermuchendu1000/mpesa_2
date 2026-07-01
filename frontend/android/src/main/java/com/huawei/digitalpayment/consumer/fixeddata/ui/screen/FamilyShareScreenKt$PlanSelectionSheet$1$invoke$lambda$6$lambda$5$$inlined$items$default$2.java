package com.huawei.digitalpayment.consumer.fixeddata.ui.screen;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class FamilyShareScreenKt$PlanSelectionSheet$1$invoke$lambda$6$lambda$5$$inlined$items$default$2 implements Function1<Integer, Object> {
    private static int ShareDataUIState = 1;
    private static int component3;
    final Function1 component2;
    final List copydefault;

    @Override
    public Object invoke(Integer num) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Object objInvoke = invoke(num.intValue());
        int i4 = ShareDataUIState + 51;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return objInvoke;
        }
        throw null;
    }

    public final Object invoke(int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 91;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Object objInvoke = this.component2.invoke(this.copydefault.get(i));
        int i5 = component3 + 99;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return objInvoke;
        }
        throw null;
    }

    public FamilyShareScreenKt$PlanSelectionSheet$1$invoke$lambda$6$lambda$5$$inlined$items$default$2(Function1 function1, List list) {
        this.component2 = function1;
        this.copydefault = list;
    }
}
