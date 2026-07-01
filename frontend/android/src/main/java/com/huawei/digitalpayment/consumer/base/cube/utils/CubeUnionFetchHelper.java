package com.huawei.digitalpayment.consumer.base.cube.utils;

import android.text.TextUtils;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.base.cube.resp.CubeBaseResp;
import com.huawei.digitalpayment.consumer.base.cube.resp.CubeBizServerConfig;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigListener;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.iap.ac.config.lite.ConfigMerger;
import com.safaricom.mpesa.logging.L;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0002J\u0016\u0010\r\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/cube/utils/CubeUnionFetchHelper;", "Lcom/huawei/digitalpayment/consumer/base/cube/utils/BaseCubeUnionFetchHelper;", "<init>", "()V", "TAG", "", "cubeUnionFetchConfig", "Lcom/huawei/digitalpayment/consumer/base/cube/resp/CubeBizServerConfig;", "getCubeUnionFetchConfig", "initConfig", "", "updateCubeUnionFetchConfig", ConfigMerger.COMMON_CONFIG_SECTION, "logOutCube", "callback", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/digitalpayment/consumer/base/cube/resp/CubeBaseResp;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CubeUnionFetchHelper extends BaseCubeUnionFetchHelper {
    public static final CubeUnionFetchHelper INSTANCE;
    private static CubeBizServerConfig ShareDataUIState = null;
    private static final String component1 = "CubeUnionFetchHelper";
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copy = 1;
    private static int copydefault = 1;

    private CubeUnionFetchHelper() {
    }

    static {
        CubeUnionFetchHelper cubeUnionFetchHelper = new CubeUnionFetchHelper();
        INSTANCE = cubeUnionFetchHelper;
        ShareDataUIState = new CubeBizServerConfig();
        cubeUnionFetchHelper.ShareDataUIState(SPUtils.getInstance("cubeSpName").getString("cubeBizServerConfig"));
        int i = component3 + 125;
        copy = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CubeBizServerConfig getCubeUnionFetchConfig() {
        CubeBizServerConfig cubeBizServerConfig;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 85;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            cubeBizServerConfig = ShareDataUIState;
            int i4 = 22 / 0;
        } else {
            cubeBizServerConfig = ShareDataUIState;
        }
        int i5 = i2 + 59;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return cubeBizServerConfig;
    }

    public final void initConfig() {
        int i = 2 % 2;
        AppConfigManager.INSTANCE.addConfigListener(new AppConfigListener() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public final void onAppConfig(Object obj) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 91;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                CubeUnionFetchHelper.m10154$r8$lambda$3sGKaackOF1ESA7KILh4WxENiM(obj);
                if (i4 != 0) {
                    int i5 = 57 / 0;
                }
                int i6 = ShareDataUIState + 89;
                component3 = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        int i2 = copydefault + 25;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final void component1(Object obj) {
        int i = 2 % 2;
        JSONObject jSONObjectOptJSONObject = new JSONObject(obj.toString()).optJSONObject("cubeBizServerConfig");
        if (jSONObjectOptJSONObject != null) {
            SPUtils.getInstance("cubeSpName").put("cubeBizServerConfig", jSONObjectOptJSONObject.toString());
            INSTANCE.ShareDataUIState(jSONObjectOptJSONObject.toString());
            int i2 = component2 + 7;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = copydefault + 31;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private final void ShareDataUIState(String str) {
        CubeBizServerConfig cubeBizServerConfig;
        int i = 2 % 2;
        L.INSTANCE.d(component1, "updateCubeUnionFetchConfig: " + str, new Object[0]);
        String str2 = str;
        if (str2 != null) {
            int i2 = component2 + 105;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                str2.length();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (str2.length() == 0 || (cubeBizServerConfig = (CubeBizServerConfig) SecureGsonUtils.fromJson(str, CubeBizServerConfig.class)) == null) {
                return;
            }
            int i3 = component2 + 59;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i3 % 2;
            ShareDataUIState = cubeBizServerConfig;
            if (i5 == 0) {
                int i6 = 72 / 0;
            }
            int i7 = i4 + 41;
            component2 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 / 4;
            }
        }
    }

    public final void logOutCube(ApiCallback<CubeBaseResp> callback) {
        int i = 2 % 2;
        int i2 = component2 + 87;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            TextUtils.isEmpty(SPUtils.getInstance("cubeSpName").getString(CubeUtils.getCubeBizTokenKey()));
            throw null;
        }
        String string = SPUtils.getInstance("cubeSpName").getString(CubeUtils.getCubeBizTokenKey());
        if (TextUtils.isEmpty(string)) {
            int i3 = copydefault + 23;
            component2 = i3 % 128;
            int i4 = i3 % 2;
        } else {
            String signKey = getCubeUnionFetchConfig().getSignKey();
            Intrinsics.checkNotNullExpressionValue(signKey, "");
            sendLogOut(signKey, string, getCubeUnionFetchConfig().getBaseUrl(), getCubeUnionFetchConfig().getLogoutUrl(), callback);
            SPUtils.getInstance("cubeSpName").put(CubeUtils.getCubeBizTokenKey(), "");
        }
    }

    public static void m10154$r8$lambda$3sGKaackOF1ESA7KILh4WxENiM(Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        component1(obj);
        int i4 = copydefault + 77;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }
}
