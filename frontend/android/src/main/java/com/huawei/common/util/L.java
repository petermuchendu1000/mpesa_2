package com.huawei.common.util;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.griver.image.impl.GriverPicassoExtensionImpl;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.constants.HttpConstants;
import org.apache.commons.lang3.BooleanUtils;

public class L {
    private static final int ShareDataUIState = 17;
    private static final int component1 = 16;
    private static final String component2 = "mobiemoney_android";
    private static final int component3 = 1;
    private static boolean copy = false;
    private static final int copydefault = 2;

    private L() {
    }

    public static void setIsDebug(boolean z) {
        copy = z;
    }

    public static void i(String str) {
        component3(component2, ShareDataUIState() + HttpConstants.HEADER_VALUE_DELIMITER + str, 17, 4);
    }

    public static void d(String str) {
        component3(component2, ShareDataUIState() + HttpConstants.HEADER_VALUE_DELIMITER + str, 17, 3);
    }

    public static void e(String str) {
        component3(component2, ShareDataUIState() + HttpConstants.HEADER_VALUE_DELIMITER + str, 17, 6);
    }

    public static void v(String str) {
        component3(component2, ShareDataUIState() + HttpConstants.HEADER_VALUE_DELIMITER + str, 17, 2);
    }

    public static void i(String str, String str2) {
        component3(str, ShareDataUIState() + HttpConstants.HEADER_VALUE_DELIMITER + str2, 17, 4);
    }

    public static void d(String str, String str2) {
        component3(str, ShareDataUIState() + HttpConstants.HEADER_VALUE_DELIMITER + str2, 17, 3);
    }

    public static void e(String str, String str2) {
        component3(str, ShareDataUIState() + HttpConstants.HEADER_VALUE_DELIMITER + str2, 17, 6);
    }

    public static void e(String str, String str2, Throwable th) {
        if (!copy || str2 == null) {
            return;
        }
        Log.e(str, str2, th);
    }

    public static void v(String str, String str2) {
        component3(str, ShareDataUIState() + HttpConstants.HEADER_VALUE_DELIMITER + str2, 17, 2);
    }

    public static void w(String str, String str2) {
        component3(str, ShareDataUIState() + HttpConstants.HEADER_VALUE_DELIMITER + str2, 17, 5);
    }

    public static void w(String str, String str2, Throwable th) {
        if (!copy || str2 == null) {
            return;
        }
        Log.w(str, str2, th);
    }

    private static String ShareDataUIState() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        return stackTraceElement.getFileName() + "(" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName();
    }

    private static boolean component1() {
        try {
            if (TextUtils.equals(BooleanUtils.TRUE, (String) Class.forName("android.os.SystemProperties").getMethod(GriverPicassoExtensionImpl.PICASSO_GET_METHOD, String.class, String.class).invoke(null, "log.debug", BooleanUtils.FALSE))) {
                return true;
            }
        } catch (Exception e) {
            e(component2, "onCreate: " + e.getMessage());
        }
        return copy;
    }

    private static void component3(String str, String str2, int i, int i2) {
        if (!component1() || str2 == null) {
            return;
        }
        if (str == null) {
            str = component2;
        }
        if (i2 >= 2) {
            if ((i & 16) != 0) {
                LogFileUtils.logToFile(str, str2);
            }
            if ((i & 1) != 0) {
                int length = 2001 - str.length();
                while (str2.length() > length) {
                    component3(str, str2.substring(0, length), i2);
                    str2 = str2.substring(length);
                }
                component3(str, str2, i2);
            }
        }
    }

    private static void component3(String str, String str2, int i) {
        if (i == 2) {
            Log.v(str, str2);
            return;
        }
        if (i == 3) {
            Log.d(str, str2);
            return;
        }
        if (i == 4) {
            Log.i(str, str2);
        } else if (i == 5) {
            Log.w(str, str2);
        } else {
            if (i != 6) {
                return;
            }
            Log.e(str, str2);
        }
    }
}
