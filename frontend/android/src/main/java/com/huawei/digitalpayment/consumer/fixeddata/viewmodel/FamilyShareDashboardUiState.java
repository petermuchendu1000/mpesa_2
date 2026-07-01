package com.huawei.digitalpayment.consumer.fixeddata.viewmodel;

import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare.FamilyShareBeneficiaryListResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\u001cH×\u0001J\t\u0010\u001d\u001a\u00020\nH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FamilyShareDashboardUiState;", "", GriverMonitorConstants.KEY_IS_LOADING, "", "beneficiaryListResponse", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/familyshare/FamilyShareBeneficiaryListResponse;", "resourcePool", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FamilyShareResourceItem;", "error", "", "<init>", "(ZLcom/huawei/digitalpayment/consumer/fixeddata/data/model/familyshare/FamilyShareBeneficiaryListResponse;Ljava/util/List;Ljava/lang/String;)V", "()Z", "getBeneficiaryListResponse", "()Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/familyshare/FamilyShareBeneficiaryListResponse;", "getResourcePool", "()Ljava/util/List;", "getError", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FamilyShareDashboardUiState {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component4 = 1;
    private static int copy = 0;
    private static int getAsAtTimestamp = 1;
    private final boolean ShareDataUIState;
    private final List<FamilyShareResourceItem> component2;
    private final String component3;
    private final FamilyShareBeneficiaryListResponse copydefault;

    public FamilyShareDashboardUiState(boolean z, FamilyShareBeneficiaryListResponse familyShareBeneficiaryListResponse, List<FamilyShareResourceItem> list, String str) {
        Intrinsics.checkNotNullParameter(list, "");
        this.ShareDataUIState = z;
        this.copydefault = familyShareBeneficiaryListResponse;
        this.component2 = list;
        this.component3 = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FamilyShareDashboardUiState(boolean z, FamilyShareBeneficiaryListResponse familyShareBeneficiaryListResponse, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            z = false;
        }
        if ((i & 2) != 0) {
            int i3 = copy + 47;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            familyShareBeneficiaryListResponse = null;
        }
        if ((i & 4) != 0) {
            int i6 = copy + 63;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            list = CollectionsKt.emptyList();
            int i8 = getAsAtTimestamp + 63;
            copy = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
        }
        if ((i & 8) != 0) {
            int i11 = copy + 65;
            getAsAtTimestamp = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 28 / 0;
            }
            str = null;
        }
        this(z, familyShareBeneficiaryListResponse, list, str);
    }

    public final boolean isLoading() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 69;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public final FamilyShareBeneficiaryListResponse getBeneficiaryListResponse() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 87;
        copy = i3 % 128;
        int i4 = i3 % 2;
        FamilyShareBeneficiaryListResponse familyShareBeneficiaryListResponse = this.copydefault;
        int i5 = i2 + 51;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return familyShareBeneficiaryListResponse;
    }

    public final List<FamilyShareResourceItem> getResourcePool() {
        int i = 2 % 2;
        int i2 = copy + 101;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        List<FamilyShareResourceItem> list = this.component2;
        int i5 = i3 + 111;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String getError() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 71;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component3;
        int i4 = i2 + 73;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        int i = 1 + 113;
        component1 = i % 128;
        if (i % 2 != 0) {
            int i2 = 55 / 0;
        }
    }

    public FamilyShareDashboardUiState() {
        this(false, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FamilyShareDashboardUiState copy$default(FamilyShareDashboardUiState familyShareDashboardUiState, boolean z, FamilyShareBeneficiaryListResponse familyShareBeneficiaryListResponse, List list, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 21;
        int i4 = i3 % 128;
        getAsAtTimestamp = i4;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i5 = i4 + 21;
            copy = i5 % 128;
            int i6 = i5 % 2;
            z = familyShareDashboardUiState.ShareDataUIState;
        }
        if ((i & 2) != 0) {
            familyShareBeneficiaryListResponse = familyShareDashboardUiState.copydefault;
            int i7 = copy + 83;
            getAsAtTimestamp = i7 % 128;
            int i8 = i7 % 2;
        }
        if ((i & 4) != 0) {
            list = familyShareDashboardUiState.component2;
        }
        if ((i & 8) != 0) {
            str = familyShareDashboardUiState.component3;
        }
        return familyShareDashboardUiState.copy(z, familyShareBeneficiaryListResponse, list, str);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 103;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i3 + 37;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
        return z;
    }

    public final FamilyShareBeneficiaryListResponse component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 111;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        FamilyShareBeneficiaryListResponse familyShareBeneficiaryListResponse = this.copydefault;
        int i5 = i3 + 115;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
        return familyShareBeneficiaryListResponse;
    }

    public final List<FamilyShareResourceItem> component3() {
        int i = 2 % 2;
        int i2 = copy + 121;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        List<FamilyShareResourceItem> list = this.component2;
        int i4 = i3 + 45;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final String component4() {
        String str;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 115;
        copy = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.component3;
            int i4 = 79 / 0;
        } else {
            str = this.component3;
        }
        int i5 = i2 + 51;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final FamilyShareDashboardUiState copy(boolean isLoading, FamilyShareBeneficiaryListResponse beneficiaryListResponse, List<FamilyShareResourceItem> resourcePool, String error) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(resourcePool, "");
        FamilyShareDashboardUiState familyShareDashboardUiState = new FamilyShareDashboardUiState(isLoading, beneficiaryListResponse, resourcePool, error);
        int i2 = getAsAtTimestamp + 87;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return familyShareDashboardUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilyShareDashboardUiState)) {
            int i2 = copy + 105;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        FamilyShareDashboardUiState familyShareDashboardUiState = (FamilyShareDashboardUiState) other;
        if (this.ShareDataUIState != familyShareDashboardUiState.ShareDataUIState) {
            int i4 = copy + 115;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.copydefault, familyShareDashboardUiState.copydefault)) {
            return false;
        }
        if (Intrinsics.areEqual(this.component2, familyShareDashboardUiState.component2)) {
            return Intrinsics.areEqual(this.component3, familyShareDashboardUiState.component3);
        }
        int i6 = getAsAtTimestamp + 107;
        copy = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 99;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = Boolean.hashCode(this.ShareDataUIState);
        FamilyShareBeneficiaryListResponse familyShareBeneficiaryListResponse = this.copydefault;
        int iHashCode3 = 0;
        if (familyShareBeneficiaryListResponse == null) {
            int i4 = copy + 81;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = familyShareBeneficiaryListResponse.hashCode();
        }
        int iHashCode4 = this.component2.hashCode();
        String str = this.component3;
        if (str != null) {
            iHashCode3 = str.hashCode();
            int i6 = copy + 49;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = (((((iHashCode2 * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode3;
        int i9 = getAsAtTimestamp + 41;
        copy = i9 % 128;
        if (i9 % 2 == 0) {
            return i8;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FamilyShareDashboardUiState(isLoading=" + this.ShareDataUIState + ", beneficiaryListResponse=" + this.copydefault + ", resourcePool=" + this.component2 + ", error=" + this.component3 + ")";
        int i2 = copy + 99;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
