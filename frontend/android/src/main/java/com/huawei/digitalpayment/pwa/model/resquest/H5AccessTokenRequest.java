package com.huawei.digitalpayment.pwa.model.resquest;

import com.huawei.http.BaseRequestParams;

public class H5AccessTokenRequest extends BaseRequestParams {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private String appId;

    public H5AccessTokenRequest(String str) {
        this.appId = str;
    }

    public String getAppId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 33;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.appId;
        int i5 = i2 + 71;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setAppId(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 39;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.appId = str;
        int i5 = i2 + 7;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }
}
