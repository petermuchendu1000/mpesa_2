package com.huawei.digitalpayment.consumer.webview.interaction.function;

import android.text.TextUtils;
import com.huawei.digitalpayment.consumer.webview.constants.WebViewConstants;
import com.huawei.digitalpayment.consumer.webview.interaction.JavascriptFunction;
import java.util.HashMap;

public class CloseWebViewFunction extends JavascriptFunction {
    private static int component1 = 1;
    private static int component2;

    @Override
    public String getFunctionName() {
        int i = 2 % 2;
        int i2 = component1 + 55;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 79;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return WebViewConstants.JS_FUN_CLOSE_WEB_VIEW;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r0
  0x0023: PHI (r0v6 androidx.fragment.app.FragmentActivity) = (r0v5 androidx.fragment.app.FragmentActivity), (r0v11 androidx.fragment.app.FragmentActivity) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void execute(org.json.JSONObject r4) {
        /*
            r3 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.huawei.digitalpayment.consumer.webview.interaction.function.CloseWebViewFunction.component1
            int r0 = r0 + 43
            int r1 = r0 % 128
            com.huawei.digitalpayment.consumer.webview.interaction.function.CloseWebViewFunction.component2 = r1
            int r0 = r0 % r4
            if (r0 == 0) goto L1b
            com.huawei.digitalpayment.consumer.webview.interaction.InteractionView r0 = r3.interactionView
            androidx.fragment.app.FragmentActivity r0 = r0.getHostActivity()
            r1 = 35
            int r1 = r1 / 0
            if (r0 == 0) goto L49
            goto L23
        L1b:
            com.huawei.digitalpayment.consumer.webview.interaction.InteractionView r0 = r3.interactionView
            androidx.fragment.app.FragmentActivity r0 = r0.getHostActivity()
            if (r0 == 0) goto L49
        L23:
            boolean r1 = r0.isDestroyed()
            if (r1 != 0) goto L49
            int r1 = com.huawei.digitalpayment.consumer.webview.interaction.function.CloseWebViewFunction.component2
            int r1 = r1 + 107
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.webview.interaction.function.CloseWebViewFunction.component1 = r2
            int r1 = r1 % r4
            if (r1 == 0) goto L41
            r0.finish()
            int r0 = com.huawei.digitalpayment.consumer.webview.interaction.function.CloseWebViewFunction.component2
            int r0 = r0 + 79
            int r1 = r0 % 128
            com.huawei.digitalpayment.consumer.webview.interaction.function.CloseWebViewFunction.component1 = r1
            int r0 = r0 % r4
            goto L49
        L41:
            r0.finish()
            r4 = 0
            r4.hashCode()
            throw r4
        L49:
            r3.copydefault()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.webview.interaction.function.CloseWebViewFunction.execute(org.json.JSONObject):void");
    }

    private void copydefault() {
        int i = 2 % 2;
        int i2 = component2 + 119;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        if (TextUtils.isEmpty(this.callbackFuncName)) {
            return;
        }
        callJs(this.callbackFuncName, new HashMap());
        int i4 = component1 + 37;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
