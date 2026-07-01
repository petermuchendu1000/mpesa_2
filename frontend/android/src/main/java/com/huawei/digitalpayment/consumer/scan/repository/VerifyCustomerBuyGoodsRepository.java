package com.huawei.digitalpayment.consumer.scan.repository;

import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.scan.model.request.VerifyBuyGoodsRequest;
import com.huawei.digitalpayment.consumer.scan.model.response.VerifyNumberResp;

public class VerifyCustomerBuyGoodsRepository extends PaymentRequest<VerifyNumberResp> {
    private static int component1 = 1;
    private static int component3;

    public VerifyCustomerBuyGoodsRepository(VerifyBuyGoodsRequest verifyBuyGoodsRequest) {
        addParams(verifyBuyGoodsRequest);
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 107;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 91;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return "verifyCustomerBuyGoods";
    }
}
