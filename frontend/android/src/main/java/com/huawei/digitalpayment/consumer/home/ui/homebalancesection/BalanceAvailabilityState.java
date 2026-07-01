package com.huawei.digitalpayment.consumer.home.ui.homebalancesection;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J'\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u000f\u001a\u00020\u0010H×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/homebalancesection/BalanceAvailabilityState;", "", "isBalanceAvailable", "", "isBalanceOutdated", "isBalanceVisible", "<init>", "(ZZZ)V", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BalanceAvailabilityState {
    public static final int $stable = 0;
    private static int component1 = 0;
    private static int component3 = 5 % 128;
    private static int copy = 0;
    private static int getRequestBeneficiariesState = 1;
    private final boolean ShareDataUIState;
    private final boolean component2;
    private final boolean copydefault;

    public BalanceAvailabilityState(boolean z, boolean z2, boolean z3) {
        this.component2 = z;
        this.ShareDataUIState = z2;
        this.copydefault = z3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BalanceAvailabilityState(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = getRequestBeneficiariesState + 103;
            copy = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z = true;
        }
        if ((i & 2) != 0) {
            int i5 = copy + 19;
            getRequestBeneficiariesState = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            z2 = false;
        }
        this(z, z2, (i & 4) != 0 ? true : z3);
    }

    public final boolean isBalanceAvailable() {
        int i = 2 % 2;
        int i2 = copy + 95;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.component2;
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
        return z;
    }

    public final boolean isBalanceOutdated() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 7;
        copy = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.ShareDataUIState;
        if (i3 != 0) {
            int i4 = 48 / 0;
        }
        return z;
    }

    public final boolean isBalanceVisible() {
        int i = 2 % 2;
        int i2 = copy + 123;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        boolean z = this.copydefault;
        int i5 = i3 + 51;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        if (5 % 2 == 0) {
            int i = 57 / 0;
        }
    }

    public BalanceAvailabilityState() {
        this(false, false, false, 7, null);
    }

    public static BalanceAvailabilityState copy$default(BalanceAvailabilityState balanceAvailabilityState, boolean z, boolean z2, boolean z3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState;
        int i4 = i3 + 99;
        copy = i4 % 128;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            z = balanceAvailabilityState.component2;
        }
        if ((i & 2) != 0) {
            int i5 = i3 + 113;
            copy = i5 % 128;
            if (i5 % 2 != 0) {
                boolean z4 = balanceAvailabilityState.ShareDataUIState;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            z2 = balanceAvailabilityState.ShareDataUIState;
        }
        if ((i & 4) != 0) {
            z3 = balanceAvailabilityState.copydefault;
            int i6 = copy + 3;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
        }
        return balanceAvailabilityState.copy(z, z2, z3);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = copy + 25;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.component2;
        int i4 = i3 + 121;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean component2() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 95;
        copy = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i2 + 77;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean component3() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 69;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final BalanceAvailabilityState copy(boolean isBalanceAvailable, boolean isBalanceOutdated, boolean isBalanceVisible) {
        int i = 2 % 2;
        BalanceAvailabilityState balanceAvailabilityState = new BalanceAvailabilityState(isBalanceAvailable, isBalanceOutdated, isBalanceVisible);
        int i2 = copy + 13;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return balanceAvailabilityState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copy + 65;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof BalanceAvailabilityState)) {
            return false;
        }
        BalanceAvailabilityState balanceAvailabilityState = (BalanceAvailabilityState) other;
        if (this.component2 == balanceAvailabilityState.component2) {
            return this.ShareDataUIState == balanceAvailabilityState.ShareDataUIState && this.copydefault == balanceAvailabilityState.copydefault;
        }
        int i4 = copy + 55;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 121;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Boolean.hashCode(this.component2) * 31) + Boolean.hashCode(this.ShareDataUIState)) * 31) + Boolean.hashCode(this.copydefault);
        int i4 = copy + 7;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BalanceAvailabilityState(isBalanceAvailable=" + this.component2 + ", isBalanceOutdated=" + this.ShareDataUIState + ", isBalanceVisible=" + this.copydefault + ")";
        int i2 = getRequestBeneficiariesState + 75;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
