package com.safaricom.sharedui.compose.amountinput;

import android.os.Parcel;
import android.os.Parcelable;
import com.safaricom.consumer.commons.amountvalidation.AmountViewModel;
import com.safaricom.consumer.commons.util.TextResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u001b\u001a\u00020\u0005J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003J[\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\rHÇ\u0001J\b\u0010%\u001a\u00020&H\u0007J\u0013\u0010'\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010)H×\u0003J\t\u0010*\u001a\u00020&H×\u0001J\t\u0010+\u001a\u00020\u0003H×\u0001J\u0018\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020&H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u00061"}, d2 = {"Lcom/safaricom/sharedui/compose/amountinput/AmountStatus;", "Landroid/os/Parcelable;", "amount", "", "hasError", "", "isAmountEditable", "errorMessage", "Lcom/safaricom/consumer/commons/util/TextResource;", "amountAboveCurrentBalance", "amountAboveCurrentOverdrawBalance", "useOverdraftBalance", "errorType", "Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountErrorType;", "<init>", "(Ljava/lang/String;ZZLcom/safaricom/consumer/commons/util/TextResource;ZZZLcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountErrorType;)V", "getAmount", "()Ljava/lang/String;", "getHasError", "()Z", "getErrorMessage", "()Lcom/safaricom/consumer/commons/util/TextResource;", "getAmountAboveCurrentBalance", "getAmountAboveCurrentOverdrawBalance", "getUseOverdraftBalance", "getErrorType", "()Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountErrorType;", "isValid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AmountStatus implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AmountStatus> CREATOR = new Creator();
    private final String amount;
    private final boolean amountAboveCurrentBalance;
    private final boolean amountAboveCurrentOverdrawBalance;
    private final TextResource errorMessage;
    private final AmountViewModel.AmountErrorType errorType;
    private final boolean hasError;
    private final boolean isAmountEditable;
    private final boolean useOverdraftBalance;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AmountStatus> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final AmountStatus createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AmountStatus(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (TextResource) parcel.readParcelable(AmountStatus.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, AmountViewModel.AmountErrorType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final AmountStatus[] newArray(int i) {
            return new AmountStatus[i];
        }
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public AmountStatus(String str, boolean z, boolean z2, TextResource textResource, boolean z3, boolean z4, boolean z5, AmountViewModel.AmountErrorType amountErrorType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(amountErrorType, "");
        this.amount = str;
        this.hasError = z;
        this.isAmountEditable = z2;
        this.errorMessage = textResource;
        this.amountAboveCurrentBalance = z3;
        this.amountAboveCurrentOverdrawBalance = z4;
        this.useOverdraftBalance = z5;
        this.errorType = amountErrorType;
    }

    public AmountStatus(String str, boolean z, boolean z2, TextResource textResource, boolean z3, boolean z4, boolean z5, AmountViewModel.AmountErrorType amountErrorType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? null : textResource, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4, (i & 64) == 0 ? z5 : false, (i & 128) != 0 ? AmountViewModel.AmountErrorType.NO_ERROR : amountErrorType);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final boolean getHasError() {
        return this.hasError;
    }

    public final boolean isAmountEditable() {
        return this.isAmountEditable;
    }

    public final TextResource getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean getAmountAboveCurrentBalance() {
        return this.amountAboveCurrentBalance;
    }

    public final boolean getAmountAboveCurrentOverdrawBalance() {
        return this.amountAboveCurrentOverdrawBalance;
    }

    public final boolean getUseOverdraftBalance() {
        return this.useOverdraftBalance;
    }

    public final AmountViewModel.AmountErrorType getErrorType() {
        return this.errorType;
    }

    public final boolean isValid() {
        return this.amount.length() > 0 && !this.hasError;
    }

    public AmountStatus() {
        this(null, false, false, null, false, false, false, null, 255, null);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final boolean getHasError() {
        return this.hasError;
    }

    public final boolean getIsAmountEditable() {
        return this.isAmountEditable;
    }

    public final TextResource getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean getAmountAboveCurrentBalance() {
        return this.amountAboveCurrentBalance;
    }

    public final boolean getAmountAboveCurrentOverdrawBalance() {
        return this.amountAboveCurrentOverdrawBalance;
    }

    public final boolean getUseOverdraftBalance() {
        return this.useOverdraftBalance;
    }

    public final AmountViewModel.AmountErrorType getErrorType() {
        return this.errorType;
    }

    public final AmountStatus copy(String amount, boolean hasError, boolean isAmountEditable, TextResource errorMessage, boolean amountAboveCurrentBalance, boolean amountAboveCurrentOverdrawBalance, boolean useOverdraftBalance, AmountViewModel.AmountErrorType errorType) {
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(errorType, "");
        return new AmountStatus(amount, hasError, isAmountEditable, errorMessage, amountAboveCurrentBalance, amountAboveCurrentOverdrawBalance, useOverdraftBalance, errorType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AmountStatus)) {
            return false;
        }
        AmountStatus amountStatus = (AmountStatus) other;
        return Intrinsics.areEqual(this.amount, amountStatus.amount) && this.hasError == amountStatus.hasError && this.isAmountEditable == amountStatus.isAmountEditable && Intrinsics.areEqual(this.errorMessage, amountStatus.errorMessage) && this.amountAboveCurrentBalance == amountStatus.amountAboveCurrentBalance && this.amountAboveCurrentOverdrawBalance == amountStatus.amountAboveCurrentOverdrawBalance && this.useOverdraftBalance == amountStatus.useOverdraftBalance && this.errorType == amountStatus.errorType;
    }

    public int hashCode() {
        int iHashCode = this.amount.hashCode();
        int iHashCode2 = Boolean.hashCode(this.hasError);
        int iHashCode3 = Boolean.hashCode(this.isAmountEditable);
        TextResource textResource = this.errorMessage;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (textResource == null ? 0 : textResource.hashCode())) * 31) + Boolean.hashCode(this.amountAboveCurrentBalance)) * 31) + Boolean.hashCode(this.amountAboveCurrentOverdrawBalance)) * 31) + Boolean.hashCode(this.useOverdraftBalance)) * 31) + this.errorType.hashCode();
    }

    public String toString() {
        return "AmountStatus(amount=" + this.amount + ", hasError=" + this.hasError + ", isAmountEditable=" + this.isAmountEditable + ", errorMessage=" + this.errorMessage + ", amountAboveCurrentBalance=" + this.amountAboveCurrentBalance + ", amountAboveCurrentOverdrawBalance=" + this.amountAboveCurrentOverdrawBalance + ", useOverdraftBalance=" + this.useOverdraftBalance + ", errorType=" + this.errorType + ')';
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.amount);
        dest.writeInt(this.hasError ? 1 : 0);
        dest.writeInt(this.isAmountEditable ? 1 : 0);
        dest.writeParcelable(this.errorMessage, flags);
        dest.writeInt(this.amountAboveCurrentBalance ? 1 : 0);
        dest.writeInt(this.amountAboveCurrentOverdrawBalance ? 1 : 0);
        dest.writeInt(this.useOverdraftBalance ? 1 : 0);
        dest.writeString(this.errorType.name());
    }
}
