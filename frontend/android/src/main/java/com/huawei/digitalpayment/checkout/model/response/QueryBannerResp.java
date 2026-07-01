package com.huawei.digitalpayment.checkout.model.response;

import com.huawei.digitalpayment.checkout.model.entity.HomeBannerBean;
import com.huawei.http.BaseResp;
import java.util.List;

public class QueryBannerResp extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int component2;
    private List<HomeBannerBean> configs;

    public List<HomeBannerBean> getConfigs() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 61;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        List<HomeBannerBean> list = this.configs;
        int i5 = i2 + 109;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public void setConfigs(List<HomeBannerBean> list) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.configs = list;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 109;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 58 / 0;
        }
    }
}
