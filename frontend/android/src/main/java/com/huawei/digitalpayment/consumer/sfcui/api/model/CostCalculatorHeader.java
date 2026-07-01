package com.huawei.digitalpayment.consumer.sfcui.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0018\u001a\u00020\u0006H\u0007J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH×\u0003J\t\u0010\u001d\u001a\u00020\u0006H×\u0001J\t\u0010\u001e\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0006H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006$"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/api/model/CostCalculatorHeader;", "Landroid/os/Parcelable;", Keys.KEY_CUSTOMER_MESSAGE, "", "requestRefId", "responseCode", "", "responseMessage", "timestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getCustomerMessage", "()Ljava/lang/String;", "getRequestRefId", "getResponseCode", "()I", "getResponseMessage", "getTimestamp", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CostCalculatorHeader implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<CostCalculatorHeader> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;

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
    public static final class Creator implements Parcelable.Creator<CostCalculatorHeader> {
        private static int component1 = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CostCalculatorHeader createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            CostCalculatorHeader costCalculatorHeader = new CostCalculatorHeader(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
            int i2 = component1 + 93;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return costCalculatorHeader;
        }

        @Override
        public CostCalculatorHeader createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 35;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            CostCalculatorHeader costCalculatorHeaderCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 93;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return costCalculatorHeaderCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CostCalculatorHeader[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 77;
            int i4 = i3 % 128;
            component2 = i4;
            CostCalculatorHeader[] costCalculatorHeaderArr = new CostCalculatorHeader[i];
            if (i3 % 2 != 0) {
                int i5 = 95 / 0;
            }
            int i6 = i4 + 57;
            component1 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 99 / 0;
            }
            return costCalculatorHeaderArr;
        }

        @Override
        public CostCalculatorHeader[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 91;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public CostCalculatorHeader(String str, String str2, int i, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.customerMessage = str;
        this.requestRefId = str2;
        this.responseCode = i;
        this.responseMessage = str3;
        this.timestamp = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CostCalculatorHeader(String str, String str2, int i, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        String str6 = "";
        if ((i2 & 1) != 0) {
            int i3 = component1 + 67;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            str = "";
        }
        if ((i2 & 2) != 0) {
            int i5 = component3 + 81;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i6 = 2 % 2;
            str5 = "";
        } else {
            str5 = str2;
        }
        int i7 = (i2 & 4) != 0 ? 0 : i;
        String str7 = (i2 & 8) != 0 ? "" : str3;
        if ((i2 & 16) != 0) {
            int i8 = component1 + 75;
            component3 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 % 2;
            }
        } else {
            str6 = str4;
        }
        this(str, str5, i7, str7, str6);
    }

    public final String getCustomerMessage() {
        int i = 2 % 2;
        int i2 = component1 + 5;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.customerMessage;
        int i5 = i3 + 83;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getRequestRefId() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 79;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.requestRefId;
        int i5 = i2 + 103;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int getResponseCode() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 49;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.responseCode;
        int i5 = i2 + 121;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final String getResponseMessage() {
        int i = 2 % 2;
        int i2 = component3 + 51;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.responseMessage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTimestamp() {
        int i = 2 % 2;
        int i2 = component3 + 85;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.timestamp;
        int i5 = i3 + 103;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = component2 + 61;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public CostCalculatorHeader() {
        this(null, null, 0, null, null, 31, null);
    }

    public static CostCalculatorHeader copy$default(CostCalculatorHeader costCalculatorHeader, String str, String str2, int i, String str3, String str4, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = component1;
        int i5 = i4 + 93;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 1) != 0) {
            str = costCalculatorHeader.customerMessage;
        }
        String str5 = str;
        if ((i2 & 2) != 0) {
            str2 = costCalculatorHeader.requestRefId;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            int i7 = i4 + 123;
            int i8 = i7 % 128;
            component3 = i8;
            int i9 = i7 % 2;
            i = costCalculatorHeader.responseCode;
            int i10 = i8 + 69;
            component1 = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = i;
        if ((i2 & 8) != 0) {
            str3 = costCalculatorHeader.responseMessage;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = costCalculatorHeader.timestamp;
        }
        return costCalculatorHeader.copy(str5, str6, i12, str7, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.customerMessage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 25;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.requestRefId;
        int i5 = i2 + 61;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int component3() {
        int i;
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 69;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            i = this.responseCode;
            int i5 = 44 / 0;
        } else {
            i = this.responseCode;
        }
        int i6 = i3 + 13;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 113;
        component1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.responseMessage;
        int i4 = i2 + 11;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 95;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.timestamp;
        int i5 = i2 + 119;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final CostCalculatorHeader copy(String customerMessage, String requestRefId, int responseCode, String responseMessage, String timestamp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(customerMessage, "");
        Intrinsics.checkNotNullParameter(requestRefId, "");
        Intrinsics.checkNotNullParameter(responseMessage, "");
        Intrinsics.checkNotNullParameter(timestamp, "");
        CostCalculatorHeader costCalculatorHeader = new CostCalculatorHeader(customerMessage, requestRefId, responseCode, responseMessage, timestamp);
        int i2 = component1 + 117;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return costCalculatorHeader;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 55;
        component1 = i3 % 128;
        int i4 = i3 % 2 != 0 ? 1 : 0;
        int i5 = i2 + 3;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof CostCalculatorHeader)) {
            int i2 = component3 + 111;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        CostCalculatorHeader costCalculatorHeader = (CostCalculatorHeader) other;
        if (!Intrinsics.areEqual(this.customerMessage, costCalculatorHeader.customerMessage) || (!Intrinsics.areEqual(this.requestRefId, costCalculatorHeader.requestRefId))) {
            return false;
        }
        if (this.responseCode == costCalculatorHeader.responseCode) {
            return Intrinsics.areEqual(this.responseMessage, costCalculatorHeader.responseMessage) && Intrinsics.areEqual(this.timestamp, costCalculatorHeader.timestamp);
        }
        int i4 = component3 + 119;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.customerMessage.hashCode() * 31) + this.requestRefId.hashCode()) * 31) + Integer.hashCode(this.responseCode)) * 31) + this.responseMessage.hashCode()) * 31) + this.timestamp.hashCode();
        int i4 = component1 + 111;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CostCalculatorHeader(customerMessage=" + this.customerMessage + ", requestRefId=" + this.requestRefId + ", responseCode=" + this.responseCode + ", responseMessage=" + this.responseMessage + ", timestamp=" + this.timestamp + ")";
        int i2 = component3 + 109;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 19;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            dest.writeString(this.customerMessage);
            dest.writeString(this.requestRefId);
            dest.writeInt(this.responseCode);
            dest.writeString(this.responseMessage);
            dest.writeString(this.timestamp);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        dest.writeString(this.customerMessage);
        dest.writeString(this.requestRefId);
        dest.writeInt(this.responseCode);
        dest.writeString(this.responseMessage);
        dest.writeString(this.timestamp);
        int i4 = component3 + 13;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }
}
