package com.huawei.digitalpayment.history.model.entity;

import com.huawei.http.BaseResp;
import java.util.Currency;
import java.util.Map;

public class TransactionHistoryListBean extends BaseResp {
    private static int component1 = 0;
    private static int component3 = 1;
    private float amount;
    private String amountDisplay;
    private Map<String, Object> configs;
    private Currency currency;
    private String currencyAmount;
    private String initiatorMnemonic;
    private String logo;
    private String oppositeName;
    private String orderId;
    private boolean receiverIsConsumer;
    private String title;
    private String transStatus;
    private String transTime;
    private String transType;
    private String transTypeDisplay;
    private String unit;

    public String getUnit() {
        int i = 2 % 2;
        int i2 = component3 + 97;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.unit;
        int i5 = i3 + 67;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setUnit(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 39;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.unit = str;
        int i5 = i2 + 99;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public Map<String, Object> getConfigs() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 115;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> map = this.configs;
        int i5 = i2 + 109;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public void setConfigs(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = component3 + 95;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.configs = map;
        if (i3 != 0) {
            throw null;
        }
    }

    public boolean isReceiverIsConsumer() {
        int i = 2 % 2;
        int i2 = component1 + 29;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.receiverIsConsumer;
        if (i3 == 0) {
            int i4 = 93 / 0;
        }
        return z;
    }

    public void setReceiverIsConsumer(boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 91;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.receiverIsConsumer = z;
        int i5 = i3 + 49;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getAmountDisplay() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 85;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amountDisplay;
        int i5 = i2 + 43;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setAmountDisplay(String str) {
        int i = 2 % 2;
        int i2 = component1 + 115;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.amountDisplay = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public String getId() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.orderId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setId(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 41;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.orderId = this.orderId;
        int i5 = i2 + 101;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public String getLogo() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 93;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            str = this.logo;
            int i4 = 53 / 0;
        } else {
            str = this.logo;
        }
        int i5 = i3 + 87;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setLogo(String str) {
        int i = 2 % 2;
        int i2 = component1 + 77;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.logo = str;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 15;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getTitle() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 21;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.title;
        int i4 = i2 + 55;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public void setTitle(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 101;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.title = str;
        int i5 = i2 + 111;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 85 / 0;
        }
    }

    public String getTransType() {
        int i = 2 % 2;
        int i2 = component1 + 73;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.transType;
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
        return str;
    }

    public void setTransType(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 65;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.transType = str;
        int i5 = i2 + 123;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public String getTransTypeDisplay() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.transTypeDisplay;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setTransTypeDisplay(String str) {
        int i = 2 % 2;
        int i2 = component1 + 97;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.transTypeDisplay = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getTransTime() {
        int i = 2 % 2;
        int i2 = component1 + 107;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.transTime;
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
        return str;
    }

    public void setTransTime(String str) {
        int i = 2 % 2;
        int i2 = component3 + 21;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.transTime = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public String getTransStatus() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 93;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.transStatus;
        int i4 = i2 + 115;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setTransStatus(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 13;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.transStatus = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 105;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public float getAmount() {
        int i = 2 % 2;
        int i2 = component3 + 113;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.amount;
        }
        throw null;
    }

    public void setAmount(float f) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 39;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.amount = f;
        if (i4 != 0) {
            int i5 = 54 / 0;
        }
        int i6 = i2 + 91;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getCurrencyAmount() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 25;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.currencyAmount;
        int i5 = i2 + 101;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
        return str;
    }

    public void setCurrencyAmount(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 87;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.currencyAmount = str;
        int i5 = i2 + 111;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getOppositeName() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.oppositeName;
        int i5 = i3 + 13;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 12 / 0;
        }
        return str;
    }

    public void setOppositeName(String str) {
        int i = 2 % 2;
        int i2 = component1 + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.oppositeName = str;
        if (i3 == 0) {
            int i4 = 29 / 0;
        }
    }

    public Currency getCurrency() {
        int i = 2 % 2;
        int i2 = component3 + 23;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Currency currency = this.currency;
        int i5 = i3 + 51;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return currency;
        }
        throw null;
    }

    public void setCurrency(Currency currency) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 33;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.currency = currency;
        int i5 = i2 + 95;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getInitiatorMnemonic() {
        int i = 2 % 2;
        int i2 = component3 + 103;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.initiatorMnemonic;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setInitiatorMnemonic(String str) {
        int i = 2 % 2;
        int i2 = component3 + 123;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.initiatorMnemonic = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
