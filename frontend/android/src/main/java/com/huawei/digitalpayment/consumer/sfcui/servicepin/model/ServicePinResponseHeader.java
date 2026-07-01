package com.huawei.digitalpayment.consumer.sfcui.servicepin.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0018\u001a\u00020\u0005H\u0007J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH×\u0003J\t\u0010\u001d\u001a\u00020\u0005H×\u0001J\t\u0010\u001e\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0005H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006$"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/model/ServicePinResponseHeader;", "Landroid/os/Parcelable;", "requestRefId", "", "responseCode", "", "responseMessage", Keys.KEY_CUSTOMER_MESSAGE, "timestamp", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRequestRefId", "()Ljava/lang/String;", "getResponseCode", "()I", "getResponseMessage", "getCustomerMessage", "getTimestamp", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ServicePinResponseHeader implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ServicePinResponseHeader> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName(Keys.KEY_CUSTOMER_MESSAGE)
    private final String customerMessage;

    @SerializedName("requestRefId")
    private final String requestRefId;

    @SerializedName("responseCode")
    private final int responseCode;

    @SerializedName("responseMessage")
    private final String responseMessage;

    @SerializedName("timestamp")
    private final String timestamp;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ServicePinResponseHeader> {
        private static int component3 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ServicePinResponseHeader createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ServicePinResponseHeader servicePinResponseHeader = new ServicePinResponseHeader(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component3 + 97;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return servicePinResponseHeader;
        }

        @Override
        public ServicePinResponseHeader createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 65;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ServicePinResponseHeader[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 113;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            ServicePinResponseHeader[] servicePinResponseHeaderArr = new ServicePinResponseHeader[i];
            int i6 = i4 + 109;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                return servicePinResponseHeaderArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public ServicePinResponseHeader[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 25;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                newArray(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ServicePinResponseHeader[] servicePinResponseHeaderArrNewArray = newArray(i);
            int i4 = copydefault + 89;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return servicePinResponseHeaderArrNewArray;
        }
    }

    public ServicePinResponseHeader(String str, int i, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.requestRefId = str;
        this.responseCode = i;
        this.responseMessage = str2;
        this.customerMessage = str3;
        this.timestamp = str4;
    }

    public final String getRequestRefId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.requestRefId;
        if (i3 == 0) {
            int i4 = 93 / 0;
        }
        return str;
    }

    public final int getResponseCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = component3 + 7;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        if (i3 % 2 != 0) {
            i = this.responseCode;
            int i5 = 56 / 0;
        } else {
            i = this.responseCode;
        }
        int i6 = i4 + 115;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getResponseMessage() {
        int i = 2 % 2;
        int i2 = component3 + 25;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.responseMessage;
        int i4 = i3 + 63;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getCustomerMessage() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 5;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.customerMessage;
        int i5 = i2 + 21;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 38 / 0;
        }
        return str;
    }

    public final String getTimestamp() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 5;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.timestamp;
        int i5 = i2 + 43;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = copydefault + 43;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static ServicePinResponseHeader copy$default(ServicePinResponseHeader servicePinResponseHeader, String str, int i, String str2, String str3, String str4, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            str = servicePinResponseHeader.requestRefId;
        }
        String str5 = str;
        if ((i2 & 2) != 0) {
            i = servicePinResponseHeader.responseCode;
        }
        int i4 = i;
        if ((i2 & 4) != 0) {
            int i5 = component3 + 7;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                String str6 = servicePinResponseHeader.responseMessage;
                throw null;
            }
            str2 = servicePinResponseHeader.responseMessage;
        }
        String str7 = str2;
        if ((i2 & 8) != 0) {
            str3 = servicePinResponseHeader.customerMessage;
        }
        String str8 = str3;
        if ((i2 & 16) != 0) {
            int i6 = ShareDataUIState + 63;
            int i7 = i6 % 128;
            component3 = i7;
            int i8 = i6 % 2;
            str4 = servicePinResponseHeader.timestamp;
            int i9 = i7 + 87;
            ShareDataUIState = i9 % 128;
            int i10 = i9 % 2;
        }
        return servicePinResponseHeader.copy(str5, i4, str7, str8, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.requestRefId;
        int i4 = i3 + 51;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 117;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.responseCode;
        int i6 = i2 + 39;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.responseMessage;
        int i5 = i3 + 73;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 42 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 85;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.customerMessage;
        int i5 = i2 + 43;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 61;
        ShareDataUIState = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.timestamp;
        int i4 = i2 + 25;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final ServicePinResponseHeader copy(String requestRefId, int responseCode, String responseMessage, String customerMessage, String timestamp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(requestRefId, "");
        Intrinsics.checkNotNullParameter(responseMessage, "");
        Intrinsics.checkNotNullParameter(customerMessage, "");
        Intrinsics.checkNotNullParameter(timestamp, "");
        ServicePinResponseHeader servicePinResponseHeader = new ServicePinResponseHeader(requestRefId, responseCode, responseMessage, customerMessage, timestamp);
        int i2 = ShareDataUIState + 43;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return servicePinResponseHeader;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 15;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 5;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 77;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof ServicePinResponseHeader)) {
            int i4 = component3 + 119;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        ServicePinResponseHeader servicePinResponseHeader = (ServicePinResponseHeader) other;
        if (!Intrinsics.areEqual(this.requestRefId, servicePinResponseHeader.requestRefId)) {
            int i6 = ShareDataUIState + 57;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.responseCode != servicePinResponseHeader.responseCode || (!Intrinsics.areEqual(this.responseMessage, servicePinResponseHeader.responseMessage))) {
            return false;
        }
        if (Intrinsics.areEqual(this.customerMessage, servicePinResponseHeader.customerMessage)) {
            return Intrinsics.areEqual(this.timestamp, servicePinResponseHeader.timestamp);
        }
        int i8 = component3 + 121;
        ShareDataUIState = i8 % 128;
        if (i8 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.requestRefId.hashCode() * 31) + Integer.hashCode(this.responseCode)) * 31) + this.responseMessage.hashCode()) * 31) + this.customerMessage.hashCode()) * 31) + this.timestamp.hashCode();
        int i4 = component3 + 43;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ServicePinResponseHeader(requestRefId=" + this.requestRefId + ", responseCode=" + this.responseCode + ", responseMessage=" + this.responseMessage + ", customerMessage=" + this.customerMessage + ", timestamp=" + this.timestamp + ")";
        int i2 = ShareDataUIState + 55;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 123;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            dest.writeString(this.requestRefId);
            dest.writeInt(this.responseCode);
            dest.writeString(this.responseMessage);
            dest.writeString(this.customerMessage);
            dest.writeString(this.timestamp);
            int i4 = 55 / 0;
        } else {
            dest.writeString(this.requestRefId);
            dest.writeInt(this.responseCode);
            dest.writeString(this.responseMessage);
            dest.writeString(this.customerMessage);
            dest.writeString(this.timestamp);
        }
        int i5 = component3 + 25;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
