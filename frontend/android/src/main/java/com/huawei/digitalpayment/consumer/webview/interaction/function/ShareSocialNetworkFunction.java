package com.huawei.digitalpayment.consumer.webview.interaction.function;

import android.text.TextUtils;
import com.blankj.utilcode.util.StringUtils;
import com.huawei.common.util.share.AppShareUtils;
import com.huawei.digitalpayment.consumer.webview.R;
import com.huawei.digitalpayment.consumer.webview.constants.WebViewConstants;
import com.huawei.digitalpayment.consumer.webview.interaction.JavascriptFunction;
import java.util.HashMap;
import org.json.JSONObject;

public class ShareSocialNetworkFunction extends JavascriptFunction {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;

    @Override
    public String getFunctionName() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 107;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 37;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return WebViewConstants.JS_FUN_SHARE_NETWORK;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void execute(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        if (jSONObject == null) {
            return;
        }
        if (AppShareUtils.shareToSocialNetwork(this.interactionView.getHostActivity(), jSONObject.optString("shareContent"), jSONObject.optString("packageName"), 56)) {
            int i4 = copydefault + 105;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                copydefault(StringUtils.getString(R.string.webview_cannot_found_share_app));
                return;
            }
            copydefault(StringUtils.getString(R.string.webview_cannot_found_share_app));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        callJs(this.callbackFuncName, StringUtils.getString(R.string.webview_share_app_success));
    }

    private void copydefault(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 3 / 0;
            if (TextUtils.isEmpty(this.callbackFuncName)) {
                return;
            }
        } else if (TextUtils.isEmpty(this.callbackFuncName)) {
            return;
        }
        HashMap map = new HashMap();
        map.put("result", "fail");
        map.put("message", str);
        callJs(this.callbackFuncName, map);
        int i4 = ShareDataUIState + 9;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
