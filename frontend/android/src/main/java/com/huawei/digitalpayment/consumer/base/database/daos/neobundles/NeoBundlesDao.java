package com.huawei.digitalpayment.consumer.base.database.daos.neobundles;

import com.huawei.digitalpayment.consumer.base.database.entities.neobundles.entity.NeoProductEntity;
import com.huawei.digitalpayment.consumer.base.database.entities.neobundles.entity.NeoProductTypeEntity;
import com.huawei.digitalpayment.consumer.base.database.entities.neobundles.entity.NeoSubOfferingEntity;
import com.huawei.digitalpayment.consumer.base.database.entities.neobundles.relation.NeoProductFullDetails;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000fJ\u001c\u0010\u0010\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004H§@¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/daos/neobundles/NeoBundlesDao;", "", "getAllProductsWithDetails", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huawei/digitalpayment/consumer/base/database/entities/neobundles/relation/NeoProductFullDetails;", "insertProduct", "", "product", "Lcom/huawei/digitalpayment/consumer/base/database/entities/neobundles/entity/NeoProductEntity;", "(Lcom/huawei/digitalpayment/consumer/base/database/entities/neobundles/entity/NeoProductEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertSubOffering", "", "subOffering", "Lcom/huawei/digitalpayment/consumer/base/database/entities/neobundles/entity/NeoSubOfferingEntity;", "(Lcom/huawei/digitalpayment/consumer/base/database/entities/neobundles/entity/NeoSubOfferingEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertProductTypes", "types", "Lcom/huawei/digitalpayment/consumer/base/database/entities/neobundles/entity/NeoProductTypeEntity;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface NeoBundlesDao {
    Flow<List<NeoProductFullDetails>> getAllProductsWithDetails();

    Object insertProduct(NeoProductEntity neoProductEntity, Continuation<? super Unit> continuation);

    Object insertProductTypes(List<NeoProductTypeEntity> list, Continuation<? super Unit> continuation);

    Object insertSubOffering(NeoSubOfferingEntity neoSubOfferingEntity, Continuation<? super Long> continuation);
}
