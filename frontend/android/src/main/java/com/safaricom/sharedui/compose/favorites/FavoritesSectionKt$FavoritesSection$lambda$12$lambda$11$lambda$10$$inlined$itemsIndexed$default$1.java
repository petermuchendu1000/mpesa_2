package com.safaricom.sharedui.compose.favorites;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class FavoritesSectionKt$FavoritesSection$lambda$12$lambda$11$lambda$10$$inlined$itemsIndexed$default$1 implements Function1<Integer, Object> {
    final Function2 ShareDataUIState;
    final List component2;

    @Override
    public Object invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final Object invoke(int i) {
        return this.ShareDataUIState.invoke(Integer.valueOf(i), this.component2.get(i));
    }

    public FavoritesSectionKt$FavoritesSection$lambda$12$lambda$11$lambda$10$$inlined$itemsIndexed$default$1(Function2 function2, List list) {
        this.ShareDataUIState = function2;
        this.component2 = list;
    }
}
