package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0014H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtomobile/model/SendToMobileGetFeeHeader;", "Landroid/os/Parcelable;", "requestId", "", "responseCode", "responseMessage", Keys.KEY_CUSTOMER_MESSAGE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRequestId", "()Ljava/lang/String;", "getResponseCode", "getResponseMessage", "getCustomerMessage", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SendToMobileGetFeeHeader implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SendToMobileGetFeeHeader> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("customer_message")
    private final String customerMessage;

    @SerializedName("request_id")
    private final String requestId;

    @SerializedName("response_code")
    private final String responseCode;

    @SerializedName("response_message")
    private final String responseMessage;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SendToMobileGetFeeHeader> {
        private static int ShareDataUIState = 1;
        private static int component1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SendToMobileGetFeeHeader createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            SendToMobileGetFeeHeader sendToMobileGetFeeHeader = new SendToMobileGetFeeHeader(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component1 + 51;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 55 / 0;
            }
            return sendToMobileGetFeeHeader;
        }

        @Override
        public SendToMobileGetFeeHeader createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 99;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            SendToMobileGetFeeHeader sendToMobileGetFeeHeaderCreateFromParcel = createFromParcel(parcel);
            if (i3 != 0) {
                int i4 = 21 / 0;
            }
            return sendToMobileGetFeeHeaderCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SendToMobileGetFeeHeader[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 69;
            component1 = i3 % 128;
            SendToMobileGetFeeHeader[] sendToMobileGetFeeHeaderArr = new SendToMobileGetFeeHeader[i];
            if (i3 % 2 == 0) {
                return sendToMobileGetFeeHeaderArr;
            }
            throw null;
        }

        @Override
        public SendToMobileGetFeeHeader[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 27;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            SendToMobileGetFeeHeader[] sendToMobileGetFeeHeaderArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 20 / 0;
            }
            int i6 = ShareDataUIState + 97;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return sendToMobileGetFeeHeaderArrNewArray;
        }
    }

    public SendToMobileGetFeeHeader(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.requestId = str;
        this.responseCode = str2;
        this.responseMessage = str3;
        this.customerMessage = str4;
    }

    public final String getRequestId() {
        int i = 2 % 2;
        int i2 = component1 + 75;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.requestId;
        }
        throw null;
    }

    public final String getResponseCode() {
        int i = 2 % 2;
        int i2 = component2 + 17;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.responseCode;
        int i5 = i3 + 1;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getResponseMessage() {
        int i = 2 % 2;
        int i2 = component2 + 51;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.responseMessage;
        int i5 = i3 + 31;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCustomerMessage() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 79;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.customerMessage;
            int i4 = 30 / 0;
        } else {
            str = this.customerMessage;
        }
        int i5 = i2 + 83;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 9 / 0;
        }
        return str;
    }

    static {
        int i = component3 + 27;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static SendToMobileGetFeeHeader copy$default(SendToMobileGetFeeHeader sendToMobileGetFeeHeader, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2 + 103;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = sendToMobileGetFeeHeader.requestId;
        }
        if ((i & 2) != 0) {
            str2 = sendToMobileGetFeeHeader.responseCode;
        }
        if ((i & 4) != 0) {
            str3 = sendToMobileGetFeeHeader.responseMessage;
        }
        if ((i & 8) != 0) {
            int i6 = i4 + 57;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            str4 = sendToMobileGetFeeHeader.customerMessage;
        }
        return sendToMobileGetFeeHeader.copy(str, str2, str3, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 91;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.requestId;
        int i4 = i3 + 115;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 79;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.responseCode;
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 5;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.responseMessage;
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 61;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.customerMessage;
        int i5 = i2 + 89;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 29 / 0;
        }
        return str;
    }

    public final SendToMobileGetFeeHeader copy(String requestId, String responseCode, String responseMessage, String customerMessage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(requestId, "");
        Intrinsics.checkNotNullParameter(responseCode, "");
        Intrinsics.checkNotNullParameter(responseMessage, "");
        Intrinsics.checkNotNullParameter(customerMessage, "");
        SendToMobileGetFeeHeader sendToMobileGetFeeHeader = new SendToMobileGetFeeHeader(requestId, responseCode, responseMessage, customerMessage);
        int i2 = component1 + 57;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return sendToMobileGetFeeHeader;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 13;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 73;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendToMobileGetFeeHeader)) {
            return false;
        }
        SendToMobileGetFeeHeader sendToMobileGetFeeHeader = (SendToMobileGetFeeHeader) other;
        if (Intrinsics.areEqual(this.requestId, sendToMobileGetFeeHeader.requestId) && Intrinsics.areEqual(this.responseCode, sendToMobileGetFeeHeader.responseCode)) {
            if (!(!Intrinsics.areEqual(this.responseMessage, sendToMobileGetFeeHeader.responseMessage))) {
                if (!Intrinsics.areEqual(this.customerMessage, sendToMobileGetFeeHeader.customerMessage)) {
                    return false;
                }
                int i2 = component2 + 79;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    return true;
                }
                throw null;
            }
            int i3 = component2 + 73;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 35;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.requestId.hashCode() * 31) + this.responseCode.hashCode()) * 31) + this.responseMessage.hashCode()) * 31) + this.customerMessage.hashCode();
        int i4 = component1 + 65;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SendToMobileGetFeeHeader(requestId=" + this.requestId + ", responseCode=" + this.responseCode + ", responseMessage=" + this.responseMessage + ", customerMessage=" + this.customerMessage + ')';
        int i2 = component2 + 89;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 77 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 89;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.requestId);
        dest.writeString(this.responseCode);
        dest.writeString(this.responseMessage);
        dest.writeString(this.customerMessage);
        int i4 = component1 + 121;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }
}
