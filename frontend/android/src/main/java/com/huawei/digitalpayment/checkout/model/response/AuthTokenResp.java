package com.huawei.digitalpayment.checkout.model.response;

import com.huawei.http.BaseResp;

public class AuthTokenResp extends BaseResp {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private String token;

    public String getToken() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 37;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.token;
        int i5 = i2 + 5;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setToken(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.token = str;
        if (i4 != 0) {
            int i5 = 15 / 0;
        }
        int i6 = i3 + 17;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
    }
}
