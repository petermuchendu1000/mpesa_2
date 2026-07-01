package com.huawei.digitalpayment.consumer.sfcui.sambaza.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÇ\u0001J\b\u0010\u001b\u001a\u00020\u001cH\u0007J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH×\u0003J\t\u0010 \u001a\u00020\u001cH×\u0001J\t\u0010!\u001a\u00020\u0006H×\u0001J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013¨\u0006'"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/model/SambazaResourceStatus;", "Landroid/os/Parcelable;", "airtimeBalance", "", "creditLimitBalance", "displayCurrency", "", "shouldHideBalances", "", "isBalanceOutdated", "isMainWalletBalance", "<init>", "(DDLjava/lang/String;ZZZ)V", "getAirtimeBalance", "()D", "getCreditLimitBalance", "getDisplayCurrency", "()Ljava/lang/String;", "getShouldHideBalances", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SambazaResourceStatus implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SambazaResourceStatus> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;
    private final double airtimeBalance;
    private final double creditLimitBalance;
    private final String displayCurrency;
    private final boolean isBalanceOutdated;
    private final boolean isMainWalletBalance;
    private final boolean shouldHideBalances;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SambazaResourceStatus> {
        private static int component1 = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SambazaResourceStatus createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            double d2 = parcel.readDouble();
            double d3 = parcel.readDouble();
            String string = parcel.readString();
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                int i2 = component2 + 103;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 4 / 3;
                }
                z = false;
            }
            if (parcel.readInt() != 0) {
                int i4 = component1 + 101;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            return new SambazaResourceStatus(d2, d3, string, z3, z, z2);
        }

        @Override
        public SambazaResourceStatus createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 19;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SambazaResourceStatus[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 73;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            SambazaResourceStatus[] sambazaResourceStatusArr = new SambazaResourceStatus[i];
            int i6 = i3 + 85;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return sambazaResourceStatusArr;
        }

        @Override
        public SambazaResourceStatus[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 71;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            SambazaResourceStatus[] sambazaResourceStatusArrNewArray = newArray(i);
            int i5 = component1 + 13;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return sambazaResourceStatusArrNewArray;
        }
    }

    public SambazaResourceStatus(double d2, double d3, String str, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.airtimeBalance = d2;
        this.creditLimitBalance = d3;
        this.displayCurrency = str;
        this.shouldHideBalances = z;
        this.isBalanceOutdated = z2;
        this.isMainWalletBalance = z3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SambazaResourceStatus(double d2, double d3, String str, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z4;
        boolean z5;
        double d4 = 0.0d;
        double d5 = (i & 1) != 0 ? 0.0d : d2;
        if ((i & 2) != 0) {
            int i2 = 2 % 2;
        } else {
            d4 = d3;
        }
        String str2 = (i & 4) != 0 ? "" : str;
        if ((i & 8) != 0) {
            int i3 = component1 + 53;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            z4 = true;
        } else {
            z4 = z;
        }
        if ((i & 16) != 0) {
            int i5 = copydefault;
            int i6 = i5 + 57;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 45;
            component1 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 5 % 4;
            } else {
                int i10 = 2 % 2;
            }
            z5 = false;
        } else {
            z5 = z2;
        }
        this(d5, d4, str2, z4, z5, (i & 32) == 0 ? z3 : true);
    }

    public final double getAirtimeBalance() {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.airtimeBalance;
        }
        throw null;
    }

    public final double getCreditLimitBalance() {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        double d2 = this.creditLimitBalance;
        int i5 = i3 + 35;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return d2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getDisplayCurrency() {
        int i = 2 % 2;
        int i2 = component1 + 3;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.displayCurrency;
        int i5 = i3 + 29;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 51 / 0;
        }
        return str;
    }

    public final boolean getShouldHideBalances() {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.shouldHideBalances;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isBalanceOutdated() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 13;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isBalanceOutdated;
        int i5 = i2 + 59;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isMainWalletBalance() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 115;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isMainWalletBalance;
        int i5 = i2 + 103;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component2 + 61;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public SambazaResourceStatus() {
        this(0.0d, 0.0d, null, false, false, false, 63, null);
    }

    public static SambazaResourceStatus copy$default(SambazaResourceStatus sambazaResourceStatus, double d2, double d3, String str, boolean z, boolean z2, boolean z3, int i, Object obj) {
        double d4;
        String str2;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component1 + 51;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            d4 = sambazaResourceStatus.airtimeBalance;
        } else {
            d4 = d2;
        }
        double d5 = (i & 2) != 0 ? sambazaResourceStatus.creditLimitBalance : d3;
        if ((i & 4) != 0) {
            int i5 = component1 + 55;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                String str3 = sambazaResourceStatus.displayCurrency;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str2 = sambazaResourceStatus.displayCurrency;
        } else {
            str2 = str;
        }
        SambazaResourceStatus sambazaResourceStatusCopy = sambazaResourceStatus.copy(d4, d5, str2, (i & 8) != 0 ? sambazaResourceStatus.shouldHideBalances : z, (i & 16) != 0 ? sambazaResourceStatus.isBalanceOutdated : z2, (i & 32) != 0 ? sambazaResourceStatus.isMainWalletBalance : z3);
        int i6 = component1 + 79;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 22 / 0;
        }
        return sambazaResourceStatusCopy;
    }

    public final double component1() {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        double d2 = this.airtimeBalance;
        int i5 = i3 + 39;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 99 / 0;
        }
        return d2;
    }

    public final double component2() {
        int i = 2 % 2;
        int i2 = component1 + 109;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        double d2 = this.creditLimitBalance;
        int i4 = i3 + 41;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
        return d2;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.displayCurrency;
        }
        throw null;
    }

    public final boolean component4() {
        int i = 2 % 2;
        int i2 = component1 + 105;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.shouldHideBalances;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component5() {
        int i = 2 % 2;
        int i2 = component1 + 9;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isBalanceOutdated;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component6() {
        int i = 2 % 2;
        int i2 = copydefault + 109;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        boolean z = this.isMainWalletBalance;
        int i5 = i3 + 37;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final SambazaResourceStatus copy(double airtimeBalance, double creditLimitBalance, String displayCurrency, boolean shouldHideBalances, boolean isBalanceOutdated, boolean isMainWalletBalance) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(displayCurrency, "");
        SambazaResourceStatus sambazaResourceStatus = new SambazaResourceStatus(airtimeBalance, creditLimitBalance, displayCurrency, shouldHideBalances, isBalanceOutdated, isMainWalletBalance);
        int i2 = component1 + 95;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return sambazaResourceStatus;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 17;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 63 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 17;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof SambazaResourceStatus)) {
            return false;
        }
        SambazaResourceStatus sambazaResourceStatus = (SambazaResourceStatus) other;
        Object obj = null;
        if (Double.compare(this.airtimeBalance, sambazaResourceStatus.airtimeBalance) != 0) {
            int i4 = component1;
            int i5 = i4 + 45;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 41;
            copydefault = i7 % 128;
            if (i7 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (Double.compare(this.creditLimitBalance, sambazaResourceStatus.creditLimitBalance) != 0) {
            int i8 = copydefault + 87;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.displayCurrency, sambazaResourceStatus.displayCurrency)) {
            return false;
        }
        if (this.shouldHideBalances == sambazaResourceStatus.shouldHideBalances) {
            return this.isBalanceOutdated == sambazaResourceStatus.isBalanceOutdated && this.isMainWalletBalance == sambazaResourceStatus.isMainWalletBalance;
        }
        int i10 = copydefault + 31;
        component1 = i10 % 128;
        if (i10 % 2 == 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((Double.hashCode(this.airtimeBalance) * 31) + Double.hashCode(this.creditLimitBalance)) * 31) + this.displayCurrency.hashCode()) * 31) + Boolean.hashCode(this.shouldHideBalances)) * 31) + Boolean.hashCode(this.isBalanceOutdated)) * 31) + Boolean.hashCode(this.isMainWalletBalance);
        int i4 = copydefault + 73;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SambazaResourceStatus(airtimeBalance=" + this.airtimeBalance + ", creditLimitBalance=" + this.creditLimitBalance + ", displayCurrency=" + this.displayCurrency + ", shouldHideBalances=" + this.shouldHideBalances + ", isBalanceOutdated=" + this.isBalanceOutdated + ", isMainWalletBalance=" + this.isMainWalletBalance + ")";
        int i2 = component1 + 75;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 3;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeDouble(this.airtimeBalance);
        dest.writeDouble(this.creditLimitBalance);
        dest.writeString(this.displayCurrency);
        dest.writeInt(this.shouldHideBalances ? 1 : 0);
        dest.writeInt(this.isBalanceOutdated ? 1 : 0);
        dest.writeInt(this.isMainWalletBalance ? 1 : 0);
        int i4 = component1 + 65;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
