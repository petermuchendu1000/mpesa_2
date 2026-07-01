package com.huawei.digitalpayment.consumer.fixeddata.domain.repository;

import com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.home4g5g.Home4G5GAutoRenewOptOutPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.home4g5g.Home4G5GGetAccountDetailPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.home4g5g.Home4G5GGetAccountDetailResponse;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.home4g5g.Home4G5GGetPlansPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.home4g5g.Home4G5GPaymentPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.home4g5g.Home5GGetPlansResponse;
import com.huawei.payment.mvvm.Resource;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH&J(\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\fH&J\"\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u000eH&J\"\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u000eH&J\"\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u000eH&J\"\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0012H&¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/domain/repository/HomeWirelessRepository;", "", "getHome4G5GAccountDetails", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/home4g5g/Home4G5GGetAccountDetailResponse;", "payload", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/home4g5g/Home4G5GGetAccountDetailPayload;", "getHome4G5GPlans", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/home4g5g/Home5GGetPlansResponse;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/home4g5g/Home4G5GGetPlansPayload;", "home4G5GMpesaPayment", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/home4g5g/Home4G5GPaymentPayload;", "home4G5GPostPayPayment", "home4G5GEnoughBalPayment", "home4G5GAutoRenewOptOut", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/home4g5g/Home4G5GAutoRenewOptOutPayload;", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface HomeWirelessRepository {
    Flow<Resource<HaProxyResponse<Home4G5GGetAccountDetailResponse>>> getHome4G5GAccountDetails(Home4G5GGetAccountDetailPayload payload);

    Flow<Resource<HaProxyResponse<List<Home5GGetPlansResponse>>>> getHome4G5GPlans(Home4G5GGetPlansPayload payload);

    Flow<Resource<HaProxyResponse<Object>>> home4G5GAutoRenewOptOut(Home4G5GAutoRenewOptOutPayload payload);

    Flow<Resource<HaProxyResponse<Object>>> home4G5GEnoughBalPayment(Home4G5GPaymentPayload payload);

    Flow<Resource<HaProxyResponse<Object>>> home4G5GMpesaPayment(Home4G5GPaymentPayload payload);

    Flow<Resource<HaProxyResponse<Object>>> home4G5GPostPayPayment(Home4G5GPaymentPayload payload);
}
