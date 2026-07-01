package com.huawei.digitalpayment.consumer.base.resp;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/FulizaPrevalidationPayload;", "", "partyAMsisdn", "", "partyBMsisdn", "tariff", "offerName", "offeringId", "offerPrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPartyAMsisdn", "()Ljava/lang/String;", "getPartyBMsisdn", "getTariff", "getOfferName", "getOfferingId", "getOfferPrice", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FulizaPrevalidationPayload {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;

    @SerializedName("offerName")
    private final String offerName;

    @SerializedName("offerPrice")
    private final String offerPrice;

    @SerializedName("offeringId")
    private final String offeringId;

    @SerializedName("partyAMsisdn")
    private final String partyAMsisdn;

    @SerializedName("partyBMsisdn")
    private final String partyBMsisdn;

    @SerializedName("tariff")
    private final String tariff;

    public FulizaPrevalidationPayload(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.partyAMsisdn = str;
        this.partyBMsisdn = str2;
        this.tariff = str3;
        this.offerName = str4;
        this.offeringId = str5;
        this.offerPrice = str6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FulizaPrevalidationPayload(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0) {
            int i2 = copydefault + 87;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 39;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str4 = "";
        }
        this(str, str2, str3, str4, str5, str6);
    }

    public final String getPartyAMsisdn() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.partyAMsisdn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPartyBMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.partyBMsisdn;
        }
        throw null;
    }

    public final String getTariff() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.tariff;
        int i5 = i3 + 19;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getOfferName() {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.offerName;
        int i5 = i3 + 17;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getOfferingId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.offeringId;
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
        return str;
    }

    public final String getOfferPrice() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.offerPrice;
        int i5 = i3 + 85;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static FulizaPrevalidationPayload copy$default(FulizaPrevalidationPayload fulizaPrevalidationPayload, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copydefault + 109;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            str = fulizaPrevalidationPayload.partyAMsisdn;
        }
        String str7 = str;
        if ((i & 2) != 0) {
            str2 = fulizaPrevalidationPayload.partyBMsisdn;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            int i5 = copydefault + 77;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                String str9 = fulizaPrevalidationPayload.tariff;
                throw null;
            }
            str3 = fulizaPrevalidationPayload.tariff;
        }
        String str10 = str3;
        if ((i & 8) != 0) {
            str4 = fulizaPrevalidationPayload.offerName;
        }
        String str11 = str4;
        if ((i & 16) != 0) {
            int i6 = ShareDataUIState + 69;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            str5 = fulizaPrevalidationPayload.offeringId;
            if (i7 == 0) {
                int i8 = 40 / 0;
            }
        }
        String str12 = str5;
        if ((i & 32) != 0) {
            int i9 = copydefault + 63;
            ShareDataUIState = i9 % 128;
            int i10 = i9 % 2;
            str6 = fulizaPrevalidationPayload.offerPrice;
            if (i10 != 0) {
                int i11 = 49 / 0;
            }
        }
        return fulizaPrevalidationPayload.copy(str7, str8, str10, str11, str12, str6);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.partyAMsisdn;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.partyBMsisdn;
        int i5 = i3 + 119;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 63;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tariff;
        int i5 = i2 + 99;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 57;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.offerName;
        int i5 = i2 + 109;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copydefault + 25;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.offeringId;
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 19;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.offerPrice;
        int i5 = i2 + 49;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final FulizaPrevalidationPayload copy(String partyAMsisdn, String partyBMsisdn, String tariff, String offerName, String offeringId, String offerPrice) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(partyAMsisdn, "");
        Intrinsics.checkNotNullParameter(partyBMsisdn, "");
        Intrinsics.checkNotNullParameter(tariff, "");
        Intrinsics.checkNotNullParameter(offerName, "");
        Intrinsics.checkNotNullParameter(offeringId, "");
        Intrinsics.checkNotNullParameter(offerPrice, "");
        FulizaPrevalidationPayload fulizaPrevalidationPayload = new FulizaPrevalidationPayload(partyAMsisdn, partyBMsisdn, tariff, offerName, offeringId, offerPrice);
        int i2 = copydefault + 75;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return fulizaPrevalidationPayload;
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
        if (!(other instanceof FulizaPrevalidationPayload)) {
            return false;
        }
        FulizaPrevalidationPayload fulizaPrevalidationPayload = (FulizaPrevalidationPayload) other;
        if (!Intrinsics.areEqual(this.partyAMsisdn, fulizaPrevalidationPayload.partyAMsisdn)) {
            int i2 = ShareDataUIState + 43;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.partyBMsisdn, fulizaPrevalidationPayload.partyBMsisdn)) {
            int i4 = copydefault + 99;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.tariff, fulizaPrevalidationPayload.tariff)) {
            int i5 = copydefault + 1;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.offerName, fulizaPrevalidationPayload.offerName))) {
            return Intrinsics.areEqual(this.offeringId, fulizaPrevalidationPayload.offeringId) && Intrinsics.areEqual(this.offerPrice, fulizaPrevalidationPayload.offerPrice);
        }
        int i7 = ShareDataUIState + 33;
        copydefault = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.partyAMsisdn.hashCode() * 31) + this.partyBMsisdn.hashCode()) * 31) + this.tariff.hashCode()) * 31) + this.offerName.hashCode()) * 31) + this.offeringId.hashCode()) * 31) + this.offerPrice.hashCode();
        int i4 = ShareDataUIState + 9;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FulizaPrevalidationPayload(partyAMsisdn=" + this.partyAMsisdn + ", partyBMsisdn=" + this.partyBMsisdn + ", tariff=" + this.tariff + ", offerName=" + this.offerName + ", offeringId=" + this.offeringId + ", offerPrice=" + this.offerPrice + ")";
        int i2 = copydefault + 31;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 48 / 0;
        }
        return str;
    }
}
