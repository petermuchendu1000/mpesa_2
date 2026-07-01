package com.huawei.digitalpayment.consumer.profile.init;

import android.content.Context;
import android.text.TextUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.huawei.common.module.UserLifecycle;
import com.huawei.common.util.L;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.baselib.config.CurrencyConfigManager;
import com.huawei.digitalpayment.consumer.profile.model.remote.RemoteCustomer;
import com.huawei.digitalpayment.consumer.profile.util.ModelMappingUtils;
import com.huawei.digitalpayment.consumer.profile.util.ProfileHelper;
import org.json.JSONArray;
import org.json.JSONObject;

public class ProfileLifecycle implements UserLifecycle {
    private static int component2 = 1;
    private static final String component3 = "ProfileLifecycle";
    private static int copydefault;

    @Override
    public void onAfterLogin(Context context, final String str, boolean z) {
        int i = 2 % 2;
        ThreadUtils.executeByCached(new ThreadUtils.SimpleTask<Void>() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public Object doInBackground() throws Throwable {
                int i2 = 2 % 2;
                int i3 = component1 + 57;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    component3();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Void voidComponent3 = component3();
                int i4 = component3 + 113;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return voidComponent3;
            }

            @Override
            public void onSuccess(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 111;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                ShareDataUIState((Void) obj);
                if (i4 == 0) {
                    int i5 = 39 / 0;
                }
            }

            public Void component3() throws Throwable {
                int i2 = 2 % 2;
                try {
                    JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("customer");
                    if (jSONObjectOptJSONObject != null) {
                        int i3 = component3 + 71;
                        component1 = i3 % 128;
                        int i4 = i3 % 2;
                        if (!TextUtils.isEmpty(jSONObjectOptJSONObject.toString())) {
                            int i5 = component3 + 79;
                            component1 = i5 % 128;
                            int i6 = i5 % 2;
                            ProfileHelper.updateCustomer(ModelMappingUtils.toLocalCustomer((RemoteCustomer) SecureGsonUtils.fromJson(jSONObjectOptJSONObject.toString(), RemoteCustomer.class)));
                            ProfileLifecycle.component2(ProfileLifecycle.this, jSONObjectOptJSONObject);
                        }
                    }
                } catch (Exception e) {
                    L.e(ProfileLifecycle.component3, "profile init error: " + e.getMessage());
                }
                ProfileLifecycle.ShareDataUIState(ProfileLifecycle.this, str);
                return null;
            }

            public void ShareDataUIState(Void r3) {
                int i2 = 2 % 2;
                int i3 = component3 + 53;
                component1 = i3 % 128;
                int i4 = i3 % 2;
            }
        });
        int i2 = copydefault + 73;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    private void ShareDataUIState(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        if (jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("preferredCurrency", "");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        int i4 = component2 + 1;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        CurrencyConfigManager.INSTANCE.setCurrentCurrencyCode(strOptString);
        if (i5 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void copydefault(String str) {
        int i = 2 % 2;
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("customerProfiles");
            if (jSONArrayOptJSONArray != null) {
                int i2 = component2 + 79;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ProfileHelper.updateProfiles(jSONArrayOptJSONArray.toString());
                int i4 = component2 + 55;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
            }
        } catch (Exception e) {
            L.e(component3, "profileInfo init error: " + e.getMessage());
        }
    }

    @Override
    public void onLogout(Context context) {
        int i = 2 % 2;
        int i2 = component2 + 125;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ProfileHelper.INSTANCE.cleanCustomer();
        int i4 = component2 + 109;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
    }

    static void component2(ProfileLifecycle profileLifecycle, JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        profileLifecycle.ShareDataUIState(jSONObject);
        int i4 = component2 + 51;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    static void ShareDataUIState(ProfileLifecycle profileLifecycle, String str) {
        int i = 2 % 2;
        int i2 = component2 + 59;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        profileLifecycle.copydefault(str);
        int i4 = copydefault + 17;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public int getPriority() {
        int i = 2 % 2;
        int i2 = component2 + 113;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 119;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override
    public void loginFail(Context context, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 43;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }
}
