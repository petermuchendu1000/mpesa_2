package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.common.interceptor.AppLogInterceptor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H×\u0003J\t\u0010\u001a\u001a\u00020\u0015H×\u0001J\t\u0010\u001b\u001a\u00020\u0007H×\u0001J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtomobile/model/SendToMobileGetFeeResponse;", "Landroid/os/Parcelable;", "header", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtomobile/model/SendToMobileGetFeeHeader;", "body", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtomobile/model/SendToMobileGetFeeBody;", AppLogInterceptor.MESSAGE_ID, "", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtomobile/model/SendToMobileGetFeeHeader;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtomobile/model/SendToMobileGetFeeBody;Ljava/lang/String;)V", "getHeader", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtomobile/model/SendToMobileGetFeeHeader;", "getBody", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtomobile/model/SendToMobileGetFeeBody;", "getMessageId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SendToMobileGetFeeResponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SendToMobileGetFeeResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;

    @SerializedName("body")
    private final SendToMobileGetFeeBody body;

    @SerializedName("header")
    private final SendToMobileGetFeeHeader header;

    @SerializedName(AppLogInterceptor.MESSAGE_ID)
    private final String messageId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SendToMobileGetFeeResponse> {
        private static int component1 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SendToMobileGetFeeResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            SendToMobileGetFeeResponse sendToMobileGetFeeResponse = new SendToMobileGetFeeResponse(SendToMobileGetFeeHeader.CREATOR.createFromParcel(parcel), SendToMobileGetFeeBody.CREATOR.createFromParcel(parcel), parcel.readString());
            int i2 = component3 + 17;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 88 / 0;
            }
            return sendToMobileGetFeeResponse;
        }

        @Override
        public SendToMobileGetFeeResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 7;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SendToMobileGetFeeResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 23;
            component3 = i3 % 128;
            SendToMobileGetFeeResponse[] sendToMobileGetFeeResponseArr = new SendToMobileGetFeeResponse[i];
            if (i3 % 2 == 0) {
                return sendToMobileGetFeeResponseArr;
            }
            throw null;
        }

        @Override
        public SendToMobileGetFeeResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 79;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            SendToMobileGetFeeResponse[] sendToMobileGetFeeResponseArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 37 / 0;
            }
            int i6 = component1 + 3;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 90 / 0;
            }
            return sendToMobileGetFeeResponseArrNewArray;
        }
    }

    public SendToMobileGetFeeResponse(SendToMobileGetFeeHeader sendToMobileGetFeeHeader, SendToMobileGetFeeBody sendToMobileGetFeeBody, String str) {
        Intrinsics.checkNotNullParameter(sendToMobileGetFeeHeader, "");
        Intrinsics.checkNotNullParameter(sendToMobileGetFeeBody, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.header = sendToMobileGetFeeHeader;
        this.body = sendToMobileGetFeeBody;
        this.messageId = str;
    }

    public final SendToMobileGetFeeHeader getHeader() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        SendToMobileGetFeeHeader sendToMobileGetFeeHeader = this.header;
        int i5 = i3 + 49;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return sendToMobileGetFeeHeader;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SendToMobileGetFeeBody getBody() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        SendToMobileGetFeeBody sendToMobileGetFeeBody = this.body;
        int i5 = i3 + 103;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return sendToMobileGetFeeBody;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMessageId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.messageId;
        }
        throw null;
    }

    static {
        int i = component1 + 1;
        component2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static SendToMobileGetFeeResponse copy$default(SendToMobileGetFeeResponse sendToMobileGetFeeResponse, SendToMobileGetFeeHeader sendToMobileGetFeeHeader, SendToMobileGetFeeBody sendToMobileGetFeeBody, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 119;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                SendToMobileGetFeeHeader sendToMobileGetFeeHeader2 = sendToMobileGetFeeResponse.header;
                throw null;
            }
            sendToMobileGetFeeHeader = sendToMobileGetFeeResponse.header;
        }
        if ((i & 2) != 0) {
            int i4 = ShareDataUIState + 95;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                SendToMobileGetFeeBody sendToMobileGetFeeBody2 = sendToMobileGetFeeResponse.body;
                throw null;
            }
            sendToMobileGetFeeBody = sendToMobileGetFeeResponse.body;
        }
        if ((i & 4) != 0) {
            int i5 = ShareDataUIState + 47;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                str = sendToMobileGetFeeResponse.messageId;
                int i6 = 17 / 0;
            } else {
                str = sendToMobileGetFeeResponse.messageId;
            }
        }
        return sendToMobileGetFeeResponse.copy(sendToMobileGetFeeHeader, sendToMobileGetFeeBody, str);
    }

    public final SendToMobileGetFeeHeader component1() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.header;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SendToMobileGetFeeBody component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 59;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        SendToMobileGetFeeBody sendToMobileGetFeeBody = this.body;
        int i5 = i2 + 109;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return sendToMobileGetFeeBody;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.messageId;
        }
        throw null;
    }

    public final SendToMobileGetFeeResponse copy(SendToMobileGetFeeHeader header, SendToMobileGetFeeBody body, String messageId) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(header, "");
        Intrinsics.checkNotNullParameter(body, "");
        Intrinsics.checkNotNullParameter(messageId, "");
        SendToMobileGetFeeResponse sendToMobileGetFeeResponse = new SendToMobileGetFeeResponse(header, body, messageId);
        int i2 = ShareDataUIState + 97;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 64 / 0;
        }
        return sendToMobileGetFeeResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 121;
        ShareDataUIState = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendToMobileGetFeeResponse)) {
            int i2 = ShareDataUIState + 41;
            component3 = i2 % 128;
            return i2 % 2 == 0;
        }
        SendToMobileGetFeeResponse sendToMobileGetFeeResponse = (SendToMobileGetFeeResponse) other;
        if (!Intrinsics.areEqual(this.header, sendToMobileGetFeeResponse.header) || !Intrinsics.areEqual(this.body, sendToMobileGetFeeResponse.body)) {
            return false;
        }
        if (Intrinsics.areEqual(this.messageId, sendToMobileGetFeeResponse.messageId)) {
            return true;
        }
        int i3 = ShareDataUIState + 37;
        component3 = i3 % 128;
        return i3 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 27;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.header.hashCode() * 31) + this.body.hashCode()) * 31) + this.messageId.hashCode();
        int i4 = ShareDataUIState + 85;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SendToMobileGetFeeResponse(header=" + this.header + ", body=" + this.body + ", messageId=" + this.messageId + ')';
        int i2 = component3 + 107;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 70 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 7;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        this.header.writeToParcel(dest, flags);
        this.body.writeToParcel(dest, flags);
        dest.writeString(this.messageId);
        int i4 = component3 + 65;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
