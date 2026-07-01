package com.huawei.digitalpayment.consumer.base.database.repository.mtandao;

import com.huawei.digitalpayment.consumer.base.database.entities.mtandao.SpeedTestsHistoryData;
import com.safaricom.mtandaoapp.database.dao.SpeedTestsHistoryDataDAO;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Singleton
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\rJ\u000e\u0010\u000f\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/repository/mtandao/SpeedTestsHistoryDataRepository;", "", "speedTestsHistoryDataDAO", "Lcom/safaricom/mtandaoapp/database/dao/SpeedTestsHistoryDataDAO;", "<init>", "(Lcom/safaricom/mtandaoapp/database/dao/SpeedTestsHistoryDataDAO;)V", "allSpeedTestdata", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huawei/digitalpayment/consumer/base/database/entities/mtandao/SpeedTestsHistoryData;", "insert", "", "speedTestsHistoryData", "(Lcom/huawei/digitalpayment/consumer/base/database/entities/mtandao/SpeedTestsHistoryData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "delete", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SpeedTestsHistoryDataRepository {
    private static int component3 = 0;
    private static int copydefault = 1;
    private final SpeedTestsHistoryDataDAO component1;

    @Inject
    public SpeedTestsHistoryDataRepository(SpeedTestsHistoryDataDAO speedTestsHistoryDataDAO) {
        Intrinsics.checkNotNullParameter(speedTestsHistoryDataDAO, "");
        this.component1 = speedTestsHistoryDataDAO;
    }

    public final Flow<List<SpeedTestsHistoryData>> allSpeedTestdata() {
        int i = 2 % 2;
        int i2 = component3 + 89;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            this.component1.getAllSpeedTestsHistoryData();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Flow<List<SpeedTestsHistoryData>> allSpeedTestsHistoryData = this.component1.getAllSpeedTestsHistoryData();
        int i3 = component3 + 61;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return allSpeedTestsHistoryData;
    }

    public final Object insert(SpeedTestsHistoryData speedTestsHistoryData, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        Object objInsertSpeedTestsHistoryData = this.component1.insertSpeedTestsHistoryData(speedTestsHistoryData, continuation);
        if (objInsertSpeedTestsHistoryData != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            Unit unit = Unit.INSTANCE;
            int i2 = copydefault + 1;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return unit;
            }
            throw null;
        }
        int i3 = copydefault + 25;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 1;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return objInsertSpeedTestsHistoryData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if ((r5 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r4 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r4 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r5 = com.huawei.digitalpayment.consumer.base.database.repository.mtandao.SpeedTestsHistoryDataRepository.copydefault + 115;
        com.huawei.digitalpayment.consumer.base.database.repository.mtandao.SpeedTestsHistoryDataRepository.component3 = r5 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object update(com.huawei.digitalpayment.consumer.base.database.entities.mtandao.SpeedTestsHistoryData r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.base.database.repository.mtandao.SpeedTestsHistoryDataRepository.component3
            int r1 = r1 + 85
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.database.repository.mtandao.SpeedTestsHistoryDataRepository.copydefault = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1f
            com.safaricom.mtandaoapp.database.dao.SpeedTestsHistoryDataDAO r1 = r3.component1
            java.lang.Object r4 = r1.updateSpeedTestsHistoryData(r4, r5)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r1 = 92
            int r1 = r1 / 0
            if (r4 != r5) goto L3c
            goto L2b
        L1f:
            com.safaricom.mtandaoapp.database.dao.SpeedTestsHistoryDataDAO r1 = r3.component1
            java.lang.Object r4 = r1.updateSpeedTestsHistoryData(r4, r5)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r5) goto L3c
        L2b:
            int r5 = com.huawei.digitalpayment.consumer.base.database.repository.mtandao.SpeedTestsHistoryDataRepository.copydefault
            int r5 = r5 + 115
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.base.database.repository.mtandao.SpeedTestsHistoryDataRepository.component3 = r1
            int r5 = r5 % r0
            if (r5 != 0) goto L37
            return r4
        L37:
            r4 = 0
            r4.hashCode()
            throw r4
        L3c:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.database.repository.mtandao.SpeedTestsHistoryDataRepository.update(com.huawei.digitalpayment.consumer.base.database.entities.mtandao.SpeedTestsHistoryData, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object delete(Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.component1.deleteAllSpeedTestsHistoryData(continuation);
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            obj.hashCode();
            throw null;
        }
        Object objDeleteAllSpeedTestsHistoryData = this.component1.deleteAllSpeedTestsHistoryData(continuation);
        if (objDeleteAllSpeedTestsHistoryData != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            Unit unit = Unit.INSTANCE;
            int i3 = component3 + 97;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        int i5 = component3 + 37;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return objDeleteAllSpeedTestsHistoryData;
        }
        obj.hashCode();
        throw null;
    }
}
