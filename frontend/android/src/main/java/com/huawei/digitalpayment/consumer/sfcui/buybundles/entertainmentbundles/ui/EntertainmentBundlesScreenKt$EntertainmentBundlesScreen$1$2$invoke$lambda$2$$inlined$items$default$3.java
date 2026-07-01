package com.huawei.digitalpayment.consumer.sfcui.buybundles.entertainmentbundles.ui;

import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class EntertainmentBundlesScreenKt$EntertainmentBundlesScreen$1$2$invoke$lambda$2$$inlined$items$default$3 implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    final List component2;
    final Function2 copydefault;

    @Override
    public GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        GridItemSpan gridItemSpanM1299boximpl = GridItemSpan.m1299boximpl(m11285invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
        int i4 = component3 + 89;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return gridItemSpanM1299boximpl;
    }

    public final long m11285invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 87;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Function2 function2 = this.copydefault;
        if (i4 != 0) {
            return ((GridItemSpan) function2.invoke(lazyGridItemSpanScope, this.component2.get(i))).getPackedValue();
        }
        ((GridItemSpan) function2.invoke(lazyGridItemSpanScope, this.component2.get(i))).getPackedValue();
        throw null;
    }

    public EntertainmentBundlesScreenKt$EntertainmentBundlesScreen$1$2$invoke$lambda$2$$inlined$items$default$3(Function2 function2, List list) {
        this.copydefault = function2;
        this.component2 = list;
    }
}
