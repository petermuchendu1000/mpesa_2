package com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents;

import com.huawei.digitalpayment.consumer.base.database.entities.FrequentEntity;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentItem;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0002¨\u0006\u0004"}, d2 = {"toFrequentTransactionItem", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentItem$TransactionItem;", "Lcom/huawei/digitalpayment/consumer/base/database/entities/FrequentEntity;", "toFrequentTransactionEntity", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FrequentTransactionRepositoryImplKt {
    private static int ShareDataUIState = 1;
    private static int component3;

    public static final FrequentEntity access$toFrequentTransactionEntity(FrequentItem.TransactionItem transactionItem) {
        int i = 2 % 2;
        int i2 = component3 + 107;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FrequentEntity frequentEntityComponent3 = component3(transactionItem);
        int i4 = component3 + 87;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return frequentEntityComponent3;
    }

    public static final FrequentItem.TransactionItem access$toFrequentTransactionItem(FrequentEntity frequentEntity) {
        int i = 2 % 2;
        int i2 = component3 + 39;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FrequentItem.TransactionItem transactionItemShareDataUIState = ShareDataUIState(frequentEntity);
        int i4 = ShareDataUIState + 55;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return transactionItemShareDataUIState;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0098 A[PHI: r1 r3 r4 r5 r6
  0x0098: PHI (r1v7 int) = (r1v4 int), (r1v5 int), (r1v8 int) binds: [B:8:0x0045, B:22:0x008b, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0098: PHI (r3v4 java.lang.String) = (r3v0 java.lang.String), (r3v1 java.lang.String), (r3v5 java.lang.String) binds: [B:8:0x0045, B:22:0x008b, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0098: PHI (r4v4 java.lang.String) = (r4v0 java.lang.String), (r4v1 java.lang.String), (r4v5 java.lang.String) binds: [B:8:0x0045, B:22:0x008b, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0098: PHI (r5v4 java.lang.String) = (r5v0 java.lang.String), (r5v1 java.lang.String), (r5v5 java.lang.String) binds: [B:8:0x0045, B:22:0x008b, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0098: PHI (r6v4 java.lang.String) = (r6v0 java.lang.String), (r6v1 java.lang.String), (r6v5 java.lang.String) binds: [B:8:0x0045, B:22:0x008b, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0047 A[PHI: r1 r3 r4 r5 r6 r7
  0x0047: PHI (r1v5 int) = (r1v4 int), (r1v8 int) binds: [B:8:0x0045, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0047: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v5 java.lang.String) binds: [B:8:0x0045, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0047: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v5 java.lang.String) binds: [B:8:0x0045, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0047: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v5 java.lang.String) binds: [B:8:0x0045, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0047: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v5 java.lang.String) binds: [B:8:0x0045, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0047: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v5 java.lang.String) binds: [B:8:0x0045, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentItem.TransactionItem ShareDataUIState(com.huawei.digitalpayment.consumer.base.database.entities.FrequentEntity r13) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentTransactionRepositoryImplKt.ShareDataUIState
            int r1 = r1 + 95
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentTransactionRepositoryImplKt.component3 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L2d
            int r1 = r13.getId()
            java.lang.String r3 = r13.getName()
            java.lang.String r4 = r13.getNumber()
            java.lang.String r5 = r13.getSecondaryNumber()
            java.lang.String r6 = r13.getIconUrl()
            java.lang.String r7 = r13.getTransactionType()
            r8 = 67
            int r8 = r8 / r2
            if (r7 == 0) goto L98
            goto L47
        L2d:
            int r1 = r13.getId()
            java.lang.String r3 = r13.getName()
            java.lang.String r4 = r13.getNumber()
            java.lang.String r5 = r13.getSecondaryNumber()
            java.lang.String r6 = r13.getIconUrl()
            java.lang.String r7 = r13.getTransactionType()
            if (r7 == 0) goto L98
        L47:
            com.safaricom.consumer.commons.transaction.TransactionType[] r8 = com.safaricom.consumer.commons.transaction.TransactionType.values()
            int r9 = r8.length
        L4c:
            if (r2 >= r9) goto L86
            int r10 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentTransactionRepositoryImplKt.component3
            int r10 = r10 + 41
            int r11 = r10 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentTransactionRepositoryImplKt.ShareDataUIState = r11
            int r10 = r10 % r0
            r11 = 1
            if (r10 != 0) goto L6a
            r10 = r8[r2]
            r12 = r10
            java.lang.Enum r12 = (java.lang.Enum) r12
            java.lang.String r12 = r12.name()
            boolean r11 = kotlin.text.StringsKt.equals(r12, r7, r11)
            if (r11 == 0) goto L83
            goto L79
        L6a:
            r10 = r8[r2]
            r12 = r10
            java.lang.Enum r12 = (java.lang.Enum) r12
            java.lang.String r12 = r12.name()
            boolean r11 = kotlin.text.StringsKt.equals(r12, r7, r11)
            if (r11 == 0) goto L83
        L79:
            int r2 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentTransactionRepositoryImplKt.component3
            int r2 = r2 + 89
            int r7 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentTransactionRepositoryImplKt.ShareDataUIState = r7
            int r2 = r2 % r0
            goto L87
        L83:
            int r2 = r2 + 1
            goto L4c
        L86:
            r10 = 0
        L87:
            java.lang.Enum r10 = (java.lang.Enum) r10
            com.safaricom.consumer.commons.transaction.TransactionType r10 = (com.safaricom.consumer.commons.transaction.TransactionType) r10
            if (r10 != 0) goto L8e
            goto L98
        L8e:
            int r2 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentTransactionRepositoryImplKt.ShareDataUIState
            int r2 = r2 + 43
            int r7 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentTransactionRepositoryImplKt.component3 = r7
            int r2 = r2 % r0
            goto L9a
        L98:
            com.safaricom.consumer.commons.transaction.TransactionType r10 = com.safaricom.consumer.commons.transaction.TransactionType.UNDEFINED
        L9a:
            r7 = r6
            r8 = r10
            r6 = r5
            r5 = r4
            r4 = r3
            java.lang.String r13 = r13.getTransactionTitle()
            if (r13 != 0) goto Lb0
            int r13 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentTransactionRepositoryImplKt.ShareDataUIState
            int r13 = r13 + 123
            int r2 = r13 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentTransactionRepositoryImplKt.component3 = r2
            int r13 = r13 % r0
            java.lang.String r13 = ""
        Lb0:
            r9 = r13
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentTransaction r13 = new com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentTransaction
            java.lang.String r3 = java.lang.String.valueOf(r1)
            r2 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentItem$TransactionItem r0 = new com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentItem$TransactionItem
            r0.<init>(r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentTransactionRepositoryImplKt.ShareDataUIState(com.huawei.digitalpayment.consumer.base.database.entities.FrequentEntity):com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentItem$TransactionItem");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final com.huawei.digitalpayment.consumer.base.database.entities.FrequentEntity component3(com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentItem.TransactionItem r15) {
        /*
            r0 = 2
            int r1 = r0 % r0
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentTransaction r1 = r15.getData()
            java.lang.String r1 = r1.getId()
            if (r1 == 0) goto L31
            int r2 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentTransactionRepositoryImplKt.component3
            int r2 = r2 + 75
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentTransactionRepositoryImplKt.ShareDataUIState = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L2c
            java.lang.Integer r1 = kotlin.text.StringsKt.toIntOrNull(r1)
            if (r1 == 0) goto L31
            int r2 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentTransactionRepositoryImplKt.ShareDataUIState
            int r2 = r2 + 93
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentTransactionRepositoryImplKt.component3 = r3
            int r2 = r2 % r0
            int r1 = r1.intValue()
            goto L40
        L2c:
            kotlin.text.StringsKt.toIntOrNull(r1)
            r15 = 0
            throw r15
        L31:
            int r1 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentTransactionRepositoryImplKt.component3
            int r1 = r1 + 111
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentTransactionRepositoryImplKt.ShareDataUIState = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L3f
            r1 = 3
            int r1 = r1 % 4
        L3f:
            r1 = 0
        L40:
            r3 = r1
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentTransaction r1 = r15.getData()
            java.lang.String r1 = r1.getDisplayName()
            if (r1 != 0) goto L58
            int r1 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentTransactionRepositoryImplKt.component3
            int r1 = r1 + 65
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentTransactionRepositoryImplKt.ShareDataUIState = r2
            int r1 = r1 % r0
            java.lang.String r0 = ""
            r4 = r0
            goto L59
        L58:
            r4 = r1
        L59:
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentTransaction r0 = r15.getData()
            java.lang.String r5 = r0.getNumber()
            com.huawei.digitalpayment.consumer.base.database.entities.FrequentType r6 = com.huawei.digitalpayment.consumer.base.database.entities.FrequentType.TRANSACTION
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentTransaction r0 = r15.getData()
            java.lang.String r7 = r0.getSecondaryNumber()
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentTransaction r0 = r15.getData()
            com.safaricom.consumer.commons.transaction.TransactionType r0 = r0.getTransactionType()
            java.lang.String r8 = r0.getOperationName()
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentTransaction r0 = r15.getData()
            java.lang.String r9 = r0.getTransactionTitle()
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentTransaction r15 = r15.getData()
            java.lang.String r11 = r15.getPhoto()
            com.huawei.digitalpayment.consumer.base.database.entities.FrequentEntity r15 = new com.huawei.digitalpayment.consumer.base.database.entities.FrequentEntity
            r10 = 0
            r12 = 0
            r13 = 640(0x280, float:8.97E-43)
            r14 = 0
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentTransactionRepositoryImplKt.component3(com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentItem$TransactionItem):com.huawei.digitalpayment.consumer.base.database.entities.FrequentEntity");
    }
}
