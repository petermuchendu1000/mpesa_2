package com.huawei.digitalpayment.home.request;

import com.huawei.http.BaseRequestParams;

public class QuerySkinParams extends BaseRequestParams {
    private static int component1 = 0;
    private static int copydefault = 1;
    private int count;
    private int startNum;

    public int getCount() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 61;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.count;
        int i6 = i2 + 95;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void setCount(int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 75;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.count = i;
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getStartNum() {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = this.startNum;
        int i6 = i3 + 113;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setStartNum(int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 81;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.startNum = i;
        if (i4 != 0) {
            throw null;
        }
    }
}
