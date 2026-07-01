package com.huawei.digitalpayment.consumer.base.database.daos.productcatalog;

import com.huawei.digitalpayment.consumer.base.database.entities.productcatalog.TunukiwaBundleEntity;
import com.huawei.digitalpayment.consumer.sfcui.api.FavouriteBundlesService;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\tH'¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/daos/productcatalog/TunukiwaBundleDao;", "", "insertBundles", "", FavouriteBundlesService.BUNDLES_PARAM, "", "Lcom/huawei/digitalpayment/consumer/base/database/entities/productcatalog/TunukiwaBundleEntity;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllBundles", "Lkotlinx/coroutines/flow/Flow;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TunukiwaBundleDao {
    Flow<List<TunukiwaBundleEntity>> getAllBundles();

    Object insertBundles(List<TunukiwaBundleEntity> list, Continuation<? super Unit> continuation);
}
