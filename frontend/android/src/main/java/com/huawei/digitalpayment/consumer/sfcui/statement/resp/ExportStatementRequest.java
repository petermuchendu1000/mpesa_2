package com.huawei.digitalpayment.consumer.sfcui.statement.resp;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/ExportStatementRequest;", "", "transactionsPdf", "Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/TransactionsPdf;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/TransactionsPdf;)V", "getTransactionsPdf", "()Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/TransactionsPdf;", "setTransactionsPdf", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExportStatementRequest {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;
    private TransactionsPdf ShareDataUIState;

    public ExportStatementRequest(TransactionsPdf transactionsPdf) {
        this.ShareDataUIState = transactionsPdf;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExportStatementRequest(TransactionsPdf transactionsPdf, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component2 + 79;
            component1 = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            transactionsPdf = null;
        }
        this(transactionsPdf);
    }

    public final TransactionsPdf getTransactionsPdf() {
        int i = 2 % 2;
        int i2 = component1 + 115;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        TransactionsPdf transactionsPdf = this.ShareDataUIState;
        int i5 = i3 + 25;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return transactionsPdf;
    }

    public final void setTransactionsPdf(TransactionsPdf transactionsPdf) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 91;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.ShareDataUIState = transactionsPdf;
        int i5 = i2 + 51;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        int i = 1 + 125;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExportStatementRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static ExportStatementRequest copy$default(ExportStatementRequest exportStatementRequest, TransactionsPdf transactionsPdf, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 57;
        component1 = i4 % 128;
        int i5 = i & 1;
        if (i4 % 2 == 0 ? i5 != 0 : i5 != 0) {
            transactionsPdf = exportStatementRequest.ShareDataUIState;
            int i6 = i3 + 121;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 5 / 3;
            }
        }
        return exportStatementRequest.copy(transactionsPdf);
    }

    public final TransactionsPdf component1() {
        int i = 2 % 2;
        int i2 = component1 + 3;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        TransactionsPdf transactionsPdf = this.ShareDataUIState;
        int i5 = i3 + 61;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return transactionsPdf;
    }

    public final ExportStatementRequest copy(TransactionsPdf transactionsPdf) {
        int i = 2 % 2;
        ExportStatementRequest exportStatementRequest = new ExportStatementRequest(transactionsPdf);
        int i2 = component1 + 89;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return exportStatementRequest;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.sfcui.statement.resp.ExportStatementRequest) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 85;
        com.huawei.digitalpayment.consumer.sfcui.statement.resp.ExportStatementRequest.component1 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.ShareDataUIState, ((com.huawei.digitalpayment.consumer.sfcui.statement.resp.ExportStatementRequest) r6).ShareDataUIState) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.statement.resp.ExportStatementRequest.component1 + 83;
        com.huawei.digitalpayment.consumer.sfcui.statement.resp.ExportStatementRequest.component2 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.statement.resp.ExportStatementRequest.component1
            int r1 = r1 + 69
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.statement.resp.ExportStatementRequest.component2 = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L16
            r1 = 87
            int r1 = r1 / r4
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r3
        L19:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.statement.resp.ExportStatementRequest
            if (r1 != 0) goto L25
            int r2 = r2 + 85
            int r6 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.statement.resp.ExportStatementRequest.component1 = r6
            int r2 = r2 % r0
            return r4
        L25:
            com.huawei.digitalpayment.consumer.sfcui.statement.resp.ExportStatementRequest r6 = (com.huawei.digitalpayment.consumer.sfcui.statement.resp.ExportStatementRequest) r6
            com.huawei.digitalpayment.consumer.sfcui.statement.resp.TransactionsPdf r1 = r5.ShareDataUIState
            com.huawei.digitalpayment.consumer.sfcui.statement.resp.TransactionsPdf r6 = r6.ShareDataUIState
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 != 0) goto L3b
            int r6 = com.huawei.digitalpayment.consumer.sfcui.statement.resp.ExportStatementRequest.component1
            int r6 = r6 + 83
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.statement.resp.ExportStatementRequest.component2 = r1
            int r6 = r6 % r0
            return r4
        L3b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.statement.resp.ExportStatementRequest.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component2 + 33;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        TransactionsPdf transactionsPdf = this.ShareDataUIState;
        if (transactionsPdf == null) {
            int i4 = i3 + 61;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = transactionsPdf.hashCode();
        }
        int i6 = component2 + 83;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ExportStatementRequest(transactionsPdf=" + this.ShareDataUIState + ")";
        int i2 = component1 + 103;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
