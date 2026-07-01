package com.huawei.digitalpayment.consumer.fixeddata.data.model.userDetails;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/userDetails/FibreUserDetailsPayload;", "Landroid/os/Parcelable;", "msisdn", "", "<init>", "(Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FibreUserDetailsPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FibreUserDetailsPayload> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("msisdn")
    private final String msisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FibreUserDetailsPayload> {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibreUserDetailsPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            FibreUserDetailsPayload fibreUserDetailsPayload = new FibreUserDetailsPayload(parcel.readString());
            int i2 = ShareDataUIState + 69;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return fibreUserDetailsPayload;
        }

        @Override
        public FibreUserDetailsPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 41;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            FibreUserDetailsPayload fibreUserDetailsPayloadCreateFromParcel = createFromParcel(parcel);
            if (i3 != 0) {
                int i4 = 98 / 0;
            }
            return fibreUserDetailsPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibreUserDetailsPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 47;
            ShareDataUIState = i3 % 128;
            FibreUserDetailsPayload[] fibreUserDetailsPayloadArr = new FibreUserDetailsPayload[i];
            if (i3 % 2 == 0) {
                int i4 = 40 / 0;
            }
            return fibreUserDetailsPayloadArr;
        }

        @Override
        public FibreUserDetailsPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 61;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            FibreUserDetailsPayload[] fibreUserDetailsPayloadArrNewArray = newArray(i);
            int i5 = copydefault + 91;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return fibreUserDetailsPayloadArrNewArray;
        }
    }

    public FibreUserDetailsPayload(String str) {
        this.msisdn = str;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component3 + 35;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.msisdn;
        if (i3 == 0) {
            int i4 = 54 / 0;
        }
        return str;
    }

    static {
        int i = component2 + 41;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FibreUserDetailsPayload copy$default(FibreUserDetailsPayload fibreUserDetailsPayload, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3 + 61;
        component1 = i3 % 128;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            str = fibreUserDetailsPayload.msisdn;
        }
        FibreUserDetailsPayload fibreUserDetailsPayloadCopy = fibreUserDetailsPayload.copy(str);
        int i4 = component1 + 57;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return fibreUserDetailsPayloadCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 11;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.msisdn;
        int i4 = i3 + 35;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final FibreUserDetailsPayload copy(String msisdn) {
        int i = 2 % 2;
        FibreUserDetailsPayload fibreUserDetailsPayload = new FibreUserDetailsPayload(msisdn);
        int i2 = component1 + 105;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return fibreUserDetailsPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 7;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 49;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 117;
            component3 = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(other instanceof FibreUserDetailsPayload)) {
            return false;
        }
        if (Intrinsics.areEqual(this.msisdn, ((FibreUserDetailsPayload) other).msisdn)) {
            return true;
        }
        int i3 = component3 + 49;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 84 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 21;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.msisdn;
        if (str != null) {
            return str.hashCode();
        }
        int i5 = i3 + 53;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FibreUserDetailsPayload(msisdn=" + this.msisdn + ")";
        int i2 = component3 + 21;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 121;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.msisdn);
        int i4 = component1 + 85;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
        }
    }
}
