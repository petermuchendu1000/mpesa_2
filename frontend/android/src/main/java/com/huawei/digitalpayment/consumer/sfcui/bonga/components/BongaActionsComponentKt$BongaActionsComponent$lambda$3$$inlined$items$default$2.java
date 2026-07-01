package com.huawei.digitalpayment.consumer.sfcui.bonga.components;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class BongaActionsComponentKt$BongaActionsComponent$lambda$3$$inlined$items$default$2 implements Function1<Integer, Object> {
    private static int component1 = 1;
    private static int component2;
    final Function1 ShareDataUIState;
    final List component3;

    @Override
    public Object invoke(Integer num) {
        int i = 2 % 2;
        int i2 = component2 + 83;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int iIntValue = num.intValue();
        if (i3 == 0) {
            invoke(iIntValue);
            throw null;
        }
        Object objInvoke = invoke(iIntValue);
        int i4 = component1 + 65;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return objInvoke;
        }
        obj.hashCode();
        throw null;
    }

    public final Object invoke(int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 107;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Object objInvoke = this.ShareDataUIState.invoke(this.component3.get(i));
        int i5 = component2 + 9;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return objInvoke;
    }

    public BongaActionsComponentKt$BongaActionsComponent$lambda$3$$inlined$items$default$2(Function1 function1, List list) {
        this.ShareDataUIState = function1;
        this.component3 = list;
    }
}
