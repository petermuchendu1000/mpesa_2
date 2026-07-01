package com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b(\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0099\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010+\u001a\u00020,H\u0007J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H×\u0003J\t\u00101\u001a\u00020,H×\u0001J\t\u00102\u001a\u00020\u0003H×\u0001J\u0018\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020,H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u00068"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/DelOfferingRent;", "Landroid/os/Parcelable;", "serviceCode", "", "offerInfo", "parentOfferingId", "offeringId", "offeringCode", "purchaseSeq", "rentCycleId", "rentalVal", "beneficiaryMsisdn", "discountValue", "totalRentAmt", "additionalInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getServiceCode", "()Ljava/lang/String;", "getOfferInfo", "getParentOfferingId", "getOfferingId", "getOfferingCode", "getPurchaseSeq", "getRentCycleId", "getRentalVal", "getBeneficiaryMsisdn", "getDiscountValue", "getTotalRentAmt", "getAdditionalInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DelOfferingRent implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DelOfferingRent> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("additionalInfo")
    private final String additionalInfo;

    @SerializedName("beneficiaryMsisdn")
    private final String beneficiaryMsisdn;

    @SerializedName("discountValue")
    private final String discountValue;

    @SerializedName("offerInfo")
    private final String offerInfo;

    @SerializedName("offeringCode")
    private final String offeringCode;

    @SerializedName("offeringId")
    private final String offeringId;

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

    @SerializedName("totalRentAmt")
    private final String totalRentAmt;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DelOfferingRent> {
        private static int component1 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DelOfferingRent createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            DelOfferingRent delOfferingRent = new DelOfferingRent(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component1 + 93;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return delOfferingRent;
            }
            throw null;
        }

        @Override
        public DelOfferingRent createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 75;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            DelOfferingRent delOfferingRentCreateFromParcel = createFromParcel(parcel);
            int i4 = component1 + 31;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return delOfferingRentCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DelOfferingRent[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 37;
            component1 = i4 % 128;
            DelOfferingRent[] delOfferingRentArr = new DelOfferingRent[i];
            if (i4 % 2 == 0) {
                throw null;
            }
            int i5 = i3 + 49;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return delOfferingRentArr;
        }

        @Override
        public DelOfferingRent[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 9;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            DelOfferingRent[] delOfferingRentArrNewArray = newArray(i);
            int i5 = component3 + 91;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return delOfferingRentArrNewArray;
        }
    }

    public DelOfferingRent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.serviceCode = str;
        this.offerInfo = str2;
        this.parentOfferingId = str3;
        this.offeringId = str4;
        this.offeringCode = str5;
        this.purchaseSeq = str6;
        this.rentCycleId = str7;
        this.rentalVal = str8;
        this.beneficiaryMsisdn = str9;
        this.discountValue = str10;
        this.totalRentAmt = str11;
        this.additionalInfo = str12;
    }

    public final String getServiceCode() {
        int i = 2 % 2;
        int i2 = component3 + 23;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.serviceCode;
        int i5 = i3 + 29;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getOfferInfo() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 53;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.offerInfo;
        int i5 = i2 + 79;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getParentOfferingId() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 123;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.parentOfferingId;
        int i4 = i2 + 125;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getOfferingId() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.offeringId;
        int i5 = i3 + 111;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getOfferingCode() {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.offeringCode;
        int i5 = i3 + 23;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPurchaseSeq() {
        int i = 2 % 2;
        int i2 = component3 + 63;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.purchaseSeq;
        if (i3 == 0) {
            int i4 = 61 / 0;
        }
        return str;
    }

    public final String getRentCycleId() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 71;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.rentCycleId;
            int i4 = 72 / 0;
        } else {
            str = this.rentCycleId;
        }
        int i5 = i2 + 59;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getRentalVal() {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.rentalVal;
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        return str;
    }

    public final String getBeneficiaryMsisdn() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.beneficiaryMsisdn;
        int i4 = i3 + 51;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
        return str;
    }

    public final String getDiscountValue() {
        int i = 2 % 2;
        int i2 = component3 + 25;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.discountValue;
        }
        throw null;
    }

    public final String getTotalRentAmt() {
        int i = 2 % 2;
        int i2 = component3 + 45;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.totalRentAmt;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAdditionalInfo() {
        int i = 2 % 2;
        int i2 = component3 + 27;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.additionalInfo;
        }
        throw null;
    }

    static {
        int i = component1 + 7;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            int i2 = 16 / 0;
        }
    }

    public static DelOfferingRent copy$default(DelOfferingRent delOfferingRent, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, Object obj) {
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        int i2 = 2 % 2;
        int i3 = component3 + 111;
        int i4 = i3 % 128;
        copydefault = i4;
        String str19 = (i3 % 2 == 0 || (i & 1) == 0) ? str : delOfferingRent.serviceCode;
        Object obj2 = null;
        if ((i & 2) != 0) {
            int i5 = i4 + 57;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                String str20 = delOfferingRent.offerInfo;
                throw null;
            }
            str13 = delOfferingRent.offerInfo;
        } else {
            str13 = str2;
        }
        if ((i & 4) != 0) {
            str14 = delOfferingRent.parentOfferingId;
            int i6 = i4 + 107;
            component3 = i6 % 128;
            int i7 = i6 % 2;
        } else {
            str14 = str3;
        }
        String str21 = (i & 8) != 0 ? delOfferingRent.offeringId : str4;
        if ((i & 16) != 0) {
            int i8 = component3 + 93;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            str15 = delOfferingRent.offeringCode;
        } else {
            str15 = str5;
        }
        if ((i & 32) != 0) {
            str16 = delOfferingRent.purchaseSeq;
            int i10 = copydefault + 37;
            component3 = i10 % 128;
            int i11 = i10 % 2;
        } else {
            str16 = str6;
        }
        if ((i & 64) != 0) {
            int i12 = component3 + 55;
            copydefault = i12 % 128;
            if (i12 % 2 == 0) {
                String str22 = delOfferingRent.rentCycleId;
                obj2.hashCode();
                throw null;
            }
            str17 = delOfferingRent.rentCycleId;
        } else {
            str17 = str7;
        }
        String str23 = (i & 128) != 0 ? delOfferingRent.rentalVal : str8;
        String str24 = (i & 256) != 0 ? delOfferingRent.beneficiaryMsisdn : str9;
        String str25 = (i & 512) != 0 ? delOfferingRent.discountValue : str10;
        if ((i & 1024) != 0) {
            str18 = delOfferingRent.totalRentAmt;
            int i13 = copydefault + 55;
            component3 = i13 % 128;
            int i14 = i13 % 2;
        } else {
            str18 = str11;
        }
        return delOfferingRent.copy(str19, str13, str14, str21, str15, str16, str17, str23, str24, str25, str18, (i & 2048) != 0 ? delOfferingRent.additionalInfo : str12);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.serviceCode;
        int i5 = i3 + 43;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component10() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 51;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.discountValue;
            int i4 = 49 / 0;
        } else {
            str = this.discountValue;
        }
        int i5 = i2 + 55;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 13 / 0;
        }
        return str;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 121;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.totalRentAmt;
        int i5 = i2 + 109;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 49 / 0;
        }
        return str;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.additionalInfo;
        int i5 = i3 + 119;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 53;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.offerInfo;
        int i5 = i3 + 37;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 65;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.parentOfferingId;
        int i5 = i2 + 121;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.offeringId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 113;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.offeringCode;
        int i5 = i2 + 19;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component6() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 71;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            str = this.purchaseSeq;
            int i4 = 77 / 0;
        } else {
            str = this.purchaseSeq;
        }
        int i5 = i3 + 101;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 50 / 0;
        }
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.rentCycleId;
        int i5 = i3 + 63;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.rentalVal;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.beneficiaryMsisdn;
        int i5 = i3 + 45;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final DelOfferingRent copy(String serviceCode, String offerInfo, String parentOfferingId, String offeringId, String offeringCode, String purchaseSeq, String rentCycleId, String rentalVal, String beneficiaryMsisdn, String discountValue, String totalRentAmt, String additionalInfo) {
        int i = 2 % 2;
        DelOfferingRent delOfferingRent = new DelOfferingRent(serviceCode, offerInfo, parentOfferingId, offeringId, offeringCode, purchaseSeq, rentCycleId, rentalVal, beneficiaryMsisdn, discountValue, totalRentAmt, additionalInfo);
        int i2 = component3 + 11;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 3 / 0;
        }
        return delOfferingRent;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 35;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 123;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.DelOfferingRent) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r1 + 25;
        com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.DelOfferingRent.component3 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.DelOfferingRent) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.serviceCode, r6.serviceCode) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.offerInfo, r6.offerInfo) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.parentOfferingId, r6.parentOfferingId) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.offeringId, r6.offeringId) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.offeringCode, r6.offeringCode) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.DelOfferingRent.copydefault + 107;
        com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.DelOfferingRent.component3 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.purchaseSeq, r6.purchaseSeq) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.rentCycleId, r6.rentCycleId) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.rentalVal, r6.rentalVal) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0090, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.beneficiaryMsisdn, r6.beneficiaryMsisdn) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0092, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009c, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.discountValue, r6.discountValue)) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a7, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.totalRentAmt, r6.totalRentAmt) == true) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.DelOfferingRent.component3 + 63;
        com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.DelOfferingRent.copydefault = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b2, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bc, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.additionalInfo, r6.additionalInfo)) == true) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00be, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bf, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.DelOfferingRent.component3 + 35;
        com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.DelOfferingRent.copydefault = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c8, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.DelOfferingRent.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = component3 + 29;
        copydefault = i2 % 128;
        int iHashCode3 = 0;
        int iHashCode4 = (i2 % 2 != 0 ? (str = this.serviceCode) != null : (str = this.serviceCode) != null) ? str.hashCode() : 0;
        String str2 = this.offerInfo;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.parentOfferingId;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.offeringId;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.offeringCode;
        if (str5 == null) {
            int i3 = copydefault + 95;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str5.hashCode();
        }
        String str6 = this.purchaseSeq;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.rentCycleId;
        int iHashCode9 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.rentalVal;
        int iHashCode10 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.beneficiaryMsisdn;
        if (str9 == null) {
            int i5 = copydefault + 95;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str9.hashCode();
        }
        String str10 = this.discountValue;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.totalRentAmt;
        int iHashCode12 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.additionalInfo;
        if (str12 != null) {
            iHashCode3 = str12.hashCode();
            int i7 = component3 + 91;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
        }
        return (((((((((((((((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode2) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DelOfferingRent(serviceCode=" + this.serviceCode + ", offerInfo=" + this.offerInfo + ", parentOfferingId=" + this.parentOfferingId + ", offeringId=" + this.offeringId + ", offeringCode=" + this.offeringCode + ", purchaseSeq=" + this.purchaseSeq + ", rentCycleId=" + this.rentCycleId + ", rentalVal=" + this.rentalVal + ", beneficiaryMsisdn=" + this.beneficiaryMsisdn + ", discountValue=" + this.discountValue + ", totalRentAmt=" + this.totalRentAmt + ", additionalInfo=" + this.additionalInfo + ")";
        int i2 = component3 + 83;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        component3 = i2 % 128;
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
        dest.writeString(this.beneficiaryMsisdn);
        dest.writeString(this.discountValue);
        dest.writeString(this.totalRentAmt);
        dest.writeString(this.additionalInfo);
        int i4 = copydefault + 31;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
    }
}
