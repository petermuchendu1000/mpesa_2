package com.huawei.digitalpayment.consumer.sfcui.postpay.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001c\u0012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\r\u001a\u00070\u0003¢\u0006\u0002\b\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\"\u0010\u000f\u001a\u00020\u00002\r\b\u0002\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H×\u0003J\t\u0010\u0015\u001a\u00020\u0011H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u001b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/RequestBillResponse;", "Landroid/os/Parcelable;", "body", "", "Lkotlinx/parcelize/RawValue;", "header", "Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/Header;", "<init>", "(Ljava/lang/Object;Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/Header;)V", "getBody", "()Ljava/lang/Object;", "getHeader", "()Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/Header;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RequestBillResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RequestBillResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("body")
    private final Object body;

    @SerializedName("header")
    private final Header header;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RequestBillResponse> {
        private static int ShareDataUIState = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RequestBillResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            RequestBillResponse requestBillResponse = new RequestBillResponse(parcel.readValue(RequestBillResponse.class.getClassLoader()), Header.CREATOR.createFromParcel(parcel));
            int i2 = component2 + 39;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return requestBillResponse;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public RequestBillResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 35;
            ShareDataUIState = i2 % 128;
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
        public final RequestBillResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 125;
            ShareDataUIState = i3 % 128;
            RequestBillResponse[] requestBillResponseArr = new RequestBillResponse[i];
            if (i3 % 2 != 0) {
                return requestBillResponseArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public RequestBillResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 93;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            RequestBillResponse[] requestBillResponseArrNewArray = newArray(i);
            int i5 = component2 + 65;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                return requestBillResponseArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public RequestBillResponse(Object obj, Header header) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(header, "");
        this.body = obj;
        this.header = header;
    }

    public final Object getBody() {
        int i = 2 % 2;
        int i2 = component3 + 57;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.body;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Header getHeader() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 35;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Header header = this.header;
        int i5 = i2 + 89;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return header;
    }

    static {
        int i = ShareDataUIState + 119;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static RequestBillResponse copy$default(RequestBillResponse requestBillResponse, Object obj, Header header, int i, Object obj2) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            obj = requestBillResponse.body;
        }
        if ((i & 2) != 0) {
            int i3 = copydefault + 71;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            header = requestBillResponse.header;
        }
        RequestBillResponse requestBillResponseCopy = requestBillResponse.copy(obj, header);
        int i5 = copydefault + 105;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return requestBillResponseCopy;
        }
        throw null;
    }

    public final Object component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 87;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Object obj = this.body;
        int i4 = i2 + 57;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return obj;
    }

    public final Header component2() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Header header = this.header;
        int i4 = i3 + 27;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return header;
        }
        obj.hashCode();
        throw null;
    }

    public final RequestBillResponse copy(Object body, Header header) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(body, "");
        Intrinsics.checkNotNullParameter(header, "");
        RequestBillResponse requestBillResponse = new RequestBillResponse(body, header);
        int i2 = component3 + 57;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return requestBillResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 29;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 111;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 41;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestBillResponse)) {
            int i5 = i2 + 103;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            throw null;
        }
        RequestBillResponse requestBillResponse = (RequestBillResponse) other;
        if (!Intrinsics.areEqual(this.body, requestBillResponse.body) || !Intrinsics.areEqual(this.header, requestBillResponse.header)) {
            return false;
        }
        int i6 = copydefault + 87;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 23;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.body.hashCode() * 31) + this.header.hashCode();
        int i4 = component3 + 97;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RequestBillResponse(body=" + this.body + ", header=" + this.header + ")";
        int i2 = copydefault + 81;
        component3 = i2 % 128;
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
        int i2 = copydefault + 97;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            dest.writeValue(this.body);
            this.header.writeToParcel(dest, flags);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        dest.writeValue(this.body);
        this.header.writeToParcel(dest, flags);
        int i4 = copydefault + 5;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }
}
