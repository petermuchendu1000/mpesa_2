package com.huawei.digitalpayment.consumer.home.ui.homebalancesection;

import com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model.UsageConsumptionDetailsUIModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0014H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/homebalancesection/GsmBalancesUiState;", "", "balances", "", "Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/UsageConsumptionDetailsUIModel;", "isCached", "", "<init>", "(Ljava/util/List;Z)V", "getBalances", "()Ljava/util/List;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GsmBalancesUiState {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 11 % 128;
    private static int copydefault = 0;
    private static int getRequestBeneficiariesState = 1;
    private final boolean component2;
    private final List<UsageConsumptionDetailsUIModel> component3;

    public GsmBalancesUiState(List<UsageConsumptionDetailsUIModel> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        this.component3 = list;
        this.component2 = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GsmBalancesUiState(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            list = CollectionsKt.emptyList();
            int i2 = 2 % 2;
        }
        if ((i & 2) != 0) {
            int i3 = copydefault + 77;
            int i4 = i3 % 128;
            getRequestBeneficiariesState = i4;
            z = !(i3 % 2 != 0);
            int i5 = i4 + 69;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 % 4;
            } else {
                int i7 = 2 % 2;
            }
        }
        this(list, z);
    }

    public final List<UsageConsumptionDetailsUIModel> getBalances() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 115;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        List<UsageConsumptionDetailsUIModel> list = this.component3;
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
        return list;
    }

    public final boolean isCached() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 41;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.component2;
        int i5 = i2 + 7;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    static {
        int i = 11 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GsmBalancesUiState() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static GsmBalancesUiState copy$default(GsmBalancesUiState gsmBalancesUiState, List list, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            list = gsmBalancesUiState.component3;
        }
        if ((i & 2) != 0) {
            int i3 = copydefault + 39;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            z = gsmBalancesUiState.component2;
        }
        GsmBalancesUiState gsmBalancesUiStateCopy = gsmBalancesUiState.copy(list, z);
        int i5 = copydefault + 19;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return gsmBalancesUiStateCopy;
    }

    public final List<UsageConsumptionDetailsUIModel> component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 99;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        List<UsageConsumptionDetailsUIModel> list = this.component3;
        int i5 = i2 + 99;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final boolean component2() {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        boolean z = this.component2;
        int i5 = i3 + 87;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final GsmBalancesUiState copy(List<UsageConsumptionDetailsUIModel> balances, boolean isCached) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(balances, "");
        GsmBalancesUiState gsmBalancesUiState = new GsmBalancesUiState(balances, isCached);
        int i2 = copydefault + 7;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return gsmBalancesUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 53;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        if (this != other) {
            if (!(other instanceof GsmBalancesUiState)) {
                return false;
            }
            GsmBalancesUiState gsmBalancesUiState = (GsmBalancesUiState) other;
            return !(Intrinsics.areEqual(this.component3, gsmBalancesUiState.component3) ^ true) && this.component2 == gsmBalancesUiState.component2;
        }
        int i5 = i2 + 75;
        int i6 = i5 % 128;
        getRequestBeneficiariesState = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 3;
        copydefault = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 23;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.component3.hashCode();
        return i3 != 0 ? (iHashCode % 37) * Boolean.hashCode(this.component2) : (iHashCode * 31) + Boolean.hashCode(this.component2);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GsmBalancesUiState(balances=" + this.component3 + ", isCached=" + this.component2 + ")";
        int i2 = copydefault + 21;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 28 / 0;
        }
        return str;
    }
}
