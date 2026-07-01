package com.huawei.digitalpayment.history.repository;

import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.history.model.entity.ChannelTypeResponse;

public class TransChannelAndTypesRepository extends PaymentRequest<ChannelTypeResponse> {
    private static int component2 = 0;
    private static int component3 = 1;

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component3 + 119;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return "basicConfig";
        }
        int i3 = 21 / 0;
        return "basicConfig";
    }
}
