package com.huawei.digitalpayment.consumer.baselib.cube.repository;

import com.huawei.digitalpayment.consumer.baselib.cube.resp.LoginCubeResp;

public class LoginCubeRepository extends BaseCubeRepository<LoginCubeResp> {
    private static int component1 = 0;
    private static int component2 = 1;
    private String component3;

    public LoginCubeRepository(String str) {
        this.component3 = str;
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 37;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 15;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
