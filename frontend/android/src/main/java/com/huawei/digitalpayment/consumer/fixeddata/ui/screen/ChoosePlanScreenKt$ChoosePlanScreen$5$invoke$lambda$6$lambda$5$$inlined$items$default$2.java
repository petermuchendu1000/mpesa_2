package com.huawei.digitalpayment.consumer.fixeddata.ui.screen;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ChoosePlanScreenKt$ChoosePlanScreen$5$invoke$lambda$6$lambda$5$$inlined$items$default$2 implements Function1<Integer, Object> {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    final List component1;
    final Function1 copydefault;

    @Override
    public Object invoke(Integer num) {
        int i = 2 % 2;
        int i2 = component2 + 53;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Object objInvoke = invoke(num.intValue());
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        int i5 = ShareDataUIState + 13;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return objInvoke;
    }

    public final Object invoke(int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 21;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            this.copydefault.invoke(this.component1.get(i));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objInvoke = this.copydefault.invoke(this.component1.get(i));
        int i4 = ShareDataUIState + 113;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return objInvoke;
    }

    public ChoosePlanScreenKt$ChoosePlanScreen$5$invoke$lambda$6$lambda$5$$inlined$items$default$2(Function1 function1, List list) {
        this.copydefault = function1;
        this.component1 = list;
    }
}
