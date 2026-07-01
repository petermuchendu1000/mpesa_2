package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.model.RoamingCashoutBody;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionNameCheckRepository;", "", "checkRoamingCashoutAgentName", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/Resource;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto;", "cashoutBody", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/RoamingCashoutBody;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TransactionNameCheckRepository {
    Flow<Resource<RoamingCashoutResponseDto>> checkRoamingCashoutAgentName(RoamingCashoutBody cashoutBody);
}
