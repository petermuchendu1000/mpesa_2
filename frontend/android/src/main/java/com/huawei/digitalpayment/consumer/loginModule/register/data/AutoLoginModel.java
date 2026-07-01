package com.huawei.digitalpayment.consumer.loginModule.register.data;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.register.repository.AutoLoginRepository;

public interface AutoLoginModel extends BaseModel {
    default void autoLogin(ApiCallback<LocalLoginInfo> apiCallback) {
        int i = 2 % 2;
        sendRequest(new AutoLoginRepository(), apiCallback);
    }
}
