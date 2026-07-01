package com.huawei.digitalpayment.consumer.scan.repository;

import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.scan.model.request.VerifyCashOutRequest;
import com.huawei.digitalpayment.consumer.scan.model.response.VerifyNumberResp;

public class VerifyCashOutRepository extends PaymentRequest<VerifyNumberResp> {
    private static int component1 = 0;
    private static int component3 = 1;

    public VerifyCashOutRepository(VerifyCashOutRequest verifyCashOutRequest) {
        addParams(verifyCashOutRequest);
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component3 + 121;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return "verifyCashOut";
        }
        throw null;
    }
}
