package com.huawei.digitalpayment.consumer.loginModule.register.model;

import com.huawei.http.BaseResp;

public class ExtParam extends BaseResp {
    private static int component1 = 0;
    private static int component3 = 1;
    private String extName;
    private String extValue;

    public String getExtName() {
        int i = 2 % 2;
        int i2 = component1 + 29;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.extName;
        int i5 = i3 + 17;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setExtName(String str) {
        int i = 2 % 2;
        int i2 = component3 + 99;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.extName = str;
        int i5 = i3 + 125;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getExtValue() {
        int i = 2 % 2;
        int i2 = component3 + 95;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.extValue;
        }
        throw null;
    }

    public void setExtValue(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 105;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.extValue = str;
        if (i4 != 0) {
            int i5 = 37 / 0;
        }
        int i6 = i2 + 53;
        component1 = i6 % 128;
        int i7 = i6 % 2;
    }
}
