package com.huawei.digitalpayment.consumer.baselib.util;

import com.blankj.utilcode.util.ResourceUtils;
import com.blankj.utilcode.util.StringUtils;
import com.huawei.common.util.L;

public class PaymentResourcesUtils {
    public static final String STRING_RESOURCE = "@string/";
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;

    public static String getString(String str) {
        int i = 2 % 2;
        if (str != null) {
            int i2 = copydefault + 13;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            try {
                if (str.startsWith("@string/")) {
                    int i4 = ShareDataUIState + 37;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                    return StringUtils.getString(ResourceUtils.getStringIdByName(str.replace("@string/", "")));
                }
            } catch (Exception e) {
                L.d("PaymentResourcesUtils", "getString: " + e.getMessage());
            }
        }
        int i6 = ShareDataUIState + 25;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }
}
