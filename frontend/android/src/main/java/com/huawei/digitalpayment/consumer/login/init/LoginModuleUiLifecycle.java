package com.huawei.digitalpayment.consumer.login.init;

import android.content.Context;
import com.huawei.common.module.UserLifecycle;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.mobileapp.report.EventReportUtils;

public class LoginModuleUiLifecycle implements UserLifecycle {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;

    @Override
    public void onAfterLogin(Context context, String str, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 45;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            EventReportUtils.INSTANCE.setInitiatorMsisdn(SPUtils.getInstance().getString(KeysConstants.RECENT_LOGIN_SHORT_CODE));
        } else {
            EventReportUtils.INSTANCE.setInitiatorMsisdn(SPUtils.getInstance().getString(KeysConstants.RECENT_LOGIN_SHORT_CODE));
            throw null;
        }
    }

    @Override
    public void onLogout(Context context) {
        int i = 2 % 2;
        int i2 = component1 + 93;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            EventReportUtils.INSTANCE.setInitiatorMsisdn(null);
        } else {
            EventReportUtils.INSTANCE.setInitiatorMsisdn(null);
            throw null;
        }
    }

    @Override
    public int getPriority() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        ShareDataUIState = i2 % 128;
        return i2 % 2 != 0 ? 12702 : 9999;
    }

    @Override
    public void loginFail(Context context, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 85;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 82 / 0;
        }
    }
}
