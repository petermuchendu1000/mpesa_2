package com.huawei.digitalpayment.history.model.entity;

import com.huawei.http.BaseResp;
import java.util.ArrayList;

public class JsonContent extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int component2;
    private ArrayList<TradeTypeConfigBean> tradeTypeConfig;

    public ArrayList<TradeTypeConfigBean> getTradeTypeConfig() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 35;
        ShareDataUIState = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        ArrayList<TradeTypeConfigBean> arrayList = this.tradeTypeConfig;
        int i4 = i2 + 75;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return arrayList;
        }
        obj.hashCode();
        throw null;
    }

    public void setTradeTypeConfig(ArrayList<TradeTypeConfigBean> arrayList) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 103;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.tradeTypeConfig = arrayList;
        int i5 = i2 + 93;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
