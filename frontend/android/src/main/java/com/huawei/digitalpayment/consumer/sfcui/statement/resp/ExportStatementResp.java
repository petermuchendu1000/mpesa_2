package com.huawei.digitalpayment.consumer.sfcui.statement.resp;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/ExportStatementResp;", "", "globalStatus", "", "requestId", "transactionPdfResponse", "Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/TransactionPdfResponse;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/TransactionPdfResponse;)V", "getGlobalStatus", "()Ljava/lang/String;", "getRequestId", "getTransactionPdfResponse", "()Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/TransactionPdfResponse;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExportStatementResp {
    public static final int $stable = 0;
    private static int component1 = 0;
    private static int copydefault = 1;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;

    @SerializedName("transactionPdfResponse")
    private final TransactionPdfResponse ShareDataUIState;

    @SerializedName("globalStatus")
    private final String component2;

    @SerializedName("requestId")
    private final String component3;

    public ExportStatementResp(String str, String str2, TransactionPdfResponse transactionPdfResponse) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(transactionPdfResponse, "");
        this.component2 = str;
        this.component3 = str2;
        this.ShareDataUIState = transactionPdfResponse;
    }

    public final String getGlobalStatus() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 5;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.component2;
        int i4 = i3 + 109;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
        return str;
    }

    public final String getRequestId() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 37;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 85;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TransactionPdfResponse getTransactionPdfResponse() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 121;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        TransactionPdfResponse transactionPdfResponse = this.ShareDataUIState;
        int i5 = i2 + 7;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 11 / 0;
        }
        return transactionPdfResponse;
    }

    static {
        int i = 1 + 27;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static ExportStatementResp copy$default(ExportStatementResp exportStatementResp, String str, String str2, TransactionPdfResponse transactionPdfResponse, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = exportStatementResp.component2;
        }
        if ((i & 2) != 0) {
            int i3 = getAsAtTimestamp + 121;
            getRequestBeneficiariesState = i3 % 128;
            if (i3 % 2 != 0) {
                String str3 = exportStatementResp.component3;
                throw null;
            }
            str2 = exportStatementResp.component3;
        }
        if ((i & 4) != 0) {
            int i4 = getRequestBeneficiariesState + 3;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            transactionPdfResponse = exportStatementResp.ShareDataUIState;
        }
        return exportStatementResp.copy(str, str2, transactionPdfResponse);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 27;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 101;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 49;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final TransactionPdfResponse component3() {
        TransactionPdfResponse transactionPdfResponse;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 45;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            transactionPdfResponse = this.ShareDataUIState;
            int i4 = 86 / 0;
        } else {
            transactionPdfResponse = this.ShareDataUIState;
        }
        int i5 = i2 + 101;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return transactionPdfResponse;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ExportStatementResp copy(String globalStatus, String requestId, TransactionPdfResponse transactionPdfResponse) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(globalStatus, "");
        Intrinsics.checkNotNullParameter(requestId, "");
        Intrinsics.checkNotNullParameter(transactionPdfResponse, "");
        ExportStatementResp exportStatementResp = new ExportStatementResp(globalStatus, requestId, transactionPdfResponse);
        int i2 = getAsAtTimestamp + 59;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return exportStatementResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 17;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExportStatementResp)) {
            return false;
        }
        ExportStatementResp exportStatementResp = (ExportStatementResp) other;
        if (!Intrinsics.areEqual(this.component2, exportStatementResp.component2)) {
            int i3 = getAsAtTimestamp + 67;
            getRequestBeneficiariesState = i3 % 128;
            return i3 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.component3, exportStatementResp.component3)) {
            return Intrinsics.areEqual(this.ShareDataUIState, exportStatementResp.ShareDataUIState);
        }
        int i4 = getAsAtTimestamp + 83;
        getRequestBeneficiariesState = i4 % 128;
        return i4 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 125;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.component2.hashCode() * 31) + this.component3.hashCode()) * 31) + this.ShareDataUIState.hashCode();
        int i4 = getRequestBeneficiariesState + 39;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ExportStatementResp(globalStatus=" + this.component2 + ", requestId=" + this.component3 + ", transactionPdfResponse=" + this.ShareDataUIState + ")";
        int i2 = getRequestBeneficiariesState + 79;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
