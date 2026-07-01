package com.huawei.digitalpayment.consumer.loginModule.util;

import com.google.gson.JsonObject;
import com.huawei.common.util.L;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.util.PhoneUtils;

public class LoginUtils {
    private static int component1 = 0;
    private static int copydefault = 1;

    public static void saveIdentityId(JsonObject jsonObject) {
        int i = 2 % 2;
        int i2 = copydefault + 113;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        try {
            String asString = jsonObject.getAsJsonObject("customer").get("identityId").getAsString();
            String recentLoginPhone = PhoneUtils.getRecentLoginPhone();
            if (recentLoginPhone != null) {
                int i4 = copydefault + 21;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                SPUtils.getInstance().put(recentLoginPhone, asString);
                SPUtils.getInstance().put("recentIdentityID", asString);
                int i6 = component1 + 85;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
            }
        } catch (Exception e) {
            L.d("LoginUtils", "saveIdentityId: " + e.getMessage());
        }
    }

    public static void removeRecentIdentityId() {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            SPUtils.getInstance().remove("recentIdentityID");
            return;
        }
        SPUtils.getInstance().remove("recentIdentityID");
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
