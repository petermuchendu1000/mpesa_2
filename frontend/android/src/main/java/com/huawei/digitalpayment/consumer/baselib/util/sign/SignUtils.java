package com.huawei.digitalpayment.consumer.baselib.util.sign;

import android.text.TextUtils;
import com.blankj.utilcode.util.Utils;
import java.util.ArrayList;

public class SignUtils {
    private static String ShareDataUIState = null;
    private static int component1 = 0;
    private static int component3 = 1;

    public static String getSign() throws Throwable {
        int i = 2 % 2;
        if (TextUtils.isEmpty(ShareDataUIState)) {
            int i2 = component1 + 17;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            ArrayList<String> singInfo = AppSigning.getSingInfo(Utils.getApp(), Utils.getApp().getPackageName());
            if (singInfo.size() > 0) {
                int i4 = component3 + 3;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                ShareDataUIState = singInfo.get(0);
            }
        }
        return ShareDataUIState;
    }

    public static void setSign(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 61;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        ShareDataUIState = str;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 31;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
