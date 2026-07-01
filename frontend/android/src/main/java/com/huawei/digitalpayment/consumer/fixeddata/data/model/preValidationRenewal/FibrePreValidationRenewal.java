package com.huawei.digitalpayment.consumer.fixeddata.data.model.preValidationRenewal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J^\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÇ\u0001¢\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020!H\u0007J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H×\u0003J\t\u0010&\u001a\u00020!H×\u0001J\t\u0010'\u001a\u00020\u0003H×\u0001J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020!H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0016\u0010\u0011¨\u0006-"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/preValidationRenewal/FibrePreValidationRenewal;", "Landroid/os/Parcelable;", "channelSessionId", "", "currency", "balance", "", "mmBalance", "useODAmount", "accessFee", "interestRate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getChannelSessionId", "()Ljava/lang/String;", "getCurrency", "getBalance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMmBalance", "getUseODAmount", "getAccessFee", "getInterestRate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/preValidationRenewal/FibrePreValidationRenewal;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FibrePreValidationRenewal implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FibrePreValidationRenewal> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
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
    public static final class Creator implements Parcelable.Creator<FibrePreValidationRenewal> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibrePreValidationRenewal createFromParcel(Parcel parcel) {
            Double d2;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() == 0) {
                d2 = null;
            } else {
                Double dValueOf3 = Double.valueOf(parcel.readDouble());
                int i2 = ShareDataUIState + 15;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 4 % 5;
                }
                d2 = dValueOf3;
            }
            FibrePreValidationRenewal fibrePreValidationRenewal = new FibrePreValidationRenewal(string, string2, dValueOf, dValueOf2, d2, parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
            int i4 = ShareDataUIState + 61;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return fibrePreValidationRenewal;
        }

        @Override
        public FibrePreValidationRenewal createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 119;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            FibrePreValidationRenewal fibrePreValidationRenewalCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 95;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return fibrePreValidationRenewalCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibrePreValidationRenewal[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState;
            int i4 = i3 + 31;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            FibrePreValidationRenewal[] fibrePreValidationRenewalArr = new FibrePreValidationRenewal[i];
            int i6 = i3 + 29;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                return fibrePreValidationRenewalArr;
            }
            throw null;
        }

        @Override
        public FibrePreValidationRenewal[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 21;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            FibrePreValidationRenewal[] fibrePreValidationRenewalArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 99 / 0;
            }
            return fibrePreValidationRenewalArrNewArray;
        }
    }

    public FibrePreValidationRenewal(String str, String str2, Double d2, Double d3, Double d4, Double d5, Double d6) {
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
        int i2 = component2 + 71;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.channelSessionId;
        int i5 = i3 + 19;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getCurrency() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 9;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.currency;
        int i5 = i2 + 91;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Double getBalance() {
        int i = 2 % 2;
        int i2 = component2 + 113;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Double d2 = this.balance;
        int i4 = i3 + 11;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return d2;
    }

    public final Double getMmBalance() {
        Double d2;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 111;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            d2 = this.mmBalance;
            int i4 = 8 / 0;
        } else {
            d2 = this.mmBalance;
        }
        int i5 = i2 + 71;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return d2;
        }
        throw null;
    }

    public final Double getUseODAmount() {
        int i = 2 % 2;
        int i2 = component3 + 29;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Double d2 = this.useODAmount;
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
        return d2;
    }

    public final Double getAccessFee() {
        int i = 2 % 2;
        int i2 = component2 + 79;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Double d2 = this.accessFee;
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        return d2;
    }

    public final Double getInterestRate() {
        int i = 2 % 2;
        int i2 = component3 + 113;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.interestRate;
        }
        throw null;
    }

    static {
        int i = copydefault + 51;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public static FibrePreValidationRenewal copy$default(FibrePreValidationRenewal fibrePreValidationRenewal, String str, String str2, Double d2, Double d3, Double d4, Double d5, Double d6, int i, Object obj) {
        String str3;
        Double d7;
        Double d8;
        Double d9;
        Double d10;
        int i2 = 2 % 2;
        String str4 = (i & 1) != 0 ? fibrePreValidationRenewal.channelSessionId : str;
        if ((i & 2) != 0) {
            str3 = fibrePreValidationRenewal.currency;
            int i3 = component2 + 109;
            component3 = i3 % 128;
            int i4 = i3 % 2;
        } else {
            str3 = str2;
        }
        if ((i & 4) != 0) {
            int i5 = component3 + 63;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            d7 = fibrePreValidationRenewal.balance;
        } else {
            d7 = d2;
        }
        if ((i & 8) != 0) {
            int i7 = component3 + 79;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            d8 = fibrePreValidationRenewal.mmBalance;
        } else {
            d8 = d3;
        }
        if ((i & 16) != 0) {
            int i9 = component2 + 5;
            component3 = i9 % 128;
            if (i9 % 2 != 0) {
                d9 = fibrePreValidationRenewal.useODAmount;
                int i10 = 98 / 0;
            } else {
                d9 = fibrePreValidationRenewal.useODAmount;
            }
        } else {
            d9 = d4;
        }
        Double d11 = (i & 32) != 0 ? fibrePreValidationRenewal.accessFee : d5;
        if ((i & 64) != 0) {
            int i11 = component3;
            int i12 = i11 + 1;
            component2 = i12 % 128;
            int i13 = i12 % 2;
            d10 = fibrePreValidationRenewal.interestRate;
            int i14 = i11 + 9;
            component2 = i14 % 128;
            int i15 = i14 % 2;
        } else {
            d10 = d6;
        }
        return fibrePreValidationRenewal.copy(str4, str3, d7, d8, d9, d11, d10);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 83;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.channelSessionId;
        int i5 = i3 + 83;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 3;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.currency;
        int i5 = i2 + 7;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Double component3() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Double d2 = this.balance;
        int i4 = i3 + 101;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
        return d2;
    }

    public final Double component4() {
        int i = 2 % 2;
        int i2 = component2 + 39;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Double d2 = this.mmBalance;
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
        return d2;
    }

    public final Double component5() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.useODAmount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Double component6() {
        int i = 2 % 2;
        int i2 = component2 + 25;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.accessFee;
        }
        throw null;
    }

    public final Double component7() {
        int i = 2 % 2;
        int i2 = component3 + 83;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Double d2 = this.interestRate;
        int i5 = i3 + 51;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    public final FibrePreValidationRenewal copy(String channelSessionId, String currency, Double balance, Double mmBalance, Double useODAmount, Double accessFee, Double interestRate) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(channelSessionId, "");
        Intrinsics.checkNotNullParameter(currency, "");
        FibrePreValidationRenewal fibrePreValidationRenewal = new FibrePreValidationRenewal(channelSessionId, currency, balance, mmBalance, useODAmount, accessFee, interestRate);
        int i2 = component2 + 53;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return fibrePreValidationRenewal;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 35;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3 + 79;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 35;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(other instanceof FibrePreValidationRenewal)) {
            return false;
        }
        FibrePreValidationRenewal fibrePreValidationRenewal = (FibrePreValidationRenewal) other;
        if (!Intrinsics.areEqual(this.channelSessionId, fibrePreValidationRenewal.channelSessionId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.currency, fibrePreValidationRenewal.currency)) {
            int i6 = component2 + 21;
            component3 = i6 % 128;
            return i6 % 2 != 0;
        }
        if (!Intrinsics.areEqual((Object) this.balance, (Object) fibrePreValidationRenewal.balance) || !Intrinsics.areEqual((Object) this.mmBalance, (Object) fibrePreValidationRenewal.mmBalance)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.useODAmount, (Object) fibrePreValidationRenewal.useODAmount)) {
            int i7 = component2 + 19;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual((Object) this.accessFee, (Object) fibrePreValidationRenewal.accessFee)) {
            return Intrinsics.areEqual((Object) this.interestRate, (Object) fibrePreValidationRenewal.interestRate);
        }
        int i9 = component3 + 75;
        component2 = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.fixeddata.data.model.preValidationRenewal.FibrePreValidationRenewal.component2
            int r1 = r1 + 49
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.fixeddata.data.model.preValidationRenewal.FibrePreValidationRenewal.component3 = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L22
            java.lang.String r1 = r9.channelSessionId
            int r1 = r1.hashCode()
            java.lang.String r4 = r9.currency
            int r4 = r4.hashCode()
            java.lang.Double r5 = r9.balance
            if (r5 != 0) goto L42
            r5 = r2
            goto L33
        L22:
            java.lang.String r1 = r9.channelSessionId
            int r1 = r1.hashCode()
            java.lang.String r4 = r9.currency
            int r4 = r4.hashCode()
            java.lang.Double r5 = r9.balance
            if (r5 != 0) goto L41
            r5 = r3
        L33:
            int r6 = com.huawei.digitalpayment.consumer.fixeddata.data.model.preValidationRenewal.FibrePreValidationRenewal.component3
            int r6 = r6 + 71
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.fixeddata.data.model.preValidationRenewal.FibrePreValidationRenewal.component2 = r7
            int r6 = r6 % r0
            if (r6 != 0) goto L3f
            goto L52
        L3f:
            r2 = r3
            goto L52
        L41:
            r2 = r3
        L42:
            int r5 = r5.hashCode()
            int r6 = com.huawei.digitalpayment.consumer.fixeddata.data.model.preValidationRenewal.FibrePreValidationRenewal.component2
            int r6 = r6 + 25
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.fixeddata.data.model.preValidationRenewal.FibrePreValidationRenewal.component3 = r7
            int r6 = r6 % r0
            r8 = r5
            r5 = r2
            r2 = r8
        L52:
            java.lang.Double r6 = r9.mmBalance
            if (r6 != 0) goto L61
            int r6 = com.huawei.digitalpayment.consumer.fixeddata.data.model.preValidationRenewal.FibrePreValidationRenewal.component3
            int r6 = r6 + 35
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.fixeddata.data.model.preValidationRenewal.FibrePreValidationRenewal.component2 = r7
            int r6 = r6 % r0
            r0 = r3
            goto L65
        L61:
            int r0 = r6.hashCode()
        L65:
            java.lang.Double r6 = r9.useODAmount
            if (r6 != 0) goto L6b
            r6 = r3
            goto L6f
        L6b:
            int r6 = r6.hashCode()
        L6f:
            java.lang.Double r7 = r9.accessFee
            if (r7 != 0) goto L74
            goto L78
        L74:
            int r3 = r7.hashCode()
        L78:
            java.lang.Double r7 = r9.interestRate
            if (r7 != 0) goto L7d
            goto L81
        L7d:
            int r5 = r7.hashCode()
        L81:
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r1 = r1 * 31
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r1 = r1 + r6
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.data.model.preValidationRenewal.FibrePreValidationRenewal.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FibrePreValidationRenewal(channelSessionId=" + this.channelSessionId + ", currency=" + this.currency + ", balance=" + this.balance + ", mmBalance=" + this.mmBalance + ", useODAmount=" + this.useODAmount + ", accessFee=" + this.accessFee + ", interestRate=" + this.interestRate + ")";
        int i2 = component3 + 31;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 101;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.channelSessionId);
        dest.writeString(this.currency);
        Double d2 = this.balance;
        if (d2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d2.doubleValue());
        }
        Double d3 = this.mmBalance;
        if (d3 == null) {
            int i4 = component2 + 21;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                dest.writeInt(1);
            } else {
                dest.writeInt(0);
            }
        } else {
            dest.writeInt(1);
            dest.writeDouble(d3.doubleValue());
        }
        Double d4 = this.useODAmount;
        if (d4 == null) {
            int i5 = component2 + 107;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            dest.writeInt(0);
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
        if (d6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d6.doubleValue());
        }
    }
}
