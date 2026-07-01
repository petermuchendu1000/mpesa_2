package com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles;

import com.huawei.digitalpayment.consumer.sfcui.api.FavouriteBundlesService;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003J[\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\rHÇ\u0001J\u0013\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010$\u001a\u00020%H×\u0001J\t\u0010&\u001a\u00020\rH×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SearchBundlesUIState;", "", "selectedSortFilterSortPrice", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SortFilterUiModel;", "selectedFilterByType", "selectedFilterByValidity", FavouriteBundlesService.BUNDLES_PARAM, "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/BundleSection;", "showDialog", "", "isSortAndFilterButtonsEnabled", "searchInput", "", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SortFilterUiModel;Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SortFilterUiModel;Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SortFilterUiModel;Ljava/util/List;ZZLjava/lang/String;)V", "getSelectedSortFilterSortPrice", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SortFilterUiModel;", "getSelectedFilterByType", "getSelectedFilterByValidity", "getBundles", "()Ljava/util/List;", "getShowDialog", "()Z", "getSearchInput", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SearchBundlesUIState {
    public static final int $stable = 8;
    private static int component4 = 0;
    private static int getAsAtTimestamp = 97 % 128;
    private static int getRequestBeneficiariesState = 0;
    private static int getSponsorBeneficiariesState = 1;
    private final SortFilterUiModel ShareDataUIState;
    private final boolean component1;
    private final SortFilterUiModel component2;
    private final List<BundleSection> component3;
    private final SortFilterUiModel copy;
    private final String copydefault;
    private final boolean equals;

    public SearchBundlesUIState(SortFilterUiModel sortFilterUiModel, SortFilterUiModel sortFilterUiModel2, SortFilterUiModel sortFilterUiModel3, List<BundleSection> list, boolean z, boolean z2, String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copy = sortFilterUiModel;
        this.ShareDataUIState = sortFilterUiModel2;
        this.component2 = sortFilterUiModel3;
        this.component3 = list;
        this.equals = z;
        this.component1 = z2;
        this.copydefault = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchBundlesUIState(SortFilterUiModel sortFilterUiModel, SortFilterUiModel sortFilterUiModel2, SortFilterUiModel sortFilterUiModel3, List list, boolean z, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        SortFilterUiModel sortFilterUiModel4;
        SortFilterUiModel sortFilterUiModel5 = null;
        if ((i & 1) != 0) {
            int i2 = getRequestBeneficiariesState + 21;
            getSponsorBeneficiariesState = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            sortFilterUiModel = null;
        }
        if ((i & 2) != 0) {
            int i4 = getRequestBeneficiariesState + 107;
            getSponsorBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            sortFilterUiModel4 = null;
        } else {
            sortFilterUiModel4 = sortFilterUiModel2;
        }
        if ((i & 4) != 0) {
            int i6 = getRequestBeneficiariesState + 115;
            getSponsorBeneficiariesState = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            int i7 = 2 % 2;
        } else {
            sortFilterUiModel5 = sortFilterUiModel3;
        }
        List listEmptyList = (i & 8) != 0 ? CollectionsKt.emptyList() : list;
        boolean z3 = (i & 16) != 0 ? false : z;
        boolean z4 = (i & 32) != 0 ? false : z2;
        if ((i & 64) != 0) {
            int i8 = getSponsorBeneficiariesState + 47;
            getRequestBeneficiariesState = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            str = "";
        }
        this(sortFilterUiModel, sortFilterUiModel4, sortFilterUiModel5, listEmptyList, z3, z4, str);
    }

    public final SortFilterUiModel getSelectedSortFilterSortPrice() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 115;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        SortFilterUiModel sortFilterUiModel = this.copy;
        int i5 = i3 + 77;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return sortFilterUiModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SortFilterUiModel getSelectedFilterByType() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 21;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SortFilterUiModel getSelectedFilterByValidity() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 33;
        getRequestBeneficiariesState = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        SortFilterUiModel sortFilterUiModel = this.component2;
        int i4 = i2 + 85;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return sortFilterUiModel;
        }
        obj.hashCode();
        throw null;
    }

    public final List<BundleSection> getBundles() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 101;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        List<BundleSection> list = this.component3;
        int i5 = i3 + 105;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final boolean getShowDialog() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 47;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        boolean z = this.equals;
        int i5 = i3 + 91;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isSortAndFilterButtonsEnabled() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 101;
        getRequestBeneficiariesState = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.component1;
        int i4 = i2 + 113;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final String getSearchInput() {
        String str;
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 95;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        if (i2 % 2 != 0) {
            str = this.copydefault;
            int i4 = 99 / 0;
        } else {
            str = this.copydefault;
        }
        int i5 = i3 + 83;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
        return str;
    }

    static {
        int i = 97 % 2;
    }

    public SearchBundlesUIState() {
        this(null, null, null, null, false, false, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SearchBundlesUIState copy$default(SearchBundlesUIState searchBundlesUIState, SortFilterUiModel sortFilterUiModel, SortFilterUiModel sortFilterUiModel2, SortFilterUiModel sortFilterUiModel3, List list, boolean z, boolean z2, String str, int i, Object obj) {
        SortFilterUiModel sortFilterUiModel4;
        List list2;
        boolean z3;
        String str2;
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState;
        int i4 = i3 + 101;
        getSponsorBeneficiariesState = i4 % 128;
        SortFilterUiModel sortFilterUiModel5 = (i4 % 2 == 0 || (i & 1) == 0) ? sortFilterUiModel : searchBundlesUIState.copy;
        SortFilterUiModel sortFilterUiModel6 = (i & 2) != 0 ? searchBundlesUIState.ShareDataUIState : sortFilterUiModel2;
        Object obj2 = null;
        if ((i & 4) != 0) {
            int i5 = i3 + 39;
            getSponsorBeneficiariesState = i5 % 128;
            if (i5 % 2 == 0) {
                SortFilterUiModel sortFilterUiModel7 = searchBundlesUIState.component2;
                obj2.hashCode();
                throw null;
            }
            sortFilterUiModel4 = searchBundlesUIState.component2;
        } else {
            sortFilterUiModel4 = sortFilterUiModel3;
        }
        if ((i & 8) != 0) {
            int i6 = getSponsorBeneficiariesState + 51;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            list2 = searchBundlesUIState.component3;
        } else {
            list2 = list;
        }
        boolean z4 = (i & 16) != 0 ? searchBundlesUIState.equals : z;
        if ((i & 32) != 0) {
            int i8 = getRequestBeneficiariesState + 95;
            getSponsorBeneficiariesState = i8 % 128;
            if (i8 % 2 == 0) {
                boolean z5 = searchBundlesUIState.component1;
                throw null;
            }
            z3 = searchBundlesUIState.component1;
        } else {
            z3 = z2;
        }
        if ((i & 64) != 0) {
            int i9 = getRequestBeneficiariesState + 35;
            getSponsorBeneficiariesState = i9 % 128;
            if (i9 % 2 == 0) {
                String str3 = searchBundlesUIState.copydefault;
                throw null;
            }
            str2 = searchBundlesUIState.copydefault;
        } else {
            str2 = str;
        }
        SearchBundlesUIState searchBundlesUIStateCopy = searchBundlesUIState.copy(sortFilterUiModel5, sortFilterUiModel6, sortFilterUiModel4, list2, z4, z3, str2);
        int i10 = getRequestBeneficiariesState + 55;
        getSponsorBeneficiariesState = i10 % 128;
        int i11 = i10 % 2;
        return searchBundlesUIStateCopy;
    }

    public final SortFilterUiModel component1() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 21;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SortFilterUiModel component2() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 7;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        SortFilterUiModel sortFilterUiModel = this.ShareDataUIState;
        int i5 = i3 + 103;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return sortFilterUiModel;
    }

    public final SortFilterUiModel component3() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 41;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        SortFilterUiModel sortFilterUiModel = this.component2;
        int i5 = i3 + 55;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return sortFilterUiModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<BundleSection> component4() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 15;
        getRequestBeneficiariesState = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        List<BundleSection> list = this.component3;
        int i4 = i2 + 5;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean component5() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 27;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.equals;
        int i5 = i2 + 71;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean component6() {
        boolean z;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 101;
        getSponsorBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0) {
            z = this.component1;
            int i4 = 70 / 0;
        } else {
            z = this.component1;
        }
        int i5 = i2 + 25;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 57;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final SearchBundlesUIState copy(SortFilterUiModel selectedSortFilterSortPrice, SortFilterUiModel selectedFilterByType, SortFilterUiModel selectedFilterByValidity, List<BundleSection> bundles, boolean showDialog, boolean isSortAndFilterButtonsEnabled, String searchInput) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bundles, "");
        Intrinsics.checkNotNullParameter(searchInput, "");
        SearchBundlesUIState searchBundlesUIState = new SearchBundlesUIState(selectedSortFilterSortPrice, selectedFilterByType, selectedFilterByValidity, bundles, showDialog, isSortAndFilterButtonsEnabled, searchInput);
        int i2 = getRequestBeneficiariesState + 65;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 85 / 0;
        }
        return searchBundlesUIState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchBundlesUIState)) {
            return false;
        }
        SearchBundlesUIState searchBundlesUIState = (SearchBundlesUIState) other;
        if (!Intrinsics.areEqual(this.copy, searchBundlesUIState.copy)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.ShareDataUIState, searchBundlesUIState.ShareDataUIState)) {
            int i2 = getSponsorBeneficiariesState + 53;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component2, searchBundlesUIState.component2) || !Intrinsics.areEqual(this.component3, searchBundlesUIState.component3) || this.equals != searchBundlesUIState.equals || this.component1 != searchBundlesUIState.component1 || !Intrinsics.areEqual(this.copydefault, searchBundlesUIState.copydefault)) {
            return false;
        }
        int i4 = getRequestBeneficiariesState + 111;
        getSponsorBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        SortFilterUiModel sortFilterUiModel = this.copy;
        int iHashCode2 = sortFilterUiModel == null ? 0 : sortFilterUiModel.hashCode();
        SortFilterUiModel sortFilterUiModel2 = this.ShareDataUIState;
        if (sortFilterUiModel2 == null) {
            int i2 = getRequestBeneficiariesState + 81;
            getSponsorBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = sortFilterUiModel2.hashCode();
        }
        SortFilterUiModel sortFilterUiModel3 = this.component2;
        int iHashCode3 = (((((((((((iHashCode2 * 31) + iHashCode) * 31) + (sortFilterUiModel3 != null ? sortFilterUiModel3.hashCode() : 0)) * 31) + this.component3.hashCode()) * 31) + Boolean.hashCode(this.equals)) * 31) + Boolean.hashCode(this.component1)) * 31) + this.copydefault.hashCode();
        int i4 = getSponsorBeneficiariesState + 101;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SearchBundlesUIState(selectedSortFilterSortPrice=" + this.copy + ", selectedFilterByType=" + this.ShareDataUIState + ", selectedFilterByValidity=" + this.component2 + ", bundles=" + this.component3 + ", showDialog=" + this.equals + ", isSortAndFilterButtonsEnabled=" + this.component1 + ", searchInput=" + this.copydefault + ")";
        int i2 = getRequestBeneficiariesState + 13;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
