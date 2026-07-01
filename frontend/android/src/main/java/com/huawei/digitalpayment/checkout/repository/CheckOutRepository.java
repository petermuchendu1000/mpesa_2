package com.huawei.digitalpayment.checkout.repository;

import com.huawei.digitalpayment.checkout.model.response.CheckoutResp;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import java.util.Map;

public class CheckOutRepository extends PaymentRequest<CheckoutResp> {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;

    public CheckOutRepository(Map<String, Object> map) {
        addParams(map);
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 99;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return "h5Checkout";
    }
}
