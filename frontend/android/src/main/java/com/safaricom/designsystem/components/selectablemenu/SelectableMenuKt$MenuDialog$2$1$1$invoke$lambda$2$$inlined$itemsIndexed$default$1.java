package com.safaricom.designsystem.components.selectablemenu;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class SelectableMenuKt$MenuDialog$2$1$1$invoke$lambda$2$$inlined$itemsIndexed$default$1 implements Function1<Integer, Object> {
    final Function2 ShareDataUIState;
    final List copydefault;

    @Override
    public Object invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final Object invoke(int i) {
        return this.ShareDataUIState.invoke(Integer.valueOf(i), this.copydefault.get(i));
    }

    public SelectableMenuKt$MenuDialog$2$1$1$invoke$lambda$2$$inlined$itemsIndexed$default$1(Function2 function2, List list) {
        this.ShareDataUIState = function2;
        this.copydefault = list;
    }
}
