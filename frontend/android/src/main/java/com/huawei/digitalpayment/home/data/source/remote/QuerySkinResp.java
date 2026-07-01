package com.huawei.digitalpayment.home.data.source.remote;

import com.huawei.http.BaseResp;
import java.util.List;

public class QuerySkinResp extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int component2;
    private List<SkinInfo> themeList;

    public List<SkinInfo> getThemeList() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 71;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        List<SkinInfo> list = this.themeList;
        int i5 = i2 + 103;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public void setThemeList(List<SkinInfo> list) {
        int i = 2 % 2;
        int i2 = component2 + 27;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.themeList = list;
        int i5 = i3 + 37;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }
}
