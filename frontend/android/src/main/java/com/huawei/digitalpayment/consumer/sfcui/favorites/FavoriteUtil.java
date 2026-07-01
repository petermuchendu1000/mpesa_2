package com.huawei.digitalpayment.consumer.sfcui.favorites;

import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.huawei.digitalpayment.consumer.base.resp.FavoriteFriendsBean;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.favorites.FavoriteFilterTab;
import com.safaricom.consumer.commons.statements.TradeTypeConstant;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u0006\u0010\r\u001a\u00020\n¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u0011¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/favorites/FavoriteUtil;", "", "<init>", "()V", "getNumberDisplayRes", "", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "", "getNumberDisplayResFull", "getFilterTabFromCategory", "Lcom/huawei/digitalpayment/consumer/sfcui/favorites/FavoriteFilterTab;", "getCategoriesForFilter", "", "filter", "(Lcom/huawei/digitalpayment/consumer/sfcui/favorites/FavoriteFilterTab;)[Ljava/lang/String;", "getFavoriteUniqueIdentifier", "favorite", "Lcom/huawei/digitalpayment/consumer/base/resp/FavoriteFriendsBean;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FavoriteUtil {
    public static final int $stable = 0;
    public static final FavoriteUtil INSTANCE = new FavoriteUtil();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int component3;

    private FavoriteUtil() {
    }

    public final int getNumberDisplayRes(String category) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(category, "");
        if (!(!ArraysKt.contains(new String[]{"BuyGoods", "PochiBuyGoods"}, category))) {
            int i2 = component2 + 89;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return R.string.favorites_display_till_number;
        }
        if (!ArraysKt.contains(new String[]{"PayBill", "PochiPayBill"}, category)) {
            return R.string.favorites_display_phone_number;
        }
        int i4 = component2 + 47;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return R.string.favorites_display_paybill_number;
    }

    public final int getNumberDisplayResFull(String category) {
        int i = 2 % 2;
        int i2 = component2 + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(category, "");
        if (!(!ArraysKt.contains(new String[]{"BuyGoods", "PochiBuyGoods"}, category))) {
            int i4 = ShareDataUIState + 35;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return R.string.favorites_display_till_number_full;
        }
        if (!ArraysKt.contains(new String[]{"PayBill", "PochiPayBill"}, category)) {
            return R.string.favorites_display_phone_number_full;
        }
        int i6 = component2 + 35;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return R.string.favorites_display_paybill_number_full;
    }

    public final FavoriteFilterTab getFilterTabFromCategory(String category) {
        int i = 2 % 2;
        int i2 = component2 + 23;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        if (ArraysKt.contains(new String[]{"PochiTransfer", "TransferPochi"}, category)) {
            return FavoriteFilterTab.Pochi.INSTANCE;
        }
        if (!ArraysKt.contains(new String[]{TradeTypeConstant.AIRTIME_MPESA, TradeTypeConstant.AIRTIME_SCRATCH_CARD}, category)) {
            if (!(!ArraysKt.contains(new String[]{"BuyGoods", "PochiBuyGoods"}, category))) {
                return FavoriteFilterTab.BuyGoods.INSTANCE;
            }
            if (!(!ArraysKt.contains(new String[]{"PayBill", "PochiPayBill"}, category))) {
                int i4 = ShareDataUIState + 95;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    return FavoriteFilterTab.Paybill.INSTANCE;
                }
                int i5 = 16 / 0;
                return FavoriteFilterTab.Paybill.INSTANCE;
            }
            if (Intrinsics.areEqual(category, "P2PTransfer")) {
                return FavoriteFilterTab.Send.INSTANCE;
            }
            return FavoriteFilterTab.Send.INSTANCE;
        }
        int i6 = ShareDataUIState + 15;
        component2 = i6 % 128;
        if (i6 % 2 == 0) {
            return FavoriteFilterTab.Airtime.INSTANCE;
        }
        FavoriteFilterTab.Airtime airtime = FavoriteFilterTab.Airtime.INSTANCE;
        throw null;
    }

    public final String[] getCategoriesForFilter(FavoriteFilterTab filter) {
        String[] strArr;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(filter, "");
        if (Intrinsics.areEqual(filter, FavoriteFilterTab.Airtime.INSTANCE)) {
            int i2 = ShareDataUIState + 25;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                strArr = new String[4];
                strArr[0] = TradeTypeConstant.AIRTIME_MPESA;
                strArr[0] = TradeTypeConstant.AIRTIME_SCRATCH_CARD;
            } else {
                strArr = new String[]{TradeTypeConstant.AIRTIME_MPESA, TradeTypeConstant.AIRTIME_SCRATCH_CARD};
            }
        } else if (Intrinsics.areEqual(filter, FavoriteFilterTab.BuyGoods.INSTANCE)) {
            strArr = new String[]{"BuyGoods", "PochiBuyGoods"};
        } else if (Intrinsics.areEqual(filter, FavoriteFilterTab.Paybill.INSTANCE)) {
            strArr = new String[]{"PayBill", "PochiPayBill"};
        } else if (!(!Intrinsics.areEqual(filter, FavoriteFilterTab.Pochi.INSTANCE))) {
            strArr = new String[]{"PochiTransfer", "TransferPochi"};
        } else {
            if (!Intrinsics.areEqual(filter, FavoriteFilterTab.Send.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = component2 + 9;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                strArr = new String[0];
                strArr[0] = "P2PTransfer";
            } else {
                strArr = new String[]{"P2PTransfer"};
            }
        }
        int i4 = component2 + 123;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return strArr;
    }

    public final String getFavoriteUniqueIdentifier(FavoriteFriendsBean favorite) {
        String str;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(favorite, "");
        FavoriteFilterTab filterTabFromCategory = getFilterTabFromCategory(favorite.getCategory());
        if (Intrinsics.areEqual(filterTabFromCategory, FavoriteFilterTab.Airtime.INSTANCE)) {
            str = "airtime-" + favorite.getPhoneNumber();
        } else if (Intrinsics.areEqual(filterTabFromCategory, FavoriteFilterTab.BuyGoods.INSTANCE)) {
            str = "buygoods-" + favorite.getPhoneNumber();
        } else if (Intrinsics.areEqual(filterTabFromCategory, FavoriteFilterTab.Paybill.INSTANCE)) {
            str = "paybill-" + favorite.getPhoneNumber() + "-" + favorite.getAccountNumber();
        } else if (Intrinsics.areEqual(filterTabFromCategory, FavoriteFilterTab.Pochi.INSTANCE)) {
            str = "pochi-" + favorite.getPhoneNumber();
            int i2 = component2 + 77;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
        } else if (Intrinsics.areEqual(filterTabFromCategory, FavoriteFilterTab.Send.INSTANCE)) {
            str = "send-" + favorite.getPhoneNumber();
        } else {
            str = null;
        }
        int i4 = ShareDataUIState + 13;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        int i = component3 + 3;
        component1 = i % 128;
        if (i % 2 == 0) {
            int i2 = 49 / 0;
        }
    }
}
