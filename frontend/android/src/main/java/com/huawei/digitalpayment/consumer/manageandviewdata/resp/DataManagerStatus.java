package com.huawei.digitalpayment.consumer.manageandviewdata.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/DataManagerStatus;", "Landroid/os/Parcelable;", "status", "", "<init>", "(Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataManagerStatus implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DataManagerStatus> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int copydefault;

    @SerializedName("status")
    private final String status;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DataManagerStatus> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DataManagerStatus createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            DataManagerStatus dataManagerStatus = new DataManagerStatus(parcel.readString());
            int i2 = ShareDataUIState + 3;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return dataManagerStatus;
        }

        @Override
        public DataManagerStatus createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 87;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            DataManagerStatus dataManagerStatusCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 60 / 0;
            }
            int i5 = ShareDataUIState + 71;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return dataManagerStatusCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DataManagerStatus[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 1;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            DataManagerStatus[] dataManagerStatusArr = new DataManagerStatus[i];
            int i6 = i3 + 3;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                return dataManagerStatusArr;
            }
            throw null;
        }

        @Override
        public DataManagerStatus[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 61;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            DataManagerStatus[] dataManagerStatusArrNewArray = newArray(i);
            int i5 = component2 + 15;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return dataManagerStatusArrNewArray;
        }
    }

    public DataManagerStatus(String str) {
        this.status = str;
    }

    public final String getStatus() {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.status;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component2 + 47;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static DataManagerStatus copy$default(DataManagerStatus dataManagerStatus, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 85;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        int i5 = i & 1;
        if (i3 % 2 != 0 ? i5 != 0 : i5 != 0) {
            str = dataManagerStatus.status;
            int i6 = i4 + 31;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
        }
        return dataManagerStatus.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.status;
        int i5 = i3 + 43;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final DataManagerStatus copy(String status) {
        int i = 2 % 2;
        DataManagerStatus dataManagerStatus = new DataManagerStatus(status);
        int i2 = copydefault + 15;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return dataManagerStatus;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        ShareDataUIState = i2 % 128;
        return 1 ^ (i2 % 2 == 0 ? 0 : 1);
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 123;
        int i4 = i3 % 128;
        copydefault = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == other) {
            int i5 = i4 + 53;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof DataManagerStatus)) {
            int i7 = i2 + 21;
            copydefault = i7 % 128;
            return i7 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.status, ((DataManagerStatus) other).status)) {
            return false;
        }
        int i8 = copydefault + 81;
        ShareDataUIState = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.status;
        if (str == null) {
            int i5 = i3 + 53;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }
        int iHashCode = str.hashCode();
        int i7 = copydefault + 97;
        ShareDataUIState = i7 % 128;
        int i8 = i7 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DataManagerStatus(status=" + this.status + ")";
        int i2 = copydefault + 83;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.status);
        if (i3 == 0) {
            throw null;
        }
    }
}
