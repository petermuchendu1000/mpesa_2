package com.huawei.digitalpayment.consumer.login.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;

public interface IBiometricLoginModel extends BaseModel {
    void biometricLogin(String str, String str2, ApiCallback<LocalLoginInfo> apiCallback);
}
