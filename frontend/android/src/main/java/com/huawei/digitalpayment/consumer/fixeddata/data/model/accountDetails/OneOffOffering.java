package com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b8\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0000HÆ\u0003JÕ\u0001\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0000HÇ\u0001J\b\u0010;\u001a\u00020<H\u0007J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@H×\u0003J\t\u0010A\u001a\u00020<H×\u0001J\t\u0010B\u001a\u00020\u0003H×\u0001J\u0018\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020<H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00008\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006H"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/OneOffOffering;", "Landroid/os/Parcelable;", "serviceCode", "", "offerInfo", "parentOfferingId", "offeringId", "offeringCode", "purchaseSeq", "rentCycleId", "rentalVal", "bundleFlag", "beneficiaryMsisdn", "discountValue", "discountExpiry", "status", "statusDetail", "additionalInfo", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "oneOffOffering", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/OneOffOffering;)V", "getServiceCode", "()Ljava/lang/String;", "getOfferInfo", "getParentOfferingId", "getOfferingId", "getOfferingCode", "getPurchaseSeq", "getRentCycleId", "getRentalVal", "getBundleFlag", "getBeneficiaryMsisdn", "getDiscountValue", "getDiscountExpiry", "getStatus", "getStatusDetail", "getAdditionalInfo", "getCategory", "getOneOffOffering", "()Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/OneOffOffering;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OneOffOffering implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<OneOffOffering> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("additionalInfo")
    private final String additionalInfo;

    @SerializedName("beneficiaryMsisdn")
    private final String beneficiaryMsisdn;

    @SerializedName("bundleFlag")
    private final String bundleFlag;

    @SerializedName(TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY)
    private final String category;

    @SerializedName("discountExpiry")
    private final String discountExpiry;

    @SerializedName("discountValue")
    private final String discountValue;

    @SerializedName("offerInfo")
    private final String offerInfo;

    @SerializedName("offeringCode")
    private final String offeringCode;

    @SerializedName("offeringId")
    private final String offeringId;

    @SerializedName("oneOffOffering")
    private final OneOffOffering oneOffOffering;

    @SerializedName("parentOfferingId")
    private final String parentOfferingId;

    @SerializedName("purchaseSeq")
    private final String purchaseSeq;

    @SerializedName("rentCycleId")
    private final String rentCycleId;

    @SerializedName("rentalVal")
    private final String rentalVal;

    @SerializedName("serviceCode")
    private final String serviceCode;

    @SerializedName("status")
    private final String status;

    @SerializedName("statusDetail")
    private final String statusDetail;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OneOffOffering> {
        private static int component2 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final OneOffOffering createFromParcel(Parcel parcel) {
            OneOffOffering oneOffOfferingCreateFromParcel;
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
                int i2 = copydefault + 65;
                int i3 = i2 % 128;
                component2 = i3;
                oneOffOfferingCreateFromParcel = null;
                if (i2 % 2 != 0) {
                    oneOffOfferingCreateFromParcel.hashCode();
                    throw null;
                }
                int i4 = i3 + 45;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
            } else {
                oneOffOfferingCreateFromParcel = OneOffOffering.CREATOR.createFromParcel(parcel);
            }
            return new OneOffOffering(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, oneOffOfferingCreateFromParcel);
        }

        @Override
        public OneOffOffering createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 31;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            OneOffOffering oneOffOfferingCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 111;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return oneOffOfferingCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final OneOffOffering[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 115;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            OneOffOffering[] oneOffOfferingArr = new OneOffOffering[i];
            int i6 = i3 + 47;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                return oneOffOfferingArr;
            }
            throw null;
        }

        @Override
        public OneOffOffering[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 121;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            OneOffOffering[] oneOffOfferingArrNewArray = newArray(i);
            int i5 = copydefault + 39;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return oneOffOfferingArrNewArray;
        }
    }

    public OneOffOffering(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, OneOffOffering oneOffOffering) {
        this.serviceCode = str;
        this.offerInfo = str2;
        this.parentOfferingId = str3;
        this.offeringId = str4;
        this.offeringCode = str5;
        this.purchaseSeq = str6;
        this.rentCycleId = str7;
        this.rentalVal = str8;
        this.bundleFlag = str9;
        this.beneficiaryMsisdn = str10;
        this.discountValue = str11;
        this.discountExpiry = str12;
        this.status = str13;
        this.statusDetail = str14;
        this.additionalInfo = str15;
        this.category = str16;
        this.oneOffOffering = oneOffOffering;
    }

    public final String getServiceCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.serviceCode;
        int i5 = i3 + 25;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getOfferInfo() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 5;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.offerInfo;
        int i5 = i2 + 79;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getParentOfferingId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.parentOfferingId;
        int i5 = i3 + 69;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getOfferingId() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 115;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.offeringId;
        int i5 = i2 + 81;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getOfferingCode() {
        int i = 2 % 2;
        int i2 = component2 + 69;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.offeringCode;
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
        return str;
    }

    public final String getPurchaseSeq() {
        int i = 2 % 2;
        int i2 = component2 + 3;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.purchaseSeq;
        int i5 = i3 + 23;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getRentCycleId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 15;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.rentCycleId;
        int i5 = i2 + 57;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getRentalVal() {
        int i = 2 % 2;
        int i2 = component2 + 21;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.rentalVal;
        }
        throw null;
    }

    public final String getBundleFlag() {
        int i = 2 % 2;
        int i2 = component2 + 59;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.bundleFlag;
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        return str;
    }

    public final String getBeneficiaryMsisdn() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 57;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.beneficiaryMsisdn;
        int i5 = i2 + 93;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getDiscountValue() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.discountValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getDiscountExpiry() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 61;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            str = this.discountExpiry;
            int i4 = 71 / 0;
        } else {
            str = this.discountExpiry;
        }
        int i5 = i3 + 65;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getStatus() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 21;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            str = this.status;
            int i4 = 65 / 0;
        } else {
            str = this.status;
        }
        int i5 = i3 + 79;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getStatusDetail() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.statusDetail;
        if (i3 == 0) {
            int i4 = 69 / 0;
        }
        return str;
    }

    public final String getAdditionalInfo() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 51;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.additionalInfo;
        int i5 = i2 + 61;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getCategory() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.category;
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
        return str;
    }

    public final OneOffOffering getOneOffOffering() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 97;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        OneOffOffering oneOffOffering = this.oneOffOffering;
        int i5 = i2 + 83;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 40 / 0;
        }
        return oneOffOffering;
    }

    static {
        int i = component3 + 109;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static OneOffOffering copy$default(OneOffOffering oneOffOffering, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, OneOffOffering oneOffOffering2, int i, Object obj) {
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        OneOffOffering oneOffOffering3;
        int i2 = 2 % 2;
        String str24 = (i & 1) != 0 ? oneOffOffering.serviceCode : str;
        String str25 = (i & 2) != 0 ? oneOffOffering.offerInfo : str2;
        String str26 = (i & 4) != 0 ? oneOffOffering.parentOfferingId : str3;
        String str27 = (i & 8) != 0 ? oneOffOffering.offeringId : str4;
        if ((i & 16) != 0) {
            int i3 = ShareDataUIState + 79;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            str17 = oneOffOffering.offeringCode;
        } else {
            str17 = str5;
        }
        if ((i & 32) != 0) {
            int i5 = component2 + 97;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                String str28 = oneOffOffering.purchaseSeq;
                throw null;
            }
            str18 = oneOffOffering.purchaseSeq;
        } else {
            str18 = str6;
        }
        String str29 = (i & 64) != 0 ? oneOffOffering.rentCycleId : str7;
        String str30 = (i & 128) != 0 ? oneOffOffering.rentalVal : str8;
        String str31 = (i & 256) != 0 ? oneOffOffering.bundleFlag : str9;
        String str32 = (i & 512) != 0 ? oneOffOffering.beneficiaryMsisdn : str10;
        if ((i & 1024) != 0) {
            int i6 = component2 + 69;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            str19 = oneOffOffering.discountValue;
        } else {
            str19 = str11;
        }
        if ((i & 2048) != 0) {
            int i8 = ShareDataUIState + 7;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            str20 = oneOffOffering.discountExpiry;
        } else {
            str20 = str12;
        }
        String str33 = (i & 4096) != 0 ? oneOffOffering.status : str13;
        String str34 = (i & 8192) != 0 ? oneOffOffering.statusDetail : str14;
        if ((i & 16384) != 0) {
            int i10 = ShareDataUIState + 115;
            str21 = str33;
            component2 = i10 % 128;
            int i11 = i10 % 2;
            str22 = oneOffOffering.additionalInfo;
        } else {
            str21 = str33;
            str22 = str15;
        }
        String str35 = (32768 & i) != 0 ? oneOffOffering.category : str16;
        if ((i & 65536) != 0) {
            int i12 = component2 + 105;
            str23 = str35;
            ShareDataUIState = i12 % 128;
            if (i12 % 2 != 0) {
                oneOffOffering3 = oneOffOffering.oneOffOffering;
                int i13 = 97 / 0;
            } else {
                oneOffOffering3 = oneOffOffering.oneOffOffering;
            }
        } else {
            str23 = str35;
            oneOffOffering3 = oneOffOffering2;
        }
        return oneOffOffering.copy(str24, str25, str26, str27, str17, str18, str29, str30, str31, str32, str19, str20, str21, str34, str22, str23, oneOffOffering3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 121;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.serviceCode;
        int i5 = i3 + 85;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 67;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.beneficiaryMsisdn;
        int i5 = i2 + 67;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = component2 + 47;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.discountValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 39;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.discountExpiry;
        int i4 = i2 + 15;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = component2 + 81;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.status;
        int i5 = i3 + 103;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.statusDetail;
        int i4 = i3 + 93;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
        return str;
    }

    public final String component15() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 91;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.additionalInfo;
        int i4 = i2 + 45;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component16() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.category;
        int i4 = i3 + 27;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final OneOffOffering component17() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 65;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        OneOffOffering oneOffOffering = this.oneOffOffering;
        int i4 = i2 + 105;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return oneOffOffering;
        }
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.offerInfo;
        int i5 = i3 + 13;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 78 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 19;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.parentOfferingId;
        int i5 = i3 + 57;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.offeringId;
        int i5 = i3 + 7;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.offeringCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component2 + 13;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.purchaseSeq;
        int i5 = i3 + 55;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.rentCycleId;
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 51;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.rentalVal;
        int i5 = i2 + 77;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 39;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.bundleFlag;
        int i5 = i2 + 83;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 29 / 0;
        }
        return str;
    }

    public final OneOffOffering copy(String serviceCode, String offerInfo, String parentOfferingId, String offeringId, String offeringCode, String purchaseSeq, String rentCycleId, String rentalVal, String bundleFlag, String beneficiaryMsisdn, String discountValue, String discountExpiry, String status, String statusDetail, String additionalInfo, String category, OneOffOffering oneOffOffering) {
        int i = 2 % 2;
        OneOffOffering oneOffOffering2 = new OneOffOffering(serviceCode, offerInfo, parentOfferingId, offeringId, offeringCode, purchaseSeq, rentCycleId, rentalVal, bundleFlag, beneficiaryMsisdn, discountValue, discountExpiry, status, statusDetail, additionalInfo, category, oneOffOffering);
        int i2 = component2 + 17;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return oneOffOffering2;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 75;
        ShareDataUIState = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneOffOffering)) {
            return false;
        }
        OneOffOffering oneOffOffering = (OneOffOffering) other;
        if (!Intrinsics.areEqual(this.serviceCode, oneOffOffering.serviceCode)) {
            int i2 = ShareDataUIState + 25;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.offerInfo, oneOffOffering.offerInfo) || !Intrinsics.areEqual(this.parentOfferingId, oneOffOffering.parentOfferingId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.offeringId, oneOffOffering.offeringId)) {
            int i4 = component2 + 125;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.offeringCode, oneOffOffering.offeringCode) || !Intrinsics.areEqual(this.purchaseSeq, oneOffOffering.purchaseSeq) || !Intrinsics.areEqual(this.rentCycleId, oneOffOffering.rentCycleId) || !Intrinsics.areEqual(this.rentalVal, oneOffOffering.rentalVal) || !Intrinsics.areEqual(this.bundleFlag, oneOffOffering.bundleFlag)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.beneficiaryMsisdn, oneOffOffering.beneficiaryMsisdn)) {
            int i6 = ShareDataUIState + 95;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.discountValue, oneOffOffering.discountValue)) {
            int i8 = ShareDataUIState + 93;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.discountExpiry, oneOffOffering.discountExpiry)) {
            int i10 = ShareDataUIState + 45;
            component2 = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.status, oneOffOffering.status) || !Intrinsics.areEqual(this.statusDetail, oneOffOffering.statusDetail) || !Intrinsics.areEqual(this.additionalInfo, oneOffOffering.additionalInfo)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.category, oneOffOffering.category)) {
            int i12 = component2 + 35;
            ShareDataUIState = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.oneOffOffering, oneOffOffering.oneOffOffering)) {
            return true;
        }
        int i14 = ShareDataUIState + 109;
        component2 = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i;
        int iHashCode5;
        int i2 = 2 % 2;
        String str = this.serviceCode;
        if (str == null) {
            int i3 = ShareDataUIState + 97;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.offerInfo;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.parentOfferingId;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.offeringId;
        if (str4 == null) {
            int i5 = component2 + 83;
            ShareDataUIState = i5 % 128;
            iHashCode2 = i5 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode2 = str4.hashCode();
        }
        String str5 = this.offeringCode;
        if (str5 == null) {
            int i6 = ShareDataUIState + 105;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str5.hashCode();
        }
        String str6 = this.purchaseSeq;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.rentCycleId;
        int iHashCode9 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.rentalVal;
        int iHashCode10 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.bundleFlag;
        int iHashCode11 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.beneficiaryMsisdn;
        if (str10 == null) {
            int i8 = component2 + 61;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str10.hashCode();
        }
        String str11 = this.discountValue;
        int iHashCode12 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.discountExpiry;
        int iHashCode13 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.status;
        int iHashCode14 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.statusDetail;
        int iHashCode15 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.additionalInfo;
        if (str15 == null) {
            int i10 = ShareDataUIState + 43;
            i = iHashCode15;
            component2 = i10 % 128;
            iHashCode5 = i10 % 2 == 0 ? 1 : 0;
        } else {
            i = iHashCode15;
            iHashCode5 = str15.hashCode();
        }
        String str16 = this.category;
        int iHashCode16 = str16 == null ? 0 : str16.hashCode();
        OneOffOffering oneOffOffering = this.oneOffOffering;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode4) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + i) * 31) + iHashCode5) * 31) + iHashCode16) * 31) + (oneOffOffering == null ? 0 : oneOffOffering.hashCode());
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OneOffOffering(serviceCode=" + this.serviceCode + ", offerInfo=" + this.offerInfo + ", parentOfferingId=" + this.parentOfferingId + ", offeringId=" + this.offeringId + ", offeringCode=" + this.offeringCode + ", purchaseSeq=" + this.purchaseSeq + ", rentCycleId=" + this.rentCycleId + ", rentalVal=" + this.rentalVal + ", bundleFlag=" + this.bundleFlag + ", beneficiaryMsisdn=" + this.beneficiaryMsisdn + ", discountValue=" + this.discountValue + ", discountExpiry=" + this.discountExpiry + ", status=" + this.status + ", statusDetail=" + this.statusDetail + ", additionalInfo=" + this.additionalInfo + ", category=" + this.category + ", oneOffOffering=" + this.oneOffOffering + ")";
        int i2 = component2 + 5;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 43;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.serviceCode);
        dest.writeString(this.offerInfo);
        dest.writeString(this.parentOfferingId);
        dest.writeString(this.offeringId);
        dest.writeString(this.offeringCode);
        dest.writeString(this.purchaseSeq);
        dest.writeString(this.rentCycleId);
        dest.writeString(this.rentalVal);
        dest.writeString(this.bundleFlag);
        dest.writeString(this.beneficiaryMsisdn);
        dest.writeString(this.discountValue);
        dest.writeString(this.discountExpiry);
        dest.writeString(this.status);
        dest.writeString(this.statusDetail);
        dest.writeString(this.additionalInfo);
        dest.writeString(this.category);
        OneOffOffering oneOffOffering = this.oneOffOffering;
        if (oneOffOffering != null) {
            dest.writeInt(1);
            oneOffOffering.writeToParcel(dest, flags);
        } else {
            dest.writeInt(0);
            int i4 = ShareDataUIState + 101;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        }
    }
}
