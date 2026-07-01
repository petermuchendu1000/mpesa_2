package com.huawei.digitalpayment.consumer.manageandviewdata.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.iap.ac.android.acs.operation.log.LogConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/DataManagerPayload;", "Landroid/os/Parcelable;", "msisdn", "", LogConstants.Mpm.Interceptor.ACTION, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getAction", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataManagerPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DataManagerPayload> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName(LogConstants.Mpm.Interceptor.ACTION)
    private final String action;

    @SerializedName("msisdn")
    private final String msisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DataManagerPayload> {
        private static int component1 = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DataManagerPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            DataManagerPayload dataManagerPayload = new DataManagerPayload(parcel.readString(), parcel.readString());
            int i2 = component1 + 115;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return dataManagerPayload;
        }

        @Override
        public DataManagerPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 61;
            component1 = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                createFromParcel(parcel);
                obj.hashCode();
                throw null;
            }
            DataManagerPayload dataManagerPayloadCreateFromParcel = createFromParcel(parcel);
            int i3 = component2 + 81;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                return dataManagerPayloadCreateFromParcel;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DataManagerPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 33;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            DataManagerPayload[] dataManagerPayloadArr = new DataManagerPayload[i];
            int i6 = i3 + 103;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return dataManagerPayloadArr;
        }

        @Override
        public DataManagerPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 107;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            DataManagerPayload[] dataManagerPayloadArrNewArray = newArray(i);
            int i5 = component2 + 51;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return dataManagerPayloadArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public DataManagerPayload(String str, String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.msisdn = str;
        this.action = str2;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 89;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 39;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getAction() {
        int i = 2 % 2;
        int i2 = component2 + 33;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.action;
        int i5 = i3 + 103;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = copydefault + 11;
        component3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static DataManagerPayload copy$default(DataManagerPayload dataManagerPayload, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 125;
        int i4 = i3 % 128;
        component2 = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            str = dataManagerPayload.msisdn;
        }
        if ((i & 2) != 0) {
            int i5 = i4 + 67;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            str2 = dataManagerPayload.action;
        }
        return dataManagerPayload.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 73;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.msisdn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 111;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.action;
        int i5 = i2 + 95;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final DataManagerPayload copy(String msisdn, String action) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(action, "");
        DataManagerPayload dataManagerPayload = new DataManagerPayload(msisdn, action);
        int i2 = component2 + 21;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return dataManagerPayload;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 111;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 107;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1 + 87;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataManagerPayload)) {
            int i5 = i3 + 121;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        DataManagerPayload dataManagerPayload = (DataManagerPayload) other;
        if (!(!Intrinsics.areEqual(this.msisdn, dataManagerPayload.msisdn))) {
            if (Intrinsics.areEqual(this.action, dataManagerPayload.action)) {
                return true;
            }
            int i7 = component2 + 57;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = component2;
        int i10 = i9 + 27;
        component1 = i10 % 128;
        boolean z = i10 % 2 == 0;
        int i11 = i9 + 35;
        component1 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 68 / 0;
        }
        return z;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component1 + 109;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.msisdn;
        if (str == null) {
            int i5 = i3 + 7;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (iHashCode * 31) + this.action.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DataManagerPayload(msisdn=" + this.msisdn + ", action=" + this.action + ")";
        int i2 = component2 + 41;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 57;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            dest.writeString(this.msisdn);
            dest.writeString(this.action);
            int i4 = 81 / 0;
        } else {
            dest.writeString(this.msisdn);
            dest.writeString(this.action);
        }
        int i5 = component1 + 41;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }
}
