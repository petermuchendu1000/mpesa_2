package com.huawei.digitalpayment.consumer.scan.model.request;

import com.huawei.http.BaseRequestParams;

public class VerifyTransferRequest extends BaseRequestParams {
    private static int ShareDataUIState = 1;
    private static int component2;
    private String receiverMsisdn;

    public VerifyTransferRequest(String str) {
        this.receiverMsisdn = str;
    }

    public String getReceiverMsisdn() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.receiverMsisdn;
        int i5 = i3 + 81;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setReceiverMsisdn(String str) {
        int i = 2 % 2;
        int i2 = component2 + 97;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.receiverMsisdn = str;
        int i5 = i3 + 87;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 87 / 0;
        }
    }
}
