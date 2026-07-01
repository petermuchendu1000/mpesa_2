package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.country.sendtomobile;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceResponseHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0010H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/country/sendtomobile/SendToMobileCountryServiceResponse;", "Landroid/os/Parcelable;", "responseHeader", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceResponseHeader;", "body", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/country/sendtomobile/SendToMobileCountryBody;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceResponseHeader;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/country/sendtomobile/SendToMobileCountryBody;)V", "getResponseHeader", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceResponseHeader;", "getBody", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/country/sendtomobile/SendToMobileCountryBody;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SendToMobileCountryServiceResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SendToMobileCountryServiceResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int copydefault;

    @SerializedName("Body")
    private final SendToMobileCountryBody body;

    @SerializedName("ResponseHeader")
    private final ImtServiceResponseHeader responseHeader;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SendToMobileCountryServiceResponse> {
        private static int component1 = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SendToMobileCountryServiceResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            SendToMobileCountryServiceResponse sendToMobileCountryServiceResponse = new SendToMobileCountryServiceResponse(ImtServiceResponseHeader.CREATOR.createFromParcel(parcel), SendToMobileCountryBody.CREATOR.createFromParcel(parcel));
            int i2 = component1 + 11;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return sendToMobileCountryServiceResponse;
        }

        @Override
        public SendToMobileCountryServiceResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 83;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SendToMobileCountryServiceResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 81;
            int i4 = i3 % 128;
            component1 = i4;
            SendToMobileCountryServiceResponse[] sendToMobileCountryServiceResponseArr = new SendToMobileCountryServiceResponse[i];
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 1;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return sendToMobileCountryServiceResponseArr;
        }

        @Override
        public SendToMobileCountryServiceResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 107;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                newArray(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            SendToMobileCountryServiceResponse[] sendToMobileCountryServiceResponseArrNewArray = newArray(i);
            int i4 = component1 + 67;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return sendToMobileCountryServiceResponseArrNewArray;
        }
    }

    public SendToMobileCountryServiceResponse(ImtServiceResponseHeader imtServiceResponseHeader, SendToMobileCountryBody sendToMobileCountryBody) {
        Intrinsics.checkNotNullParameter(imtServiceResponseHeader, "");
        Intrinsics.checkNotNullParameter(sendToMobileCountryBody, "");
        this.responseHeader = imtServiceResponseHeader;
        this.body = sendToMobileCountryBody;
    }

    public final ImtServiceResponseHeader getResponseHeader() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 75;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        ImtServiceResponseHeader imtServiceResponseHeader = this.responseHeader;
        int i5 = i2 + 35;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return imtServiceResponseHeader;
    }

    public final SendToMobileCountryBody getBody() {
        SendToMobileCountryBody sendToMobileCountryBody;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 73;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            sendToMobileCountryBody = this.body;
            int i4 = 18 / 0;
        } else {
            sendToMobileCountryBody = this.body;
        }
        int i5 = i2 + 71;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return sendToMobileCountryBody;
    }

    static {
        int i = component1 + 13;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public static SendToMobileCountryServiceResponse copy$default(SendToMobileCountryServiceResponse sendToMobileCountryServiceResponse, ImtServiceResponseHeader imtServiceResponseHeader, SendToMobileCountryBody sendToMobileCountryBody, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            imtServiceResponseHeader = sendToMobileCountryServiceResponse.responseHeader;
            int i3 = copydefault + 11;
            component2 = i3 % 128;
            int i4 = i3 % 2;
        }
        if ((i & 2) != 0) {
            int i5 = component2 + 85;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            sendToMobileCountryBody = sendToMobileCountryServiceResponse.body;
        }
        return sendToMobileCountryServiceResponse.copy(imtServiceResponseHeader, sendToMobileCountryBody);
    }

    public final ImtServiceResponseHeader component1() {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.responseHeader;
        }
        throw null;
    }

    public final SendToMobileCountryBody component2() {
        SendToMobileCountryBody sendToMobileCountryBody;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 111;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            sendToMobileCountryBody = this.body;
            int i4 = 25 / 0;
        } else {
            sendToMobileCountryBody = this.body;
        }
        int i5 = i2 + 97;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return sendToMobileCountryBody;
    }

    public final SendToMobileCountryServiceResponse copy(ImtServiceResponseHeader responseHeader, SendToMobileCountryBody body) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(responseHeader, "");
        Intrinsics.checkNotNullParameter(body, "");
        SendToMobileCountryServiceResponse sendToMobileCountryServiceResponse = new SendToMobileCountryServiceResponse(responseHeader, body);
        int i2 = copydefault + 27;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return sendToMobileCountryServiceResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 21;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 79;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 5;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof SendToMobileCountryServiceResponse)) {
            int i4 = component2 + 107;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        SendToMobileCountryServiceResponse sendToMobileCountryServiceResponse = (SendToMobileCountryServiceResponse) other;
        if (!Intrinsics.areEqual(this.responseHeader, sendToMobileCountryServiceResponse.responseHeader)) {
            int i6 = component2 + 39;
            copydefault = i6 % 128;
            return i6 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.body, sendToMobileCountryServiceResponse.body)) {
            int i7 = copydefault + 65;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
        int i9 = component2 + 121;
        copydefault = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 79;
        copydefault = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (this.responseHeader.hashCode() >>> 109) >> this.body.hashCode() : (this.responseHeader.hashCode() * 31) + this.body.hashCode();
        int i3 = copydefault + 1;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SendToMobileCountryServiceResponse(responseHeader=" + this.responseHeader + ", body=" + this.body + ')';
        int i2 = component2 + 105;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            this.responseHeader.writeToParcel(dest, flags);
            this.body.writeToParcel(dest, flags);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.responseHeader.writeToParcel(dest, flags);
        this.body.writeToParcel(dest, flags);
        int i4 = component2 + 67;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
