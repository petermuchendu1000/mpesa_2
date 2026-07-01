package com.huawei.digitalpayment.home.data.source.remote.repository;

import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.http.BaseResp;

public class LogoutRepository extends PaymentRequest<BaseResp> {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component2 + 103;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return "logout";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
