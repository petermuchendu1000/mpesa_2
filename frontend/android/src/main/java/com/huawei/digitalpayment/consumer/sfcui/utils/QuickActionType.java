package com.huawei.digitalpayment.consumer.sfcui.utils;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/utils/QuickActionType;", "Landroid/os/Parcelable;", "<init>", "()V", "Transaction", "Lcom/huawei/digitalpayment/consumer/sfcui/utils/QuickActionType$Transaction;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class QuickActionType implements Parcelable {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 7 % 128;

    private QuickActionType() {
    }

    static {
        if (7 % 2 == 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/utils/QuickActionType$Transaction;", "Lcom/huawei/digitalpayment/consumer/sfcui/utils/QuickActionType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Transaction extends QuickActionType {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component2 = 0;
        private static int component3 = 1;
        public static final Transaction INSTANCE = new Transaction();
        public static final Parcelable.Creator<Transaction> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Transaction> {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Transaction createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 27;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                Transaction transaction = Transaction.INSTANCE;
                if (i3 == 0) {
                    throw null;
                }
                int i4 = component2 + 69;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return transaction;
            }

            @Override
            public Transaction createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 125;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    createFromParcel(parcel);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Transaction transactionCreateFromParcel = createFromParcel(parcel);
                int i3 = ShareDataUIState + 13;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                return transactionCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Transaction[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 15;
                int i4 = i3 % 128;
                component2 = i4;
                int i5 = i3 % 2;
                Transaction[] transactionArr = new Transaction[i];
                int i6 = i4 + 107;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 == 0) {
                    return transactionArr;
                }
                throw null;
            }

            @Override
            public Transaction[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 89;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                Transaction[] transactionArrNewArray = newArray(i);
                if (i4 == 0) {
                    int i5 = 0 / 0;
                }
                int i6 = component2 + 23;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 66 / 0;
                }
                return transactionArrNewArray;
            }
        }

        private Transaction() {
            super(null);
        }

        static {
            int i = ShareDataUIState + 39;
            component1 = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component3 + 29;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return 0;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component3 + 35;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    public QuickActionType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
