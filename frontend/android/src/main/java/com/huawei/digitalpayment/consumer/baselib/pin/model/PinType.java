package com.huawei.digitalpayment.consumer.baselib.pin.model;

public class PinType {
    private static int copydefault = 0;
    private static int getRequestBeneficiariesState = 1;
    private final String ShareDataUIState;
    private final String component1;
    private final String component2;
    private final String component3;

    public PinType(String str, String str2, String str3, String str4) {
        this.component1 = str;
        this.component2 = str2;
        this.component3 = str3;
        this.ShareDataUIState = str4;
    }

    public String getTitle() {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 51;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String getDescription() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 63;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 73;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String getButtonForgotPIN() {
        String str;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 101;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            str = this.component3;
            int i4 = 28 / 0;
        } else {
            str = this.component3;
        }
        int i5 = i3 + 27;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String getButtonText() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 59;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }
}
