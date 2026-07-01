package com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.resp;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0016H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/resp/StatementServiceResponse;", "Ljava/io/Serializable;", "ResponseBody", "Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/resp/StatementResponseBody;", "ResponseHeader", "Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/resp/StatementResponseHeader;", "<init>", "(Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/resp/StatementResponseBody;Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/resp/StatementResponseHeader;)V", "getResponseBody", "()Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/resp/StatementResponseBody;", "getResponseHeader", "()Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/resp/StatementResponseHeader;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcPochiWallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StatementServiceResponse implements Serializable {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 81 % 128;
    private static int component3;

    @SerializedName("ResponseBody")
    private final StatementResponseBody ResponseBody;

    @SerializedName("ResponseHeader")
    private final StatementResponseHeader ResponseHeader;

    public StatementServiceResponse(StatementResponseBody statementResponseBody, StatementResponseHeader statementResponseHeader) {
        Intrinsics.checkNotNullParameter(statementResponseBody, "");
        Intrinsics.checkNotNullParameter(statementResponseHeader, "");
        this.ResponseBody = statementResponseBody;
        this.ResponseHeader = statementResponseHeader;
    }

    public final StatementResponseBody getResponseBody() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 107;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        StatementResponseBody statementResponseBody = this.ResponseBody;
        int i5 = i2 + 37;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return statementResponseBody;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final StatementResponseHeader getResponseHeader() {
        int i = 2 % 2;
        int i2 = component1 + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        StatementResponseHeader statementResponseHeader = this.ResponseHeader;
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
        return statementResponseHeader;
    }

    static {
        if (81 % 2 == 0) {
            throw null;
        }
    }

    public static StatementServiceResponse copy$default(StatementServiceResponse statementServiceResponse, StatementResponseBody statementResponseBody, StatementResponseHeader statementResponseHeader, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1;
        int i4 = i3 + 63;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            statementResponseBody = statementServiceResponse.ResponseBody;
            int i6 = i3 + 7;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
        }
        if ((i & 2) != 0) {
            int i8 = i3 + 43;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
            statementResponseHeader = statementServiceResponse.ResponseHeader;
        }
        return statementServiceResponse.copy(statementResponseBody, statementResponseHeader);
    }

    public final StatementResponseBody component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        StatementResponseBody statementResponseBody = this.ResponseBody;
        int i5 = i3 + 89;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return statementResponseBody;
    }

    public final StatementResponseHeader component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 27;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        StatementResponseHeader statementResponseHeader = this.ResponseHeader;
        int i5 = i2 + 75;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return statementResponseHeader;
    }

    public final StatementServiceResponse copy(StatementResponseBody ResponseBody, StatementResponseHeader ResponseHeader) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(ResponseBody, "");
        Intrinsics.checkNotNullParameter(ResponseHeader, "");
        StatementServiceResponse statementServiceResponse = new StatementServiceResponse(ResponseBody, ResponseHeader);
        int i2 = ShareDataUIState + 3;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return statementServiceResponse;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 39;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 61 / 0;
            }
            return true;
        }
        if (!(other instanceof StatementServiceResponse)) {
            return false;
        }
        StatementServiceResponse statementServiceResponse = (StatementServiceResponse) other;
        if (!(!Intrinsics.areEqual(this.ResponseBody, statementServiceResponse.ResponseBody))) {
            return Intrinsics.areEqual(this.ResponseHeader, statementServiceResponse.ResponseHeader);
        }
        int i4 = ShareDataUIState + 7;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.ResponseBody.hashCode() * 31) + this.ResponseHeader.hashCode();
        int i4 = component1 + 67;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StatementServiceResponse(ResponseBody=" + this.ResponseBody + ", ResponseHeader=" + this.ResponseHeader + ")";
        int i2 = component1 + 67;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
