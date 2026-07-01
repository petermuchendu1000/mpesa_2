package com.huawei.digitalpayment.consumer.baselib.init;

import android.content.Context;
import com.blankj.utilcode.util.ThreadUtils;
import com.huawei.common.module.UserLifecycle;
import com.huawei.digitalpayment.consumer.base.util.interceptors.AppTokenCacher;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.safaricom.mpesa.logging.L;
import org.json.JSONException;
import org.json.JSONObject;

public class BaseLibUserLifecycle implements UserLifecycle {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    @Override
    public void onAfterLogin(Context context, final String str, boolean z) {
        int i = 2 % 2;
        ThreadUtils.executeByCached(new ThreadUtils.SimpleTask<Void>(this) {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public Object doInBackground() throws Throwable {
                int i2 = 2 % 2;
                int i3 = copydefault + 7;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Void voidCopydefault = copydefault();
                int i5 = copydefault + 83;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 80 / 0;
                }
                return voidCopydefault;
            }

            @Override
            public void onSuccess(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 35;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                component1((Void) obj);
                if (i4 != 0) {
                    int i5 = 38 / 0;
                }
                int i6 = copydefault + 91;
                component3 = i6 % 128;
                int i7 = i6 % 2;
            }

            public Void copydefault() throws Throwable {
                int i2 = 2 % 2;
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    TokenHelper.INSTANCE.saveTokenToSp(jSONObject.optString("token"));
                    AppConfigManager.INSTANCE.setLanguage(jSONObject);
                    new AppTokenCacher().loadSaveToken();
                } catch (JSONException e) {
                    L.INSTANCE.d("BaseLibUserLifecycle", "onAfterLogin: " + e.getMessage(), new Object[0]);
                }
                int i3 = component3 + 89;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 21 / 0;
                }
                return null;
            }

            public void component1(Void r3) {
                int i2 = 2 % 2;
                int i3 = component3 + 1;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = ShareDataUIState + 45;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onLogout(Context context) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        TokenHelper.INSTANCE.clearToken();
        int i4 = component2 + 21;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public int getPriority() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 99;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 77;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return 2147483392;
    }

    @Override
    public void loginFail(Context context, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 29;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
