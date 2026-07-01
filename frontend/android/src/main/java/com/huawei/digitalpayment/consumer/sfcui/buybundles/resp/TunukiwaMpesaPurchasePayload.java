package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jq\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010$\u001a\u00020\nH\u0007J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H×\u0003J\t\u0010)\u001a\u00020\nH×\u0001J\t\u0010*\u001a\u00020\u0003H×\u0001J\u0018\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\nH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u00060"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/TunukiwaMpesaPurchasePayload;", "Landroid/os/Parcelable;", "paymentMethod", "", "offerId", "offerName", "subscriberType", "partyAMsisdn", "partyBMsisdn", "okoaAmount", "", "fulizaAmount", "pin", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getPaymentMethod", "()Ljava/lang/String;", "getOfferId", "getOfferName", "getSubscriberType", "getPartyAMsisdn", "getPartyBMsisdn", "getOkoaAmount", "()I", "getFulizaAmount", "getPin", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TunukiwaMpesaPurchasePayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TunukiwaMpesaPurchasePayload> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int copydefault;

    @SerializedName("fulizaAmount")
    private final String fulizaAmount;

    @SerializedName("offerId")
    private final String offerId;

    @SerializedName("offerName")
    private final String offerName;

    @SerializedName("okoaAmount")
    private final int okoaAmount;

    @SerializedName("partyAMsisdn")
    private final String partyAMsisdn;

    @SerializedName("partyBMsisdn")
    private final String partyBMsisdn;

    @SerializedName("paymentMethod")
    private final String paymentMethod;

    @SerializedName("pin")
    private final String pin;

    @SerializedName("subscriberType")
    private final String subscriberType;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TunukiwaMpesaPurchasePayload> {
        private static int component1 = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final TunukiwaMpesaPurchasePayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            TunukiwaMpesaPurchasePayload tunukiwaMpesaPurchasePayload = new TunukiwaMpesaPurchasePayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
            int i2 = component2 + 51;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return tunukiwaMpesaPurchasePayload;
        }

        @Override
        public TunukiwaMpesaPurchasePayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 121;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            TunukiwaMpesaPurchasePayload tunukiwaMpesaPurchasePayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = component1 + 67;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 31 / 0;
            }
            return tunukiwaMpesaPurchasePayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final TunukiwaMpesaPurchasePayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 31;
            component2 = i4 % 128;
            TunukiwaMpesaPurchasePayload[] tunukiwaMpesaPurchasePayloadArr = new TunukiwaMpesaPurchasePayload[i];
            if (i4 % 2 != 0) {
                int i5 = 12 / 0;
            }
            int i6 = i3 + 67;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return tunukiwaMpesaPurchasePayloadArr;
        }

        @Override
        public TunukiwaMpesaPurchasePayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 95;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            TunukiwaMpesaPurchasePayload[] tunukiwaMpesaPurchasePayloadArrNewArray = newArray(i);
            int i5 = component1 + 13;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 48 / 0;
            }
            return tunukiwaMpesaPurchasePayloadArrNewArray;
        }
    }

    public TunukiwaMpesaPurchasePayload(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymentMethod = str;
        this.offerId = str2;
        this.offerName = str3;
        this.subscriberType = str4;
        this.partyAMsisdn = str5;
        this.partyBMsisdn = str6;
        this.okoaAmount = i;
        this.fulizaAmount = str7;
        this.pin = str8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TunukiwaMpesaPurchasePayload(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str9;
        int i3;
        if ((i2 & 1) != 0) {
            int i4 = component1;
            int i5 = i4 + 87;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 79;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            str9 = "MPESA";
        } else {
            str9 = str;
        }
        if ((i2 & 64) != 0) {
            int i10 = 2 % 2;
            i3 = 0;
        } else {
            i3 = i;
        }
        this(str9, str2, str3, str4, str5, str6, i3, str7, str8);
    }

    public final String getPaymentMethod() {
        int i = 2 % 2;
        int i2 = component1 + 115;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.paymentMethod;
        if (i3 != 0) {
            int i4 = 43 / 0;
        }
        return str;
    }

    public final String getOfferId() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 107;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.offerId;
            int i4 = 10 / 0;
        } else {
            str = this.offerId;
        }
        int i5 = i2 + 9;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getOfferName() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 117;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            str = this.offerName;
            int i4 = 16 / 0;
        } else {
            str = this.offerName;
        }
        int i5 = i3 + 13;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getSubscriberType() {
        int i = 2 % 2;
        int i2 = component1 + 125;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.subscriberType;
        int i4 = i3 + 105;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getPartyAMsisdn() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 107;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.partyAMsisdn;
        int i4 = i2 + 41;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getPartyBMsisdn() {
        int i = 2 % 2;
        int i2 = component2 + 13;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.partyBMsisdn;
        int i4 = i3 + 65;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final int getOkoaAmount() {
        int i = 2 % 2;
        int i2 = component1 + 11;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.okoaAmount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getFulizaAmount() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 53;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.fulizaAmount;
        int i5 = i2 + 97;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPin() {
        int i = 2 % 2;
        int i2 = component1 + 107;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.pin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = ShareDataUIState + 113;
        copydefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static TunukiwaMpesaPurchasePayload copy$default(TunukiwaMpesaPurchasePayload tunukiwaMpesaPurchasePayload, String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, int i2, Object obj) {
        String str9;
        int i3;
        String str10;
        int i4 = 2 % 2;
        int i5 = component1;
        int i6 = i5 + 105;
        component2 = i6 % 128;
        String str11 = (i6 % 2 == 0 && (i2 & 1) != 0) ? tunukiwaMpesaPurchasePayload.paymentMethod : str;
        String str12 = (i2 & 2) != 0 ? tunukiwaMpesaPurchasePayload.offerId : str2;
        String str13 = (i2 & 4) != 0 ? tunukiwaMpesaPurchasePayload.offerName : str3;
        String str14 = (i2 & 8) != 0 ? tunukiwaMpesaPurchasePayload.subscriberType : str4;
        if ((i2 & 16) != 0) {
            int i7 = i5 + 13;
            component2 = i7 % 128;
            if (i7 % 2 != 0) {
                String str15 = tunukiwaMpesaPurchasePayload.partyAMsisdn;
                throw null;
            }
            str9 = tunukiwaMpesaPurchasePayload.partyAMsisdn;
        } else {
            str9 = str5;
        }
        String str16 = (i2 & 32) != 0 ? tunukiwaMpesaPurchasePayload.partyBMsisdn : str6;
        if ((i2 & 64) != 0) {
            int i8 = component2 + 87;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            i3 = tunukiwaMpesaPurchasePayload.okoaAmount;
        } else {
            i3 = i;
        }
        if ((i2 & 128) != 0) {
            int i10 = component1 + 73;
            int i11 = i10 % 128;
            component2 = i11;
            int i12 = i10 % 2;
            str10 = tunukiwaMpesaPurchasePayload.fulizaAmount;
            int i13 = i11 + 57;
            component1 = i13 % 128;
            int i14 = i13 % 2;
        } else {
            str10 = str7;
        }
        return tunukiwaMpesaPurchasePayload.copy(str11, str12, str13, str14, str9, str16, i3, str10, (i2 & 256) != 0 ? tunukiwaMpesaPurchasePayload.pin : str8);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 107;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.paymentMethod;
        int i4 = i2 + 53;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 23;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.offerId;
        int i5 = i2 + 89;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 33;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.offerName;
        int i5 = i2 + 19;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 101;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.subscriberType;
        int i4 = i2 + 13;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component1 + 13;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.partyAMsisdn;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component2 + 27;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.partyBMsisdn;
        int i5 = i3 + 37;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final int component7() {
        int i = 2 % 2;
        int i2 = component2 + 13;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.okoaAmount;
        }
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.fulizaAmount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.pin;
        int i5 = i3 + 1;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final TunukiwaMpesaPurchasePayload copy(String paymentMethod, String offerId, String offerName, String subscriberType, String partyAMsisdn, String partyBMsisdn, int okoaAmount, String fulizaAmount, String pin) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        TunukiwaMpesaPurchasePayload tunukiwaMpesaPurchasePayload = new TunukiwaMpesaPurchasePayload(paymentMethod, offerId, offerName, subscriberType, partyAMsisdn, partyBMsisdn, okoaAmount, fulizaAmount, pin);
        int i2 = component1 + 87;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 64 / 0;
        }
        return tunukiwaMpesaPurchasePayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 93;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 21;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 85 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof TunukiwaMpesaPurchasePayload)) {
            int i2 = component1 + 3;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        TunukiwaMpesaPurchasePayload tunukiwaMpesaPurchasePayload = (TunukiwaMpesaPurchasePayload) other;
        if (!Intrinsics.areEqual(this.paymentMethod, tunukiwaMpesaPurchasePayload.paymentMethod)) {
            int i4 = component2 + 59;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.offerId, tunukiwaMpesaPurchasePayload.offerId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.offerName, tunukiwaMpesaPurchasePayload.offerName)) {
            int i6 = component1 + 91;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.subscriberType, tunukiwaMpesaPurchasePayload.subscriberType)) {
            return false;
        }
        if (Intrinsics.areEqual(this.partyAMsisdn, tunukiwaMpesaPurchasePayload.partyAMsisdn)) {
            if (!Intrinsics.areEqual(this.partyBMsisdn, tunukiwaMpesaPurchasePayload.partyBMsisdn) || this.okoaAmount != tunukiwaMpesaPurchasePayload.okoaAmount) {
                return false;
            }
            if (Intrinsics.areEqual(this.fulizaAmount, tunukiwaMpesaPurchasePayload.fulizaAmount)) {
                return Intrinsics.areEqual(this.pin, tunukiwaMpesaPurchasePayload.pin);
            }
            int i8 = component1 + 93;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = component1 + 49;
        int i11 = i10 % 128;
        component2 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 109;
        component1 = i13 % 128;
        if (i13 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int iHashCode4 = this.paymentMethod.hashCode();
        String str = this.offerId;
        if (str == null) {
            int i2 = component2;
            int i3 = i2 + 99;
            component1 = i3 % 128;
            iHashCode = i3 % 2 == 0 ? 1 : 0;
            int i4 = i2 + 33;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.offerName;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.subscriberType;
        if (str3 == null) {
            int i6 = component2 + 33;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        String str4 = this.partyAMsisdn;
        if (str4 == null) {
            int i8 = component2 + 73;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str4.hashCode();
        }
        String str5 = this.partyBMsisdn;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        int iHashCode7 = Integer.hashCode(this.okoaAmount);
        String str6 = this.fulizaAmount;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.pin;
        return (((((((((((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TunukiwaMpesaPurchasePayload(paymentMethod=" + this.paymentMethod + ", offerId=" + this.offerId + ", offerName=" + this.offerName + ", subscriberType=" + this.subscriberType + ", partyAMsisdn=" + this.partyAMsisdn + ", partyBMsisdn=" + this.partyBMsisdn + ", okoaAmount=" + this.okoaAmount + ", fulizaAmount=" + this.fulizaAmount + ", pin=" + this.pin + ")";
        int i2 = component1 + 117;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 41;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.paymentMethod);
        dest.writeString(this.offerId);
        dest.writeString(this.offerName);
        dest.writeString(this.subscriberType);
        dest.writeString(this.partyAMsisdn);
        dest.writeString(this.partyBMsisdn);
        dest.writeInt(this.okoaAmount);
        dest.writeString(this.fulizaAmount);
        dest.writeString(this.pin);
        int i4 = component1 + 13;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }
}
