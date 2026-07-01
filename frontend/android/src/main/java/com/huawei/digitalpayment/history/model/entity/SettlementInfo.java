package com.huawei.digitalpayment.history.model.entity;

import com.huawei.http.BaseResp;

public class SettlementInfo extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int component2;
    private String escrowFinishTime;
    private String settlementAmount;
    private String settlementName;
    private String settlementStatus;
    private String settlementTime;

    public String getSettlementAmount() {
        int i = 2 % 2;
        int i2 = component2 + 5;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.settlementAmount;
        int i4 = i3 + 115;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setSettlementAmount(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 63;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.settlementAmount = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 13;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 93 / 0;
        }
    }

    public String getSettlementStatus() {
        int i = 2 % 2;
        int i2 = component2 + 47;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.settlementStatus;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setSettlementStatus(String str) {
        int i = 2 % 2;
        int i2 = component2 + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.settlementStatus = str;
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
    }

    public String getSettlementTime() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.settlementTime;
        if (i3 != 0) {
            int i4 = 72 / 0;
        }
        return str;
    }

    public void setSettlementTime(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.settlementTime = str;
        int i5 = i3 + 47;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getEscrowFinishTime() {
        int i = 2 % 2;
        int i2 = component2 + 65;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.escrowFinishTime;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setEscrowFinishTime(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.escrowFinishTime = str;
        int i5 = i3 + 35;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getSettlementName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.settlementName;
        int i5 = i3 + 125;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setSettlementName(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.settlementName = str;
        int i5 = i3 + 99;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
