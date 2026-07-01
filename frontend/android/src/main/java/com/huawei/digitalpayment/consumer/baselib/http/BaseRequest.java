package com.huawei.digitalpayment.consumer.baselib.http;

public class BaseRequest {
    private static int component3 = 1;
    private static int copydefault;
    private String ShareDataUIState;

    public String getInitiatorMsisdn() {
        int i = 2 % 2;
        int i2 = component3 + 105;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i3 + 99;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
        return str;
    }

    public void setInitiatorMsisdn(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.ShareDataUIState = str;
        int i5 = i3 + 79;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
