package com.huawei.digitalpayment.consumer.fixeddata.data.model.preValidationRenewal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u0017H×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/preValidationRenewal/FibrePreValidationRenewalPayload;", "Landroid/os/Parcelable;", "msisdn", "", "account", "pin", "amount", "product", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getAccount", "getPin", "getAmount", "getProduct", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FibrePreValidationRenewalPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FibrePreValidationRenewalPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("account")
    private final String account;

    @SerializedName("amount")
    private final String amount;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("pin")
    private final String pin;

    @SerializedName("product")
    private final String product;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FibrePreValidationRenewalPayload> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibrePreValidationRenewalPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            FibrePreValidationRenewalPayload fibrePreValidationRenewalPayload = new FibrePreValidationRenewalPayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = copydefault + 55;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return fibrePreValidationRenewalPayload;
        }

        @Override
        public FibrePreValidationRenewalPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 5;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibrePreValidationRenewalPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState;
            int i4 = i3 + 91;
            copydefault = i4 % 128;
            FibrePreValidationRenewalPayload[] fibrePreValidationRenewalPayloadArr = new FibrePreValidationRenewalPayload[i];
            if (i4 % 2 == 0) {
                throw null;
            }
            int i5 = i3 + 1;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return fibrePreValidationRenewalPayloadArr;
        }

        @Override
        public FibrePreValidationRenewalPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 5;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            FibrePreValidationRenewalPayload[] fibrePreValidationRenewalPayloadArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 29;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                return fibrePreValidationRenewalPayloadArrNewArray;
            }
            throw null;
        }
    }

    public FibrePreValidationRenewalPayload(String str, String str2, String str3, String str4, String str5) {
        this.msisdn = str;
        this.account = str2;
        this.pin = str3;
        this.amount = str4;
        this.product = str5;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.msisdn;
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
        return str;
    }

    public final String getAccount() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.account;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPin() {
        int i = 2 % 2;
        int i2 = component3 + 29;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.pin;
        int i4 = i3 + 39;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getAmount() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            str = this.amount;
            int i4 = 0 / 0;
        } else {
            str = this.amount;
        }
        int i5 = i3 + 121;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 72 / 0;
        }
        return str;
    }

    public final String getProduct() {
        int i = 2 % 2;
        int i2 = component3 + 53;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.product;
        int i5 = i3 + 41;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component2 + 57;
        copydefault = i % 128;
        if (i % 2 == 0) {
            int i2 = 71 / 0;
        }
    }

    public static FibrePreValidationRenewalPayload copy$default(FibrePreValidationRenewalPayload fibrePreValidationRenewalPayload, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3 + 121;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        Object obj2 = null;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            int i5 = i4 + 13;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                String str6 = fibrePreValidationRenewalPayload.msisdn;
                obj2.hashCode();
                throw null;
            }
            str = fibrePreValidationRenewalPayload.msisdn;
        }
        String str7 = str;
        if ((i & 2) != 0) {
            int i6 = i4 + 89;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                String str8 = fibrePreValidationRenewalPayload.account;
                obj2.hashCode();
                throw null;
            }
            str2 = fibrePreValidationRenewalPayload.account;
        }
        String str9 = str2;
        if ((i & 4) != 0) {
            int i7 = component3 + 23;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            str3 = fibrePreValidationRenewalPayload.pin;
        }
        String str10 = str3;
        if ((i & 8) != 0) {
            str4 = fibrePreValidationRenewalPayload.amount;
        }
        String str11 = str4;
        if ((i & 16) != 0) {
            int i9 = ShareDataUIState + 11;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            str5 = fibrePreValidationRenewalPayload.product;
        }
        return fibrePreValidationRenewalPayload.copy(str7, str9, str10, str11, str5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 57;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 45;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.account;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 117;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pin;
        int i5 = i2 + 119;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 59;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amount;
        int i5 = i2 + 51;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 29;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.product;
        int i4 = i2 + 79;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final FibrePreValidationRenewalPayload copy(String msisdn, String account, String pin, String amount, String product) {
        int i = 2 % 2;
        FibrePreValidationRenewalPayload fibrePreValidationRenewalPayload = new FibrePreValidationRenewalPayload(msisdn, account, pin, amount, product);
        int i2 = ShareDataUIState + 113;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return fibrePreValidationRenewalPayload;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 15;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 85;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FibrePreValidationRenewalPayload)) {
            int i5 = i2 + 93;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        FibrePreValidationRenewalPayload fibrePreValidationRenewalPayload = (FibrePreValidationRenewalPayload) other;
        if (!Intrinsics.areEqual(this.msisdn, fibrePreValidationRenewalPayload.msisdn)) {
            int i7 = ShareDataUIState + 83;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.account, fibrePreValidationRenewalPayload.account)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.pin, fibrePreValidationRenewalPayload.pin)) {
            int i9 = component3 + 3;
            ShareDataUIState = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 8 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.amount, fibrePreValidationRenewalPayload.amount)) {
            return false;
        }
        if (Intrinsics.areEqual(this.product, fibrePreValidationRenewalPayload.product)) {
            return true;
        }
        int i11 = ShareDataUIState + 39;
        component3 = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.msisdn;
        int iHashCode3 = 0;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.account;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.pin;
        if (str3 == null) {
            int i2 = ShareDataUIState + 99;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str3.hashCode();
        }
        String str4 = this.amount;
        if (str4 == null) {
            int i4 = ShareDataUIState + 31;
            component3 = i4 % 128;
            iHashCode2 = i4 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode2 = str4.hashCode();
        }
        String str5 = this.product;
        if (str5 != null) {
            iHashCode3 = str5.hashCode();
            int i5 = ShareDataUIState + 85;
            component3 = i5 % 128;
            int i6 = i5 % 2;
        }
        return (((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FibrePreValidationRenewalPayload(msisdn=" + this.msisdn + ", account=" + this.account + ", pin=" + this.pin + ", amount=" + this.amount + ", product=" + this.product + ")";
        int i2 = component3 + 13;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.msisdn);
        dest.writeString(this.account);
        dest.writeString(this.pin);
        dest.writeString(this.amount);
        dest.writeString(this.product);
        int i4 = component3 + 51;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
