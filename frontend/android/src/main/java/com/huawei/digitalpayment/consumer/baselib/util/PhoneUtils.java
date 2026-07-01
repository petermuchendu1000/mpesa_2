package com.huawei.digitalpayment.consumer.baselib.util;

import android.text.TextUtils;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.config.IAppConfig;
import java.util.regex.Pattern;

public final class PhoneUtils {
    private static int ShareDataUIState = 0;
    private static final String component1 = AppConfigManager.getAppConfig().getPhoneNumberCode();
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    static {
        int i = copydefault + 9;
        component2 = i % 128;
        int i2 = i % 2;
    }

    private PhoneUtils() {
    }

    public static boolean containCountryCode(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = !TextUtils.isEmpty(str) && str.startsWith(component1);
        int i4 = component3 + 1;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public static String getInputPhone(String str) {
        int i = 2 % 2;
        if (containCountryCode(str)) {
            str = str.substring(component1.length());
            int i2 = component3 + 93;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = ShareDataUIState + 65;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static String getRecentLoginPhone() {
        int i = 2 % 2;
        int i2 = component3 + 49;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return filterUnNumber(SPUtils.getInstance().getString("recent_login_phone_number"));
        }
        filterUnNumber(SPUtils.getInstance().getString("recent_login_phone_number"));
        throw null;
    }

    public static String getRecentLoginPhoneWithoutCode() {
        int i = 2 % 2;
        String strFilterUnNumber = filterUnNumber(SPUtils.getInstance().getString("recent_login_phone_number"));
        if (!TextUtils.isEmpty(strFilterUnNumber)) {
            int i2 = component3 + 125;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            String str = component1;
            if (!(!strFilterUnNumber.startsWith(str))) {
                int i4 = ShareDataUIState + 43;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    strFilterUnNumber.replaceFirst(str, "");
                    throw null;
                }
                strFilterUnNumber = strFilterUnNumber.replaceFirst(str, "");
            }
        }
        int i5 = component3 + 99;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return strFilterUnNumber;
    }

    public static String getRecentDesensitizationPhone() {
        String desensitizationPhone;
        int i = 2 % 2;
        int i2 = component3 + 19;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            desensitizationPhone = getDesensitizationPhone(getRecentLoginPhone());
            int i3 = 59 / 0;
        } else {
            desensitizationPhone = getDesensitizationPhone(getRecentLoginPhone());
        }
        int i4 = ShareDataUIState + 57;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return desensitizationPhone;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String getDesensitizationPhone(String str) {
        int i = 2 % 2;
        int i2 = component3 + 119;
        ShareDataUIState = i2 % 128;
        return ((IAppConfig) (i2 % 2 != 0 ? RouteUtils.getService(IAppConfig.class) : RouteUtils.getService(IAppConfig.class))).getDesensitizationPhone(str, true);
    }

    public static String filterUnNumber(String str) {
        int i = 2 % 2;
        int i2 = component3 + 113;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        if (!TextUtils.isEmpty(str)) {
            return str.replaceAll("[^\\d]", "");
        }
        int i4 = component3 + 113;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return "";
    }

    public static boolean isValidPhoneNumber(String str) {
        int i = 2 % 2;
        int i2 = component3 + 83;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return Pattern.compile(AppConfigManager.getAppConfig().getPhoneNumberRegular()).matcher(str).matches();
        }
        Pattern.compile(AppConfigManager.getAppConfig().getPhoneNumberRegular()).matcher(str).matches();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
