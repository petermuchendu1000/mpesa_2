package com.huawei.digitalpayment.consumer.base.database.daos.favorite;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.huawei.digitalpayment.consumer.base.database.entities.favorite.MpesaFavoriteEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000f0\u000eH'J\b\u0010\u0010\u001a\u00020\u0003H'¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/daos/favorite/MpesaFavoriteDao;", "", "insertFavoriteItem", "", "favoriteEntity", "Lcom/huawei/digitalpayment/consumer/base/database/entities/favorite/MpesaFavoriteEntity;", "(Lcom/huawei/digitalpayment/consumer/base/database/entities/favorite/MpesaFavoriteEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateFavoriteItem", "getFavoriteItemById", GriverCacheDao.COLUMN_CACHE_ID, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFavoriteItem", "getAllFavorites", "Lkotlinx/coroutines/flow/Flow;", "", "clearFavorites", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MpesaFavoriteDao {
    void clearFavorites();

    Object deleteFavoriteItem(String str, Continuation<? super Unit> continuation);

    Flow<List<MpesaFavoriteEntity>> getAllFavorites();

    Object getFavoriteItemById(String str, Continuation<? super MpesaFavoriteEntity> continuation);

    Object insertFavoriteItem(MpesaFavoriteEntity mpesaFavoriteEntity, Continuation<? super Unit> continuation);

    Object updateFavoriteItem(MpesaFavoriteEntity mpesaFavoriteEntity, Continuation<? super Unit> continuation);
}
