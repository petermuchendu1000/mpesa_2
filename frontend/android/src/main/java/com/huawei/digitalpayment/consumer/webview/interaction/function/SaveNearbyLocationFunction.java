package com.huawei.digitalpayment.consumer.webview.interaction.function;

import com.blankj.utilcode.util.ThreadUtils;
import com.huawei.common.util.L;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.webview.constants.WebViewConstants;
import com.huawei.digitalpayment.consumer.webview.interaction.JavascriptFunction;
import org.json.JSONObject;

public class SaveNearbyLocationFunction extends JavascriptFunction {
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static final String component3 = "SaveNearbyLocationFunction";

    static void ShareDataUIState(SaveNearbyLocationFunction saveNearbyLocationFunction, String str, String str2) {
        int i = 2 % 2;
        int i2 = component1 + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        saveNearbyLocationFunction.callJs(str, str2);
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
        int i5 = component1 + 25;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    static String component2(SaveNearbyLocationFunction saveNearbyLocationFunction) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = saveNearbyLocationFunction.callbackFuncName;
        int i4 = ShareDataUIState + 83;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override
    public String getFunctionName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 53;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return WebViewConstants.JS_FUN_SAVE_NEARBY_LOCATION;
    }

    @Override
    public void execute(JSONObject jSONObject) {
        final String strOptString;
        int i = 2 % 2;
        L.d(component3, "execute: ");
        if (jSONObject != null) {
            int i2 = component1 + 55;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                strOptString = jSONObject.optString(WebViewConstants.KEY_NEARBY_LOCATION);
                int i3 = 75 / 0;
            } else {
                strOptString = jSONObject.optString(WebViewConstants.KEY_NEARBY_LOCATION);
            }
            int i4 = ShareDataUIState + 49;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            strOptString = null;
        }
        L.d(component3, "execute: locations:" + strOptString);
        ThreadUtils.executeByCached(new ThreadUtils.SimpleTask<Void>() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public Object doInBackground() throws Throwable {
                int i6 = 2 % 2;
                int i7 = ShareDataUIState + 23;
                component2 = i7 % 128;
                int i8 = i7 % 2;
                Void voidComponent3 = component3();
                int i9 = ShareDataUIState + 9;
                component2 = i9 % 128;
                if (i9 % 2 == 0) {
                    return voidComponent3;
                }
                throw null;
            }

            @Override
            public void onSuccess(Object obj) {
                int i6 = 2 % 2;
                int i7 = component2 + 89;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
                copydefault((Void) obj);
                if (i8 == 0) {
                    int i9 = 36 / 0;
                }
            }

            public Void component3() throws Throwable {
                int i6 = 2 % 2;
                int i7 = ShareDataUIState + 47;
                component2 = i7 % 128;
                int i8 = i7 % 2;
                SPUtils.getInstance(WebViewConstants.SP_WEBVIEW).put(WebViewConstants.KEY_NEARBY_LOCATION, strOptString, true);
                int i9 = component2 + 33;
                ShareDataUIState = i9 % 128;
                int i10 = i9 % 2;
                return null;
            }

            public void copydefault(Void r4) {
                int i6 = 2 % 2;
                int i7 = component2 + 123;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
                L.d(SaveNearbyLocationFunction.component3, "onSuccess: ");
                SaveNearbyLocationFunction saveNearbyLocationFunction = SaveNearbyLocationFunction.this;
                SaveNearbyLocationFunction.ShareDataUIState(saveNearbyLocationFunction, SaveNearbyLocationFunction.component2(saveNearbyLocationFunction), "1");
                int i9 = ShareDataUIState + 3;
                component2 = i9 % 128;
                if (i9 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
    }
}
