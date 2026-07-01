package com.huawei.digitalpayment.consumer.fixeddata.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.alipay.iap.android.wallet.foundation.deeplink.DeeplinkService;
import com.huawei.digitalpayment.consumer.fixeddata.domain.model.FixedDataType;
import com.huawei.digitalpayment.consumer.sfcfixeddata.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\r\u000e\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentOperation;", "Landroid/os/Parcelable;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "title", "", "fixedDataType", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/FixedDataType;", "productType", "Renew", "TopUp", "ChangePlan", "BuyPlan", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentOperation$BuyPlan;", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentOperation$ChangePlan;", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentOperation$Renew;", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentOperation$TopUp;", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PaymentOperation implements Parcelable {
    public static final int $stable = 0;
    private static int ShareDataUIState = 53 % 128;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault;
    private final String value;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        private static int component1 = 0;
        private static int component2 = 1;

        static {
            int[] iArr = new int[FixedDataType.values().length];
            try {
                iArr[FixedDataType.FOUR_G_WIRELESS.ordinal()] = 1;
                int i = component1 + 65;
                component2 = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FixedDataType.FIVE_G_WIRELESS.ordinal()] = 2;
                int i4 = component1 + 51;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 / 3;
                } else {
                    int i6 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private PaymentOperation(String str) {
        this.value = str;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentOperation$Renew;", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentOperation;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Renew extends PaymentOperation {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3 = 1;
        public static final Renew INSTANCE = new Renew();
        public static final Parcelable.Creator<Renew> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Renew> {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Renew createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component1 + 83;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                Renew renew = Renew.INSTANCE;
                int i4 = component1 + 47;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return renew;
            }

            @Override
            public Renew createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component1 + 69;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Renew renewCreateFromParcel = createFromParcel(parcel);
                if (i3 != 0) {
                    int i4 = 93 / 0;
                }
                return renewCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Renew[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 73;
                int i4 = i3 % 128;
                component1 = i4;
                int i5 = i3 % 2;
                Renew[] renewArr = new Renew[i];
                int i6 = i4 + 121;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                return renewArr;
            }

            @Override
            public Renew[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 111;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Renew[] renewArrNewArray = newArray(i);
                int i5 = ShareDataUIState + 9;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 1 / 0;
                }
                return renewArrNewArray;
            }
        }

        private Renew() {
            super("RENEW", null);
        }

        static {
            int i = component3 + 111;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component2 + 123;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return 0;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component1 + 95;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(i3 == 0 ? 0 : 1);
            int i4 = component2 + 117;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentOperation$TopUp;", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentOperation;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TopUp extends PaymentOperation {
        public static final int $stable = 0;
        private static int component1 = 0;
        private static int component2 = 0;
        private static int component3 = 1;
        private static int copydefault = 1;
        public static final TopUp INSTANCE = new TopUp();
        public static final Parcelable.Creator<TopUp> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TopUp> {
            private static int ShareDataUIState = 1;
            private static int component2;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final TopUp createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 13;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                TopUp topUp = TopUp.INSTANCE;
                int i4 = component2 + 79;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    return topUp;
                }
                throw null;
            }

            @Override
            public TopUp createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 101;
                component2 = i2 % 128;
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
            public final TopUp[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 33;
                int i4 = i3 % 128;
                ShareDataUIState = i4;
                int i5 = i3 % 2;
                TopUp[] topUpArr = new TopUp[i];
                int i6 = i4 + 109;
                component2 = i6 % 128;
                if (i6 % 2 == 0) {
                    return topUpArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public TopUp[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 89;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    return newArray(i);
                }
                newArray(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        private TopUp() {
            super(DeeplinkService.Scene.TOP_UP, null);
        }

        static {
            int i = component1 + 101;
            copydefault = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component2 + 39;
            component3 = i2 % 128;
            return i2 % 2 == 0 ? 1 : 0;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component3 + 25;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = component2 + 39;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentOperation$ChangePlan;", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentOperation;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ChangePlan extends PaymentOperation {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3;
        public static final ChangePlan INSTANCE = new ChangePlan();
        public static final Parcelable.Creator<ChangePlan> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ChangePlan> {
            private static int component2 = 0;
            private static int component3 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ChangePlan createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 89;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                ChangePlan changePlan = ChangePlan.INSTANCE;
                if (i3 == 0) {
                    return changePlan;
                }
                throw null;
            }

            @Override
            public ChangePlan createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 27;
                component3 = i2 % 128;
                if (i2 % 2 != 0) {
                    return createFromParcel(parcel);
                }
                createFromParcel(parcel);
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ChangePlan[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3 + 29;
                component2 = i3 % 128;
                ChangePlan[] changePlanArr = new ChangePlan[i];
                if (i3 % 2 == 0) {
                    return changePlanArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public ChangePlan[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 15;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                ChangePlan[] changePlanArrNewArray = newArray(i);
                if (i4 == 0) {
                    int i5 = 17 / 0;
                }
                int i6 = component3 + 105;
                component2 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 9 / 0;
                }
                return changePlanArrNewArray;
            }
        }

        private ChangePlan() {
            super("CHANGE_PLAN", null);
        }

        static {
            int i = component3 + 63;
            component2 = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 3;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 23;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 90 / 0;
            }
            return 0;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 23;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = component1 + 71;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentOperation$BuyPlan;", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentOperation;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BuyPlan extends PaymentOperation {
        public static final int $stable = 0;
        private static int component1 = 1;
        private static int component2 = 0;
        private static int component3 = 0;
        private static int copydefault = 1;
        public static final BuyPlan INSTANCE = new BuyPlan();
        public static final Parcelable.Creator<BuyPlan> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BuyPlan> {
            private static int component2 = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final BuyPlan createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 37;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                BuyPlan buyPlan = BuyPlan.INSTANCE;
                int i4 = component2 + 103;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return buyPlan;
            }

            @Override
            public BuyPlan createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 67;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    return createFromParcel(parcel);
                }
                createFromParcel(parcel);
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final BuyPlan[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 65;
                int i4 = i3 % 128;
                copydefault = i4;
                int i5 = i3 % 2;
                BuyPlan[] buyPlanArr = new BuyPlan[i];
                int i6 = i4 + 57;
                component2 = i6 % 128;
                if (i6 % 2 == 0) {
                    return buyPlanArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public BuyPlan[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 117;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    return newArray(i);
                }
                newArray(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        private BuyPlan() {
            super("BUY_PLAN", null);
        }

        static {
            int i = component3 + 75;
            copydefault = i % 128;
            if (i % 2 == 0) {
                int i2 = 40 / 0;
            }
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 125;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 1;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component2 + 77;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(i3 == 0 ? 0 : 1);
            int i4 = component2 + 35;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static int title$default(PaymentOperation paymentOperation, FixedDataType fixedDataType, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 83;
        component3 = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: title");
        }
        if ((i & 2) != 0) {
            int i5 = i3 + 61;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            str = "MONTHLY";
        }
        return paymentOperation.title(fixedDataType, str);
    }

    public final int title(FixedDataType fixedDataType, String productType) {
        int i = 2 % 2;
        int i2 = component3 + 81;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(fixedDataType, "");
            Intrinsics.checkNotNullParameter(productType, "");
            Intrinsics.areEqual(this, Renew.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(fixedDataType, "");
        Intrinsics.checkNotNullParameter(productType, "");
        if (Intrinsics.areEqual(this, Renew.INSTANCE)) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[fixedDataType.ordinal()];
            if (i3 == 1) {
                return R.string.gsm_home_internet_payment_confirmation_sub_title_renew_4g_plan;
            }
            int i4 = copydefault + 51;
            component3 = i4 % 128;
            return (i4 % 2 != 0 ? i3 == 2 : i3 == 2) ? R.string.gsm_home_internet_payment_confirmation_sub_title_renew_5g_plan : R.string.gsm_home_internet_payment_confirmation_sub_title_renew_fibre_plan;
        }
        if (Intrinsics.areEqual(this, TopUp.INSTANCE)) {
            return R.string.gsm_home_internet_top_up;
        }
        if (!Intrinsics.areEqual(this, ChangePlan.INSTANCE)) {
            if (!Intrinsics.areEqual(this, BuyPlan.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            int i5 = WhenMappings.$EnumSwitchMapping$0[fixedDataType.ordinal()];
            return i5 != 1 ? i5 != 2 ? R.string.gsm_home_internet_payment_confirmation_sub_title_buy_fibre_plan : R.string.gsm_home_internet_payment_confirmation_sub_title_buy_5g_plan : Intrinsics.areEqual(productType, "BOOSTER") ? R.string.gsm_home_internet_payment_confirmation_sub_title_buy_4g_booster_plan : R.string.gsm_home_internet_payment_confirmation_sub_title_buy_4g_plan;
        }
        int i6 = WhenMappings.$EnumSwitchMapping$0[fixedDataType.ordinal()];
        if (i6 == 1) {
            return R.string.gsm_home_internet_payment_confirmation_sub_title_change_4g_plan;
        }
        int i7 = copydefault + 33;
        int i8 = i7 % 128;
        component3 = i8;
        int i9 = i7 % 2;
        if (i6 == 2) {
            return R.string.gsm_home_internet_payment_confirmation_sub_title_change_5g_plan;
        }
        int i10 = i8 + 83;
        copydefault = i10 % 128;
        int i11 = i10 % 2;
        return R.string.gsm_home_internet_payment_confirmation_sub_title_change_fibre_plan;
    }

    static {
        if (53 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public PaymentOperation(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
