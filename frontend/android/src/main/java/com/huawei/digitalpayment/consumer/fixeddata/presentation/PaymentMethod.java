package com.huawei.digitalpayment.consumer.fixeddata.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.digitalpayment.consumer.sfcfixeddata.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentMethod;", "Landroid/os/Parcelable;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "displayName", "", "Mpesa", "Postpay", "AvailableBalance", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentMethod$AvailableBalance;", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentMethod$Mpesa;", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentMethod$Postpay;", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PaymentMethod implements Parcelable {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3;
    private final String value;

    private PaymentMethod(String str) {
        this.value = str;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = component1 + 79;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 83;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentMethod$Mpesa;", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentMethod;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Mpesa extends PaymentMethod {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2 = 1;
        private static int component3;
        public static final Mpesa INSTANCE = new Mpesa();
        public static final Parcelable.Creator<Mpesa> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Mpesa> {
            private static int component2 = 1;
            private static int component3;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Mpesa createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 69;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                Mpesa mpesa = Mpesa.INSTANCE;
                if (i3 == 0) {
                    int i4 = 48 / 0;
                }
                return mpesa;
            }

            @Override
            public Mpesa createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 115;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Mpesa mpesaCreateFromParcel = createFromParcel(parcel);
                if (i3 == 0) {
                    int i4 = 2 / 0;
                }
                int i5 = component3 + 71;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                return mpesaCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Mpesa[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3 + 105;
                int i4 = i3 % 128;
                component2 = i4;
                int i5 = i3 % 2;
                Mpesa[] mpesaArr = new Mpesa[i];
                int i6 = i4 + 57;
                component3 = i6 % 128;
                if (i6 % 2 == 0) {
                    return mpesaArr;
                }
                throw null;
            }

            @Override
            public Mpesa[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 73;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Mpesa[] mpesaArrNewArray = newArray(i);
                int i5 = component3 + 7;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                return mpesaArrNewArray;
            }
        }

        private Mpesa() {
            super("MPESA", null);
        }

        static {
            int i = component3 + 25;
            component1 = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 63;
            ShareDataUIState = i3 % 128;
            int i4 = (i3 % 2 != 0 ? 0 : 1) ^ 1;
            int i5 = i2 + 29;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return i4;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component2 + 67;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentMethod$Postpay;", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentMethod;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Postpay extends PaymentMethod {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 1;
        private static int component2;
        private static int copydefault;
        public static final Postpay INSTANCE = new Postpay();
        public static final Parcelable.Creator<Postpay> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Postpay> {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Postpay createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component1 + 95;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                Postpay postpay = Postpay.INSTANCE;
                if (i3 != 0) {
                    int i4 = 79 / 0;
                }
                int i5 = ShareDataUIState + 21;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return postpay;
            }

            @Override
            public Postpay createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 71;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Postpay postpayCreateFromParcel = createFromParcel(parcel);
                int i4 = ShareDataUIState + 109;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 10 / 0;
                }
                return postpayCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Postpay[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component1;
                int i4 = i3 + 105;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                Postpay[] postpayArr = new Postpay[i];
                int i6 = i3 + 81;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                return postpayArr;
            }

            @Override
            public Postpay[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component1 + 53;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Postpay[] postpayArrNewArray = newArray(i);
                int i5 = ShareDataUIState + 3;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    return postpayArrNewArray;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        private Postpay() {
            super("POSTPAY", null);
        }

        static {
            int i = component2 + 107;
            ShareDataUIState = i % 128;
            if (i % 2 == 0) {
                int i2 = 67 / 0;
            }
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 63;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 35;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return 0;
            }
            throw null;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component1 + 15;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentMethod$AvailableBalance;", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentMethod;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AvailableBalance extends PaymentMethod {
        public static final int $stable = 0;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3 = 1;
        private static int copydefault;
        public static final AvailableBalance INSTANCE = new AvailableBalance();
        public static final Parcelable.Creator<AvailableBalance> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AvailableBalance> {
            private static int ShareDataUIState = 1;
            private static int component1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final AvailableBalance createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component1 + 7;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                AvailableBalance availableBalance = AvailableBalance.INSTANCE;
                int i4 = component1 + 23;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 45 / 0;
                }
                return availableBalance;
            }

            @Override
            public AvailableBalance createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component1 + 111;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    return createFromParcel(parcel);
                }
                createFromParcel(parcel);
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final AvailableBalance[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component1 + 23;
                ShareDataUIState = i3 % 128;
                AvailableBalance[] availableBalanceArr = new AvailableBalance[i];
                if (i3 % 2 != 0) {
                    return availableBalanceArr;
                }
                throw null;
            }

            @Override
            public AvailableBalance[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component1 + 11;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                AvailableBalance[] availableBalanceArrNewArray = newArray(i);
                int i5 = ShareDataUIState + 87;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return availableBalanceArrNewArray;
            }
        }

        private AvailableBalance() {
            super("AVAILABLE BALANCE", null);
        }

        static {
            int i = component2 + 51;
            component1 = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 91;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 109;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = copydefault + 103;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = component3 + 41;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final int displayName() {
        int i = 2 % 2;
        if (Intrinsics.areEqual(this, Mpesa.INSTANCE)) {
            int i2 = component1 + 1;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return R.string.gsm_home_internet_label_payment_method_mpesa;
            }
            int i3 = R.string.gsm_home_internet_label_payment_method_mpesa;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (Intrinsics.areEqual(this, Postpay.INSTANCE)) {
            int i4 = component2 + 39;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return R.string.gsm_fixed_data_payment_method_post_pay;
        }
        if (!Intrinsics.areEqual(this, AvailableBalance.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        int i6 = component2 + 67;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return R.string.gsm_fixed_data_available_balance_label;
    }

    static {
        int i = 1 + 17;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public PaymentMethod(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
