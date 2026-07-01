package com.huawei.digitalpayment.consumer.base.cube.resp;

import com.google.gson.annotations.SerializedName;

public class CubeAuthResult extends CubeBaseResp {
    private static int component2 = 0;
    private static int component3 = 1;

    @SerializedName("access_token")
    private String accessToken;

    public String getAccessToken() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 117;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accessToken;
        int i5 = i2 + 27;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public void setAccessToken(String str) {
        int i = 2 % 2;
        int i2 = component2 + 59;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.accessToken = str;
        int i5 = i3 + 113;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }
}
