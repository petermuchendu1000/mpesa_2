package com.huawei.digitalpayment.consumer.baselib.http;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/http/Payload;", "Landroid/os/Parcelable;", "payload", "", "<init>", "(Ljava/lang/String;)V", "getPayload", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Payload implements Parcelable {
    public static final Parcelable.Creator<Payload> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;

    @SerializedName("payload")
    private final String payload;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Payload> {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Payload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Payload payload = new Payload(parcel.readString());
            int i2 = ShareDataUIState + 123;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return payload;
        }

        @Override
        public Payload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 93;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Payload payloadCreateFromParcel = createFromParcel(parcel);
            if (i3 != 0) {
                int i4 = 72 / 0;
            }
            return payloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Payload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 37;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i3 % 2;
            Payload[] payloadArr = new Payload[i];
            int i6 = i4 + 39;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 58 / 0;
            }
            return payloadArr;
        }

        @Override
        public Payload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 3;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            Payload[] payloadArrNewArray = newArray(i);
            int i5 = copydefault + 3;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return payloadArrNewArray;
        }
    }

    public Payload(String str) {
        this.payload = str;
    }

    public final String getPayload() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.payload;
        int i4 = i3 + 71;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        int i = component2 + 13;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static Payload copy$default(Payload payload, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 13;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = payload.payload;
            int i6 = i4 + 3;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
        }
        return payload.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.payload;
        int i5 = i3 + 117;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Payload copy(String payload) {
        int i = 2 % 2;
        Payload payload2 = new Payload(payload);
        int i2 = ShareDataUIState + 79;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 23 / 0;
        }
        return payload2;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 83;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 33;
        ShareDataUIState = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof Payload)) {
            int i4 = i2 + 87;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.payload, ((Payload) other).payload)) {
            return false;
        }
        int i5 = component3 + 13;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        return r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 23;
        com.huawei.digitalpayment.consumer.baselib.http.Payload.component3 = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.http.Payload.ShareDataUIState
            int r2 = r1 + 83
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.baselib.http.Payload.component3 = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L17
            java.lang.String r2 = r5.payload
            r4 = 57
            int r4 = r4 / r3
            if (r2 != 0) goto L23
            goto L1b
        L17:
            java.lang.String r2 = r5.payload
            if (r2 != 0) goto L23
        L1b:
            int r1 = r1 + 23
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.http.Payload.component3 = r2
            int r1 = r1 % r0
            goto L27
        L23:
            int r3 = r2.hashCode()
        L27:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.http.Payload.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Payload(payload=" + this.payload + ")";
        int i2 = component3 + 9;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            dest.writeString(this.payload);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        dest.writeString(this.payload);
        int i4 = component3 + 109;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }
}
