package com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.ui;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class FamilyConnectPurchasedBundleScreenKt$FamilyConnectPurchasedBundleScreen$3$invoke$lambda$1$$inlined$items$default$2 implements Function1<Integer, Object> {
    private static int component2 = 1;
    private static int component3;
    final List component1;
    final Function1 copydefault;

    @Override
    public Object invoke(Integer num) {
        int i = 2 % 2;
        int i2 = component2 + 23;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Object objInvoke = invoke(num.intValue());
        int i4 = component2 + 89;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return objInvoke;
    }

    public final Object invoke(int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 117;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Object objInvoke = this.copydefault.invoke(this.component1.get(i));
        int i5 = component3 + 59;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return objInvoke;
        }
        throw null;
    }

    public FamilyConnectPurchasedBundleScreenKt$FamilyConnectPurchasedBundleScreen$3$invoke$lambda$1$$inlined$items$default$2(Function1 function1, List list) {
        this.copydefault = function1;
        this.component1 = list;
    }
}
