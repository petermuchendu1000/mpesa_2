package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b/\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J¶\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÇ\u0001¢\u0006\u0002\u00104J\b\u00105\u001a\u00020\u0007H\u0007J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H×\u0003J\t\u0010:\u001a\u00020\u0007H×\u0001J\t\u0010;\u001a\u00020\u0003H×\u0001J\u0018\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u0007H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u001a\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001f\u0010\u0019R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b$\u0010\u0019¨\u0006A"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/OfaMotoPurchasePayload;", "Landroid/os/Parcelable;", "encryptedText", "", "flashMsg", "fulizaAmount", "fulizaEnabled", "", "okoaAmount", "partyAMsisdn", "partyBMsisdn", "sessionID", "sponsorMsisdnType", "subscriberType", "tunukiwaOfferId", "tunukiwaOfferPrice", "tunukiwaOfferType", "tunukiwaPurchaseCurrency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getEncryptedText", "()Ljava/lang/String;", "getFlashMsg", "getFulizaAmount", "getFulizaEnabled", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOkoaAmount", "getPartyAMsisdn", "getPartyBMsisdn", "getSessionID", "getSponsorMsisdnType", "getSubscriberType", "getTunukiwaOfferId", "getTunukiwaOfferPrice", "getTunukiwaOfferType", "getTunukiwaPurchaseCurrency", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/OfaMotoPurchasePayload;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OfaMotoPurchasePayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<OfaMotoPurchasePayload> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("encryptedText")
    private final String encryptedText;

    @SerializedName("flashMsg")
    private final String flashMsg;

    @SerializedName("fulizaAmount")
    private final String fulizaAmount;

    @SerializedName("fulizaEnabled")
    private final Integer fulizaEnabled;

    @SerializedName("okoaAmount")
    private final String okoaAmount;

    @SerializedName("partyAMsisdn")
    private final String partyAMsisdn;

    @SerializedName("partyBMsisdn")
    private final String partyBMsisdn;

    @SerializedName("sessionID")
    private final String sessionID;

    @SerializedName("sponsorMsisdnType")
    private final Integer sponsorMsisdnType;

    @SerializedName("subscriberType")
    private final String subscriberType;

    @SerializedName("tunukiwaOfferId")
    private final String tunukiwaOfferId;

    @SerializedName("tunukiwaOfferPrice")
    private final String tunukiwaOfferPrice;

    @SerializedName("tunukiwaOfferType")
    private final String tunukiwaOfferType;

    @SerializedName("tunukiwaPurchaseCurrency")
    private final Integer tunukiwaPurchaseCurrency;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OfaMotoPurchasePayload> {
        private static int component2 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final OfaMotoPurchasePayload createFromParcel(Parcel parcel) {
            Integer numValueOf;
            int i = 2 % 2;
            int i2 = component2 + 59;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 != 0) {
                parcel.readString();
                parcel.readString();
                parcel.readString();
                parcel.readInt();
                throw null;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i4 = component2 + 91;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            OfaMotoPurchasePayload ofaMotoPurchasePayload = new OfaMotoPurchasePayload(string, string2, string3, numValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            int i5 = component2 + 69;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return ofaMotoPurchasePayload;
        }

        @Override
        public OfaMotoPurchasePayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 33;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            OfaMotoPurchasePayload ofaMotoPurchasePayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 55;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return ofaMotoPurchasePayloadCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final OfaMotoPurchasePayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 105;
            component2 = i3 % 128;
            OfaMotoPurchasePayload[] ofaMotoPurchasePayloadArr = new OfaMotoPurchasePayload[i];
            if (i3 % 2 == 0) {
                int i4 = 98 / 0;
            }
            return ofaMotoPurchasePayloadArr;
        }

        @Override
        public OfaMotoPurchasePayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 121;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            OfaMotoPurchasePayload[] ofaMotoPurchasePayloadArrNewArray = newArray(i);
            int i5 = copydefault + 71;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return ofaMotoPurchasePayloadArrNewArray;
        }
    }

    public OfaMotoPurchasePayload(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, Integer num2, String str8, String str9, String str10, String str11, Integer num3) {
        this.encryptedText = str;
        this.flashMsg = str2;
        this.fulizaAmount = str3;
        this.fulizaEnabled = num;
        this.okoaAmount = str4;
        this.partyAMsisdn = str5;
        this.partyBMsisdn = str6;
        this.sessionID = str7;
        this.sponsorMsisdnType = num2;
        this.subscriberType = str8;
        this.tunukiwaOfferId = str9;
        this.tunukiwaOfferPrice = str10;
        this.tunukiwaOfferType = str11;
        this.tunukiwaPurchaseCurrency = num3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OfaMotoPurchasePayload(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, Integer num2, String str8, String str9, String str10, String str11, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str12;
        String str13;
        Integer num4;
        if ((i & 1) != 0) {
            int i2 = component1 + 9;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            str12 = "";
        } else {
            str12 = str;
        }
        if ((i & 4) != 0) {
            int i3 = ShareDataUIState + 33;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 111;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 2;
            }
            str13 = "";
        } else {
            str13 = str3;
        }
        if ((i & 8) != 0) {
            int i8 = ShareDataUIState + 5;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            num4 = 0;
        } else {
            num4 = num;
        }
        this(str12, str2, str13, num4, str4, str5, str6, str7, num2, str8, str9, str10, str11, num3);
    }

    public final String getEncryptedText() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            str = this.encryptedText;
            int i4 = 85 / 0;
        } else {
            str = this.encryptedText;
        }
        int i5 = i3 + 29;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getFlashMsg() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 19;
        ShareDataUIState = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.flashMsg;
        int i4 = i2 + 93;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getFulizaAmount() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 63;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.fulizaAmount;
        int i5 = i2 + 3;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer getFulizaEnabled() {
        int i = 2 % 2;
        int i2 = component1 + 123;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Integer num = this.fulizaEnabled;
        int i4 = i3 + 125;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final String getOkoaAmount() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.okoaAmount;
        int i5 = i3 + 31;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPartyAMsisdn() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 59;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.partyAMsisdn;
        int i5 = i2 + 37;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPartyBMsisdn() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 1;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.partyBMsisdn;
        int i4 = i2 + 33;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getSessionID() {
        int i = 2 % 2;
        int i2 = component1 + 53;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.sessionID;
        if (i3 != 0) {
            int i4 = 37 / 0;
        }
        return str;
    }

    public final Integer getSponsorMsisdnType() {
        Integer num;
        int i = 2 % 2;
        int i2 = component1 + 29;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            num = this.sponsorMsisdnType;
            int i4 = 95 / 0;
        } else {
            num = this.sponsorMsisdnType;
        }
        int i5 = i3 + 103;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String getSubscriberType() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 77;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            str = this.subscriberType;
            int i4 = 96 / 0;
        } else {
            str = this.subscriberType;
        }
        int i5 = i3 + 5;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTunukiwaOfferId() {
        int i = 2 % 2;
        int i2 = component1 + 53;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.tunukiwaOfferId;
        }
        throw null;
    }

    public final String getTunukiwaOfferPrice() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 95;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.tunukiwaOfferPrice;
            int i4 = 61 / 0;
        } else {
            str = this.tunukiwaOfferPrice;
        }
        int i5 = i2 + 49;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTunukiwaOfferType() {
        int i = 2 % 2;
        int i2 = component1 + 41;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.tunukiwaOfferType;
        int i4 = i3 + 51;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final Integer getTunukiwaPurchaseCurrency() {
        int i = 2 % 2;
        int i2 = component1 + 45;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.tunukiwaPurchaseCurrency;
        }
        throw null;
    }

    static {
        int i = component3 + 67;
        copydefault = i % 128;
        if (i % 2 == 0) {
            int i2 = 47 / 0;
        }
    }

    public static OfaMotoPurchasePayload copy$default(OfaMotoPurchasePayload ofaMotoPurchasePayload, String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, Integer num2, String str8, String str9, String str10, String str11, Integer num3, int i, Object obj) {
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        Integer num4;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 43;
        int i4 = i3 % 128;
        component1 = i4;
        String str17 = (i3 % 2 != 0 ? (i & 1) == 0 : (i & 1) == 0) ? str : ofaMotoPurchasePayload.encryptedText;
        String str18 = (i & 2) != 0 ? ofaMotoPurchasePayload.flashMsg : str2;
        if ((i & 4) != 0) {
            str12 = ofaMotoPurchasePayload.fulizaAmount;
            int i5 = i4 + 5;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
        } else {
            str12 = str3;
        }
        Integer num5 = (i & 8) != 0 ? ofaMotoPurchasePayload.fulizaEnabled : num;
        String str19 = (i & 16) != 0 ? ofaMotoPurchasePayload.okoaAmount : str4;
        String str20 = (i & 32) != 0 ? ofaMotoPurchasePayload.partyAMsisdn : str5;
        String str21 = (i & 64) != 0 ? ofaMotoPurchasePayload.partyBMsisdn : str6;
        if ((i & 128) != 0) {
            int i7 = i4 + 117;
            ShareDataUIState = i7 % 128;
            if (i7 % 2 != 0) {
                String str22 = ofaMotoPurchasePayload.sessionID;
                throw null;
            }
            str13 = ofaMotoPurchasePayload.sessionID;
        } else {
            str13 = str7;
        }
        Integer num6 = (i & 256) != 0 ? ofaMotoPurchasePayload.sponsorMsisdnType : num2;
        if ((i & 512) != 0) {
            int i8 = ShareDataUIState + 61;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            str14 = ofaMotoPurchasePayload.subscriberType;
        } else {
            str14 = str8;
        }
        String str23 = (i & 1024) != 0 ? ofaMotoPurchasePayload.tunukiwaOfferId : str9;
        String str24 = (i & 2048) != 0 ? ofaMotoPurchasePayload.tunukiwaOfferPrice : str10;
        if ((i & 4096) != 0) {
            int i10 = component1 + 107;
            str15 = str24;
            ShareDataUIState = i10 % 128;
            int i11 = i10 % 2;
            str16 = ofaMotoPurchasePayload.tunukiwaOfferType;
        } else {
            str15 = str24;
            str16 = str11;
        }
        if ((i & 8192) != 0) {
            int i12 = ShareDataUIState + 45;
            component1 = i12 % 128;
            int i13 = i12 % 2;
            num4 = ofaMotoPurchasePayload.tunukiwaPurchaseCurrency;
        } else {
            num4 = num3;
        }
        return ofaMotoPurchasePayload.copy(str17, str18, str12, num5, str19, str20, str21, str13, num6, str14, str23, str15, str16, num4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 85;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.encryptedText;
        int i5 = i2 + 45;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = component1 + 61;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.subscriberType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = component1 + 105;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.tunukiwaOfferId;
        }
        throw null;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = component1 + 11;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.tunukiwaOfferPrice;
        int i5 = i3 + 69;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 83;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tunukiwaOfferType;
        int i5 = i2 + 33;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component14() {
        int i = 2 % 2;
        int i2 = component1 + 5;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Integer num = this.tunukiwaPurchaseCurrency;
        int i5 = i3 + 123;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 113;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.flashMsg;
        int i5 = i3 + 23;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 59;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.fulizaAmount;
        int i5 = i3 + 123;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer component4() {
        int i = 2 % 2;
        int i2 = component1 + 73;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.fulizaEnabled;
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        return num;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 81;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.okoaAmount;
        int i4 = i2 + 81;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component1 + 113;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.partyAMsisdn;
        int i5 = i3 + 121;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 17;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.partyBMsisdn;
        int i5 = i2 + 29;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component1 + 55;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.sessionID;
        int i4 = i3 + 27;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final Integer component9() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.sponsorMsisdnType;
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
        return num;
    }

    public final OfaMotoPurchasePayload copy(String encryptedText, String flashMsg, String fulizaAmount, Integer fulizaEnabled, String okoaAmount, String partyAMsisdn, String partyBMsisdn, String sessionID, Integer sponsorMsisdnType, String subscriberType, String tunukiwaOfferId, String tunukiwaOfferPrice, String tunukiwaOfferType, Integer tunukiwaPurchaseCurrency) {
        int i = 2 % 2;
        OfaMotoPurchasePayload ofaMotoPurchasePayload = new OfaMotoPurchasePayload(encryptedText, flashMsg, fulizaAmount, fulizaEnabled, okoaAmount, partyAMsisdn, partyBMsisdn, sessionID, sponsorMsisdnType, subscriberType, tunukiwaOfferId, tunukiwaOfferPrice, tunukiwaOfferType, tunukiwaPurchaseCurrency);
        int i2 = ShareDataUIState + 33;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return ofaMotoPurchasePayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 55;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 83;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 105;
        component1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfaMotoPurchasePayload)) {
            int i4 = i2 + 101;
            component1 = i4 % 128;
            return i4 % 2 == 0;
        }
        OfaMotoPurchasePayload ofaMotoPurchasePayload = (OfaMotoPurchasePayload) other;
        if (!Intrinsics.areEqual(this.encryptedText, ofaMotoPurchasePayload.encryptedText)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.flashMsg, ofaMotoPurchasePayload.flashMsg)) {
            int i5 = component1 + 85;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.fulizaAmount, ofaMotoPurchasePayload.fulizaAmount)) {
            int i7 = ShareDataUIState + 35;
            component1 = i7 % 128;
            if (i7 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.fulizaEnabled, ofaMotoPurchasePayload.fulizaEnabled) || !Intrinsics.areEqual(this.okoaAmount, ofaMotoPurchasePayload.okoaAmount) || !Intrinsics.areEqual(this.partyAMsisdn, ofaMotoPurchasePayload.partyAMsisdn) || !Intrinsics.areEqual(this.partyBMsisdn, ofaMotoPurchasePayload.partyBMsisdn) || !Intrinsics.areEqual(this.sessionID, ofaMotoPurchasePayload.sessionID) || !Intrinsics.areEqual(this.sponsorMsisdnType, ofaMotoPurchasePayload.sponsorMsisdnType)) {
            return false;
        }
        if (Intrinsics.areEqual(this.subscriberType, ofaMotoPurchasePayload.subscriberType)) {
            return !(Intrinsics.areEqual(this.tunukiwaOfferId, ofaMotoPurchasePayload.tunukiwaOfferId) ^ true) && Intrinsics.areEqual(this.tunukiwaOfferPrice, ofaMotoPurchasePayload.tunukiwaOfferPrice) && Intrinsics.areEqual(this.tunukiwaOfferType, ofaMotoPurchasePayload.tunukiwaOfferType) && Intrinsics.areEqual(this.tunukiwaPurchaseCurrency, ofaMotoPurchasePayload.tunukiwaPurchaseCurrency);
        }
        int i8 = ShareDataUIState + 43;
        component1 = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int i;
        int iHashCode7;
        int i2 = 2 % 2;
        int i3 = component1 + 117;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.encryptedText;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        String str2 = this.flashMsg;
        if (str2 == null) {
            int i5 = component1 + 23;
            ShareDataUIState = i5 % 128;
            iHashCode = i5 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.fulizaAmount;
        if (str3 == null) {
            int i6 = component1 + 1;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        Integer num = this.fulizaEnabled;
        int iHashCode9 = num == null ? 0 : num.hashCode();
        String str4 = this.okoaAmount;
        if (str4 == null) {
            int i8 = component1 + 19;
            ShareDataUIState = i8 % 128;
            iHashCode3 = i8 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode3 = str4.hashCode();
        }
        String str5 = this.partyAMsisdn;
        int iHashCode10 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.partyBMsisdn;
        int iHashCode11 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.sessionID;
        if (str7 == null) {
            int i9 = component1 + 75;
            ShareDataUIState = i9 % 128;
            int i10 = i9 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str7.hashCode();
        }
        Integer num2 = this.sponsorMsisdnType;
        int iHashCode12 = num2 == null ? 0 : num2.hashCode();
        String str8 = this.subscriberType;
        if (str8 == null) {
            int i11 = component1 + 29;
            ShareDataUIState = i11 % 128;
            int i12 = i11 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = str8.hashCode();
        }
        String str9 = this.tunukiwaOfferId;
        if (str9 == null) {
            int i13 = ShareDataUIState + 27;
            component1 = i13 % 128;
            int i14 = i13 % 2;
            iHashCode6 = 0;
        } else {
            iHashCode6 = str9.hashCode();
        }
        String str10 = this.tunukiwaOfferPrice;
        int iHashCode13 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.tunukiwaOfferType;
        if (str11 == null) {
            int i15 = component1 + 11;
            ShareDataUIState = i15 % 128;
            i = i15 % 2 != 0 ? 1 : 0;
        } else {
            int iHashCode14 = str11.hashCode();
            int i16 = ShareDataUIState + 39;
            component1 = i16 % 128;
            int i17 = i16 % 2;
            i = iHashCode14;
        }
        Integer num3 = this.tunukiwaPurchaseCurrency;
        if (num3 == null) {
            int i18 = ShareDataUIState + 21;
            component1 = i18 % 128;
            int i19 = i18 % 2;
            iHashCode7 = 0;
        } else {
            iHashCode7 = num3.hashCode();
        }
        return (((((((((((((((((((((((((iHashCode8 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode9) * 31) + iHashCode3) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode4) * 31) + iHashCode12) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode13) * 31) + i) * 31) + iHashCode7;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OfaMotoPurchasePayload(encryptedText=" + this.encryptedText + ", flashMsg=" + this.flashMsg + ", fulizaAmount=" + this.fulizaAmount + ", fulizaEnabled=" + this.fulizaEnabled + ", okoaAmount=" + this.okoaAmount + ", partyAMsisdn=" + this.partyAMsisdn + ", partyBMsisdn=" + this.partyBMsisdn + ", sessionID=" + this.sessionID + ", sponsorMsisdnType=" + this.sponsorMsisdnType + ", subscriberType=" + this.subscriberType + ", tunukiwaOfferId=" + this.tunukiwaOfferId + ", tunukiwaOfferPrice=" + this.tunukiwaOfferPrice + ", tunukiwaOfferType=" + this.tunukiwaOfferType + ", tunukiwaPurchaseCurrency=" + this.tunukiwaPurchaseCurrency + ")";
        int i2 = component1 + 121;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.encryptedText);
        dest.writeString(this.flashMsg);
        dest.writeString(this.fulizaAmount);
        Integer num = this.fulizaEnabled;
        if (num == null) {
            int i2 = component1 + 37;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.okoaAmount);
        dest.writeString(this.partyAMsisdn);
        dest.writeString(this.partyBMsisdn);
        dest.writeString(this.sessionID);
        Integer num2 = this.sponsorMsisdnType;
        if (num2 == null) {
            dest.writeInt(0);
            int i4 = ShareDataUIState + 105;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeString(this.subscriberType);
        dest.writeString(this.tunukiwaOfferId);
        dest.writeString(this.tunukiwaOfferPrice);
        dest.writeString(this.tunukiwaOfferType);
        Integer num3 = this.tunukiwaPurchaseCurrency;
        if (num3 == null) {
            int i6 = component1 + 69;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 != 0) {
                dest.writeInt(1);
            } else {
                dest.writeInt(0);
            }
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        int i7 = component1 + 49;
        ShareDataUIState = i7 % 128;
        int i8 = i7 % 2;
    }
}
