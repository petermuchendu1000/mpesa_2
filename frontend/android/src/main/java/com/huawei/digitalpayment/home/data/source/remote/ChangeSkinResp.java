package com.huawei.digitalpayment.home.data.source.remote;

import com.huawei.http.BaseResp;

public class ChangeSkinResp extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int component3;
    private String jsonConfig;

    public String getJsonConfig() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.jsonConfig;
        int i5 = i3 + 101;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setJsonConfig(String str) {
        int i = 2 % 2;
        int i2 = component3 + 69;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.jsonConfig = str;
        int i5 = i3 + 15;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }
}
