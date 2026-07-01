package com.huawei.digitalpayment.history.model.request;

import com.huawei.http.BaseRequestParams;

public class TransactionDetailRequest extends BaseRequestParams {
    private static int component1 = 1;
    private static int copydefault;
    private String orderId;

    public String getOrderId() {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.orderId;
        int i4 = i3 + 27;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setOrderId(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 95;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.orderId = str;
        int i5 = i2 + 65;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
