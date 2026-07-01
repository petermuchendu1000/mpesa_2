package com.huawei.digitalpayment.consumer.baselib.util;

import android.text.TextUtils;

public class CurrencyUtils {
    private static int ShareDataUIState = 1;
    private static final String component2 = "Suffix";
    private static final String component3 = "Prefix";
    private static int copydefault;

    public static boolean isPrefix(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            if (!(!TextUtils.isEmpty(str))) {
                return false;
            }
            boolean zEquals = "Prefix".equals(str);
            int i3 = copydefault + 109;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 82 / 0;
            }
            return zEquals;
        }
        TextUtils.isEmpty(str);
        throw null;
    }

    public static String getUnitTypeBySymbolPosition(Integer num) {
        int i = 2 % 2;
        if (num != null) {
            if (num.intValue() > 2) {
                int i2 = copydefault + 61;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                return "Suffix";
            }
            int i4 = copydefault + 15;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return "Prefix";
        }
        int i6 = ShareDataUIState + 39;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 59 / 0;
        }
        return "Suffix";
    }
}
