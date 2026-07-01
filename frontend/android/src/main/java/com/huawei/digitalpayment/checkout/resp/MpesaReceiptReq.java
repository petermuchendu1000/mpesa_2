package com.huawei.digitalpayment.checkout.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b*\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u009e\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÇ\u0001¢\u0006\u0002\u0010.J\b\u0010/\u001a\u00020\u0006H\u0007J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H×\u0003J\t\u00104\u001a\u00020\u0006H×\u0001J\t\u00105\u001a\u00020\u0003H×\u0001J\u0018\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0006H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u0006;"}, d2 = {"Lcom/huawei/digitalpayment/checkout/resp/MpesaReceiptReq;", "Landroid/os/Parcelable;", "accountRef", "", "creditDebit", "moneyIN", "", "moneyOUT", "msisdn", "name", "participantName", "participantNumber", "trxnDate", "trxnID", "trxnType", "trxnTypeName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountRef", "()Ljava/lang/String;", "getCreditDebit", "getMoneyIN", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMoneyOUT", "getMsisdn", "getName", "getParticipantName", "getParticipantNumber", "getTrxnDate", "getTrxnID", "getTrxnType", "getTrxnTypeName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/digitalpayment/checkout/resp/MpesaReceiptReq;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerCheckOutUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MpesaReceiptReq implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<MpesaReceiptReq> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;

    @SerializedName("accountRef")
    private final String accountRef;

    @SerializedName("creditDebit")
    private final String creditDebit;

    @SerializedName("moneyIN")
    private final Integer moneyIN;

    @SerializedName("moneyOUT")
    private final Integer moneyOUT;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("name")
    private final String name;

    @SerializedName("participantName")
    private final String participantName;

    @SerializedName("participantNumber")
    private final String participantNumber;

    @SerializedName("trxnDate")
    private final String trxnDate;

    @SerializedName("trxnID")
    private final String trxnID;

    @SerializedName("trxnType")
    private final String trxnType;

    @SerializedName("trxnTypeName")
    private final String trxnTypeName;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MpesaReceiptReq> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final MpesaReceiptReq createFromParcel(Parcel parcel) {
            int i;
            int i2 = 2 % 2;
            int i3 = copydefault + 37;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Integer numValueOf = null;
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                i = copydefault + 95;
                ShareDataUIState = i % 128;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
                i = ShareDataUIState + 105;
                copydefault = i % 128;
            }
            int i5 = i % 2;
            return new MpesaReceiptReq(string, string2, numValueOf2, numValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override
        public MpesaReceiptReq createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 105;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                createFromParcel(parcel);
                throw null;
            }
            MpesaReceiptReq mpesaReceiptReqCreateFromParcel = createFromParcel(parcel);
            int i3 = copydefault + 99;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return mpesaReceiptReqCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final MpesaReceiptReq[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 87;
            ShareDataUIState = i3 % 128;
            MpesaReceiptReq[] mpesaReceiptReqArr = new MpesaReceiptReq[i];
            if (i3 % 2 == 0) {
                return mpesaReceiptReqArr;
            }
            throw null;
        }

        @Override
        public MpesaReceiptReq[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 105;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            MpesaReceiptReq[] mpesaReceiptReqArrNewArray = newArray(i);
            int i5 = copydefault + 59;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return mpesaReceiptReqArrNewArray;
            }
            throw null;
        }
    }

    public MpesaReceiptReq(String str, String str2, Integer num, Integer num2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.accountRef = str;
        this.creditDebit = str2;
        this.moneyIN = num;
        this.moneyOUT = num2;
        this.msisdn = str3;
        this.name = str4;
        this.participantName = str5;
        this.participantNumber = str6;
        this.trxnDate = str7;
        this.trxnID = str8;
        this.trxnType = str9;
        this.trxnTypeName = str10;
    }

    public final String getAccountRef() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.accountRef;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getCreditDebit() {
        int i = 2 % 2;
        int i2 = component3 + 75;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.creditDebit;
        int i5 = i3 + 85;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer getMoneyIN() {
        int i = 2 % 2;
        int i2 = component3 + 7;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Integer num = this.moneyIN;
        int i4 = i3 + 59;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final Integer getMoneyOUT() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Integer num = this.moneyOUT;
        int i5 = i3 + 13;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component3 + 61;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.msisdn;
        int i4 = i3 + 83;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 9;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.name;
        int i4 = i2 + 103;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getParticipantName() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 17;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.participantName;
        int i5 = i2 + 7;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getParticipantNumber() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 5;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.participantNumber;
        int i5 = i2 + 49;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 97 / 0;
        }
        return str;
    }

    public final String getTrxnDate() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 5;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.trxnDate;
        int i5 = i2 + 71;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTrxnID() {
        int i = 2 % 2;
        int i2 = component1 + 87;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.trxnID;
        int i5 = i3 + 25;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getTrxnType() {
        int i = 2 % 2;
        int i2 = component1 + 99;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.trxnType;
        }
        throw null;
    }

    public final String getTrxnTypeName() {
        int i = 2 % 2;
        int i2 = component3 + 59;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.trxnTypeName;
        int i5 = i3 + 31;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component2 + 45;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            int i2 = 79 / 0;
        }
    }

    public static MpesaReceiptReq copy$default(MpesaReceiptReq mpesaReceiptReq, String str, String str2, Integer num, Integer num2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        int i2 = 2 % 2;
        String str18 = (i & 1) != 0 ? mpesaReceiptReq.accountRef : str;
        String str19 = (i & 2) != 0 ? mpesaReceiptReq.creditDebit : str2;
        Integer num3 = (i & 4) != 0 ? mpesaReceiptReq.moneyIN : num;
        Integer num4 = (i & 8) != 0 ? mpesaReceiptReq.moneyOUT : num2;
        if ((i & 16) != 0) {
            int i3 = component1 + 13;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            str11 = mpesaReceiptReq.msisdn;
        } else {
            str11 = str3;
        }
        if ((i & 32) != 0) {
            int i5 = component3 + 85;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            str12 = mpesaReceiptReq.name;
        } else {
            str12 = str4;
        }
        if ((i & 64) != 0) {
            int i7 = component1 + 59;
            component3 = i7 % 128;
            if (i7 % 2 == 0) {
                str13 = mpesaReceiptReq.participantName;
                int i8 = 9 / 0;
            } else {
                str13 = mpesaReceiptReq.participantName;
            }
        } else {
            str13 = str5;
        }
        if ((i & 128) != 0) {
            int i9 = component3 + 85;
            component1 = i9 % 128;
            int i10 = i9 % 2;
            str14 = mpesaReceiptReq.participantNumber;
        } else {
            str14 = str6;
        }
        if ((i & 256) != 0) {
            int i11 = component1 + 31;
            component3 = i11 % 128;
            int i12 = i11 % 2;
            str15 = mpesaReceiptReq.trxnDate;
        } else {
            str15 = str7;
        }
        String str20 = (i & 512) != 0 ? mpesaReceiptReq.trxnID : str8;
        if ((i & 1024) != 0) {
            int i13 = component3 + 63;
            component1 = i13 % 128;
            if (i13 % 2 != 0) {
                String str21 = mpesaReceiptReq.trxnType;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str16 = mpesaReceiptReq.trxnType;
        } else {
            str16 = str9;
        }
        if ((i & 2048) != 0) {
            int i14 = component1 + 101;
            component3 = i14 % 128;
            int i15 = i14 % 2;
            str17 = mpesaReceiptReq.trxnTypeName;
        } else {
            str17 = str10;
        }
        return mpesaReceiptReq.copy(str18, str19, num3, num4, str11, str12, str13, str14, str15, str20, str16, str17);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 35;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountRef;
        int i5 = i2 + 111;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = component1 + 93;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.trxnID;
        int i5 = i3 + 37;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = component1 + 125;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.trxnType;
        int i5 = i3 + 119;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component12() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 57;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            str = this.trxnTypeName;
            int i4 = 47 / 0;
        } else {
            str = this.trxnTypeName;
        }
        int i5 = i3 + 49;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 13;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.creditDebit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component3() {
        int i = 2 % 2;
        int i2 = component3 + 113;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.moneyIN;
        int i4 = i3 + 43;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final Integer component4() {
        int i = 2 % 2;
        int i2 = component1 + 35;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.moneyOUT;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 91;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.msisdn;
        int i4 = i2 + 83;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component3 + 37;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 57;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component1 + 91;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.participantName;
        }
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 93;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.participantNumber;
        int i4 = i2 + 61;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component3 + 41;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.trxnDate;
        }
        throw null;
    }

    public final MpesaReceiptReq copy(String accountRef, String creditDebit, Integer moneyIN, Integer moneyOUT, String msisdn, String name, String participantName, String participantNumber, String trxnDate, String trxnID, String trxnType, String trxnTypeName) {
        int i = 2 % 2;
        MpesaReceiptReq mpesaReceiptReq = new MpesaReceiptReq(accountRef, creditDebit, moneyIN, moneyOUT, msisdn, name, participantName, participantNumber, trxnDate, trxnID, trxnType, trxnTypeName);
        int i2 = component1 + 23;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return mpesaReceiptReq;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 59;
        component1 = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof MpesaReceiptReq)) {
            return false;
        }
        MpesaReceiptReq mpesaReceiptReq = (MpesaReceiptReq) other;
        if (!Intrinsics.areEqual(this.accountRef, mpesaReceiptReq.accountRef)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.creditDebit, mpesaReceiptReq.creditDebit)) {
            int i2 = component1 + 73;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.moneyIN, mpesaReceiptReq.moneyIN) || !Intrinsics.areEqual(this.moneyOUT, mpesaReceiptReq.moneyOUT) || !Intrinsics.areEqual(this.msisdn, mpesaReceiptReq.msisdn)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.name, mpesaReceiptReq.name)) {
            int i3 = component3 + 87;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.participantName, mpesaReceiptReq.participantName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.participantNumber, mpesaReceiptReq.participantNumber)) {
            int i5 = component3 + 95;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.trxnDate, mpesaReceiptReq.trxnDate)) {
            int i7 = component1 + 89;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.trxnID, mpesaReceiptReq.trxnID)) {
            int i9 = component1 + 9;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.trxnType, mpesaReceiptReq.trxnType)) {
            if (Intrinsics.areEqual(this.trxnTypeName, mpesaReceiptReq.trxnTypeName)) {
                return true;
            }
            int i11 = component3 + 15;
            component1 = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        int i13 = component3;
        int i14 = i13 + 81;
        component1 = i14 % 128;
        int i15 = i14 % 2;
        int i16 = i13 + 53;
        component1 = i16 % 128;
        int i17 = i16 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int i = 2 % 2;
        int i2 = component1 + 37;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.accountRef;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        String str2 = this.creditDebit;
        if (str2 == null) {
            int i4 = component1 + 105;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        Integer num = this.moneyIN;
        if (num == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = num.hashCode();
            int i6 = component1 + 11;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 / 3;
            }
        }
        Integer num2 = this.moneyOUT;
        if (num2 == null) {
            int i8 = component3 + 121;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = num2.hashCode();
        }
        String str3 = this.msisdn;
        if (str3 == null) {
            int i10 = component3 + 39;
            component1 = i10 % 128;
            iHashCode4 = i10 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode4 = str3.hashCode();
        }
        String str4 = this.name;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.participantName;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.participantNumber;
        int iHashCode10 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.trxnDate;
        if (str7 == null) {
            int i11 = component1 + 3;
            component3 = i11 % 128;
            int i12 = i11 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = str7.hashCode();
        }
        String str8 = this.trxnID;
        if (str8 == null) {
            int i13 = component1 + 101;
            component3 = i13 % 128;
            int i14 = i13 % 2;
            iHashCode6 = 0;
        } else {
            iHashCode6 = str8.hashCode();
        }
        String str9 = this.trxnType;
        int iHashCode11 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.trxnTypeName;
        return (((((((((((((((((((((iHashCode7 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode11) * 31) + (str10 != null ? str10.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MpesaReceiptReq(accountRef=" + this.accountRef + ", creditDebit=" + this.creditDebit + ", moneyIN=" + this.moneyIN + ", moneyOUT=" + this.moneyOUT + ", msisdn=" + this.msisdn + ", name=" + this.name + ", participantName=" + this.participantName + ", participantNumber=" + this.participantNumber + ", trxnDate=" + this.trxnDate + ", trxnID=" + this.trxnID + ", trxnType=" + this.trxnType + ", trxnTypeName=" + this.trxnTypeName + ")";
        int i2 = component3 + 81;
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
        int i2 = component1 + 85;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            dest.writeString(this.accountRef);
            dest.writeString(this.creditDebit);
            throw null;
        }
        dest.writeString(this.accountRef);
        dest.writeString(this.creditDebit);
        Integer num = this.moneyIN;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.moneyOUT;
        if (num2 == null) {
            int i4 = component1 + 111;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                dest.writeInt(1);
            } else {
                dest.writeInt(0);
            }
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeString(this.msisdn);
        dest.writeString(this.name);
        dest.writeString(this.participantName);
        dest.writeString(this.participantNumber);
        dest.writeString(this.trxnDate);
        dest.writeString(this.trxnID);
        dest.writeString(this.trxnType);
        dest.writeString(this.trxnTypeName);
    }
}
