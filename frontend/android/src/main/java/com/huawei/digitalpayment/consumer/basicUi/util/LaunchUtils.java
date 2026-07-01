package com.huawei.digitalpayment.consumer.basicUi.util;

import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;

public class LaunchUtils {
    public static final String CURRENT_GUIDE_VERSION = "";
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    public static boolean checkIsShowGuide() {
        int i = 2 % 2;
        int i2 = component2 + 59;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        boolean z = SPUtils.getInstance().getBoolean(SPConstant.IS_FIRST_LOGIN, true);
        int i4 = ShareDataUIState + 59;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void updateIsShowGuide(boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 23;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            SPUtils.getInstance().put(SPConstant.IS_FIRST_LOGIN, z);
        } else {
            SPUtils.getInstance().put(SPConstant.IS_FIRST_LOGIN, z);
            throw null;
        }
    }
}
