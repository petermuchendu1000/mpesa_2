package com.huawei.digitalpayment.consumer.fixeddata.ui.screen;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class FamilyShareDashboardScreenKt$FamilyShareDashboardScreen$6$invoke$lambda$6$lambda$2$$inlined$items$default$2 implements Function1<Integer, Object> {
    private static int component1 = 1;
    private static int component2;
    final Function1 component3;
    final List copydefault;

    @Override
    public Object invoke(Integer num) {
        int i = 2 % 2;
        int i2 = component2 + 95;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = num.intValue();
        if (i3 == 0) {
            invoke(iIntValue);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objInvoke = invoke(iIntValue);
        int i4 = component1 + 109;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return objInvoke;
    }

    public final Object invoke(int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 101;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Object objInvoke = this.component3.invoke(this.copydefault.get(i));
        int i5 = component2 + 67;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 69 / 0;
        }
        return objInvoke;
    }

    public FamilyShareDashboardScreenKt$FamilyShareDashboardScreen$6$invoke$lambda$6$lambda$2$$inlined$items$default$2(Function1 function1, List list) {
        this.component3 = function1;
        this.copydefault = list;
    }
}
