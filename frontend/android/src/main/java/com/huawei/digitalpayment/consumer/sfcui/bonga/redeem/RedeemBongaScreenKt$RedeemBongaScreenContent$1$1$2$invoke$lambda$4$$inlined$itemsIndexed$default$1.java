package com.huawei.digitalpayment.consumer.sfcui.bonga.redeem;

import java.util.List;
import kotlin.FullyDrawnReporterKtreportWhenComplete1;
import kotlin.ImmLeaksCleaner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class RedeemBongaScreenKt$RedeemBongaScreenContent$1$1$2$invoke$lambda$4$$inlined$itemsIndexed$default$1 implements Function1<Integer, Object> {
    private static int ShareDataUIState = 1;
    private static int component2;
    final List component1;
    final Function2 component3;

    @Override
    public Object invoke(Integer num) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Object objInvoke = invoke(num.intValue());
        if (i3 != 0) {
            int i4 = 0 / 0;
        }
        return objInvoke;
    }

    public final Object invoke(int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 15;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Object objInvoke = this.component3.invoke(Integer.valueOf(i), this.component1.get(i));
        int i5 = ShareDataUIState + 123;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 5 / 0;
        }
        return objInvoke;
    }

    public RedeemBongaScreenKt$RedeemBongaScreenContent$1$1$2$invoke$lambda$4$$inlined$itemsIndexed$default$1(Function2 function2, List list) {
        this.component3 = function2;
        this.component1 = list;
    }

    public static void ShareDataUIState() {
        ImmLeaksCleaner.component2[0] = FullyDrawnReporterKtreportWhenComplete1.ShareDataUIState[0];
    }
}
