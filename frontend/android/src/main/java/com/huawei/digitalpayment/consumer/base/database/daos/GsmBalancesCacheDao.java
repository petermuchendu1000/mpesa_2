package com.huawei.digitalpayment.consumer.base.database.daos;

import com.huawei.digitalpayment.consumer.base.database.entities.GsmBalancesCacheEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H'J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\rJ\u001c\u0010\u000e\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\tJ$\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0097@¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/daos/GsmBalancesCacheDao;", "", "observeByMsisdn", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huawei/digitalpayment/consumer/base/database/entities/GsmBalancesCacheEntity;", "msisdn", "", "getByMsisdn", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upsert", "", "entity", "(Lcom/huawei/digitalpayment/consumer/base/database/entities/GsmBalancesCacheEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upsertAll", "entities", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteByMsisdn", "replaceForMsisdn", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface GsmBalancesCacheDao {
    Object deleteByMsisdn(String str, Continuation<? super Unit> continuation);

    Object getByMsisdn(String str, Continuation<? super List<GsmBalancesCacheEntity>> continuation);

    Flow<List<GsmBalancesCacheEntity>> observeByMsisdn(String msisdn);

    Object replaceForMsisdn(String str, List<GsmBalancesCacheEntity> list, Continuation<? super Unit> continuation);

    Object upsert(GsmBalancesCacheEntity gsmBalancesCacheEntity, Continuation<? super Unit> continuation);

    Object upsertAll(List<GsmBalancesCacheEntity> list, Continuation<? super Unit> continuation);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        private static int component1 = 1;
        private static int copydefault;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.base.database.daos.GsmBalancesCacheDao$DefaultImpls", f = "GsmBalancesCacheDao.kt", i = {0, 0}, l = {31, 32}, m = "replaceForMsisdn", n = {"$this", "entities"}, s = {"L$0", "L$1"})
        static final class ShareDataUIState extends ContinuationImpl {
            private static int copydefault = 0;
            private static int getAsAtTimestamp = 1;
            Object ShareDataUIState;
            int component1;
            Object component2;
            Object component3;

            ShareDataUIState(Continuation<? super ShareDataUIState> continuation) {
                super(continuation);
            }

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = getAsAtTimestamp + 103;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                this.component2 = obj;
                this.component1 |= Integer.MIN_VALUE;
                Object objReplaceForMsisdn = DefaultImpls.replaceForMsisdn(null, null, null, this);
                int i4 = getAsAtTimestamp + 105;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return objReplaceForMsisdn;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object replaceForMsisdn(com.huawei.digitalpayment.consumer.base.database.daos.GsmBalancesCacheDao r6, java.lang.String r7, java.util.List<com.huawei.digitalpayment.consumer.base.database.entities.GsmBalancesCacheEntity> r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.base.database.daos.GsmBalancesCacheDao.DefaultImpls.component1
                r2 = 1
                int r1 = r1 + r2
                int r3 = r1 % 128
                com.huawei.digitalpayment.consumer.base.database.daos.GsmBalancesCacheDao.DefaultImpls.copydefault = r3
                int r1 = r1 % r0
                if (r1 == 0) goto L17
                boolean r1 = r9 instanceof com.huawei.digitalpayment.consumer.base.database.daos.GsmBalancesCacheDao.DefaultImpls.ShareDataUIState
                r4 = 68
                int r4 = r4 / 0
                if (r1 == 0) goto L32
                goto L1b
            L17:
                boolean r1 = r9 instanceof com.huawei.digitalpayment.consumer.base.database.daos.GsmBalancesCacheDao.DefaultImpls.ShareDataUIState
                if (r1 == 0) goto L32
            L1b:
                int r3 = r3 + 95
                int r1 = r3 % 128
                com.huawei.digitalpayment.consumer.base.database.daos.GsmBalancesCacheDao.DefaultImpls.component1 = r1
                int r3 = r3 % r0
                r1 = r9
                com.huawei.digitalpayment.consumer.base.database.daos.GsmBalancesCacheDao$DefaultImpls$ShareDataUIState r1 = (com.huawei.digitalpayment.consumer.base.database.daos.GsmBalancesCacheDao.DefaultImpls.ShareDataUIState) r1
                int r3 = r1.component1
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r3 & r4
                if (r3 == 0) goto L32
                int r9 = r1.component1
                int r9 = r9 + r4
                r1.component1 = r9
                goto L37
            L32:
                com.huawei.digitalpayment.consumer.base.database.daos.GsmBalancesCacheDao$DefaultImpls$ShareDataUIState r1 = new com.huawei.digitalpayment.consumer.base.database.daos.GsmBalancesCacheDao$DefaultImpls$ShareDataUIState
                r1.<init>(r9)
            L37:
                java.lang.Object r9 = r1.component2
                java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r4 = r1.component1
                r5 = 0
                if (r4 == 0) goto L68
                if (r4 == r2) goto L5b
                if (r4 != r0) goto L53
                kotlin.ResultKt.throwOnFailure(r9)
                int r6 = com.huawei.digitalpayment.consumer.base.database.daos.GsmBalancesCacheDao.DefaultImpls.copydefault
                int r6 = r6 + 69
                int r7 = r6 % 128
                com.huawei.digitalpayment.consumer.base.database.daos.GsmBalancesCacheDao.DefaultImpls.component1 = r7
                int r6 = r6 % r0
                goto L91
            L53:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L5b:
                java.lang.Object r6 = r1.ShareDataUIState
                r8 = r6
                java.util.List r8 = (java.util.List) r8
                java.lang.Object r6 = r1.component3
                com.huawei.digitalpayment.consumer.base.database.daos.GsmBalancesCacheDao r6 = (com.huawei.digitalpayment.consumer.base.database.daos.GsmBalancesCacheDao) r6
                kotlin.ResultKt.throwOnFailure(r9)
                goto L84
            L68:
                kotlin.ResultKt.throwOnFailure(r9)
                r1.component3 = r6
                r1.ShareDataUIState = r8
                r1.component1 = r2
                java.lang.Object r7 = r6.deleteByMsisdn(r7, r1)
                if (r7 != r3) goto L84
                int r6 = com.huawei.digitalpayment.consumer.base.database.daos.GsmBalancesCacheDao.DefaultImpls.component1
                int r6 = r6 + 11
                int r7 = r6 % 128
                com.huawei.digitalpayment.consumer.base.database.daos.GsmBalancesCacheDao.DefaultImpls.copydefault = r7
                int r6 = r6 % r0
                if (r6 != 0) goto L83
                return r3
            L83:
                throw r5
            L84:
                r1.component3 = r5
                r1.ShareDataUIState = r5
                r1.component1 = r0
                java.lang.Object r6 = r6.upsertAll(r8, r1)
                if (r6 != r3) goto L91
                return r3
            L91:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.database.daos.GsmBalancesCacheDao.DefaultImpls.replaceForMsisdn(com.huawei.digitalpayment.consumer.base.database.daos.GsmBalancesCacheDao, java.lang.String, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }
}
