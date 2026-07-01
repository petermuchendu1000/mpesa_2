package com.huawei.digitalpayment.consumer.loginModule.register.data;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyForgotPinSmsResp;
import com.huawei.digitalpayment.consumer.loginModule.mpin.request.VerifyOtpParams;
import com.huawei.digitalpayment.consumer.loginModule.register.repository.ResetPinSmsCodeVerifyRepository;
import com.huawei.digitalpayment.consumer.loginModule.register.repository.SendResetPinSmsRepository;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.BaseResp;
import javax.inject.Inject;

public class DefaultResetOtpModel implements ResetOtpModel {
    private static int component2 = 0;
    private static int copydefault = 1;

    @Inject
    public DefaultResetOtpModel() {
    }

    @Override
    public void sendResetSms(BaseRequestParams baseRequestParams, ApiCallback<BaseResp> apiCallback) {
        int i = 2 % 2;
        sendRequest(new SendResetPinSmsRepository(baseRequestParams), apiCallback);
        int i2 = component2 + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void resetSmsCodeVerify(VerifyOtpParams verifyOtpParams, ApiCallback<VerifyForgotPinSmsResp> apiCallback) {
        int i = 2 % 2;
        sendRequest(new ResetPinSmsCodeVerifyRepository(verifyOtpParams), apiCallback);
        int i2 = component2 + 123;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }
}
