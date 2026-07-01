package com.huawei.digitalpayment.consumer.basic.init;

import android.content.Context;
import com.huawei.common.module.UserLifecycle;

public class BasicUiLifecycle implements UserLifecycle {
    private static int component1 = 0;
    private static int component3 = 1;

    @Override
    public void onLogout(Context context) {
        StartPageManager startPageManager;
        boolean z;
        int i = 2 % 2;
        int i2 = component1 + 107;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            startPageManager = StartPageManager.INSTANCE;
            z = false;
        } else {
            startPageManager = StartPageManager.INSTANCE;
            z = true;
        }
        startPageManager.setShowAdPage(z);
        int i3 = component1 + 41;
        component3 = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override
    public int getPriority() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 27;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 103;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 98 / 0;
        }
        return 9999;
    }

    @Override
    public void loginFail(Context context, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 101;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onAfterLogin(Context context, String str, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 41;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }
}
