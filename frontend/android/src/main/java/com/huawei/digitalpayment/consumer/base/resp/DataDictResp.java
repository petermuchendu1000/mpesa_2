package com.huawei.digitalpayment.consumer.base.resp;

import com.huawei.http.BaseResp;
import java.util.Map;

public class DataDictResp extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int component1;
    private Map<String, Map<String, String>> dictMap;

    public Map<String, Map<String, String>> getDictMap() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Map<String, Map<String, String>> map = this.dictMap;
        int i5 = i3 + 51;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public void setDictMap(Map<String, Map<String, String>> map) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.dictMap = map;
        int i5 = i3 + 13;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 60 / 0;
        }
    }
}
