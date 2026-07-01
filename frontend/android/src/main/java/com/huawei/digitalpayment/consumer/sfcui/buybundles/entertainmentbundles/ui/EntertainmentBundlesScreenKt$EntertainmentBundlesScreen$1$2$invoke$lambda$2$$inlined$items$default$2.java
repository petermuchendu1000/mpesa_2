package com.huawei.digitalpayment.consumer.sfcui.buybundles.entertainmentbundles.ui;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class EntertainmentBundlesScreenKt$EntertainmentBundlesScreen$1$2$invoke$lambda$2$$inlined$items$default$2 implements Function1<Integer, Object> {
    private static int component3 = 0;
    private static int copydefault = 1;
    final Function1 ShareDataUIState;
    final List component2;

    @Override
    public Object invoke(Integer num) {
        int i = 2 % 2;
        int i2 = component3 + 55;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Object objInvoke = invoke(num.intValue());
        int i4 = component3 + 51;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return objInvoke;
    }

    public final Object invoke(int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 47;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Object objInvoke = this.ShareDataUIState.invoke(this.component2.get(i));
        int i5 = component3 + 81;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return objInvoke;
        }
        throw null;
    }

    public EntertainmentBundlesScreenKt$EntertainmentBundlesScreen$1$2$invoke$lambda$2$$inlined$items$default$2(Function1 function1, List list) {
        this.ShareDataUIState = function1;
        this.component2 = list;
    }
}
