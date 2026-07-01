package com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.huawei.digitalpayment.consumer.base.database.daos.FrequentsDao;
import com.huawei.digitalpayment.consumer.base.database.entities.FrequentEntity;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00110\u00102\u0006\u0010\u0012\u001a\u00020\rJ\u0016\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/FrequentsLocalDatasource;", "", "frequentsDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/FrequentsDao;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/database/daos/FrequentsDao;)V", "insertFrequentItem", "", "frequentEntity", "Lcom/huawei/digitalpayment/consumer/base/database/entities/FrequentEntity;", "(Lcom/huawei/digitalpayment/consumer/base/database/entities/FrequentEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFrequentItemByIdentifier", "identifier", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFrequentItemsByType", "Lkotlinx/coroutines/flow/Flow;", "", "type", "deleteFrequentItem", GriverCacheDao.COLUMN_CACHE_ID, "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FrequentsLocalDatasource {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault;
    private final FrequentsDao component3;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentsLocalDatasource", f = "FrequentsLocalDatasource.kt", i = {}, l = {15}, m = "insertFrequentItem", n = {}, s = {})
    static final class component2 extends ContinuationImpl {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        int component2;
        Object component3;

        component2(Continuation<? super component2> continuation) {
            super(continuation);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 89;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            this.component3 = obj;
            this.component2 |= Integer.MIN_VALUE;
            Object obj2 = null;
            Object objInsertFrequentItem = FrequentsLocalDatasource.this.insertFrequentItem(null, this);
            int i4 = component1 + 119;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return objInsertFrequentItem;
            }
            obj2.hashCode();
            throw null;
        }
    }

    @Inject
    public FrequentsLocalDatasource(FrequentsDao frequentsDao) {
        Intrinsics.checkNotNullParameter(frequentsDao, "");
        this.component3 = frequentsDao;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0066 -> B:26:0x0069). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object insertFrequentItem(com.huawei.digitalpayment.consumer.base.database.entities.FrequentEntity r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentsLocalDatasource.component2
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto La
            goto L2c
        La:
            int r1 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentsLocalDatasource.copydefault
            int r1 = r1 + 101
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentsLocalDatasource.component2 = r3
            int r1 = r1 % r0
            r1 = r7
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentsLocalDatasource$component2 r1 = (com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentsLocalDatasource.component2) r1
            int r3 = r1.component2
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L2c
            int r7 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentsLocalDatasource.copydefault
            int r7 = r7 + 65
            int r3 = r7 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentsLocalDatasource.component2 = r3
            int r7 = r7 % r0
            int r7 = r1.component2
            int r7 = r7 + r4
            r1.component2 = r7
            goto L31
        L2c:
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentsLocalDatasource$component2 r1 = new com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentsLocalDatasource$component2
            r1.<init>(r7)
        L31:
            java.lang.Object r7 = r1.component3
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r1.component2
            if (r4 == 0) goto L57
            int r6 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentsLocalDatasource.component2
            int r6 = r6 + 93
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentsLocalDatasource.copydefault = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L49
            if (r4 != r2) goto L4f
            goto L4b
        L49:
            if (r4 != r2) goto L4f
        L4b:
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Exception -> L65
            goto L69
        L4f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L57:
            kotlin.ResultKt.throwOnFailure(r7)
            com.huawei.digitalpayment.consumer.base.database.daos.FrequentsDao r7 = r5.component3     // Catch: java.lang.Exception -> L65
            r1.component2 = r2     // Catch: java.lang.Exception -> L65
            java.lang.Object r6 = r7.insertFrequentItem(r6, r1)     // Catch: java.lang.Exception -> L65
            if (r6 != r3) goto L69
            return r3
        L65:
            r6 = move-exception
            r6.printStackTrace()
        L69:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentsLocalDatasource.insertFrequentItem(com.huawei.digitalpayment.consumer.base.database.entities.FrequentEntity, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object getFrequentItemByIdentifier(String str, Continuation<? super FrequentEntity> continuation) {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Object frequentItemByIdentifier = this.component3.getFrequentItemByIdentifier(str, continuation);
        int i4 = component2 + 85;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return frequentItemByIdentifier;
    }

    public final Flow<List<FrequentEntity>> getFrequentItemsByType(String type) {
        int i = 2 % 2;
        int i2 = copydefault + 107;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(type, "");
        Flow<List<FrequentEntity>> frequentItemsByType = this.component3.getFrequentItemsByType(type);
        int i4 = copydefault + 115;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return frequentItemsByType;
    }

    public final Object deleteFrequentItem(String str, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Object objDeleteFrequentItem = this.component3.deleteFrequentItem(str, continuation);
        if (objDeleteFrequentItem != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return Unit.INSTANCE;
        }
        int i4 = component2 + 37;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return objDeleteFrequentItem;
    }

    static {
        int i = 1 + 101;
        component1 = i % 128;
        int i2 = i % 2;
    }
}
