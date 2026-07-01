package com.huawei.digitalpayment.consumer.loginModule.login.model;

import com.huawei.http.BaseResp;
import java.util.Map;

public class DataDictInfoRemote extends BaseResp {
    private static int component1 = 1;
    private static int component2;
    private Map<String, Map<String, String>> dictMap;

    public Map<String, Map<String, String>> getDictMap() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 13;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Map<String, Map<String, String>> map = this.dictMap;
        int i4 = i2 + 19;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    public void setDictMap(Map<String, Map<String, String>> map) {
        int i = 2 % 2;
        int i2 = component2 + 53;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.dictMap = map;
        if (i3 == 0) {
            throw null;
        }
    }
}
