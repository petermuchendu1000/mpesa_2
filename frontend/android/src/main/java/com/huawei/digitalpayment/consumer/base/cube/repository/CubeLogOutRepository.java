package com.huawei.digitalpayment.consumer.base.cube.repository;

import com.huawei.digitalpayment.consumer.base.cube.resp.CubeBaseResp;

public class CubeLogOutRepository extends BaseCubeRepository<CubeBaseResp> {
    private static int component2 = 1;
    private static int copydefault;
    private String component1;

    public CubeLogOutRepository(String str) {
        this.component1 = str;
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = copydefault + 107;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component1;
        int i4 = i3 + 47;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }
}
