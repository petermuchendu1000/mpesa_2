package com.huawei.digitalpayment.history.model.entity;

import com.huawei.http.BaseResp;
import java.util.ArrayList;

public class ChannelTypeResponse extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int component2;
    private ArrayList<TradeTypeConfigBean> channels;
    private JsonContent jsonContent;
    private ArrayList<TradeTypeConfigBean> transactionTypes;

    public JsonContent getJsonContent() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 83;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        JsonContent jsonContent = this.jsonContent;
        int i5 = i2 + 17;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return jsonContent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setJsonContent(JsonContent jsonContent) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 115;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.jsonContent = jsonContent;
        if (i4 == 0) {
            int i5 = 34 / 0;
        }
        int i6 = i2 + 33;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ArrayList<TradeTypeConfigBean> getTransactionTypes() {
        int i = 2 % 2;
        int i2 = component2 + 79;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.transactionTypes;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setTransactionTypes(ArrayList<TradeTypeConfigBean> arrayList) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.transactionTypes = arrayList;
        if (i4 != 0) {
            int i5 = 90 / 0;
        }
        int i6 = i3 + 15;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ArrayList<TradeTypeConfigBean> getChannels() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.channels;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setChannels(ArrayList<TradeTypeConfigBean> arrayList) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 9;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.channels = arrayList;
        int i5 = i2 + 7;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }
}
