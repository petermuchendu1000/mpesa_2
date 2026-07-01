package com.huawei.digitalpayment.consumer.scan.model.request;

import com.huawei.http.BaseRequestParams;

public class VerifyCashOutRequest extends BaseRequestParams {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private String receiverOperatorCode;
    private String receiverShortCode;

    public VerifyCashOutRequest(String str, String str2) {
        this.receiverShortCode = str;
        this.receiverOperatorCode = str2;
    }

    public String getReceiverShortCode() {
        int i = 2 % 2;
        int i2 = component1 + 33;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.receiverShortCode;
        int i5 = i3 + 3;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setReceiverShortCode(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.receiverShortCode = str;
        int i5 = i3 + 121;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getReceiverOperatorCode() {
        int i = 2 % 2;
        int i2 = component1 + 53;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.receiverOperatorCode;
        int i5 = i3 + 61;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setReceiverOperatorCode(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.receiverOperatorCode = str;
        int i5 = i3 + 117;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }
}
