package com.huawei.digitalpayment.consumer.sfcui.bonga.redeem;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class RedeemBongaScreenKt$RedeemBongaScreenContent$1$2$2$invoke$lambda$4$$inlined$itemsIndexed$default$1 implements Function1<Integer, Object> {
    private static int component1 = 1;
    private static int component2;
    final Function2 ShareDataUIState;
    final List component3;

    @Override
    public Object invoke(Integer num) {
        int i = 2 % 2;
        int i2 = component2 + 77;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = num.intValue();
        if (i3 != 0) {
            return invoke(iIntValue);
        }
        invoke(iIntValue);
        throw null;
    }

    public final Object invoke(int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 77;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Object objInvoke = this.ShareDataUIState.invoke(Integer.valueOf(i), this.component3.get(i));
        int i5 = component2 + 81;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return objInvoke;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RedeemBongaScreenKt$RedeemBongaScreenContent$1$2$2$invoke$lambda$4$$inlined$itemsIndexed$default$1(Function2 function2, List list) {
        this.ShareDataUIState = function2;
        this.component3 = list;
    }
}
