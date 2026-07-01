package com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.dashboard;

import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.BillAccountUiModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\t\u0010\u0019\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/dashboard/BillAccountsUiState;", "", "loading", "", "errorMessage", "", "billAccounts", "", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/BillAccountUiModel;", "<init>", "(ZLjava/lang/String;Ljava/util/List;)V", "getLoading", "()Z", "getErrorMessage", "()Ljava/lang/String;", "getBillAccounts", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BillAccountsUiState {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component4 = 1;
    private static int copydefault = 1;
    private static int getRequestBeneficiariesState;
    private final String component1;
    private final boolean component2;
    private final List<BillAccountUiModel> component3;

    public BillAccountsUiState(boolean z, String str, List<BillAccountUiModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.component2 = z;
        this.component1 = str;
        this.component3 = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BillAccountsUiState(boolean z, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component4 + 49;
            int i3 = i2 % 128;
            getRequestBeneficiariesState = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 17;
            component4 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            z = false;
        }
        str = (i & 2) != 0 ? null : str;
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
            int i7 = 2 % 2;
        }
        this(z, str, list);
    }

    public final boolean getLoading() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 101;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.component2;
        int i5 = i2 + 101;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getErrorMessage() {
        String str;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 91;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 == 0) {
            str = this.component1;
            int i4 = 70 / 0;
        } else {
            str = this.component1;
        }
        int i5 = i3 + 11;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<BillAccountUiModel> getBillAccounts() {
        int i = 2 % 2;
        int i2 = component4 + 47;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        List<BillAccountUiModel> list = this.component3;
        int i5 = i3 + 121;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static {
        int i = 1 + 55;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public BillAccountsUiState() {
        this(false, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BillAccountsUiState copy$default(BillAccountsUiState billAccountsUiState, boolean z, String str, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 57;
        int i4 = i3 % 128;
        component4 = i4;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            z = billAccountsUiState.component2;
        }
        if ((i & 2) != 0) {
            str = billAccountsUiState.component1;
        }
        if ((i & 4) != 0) {
            int i5 = i4 + 15;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            list = billAccountsUiState.component3;
        }
        return billAccountsUiState.copy(z, str, list);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 3;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.component2;
        int i5 = i2 + 33;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component4 + 23;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.component1;
        int i4 = i3 + 17;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final List<BillAccountUiModel> component3() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 33;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<BillAccountUiModel> list = this.component3;
        int i4 = i2 + 79;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
        return list;
    }

    public final BillAccountsUiState copy(boolean loading, String errorMessage, List<BillAccountUiModel> billAccounts) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(billAccounts, "");
        BillAccountsUiState billAccountsUiState = new BillAccountsUiState(loading, errorMessage, billAccounts);
        int i2 = component4 + 111;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return billAccountsUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component4 + 75;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof BillAccountsUiState)) {
            int i4 = component4;
            int i5 = i4 + 19;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 113;
            getRequestBeneficiariesState = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 74 / 0;
            }
            return false;
        }
        BillAccountsUiState billAccountsUiState = (BillAccountsUiState) other;
        if (this.component2 != billAccountsUiState.component2 || (!Intrinsics.areEqual(this.component1, billAccountsUiState.component1))) {
            return false;
        }
        if (Intrinsics.areEqual(this.component3, billAccountsUiState.component3)) {
            return true;
        }
        int i9 = component4 + 23;
        int i10 = i9 % 128;
        getRequestBeneficiariesState = i10;
        boolean z = i9 % 2 != 0;
        int i11 = i10 + 83;
        component4 = i11 % 128;
        if (i11 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 125;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = Boolean.hashCode(this.component2);
        String str = this.component1;
        if (str == null) {
            int i4 = component4 + 1;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode) * 31) + this.component3.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BillAccountsUiState(loading=" + this.component2 + ", errorMessage=" + this.component1 + ", billAccounts=" + this.component3 + ")";
        int i2 = component4 + 125;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
