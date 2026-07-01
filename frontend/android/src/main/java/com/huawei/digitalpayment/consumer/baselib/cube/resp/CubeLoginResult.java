package com.huawei.digitalpayment.consumer.baselib.cube.resp;

import com.google.gson.annotations.SerializedName;
import com.huawei.http.BaseResp;

public class CubeLoginResult extends BaseResp {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;

    @SerializedName("access-token")
    private String accessToken;

    public String getAccessToken() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.accessToken;
        int i5 = i3 + 59;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setAccessToken(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 77;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.accessToken = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 25;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 31 / 0;
        }
    }
}
