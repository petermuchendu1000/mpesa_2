package com.safaricom.designsystem.components.radio;

import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class RadioButtonGroupKt$RadioButtonGroup_RFMEUTM$lambda$2$$inlined$items$default$3 implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {
    final Function2 ShareDataUIState;
    final List component1;

    @Override
    public GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
        return GridItemSpan.m1299boximpl(m12629invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
    }

    public final long m12629invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
        return ((GridItemSpan) this.ShareDataUIState.invoke(lazyGridItemSpanScope, this.component1.get(i))).getPackedValue();
    }

    public RadioButtonGroupKt$RadioButtonGroup_RFMEUTM$lambda$2$$inlined$items$default$3(Function2 function2, List list) {
        this.ShareDataUIState = function2;
        this.component1 = list;
    }
}
