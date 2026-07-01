package com.huawei.digitalpayment.consumer.base.database.daos;

import com.adjust.sdk.Constants;
import com.huawei.digitalpayment.consumer.base.database.entities.country.CountryCacheMetaEntity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/daos/CountryCacheMetaDao;", "", "insertOrUpdateCacheMeta", "", Constants.REFERRER_API_META, "Lcom/huawei/digitalpayment/consumer/base/database/entities/country/CountryCacheMetaEntity;", "(Lcom/huawei/digitalpayment/consumer/base/database/entities/country/CountryCacheMetaEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCacheMeta", "transactionType", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CountryCacheMetaDao {
    Object getCacheMeta(String str, Continuation<? super CountryCacheMetaEntity> continuation);

    Object insertOrUpdateCacheMeta(CountryCacheMetaEntity countryCacheMetaEntity, Continuation<? super Unit> continuation);
}
