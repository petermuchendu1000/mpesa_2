package com.huawei.digitalpayment.consumer.sfcui.sambaza.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0018\u001a\u00020\u0005H\u0007J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH×\u0003J\t\u0010\u001d\u001a\u00020\u0005H×\u0001J\t\u0010\u001e\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0005H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006$"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/SambazaResponseHeader;", "Landroid/os/Parcelable;", "requestRefId", "", "responseCode", "", "responseMessage", Keys.KEY_CUSTOMER_MESSAGE, "timestamp", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRequestRefId", "()Ljava/lang/String;", "getResponseCode", "()I", "getResponseMessage", "getCustomerMessage", "getTimestamp", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SambazaResponseHeader implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SambazaResponseHeader> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;

    @SerializedName(Keys.KEY_CUSTOMER_MESSAGE)
    private final String customerMessage;

    @SerializedName("requestRefId")
    private final String requestRefId;

    @SerializedName("responseCode")
    private final int responseCode;

    @SerializedName("responseMessage")
    private final String responseMessage;

    @SerializedName("timestamp")
    private final String timestamp;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SambazaResponseHeader> {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SambazaResponseHeader createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            SambazaResponseHeader sambazaResponseHeader = new SambazaResponseHeader(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = copydefault + 97;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 99 / 0;
            }
            return sambazaResponseHeader;
        }

        @Override
        public SambazaResponseHeader createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 57;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SambazaResponseHeader[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 89;
            ShareDataUIState = i3 % 128;
            SambazaResponseHeader[] sambazaResponseHeaderArr = new SambazaResponseHeader[i];
            if (i3 % 2 != 0) {
                return sambazaResponseHeaderArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public SambazaResponseHeader[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 49;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                newArray(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            SambazaResponseHeader[] sambazaResponseHeaderArrNewArray = newArray(i);
            int i4 = copydefault + 53;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return sambazaResponseHeaderArrNewArray;
        }
    }

    public SambazaResponseHeader(String str, int i, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.requestRefId = str;
        this.responseCode = i;
        this.responseMessage = str2;
        this.customerMessage = str3;
        this.timestamp = str4;
    }

    public final String getRequestRefId() {
        int i = 2 % 2;
        int i2 = component1 + 103;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.requestRefId;
        int i5 = i3 + 101;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int getResponseCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = component1;
        int i4 = i3 + 105;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.responseCode;
            int i5 = 39 / 0;
        } else {
            i = this.responseCode;
        }
        int i6 = i3 + 73;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 60 / 0;
        }
        return i;
    }

    public final String getResponseMessage() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.responseMessage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getCustomerMessage() {
        int i = 2 % 2;
        int i2 = component1 + 41;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.customerMessage;
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        return str;
    }

    public final String getTimestamp() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 57;
        ShareDataUIState = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.timestamp;
        int i4 = i2 + 95;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = component3 + 21;
        component2 = i % 128;
        if (i % 2 != 0) {
            int i2 = 71 / 0;
        }
    }

    public static SambazaResponseHeader copy$default(SambazaResponseHeader sambazaResponseHeader, String str, int i, String str2, String str3, String str4, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = component1 + 81;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            str = sambazaResponseHeader.requestRefId;
        }
        String str5 = str;
        if ((i2 & 2) != 0) {
            int i6 = component1 + 47;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            i = sambazaResponseHeader.responseCode;
            if (i7 == 0) {
                int i8 = 76 / 0;
            }
        }
        int i9 = i;
        if ((i2 & 4) != 0) {
            str2 = sambazaResponseHeader.responseMessage;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = sambazaResponseHeader.customerMessage;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            int i10 = ShareDataUIState + 33;
            int i11 = i10 % 128;
            component1 = i11;
            int i12 = i10 % 2;
            str4 = sambazaResponseHeader.timestamp;
            int i13 = i11 + 5;
            ShareDataUIState = i13 % 128;
            int i14 = i13 % 2;
        }
        return sambazaResponseHeader.copy(str5, i9, str6, str7, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 39;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.requestRefId;
        int i5 = i2 + 41;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 21;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.responseCode;
        int i6 = i2 + 47;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.responseMessage;
        int i5 = i3 + 41;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.customerMessage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 55;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.timestamp;
            int i4 = 97 / 0;
        } else {
            str = this.timestamp;
        }
        int i5 = i2 + 11;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SambazaResponseHeader copy(String requestRefId, int responseCode, String responseMessage, String customerMessage, String timestamp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(requestRefId, "");
        Intrinsics.checkNotNullParameter(responseMessage, "");
        Intrinsics.checkNotNullParameter(customerMessage, "");
        Intrinsics.checkNotNullParameter(timestamp, "");
        SambazaResponseHeader sambazaResponseHeader = new SambazaResponseHeader(requestRefId, responseCode, responseMessage, customerMessage, timestamp);
        int i2 = ShareDataUIState + 93;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return sambazaResponseHeader;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 121;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 115;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 99;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        int i5 = i3 % 2;
        if (this == other) {
            int i6 = i4 + 13;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(other instanceof SambazaResponseHeader)) {
            int i8 = i2 + 31;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        SambazaResponseHeader sambazaResponseHeader = (SambazaResponseHeader) other;
        if (!Intrinsics.areEqual(this.requestRefId, sambazaResponseHeader.requestRefId) || this.responseCode != sambazaResponseHeader.responseCode) {
            return false;
        }
        if (!Intrinsics.areEqual(this.responseMessage, sambazaResponseHeader.responseMessage)) {
            int i10 = ShareDataUIState + 105;
            component1 = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.customerMessage, sambazaResponseHeader.customerMessage)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.timestamp, sambazaResponseHeader.timestamp)) {
            int i12 = component1 + 91;
            ShareDataUIState = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        int i14 = component1 + 45;
        ShareDataUIState = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 74 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.requestRefId.hashCode() * 31) + Integer.hashCode(this.responseCode)) * 31) + this.responseMessage.hashCode()) * 31) + this.customerMessage.hashCode()) * 31) + this.timestamp.hashCode();
        int i4 = ShareDataUIState + 123;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SambazaResponseHeader(requestRefId=" + this.requestRefId + ", responseCode=" + this.responseCode + ", responseMessage=" + this.responseMessage + ", customerMessage=" + this.customerMessage + ", timestamp=" + this.timestamp + ")";
        int i2 = component1 + 41;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.requestRefId);
        dest.writeInt(this.responseCode);
        dest.writeString(this.responseMessage);
        dest.writeString(this.customerMessage);
        dest.writeString(this.timestamp);
        int i4 = component1 + 81;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
    }
}
