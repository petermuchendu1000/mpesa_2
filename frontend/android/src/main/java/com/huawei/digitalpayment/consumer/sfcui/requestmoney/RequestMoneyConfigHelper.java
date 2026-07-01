package com.huawei.digitalpayment.consumer.sfcui.requestmoney;

import android.text.TextUtils;
import com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.RequestMoneyConfig;
import com.iap.ac.config.lite.ConfigMerger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/RequestMoneyConfigHelper;", "", "<init>", "()V", "maxAmount", "", "getMaxAmount", "()I", "setMaxAmount", "(I)V", "minAmount", "getMinAmount", "setMinAmount", "validateEnable", "", "getValidateEnable", "()Z", "setValidateEnable", "(Z)V", "isGetConfigSuccess", "setGetConfigSuccess", "updateRequestConfig", "", ConfigMerger.COMMON_CONFIG_SECTION, "Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/data/RequestMoneyConfig;", "isAmountLess", "amount", "", "isAmountLarger", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RequestMoneyConfigHelper {
    private static int component1 = 0;
    private static boolean component3 = false;
    private static int component4 = 1;
    private static int equals = 1;
    private static int getAsAtTimestamp;
    public static final RequestMoneyConfigHelper INSTANCE = new RequestMoneyConfigHelper();
    private static int ShareDataUIState = 10001;
    private static int copydefault = 1;
    private static boolean component2 = true;
    public static final int $stable = 8;

    private RequestMoneyConfigHelper() {
    }

    static {
        int i = component1 + 81;
        equals = i % 128;
        int i2 = i % 2;
    }

    public final int getMaxAmount() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 79;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = ShareDataUIState;
        int i6 = i2 + 117;
        component4 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setMaxAmount(int i) {
        int i2 = 2 % 2;
        int i3 = component4 + 23;
        int i4 = i3 % 128;
        getAsAtTimestamp = i4;
        int i5 = i3 % 2;
        ShareDataUIState = i;
        int i6 = i4 + 87;
        component4 = i6 % 128;
        int i7 = i6 % 2;
    }

    public final int getMinAmount() {
        int i = 2 % 2;
        int i2 = component4 + 111;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        int i5 = copydefault;
        int i6 = i3 + 45;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final void setMinAmount(int i) {
        int i2 = 2 % 2;
        int i3 = component4 + 89;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        copydefault = i;
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getValidateEnable() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 3;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        boolean z = component2;
        int i5 = i2 + 17;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final void setValidateEnable(boolean z) {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 115;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        component2 = z;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 117;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean isGetConfigSuccess() {
        int i = 2 % 2;
        int i2 = component4 + 123;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = component3;
        int i4 = i3 + 121;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final void setGetConfigSuccess(boolean z) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 9;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        component3 = z;
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
    }

    public final void updateRequestConfig(RequestMoneyConfig config) {
        int i = 2 % 2;
        int i2 = component4 + 99;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(config, "");
        component3 = true;
        ShareDataUIState = config.getMaxAmount();
        copydefault = config.getMinAmount();
        component2 = config.getEnable();
        int i4 = getAsAtTimestamp + 73;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final boolean isAmountLess(String amount) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(amount, "");
        if (TextUtils.isEmpty(amount)) {
            int i2 = component4 + 81;
            getAsAtTimestamp = i2 % 128;
            return i2 % 2 != 0;
        }
        if (Float.parseFloat(amount) >= copydefault) {
            return false;
        }
        int i3 = getAsAtTimestamp + 63;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    public final boolean isAmountLarger(String amount) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(amount, "");
        if (TextUtils.isEmpty(amount)) {
            int i2 = getAsAtTimestamp + 11;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Float.parseFloat(amount) <= ShareDataUIState) {
            return false;
        }
        int i4 = getAsAtTimestamp + 93;
        component4 = i4 % 128;
        return i4 % 2 != 0;
    }
}
