package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.country;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.common.interceptor.AppLogInterceptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001J\b\u0010\u0015\u001a\u00020\u0016H\u0007J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH×\u0003J\t\u0010\u001b\u001a\u00020\u0016H×\u0001J\t\u0010\u001c\u001a\u00020\bH×\u0001J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtomobile/country/SendToMobileCountriesResponse;", "Landroid/os/Parcelable;", "header", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtomobile/country/SendToMobileHeader;", "body", "", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtomobile/country/SendToMobileCountry;", AppLogInterceptor.MESSAGE_ID, "", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtomobile/country/SendToMobileHeader;Ljava/util/List;Ljava/lang/String;)V", "getHeader", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtomobile/country/SendToMobileHeader;", "getBody", "()Ljava/util/List;", "getMessageId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SendToMobileCountriesResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SendToMobileCountriesResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault;
    private final List<SendToMobileCountry> body;
    private final SendToMobileHeader header;
    private final String messageId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SendToMobileCountriesResponse> {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SendToMobileCountriesResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            SendToMobileHeader sendToMobileHeaderCreateFromParcel = SendToMobileHeader.CREATOR.createFromParcel(parcel);
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = ShareDataUIState + 79;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (i5 != i2) {
                int i6 = ShareDataUIState + 97;
                copydefault = i6 % 128;
                if (i6 % 2 != 0) {
                    arrayList.add(SendToMobileCountry.CREATOR.createFromParcel(parcel));
                    i5 += 61;
                } else {
                    arrayList.add(SendToMobileCountry.CREATOR.createFromParcel(parcel));
                    i5++;
                }
            }
            return new SendToMobileCountriesResponse(sendToMobileHeaderCreateFromParcel, arrayList, parcel.readString());
        }

        @Override
        public SendToMobileCountriesResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 29;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            SendToMobileCountriesResponse sendToMobileCountriesResponseCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 81;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 31 / 0;
            }
            return sendToMobileCountriesResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SendToMobileCountriesResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault;
            int i4 = i3 + 5;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            SendToMobileCountriesResponse[] sendToMobileCountriesResponseArr = new SendToMobileCountriesResponse[i];
            int i6 = i3 + 59;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return sendToMobileCountriesResponseArr;
        }

        @Override
        public SendToMobileCountriesResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 107;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                newArray(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            SendToMobileCountriesResponse[] sendToMobileCountriesResponseArrNewArray = newArray(i);
            int i4 = copydefault + 65;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return sendToMobileCountriesResponseArrNewArray;
        }
    }

    public SendToMobileCountriesResponse(SendToMobileHeader sendToMobileHeader, List<SendToMobileCountry> list, String str) {
        Intrinsics.checkNotNullParameter(sendToMobileHeader, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.header = sendToMobileHeader;
        this.body = list;
        this.messageId = str;
    }

    public final SendToMobileHeader getHeader() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 121;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        SendToMobileHeader sendToMobileHeader = this.header;
        int i5 = i2 + 125;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return sendToMobileHeader;
        }
        throw null;
    }

    public final List<SendToMobileCountry> getBody() {
        int i = 2 % 2;
        int i2 = component1 + 73;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.body;
        }
        throw null;
    }

    public final String getMessageId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.messageId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component2 + 63;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SendToMobileCountriesResponse copy$default(SendToMobileCountriesResponse sendToMobileCountriesResponse, SendToMobileHeader sendToMobileHeader, List list, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1;
        int i4 = i3 + 43;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            sendToMobileHeader = sendToMobileCountriesResponse.header;
        }
        if ((i & 2) != 0) {
            int i5 = i3 + 35;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                List<SendToMobileCountry> list2 = sendToMobileCountriesResponse.body;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            list = sendToMobileCountriesResponse.body;
        }
        if ((i & 4) != 0) {
            str = sendToMobileCountriesResponse.messageId;
        }
        return sendToMobileCountriesResponse.copy(sendToMobileHeader, list, str);
    }

    public final SendToMobileHeader component1() {
        SendToMobileHeader sendToMobileHeader;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 11;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            sendToMobileHeader = this.header;
            int i4 = 43 / 0;
        } else {
            sendToMobileHeader = this.header;
        }
        int i5 = i2 + 37;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 94 / 0;
        }
        return sendToMobileHeader;
    }

    public final List<SendToMobileCountry> component2() {
        int i = 2 % 2;
        int i2 = component1 + 103;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        List<SendToMobileCountry> list = this.body;
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
        return list;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 63;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.messageId;
        int i5 = i2 + 75;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final SendToMobileCountriesResponse copy(SendToMobileHeader header, List<SendToMobileCountry> body, String messageId) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(header, "");
        Intrinsics.checkNotNullParameter(body, "");
        Intrinsics.checkNotNullParameter(messageId, "");
        SendToMobileCountriesResponse sendToMobileCountriesResponse = new SendToMobileCountriesResponse(header, body, messageId);
        int i2 = ShareDataUIState + 121;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 91 / 0;
        }
        return sendToMobileCountriesResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 115;
        ShareDataUIState = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 39;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == other) {
            int i4 = i2 + 77;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(other instanceof SendToMobileCountriesResponse)) {
            return false;
        }
        SendToMobileCountriesResponse sendToMobileCountriesResponse = (SendToMobileCountriesResponse) other;
        if (!Intrinsics.areEqual(this.header, sendToMobileCountriesResponse.header)) {
            return false;
        }
        if (Intrinsics.areEqual(this.body, sendToMobileCountriesResponse.body)) {
            return Intrinsics.areEqual(this.messageId, sendToMobileCountriesResponse.messageId);
        }
        int i6 = ShareDataUIState + 3;
        component1 = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 39;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.header.hashCode() * 31) + this.body.hashCode()) * 31) + this.messageId.hashCode();
        int i4 = component1 + 85;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SendToMobileCountriesResponse(header=" + this.header + ", body=" + this.body + ", messageId=" + this.messageId + ')';
        int i2 = ShareDataUIState + 99;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            this.header.writeToParcel(dest, flags);
            List<SendToMobileCountry> list = this.body;
            dest.writeInt(list.size());
            list.iterator();
            throw null;
        }
        this.header.writeToParcel(dest, flags);
        List<SendToMobileCountry> list2 = this.body;
        dest.writeInt(list2.size());
        Iterator<SendToMobileCountry> it = list2.iterator();
        while (it.hasNext()) {
            int i4 = ShareDataUIState + 9;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                it.next().writeToParcel(dest, flags);
                int i5 = 47 / 0;
            } else {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.messageId);
    }
}
