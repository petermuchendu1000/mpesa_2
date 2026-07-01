package com.huawei.digitalpayment.consumer.home.ui.screen;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class GlobalSearchScreenKt$SearchCategoryRow$lambda$3$$inlined$items$default$2 implements Function1<Integer, Object> {
    private static int component3 = 1;
    private static int copydefault;
    final Function1 component1;
    final List component2;

    @Override
    public Object invoke(Integer num) {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Object objInvoke = invoke(num.intValue());
        int i4 = copydefault + 23;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return objInvoke;
    }

    public final Object invoke(int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 17;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Object objInvoke = this.component1.invoke(this.component2.get(i));
        int i5 = copydefault + 47;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return objInvoke;
    }

    public GlobalSearchScreenKt$SearchCategoryRow$lambda$3$$inlined$items$default$2(Function1 function1, List list) {
        this.component1 = function1;
        this.component2 = list;
    }
}
