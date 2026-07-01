package com.huawei.digitalpayment.consumer.fixeddata.data.model.manageAccount;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/manageAccount/RestartRouterPayload;", "Landroid/os/Parcelable;", "msisdn", "", "ci", "serialNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getCi", "getSerialNumber", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RestartRouterPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<RestartRouterPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("ci")
    private final String ci;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("serialNumber")
    private final String serialNumber;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RestartRouterPayload> {
        private static int ShareDataUIState = 1;
        private static int component1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RestartRouterPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            RestartRouterPayload restartRouterPayload = new RestartRouterPayload(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component1 + 59;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 44 / 0;
            }
            return restartRouterPayload;
        }

        @Override
        public RestartRouterPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 97;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            RestartRouterPayload restartRouterPayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 81;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 93 / 0;
            }
            return restartRouterPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RestartRouterPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 39;
            ShareDataUIState = i4 % 128;
            RestartRouterPayload[] restartRouterPayloadArr = new RestartRouterPayload[i];
            if (i4 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 71;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return restartRouterPayloadArr;
        }

        @Override
        public RestartRouterPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 61;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            RestartRouterPayload[] restartRouterPayloadArrNewArray = newArray(i);
            int i5 = component1 + 25;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 92 / 0;
            }
            return restartRouterPayloadArrNewArray;
        }
    }

    public RestartRouterPayload(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.msisdn = str;
        this.ci = str2;
        this.serialNumber = str3;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component3 + 117;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.msisdn;
        int i5 = i3 + 9;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCi() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 11;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            str = this.ci;
            int i4 = 2 / 0;
        } else {
            str = this.ci;
        }
        int i5 = i3 + 83;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
        return str;
    }

    public final String getSerialNumber() {
        int i = 2 % 2;
        int i2 = component2 + 61;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.serialNumber;
        int i4 = i3 + 119;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        int i = copydefault + 71;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public static RestartRouterPayload copy$default(RestartRouterPayload restartRouterPayload, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3 + 11;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = restartRouterPayload.msisdn;
            int i6 = i4 + 97;
            component3 = i6 % 128;
            int i7 = i6 % 2;
        }
        if ((i & 2) != 0) {
            str2 = restartRouterPayload.ci;
        }
        if ((i & 4) != 0) {
            str3 = restartRouterPayload.serialNumber;
        }
        return restartRouterPayload.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 71;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.msisdn;
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 65;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.ci;
        int i5 = i3 + 89;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 95;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.serialNumber;
        }
        throw null;
    }

    public final RestartRouterPayload copy(String msisdn, String ci, String serialNumber) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(ci, "");
        Intrinsics.checkNotNullParameter(serialNumber, "");
        RestartRouterPayload restartRouterPayload = new RestartRouterPayload(msisdn, ci, serialNumber);
        int i2 = component2 + 107;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return restartRouterPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 85;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 45;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestartRouterPayload)) {
            return false;
        }
        RestartRouterPayload restartRouterPayload = (RestartRouterPayload) other;
        if (!Intrinsics.areEqual(this.msisdn, restartRouterPayload.msisdn)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.ci, restartRouterPayload.ci)) {
            int i2 = component2 + 57;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.serialNumber, restartRouterPayload.serialNumber)) {
            return true;
        }
        int i4 = component2 + 45;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 17;
        component2 = i2 % 128;
        return i2 % 2 != 0 ? (((r0 >>> 26) >> this.ci.hashCode()) - 33) / this.serialNumber.hashCode() : (((this.msisdn.hashCode() * 31) + this.ci.hashCode()) * 31) + this.serialNumber.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RestartRouterPayload(msisdn=" + this.msisdn + ", ci=" + this.ci + ", serialNumber=" + this.serialNumber + ")";
        int i2 = component3 + 19;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 121;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.msisdn);
        dest.writeString(this.ci);
        dest.writeString(this.serialNumber);
        int i4 = component2 + 95;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }
}
