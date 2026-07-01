package com.huawei.digitalpayment.consumer.fixeddata.ui.screen;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ChoosePlanScreenKt$ChoosePlanScreen$5$invoke$lambda$6$lambda$3$$inlined$items$default$2 implements Function1<Integer, Object> {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    final List component2;
    final Function1 component3;

    @Override
    public Object invoke(Integer num) {
        int i = 2 % 2;
        int i2 = component1 + 3;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = num.intValue();
        if (i3 == 0) {
            return invoke(iIntValue);
        }
        invoke(iIntValue);
        throw null;
    }

    public final Object invoke(int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 83;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Object objInvoke = this.component3.invoke(this.component2.get(i));
        int i5 = component1 + 71;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return objInvoke;
    }

    public ChoosePlanScreenKt$ChoosePlanScreen$5$invoke$lambda$6$lambda$3$$inlined$items$default$2(Function1 function1, List list) {
        this.component3 = function1;
        this.component2 = list;
    }
}
