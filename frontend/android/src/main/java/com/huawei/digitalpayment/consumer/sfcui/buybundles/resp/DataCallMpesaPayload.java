package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0019\u001a\u00020\u001aH\u0007J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH×\u0003J\t\u0010\u001f\u001a\u00020\u001aH×\u0001J\t\u0010 \u001a\u00020\u0003H×\u0001J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006&"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DataCallMpesaPayload;", "Landroid/os/Parcelable;", "productId", "", "buyFor", "sponsorMsisdn", "amount", "customerType", "beneficiaryMsisdn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProductId", "()Ljava/lang/String;", "getBuyFor", "getSponsorMsisdn", "getAmount", "getCustomerType", "getBeneficiaryMsisdn", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataCallMpesaPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DataCallMpesaPayload> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("amount")
    private final String amount;

    @SerializedName("beneficiaryMsisdn")
    private final String beneficiaryMsisdn;

    @SerializedName("buyFor")
    private final String buyFor;

    @SerializedName("customerType")
    private final String customerType;

    @SerializedName("productId")
    private final String productId;

    @SerializedName("sponsorMsisdn")
    private final String sponsorMsisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DataCallMpesaPayload> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DataCallMpesaPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            DataCallMpesaPayload dataCallMpesaPayload = new DataCallMpesaPayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = ShareDataUIState + 83;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return dataCallMpesaPayload;
            }
            throw null;
        }

        @Override
        public DataCallMpesaPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 31;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            DataCallMpesaPayload dataCallMpesaPayloadCreateFromParcel = createFromParcel(parcel);
            if (i3 != 0) {
                int i4 = 13 / 0;
            }
            return dataCallMpesaPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DataCallMpesaPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 103;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            DataCallMpesaPayload[] dataCallMpesaPayloadArr = new DataCallMpesaPayload[i];
            if (i3 % 2 != 0) {
                throw null;
            }
            int i5 = i4 + 23;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return dataCallMpesaPayloadArr;
        }

        @Override
        public DataCallMpesaPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 39;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            DataCallMpesaPayload[] dataCallMpesaPayloadArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 117;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return dataCallMpesaPayloadArrNewArray;
        }
    }

    public DataCallMpesaPayload(String str, String str2, String str3, String str4, String str5, String str6) {
        this.productId = str;
        this.buyFor = str2;
        this.sponsorMsisdn = str3;
        this.amount = str4;
        this.customerType = str5;
        this.beneficiaryMsisdn = str6;
    }

    public final String getProductId() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 89;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productId;
        int i5 = i2 + 3;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getBuyFor() {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.buyFor;
        int i5 = i3 + 123;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 8 / 0;
        }
        return str;
    }

    public final String getSponsorMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.sponsorMsisdn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.amount;
        int i5 = i3 + 115;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCustomerType() {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.customerType;
        int i5 = i3 + 59;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBeneficiaryMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 31;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.beneficiaryMsisdn;
        int i5 = i2 + 101;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 84 / 0;
        }
        return str;
    }

    static {
        int i = component3 + 15;
        component2 = i % 128;
        if (i % 2 != 0) {
            int i2 = 71 / 0;
        }
    }

    public static DataCallMpesaPayload copy$default(DataCallMpesaPayload dataCallMpesaPayload, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        String str7;
        int i2 = 2 % 2;
        int i3 = component1;
        int i4 = i3 + 93;
        copydefault = i4 % 128;
        String str8 = (i4 % 2 == 0 || (i & 1) == 0) ? str : dataCallMpesaPayload.productId;
        if ((i & 2) != 0) {
            int i5 = i3 + 23;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            str7 = dataCallMpesaPayload.buyFor;
        } else {
            str7 = str2;
        }
        DataCallMpesaPayload dataCallMpesaPayloadCopy = dataCallMpesaPayload.copy(str8, str7, (i & 4) != 0 ? dataCallMpesaPayload.sponsorMsisdn : str3, (i & 8) != 0 ? dataCallMpesaPayload.amount : str4, (i & 16) != 0 ? dataCallMpesaPayload.customerType : str5, (i & 32) != 0 ? dataCallMpesaPayload.beneficiaryMsisdn : str6);
        int i7 = copydefault + 43;
        component1 = i7 % 128;
        if (i7 % 2 == 0) {
            return dataCallMpesaPayloadCopy;
        }
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.productId;
        int i5 = i3 + 103;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.buyFor;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 83;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.sponsorMsisdn;
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1 + 53;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.amount;
        int i5 = i3 + 125;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 53;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.customerType;
        int i4 = i2 + 109;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 99;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.beneficiaryMsisdn;
        int i5 = i2 + 41;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final DataCallMpesaPayload copy(String productId, String buyFor, String sponsorMsisdn, String amount, String customerType, String beneficiaryMsisdn) {
        int i = 2 % 2;
        DataCallMpesaPayload dataCallMpesaPayload = new DataCallMpesaPayload(productId, buyFor, sponsorMsisdn, amount, customerType, beneficiaryMsisdn);
        int i2 = copydefault + 113;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return dataCallMpesaPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 105;
        component1 = i3 % 128;
        int i4 = i3 % 2 != 0 ? 1 : 0;
        int i5 = i2 + 55;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataCallMpesaPayload)) {
            return false;
        }
        DataCallMpesaPayload dataCallMpesaPayload = (DataCallMpesaPayload) other;
        if (!Intrinsics.areEqual(this.productId, dataCallMpesaPayload.productId) || !Intrinsics.areEqual(this.buyFor, dataCallMpesaPayload.buyFor) || (!Intrinsics.areEqual(this.sponsorMsisdn, dataCallMpesaPayload.sponsorMsisdn))) {
            return false;
        }
        if (!Intrinsics.areEqual(this.amount, dataCallMpesaPayload.amount)) {
            int i2 = component1 + 93;
            copydefault = i2 % 128;
            return i2 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.customerType, dataCallMpesaPayload.customerType)) {
            return !(Intrinsics.areEqual(this.beneficiaryMsisdn, dataCallMpesaPayload.beneficiaryMsisdn) ^ true);
        }
        int i3 = copydefault + 79;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.productId;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.buyFor;
        if (str2 == null) {
            int i2 = component1 + 103;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.sponsorMsisdn;
        if (str3 == null) {
            int i4 = copydefault + 71;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        String str4 = this.amount;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.customerType;
        if (str5 == null) {
            int i6 = component1 + 95;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str5.hashCode();
        }
        String str6 = this.beneficiaryMsisdn;
        return (((((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode3) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DataCallMpesaPayload(productId=" + this.productId + ", buyFor=" + this.buyFor + ", sponsorMsisdn=" + this.sponsorMsisdn + ", amount=" + this.amount + ", customerType=" + this.customerType + ", beneficiaryMsisdn=" + this.beneficiaryMsisdn + ")";
        int i2 = component1 + 113;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.productId);
        dest.writeString(this.buyFor);
        dest.writeString(this.sponsorMsisdn);
        dest.writeString(this.amount);
        dest.writeString(this.customerType);
        dest.writeString(this.beneficiaryMsisdn);
        int i4 = component1 + 15;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
