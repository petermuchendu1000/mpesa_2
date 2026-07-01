package com.huawei.digitalpayment.checkout.model.response;

import com.huawei.http.BaseResp;

public class FreePinSuccessResp extends BaseResp {
    private static int component3 = 1;
    private static int copydefault;
    private int payWay;
    private TransferResp value;

    public FreePinSuccessResp(TransferResp transferResp, int i) {
        this.value = transferResp;
        this.payWay = i;
    }

    public TransferResp getValue() {
        int i = 2 % 2;
        int i2 = component3 + 123;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        TransferResp transferResp = this.value;
        int i5 = i3 + 23;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 63 / 0;
        }
        return transferResp;
    }

    public void setValue(TransferResp transferResp) {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.value = transferResp;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getPayWay() {
        int i = 2 % 2;
        int i2 = copydefault + 51;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = this.payWay;
        int i6 = i3 + 65;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setPayWay(int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 123;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i3 % 2;
        this.payWay = i;
        int i6 = i4 + 123;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 56 / 0;
        }
    }
}
