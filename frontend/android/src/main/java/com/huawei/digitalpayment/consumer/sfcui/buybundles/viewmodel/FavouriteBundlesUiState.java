package com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel;

import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003J[\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÇ\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001f\u001a\u00020 H×\u0001J\t\u0010!\u001a\u00020\nH×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\""}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/FavouriteBundlesUiState;", "", "favouriteBundles", "", "Lcom/huawei/digitalpayment/consumer/sfcui/api/model/FavoriteBundle;", "otherBundles", "allBundles", GriverMonitorConstants.KEY_IS_LOADING, "", "error", "", "loadingMessage", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)V", "getFavouriteBundles", "()Ljava/util/List;", "getOtherBundles", "getAllBundles", "()Z", "getError", "()Ljava/lang/String;", "getLoadingMessage", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FavouriteBundlesUiState {
    public static final int $stable = 8;
    private static int component4 = 0;
    private static int copy = 0;
    private static int equals = 1;
    private static int getAsAtTimestamp = 99 % 128;
    private final List<FavoriteBundle> ShareDataUIState;
    private final String component1;
    private final List<FavoriteBundle> component2;
    private final String component3;
    private final boolean copydefault;
    private final List<FavoriteBundle> getRequestBeneficiariesState;

    public FavouriteBundlesUiState(List<FavoriteBundle> list, List<FavoriteBundle> list2, List<FavoriteBundle> list3, boolean z, String str, String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.component2 = list;
        this.getRequestBeneficiariesState = list2;
        this.ShareDataUIState = list3;
        this.copydefault = z;
        this.component3 = str;
        this.component1 = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FavouriteBundlesUiState(List list, List list2, List list3, boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        List listEmptyList;
        List listEmptyList2;
        boolean z2;
        String str3;
        if ((i & 1) != 0) {
            listEmptyList = CollectionsKt.emptyList();
            int i2 = equals + 71;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } else {
            listEmptyList = list;
        }
        if ((i & 2) != 0) {
            listEmptyList2 = CollectionsKt.emptyList();
            int i5 = 2 % 2;
        } else {
            listEmptyList2 = list2;
        }
        List listEmptyList3 = (i & 4) != 0 ? CollectionsKt.emptyList() : list3;
        if ((i & 8) != 0) {
            int i6 = equals + 5;
            component4 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        String str4 = null;
        if ((i & 16) != 0) {
            int i9 = 2 % 2;
            str3 = null;
        } else {
            str3 = str;
        }
        if ((i & 32) != 0) {
            int i10 = component4 + 39;
            equals = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 62 / 0;
            }
            int i12 = 2 % 2;
        } else {
            str4 = str2;
        }
        this(listEmptyList, listEmptyList2, listEmptyList3, z2, str3, str4);
    }

    public final List<FavoriteBundle> getFavouriteBundles() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 77;
        equals = i3 % 128;
        int i4 = i3 % 2;
        List<FavoriteBundle> list = this.component2;
        int i5 = i2 + 73;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final List<FavoriteBundle> getOtherBundles() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 55;
        component4 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        List<FavoriteBundle> list = this.getRequestBeneficiariesState;
        int i4 = i2 + 31;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public final List<FavoriteBundle> getAllBundles() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 29;
        equals = i3 % 128;
        int i4 = i3 % 2;
        List<FavoriteBundle> list = this.ShareDataUIState;
        int i5 = i2 + 59;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isLoading() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 97;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.copydefault;
        int i5 = i2 + 113;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final String getError() {
        int i = 2 % 2;
        int i2 = equals + 53;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 103;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getLoadingMessage() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 73;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.component1;
        int i4 = i2 + 101;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        int i = 99 % 2;
    }

    public FavouriteBundlesUiState() {
        this(null, null, null, false, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FavouriteBundlesUiState copy$default(FavouriteBundlesUiState favouriteBundlesUiState, List list, List list2, List list3, boolean z, String str, String str2, int i, Object obj) {
        List list4;
        String str3;
        int i2 = 2 % 2;
        int i3 = component4 + 65;
        int i4 = i3 % 128;
        equals = i4;
        List list5 = (i3 % 2 == 0 || (i & 1) == 0) ? list : favouriteBundlesUiState.component2;
        if ((i & 2) != 0) {
            int i5 = i4 + 119;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            list4 = favouriteBundlesUiState.getRequestBeneficiariesState;
        } else {
            list4 = list2;
        }
        List list6 = (i & 4) != 0 ? favouriteBundlesUiState.ShareDataUIState : list3;
        boolean z2 = (i & 8) != 0 ? favouriteBundlesUiState.copydefault : z;
        String str4 = (i & 16) != 0 ? favouriteBundlesUiState.component3 : str;
        if ((i & 32) != 0) {
            int i7 = i4 + 43;
            component4 = i7 % 128;
            if (i7 % 2 != 0) {
                String str5 = favouriteBundlesUiState.component1;
                throw null;
            }
            str3 = favouriteBundlesUiState.component1;
        } else {
            str3 = str2;
        }
        return favouriteBundlesUiState.copy(list5, list4, list6, z2, str4, str3);
    }

    public final List<FavoriteBundle> component1() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 31;
        equals = i3 % 128;
        int i4 = i3 % 2;
        List<FavoriteBundle> list = this.component2;
        int i5 = i2 + 45;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final List<FavoriteBundle> component2() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 99;
        equals = i3 % 128;
        int i4 = i3 % 2;
        List<FavoriteBundle> list = this.getRequestBeneficiariesState;
        int i5 = i2 + 121;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final List<FavoriteBundle> component3() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 65;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        List<FavoriteBundle> list = this.ShareDataUIState;
        int i5 = i2 + 69;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final boolean component4() {
        boolean z;
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 113;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            z = this.copydefault;
            int i4 = 19 / 0;
        } else {
            z = this.copydefault;
        }
        int i5 = i2 + 105;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = equals + 41;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component3;
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 41;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 113;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final FavouriteBundlesUiState copy(List<FavoriteBundle> favouriteBundles, List<FavoriteBundle> otherBundles, List<FavoriteBundle> allBundles, boolean isLoading, String error, String loadingMessage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(favouriteBundles, "");
        Intrinsics.checkNotNullParameter(otherBundles, "");
        Intrinsics.checkNotNullParameter(allBundles, "");
        FavouriteBundlesUiState favouriteBundlesUiState = new FavouriteBundlesUiState(favouriteBundles, otherBundles, allBundles, isLoading, error, loadingMessage);
        int i2 = equals + 45;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 68 / 0;
        }
        return favouriteBundlesUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavouriteBundlesUiState)) {
            return false;
        }
        FavouriteBundlesUiState favouriteBundlesUiState = (FavouriteBundlesUiState) other;
        if (!Intrinsics.areEqual(this.component2, favouriteBundlesUiState.component2) || !Intrinsics.areEqual(this.getRequestBeneficiariesState, favouriteBundlesUiState.getRequestBeneficiariesState)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.ShareDataUIState, favouriteBundlesUiState.ShareDataUIState)) {
            int i2 = component4 + 7;
            equals = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.copydefault != favouriteBundlesUiState.copydefault || !Intrinsics.areEqual(this.component3, favouriteBundlesUiState.component3)) {
            return false;
        }
        if (Intrinsics.areEqual(this.component1, favouriteBundlesUiState.component1)) {
            return true;
        }
        int i3 = component4 + 79;
        equals = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = equals + 99;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.component2.hashCode();
        int iHashCode2 = this.getRequestBeneficiariesState.hashCode();
        int iHashCode3 = this.ShareDataUIState.hashCode();
        int iHashCode4 = Boolean.hashCode(this.copydefault);
        String str = this.component3;
        int iHashCode5 = 0;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.component1;
        if (str2 != null) {
            iHashCode5 = str2.hashCode();
            int i4 = component4 + 5;
            equals = i4 % 128;
            int i5 = i4 % 2;
        }
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode6) * 31) + iHashCode5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FavouriteBundlesUiState(favouriteBundles=" + this.component2 + ", otherBundles=" + this.getRequestBeneficiariesState + ", allBundles=" + this.ShareDataUIState + ", isLoading=" + this.copydefault + ", error=" + this.component3 + ", loadingMessage=" + this.component1 + ")";
        int i2 = equals + 29;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
