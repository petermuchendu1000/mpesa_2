package com.huawei.digitalpayment.checkout.model.request;

import com.huawei.http.BaseRequestParams;

public class TransDetailsRequest extends BaseRequestParams {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private String orderId;

    public String getOrderId() {
        int i = 2 % 2;
        int i2 = component3 + 91;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.orderId;
        int i5 = i3 + 103;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 12 / 0;
        }
        return str;
    }

    public void setOrderId(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.orderId = str;
        int i5 = i3 + 37;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
