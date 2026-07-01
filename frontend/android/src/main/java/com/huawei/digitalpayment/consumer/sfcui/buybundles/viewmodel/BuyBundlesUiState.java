package com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel;

import com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.OfferCategory;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.FreshFridayResp;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfferBundle;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\rHÆ\u0003J\t\u0010\u001f\u001a\u00020\rHÆ\u0003Jg\u0010 \u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÇ\u0001J\u0013\u0010!\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010#\u001a\u00020$H×\u0001J\t\u0010%\u001a\u00020\u0006H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0018¨\u0006&"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/BuyBundlesUiState;", "", "categories", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/OfferCategory;", "currentCategory", "", "ofaMotoOffers", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/OfferBundle;", "freshFridayOffers", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/FreshFridayResp;", "displayList", "isFreshFridayAvailable", "", "isFreshFridayActive", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZ)V", "getCategories", "()Ljava/util/List;", "getCurrentCategory", "()Ljava/lang/String;", "getOfaMotoOffers", "getFreshFridayOffers", "getDisplayList", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BuyBundlesUiState {
    public static final int $stable = 8;
    private static int copy = 0;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState = 0;
    private static int getShareableDataState = 1;
    private final List<OfferCategory> ShareDataUIState;
    private final List<Object> component1;
    private final String component2;
    private final boolean component3;
    private final List<OfferBundle> component4;
    private final List<FreshFridayResp> copydefault;
    private final boolean equals;

    public BuyBundlesUiState(List<OfferCategory> list, String str, List<OfferBundle> list2, List<FreshFridayResp> list3, List<? extends Object> list4, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        this.ShareDataUIState = list;
        this.component2 = str;
        this.component4 = list2;
        this.copydefault = list3;
        this.component1 = list4;
        this.equals = z;
        this.component3 = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BuyBundlesUiState(List list, String str, List list2, List list3, List list4, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        List listListOf;
        List listEmptyList;
        List listEmptyList2;
        boolean z3;
        String str2 = "ofa_moto";
        if ((i & 1) != 0) {
            listListOf = CollectionsKt.listOf(new OfferCategory("ofa_moto", "OFA Moto", true));
            int i2 = 2 % 2;
        } else {
            listListOf = list;
        }
        if ((i & 2) != 0) {
            int i3 = getShareableDataState + 59;
            copy = i3 % 128;
            int i4 = i3 % 2;
        } else {
            str2 = str;
        }
        List listEmptyList3 = (i & 4) != 0 ? CollectionsKt.emptyList() : list2;
        if ((i & 8) != 0) {
            int i5 = getShareableDataState + 123;
            copy = i5 % 128;
            if (i5 % 2 != 0) {
                CollectionsKt.emptyList();
                throw null;
            }
            listEmptyList = CollectionsKt.emptyList();
            int i6 = 2 % 2;
        } else {
            listEmptyList = list3;
        }
        if ((i & 16) != 0) {
            listEmptyList2 = CollectionsKt.emptyList();
            int i7 = 2 % 2;
        } else {
            listEmptyList2 = list4;
        }
        boolean z4 = false;
        if ((i & 32) != 0) {
            int i8 = getShareableDataState + 89;
            copy = i8 % 128;
            int i9 = i8 % 2;
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i & 64) != 0) {
            int i10 = copy + 49;
            getShareableDataState = i10 % 128;
            int i11 = i10 % 2;
        } else {
            z4 = z2;
        }
        this(listListOf, str2, listEmptyList3, listEmptyList, listEmptyList2, z3, z4);
    }

    public final List<OfferCategory> getCategories() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 111;
        copy = i3 % 128;
        int i4 = i3 % 2;
        List<OfferCategory> list = this.ShareDataUIState;
        int i5 = i2 + 17;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String getCurrentCategory() {
        int i = 2 % 2;
        int i2 = copy + 83;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.component2;
        int i4 = i3 + 11;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final List<OfferBundle> getOfaMotoOffers() {
        int i = 2 % 2;
        int i2 = copy + 81;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        List<OfferBundle> list = this.component4;
        int i5 = i3 + 99;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 17 / 0;
        }
        return list;
    }

    public final List<FreshFridayResp> getFreshFridayOffers() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 63;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final List<Object> getDisplayList() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 25;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        List<Object> list = this.component1;
        int i5 = i3 + 91;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isFreshFridayAvailable() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 37;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.equals;
        int i5 = i2 + 119;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean isFreshFridayActive() {
        int i = 2 % 2;
        int i2 = copy + 125;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.component3;
        int i4 = i3 + 97;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 + 21;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public BuyBundlesUiState() {
        this(null, null, null, null, null, false, false, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BuyBundlesUiState copy$default(BuyBundlesUiState buyBundlesUiState, List list, String str, List list2, List list3, List list4, boolean z, boolean z2, int i, Object obj) {
        List list5;
        List list6;
        boolean z3;
        int i2 = 2 % 2;
        List list7 = (i & 1) != 0 ? buyBundlesUiState.ShareDataUIState : list;
        String str2 = (i & 2) != 0 ? buyBundlesUiState.component2 : str;
        if ((i & 4) != 0) {
            int i3 = copy + 53;
            getShareableDataState = i3 % 128;
            int i4 = i3 % 2;
            list5 = buyBundlesUiState.component4;
        } else {
            list5 = list2;
        }
        List list8 = (i & 8) != 0 ? buyBundlesUiState.copydefault : list3;
        if ((i & 16) != 0) {
            int i5 = copy + 25;
            getShareableDataState = i5 % 128;
            int i6 = i5 % 2;
            list6 = buyBundlesUiState.component1;
        } else {
            list6 = list4;
        }
        if ((i & 32) != 0) {
            int i7 = copy + 1;
            getShareableDataState = i7 % 128;
            if (i7 % 2 == 0) {
                boolean z4 = buyBundlesUiState.equals;
                throw null;
            }
            z3 = buyBundlesUiState.equals;
        } else {
            z3 = z;
        }
        return buyBundlesUiState.copy(list7, str2, list5, list8, list6, z3, (i & 64) != 0 ? buyBundlesUiState.component3 : z2);
    }

    public final List<OfferCategory> component1() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 79;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        List<OfferCategory> list = this.ShareDataUIState;
        int i5 = i2 + 119;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 91;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        int i3 = 2 / 0;
        return this.component2;
    }

    public final List<OfferBundle> component3() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 115;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        List<OfferBundle> list = this.component4;
        int i4 = i3 + 63;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final List<FreshFridayResp> component4() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 11;
        getShareableDataState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<FreshFridayResp> list = this.copydefault;
        int i4 = i2 + 13;
        getShareableDataState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
        return list;
    }

    public final List<Object> component5() {
        int i = 2 % 2;
        int i2 = copy + 119;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component6() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 51;
        copy = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.equals;
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
        return z;
    }

    public final boolean component7() {
        boolean z;
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 37;
        copy = i3 % 128;
        if (i3 % 2 != 0) {
            z = this.component3;
            int i4 = 48 / 0;
        } else {
            z = this.component3;
        }
        int i5 = i2 + 123;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final BuyBundlesUiState copy(List<OfferCategory> categories, String currentCategory, List<OfferBundle> ofaMotoOffers, List<FreshFridayResp> freshFridayOffers, List<? extends Object> displayList, boolean isFreshFridayAvailable, boolean isFreshFridayActive) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(categories, "");
        Intrinsics.checkNotNullParameter(currentCategory, "");
        Intrinsics.checkNotNullParameter(ofaMotoOffers, "");
        Intrinsics.checkNotNullParameter(freshFridayOffers, "");
        Intrinsics.checkNotNullParameter(displayList, "");
        BuyBundlesUiState buyBundlesUiState = new BuyBundlesUiState(categories, currentCategory, ofaMotoOffers, freshFridayOffers, displayList, isFreshFridayAvailable, isFreshFridayActive);
        int i2 = copy + 97;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        return buyBundlesUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 97;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuyBundlesUiState)) {
            int i4 = i3 + 121;
            getShareableDataState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        BuyBundlesUiState buyBundlesUiState = (BuyBundlesUiState) other;
        if (Intrinsics.areEqual(this.ShareDataUIState, buyBundlesUiState.ShareDataUIState)) {
            if (!Intrinsics.areEqual(this.component2, buyBundlesUiState.component2)) {
                return false;
            }
            if (Intrinsics.areEqual(this.component4, buyBundlesUiState.component4)) {
                return Intrinsics.areEqual(this.copydefault, buyBundlesUiState.copydefault) && Intrinsics.areEqual(this.component1, buyBundlesUiState.component1) && this.equals == buyBundlesUiState.equals && this.component3 == buyBundlesUiState.component3;
            }
            int i6 = getShareableDataState + 17;
            copy = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = getShareableDataState;
        int i9 = i8 + 33;
        copy = i9 % 128;
        int i10 = i9 % 2;
        int i11 = i8 + 33;
        copy = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 20 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 89;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((this.ShareDataUIState.hashCode() * 31) + this.component2.hashCode()) * 31) + this.component4.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.component1.hashCode()) * 31) + Boolean.hashCode(this.equals)) * 31) + Boolean.hashCode(this.component3);
        int i4 = copy + 93;
        getShareableDataState = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BuyBundlesUiState(categories=" + this.ShareDataUIState + ", currentCategory=" + this.component2 + ", ofaMotoOffers=" + this.component4 + ", freshFridayOffers=" + this.copydefault + ", displayList=" + this.component1 + ", isFreshFridayAvailable=" + this.equals + ", isFreshFridayActive=" + this.component3 + ")";
        int i2 = getShareableDataState + 73;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
