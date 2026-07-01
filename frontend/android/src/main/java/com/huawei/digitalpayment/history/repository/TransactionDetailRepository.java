package com.huawei.digitalpayment.history.repository;

import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.history.model.response.TransactionHistoryDetailResponse;

public class TransactionDetailRepository extends PaymentRequest<TransactionHistoryDetailResponse> {
    private static int component2 = 1;
    private static int copydefault;

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component2 + 13;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 41;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return "queryTransDetails";
        }
        obj.hashCode();
        throw null;
    }
}
