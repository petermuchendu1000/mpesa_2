package com.huawei.digitalpayment.consumer.webview.model.resp;

import com.huawei.http.BaseResp;
import java.io.Serializable;

public class AaRecordResp extends BaseResp implements Serializable {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private String aaPaidRecordId;

    public String getAaPaidRecordId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.aaPaidRecordId;
        int i5 = i3 + 55;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setAaPaidRecordId(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.aaPaidRecordId = str;
        if (i3 != 0) {
            throw null;
        }
    }
}
