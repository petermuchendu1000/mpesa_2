package com.huawei.digitalpayment.consumer.loginModule.register.model;

import com.huawei.http.BaseResp;

public class KycField extends BaseResp {
    private static int component2 = 0;
    private static int component3 = 1;
    private String kycName;
    private String kycValue;

    public String getKycName() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.kycName;
        int i4 = i3 + 83;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return str;
    }

    public void setKycName(String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 77;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.kycName = str;
        int i5 = i2 + 59;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 74 / 0;
        }
    }

    public String getKycValue() {
        int i = 2 % 2;
        int i2 = component2 + 35;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.kycValue;
        int i5 = i3 + 1;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 87 / 0;
        }
        return str;
    }

    public void setKycValue(String str) {
        int i = 2 % 2;
        int i2 = component3 + 39;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.kycValue = str;
        int i5 = i3 + 103;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 96 / 0;
        }
    }
}
