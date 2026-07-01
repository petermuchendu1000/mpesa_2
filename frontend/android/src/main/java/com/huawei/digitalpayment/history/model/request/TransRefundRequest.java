package com.huawei.digitalpayment.history.model.request;

import com.huawei.http.BaseRequestParams;

public class TransRefundRequest extends BaseRequestParams {
    private static int component1 = 0;
    private static int copydefault = 1;
    private String initiatorPin;
    private String orderId;
    private String pinVersion;

    public String getInitiatorPin() {
        int i = 2 % 2;
        int i2 = component1 + 43;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.initiatorPin;
        }
        throw null;
    }

    public void setInitiatorPin(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 109;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.initiatorPin = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getPinVersion() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 109;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pinVersion;
        int i5 = i2 + 93;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setPinVersion(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.pinVersion = str;
        if (i3 != 0) {
            int i4 = 89 / 0;
        }
    }

    public String getOrderId() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 73;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.orderId;
        int i5 = i2 + 71;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setOrderId(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.orderId = str;
        if (i3 != 0) {
            throw null;
        }
    }
}
