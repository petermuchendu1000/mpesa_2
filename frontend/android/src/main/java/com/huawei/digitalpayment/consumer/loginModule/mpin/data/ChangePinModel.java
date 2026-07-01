package com.huawei.digitalpayment.consumer.loginModule.mpin.data;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.PinLoginParams;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.network.PinLoginRepository;
import com.huawei.digitalpayment.consumer.loginModule.register.request.AuthSensitiveOperationParams;
import com.huawei.digitalpayment.consumer.loginModule.register.request.ChangePinParams;
import com.huawei.http.BaseResp;

public interface ChangePinModel extends BaseModel {
    void authSensitiveOperation(AuthSensitiveOperationParams authSensitiveOperationParams, ApiCallback<BaseResp> apiCallback);

    void changePin(ChangePinParams changePinParams, ApiCallback<BaseResp> apiCallback);

    default void pinLogin(PinLoginParams pinLoginParams, ApiCallback<LocalLoginInfo> apiCallback) {
        int i = 2 % 2;
        sendRequest(new PinLoginRepository(pinLoginParams), apiCallback);
    }
}
