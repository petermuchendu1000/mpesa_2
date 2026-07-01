package com.huawei.digitalpayment.consumer.webview.interaction.function;

import android.text.TextUtils;
import com.huawei.digitalpayment.consumer.baselib.config.ColorConfigManager;
import com.huawei.digitalpayment.consumer.webview.constants.WebViewConstants;
import com.huawei.digitalpayment.consumer.webview.interaction.JavascriptFunction;
import org.json.JSONObject;

public class GetColorConfigFunction extends JavascriptFunction {
    private static int component2 = 1;
    private static int copydefault;

    @Override
    public String getFunctionName() {
        int i = 2 % 2;
        int i2 = component2 + 73;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 105;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return WebViewConstants.JS_FUN_GET_COLOR_CONFIG;
    }

    @Override
    public void execute(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ShareDataUIState();
        if (i3 == 0) {
            int i4 = 96 / 0;
        }
        int i5 = component2 + 67;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
    }

    private void ShareDataUIState() {
        int i = 2 % 2;
        int i2 = component2 + 109;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            if (!TextUtils.isEmpty(this.callbackFuncName)) {
                callJs(this.callbackFuncName, ColorConfigManager.INSTANCE.getColorConfigForH5());
                return;
            }
            int i3 = copydefault + 39;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        TextUtils.isEmpty(this.callbackFuncName);
        throw null;
    }
}
