package com.huawei.digitalpayment.consumer.webview.interaction.function;

import com.blankj.utilcode.util.StringUtils;
import com.huawei.common.util.L;
import com.huawei.common.util.share.AppShareUtils;
import com.huawei.digitalpayment.consumer.webview.R;
import com.huawei.digitalpayment.consumer.webview.constants.WebViewConstants;
import com.huawei.digitalpayment.consumer.webview.interaction.JavascriptFunction;
import org.json.JSONObject;

public class ShareLocalFunction extends JavascriptFunction {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;

    @Override
    public String getFunctionName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return WebViewConstants.JS_FUN_SHARE_LOCAL;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void execute(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        component1 = i2 % 128;
        try {
        } catch (Exception e) {
            L.e("ShareLocalFunction", "execute: " + e.getMessage());
        }
        if (i2 % 2 != 0) {
            AppShareUtils.shareText(StringUtils.getString(R.string.webview_share), jSONObject.getString("shareContent"));
            int i3 = component1 + 33;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 15 / 0;
                return;
            }
            return;
        }
        AppShareUtils.shareText(StringUtils.getString(R.string.webview_share), jSONObject.getString("shareContent"));
        throw null;
    }
}
