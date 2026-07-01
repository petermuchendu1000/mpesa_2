package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/GlobalTransactionData;", "Landroid/os/Parcelable;", "<init>", "()V", "RoamingCashOut", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/GlobalTransactionData$RoamingCashOut;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class GlobalTransactionData implements Parcelable {
    public static final int $stable = 0;
    private static int component1 = 1;
    private static int component3;

    private GlobalTransactionData() {
    }

    static {
        int i = 1 + 115;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public GlobalTransactionData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004HÇ\u0001J\b\u0010\u001c\u001a\u00020\u001dH\u0007J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H×\u0003J\t\u0010\"\u001a\u00020\u001dH×\u0001J\t\u0010#\u001a\u00020\u0004H×\u0001J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006)"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/GlobalTransactionData$RoamingCashOut;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/GlobalTransactionData;", "Landroid/os/Parcelable;", "agentNumber", "", "amount", "Ljava/math/BigDecimal;", "targetAmount", "fee", "currency", "validationId", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)V", "getAgentNumber", "()Ljava/lang/String;", "getAmount", "()Ljava/math/BigDecimal;", "getTargetAmount", "getFee", "getCurrency", "getValidationId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RoamingCashOut extends GlobalTransactionData implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<RoamingCashOut> CREATOR = new Creator();
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int copydefault;
        private final String agentNumber;
        private final BigDecimal amount;
        private final String currency;
        private final BigDecimal fee;
        private final BigDecimal targetAmount;
        private final String validationId;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RoamingCashOut> {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final RoamingCashOut createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                RoamingCashOut roamingCashOut = new RoamingCashOut(parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString());
                int i2 = ShareDataUIState + 37;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                return roamingCashOut;
            }

            @Override
            public RoamingCashOut createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component1 + 3;
                ShareDataUIState = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    createFromParcel(parcel);
                    throw null;
                }
                RoamingCashOut roamingCashOutCreateFromParcel = createFromParcel(parcel);
                int i3 = ShareDataUIState + 97;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    return roamingCashOutCreateFromParcel;
                }
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final RoamingCashOut[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 1;
                component1 = i3 % 128;
                RoamingCashOut[] roamingCashOutArr = new RoamingCashOut[i];
                if (i3 % 2 != 0) {
                    return roamingCashOutArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public RoamingCashOut[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 57;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                RoamingCashOut[] roamingCashOutArrNewArray = newArray(i);
                int i5 = component1 + 95;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return roamingCashOutArrNewArray;
            }
        }

        public final String getAgentNumber() {
            int i = 2 % 2;
            int i2 = component2 + 27;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return this.agentNumber;
            }
            throw null;
        }

        public final BigDecimal getAmount() {
            int i = 2 % 2;
            int i2 = component2 + 125;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            BigDecimal bigDecimal = this.amount;
            int i5 = i3 + 27;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return bigDecimal;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final BigDecimal getTargetAmount() {
            int i = 2 % 2;
            int i2 = copydefault + 73;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            BigDecimal bigDecimal = this.targetAmount;
            if (i3 == 0) {
                int i4 = 90 / 0;
            }
            return bigDecimal;
        }

        public final BigDecimal getFee() {
            int i = 2 % 2;
            int i2 = component2 + 95;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            BigDecimal bigDecimal = this.fee;
            int i5 = i3 + 45;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return bigDecimal;
        }

        public final String getCurrency() {
            int i = 2 % 2;
            int i2 = copydefault + 117;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            String str = this.currency;
            int i5 = i3 + 43;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String getValidationId() {
            int i = 2 % 2;
            int i2 = copydefault + 49;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.validationId;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RoamingCashOut(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str2, String str3) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            Intrinsics.checkNotNullParameter(bigDecimal2, "");
            Intrinsics.checkNotNullParameter(bigDecimal3, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.agentNumber = str;
            this.amount = bigDecimal;
            this.targetAmount = bigDecimal2;
            this.fee = bigDecimal3;
            this.currency = str2;
            this.validationId = str3;
        }

        static {
            int i = ShareDataUIState + 25;
            component1 = i % 128;
            int i2 = i % 2;
        }

        public static RoamingCashOut copy$default(RoamingCashOut roamingCashOut, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str2, String str3, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                str = roamingCashOut.agentNumber;
            }
            String str4 = str;
            if ((i & 2) != 0) {
                int i3 = component2 + 33;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                bigDecimal = roamingCashOut.amount;
                if (i4 != 0) {
                    int i5 = 92 / 0;
                }
            }
            BigDecimal bigDecimal4 = bigDecimal;
            if ((i & 4) != 0) {
                int i6 = copydefault + 13;
                component2 = i6 % 128;
                if (i6 % 2 == 0) {
                    BigDecimal bigDecimal5 = roamingCashOut.targetAmount;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                bigDecimal2 = roamingCashOut.targetAmount;
            }
            BigDecimal bigDecimal6 = bigDecimal2;
            if ((i & 8) != 0) {
                bigDecimal3 = roamingCashOut.fee;
            }
            BigDecimal bigDecimal7 = bigDecimal3;
            if ((i & 16) != 0) {
                str2 = roamingCashOut.currency;
            }
            String str5 = str2;
            if ((i & 32) != 0) {
                int i7 = copydefault + 65;
                component2 = i7 % 128;
                int i8 = i7 % 2;
                str3 = roamingCashOut.validationId;
            }
            return roamingCashOut.copy(str4, bigDecimal4, bigDecimal6, bigDecimal7, str5, str3);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = copydefault + 23;
            int i3 = i2 % 128;
            component2 = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.agentNumber;
            int i4 = i3 + 43;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final BigDecimal component2() {
            int i = 2 % 2;
            int i2 = component2 + 105;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return this.amount;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final BigDecimal component3() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 109;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            BigDecimal bigDecimal = this.targetAmount;
            int i5 = i2 + 95;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 51 / 0;
            }
            return bigDecimal;
        }

        public final BigDecimal component4() {
            int i = 2 % 2;
            int i2 = component2 + 103;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return this.fee;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String component5() {
            int i = 2 % 2;
            int i2 = component2 + 13;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return this.currency;
            }
            throw null;
        }

        public final String component6() {
            int i = 2 % 2;
            int i2 = component2 + 59;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            String str = this.validationId;
            int i5 = i3 + 61;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final RoamingCashOut copy(String agentNumber, BigDecimal amount, BigDecimal targetAmount, BigDecimal fee, String currency, String validationId) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(agentNumber, "");
            Intrinsics.checkNotNullParameter(amount, "");
            Intrinsics.checkNotNullParameter(targetAmount, "");
            Intrinsics.checkNotNullParameter(fee, "");
            Intrinsics.checkNotNullParameter(currency, "");
            Intrinsics.checkNotNullParameter(validationId, "");
            RoamingCashOut roamingCashOut = new RoamingCashOut(agentNumber, amount, targetAmount, fee, currency, validationId);
            int i2 = component2 + 9;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return roamingCashOut;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = copydefault + 13;
            component2 = i2 % 128;
            return 1 ^ (i2 % 2 == 0 ? 0 : 1);
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component2 + 41;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            if (this == other) {
                return true;
            }
            if (other instanceof RoamingCashOut) {
                RoamingCashOut roamingCashOut = (RoamingCashOut) other;
                if (Intrinsics.areEqual(this.agentNumber, roamingCashOut.agentNumber)) {
                    if (!Intrinsics.areEqual(this.amount, roamingCashOut.amount)) {
                        int i4 = copydefault + 101;
                        component2 = i4 % 128;
                        return i4 % 2 == 0;
                    }
                    if (!Intrinsics.areEqual(this.targetAmount, roamingCashOut.targetAmount) || !Intrinsics.areEqual(this.fee, roamingCashOut.fee) || !Intrinsics.areEqual(this.currency, roamingCashOut.currency)) {
                        return false;
                    }
                    if (Intrinsics.areEqual(this.validationId, roamingCashOut.validationId)) {
                        return true;
                    }
                    int i5 = copydefault + 103;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                    return false;
                }
                int i7 = component2 + 49;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
            }
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 101;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((((((((this.agentNumber.hashCode() * 31) + this.amount.hashCode()) * 31) + this.targetAmount.hashCode()) * 31) + this.fee.hashCode()) * 31) + this.currency.hashCode()) * 31) + this.validationId.hashCode();
            int i4 = component2 + 19;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "RoamingCashOut(agentNumber=" + this.agentNumber + ", amount=" + this.amount + ", targetAmount=" + this.targetAmount + ", fee=" + this.fee + ", currency=" + this.currency + ", validationId=" + this.validationId + ')';
            int i2 = component2 + 1;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component2 + 97;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeString(this.agentNumber);
            dest.writeSerializable(this.amount);
            dest.writeSerializable(this.targetAmount);
            dest.writeSerializable(this.fee);
            dest.writeString(this.currency);
            dest.writeString(this.validationId);
            int i4 = component2 + 123;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
    }
}
