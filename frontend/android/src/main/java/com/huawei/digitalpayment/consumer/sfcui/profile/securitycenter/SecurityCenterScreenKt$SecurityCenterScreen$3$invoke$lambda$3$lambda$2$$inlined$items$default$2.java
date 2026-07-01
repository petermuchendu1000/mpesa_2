package com.huawei.digitalpayment.consumer.sfcui.profile.securitycenter;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class SecurityCenterScreenKt$SecurityCenterScreen$3$invoke$lambda$3$lambda$2$$inlined$items$default$2 implements Function1<Integer, Object> {
    private static int component1 = 0;
    private static int component3 = 1;
    final List component2;
    final Function1 copydefault;

    @Override
    public Object invoke(Integer num) {
        int i = 2 % 2;
        int i2 = component1 + 109;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = num.intValue();
        if (i3 != 0) {
            return invoke(iIntValue);
        }
        invoke(iIntValue);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Object invoke(int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 69;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Function1 function1 = this.copydefault;
        if (i4 != 0) {
            return function1.invoke(this.component2.get(i));
        }
        function1.invoke(this.component2.get(i));
        throw null;
    }

    public SecurityCenterScreenKt$SecurityCenterScreen$3$invoke$lambda$3$lambda$2$$inlined$items$default$2(Function1 function1, List list) {
        this.copydefault = function1;
        this.component2 = list;
    }
}
