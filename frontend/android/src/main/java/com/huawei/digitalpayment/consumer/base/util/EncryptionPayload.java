package com.huawei.digitalpayment.consumer.base.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/util/EncryptionPayload;", "Landroid/os/Parcelable;", "data", "", "<init>", "(Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EncryptionPayload implements Parcelable {
    public static final Parcelable.Creator<EncryptionPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("data")
    private final String data;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EncryptionPayload> {
        private static int component1 = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final EncryptionPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            EncryptionPayload encryptionPayload = new EncryptionPayload(parcel.readString());
            int i2 = component3 + 117;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return encryptionPayload;
        }

        @Override
        public EncryptionPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 73;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                createFromParcel(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            EncryptionPayload encryptionPayloadCreateFromParcel = createFromParcel(parcel);
            int i3 = component1 + 25;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            return encryptionPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final EncryptionPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 115;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            EncryptionPayload[] encryptionPayloadArr = new EncryptionPayload[i];
            int i6 = i3 + 89;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return encryptionPayloadArr;
        }

        @Override
        public EncryptionPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 1;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            throw null;
        }
    }

    public EncryptionPayload(String str) {
        this.data = str;
    }

    public final String getData() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.data;
        }
        throw null;
    }

    static {
        int i = copydefault + 21;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static EncryptionPayload copy$default(EncryptionPayload encryptionPayload, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 99;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 21;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            str = encryptionPayload.data;
            if (i7 == 0) {
                int i8 = 39 / 0;
            }
        }
        return encryptionPayload.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 71;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.data;
        int i5 = i3 + 55;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final EncryptionPayload copy(String data) {
        int i = 2 % 2;
        EncryptionPayload encryptionPayload = new EncryptionPayload(data);
        int i2 = ShareDataUIState + 79;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return encryptionPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        component3 = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 1;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            int i5 = i2 + 17;
            ShareDataUIState = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!(other instanceof EncryptionPayload)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.data, ((EncryptionPayload) other).data)) {
            int i6 = component3 + 61;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = ShareDataUIState + 97;
        component3 = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 71 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.data;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i4 = component3 + 121;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EncryptionPayload(data=" + this.data + ")";
        int i2 = ShareDataUIState + 17;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.data);
        int i4 = component3 + 71;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }
}
