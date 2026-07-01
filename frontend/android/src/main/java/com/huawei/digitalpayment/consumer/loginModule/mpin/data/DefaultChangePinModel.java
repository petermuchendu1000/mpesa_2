package com.huawei.digitalpayment.consumer.loginModule.mpin.data;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.source.network.AuthSensitiveOperationRepository;
import com.huawei.digitalpayment.consumer.loginModule.register.repository.ChangePinRepository;
import com.huawei.digitalpayment.consumer.loginModule.register.request.AuthSensitiveOperationParams;
import com.huawei.digitalpayment.consumer.loginModule.register.request.ChangePinParams;
import com.huawei.http.BaseResp;
import javax.inject.Inject;

public class DefaultChangePinModel implements ChangePinModel {
    private static int ShareDataUIState = 1;
    private static int component1;

    @Inject
    public DefaultChangePinModel() {
    }

    @Override
    public void authSensitiveOperation(AuthSensitiveOperationParams authSensitiveOperationParams, ApiCallback<BaseResp> apiCallback) {
        int i = 2 % 2;
        sendRequest(new AuthSensitiveOperationRepository(authSensitiveOperationParams), apiCallback);
        int i2 = component1 + 59;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void changePin(ChangePinParams changePinParams, ApiCallback<BaseResp> apiCallback) {
        int i = 2 % 2;
        sendRequest(new ChangePinRepository(changePinParams), apiCallback);
        int i2 = component1 + 7;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 92 / 0;
        }
    }
}
