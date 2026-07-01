package com.huawei.digitalpayment.consumer.base.database.daos;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.huawei.digitalpayment.consumer.base.database.entities.FrequentEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH'J\u0018\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0010H§@¢\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\b2\u0006\u0010\u0013\u001a\u00020\u0010H'J\u0016\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0010H§@¢\u0006\u0002\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/daos/FrequentsDao;", "", "insertFrequentItem", "", "frequentEntity", "Lcom/huawei/digitalpayment/consumer/base/database/entities/FrequentEntity;", "(Lcom/huawei/digitalpayment/consumer/base/database/entities/FrequentEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllFrequentItems", "Lkotlinx/coroutines/flow/Flow;", "", "getFrequentItemById", GriverCacheDao.COLUMN_CACHE_ID, "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFrequentItemByIdentifier", "number", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFrequentItemsByType", "type", "deleteFrequentItem", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FrequentsDao {
    Object deleteFrequentItem(String str, Continuation<? super Unit> continuation);

    Flow<List<FrequentEntity>> getAllFrequentItems();

    Object getFrequentItemById(int i, Continuation<? super FrequentEntity> continuation);

    Object getFrequentItemByIdentifier(String str, Continuation<? super FrequentEntity> continuation);

    Flow<List<FrequentEntity>> getFrequentItemsByType(String type);

    Object insertFrequentItem(FrequentEntity frequentEntity, Continuation<? super Unit> continuation);
}
