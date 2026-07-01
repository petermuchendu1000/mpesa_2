package com.huawei.digitalpayment.checkout.model.request;

import com.huawei.http.BaseRequestParams;
import java.util.List;
import org.json.JSONObject;

public class H5CheckoutRequest extends BaseRequestParams {
    private static int component1 = 1;
    private static int component2;
    private String accountType;
    private String appId;
    private String bankCardId;
    private String bnplProductId;
    private List<String> coupons;
    private String fundsSource;
    private JSONObject jsonParams;
    private String merchCode;
    private String payToken;
    private String prepayId;
    private String rawRequest;
    private String tradeType;

    public String getBnplProductId() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 11;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.bnplProductId;
        int i4 = i2 + 43;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setBnplProductId(String str) {
        int i = 2 % 2;
        int i2 = component1 + 47;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.bnplProductId = str;
        if (i4 != 0) {
            int i5 = 61 / 0;
        }
        int i6 = i3 + 79;
        component1 = i6 % 128;
        int i7 = i6 % 2;
    }

    public String getBankCardId() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 23;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.bankCardId;
        int i5 = i2 + 11;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public void setBankCardId(String str) {
        int i = 2 % 2;
        int i2 = component1 + 123;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.bankCardId = str;
        int i5 = i3 + 53;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getAppId() {
        int i = 2 % 2;
        int i2 = component1 + 53;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.appId;
        int i4 = i3 + 41;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setAppId(String str) {
        int i = 2 % 2;
        int i2 = component1 + 45;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.appId = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getMerchCode() {
        int i = 2 % 2;
        int i2 = component2 + 47;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.merchCode;
        if (i3 == 0) {
            int i4 = 37 / 0;
        }
        return str;
    }

    public void setMerchCode(String str) {
        int i = 2 % 2;
        int i2 = component2 + 35;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.merchCode = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 29;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getPayToken() {
        int i = 2 % 2;
        int i2 = component2 + 87;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.payToken;
        int i5 = i3 + 49;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setPayToken(String str) {
        int i = 2 % 2;
        int i2 = component2 + 21;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.payToken = str;
        int i5 = i3 + 99;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getTradeType() {
        int i = 2 % 2;
        int i2 = component1 + 21;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.tradeType;
        int i5 = i3 + 119;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setTradeType(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 91;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.tradeType = str;
        if (i4 != 0) {
            int i5 = 90 / 0;
        }
        int i6 = i2 + 45;
        component2 = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getAccountType() {
        int i = 2 % 2;
        int i2 = component2 + 59;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.accountType;
        int i5 = i3 + 97;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setAccountType(String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 67;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.accountType = str;
        int i5 = i2 + 89;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public String getRawRequest() {
        int i = 2 % 2;
        int i2 = component2 + 47;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.rawRequest;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setRawRequest(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 119;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.rawRequest = str;
        int i5 = i2 + 47;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getPrepayId() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 1;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.prepayId;
        int i4 = i2 + 73;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setPrepayId(String str) {
        int i = 2 % 2;
        int i2 = component1 + 123;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.prepayId = str;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 113;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public String getFundsSource() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 49;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.fundsSource;
        int i5 = i2 + 91;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setFundsSource(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 115;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.fundsSource = str;
        int i5 = i2 + 49;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public JSONObject getJsonParams() {
        int i = 2 % 2;
        int i2 = component2 + 43;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.jsonParams;
        }
        throw null;
    }

    public void setJsonParams(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = component2 + 121;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.jsonParams = jSONObject;
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
    }

    public List<String> getCoupons() {
        int i = 2 % 2;
        int i2 = component1 + 43;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        List<String> list = this.coupons;
        int i5 = i3 + 49;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 86 / 0;
        }
        return list;
    }

    public void setCoupons(List<String> list) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 85;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.coupons = list;
        int i5 = i2 + 107;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
