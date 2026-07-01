package com.huawei.digitalpayment.consumer.fixeddata.ui.screen;

import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class AccountDetailsScreenKt$ManageNetworkSection$lambda$27$lambda$26$$inlined$items$default$3 implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {
    private static int component1 = 1;
    private static int copydefault;
    final Function2 ShareDataUIState;
    final List component3;

    @Override
    public GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
        int i = 2 % 2;
        int i2 = copydefault + 123;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        GridItemSpan gridItemSpanM1299boximpl = GridItemSpan.m1299boximpl(m10391invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        return gridItemSpanM1299boximpl;
    }

    public final long m10391invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 29;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            ((GridItemSpan) this.ShareDataUIState.invoke(lazyGridItemSpanScope, this.component3.get(i))).getPackedValue();
            throw null;
        }
        long packedValue = ((GridItemSpan) this.ShareDataUIState.invoke(lazyGridItemSpanScope, this.component3.get(i))).getPackedValue();
        int i4 = copydefault + 43;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return packedValue;
    }

    public AccountDetailsScreenKt$ManageNetworkSection$lambda$27$lambda$26$$inlined$items$default$3(Function2 function2, List list) {
        this.ShareDataUIState = function2;
        this.component3 = list;
    }
}
