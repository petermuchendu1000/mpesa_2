package com.huawei.digitalpayment.consumer.loginModule.mpin.request;

import com.huawei.digitalpayment.consumer.loginModule.mpin.data.ModifyQaItem;
import com.huawei.http.BaseRequestParams;
import java.util.List;

public class ModifySecurityParams extends BaseRequestParams {
    private static int ShareDataUIState = 1;
    private static int component2;
    private String initiatorPin;
    private List<ModifyQaItem> securityList;
    private String token;

    public String getToken() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 47;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.token;
        int i4 = i2 + 13;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setToken(String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 11;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.token = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 53;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public List<ModifyQaItem> getSecurityList() {
        int i = 2 % 2;
        int i2 = component2 + 87;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.securityList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setSecurityList(List<ModifyQaItem> list) {
        int i = 2 % 2;
        int i2 = component2 + 101;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.securityList = list;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getInitiatorPin() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.initiatorPin;
        int i5 = i3 + 3;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setInitiatorPin(String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 93;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.initiatorPin = str;
        int i5 = i2 + 31;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }
}
