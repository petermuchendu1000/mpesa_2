package com.huawei.digitalpayment.consumer.loginModule.login.data.source.network;

import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.BaseResp;

public class SendLoginSmsRepository extends PaymentRequest<BaseResp> {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;

    public SendLoginSmsRepository(BaseRequestParams baseRequestParams) {
        addParams(baseRequestParams);
        addParams("initiatorMsisdn", SPUtils.getInstance().getString("recent_login_phone_number"));
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 103;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 13;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 51 / 0;
        }
        return "sendLoginSms";
    }
}
