package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0002\b*\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010)JÚ\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÇ\u0001¢\u0006\u0002\u0010=J\b\u0010>\u001a\u00020?H\u0007J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010CH×\u0003J\t\u0010D\u001a\u00020?H×\u0001J\t\u0010E\u001a\u00020\u0003H×\u0001J\u0018\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020?H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)¨\u0006K"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DiyProductPurchasePayload;", "Landroid/os/Parcelable;", "accountIdOne", "", "accountIdTwo", "amount", "beneficiaryMsisdn", "bundleMins", "bundleSms", "productId", "productOfferId", "sponsorMsisdn", "validity", "validityType", "subscriberType", "encipheredPin", "payBill", "channelSessionId", "completedTime", "overDraftAmount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "getAccountIdOne", "()Ljava/lang/String;", "getAccountIdTwo", "getAmount", "getBeneficiaryMsisdn", "getBundleMins", "getBundleSms", "getProductId", "getProductOfferId", "getSponsorMsisdn", "getValidity", "getValidityType", "getSubscriberType", "getEncipheredPin", "getPayBill", "getChannelSessionId", "getCompletedTime", "getOverDraftAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DiyProductPurchasePayload;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DiyProductPurchasePayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DiyProductPurchasePayload> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("accountIdOne")
    private final String accountIdOne;

    @SerializedName("accountIdTwo")
    private final String accountIdTwo;

    @SerializedName("amount")
    private final String amount;

    @SerializedName("beneficiaryMsisdn")
    private final String beneficiaryMsisdn;

    @SerializedName("bundleMins")
    private final String bundleMins;

    @SerializedName("bundleSms")
    private final String bundleSms;

    @SerializedName("channelSessionId")
    private final String channelSessionId;

    @SerializedName("completedTime")
    private final String completedTime;

    @SerializedName("encipheredPin")
    private final String encipheredPin;

    @SerializedName("overDraftAmount")
    private final Double overDraftAmount;

    @SerializedName("payBill")
    private final String payBill;

    @SerializedName("productId")
    private final String productId;

    @SerializedName("productOfferId")
    private final String productOfferId;

    @SerializedName("sponsorMsisdn")
    private final String sponsorMsisdn;

    @SerializedName("subscriberType")
    private final String subscriberType;

    @SerializedName("validity")
    private final String validity;

    @SerializedName("validityType")
    private final String validityType;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DiyProductPurchasePayload> {
        private static int component2 = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DiyProductPurchasePayload createFromParcel(Parcel parcel) {
            Double d2;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            if (parcel.readInt() == 0) {
                d2 = null;
            } else {
                Double dValueOf = Double.valueOf(parcel.readDouble());
                int i2 = component3 + 37;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                d2 = dValueOf;
            }
            DiyProductPurchasePayload diyProductPurchasePayload = new DiyProductPurchasePayload(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, d2);
            int i4 = component2 + 99;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 8 / 0;
            }
            return diyProductPurchasePayload;
        }

        @Override
        public DiyProductPurchasePayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 57;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DiyProductPurchasePayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 97;
            int i4 = i3 % 128;
            component3 = i4;
            DiyProductPurchasePayload[] diyProductPurchasePayloadArr = new DiyProductPurchasePayload[i];
            if (i3 % 2 == 0) {
                int i5 = 39 / 0;
            }
            int i6 = i4 + 5;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return diyProductPurchasePayloadArr;
        }

        @Override
        public DiyProductPurchasePayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 89;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            DiyProductPurchasePayload[] diyProductPurchasePayloadArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 55 / 0;
            }
            return diyProductPurchasePayloadArrNewArray;
        }
    }

    public DiyProductPurchasePayload(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Double d2) {
        this.accountIdOne = str;
        this.accountIdTwo = str2;
        this.amount = str3;
        this.beneficiaryMsisdn = str4;
        this.bundleMins = str5;
        this.bundleSms = str6;
        this.productId = str7;
        this.productOfferId = str8;
        this.sponsorMsisdn = str9;
        this.validity = str10;
        this.validityType = str11;
        this.subscriberType = str12;
        this.encipheredPin = str13;
        this.payBill = str14;
        this.channelSessionId = str15;
        this.completedTime = str16;
        this.overDraftAmount = d2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DiyProductPurchasePayload(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState + 95;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str17 = "";
        } else {
            str17 = str;
        }
        if ((i & 2) != 0) {
            int i5 = 2 % 2;
            str18 = "";
        } else {
            str18 = str2;
        }
        String str28 = (i & 4) != 0 ? "" : str3;
        if ((i & 8) != 0) {
            int i6 = component1 + 43;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            str19 = "";
        } else {
            str19 = str4;
        }
        String str29 = (i & 16) != 0 ? "" : str5;
        String str30 = (i & 32) != 0 ? "" : str6;
        String str31 = (i & 64) != 0 ? "" : str7;
        if ((i & 128) != 0) {
            int i8 = ShareDataUIState + 57;
            component1 = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            str20 = "";
        } else {
            str20 = str8;
        }
        String str32 = (i & 256) != 0 ? "" : str9;
        if ((i & 512) != 0) {
            int i9 = ShareDataUIState + 111;
            component1 = i9 % 128;
            int i10 = i9 % 2;
            str21 = "";
        } else {
            str21 = str10;
        }
        if ((i & 1024) != 0) {
            int i11 = component1 + 123;
            ShareDataUIState = i11 % 128;
            int i12 = i11 % 2;
            str22 = "";
        } else {
            str22 = str11;
        }
        if ((i & 2048) != 0) {
            int i13 = 2 % 2;
            str23 = "";
        } else {
            str23 = str12;
        }
        String str33 = (i & 4096) != 0 ? "" : str13;
        if ((i & 8192) != 0) {
            int i14 = ShareDataUIState + 51;
            str24 = "";
            component1 = i14 % 128;
            if (i14 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            str25 = str24;
        } else {
            str24 = "";
            str25 = str14;
        }
        if ((i & 16384) != 0) {
            int i15 = ShareDataUIState + 93;
            str26 = str25;
            component1 = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 55 / 0;
            }
            str27 = str24;
        } else {
            str26 = str25;
            str27 = str15;
        }
        this(str17, str18, str28, str19, str29, str30, str31, str20, str32, str21, str22, str23, str33, str26, str27, (32768 & i) == 0 ? str16 : str24, (i & 65536) != 0 ? null : d2);
    }

    public final String getAccountIdOne() {
        int i = 2 % 2;
        int i2 = component1 + 37;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.accountIdOne;
        int i5 = i3 + 43;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAccountIdTwo() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 119;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountIdTwo;
        int i5 = i2 + 69;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 14 / 0;
        }
        return str;
    }

    public final String getAmount() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 93;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.amount;
            int i4 = 15 / 0;
        } else {
            str = this.amount;
        }
        int i5 = i2 + 47;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBeneficiaryMsisdn() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 39;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.beneficiaryMsisdn;
        int i5 = i2 + 5;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBundleMins() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.bundleMins;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getBundleSms() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 7;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.bundleSms;
            int i4 = 9 / 0;
        } else {
            str = this.bundleSms;
        }
        int i5 = i2 + 103;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getProductId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.productId;
        int i4 = i3 + 9;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getProductOfferId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 7;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.productOfferId;
        int i5 = i3 + 95;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getSponsorMsisdn() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 69;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.sponsorMsisdn;
        int i5 = i2 + 63;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getValidity() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 109;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.validity;
        int i5 = i2 + 53;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getValidityType() {
        int i = 2 % 2;
        int i2 = component1 + 101;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.validityType;
        }
        throw null;
    }

    public final String getSubscriberType() {
        int i = 2 % 2;
        int i2 = component1 + 65;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.subscriberType;
        int i5 = i3 + 55;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
        return str;
    }

    public final String getEncipheredPin() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.encipheredPin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPayBill() {
        int i = 2 % 2;
        int i2 = component1 + 109;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.payBill;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getChannelSessionId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.channelSessionId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getCompletedTime() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.completedTime;
        }
        throw null;
    }

    public final Double getOverDraftAmount() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Double d2 = this.overDraftAmount;
        int i5 = i3 + 5;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return d2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component3 + 119;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public DiyProductPurchasePayload() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public static DiyProductPurchasePayload copy$default(DiyProductPurchasePayload diyProductPurchasePayload, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Double d2, int i, Object obj) {
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        Double d3;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 97;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        String str24 = (i & 1) != 0 ? diyProductPurchasePayload.accountIdOne : str;
        if ((i & 2) != 0) {
            int i6 = i3 + 45;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            str17 = diyProductPurchasePayload.accountIdTwo;
        } else {
            str17 = str2;
        }
        String str25 = (i & 4) != 0 ? diyProductPurchasePayload.amount : str3;
        if ((i & 8) != 0) {
            int i8 = i3 + 49;
            component1 = i8 % 128;
            if (i8 % 2 != 0) {
                str18 = diyProductPurchasePayload.beneficiaryMsisdn;
                int i9 = 74 / 0;
            } else {
                str18 = diyProductPurchasePayload.beneficiaryMsisdn;
            }
        } else {
            str18 = str4;
        }
        String str26 = (i & 16) != 0 ? diyProductPurchasePayload.bundleMins : str5;
        String str27 = (i & 32) != 0 ? diyProductPurchasePayload.bundleSms : str6;
        if ((i & 64) != 0) {
            int i10 = component1 + 21;
            ShareDataUIState = i10 % 128;
            int i11 = i10 % 2;
            str19 = diyProductPurchasePayload.productId;
        } else {
            str19 = str7;
        }
        String str28 = (i & 128) != 0 ? diyProductPurchasePayload.productOfferId : str8;
        String str29 = (i & 256) != 0 ? diyProductPurchasePayload.sponsorMsisdn : str9;
        String str30 = (i & 512) != 0 ? diyProductPurchasePayload.validity : str10;
        Object obj2 = null;
        if ((i & 1024) != 0) {
            int i12 = component1 + 21;
            ShareDataUIState = i12 % 128;
            if (i12 % 2 == 0) {
                String str31 = diyProductPurchasePayload.validityType;
                obj2.hashCode();
                throw null;
            }
            str20 = diyProductPurchasePayload.validityType;
        } else {
            str20 = str11;
        }
        String str32 = (i & 2048) != 0 ? diyProductPurchasePayload.subscriberType : str12;
        String str33 = (i & 4096) != 0 ? diyProductPurchasePayload.encipheredPin : str13;
        String str34 = (i & 8192) != 0 ? diyProductPurchasePayload.payBill : str14;
        String str35 = (i & 16384) != 0 ? diyProductPurchasePayload.channelSessionId : str15;
        if ((i & 32768) != 0) {
            str21 = str35;
            int i13 = ShareDataUIState + 99;
            str22 = str33;
            component1 = i13 % 128;
            if (i13 % 2 != 0) {
                String str36 = diyProductPurchasePayload.completedTime;
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            str23 = diyProductPurchasePayload.completedTime;
        } else {
            str21 = str35;
            str22 = str33;
            str23 = str16;
        }
        if ((i & 65536) != 0) {
            d3 = diyProductPurchasePayload.overDraftAmount;
            int i14 = ShareDataUIState + 51;
            component1 = i14 % 128;
            int i15 = i14 % 2;
        } else {
            d3 = d2;
        }
        return diyProductPurchasePayload.copy(str24, str17, str25, str18, str26, str27, str19, str28, str29, str30, str20, str32, str22, str34, str21, str23, d3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.accountIdOne;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = component1 + 19;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.validity;
        int i5 = i3 + 47;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = component1 + 109;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.validityType;
        int i4 = i3 + 31;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 21;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.subscriberType;
        int i5 = i2 + 11;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 57;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.encipheredPin;
        int i5 = i2 + 73;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = component1 + 79;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.payBill;
        int i5 = i3 + 25;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 21 / 0;
        }
        return str;
    }

    public final String component15() {
        int i = 2 % 2;
        int i2 = component1 + 73;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.channelSessionId;
        int i5 = i3 + 67;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component16() {
        int i = 2 % 2;
        int i2 = component1 + 3;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.completedTime;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Double component17() {
        int i = 2 % 2;
        int i2 = component1 + 47;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Double d2 = this.overDraftAmount;
        int i4 = i3 + 121;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return d2;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 57;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.accountIdTwo;
        int i4 = i3 + 33;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 105;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amount;
        int i5 = i2 + 123;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1 + 81;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.beneficiaryMsisdn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.bundleMins;
        int i5 = i3 + 57;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 105;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.bundleSms;
        int i5 = i2 + 123;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component1 + 69;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.productId;
        int i5 = i3 + 63;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 61 / 0;
        }
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.productOfferId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.sponsorMsisdn;
        int i5 = i3 + 91;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final DiyProductPurchasePayload copy(String accountIdOne, String accountIdTwo, String amount, String beneficiaryMsisdn, String bundleMins, String bundleSms, String productId, String productOfferId, String sponsorMsisdn, String validity, String validityType, String subscriberType, String encipheredPin, String payBill, String channelSessionId, String completedTime, Double overDraftAmount) {
        int i = 2 % 2;
        DiyProductPurchasePayload diyProductPurchasePayload = new DiyProductPurchasePayload(accountIdOne, accountIdTwo, amount, beneficiaryMsisdn, bundleMins, bundleSms, productId, productOfferId, sponsorMsisdn, validity, validityType, subscriberType, encipheredPin, payBill, channelSessionId, completedTime, overDraftAmount);
        int i2 = ShareDataUIState + 75;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return diyProductPurchasePayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 41;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 19;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(!(other instanceof DiyProductPurchasePayload))) {
            DiyProductPurchasePayload diyProductPurchasePayload = (DiyProductPurchasePayload) other;
            if (!Intrinsics.areEqual(this.accountIdOne, diyProductPurchasePayload.accountIdOne)) {
                int i2 = component1 + 69;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.accountIdTwo, diyProductPurchasePayload.accountIdTwo)) {
                int i4 = component1 + 79;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.amount, diyProductPurchasePayload.amount) || !Intrinsics.areEqual(this.beneficiaryMsisdn, diyProductPurchasePayload.beneficiaryMsisdn) || !Intrinsics.areEqual(this.bundleMins, diyProductPurchasePayload.bundleMins) || !Intrinsics.areEqual(this.bundleSms, diyProductPurchasePayload.bundleSms)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.productId, diyProductPurchasePayload.productId)) {
                int i6 = component1 + 11;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.productOfferId, diyProductPurchasePayload.productOfferId)) {
                if (Intrinsics.areEqual(this.sponsorMsisdn, diyProductPurchasePayload.sponsorMsisdn)) {
                    if (!Intrinsics.areEqual(this.validity, diyProductPurchasePayload.validity)) {
                        int i8 = ShareDataUIState + 87;
                        component1 = i8 % 128;
                        return i8 % 2 != 0;
                    }
                    if (!Intrinsics.areEqual(this.validityType, diyProductPurchasePayload.validityType)) {
                        int i9 = ShareDataUIState + 21;
                        int i10 = i9 % 128;
                        component1 = i10;
                        int i11 = i9 % 2;
                        int i12 = i10 + 43;
                        ShareDataUIState = i12 % 128;
                        int i13 = i12 % 2;
                        return false;
                    }
                    if (!Intrinsics.areEqual(this.subscriberType, diyProductPurchasePayload.subscriberType)) {
                        int i14 = component1 + 97;
                        ShareDataUIState = i14 % 128;
                        int i15 = i14 % 2;
                        return false;
                    }
                    if ((!Intrinsics.areEqual(this.encipheredPin, diyProductPurchasePayload.encipheredPin)) || (!Intrinsics.areEqual(this.payBill, diyProductPurchasePayload.payBill)) || !Intrinsics.areEqual(this.channelSessionId, diyProductPurchasePayload.channelSessionId) || !Intrinsics.areEqual(this.completedTime, diyProductPurchasePayload.completedTime)) {
                        return false;
                    }
                    if (Intrinsics.areEqual((Object) this.overDraftAmount, (Object) diyProductPurchasePayload.overDraftAmount)) {
                        return true;
                    }
                    int i16 = ShareDataUIState + 77;
                    component1 = i16 % 128;
                    int i17 = i16 % 2;
                    return false;
                }
                return false;
            }
            int i18 = ShareDataUIState + 113;
            component1 = i18 % 128;
            int i19 = i18 % 2;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i;
        int iHashCode4;
        int i2 = 2 % 2;
        int i3 = component1 + 27;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountIdOne;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.accountIdTwo;
        if (str2 == null) {
            int i5 = ShareDataUIState + 9;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.amount;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.beneficiaryMsisdn;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.bundleMins;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.bundleSms;
        int iHashCode9 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.productId;
        if (str7 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str7.hashCode();
            int i7 = ShareDataUIState + 103;
            component1 = i7 % 128;
            int i8 = i7 % 2;
        }
        String str8 = this.productOfferId;
        int iHashCode10 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.sponsorMsisdn;
        int iHashCode11 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.validity;
        int iHashCode12 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.validityType;
        int iHashCode13 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.subscriberType;
        if (str12 == null) {
            int i9 = ShareDataUIState + 13;
            component1 = i9 % 128;
            int i10 = i9 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str12.hashCode();
        }
        String str13 = this.encipheredPin;
        int iHashCode14 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.payBill;
        if (str14 == null) {
            int i11 = component1 + 113;
            i = iHashCode14;
            ShareDataUIState = i11 % 128;
            int i12 = i11 % 2;
            iHashCode4 = 0;
        } else {
            i = iHashCode14;
            iHashCode4 = str14.hashCode();
        }
        String str15 = this.channelSessionId;
        int iHashCode15 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.completedTime;
        int iHashCode16 = str16 == null ? 0 : str16.hashCode();
        Double d2 = this.overDraftAmount;
        int iHashCode17 = (((((((((((((((((((((((((((((((iHashCode5 * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode2) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode3) * 31) + i) * 31) + iHashCode4) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (d2 == null ? 0 : d2.hashCode());
        int i13 = ShareDataUIState + 93;
        component1 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 89 / 0;
        }
        return iHashCode17;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DiyProductPurchasePayload(accountIdOne=" + this.accountIdOne + ", accountIdTwo=" + this.accountIdTwo + ", amount=" + this.amount + ", beneficiaryMsisdn=" + this.beneficiaryMsisdn + ", bundleMins=" + this.bundleMins + ", bundleSms=" + this.bundleSms + ", productId=" + this.productId + ", productOfferId=" + this.productOfferId + ", sponsorMsisdn=" + this.sponsorMsisdn + ", validity=" + this.validity + ", validityType=" + this.validityType + ", subscriberType=" + this.subscriberType + ", encipheredPin=" + this.encipheredPin + ", payBill=" + this.payBill + ", channelSessionId=" + this.channelSessionId + ", completedTime=" + this.completedTime + ", overDraftAmount=" + this.overDraftAmount + ")";
        int i2 = ShareDataUIState + 107;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.accountIdOne);
        dest.writeString(this.accountIdTwo);
        dest.writeString(this.amount);
        dest.writeString(this.beneficiaryMsisdn);
        dest.writeString(this.bundleMins);
        dest.writeString(this.bundleSms);
        dest.writeString(this.productId);
        dest.writeString(this.productOfferId);
        dest.writeString(this.sponsorMsisdn);
        dest.writeString(this.validity);
        dest.writeString(this.validityType);
        dest.writeString(this.subscriberType);
        dest.writeString(this.encipheredPin);
        dest.writeString(this.payBill);
        dest.writeString(this.channelSessionId);
        dest.writeString(this.completedTime);
        Double d2 = this.overDraftAmount;
        if (d2 == null) {
            int i2 = component1 + 29;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeDouble(d2.doubleValue());
        int i4 = ShareDataUIState + 17;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 % 3;
        }
    }
}
