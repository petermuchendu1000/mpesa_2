package com.huawei.digitalpayment.consumer.loginModule.register.repository;

import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.BaseResp;

public class SendResetPinSmsRepository extends PaymentRequest<BaseResp> {
    private static int component2 = 0;
    private static int component3 = 1;

    public SendResetPinSmsRepository(BaseRequestParams baseRequestParams) {
        addParams("initiatorMsisdn", SPUtils.getInstance().getString("recent_login_phone_number"));
        addParams(baseRequestParams);
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 3;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 33;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return "sendForgetPinSms";
    }
}
