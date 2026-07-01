package com.huawei.digitalpayment.consumer.base.database.repository;

import com.huawei.digitalpayment.consumer.base.database.daos.AllowedMiniAppsDao;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0086@¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/repository/MiniAppsDbRepository;", "", "allowedMiniAppsDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/AllowedMiniAppsDao;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/database/daos/AllowedMiniAppsDao;)V", "saveAllowedMiniAppsToDb", "", "lsApps", "", "Lcom/alibaba/griver/core/model/applist/FetchAppInfo;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiniAppsDbRepository {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private final AllowedMiniAppsDao component3;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.base.database.repository.MiniAppsDbRepository", f = "MiniAppsDbRepository.kt", i = {0, 0, 1}, l = {20, 23}, m = "saveAllowedMiniAppsToDb", n = {"this", "lsApps", "this"}, s = {"L$0", "L$1", "L$0"})
    static final class component3 extends ContinuationImpl {
        private static int equals = 1;
        private static int getAsAtTimestamp;
        Object ShareDataUIState;
        Object component1;
        int component2;
        Object copydefault;

        component3(Continuation<? super component3> continuation) {
            super(continuation);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 25;
            equals = i2 % 128;
            int i3 = i2 % 2;
            this.ShareDataUIState = obj;
            this.component2 |= Integer.MIN_VALUE;
            Object objSaveAllowedMiniAppsToDb = MiniAppsDbRepository.this.saveAllowedMiniAppsToDb(null, this);
            int i4 = getAsAtTimestamp + 37;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return objSaveAllowedMiniAppsToDb;
        }
    }

    @Inject
    public MiniAppsDbRepository(AllowedMiniAppsDao allowedMiniAppsDao) {
        Intrinsics.checkNotNullParameter(allowedMiniAppsDao, "");
        this.component3 = allowedMiniAppsDao;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1 A[Catch: Exception -> 0x00df, TryCatch #0 {Exception -> 0x00df, blocks: (B:27:0x0072, B:34:0x0094, B:35:0x009b, B:37:0x00a1, B:41:0x00d9, B:22:0x005d, B:30:0x0079), top: B:49:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveAllowedMiniAppsToDb(java.util.List<? extends com.alibaba.griver.core.model.applist.FetchAppInfo> r18, kotlin.coroutines.Continuation<? super java.lang.Boolean> r19) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.database.repository.MiniAppsDbRepository.saveAllowedMiniAppsToDb(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
