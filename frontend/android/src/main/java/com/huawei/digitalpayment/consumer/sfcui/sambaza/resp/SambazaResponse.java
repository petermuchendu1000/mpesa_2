package com.huawei.digitalpayment.consumer.sfcui.sambaza.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.common.interceptor.AppLogInterceptor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÇ\u0001J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H×\u0003J\t\u0010\u001a\u001a\u00020\u0015H×\u0001J\t\u0010\u001b\u001a\u00020\u0007H×\u0001J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/SambazaResponse;", "Landroid/os/Parcelable;", "header", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/SambazaResponseHeader;", "body", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/SambazaResponseBody;", AppLogInterceptor.MESSAGE_ID, "", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/SambazaResponseHeader;Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/SambazaResponseBody;Ljava/lang/String;)V", "getHeader", "()Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/SambazaResponseHeader;", "getBody", "()Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/SambazaResponseBody;", "getMessageId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SambazaResponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SambazaResponse> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("body")
    private final SambazaResponseBody body;

    @SerializedName("header")
    private final SambazaResponseHeader header;

    @SerializedName(AppLogInterceptor.MESSAGE_ID)
    private final String messageId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SambazaResponse> {
        private static int component1 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0036 A[PHI: r1
  0x0036: PHI (r1v9 com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponseHeader) = 
  (r1v6 com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponseHeader)
  (r1v12 com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponseHeader)
 binds: [B:8:0x0032, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0034 A[PHI: r1
  0x0034: PHI (r1v7 com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponseHeader) = 
  (r1v6 com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponseHeader)
  (r1v12 com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponseHeader)
 binds: [B:8:0x0032, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponse createFromParcel(android.os.Parcel r6) {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponse.Creator.component3
                int r1 = r1 + 37
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponse.Creator.component1 = r2
                int r1 = r1 % r0
                java.lang.String r2 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
                if (r1 != 0) goto L26
                android.os.Parcelable$Creator<com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponseHeader> r1 = com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponseHeader.CREATOR
                java.lang.Object r1 = r1.createFromParcel(r6)
                com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponseHeader r1 = (com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponseHeader) r1
                int r2 = r6.readInt()
                r3 = 61
                int r3 = r3 / 0
                if (r2 != 0) goto L36
                goto L34
            L26:
                android.os.Parcelable$Creator<com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponseHeader> r1 = com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponseHeader.CREATOR
                java.lang.Object r1 = r1.createFromParcel(r6)
                com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponseHeader r1 = (com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponseHeader) r1
                int r2 = r6.readInt()
                if (r2 != 0) goto L36
            L34:
                r0 = 0
                goto L4b
            L36:
                android.os.Parcelable$Creator<com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponseBody> r2 = com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponseBody.CREATOR
                java.lang.Object r2 = r2.createFromParcel(r6)
                int r3 = com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponse.Creator.component1
                int r3 = r3 + 27
                int r4 = r3 % 128
                com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponse.Creator.component3 = r4
                int r3 = r3 % r0
                if (r3 == 0) goto L4a
                r0 = 3
                int r0 = r0 % 5
            L4a:
                r0 = r2
            L4b:
                com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponse r2 = new com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponse
                com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponseBody r0 = (com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponseBody) r0
                java.lang.String r6 = r6.readString()
                r2.<init>(r1, r0, r6)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponse.Creator.createFromParcel(android.os.Parcel):com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponse");
        }

        @Override
        public SambazaResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 117;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            SambazaResponse sambazaResponseCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 27;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 0;
            }
            return sambazaResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SambazaResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 91;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            SambazaResponse[] sambazaResponseArr = new SambazaResponse[i];
            int i6 = i4 + 109;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return sambazaResponseArr;
        }

        @Override
        public SambazaResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 125;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            SambazaResponse[] sambazaResponseArrNewArray = newArray(i);
            int i5 = component1 + 67;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return sambazaResponseArrNewArray;
        }
    }

    public SambazaResponse(SambazaResponseHeader sambazaResponseHeader, SambazaResponseBody sambazaResponseBody, String str) {
        Intrinsics.checkNotNullParameter(sambazaResponseHeader, "");
        this.header = sambazaResponseHeader;
        this.body = sambazaResponseBody;
        this.messageId = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SambazaResponse(SambazaResponseHeader sambazaResponseHeader, SambazaResponseBody sambazaResponseBody, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = copydefault;
            int i3 = i2 + 5;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 91;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str = null;
        }
        this(sambazaResponseHeader, sambazaResponseBody, str);
    }

    public final SambazaResponseHeader getHeader() {
        int i = 2 % 2;
        int i2 = component1 + 79;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        SambazaResponseHeader sambazaResponseHeader = this.header;
        int i5 = i3 + 103;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return sambazaResponseHeader;
    }

    public final SambazaResponseBody getBody() {
        SambazaResponseBody sambazaResponseBody;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 107;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            sambazaResponseBody = this.body;
            int i4 = 26 / 0;
        } else {
            sambazaResponseBody = this.body;
        }
        int i5 = i2 + 101;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return sambazaResponseBody;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMessageId() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 65;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.messageId;
        int i5 = i2 + 75;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component2 + 67;
        component3 = i % 128;
        if (i % 2 == 0) {
            int i2 = 47 / 0;
        }
    }

    public static SambazaResponse copy$default(SambazaResponse sambazaResponse, SambazaResponseHeader sambazaResponseHeader, SambazaResponseBody sambazaResponseBody, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 85;
        component1 = i4 % 128;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            sambazaResponseHeader = sambazaResponse.header;
        }
        Object obj2 = null;
        if ((i & 2) != 0) {
            int i5 = i3 + 1;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                SambazaResponseBody sambazaResponseBody2 = sambazaResponse.body;
                throw null;
            }
            sambazaResponseBody = sambazaResponse.body;
        }
        if ((i & 4) != 0) {
            int i6 = component1 + 59;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                String str2 = sambazaResponse.messageId;
                obj2.hashCode();
                throw null;
            }
            str = sambazaResponse.messageId;
        }
        return sambazaResponse.copy(sambazaResponseHeader, sambazaResponseBody, str);
    }

    public final SambazaResponseHeader component1() {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.header;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SambazaResponseBody component2() {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.body;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 123;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.messageId;
        if (i3 == 0) {
            int i4 = 92 / 0;
        }
        return str;
    }

    public final SambazaResponse copy(SambazaResponseHeader header, SambazaResponseBody body, String messageId) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(header, "");
        SambazaResponse sambazaResponse = new SambazaResponse(header, body, messageId);
        int i2 = copydefault + 67;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return sambazaResponse;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 93;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 83;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 29;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof SambazaResponse)) {
            int i4 = copydefault + 9;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        SambazaResponse sambazaResponse = (SambazaResponse) other;
        if (!Intrinsics.areEqual(this.header, sambazaResponse.header) || !Intrinsics.areEqual(this.body, sambazaResponse.body)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.messageId, sambazaResponse.messageId)) {
            int i6 = copydefault + 87;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = component1 + 67;
        copydefault = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 52 / 0;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f A[PHI: r1 r3
  0x002f: PHI (r1v12 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
  0x002f: PHI (r3v5 com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponseBody) = 
  (r3v0 com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponseBody)
  (r3v6 com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponseBody)
 binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r1
  0x0024: PHI (r1v6 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponse.component1
            int r1 = r1 + 61
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponse.copydefault = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L1a
            com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponseHeader r1 = r5.header
            int r1 = r1.hashCode()
            com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponseBody r3 = r5.body
            if (r3 != 0) goto L2f
            goto L24
        L1a:
            com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponseHeader r1 = r5.header
            int r1 = r1.hashCode()
            com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponseBody r3 = r5.body
            if (r3 != 0) goto L2f
        L24:
            int r3 = com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponse.component1
            int r3 = r3 + 29
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponse.copydefault = r4
            int r3 = r3 % r0
            r0 = r2
            goto L33
        L2f:
            int r0 = r3.hashCode()
        L33:
            java.lang.String r3 = r5.messageId
            if (r3 != 0) goto L38
            goto L3c
        L38:
            int r2 = r3.hashCode()
        L3c:
            int r1 = r1 * 31
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r1 = r1 + r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponse.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SambazaResponse(header=" + this.header + ", body=" + this.body + ", messageId=" + this.messageId + ")";
        int i2 = component1 + 19;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 109;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            this.header.writeToParcel(dest, flags);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.header.writeToParcel(dest, flags);
        SambazaResponseBody sambazaResponseBody = this.body;
        if (sambazaResponseBody == null) {
            dest.writeInt(0);
            int i4 = copydefault + 49;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 4;
            }
        } else {
            dest.writeInt(1);
            sambazaResponseBody.writeToParcel(dest, flags);
        }
        dest.writeString(this.messageId);
    }
}
