package com.huawei.digitalpayment.consumer.base.cube.repository;

import com.huawei.digitalpayment.consumer.base.cube.resp.CubeAuthResp;

public class CubeAuthRepository extends BaseCubeRepository<CubeAuthResp> {
    private static int component2 = 0;
    private static int component3 = 1;
    private String copydefault;

    public CubeAuthRepository(String str) {
        this.copydefault = str;
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component2 + 87;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.copydefault;
        int i4 = i3 + 11;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }
}
