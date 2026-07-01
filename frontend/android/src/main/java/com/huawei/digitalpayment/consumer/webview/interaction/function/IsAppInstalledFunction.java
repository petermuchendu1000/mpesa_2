package com.huawei.digitalpayment.consumer.webview.interaction.function;

import android.text.TextUtils;
import com.blankj.utilcode.util.AppUtils;
import com.huawei.digitalpayment.consumer.webview.constants.WebViewConstants;
import com.huawei.digitalpayment.consumer.webview.interaction.JavascriptFunction;
import java.util.HashMap;
import org.json.JSONObject;

public class IsAppInstalledFunction extends JavascriptFunction {
    private static int component1 = 1;
    private static int component2;

    @Override
    public String getFunctionName() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 77;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return WebViewConstants.JS_FUN_IS_APP_INSTALL;
    }

    @Override
    public void execute(JSONObject jSONObject) {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 105;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (jSONObject == null) {
            return;
        }
        if (TextUtils.isEmpty(this.callbackFuncName)) {
            int i3 = component2 + 53;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        String strOptString = jSONObject.optString("packageName");
        HashMap map = new HashMap();
        if (!(!AppUtils.isAppInstalled(strOptString))) {
            int i5 = component1 + 47;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            str = "1";
        } else {
            int i7 = component1 + 17;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            str = "0";
        }
        map.put("resultCode", str);
        callJs(this.callbackFuncName, map);
    }
}
