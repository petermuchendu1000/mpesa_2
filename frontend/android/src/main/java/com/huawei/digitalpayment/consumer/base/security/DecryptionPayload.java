package com.huawei.digitalpayment.consumer.base.security;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.kernel.common.log.ConnectionLog;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/security/DecryptionPayload;", "Landroid/os/Parcelable;", ConnectionLog.CONN_LOG_STATE_RESPONSE, "", "<init>", "(Ljava/lang/String;)V", "getResponse", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        private static int component2 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DecryptionPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            DecryptionPayload decryptionPayload = new DecryptionPayload(parcel.readString());
            int i2 = component2 + 9;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return decryptionPayload;
        }

        @Override
        public DecryptionPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 31;
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
        public final DecryptionPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 45;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            DecryptionPayload[] decryptionPayloadArr = new DecryptionPayload[i];
            int i6 = i4 + 121;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return decryptionPayloadArr;
        }

        @Override
        public DecryptionPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 85;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            DecryptionPayload[] decryptionPayloadArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 10 / 0;
            }
            return decryptionPayloadArrNewArray;
        }
    }

    public DecryptionPayload(String str) {
        this.response = str;
    }

    public final String getResponse() {
        int i = 2 % 2;
        int i2 = component2 + 91;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.response;
        int i4 = i3 + 101;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = component3 + 35;
        component1 = i % 128;
        if (i % 2 != 0) {
            int i2 = 81 / 0;
        }
    }

    public static DecryptionPayload copy$default(DecryptionPayload decryptionPayload, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 45;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i & 1;
        if (i3 % 2 != 0 ? i5 != 0 : i5 != 0) {
            int i6 = i4 + 21;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            str = decryptionPayload.response;
        }
        return decryptionPayload.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 119;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.response;
        int i4 = i3 + 43;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final DecryptionPayload copy(String response) {
        int i = 2 % 2;
        DecryptionPayload decryptionPayload = new DecryptionPayload(response);
        int i2 = copydefault + 37;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return decryptionPayload;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 79;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 119;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 123;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof DecryptionPayload)) {
            int i4 = i2 + 89;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.response, ((DecryptionPayload) other).response)) {
            return false;
        }
        int i6 = component2 + 123;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.response;
        if (str == null) {
            int i2 = copydefault + 47;
            component2 = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i3 = copydefault + 1;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DecryptionPayload(response=" + this.response + ")";
        int i2 = component2 + 5;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.response);
        int i4 = copydefault + 53;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }
}
