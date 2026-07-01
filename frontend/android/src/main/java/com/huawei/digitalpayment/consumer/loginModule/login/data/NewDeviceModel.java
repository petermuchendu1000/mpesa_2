package com.huawei.digitalpayment.consumer.loginModule.login.data;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.IdentityVerifyParams;
import com.huawei.digitalpayment.consumer.loginModule.register.data.QueryIdTypesModel;

public interface NewDeviceModel extends QueryIdTypesModel {
    void identityVerify(IdentityVerifyParams identityVerifyParams, ApiCallback<LocalLoginInfo> apiCallback);

    void identityVerifyAndLogin(IdentityVerifyParams identityVerifyParams, ApiCallback<LocalLoginInfo> apiCallback);
}
