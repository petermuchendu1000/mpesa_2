package com.huawei.digitalpayment.consumer.base.resp;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/ResponseHeader;", "", "DetailedMsg", "", "RequestRefID", "ResponseCode", "ResponseMsg", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDetailedMsg", "()Ljava/lang/String;", "getRequestRefID", "getResponseCode", "getResponseMsg", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ResponseHeader {
    private static int component1 = 1;
    private static int component3;

    @SerializedName("DetailedMsg")
    private final String DetailedMsg;

    @SerializedName("ResponseRefID")
    private final String RequestRefID;

    @SerializedName("ResponseCode")
    private final String ResponseCode;

    @SerializedName("ResponseMsg")
    private final String ResponseMsg;

    public ResponseHeader(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.DetailedMsg = str;
        this.RequestRefID = str2;
        this.ResponseCode = str3;
        this.ResponseMsg = str4;
    }

    public final String getDetailedMsg() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 107;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.DetailedMsg;
        int i5 = i2 + 111;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getRequestRefID() {
        int i = 2 % 2;
        int i2 = component1 + 65;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.RequestRefID;
        int i4 = i3 + 7;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getResponseCode() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 1;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.ResponseCode;
        int i4 = i2 + 19;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getResponseMsg() {
        int i = 2 % 2;
        int i2 = component3 + 103;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.ResponseMsg;
        int i5 = i3 + 11;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static ResponseHeader copy$default(ResponseHeader responseHeader, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 121;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = responseHeader.DetailedMsg;
        }
        if ((i & 2) != 0) {
            str2 = responseHeader.RequestRefID;
        }
        if ((i & 4) != 0) {
            int i6 = i4 + 63;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            str3 = responseHeader.ResponseCode;
        }
        if ((i & 8) != 0) {
            int i8 = component1 + 1;
            component3 = i8 % 128;
            if (i8 % 2 != 0) {
                String str5 = responseHeader.ResponseMsg;
                throw null;
            }
            str4 = responseHeader.ResponseMsg;
        }
        return responseHeader.copy(str, str2, str3, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 111;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.DetailedMsg;
        int i5 = i2 + 121;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 17;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.RequestRefID;
        int i5 = i3 + 125;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 19;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.ResponseCode;
            int i4 = 23 / 0;
        } else {
            str = this.ResponseCode;
        }
        int i5 = i2 + 115;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 123;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ResponseMsg;
        int i5 = i2 + 119;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final ResponseHeader copy(String DetailedMsg, String RequestRefID, String ResponseCode, String ResponseMsg) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(DetailedMsg, "");
        Intrinsics.checkNotNullParameter(RequestRefID, "");
        Intrinsics.checkNotNullParameter(ResponseCode, "");
        Intrinsics.checkNotNullParameter(ResponseMsg, "");
        ResponseHeader responseHeader = new ResponseHeader(DetailedMsg, RequestRefID, ResponseCode, ResponseMsg);
        int i2 = component3 + 35;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return responseHeader;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 113;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (other instanceof ResponseHeader) {
            ResponseHeader responseHeader = (ResponseHeader) other;
            return Intrinsics.areEqual(this.DetailedMsg, responseHeader.DetailedMsg) && Intrinsics.areEqual(this.RequestRefID, responseHeader.RequestRefID) && Intrinsics.areEqual(this.ResponseCode, responseHeader.ResponseCode) && Intrinsics.areEqual(this.ResponseMsg, responseHeader.ResponseMsg);
        }
        int i5 = i2 + 87;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 39;
        component3 = i2 % 128;
        return i2 % 2 != 0 ? (((((r0 / 83) - this.RequestRefID.hashCode()) >>> 119) % this.ResponseCode.hashCode()) - 74) >>> this.ResponseMsg.hashCode() : (((((this.DetailedMsg.hashCode() * 31) + this.RequestRefID.hashCode()) * 31) + this.ResponseCode.hashCode()) * 31) + this.ResponseMsg.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ResponseHeader(DetailedMsg=" + this.DetailedMsg + ", RequestRefID=" + this.RequestRefID + ", ResponseCode=" + this.ResponseCode + ", ResponseMsg=" + this.ResponseMsg + ")";
        int i2 = component1 + 9;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
