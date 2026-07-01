package com.huawei.digitalpayment.consumer.loginModule.login.data;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.OtpLoginParams;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.BaseResp;

public interface OtpLoginModel extends PinLoginModel {
    void otpLogin(OtpLoginParams otpLoginParams, ApiCallback<LocalLoginInfo> apiCallback);

    void sendLoginSms(BaseRequestParams baseRequestParams, ApiCallback<BaseResp> apiCallback);
}
