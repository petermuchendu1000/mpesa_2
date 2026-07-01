package com.huawei.digitalpayment.consumer.notification.ui.compose;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class NotificationListViewKt$NotificationListView$lambda$2$$inlined$items$default$2 implements Function1<Integer, Object> {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    final List component1;
    final Function1 component3;

    @Override
    public Object invoke(Integer num) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = num.intValue();
        if (i3 == 0) {
            return invoke(iIntValue);
        }
        int i4 = 58 / 0;
        return invoke(iIntValue);
    }

    public final Object invoke(int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 111;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Object objInvoke = this.component3.invoke(this.component1.get(i));
        int i5 = copydefault + 11;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 50 / 0;
        }
        return objInvoke;
    }

    public NotificationListViewKt$NotificationListView$lambda$2$$inlined$items$default$2(Function1 function1, List list) {
        this.component3 = function1;
        this.component1 = list;
    }
}
