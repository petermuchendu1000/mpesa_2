package com.huawei.digitalpayment.consumer.baselib.cube.resp;

public class LoginCubeResp extends CubeBaseResp {
    private static int component2 = 1;
    private static int component3;
    private CubeLoginResult result;

    public CubeLoginResult getResult() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        if (this.result == null) {
            this.result = new CubeLoginResult();
        }
        CubeLoginResult cubeLoginResult = this.result;
        int i4 = component2 + 41;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return cubeLoginResult;
        }
        throw null;
    }

    public void setResult(CubeLoginResult cubeLoginResult) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 85;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.result = cubeLoginResult;
        int i5 = i2 + 17;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }
}
