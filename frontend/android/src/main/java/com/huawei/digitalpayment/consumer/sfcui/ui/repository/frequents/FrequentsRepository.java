package com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents;

import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentCategory;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentItem;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\t0\bH&J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\bH&J\u0016\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/FrequentsRepository;", "", "saveFrequentItem", "", "frequentItem", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentItem;", "(Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFrequentTransactions", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentCategory;", "", "getFrequentMiniApps", "removeFrequentItem", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FrequentsRepository {
    Flow<List<FrequentItem>> getFrequentMiniApps();

    Flow<Map<FrequentCategory, List<FrequentItem>>> getFrequentTransactions();

    Object removeFrequentItem(FrequentItem frequentItem, Continuation<? super Unit> continuation);

    Object saveFrequentItem(FrequentItem frequentItem, Continuation<? super Unit> continuation);
}
