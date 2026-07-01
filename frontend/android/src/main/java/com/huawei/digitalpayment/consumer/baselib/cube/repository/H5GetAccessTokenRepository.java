package com.huawei.digitalpayment.consumer.baselib.cube.repository;

import com.huawei.digitalpayment.consumer.baselib.cube.resp.GetH5AccessTokenResp;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;

public class H5GetAccessTokenRepository extends PaymentRequest<GetH5AccessTokenResp> {
    private static int component1 = 1;
    private static int component2;

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component2 + 7;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 97;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return "h5GetAccessToken";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
