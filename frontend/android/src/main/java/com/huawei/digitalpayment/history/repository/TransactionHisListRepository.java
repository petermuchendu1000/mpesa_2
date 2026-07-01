package com.huawei.digitalpayment.history.repository;

import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.history.model.response.TransactionRecordResponse;

public class TransactionHisListRepository extends PaymentRequest<TransactionRecordResponse> {
    private static int component1 = 1;
    private static int component3;

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 41;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 99;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return "queryTransList";
        }
        throw null;
    }
}
