package com.huawei.digitalpayment.consumer.basic.ui.service;

import com.huawei.biometric.DefaultBiometricIml;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;

public class PaymentBiometricIml extends DefaultBiometricIml {
    private static int component1 = 1;
    private static int component2;

    @Override
    public boolean onlySupport3D() {
        boolean zOnlySupport3D;
        int i = 2 % 2;
        int i2 = component2 + 119;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            zOnlySupport3D = AppConfigManager.getAppConfig().onlySupport3D();
            int i3 = 17 / 0;
        } else {
            zOnlySupport3D = AppConfigManager.getAppConfig().onlySupport3D();
        }
        int i4 = component1 + 23;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return zOnlySupport3D;
    }

    @Override
    public boolean replaceFingerprintText() {
        int i = 2 % 2;
        int i2 = component2 + 39;
        component1 = i2 % 128;
        return true ^ (i2 % 2 == 0);
    }
}
