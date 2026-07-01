package com.huawei.digitalpayment.consumer.webview.interaction;

import android.text.TextUtils;
import java.util.HashMap;

public abstract class BaseFunction extends JavascriptFunction {
    private static int component2 = 0;
    private static int copydefault = 1;

    protected void notifySuccess(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HashMap map = new HashMap();
        map.put("result", "success");
        callJs(str, map);
        int i4 = component2 + 25;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
