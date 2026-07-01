package com.huawei.digitalpayment.consumer.base.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.common.interceptor.AppLogInterceptor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/PochiOptResp;", "Landroid/os/Parcelable;", "Message", "", "Success", "", AppLogInterceptor.MESSAGE_ID, "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getSuccess", "()Z", "getMessageId", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PochiOptResp implements Parcelable {
    public static final Parcelable.Creator<PochiOptResp> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("Message")
    private final String Message;

    @SerializedName("Success")
    private final boolean Success;
    private final String messageId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PochiOptResp> {
        private static int ShareDataUIState = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PochiOptResp createFromParcel(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            int i2 = component2 + 53;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                int i4 = ShareDataUIState;
                int i5 = i4 + 27;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 89;
                component2 = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 % 5;
                }
                z = true;
            } else {
                z = false;
            }
            return new PochiOptResp(string, z, parcel.readString());
        }

        @Override
        public PochiOptResp createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 61;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            PochiOptResp pochiOptRespCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 25;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return pochiOptRespCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PochiOptResp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 3;
            ShareDataUIState = i4 % 128;
            PochiOptResp[] pochiOptRespArr = new PochiOptResp[i];
            if (i4 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 39;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return pochiOptRespArr;
        }

        @Override
        public PochiOptResp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 3;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            PochiOptResp[] pochiOptRespArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 27 / 0;
            }
            return pochiOptRespArrNewArray;
        }
    }

    public PochiOptResp(String str, boolean z, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.Message = str;
        this.Success = z;
        this.messageId = str2;
    }

    public final String getMessage() {
        int i = 2 % 2;
        int i2 = component2 + 53;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.Message;
        int i5 = i3 + 111;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 90 / 0;
        }
        return str;
    }

    public final boolean getSuccess() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.Success;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMessageId() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 47;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.messageId;
        int i5 = i2 + 7;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = copydefault + 79;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public static PochiOptResp copy$default(PochiOptResp pochiOptResp, String str, boolean z, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 33;
        component2 = i4 % 128;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            str = pochiOptResp.Message;
            int i5 = i3 + 81;
            component2 = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 2) != 0) {
            z = pochiOptResp.Success;
        }
        if ((i & 4) != 0) {
            int i7 = component2 + 111;
            component3 = i7 % 128;
            if (i7 % 2 == 0) {
                String str3 = pochiOptResp.messageId;
                throw null;
            }
            str2 = pochiOptResp.messageId;
        }
        return pochiOptResp.copy(str, z, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 105;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.Message;
        int i4 = i3 + 29;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 43;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.Success;
        int i5 = i2 + 19;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 17;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.messageId;
        }
        throw null;
    }

    public final PochiOptResp copy(String Message, boolean Success, String messageId) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(Message, "");
        Intrinsics.checkNotNullParameter(messageId, "");
        PochiOptResp pochiOptResp = new PochiOptResp(Message, Success, messageId);
        int i2 = component2 + 69;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 86 / 0;
        }
        return pochiOptResp;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 15;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 103;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof PochiOptResp)) {
            return false;
        }
        PochiOptResp pochiOptResp = (PochiOptResp) other;
        if (!Intrinsics.areEqual(this.Message, pochiOptResp.Message)) {
            int i2 = component2 + 115;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.Success != pochiOptResp.Success) {
            int i4 = component2 + 13;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 18 / 0;
            }
            return false;
        }
        if (Intrinsics.areEqual(this.messageId, pochiOptResp.messageId)) {
            return true;
        }
        int i6 = component3 + 19;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 95;
        component3 = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((this.Message.hashCode() >>> 90) >> Boolean.hashCode(this.Success)) + 118) / this.messageId.hashCode() : (((this.Message.hashCode() * 31) + Boolean.hashCode(this.Success)) * 31) + this.messageId.hashCode();
        int i3 = component2 + 79;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PochiOptResp(Message=" + this.Message + ", Success=" + this.Success + ", messageId=" + this.messageId + ")";
        int i2 = component2 + 31;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 121;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.Message);
        dest.writeInt(this.Success ? 1 : 0);
        dest.writeString(this.messageId);
        int i4 = component2 + 37;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
    }
}
