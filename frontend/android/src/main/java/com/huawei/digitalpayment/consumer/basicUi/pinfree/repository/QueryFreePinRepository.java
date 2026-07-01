package com.huawei.digitalpayment.consumer.basicUi.pinfree.repository;

import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.basicUi.response.FreePinResponse;

public class QueryFreePinRepository extends PaymentRequest<FreePinResponse> {
    private static int component1 = 1;
    private static int copydefault;

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component1 + 37;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 109;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return "queryFreePin";
    }
}
