package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/ui/model/OptOutReason;", "Landroid/os/Parcelable;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "NotInterested", "HighTransactionCharges", "Other", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/ui/model/OptOutReason$HighTransactionCharges;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/ui/model/OptOutReason$NotInterested;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/ui/model/OptOutReason$Other;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class OptOutReason implements Parcelable {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;
    private final String value;

    private OptOutReason(String str) {
        this.value = str;
    }

    public final String getValue() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 25;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.value;
            int i4 = 54 / 0;
        } else {
            str = this.value;
        }
        int i5 = i2 + 77;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/ui/model/OptOutReason$NotInterested;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/ui/model/OptOutReason;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotInterested extends OptOutReason {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component2 = 0;
        private static int component3 = 0;
        private static int copydefault = 1;
        public static final NotInterested INSTANCE = new NotInterested();
        public static final Parcelable.Creator<NotInterested> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NotInterested> {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final NotInterested createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 11;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                NotInterested notInterested = NotInterested.INSTANCE;
                if (i3 != 0) {
                    return notInterested;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public NotInterested createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 63;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                NotInterested notInterestedCreateFromParcel = createFromParcel(parcel);
                int i4 = ShareDataUIState + 55;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return notInterestedCreateFromParcel;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final NotInterested[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 67;
                ShareDataUIState = i3 % 128;
                NotInterested[] notInterestedArr = new NotInterested[i];
                if (i3 % 2 != 0) {
                    return notInterestedArr;
                }
                throw null;
            }

            @Override
            public NotInterested[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 15;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                NotInterested[] notInterestedArrNewArray = newArray(i);
                int i5 = ShareDataUIState + 11;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 20 / 0;
                }
                return notInterestedArrNewArray;
            }
        }

        private NotInterested() {
            super("NOT_INTERESTED", null);
        }

        static {
            int i = ShareDataUIState + 99;
            component2 = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 61;
            copydefault = i3 % 128;
            int i4 = i3 % 2 == 0 ? 1 : 0;
            int i5 = i2 + 81;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                return i4;
            }
            throw null;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component3 + 123;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    static {
        int i = 1 + 91;
        component3 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/ui/model/OptOutReason$HighTransactionCharges;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/ui/model/OptOutReason;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HighTransactionCharges extends OptOutReason {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3;
        public static final HighTransactionCharges INSTANCE = new HighTransactionCharges();
        public static final Parcelable.Creator<HighTransactionCharges> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HighTransactionCharges> {
            private static int component1 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final HighTransactionCharges createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 101;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                HighTransactionCharges highTransactionCharges = HighTransactionCharges.INSTANCE;
                int i4 = component1 + 125;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return highTransactionCharges;
            }

            @Override
            public HighTransactionCharges createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component1 + 25;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    return createFromParcel(parcel);
                }
                createFromParcel(parcel);
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final HighTransactionCharges[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 91;
                int i4 = i3 % 128;
                component1 = i4;
                HighTransactionCharges[] highTransactionChargesArr = new HighTransactionCharges[i];
                if (i3 % 2 == 0) {
                    throw null;
                }
                int i5 = i4 + 83;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return highTransactionChargesArr;
            }

            @Override
            public HighTransactionCharges[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component1 + 119;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                HighTransactionCharges[] highTransactionChargesArrNewArray = newArray(i);
                int i5 = copydefault + 57;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return highTransactionChargesArrNewArray;
            }
        }

        private HighTransactionCharges() {
            super("HIGH_TRANSACTION_CHARGES", null);
        }

        static {
            int i = ShareDataUIState + 73;
            component3 = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component1 + 111;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 31;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component1 + 9;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(i3 == 0 ? 0 : 1);
        }
    }

    public OptOutReason(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/ui/model/OptOutReason$Other;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/ui/model/OptOutReason;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Other extends OptOutReason {
        public static final int $stable = 0;
        private static int component1 = 0;
        private static int component2 = 0;
        private static int component3 = 1;
        private static int copydefault = 1;
        public static final Other INSTANCE = new Other();
        public static final Parcelable.Creator<Other> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Other> {
            private static int component2 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Other createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 5;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                if (i3 != 0) {
                    return Other.INSTANCE;
                }
                Other other = Other.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public Other createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 37;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    return createFromParcel(parcel);
                }
                createFromParcel(parcel);
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Other[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 125;
                int i4 = i3 % 128;
                component2 = i4;
                Object obj = null;
                Other[] otherArr = new Other[i];
                if (i3 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i5 = i4 + 121;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    return otherArr;
                }
                throw null;
            }

            @Override
            public Other[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 95;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Other[] otherArrNewArray = newArray(i);
                if (i4 != 0) {
                    int i5 = 90 / 0;
                }
                return otherArrNewArray;
            }
        }

        private Other() {
            super("OTHER", null);
        }

        static {
            int i = component3 + 121;
            component2 = i % 128;
            if (i % 2 != 0) {
                int i2 = 17 / 0;
            }
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 61;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 97;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component1 + 121;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(i3 == 0 ? 0 : 1);
        }
    }
}
