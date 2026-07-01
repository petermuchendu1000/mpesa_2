package com.huawei.digitalpayment.consumer.sfcui.bonga.statement;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class BongaStatementsScreenKt$BongaStatementsScreen$5$1$2$1$3$invoke$lambda$22$lambda$17$$inlined$items$default$2 implements Function1<Integer, Object> {
    private static int component1 = 1;
    private static int component3;
    final Function1 ShareDataUIState;
    final List copydefault;

    @Override
    public Object invoke(Integer num) {
        int i = 2 % 2;
        int i2 = component3 + 97;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object objInvoke = invoke(num.intValue());
        if (i3 == 0) {
            int i4 = 72 / 0;
        }
        int i5 = component1 + 111;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return objInvoke;
    }

    public final Object invoke(int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 33;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Object objInvoke = this.ShareDataUIState.invoke(this.copydefault.get(i));
        int i5 = component3 + 5;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 45 / 0;
        }
        return objInvoke;
    }

    public BongaStatementsScreenKt$BongaStatementsScreen$5$1$2$1$3$invoke$lambda$22$lambda$17$$inlined$items$default$2(Function1 function1, List list) {
        this.ShareDataUIState = function1;
        this.copydefault = list;
    }
}
