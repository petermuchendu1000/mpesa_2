package com.huawei.digitalpayment.consumer.sfcui.bonga.lipanabonga;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.PESActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001aJl\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÇ\u0001¢\u0006\u0002\u0010%J\b\u0010&\u001a\u00020\u0005H\u0007J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H×\u0003J\t\u0010+\u001a\u00020\u0005H×\u0001J\t\u0010,\u001a\u00020\u0003H×\u0001J\u0018\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0005H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001a¨\u00062"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/lipanabonga/BongaPaybillPayLoad;", "Landroid/os/Parcelable;", "msisdn", "", "amount", "", KeysConstants.SHORT_CODE, "receiverPartyName", PESActivity.EXTRA_BONGA_POINTS, "accountNumber", "shortCodeType", "conversionRate", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "getMsisdn", "()Ljava/lang/String;", "getAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShortCode", "getReceiverPartyName", "getBongaPoints", "getAccountNumber", "getShortCodeType", "getConversionRate", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/huawei/digitalpayment/consumer/sfcui/bonga/lipanabonga/BongaPaybillPayLoad;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BongaPaybillPayLoad implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BongaPaybillPayLoad> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int copydefault = 1;

    @SerializedName("accountNumber")
    private final String accountNumber;

    @SerializedName("amount")
    private final Integer amount;

    @SerializedName(PESActivity.EXTRA_BONGA_POINTS)
    private final Integer bongaPoints;

    @SerializedName("conversionRate")
    private final Double conversionRate;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("receiverPartyName")
    private final String receiverPartyName;

    @SerializedName(KeysConstants.SHORT_CODE)
    private final String shortCode;

    @SerializedName("shortCodeType")
    private final String shortCodeType;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BongaPaybillPayLoad> {
        private static int component2 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BongaPaybillPayLoad createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            Double dValueOf;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                int i2 = component2 + 109;
                component3 = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i3 = component2 + 39;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 2 / 4;
                }
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i5 = component2 + 53;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                dValueOf = null;
            } else {
                dValueOf = Double.valueOf(parcel.readDouble());
            }
            return new BongaPaybillPayLoad(string, numValueOf, string2, string3, numValueOf2, string4, string5, dValueOf);
        }

        @Override
        public BongaPaybillPayLoad createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 95;
            component3 = i2 % 128;
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
        public final BongaPaybillPayLoad[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 59;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            BongaPaybillPayLoad[] bongaPaybillPayLoadArr = new BongaPaybillPayLoad[i];
            int i6 = i3 + 125;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                return bongaPaybillPayLoadArr;
            }
            throw null;
        }

        @Override
        public BongaPaybillPayLoad[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 23;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            BongaPaybillPayLoad[] bongaPaybillPayLoadArrNewArray = newArray(i);
            int i5 = component3 + 41;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return bongaPaybillPayLoadArrNewArray;
        }
    }

    public BongaPaybillPayLoad(String str, Integer num, String str2, String str3, Integer num2, String str4, String str5, Double d2) {
        Intrinsics.checkNotNullParameter(str3, "");
        this.msisdn = str;
        this.amount = num;
        this.shortCode = str2;
        this.receiverPartyName = str3;
        this.bongaPoints = num2;
        this.accountNumber = str4;
        this.shortCodeType = str5;
        this.conversionRate = d2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BongaPaybillPayLoad(String str, Integer num, String str2, String str3, Integer num2, String str4, String str5, Double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num3;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10 = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            int i2 = 2 % 2;
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i & 4) != 0) {
            int i3 = copydefault + 125;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                d.hashCode();
                throw null;
            }
            str6 = null;
        } else {
            str6 = str2;
        }
        if ((i & 8) != 0) {
            str7 = "";
            int i4 = copydefault + 61;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } else {
            str7 = str3;
        }
        Integer num4 = (i & 16) != 0 ? null : num2;
        if ((i & 32) != 0) {
            int i7 = component2 + 73;
            copydefault = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            int i8 = 2 % 2;
            str8 = null;
        } else {
            str8 = str4;
        }
        if ((i & 64) != 0) {
            int i9 = component2 + 29;
            copydefault = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 % 2;
            }
            str9 = null;
        } else {
            str9 = str5;
        }
        this(str10, num3, str6, str7, num4, str8, str9, (i & 128) == 0 ? d2 : null);
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component2 + 15;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.msisdn;
        int i4 = i3 + 5;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final Integer getAmount() {
        int i = 2 % 2;
        int i2 = component2 + 47;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Integer num = this.amount;
        int i5 = i3 + 101;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        throw null;
    }

    public final String getShortCode() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 119;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.shortCode;
        int i5 = i2 + 95;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 64 / 0;
        }
        return str;
    }

    public final String getReceiverPartyName() {
        int i = 2 % 2;
        int i2 = component2 + 27;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.receiverPartyName;
        int i4 = i3 + 15;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Integer getBongaPoints() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 17;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.bongaPoints;
        int i5 = i2 + 93;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String getAccountNumber() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 51;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.accountNumber;
        int i4 = i2 + 71;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getShortCodeType() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 19;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.shortCodeType;
        int i4 = i2 + 89;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final Double getConversionRate() {
        Double d2;
        int i = 2 % 2;
        int i2 = copydefault + 121;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            d2 = this.conversionRate;
            int i4 = 91 / 0;
        } else {
            d2 = this.conversionRate;
        }
        int i5 = i3 + 83;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return d2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = ShareDataUIState + 99;
        component1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public BongaPaybillPayLoad() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static BongaPaybillPayLoad copy$default(BongaPaybillPayLoad bongaPaybillPayLoad, String str, Integer num, String str2, String str3, Integer num2, String str4, String str5, Double d2, int i, Object obj) {
        String str6;
        Integer num3;
        String str7;
        String str8;
        int i2 = 2 % 2;
        int i3 = copydefault + 55;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        String str9 = (i & 1) != 0 ? bongaPaybillPayLoad.msisdn : str;
        Integer num4 = (i & 2) != 0 ? bongaPaybillPayLoad.amount : num;
        if ((i & 4) != 0) {
            str6 = bongaPaybillPayLoad.shortCode;
            int i6 = i4 + 111;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
        } else {
            str6 = str2;
        }
        String str10 = (i & 8) != 0 ? bongaPaybillPayLoad.receiverPartyName : str3;
        if ((i & 16) != 0) {
            int i8 = i4 + 87;
            copydefault = i8 % 128;
            if (i8 % 2 == 0) {
                num3 = bongaPaybillPayLoad.bongaPoints;
                int i9 = 75 / 0;
            } else {
                num3 = bongaPaybillPayLoad.bongaPoints;
            }
        } else {
            num3 = num2;
        }
        if ((i & 32) != 0) {
            str7 = bongaPaybillPayLoad.accountNumber;
            int i10 = copydefault + 67;
            component2 = i10 % 128;
            int i11 = i10 % 2;
        } else {
            str7 = str4;
        }
        if ((i & 64) != 0) {
            str8 = bongaPaybillPayLoad.shortCodeType;
            int i12 = copydefault + 47;
            component2 = i12 % 128;
            int i13 = i12 % 2;
        } else {
            str8 = str5;
        }
        return bongaPaybillPayLoad.copy(str9, num4, str6, str10, num3, str7, str8, (i & 128) != 0 ? bongaPaybillPayLoad.conversionRate : d2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.msisdn;
        int i5 = i3 + 11;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component2() {
        int i = 2 % 2;
        int i2 = component2 + 9;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Integer num = this.amount;
        int i5 = i3 + 117;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 5;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.shortCode;
        int i5 = i2 + 111;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 83;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.receiverPartyName;
        int i4 = i3 + 15;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final Integer component5() {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Integer num = this.bongaPoints;
        int i4 = i3 + 95;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 61;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountNumber;
        int i5 = i2 + 95;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.shortCodeType;
        }
        throw null;
    }

    public final Double component8() {
        int i = 2 % 2;
        int i2 = component2 + 125;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Double d2 = this.conversionRate;
        int i5 = i3 + 107;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return d2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BongaPaybillPayLoad copy(String msisdn, Integer amount, String shortCode, String receiverPartyName, Integer bongaPoints, String accountNumber, String shortCodeType, Double conversionRate) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(receiverPartyName, "");
        BongaPaybillPayLoad bongaPaybillPayLoad = new BongaPaybillPayLoad(msisdn, amount, shortCode, receiverPartyName, bongaPoints, accountNumber, shortCodeType, conversionRate);
        int i2 = copydefault + 67;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return bongaPaybillPayLoad;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 19;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof BongaPaybillPayLoad)) {
            int i2 = component2 + 61;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        BongaPaybillPayLoad bongaPaybillPayLoad = (BongaPaybillPayLoad) other;
        if (!Intrinsics.areEqual(this.msisdn, bongaPaybillPayLoad.msisdn)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.amount, bongaPaybillPayLoad.amount)) {
            int i4 = copydefault + 65;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if ((!Intrinsics.areEqual(this.shortCode, bongaPaybillPayLoad.shortCode)) || !Intrinsics.areEqual(this.receiverPartyName, bongaPaybillPayLoad.receiverPartyName) || !Intrinsics.areEqual(this.bongaPoints, bongaPaybillPayLoad.bongaPoints)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.accountNumber, bongaPaybillPayLoad.accountNumber))) {
            return Intrinsics.areEqual(this.shortCodeType, bongaPaybillPayLoad.shortCodeType) && Intrinsics.areEqual((Object) this.conversionRate, (Object) bongaPaybillPayLoad.conversionRate);
        }
        int i6 = copydefault + 69;
        component2 = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int i;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int i2 = 2 % 2;
        int i3 = component2 + 123;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.msisdn;
            if (str == null) {
                i = 1;
                iHashCode = i;
                iHashCode2 = 0;
            } else {
                iHashCode = 1;
                iHashCode2 = str.hashCode();
            }
        } else {
            str = this.msisdn;
            if (str == null) {
                i = 0;
                iHashCode = i;
                iHashCode2 = 0;
            } else {
                iHashCode = 0;
                iHashCode2 = str.hashCode();
            }
        }
        Integer num = this.amount;
        if (num == null) {
            iHashCode3 = 0;
        } else {
            iHashCode3 = num.hashCode();
            int i4 = component2 + 39;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
        String str2 = this.shortCode;
        if (str2 == null) {
            int i6 = copydefault + 1;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str2.hashCode();
        }
        int iHashCode6 = this.receiverPartyName.hashCode();
        Integer num2 = this.bongaPoints;
        int iHashCode7 = num2 == null ? 0 : num2.hashCode();
        String str3 = this.accountNumber;
        if (str3 == null) {
            int i8 = copydefault + 105;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = str3.hashCode();
        }
        String str4 = this.shortCodeType;
        int iHashCode8 = str4 != null ? str4.hashCode() : 0;
        Double d2 = this.conversionRate;
        if (d2 != null) {
            iHashCode = d2.hashCode();
        }
        return (((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode5) * 31) + iHashCode8) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BongaPaybillPayLoad(msisdn=" + this.msisdn + ", amount=" + this.amount + ", shortCode=" + this.shortCode + ", receiverPartyName=" + this.receiverPartyName + ", bongaPoints=" + this.bongaPoints + ", accountNumber=" + this.accountNumber + ", shortCodeType=" + this.shortCodeType + ", conversionRate=" + this.conversionRate + ")";
        int i2 = component2 + 111;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.msisdn);
        Integer num = this.amount;
        if (num == null) {
            int i2 = copydefault + 17;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                dest.writeInt(1);
            } else {
                dest.writeInt(0);
            }
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.shortCode);
        dest.writeString(this.receiverPartyName);
        Integer num2 = this.bongaPoints;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeString(this.accountNumber);
        dest.writeString(this.shortCodeType);
        Double d2 = this.conversionRate;
        if (d2 != null) {
            dest.writeInt(1);
            dest.writeDouble(d2.doubleValue());
        } else {
            int i3 = copydefault + 9;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            dest.writeInt(0);
        }
    }
}
