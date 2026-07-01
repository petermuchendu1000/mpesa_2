package com.huawei.digitalpayment.consumer.base.cube.repository;

import com.huawei.digitalpayment.consumer.base.cube.resp.GetH5AccessTokenResp;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;

public class H5GetAccessTokenRepository extends PaymentRequest<GetH5AccessTokenResp> {
    private static int component3 = 1;
    private static int copydefault;

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component3 + 67;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return "h5GetAccessToken";
        }
        int i3 = 33 / 0;
        return "h5GetAccessToken";
    }
}
