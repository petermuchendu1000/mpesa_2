package com.huawei.digitalpayment.consumer.home.init;

import android.content.Context;
import com.huawei.common.module.UserLifecycle;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.home.ui.activity.HomeActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/init/HomeUiUserLifecycle;", "Lcom/huawei/common/module/UserLifecycle;", "<init>", "()V", "onAfterLogin", "", "context", "Landroid/content/Context;", KeysConstants.KEY_LOGIN_INFO, "", "isAutoLogin", "", "loginFail", "onLogout", "getPriority", "", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HomeUiUserLifecycle implements UserLifecycle {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[Catch: Exception -> 0x0059, PHI: r7
  0x0051: PHI (r7v13 java.lang.String) = (r7v12 java.lang.String), (r7v14 java.lang.String) binds: [B:17:0x004f, B:14:0x0048] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x0059, blocks: (B:3:0x000e, B:6:0x0026, B:8:0x002c, B:12:0x0041, B:18:0x0051, B:16:0x004b), top: B:26:0x000e }] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAfterLogin(android.content.Context r6, java.lang.String r7, boolean r8) {
        /*
            r5 = this;
            java.lang.String r8 = "HomeUiUserLifecycle"
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            r6 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L59
            r1.<init>(r7)     // Catch: java.lang.Exception -> L59
            java.lang.String r7 = "homeConfig"
            org.json.JSONObject r7 = r1.optJSONObject(r7)     // Catch: java.lang.Exception -> L59
            com.huawei.digitalpayment.home.data.HomeConfigManager r2 = com.huawei.digitalpayment.home.data.HomeConfigManager.INSTANCE     // Catch: java.lang.Exception -> L59
            if (r7 == 0) goto L2b
            int r3 = com.huawei.digitalpayment.consumer.home.init.HomeUiUserLifecycle.component2
            int r3 = r3 + 23
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.home.init.HomeUiUserLifecycle.ShareDataUIState = r4
            int r3 = r3 % r0
            java.lang.String r3 = r7.toString()     // Catch: java.lang.Exception -> L59
            goto L2c
        L2b:
            r3 = 0
        L2c:
            r2.saveHomeConfig(r3)     // Catch: java.lang.Exception -> L59
            com.huawei.digitalpayment.consumer.base.util.SFCUserConfigManager r2 = com.huawei.digitalpayment.consumer.base.util.SFCUserConfigManager.INSTANCE     // Catch: java.lang.Exception -> L59
            r2.setIsChild(r1)     // Catch: java.lang.Exception -> L59
            if (r7 == 0) goto L73
            int r1 = com.huawei.digitalpayment.consumer.home.init.HomeUiUserLifecycle.component2
            int r1 = r1 + 9
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.home.init.HomeUiUserLifecycle.ShareDataUIState = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L4b
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L59
            r1 = 44
            int r1 = r1 / r6
            if (r7 == 0) goto L73
            goto L51
        L4b:
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L59
            if (r7 == 0) goto L73
        L51:
            com.safaricom.mpesa.logging.L r1 = com.safaricom.mpesa.logging.L.INSTANCE     // Catch: java.lang.Exception -> L59
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L59
            r1.d(r8, r7, r2)     // Catch: java.lang.Exception -> L59
            goto L73
        L59:
            r7 = move-exception
            com.safaricom.mpesa.logging.L r1 = com.safaricom.mpesa.logging.L.INSTANCE
            java.lang.String r7 = r7.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "home menu init error: "
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r1.e(r8, r7, r2)
        L73:
            com.huawei.digitalpayment.home.util.MyServicesManager r7 = com.huawei.digitalpayment.home.util.MyServicesManager.INSTANCE
            r7.reset()
            int r7 = com.huawei.digitalpayment.consumer.home.init.HomeUiUserLifecycle.component2
            int r7 = r7 + 59
            int r8 = r7 % 128
            com.huawei.digitalpayment.consumer.home.init.HomeUiUserLifecycle.ShareDataUIState = r8
            int r7 = r7 % r0
            if (r7 != 0) goto L86
            r7 = 66
            int r7 = r7 / r6
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.init.HomeUiUserLifecycle.onAfterLogin(android.content.Context, java.lang.String, boolean):void");
    }

    @Override
    public void onLogout(Context context) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        HomeActivity.INSTANCE.setSelectedPosition(-1);
        int i4 = ShareDataUIState + 99;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
    }

    static {
        int i = 1 + 91;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    @Override
    public int getPriority() {
        int i = 2 % 2;
        int i2 = component2 + 95;
        ShareDataUIState = i2 % 128;
        return i2 % 2 == 0 ? 47 : 99;
    }

    @Override
    public void loginFail(Context context, boolean isAutoLogin) {
        int i = 2 % 2;
        int i2 = component2 + 53;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
