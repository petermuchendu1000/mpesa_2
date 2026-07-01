package com.huawei.digitalpayment.consumer.baselib.util;

import androidx.fragment.app.FragmentActivity;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;

public class SecureUtils {
    private static int ShareDataUIState = 1;
    private static int component2;

    public static void secureWindow(FragmentActivity fragmentActivity) {
        int i = 2 % 2;
        int i2 = component2 + 57;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        if (AppConfigManager.getAppConfig().isDebug()) {
            return;
        }
        int i4 = component2 + 99;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        fragmentActivity.getWindow().addFlags(8192);
        int i6 = ShareDataUIState + 111;
        component2 = i6 % 128;
        int i7 = i6 % 2;
    }
}
