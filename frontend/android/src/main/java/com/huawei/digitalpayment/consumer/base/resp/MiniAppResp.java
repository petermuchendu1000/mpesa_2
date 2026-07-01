package com.huawei.digitalpayment.consumer.base.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/MiniAppResp;", "Landroid/os/Parcelable;", "globalStatus", "", "requestId", "servicesResponse", "Lcom/huawei/digitalpayment/consumer/base/resp/ServicesResponse;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/base/resp/ServicesResponse;)V", "getGlobalStatus", "()Ljava/lang/String;", "getRequestId", "getServicesResponse", "()Lcom/huawei/digitalpayment/consumer/base/resp/ServicesResponse;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiniAppResp implements Parcelable {
    public static final Parcelable.Creator<MiniAppResp> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("globalStatus")
    private final String globalStatus;

    @SerializedName("requestId")
    private final String requestId;

    @SerializedName("servicesResponse")
    private final ServicesResponse servicesResponse;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MiniAppResp> {
        private static int component3 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final MiniAppResp createFromParcel(Parcel parcel) {
            ServicesResponse servicesResponseCreateFromParcel;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i2 = copydefault + 75;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                servicesResponseCreateFromParcel = null;
            } else {
                servicesResponseCreateFromParcel = ServicesResponse.CREATOR.createFromParcel(parcel);
                int i4 = copydefault + 37;
                component3 = i4 % 128;
                int i5 = i4 % 2;
            }
            return new MiniAppResp(string, string2, servicesResponseCreateFromParcel);
        }

        @Override
        public MiniAppResp createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 33;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            MiniAppResp miniAppRespCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 85;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return miniAppRespCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final MiniAppResp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault;
            int i4 = i3 + 81;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            MiniAppResp[] miniAppRespArr = new MiniAppResp[i];
            int i6 = i3 + 121;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return miniAppRespArr;
        }

        @Override
        public MiniAppResp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 89;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            throw null;
        }
    }

    public MiniAppResp(String str, String str2, ServicesResponse servicesResponse) {
        this.globalStatus = str;
        this.requestId = str2;
        this.servicesResponse = servicesResponse;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MiniAppResp(String str, String str2, ServicesResponse servicesResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        str = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            int i2 = component3 + 77;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str2 = null;
        }
        if ((i & 4) != 0) {
            int i5 = component1 + 65;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            servicesResponse = null;
        }
        this(str, str2, servicesResponse);
    }

    public final String getGlobalStatus() {
        int i = 2 % 2;
        int i2 = component3 + 55;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.globalStatus;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getRequestId() {
        int i = 2 % 2;
        int i2 = component3 + 105;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.requestId;
        int i5 = i3 + 39;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
        return str;
    }

    public final ServicesResponse getServicesResponse() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 99;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        ServicesResponse servicesResponse = this.servicesResponse;
        int i5 = i2 + 37;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 34 / 0;
        }
        return servicesResponse;
    }

    static {
        int i = copydefault + 99;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public MiniAppResp() {
        this(null, null, null, 7, null);
    }

    public static MiniAppResp copy$default(MiniAppResp miniAppResp, String str, String str2, ServicesResponse servicesResponse, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3 + 89;
        int i4 = i3 % 128;
        component1 = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            str = miniAppResp.globalStatus;
        }
        if ((i & 2) != 0) {
            str2 = miniAppResp.requestId;
        }
        if ((i & 4) != 0) {
            int i5 = i4 + 11;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            servicesResponse = miniAppResp.servicesResponse;
        }
        return miniAppResp.copy(str, str2, servicesResponse);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 23;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.globalStatus;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 91;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.requestId;
        int i5 = i3 + 69;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final ServicesResponse component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 125;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        ServicesResponse servicesResponse = this.servicesResponse;
        int i5 = i2 + 59;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return servicesResponse;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final MiniAppResp copy(String globalStatus, String requestId, ServicesResponse servicesResponse) {
        int i = 2 % 2;
        MiniAppResp miniAppResp = new MiniAppResp(globalStatus, requestId, servicesResponse);
        int i2 = component1 + 107;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return miniAppResp;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 1;
        component3 = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 87;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof MiniAppResp)) {
            return false;
        }
        MiniAppResp miniAppResp = (MiniAppResp) other;
        if (!Intrinsics.areEqual(this.globalStatus, miniAppResp.globalStatus)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.requestId, miniAppResp.requestId)) {
            int i4 = component1 + 11;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.servicesResponse, miniAppResp.servicesResponse)) {
            return true;
        }
        int i6 = component3 + 13;
        component1 = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        String str = this.globalStatus;
        if (str == null) {
            int i3 = component1 + 13;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.requestId;
        if (str2 == null) {
            int i5 = component3 + 29;
            component1 = i5 % 128;
            i = i5 % 2 != 0 ? 1 : 0;
        } else {
            int iHashCode2 = str2.hashCode();
            int i6 = component3 + 75;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 3;
            }
            i = iHashCode2;
        }
        ServicesResponse servicesResponse = this.servicesResponse;
        return (((iHashCode * 31) + i) * 31) + (servicesResponse != null ? servicesResponse.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MiniAppResp(globalStatus=" + this.globalStatus + ", requestId=" + this.requestId + ", servicesResponse=" + this.servicesResponse + ")";
        int i2 = component1 + 63;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 79;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            dest.writeString(this.globalStatus);
            dest.writeString(this.requestId);
            throw null;
        }
        dest.writeString(this.globalStatus);
        dest.writeString(this.requestId);
        ServicesResponse servicesResponse = this.servicesResponse;
        if (servicesResponse != null) {
            dest.writeInt(1);
            servicesResponse.writeToParcel(dest, flags);
            return;
        }
        dest.writeInt(0);
        int i4 = component3 + 97;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 3;
        }
    }
}
