package com.huawei.digitalpayment.consumer.webview.interaction.function;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.blankj.utilcode.util.Utils;
import com.huawei.common.util.L;
import com.huawei.digitalpayment.consumer.webview.constants.WebViewConstants;
import com.huawei.digitalpayment.consumer.webview.interaction.JavascriptFunction;
import org.json.JSONObject;

public class OpenThirdPartApp extends JavascriptFunction {
    private static int ShareDataUIState = 1;
    private static int component3;

    @Override
    public String getFunctionName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 79;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 119;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return WebViewConstants.JS_FUN_OPEN_THIRD_APP;
    }

    @Override
    public void execute(JSONObject jSONObject) {
        int i = 2 % 2;
        if (jSONObject == null) {
            int i2 = ShareDataUIState + 87;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        String strOptString = jSONObject.optString("packageName");
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(jSONObject.optString("uri")));
            if (!TextUtils.isEmpty(strOptString)) {
                int i3 = component3 + 75;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                intent.setPackage(strOptString);
            }
            intent.addFlags(268435456);
            Utils.getApp().startActivity(intent);
        } catch (Exception e) {
            L.d("=====", e.getMessage());
        }
        int i5 = ShareDataUIState + 45;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }
}
