package com.huawei.digitalpayment.checkout.model.entity;

import com.huawei.http.BaseResp;

public class SelectInfo extends BaseResp {
    private static int component2 = 0;
    private static int copydefault = 1;
    private String key;
    private String label;

    public SelectInfo(String str, String str2) {
        this.key = str;
        this.label = str2;
    }

    public String getLabel() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 125;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.label;
        int i5 = i2 + 53;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setLabel(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.label = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getKey() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 89;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.key;
            int i4 = 70 / 0;
        } else {
            str = this.key;
        }
        int i5 = i2 + 83;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setKey(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.key = str;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 35;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
