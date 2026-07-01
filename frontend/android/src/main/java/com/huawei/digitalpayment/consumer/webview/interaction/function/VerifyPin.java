package com.huawei.digitalpayment.consumer.webview.interaction.function;

import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.webview.constants.WebViewConstants;
import com.huawei.digitalpayment.consumer.webview.interaction.JavascriptFunction;
import org.json.JSONObject;

public class VerifyPin extends JavascriptFunction {
    private static int component2 = 1;
    private static int copydefault;

    @Override
    public String getFunctionName() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 49;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 119;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return WebViewConstants.JS_FUN_VERIFY_PIN;
        }
        obj.hashCode();
        throw null;
    }

    @Override
    public void execute(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = component2 + 33;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (TextUtils.isEmpty(this.callbackFuncName)) {
            return;
        }
        boolean zOptBoolean = false;
        if (jSONObject != null) {
            int i4 = component2 + 23;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            zOptBoolean = jSONObject.optBoolean(KeysConstants.IS_SUPPORT_BIOMETRIC, false);
        }
        component1(zOptBoolean);
    }

    private void component1(boolean z) {
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        bundle.putBoolean(KeysConstants.IS_SUPPORT_BIOMETRIC, z);
        RouteUtils.routeWithExecute(this.interactionView.getHostActivity(), RoutePathConstants.IDENTIFY_PIN, bundle, null, null, 0, 9999);
        int i2 = copydefault + 67;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 64 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            java.lang.String r0 = "pin"
            r1 = 2
            int r2 = r1 % r1
            int r2 = com.huawei.digitalpayment.consumer.webview.interaction.function.VerifyPin.component2
            int r2 = r2 + 69
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.webview.interaction.function.VerifyPin.copydefault = r3
            int r2 = r2 % r1
            java.lang.String r3 = "status"
            if (r2 == 0) goto L1a
            super.onActivityResult(r5, r6, r7)
            r2 = 28186(0x6e1a, float:3.9497E-41)
            if (r5 != r2) goto L48
            goto L21
        L1a:
            super.onActivityResult(r5, r6, r7)
            r2 = 9999(0x270f, float:1.4012E-41)
            if (r5 != r2) goto L48
        L21:
            r5 = -1
            if (r6 != r5) goto L48
            if (r7 == 0) goto L48
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.String r6 = "1"
            r5.put(r3, r6)
            java.lang.String r6 = new java.lang.String
            byte[] r7 = r7.getByteArrayExtra(r0)
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            r6.<init>(r7, r1)
            java.lang.String r6 = com.huawei.digitalpayment.consumer.baselib.util.encrypt.EncryptUtils.encryptWithPinKey(r6)
            r5.put(r0, r6)
            java.lang.String r6 = r4.callbackFuncName
            r4.callJs(r6, r5)
            goto L60
        L48:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.String r6 = "-1"
            r5.put(r3, r6)
            java.lang.String r6 = r4.callbackFuncName
            r4.callJs(r6, r5)
            int r5 = com.huawei.digitalpayment.consumer.webview.interaction.function.VerifyPin.component2
            int r5 = r5 + 47
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.webview.interaction.function.VerifyPin.copydefault = r6
            int r5 = r5 % r1
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.webview.interaction.function.VerifyPin.onActivityResult(int, int, android.content.Intent):void");
    }
}
