package com.huawei.digitalpayment.consumer.webview.interaction.function;

import android.graphics.Color;
import com.blankj.utilcode.util.BarUtils;
import com.huawei.common.util.L;
import com.huawei.digitalpayment.consumer.webview.constants.WebViewConstants;
import com.huawei.digitalpayment.consumer.webview.interaction.JavascriptFunction;
import org.json.JSONObject;

public class SetToolbarBackground extends JavascriptFunction {
    public static final String KEY_STATUS_BAR_LIGHT = "isLight";
    public static final String KEY_TOOLBAR_BACKGROUND = "toolbarBackground";
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private static final String copydefault = "SetToolbarBackground";

    @Override
    public String getFunctionName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return WebViewConstants.JS_FUN_SET_TOOLBAR_BACKGROUND;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void execute(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 11;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        if (jSONObject == null) {
            int i5 = i2 + 117;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        if (jSONObject.has(KEY_TOOLBAR_BACKGROUND)) {
            try {
                this.interactionView.getHostActivity().getWindow().getDecorView().findViewWithTag("llToolbar").setBackgroundColor(Color.parseColor(jSONObject.optString(KEY_TOOLBAR_BACKGROUND)));
            } catch (Exception e) {
                L.e(copydefault, "execute: " + e.getMessage());
            }
        }
        if (jSONObject.has(KEY_STATUS_BAR_LIGHT)) {
            BarUtils.setStatusBarLightMode(this.interactionView.getHostActivity(), jSONObject.optBoolean(KEY_TOOLBAR_BACKGROUND));
        }
    }
}
