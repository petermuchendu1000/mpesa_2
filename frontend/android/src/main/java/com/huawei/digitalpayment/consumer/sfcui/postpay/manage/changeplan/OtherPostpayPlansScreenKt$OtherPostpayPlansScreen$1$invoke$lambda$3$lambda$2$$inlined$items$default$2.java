package com.huawei.digitalpayment.consumer.sfcui.postpay.manage.changeplan;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class OtherPostpayPlansScreenKt$OtherPostpayPlansScreen$1$invoke$lambda$3$lambda$2$$inlined$items$default$2 implements Function1<Integer, Object> {
    private static int component1 = 1;
    private static int component3;
    final List ShareDataUIState;
    final Function1 component2;

    @Override
    public Object invoke(Integer num) {
        int i = 2 % 2;
        int i2 = component1 + 73;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Object objInvoke = invoke(num.intValue());
        int i4 = component1 + 87;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
        return objInvoke;
    }

    public final Object invoke(int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 107;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Object objInvoke = this.component2.invoke(this.ShareDataUIState.get(i));
        int i5 = component3 + 3;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return objInvoke;
    }

    public OtherPostpayPlansScreenKt$OtherPostpayPlansScreen$1$invoke$lambda$3$lambda$2$$inlined$items$default$2(Function1 function1, List list) {
        this.component2 = function1;
        this.ShareDataUIState = list;
    }
}
