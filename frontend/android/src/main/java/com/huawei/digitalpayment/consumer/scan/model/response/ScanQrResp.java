package com.huawei.digitalpayment.consumer.scan.model.response;

import com.huawei.http.BaseResp;
import java.util.Map;

public class ScanQrResp extends BaseResp {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private String execute;
    private Map<String, String> params;

    public String getExecute() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.execute;
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        return str;
    }

    public void setExecute(String str) {
        int i = 2 % 2;
        int i2 = component1 + 29;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.execute = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 91;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public Map<String, String> getParams() {
        int i = 2 % 2;
        int i2 = component1 + 47;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Map<String, String> map = this.params;
        int i5 = i3 + 15;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public void setParams(Map<String, String> map) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 125;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.params = map;
        int i5 = i2 + 69;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }
}
