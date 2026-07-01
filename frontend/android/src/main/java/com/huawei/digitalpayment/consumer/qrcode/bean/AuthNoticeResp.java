package com.huawei.digitalpayment.consumer.qrcode.bean;

import com.huawei.http.BaseResp;
import java.util.List;

public class AuthNoticeResp extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int component3;
    private String appId;
    private String codeAlias;
    private String confirm;
    private List<?> displayItems;
    private String exist;
    private String expire;
    private String merchCode;
    private String prepayId;
    private String tradeType;

    public String getConfirm() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 27;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.confirm;
        int i5 = i2 + 83;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setConfirm(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.confirm = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 95;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getPrepayId() {
        int i = 2 % 2;
        int i2 = component3 + 55;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.prepayId;
        int i5 = i3 + 63;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setPrepayId(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 93;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.prepayId = str;
        int i5 = i2 + 47;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getExpire() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 79;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.expire;
        int i5 = i2 + 55;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setExpire(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 45;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.expire = str;
        int i5 = i2 + 121;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getCodeAlias() {
        int i = 2 % 2;
        int i2 = component3 + 61;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.codeAlias;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setCodeAlias(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 63;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.codeAlias = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public List<?> getDisplayItems() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 123;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        List<?> list = this.displayItems;
        int i5 = i3 + 57;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public void setDisplayItems(List<?> list) {
        int i = 2 % 2;
        int i2 = component3 + 33;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.displayItems = list;
        int i5 = i3 + 5;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
    }

    public String getMerchCode() {
        int i = 2 % 2;
        int i2 = component3 + 29;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.merchCode;
        int i4 = i3 + 53;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public void setMerchCode(String str) {
        int i = 2 % 2;
        int i2 = component3 + 97;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.merchCode = str;
        int i5 = i3 + 99;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getAppId() {
        int i = 2 % 2;
        int i2 = component3 + 39;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.appId;
        int i5 = i3 + 11;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setAppId(String str) {
        int i = 2 % 2;
        int i2 = component3 + 63;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.appId = str;
        int i5 = i3 + 69;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getTradeType() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 59;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            str = this.tradeType;
            int i4 = 69 / 0;
        } else {
            str = this.tradeType;
        }
        int i5 = i3 + 35;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setTradeType(String str) {
        int i = 2 % 2;
        int i2 = component3 + 89;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.tradeType = str;
        int i5 = i3 + 47;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getExist() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 93;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.exist;
        int i5 = i2 + 77;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setExist(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 1;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.exist = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 121;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }
}
