package com.huawei.digitalpayment.consumer.scan.model.request;

import com.huawei.http.BaseRequestParams;

public class ScanQrRequest extends BaseRequestParams {
    private static int ShareDataUIState = 1;
    private static int component2;
    private String qrCode;
    private String scanPurpose;

    public ScanQrRequest(String str, String str2) {
        this.qrCode = str;
        this.scanPurpose = str2;
    }

    public String getQrCode() {
        int i = 2 % 2;
        int i2 = component2 + 115;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.qrCode;
        int i5 = i3 + 35;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 8 / 0;
        }
        return str;
    }

    public void setQrCode(String str) {
        int i = 2 % 2;
        int i2 = component2 + 33;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.qrCode = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public String getScanPurpose() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 33;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            str = this.scanPurpose;
            int i4 = 73 / 0;
        } else {
            str = this.scanPurpose;
        }
        int i5 = i3 + 121;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setScanPurpose(String str) {
        int i = 2 % 2;
        int i2 = component2 + 19;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.scanPurpose = str;
        int i5 = i3 + 11;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }
}
