package com.huawei.digitalpayment.consumer.basicUi.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.basicUi.request.SendMessageParams;
import com.huawei.http.BaseResp;

public interface IAppShareModel extends BaseModel {
    void sendMessage(SendMessageParams sendMessageParams, ApiCallback<BaseResp> apiCallback);
}
