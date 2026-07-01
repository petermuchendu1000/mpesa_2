package com.huawei.digitalpayment.consumer.loginModule.login.data;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.OtpLoginParams;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.network.OtpLoginRepository;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.network.SendLoginSmsRepository;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.BaseResp;
import javax.inject.Inject;

public class DefaultOtpLoginModel implements OtpLoginModel {
    private static int component1 = 0;
    private static int copydefault = 1;

    @Inject
    public DefaultOtpLoginModel() {
    }

    @Override
    public void otpLogin(OtpLoginParams otpLoginParams, ApiCallback<LocalLoginInfo> apiCallback) {
        int i = 2 % 2;
        sendRequest(new OtpLoginRepository(otpLoginParams), apiCallback);
        int i2 = copydefault + 65;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void sendLoginSms(BaseRequestParams baseRequestParams, ApiCallback<BaseResp> apiCallback) {
        int i = 2 % 2;
        sendRequest(new SendLoginSmsRepository(baseRequestParams), apiCallback);
        int i2 = component1 + 85;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }
}
