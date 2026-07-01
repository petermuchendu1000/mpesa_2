package com.huawei.digitalpayment.consumer.push.init;

import android.content.Context;
import android.text.TextUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.huawei.common.language.LanguageUtils;
import com.huawei.common.module.UserLifecycle;
import com.huawei.common.util.L;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.push.FirebaseInit;
import com.huawei.digitalpayment.consumer.push.constants.PushSPConstants;
import org.json.JSONObject;

public class PushLifecycle implements UserLifecycle {
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static final String component2 = "PushLifecycle";

    @Override
    public void onAfterLogin(Context context, final String str, boolean z) {
        int i = 2 % 2;
        ThreadUtils.executeByCached(new ThreadUtils.SimpleTask<Void>(this) {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public Object doInBackground() throws Throwable {
                int i2 = 2 % 2;
                int i3 = copydefault + 21;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Void voidComponent2 = component2();
                int i5 = component3 + 113;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    return voidComponent2;
                }
                throw null;
            }

            @Override
            public void onSuccess(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 99;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                component3((Void) obj);
                int i5 = component3 + 77;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }

            public Void component2() throws Throwable {
                int i2 = 2 % 2;
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String strOptString = jSONObject.optString(PushSPConstants.KEY_TOPICS);
                    L.d(PushLifecycle.component2, "推送主题: " + strOptString);
                    if (!TextUtils.isEmpty(strOptString)) {
                        SPUtils.getInstance(PushSPConstants.SP_NAME_PUSH).put(PushSPConstants.KEY_TOPICS, new JSONObject(strOptString).toString());
                    }
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("profileInfo");
                    String strOptString2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString(PushSPConstants.KEY_SOUND_URL) : null;
                    if (TextUtils.isEmpty(strOptString2)) {
                        int i3 = copydefault + 83;
                        component3 = i3 % 128;
                        int i4 = i3 % 2;
                        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("customer");
                        if (jSONObjectOptJSONObject2 != null) {
                            int i5 = component3 + 93;
                            copydefault = i5 % 128;
                            int i6 = i5 % 2;
                            strOptString2 = jSONObjectOptJSONObject2.optString(PushSPConstants.KEY_SOUND_URL);
                        }
                    }
                    L.d(PushLifecycle.component2, "onAfterLogin: soundUrl: " + strOptString2);
                    SPUtils.getInstance(PushSPConstants.SP_NAME_PUSH).put(PushSPConstants.KEY_SOUND_URL, strOptString2);
                } catch (Exception e) {
                    L.e(PushLifecycle.component2, e.toString());
                }
                FirebaseInit.subscribeToTopic(LanguageUtils.getInstance().getCurrentLang());
                return null;
            }

            public void component3(Void r3) {
                int i2 = 2 % 2;
                int i3 = component3 + 57;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
            }
        });
        int i2 = ShareDataUIState + 21;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public void onLogout(Context context) {
        int i = 2 % 2;
        int i2 = component1 + 97;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FirebaseInit.unsubscribeToTopic(LanguageUtils.getInstance().getCurrentLang());
        int i4 = component1 + 23;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public int getPriority() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 57;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 27;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override
    public void loginFail(Context context, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 47;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 44 / 0;
        }
    }
}
