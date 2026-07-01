package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0010H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceRequest;", "Landroid/os/Parcelable;", "header", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceRequestHeader;", "body", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceBody;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceRequestHeader;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceBody;)V", "getHeader", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceRequestHeader;", "getBody", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceBody;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImtServiceRequest implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ImtServiceRequest> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;

    @SerializedName("Body")
    private final ImtServiceBody body;

    @SerializedName("Header")
    private final ImtServiceRequestHeader header;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImtServiceRequest> {
        private static int component1 = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ImtServiceRequest createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ImtServiceRequest imtServiceRequest = new ImtServiceRequest(ImtServiceRequestHeader.CREATOR.createFromParcel(parcel), ImtServiceBody.CREATOR.createFromParcel(parcel));
            int i2 = component2 + 91;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return imtServiceRequest;
        }

        @Override
        public ImtServiceRequest createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 9;
            component2 = i2 % 128;
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
        public final ImtServiceRequest[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 9;
            int i4 = i3 % 128;
            component2 = i4;
            ImtServiceRequest[] imtServiceRequestArr = new ImtServiceRequest[i];
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 123;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return imtServiceRequestArr;
        }

        @Override
        public ImtServiceRequest[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 71;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            ImtServiceRequest[] imtServiceRequestArrNewArray = newArray(i);
            int i5 = component2 + 89;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return imtServiceRequestArrNewArray;
        }
    }

    public ImtServiceRequest(ImtServiceRequestHeader imtServiceRequestHeader, ImtServiceBody imtServiceBody) {
        Intrinsics.checkNotNullParameter(imtServiceRequestHeader, "");
        Intrinsics.checkNotNullParameter(imtServiceBody, "");
        this.header = imtServiceRequestHeader;
        this.body = imtServiceBody;
    }

    public final ImtServiceRequestHeader getHeader() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 45;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        ImtServiceRequestHeader imtServiceRequestHeader = this.header;
        int i5 = i2 + 57;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return imtServiceRequestHeader;
    }

    public final ImtServiceBody getBody() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 9;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        ImtServiceBody imtServiceBody = this.body;
        int i5 = i2 + 91;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
        return imtServiceBody;
    }

    static {
        int i = ShareDataUIState + 37;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static ImtServiceRequest copy$default(ImtServiceRequest imtServiceRequest, ImtServiceRequestHeader imtServiceRequestHeader, ImtServiceBody imtServiceBody, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            imtServiceRequestHeader = imtServiceRequest.header;
        }
        if ((i & 2) != 0) {
            int i3 = component2 + 17;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            imtServiceBody = imtServiceRequest.body;
        }
        ImtServiceRequest imtServiceRequestCopy = imtServiceRequest.copy(imtServiceRequestHeader, imtServiceBody);
        int i5 = component1 + 93;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return imtServiceRequestCopy;
    }

    public final ImtServiceRequestHeader component1() {
        int i = 2 % 2;
        int i2 = component1 + 101;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ImtServiceRequestHeader imtServiceRequestHeader = this.header;
        int i4 = i3 + 119;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return imtServiceRequestHeader;
    }

    public final ImtServiceBody component2() {
        ImtServiceBody imtServiceBody;
        int i = 2 % 2;
        int i2 = component1 + 49;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            imtServiceBody = this.body;
            int i4 = 51 / 0;
        } else {
            imtServiceBody = this.body;
        }
        int i5 = i3 + 5;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return imtServiceBody;
    }

    public final ImtServiceRequest copy(ImtServiceRequestHeader header, ImtServiceBody body) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(header, "");
        Intrinsics.checkNotNullParameter(body, "");
        ImtServiceRequest imtServiceRequest = new ImtServiceRequest(header, body);
        int i2 = component2 + 71;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 28 / 0;
        }
        return imtServiceRequest;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 89;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 91;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 45;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof ImtServiceRequest)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.header, ((ImtServiceRequest) other).header)) {
            int i4 = component2 + 3;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.body, r6.body))) {
            return true;
        }
        int i6 = component2 + 61;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 7;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.header.hashCode();
        return i3 == 0 ? (iHashCode * 91) << this.body.hashCode() : (iHashCode * 31) + this.body.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ImtServiceRequest(header=" + this.header + ", body=" + this.body + ')';
        int i2 = component2 + 19;
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
        int i2 = component1 + 101;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        this.header.writeToParcel(dest, flags);
        this.body.writeToParcel(dest, flags);
        int i4 = component1 + 101;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }
}
