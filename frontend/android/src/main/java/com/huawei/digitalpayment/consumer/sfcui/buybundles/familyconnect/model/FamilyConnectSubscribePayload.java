package com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0014H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/FamilyConnectSubscribePayload;", "Landroid/os/Parcelable;", "offerPrice", "", "offeringId", "paymentOption", "sponsorMsisdn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOfferPrice", "()Ljava/lang/String;", "getOfferingId", "getPaymentOption", "getSponsorMsisdn", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FamilyConnectSubscribePayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FamilyConnectSubscribePayload> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("offerPrice")
    private final String offerPrice;

    @SerializedName("offeringId")
    private final String offeringId;

    @SerializedName("paymentOption")
    private final String paymentOption;

    @SerializedName("sponsorMsisdn")
    private final String sponsorMsisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FamilyConnectSubscribePayload> {
        private static int component2 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FamilyConnectSubscribePayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            FamilyConnectSubscribePayload familyConnectSubscribePayload = new FamilyConnectSubscribePayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component2 + 121;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return familyConnectSubscribePayload;
            }
            throw null;
        }

        @Override
        public FamilyConnectSubscribePayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 35;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                createFromParcel(parcel);
                throw null;
            }
            FamilyConnectSubscribePayload familyConnectSubscribePayloadCreateFromParcel = createFromParcel(parcel);
            int i3 = component2 + 99;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return familyConnectSubscribePayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FamilyConnectSubscribePayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 31;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i3 % 2;
            FamilyConnectSubscribePayload[] familyConnectSubscribePayloadArr = new FamilyConnectSubscribePayload[i];
            int i6 = i4 + 65;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                return familyConnectSubscribePayloadArr;
            }
            throw null;
        }

        @Override
        public FamilyConnectSubscribePayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 107;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            FamilyConnectSubscribePayload[] familyConnectSubscribePayloadArrNewArray = newArray(i);
            int i5 = copydefault + 125;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return familyConnectSubscribePayloadArrNewArray;
            }
            throw null;
        }
    }

    public FamilyConnectSubscribePayload(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.offerPrice = str;
        this.offeringId = str2;
        this.paymentOption = str3;
        this.sponsorMsisdn = str4;
    }

    public final String getOfferPrice() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 55;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.offerPrice;
        int i5 = i2 + 71;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getOfferingId() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 27;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            str = this.offeringId;
            int i4 = 79 / 0;
        } else {
            str = this.offeringId;
        }
        int i5 = i3 + 87;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPaymentOption() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 77;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            str = this.paymentOption;
            int i4 = 90 / 0;
        } else {
            str = this.paymentOption;
        }
        int i5 = i3 + 103;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getSponsorMsisdn() {
        int i = 2 % 2;
        int i2 = component1 + 19;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.sponsorMsisdn;
        int i4 = i3 + 115;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = component3 + 61;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FamilyConnectSubscribePayload copy$default(FamilyConnectSubscribePayload familyConnectSubscribePayload, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = familyConnectSubscribePayload.offerPrice;
        }
        if ((i & 2) != 0) {
            int i3 = copydefault + 27;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                str2 = familyConnectSubscribePayload.offeringId;
                int i4 = 15 / 0;
            } else {
                str2 = familyConnectSubscribePayload.offeringId;
            }
        }
        if ((i & 4) != 0) {
            str3 = familyConnectSubscribePayload.paymentOption;
        }
        if ((i & 8) != 0) {
            int i5 = component1 + 113;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            str4 = familyConnectSubscribePayload.sponsorMsisdn;
        }
        return familyConnectSubscribePayload.copy(str, str2, str3, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 113;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.offerPrice;
        int i5 = i2 + 49;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 17;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.offeringId;
        int i5 = i2 + 59;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 69;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            str = this.paymentOption;
            int i4 = 75 / 0;
        } else {
            str = this.paymentOption;
        }
        int i5 = i3 + 51;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 74 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 121;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.sponsorMsisdn;
        int i5 = i2 + 9;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final FamilyConnectSubscribePayload copy(String offerPrice, String offeringId, String paymentOption, String sponsorMsisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(offerPrice, "");
        Intrinsics.checkNotNullParameter(offeringId, "");
        Intrinsics.checkNotNullParameter(paymentOption, "");
        Intrinsics.checkNotNullParameter(sponsorMsisdn, "");
        FamilyConnectSubscribePayload familyConnectSubscribePayload = new FamilyConnectSubscribePayload(offerPrice, offeringId, paymentOption, sponsorMsisdn);
        int i2 = copydefault + 1;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 29 / 0;
        }
        return familyConnectSubscribePayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 85;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 113;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilyConnectSubscribePayload)) {
            int i4 = i2 + 115;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        FamilyConnectSubscribePayload familyConnectSubscribePayload = (FamilyConnectSubscribePayload) other;
        if (!Intrinsics.areEqual(this.offerPrice, familyConnectSubscribePayload.offerPrice)) {
            return false;
        }
        if (Intrinsics.areEqual(this.offeringId, familyConnectSubscribePayload.offeringId)) {
            return Intrinsics.areEqual(this.paymentOption, familyConnectSubscribePayload.paymentOption) && !(Intrinsics.areEqual(this.sponsorMsisdn, familyConnectSubscribePayload.sponsorMsisdn) ^ true);
        }
        int i6 = copydefault + 31;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.offerPrice.hashCode();
        return i3 != 0 ? (((((iHashCode * 75) << this.offeringId.hashCode()) >> 30) >> this.paymentOption.hashCode()) / 26) >>> this.sponsorMsisdn.hashCode() : (((((iHashCode * 31) + this.offeringId.hashCode()) * 31) + this.paymentOption.hashCode()) * 31) + this.sponsorMsisdn.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FamilyConnectSubscribePayload(offerPrice=" + this.offerPrice + ", offeringId=" + this.offeringId + ", paymentOption=" + this.paymentOption + ", sponsorMsisdn=" + this.sponsorMsisdn + ")";
        int i2 = component1 + 3;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 41;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.offerPrice);
        dest.writeString(this.offeringId);
        dest.writeString(this.paymentOption);
        dest.writeString(this.sponsorMsisdn);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
