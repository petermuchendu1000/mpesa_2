package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.country;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0014H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtomobile/country/SendToMobileHeader;", "Landroid/os/Parcelable;", "request_id", "", "response_code", "response_message", "customer_message", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRequest_id", "()Ljava/lang/String;", "getResponse_code", "getResponse_message", "getCustomer_message", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SendToMobileHeader implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SendToMobileHeader> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;
    private final String customer_message;
    private final String request_id;
    private final String response_code;
    private final String response_message;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SendToMobileHeader> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SendToMobileHeader createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            SendToMobileHeader sendToMobileHeader = new SendToMobileHeader(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = ShareDataUIState + 25;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return sendToMobileHeader;
        }

        @Override
        public SendToMobileHeader createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 7;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                createFromParcel(parcel);
                throw null;
            }
            SendToMobileHeader sendToMobileHeaderCreateFromParcel = createFromParcel(parcel);
            int i3 = ShareDataUIState + 7;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 61 / 0;
            }
            return sendToMobileHeaderCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SendToMobileHeader[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 101;
            ShareDataUIState = i3 % 128;
            SendToMobileHeader[] sendToMobileHeaderArr = new SendToMobileHeader[i];
            if (i3 % 2 != 0) {
                int i4 = 58 / 0;
            }
            return sendToMobileHeaderArr;
        }

        @Override
        public SendToMobileHeader[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 47;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            SendToMobileHeader[] sendToMobileHeaderArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 95;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return sendToMobileHeaderArrNewArray;
        }
    }

    public SendToMobileHeader(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.request_id = str;
        this.response_code = str2;
        this.response_message = str3;
        this.customer_message = str4;
    }

    public final String getRequest_id() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 49;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.request_id;
        int i5 = i2 + 3;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getResponse_code() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.response_code;
        int i4 = i3 + 81;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getResponse_message() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.response_message;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getCustomer_message() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 27;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.customer_message;
        int i5 = i2 + 61;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component1 + 33;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static SendToMobileHeader copy$default(SendToMobileHeader sendToMobileHeader, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = sendToMobileHeader.request_id;
        }
        if ((i & 2) != 0) {
            int i3 = component3 + 77;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                String str5 = sendToMobileHeader.response_code;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str2 = sendToMobileHeader.response_code;
        }
        if ((i & 4) != 0) {
            str3 = sendToMobileHeader.response_message;
        }
        if ((i & 8) != 0) {
            str4 = sendToMobileHeader.customer_message;
            int i4 = component2 + 121;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
        return sendToMobileHeader.copy(str, str2, str3, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 29;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.request_id;
        int i5 = i3 + 61;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 19 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 69;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.response_code;
        int i5 = i2 + 83;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 81;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.response_message;
        int i5 = i2 + 29;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 77;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.customer_message;
        int i4 = i3 + 105;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final SendToMobileHeader copy(String request_id, String response_code, String response_message, String customer_message) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(request_id, "");
        Intrinsics.checkNotNullParameter(response_code, "");
        Intrinsics.checkNotNullParameter(response_message, "");
        Intrinsics.checkNotNullParameter(customer_message, "");
        SendToMobileHeader sendToMobileHeader = new SendToMobileHeader(request_id, response_code, response_message, customer_message);
        int i2 = component2 + 119;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 80 / 0;
        }
        return sendToMobileHeader;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = (i2 % 2 == 0 ? 0 : 1) ^ 1;
        int i5 = i3 + 57;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3;
            int i3 = i2 + 11;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 23;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof SendToMobileHeader)) {
            int i7 = component2 + 87;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        SendToMobileHeader sendToMobileHeader = (SendToMobileHeader) other;
        if (!Intrinsics.areEqual(this.request_id, sendToMobileHeader.request_id)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.response_code, sendToMobileHeader.response_code)) {
            int i9 = component2 + 91;
            component3 = i9 % 128;
            return i9 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.response_message, sendToMobileHeader.response_message)) {
            int i10 = component2 + 87;
            component3 = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.customer_message, sendToMobileHeader.customer_message)) {
            return true;
        }
        int i12 = component2 + 13;
        component3 = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.request_id.hashCode();
        return i3 == 0 ? (((((iHashCode / 14) - this.response_code.hashCode()) * 113) / this.response_message.hashCode()) % 19) >> this.customer_message.hashCode() : (((((iHashCode * 31) + this.response_code.hashCode()) * 31) + this.response_message.hashCode()) * 31) + this.customer_message.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SendToMobileHeader(request_id=" + this.request_id + ", response_code=" + this.response_code + ", response_message=" + this.response_message + ", customer_message=" + this.customer_message + ')';
        int i2 = component3 + 111;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 7;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.request_id);
        dest.writeString(this.response_code);
        dest.writeString(this.response_message);
        dest.writeString(this.customer_message);
        int i4 = component3 + 99;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
