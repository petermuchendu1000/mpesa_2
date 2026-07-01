package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.GlobalTransactionData;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B?\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001a\u001a\u00020\u0005H\u0007J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0005H\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\f\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/ValidateTransactionData;", "T", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/GlobalTransactionData;", "Landroid/os/Parcelable;", "transactionIcon", "", "transactionBadgeIcon", "transactionTitle", "transactionSubtitle", "transactionFeeTitle", "transactionType", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionType;", "transactionData", "<init>", "(IIIIILcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionType;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/GlobalTransactionData;)V", "getTransactionIcon", "()I", "getTransactionBadgeIcon", "getTransactionTitle", "getTransactionSubtitle", "getTransactionFeeTitle", "getTransactionType", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionType;", "getTransactionData", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/GlobalTransactionData;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/GlobalTransactionData;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ValidateTransactionData<T extends GlobalTransactionData> implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ValidateTransactionData<?>> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;
    private final int transactionBadgeIcon;
    private final T transactionData;
    private final int transactionFeeTitle;
    private final int transactionIcon;
    private final int transactionSubtitle;
    private final int transactionTitle;
    private final TransactionType transactionType;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ValidateTransactionData<?>> {
        private static int ShareDataUIState = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ValidateTransactionData<?> createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ValidateTransactionData<?> validateTransactionData = new ValidateTransactionData<>(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), TransactionType.valueOf(parcel.readString()), (GlobalTransactionData) parcel.readParcelable(ValidateTransactionData.class.getClassLoader()));
            int i2 = component2 + 29;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return validateTransactionData;
        }

        @Override
        public ValidateTransactionData<?> createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 49;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            ValidateTransactionData<?> validateTransactionDataCreateFromParcel = createFromParcel(parcel);
            if (i3 != 0) {
                int i4 = 49 / 0;
            }
            return validateTransactionDataCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ValidateTransactionData<?>[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 111;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            ValidateTransactionData<?>[] validateTransactionDataArr = new ValidateTransactionData[i];
            int i6 = i4 + 15;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 26 / 0;
            }
            return validateTransactionDataArr;
        }

        @Override
        public ValidateTransactionData<?>[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 73;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            ValidateTransactionData<?>[] validateTransactionDataArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 89;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return validateTransactionDataArrNewArray;
        }
    }

    public ValidateTransactionData(int i, int i2, int i3, int i4, int i5, TransactionType transactionType, T t) {
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(t, "");
        this.transactionIcon = i;
        this.transactionBadgeIcon = i2;
        this.transactionTitle = i3;
        this.transactionSubtitle = i4;
        this.transactionFeeTitle = i5;
        this.transactionType = transactionType;
        this.transactionData = t;
    }

    public final int getTransactionIcon() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 47;
        component1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.transactionIcon;
        int i5 = i2 + 113;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public final int getTransactionBadgeIcon() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 57;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.transactionBadgeIcon;
        int i6 = i2 + 37;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int getTransactionTitle() {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.transactionTitle;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getTransactionSubtitle() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 91;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.transactionSubtitle;
        int i6 = i2 + 23;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 88 / 0;
        }
        return i5;
    }

    public final int getTransactionFeeTitle() {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = this.transactionFeeTitle;
        int i6 = i3 + 37;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final TransactionType getTransactionType() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 51;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        TransactionType transactionType = this.transactionType;
        int i5 = i2 + 27;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return transactionType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final T getTransactionData() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 39;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        T t = this.transactionData;
        int i5 = i2 + 27;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return t;
    }

    static {
        int i = component2 + 109;
        component3 = i % 128;
        if (i % 2 == 0) {
            int i2 = 56 / 0;
        }
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeInt(this.transactionIcon);
        dest.writeInt(this.transactionBadgeIcon);
        dest.writeInt(this.transactionTitle);
        dest.writeInt(this.transactionSubtitle);
        dest.writeInt(this.transactionFeeTitle);
        dest.writeString(this.transactionType.name());
        dest.writeParcelable(this.transactionData, flags);
        int i4 = copydefault + 39;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }
}
