package com.safaricom.designsystem.components.radio;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class RadioButtonGroupKt$RadioButtonGroup_RFMEUTM$lambda$2$$inlined$items$default$2 implements Function1<Integer, Object> {
    final List ShareDataUIState;
    final Function1 copydefault;

    @Override
    public Object invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final Object invoke(int i) {
        return this.copydefault.invoke(this.ShareDataUIState.get(i));
    }

    public RadioButtonGroupKt$RadioButtonGroup_RFMEUTM$lambda$2$$inlined$items$default$2(Function1 function1, List list) {
        this.copydefault = function1;
        this.ShareDataUIState = list;
    }
}
