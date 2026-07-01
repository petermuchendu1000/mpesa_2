package com.huawei.digitalpayment.consumer.loginModule.register.request;

import com.huawei.http.BaseRequestParams;

public class ProcessVerifyRequest extends BaseRequestParams {
    private static int component2 = 1;
    private static int copydefault;
    private String loginType;
    private String otp;
    private String otpType;
    private String token;

    public String getToken() {
        int i = 2 % 2;
        int i2 = component2 + 83;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.token;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setToken(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.token = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public String getOtp() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 7;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.otp;
        int i4 = i2 + 19;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setOtp(String str) {
        int i = 2 % 2;
        int i2 = component2 + 75;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.otp = str;
        int i5 = i3 + 55;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getLoginType() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 99;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.loginType;
            int i4 = 31 / 0;
        } else {
            str = this.loginType;
        }
        int i5 = i2 + 33;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setLoginType(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.loginType = str;
        int i5 = i3 + 63;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getOtpType() {
        int i = 2 % 2;
        int i2 = component2 + 97;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.otpType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setOtpType(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.otpType = str;
        int i5 = i3 + 41;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
        }
    }
}
