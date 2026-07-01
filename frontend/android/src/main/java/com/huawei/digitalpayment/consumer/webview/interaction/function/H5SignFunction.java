package com.huawei.digitalpayment.consumer.webview.interaction.function;

import com.huawei.common.util.L;
import com.huawei.digitalpayment.consumer.baselib.util.encrypt.H5SignUtils;
import com.huawei.digitalpayment.consumer.webview.constants.WebViewConstants;
import com.huawei.digitalpayment.consumer.webview.interaction.JavascriptFunction;
import java.util.HashMap;
import org.json.JSONObject;

public class H5SignFunction extends JavascriptFunction {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static final String component2 = "H5SignFunction";

    @Override
    public String getFunctionName() {
        int i = 2 % 2;
        int i2 = component1 + 81;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 109;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return WebViewConstants.JS_FUN_H5_SIGN;
    }

    @Override
    public void execute(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = component1 + 17;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        try {
            callJs(this.callbackFuncName, H5SignUtils.encryptBody(jSONObject));
            int i4 = ShareDataUIState + 23;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e) {
            L.e(component2, "execute: " + e.getMessage());
            HashMap map = new HashMap();
            map.put("resultCode", "2");
            map.put("resultMessage", e.getMessage());
            callJs(this.callbackFuncName, map);
        }
    }
}
