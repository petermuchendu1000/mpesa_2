package com.huawei.digitalpayment.checkout.model.request;

import com.huawei.http.BaseRequestParams;

public class QueryAsyncRequest extends BaseRequestParams {
    private static int component2 = 0;
    private static int copydefault = 1;
    private String orderId;

    public String getOrderId() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 57;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.orderId;
            int i4 = 42 / 0;
        } else {
            str = this.orderId;
        }
        int i5 = i2 + 85;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public void setOrderId(String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 97;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.orderId = str;
        int i5 = i2 + 107;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }
}
