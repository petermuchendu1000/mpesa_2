package com.huawei.digitalpayment.consumer.base.cube.resp;

import com.google.gson.annotations.SerializedName;
import com.huawei.http.BaseResp;

public class CubeLoginResult extends BaseResp {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;

    @SerializedName("access-token")
    private String accessToken;

    public String getAccessToken() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.accessToken;
        int i5 = i3 + 25;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setAccessToken(String str) {
        int i = 2 % 2;
        int i2 = component3 + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.accessToken = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
