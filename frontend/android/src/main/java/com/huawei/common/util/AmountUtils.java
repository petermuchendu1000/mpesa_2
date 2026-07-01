package com.huawei.common.util;

import android.text.TextUtils;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class AmountUtils {
    public static String parseAmount(String str) {
        return parseAmount(str, "0.00");
    }

    public static String parseAmount(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.endsWith(".")) {
            str = str.substring(0, str.length() - 1);
        }
        try {
            return new DecimalFormat(str2, new DecimalFormatSymbols(Locale.US)).format(new BigDecimal(str).doubleValue());
        } catch (Exception e) {
            L.d("=====", e.getMessage());
            return "";
        }
    }

    public static boolean isValidAmount(String str) {
        return !TextUtils.isEmpty(parseAmount(str));
    }

    public static boolean isAmountZero(String str) {
        return TextUtils.equals("0.00", parseAmount(str));
    }
}
