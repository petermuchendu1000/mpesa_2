package com.huawei.digitalpayment.checkout.model.request;

import com.huawei.http.BaseRequestParams;

public class CancelPayOrderRequest extends BaseRequestParams {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private String prepayId;

    public CancelPayOrderRequest(String str) {
        this.prepayId = str;
    }

    public String getPrepayId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.prepayId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setPrepayId(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 81;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.prepayId = str;
        int i5 = i2 + 71;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }
}
