package com.huawei.digitalpayment.checkout.model.request;

import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.http.BaseRequestParams;

public class SubscribeOdRequest extends BaseRequestParams {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private String channelId;
    private String extCommandId;
    private String initiatorMsisdn;
    private String initiatorPin;
    private String pinVersion = AppConfigManager.getAppConfig().getPinKeyVersion();

    public String getPinVersion() {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.pinVersion;
        if (i3 != 0) {
            int i4 = 19 / 0;
        }
        return str;
    }

    public void setPinVersion(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 37;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.pinVersion = str;
        int i5 = i2 + 55;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 23 / 0;
        }
    }

    public SubscribeOdRequest(String str, String str2, String str3, String str4) {
        this.channelId = str;
        this.extCommandId = str2;
        this.initiatorMsisdn = str3;
        this.initiatorPin = str4;
    }

    public String getChannelId() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 107;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.channelId;
        int i5 = i2 + 49;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 33 / 0;
        }
        return str;
    }

    public void setChannelId(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 73;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.channelId = str;
        int i5 = i2 + 115;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getExtCommandId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 119;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.extCommandId;
        int i5 = i2 + 99;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 72 / 0;
        }
        return str;
    }

    public void setExtCommandId(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.extCommandId = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getInitiatorMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.initiatorMsisdn;
        int i5 = i3 + 101;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setInitiatorMsisdn(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.initiatorMsisdn = str;
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
    }

    public String getInitiatorPin() {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.initiatorPin;
        int i5 = i3 + 71;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 99 / 0;
        }
        return str;
    }

    public void setInitiatorPin(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.initiatorPin = str;
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
    }
}
