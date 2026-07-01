package com.huawei.digitalpayment.consumer.home.ui.compose;

import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class QuickActionsSectionKt$QuickActionsSection$6$invoke$lambda$9$lambda$8$$inlined$itemsIndexed$default$2 implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {
    private static int ShareDataUIState = 1;
    private static int component3;
    final Function3 component2;
    final List copydefault;

    @Override
    public GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 123;
        component3 = i2 % 128;
        LazyGridItemSpanScope lazyGridItemSpanScope2 = lazyGridItemSpanScope;
        Integer num2 = num;
        if (i2 % 2 == 0) {
            return GridItemSpan.m1299boximpl(m10501invoke_orMbw(lazyGridItemSpanScope2, num2.intValue()));
        }
        GridItemSpan.m1299boximpl(m10501invoke_orMbw(lazyGridItemSpanScope2, num2.intValue()));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long m10501invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 3;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        long packedValue = ((GridItemSpan) this.component2.invoke(lazyGridItemSpanScope, Integer.valueOf(i), this.copydefault.get(i))).getPackedValue();
        int i5 = ShareDataUIState + 63;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return packedValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public QuickActionsSectionKt$QuickActionsSection$6$invoke$lambda$9$lambda$8$$inlined$itemsIndexed$default$2(Function3 function3, List list) {
        this.component2 = function3;
        this.copydefault = list;
    }
}
