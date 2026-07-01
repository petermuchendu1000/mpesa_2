package com.huawei.digitalpayment.consumer.scan.repository;

import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.scan.model.request.VerifyTransferRequest;
import com.huawei.digitalpayment.consumer.scan.model.response.VerifyNumberResp;

public class VerifyP2PTransferRepository extends PaymentRequest<VerifyNumberResp> {
    private static int component3 = 1;
    private static int copydefault;

    public VerifyP2PTransferRepository(VerifyTransferRequest verifyTransferRequest) {
        addParams(verifyTransferRequest);
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 107;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 43;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
        return "verifyP2PTransfer";
    }
}
