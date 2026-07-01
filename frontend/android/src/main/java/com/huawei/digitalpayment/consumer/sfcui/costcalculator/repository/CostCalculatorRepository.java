package com.huawei.digitalpayment.consumer.sfcui.costcalculator.repository;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.sfcui.api.model.CostCalculatorChargeBand;
import com.safaricom.consumer.commons.resource.Resource;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH¦@¢\u0006\u0002\u0010\tJ$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH¦@¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/repository/CostCalculatorRepository;", "", "getAllCharges", "Lkotlinx/coroutines/flow/Flow;", "Lcom/safaricom/consumer/commons/resource/Resource;", "", "Lcom/huawei/digitalpayment/consumer/sfcui/api/model/CostCalculatorChargeBand;", "forceRefresh", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkLipaTransactionCost", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/repository/LipaTransactionCost;", KeysConstants.SHORT_CODE, "", "amount", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CostCalculatorRepository {
    Object checkLipaTransactionCost(String str, int i, Continuation<? super Resource<LipaTransactionCost>> continuation);

    Object getAllCharges(boolean z, Continuation<? super Flow<? extends Resource<? extends List<CostCalculatorChargeBand>>>> continuation);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;

        public static Object getAllCharges$default(CostCalculatorRepository costCalculatorRepository, boolean z, Continuation continuation, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 59;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllCharges");
            }
            if ((i & 1) != 0) {
                int i6 = i4 + 73;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                z = false;
            }
            return costCalculatorRepository.getAllCharges(z, continuation);
        }
    }
}
