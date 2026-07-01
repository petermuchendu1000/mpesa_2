package com.huawei.digitalpayment.consumer.sfcui.sharedata.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0018\u001a\u00020\u0005H\u0007J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH×\u0003J\t\u0010\u001d\u001a\u00020\u0005H×\u0001J\t\u0010\u001e\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0005H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006$"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/Header;", "Landroid/os/Parcelable;", "requestRefId", "", "responseCode", "", "responseMessage", Keys.KEY_CUSTOMER_MESSAGE, "timestamp", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRequestRefId", "()Ljava/lang/String;", "getResponseCode", "()I", "getResponseMessage", "getCustomerMessage", "getTimestamp", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Header implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<Header> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
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
    public static final class Creator implements Parcelable.Creator<Header> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Header createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Header header = new Header(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = ShareDataUIState + 39;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return header;
            }
            throw null;
        }

        @Override
        public Header createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 115;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Header headerCreateFromParcel = createFromParcel(parcel);
            int i4 = component1 + 25;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return headerCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Header[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 57;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            Header[] headerArr = new Header[i];
            int i6 = i3 + 47;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return headerArr;
        }

        @Override
        public Header[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 61;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                return newArray(i);
            }
            newArray(i);
            throw null;
        }
    }

    public Header(String str, int i, String str2, String str3, String str4) {
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
        int i2 = component1;
        int i3 = i2 + 89;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.requestRefId;
        int i4 = i2 + 61;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final int getResponseCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 3;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.responseCode;
        int i6 = i2 + 7;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String getResponseMessage() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 25;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.responseMessage;
        int i5 = i2 + 89;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCustomerMessage() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.customerMessage;
        }
        throw null;
    }

    public final String getTimestamp() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.timestamp;
        int i4 = i3 + 109;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        int i = component2 + 31;
        component3 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static Header copy$default(Header header, String str, int i, String str2, String str3, String str4, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = component1;
        int i5 = i4 + 123;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0 ? (i2 & 1) != 0 : (i2 & 1) != 0) {
            str = header.requestRefId;
        }
        String str5 = str;
        if ((i2 & 2) != 0) {
            i = header.responseCode;
        }
        int i6 = i;
        if ((i2 & 4) != 0) {
            str2 = header.responseMessage;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = header.customerMessage;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            int i7 = i4 + 81;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            str4 = header.timestamp;
            int i9 = i4 + 121;
            ShareDataUIState = i9 % 128;
            int i10 = i9 % 2;
        }
        return header.copy(str5, i6, str6, str7, str4);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 37;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.requestRefId;
            int i4 = 24 / 0;
        } else {
            str = this.requestRefId;
        }
        int i5 = i2 + 49;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 93;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.responseCode;
        int i6 = i2 + 69;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 121;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.responseMessage;
        int i5 = i2 + 73;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 47;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            str = this.customerMessage;
            int i4 = 97 / 0;
        } else {
            str = this.customerMessage;
        }
        int i5 = i3 + 75;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 56 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component1 + 49;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.timestamp;
        int i5 = i3 + 27;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Header copy(String requestRefId, int responseCode, String responseMessage, String customerMessage, String timestamp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(requestRefId, "");
        Intrinsics.checkNotNullParameter(responseMessage, "");
        Intrinsics.checkNotNullParameter(customerMessage, "");
        Intrinsics.checkNotNullParameter(timestamp, "");
        Header header = new Header(requestRefId, responseCode, responseMessage, customerMessage, timestamp);
        int i2 = component1 + 101;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 19 / 0;
        }
        return header;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 99;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 37;
        component1 = i5 % 128;
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
        if (!(other instanceof Header)) {
            int i2 = component1 + 17;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        Header header = (Header) other;
        if (!Intrinsics.areEqual(this.requestRefId, header.requestRefId) || this.responseCode != header.responseCode) {
            return false;
        }
        if (!Intrinsics.areEqual(this.responseMessage, header.responseMessage)) {
            int i4 = ShareDataUIState + 107;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.customerMessage, header.customerMessage)) {
            if (!(!Intrinsics.areEqual(this.timestamp, header.timestamp))) {
                return true;
            }
            int i6 = ShareDataUIState + 19;
            component1 = i6 % 128;
            return i6 % 2 == 0;
        }
        int i7 = component1 + 101;
        int i8 = i7 % 128;
        ShareDataUIState = i8;
        int i9 = i7 % 2;
        int i10 = i8 + 103;
        component1 = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 7;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.requestRefId.hashCode() * 31) + Integer.hashCode(this.responseCode)) * 31) + this.responseMessage.hashCode()) * 31) + this.customerMessage.hashCode()) * 31) + this.timestamp.hashCode();
        int i4 = ShareDataUIState + 65;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Header(requestRefId=" + this.requestRefId + ", responseCode=" + this.responseCode + ", responseMessage=" + this.responseMessage + ", customerMessage=" + this.customerMessage + ", timestamp=" + this.timestamp + ")";
        int i2 = ShareDataUIState + 31;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 115;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            dest.writeString(this.requestRefId);
            dest.writeInt(this.responseCode);
            dest.writeString(this.responseMessage);
            dest.writeString(this.customerMessage);
            dest.writeString(this.timestamp);
            throw null;
        }
        dest.writeString(this.requestRefId);
        dest.writeInt(this.responseCode);
        dest.writeString(this.responseMessage);
        dest.writeString(this.customerMessage);
        dest.writeString(this.timestamp);
        int i4 = component1 + 9;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }
}
