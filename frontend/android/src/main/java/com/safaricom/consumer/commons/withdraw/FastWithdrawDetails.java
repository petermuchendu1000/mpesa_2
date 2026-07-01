package com.safaricom.consumer.commons.withdraw;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\u0013¨\u0006&"}, d2 = {"Lcom/safaricom/consumer/commons/withdraw/FastWithdrawDetails;", "Landroid/os/Parcelable;", "minAmount", "", "maxAmount", "selected", "", "fee", "<init>", "(DDZD)V", "getMinAmount", "()D", "getMaxAmount", "getSelected", "()Z", "setSelected", "(Z)V", "getFee", "setFee", "(D)V", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FastWithdrawDetails implements Parcelable {
    public static final Parcelable.Creator<FastWithdrawDetails> CREATOR = new Creator();
    private double fee;
    private final double maxAmount;
    private final double minAmount;
    private boolean selected;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FastWithdrawDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FastWithdrawDetails createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FastWithdrawDetails(parcel.readDouble(), parcel.readDouble(), parcel.readInt() != 0, parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FastWithdrawDetails[] newArray(int i) {
            return new FastWithdrawDetails[i];
        }
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public FastWithdrawDetails(double d2, double d3, boolean z, double d4) {
        this.minAmount = d2;
        this.maxAmount = d3;
        this.selected = z;
        this.fee = d4;
    }

    public FastWithdrawDetails(double d2, double d3, boolean z, double d4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d2, d3, (i & 4) != 0 ? false : z, (i & 8) != 0 ? 0.0d : d4);
    }

    public final double getMinAmount() {
        return this.minAmount;
    }

    public final double getMaxAmount() {
        return this.maxAmount;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final double getFee() {
        return this.fee;
    }

    public final void setFee(double d2) {
        this.fee = d2;
    }

    public final double getMinAmount() {
        return this.minAmount;
    }

    public final double getMaxAmount() {
        return this.maxAmount;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final double getFee() {
        return this.fee;
    }

    public final FastWithdrawDetails copy(double minAmount, double maxAmount, boolean selected, double fee) {
        return new FastWithdrawDetails(minAmount, maxAmount, selected, fee);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FastWithdrawDetails)) {
            return false;
        }
        FastWithdrawDetails fastWithdrawDetails = (FastWithdrawDetails) other;
        return Double.compare(this.minAmount, fastWithdrawDetails.minAmount) == 0 && Double.compare(this.maxAmount, fastWithdrawDetails.maxAmount) == 0 && this.selected == fastWithdrawDetails.selected && Double.compare(this.fee, fastWithdrawDetails.fee) == 0;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.minAmount) * 31) + Double.hashCode(this.maxAmount)) * 31) + Boolean.hashCode(this.selected)) * 31) + Double.hashCode(this.fee);
    }

    public String toString() {
        return "FastWithdrawDetails(minAmount=" + this.minAmount + ", maxAmount=" + this.maxAmount + ", selected=" + this.selected + ", fee=" + this.fee + ')';
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeDouble(this.minAmount);
        dest.writeDouble(this.maxAmount);
        dest.writeInt(this.selected ? 1 : 0);
        dest.writeDouble(this.fee);
    }
}
