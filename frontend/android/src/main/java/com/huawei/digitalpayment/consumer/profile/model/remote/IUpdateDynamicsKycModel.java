package com.huawei.digitalpayment.consumer.profile.model.remote;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.profile.model.request.UpdateKycParams;
import com.huawei.digitalpayment.customer.dynamics.resp.KycInfoResp;
import com.huawei.http.BaseResp;

public interface IUpdateDynamicsKycModel extends BaseModel {
    void getKycInfo(ApiCallback<KycInfoResp> apiCallback);

    void updateKycInfo(UpdateKycParams updateKycParams, ApiCallback<BaseResp> apiCallback);
}
