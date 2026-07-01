package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard;

import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class MpesaGlobalDashboardScreenKt$GlobalTransactionActionsContent$lambda$7$$inlined$items$default$3 implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {
    private static int ShareDataUIState = 1;
    private static int component1;
    final Function2 component2;
    final List copydefault;

    @Override
    public GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
        GridItemSpan gridItemSpanM1299boximpl;
        int i = 2 % 2;
        int i2 = component1 + 65;
        ShareDataUIState = i2 % 128;
        LazyGridItemSpanScope lazyGridItemSpanScope2 = lazyGridItemSpanScope;
        Integer num2 = num;
        if (i2 % 2 == 0) {
            gridItemSpanM1299boximpl = GridItemSpan.m1299boximpl(m11010invoke_orMbw(lazyGridItemSpanScope2, num2.intValue()));
            int i3 = 61 / 0;
        } else {
            gridItemSpanM1299boximpl = GridItemSpan.m1299boximpl(m11010invoke_orMbw(lazyGridItemSpanScope2, num2.intValue()));
        }
        int i4 = ShareDataUIState + 57;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return gridItemSpanM1299boximpl;
    }

    public final long m11010invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 29;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Function2 function2 = this.component2;
        if (i4 != 0) {
            return ((GridItemSpan) function2.invoke(lazyGridItemSpanScope, this.copydefault.get(i))).getPackedValue();
        }
        long packedValue = ((GridItemSpan) function2.invoke(lazyGridItemSpanScope, this.copydefault.get(i))).getPackedValue();
        int i5 = 0 / 0;
        return packedValue;
    }

    public MpesaGlobalDashboardScreenKt$GlobalTransactionActionsContent$lambda$7$$inlined$items$default$3(Function2 function2, List list) {
        this.component2 = function2;
        this.copydefault = list;
    }
}
