package com.safaricom.sharedui.compose.contact;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ContactPickerScreenKt$ContactPickerScreen$2$invoke$lambda$6$lambda$4$lambda$3$lambda$2$$inlined$items$default$2 implements Function1<Integer, Object> {
    final Function1 ShareDataUIState;
    final List component3;

    @Override
    public Object invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final Object invoke(int i) {
        return this.ShareDataUIState.invoke(this.component3.get(i));
    }

    public ContactPickerScreenKt$ContactPickerScreen$2$invoke$lambda$6$lambda$4$lambda$3$lambda$2$$inlined$items$default$2(Function1 function1, List list) {
        this.ShareDataUIState = function1;
        this.component3 = list;
    }
}
