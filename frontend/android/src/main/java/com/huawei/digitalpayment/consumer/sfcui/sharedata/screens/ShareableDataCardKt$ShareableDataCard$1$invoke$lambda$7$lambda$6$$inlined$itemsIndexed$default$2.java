package com.huawei.digitalpayment.consumer.sfcui.sharedata.screens;

import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ShareableDataCardKt$ShareableDataCard$1$invoke$lambda$7$lambda$6$$inlined$itemsIndexed$default$2 implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {
    private static int component1 = 0;
    private static int component3 = 1;
    final Function3 ShareDataUIState;
    final List copydefault;

    @Override
    public GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
        int i = 2 % 2;
        int i2 = component1 + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        GridItemSpan gridItemSpanM1299boximpl = GridItemSpan.m1299boximpl(m11944invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
        int i4 = component1 + 27;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return gridItemSpanM1299boximpl;
        }
        throw null;
    }

    public final long m11944invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 53;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            ((GridItemSpan) this.ShareDataUIState.invoke(lazyGridItemSpanScope, Integer.valueOf(i), this.copydefault.get(i))).getPackedValue();
            throw null;
        }
        long packedValue = ((GridItemSpan) this.ShareDataUIState.invoke(lazyGridItemSpanScope, Integer.valueOf(i), this.copydefault.get(i))).getPackedValue();
        int i4 = component1 + 91;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return packedValue;
        }
        throw null;
    }

    public ShareableDataCardKt$ShareableDataCard$1$invoke$lambda$7$lambda$6$$inlined$itemsIndexed$default$2(Function3 function3, List list) {
        this.ShareDataUIState = function3;
        this.copydefault = list;
    }
}
