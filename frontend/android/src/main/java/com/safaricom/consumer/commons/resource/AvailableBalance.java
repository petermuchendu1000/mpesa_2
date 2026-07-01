package com.safaricom.consumer.commons.resource;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/safaricom/consumer/commons/resource/AvailableBalance;", "Landroid/os/Parcelable;", "amount", "", "currency", "", "<init>", "(DLjava/lang/String;)V", "getAmount", "()D", "getCurrency", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AvailableBalance implements Parcelable {
    public static final Parcelable.Creator<AvailableBalance> CREATOR = new Creator();

    @SerializedName("amount")
    private final double amount;

    @SerializedName("currency")
    private final String currency;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AvailableBalance> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final AvailableBalance createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AvailableBalance(parcel.readDouble(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final AvailableBalance[] newArray(int i) {
            return new AvailableBalance[i];
        }
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public AvailableBalance(double d2, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amount = d2;
        this.currency = str;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public static AvailableBalance copy$default(AvailableBalance availableBalance, double d2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d2 = availableBalance.amount;
        }
        if ((i & 2) != 0) {
            str = availableBalance.currency;
        }
        return availableBalance.copy(d2, str);
    }

    public final double getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final AvailableBalance copy(double amount, String currency) {
        Intrinsics.checkNotNullParameter(currency, "");
        return new AvailableBalance(amount, currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableBalance)) {
            return false;
        }
        AvailableBalance availableBalance = (AvailableBalance) other;
        return Double.compare(this.amount, availableBalance.amount) == 0 && Intrinsics.areEqual(this.currency, availableBalance.currency);
    }

    public int hashCode() {
        return (Double.hashCode(this.amount) * 31) + this.currency.hashCode();
    }

    public String toString() {
        return "AvailableBalance(amount=" + this.amount + ", currency=" + this.currency + ')';
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeDouble(this.amount);
        dest.writeString(this.currency);
    }
}
