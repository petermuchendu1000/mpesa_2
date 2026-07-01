package com.huawei.digitalpayment.consumer.profile.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.profile.model.local.LocalCustomer;
import com.huawei.digitalpayment.consumer.profile.model.request.ChangeProfileParams;
import com.huawei.digitalpayment.customer.dynamics.model.DynamicsElement;
import java.util.List;
import java.util.Map;

public interface IProfileModel extends BaseModel {
    void changeProfile(ChangeProfileParams changeProfileParams, ApiCallback<LocalCustomer> apiCallback);

    void getKycInfo(ApiCallback<Map<String, List<DynamicsElement>>> apiCallback);

    void verifyMsisdn(String str, ApiCallback<String> apiCallback);
}
