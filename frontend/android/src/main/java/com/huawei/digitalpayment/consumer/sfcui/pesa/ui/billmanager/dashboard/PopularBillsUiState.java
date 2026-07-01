package com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.dashboard;

import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.PopularBillDto;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\t\u0010\u0019\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/dashboard/PopularBillsUiState;", "", "loading", "", "errorMessage", "", "popularBills", "", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/PopularBillDto;", "<init>", "(ZLjava/lang/String;Ljava/util/List;)V", "getLoading", "()Z", "getErrorMessage", "()Ljava/lang/String;", "getPopularBills", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PopularBillsUiState {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component2 = 79 % 128;
    private static int equals = 0;
    private static int getAsAtTimestamp = 1;
    private final List<PopularBillDto> ShareDataUIState;
    private final String component3;
    private final boolean copydefault;

    public PopularBillsUiState(boolean z, String str, List<PopularBillDto> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = z;
        this.component3 = str;
        this.ShareDataUIState = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PopularBillsUiState(boolean z, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        z = (i & 1) != 0 ? false : z;
        if ((i & 2) != 0) {
            int i2 = equals + 67;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            str = null;
        }
        if ((i & 4) != 0) {
            int i4 = getAsAtTimestamp + 91;
            equals = i4 % 128;
            if (i4 % 2 == 0) {
                list = CollectionsKt.emptyList();
                int i5 = 2 % 2;
            } else {
                CollectionsKt.emptyList();
                throw null;
            }
        }
        this(z, str, list);
    }

    public final boolean getLoading() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 105;
        equals = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.copydefault;
        int i5 = i2 + 109;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String getErrorMessage() {
        int i = 2 % 2;
        int i2 = equals + 41;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        throw null;
    }

    public final List<PopularBillDto> getPopularBills() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 99;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        List<PopularBillDto> list = this.ShareDataUIState;
        int i5 = i2 + 65;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static {
        if (79 % 2 == 0) {
            int i = 67 / 0;
        }
    }

    public PopularBillsUiState() {
        this(false, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PopularBillsUiState copy$default(PopularBillsUiState popularBillsUiState, boolean z, String str, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 87;
        int i4 = i3 % 128;
        equals = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 15;
            getAsAtTimestamp = i6 % 128;
            if (i6 % 2 == 0) {
                z = popularBillsUiState.copydefault;
                int i7 = 73 / 0;
            } else {
                z = popularBillsUiState.copydefault;
            }
        }
        if ((i & 2) != 0) {
            int i8 = i4 + 67;
            getAsAtTimestamp = i8 % 128;
            int i9 = i8 % 2;
            str = popularBillsUiState.component3;
        }
        if ((i & 4) != 0) {
            int i10 = i4 + 65;
            getAsAtTimestamp = i10 % 128;
            if (i10 % 2 == 0) {
                List<PopularBillDto> list2 = popularBillsUiState.ShareDataUIState;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            list = popularBillsUiState.ShareDataUIState;
        }
        return popularBillsUiState.copy(z, str, list);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 67;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        boolean z = this.copydefault;
        int i5 = i3 + 5;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 77;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 27;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<PopularBillDto> component3() {
        int i = 2 % 2;
        int i2 = equals + 53;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final PopularBillsUiState copy(boolean loading, String errorMessage, List<PopularBillDto> popularBills) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(popularBills, "");
        PopularBillsUiState popularBillsUiState = new PopularBillsUiState(loading, errorMessage, popularBills);
        int i2 = getAsAtTimestamp + 21;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return popularBillsUiState;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = equals + 5;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof PopularBillsUiState)) {
            return false;
        }
        PopularBillsUiState popularBillsUiState = (PopularBillsUiState) other;
        if (this.copydefault != popularBillsUiState.copydefault) {
            int i4 = equals + 79;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component3, popularBillsUiState.component3)) {
            int i6 = equals + 51;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.ShareDataUIState, popularBillsUiState.ShareDataUIState)) {
            return true;
        }
        int i8 = getAsAtTimestamp + 69;
        equals = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 67;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            Boolean.hashCode(this.copydefault);
            throw null;
        }
        int iHashCode2 = Boolean.hashCode(this.copydefault);
        String str = this.component3;
        if (str == null) {
            int i3 = equals + 77;
            getAsAtTimestamp = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 % 3;
            }
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode) * 31) + this.ShareDataUIState.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PopularBillsUiState(loading=" + this.copydefault + ", errorMessage=" + this.component3 + ", popularBills=" + this.ShareDataUIState + ")";
        int i2 = equals + 31;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
