package com.huawei.digitalpayment.consumer.pochiwallet.ui.resp;

import com.huawei.digitalpayment.consumer.sfcpochiwallet.R;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/resp/BusinessCategoryItems;", "", "<init>", "()V", "TRANSPORT", "Lkotlin/Pair;", "", "getTRANSPORT", "()Lkotlin/Pair;", "RETAIL", "getRETAIL", "FOOD_AND_BEVERAGE", "getFOOD_AND_BEVERAGE", "CLOTHING", "getCLOTHING", "COSMETIC_AND_ACCESSORIES", "getCOSMETIC_AND_ACCESSORIES", "SERVICE_PROVIDERS", "getSERVICE_PROVIDERS", "createBusinessCategoryItems", "", "Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/resp/PochiBusinessCategoryBean;", "ConsumerSfcPochiWallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BusinessCategoryItems {
    public static final int $stable = 0;
    private static int component4 = 1;
    private static int copy = 0;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    public static final BusinessCategoryItems INSTANCE = new BusinessCategoryItems();
    private static final Pair<String, String> equals = new Pair<>("1", "Transport");
    private static final Pair<String, String> copydefault = new Pair<>("2", "Retail");
    private static final Pair<String, String> component2 = new Pair<>("3", "Food and beverage");
    private static final Pair<String, String> ShareDataUIState = new Pair<>("4", "Clothing");
    private static final Pair<String, String> component1 = new Pair<>("5", "Cosmetic and accessories");
    private static final Pair<String, String> component3 = new Pair<>("6", "Service Providers");

    private BusinessCategoryItems() {
    }

    static {
        int i = copy + 37;
        component4 = i % 128;
        if (i % 2 == 0) {
            int i2 = 43 / 0;
        }
    }

    public final Pair<String, String> getTRANSPORT() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 93;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        Pair<String, String> pair = equals;
        int i5 = i3 + 33;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return pair;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Pair<String, String> getRETAIL() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 75;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Pair<String, String> pair = copydefault;
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
        return pair;
    }

    public final Pair<String, String> getFOOD_AND_BEVERAGE() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 51;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Pair<String, String> getCLOTHING() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 101;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        Pair<String, String> pair = ShareDataUIState;
        int i5 = i3 + 13;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return pair;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Pair<String, String> getCOSMETIC_AND_ACCESSORIES() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 117;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        Pair<String, String> pair = component1;
        int i5 = i3 + 65;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return pair;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Pair<String, String> getSERVICE_PROVIDERS() {
        Pair<String, String> pair;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 27;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            pair = component3;
            int i4 = 21 / 0;
        } else {
            pair = component3;
        }
        int i5 = i2 + 91;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return pair;
    }

    public final List<PochiBusinessCategoryBean> createBusinessCategoryItems() {
        int i = 2 % 2;
        Pair<String, String> pair = equals;
        PochiBusinessCategoryBean pochiBusinessCategoryBean = new PochiBusinessCategoryBean(pair.getFirst(), R.drawable.ic_category_transport, pair.getSecond(), "e.g matatu. mathree, cab");
        Pair<String, String> pair2 = copydefault;
        PochiBusinessCategoryBean pochiBusinessCategoryBean2 = new PochiBusinessCategoryBean(pair2.getFirst(), R.drawable.ic_category_retail, pair2.getSecond(), "e.g shopkeeper, wholesale shops");
        Pair<String, String> pair3 = component2;
        PochiBusinessCategoryBean pochiBusinessCategoryBean3 = new PochiBusinessCategoryBean(pair3.getFirst(), R.drawable.ic_category_food, pair3.getSecond(), "e.g hotel, cafe, restaurant, juice bar");
        Pair<String, String> pair4 = ShareDataUIState;
        PochiBusinessCategoryBean pochiBusinessCategoryBean4 = new PochiBusinessCategoryBean(pair4.getFirst(), R.drawable.ic_category_clothing, pair4.getSecond(), "e.g thrift shop, ");
        Pair<String, String> pair5 = component1;
        PochiBusinessCategoryBean pochiBusinessCategoryBean5 = new PochiBusinessCategoryBean(pair5.getFirst(), R.drawable.ic_category_cosmetic, pair5.getSecond(), "e.g salon, barber, cosmetics shop, nail parlour");
        Pair<String, String> pair6 = component3;
        List<PochiBusinessCategoryBean> mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.listOf((Object[]) new PochiBusinessCategoryBean[]{pochiBusinessCategoryBean, pochiBusinessCategoryBean2, pochiBusinessCategoryBean3, pochiBusinessCategoryBean4, pochiBusinessCategoryBean5, new PochiBusinessCategoryBean(pair6.getFirst(), R.drawable.ic_category_service, pair6.getSecond(), "e.g mama fua, gardener, plumber, electrician, chama")}));
        int i2 = getAsAtTimestamp + 73;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 75 / 0;
        }
        return mutableList;
    }
}
