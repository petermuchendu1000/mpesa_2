package com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J^\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÇ\u0001¢\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020!H\u0007J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H×\u0003J\t\u0010&\u001a\u00020!H×\u0001J\t\u0010'\u001a\u00020\u0003H×\u0001J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020!H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0016\u0010\u0011¨\u0006-"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibrePreValidation;", "Landroid/os/Parcelable;", "channelSessionId", "", "currency", "balance", "", "mmBalance", "useODAmount", "accessFee", "interestRate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getChannelSessionId", "()Ljava/lang/String;", "getCurrency", "getBalance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMmBalance", "getUseODAmount", "getAccessFee", "getInterestRate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibrePreValidation;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FibrePreValidation implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FibrePreValidation> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("accessFee")
    private final Double accessFee;

    @SerializedName("balance")
    private final Double balance;

    @SerializedName("channelSessionId")
    private final String channelSessionId;

    @SerializedName("currency")
    private final String currency;

    @SerializedName("interestRate")
    private final Double interestRate;

    @SerializedName("mmBalance")
    private final Double mmBalance;

    @SerializedName("useODAmount")
    private final Double useODAmount;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FibrePreValidation> {
        private static int ShareDataUIState = 1;
        private static int component1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibrePreValidation createFromParcel(Parcel parcel) {
            Double dValueOf;
            Double dValueOf2;
            Double dValueOf3;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i2 = component1 + 119;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                dValueOf = null;
            } else {
                dValueOf = Double.valueOf(parcel.readDouble());
            }
            Double dValueOf4 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() == 0) {
                int i4 = ShareDataUIState + 105;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                dValueOf2 = null;
            } else {
                dValueOf2 = Double.valueOf(parcel.readDouble());
            }
            if (parcel.readInt() == 0) {
                int i6 = ShareDataUIState + 89;
                component1 = i6 % 128;
                int i7 = i6 % 2;
                dValueOf3 = null;
            } else {
                dValueOf3 = Double.valueOf(parcel.readDouble());
            }
            return new FibrePreValidation(string, string2, dValueOf, dValueOf4, dValueOf2, dValueOf3, parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        @Override
        public FibrePreValidation createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 35;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            FibrePreValidation fibrePreValidationCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 13;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return fibrePreValidationCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibrePreValidation[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 77;
            ShareDataUIState = i3 % 128;
            FibrePreValidation[] fibrePreValidationArr = new FibrePreValidation[i];
            if (i3 % 2 == 0) {
                int i4 = 76 / 0;
            }
            return fibrePreValidationArr;
        }

        @Override
        public FibrePreValidation[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 1;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            FibrePreValidation[] fibrePreValidationArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 88 / 0;
            }
            return fibrePreValidationArrNewArray;
        }
    }

    public FibrePreValidation(String str, String str2, Double d2, Double d3, Double d4, Double d5, Double d6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.channelSessionId = str;
        this.currency = str2;
        this.balance = d2;
        this.mmBalance = d3;
        this.useODAmount = d4;
        this.accessFee = d5;
        this.interestRate = d6;
    }

    public final String getChannelSessionId() {
        int i = 2 % 2;
        int i2 = component3 + 81;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.channelSessionId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getCurrency() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 55;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.currency;
        int i5 = i2 + 105;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 92 / 0;
        }
        return str;
    }

    public final Double getBalance() {
        int i = 2 % 2;
        int i2 = component3 + 91;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Double d2 = this.balance;
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
        return d2;
    }

    public final Double getMmBalance() {
        int i = 2 % 2;
        int i2 = component1 + 13;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Double d2 = this.mmBalance;
        int i5 = i3 + 65;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 1 / 0;
        }
        return d2;
    }

    public final Double getUseODAmount() {
        int i = 2 % 2;
        int i2 = component1 + 63;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Double d2 = this.useODAmount;
        int i5 = i3 + 45;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    public final Double getAccessFee() {
        int i = 2 % 2;
        int i2 = component3 + 39;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Double d2 = this.accessFee;
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
        return d2;
    }

    public final Double getInterestRate() {
        int i = 2 % 2;
        int i2 = component3 + 125;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.interestRate;
        }
        throw null;
    }

    static {
        int i = component2 + 111;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static FibrePreValidation copy$default(FibrePreValidation fibrePreValidation, String str, String str2, Double d2, Double d3, Double d4, Double d5, Double d6, int i, Object obj) {
        String str3;
        Double d7;
        int i2 = 2 % 2;
        int i3 = component3 + 113;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 107;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            str3 = fibrePreValidation.channelSessionId;
        } else {
            str3 = str;
        }
        String str4 = (i & 2) != 0 ? fibrePreValidation.currency : str2;
        Double d8 = (i & 4) != 0 ? fibrePreValidation.balance : d2;
        Double d9 = (i & 8) != 0 ? fibrePreValidation.mmBalance : d3;
        Double d10 = (i & 16) != 0 ? fibrePreValidation.useODAmount : d4;
        if ((i & 32) != 0) {
            int i8 = component3 + 99;
            component1 = i8 % 128;
            if (i8 % 2 == 0) {
                Double d11 = fibrePreValidation.accessFee;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            d7 = fibrePreValidation.accessFee;
        } else {
            d7 = d5;
        }
        return fibrePreValidation.copy(str3, str4, d8, d9, d10, d7, (i & 64) != 0 ? fibrePreValidation.interestRate : d6);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 65;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.channelSessionId;
        int i4 = i3 + 27;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 89;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.currency;
        int i5 = i2 + 19;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Double component3() {
        Double d2;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 19;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            d2 = this.balance;
            int i4 = 96 / 0;
        } else {
            d2 = this.balance;
        }
        int i5 = i2 + 117;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    public final Double component4() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.mmBalance;
        }
        throw null;
    }

    public final Double component5() {
        int i = 2 % 2;
        int i2 = component3 + 97;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Double d2 = this.useODAmount;
        int i5 = i3 + 13;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return d2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Double component6() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 97;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Double d2 = this.accessFee;
        int i5 = i2 + 121;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    public final Double component7() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 25;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Double d2 = this.interestRate;
        int i5 = i2 + 23;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 60 / 0;
        }
        return d2;
    }

    public final FibrePreValidation copy(String channelSessionId, String currency, Double balance, Double mmBalance, Double useODAmount, Double accessFee, Double interestRate) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(channelSessionId, "");
        Intrinsics.checkNotNullParameter(currency, "");
        FibrePreValidation fibrePreValidation = new FibrePreValidation(channelSessionId, currency, balance, mmBalance, useODAmount, accessFee, interestRate);
        int i2 = component1 + 59;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return fibrePreValidation;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 91;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 41;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 5;
            component1 = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(other instanceof FibrePreValidation)) {
            int i3 = component3 + 41;
            component1 = i3 % 128;
            return i3 % 2 == 0;
        }
        FibrePreValidation fibrePreValidation = (FibrePreValidation) other;
        if (!Intrinsics.areEqual(this.channelSessionId, fibrePreValidation.channelSessionId)) {
            int i4 = component3 + 47;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.currency, fibrePreValidation.currency)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.balance, (Object) fibrePreValidation.balance)) {
            int i6 = component3 + 23;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.mmBalance, (Object) fibrePreValidation.mmBalance)) {
            int i8 = component1 + 73;
            component3 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.useODAmount, (Object) fibrePreValidation.useODAmount)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.accessFee, (Object) fibrePreValidation.accessFee)) {
            int i10 = component1 + 113;
            component3 = i10 % 128;
            return i10 % 2 != 0;
        }
        if (Intrinsics.areEqual((Object) this.interestRate, (Object) fibrePreValidation.interestRate)) {
            return true;
        }
        int i11 = component3 + 41;
        component1 = i11 % 128;
        return i11 % 2 == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[PHI: r1 r3 r4
  0x0032: PHI (r1v20 int) = (r1v5 int), (r1v22 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x0032: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x0032: PHI (r4v3 java.lang.Double) = (r4v0 java.lang.Double), (r4v5 java.lang.Double) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[PHI: r1 r3
  0x0030: PHI (r1v6 int) = (r1v5 int), (r1v22 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x0030: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibrePreValidation.component1
            int r1 = r1 + 35
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibrePreValidation.component3 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L20
            java.lang.String r1 = r10.channelSessionId
            int r1 = r1.hashCode()
            java.lang.String r3 = r10.currency
            int r3 = r3.hashCode()
            java.lang.Double r4 = r10.balance
            if (r4 != 0) goto L32
            goto L30
        L20:
            java.lang.String r1 = r10.channelSessionId
            int r1 = r1.hashCode()
            java.lang.String r3 = r10.currency
            int r3 = r3.hashCode()
            java.lang.Double r4 = r10.balance
            if (r4 != 0) goto L32
        L30:
            r4 = r2
            goto L36
        L32:
            int r4 = r4.hashCode()
        L36:
            java.lang.Double r5 = r10.mmBalance
            if (r5 != 0) goto L3c
            r5 = r2
            goto L40
        L3c:
            int r5 = r5.hashCode()
        L40:
            java.lang.Double r6 = r10.useODAmount
            if (r6 != 0) goto L46
            r6 = r2
            goto L4a
        L46:
            int r6 = r6.hashCode()
        L4a:
            java.lang.Double r7 = r10.accessFee
            if (r7 != 0) goto L59
            int r7 = com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibrePreValidation.component3
            int r7 = r7 + 3
            int r8 = r7 % 128
            com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibrePreValidation.component1 = r8
            int r7 = r7 % r0
            r7 = r2
            goto L5d
        L59:
            int r7 = r7.hashCode()
        L5d:
            java.lang.Double r8 = r10.interestRate
            if (r8 != 0) goto L6b
            int r8 = com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibrePreValidation.component3
            int r8 = r8 + 47
            int r9 = r8 % 128
            com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibrePreValidation.component1 = r9
        L69:
            int r8 = r8 % r0
            goto L78
        L6b:
            int r2 = r8.hashCode()
            int r8 = com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibrePreValidation.component1
            int r8 = r8 + 51
            int r9 = r8 % 128
            com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibrePreValidation.component3 = r9
            goto L69
        L78:
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r5
            int r1 = r1 * 31
            int r1 = r1 + r6
            int r1 = r1 * 31
            int r1 = r1 + r7
            int r1 = r1 * 31
            int r1 = r1 + r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibrePreValidation.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FibrePreValidation(channelSessionId=" + this.channelSessionId + ", currency=" + this.currency + ", balance=" + this.balance + ", mmBalance=" + this.mmBalance + ", useODAmount=" + this.useODAmount + ", accessFee=" + this.accessFee + ", interestRate=" + this.interestRate + ")";
        int i2 = component1 + 59;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.channelSessionId);
        dest.writeString(this.currency);
        Double d2 = this.balance;
        if (d2 == null) {
            int i2 = component1 + 17;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d2.doubleValue());
        }
        Double d3 = this.mmBalance;
        if (d3 == null) {
            int i4 = component1 + 83;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d3.doubleValue());
        }
        Double d4 = this.useODAmount;
        if (d4 == null) {
            dest.writeInt(0);
            int i6 = component3 + 71;
            component1 = i6 % 128;
            int i7 = i6 % 2;
        } else {
            dest.writeInt(1);
            dest.writeDouble(d4.doubleValue());
        }
        Double d5 = this.accessFee;
        if (d5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d5.doubleValue());
        }
        Double d6 = this.interestRate;
        if (d6 != null) {
            dest.writeInt(1);
            dest.writeDouble(d6.doubleValue());
        } else {
            dest.writeInt(0);
            int i8 = component1 + 29;
            component3 = i8 % 128;
            int i9 = i8 % 2;
        }
    }
}
