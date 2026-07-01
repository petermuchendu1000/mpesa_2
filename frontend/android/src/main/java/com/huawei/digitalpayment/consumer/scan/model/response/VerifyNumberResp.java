package com.huawei.digitalpayment.consumer.scan.model.response;

import com.huawei.http.BaseResp;

public class VerifyNumberResp extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private String avatar;
    private String customerType;
    private String msisdn;
    private String publicName;
    private String shortCode;

    public String getMsisdn() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 13;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 99;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setMsisdn(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.msisdn = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public String getShortCode() {
        int i = 2 % 2;
        int i2 = copydefault + 123;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.shortCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setShortCode(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.shortCode = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getPublicName() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 21;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.publicName;
        int i5 = i2 + 109;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setPublicName(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 21;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.publicName = str;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 47;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public String getCustomerType() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 123;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.customerType;
        int i5 = i2 + 35;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setCustomerType(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.customerType = str;
        int i5 = i3 + 103;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getAvatar() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 7;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.avatar;
        int i4 = i3 + 107;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setAvatar(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 105;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.avatar = str;
        int i5 = i2 + 49;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }
}
