package com.huawei.digitalpayment.consumer.sfcui.ui.miniapp;

import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class MiniAppsGridViewKt$MiniAppsGridView$lambda$6$lambda$5$$inlined$itemsIndexed$default$2 implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    final List component1;
    final Function3 component2;

    @Override
    public GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        copydefault = i2 % 128;
        Object obj = null;
        LazyGridItemSpanScope lazyGridItemSpanScope2 = lazyGridItemSpanScope;
        Integer num2 = num;
        if (i2 % 2 == 0) {
            GridItemSpan.m1299boximpl(m12074invoke_orMbw(lazyGridItemSpanScope2, num2.intValue()));
            obj.hashCode();
            throw null;
        }
        GridItemSpan gridItemSpanM1299boximpl = GridItemSpan.m1299boximpl(m12074invoke_orMbw(lazyGridItemSpanScope2, num2.intValue()));
        int i3 = ShareDataUIState + 89;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return gridItemSpanM1299boximpl;
        }
        obj.hashCode();
        throw null;
    }

    public final long m12074invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 3;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Function3 function3 = this.component2;
        if (i4 != 0) {
            return ((GridItemSpan) function3.invoke(lazyGridItemSpanScope, Integer.valueOf(i), this.component1.get(i))).getPackedValue();
        }
        ((GridItemSpan) function3.invoke(lazyGridItemSpanScope, Integer.valueOf(i), this.component1.get(i))).getPackedValue();
        throw null;
    }

    public MiniAppsGridViewKt$MiniAppsGridView$lambda$6$lambda$5$$inlined$itemsIndexed$default$2(Function3 function3, List list) {
        this.component2 = function3;
        this.component1 = list;
    }
}
