package com.huawei.digitalpayment.consumer.home.ui.compose;

import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class QuickActionsCategoryViewKt$QuickActionsCategoryView$lambda$4$lambda$3$$inlined$itemsIndexed$default$2 implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    final List component2;
    final Function3 copydefault;

    @Override
    public GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        long jM10497invoke_orMbw = m10497invoke_orMbw(lazyGridItemSpanScope, num.intValue());
        if (i3 == 0) {
            GridItemSpan.m1299boximpl(jM10497invoke_orMbw);
            throw null;
        }
        GridItemSpan gridItemSpanM1299boximpl = GridItemSpan.m1299boximpl(jM10497invoke_orMbw);
        int i4 = ShareDataUIState + 69;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
        return gridItemSpanM1299boximpl;
    }

    public final long m10497invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 17;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        long packedValue = ((GridItemSpan) this.copydefault.invoke(lazyGridItemSpanScope, Integer.valueOf(i), this.component2.get(i))).getPackedValue();
        int i5 = component3 + 25;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 47 / 0;
        }
        return packedValue;
    }

    public QuickActionsCategoryViewKt$QuickActionsCategoryView$lambda$4$lambda$3$$inlined$itemsIndexed$default$2(Function3 function3, List list) {
        this.copydefault = function3;
        this.component2 = list;
    }
}
