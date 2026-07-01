package com.huawei.digitalpayment.consumer.sfcui.buybundles.entertainmentbundles;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class EntertainmentBundlesDetailScreenKt$EntertainmentBundlesDetailScreen$1$invoke$lambda$3$$inlined$items$default$2 implements Function1<Integer, Object> {
    private static int component1 = 0;
    private static int component3 = 1;
    final List ShareDataUIState;
    final Function1 component2;

    @Override
    public Object invoke(Integer num) {
        int i = 2 % 2;
        int i2 = component1 + 73;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = num.intValue();
        if (i3 == 0) {
            invoke(iIntValue);
            throw null;
        }
        Object objInvoke = invoke(iIntValue);
        int i4 = component3 + 51;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return objInvoke;
        }
        throw null;
    }

    public final Object invoke(int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 91;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Function1 function1 = this.component2;
        if (i4 != 0) {
            return function1.invoke(this.ShareDataUIState.get(i));
        }
        Object objInvoke = function1.invoke(this.ShareDataUIState.get(i));
        int i5 = 99 / 0;
        return objInvoke;
    }

    public EntertainmentBundlesDetailScreenKt$EntertainmentBundlesDetailScreen$1$invoke$lambda$3$$inlined$items$default$2(Function1 function1, List list) {
        this.component2 = function1;
        this.ShareDataUIState = list;
    }
}
