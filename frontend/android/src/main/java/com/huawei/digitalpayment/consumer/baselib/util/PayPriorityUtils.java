package com.huawei.digitalpayment.consumer.baselib.util;

import android.text.TextUtils;
import com.blankj.utilcode.util.CollectionUtils;
import com.blankj.utilcode.util.GsonUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import java.util.Arrays;
import java.util.List;

public class PayPriorityUtils {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;

    public static List<String> getPayPriorityList() {
        int i = 2 % 2;
        String string = SPUtils.getInstance(AppConfigManager.SP_APP).getString(SPConstant.PRIORITY_PAY);
        if (TextUtils.isEmpty(string)) {
            return Arrays.asList("0", "1", "2", "4");
        }
        List<String> list = (List) GsonUtils.fromJson(string, new TypeToken<List<String>>() {
        }.getType());
        if (!(!CollectionUtils.isEmpty(list))) {
            List<String> listAsList = Arrays.asList("0", "1", "2", "4");
            int i2 = ShareDataUIState + 71;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return listAsList;
        }
        if (!list.contains("0")) {
            list.add("0");
        }
        if (!list.contains("1")) {
            list.add("1");
        }
        if (!list.contains("2")) {
            int i4 = ShareDataUIState + 59;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            list.add("2");
        }
        if (!list.contains("4")) {
            int i6 = component3 + 105;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            list.add("4");
        }
        return list;
    }
}
