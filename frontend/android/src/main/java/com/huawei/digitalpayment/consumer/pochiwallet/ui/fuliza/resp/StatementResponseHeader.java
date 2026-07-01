package com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.resp;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H×\u0003J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\t\u0010\u0019\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/resp/StatementResponseHeader;", "Ljava/io/Serializable;", "DetailedMsg", "", "RequestRefID", "ResponseCode", "ResponseMsg", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDetailedMsg", "()Ljava/lang/String;", "getRequestRefID", "getResponseCode", "getResponseMsg", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcPochiWallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StatementResponseHeader implements Serializable {
    public static final int $stable = 0;
    private static int component1 = 63 % 128;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("DetailedMsg")
    private final String DetailedMsg;

    @SerializedName("RequestRefID")
    private final String RequestRefID;

    @SerializedName("ResponseCode")
    private final String ResponseCode;

    @SerializedName("ResponseMsg")
    private final String ResponseMsg;

    public StatementResponseHeader(String str, String str2, String str3, String str4) {
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
        int i2 = copydefault + 79;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.DetailedMsg;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getRequestRefID() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 125;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.RequestRefID;
        int i5 = i2 + 111;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getResponseCode() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 95;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.ResponseCode;
        int i4 = i2 + 15;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getResponseMsg() {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.ResponseMsg;
        int i5 = i3 + 75;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = 63 % 2;
    }

    public static StatementResponseHeader copy$default(StatementResponseHeader statementResponseHeader, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = statementResponseHeader.DetailedMsg;
        }
        if ((i & 2) != 0) {
            int i3 = copydefault + 75;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                str2 = statementResponseHeader.RequestRefID;
                int i4 = 52 / 0;
            } else {
                str2 = statementResponseHeader.RequestRefID;
            }
        }
        if ((i & 4) != 0) {
            int i5 = component2 + 79;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            str3 = statementResponseHeader.ResponseCode;
        }
        if ((i & 8) != 0) {
            str4 = statementResponseHeader.ResponseMsg;
            int i7 = component2 + 45;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
        }
        return statementResponseHeader.copy(str, str2, str3, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 125;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.DetailedMsg;
        int i5 = i2 + 23;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 119;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.RequestRefID;
        if (i3 != 0) {
            int i4 = 82 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.ResponseCode;
        int i5 = i3 + 37;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 29;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ResponseMsg;
        }
        throw null;
    }

    public final StatementResponseHeader copy(String DetailedMsg, String RequestRefID, String ResponseCode, String ResponseMsg) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(DetailedMsg, "");
        Intrinsics.checkNotNullParameter(RequestRefID, "");
        Intrinsics.checkNotNullParameter(ResponseCode, "");
        Intrinsics.checkNotNullParameter(ResponseMsg, "");
        StatementResponseHeader statementResponseHeader = new StatementResponseHeader(DetailedMsg, RequestRefID, ResponseCode, ResponseMsg);
        int i2 = copydefault + 105;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return statementResponseHeader;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 101;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        if (this == other) {
            int i6 = i2 + 111;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(other instanceof StatementResponseHeader)) {
            int i8 = i4 + 109;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        StatementResponseHeader statementResponseHeader = (StatementResponseHeader) other;
        if (!Intrinsics.areEqual(this.DetailedMsg, statementResponseHeader.DetailedMsg)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.RequestRefID, statementResponseHeader.RequestRefID)) {
            int i10 = copydefault + 63;
            component2 = i10 % 128;
            return i10 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.ResponseCode, statementResponseHeader.ResponseCode)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.ResponseMsg, statementResponseHeader.ResponseMsg)) {
            int i11 = component2;
            int i12 = i11 + 63;
            copydefault = i12 % 128;
            z = i12 % 2 != 0;
            int i13 = i11 + 47;
            copydefault = i13 % 128;
            int i14 = i13 % 2;
        }
        return z;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.DetailedMsg.hashCode();
        return i3 != 0 ? (((((iHashCode % 81) >>> this.RequestRefID.hashCode()) / 32) >> this.ResponseCode.hashCode()) * 35) % this.ResponseMsg.hashCode() : (((((iHashCode * 31) + this.RequestRefID.hashCode()) * 31) + this.ResponseCode.hashCode()) * 31) + this.ResponseMsg.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StatementResponseHeader(DetailedMsg=" + this.DetailedMsg + ", RequestRefID=" + this.RequestRefID + ", ResponseCode=" + this.ResponseCode + ", ResponseMsg=" + this.ResponseMsg + ")";
        int i2 = component2 + 5;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
