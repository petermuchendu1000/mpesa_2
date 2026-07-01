package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/CustomerItem;", "Landroid/os/Parcelable;", "customerNumber", "", "customerName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCustomerNumber", "()Ljava/lang/String;", "getCustomerName", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CustomerItem implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<CustomerItem> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private final String customerName;
    private final String customerNumber;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CustomerItem> {
        private static int ShareDataUIState = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CustomerItem createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            CustomerItem customerItem = new CustomerItem(parcel.readString(), parcel.readString());
            int i2 = component2 + 27;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return customerItem;
        }

        @Override
        public CustomerItem createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 3;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            CustomerItem customerItemCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 39;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 55 / 0;
            }
            return customerItemCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CustomerItem[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 25;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            CustomerItem[] customerItemArr = new CustomerItem[i];
            if (i3 % 2 == 0) {
                throw null;
            }
            int i5 = i4 + 95;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return customerItemArr;
        }

        @Override
        public CustomerItem[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 43;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            CustomerItem[] customerItemArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 44 / 0;
            }
            int i6 = ShareDataUIState + 107;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return customerItemArrNewArray;
        }
    }

    public CustomerItem(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.customerNumber = str;
        this.customerName = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CustomerItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i3 = component3;
            int i4 = i3 + 89;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 61;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            str2 = null;
        }
        this(str, str2);
    }

    public final String getCustomerNumber() {
        int i = 2 % 2;
        int i2 = component3 + 7;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.customerNumber;
        int i5 = i3 + 43;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCustomerName() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 1;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.customerName;
        int i5 = i2 + 95;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component1 + 43;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomerItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static CustomerItem copy$default(CustomerItem customerItem, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = customerItem.customerNumber;
        }
        if ((i & 2) != 0) {
            int i3 = component3 + 83;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            str2 = customerItem.customerName;
        }
        CustomerItem customerItemCopy = customerItem.copy(str, str2);
        int i5 = copydefault + 93;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return customerItemCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 77;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.customerNumber;
        int i5 = i3 + 5;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.customerName;
        }
        throw null;
    }

    public final CustomerItem copy(String customerNumber, String customerName) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(customerNumber, "");
        CustomerItem customerItem = new CustomerItem(customerNumber, customerName);
        int i2 = component3 + 79;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return customerItem;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2 != 0 ? 1 : 0;
        int i5 = i3 + 89;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
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
        if (!(other instanceof CustomerItem)) {
            int i2 = component3 + 45;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        CustomerItem customerItem = (CustomerItem) other;
        if (!Intrinsics.areEqual(this.customerNumber, customerItem.customerNumber)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.customerName, customerItem.customerName)) {
            int i4 = copydefault + 121;
            component3 = i4 % 128;
            return i4 % 2 != 0;
        }
        int i5 = copydefault + 25;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = copydefault + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.customerNumber.hashCode();
        String str = this.customerName;
        if (str == null) {
            int i4 = component3 + 77;
            int i5 = i4 % 128;
            copydefault = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 29;
            component3 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 3 % 4;
            }
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CustomerItem(customerNumber=" + this.customerNumber + ", customerName=" + this.customerName + ')';
        int i2 = component3 + 121;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        String str = this.customerNumber;
        if (i3 == 0) {
            dest.writeString(str);
            dest.writeString(this.customerName);
        } else {
            dest.writeString(str);
            dest.writeString(this.customerName);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
