package com.huawei.digitalpayment.consumer.qrcode.bean;

import com.huawei.http.BaseResp;
import java.io.Serializable;

public class QueryBalanceResp extends BaseResp implements Serializable {
    private static int component1 = 0;
    private static int component2 = 1;
    private String amount;
    private String amountDisplay;
    private String currency;
    private String unit;
    private String unitType;

    public String getAmount() {
        int i = 2 % 2;
        int i2 = component2 + 27;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.amount;
        int i5 = i3 + 105;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setAmount(String str) {
        int i = 2 % 2;
        int i2 = component1 + 125;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.amount = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 69;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public String getAmountDisplay() {
        int i = 2 % 2;
        int i2 = component1 + 89;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.amountDisplay;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setAmountDisplay(String str) {
        int i = 2 % 2;
        int i2 = component2 + 21;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.amountDisplay = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 79;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getCurrency() {
        int i = 2 % 2;
        int i2 = component2 + 69;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.currency;
        int i4 = i3 + 119;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setCurrency(String str) {
        int i = 2 % 2;
        int i2 = component1 + 115;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.currency = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public String getUnit() {
        int i = 2 % 2;
        int i2 = component1 + 115;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.unit;
        int i5 = i3 + 51;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setUnit(String str) {
        int i = 2 % 2;
        int i2 = component1 + 83;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.unit = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public String getUnitType() {
        int i = 2 % 2;
        int i2 = component2 + 85;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.unitType;
        }
        throw null;
    }

    public void setUnitType(String str) {
        int i = 2 % 2;
        int i2 = component1 + 7;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.unitType = str;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 75;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }
}
