package com.huawei.digitalpayment.consumer.home.ui.compose;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class QuickActionsSectionKt$QuickActionsSection$6$invoke$lambda$9$lambda$8$$inlined$itemsIndexed$default$1 implements Function1<Integer, Object> {
    private static int ShareDataUIState = 1;
    private static int component2;
    final Function2 component3;
    final List copydefault;

    @Override
    public Object invoke(Integer num) {
        int i = 2 % 2;
        int i2 = component2 + 51;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Object objInvoke = invoke(num.intValue());
        int i4 = ShareDataUIState + 123;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
        return objInvoke;
    }

    public final Object invoke(int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 65;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            this.component3.invoke(Integer.valueOf(i), this.copydefault.get(i));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objInvoke = this.component3.invoke(Integer.valueOf(i), this.copydefault.get(i));
        int i4 = component2 + 13;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 8 / 0;
        }
        return objInvoke;
    }

    public QuickActionsSectionKt$QuickActionsSection$6$invoke$lambda$9$lambda$8$$inlined$itemsIndexed$default$1(Function2 function2, List list) {
        this.component3 = function2;
        this.copydefault = list;
    }
}
