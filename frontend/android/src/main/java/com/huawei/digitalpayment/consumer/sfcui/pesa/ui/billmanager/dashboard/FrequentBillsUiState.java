package com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.dashboard;

import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.BillAccountUiModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\t\u0010\u0019\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/dashboard/FrequentBillsUiState;", "", "loading", "", "errorMessage", "", "frequentBills", "", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/BillAccountUiModel;", "<init>", "(ZLjava/lang/String;Ljava/util/List;)V", "getLoading", "()Z", "getErrorMessage", "()Ljava/lang/String;", "getFrequentBills", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FrequentBillsUiState {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component4 = 1;
    private static int copydefault = 83 % 128;
    private static int getAsAtTimestamp;
    private final String ShareDataUIState;
    private final boolean component2;
    private final List<BillAccountUiModel> component3;

    public FrequentBillsUiState(boolean z, String str, List<BillAccountUiModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.component2 = z;
        this.ShareDataUIState = str;
        this.component3 = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FrequentBillsUiState(boolean z, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = getAsAtTimestamp + 73;
            int i3 = i2 % 128;
            component4 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 15;
            getAsAtTimestamp = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 % 4;
            } else {
                int i7 = 2 % 2;
            }
            z = false;
        }
        if ((i & 2) != 0) {
            int i8 = 2 % 2;
            str = null;
        }
        this(z, str, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final boolean getLoading() {
        int i = 2 % 2;
        int i2 = component4 + 39;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        throw null;
    }

    public final String getErrorMessage() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 39;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 77;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<BillAccountUiModel> getFrequentBills() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 39;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        List<BillAccountUiModel> list = this.component3;
        int i4 = i3 + 37;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    static {
        if (83 % 2 == 0) {
            int i = 30 / 0;
        }
    }

    public FrequentBillsUiState() {
        this(false, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FrequentBillsUiState copy$default(FrequentBillsUiState frequentBillsUiState, boolean z, String str, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4;
        int i4 = i3 + 39;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            int i5 = i3 + 21;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            z = frequentBillsUiState.component2;
        }
        if ((i & 2) != 0) {
            int i7 = getAsAtTimestamp + 3;
            component4 = i7 % 128;
            int i8 = i7 % 2;
            str = frequentBillsUiState.ShareDataUIState;
        }
        if ((i & 4) != 0) {
            int i9 = component4 + 73;
            getAsAtTimestamp = i9 % 128;
            if (i9 % 2 != 0) {
                List<BillAccountUiModel> list2 = frequentBillsUiState.component3;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            list = frequentBillsUiState.component3;
        }
        FrequentBillsUiState frequentBillsUiStateCopy = frequentBillsUiState.copy(z, str, list);
        int i10 = getAsAtTimestamp + 27;
        component4 = i10 % 128;
        int i11 = i10 % 2;
        return frequentBillsUiStateCopy;
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 91;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.component2;
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        return z;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 27;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<BillAccountUiModel> component3() {
        int i = 2 % 2;
        int i2 = component4 + 115;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        List<BillAccountUiModel> list = this.component3;
        int i4 = i3 + 43;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final FrequentBillsUiState copy(boolean loading, String errorMessage, List<BillAccountUiModel> frequentBills) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(frequentBills, "");
        FrequentBillsUiState frequentBillsUiState = new FrequentBillsUiState(loading, errorMessage, frequentBills);
        int i2 = component4 + 97;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return frequentBillsUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 57;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrequentBillsUiState)) {
            int i5 = i2 + 111;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        FrequentBillsUiState frequentBillsUiState = (FrequentBillsUiState) other;
        if (this.component2 != frequentBillsUiState.component2) {
            int i7 = i2 + 125;
            component4 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.ShareDataUIState, frequentBillsUiState.ShareDataUIState)) {
            int i9 = component4 + 41;
            getAsAtTimestamp = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.component3, frequentBillsUiState.component3))) {
            return true;
        }
        int i11 = component4 + 105;
        getAsAtTimestamp = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 77;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = Boolean.hashCode(this.component2);
        String str = this.ShareDataUIState;
        if (str == null) {
            int i4 = component4 + 65;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode) * 31) + this.component3.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FrequentBillsUiState(loading=" + this.component2 + ", errorMessage=" + this.ShareDataUIState + ", frequentBills=" + this.component3 + ")";
        int i2 = component4 + 19;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
