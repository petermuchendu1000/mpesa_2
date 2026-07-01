package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout;

import com.safaricom.consumer.commons.statements.DisPlayItems;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionResult;", "", DisPlayItems.TRANSACTION_ID, "", "status", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionStatus;", "message", "timestamp", "", "<init>", "(Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionStatus;Ljava/lang/String;J)V", "getTransactionId", "()Ljava/lang/String;", "getStatus", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionStatus;", "getMessage", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TransactionResult {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int copy = 0;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState = 5 % 128;
    private final long component1;
    private final String component2;
    private final TransactionStatus component3;
    private final String copydefault;

    public TransactionResult(String str, TransactionStatus transactionStatus, String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(transactionStatus, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.component2 = str;
        this.component3 = transactionStatus;
        this.copydefault = str2;
        this.component1 = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TransactionResult(String str, TransactionStatus transactionStatus, String str2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j2;
        long jCurrentTimeMillis;
        if ((i & 8) != 0) {
            int i2 = getAsAtTimestamp + 121;
            copy = i2 % 128;
            if (i2 % 2 != 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
                int i3 = 22 / 0;
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            int i4 = 2 % 2;
            j2 = jCurrentTimeMillis;
        } else {
            j2 = j;
        }
        this(str, transactionStatus, str2, j2);
    }

    public final String getTransactionId() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 27;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 41;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final TransactionStatus getStatus() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 17;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        throw null;
    }

    public final String getMessage() {
        int i = 2 % 2;
        int i2 = copy + 93;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final long getTimestamp() {
        int i = 2 % 2;
        int i2 = copy + 25;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        if (5 % 2 == 0) {
            throw null;
        }
    }

    public static TransactionResult copy$default(TransactionResult transactionResult, String str, TransactionStatus transactionStatus, String str2, long j, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp;
        int i4 = i3 + 9;
        copy = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            str = transactionResult.component2;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            int i6 = i3 + 125;
            int i7 = i6 % 128;
            copy = i7;
            int i8 = i6 % 2;
            transactionStatus = transactionResult.component3;
            int i9 = i7 + 55;
            getAsAtTimestamp = i9 % 128;
            int i10 = i9 % 2;
        }
        TransactionStatus transactionStatus2 = transactionStatus;
        if ((i & 4) != 0) {
            str2 = transactionResult.copydefault;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            j = transactionResult.component1;
        }
        return transactionResult.copy(str3, transactionStatus2, str4, j);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 25;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component2;
        if (i3 != 0) {
            int i4 = 9 / 0;
        }
        return str;
    }

    public final TransactionStatus component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 11;
        copy = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        TransactionStatus transactionStatus = this.component3;
        int i4 = i2 + 93;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return transactionStatus;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copy + 53;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        String str = this.copydefault;
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        return str;
    }

    public final long component4() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 113;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        int i3 = 93 / 0;
        return this.component1;
    }

    public final TransactionResult copy(String transactionId, TransactionStatus status, String message, long timestamp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(transactionId, "");
        Intrinsics.checkNotNullParameter(status, "");
        Intrinsics.checkNotNullParameter(message, "");
        TransactionResult transactionResult = new TransactionResult(transactionId, status, message, timestamp);
        int i2 = copy + 41;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 74 / 0;
        }
        return transactionResult;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r8 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionResult) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 123;
        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionResult.copy = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r8 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionResult) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.component2, r8.component2) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        r8 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionResult.getAsAtTimestamp + 81;
        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionResult.copy = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r7.component3 == r8.component3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.copydefault, r8.copydefault) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r7.component1 == r8.component1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        r8 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionResult.copy + 65;
        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionResult.getAsAtTimestamp = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionResult.copy
            int r1 = r1 + 71
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionResult.getAsAtTimestamp = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L16
            r1 = 92
            int r1 = r1 / r4
            if (r7 != r8) goto L19
            goto L18
        L16:
            if (r7 != r8) goto L19
        L18:
            return r3
        L19:
            boolean r1 = r8 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionResult
            if (r1 != 0) goto L25
            int r2 = r2 + 123
            int r8 = r2 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionResult.copy = r8
            int r2 = r2 % r0
            return r4
        L25:
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionResult r8 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionResult) r8
            java.lang.String r1 = r7.component2
            java.lang.String r2 = r8.component2
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L3b
            int r8 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionResult.getAsAtTimestamp
            int r8 = r8 + 81
            int r1 = r8 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionResult.copy = r1
            int r8 = r8 % r0
            return r4
        L3b:
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionStatus r1 = r7.component3
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionStatus r2 = r8.component3
            if (r1 == r2) goto L42
            return r4
        L42:
            java.lang.String r1 = r7.copydefault
            java.lang.String r2 = r8.copydefault
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L4d
            return r4
        L4d:
            long r1 = r7.component1
            long r5 = r8.component1
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 == 0) goto L5f
            int r8 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionResult.copy
            int r8 = r8 + 65
            int r1 = r8 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionResult.getAsAtTimestamp = r1
            int r8 = r8 % r0
            return r4
        L5f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionResult.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 111;
        copy = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? ((((this.component2.hashCode() % this.component3.hashCode()) % 105) - this.copydefault.hashCode()) % 76) / Long.hashCode(this.component1) : (((((this.component2.hashCode() * 31) + this.component3.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + Long.hashCode(this.component1);
        int i3 = getAsAtTimestamp + 61;
        copy = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 67 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransactionResult(transactionId=" + this.component2 + ", status=" + this.component3 + ", message=" + this.copydefault + ", timestamp=" + this.component1 + ')';
        int i2 = getAsAtTimestamp + 17;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
