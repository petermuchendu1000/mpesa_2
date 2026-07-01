package com.huawei.digitalpayment.consumer.scan.repository;

import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.scan.model.response.ScanQrResp;

public class AnalysisResultRepository extends PaymentRequest<ScanQrResp> {
    private static int component3 = 0;
    private static int copydefault = 1;

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 43;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return "scanQrCode";
        }
        throw null;
    }
}
