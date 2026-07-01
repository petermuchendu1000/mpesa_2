package com.safaricom.consumer.commons.statements;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/safaricom/consumer/commons/statements/DisPlayItems;", "", "<init>", "()V", "TRANSACTION_ID", "", "SEND_MONEY_TYPE_ID", "PAY_BILL_TYPE_ID", "BUY_GOODS_TYPE_ID", "WITHDRAW_TYPE_ID", "createDisplayBeans", "", "Lcom/safaricom/consumer/commons/statements/DisplayBean;", "mpesaStatementTransactionResp", "Lcom/safaricom/consumer/commons/statements/StatementWrapper;", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DisPlayItems {
    public static final String BUY_GOODS_TYPE_ID = "20010";
    public static final DisPlayItems INSTANCE = new DisPlayItems();
    public static final String PAY_BILL_TYPE_ID = "20009";
    public static final String SEND_MONEY_TYPE_ID = "20020";
    public static final String TRANSACTION_ID = "transactionId";
    public static final String WITHDRAW_TYPE_ID = "20011";

    private DisPlayItems() {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.safaricom.consumer.commons.statements.DisplayBean> createDisplayBeans(com.safaricom.consumer.commons.statements.StatementWrapper r10) {
        /*
            r9 = this;
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r3 = r10.getMaskNumber()
            com.safaricom.consumer.commons.statements.Statement r0 = r10.getStatement()
            java.lang.String r0 = r0.getTransactionTypeID()
            int r1 = r0.hashCode()
            r2 = 47653691(0x2d7233b, float:3.1611632E-37)
            java.lang.String r7 = "20009"
            if (r1 == r2) goto L3f
            r2 = 47653713(0x2d72351, float:3.1611681E-37)
            if (r1 == r2) goto L33
            r2 = 47653744(0x2d72370, float:3.161175E-37)
            if (r1 == r2) goto L27
            goto L45
        L27:
            java.lang.String r1 = "20020"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L30
            goto L45
        L30:
            java.lang.String r0 = "Phone Number"
            goto L47
        L33:
            java.lang.String r1 = "20010"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3c
            goto L45
        L3c:
            java.lang.String r0 = "Till Number"
            goto L47
        L3f:
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L49
        L45:
            java.lang.String r0 = "Number"
        L47:
            r2 = r0
            goto L4c
        L49:
            java.lang.String r0 = "PayBillNumber"
            goto L47
        L4c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = r10.isFromNotification()
            if (r1 != 0) goto L63
            com.safaricom.consumer.commons.statements.DisplayBean r8 = new com.safaricom.consumer.commons.statements.DisplayBean
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r0.add(r8)
        L63:
            com.safaricom.consumer.commons.statements.DisplayBean r1 = new com.safaricom.consumer.commons.statements.DisplayBean
            com.safaricom.consumer.commons.statements.Statement r2 = r10.getStatement()
            java.lang.String r2 = r2.getId()
            java.lang.String r3 = "transactionId"
            java.lang.String r4 = "Transaction ID"
            r1.<init>(r4, r2, r3)
            r0.add(r1)
            com.safaricom.consumer.commons.statements.Statement r1 = r10.getStatement()
            java.lang.String r1 = r1.getTransactionTypeID()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r7)
            if (r1 == 0) goto L9c
            com.safaricom.consumer.commons.statements.DisplayBean r1 = new com.safaricom.consumer.commons.statements.DisplayBean
            java.lang.String r3 = "AccountNumber"
            com.safaricom.consumer.commons.statements.Statement r10 = r10.getStatement()
            java.lang.String r4 = r10.getAccountRef()
            r5 = 0
            r6 = 4
            r7 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r1)
        L9c:
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.List r10 = kotlin.collections.CollectionsKt.toMutableList(r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.consumer.commons.statements.DisPlayItems.createDisplayBeans(com.safaricom.consumer.commons.statements.StatementWrapper):java.util.List");
    }
}
