package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u0017H×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/OtherBundlesMpesaPayload;", "Landroid/os/Parcelable;", "productId", "", "sponsorMsisdn", "buyFor", "amount", "beneficiaryMsisdn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProductId", "()Ljava/lang/String;", "getSponsorMsisdn", "getBuyFor", "getAmount", "getBeneficiaryMsisdn", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OtherBundlesMpesaPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<OtherBundlesMpesaPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("amount")
    private final String amount;

    @SerializedName("beneficiaryMsisdn")
    private final String beneficiaryMsisdn;

    @SerializedName("buyFor")
    private final String buyFor;

    @SerializedName("productId")
    private final String productId;

    @SerializedName("sponsorMsisdn")
    private final String sponsorMsisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OtherBundlesMpesaPayload> {
        private static int ShareDataUIState = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final OtherBundlesMpesaPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            OtherBundlesMpesaPayload otherBundlesMpesaPayload = new OtherBundlesMpesaPayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component3 + 73;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return otherBundlesMpesaPayload;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public OtherBundlesMpesaPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 115;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            OtherBundlesMpesaPayload otherBundlesMpesaPayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 89;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 70 / 0;
            }
            return otherBundlesMpesaPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final OtherBundlesMpesaPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 39;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            OtherBundlesMpesaPayload[] otherBundlesMpesaPayloadArr = new OtherBundlesMpesaPayload[i];
            int i6 = i3 + 97;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return otherBundlesMpesaPayloadArr;
        }

        @Override
        public OtherBundlesMpesaPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 73;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            throw null;
        }
    }

    public OtherBundlesMpesaPayload(String str, String str2, String str3, String str4, String str5) {
        this.productId = str;
        this.sponsorMsisdn = str2;
        this.buyFor = str3;
        this.amount = str4;
        this.beneficiaryMsisdn = str5;
    }

    public final String getProductId() {
        int i = 2 % 2;
        int i2 = component3 + 123;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.productId;
        }
        throw null;
    }

    public final String getSponsorMsisdn() {
        int i = 2 % 2;
        int i2 = component2 + 55;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.sponsorMsisdn;
        }
        throw null;
    }

    public final String getBuyFor() {
        int i = 2 % 2;
        int i2 = component3 + 95;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.buyFor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = component3 + 65;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.amount;
        int i5 = i3 + 73;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBeneficiaryMsisdn() {
        int i = 2 % 2;
        int i2 = component3 + 117;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.beneficiaryMsisdn;
        int i5 = i3 + 17;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 7 / 0;
        }
        return str;
    }

    static {
        int i = copydefault + 103;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public static OtherBundlesMpesaPayload copy$default(OtherBundlesMpesaPayload otherBundlesMpesaPayload, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 107;
        component2 = i4 % 128;
        if (i4 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = otherBundlesMpesaPayload.productId;
        }
        String str6 = str;
        if ((i & 2) != 0) {
            str2 = otherBundlesMpesaPayload.sponsorMsisdn;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = otherBundlesMpesaPayload.buyFor;
        }
        String str8 = str3;
        Object obj2 = null;
        if ((i & 8) != 0) {
            int i5 = i3 + 21;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                String str9 = otherBundlesMpesaPayload.amount;
                throw null;
            }
            str4 = otherBundlesMpesaPayload.amount;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            int i6 = component2;
            int i7 = i6 + 15;
            component3 = i7 % 128;
            if (i7 % 2 != 0) {
                String str11 = otherBundlesMpesaPayload.beneficiaryMsisdn;
                obj2.hashCode();
                throw null;
            }
            str5 = otherBundlesMpesaPayload.beneficiaryMsisdn;
            int i8 = i6 + 121;
            component3 = i8 % 128;
            int i9 = i8 % 2;
        }
        return otherBundlesMpesaPayload.copy(str6, str7, str8, str10, str5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.productId;
        int i5 = i3 + 99;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 43;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.sponsorMsisdn;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 103;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.buyFor;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 15;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amount;
        int i5 = i2 + 99;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 17;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.beneficiaryMsisdn;
        int i5 = i2 + 63;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final OtherBundlesMpesaPayload copy(String productId, String sponsorMsisdn, String buyFor, String amount, String beneficiaryMsisdn) {
        int i = 2 % 2;
        OtherBundlesMpesaPayload otherBundlesMpesaPayload = new OtherBundlesMpesaPayload(productId, sponsorMsisdn, buyFor, amount, beneficiaryMsisdn);
        int i2 = component2 + 91;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return otherBundlesMpesaPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 51;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 59;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 39;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof OtherBundlesMpesaPayload)) {
            return false;
        }
        OtherBundlesMpesaPayload otherBundlesMpesaPayload = (OtherBundlesMpesaPayload) other;
        if (!Intrinsics.areEqual(this.productId, otherBundlesMpesaPayload.productId)) {
            int i4 = component3 + 75;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.sponsorMsisdn, otherBundlesMpesaPayload.sponsorMsisdn)) {
            int i6 = component2 + 57;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.buyFor, otherBundlesMpesaPayload.buyFor) || !Intrinsics.areEqual(this.amount, otherBundlesMpesaPayload.amount)) {
            return false;
        }
        if (Intrinsics.areEqual(this.beneficiaryMsisdn, otherBundlesMpesaPayload.beneficiaryMsisdn)) {
            return true;
        }
        int i8 = component2 + 51;
        component3 = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        String str = this.productId;
        if (str == null) {
            int i2 = component2 + 21;
            component3 = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.sponsorMsisdn;
        if (str2 == null) {
            int i3 = component3 + 81;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.buyFor;
        if (str3 == null) {
            int i5 = component3 + 19;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
            int i7 = component3 + 15;
            component2 = i7 % 128;
            int i8 = i7 % 2;
        }
        String str4 = this.amount;
        if (str4 == null) {
            int i9 = component3 + 39;
            component2 = i9 % 128;
            int i10 = i9 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str4.hashCode();
        }
        String str5 = this.beneficiaryMsisdn;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OtherBundlesMpesaPayload(productId=" + this.productId + ", sponsorMsisdn=" + this.sponsorMsisdn + ", buyFor=" + this.buyFor + ", amount=" + this.amount + ", beneficiaryMsisdn=" + this.beneficiaryMsisdn + ")";
        int i2 = component2 + 73;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 71;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.productId);
        dest.writeString(this.sponsorMsisdn);
        dest.writeString(this.buyFor);
        dest.writeString(this.amount);
        dest.writeString(this.beneficiaryMsisdn);
        int i4 = component2 + 51;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
    }
}
