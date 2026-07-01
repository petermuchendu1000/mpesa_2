package com.huawei.digitalpayment.consumer.base.cube.resp;

public class CubeAuthResp extends CubeBaseResp {
    private static int component3 = 0;
    private static int copydefault = 1;
    private CubeAuthResult result;

    public CubeAuthResult getResult() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 51;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CubeAuthResult cubeAuthResult = this.result;
        int i4 = i2 + 119;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return cubeAuthResult;
    }

    public void setResult(CubeAuthResult cubeAuthResult) {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.result = cubeAuthResult;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
