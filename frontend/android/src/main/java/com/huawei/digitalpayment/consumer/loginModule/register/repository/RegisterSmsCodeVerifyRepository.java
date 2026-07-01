package com.huawei.digitalpayment.consumer.loginModule.register.repository;

import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.BaseResp;

public class RegisterSmsCodeVerifyRepository extends PaymentRequest<BaseResp> {
    private static int ShareDataUIState = 1;
    private static int component1;

    public RegisterSmsCodeVerifyRepository(BaseRequestParams baseRequestParams) {
        addParams("initiatorMsisdn", SPUtils.getInstance().getString("recent_login_phone_number"));
        addParams(baseRequestParams);
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component1 + 113;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 11;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 84 / 0;
        }
        return "registerSmsCodeVerify";
    }
}
