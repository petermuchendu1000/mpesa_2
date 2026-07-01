package com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents;

import com.huawei.digitalpayment.consumer.base.database.entities.FrequentEntity;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentItem;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentMiniApp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0002¨\u0006\u0004"}, d2 = {"toFrequentMiniAppItem", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentItem$MiniAppItem;", "Lcom/huawei/digitalpayment/consumer/base/database/entities/FrequentEntity;", "toFrequentMiniAppEntity", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FrequentMiniAppRepositoryImplKt {
    private static int component3 = 0;
    private static int copydefault = 1;

    public static final FrequentEntity access$toFrequentMiniAppEntity(FrequentItem.MiniAppItem miniAppItem) {
        int i = 2 % 2;
        int i2 = component3 + 1;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            copydefault(miniAppItem);
            throw null;
        }
        FrequentEntity frequentEntityCopydefault = copydefault(miniAppItem);
        int i3 = copydefault + 7;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 80 / 0;
        }
        return frequentEntityCopydefault;
    }

    public static final FrequentItem.MiniAppItem access$toFrequentMiniAppItem(FrequentEntity frequentEntity) {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FrequentItem.MiniAppItem miniAppItemShareDataUIState = ShareDataUIState(frequentEntity);
        int i4 = copydefault + 23;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return miniAppItemShareDataUIState;
    }

    private static final FrequentItem.MiniAppItem ShareDataUIState(FrequentEntity frequentEntity) {
        int i = 2 % 2;
        int id = frequentEntity.getId();
        String name = frequentEntity.getName();
        String number = frequentEntity.getNumber();
        String iconUrl = frequentEntity.getIconUrl();
        FrequentItem.MiniAppItem miniAppItem = new FrequentItem.MiniAppItem(new FrequentMiniApp(String.valueOf(id), number, name, frequentEntity.getDescription(), iconUrl));
        int i2 = copydefault + 69;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return miniAppItem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029 A[PHI: r1
  0x0029: PHI (r1v4 java.lang.Integer) = (r1v3 java.lang.Integer), (r1v5 java.lang.Integer) binds: [B:10:0x0027, B:7:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final com.huawei.digitalpayment.consumer.base.database.entities.FrequentEntity copydefault(com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentItem.MiniAppItem r16) {
        /*
            r0 = 2
            int r1 = r0 % r0
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentMiniApp r1 = r16.getData()
            java.lang.String r1 = r1.getId()
            r2 = 0
            if (r1 == 0) goto L36
            int r3 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentMiniAppRepositoryImplKt.component3
            int r3 = r3 + 9
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentMiniAppRepositoryImplKt.copydefault = r4
            int r3 = r3 % r0
            if (r3 != 0) goto L23
            java.lang.Integer r1 = kotlin.text.StringsKt.toIntOrNull(r1)
            r3 = 61
            int r3 = r3 / r2
            if (r1 == 0) goto L36
            goto L29
        L23:
            java.lang.Integer r1 = kotlin.text.StringsKt.toIntOrNull(r1)
            if (r1 == 0) goto L36
        L29:
            int r2 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentMiniAppRepositoryImplKt.copydefault
            int r2 = r2 + 121
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentMiniAppRepositoryImplKt.component3 = r3
            int r2 = r2 % r0
            int r2 = r1.intValue()
        L36:
            r4 = r2
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentMiniApp r0 = r16.getData()
            java.lang.String r5 = r0.getName()
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentMiniApp r0 = r16.getData()
            java.lang.String r6 = r0.getAntId()
            com.huawei.digitalpayment.consumer.base.database.entities.FrequentType r7 = com.huawei.digitalpayment.consumer.base.database.entities.FrequentType.MINI_APP
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentMiniApp r0 = r16.getData()
            java.lang.String r12 = r0.getIconUrl()
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentMiniApp r0 = r16.getData()
            java.lang.String r11 = r0.getDescription()
            com.huawei.digitalpayment.consumer.base.database.entities.FrequentEntity r0 = new com.huawei.digitalpayment.consumer.base.database.entities.FrequentEntity
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = 0
            r14 = 624(0x270, float:8.74E-43)
            r15 = 0
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentMiniAppRepositoryImplKt.copydefault(com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentItem$MiniAppItem):com.huawei.digitalpayment.consumer.base.database.entities.FrequentEntity");
    }
}
