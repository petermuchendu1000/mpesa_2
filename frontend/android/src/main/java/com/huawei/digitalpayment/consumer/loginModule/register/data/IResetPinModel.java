package com.huawei.digitalpayment.consumer.loginModule.register.data;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.PinLoginParams;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.network.PinLoginRepository;
import com.huawei.digitalpayment.consumer.loginModule.register.repository.ChangePinRepository;
import com.huawei.digitalpayment.consumer.loginModule.register.repository.ResetPinRepository;
import com.huawei.digitalpayment.consumer.loginModule.register.request.ChangePinParams;
import com.huawei.digitalpayment.consumer.loginModule.register.request.ReSetPinParams;
import com.huawei.http.BaseResp;

public interface IResetPinModel extends BaseModel {
    default void changePin(ChangePinParams changePinParams, ApiCallback<BaseResp> apiCallback) {
        int i = 2 % 2;
        sendRequest(new ChangePinRepository(changePinParams), apiCallback);
    }

    default void pinLogin(PinLoginParams pinLoginParams, ApiCallback<LocalLoginInfo> apiCallback) {
        int i = 2 % 2;
        sendRequest(new PinLoginRepository(pinLoginParams), apiCallback);
    }

    default void resetPin(ReSetPinParams reSetPinParams, ApiCallback<BaseResp> apiCallback) {
        int i = 2 % 2;
        sendRequest(new ResetPinRepository(reSetPinParams), apiCallback);
    }
}
