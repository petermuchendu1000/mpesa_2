package com.safaricom.sharedui.compose.amountinput;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÇ\u0001J\b\u0010\u001e\u001a\u00020\u001fH\u0007J\u0013\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\"H×\u0003J\t\u0010#\u001a\u00020\u001fH×\u0001J\t\u0010$\u001a\u00020\u0006H×\u0001J\u0018\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014¨\u0006*"}, d2 = {"Lcom/safaricom/sharedui/compose/amountinput/BalancesStatus;", "Landroid/os/Parcelable;", "mpesaBalance", "", "overdraftBalance", "displayCurrency", "", "useOverdraft", "", "shouldHideBalances", "isBalanceOutdated", "isMainWalletBalance", "<init>", "(DDLjava/lang/String;ZZZZ)V", "getMpesaBalance", "()D", "getOverdraftBalance", "getDisplayCurrency", "()Ljava/lang/String;", "getUseOverdraft", "()Z", "getShouldHideBalances", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BalancesStatus implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BalancesStatus> CREATOR = new Creator();
    private final String displayCurrency;
    private final boolean isBalanceOutdated;
    private final boolean isMainWalletBalance;
    private final double mpesaBalance;
    private final double overdraftBalance;
    private final boolean shouldHideBalances;
    private final boolean useOverdraft;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BalancesStatus> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BalancesStatus createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BalancesStatus(parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BalancesStatus[] newArray(int i) {
            return new BalancesStatus[i];
        }
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public BalancesStatus(double d2, double d3, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mpesaBalance = d2;
        this.overdraftBalance = d3;
        this.displayCurrency = str;
        this.useOverdraft = z;
        this.shouldHideBalances = z2;
        this.isBalanceOutdated = z3;
        this.isMainWalletBalance = z4;
    }

    public final double getMpesaBalance() {
        return this.mpesaBalance;
    }

    public final double getOverdraftBalance() {
        return this.overdraftBalance;
    }

    public BalancesStatus(double d2, double d3, String str, boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d2, (i & 2) == 0 ? d3 : 0.0d, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) == 0 ? z3 : false, (i & 64) != 0 ? true : z4);
    }

    public final String getDisplayCurrency() {
        return this.displayCurrency;
    }

    public final boolean getUseOverdraft() {
        return this.useOverdraft;
    }

    public final boolean getShouldHideBalances() {
        return this.shouldHideBalances;
    }

    public final boolean isBalanceOutdated() {
        return this.isBalanceOutdated;
    }

    public final boolean isMainWalletBalance() {
        return this.isMainWalletBalance;
    }

    public BalancesStatus() {
        this(0.0d, 0.0d, null, false, false, false, false, 127, null);
    }

    public final double getMpesaBalance() {
        return this.mpesaBalance;
    }

    public final double getOverdraftBalance() {
        return this.overdraftBalance;
    }

    public final String getDisplayCurrency() {
        return this.displayCurrency;
    }

    public final boolean getUseOverdraft() {
        return this.useOverdraft;
    }

    public final boolean getShouldHideBalances() {
        return this.shouldHideBalances;
    }

    public final boolean getIsBalanceOutdated() {
        return this.isBalanceOutdated;
    }

    public final boolean getIsMainWalletBalance() {
        return this.isMainWalletBalance;
    }

    public final BalancesStatus copy(double mpesaBalance, double overdraftBalance, String displayCurrency, boolean useOverdraft, boolean shouldHideBalances, boolean isBalanceOutdated, boolean isMainWalletBalance) {
        Intrinsics.checkNotNullParameter(displayCurrency, "");
        return new BalancesStatus(mpesaBalance, overdraftBalance, displayCurrency, useOverdraft, shouldHideBalances, isBalanceOutdated, isMainWalletBalance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BalancesStatus)) {
            return false;
        }
        BalancesStatus balancesStatus = (BalancesStatus) other;
        return Double.compare(this.mpesaBalance, balancesStatus.mpesaBalance) == 0 && Double.compare(this.overdraftBalance, balancesStatus.overdraftBalance) == 0 && Intrinsics.areEqual(this.displayCurrency, balancesStatus.displayCurrency) && this.useOverdraft == balancesStatus.useOverdraft && this.shouldHideBalances == balancesStatus.shouldHideBalances && this.isBalanceOutdated == balancesStatus.isBalanceOutdated && this.isMainWalletBalance == balancesStatus.isMainWalletBalance;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.mpesaBalance) * 31) + Double.hashCode(this.overdraftBalance)) * 31) + this.displayCurrency.hashCode()) * 31) + Boolean.hashCode(this.useOverdraft)) * 31) + Boolean.hashCode(this.shouldHideBalances)) * 31) + Boolean.hashCode(this.isBalanceOutdated)) * 31) + Boolean.hashCode(this.isMainWalletBalance);
    }

    public String toString() {
        return "BalancesStatus(mpesaBalance=" + this.mpesaBalance + ", overdraftBalance=" + this.overdraftBalance + ", displayCurrency=" + this.displayCurrency + ", useOverdraft=" + this.useOverdraft + ", shouldHideBalances=" + this.shouldHideBalances + ", isBalanceOutdated=" + this.isBalanceOutdated + ", isMainWalletBalance=" + this.isMainWalletBalance + ')';
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeDouble(this.mpesaBalance);
        dest.writeDouble(this.overdraftBalance);
        dest.writeString(this.displayCurrency);
        dest.writeInt(this.useOverdraft ? 1 : 0);
        dest.writeInt(this.shouldHideBalances ? 1 : 0);
        dest.writeInt(this.isBalanceOutdated ? 1 : 0);
        dest.writeInt(this.isMainWalletBalance ? 1 : 0);
    }
}
