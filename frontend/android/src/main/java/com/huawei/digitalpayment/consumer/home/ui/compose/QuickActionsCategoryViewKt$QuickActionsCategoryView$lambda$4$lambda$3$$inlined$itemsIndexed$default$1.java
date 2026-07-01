package com.huawei.digitalpayment.consumer.home.ui.compose;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class QuickActionsCategoryViewKt$QuickActionsCategoryView$lambda$4$lambda$3$$inlined$itemsIndexed$default$1 implements Function1<Integer, Object> {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    final List component3;
    final Function2 copydefault;

    @Override
    public Object invoke(Integer num) {
        int i = 2 % 2;
        int i2 = component1 + 89;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = num.intValue();
        if (i3 == 0) {
            return invoke(iIntValue);
        }
        invoke(iIntValue);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Object invoke(int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 77;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            this.copydefault.invoke(Integer.valueOf(i), this.component3.get(i));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objInvoke = this.copydefault.invoke(Integer.valueOf(i), this.component3.get(i));
        int i4 = component1 + 7;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
        return objInvoke;
    }

    public QuickActionsCategoryViewKt$QuickActionsCategoryView$lambda$4$lambda$3$$inlined$itemsIndexed$default$1(Function2 function2, List list) {
        this.copydefault = function2;
        this.component3 = list;
    }
}
