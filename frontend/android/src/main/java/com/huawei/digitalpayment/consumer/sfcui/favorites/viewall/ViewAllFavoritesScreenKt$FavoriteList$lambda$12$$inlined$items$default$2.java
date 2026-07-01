package com.huawei.digitalpayment.consumer.sfcui.favorites.viewall;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ViewAllFavoritesScreenKt$FavoriteList$lambda$12$$inlined$items$default$2 implements Function1<Integer, Object> {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    final Function1 component2;
    final List copydefault;

    @Override
    public Object invoke(Integer num) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Object objInvoke = invoke(num.intValue());
        int i4 = ShareDataUIState + 65;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return objInvoke;
    }

    public final Object invoke(int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 27;
        ShareDataUIState = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.component2.invoke(this.copydefault.get(i));
            throw null;
        }
        Object objInvoke = this.component2.invoke(this.copydefault.get(i));
        int i4 = component3 + 101;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return objInvoke;
        }
        obj.hashCode();
        throw null;
    }

    public ViewAllFavoritesScreenKt$FavoriteList$lambda$12$$inlined$items$default$2(Function1 function1, List list) {
        this.component2 = function1;
        this.copydefault = list;
    }
}
