package com.huawei.digitalpayment.consumer.sfcui.profile.esim.dashboard;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ESimDashboardScreenKt$ESimDashboardScreen$2$invoke$lambda$3$lambda$2$$inlined$items$default$2 implements Function1<Integer, Object> {
    private static int component1 = 0;
    private static int component3 = 1;
    final List component2;
    final Function1 copydefault;

    @Override
    public Object invoke(Integer num) {
        int i = 2 % 2;
        int i2 = component3 + 45;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object objInvoke = invoke(num.intValue());
        int i4 = component3 + 119;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return objInvoke;
    }

    public final Object invoke(int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 63;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Function1 function1 = this.copydefault;
        if (i4 == 0) {
            return function1.invoke(this.component2.get(i));
        }
        Object objInvoke = function1.invoke(this.component2.get(i));
        int i5 = 27 / 0;
        return objInvoke;
    }

    public ESimDashboardScreenKt$ESimDashboardScreen$2$invoke$lambda$3$lambda$2$$inlined$items$default$2(Function1 function1, List list) {
        this.copydefault = function1;
        this.component2 = list;
    }
}
