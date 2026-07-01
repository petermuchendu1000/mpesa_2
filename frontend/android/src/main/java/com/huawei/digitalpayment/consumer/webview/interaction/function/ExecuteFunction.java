package com.huawei.digitalpayment.consumer.webview.interaction.function;

import android.text.TextUtils;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.webview.constants.WebViewConstants;
import com.huawei.digitalpayment.consumer.webview.interaction.JavascriptFunction;
import java.util.HashMap;
import org.json.JSONObject;

public class ExecuteFunction extends JavascriptFunction {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;

    @Override
    public String getFunctionName() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 101;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 107;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return WebViewConstants.JS_FUN_EXECUTE;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void execute(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        if (jSONObject == null) {
            return;
        }
        copydefault(jSONObject);
        int i4 = ShareDataUIState + 65;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    private void copydefault(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = component1 + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String strOptString = jSONObject.optString(KeysConstants.KEY_EXECUTE);
        if (!TextUtils.isEmpty(strOptString)) {
            RouteUtils.routeWithExecute(this.interactionView.getHostActivity(), strOptString);
            copydefault();
            int i4 = ShareDataUIState + 107;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        int i6 = ShareDataUIState + 95;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            component2("Not find \"execute\"");
        } else {
            component2("Not find \"execute\"");
            int i7 = 25 / 0;
        }
    }

    private void copydefault() {
        int i = 2 % 2;
        int i2 = component1 + 87;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        if (!TextUtils.isEmpty(this.callbackFuncName)) {
            HashMap map = new HashMap();
            map.put("result", "success");
            callJs(this.callbackFuncName, map);
        } else {
            int i4 = ShareDataUIState + 5;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    private void component2(String str) {
        int i = 2 % 2;
        if (!TextUtils.isEmpty(this.callbackFuncName)) {
            HashMap map = new HashMap();
            map.put("result", "fail");
            map.put("message", str);
            callJs(this.callbackFuncName, map);
            int i2 = ShareDataUIState + 75;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i3 = component1 + 51;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
    }
}
