package com.huawei.digitalpayment.checkout.repository;

import com.huawei.digitalpayment.checkout.model.response.QueryBannerResp;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;

public class BannerRepository extends PaymentRequest<QueryBannerResp> {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component1 + 13;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 79;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 78 / 0;
        }
        return "queryBanners";
    }
}
