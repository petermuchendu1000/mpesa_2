package com.huawei.digitalpayment.consumer.base.cube.repository;

import com.huawei.digitalpayment.consumer.base.cube.resp.LoginCubeResp;

public class LoginCubeRepository extends BaseCubeRepository<LoginCubeResp> {
    private static int component1 = 0;
    private static int component2 = 1;
    private String ShareDataUIState;

    public LoginCubeRepository(String str) {
        this.ShareDataUIState = str;
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component2 + 97;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ShareDataUIState;
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
        return str;
    }
}
