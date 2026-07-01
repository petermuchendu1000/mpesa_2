package com.huawei.digitalpayment.consumer.base.resp;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/LocalGsmBalances;", "Landroid/os/Parcelable;", "airtimeBalance", "", "creditLimit", "dataBalance", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAirtimeBalance", "()Ljava/lang/String;", "setAirtimeBalance", "(Ljava/lang/String;)V", "getCreditLimit", "setCreditLimit", "getDataBalance", "setDataBalance", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocalGsmBalances implements Parcelable {
    public static final Parcelable.Creator<LocalGsmBalances> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;
    private String airtimeBalance;
    private String creditLimit;
    private String dataBalance;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LocalGsmBalances> {
        private static int component1 = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final LocalGsmBalances createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            LocalGsmBalances localGsmBalances = new LocalGsmBalances(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component2 + 79;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return localGsmBalances;
            }
            throw null;
        }

        @Override
        public LocalGsmBalances createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 93;
            component2 = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                createFromParcel(parcel);
                obj.hashCode();
                throw null;
            }
            LocalGsmBalances localGsmBalancesCreateFromParcel = createFromParcel(parcel);
            int i3 = component1 + 23;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                return localGsmBalancesCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final LocalGsmBalances[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 45;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            LocalGsmBalances[] localGsmBalancesArr = new LocalGsmBalances[i];
            int i6 = i4 + 39;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                return localGsmBalancesArr;
            }
            throw null;
        }

        @Override
        public LocalGsmBalances[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 61;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            LocalGsmBalances[] localGsmBalancesArrNewArray = newArray(i);
            int i5 = component1 + 117;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return localGsmBalancesArrNewArray;
        }
    }

    public LocalGsmBalances(String str, String str2, String str3) {
        this.airtimeBalance = str;
        this.creditLimit = str2;
        this.dataBalance = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalGsmBalances(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i3 = component3 + 7;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 39 / 0;
            }
            str2 = null;
        }
        if ((i & 4) != 0) {
            int i5 = component2 + 101;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str3 = null;
        }
        this(str, str2, str3);
    }

    public final String getAirtimeBalance() {
        int i = 2 % 2;
        int i2 = component3 + 75;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.airtimeBalance;
        if (i3 != 0) {
            int i4 = 32 / 0;
        }
        return str;
    }

    public final void setAirtimeBalance(String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 85;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.airtimeBalance = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 5;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getCreditLimit() {
        int i = 2 % 2;
        int i2 = component2 + 111;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.creditLimit;
        int i5 = i3 + 39;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setCreditLimit(String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 7;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.creditLimit = str;
        if (i4 == 0) {
            int i5 = 84 / 0;
        }
        int i6 = i2 + 17;
        component3 = i6 % 128;
        int i7 = i6 % 2;
    }

    public final String getDataBalance() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 3;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.dataBalance;
        int i4 = i2 + 27;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 96 / 0;
        }
        return str;
    }

    public final void setDataBalance(String str) {
        int i = 2 % 2;
        int i2 = component3 + 95;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.dataBalance = str;
        if (i4 != 0) {
            int i5 = 98 / 0;
        }
        int i6 = i3 + 103;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    static {
        int i = component1 + 91;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public LocalGsmBalances() {
        this(null, null, null, 7, null);
    }

    public static LocalGsmBalances copy$default(LocalGsmBalances localGsmBalances, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = localGsmBalances.airtimeBalance;
        }
        if ((i & 2) != 0) {
            int i3 = component3;
            int i4 = i3 + 125;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            String str4 = localGsmBalances.creditLimit;
            int i6 = i3 + 103;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            str2 = str4;
        }
        if ((i & 4) != 0) {
            str3 = localGsmBalances.dataBalance;
            int i8 = component3 + 21;
            component2 = i8 % 128;
            int i9 = i8 % 2;
        }
        return localGsmBalances.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 41;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.airtimeBalance;
        int i5 = i2 + 81;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 36 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 67;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.creditLimit;
        int i5 = i2 + 19;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 15;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.dataBalance;
        int i4 = i3 + 123;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final LocalGsmBalances copy(String airtimeBalance, String creditLimit, String dataBalance) {
        int i = 2 % 2;
        LocalGsmBalances localGsmBalances = new LocalGsmBalances(airtimeBalance, creditLimit, dataBalance);
        int i2 = component3 + 67;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return localGsmBalances;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 79;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 71;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 81;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 33;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 94 / 0;
            }
            return true;
        }
        if (!(other instanceof LocalGsmBalances)) {
            return false;
        }
        LocalGsmBalances localGsmBalances = (LocalGsmBalances) other;
        if (Intrinsics.areEqual(this.airtimeBalance, localGsmBalances.airtimeBalance)) {
            if (Intrinsics.areEqual(this.creditLimit, localGsmBalances.creditLimit)) {
                if (!Intrinsics.areEqual(this.dataBalance, localGsmBalances.dataBalance)) {
                    return false;
                }
                int i7 = component2 + 37;
                component3 = i7 % 128;
                if (i7 % 2 != 0) {
                    return true;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i8 = component3 + 9;
            component2 = i8 % 128;
            int i9 = i8 % 2;
        }
        return false;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = component2 + 79;
        component3 = i2 % 128;
        if (i2 % 2 != 0 ? (str = this.airtimeBalance) != null : (str = this.airtimeBalance) != null) {
            iHashCode = str.hashCode();
            int i3 = component3 + 31;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 / 2;
            }
        } else {
            iHashCode = 0;
        }
        String str2 = this.creditLimit;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.dataBalance;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalGsmBalances(airtimeBalance=" + this.airtimeBalance + ", creditLimit=" + this.creditLimit + ", dataBalance=" + this.dataBalance + ")";
        int i2 = component2 + 19;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 75;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.airtimeBalance);
        dest.writeString(this.creditLimit);
        dest.writeString(this.dataBalance);
        int i4 = component2 + 107;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
    }
}
