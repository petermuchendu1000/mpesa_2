package com.huawei.digitalpayment.consumer.baselib.util;

import android.app.Activity;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.TypedValue;
import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.DeviceUtils;
import com.blankj.utilcode.util.ResourceUtils;
import com.blankj.utilcode.util.StringUtils;
import com.blankj.utilcode.util.Utils;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import com.google.gson.reflect.TypeToken;
import com.huawei.common.language.LanguageUtils;
import com.huawei.common.util.L;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.baselib.PaymentBaseActivity;
import com.huawei.digitalpayment.consumer.baselib.R;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import com.huawei.digitalpayment.consumer.baselib.http.interceptor.GrayscaleInterceptor;
import com.huawei.digitalpayment.consumer.baselib.util.sign.SignUtils;
import com.huawei.digitalpayment.consumer.loginModule.register.request.RegisterKycParamsKt;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class AppInfoUtils {
    private static int ShareDataUIState = 0;
    private static final String component1 = "AppInfoUtils";
    private static int component2 = 1;

    /* JADX WARN: Removed duplicated region for block: B:40:0x0139 A[Catch: Exception -> 0x014e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x014e, blocks: (B:3:0x0003, B:16:0x00e1, B:17:0x00e4, B:19:0x00e6, B:21:0x00ec, B:22:0x00ed, B:24:0x00ef, B:26:0x00f5, B:27:0x00f6, B:28:0x00f7, B:33:0x011e, B:40:0x0139, B:42:0x013e, B:47:0x0143, B:48:0x0146, B:36:0x0126, B:49:0x0149, B:12:0x0071, B:14:0x009c, B:15:0x00dc, B:7:0x003e, B:9:0x0044, B:10:0x0069), top: B:55:0x0003, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0143 A[Catch: Exception -> 0x014e, TRY_ENTER, TryCatch #1 {Exception -> 0x014e, blocks: (B:3:0x0003, B:16:0x00e1, B:17:0x00e4, B:19:0x00e6, B:21:0x00ec, B:22:0x00ed, B:24:0x00ef, B:26:0x00f5, B:27:0x00f6, B:28:0x00f7, B:33:0x011e, B:40:0x0139, B:42:0x013e, B:47:0x0143, B:48:0x0146, B:36:0x0126, B:49:0x0149, B:12:0x0071, B:14:0x009c, B:15:0x00dc, B:7:0x003e, B:9:0x0044, B:10:0x0069), top: B:55:0x0003, inners: #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getVersionName() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.util.AppInfoUtils.getVersionName():java.lang.String");
    }

    public static String getAndroidID() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String string = Settings.Secure.getString(Utils.getApp().getContentResolver(), "android_id");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        int i4 = component2 + 81;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            UUID.randomUUID().toString();
            throw null;
        }
        String string2 = UUID.randomUUID().toString();
        int i5 = component2 + 73;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return string2;
    }

    public static boolean isDeviceRooted() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String[] strArr = {"/system/bin/", "/system/xbin/", "/sbin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/xbin/", "/data/local/bin/", "/data/local/"};
        for (int i4 = 0; i4 < 8; i4++) {
            if (new File(strArr[i4] + "su").exists()) {
                int i5 = component2 + 119;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public static Map<String, String> getBasicInfo() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put("baseUrl", AppConfigManager.getAppConfig().getBaseUrl());
        map.put("h5BaseUrl", AppConfigManager.getAppConfig().getH5BaseUrl());
        map.put("appVersion", getVersionName());
        map.put("deviceId", DeviceUtils.getAndroidID());
        map.put("platform", EventMetricsAggregator.TECHNOLOGY_TYPE);
        map.put("language", LanguageUtils.getInstance().getCurrentLang());
        map.put("appType", getAppType());
        map.put("apkSign", SignUtils.getSign());
        map.put("osVersion", Build.VERSION.RELEASE);
        map.put("deviceType", Build.MODEL);
        map.put("currency", AppConfigManager.getAppConfig().getCurrency());
        map.put("symbol", AppConfigManager.getAppConfig().getSymbol());
        map.put("registerTermsVersion", SPUtils.getInstance().getString(SPConstant.REGISTER_TERMS_VERSION));
        int i2 = component2 + 87;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return map;
    }

    public static Map<String, Object> getBasicInfo2() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put("X-Gray-User", String.valueOf(GrayscaleInterceptor.getxGrayUser()));
        map.put("baseUrl", AppConfigManager.getAppConfig().getBaseUrl());
        map.put("h5BaseUrl", AppConfigManager.getAppConfig().getH5BaseUrl());
        map.put("appVersion", getVersionName());
        map.put("deviceId", DeviceUtils.getAndroidID());
        map.put("platform", EventMetricsAggregator.TECHNOLOGY_TYPE);
        map.put("language", LanguageUtils.getInstance().getCurrentLang());
        map.put("appType", getAppType());
        map.put("apkSign", SignUtils.getSign());
        map.put("osVersion", Build.VERSION.RELEASE);
        map.put("deviceType", Build.MODEL);
        map.put("currency", AppConfigManager.getAppConfig().getCurrency());
        map.put("symbol", AppConfigManager.getAppConfig().getSymbol());
        map.put("registerTermsVersion", SPUtils.getInstance().getString(SPConstant.REGISTER_TERMS_VERSION));
        map.put("countryCode", AppConfigManager.getAppConfig().getPhoneNumberCode());
        map.put("phoneNumberMaxLength", AppConfigManager.getAppConfig().getPhoneNumberMaxLength() + "");
        map.put("phoneNumberRegular", AppConfigManager.getAppConfig().getPhoneNumberRegular());
        try {
            String string = SPUtils.getInstance().getString(SPConstant.KEY_PARAMETER_LIMITS);
            if (!TextUtils.isEmpty(string)) {
                map.put("parameterLimits", (Map) SecureGsonUtils.fromJson(string, new TypeToken<Map<String, String>>() {
                }.getType()));
                int i2 = ShareDataUIState + 21;
                component2 = i2 % 128;
                int i3 = i2 % 2;
            }
        } catch (Exception unused) {
            L.e(component1, "getBasicInfo: ");
        }
        return map;
    }

    public static String getAppType() {
        int i = 2 % 2;
        int i2 = component2 + 19;
        ShareDataUIState = i2 % 128;
        CharSequence string = null;
        if (i2 % 2 == 0) {
            for (Activity activity : ActivityUtils.getActivityList()) {
                if (activity instanceof PaymentBaseActivity) {
                    TypedValue typedValue = new TypedValue();
                    activity.getTheme().resolveAttribute(R.attr.appTag, typedValue, true);
                    string = typedValue.string;
                    if (string != null) {
                        break;
                    }
                }
            }
            if (string == null) {
                int i3 = ShareDataUIState + 117;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                string = StringUtils.getString(ResourceUtils.getStringIdByName("app_tag"));
                int i5 = component2 + 11;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
            return string.toString();
        }
        ActivityUtils.getActivityList().iterator();
        string.hashCode();
        throw null;
    }

    public static boolean isConsumer() {
        int i = 2 % 2;
        int i2 = component2 + 77;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return TextUtils.equals(RegisterKycParamsKt.REGISTER_CODE, getAppType());
        }
        TextUtils.equals(RegisterKycParamsKt.REGISTER_CODE, getAppType());
        throw null;
    }
}
