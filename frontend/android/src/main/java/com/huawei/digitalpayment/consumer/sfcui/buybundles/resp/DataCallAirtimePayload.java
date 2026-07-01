package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u0017H×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DataCallAirtimePayload;", "Landroid/os/Parcelable;", "productID", "", "buyFor", "sponsorMsisdn", "amount", "beneficiaryMsisdn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProductID", "()Ljava/lang/String;", "getBuyFor", "getSponsorMsisdn", "getAmount", "getBeneficiaryMsisdn", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataCallAirtimePayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DataCallAirtimePayload> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int component3;

    @SerializedName("amount")
    private final String amount;

    @SerializedName("beneficiaryMsisdn")
    private final String beneficiaryMsisdn;

    @SerializedName("buyFor")
    private final String buyFor;

    @SerializedName("productID")
    private final String productID;

    @SerializedName("sponsorMsisdn")
    private final String sponsorMsisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DataCallAirtimePayload> {
        private static int component3 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DataCallAirtimePayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            DataCallAirtimePayload dataCallAirtimePayload = new DataCallAirtimePayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = copydefault + 103;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return dataCallAirtimePayload;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public DataCallAirtimePayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 9;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DataCallAirtimePayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 97;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i3 % 2;
            DataCallAirtimePayload[] dataCallAirtimePayloadArr = new DataCallAirtimePayload[i];
            int i6 = i4 + 1;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                return dataCallAirtimePayloadArr;
            }
            throw null;
        }

        @Override
        public DataCallAirtimePayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 7;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            DataCallAirtimePayload[] dataCallAirtimePayloadArrNewArray = newArray(i);
            int i5 = copydefault + 15;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return dataCallAirtimePayloadArrNewArray;
        }
    }

    public DataCallAirtimePayload(String str, String str2, String str3, String str4, String str5) {
        this.productID = str;
        this.buyFor = str2;
        this.sponsorMsisdn = str3;
        this.amount = str4;
        this.beneficiaryMsisdn = str5;
    }

    public final String getProductID() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.productID;
        int i5 = i3 + 103;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBuyFor() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 93;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.buyFor;
        int i5 = i2 + 27;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getSponsorMsisdn() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            str = this.sponsorMsisdn;
            int i4 = 1 / 0;
        } else {
            str = this.sponsorMsisdn;
        }
        int i5 = i3 + 75;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAmount() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 29;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.amount;
            int i4 = 41 / 0;
        } else {
            str = this.amount;
        }
        int i5 = i2 + 125;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getBeneficiaryMsisdn() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.beneficiaryMsisdn;
        }
        throw null;
    }

    static {
        int i = component1 + 43;
        component2 = i % 128;
        if (i % 2 != 0) {
            int i2 = 99 / 0;
        }
    }

    public static DataCallAirtimePayload copy$default(DataCallAirtimePayload dataCallAirtimePayload, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3 + 49;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        Object obj2 = null;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            int i5 = i4 + 71;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                String str6 = dataCallAirtimePayload.productID;
                obj2.hashCode();
                throw null;
            }
            str = dataCallAirtimePayload.productID;
        }
        String str7 = str;
        if ((i & 2) != 0) {
            int i6 = component3;
            int i7 = i6 + 53;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            str2 = dataCallAirtimePayload.buyFor;
            int i9 = i6 + 5;
            ShareDataUIState = i9 % 128;
            int i10 = i9 % 2;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = dataCallAirtimePayload.sponsorMsisdn;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = dataCallAirtimePayload.amount;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            int i11 = ShareDataUIState + 97;
            component3 = i11 % 128;
            if (i11 % 2 != 0) {
                String str11 = dataCallAirtimePayload.beneficiaryMsisdn;
                throw null;
            }
            str5 = dataCallAirtimePayload.beneficiaryMsisdn;
        }
        return dataCallAirtimePayload.copy(str7, str8, str9, str10, str5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.productID;
        int i4 = i3 + 51;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.buyFor;
        int i5 = i3 + 53;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.sponsorMsisdn;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.amount;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.beneficiaryMsisdn;
        int i4 = i3 + 115;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final DataCallAirtimePayload copy(String productID, String buyFor, String sponsorMsisdn, String amount, String beneficiaryMsisdn) {
        int i = 2 % 2;
        DataCallAirtimePayload dataCallAirtimePayload = new DataCallAirtimePayload(productID, buyFor, sponsorMsisdn, amount, beneficiaryMsisdn);
        int i2 = ShareDataUIState + 33;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return dataCallAirtimePayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 125;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 89;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3 + 107;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataCallAirtimePayload)) {
            return false;
        }
        DataCallAirtimePayload dataCallAirtimePayload = (DataCallAirtimePayload) other;
        if (!Intrinsics.areEqual(this.productID, dataCallAirtimePayload.productID)) {
            int i3 = component3 + 97;
            ShareDataUIState = i3 % 128;
            return i3 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.buyFor, dataCallAirtimePayload.buyFor)) {
            return Intrinsics.areEqual(this.sponsorMsisdn, dataCallAirtimePayload.sponsorMsisdn) && Intrinsics.areEqual(this.amount, dataCallAirtimePayload.amount) && Intrinsics.areEqual(this.beneficiaryMsisdn, dataCallAirtimePayload.beneficiaryMsisdn);
        }
        int i4 = component3 + 123;
        ShareDataUIState = i4 % 128;
        return i4 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        String str = this.productID;
        int iHashCode5 = 0;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i2 = ShareDataUIState + 85;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 % 5;
            }
        }
        String str2 = this.buyFor;
        if (str2 == null) {
            int i4 = ShareDataUIState + 111;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.sponsorMsisdn;
        if (str3 == null) {
            int i6 = ShareDataUIState + 11;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
            int i8 = ShareDataUIState + 63;
            component3 = i8 % 128;
            int i9 = i8 % 2;
        }
        String str4 = this.amount;
        if (str4 == null) {
            iHashCode4 = 0;
        } else {
            iHashCode4 = str4.hashCode();
            int i10 = ShareDataUIState + 39;
            component3 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 5 % 4;
            }
        }
        String str5 = this.beneficiaryMsisdn;
        if (str5 != null) {
            iHashCode5 = str5.hashCode();
            int i12 = ShareDataUIState + 111;
            component3 = i12 % 128;
            int i13 = i12 % 2;
        }
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DataCallAirtimePayload(productID=" + this.productID + ", buyFor=" + this.buyFor + ", sponsorMsisdn=" + this.sponsorMsisdn + ", amount=" + this.amount + ", beneficiaryMsisdn=" + this.beneficiaryMsisdn + ")";
        int i2 = component3 + 47;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.productID);
        dest.writeString(this.buyFor);
        dest.writeString(this.sponsorMsisdn);
        dest.writeString(this.amount);
        dest.writeString(this.beneficiaryMsisdn);
        int i4 = ShareDataUIState + 45;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
