package com.huawei.digitalpayment.consumer.basicUi.pinfree.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.basicUi.response.FreePinResponse;
import com.huawei.http.BaseResp;

public interface ManagePinFreeModel extends BaseModel {
    void managePinFreePayment(String str, String str2, String str3, ApiCallback<BaseResp> apiCallback);

    void queryFreePin(ApiCallback<FreePinResponse> apiCallback);
}
