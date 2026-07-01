package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J.\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0003J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/CountryHeader;", "Landroid/os/Parcelable;", "titleRes", "", "flagIconRes", "countryName", "", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;)V", "getTitleRes", "()I", "getFlagIconRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCountryName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(ILjava/lang/Integer;Ljava/lang/String;)Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/CountryHeader;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CountryHeader implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<CountryHeader> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private final String countryName;
    private final Integer flagIconRes;
    private final int titleRes;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CountryHeader> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CountryHeader createFromParcel(Parcel parcel) {
            Integer numValueOf;
            int i = 2 % 2;
            int i2 = component3 + 31;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i4 = parcel.readInt();
            if (parcel.readInt() == 0) {
                int i5 = ShareDataUIState + 79;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new CountryHeader(i4, numValueOf, parcel.readString());
        }

        @Override
        public CountryHeader createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 123;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            CountryHeader countryHeaderCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 15;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 22 / 0;
            }
            return countryHeaderCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CountryHeader[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 25;
            ShareDataUIState = i3 % 128;
            CountryHeader[] countryHeaderArr = new CountryHeader[i];
            if (i3 % 2 == 0) {
                return countryHeaderArr;
            }
            throw null;
        }

        @Override
        public CountryHeader[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 79;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            CountryHeader[] countryHeaderArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 119;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return countryHeaderArrNewArray;
        }
    }

    public CountryHeader(int i, Integer num, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.titleRes = i;
        this.flagIconRes = num;
        this.countryName = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CountryHeader(int i, Integer num, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = ShareDataUIState + 73;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 83;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            num = null;
        }
        this(i, num, str);
    }

    public final int getTitleRes() {
        int i = 2 % 2;
        int i2 = component1 + 109;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.titleRes;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getFlagIconRes() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 71;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.flagIconRes;
        int i5 = i2 + 49;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final String getCountryName() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 13;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.countryName;
        int i5 = i2 + 107;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component3 + 119;
        copydefault = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static CountryHeader copy$default(CountryHeader countryHeader, int i, Integer num, String str, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            i = countryHeader.titleRes;
            int i4 = component1 + 9;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 % 4;
            }
        }
        if ((i2 & 2) != 0) {
            int i6 = ShareDataUIState + 39;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                Integer num2 = countryHeader.flagIconRes;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            num = countryHeader.flagIconRes;
        }
        if ((i2 & 4) != 0) {
            str = countryHeader.countryName;
            int i7 = component1 + 91;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
        }
        return countryHeader.copy(i, num, str);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 81;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.titleRes;
        int i6 = i2 + 39;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final Integer component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 1;
        component1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Integer num = this.flagIconRes;
        int i4 = i2 + 89;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return num;
        }
        throw null;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 17;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.countryName;
            int i4 = 73 / 0;
        } else {
            str = this.countryName;
        }
        int i5 = i2 + 5;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final CountryHeader copy(int titleRes, Integer flagIconRes, String countryName) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(countryName, "");
        CountryHeader countryHeader = new CountryHeader(titleRes, flagIconRes, countryName);
        int i2 = ShareDataUIState + 117;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return countryHeader;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 13;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 91;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 7;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof CountryHeader)) {
            return false;
        }
        CountryHeader countryHeader = (CountryHeader) other;
        if (this.titleRes == countryHeader.titleRes) {
            return Intrinsics.areEqual(this.flagIconRes, countryHeader.flagIconRes) && Intrinsics.areEqual(this.countryName, countryHeader.countryName);
        }
        int i4 = ShareDataUIState + 31;
        int i5 = i4 % 128;
        component1 = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 27;
        ShareDataUIState = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 15 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = Integer.hashCode(this.titleRes);
        Integer num = this.flagIconRes;
        if (num == null) {
            int i4 = component1 + 107;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        int iHashCode3 = (((iHashCode2 * 31) + iHashCode) * 31) + this.countryName.hashCode();
        int i6 = component1 + 75;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CountryHeader(titleRes=" + this.titleRes + ", flagIconRes=" + this.flagIconRes + ", countryName=" + this.countryName + ')';
        int i2 = ShareDataUIState + 57;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int iIntValue;
        int i = 2 % 2;
        int i2 = component1 + 81;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeInt(this.titleRes);
        Integer num = this.flagIconRes;
        if (num == null) {
            int i4 = component1;
            int i5 = i4 + 73;
            ShareDataUIState = i5 % 128;
            iIntValue = i5 % 2 != 0 ? 0 : 1;
            int i6 = i4 + 93;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
            int i8 = ShareDataUIState + 91;
            component1 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 4 % 3;
            }
        }
        dest.writeInt(iIntValue);
        dest.writeString(this.countryName);
    }
}
