package com.huawei.digitalpayment.consumer.webview.interaction.function;

import com.huawei.digitalpayment.consumer.webview.constants.WebViewConstants;
import com.huawei.digitalpayment.consumer.webview.interaction.JavascriptFunction;
import org.json.JSONObject;

public class StartOdPay extends JavascriptFunction {
    private static int ShareDataUIState = 1;
    private static int component2;

    @Override
    public String getFunctionName() {
        int i = 2 % 2;
        int i2 = component2 + 103;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 9;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return WebViewConstants.JS_FUN_OD_PAYMENT;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void execute(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = component2 + 37;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.interactionView.getHostActivity().finish();
        int i4 = component2 + 87;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
