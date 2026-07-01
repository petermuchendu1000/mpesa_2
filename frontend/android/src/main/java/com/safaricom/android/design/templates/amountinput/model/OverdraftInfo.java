package com.safaricom.android.design.templates.amountinput.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003JP\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÇ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010#\u001a\u00020$H×\u0001J\t\u0010%\u001a\u00020\bH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014¨\u0006&"}, d2 = {"Lcom/safaricom/android/design/templates/amountinput/model/OverdraftInfo;", "", "balance", "", "isActive", "", "limit", "currency", "", "dueAmount", "dueDate", "<init>", "(DZLjava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V", "getBalance", "()D", "()Z", "getLimit", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCurrency", "()Ljava/lang/String;", "getDueAmount", "setDueAmount", "(Ljava/lang/Double;)V", "getDueDate", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(DZLjava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)Lcom/safaricom/android/design/templates/amountinput/model/OverdraftInfo;", "equals", "other", "hashCode", "", "toString", "ConsumerSfcAmountInput_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OverdraftInfo {
    public static final int $stable = 8;
    private final String ShareDataUIState;
    private final String component1;
    private final boolean component2;
    private Double component3;
    private final Double component4;
    private final double copydefault;

    public OverdraftInfo(double d2, boolean z, Double d3, String str, Double d4, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = d2;
        this.component2 = z;
        this.component4 = d3;
        this.ShareDataUIState = str;
        this.component3 = d4;
        this.component1 = str2;
    }

    public OverdraftInfo(double d2, boolean z, Double d3, String str, Double d4, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d2, z, d3, str, (i & 16) != 0 ? null : d4, (i & 32) != 0 ? null : str2);
    }

    public final double getBalance() {
        return this.copydefault;
    }

    public final boolean isActive() {
        return this.component2;
    }

    public final Double getLimit() {
        return this.component4;
    }

    public final String getCurrency() {
        return this.ShareDataUIState;
    }

    public final Double getDueAmount() {
        return this.component3;
    }

    public final void setDueAmount(Double d2) {
        this.component3 = d2;
    }

    public final String getDueDate() {
        return this.component1;
    }

    public final double getCopydefault() {
        return this.copydefault;
    }

    public final boolean getComponent2() {
        return this.component2;
    }

    public final Double getComponent4() {
        return this.component4;
    }

    public final String getShareDataUIState() {
        return this.ShareDataUIState;
    }

    public final Double getComponent3() {
        return this.component3;
    }

    public final String getComponent1() {
        return this.component1;
    }

    public final OverdraftInfo copy(double balance, boolean isActive, Double limit, String currency, Double dueAmount, String dueDate) {
        Intrinsics.checkNotNullParameter(currency, "");
        return new OverdraftInfo(balance, isActive, limit, currency, dueAmount, dueDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OverdraftInfo)) {
            return false;
        }
        OverdraftInfo overdraftInfo = (OverdraftInfo) other;
        return Double.compare(this.copydefault, overdraftInfo.copydefault) == 0 && this.component2 == overdraftInfo.component2 && Intrinsics.areEqual((Object) this.component4, (Object) overdraftInfo.component4) && Intrinsics.areEqual(this.ShareDataUIState, overdraftInfo.ShareDataUIState) && Intrinsics.areEqual((Object) this.component3, (Object) overdraftInfo.component3) && Intrinsics.areEqual(this.component1, overdraftInfo.component1);
    }

    public int hashCode() {
        int iHashCode = Double.hashCode(this.copydefault);
        int iHashCode2 = Boolean.hashCode(this.component2);
        Double d2 = this.component4;
        int iHashCode3 = d2 == null ? 0 : d2.hashCode();
        int iHashCode4 = this.ShareDataUIState.hashCode();
        Double d3 = this.component3;
        int iHashCode5 = d3 == null ? 0 : d3.hashCode();
        String str = this.component1;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "OverdraftInfo(balance=" + this.copydefault + ", isActive=" + this.component2 + ", limit=" + this.component4 + ", currency=" + this.ShareDataUIState + ", dueAmount=" + this.component3 + ", dueDate=" + this.component1 + ')';
    }
}
