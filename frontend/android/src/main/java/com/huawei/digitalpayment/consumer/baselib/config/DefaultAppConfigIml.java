package com.huawei.digitalpayment.consumer.baselib.config;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/config/DefaultAppConfigIml;", "Lcom/huawei/digitalpayment/consumer/baselib/config/IAppConfig;", "<init>", "()V", "getBaseUrl", "", "getPinKey", "getPinTransformation", "getSignKey", "getSignKeyVersion", "getSignTransformation", "miniAppSupportRTL", "", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class DefaultAppConfigIml implements IAppConfig {
    private static int ShareDataUIState = 1;
    private static int component1;

    @Override
    public String getBaseUrl() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 121;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 107;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return "";
        }
        throw null;
    }

    @Override
    public String getPinKey() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 11;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 65;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return "";
    }

    @Override
    public String getPinTransformation() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 45;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 47;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return "";
        }
        throw null;
    }

    @Override
    public String getSignKey() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 73;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return "";
        }
        obj.hashCode();
        throw null;
    }

    @Override
    public String getSignKeyVersion() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 19;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 5 / 0;
        }
        return "";
    }

    @Override
    public String getSignTransformation() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 93;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 55;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return "";
    }

    @Override
    public boolean miniAppSupportRTL() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 49;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 79;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }
}
