package com.huawei.digitalpayment.consumer.sfcui.sharedata.screens;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ShareableDataCardKt$ShareableDataCard$1$invoke$lambda$7$lambda$6$$inlined$itemsIndexed$default$5 implements Function1<Integer, Object> {
    private static int component1 = 1;
    private static int component2;
    final List ShareDataUIState;
    final Function2 copydefault;

    @Override
    public Object invoke(Integer num) {
        int i = 2 % 2;
        int i2 = component1 + 109;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = num.intValue();
        if (i3 != 0) {
            invoke(iIntValue);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objInvoke = invoke(iIntValue);
        int i4 = component2 + 45;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return objInvoke;
    }

    public final Object invoke(int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 9;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Function2 function2 = this.copydefault;
        if (i4 == 0) {
            return function2.invoke(Integer.valueOf(i), this.ShareDataUIState.get(i));
        }
        function2.invoke(Integer.valueOf(i), this.ShareDataUIState.get(i));
        throw null;
    }

    public ShareableDataCardKt$ShareableDataCard$1$invoke$lambda$7$lambda$6$$inlined$itemsIndexed$default$5(Function2 function2, List list) {
        this.copydefault = function2;
        this.ShareDataUIState = list;
    }
}
