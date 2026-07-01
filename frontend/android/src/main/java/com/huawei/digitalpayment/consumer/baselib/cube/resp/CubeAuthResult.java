package com.huawei.digitalpayment.consumer.baselib.cube.resp;

import com.google.gson.annotations.SerializedName;

public class CubeAuthResult extends CubeBaseResp {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;

    @SerializedName("access_token")
    private String accessToken;

    public String getAccessToken() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 73;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            str = this.accessToken;
            int i4 = 89 / 0;
        } else {
            str = this.accessToken;
        }
        int i5 = i3 + 27;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setAccessToken(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 73;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.accessToken = str;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 69;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }
}
