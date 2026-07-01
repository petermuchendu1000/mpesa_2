package com.huawei.digitalpayment.consumer.baselib.cube.resp;

import com.huawei.http.BaseResp;
import java.util.List;

public class CubeMiniApp extends BaseResp {
    private static int component1 = 1;
    private static int component2;
    private boolean allowAll;
    private List<String> urls;

    public List<String> getUrls() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.urls;
        }
        throw null;
    }

    public void setUrls(List<String> list) {
        int i = 2 % 2;
        int i2 = component1 + 61;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.urls = list;
        if (i3 != 0) {
            throw null;
        }
    }

    public boolean isAllowAll() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 125;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.allowAll;
        int i5 = i2 + 31;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public void setAllowAll(boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 13;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.allowAll = z;
        int i5 = i3 + 15;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }
}
