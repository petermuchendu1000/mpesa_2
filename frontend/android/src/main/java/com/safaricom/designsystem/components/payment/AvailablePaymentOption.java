package com.safaricom.designsystem.components.payment;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\b\u0010\u0019\u001a\u00020\u001aH\u0007J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH×\u0003J\t\u0010\u001e\u001a\u00020\u001aH×\u0001J\t\u0010\u001f\u001a\u00020\u0005H×\u0001J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006%"}, d2 = {"Lcom/safaricom/designsystem/components/payment/AvailablePaymentOption;", "Landroid/os/Parcelable;", "option", "Lcom/safaricom/designsystem/components/payment/IPaymentOption;", "balance", "", "isOptionSelectable", "", "hasError", "errorMessage", "<init>", "(Lcom/safaricom/designsystem/components/payment/IPaymentOption;Ljava/lang/String;ZZLjava/lang/String;)V", "getOption", "()Lcom/safaricom/designsystem/components/payment/IPaymentOption;", "getBalance", "()Ljava/lang/String;", "()Z", "getHasError", "getErrorMessage", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AvailablePaymentOption implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AvailablePaymentOption> CREATOR = new Creator();
    private final String balance;
    private final String errorMessage;
    private final boolean hasError;
    private final boolean isOptionSelectable;
    private final IPaymentOption option;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AvailablePaymentOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final AvailablePaymentOption createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AvailablePaymentOption((IPaymentOption) parcel.readParcelable(AvailablePaymentOption.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final AvailablePaymentOption[] newArray(int i) {
            return new AvailablePaymentOption[i];
        }
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public AvailablePaymentOption(IPaymentOption iPaymentOption, String str, boolean z, boolean z2, String str2) {
        Intrinsics.checkNotNullParameter(iPaymentOption, "");
        this.option = iPaymentOption;
        this.balance = str;
        this.isOptionSelectable = z;
        this.hasError = z2;
        this.errorMessage = str2;
    }

    public AvailablePaymentOption(IPaymentOption iPaymentOption, String str, boolean z, boolean z2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iPaymentOption, (i & 2) != 0 ? null : str, (i & 4) != 0 ? true : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : str2);
    }

    public final IPaymentOption getOption() {
        return this.option;
    }

    public final String getBalance() {
        return this.balance;
    }

    public final boolean isOptionSelectable() {
        return this.isOptionSelectable;
    }

    public final boolean getHasError() {
        return this.hasError;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public static AvailablePaymentOption copy$default(AvailablePaymentOption availablePaymentOption, IPaymentOption iPaymentOption, String str, boolean z, boolean z2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            iPaymentOption = availablePaymentOption.option;
        }
        if ((i & 2) != 0) {
            str = availablePaymentOption.balance;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            z = availablePaymentOption.isOptionSelectable;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = availablePaymentOption.hasError;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            str2 = availablePaymentOption.errorMessage;
        }
        return availablePaymentOption.copy(iPaymentOption, str3, z3, z4, str2);
    }

    public final IPaymentOption getOption() {
        return this.option;
    }

    public final String getBalance() {
        return this.balance;
    }

    public final boolean getIsOptionSelectable() {
        return this.isOptionSelectable;
    }

    public final boolean getHasError() {
        return this.hasError;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final AvailablePaymentOption copy(IPaymentOption option, String balance, boolean isOptionSelectable, boolean hasError, String errorMessage) {
        Intrinsics.checkNotNullParameter(option, "");
        return new AvailablePaymentOption(option, balance, isOptionSelectable, hasError, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailablePaymentOption)) {
            return false;
        }
        AvailablePaymentOption availablePaymentOption = (AvailablePaymentOption) other;
        return Intrinsics.areEqual(this.option, availablePaymentOption.option) && Intrinsics.areEqual(this.balance, availablePaymentOption.balance) && this.isOptionSelectable == availablePaymentOption.isOptionSelectable && this.hasError == availablePaymentOption.hasError && Intrinsics.areEqual(this.errorMessage, availablePaymentOption.errorMessage);
    }

    public int hashCode() {
        int iHashCode = this.option.hashCode();
        String str = this.balance;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = Boolean.hashCode(this.isOptionSelectable);
        int iHashCode4 = Boolean.hashCode(this.hasError);
        String str2 = this.errorMessage;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "AvailablePaymentOption(option=" + this.option + ", balance=" + this.balance + ", isOptionSelectable=" + this.isOptionSelectable + ", hasError=" + this.hasError + ", errorMessage=" + this.errorMessage + ")";
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeParcelable(this.option, flags);
        dest.writeString(this.balance);
        dest.writeInt(this.isOptionSelectable ? 1 : 0);
        dest.writeInt(this.hasError ? 1 : 0);
        dest.writeString(this.errorMessage);
    }
}
