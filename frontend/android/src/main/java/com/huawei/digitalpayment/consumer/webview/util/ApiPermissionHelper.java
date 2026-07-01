package com.huawei.digitalpayment.consumer.webview.util;

import com.didi.drouter.store.RouterStore;
import com.google.gson.reflect.TypeToken;
import com.huawei.common.util.AssetsReadUtils;
import com.huawei.common.util.L;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigListener;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.webview.constants.WebViewConstants;
import com.iap.ac.config.lite.ConfigMerger;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/webview/util/ApiPermissionHelper;", "", "<init>", "()V", "TAG", "", "checkPermission", "", "apiPermissionConfig", "Lorg/json/JSONObject;", "hasPermission", RouterStore.HOST, "apiName", "initConfig", "", "updateApiPermissionConfig", ConfigMerger.COMMON_CONFIG_SECTION, "ConsumerWebviewModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ApiPermissionHelper {
    public static final ApiPermissionHelper INSTANCE;
    private static JSONObject ShareDataUIState = null;
    private static final String component1 = "ApiPermissionHelper";
    private static int component2 = 1;
    private static int component3 = 0;
    private static int component4 = 1;
    private static boolean copydefault;
    private static int getAsAtTimestamp;

    private ApiPermissionHelper() {
    }

    static {
        ApiPermissionHelper apiPermissionHelper = new ApiPermissionHelper();
        INSTANCE = apiPermissionHelper;
        copydefault = true;
        apiPermissionHelper.copydefault(SPUtils.getInstance().getString(WebViewConstants.H5_PERMISSION_CONFIG));
        int i = component4 + 21;
        getAsAtTimestamp = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean hasPermission(String host, String apiName) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(apiName, "");
        L.d(component1, "hasPermission: host: " + host + "  apiName: " + apiName);
        if (!copydefault) {
            int i2 = component3 + 21;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        JSONObject jSONObject = ShareDataUIState;
        if (jSONObject == null) {
            return false;
        }
        Set set = (Set) SecureGsonUtils.fromJson(jSONObject.optString(WebViewConstants.COMMON), new TypeToken<Set<? extends String>>() {
        }.getType());
        Set set2 = set;
        if (set2 != null) {
            int i4 = component2 + 119;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            if (!set2.isEmpty() && set.contains(apiName)) {
                int i6 = component3 + 85;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
        }
        Set set3 = (Set) SecureGsonUtils.fromJson(jSONObject.optString(host), new TypeToken<Set<? extends String>>() {
        }.getType());
        Set set4 = set3;
        if (set4 == null) {
            return false;
        }
        int i8 = component3 + 9;
        component2 = i8 % 128;
        int i9 = i8 % 2;
        return !set4.isEmpty() && set3.contains(apiName);
    }

    public final void initConfig() {
        int i = 2 % 2;
        AppConfigManager.INSTANCE.addConfigListener(new AppConfigListener() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public final void onAppConfig(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 57;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                ApiPermissionHelper.$r8$lambda$W1UmGy6zolH0WV6NGNTy6J41ziM(obj);
                int i5 = copydefault + 93;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = component2 + 27;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void ShareDataUIState(Object obj) {
        int i = 2 % 2;
        JSONObject jSONObjectOptJSONObject = new JSONObject(obj.toString()).optJSONObject(WebViewConstants.H5_PERMISSION_CONFIG);
        if (jSONObjectOptJSONObject != null) {
            int i2 = component3 + 81;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            SPUtils.getInstance().put(WebViewConstants.H5_PERMISSION_CONFIG, jSONObjectOptJSONObject.toString());
            INSTANCE.copydefault(jSONObjectOptJSONObject.toString());
            int i4 = component3 + 107;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private final void copydefault(String str) {
        int i = 2 % 2;
        L.d(component1, "updateApiPermissionConfig: " + str);
        String file = AssetsReadUtils.parseFile("h5PermissionConfig.json");
        if (file.length() != 0) {
            int i2 = component3 + 59;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            str = file;
        }
        String str2 = str;
        String str3 = str2;
        if (str3 != null) {
            int i4 = component2 + 11;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            if (str3.length() == 0) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str2);
                copydefault = jSONObject.optBoolean("checkPermission", true);
                ShareDataUIState = jSONObject;
            } catch (JSONException e) {
                L.e(component1, "h5PermissionConfig is not json", e);
            }
        }
    }

    public static void $r8$lambda$W1UmGy6zolH0WV6NGNTy6J41ziM(Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 97;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ShareDataUIState(obj);
        int i4 = component3 + 17;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
    }
}
