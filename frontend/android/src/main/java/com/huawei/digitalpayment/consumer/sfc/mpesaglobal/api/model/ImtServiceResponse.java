package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0010H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceResponse;", "Landroid/os/Parcelable;", "responseHeader", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceResponseHeader;", "body", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceBody;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceResponseHeader;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceBody;)V", "getResponseHeader", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceResponseHeader;", "getBody", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceBody;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImtServiceResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ImtServiceResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault;

    @SerializedName("Body")
    private final ImtServiceBody body;

    @SerializedName("ResponseHeader")
    private final ImtServiceResponseHeader responseHeader;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImtServiceResponse> {
        private static int component3 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ImtServiceResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ImtServiceResponse imtServiceResponse = new ImtServiceResponse(ImtServiceResponseHeader.CREATOR.createFromParcel(parcel), ImtServiceBody.CREATOR.createFromParcel(parcel));
            int i2 = copydefault + 27;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return imtServiceResponse;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public ImtServiceResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 103;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                createFromParcel(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ImtServiceResponse imtServiceResponseCreateFromParcel = createFromParcel(parcel);
            int i3 = copydefault + 33;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            return imtServiceResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ImtServiceResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 17;
            copydefault = i4 % 128;
            ImtServiceResponse[] imtServiceResponseArr = new ImtServiceResponse[i];
            if (i4 % 2 == 0) {
                int i5 = 90 / 0;
            }
            int i6 = i3 + 97;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                return imtServiceResponseArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public ImtServiceResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 73;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            ImtServiceResponse[] imtServiceResponseArrNewArray = newArray(i);
            int i5 = component3 + 109;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                return imtServiceResponseArrNewArray;
            }
            throw null;
        }
    }

    public ImtServiceResponse(ImtServiceResponseHeader imtServiceResponseHeader, ImtServiceBody imtServiceBody) {
        Intrinsics.checkNotNullParameter(imtServiceResponseHeader, "");
        Intrinsics.checkNotNullParameter(imtServiceBody, "");
        this.responseHeader = imtServiceResponseHeader;
        this.body = imtServiceBody;
    }

    public final ImtServiceResponseHeader getResponseHeader() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.responseHeader;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ImtServiceBody getBody() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        ImtServiceBody imtServiceBody = this.body;
        int i4 = i3 + 99;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return imtServiceBody;
    }

    static {
        int i = component2 + 39;
        component1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ImtServiceResponse copy$default(ImtServiceResponse imtServiceResponse, ImtServiceResponseHeader imtServiceResponseHeader, ImtServiceBody imtServiceBody, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 39;
        copydefault = i4 % 128;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            imtServiceResponseHeader = imtServiceResponse.responseHeader;
            int i5 = i3 + 5;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 5;
            }
        }
        if ((i & 2) != 0) {
            imtServiceBody = imtServiceResponse.body;
        }
        return imtServiceResponse.copy(imtServiceResponseHeader, imtServiceBody);
    }

    public final ImtServiceResponseHeader component1() {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.responseHeader;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ImtServiceBody component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 65;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        ImtServiceBody imtServiceBody = this.body;
        int i5 = i2 + 103;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return imtServiceBody;
    }

    public final ImtServiceResponse copy(ImtServiceResponseHeader responseHeader, ImtServiceBody body) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(responseHeader, "");
        Intrinsics.checkNotNullParameter(body, "");
        ImtServiceResponse imtServiceResponse = new ImtServiceResponse(responseHeader, body);
        int i2 = copydefault + 17;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return imtServiceResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 119;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceResponse) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceResponse) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.responseHeader, r6.responseHeader) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceResponse.ShareDataUIState + 61;
        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceResponse.copydefault = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.body, r6.body) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceResponse.ShareDataUIState + 41;
        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceResponse.copydefault = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if ((r6 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceResponse.ShareDataUIState
            int r1 = r1 + 125
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceResponse.copydefault = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            r1 = 81
            int r1 = r1 / r3
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r2
        L19:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceResponse
            if (r1 != 0) goto L1e
            return r3
        L1e:
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceResponse r6 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceResponse) r6
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceResponseHeader r1 = r5.responseHeader
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceResponseHeader r4 = r6.responseHeader
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L34
            int r6 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceResponse.ShareDataUIState
            int r6 = r6 + 61
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceResponse.copydefault = r1
            int r6 = r6 % r0
            return r3
        L34:
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceBody r1 = r5.body
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceBody r6 = r6.body
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 != 0) goto L4b
            int r6 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceResponse.ShareDataUIState
            int r6 = r6 + 41
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceResponse.copydefault = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L4a
            goto L4b
        L4a:
            r2 = r3
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceResponse.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 87;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.responseHeader.hashCode();
        return (i3 == 0 ? iHashCode >> 123 : iHashCode * 31) + this.body.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ImtServiceResponse(responseHeader=" + this.responseHeader + ", body=" + this.body + ')';
        int i2 = copydefault + 85;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        this.responseHeader.writeToParcel(dest, flags);
        this.body.writeToParcel(dest, flags);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
