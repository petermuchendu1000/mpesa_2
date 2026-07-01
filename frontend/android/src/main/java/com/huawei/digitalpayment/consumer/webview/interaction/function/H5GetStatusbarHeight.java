package com.huawei.digitalpayment.consumer.webview.interaction.function;

import com.blankj.utilcode.util.Utils;
import com.huawei.common.util.ViewUtils;
import com.huawei.digitalpayment.consumer.webview.constants.WebViewConstants;
import com.huawei.digitalpayment.consumer.webview.interaction.JavascriptFunction;
import java.util.HashMap;
import org.json.JSONObject;

public class H5GetStatusbarHeight extends JavascriptFunction {
    private static int ShareDataUIState = 1;
    private static final String component1 = "H5GetStatusbarHeight";
    private static int component2;

    @Override
    public String getFunctionName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 1;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 62 / 0;
        }
        int i5 = i2 + 29;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 72 / 0;
        }
        return WebViewConstants.JS_FUN_GET_STATUSBAR_HEIGHT;
    }

    @Override
    public void execute(JSONObject jSONObject) {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put("resultCode", "1");
        map.put("data", String.valueOf(ViewUtils.getStatusBarHeight(Utils.getApp())));
        callJs(this.callbackFuncName, map);
        int i2 = component2 + 85;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }
}
