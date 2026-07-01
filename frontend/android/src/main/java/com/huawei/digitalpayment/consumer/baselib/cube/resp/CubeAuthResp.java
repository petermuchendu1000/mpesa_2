package com.huawei.digitalpayment.consumer.baselib.cube.resp;

public class CubeAuthResp extends CubeBaseResp {
    private static int component1 = 1;
    private static int component2;
    private CubeAuthResult result;

    public CubeAuthResult getResult() {
        int i = 2 % 2;
        int i2 = component1 + 119;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        CubeAuthResult cubeAuthResult = this.result;
        int i4 = i3 + 107;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return cubeAuthResult;
        }
        throw null;
    }

    public void setResult(CubeAuthResult cubeAuthResult) {
        int i = 2 % 2;
        int i2 = component1 + 37;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.result = cubeAuthResult;
        if (i3 != 0) {
            throw null;
        }
    }
}
