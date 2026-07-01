package com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.newspaper;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class MyNewspapersScreenKt$MyNewsPapersScreen$lambda$3$lambda$2$$inlined$items$default$2 implements Function1<Integer, Object> {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    final Function1 component1;
    final List copydefault;

    @Override
    public Object invoke(Integer num) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Object objInvoke = invoke(num.intValue());
        int i4 = ShareDataUIState + 111;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return objInvoke;
    }

    public final Object invoke(int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 105;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Object objInvoke = this.component1.invoke(this.copydefault.get(i));
        int i5 = ShareDataUIState + 95;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return objInvoke;
    }

    public MyNewspapersScreenKt$MyNewsPapersScreen$lambda$3$lambda$2$$inlined$items$default$2(Function1 function1, List list) {
        this.component1 = function1;
        this.copydefault = list;
    }
}
