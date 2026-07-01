package com.huawei.digitalpayment.consumer.fixeddata.ui.components.manageaccount;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ChangeWifiPasswordCardKt$ChangeWifiPasswordCard$lambda$10$lambda$9$$inlined$items$default$2 implements Function1<Integer, Object> {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    final Function1 component1;
    final List copydefault;

    @Override
    public Object invoke(Integer num) {
        int i = 2 % 2;
        int i2 = component2 + 123;
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
        int i3 = ShareDataUIState + 9;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            this.component1.invoke(this.copydefault.get(i));
            throw null;
        }
        Object objInvoke = this.component1.invoke(this.copydefault.get(i));
        int i4 = component2 + 71;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
        return objInvoke;
    }

    public ChangeWifiPasswordCardKt$ChangeWifiPasswordCard$lambda$10$lambda$9$$inlined$items$default$2(Function1 function1, List list) {
        this.component1 = function1;
        this.copydefault = list;
    }
}
