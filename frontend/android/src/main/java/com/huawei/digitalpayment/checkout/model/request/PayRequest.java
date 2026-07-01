package com.huawei.digitalpayment.checkout.model.request;

import com.huawei.http.BaseRequestParams;
import java.util.Map;

public class PayRequest extends BaseRequestParams {
    private static int component2 = 1;
    private static int copydefault;
    private Boolean agreeToBindCard;
    private String initiatorPin;
    private Map<String, Object> paymentFactor;
    private String pinVersion;
    private String prepayId;

    public PayRequest() {
    }

    public PayRequest(String str, String str2, String str3) {
        this.prepayId = str;
        this.initiatorPin = str2;
        this.pinVersion = str3;
    }

    public Map<String, Object> getPaymentFactor() {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> map = this.paymentFactor;
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
        return map;
    }

    public void setPaymentFactor(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = copydefault + 25;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.paymentFactor = map;
        if (i3 == 0) {
            throw null;
        }
    }

    public Boolean getAgreeToBindCard() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 39;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Boolean bool = this.agreeToBindCard;
        int i4 = i2 + 37;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return bool;
        }
        obj.hashCode();
        throw null;
    }

    public void setAgreeToBindCard(Boolean bool) {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.agreeToBindCard = bool;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getPrepayId() {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.prepayId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setPrepayId(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.prepayId = str;
        int i5 = i3 + 29;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getInitiatorPin() {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.initiatorPin;
        }
        throw null;
    }

    public void setInitiatorPin(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 47;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.initiatorPin = str;
        int i5 = i2 + 29;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getPinVersion() {
        int i = 2 % 2;
        int i2 = component2 + 3;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.pinVersion;
        int i4 = i3 + 119;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setPinVersion(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.pinVersion = str;
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
    }
}
