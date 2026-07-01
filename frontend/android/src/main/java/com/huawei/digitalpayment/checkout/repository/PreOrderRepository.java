package com.huawei.digitalpayment.checkout.repository;

import com.huawei.digitalpayment.checkout.constants.TradeTypeEnum;
import com.huawei.digitalpayment.checkout.model.response.CheckoutResp;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import java.util.Map;

public class PreOrderRepository extends PaymentRequest<CheckoutResp> {
    private static int component2 = 0;
    private static int component3 = 1;
    private final TradeTypeEnum ShareDataUIState;

    public PreOrderRepository(TradeTypeEnum tradeTypeEnum, Map<String, Object> map) {
        this.ShareDataUIState = tradeTypeEnum;
        addParams(map);
    }

    @Override
    public String getApiPath() {
        String checkoutParam;
        int i = 2 % 2;
        int i2 = component2 + 13;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            checkoutParam = this.ShareDataUIState.getCheckoutParam();
            int i3 = 49 / 0;
        } else {
            checkoutParam = this.ShareDataUIState.getCheckoutParam();
        }
        int i4 = component3 + 73;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return checkoutParam;
    }
}
