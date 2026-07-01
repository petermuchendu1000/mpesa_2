package com.huawei.digitalpayment.consumer.base.resp;

import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/FavoriteItems;", "", "<init>", "()V", "ADD_FAVORITE", "Lkotlin/Pair;", "", "getADD_FAVORITE", "()Lkotlin/Pair;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FavoriteItems {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;
    public static final FavoriteItems INSTANCE = new FavoriteItems();
    private static final Pair<String, String> ADD_FAVORITE = new Pair<>("add", "Add");

    private FavoriteItems() {
    }

    static {
        int i = component2 + 13;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Pair<String, String> getADD_FAVORITE() {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Pair<String, String> pair = ADD_FAVORITE;
        int i4 = i3 + 49;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return pair;
        }
        obj.hashCode();
        throw null;
    }
}
