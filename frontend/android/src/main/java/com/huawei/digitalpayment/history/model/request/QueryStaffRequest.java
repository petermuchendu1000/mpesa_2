package com.huawei.digitalpayment.history.model.request;

import com.huawei.http.BaseRequestParams;

public class QueryStaffRequest extends BaseRequestParams {
    private static int component1 = 0;
    private static int component3 = 1;
    private String queryAll;
    private int queryNum;
    private int startNum;

    public int getStartNum() {
        int i = 2 % 2;
        int i2 = component1 + 65;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = this.startNum;
        int i6 = i3 + 119;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 24 / 0;
        }
        return i5;
    }

    public void setStartNum(int i) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 5;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        this.startNum = i;
        int i6 = i3 + 1;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public int getQueryNum() {
        int i = 2 % 2;
        int i2 = component3 + 27;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.queryNum;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setQueryNum(int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 123;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i3 % 2;
        this.queryNum = i;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i4 + 81;
        component1 = i6 % 128;
        int i7 = i6 % 2;
    }

    public String getQueryAll() {
        int i = 2 % 2;
        int i2 = component1 + 47;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.queryAll;
        int i5 = i3 + 7;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setQueryAll(String str) {
        int i = 2 % 2;
        int i2 = component3 + 91;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.queryAll = str;
        int i5 = i3 + 13;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 50 / 0;
        }
    }
}
