package com.huawei.digitalpayment.consumer.fixeddata.data.model.home4g5g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0012H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/home4g5g/Home4G5GGetAccountsResponse;", "Landroid/os/Parcelable;", "beneficiaryMsisdn", "", "autorenew", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getBeneficiaryMsisdn", "()Ljava/lang/String;", "getAutorenew", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/home4g5g/Home4G5GGetAccountsResponse;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Home4G5GGetAccountsResponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<Home4G5GGetAccountsResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("autorenew")
    private final Boolean autorenew;

    @SerializedName("beneficiaryMsisdn")
    private final String beneficiaryMsisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Home4G5GGetAccountsResponse> {
        private static int component3 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Home4G5GGetAccountsResponse createFromParcel(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            int i2 = copydefault + 67;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Boolean boolValueOf = null;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 != 0) {
                parcel.readString();
                parcel.readInt();
                boolValueOf.hashCode();
                throw null;
            }
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    int i4 = copydefault;
                    int i5 = i4 + 75;
                    component3 = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = i4 + 39;
                    component3 = i7 % 128;
                    int i8 = i7 % 2;
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new Home4G5GGetAccountsResponse(string, boolValueOf);
        }

        @Override
        public Home4G5GGetAccountsResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 89;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Home4G5GGetAccountsResponse home4G5GGetAccountsResponseCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 7;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return home4G5GGetAccountsResponseCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Home4G5GGetAccountsResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault;
            int i4 = i3 + 3;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            Home4G5GGetAccountsResponse[] home4G5GGetAccountsResponseArr = new Home4G5GGetAccountsResponse[i];
            int i6 = i3 + 99;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 28 / 0;
            }
            return home4G5GGetAccountsResponseArr;
        }

        @Override
        public Home4G5GGetAccountsResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 59;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            Home4G5GGetAccountsResponse[] home4G5GGetAccountsResponseArrNewArray = newArray(i);
            int i5 = component3 + 87;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                return home4G5GGetAccountsResponseArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public Home4G5GGetAccountsResponse(String str, Boolean bool) {
        this.beneficiaryMsisdn = str;
        this.autorenew = bool;
    }

    public final String getBeneficiaryMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.beneficiaryMsisdn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Boolean getAutorenew() {
        int i = 2 % 2;
        int i2 = copydefault + 113;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.autorenew;
        }
        throw null;
    }

    static {
        int i = ShareDataUIState + 31;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static Home4G5GGetAccountsResponse copy$default(Home4G5GGetAccountsResponse home4G5GGetAccountsResponse, String str, Boolean bool, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copydefault + 19;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                String str2 = home4G5GGetAccountsResponse.beneficiaryMsisdn;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str = home4G5GGetAccountsResponse.beneficiaryMsisdn;
        }
        if ((i & 2) != 0) {
            int i4 = component1 + 13;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            bool = home4G5GGetAccountsResponse.autorenew;
        }
        return home4G5GGetAccountsResponse.copy(str, bool);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.beneficiaryMsisdn;
        int i5 = i3 + 71;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Boolean component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 47;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.autorenew;
        int i5 = i2 + 87;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    public final Home4G5GGetAccountsResponse copy(String beneficiaryMsisdn, Boolean autorenew) {
        int i = 2 % 2;
        Home4G5GGetAccountsResponse home4G5GGetAccountsResponse = new Home4G5GGetAccountsResponse(beneficiaryMsisdn, autorenew);
        int i2 = component1 + 93;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return home4G5GGetAccountsResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 19;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 83;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof Home4G5GGetAccountsResponse)) {
            int i4 = i2 + 43;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.beneficiaryMsisdn, ((Home4G5GGetAccountsResponse) other).beneficiaryMsisdn)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.autorenew, r6.autorenew))) {
            return true;
        }
        int i6 = component1 + 43;
        copydefault = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        String str = this.beneficiaryMsisdn;
        int iHashCode2 = 0;
        if (str == null) {
            int i3 = copydefault + 97;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        Boolean bool = this.autorenew;
        if (bool == null) {
            i = copydefault + 11;
            component1 = i % 128;
        } else {
            iHashCode2 = bool.hashCode();
            i = component1 + 59;
            copydefault = i % 128;
        }
        int i5 = i % 2;
        return (iHashCode * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Home4G5GGetAccountsResponse(beneficiaryMsisdn=" + this.beneficiaryMsisdn + ", autorenew=" + this.autorenew + ")";
        int i2 = copydefault + 119;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel, java.lang.Object] */
    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        ?? BooleanValue;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.beneficiaryMsisdn);
        Boolean bool = this.autorenew;
        if (bool == null) {
            int i2 = copydefault + 9;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            BooleanValue = 0;
        } else {
            dest.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        dest.writeInt(BooleanValue);
        int i4 = component1 + 65;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 % 2;
        }
    }
}
