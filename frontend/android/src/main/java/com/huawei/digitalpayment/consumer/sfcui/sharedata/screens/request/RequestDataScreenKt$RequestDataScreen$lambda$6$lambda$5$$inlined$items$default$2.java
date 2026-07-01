package com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class RequestDataScreenKt$RequestDataScreen$lambda$6$lambda$5$$inlined$items$default$2 implements Function1<Integer, Object> {
    private static int component2 = 1;
    private static int component3;
    final Function1 component1;
    final List copydefault;

    @Override
    public Object invoke(Integer num) {
        int i = 2 % 2;
        int i2 = component3 + 77;
        component2 = i2 % 128;
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
        int i3 = component3 + 13;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Object objInvoke = this.component1.invoke(this.copydefault.get(i));
        int i5 = component3 + 67;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 43 / 0;
        }
        return objInvoke;
    }

    public RequestDataScreenKt$RequestDataScreen$lambda$6$lambda$5$$inlined$items$default$2(Function1 function1, List list) {
        this.component1 = function1;
        this.copydefault = list;
    }
}
