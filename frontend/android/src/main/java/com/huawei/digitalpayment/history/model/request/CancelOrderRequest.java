package com.huawei.digitalpayment.history.model.request;

import com.huawei.http.BaseRequestParams;

public class CancelOrderRequest extends BaseRequestParams {
    private static int component1 = 0;
    private static int component2 = 1;
    private String paymentOrderId;
    private String prepayId;

    public CancelOrderRequest(String str, String str2) {
        this.paymentOrderId = str;
        this.prepayId = str2;
    }

    public String getPrepayId() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 71;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.prepayId;
        int i5 = i2 + 15;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setPrepayId(String str) {
        int i = 2 % 2;
        int i2 = component2 + 35;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.prepayId = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public String getPaymentOrderId() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 31;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.paymentOrderId;
        int i5 = i2 + 99;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setPaymentOrderId(String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 115;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.paymentOrderId = str;
        int i5 = i2 + 69;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }
}
