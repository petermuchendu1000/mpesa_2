package com.huawei.digitalpayment.consumer.fixeddata.ui.components.manageaccount;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ChangeWifiNameCardKt$ChangeWifiNameCard$lambda$4$lambda$3$$inlined$items$default$2 implements Function1<Integer, Object> {
    private static int component3 = 1;
    private static int copydefault;
    final List component1;
    final Function1 component2;

    @Override
    public Object invoke(Integer num) {
        int i = 2 % 2;
        int i2 = component3 + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Object objInvoke = invoke(num.intValue());
        int i4 = component3 + 31;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 83 / 0;
        }
        return objInvoke;
    }

    public final Object invoke(int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 79;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Object objInvoke = this.component2.invoke(this.component1.get(i));
        int i5 = copydefault + 71;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return objInvoke;
    }

    public ChangeWifiNameCardKt$ChangeWifiNameCard$lambda$4$lambda$3$$inlined$items$default$2(Function1 function1, List list) {
        this.component2 = function1;
        this.component1 = list;
    }
}
