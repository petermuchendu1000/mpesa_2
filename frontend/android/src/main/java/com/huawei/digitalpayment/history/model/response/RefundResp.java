package com.huawei.digitalpayment.history.model.response;

import com.huawei.http.BaseResp;

public class RefundResp extends BaseResp {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private String status;

    public String getStatus() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.status;
        int i5 = i3 + 37;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public void setStatus(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.status = str;
        if (i4 != 0) {
            int i5 = 84 / 0;
        }
        int i6 = i3 + 91;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
    }
}
