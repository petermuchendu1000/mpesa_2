package com.huawei.digitalpayment.consumer.sfcui.sharedata.screens;

import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ShareableDataCardKt$ShareableDataCard$1$invoke$lambda$7$lambda$6$$inlined$itemsIndexed$default$6 implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {
    private static int component1 = 0;
    private static int copydefault = 1;
    final List ShareDataUIState;
    final Function3 component3;

    @Override
    public GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
        int i = 2 % 2;
        int i2 = component1 + 43;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        long jM11945invoke_orMbw = m11945invoke_orMbw(lazyGridItemSpanScope, num.intValue());
        if (i3 != 0) {
            return GridItemSpan.m1299boximpl(jM11945invoke_orMbw);
        }
        GridItemSpan.m1299boximpl(jM11945invoke_orMbw);
        throw null;
    }

    public final long m11945invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 105;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Function3 function3 = this.component3;
        if (i4 != 0) {
            return ((GridItemSpan) function3.invoke(lazyGridItemSpanScope, Integer.valueOf(i), this.ShareDataUIState.get(i))).getPackedValue();
        }
        long packedValue = ((GridItemSpan) function3.invoke(lazyGridItemSpanScope, Integer.valueOf(i), this.ShareDataUIState.get(i))).getPackedValue();
        int i5 = 6 / 0;
        return packedValue;
    }

    public ShareableDataCardKt$ShareableDataCard$1$invoke$lambda$7$lambda$6$$inlined$itemsIndexed$default$6(Function3 function3, List list) {
        this.component3 = function3;
        this.ShareDataUIState = list;
    }
}
