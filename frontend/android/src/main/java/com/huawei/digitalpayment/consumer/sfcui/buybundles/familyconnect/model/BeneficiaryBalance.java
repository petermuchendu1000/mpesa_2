package com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u0003HÇ\u0001J\b\u0010\u001b\u001a\u00020\u001cH\u0007J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H×\u0003J\t\u0010!\u001a\u00020\u001cH×\u0001J\t\u0010\"\u001a\u00020\u0006H×\u0001J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006("}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/BeneficiaryBalance;", "Landroid/os/Parcelable;", "amount", "", "beneficiaryBalance", "beneficiaryMsisdn", "", "beneficiaryNickname", "createdAt", "usageAmount", "<init>", "(DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "getAmount", "()D", "getBeneficiaryBalance", "getBeneficiaryMsisdn", "()Ljava/lang/String;", "getBeneficiaryNickname", "getCreatedAt", "getUsageAmount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BeneficiaryBalance implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BeneficiaryBalance> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3;

    @SerializedName("amount")
    private final double amount;

    @SerializedName("beneficiaryBalance")
    private final double beneficiaryBalance;

    @SerializedName("beneficiaryMsisdn")
    private final String beneficiaryMsisdn;

    @SerializedName("beneficiaryNickname")
    private final String beneficiaryNickname;

    @SerializedName("createdAt")
    private final String createdAt;

    @SerializedName("usageAmount")
    private final double usageAmount;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BeneficiaryBalance> {
        private static int ShareDataUIState = 1;
        private static int component1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BeneficiaryBalance createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            BeneficiaryBalance beneficiaryBalance = new BeneficiaryBalance(parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble());
            int i2 = component1 + 105;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return beneficiaryBalance;
        }

        @Override
        public BeneficiaryBalance createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 125;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            BeneficiaryBalance beneficiaryBalanceCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 19;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return beneficiaryBalanceCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BeneficiaryBalance[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 7;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            BeneficiaryBalance[] beneficiaryBalanceArr = new BeneficiaryBalance[i];
            if (i3 % 2 == 0) {
                throw null;
            }
            int i5 = i4 + 109;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return beneficiaryBalanceArr;
        }

        @Override
        public BeneficiaryBalance[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 101;
            component1 = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                newArray(i);
                obj.hashCode();
                throw null;
            }
            BeneficiaryBalance[] beneficiaryBalanceArrNewArray = newArray(i);
            int i4 = component1 + 61;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return beneficiaryBalanceArrNewArray;
            }
            obj.hashCode();
            throw null;
        }
    }

    public BeneficiaryBalance(double d2, double d3, String str, String str2, String str3, double d4) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amount = d2;
        this.beneficiaryBalance = d3;
        this.beneficiaryMsisdn = str;
        this.beneficiaryNickname = str2;
        this.createdAt = str3;
        this.usageAmount = d4;
    }

    public final double getAmount() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 15;
        ShareDataUIState = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        double d2 = this.amount;
        int i4 = i2 + 117;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return d2;
        }
        obj.hashCode();
        throw null;
    }

    public final double getBeneficiaryBalance() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 79;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        double d2 = this.beneficiaryBalance;
        int i5 = i2 + 113;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    public final String getBeneficiaryMsisdn() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.beneficiaryMsisdn;
        }
        throw null;
    }

    public final String getBeneficiaryNickname() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.beneficiaryNickname;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getCreatedAt() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.createdAt;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final double getUsageAmount() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 125;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        double d2 = this.usageAmount;
        int i5 = i2 + 9;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return d2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component2 + 79;
        component1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static BeneficiaryBalance copy$default(BeneficiaryBalance beneficiaryBalance, double d2, double d3, String str, String str2, String str3, double d4, int i, Object obj) {
        String str4;
        double d5;
        int i2 = 2 % 2;
        double d6 = (i & 1) != 0 ? beneficiaryBalance.amount : d2;
        double d7 = (i & 2) != 0 ? beneficiaryBalance.beneficiaryBalance : d3;
        String str5 = (i & 4) != 0 ? beneficiaryBalance.beneficiaryMsisdn : str;
        String str6 = (i & 8) != 0 ? beneficiaryBalance.beneficiaryNickname : str2;
        if ((i & 16) != 0) {
            int i3 = component3 + 7;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            str4 = beneficiaryBalance.createdAt;
        } else {
            str4 = str3;
        }
        if ((i & 32) != 0) {
            int i5 = component3 + 105;
            int i6 = i5 % 128;
            ShareDataUIState = i6;
            int i7 = i5 % 2;
            d5 = beneficiaryBalance.usageAmount;
            int i8 = i6 + 43;
            component3 = i8 % 128;
            int i9 = i8 % 2;
        } else {
            d5 = d4;
        }
        return beneficiaryBalance.copy(d6, d7, str5, str6, str4, d5);
    }

    public final double component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        double d2 = this.amount;
        int i5 = i3 + 53;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return d2;
        }
        throw null;
    }

    public final double component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 29;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        double d2 = this.beneficiaryBalance;
        int i5 = i2 + 29;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 109;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.beneficiaryMsisdn;
        int i4 = i2 + 67;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 67;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.beneficiaryNickname;
            int i4 = 15 / 0;
        } else {
            str = this.beneficiaryNickname;
        }
        int i5 = i2 + 87;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 47;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.createdAt;
        int i4 = i2 + 29;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final double component6() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        double d2 = this.usageAmount;
        int i5 = i3 + 119;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    public final BeneficiaryBalance copy(double amount, double beneficiaryBalance, String beneficiaryMsisdn, String beneficiaryNickname, String createdAt, double usageAmount) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(beneficiaryMsisdn, "");
        BeneficiaryBalance beneficiaryBalance2 = new BeneficiaryBalance(amount, beneficiaryBalance, beneficiaryMsisdn, beneficiaryNickname, createdAt, usageAmount);
        int i2 = ShareDataUIState + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return beneficiaryBalance2;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 1;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 33;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryBalance)) {
            return false;
        }
        BeneficiaryBalance beneficiaryBalance = (BeneficiaryBalance) other;
        if (Double.compare(this.amount, beneficiaryBalance.amount) != 0) {
            int i2 = ShareDataUIState + 115;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Double.compare(this.beneficiaryBalance, beneficiaryBalance.beneficiaryBalance) != 0 || !Intrinsics.areEqual(this.beneficiaryMsisdn, beneficiaryBalance.beneficiaryMsisdn)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.beneficiaryNickname, beneficiaryBalance.beneficiaryNickname)) {
            int i4 = ShareDataUIState + 43;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.createdAt, beneficiaryBalance.createdAt)) {
            return false;
        }
        if (Double.compare(this.usageAmount, beneficiaryBalance.usageAmount) == 0) {
            return true;
        }
        int i5 = component3 + 63;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c A[PHI: r1 r3 r4 r5
  0x003c: PHI (r1v17 int) = (r1v4 int), (r1v18 int) binds: [B:8:0x0038, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x003c: PHI (r3v5 int) = (r3v2 int), (r3v7 int) binds: [B:8:0x0038, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x003c: PHI (r4v4 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x0038, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x003c: PHI (r5v3 java.lang.String) = (r5v0 java.lang.String), (r5v5 java.lang.String) binds: [B:8:0x0038, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[PHI: r1 r3 r4
  0x003a: PHI (r1v5 int) = (r1v4 int), (r1v18 int) binds: [B:8:0x0038, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x003a: PHI (r3v3 int) = (r3v2 int), (r3v7 int) binds: [B:8:0x0038, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x003a: PHI (r4v2 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x0038, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.BeneficiaryBalance.ShareDataUIState
            int r1 = r1 + 33
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.BeneficiaryBalance.component3 = r2
            int r1 = r1 % r0
            r2 = 0
            double r3 = r8.amount
            if (r1 == 0) goto L26
            int r1 = java.lang.Double.hashCode(r3)
            double r3 = r8.beneficiaryBalance
            int r3 = java.lang.Double.hashCode(r3)
            java.lang.String r4 = r8.beneficiaryMsisdn
            int r4 = r4.hashCode()
            java.lang.String r5 = r8.beneficiaryNickname
            if (r5 != 0) goto L3c
            goto L3a
        L26:
            int r1 = java.lang.Double.hashCode(r3)
            double r3 = r8.beneficiaryBalance
            int r3 = java.lang.Double.hashCode(r3)
            java.lang.String r4 = r8.beneficiaryMsisdn
            int r4 = r4.hashCode()
            java.lang.String r5 = r8.beneficiaryNickname
            if (r5 != 0) goto L3c
        L3a:
            r5 = r2
            goto L49
        L3c:
            int r5 = r5.hashCode()
            int r6 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.BeneficiaryBalance.ShareDataUIState
            int r6 = r6 + 21
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.BeneficiaryBalance.component3 = r7
            int r6 = r6 % r0
        L49:
            java.lang.String r0 = r8.createdAt
            if (r0 != 0) goto L4e
            goto L52
        L4e:
            int r2 = r0.hashCode()
        L52:
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r5
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r1 = r1 * 31
            double r2 = r8.usageAmount
            int r0 = java.lang.Double.hashCode(r2)
            int r1 = r1 + r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.BeneficiaryBalance.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BeneficiaryBalance(amount=" + this.amount + ", beneficiaryBalance=" + this.beneficiaryBalance + ", beneficiaryMsisdn=" + this.beneficiaryMsisdn + ", beneficiaryNickname=" + this.beneficiaryNickname + ", createdAt=" + this.createdAt + ", usageAmount=" + this.usageAmount + ")";
        int i2 = component3 + 35;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 72 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeDouble(this.amount);
        dest.writeDouble(this.beneficiaryBalance);
        dest.writeString(this.beneficiaryMsisdn);
        dest.writeString(this.beneficiaryNickname);
        dest.writeString(this.createdAt);
        dest.writeDouble(this.usageAmount);
        int i4 = ShareDataUIState + 73;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
