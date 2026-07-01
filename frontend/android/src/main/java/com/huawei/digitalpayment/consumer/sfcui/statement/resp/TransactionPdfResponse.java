package com.huawei.digitalpayment.consumer.sfcui.statement.resp;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\t\u0010\u001c\u001a\u00020\u0005H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/TransactionPdfResponse;", "", "data", "Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/DataResp;", "requestId", "", "status", "error", "Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/ErrorResp;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/DataResp;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/ErrorResp;)V", "getData", "()Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/DataResp;", "getRequestId", "()Ljava/lang/String;", "getStatus", "getError", "()Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/ErrorResp;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TransactionPdfResponse {
    public static final int $stable = 0;
    private static int component3 = 0;
    private static int copy = 1;
    private static int equals = 37 % 128;
    private static int getAsAtTimestamp;

    @SerializedName("data")
    private final DataResp ShareDataUIState;

    @SerializedName("requestId")
    private final String component1;

    @SerializedName("error")
    private final ErrorResp component2;

    @SerializedName("status")
    private final String copydefault;

    public TransactionPdfResponse(DataResp dataResp, String str, String str2, ErrorResp errorResp) {
        Intrinsics.checkNotNullParameter(dataResp, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(errorResp, "");
        this.ShareDataUIState = dataResp;
        this.component1 = str;
        this.copydefault = str2;
        this.component2 = errorResp;
    }

    public final DataResp getData() {
        DataResp dataResp;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 81;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 == 0) {
            dataResp = this.ShareDataUIState;
            int i4 = 5 / 0;
        } else {
            dataResp = this.ShareDataUIState;
        }
        int i5 = i3 + 87;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return dataResp;
    }

    public final String getRequestId() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 97;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component1;
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        return str;
    }

    public final String getStatus() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 35;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ErrorResp getError() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 111;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ErrorResp errorResp = this.component2;
        int i4 = i2 + 57;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return errorResp;
    }

    static {
        if (37 % 2 == 0) {
            int i = 54 / 0;
        }
    }

    public static TransactionPdfResponse copy$default(TransactionPdfResponse transactionPdfResponse, DataResp dataResp, String str, String str2, ErrorResp errorResp, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = getAsAtTimestamp + 121;
            copy = i3 % 128;
            int i4 = i3 % 2;
            dataResp = transactionPdfResponse.ShareDataUIState;
        }
        if ((i & 2) != 0) {
            int i5 = copy + 85;
            getAsAtTimestamp = i5 % 128;
            if (i5 % 2 != 0) {
                String str3 = transactionPdfResponse.component1;
                throw null;
            }
            str = transactionPdfResponse.component1;
        }
        if ((i & 4) != 0) {
            int i6 = copy + 69;
            getAsAtTimestamp = i6 % 128;
            if (i6 % 2 != 0) {
                String str4 = transactionPdfResponse.copydefault;
                throw null;
            }
            str2 = transactionPdfResponse.copydefault;
        }
        if ((i & 8) != 0) {
            int i7 = copy + 77;
            getAsAtTimestamp = i7 % 128;
            if (i7 % 2 != 0) {
                errorResp = transactionPdfResponse.component2;
                int i8 = 88 / 0;
            } else {
                errorResp = transactionPdfResponse.component2;
            }
        }
        TransactionPdfResponse transactionPdfResponseCopy = transactionPdfResponse.copy(dataResp, str, str2, errorResp);
        int i9 = getAsAtTimestamp + 91;
        copy = i9 % 128;
        int i10 = i9 % 2;
        return transactionPdfResponseCopy;
    }

    public final DataResp component1() {
        int i = 2 % 2;
        int i2 = copy + 101;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        DataResp dataResp = this.ShareDataUIState;
        int i4 = i3 + 103;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return dataResp;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 93;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 45;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 92 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 1;
        getAsAtTimestamp = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.copydefault;
        int i4 = i2 + 113;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final ErrorResp component4() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 111;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ErrorResp errorResp = this.component2;
        int i4 = i3 + 13;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
        return errorResp;
    }

    public final TransactionPdfResponse copy(DataResp data, String requestId, String status, ErrorResp error) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(data, "");
        Intrinsics.checkNotNullParameter(requestId, "");
        Intrinsics.checkNotNullParameter(status, "");
        Intrinsics.checkNotNullParameter(error, "");
        TransactionPdfResponse transactionPdfResponse = new TransactionPdfResponse(data, requestId, status, error);
        int i2 = copy + 57;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return transactionPdfResponse;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 1;
        copy = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionPdfResponse)) {
            int i5 = i2 + 113;
            copy = i5 % 128;
            return i5 % 2 == 0;
        }
        TransactionPdfResponse transactionPdfResponse = (TransactionPdfResponse) other;
        if (!Intrinsics.areEqual(this.ShareDataUIState, transactionPdfResponse.ShareDataUIState)) {
            int i6 = copy + 109;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component1, transactionPdfResponse.component1) || (!Intrinsics.areEqual(this.copydefault, transactionPdfResponse.copydefault)) || !Intrinsics.areEqual(this.component2, transactionPdfResponse.component2)) {
            return false;
        }
        int i8 = getAsAtTimestamp + 65;
        copy = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 76 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 83;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.ShareDataUIState.hashCode() * 31) + this.component1.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.component2.hashCode();
        int i4 = copy + 15;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransactionPdfResponse(data=" + this.ShareDataUIState + ", requestId=" + this.component1 + ", status=" + this.copydefault + ", error=" + this.component2 + ")";
        int i2 = copy + 13;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
