package com.huawei.digitalpayment.consumer.baselib.cube.repository;

import com.huawei.digitalpayment.consumer.baselib.cube.resp.CubeAuthResp;

public class CubeAuthRepository extends BaseCubeRepository<CubeAuthResp> {
    private static int component2 = 1;
    private static int copydefault;
    private String component1;

    public CubeAuthRepository(String str) {
        this.component1 = str;
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 99;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 59;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 7 / 0;
        }
        return str;
    }
}
