package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.country.sendtomobile;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/country/sendtomobile/SendToMobileCountryWrapper;", "Landroid/os/Parcelable;", "serviceResponse", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/country/sendtomobile/SendToMobileCountryServiceResponse;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/country/sendtomobile/SendToMobileCountryServiceResponse;)V", "getServiceResponse", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/country/sendtomobile/SendToMobileCountryServiceResponse;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SendToMobileCountryWrapper implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SendToMobileCountryWrapper> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int copydefault = 1;

    @SerializedName("ServiceResponse")
    private final SendToMobileCountryServiceResponse serviceResponse;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SendToMobileCountryWrapper> {
        private static int component3 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SendToMobileCountryWrapper createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            SendToMobileCountryWrapper sendToMobileCountryWrapper = new SendToMobileCountryWrapper(SendToMobileCountryServiceResponse.CREATOR.createFromParcel(parcel));
            int i2 = copydefault + 37;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return sendToMobileCountryWrapper;
        }

        @Override
        public SendToMobileCountryWrapper createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 45;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            SendToMobileCountryWrapper sendToMobileCountryWrapperCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 2 / 0;
            }
            int i5 = component3 + 59;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 9 / 0;
            }
            return sendToMobileCountryWrapperCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SendToMobileCountryWrapper[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 125;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            SendToMobileCountryWrapper[] sendToMobileCountryWrapperArr = new SendToMobileCountryWrapper[i];
            int i6 = i3 + 33;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 25 / 0;
            }
            return sendToMobileCountryWrapperArr;
        }

        @Override
        public SendToMobileCountryWrapper[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 99;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public SendToMobileCountryWrapper(SendToMobileCountryServiceResponse sendToMobileCountryServiceResponse) {
        Intrinsics.checkNotNullParameter(sendToMobileCountryServiceResponse, "");
        this.serviceResponse = sendToMobileCountryServiceResponse;
    }

    public final SendToMobileCountryServiceResponse getServiceResponse() {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        SendToMobileCountryServiceResponse sendToMobileCountryServiceResponse = this.serviceResponse;
        int i5 = i3 + 113;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return sendToMobileCountryServiceResponse;
    }

    static {
        int i = component1 + 63;
        component2 = i % 128;
        if (i % 2 != 0) {
            int i2 = 12 / 0;
        }
    }

    public static SendToMobileCountryWrapper copy$default(SendToMobileCountryWrapper sendToMobileCountryWrapper, SendToMobileCountryServiceResponse sendToMobileCountryServiceResponse, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 15;
        ShareDataUIState = i3 % 128;
        int i4 = i & 1;
        if (i3 % 2 == 0 ? i4 != 0 : i4 != 0) {
            sendToMobileCountryServiceResponse = sendToMobileCountryWrapper.serviceResponse;
        }
        SendToMobileCountryWrapper sendToMobileCountryWrapperCopy = sendToMobileCountryWrapper.copy(sendToMobileCountryServiceResponse);
        int i5 = ShareDataUIState + 27;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return sendToMobileCountryWrapperCopy;
        }
        throw null;
    }

    public final SendToMobileCountryServiceResponse component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        SendToMobileCountryServiceResponse sendToMobileCountryServiceResponse = this.serviceResponse;
        int i4 = i3 + 123;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return sendToMobileCountryServiceResponse;
        }
        throw null;
    }

    public final SendToMobileCountryWrapper copy(SendToMobileCountryServiceResponse serviceResponse) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(serviceResponse, "");
        SendToMobileCountryWrapper sendToMobileCountryWrapper = new SendToMobileCountryWrapper(serviceResponse);
        int i2 = ShareDataUIState + 61;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return sendToMobileCountryWrapper;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 9;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendToMobileCountryWrapper) || !Intrinsics.areEqual(this.serviceResponse, ((SendToMobileCountryWrapper) other).serviceResponse)) {
            return false;
        }
        int i3 = ShareDataUIState + 97;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            this.serviceResponse.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.serviceResponse.hashCode();
        int i3 = ShareDataUIState + 47;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SendToMobileCountryWrapper(serviceResponse=" + this.serviceResponse + ')';
        int i2 = ShareDataUIState + 57;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 34 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        this.serviceResponse.writeToParcel(dest, flags);
        int i4 = copydefault + 63;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
