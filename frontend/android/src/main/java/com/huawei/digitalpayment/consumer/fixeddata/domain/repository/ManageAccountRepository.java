package com.huawei.digitalpayment.consumer.fixeddata.domain.repository;

import com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.manageAccount.ChangeWifiNamePayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.manageAccount.ChangeWifiPasswordPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.manageAccount.FetchProfilesPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.manageAccount.RestartRouterPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.manageAccount.WifiProfileResponse;
import com.huawei.payment.mvvm.Resource;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\"\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\nH&J\"\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\fH&J\"\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/domain/repository/ManageAccountRepository;", "", "fetchWifiProfile", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/manageAccount/WifiProfileResponse;", "payload", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/manageAccount/FetchProfilesPayload;", "restartRouter", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/manageAccount/RestartRouterPayload;", "changeWifiName", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/manageAccount/ChangeWifiNamePayload;", "changeWifiPassword", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/manageAccount/ChangeWifiPasswordPayload;", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ManageAccountRepository {
    Flow<Resource<HaProxyResponse<Object>>> changeWifiName(ChangeWifiNamePayload payload);

    Flow<Resource<HaProxyResponse<Object>>> changeWifiPassword(ChangeWifiPasswordPayload payload);

    Flow<Resource<HaProxyResponse<WifiProfileResponse>>> fetchWifiProfile(FetchProfilesPayload payload);

    Flow<Resource<HaProxyResponse<Object>>> restartRouter(RestartRouterPayload payload);
}
