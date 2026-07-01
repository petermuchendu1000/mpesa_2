package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u008b\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÇ\u0001J\b\u0010*\u001a\u00020+H\u0007J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H×\u0003J\t\u00100\u001a\u00020+H×\u0001J\t\u00101\u001a\u00020\u0003H×\u0001J\u0018\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020+H\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u00067"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/RoamingCashOutValidationDetails;", "Landroid/os/Parcelable;", "agentName", "", "agentId", "agentMsisdn", "originAmount", "Ljava/math/BigDecimal;", "originCurrency", "targetAmount", "targetCurrency", "exchangeRate", "fee", "feeCurrency", "validationId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)V", "getAgentName", "()Ljava/lang/String;", "getAgentId", "getAgentMsisdn", "getOriginAmount", "()Ljava/math/BigDecimal;", "getOriginCurrency", "getTargetAmount", "getTargetCurrency", "getExchangeRate", "getFee", "getFeeCurrency", "getValidationId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoamingCashOutValidationDetails implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RoamingCashOutValidationDetails> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;
    private final String agentId;
    private final String agentMsisdn;
    private final String agentName;
    private final BigDecimal exchangeRate;
    private final BigDecimal fee;
    private final String feeCurrency;
    private final BigDecimal originAmount;
    private final String originCurrency;
    private final BigDecimal targetAmount;
    private final String targetCurrency;
    private final String validationId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RoamingCashOutValidationDetails> {
        private static int component1 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RoamingCashOutValidationDetails createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            RoamingCashOutValidationDetails roamingCashOutValidationDetails = new RoamingCashOutValidationDetails(parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString());
            int i2 = component1 + 79;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return roamingCashOutValidationDetails;
        }

        @Override
        public RoamingCashOutValidationDetails createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 107;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            RoamingCashOutValidationDetails roamingCashOutValidationDetailsCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 79;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return roamingCashOutValidationDetailsCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RoamingCashOutValidationDetails[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 23;
            int i4 = i3 % 128;
            copydefault = i4;
            RoamingCashOutValidationDetails[] roamingCashOutValidationDetailsArr = new RoamingCashOutValidationDetails[i];
            if (i3 % 2 != 0) {
                int i5 = 41 / 0;
            }
            int i6 = i4 + 41;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return roamingCashOutValidationDetailsArr;
        }

        @Override
        public RoamingCashOutValidationDetails[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 93;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public RoamingCashOutValidationDetails(String str, String str2, String str3, BigDecimal bigDecimal, String str4, BigDecimal bigDecimal2, String str5, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str7, "");
        this.agentName = str;
        this.agentId = str2;
        this.agentMsisdn = str3;
        this.originAmount = bigDecimal;
        this.originCurrency = str4;
        this.targetAmount = bigDecimal2;
        this.targetCurrency = str5;
        this.exchangeRate = bigDecimal3;
        this.fee = bigDecimal4;
        this.feeCurrency = str6;
        this.validationId = str7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RoamingCashOutValidationDetails(String str, String str2, String str3, BigDecimal bigDecimal, String str4, BigDecimal bigDecimal2, String str5, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str8;
        String str9;
        String str10;
        BigDecimal bigDecimal5;
        BigDecimal bigDecimal6;
        if ((i & 1) != 0) {
            int i2 = component3 + 61;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            str8 = null;
        } else {
            str8 = str;
        }
        String str11 = (i & 2) != 0 ? null : str2;
        String str12 = (i & 4) != 0 ? null : str3;
        BigDecimal bigDecimal7 = (i & 8) != 0 ? null : bigDecimal;
        if ((i & 16) != 0) {
            int i3 = component3 + 69;
            int i4 = i3 % 128;
            component2 = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 47;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 2;
            }
            str9 = null;
        } else {
            str9 = str4;
        }
        BigDecimal bigDecimal8 = (i & 32) != 0 ? null : bigDecimal2;
        if ((i & 64) != 0) {
            int i8 = component3 + 97;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            str10 = null;
        } else {
            str10 = str5;
        }
        if ((i & 128) != 0) {
            int i11 = 2 % 2;
            bigDecimal5 = null;
        } else {
            bigDecimal5 = bigDecimal3;
        }
        if ((i & 256) != 0) {
            int i12 = component3 + 29;
            component2 = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
            bigDecimal6 = null;
        } else {
            bigDecimal6 = bigDecimal4;
        }
        this(str8, str11, str12, bigDecimal7, str9, bigDecimal8, str10, bigDecimal5, bigDecimal6, (i & 512) != 0 ? null : str6, str7);
    }

    public final String getAgentName() {
        int i = 2 % 2;
        int i2 = component2 + 47;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.agentName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAgentId() {
        int i = 2 % 2;
        int i2 = component2 + 107;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.agentId;
        int i5 = i3 + 11;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAgentMsisdn() {
        int i = 2 % 2;
        int i2 = component3 + 107;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.agentMsisdn;
        int i5 = i3 + 53;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BigDecimal getOriginAmount() {
        int i = 2 % 2;
        int i2 = component3 + 31;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        BigDecimal bigDecimal = this.originAmount;
        int i5 = i3 + 95;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return bigDecimal;
    }

    public final String getOriginCurrency() {
        int i = 2 % 2;
        int i2 = component3 + 19;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.originCurrency;
        int i5 = i3 + 43;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BigDecimal getTargetAmount() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.targetAmount;
        }
        throw null;
    }

    public final String getTargetCurrency() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 61;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            str = this.targetCurrency;
            int i4 = 39 / 0;
        } else {
            str = this.targetCurrency;
        }
        int i5 = i3 + 25;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BigDecimal getExchangeRate() {
        int i = 2 % 2;
        int i2 = component2 + 29;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        BigDecimal bigDecimal = this.exchangeRate;
        int i5 = i3 + 55;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return bigDecimal;
    }

    public final BigDecimal getFee() {
        int i = 2 % 2;
        int i2 = component2 + 39;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        BigDecimal bigDecimal = this.fee;
        int i4 = i3 + 79;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return bigDecimal;
    }

    public final String getFeeCurrency() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 123;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            str = this.feeCurrency;
            int i4 = 42 / 0;
        } else {
            str = this.feeCurrency;
        }
        int i5 = i3 + 41;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getValidationId() {
        int i = 2 % 2;
        int i2 = component3 + 23;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.validationId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = copydefault + 69;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public static RoamingCashOutValidationDetails copy$default(RoamingCashOutValidationDetails roamingCashOutValidationDetails, String str, String str2, String str3, BigDecimal bigDecimal, String str4, BigDecimal bigDecimal2, String str5, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str6, String str7, int i, Object obj) {
        String str8;
        BigDecimal bigDecimal5;
        String str9;
        BigDecimal bigDecimal6;
        String str10;
        int i2 = 2 % 2;
        String str11 = (i & 1) != 0 ? roamingCashOutValidationDetails.agentName : str;
        if ((i & 2) != 0) {
            int i3 = component3 + 3;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            str8 = roamingCashOutValidationDetails.agentId;
        } else {
            str8 = str2;
        }
        String str12 = (i & 4) != 0 ? roamingCashOutValidationDetails.agentMsisdn : str3;
        BigDecimal bigDecimal7 = (i & 8) != 0 ? roamingCashOutValidationDetails.originAmount : bigDecimal;
        String str13 = (i & 16) != 0 ? roamingCashOutValidationDetails.originCurrency : str4;
        if ((i & 32) != 0) {
            int i5 = component3 + 81;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                BigDecimal bigDecimal8 = roamingCashOutValidationDetails.targetAmount;
                throw null;
            }
            bigDecimal5 = roamingCashOutValidationDetails.targetAmount;
        } else {
            bigDecimal5 = bigDecimal2;
        }
        if ((i & 64) != 0) {
            int i6 = component2 + 3;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            str9 = roamingCashOutValidationDetails.targetCurrency;
        } else {
            str9 = str5;
        }
        BigDecimal bigDecimal9 = (i & 128) != 0 ? roamingCashOutValidationDetails.exchangeRate : bigDecimal3;
        if ((i & 256) != 0) {
            int i8 = component2;
            int i9 = i8 + 73;
            component3 = i9 % 128;
            if (i9 % 2 != 0) {
                bigDecimal6 = roamingCashOutValidationDetails.fee;
                int i10 = 13 / 0;
            } else {
                bigDecimal6 = roamingCashOutValidationDetails.fee;
            }
            int i11 = i8 + 75;
            component3 = i11 % 128;
            int i12 = i11 % 2;
        } else {
            bigDecimal6 = bigDecimal4;
        }
        if ((i & 512) != 0) {
            int i13 = component3 + 111;
            component2 = i13 % 128;
            if (i13 % 2 == 0) {
                str10 = roamingCashOutValidationDetails.feeCurrency;
                int i14 = 52 / 0;
            } else {
                str10 = roamingCashOutValidationDetails.feeCurrency;
            }
        } else {
            str10 = str6;
        }
        RoamingCashOutValidationDetails roamingCashOutValidationDetailsCopy = roamingCashOutValidationDetails.copy(str11, str8, str12, bigDecimal7, str13, bigDecimal5, str9, bigDecimal9, bigDecimal6, str10, (i & 1024) != 0 ? roamingCashOutValidationDetails.validationId : str7);
        int i15 = component2 + 95;
        component3 = i15 % 128;
        int i16 = i15 % 2;
        return roamingCashOutValidationDetailsCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 87;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.agentName;
        }
        throw null;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = component3 + 95;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.feeCurrency;
        int i5 = i3 + 15;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = component2 + 79;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.validationId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.agentId;
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 119;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.agentMsisdn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BigDecimal component4() {
        int i = 2 % 2;
        int i2 = component3 + 31;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        BigDecimal bigDecimal = this.originAmount;
        int i5 = i3 + 95;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return bigDecimal;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2 + 71;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.originCurrency;
        int i5 = i3 + 123;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final BigDecimal component6() {
        BigDecimal bigDecimal;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 109;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            bigDecimal = this.targetAmount;
            int i4 = 5 / 0;
        } else {
            bigDecimal = this.targetAmount;
        }
        int i5 = i2 + 3;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return bigDecimal;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 79;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.targetCurrency;
        int i5 = i2 + 5;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BigDecimal component8() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 49;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        BigDecimal bigDecimal = this.exchangeRate;
        int i5 = i2 + 125;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return bigDecimal;
    }

    public final BigDecimal component9() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 115;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        BigDecimal bigDecimal = this.fee;
        int i5 = i2 + 121;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return bigDecimal;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final RoamingCashOutValidationDetails copy(String agentName, String agentId, String agentMsisdn, BigDecimal originAmount, String originCurrency, BigDecimal targetAmount, String targetCurrency, BigDecimal exchangeRate, BigDecimal fee, String feeCurrency, String validationId) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(validationId, "");
        RoamingCashOutValidationDetails roamingCashOutValidationDetails = new RoamingCashOutValidationDetails(agentName, agentId, agentMsisdn, originAmount, originCurrency, targetAmount, targetCurrency, exchangeRate, fee, feeCurrency, validationId);
        int i2 = component3 + 1;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 5 / 0;
        }
        return roamingCashOutValidationDetails;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 11;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 55;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoamingCashOutValidationDetails)) {
            return false;
        }
        RoamingCashOutValidationDetails roamingCashOutValidationDetails = (RoamingCashOutValidationDetails) other;
        if (!Intrinsics.areEqual(this.agentName, roamingCashOutValidationDetails.agentName)) {
            int i2 = component3 + 15;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.agentId, roamingCashOutValidationDetails.agentId)) {
            int i3 = component2;
            int i4 = i3 + 69;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 11;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.agentMsisdn, roamingCashOutValidationDetails.agentMsisdn)) {
            int i8 = component3 + 73;
            component2 = i8 % 128;
            return i8 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.originAmount, roamingCashOutValidationDetails.originAmount) || !Intrinsics.areEqual(this.originCurrency, roamingCashOutValidationDetails.originCurrency)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.targetAmount, roamingCashOutValidationDetails.targetAmount)) {
            int i9 = component3 + 7;
            component2 = i9 % 128;
            return i9 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.targetCurrency, roamingCashOutValidationDetails.targetCurrency)) {
            return false;
        }
        if (Intrinsics.areEqual(this.exchangeRate, roamingCashOutValidationDetails.exchangeRate)) {
            return Intrinsics.areEqual(this.fee, roamingCashOutValidationDetails.fee) && Intrinsics.areEqual(this.feeCurrency, roamingCashOutValidationDetails.feeCurrency) && Intrinsics.areEqual(this.validationId, roamingCashOutValidationDetails.validationId);
        }
        int i10 = component2 + 39;
        component3 = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        String str = this.agentName;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.agentId;
        if (str2 == null) {
            int i2 = component3 + 61;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.agentMsisdn;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        BigDecimal bigDecimal = this.originAmount;
        if (bigDecimal == null) {
            int i4 = component2 + 43;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = bigDecimal.hashCode();
        }
        String str4 = this.originCurrency;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        BigDecimal bigDecimal2 = this.targetAmount;
        if (bigDecimal2 == null) {
            int i6 = component2 + 99;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = bigDecimal2.hashCode();
        }
        String str5 = this.targetCurrency;
        if (str5 == null) {
            int i8 = component3 + 55;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str5.hashCode();
        }
        BigDecimal bigDecimal3 = this.exchangeRate;
        int iHashCode8 = bigDecimal3 == null ? 0 : bigDecimal3.hashCode();
        BigDecimal bigDecimal4 = this.fee;
        int iHashCode9 = bigDecimal4 == null ? 0 : bigDecimal4.hashCode();
        String str6 = this.feeCurrency;
        int iHashCode10 = (((((((((((((((((((iHashCode5 * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode2) * 31) + iHashCode7) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str6 != null ? str6.hashCode() : 0)) * 31) + this.validationId.hashCode();
        int i10 = component3 + 97;
        component2 = i10 % 128;
        int i11 = i10 % 2;
        return iHashCode10;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RoamingCashOutValidationDetails(agentName=" + this.agentName + ", agentId=" + this.agentId + ", agentMsisdn=" + this.agentMsisdn + ", originAmount=" + this.originAmount + ", originCurrency=" + this.originCurrency + ", targetAmount=" + this.targetAmount + ", targetCurrency=" + this.targetCurrency + ", exchangeRate=" + this.exchangeRate + ", fee=" + this.fee + ", feeCurrency=" + this.feeCurrency + ", validationId=" + this.validationId + ')';
        int i2 = component3 + 123;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 25;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.agentName);
        dest.writeString(this.agentId);
        dest.writeString(this.agentMsisdn);
        dest.writeSerializable(this.originAmount);
        dest.writeString(this.originCurrency);
        dest.writeSerializable(this.targetAmount);
        dest.writeString(this.targetCurrency);
        dest.writeSerializable(this.exchangeRate);
        dest.writeSerializable(this.fee);
        dest.writeString(this.feeCurrency);
        dest.writeString(this.validationId);
        int i4 = component2 + 61;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 96 / 0;
        }
    }
}
