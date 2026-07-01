package com.huawei.digitalpayment.consumer.baselib.config;

import android.text.TextUtils;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;

public class ConfigVerifyRepository extends PaymentRequest<Object> {
    public static final String H5_SIGN_KEY_VERSION = "h5SignKeyVersion";
    public static final String PIN_KEY_VERSION = "pinKeyVersion";
    public static final String SIGN_KEY_VERSION = "signKeyVersion";
    public static final String TERMS_VERSION = "termsVersion";
    private static int component2 = 1;
    private static int component3;

    public ConfigVerifyRepository() {
        int i;
        addParams(TERMS_VERSION, SPUtils.getInstance().getString(SPConstant.TERMS_VERSION));
        addParams(SIGN_KEY_VERSION, AppConfigManager.getAppConfig().getSignKeyVersion());
        addParams(PIN_KEY_VERSION, AppConfigManager.getAppConfig().getNewestPinKeyVersion());
        addParams(H5_SIGN_KEY_VERSION, AppConfigManager.getAppConfig().getH5SignKeyVersion());
        if (TextUtils.isEmpty(SPUtils.getInstance().getString(SPConstant.NEWEST_BODY_KEY_VERSION))) {
            addParams(SPConstant.BODY_KEY_VERSION, "00");
            i = component3 + 37;
            component2 = i % 128;
        } else {
            addParams(SPConstant.BODY_KEY_VERSION, AppConfigManager.getAppConfig().getH5SignKeyVersion());
            i = component3 + 51;
            component2 = i % 128;
        }
        int i2 = i % 2;
        int i3 = 2 % 2;
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 107;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 35;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return "configVerify";
        }
        throw null;
    }
}
