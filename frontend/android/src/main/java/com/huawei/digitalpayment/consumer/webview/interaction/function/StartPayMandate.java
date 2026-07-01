package com.huawei.digitalpayment.consumer.webview.interaction.function;

import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.checkout.constants.TradeTypeEnum;
import com.huawei.digitalpayment.checkout.manager.PayManager;
import com.huawei.digitalpayment.checkout.model.response.CheckoutResp;
import com.huawei.digitalpayment.checkout.model.response.TransferResp;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.webview.constants.WebViewConstants;
import com.huawei.digitalpayment.consumer.webview.interaction.JavascriptFunction;
import java.util.HashMap;
import org.json.JSONObject;

public class StartPayMandate extends JavascriptFunction {
    private static int component3 = 0;
    private static int copydefault = 1;

    static String ShareDataUIState(StartPayMandate startPayMandate) {
        int i = 2 % 2;
        int i2 = component3 + 103;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = startPayMandate.callbackFuncName;
        int i4 = component3 + 37;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static String component2(StartPayMandate startPayMandate) {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = startPayMandate.callbackFuncName;
        int i4 = component3 + 111;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component2(StartPayMandate startPayMandate, String str, String str2) {
        int i = 2 % 2;
        int i2 = component3 + 117;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        startPayMandate.callJs(str, str2);
        if (i3 == 0) {
            throw null;
        }
        int i4 = component3 + 107;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
    }

    static void component3(StartPayMandate startPayMandate, String str, String str2) {
        int i = 2 % 2;
        int i2 = component3 + 1;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        startPayMandate.callJs(str, str2);
        int i4 = copydefault + 1;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public String getFunctionName() {
        int i = 2 % 2;
        int i2 = component3 + 5;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 13;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return WebViewConstants.JS_FUN_PAY_MANDATE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r5 = 9 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (android.text.TextUtils.isEmpty(r4.callbackFuncName) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        component2(r5);
        r5 = com.huawei.digitalpayment.consumer.webview.interaction.function.StartPayMandate.copydefault + 39;
        com.huawei.digitalpayment.consumer.webview.interaction.function.StartPayMandate.component3 = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if ((r5 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        r5 = null;
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r1 = r1 + 33;
        com.huawei.digitalpayment.consumer.webview.interaction.function.StartPayMandate.component3 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if ((r1 % 2) == 0) goto L20;
     */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void execute(org.json.JSONObject r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.webview.interaction.function.StartPayMandate.copydefault
            int r2 = r1 + 5
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.webview.interaction.function.StartPayMandate.component3 = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L15
            r2 = 97
            int r2 = r2 / 0
            if (r5 != 0) goto L25
            goto L17
        L15:
            if (r5 != 0) goto L25
        L17:
            int r1 = r1 + 33
            int r5 = r1 % 128
            com.huawei.digitalpayment.consumer.webview.interaction.function.StartPayMandate.component3 = r5
            int r1 = r1 % r0
            if (r1 == 0) goto L24
            r5 = 9
            int r5 = r5 / 0
        L24:
            return
        L25:
            java.lang.String r1 = r4.callbackFuncName
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L2e
            return
        L2e:
            r4.component2(r5)
            int r5 = com.huawei.digitalpayment.consumer.webview.interaction.function.StartPayMandate.copydefault
            int r5 = r5 + 39
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.webview.interaction.function.StartPayMandate.component3 = r1
            int r5 = r5 % r0
            if (r5 != 0) goto L3d
            return
        L3d:
            r5 = 0
            r5.hashCode()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.webview.interaction.function.StartPayMandate.execute(org.json.JSONObject):void");
    }

    private void component2(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        if (!jSONObject.has(KeysConstants.PAY_RAW_REQUEST)) {
            ShareDataUIState("No find \"rawRequest\"");
            int i4 = copydefault + 57;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        String strOptString = jSONObject.optString(KeysConstants.PAY_RAW_REQUEST);
        HashMap map = new HashMap();
        map.put("tradeType", "InApp");
        map.put(KeysConstants.PAY_RAW_REQUEST, strOptString);
        PayManager.get().startPay(this.interactionView.getHostActivity(), map, (CheckoutResp) null, TradeTypeEnum.H5_CHECKOUT, new ApiCallback<TransferResp>() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(TransferResp transferResp) {
                int i6 = 2 % 2;
                int i7 = component1 + 43;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
                component1(transferResp);
                if (i8 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void component1(TransferResp transferResp) {
                int i6 = 2 % 2;
                int i7 = component1 + 67;
                copydefault = i7 % 128;
                if (i7 % 2 != 0) {
                    StartPayMandate startPayMandate = StartPayMandate.this;
                    StartPayMandate.component2(startPayMandate, StartPayMandate.ShareDataUIState(startPayMandate), "1");
                } else {
                    StartPayMandate startPayMandate2 = StartPayMandate.this;
                    StartPayMandate.component2(startPayMandate2, StartPayMandate.ShareDataUIState(startPayMandate2), "1");
                    throw null;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i6 = 2 % 2;
                int i7 = copydefault + 21;
                component1 = i7 % 128;
                int i8 = i7 % 2;
                StartPayMandate startPayMandate = StartPayMandate.this;
                StartPayMandate.component3(startPayMandate, StartPayMandate.component2(startPayMandate), "2");
                int i9 = copydefault + 37;
                component1 = i9 % 128;
                if (i9 % 2 != 0) {
                    throw null;
                }
            }
        });
    }

    private void ShareDataUIState(String str) {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put("result", "fail");
        map.put("message", str);
        callJs(this.callbackFuncName, map);
        int i2 = copydefault + 111;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }
}
