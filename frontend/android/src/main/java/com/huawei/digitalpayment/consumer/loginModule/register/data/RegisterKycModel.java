package com.huawei.digitalpayment.consumer.loginModule.register.data;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.register.request.RegisterParams;

public interface RegisterKycModel extends QueryIdTypesModel, GetRegisterKycModel {
    void asyncRegisterWithKyc(RegisterParams registerParams, ApiCallback<LocalLoginInfo> apiCallback);

    void registerWithKyc(RegisterParams registerParams, ApiCallback<LocalLoginInfo> apiCallback);
}
