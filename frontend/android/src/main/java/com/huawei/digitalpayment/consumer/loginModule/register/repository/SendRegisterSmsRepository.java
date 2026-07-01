package com.huawei.digitalpayment.consumer.loginModule.register.repository;

import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.BaseResp;

public class SendRegisterSmsRepository extends PaymentRequest<BaseResp> {
    private static int component1 = 1;
    private static int component2;

    public SendRegisterSmsRepository(BaseRequestParams baseRequestParams) {
        addParams(baseRequestParams);
        addParams("initiatorMsisdn", SPUtils.getInstance().getString("recent_login_phone_number"));
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 33;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 83;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return "sendRegisterSmsCode";
        }
        throw null;
    }
}
