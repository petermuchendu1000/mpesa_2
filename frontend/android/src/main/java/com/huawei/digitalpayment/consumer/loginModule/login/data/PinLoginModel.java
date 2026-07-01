package com.huawei.digitalpayment.consumer.loginModule.login.data;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.PinLoginParams;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.network.PinLoginRepository;

public interface PinLoginModel extends BaseModel {
    default void pinLogin(PinLoginParams pinLoginParams, ApiCallback<LocalLoginInfo> apiCallback) {
        int i = 2 % 2;
        sendRequest(new PinLoginRepository(pinLoginParams), apiCallback);
    }
}
