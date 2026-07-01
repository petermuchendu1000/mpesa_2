package com.huawei.digitalpayment.consumer.baselib.cube.repository;

import com.huawei.digitalpayment.consumer.baselib.cube.resp.CubeBaseResp;

public class CubeLogOutRepository extends BaseCubeRepository<CubeBaseResp> {
    private static int component1 = 1;
    private static int component2;
    private String copydefault;

    public CubeLogOutRepository(String str) {
        this.copydefault = str;
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 65;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 57;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
