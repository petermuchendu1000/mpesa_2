package com.huawei.digitalpayment.checkout.model.entity;

import com.huawei.http.BaseResp;
import org.json.JSONObject;

public class CheckOutParams extends BaseResp {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private JSONObject JsonParams;
    private String balanceDisplayContent;
    private String from;
    private boolean isCallBackH5;
    private String payMethod;
    private String transferPath;

    public String getPayMethod() {
        int i = 2 % 2;
        int i2 = component2 + 105;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.payMethod;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setPayMethod(String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 115;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.payMethod = str;
        int i5 = i2 + 109;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
    }

    public String getFrom() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 77;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.from;
        int i5 = i2 + 93;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setFrom(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 107;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.from = str;
        int i5 = i2 + 117;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getTransferPath() {
        int i = 2 % 2;
        int i2 = component2 + 117;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.transferPath;
        int i5 = i3 + 39;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setTransferPath(String str) {
        int i = 2 % 2;
        int i2 = component2 + 17;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.transferPath = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public JSONObject getJsonParams() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 87;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        JSONObject jSONObject = this.JsonParams;
        int i5 = i2 + 77;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return jSONObject;
    }

    public void setJsonParams(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 39;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.JsonParams = jSONObject;
        int i5 = i2 + 39;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean isCallBackH5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isCallBackH5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setCallBackH5(boolean z) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 15;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.isCallBackH5 = z;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 25;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getBalanceDisplayContent() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.balanceDisplayContent;
        int i4 = i3 + 23;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public void setBalanceDisplayContent(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.balanceDisplayContent = str;
        if (i4 == 0) {
            int i5 = 75 / 0;
        }
        int i6 = i3 + 87;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 96 / 0;
        }
    }
}
