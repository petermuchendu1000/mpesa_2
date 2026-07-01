package com.huawei.digitalpayment.consumer.base.ui.theme;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

public class FontScaleLimiterCallbacks implements Application.ActivityLifecycleCallbacks {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;

    @Override
    public void onActivityCreated(Activity activity, Bundle bundle) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        SfcPaymentResource.resetFont(activity.getResources());
        int i4 = copydefault + 5;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onActivityStarted(Activity activity) {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        SfcPaymentResource.resetFont(activity.getResources());
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = copydefault + 33;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void onActivityResumed(Activity activity) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        SfcPaymentResource.resetFont(activity.getResources());
        int i4 = ShareDataUIState + 17;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void onActivityDestroyed(Activity activity) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 36 / 0;
        }
    }

    @Override
    public void onActivityPaused(Activity activity) {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onActivityStopped(Activity activity) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }
}
