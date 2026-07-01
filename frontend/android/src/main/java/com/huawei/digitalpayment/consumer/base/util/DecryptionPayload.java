package com.huawei.digitalpayment.consumer.base.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.kernel.common.log.ConnectionLog;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/util/DecryptionPayload;", "Landroid/os/Parcelable;", ConnectionLog.CONN_LOG_STATE_RESPONSE, "", "<init>", "(Ljava/lang/String;)V", "getResponse", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DecryptionPayload implements Parcelable {
    public static final Parcelable.Creator<DecryptionPayload> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName(ConnectionLog.CONN_LOG_STATE_RESPONSE)
    private final String response;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DecryptionPayload> {
        private static int ShareDataUIState = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DecryptionPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            DecryptionPayload decryptionPayload = new DecryptionPayload(parcel.readString());
            int i2 = component2 + 61;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return decryptionPayload;
        }

        @Override
        public DecryptionPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 73;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            DecryptionPayload decryptionPayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 105;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 48 / 0;
            }
            return decryptionPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DecryptionPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 39;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            DecryptionPayload[] decryptionPayloadArr = new DecryptionPayload[i];
            int i6 = i3 + 7;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return decryptionPayloadArr;
        }

        @Override
        public DecryptionPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 89;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            DecryptionPayload[] decryptionPayloadArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 93;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return decryptionPayloadArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public DecryptionPayload(String str) {
        this.response = str;
    }

    public final String getResponse() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 103;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.response;
            int i4 = 48 / 0;
        } else {
            str = this.response;
        }
        int i5 = i2 + 81;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component3 + 67;
        copydefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 0 / 0;
        }
    }

    public static DecryptionPayload copy$default(DecryptionPayload decryptionPayload, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 97;
        int i4 = i3 % 128;
        component2 = i4;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            str = decryptionPayload.response;
            int i5 = i4 + 103;
            component1 = i5 % 128;
            int i6 = i5 % 2;
        }
        return decryptionPayload.copy(str);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 49;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            str = this.response;
            int i4 = 14 / 0;
        } else {
            str = this.response;
        }
        int i5 = i3 + 121;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final DecryptionPayload copy(String response) {
        int i = 2 % 2;
        DecryptionPayload decryptionPayload = new DecryptionPayload(response);
        int i2 = component2 + 99;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return decryptionPayload;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 113;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 33;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 85 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 89;
            component1 = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(other instanceof DecryptionPayload)) {
            int i3 = component1 + 101;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (Intrinsics.areEqual(this.response, ((DecryptionPayload) other).response)) {
            return true;
        }
        int i4 = component1 + 71;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
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
    
        r2 = r1 + 25;
        com.huawei.digitalpayment.consumer.base.util.DecryptionPayload.component2 = r2 % 128;
        r2 = r2 % 2;
        r1 = r1 + 7;
        com.huawei.digitalpayment.consumer.base.util.DecryptionPayload.component2 = r1 % 128;
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
            int r1 = com.huawei.digitalpayment.consumer.base.util.DecryptionPayload.component1
            int r2 = r1 + 63
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.base.util.DecryptionPayload.component2 = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L17
            java.lang.String r2 = r5.response
            r4 = 65
            int r4 = r4 / r3
            if (r2 != 0) goto L2a
            goto L1b
        L17:
            java.lang.String r2 = r5.response
            if (r2 != 0) goto L2a
        L1b:
            int r2 = r1 + 25
            int r4 = r2 % 128
            com.huawei.digitalpayment.consumer.base.util.DecryptionPayload.component2 = r4
            int r2 = r2 % r0
            int r1 = r1 + 7
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.util.DecryptionPayload.component2 = r2
            int r1 = r1 % r0
            goto L2e
        L2a:
            int r3 = r2.hashCode()
        L2e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.util.DecryptionPayload.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DecryptionPayload(response=" + this.response + ")";
        int i2 = component1 + 79;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 79;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.response);
        int i4 = component2 + 45;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }
}
