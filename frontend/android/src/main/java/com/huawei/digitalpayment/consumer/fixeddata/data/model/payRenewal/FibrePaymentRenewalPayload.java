package com.huawei.digitalpayment.consumer.fixeddata.data.model.payRenewal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jg\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u001f\u001a\u00020 H\u0007J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H×\u0003J\t\u0010%\u001a\u00020 H×\u0001J\t\u0010&\u001a\u00020\u0003H×\u0001J\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006,"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/payRenewal/FibrePaymentRenewalPayload;", "Landroid/os/Parcelable;", "msisdn", "", KeysConstants.SHORT_CODE, "accountId", "productId", "amount", "pin", "channelSessionId", "useOd", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getShortCode", "getAccountId", "getProductId", "getAmount", "getPin", "getChannelSessionId", "getUseOd", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FibrePaymentRenewalPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FibrePaymentRenewalPayload> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("accountId")
    private final String accountId;

    @SerializedName("amount")
    private final String amount;

    @SerializedName("channelSessionId")
    private final String channelSessionId;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("pin")
    private final String pin;

    @SerializedName("productId")
    private final String productId;

    @SerializedName(KeysConstants.SHORT_CODE)
    private final String shortCode;

    @SerializedName("useOd")
    private final String useOd;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FibrePaymentRenewalPayload> {
        private static int ShareDataUIState = 1;
        private static int component1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibrePaymentRenewalPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            FibrePaymentRenewalPayload fibrePaymentRenewalPayload = new FibrePaymentRenewalPayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = ShareDataUIState + 27;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return fibrePaymentRenewalPayload;
            }
            throw null;
        }

        @Override
        public FibrePaymentRenewalPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 89;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            FibrePaymentRenewalPayload fibrePaymentRenewalPayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = component1 + 21;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return fibrePaymentRenewalPayloadCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibrePaymentRenewalPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 23;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            FibrePaymentRenewalPayload[] fibrePaymentRenewalPayloadArr = new FibrePaymentRenewalPayload[i];
            int i6 = i3 + 111;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return fibrePaymentRenewalPayloadArr;
        }

        @Override
        public FibrePaymentRenewalPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 77;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            FibrePaymentRenewalPayload[] fibrePaymentRenewalPayloadArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 42 / 0;
            }
            return fibrePaymentRenewalPayloadArrNewArray;
        }
    }

    public FibrePaymentRenewalPayload(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.msisdn = str;
        this.shortCode = str2;
        this.accountId = str3;
        this.productId = str4;
        this.amount = str5;
        this.pin = str6;
        this.channelSessionId = str7;
        this.useOd = str8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FibrePaymentRenewalPayload(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str9;
        if ((i & 2) != 0) {
            int i2 = component1 + 1;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 1;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            str9 = "150501";
        } else {
            str9 = str2;
        }
        this(str, str9, str3, str4, str5, str6, str7, str8);
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.msisdn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getShortCode() {
        int i = 2 % 2;
        int i2 = component1 + 113;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.shortCode;
        }
        int i3 = 2 / 0;
        return this.shortCode;
    }

    public final String getAccountId() {
        int i = 2 % 2;
        int i2 = component1 + 19;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.accountId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getProductId() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 73;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productId;
        int i5 = i2 + 93;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.amount;
        if (i3 != 0) {
            int i4 = 48 / 0;
        }
        return str;
    }

    public final String getPin() {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.pin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getChannelSessionId() {
        int i = 2 % 2;
        int i2 = component1 + 97;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.channelSessionId;
        int i5 = i3 + 85;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getUseOd() {
        int i = 2 % 2;
        int i2 = component1 + 125;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.useOd;
        int i5 = i3 + 81;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = component3 + 125;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static FibrePaymentRenewalPayload copy$default(FibrePaymentRenewalPayload fibrePaymentRenewalPayload, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        String str9;
        String str10;
        String str11;
        int i2 = 2 % 2;
        String str12 = (i & 1) != 0 ? fibrePaymentRenewalPayload.msisdn : str;
        if ((i & 2) != 0) {
            int i3 = component1 + 69;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                str9 = fibrePaymentRenewalPayload.shortCode;
                int i4 = 75 / 0;
            } else {
                str9 = fibrePaymentRenewalPayload.shortCode;
            }
        } else {
            str9 = str2;
        }
        String str13 = (i & 4) != 0 ? fibrePaymentRenewalPayload.accountId : str3;
        if ((i & 8) != 0) {
            int i5 = component1 + 35;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                String str14 = fibrePaymentRenewalPayload.productId;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str10 = fibrePaymentRenewalPayload.productId;
        } else {
            str10 = str4;
        }
        String str15 = (i & 16) != 0 ? fibrePaymentRenewalPayload.amount : str5;
        String str16 = (i & 32) != 0 ? fibrePaymentRenewalPayload.pin : str6;
        if ((i & 64) != 0) {
            int i6 = component1 + 31;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            str11 = fibrePaymentRenewalPayload.channelSessionId;
        } else {
            str11 = str7;
        }
        return fibrePaymentRenewalPayload.copy(str12, str9, str13, str10, str15, str16, str11, (i & 128) != 0 ? fibrePaymentRenewalPayload.useOd : str8);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 125;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.msisdn;
        int i4 = i2 + 81;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 97;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.shortCode;
        int i5 = i3 + 77;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.accountId;
        int i5 = i3 + 53;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 38 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 17;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.productId;
        int i4 = i2 + 119;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.amount;
        int i5 = i3 + 73;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component1 + 79;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.pin;
        int i5 = i3 + 73;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 42 / 0;
        }
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component1 + 61;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.channelSessionId;
        int i5 = i3 + 55;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component1 + 69;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.useOd;
        int i4 = i3 + 121;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final FibrePaymentRenewalPayload copy(String msisdn, String shortCode, String accountId, String productId, String amount, String pin, String channelSessionId, String useOd) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(shortCode, "");
        FibrePaymentRenewalPayload fibrePaymentRenewalPayload = new FibrePaymentRenewalPayload(msisdn, shortCode, accountId, productId, amount, pin, channelSessionId, useOd);
        int i2 = copydefault + 65;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return fibrePaymentRenewalPayload;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        component1 = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FibrePaymentRenewalPayload)) {
            return false;
        }
        FibrePaymentRenewalPayload fibrePaymentRenewalPayload = (FibrePaymentRenewalPayload) other;
        if (!Intrinsics.areEqual(this.msisdn, fibrePaymentRenewalPayload.msisdn)) {
            int i2 = copydefault + 119;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.shortCode, fibrePaymentRenewalPayload.shortCode)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.accountId, fibrePaymentRenewalPayload.accountId)) {
            int i4 = copydefault + 93;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if ((!Intrinsics.areEqual(this.productId, fibrePaymentRenewalPayload.productId)) || !Intrinsics.areEqual(this.amount, fibrePaymentRenewalPayload.amount)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.pin, fibrePaymentRenewalPayload.pin)) {
            int i6 = component1 + 47;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.channelSessionId, fibrePaymentRenewalPayload.channelSessionId)) {
            return false;
        }
        if (Intrinsics.areEqual(this.useOd, fibrePaymentRenewalPayload.useOd)) {
            return true;
        }
        int i8 = copydefault + 99;
        component1 = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        int i2 = copydefault + 77;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.msisdn;
        if (str == null) {
            int i5 = i3 + 119;
            int i6 = i5 % 128;
            copydefault = i6;
            iHashCode = i5 % 2 == 0 ? 1 : 0;
            int i7 = i6 + 89;
            component1 = i7 % 128;
            int i8 = i7 % 2;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode5 = this.shortCode.hashCode();
        String str2 = this.accountId;
        if (str2 == null) {
            int i9 = component1 + 11;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.productId;
        if (str3 == null) {
            int i11 = component1 + 57;
            copydefault = i11 % 128;
            int i12 = i11 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
        }
        String str4 = this.amount;
        if (str4 == null) {
            int i13 = component1 + 69;
            copydefault = i13 % 128;
            int i14 = i13 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str4.hashCode();
        }
        String str5 = this.pin;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.channelSessionId;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.useOd;
        return (((((((((((((iHashCode * 31) + iHashCode5) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FibrePaymentRenewalPayload(msisdn=" + this.msisdn + ", shortCode=" + this.shortCode + ", accountId=" + this.accountId + ", productId=" + this.productId + ", amount=" + this.amount + ", pin=" + this.pin + ", channelSessionId=" + this.channelSessionId + ", useOd=" + this.useOd + ")";
        int i2 = component1 + 71;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.msisdn);
        dest.writeString(this.shortCode);
        dest.writeString(this.accountId);
        dest.writeString(this.productId);
        dest.writeString(this.amount);
        dest.writeString(this.pin);
        dest.writeString(this.channelSessionId);
        dest.writeString(this.useOd);
        int i4 = copydefault + 47;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
