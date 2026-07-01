package com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibrePayment;", "Landroid/os/Parcelable;", "tid", "", "<init>", "(Ljava/lang/String;)V", "getTid", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FibrePayment implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FibrePayment> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("tid")
    private final String tid;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FibrePayment> {
        private static int component1 = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibrePayment createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            FibrePayment fibrePayment = new FibrePayment(parcel.readString());
            int i2 = component3 + 31;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return fibrePayment;
        }

        @Override
        public FibrePayment createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 123;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                createFromParcel(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            FibrePayment fibrePaymentCreateFromParcel = createFromParcel(parcel);
            int i3 = component3 + 33;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return fibrePaymentCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibrePayment[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 73;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            FibrePayment[] fibrePaymentArr = new FibrePayment[i];
            int i6 = i4 + 65;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return fibrePaymentArr;
        }

        @Override
        public FibrePayment[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 87;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            FibrePayment[] fibrePaymentArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 91 / 0;
            }
            int i6 = component3 + 63;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 15 / 0;
            }
            return fibrePaymentArrNewArray;
        }
    }

    public FibrePayment(String str) {
        this.tid = str;
    }

    public final String getTid() {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.tid;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = ShareDataUIState + 77;
        component1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static FibrePayment copy$default(FibrePayment fibrePayment, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3 + 73;
        int i4 = i3 % 128;
        copydefault = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            int i5 = i4 + 1;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            str = fibrePayment.tid;
            if (i6 == 0) {
                int i7 = 53 / 0;
            }
        }
        FibrePayment fibrePaymentCopy = fibrePayment.copy(str);
        int i8 = component3 + 99;
        copydefault = i8 % 128;
        int i9 = i8 % 2;
        return fibrePaymentCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.tid;
        }
        throw null;
    }

    public final FibrePayment copy(String tid) {
        int i = 2 % 2;
        FibrePayment fibrePayment = new FibrePayment(tid);
        int i2 = component3 + 21;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return fibrePayment;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 95;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 13;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 115;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FibrePayment)) {
            int i5 = i2 + 75;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.tid, ((FibrePayment) other).tid)) {
            return true;
        }
        int i7 = copydefault + 23;
        component3 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        String str = this.tid;
        if (str != null) {
            return str.hashCode();
        }
        int i2 = component3 + 75;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 125;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FibrePayment(tid=" + this.tid + ")";
        int i2 = copydefault + 113;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.tid);
        int i4 = copydefault + 63;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
