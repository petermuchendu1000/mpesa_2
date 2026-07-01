package com.huawei.digitalpayment.consumer.loginModule.register.repository;

import com.blankj.utilcode.util.GsonUtils;
import com.google.gson.JsonObject;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyForgotPinSmsResp;
import com.huawei.digitalpayment.consumer.loginModule.mpin.request.VerifyOtpParams;

public class ResetPinSmsCodeVerifyRepository extends PaymentRequest<VerifyForgotPinSmsResp> {
    private static int component1 = 1;
    private static int component2;

    @Override
    public Object convert(JsonObject jsonObject) {
        int i = 2 % 2;
        int i2 = component2 + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        VerifyForgotPinSmsResp verifyForgotPinSmsRespConvert = convert(jsonObject);
        int i4 = component1 + 113;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return verifyForgotPinSmsRespConvert;
    }

    public ResetPinSmsCodeVerifyRepository(VerifyOtpParams verifyOtpParams) {
        addParams("initiatorMsisdn", SPUtils.getInstance().getString("recent_login_phone_number"));
        addParams(verifyOtpParams);
    }

    @Override
    public VerifyForgotPinSmsResp convert(JsonObject jsonObject) {
        int i = 2 % 2;
        int i2 = component2 + 25;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        VerifyForgotPinSmsResp verifyForgotPinSmsResp = (VerifyForgotPinSmsResp) GsonUtils.fromJson(jsonObject.toString(), VerifyForgotPinSmsResp.class);
        int i4 = component1 + 23;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return verifyForgotPinSmsResp;
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component2 + 67;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 59;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return "verifyForgetPinSms";
    }
}
