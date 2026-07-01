package com.huawei.digitalpayment.consumer.base.cube.resp;

public class LoginCubeResp extends CubeBaseResp {
    private static int component2 = 1;
    private static int component3;
    private CubeLoginResult result;

    public CubeLoginResult getResult() {
        int i = 2 % 2;
        int i2 = component2 + 123;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        if (this.result == null) {
            this.result = new CubeLoginResult();
            int i4 = component2 + 65;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
        return this.result;
    }

    public void setResult(CubeLoginResult cubeLoginResult) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 69;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.result = cubeLoginResult;
        int i5 = i2 + 25;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }
}
