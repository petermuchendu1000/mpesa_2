package com.huawei.digitalpayment.consumer.sfcui.bonga.statement;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class BongaStatementsScreenKt$BongaStatementsScreen$5$1$2$1$3$invoke$lambda$22$lambda$21$$inlined$items$default$2 implements Function1<Integer, Object> {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    final Function1 component1;
    final List component2;

    @Override
    public Object invoke(Integer num) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Object objInvoke = invoke(num.intValue());
        int i4 = ShareDataUIState + 109;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return objInvoke;
    }

    public final Object invoke(int i) {
        Object objInvoke;
        int i2 = 2 % 2;
        int i3 = copydefault + 49;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            objInvoke = this.component1.invoke(this.component2.get(i));
            int i4 = 91 / 0;
        } else {
            objInvoke = this.component1.invoke(this.component2.get(i));
        }
        int i5 = ShareDataUIState + 79;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return objInvoke;
    }

    public BongaStatementsScreenKt$BongaStatementsScreen$5$1$2$1$3$invoke$lambda$22$lambda$21$$inlined$items$default$2(Function1 function1, List list) {
        this.component1 = function1;
        this.component2 = list;
    }
}
