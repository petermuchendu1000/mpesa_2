package com.huawei.digitalpayment.consumer.base.cube.resp;

import com.huawei.http.BaseResp;
import java.util.List;

public class CubeMiniApp extends BaseResp {
    private static int component1 = 1;
    private static int copydefault;
    private boolean allowAll;
    private List<String> urls;

    public List<String> getUrls() {
        int i = 2 % 2;
        int i2 = copydefault + 25;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        List<String> list = this.urls;
        int i5 = i3 + 107;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 32 / 0;
        }
        return list;
    }

    public void setUrls(List<String> list) {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.urls = list;
        int i5 = i3 + 89;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean isAllowAll() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        boolean z = this.allowAll;
        int i5 = i3 + 105;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public void setAllowAll(boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 107;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.allowAll = z;
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
    }
}
