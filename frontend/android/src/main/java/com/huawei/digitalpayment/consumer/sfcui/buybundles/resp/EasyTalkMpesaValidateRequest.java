package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÇ\u0001J\b\u0010\u001d\u001a\u00020\nH\u0007J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H×\u0003J\t\u0010\"\u001a\u00020\nH×\u0001J\t\u0010#\u001a\u00020\u0003H×\u0001J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\nH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006)"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/EasyTalkMpesaValidateRequest;", "Landroid/os/Parcelable;", "partyAMsisdn", "", "partyBMsisdn", "tariff", "offerName", "offeringId", "", "offerPrice", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V", "getPartyAMsisdn", "()Ljava/lang/String;", "getPartyBMsisdn", "getTariff", "getOfferName", "getOfferingId", "()J", "getOfferPrice", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EasyTalkMpesaValidateRequest implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<EasyTalkMpesaValidateRequest> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int component3;

    @SerializedName("offerName")
    private final String offerName;

    @SerializedName("offerPrice")
    private final int offerPrice;

    @SerializedName("offeringId")
    private final long offeringId;

    @SerializedName("partyAMsisdn")
    private final String partyAMsisdn;

    @SerializedName("partyBMsisdn")
    private final String partyBMsisdn;

    @SerializedName("tariff")
    private final String tariff;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EasyTalkMpesaValidateRequest> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final EasyTalkMpesaValidateRequest createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            EasyTalkMpesaValidateRequest easyTalkMpesaValidateRequest = new EasyTalkMpesaValidateRequest(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt());
            int i2 = copydefault + 101;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return easyTalkMpesaValidateRequest;
            }
            throw null;
        }

        @Override
        public EasyTalkMpesaValidateRequest createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 113;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            EasyTalkMpesaValidateRequest easyTalkMpesaValidateRequestCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 15;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return easyTalkMpesaValidateRequestCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final EasyTalkMpesaValidateRequest[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault;
            int i4 = i3 + 31;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            EasyTalkMpesaValidateRequest[] easyTalkMpesaValidateRequestArr = new EasyTalkMpesaValidateRequest[i];
            int i6 = i3 + 107;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 65 / 0;
            }
            return easyTalkMpesaValidateRequestArr;
        }

        @Override
        public EasyTalkMpesaValidateRequest[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 45;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            EasyTalkMpesaValidateRequest[] easyTalkMpesaValidateRequestArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 77;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                return easyTalkMpesaValidateRequestArrNewArray;
            }
            throw null;
        }
    }

    public EasyTalkMpesaValidateRequest(String str, String str2, String str3, String str4, long j, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.partyAMsisdn = str;
        this.partyBMsisdn = str2;
        this.tariff = str3;
        this.offerName = str4;
        this.offeringId = j;
        this.offerPrice = i;
    }

    public final String getPartyAMsisdn() {
        int i = 2 % 2;
        int i2 = component1 + 105;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.partyAMsisdn;
        int i5 = i3 + 41;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 91 / 0;
        }
        return str;
    }

    public final String getPartyBMsisdn() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 83;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.partyBMsisdn;
        int i4 = i2 + 23;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return str;
    }

    public final String getTariff() {
        int i = 2 % 2;
        int i2 = component2 + 33;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.tariff;
        if (i3 == 0) {
            int i4 = 72 / 0;
        }
        return str;
    }

    public final String getOfferName() {
        int i = 2 % 2;
        int i2 = component2 + 97;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.offerName;
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
        return str;
    }

    public final long getOfferingId() {
        int i = 2 % 2;
        int i2 = component1 + 15;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        long j = this.offeringId;
        int i5 = i3 + 69;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getOfferPrice() {
        int i = 2 % 2;
        int i2 = component1 + 65;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = this.offerPrice;
        int i6 = i3 + 89;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component3 + 113;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EasyTalkMpesaValidateRequest copy$default(EasyTalkMpesaValidateRequest easyTalkMpesaValidateRequest, String str, String str2, String str3, String str4, long j, int i, int i2, Object obj) {
        String str5;
        String str6;
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = component1 + 103;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            str5 = easyTalkMpesaValidateRequest.partyAMsisdn;
        } else {
            str5 = str;
        }
        String str7 = (i2 & 2) != 0 ? easyTalkMpesaValidateRequest.partyBMsisdn : str2;
        String str8 = (i2 & 4) != 0 ? easyTalkMpesaValidateRequest.tariff : str3;
        if ((i2 & 8) != 0) {
            int i6 = component1;
            int i7 = i6 + 27;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            str6 = easyTalkMpesaValidateRequest.offerName;
            int i9 = i6 + 9;
            component2 = i9 % 128;
            int i10 = i9 % 2;
        } else {
            str6 = str4;
        }
        return easyTalkMpesaValidateRequest.copy(str5, str7, str8, str6, (i2 & 16) != 0 ? easyTalkMpesaValidateRequest.offeringId : j, (i2 & 32) != 0 ? easyTalkMpesaValidateRequest.offerPrice : i);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 39;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            str = this.partyAMsisdn;
            int i4 = 98 / 0;
        } else {
            str = this.partyAMsisdn;
        }
        int i5 = i3 + 111;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 75;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.partyBMsisdn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 3;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.tariff;
        int i5 = i3 + 13;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1 + 15;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.offerName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long component5() {
        int i = 2 % 2;
        int i2 = component2 + 125;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.offeringId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component6() {
        int i = 2 % 2;
        int i2 = component2 + 87;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.offerPrice;
        if (i3 == 0) {
            int i5 = 27 / 0;
        }
        return i4;
    }

    public final EasyTalkMpesaValidateRequest copy(String partyAMsisdn, String partyBMsisdn, String tariff, String offerName, long offeringId, int offerPrice) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(partyAMsisdn, "");
        Intrinsics.checkNotNullParameter(partyBMsisdn, "");
        Intrinsics.checkNotNullParameter(tariff, "");
        Intrinsics.checkNotNullParameter(offerName, "");
        EasyTalkMpesaValidateRequest easyTalkMpesaValidateRequest = new EasyTalkMpesaValidateRequest(partyAMsisdn, partyBMsisdn, tariff, offerName, offeringId, offerPrice);
        int i2 = component2 + 59;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return easyTalkMpesaValidateRequest;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 23;
        component1 = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof EasyTalkMpesaValidateRequest)) {
            return false;
        }
        EasyTalkMpesaValidateRequest easyTalkMpesaValidateRequest = (EasyTalkMpesaValidateRequest) other;
        if (!Intrinsics.areEqual(this.partyAMsisdn, easyTalkMpesaValidateRequest.partyAMsisdn)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.partyBMsisdn, easyTalkMpesaValidateRequest.partyBMsisdn)) {
            int i2 = component2 + 121;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.tariff, easyTalkMpesaValidateRequest.tariff)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.offerName, easyTalkMpesaValidateRequest.offerName)) {
            int i4 = component1 + 47;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.offeringId != easyTalkMpesaValidateRequest.offeringId) {
            return false;
        }
        if (this.offerPrice == easyTalkMpesaValidateRequest.offerPrice) {
            return true;
        }
        int i6 = component1 + 125;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 79 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 37;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.partyAMsisdn.hashCode() * 31) + this.partyBMsisdn.hashCode()) * 31) + this.tariff.hashCode()) * 31) + this.offerName.hashCode()) * 31) + Long.hashCode(this.offeringId)) * 31) + Integer.hashCode(this.offerPrice);
        int i4 = component2 + 49;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EasyTalkMpesaValidateRequest(partyAMsisdn=" + this.partyAMsisdn + ", partyBMsisdn=" + this.partyBMsisdn + ", tariff=" + this.tariff + ", offerName=" + this.offerName + ", offeringId=" + this.offeringId + ", offerPrice=" + this.offerPrice + ")";
        int i2 = component1 + 121;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 49;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.partyAMsisdn);
        dest.writeString(this.partyBMsisdn);
        dest.writeString(this.tariff);
        dest.writeString(this.offerName);
        dest.writeLong(this.offeringId);
        dest.writeInt(this.offerPrice);
        int i4 = component2 + 121;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }
}
