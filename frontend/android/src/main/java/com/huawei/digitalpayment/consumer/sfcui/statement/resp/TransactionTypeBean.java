package com.huawei.digitalpayment.consumer.sfcui.statement.resp;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0005H×\u0001J\t\u0010\u0016\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/TransactionTypeBean;", "", "transactionName", "", "transactionImage", "", "transactionBusinessType", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTransactionName", "()Ljava/lang/String;", "getTransactionImage", "()I", "getTransactionBusinessType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TransactionTypeBean {
    public static final int $stable = 0;
    private static int component1 = 0;
    private static int component2 = 1 % 128;
    private static int copy = 1;
    private static int getRequestBeneficiariesState;
    private final String ShareDataUIState;
    private final String component3;
    private final int copydefault;

    public TransactionTypeBean(String str, int i, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ShareDataUIState = str;
        this.copydefault = i;
        this.component3 = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TransactionTypeBean(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 4) != 0) {
            int i3 = copy + 65;
            int i4 = i3 % 128;
            getRequestBeneficiariesState = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 113;
            copy = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            str2 = null;
        }
        this(str, i, str2);
    }

    public final String getTransactionName() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 115;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 57;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int getTransactionImage() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 45;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.copydefault;
        int i6 = i2 + 69;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String getTransactionBusinessType() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 11;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 33;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        if (1 % 2 == 0) {
            int i = 26 / 0;
        }
    }

    public static TransactionTypeBean copy$default(TransactionTypeBean transactionTypeBean, String str, int i, String str2, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = getRequestBeneficiariesState + 7;
            copy = i4 % 128;
            if (i4 % 2 == 0) {
                str = transactionTypeBean.ShareDataUIState;
                int i5 = 22 / 0;
            } else {
                str = transactionTypeBean.ShareDataUIState;
            }
        }
        if ((i2 & 2) != 0) {
            i = transactionTypeBean.copydefault;
            int i6 = copy + 101;
            getRequestBeneficiariesState = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 3 / 3;
            }
        }
        if ((i2 & 4) != 0) {
            str2 = transactionTypeBean.component3;
        }
        return transactionTypeBean.copy(str, i, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 21;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i2 + 3;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = copy + 19;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        int i5 = this.copydefault;
        int i6 = i3 + 117;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 29;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 19;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final TransactionTypeBean copy(String transactionName, int transactionImage, String transactionBusinessType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(transactionName, "");
        TransactionTypeBean transactionTypeBean = new TransactionTypeBean(transactionName, transactionImage, transactionBusinessType);
        int i2 = getRequestBeneficiariesState + 19;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return transactionTypeBean;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.sfcui.statement.resp.TransactionTypeBean) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.sfcui.statement.resp.TransactionTypeBean) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.ShareDataUIState, r6.ShareDataUIState)) == true) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r5.copydefault == r6.copydefault) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.component3, r6.component3)) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.statement.resp.TransactionTypeBean.getRequestBeneficiariesState + 5;
        com.huawei.digitalpayment.consumer.sfcui.statement.resp.TransactionTypeBean.copy = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.statement.resp.TransactionTypeBean.copy + 63;
        com.huawei.digitalpayment.consumer.sfcui.statement.resp.TransactionTypeBean.getRequestBeneficiariesState = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if ((r6 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
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
            int r1 = com.huawei.digitalpayment.consumer.sfcui.statement.resp.TransactionTypeBean.copy
            int r1 = r1 + 5
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.statement.resp.TransactionTypeBean.getRequestBeneficiariesState = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L15
            int r1 = r3 / r3
            if (r5 != r6) goto L18
            goto L17
        L15:
            if (r5 != r6) goto L18
        L17:
            return r2
        L18:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.statement.resp.TransactionTypeBean
            if (r1 != 0) goto L1d
            return r3
        L1d:
            com.huawei.digitalpayment.consumer.sfcui.statement.resp.TransactionTypeBean r6 = (com.huawei.digitalpayment.consumer.sfcui.statement.resp.TransactionTypeBean) r6
            java.lang.String r1 = r5.ShareDataUIState
            java.lang.String r4 = r6.ShareDataUIState
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            r1 = r1 ^ r2
            if (r1 == r2) goto L54
            int r1 = r5.copydefault
            int r4 = r6.copydefault
            if (r1 == r4) goto L31
            return r3
        L31:
            java.lang.String r1 = r5.component3
            java.lang.String r6 = r6.component3
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            r6 = r6 ^ r2
            if (r6 == 0) goto L46
            int r6 = com.huawei.digitalpayment.consumer.sfcui.statement.resp.TransactionTypeBean.getRequestBeneficiariesState
            int r6 = r6 + 5
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.statement.resp.TransactionTypeBean.copy = r1
            int r6 = r6 % r0
            return r3
        L46:
            int r6 = com.huawei.digitalpayment.consumer.sfcui.statement.resp.TransactionTypeBean.copy
            int r6 = r6 + 63
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.statement.resp.TransactionTypeBean.getRequestBeneficiariesState = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L52
            return r2
        L52:
            r6 = 0
            throw r6
        L54:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.statement.resp.TransactionTypeBean.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.ShareDataUIState.hashCode();
        int iHashCode2 = Integer.hashCode(this.copydefault);
        String str = this.component3;
        if (str == null) {
            int i3 = copy + 55;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode3 = str.hashCode();
            int i5 = getRequestBeneficiariesState + 7;
            copy = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode3;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransactionTypeBean(transactionName=" + this.ShareDataUIState + ", transactionImage=" + this.copydefault + ", transactionBusinessType=" + this.component3 + ")";
        int i2 = copy + 101;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
