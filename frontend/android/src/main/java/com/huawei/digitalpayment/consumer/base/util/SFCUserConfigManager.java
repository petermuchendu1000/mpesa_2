package com.huawei.digitalpayment.consumer.base.util;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.safaricom.mpesa.logging.L;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/util/SFCUserConfigManager;", "", "<init>", "()V", "USER_TYPE_CHILD", "", "isChild", "", "setIsChild", "", KeysConstants.KEY_LOGIN_INFO, "Lorg/json/JSONObject;", "isCustomerChild", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SFCUserConfigManager {
    public static final SFCUserConfigManager INSTANCE = new SFCUserConfigManager();
    private static boolean ShareDataUIState = false;
    public static final String USER_TYPE_CHILD = "CHILD";
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;

    private SFCUserConfigManager() {
    }

    public void setIsChild(JSONObject loginInfo) {
        int i = 2 % 2;
        int i2 = component2 + 3;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(loginInfo, "");
        JSONObject jSONObjectOptJSONObject = loginInfo.optJSONObject("extension");
        if (jSONObjectOptJSONObject == null) {
            int i4 = component3 + 7;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            ShareDataUIState = false;
            return;
        }
        try {
            ShareDataUIState = jSONObjectOptJSONObject.has("isChild") ? jSONObjectOptJSONObject.optBoolean("isChild") : false;
        } catch (Exception e) {
            L.INSTANCE.e("SFCUserConfigManager", "get isChild error: " + e.getMessage(), new Object[0]);
            ShareDataUIState = false;
        }
    }

    public boolean isCustomerChild() {
        int i = 2 % 2;
        int i2 = component2 + 115;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        boolean z = ShareDataUIState;
        int i5 = i3 + 7;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    static {
        int i = component1 + 49;
        copydefault = i % 128;
        int i2 = i % 2;
    }
}
