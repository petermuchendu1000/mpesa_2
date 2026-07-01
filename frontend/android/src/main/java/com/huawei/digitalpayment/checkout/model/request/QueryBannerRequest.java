package com.huawei.digitalpayment.checkout.model.request;

import com.huawei.http.BaseRequestParams;

public class QueryBannerRequest extends BaseRequestParams {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private String bannerType;
    private String initiatorMsisdn;

    public String getInitiatorMsisdn() {
        int i = 2 % 2;
        int i2 = component1 + 69;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.initiatorMsisdn;
        int i5 = i3 + 41;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setInitiatorMsisdn(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.initiatorMsisdn = str;
        int i5 = i3 + 7;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public String getBannerType() {
        int i = 2 % 2;
        int i2 = component1 + 105;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.bannerType;
        int i5 = i3 + 7;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
        return str;
    }

    public void setBannerType(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.bannerType = str;
        int i5 = i3 + 35;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }
}
