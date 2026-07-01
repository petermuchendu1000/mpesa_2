package com.huawei.digitalpayment.checkout.util;

import android.text.TextUtils;
import com.blankj.utilcode.util.CollectionUtils;
import com.blankj.utilcode.util.GsonUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import java.util.Arrays;
import java.util.List;

public class PayUtils {
    private static int component2 = 0;
    private static int copydefault = 1;

    public static List<String> getPayPriorityList() {
        int i = 2 % 2;
        String string = SPUtils.getInstance(AppConfigManager.SP_APP).getString(SPConstant.PRIORITY_PAY);
        if (!(!TextUtils.isEmpty(string))) {
            return Arrays.asList("0", "1", "2", "4");
        }
        List<String> list = (List) GsonUtils.fromJson(string, new TypeToken<List<String>>() {
        }.getType());
        if (CollectionUtils.isEmpty(list)) {
            int i2 = component2 + 53;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return Arrays.asList("0", "1", "2", "4");
            }
            String[] strArr = {"1", "0"};
            strArr[4] = "2";
            strArr[5] = "4";
            return Arrays.asList(strArr);
        }
        if (!list.contains("0")) {
            int i3 = component2 + 119;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            list.add("0");
        }
        if (!list.contains("1")) {
            list.add("1");
        }
        if (!list.contains("2")) {
            int i5 = component2 + 51;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            list.add("2");
        }
        if (!list.contains("4")) {
            list.add("4");
        }
        return list;
    }
}
