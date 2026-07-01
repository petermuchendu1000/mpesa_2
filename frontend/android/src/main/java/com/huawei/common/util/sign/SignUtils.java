package com.huawei.common.util.sign;

import android.text.TextUtils;
import com.blankj.utilcode.util.Utils;
import java.util.ArrayList;

public class SignUtils {
    private static String component3;

    public static String getSign() throws Throwable {
        if (TextUtils.isEmpty(component3)) {
            ArrayList<String> singInfo = AppSigning.getSingInfo(Utils.getApp(), Utils.getApp().getPackageName());
            if (singInfo.size() > 0) {
                component3 = singInfo.get(0);
            }
        }
        return component3;
    }

    public static void setSign(String str) {
        component3 = str;
    }
}
