package com.huawei.digitalpayment.consumer.baselib.otp.model;

public class OtpType {
    private static int copy = 0;
    private static int equals = 1;
    private final String ShareDataUIState;
    private final String component1;
    private final String component2;
    private final String component3;
    private final String copydefault;

    public OtpType(String str, String str2, String str3, String str4, String str5) {
        this.component2 = str;
        this.ShareDataUIState = str2;
        this.component1 = str3;
        this.copydefault = str4;
        this.component3 = str5;
    }

    public String getTitle() {
        int i = 2 % 2;
        int i2 = copy + 113;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        throw null;
    }

    public String getDescription() {
        int i = 2 % 2;
        int i2 = equals + 101;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public String getReSendCodeText() {
        int i = 2 % 2;
        int i2 = copy + 75;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        throw null;
    }

    public String getSendCodeTips() {
        int i = 2 % 2;
        int i2 = copy + 103;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 9;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 90 / 0;
        }
        return str;
    }

    public String getButtonText() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 117;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.component3;
        int i4 = i2 + 1;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
        return str;
    }
}
