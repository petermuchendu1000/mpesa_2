package com.huawei.digitalpayment.consumer.loginModule.mpin.data;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.loginModule.mpin.request.GetPinTokenParams;

public interface IGetTokenModel extends BaseModel {
    void getPinToken(GetPinTokenParams getPinTokenParams, ApiCallback<String> apiCallback);
}
