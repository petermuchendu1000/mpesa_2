package com.huawei.digitalpayment.consumer.webview.interaction.function;

import android.text.TextUtils;
import com.blankj.utilcode.util.CollectionUtils;
import com.blankj.utilcode.util.GsonUtils;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.L;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.webview.constants.WebViewConstants;
import com.huawei.digitalpayment.consumer.webview.interaction.JavascriptFunction;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class GetBasicJsonConfig extends JavascriptFunction {
    private static int component1 = 1;
    private static int component3 = 0;
    private static final String copydefault = "GetBasicJsonConfig";

    static String component1(GetBasicJsonConfig getBasicJsonConfig) {
        int i = 2 % 2;
        int i2 = component1 + 75;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = getBasicJsonConfig.callbackFuncName;
        int i4 = component3 + 29;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static String component3(GetBasicJsonConfig getBasicJsonConfig) {
        int i = 2 % 2;
        int i2 = component1 + 7;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = getBasicJsonConfig.callbackFuncName;
        int i4 = component3 + 5;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void copydefault(GetBasicJsonConfig getBasicJsonConfig, String str, String str2) {
        int i = 2 % 2;
        int i2 = component1 + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        getBasicJsonConfig.callJs(str, str2);
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
    }

    @Override
    public String getFunctionName() {
        int i = 2 % 2;
        int i2 = component3 + 61;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 57;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return WebViewConstants.JS_FUN_GET_BASIC_JSON_CONFIG;
        }
        throw null;
    }

    @Override
    public void execute(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = component1 + 77;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (jSONObject == null) {
            return;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("configTypes");
        PaymentRequest<JsonObject> paymentRequest = new PaymentRequest<JsonObject>(this) {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public String getApiPath() {
                int i3 = 2 % 2;
                int i4 = component3 + 95;
                int i5 = i4 % 128;
                ShareDataUIState = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 65;
                component3 = i7 % 128;
                int i8 = i7 % 2;
                return "basicConfig";
            }
        };
        if (jSONArrayOptJSONArray != null) {
            List list = (List) GsonUtils.fromJson(jSONArrayOptJSONArray.toString(), new TypeToken<List<String>>(this) {
            }.getType());
            if (!CollectionUtils.isEmpty(list)) {
                int i3 = component3 + 71;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    paymentRequest.addParams("configTypes", list);
                    int i4 = 92 / 0;
                } else {
                    paymentRequest.addParams("configTypes", list);
                }
            }
        }
        paymentRequest.sendRequest(new ApiCallback<JsonObject>() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(JsonObject jsonObject) {
                int i5 = 2 % 2;
                int i6 = component1 + 93;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                component3(jsonObject);
                int i8 = component1 + 89;
                copydefault = i8 % 128;
                int i9 = i8 % 2;
            }

            public void component3(JsonObject jsonObject) {
                int i5 = 2 % 2;
                int i6 = component1 + 31;
                copydefault = i6 % 128;
                Object obj2 = null;
                if (i6 % 2 != 0) {
                    TextUtils.isEmpty(GetBasicJsonConfig.component1(GetBasicJsonConfig.this));
                    obj2.hashCode();
                    throw null;
                }
                if (!TextUtils.isEmpty(GetBasicJsonConfig.component1(GetBasicJsonConfig.this))) {
                    int i7 = component1 + 1;
                    copydefault = i7 % 128;
                    int i8 = i7 % 2;
                    GetBasicJsonConfig getBasicJsonConfig = GetBasicJsonConfig.this;
                    GetBasicJsonConfig.copydefault(getBasicJsonConfig, GetBasicJsonConfig.component3(getBasicJsonConfig), jsonObject.toString());
                }
                L.e(GetBasicJsonConfig.copydefault, "getBasicJsonConfig Success: " + jsonObject);
                int i9 = component1 + 91;
                copydefault = i9 % 128;
                if (i9 % 2 != 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i5 = 2 % 2;
                int i6 = component1 + 125;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                GetBasicJsonConfig.ShareDataUIState(GetBasicJsonConfig.this, baseException);
                int i8 = component1 + 115;
                copydefault = i8 % 128;
                int i9 = i8 % 2;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void copydefault(com.huawei.common.exception.BaseException r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.webview.interaction.function.GetBasicJsonConfig.component1
            int r1 = r1 + 9
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.webview.interaction.function.GetBasicJsonConfig.component3 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1b
            java.lang.String r1 = r4.callbackFuncName
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 37
            int r2 = r2 / 0
            if (r1 != 0) goto L3d
            goto L23
        L1b:
            java.lang.String r1 = r4.callbackFuncName
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L3d
        L23:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = "resultCode"
            java.lang.String r3 = "2"
            r1.put(r2, r3)
            java.lang.String r2 = "resultMessage"
            java.lang.String r5 = r5.getMessage()
            r1.put(r2, r5)
            java.lang.String r5 = r4.callbackFuncName
            r4.callJs(r5, r1)
        L3d:
            int r5 = com.huawei.digitalpayment.consumer.webview.interaction.function.GetBasicJsonConfig.component1
            int r5 = r5 + 29
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.webview.interaction.function.GetBasicJsonConfig.component3 = r1
            int r5 = r5 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.webview.interaction.function.GetBasicJsonConfig.copydefault(com.huawei.common.exception.BaseException):void");
    }

    static void ShareDataUIState(GetBasicJsonConfig getBasicJsonConfig, BaseException baseException) {
        int i = 2 % 2;
        int i2 = component3 + 17;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        getBasicJsonConfig.copydefault(baseException);
        int i4 = component1 + 37;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
