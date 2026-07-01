package com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.components;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/components/FulizaState;", "Landroid/os/Parcelable;", "<init>", "()V", "BalanceInfo", "BalanceNotAvailable", "Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/components/FulizaState$BalanceInfo;", "Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/components/FulizaState$BalanceNotAvailable;", "ConsumerSfcPochiWallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FulizaState implements Parcelable {
    public static final int $stable = 0;
    private static int component2 = 27 % 128;
    private static int copydefault;

    private FulizaState() {
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0010H×\u0001J\t\u0010\u0016\u001a\u00020\u0005H×\u0001J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/components/FulizaState$BalanceInfo;", "Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/components/FulizaState;", "balance", "", "currency", "", "<init>", "(DLjava/lang/String;)V", "getBalance", "()D", "getCurrency", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcPochiWallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BalanceInfo extends FulizaState {
        public static final int $stable = 0;
        public static final Parcelable.Creator<BalanceInfo> CREATOR = new Creator();
        private static int ShareDataUIState = 1;
        private static int component1 = 1;
        private static int component2;
        private static int copydefault;
        private final double balance;
        private final String currency;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BalanceInfo> {
            private static int ShareDataUIState = 1;
            private static int component1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final BalanceInfo createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                BalanceInfo balanceInfo = new BalanceInfo(parcel.readDouble(), parcel.readString());
                int i2 = component1 + 49;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    return balanceInfo;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public BalanceInfo createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 29;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                BalanceInfo balanceInfoCreateFromParcel = createFromParcel(parcel);
                if (i3 != 0) {
                    int i4 = 84 / 0;
                }
                int i5 = ShareDataUIState + 109;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 74 / 0;
                }
                return balanceInfoCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final BalanceInfo[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component1 + 63;
                ShareDataUIState = i3 % 128;
                BalanceInfo[] balanceInfoArr = new BalanceInfo[i];
                if (i3 % 2 != 0) {
                    return balanceInfoArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public BalanceInfo[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component1 + 115;
                ShareDataUIState = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    newArray(i);
                    obj.hashCode();
                    throw null;
                }
                BalanceInfo[] balanceInfoArrNewArray = newArray(i);
                int i4 = ShareDataUIState + 63;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return balanceInfoArrNewArray;
                }
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BalanceInfo(double d2, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.balance = d2;
            this.currency = str;
        }

        public final double getBalance() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 17;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.balance;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String getCurrency() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 103;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.currency;
            int i5 = i2 + 119;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        static {
            int i = copydefault + 125;
            component1 = i % 128;
            int i2 = i % 2;
        }

        public static BalanceInfo copy$default(BalanceInfo balanceInfo, double d2, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component2 + 93;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            if ((i & 1) != 0) {
                int i6 = i4 + 17;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                d2 = balanceInfo.balance;
            }
            if ((i & 2) != 0) {
                str = balanceInfo.currency;
                int i8 = i4 + 77;
                component2 = i8 % 128;
                int i9 = i8 % 2;
            }
            return balanceInfo.copy(d2, str);
        }

        public final double component1() {
            int i = 2 % 2;
            int i2 = component2 + 109;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            double d2 = this.balance;
            int i5 = i3 + 113;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return d2;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 27;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            String str = this.currency;
            int i5 = i3 + 77;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final BalanceInfo copy(double balance, String currency) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(currency, "");
            BalanceInfo balanceInfo = new BalanceInfo(balance, currency);
            int i2 = ShareDataUIState + 11;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return balanceInfo;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component2 + 121;
            ShareDataUIState = i2 % 128;
            return 1 ^ (i2 % 2 == 0 ? 0 : 1);
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component2 + 119;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    return true;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!(other instanceof BalanceInfo)) {
                return false;
            }
            BalanceInfo balanceInfo = (BalanceInfo) other;
            if (Double.compare(this.balance, balanceInfo.balance) == 0) {
                return Intrinsics.areEqual(this.currency, balanceInfo.currency);
            }
            int i3 = component2 + 63;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 107;
            ShareDataUIState = i2 % 128;
            int iHashCode = i2 % 2 == 0 ? (Double.hashCode(this.balance) / 55) / this.currency.hashCode() : (Double.hashCode(this.balance) * 31) + this.currency.hashCode();
            int i3 = ShareDataUIState + 57;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 27 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "BalanceInfo(balance=" + this.balance + ", currency=" + this.currency + ")";
            int i2 = ShareDataUIState + 7;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 113;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            if (i3 == 0) {
                dest.writeDouble(this.balance);
                dest.writeString(this.currency);
            } else {
                dest.writeDouble(this.balance);
                dest.writeString(this.currency);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    static {
        if (27 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public FulizaState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/components/FulizaState$BalanceNotAvailable;", "Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/components/FulizaState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcPochiWallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BalanceNotAvailable extends FulizaState {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2 = 0;
        private static int component3 = 1;
        public static final BalanceNotAvailable INSTANCE = new BalanceNotAvailable();
        public static final Parcelable.Creator<BalanceNotAvailable> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BalanceNotAvailable> {
            private static int component2 = 1;
            private static int component3;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final BalanceNotAvailable createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 115;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                BalanceNotAvailable balanceNotAvailable = BalanceNotAvailable.INSTANCE;
                int i4 = component3 + 77;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return balanceNotAvailable;
            }

            @Override
            public BalanceNotAvailable createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 25;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    return createFromParcel(parcel);
                }
                createFromParcel(parcel);
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final BalanceNotAvailable[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3;
                int i4 = i3 + 3;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                BalanceNotAvailable[] balanceNotAvailableArr = new BalanceNotAvailable[i];
                int i6 = i3 + 9;
                component2 = i6 % 128;
                if (i6 % 2 != 0) {
                    return balanceNotAvailableArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public BalanceNotAvailable[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3 + 81;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                BalanceNotAvailable[] balanceNotAvailableArrNewArray = newArray(i);
                int i5 = component2 + 25;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    return balanceNotAvailableArrNewArray;
                }
                throw null;
            }
        }

        private BalanceNotAvailable() {
            super(null);
        }

        static {
            int i = component2 + 81;
            component1 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 113;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 97;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (other instanceof BalanceNotAvailable) {
                return true;
            }
            int i2 = component3 + 43;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 89;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 79;
            int i3 = i2 % 128;
            component3 = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 105;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 85 / 0;
            }
            return -545495763;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 123;
            int i3 = i2 % 128;
            component3 = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 35;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return "BalanceNotAvailable";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 7;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }
}
