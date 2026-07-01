package com.huawei.digitalpayment.home.data.source.locaL;

import java.util.List;

public class LocalSearchMiniApp {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private List<LocalHomeFunction> localMiniApps;
    private String searchKey;

    public LocalSearchMiniApp(String str, List<LocalHomeFunction> list) {
        this.searchKey = str;
        this.localMiniApps = list;
    }

    public String getSearchKey() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 97;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.searchKey;
        int i5 = i2 + 19;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setSearchKey(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.searchKey = str;
        if (i3 == 0) {
            int i4 = 69 / 0;
        }
    }

    public List<LocalHomeFunction> getLocalMiniApps() {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.localMiniApps;
        }
        throw null;
    }

    public void setLocalMiniApps(List<LocalHomeFunction> list) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 83;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.localMiniApps = list;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 121;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
