package com.huawei.digitalpayment.consumer.loginModule.register.repository;

import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.loginModule.register.request.RegisterKycParams;
import com.huawei.digitalpayment.customer.dynamics.resp.KycInfoResp;

public class GetGuiportlesRepository extends PaymentRequest<KycInfoResp> {
    private static int component1 = 1;
    private static int copydefault;

    public GetGuiportlesRepository(RegisterKycParams registerKycParams) {
        addParams(registerKycParams);
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 125;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 41;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 / 0;
        }
        return "guiportlets";
    }
}
