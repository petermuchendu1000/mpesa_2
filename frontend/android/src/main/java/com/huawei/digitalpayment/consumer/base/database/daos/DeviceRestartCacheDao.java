package com.huawei.digitalpayment.consumer.base.database.daos;

import com.huawei.digitalpayment.consumer.base.database.entities.DeviceRestartCacheEntity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/daos/DeviceRestartCacheDao;", "", "upsert", "", "entity", "Lcom/huawei/digitalpayment/consumer/base/database/entities/DeviceRestartCacheEntity;", "(Lcom/huawei/digitalpayment/consumer/base/database/entities/DeviceRestartCacheEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCachedState", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clear", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeviceRestartCacheDao {
    Object clear(Continuation<? super Unit> continuation);

    Object getCachedState(Continuation<? super DeviceRestartCacheEntity> continuation);

    Object upsert(DeviceRestartCacheEntity deviceRestartCacheEntity, Continuation<? super Unit> continuation);
}
