package com.huawei.digitalpayment.consumer.loginModule.mpin.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/LocalTransaction;", "Landroid/os/Parcelable;", "amount", "", "number", "date", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getNumber", "getDate", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalTransaction implements Parcelable {
    public static final Parcelable.Creator<LocalTransaction> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private final String amount;
    private final String date;
    private final String number;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LocalTransaction> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final LocalTransaction createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            LocalTransaction localTransaction = new LocalTransaction(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = copydefault + 89;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return localTransaction;
        }

        @Override
        public LocalTransaction createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 103;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final LocalTransaction[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState;
            int i4 = i3 + 47;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            LocalTransaction[] localTransactionArr = new LocalTransaction[i];
            int i6 = i3 + 107;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                return localTransactionArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public LocalTransaction[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 113;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                newArray(i);
                throw null;
            }
            LocalTransaction[] localTransactionArrNewArray = newArray(i);
            int i4 = copydefault + 51;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return localTransactionArrNewArray;
        }
    }

    public LocalTransaction(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.amount = str;
        this.number = str2;
        this.date = str3;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = component2 + 9;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.amount;
        }
        throw null;
    }

    public final String getNumber() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.number;
        int i5 = i3 + 47;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getDate() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 105;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.date;
        int i5 = i2 + 81;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = copydefault + 67;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static LocalTransaction copy$default(LocalTransaction localTransaction, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2 + 39;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            int i5 = i4 + 29;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                str = localTransaction.amount;
                int i6 = 54 / 0;
            } else {
                str = localTransaction.amount;
            }
        }
        if ((i & 2) != 0) {
            str2 = localTransaction.number;
        }
        if ((i & 4) != 0) {
            int i7 = i4 + 43;
            component2 = i7 % 128;
            if (i7 % 2 != 0) {
                String str4 = localTransaction.date;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str3 = localTransaction.date;
        }
        return localTransaction.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 97;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amount;
        int i5 = i2 + 81;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.number;
        }
        throw null;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            str = this.date;
            int i4 = 84 / 0;
        } else {
            str = this.date;
        }
        int i5 = i3 + 113;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final LocalTransaction copy(String amount, String number, String date) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(date, "");
        LocalTransaction localTransaction = new LocalTransaction(amount, number, date);
        int i2 = ShareDataUIState + 21;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return localTransaction;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 25;
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
            int i2 = component2 + 67;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof LocalTransaction)) {
            int i4 = ShareDataUIState + 89;
            int i5 = i4 % 128;
            component2 = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 61;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        LocalTransaction localTransaction = (LocalTransaction) other;
        if (!Intrinsics.areEqual(this.amount, localTransaction.amount) || !Intrinsics.areEqual(this.number, localTransaction.number)) {
            return false;
        }
        if (Intrinsics.areEqual(this.date, localTransaction.date)) {
            return true;
        }
        int i9 = ShareDataUIState + 81;
        component2 = i9 % 128;
        if (i9 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.amount.hashCode();
        return i3 != 0 ? (((iHashCode - 34) / this.number.hashCode()) >> 124) * this.date.hashCode() : (((iHashCode * 31) + this.number.hashCode()) * 31) + this.date.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalTransaction(amount=" + this.amount + ", number=" + this.number + ", date=" + this.date + ")";
        int i2 = ShareDataUIState + 71;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.amount);
        dest.writeString(this.number);
        dest.writeString(this.date);
        int i4 = ShareDataUIState + 101;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }
}
