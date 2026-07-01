package com.safaricom.android.design.templates.amountinput.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001cJ`\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÇ\u0001¢\u0006\u0002\u0010)J\b\u0010*\u001a\u00020\u0006H\u0007J\u0013\u0010+\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010-H×\u0003J\t\u0010.\u001a\u00020\u0006H×\u0001J\t\u0010/\u001a\u00020\u0003H×\u0001J\u0018\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0006H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0017\"\u0004\b\u001a\u0010\u0019R\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u00065"}, d2 = {"Lcom/safaricom/android/design/templates/amountinput/model/Wallet;", "Landroid/os/Parcelable;", "name", "", "shortName", "image", "", "currency", "currencySymbol", "isSelected", "", "isDefault", "balance", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZZLjava/lang/Double;)V", "getName", "()Ljava/lang/String;", "getShortName", "getImage", "()I", "getCurrency", "getCurrencySymbol", "()Z", "setSelected", "(Z)V", "setDefault", "getBalance", "()Ljava/lang/Double;", "setBalance", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZZLjava/lang/Double;)Lcom/safaricom/android/design/templates/amountinput/model/Wallet;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcAmountInput_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Wallet implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Wallet> CREATOR = new Creator();
    private Double balance;
    private final String currency;
    private final String currencySymbol;
    private final int image;
    private boolean isDefault;
    private boolean isSelected;
    private final String name;
    private final String shortName;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Wallet> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Wallet createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Wallet(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Wallet[] newArray(int i) {
            return new Wallet[i];
        }
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public Wallet(String str, String str2, int i, String str3, String str4, boolean z, boolean z2, Double d2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.name = str;
        this.shortName = str2;
        this.image = i;
        this.currency = str3;
        this.currencySymbol = str4;
        this.isSelected = z;
        this.isDefault = z2;
        this.balance = d2;
    }

    public Wallet(String str, String str2, int i, String str3, String str4, boolean z, boolean z2, Double d2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, str3, str4, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? false : z2, (i2 & 128) != 0 ? null : d2);
    }

    public final String getName() {
        return this.name;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public final int getImage() {
        return this.image;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public final void setDefault(boolean z) {
        this.isDefault = z;
    }

    public final Double getBalance() {
        return this.balance;
    }

    public final void setBalance(Double d2) {
        this.balance = d2;
    }

    public final String getName() {
        return this.name;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public final int getImage() {
        return this.image;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final boolean getIsDefault() {
        return this.isDefault;
    }

    public final Double getBalance() {
        return this.balance;
    }

    public final Wallet copy(String name, String shortName, int image, String currency, String currencySymbol, boolean isSelected, boolean isDefault, Double balance) {
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(shortName, "");
        Intrinsics.checkNotNullParameter(currency, "");
        Intrinsics.checkNotNullParameter(currencySymbol, "");
        return new Wallet(name, shortName, image, currency, currencySymbol, isSelected, isDefault, balance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Wallet)) {
            return false;
        }
        Wallet wallet = (Wallet) other;
        return Intrinsics.areEqual(this.name, wallet.name) && Intrinsics.areEqual(this.shortName, wallet.shortName) && this.image == wallet.image && Intrinsics.areEqual(this.currency, wallet.currency) && Intrinsics.areEqual(this.currencySymbol, wallet.currencySymbol) && this.isSelected == wallet.isSelected && this.isDefault == wallet.isDefault && Intrinsics.areEqual((Object) this.balance, (Object) wallet.balance);
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode();
        int iHashCode2 = this.shortName.hashCode();
        int iHashCode3 = Integer.hashCode(this.image);
        int iHashCode4 = this.currency.hashCode();
        int iHashCode5 = this.currencySymbol.hashCode();
        int iHashCode6 = Boolean.hashCode(this.isSelected);
        int iHashCode7 = Boolean.hashCode(this.isDefault);
        Double d2 = this.balance;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (d2 == null ? 0 : d2.hashCode());
    }

    public String toString() {
        return "Wallet(name=" + this.name + ", shortName=" + this.shortName + ", image=" + this.image + ", currency=" + this.currency + ", currencySymbol=" + this.currencySymbol + ", isSelected=" + this.isSelected + ", isDefault=" + this.isDefault + ", balance=" + this.balance + ')';
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.name);
        dest.writeString(this.shortName);
        dest.writeInt(this.image);
        dest.writeString(this.currency);
        dest.writeString(this.currencySymbol);
        dest.writeInt(this.isSelected ? 1 : 0);
        dest.writeInt(this.isDefault ? 1 : 0);
        Double d2 = this.balance;
        if (d2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d2.doubleValue());
        }
    }
}
