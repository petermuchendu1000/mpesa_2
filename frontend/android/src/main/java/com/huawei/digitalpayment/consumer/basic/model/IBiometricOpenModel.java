package com.huawei.digitalpayment.consumer.basic.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.http.BaseResp;

public interface IBiometricOpenModel extends BaseModel {
    void biometricOpen(String str, String str2, String str3, ApiCallback<BaseResp> apiCallback);
}
