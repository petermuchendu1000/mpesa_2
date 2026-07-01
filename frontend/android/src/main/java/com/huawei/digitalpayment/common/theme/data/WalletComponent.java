package com.huawei.digitalpayment.common.theme.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/WalletComponent;", "Lcom/huawei/digitalpayment/common/theme/data/BalanceComponent;", "canHideBalance", "", "functions", "", "Lcom/huawei/digitalpayment/common/theme/data/FunctionResp;", "filterFunctions", "<init>", "(ZLjava/util/List;Ljava/util/List;)V", "getCanHideBalance", "()Z", "setCanHideBalance", "(Z)V", "getFunctions", "()Ljava/util/List;", "setFunctions", "(Ljava/util/List;)V", "getFilterFunctions", "setFilterFunctions", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WalletComponent extends BalanceComponent {
    private static int component1 = 1;
    private static int component3;
    private boolean canHideBalance;
    private List<? extends FunctionResp> filterFunctions;
    private List<? extends FunctionResp> functions;

    /* JADX WARN: Illegal instructions before constructor call */
    public WalletComponent(boolean z, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component1 + 97;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        }
        if ((i & 2) != 0) {
            int i4 = component3 + 63;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            list = null;
        }
        if ((i & 4) != 0) {
            int i7 = component1 + 41;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            list2 = null;
        }
        this(z, list, list2);
    }

    public final boolean getCanHideBalance() {
        int i = 2 % 2;
        int i2 = component1 + 109;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.canHideBalance;
        int i4 = i3 + 9;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final void setCanHideBalance(boolean z) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 9;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.canHideBalance = z;
        int i5 = i2 + 75;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<FunctionResp> getFunctions() {
        int i = 2 % 2;
        int i2 = component1 + 99;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        List list = this.functions;
        int i5 = i3 + 77;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final void setFunctions(List<? extends FunctionResp> list) {
        int i = 2 % 2;
        int i2 = component3 + 119;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.functions = list;
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
    }

    public final List<FunctionResp> getFilterFunctions() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 19;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        List list = this.filterFunctions;
        int i5 = i2 + 81;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setFilterFunctions(List<? extends FunctionResp> list) {
        int i = 2 % 2;
        int i2 = component1 + 97;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.filterFunctions = list;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public WalletComponent(boolean z, List<? extends FunctionResp> list, List<? extends FunctionResp> list2) {
        super(null, null, null, null, null, null, null, null, 255, null);
        this.canHideBalance = z;
        this.functions = list;
        this.filterFunctions = list2;
    }

    public WalletComponent() {
        this(false, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static WalletComponent copy$default(WalletComponent walletComponent, boolean z, List list, List list2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 21;
        int i4 = i3 % 128;
        component3 = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            z = walletComponent.canHideBalance;
            int i5 = i4 + 35;
            component1 = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 2) != 0) {
            list = walletComponent.functions;
            int i7 = i4 + 91;
            component1 = i7 % 128;
            int i8 = i7 % 2;
        }
        if ((i & 4) != 0) {
            list2 = walletComponent.filterFunctions;
        }
        return walletComponent.copy(z, list, list2);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = component3 + 5;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        boolean z = this.canHideBalance;
        int i5 = i3 + 59;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final List<FunctionResp> component2() {
        int i = 2 % 2;
        int i2 = component3 + 89;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        List list = this.functions;
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        return list;
    }

    public final List<FunctionResp> component3() {
        int i = 2 % 2;
        int i2 = component1 + 105;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.filterFunctions;
        }
        throw null;
    }

    public final WalletComponent copy(boolean canHideBalance, List<? extends FunctionResp> functions, List<? extends FunctionResp> filterFunctions) {
        int i = 2 % 2;
        WalletComponent walletComponent = new WalletComponent(canHideBalance, functions, filterFunctions);
        int i2 = component1 + 1;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return walletComponent;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3;
            int i3 = i2 + 119;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 9;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(other instanceof WalletComponent)) {
            return false;
        }
        WalletComponent walletComponent = (WalletComponent) other;
        if (this.canHideBalance == walletComponent.canHideBalance) {
            return Intrinsics.areEqual(this.functions, walletComponent.functions) && Intrinsics.areEqual(this.filterFunctions, walletComponent.filterFunctions);
        }
        int i6 = component1 + 5;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        List<? extends FunctionResp> list;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = component3 + 17;
        component1 = i2 % 128;
        int iHashCode3 = 0;
        if (i2 % 2 == 0) {
            iHashCode = Boolean.hashCode(this.canHideBalance);
            list = this.functions;
            iHashCode2 = 1;
            if (list != null) {
                iHashCode3 = 1;
                iHashCode2 = iHashCode3;
                iHashCode3 = list.hashCode();
            }
        } else {
            iHashCode = Boolean.hashCode(this.canHideBalance);
            list = this.functions;
            if (list == null) {
                iHashCode2 = 0;
            } else {
                iHashCode2 = iHashCode3;
                iHashCode3 = list.hashCode();
            }
        }
        List<? extends FunctionResp> list2 = this.filterFunctions;
        if (list2 != null) {
            iHashCode2 = list2.hashCode();
        }
        int i3 = (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
        int i4 = component3 + 93;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return i3;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "WalletComponent(canHideBalance=" + this.canHideBalance + ", functions=" + this.functions + ", filterFunctions=" + this.filterFunctions + ")";
        int i2 = component3 + 49;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
