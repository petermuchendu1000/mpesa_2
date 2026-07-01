package com.huawei.digitalpayment.consumer.fixeddata.ui.screen;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ChoosePlanScreenKt$WirelessChoosePlanContent$lambda$25$$inlined$items$default$2 implements Function1<Integer, Object> {
    private static int component2 = 0;
    private static int copydefault = 1;
    final Function1 ShareDataUIState;
    final List component3;

    @Override
    public Object invoke(Integer num) {
        int i = 2 % 2;
        int i2 = component2 + 103;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Object objInvoke = invoke(num.intValue());
        int i4 = copydefault + 75;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return objInvoke;
    }

    public final Object invoke(int i) {
        Object objInvoke;
        int i2 = 2 % 2;
        int i3 = component2 + 113;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            objInvoke = this.ShareDataUIState.invoke(this.component3.get(i));
            int i4 = 24 / 0;
        } else {
            objInvoke = this.ShareDataUIState.invoke(this.component3.get(i));
        }
        int i5 = component2 + 125;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return objInvoke;
        }
        throw null;
    }

    public ChoosePlanScreenKt$WirelessChoosePlanContent$lambda$25$$inlined$items$default$2(Function1 function1, List list) {
        this.ShareDataUIState = function1;
        this.component3 = list;
    }
}
