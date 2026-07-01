package com.huawei.digitalpayment.consumer.webview.interaction.function;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.common.util.L;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.webview.constants.WebViewConstants;
import com.huawei.digitalpayment.consumer.webview.interaction.InteractionView;
import com.huawei.digitalpayment.consumer.webview.interaction.JavascriptFunction;
import com.huawei.digitalpayment.consumer.webview.interaction.function.GetNearbyLocationFunction;
import com.safaricom.consumer.commons.helper.ConstantsKt;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class GetNearbyLocationFunction extends JavascriptFunction {
    private static final String component1 = "GetNearbyLocationFunction";
    private static int component3 = 0;
    private static int copydefault = 1;

    static String component2(GetNearbyLocationFunction getNearbyLocationFunction) {
        int i = 2 % 2;
        int i2 = copydefault + 113;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = getNearbyLocationFunction.callbackFuncName;
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = copydefault + 47;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static String component3(GetNearbyLocationFunction getNearbyLocationFunction) {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = getNearbyLocationFunction.callbackFuncName;
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
        int i5 = component3 + 59;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static InteractionView copydefault(GetNearbyLocationFunction getNearbyLocationFunction) {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        InteractionView interactionView = getNearbyLocationFunction.interactionView;
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
        return interactionView;
    }

    @Override
    public String getFunctionName() {
        int i = 2 % 2;
        int i2 = component3 + 45;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 89;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return WebViewConstants.JS_FUN_GET_NEARBY_LOCATION;
        }
        throw null;
    }

    class AnonymousClass4 extends ThreadUtils.SimpleTask<String> {
        private static int component2 = 1;
        private static int component3;

        AnonymousClass4() {
        }

        @Override
        public Object doInBackground() throws Throwable {
            int i = 2 % 2;
            int i2 = component2 + 1;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                copydefault();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String strCopydefault = copydefault();
            int i3 = component3 + 31;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 52 / 0;
            }
            return strCopydefault;
        }

        @Override
        public void onSuccess(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 75;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            ShareDataUIState((String) obj);
            int i4 = component3 + 3;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        public String copydefault() throws Throwable {
            int i = 2 % 2;
            int i2 = component3 + 123;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            String string = SPUtils.getInstance(WebViewConstants.SP_WEBVIEW).getString(WebViewConstants.KEY_NEARBY_LOCATION, "");
            int i4 = component3 + 107;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 70 / 0;
            }
            return string;
        }

        public void ShareDataUIState(String str) {
            int i = 2 % 2;
            L.d(GetNearbyLocationFunction.component1, "onSuccess: " + str);
            final HashMap map = new HashMap();
            map.put(WebViewConstants.KEY_NEARBY_LOCATION, (Map) SecureGsonUtils.fromJson(str, new TypeToken<Map<String, Object>>(this) {
            }.getType()));
            String str2 = String.format("javascript:%s('%s');", GetNearbyLocationFunction.component3(GetNearbyLocationFunction.this), GsonUtils.toJson(map));
            L.d(GetNearbyLocationFunction.component1, "onSuccess: " + str2);
            GetNearbyLocationFunction.copydefault(GetNearbyLocationFunction.this).evaluateJavascript(str2, new ValueCallback() {
                private static int ShareDataUIState = 1;
                private static int component3;

                @Override
                public final void onReceiveValue(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = component3 + 87;
                    ShareDataUIState = i3 % 128;
                    if (i3 % 2 == 0) {
                        GetNearbyLocationFunction.AnonymousClass4.ShareDataUIState(this.f$0, map, (String) obj);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    GetNearbyLocationFunction.AnonymousClass4.ShareDataUIState(this.f$0, map, (String) obj);
                    int i4 = component3 + 41;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                }
            });
            int i2 = component2 + 61;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        private void component2(HashMap map, String str) {
            int i = 2 % 2;
            L.d("JavascriptFunction", GetNearbyLocationFunction.component2(GetNearbyLocationFunction.this) + ConstantsKt.COMMA_SEPARATOR + map);
            int i2 = component3 + 59;
            component2 = i2 % 128;
            int i3 = i2 % 2;
        }

        public static void ShareDataUIState(AnonymousClass4 anonymousClass4, HashMap map, String str) {
            int i = 2 % 2;
            int i2 = component2 + 37;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            anonymousClass4.component2(map, str);
            if (i3 != 0) {
                throw null;
            }
        }
    }

    @Override
    public void execute(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = component3 + 107;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            L.d(component1, "execute: ");
            if (TextUtils.isEmpty(this.callbackFuncName)) {
                return;
            }
            ThreadUtils.executeByCached(new AnonymousClass4());
            int i3 = component3 + 23;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        L.d(component1, "execute: ");
        TextUtils.isEmpty(this.callbackFuncName);
        throw null;
    }
}
