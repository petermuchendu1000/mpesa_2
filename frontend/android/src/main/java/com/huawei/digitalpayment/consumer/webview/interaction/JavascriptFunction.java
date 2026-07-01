package com.huawei.digitalpayment.consumer.webview.interaction;

import android.content.Intent;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.Gson;
import com.huawei.common.util.L;
import com.huawei.digitalpayment.consumer.webview.constants.WebViewConstants;
import com.safaricom.consumer.commons.helper.ConstantsKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;

public abstract class JavascriptFunction {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    public String callbackFuncName;
    private int component3;
    private OnRequestPermissionResult copydefault;
    public InteractionView interactionView;

    public interface OnRequestPermissionResult {
        void requestPermissionResult(boolean z);
    }

    public abstract String getFunctionName();

    public void init(InteractionView interactionView) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 125;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.interactionView = interactionView;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 67;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = 2 % 2;
        if (i != this.component3) {
            return;
        }
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (i3 >= iArr.length) {
                z = true;
                break;
            }
            int i4 = ShareDataUIState + 31;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            if (iArr[i3] != 0) {
                break;
            } else {
                i3++;
            }
        }
        OnRequestPermissionResult onRequestPermissionResult = this.copydefault;
        if (onRequestPermissionResult != null) {
            onRequestPermissionResult.requestPermissionResult(z);
            int i6 = component2 + 21;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    protected void onExecute(JSONObject jSONObject) {
        int i = 2 % 2;
        if (jSONObject != null) {
            this.callbackFuncName = jSONObject.optString(WebViewConstants.FUNCTION_CALLBACK_NAME);
            int i2 = component2 + 59;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
        }
        if (!this.interactionView.checkPermission(getFunctionName())) {
            int i4 = component2 + 1;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            notifyFail("3", "No permission");
            return;
        }
        execute(jSONObject);
        int i6 = ShareDataUIState + 13;
        component2 = i6 % 128;
        int i7 = i6 % 2;
    }

    protected void requestPermission(final String[] strArr, final OnRequestPermissionResult onRequestPermissionResult) {
        int i = 2 % 2;
        this.copydefault = onRequestPermissionResult;
        this.interactionView.getHostActivity().runOnUiThread(new Runnable() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public final void run() {
                int i2 = 2 % 2;
                int i3 = component3 + 113;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                JavascriptFunction javascriptFunction = this.f$0;
                if (i4 != 0) {
                    JavascriptFunction.$r8$lambda$dphb9FOR9JiKG8i5NKt3JE0998A(javascriptFunction, strArr, onRequestPermissionResult);
                } else {
                    JavascriptFunction.$r8$lambda$dphb9FOR9JiKG8i5NKt3JE0998A(javascriptFunction, strArr, onRequestPermissionResult);
                    int i5 = 22 / 0;
                }
            }
        });
        int i2 = component2 + 93;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private void component2(String[] strArr, OnRequestPermissionResult onRequestPermissionResult) {
        int i = 2 % 2;
        FragmentActivity hostActivity = this.interactionView.getHostActivity();
        ArrayList arrayList = new ArrayList();
        int i2 = ShareDataUIState + 77;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        for (String str : strArr) {
            if (ContextCompat.checkSelfPermission(hostActivity, str) != 0) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() != 0) {
            this.component3 = Math.abs(new Random().nextInt()) & 255;
            hostActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), this.component3);
            return;
        }
        int i4 = ShareDataUIState + 5;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (onRequestPermissionResult != null) {
            onRequestPermissionResult.requestPermissionResult(true);
        }
    }

    public void callJs(final String str, final String str2) {
        int i = 2 % 2;
        this.interactionView.evaluateJavascript(String.format("javascript:%s('%s');", str, str2), new ValueCallback() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public final void onReceiveValue(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 29;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    JavascriptFunction.component1(str, str2, (String) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                JavascriptFunction.component1(str, str2, (String) obj);
                int i4 = component3 + 97;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 33 / 0;
                }
            }
        });
        int i2 = ShareDataUIState + 51;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    static void component1(String str, String str2, String str3) {
        int i = 2 % 2;
        L.d("JavascriptFunction", str + ConstantsKt.COMMA_SEPARATOR + str2);
        int i2 = component2 + 87;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public void callJs(final String str, final String str2, final String str3) {
        int i = 2 % 2;
        this.interactionView.evaluateJavascript(String.format("javascript:%s('%s','%s');", str, str2, str3), new ValueCallback() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public final void onReceiveValue(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 35;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                JavascriptFunction.component1(str, str2, str3, (String) obj);
                int i5 = component1 + 43;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i2 = ShareDataUIState + 67;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static void component1(String str, String str2, String str3, String str4) {
        int i = 2 % 2;
        L.d("JavascriptFunction", str + ConstantsKt.COMMA_SEPARATOR + str2 + ConstantsKt.COMMA_SEPARATOR + str3);
        int i2 = ShareDataUIState + 11;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    public void callJs(String str, Map<String, String> map) {
        int i = 2 % 2;
        callJs(str, new Gson().toJson(map));
        int i2 = ShareDataUIState + 119;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    protected void callMapObjectJs(String str, Map<String, Object> map) {
        int i = 2 % 2;
        callJs(str, new Gson().toJson(map));
        int i2 = component2 + 85;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    protected void notifyFail(String str, String str2) {
        int i = 2 % 2;
        int i2 = component2 + 115;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        if (TextUtils.isEmpty(this.callbackFuncName)) {
            return;
        }
        HashMap map = new HashMap();
        map.put("resultCode", str);
        map.put("result", "fail");
        map.put("message", str2);
        callJs(this.callbackFuncName, map);
        int i4 = component2 + 51;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$dphb9FOR9JiKG8i5NKt3JE0998A(JavascriptFunction javascriptFunction, String[] strArr, OnRequestPermissionResult onRequestPermissionResult) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 123;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        javascriptFunction.component2(strArr, onRequestPermissionResult);
        int i4 = component2 + 21;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    public void execute(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = component2 + 123;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = ShareDataUIState + 109;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void onDestroy() {
        int i = 2 % 2;
        int i2 = component2 + 77;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = component2 + 81;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onStop() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }
}
