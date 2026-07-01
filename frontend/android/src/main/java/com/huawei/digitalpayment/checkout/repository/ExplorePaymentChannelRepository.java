package com.huawei.digitalpayment.checkout.repository;

import com.huawei.digitalpayment.checkout.model.response.PaymentChannelResp;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;

public class ExplorePaymentChannelRepository extends PaymentRequest<PaymentChannelResp> {
    private static int component2 = 1;
    private static int copydefault;

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = copydefault + 87;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 99;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return "explorePaymentChannel";
    }
}
