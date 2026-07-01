package com.huawei.digitalpayment.consumer.sfcui.sharedata.screens;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ShareableDataCardKt$ShareableDataCard$1$invoke$lambda$7$lambda$6$$inlined$itemsIndexed$default$1 implements Function1<Integer, Object> {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    final Function2 component1;
    final List component2;

    @Override
    public Object invoke(Integer num) {
        int i = 2 % 2;
        int i2 = component3 + 17;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = num.intValue();
        if (i3 != 0) {
            invoke(iIntValue);
            throw null;
        }
        Object objInvoke = invoke(iIntValue);
        int i4 = ShareDataUIState + 51;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
        return objInvoke;
    }

    public final Object invoke(int i) {
        Object objInvoke;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 103;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            objInvoke = this.component1.invoke(Integer.valueOf(i), this.component2.get(i));
            int i4 = 8 / 0;
        } else {
            objInvoke = this.component1.invoke(Integer.valueOf(i), this.component2.get(i));
        }
        int i5 = ShareDataUIState + 31;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return objInvoke;
    }

    public ShareableDataCardKt$ShareableDataCard$1$invoke$lambda$7$lambda$6$$inlined$itemsIndexed$default$1(Function2 function2, List list) {
        this.component1 = function2;
        this.component2 = list;
    }
}
