package com.huawei.digitalpayment.consumer.baselib.init;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.huawei.common.util.L;
import com.huawei.digitalpayment.consumer.baselib.session.SessionOutManager;

public class GlobalActivityLifecycleCallback implements Application.ActivityLifecycleCallbacks {
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static final String component3 = "GlobalActivityLifecycleCallback";

    @Override
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        int i = 2 % 2;
        L.d("GlobalActivityLifecycle", "onActivityPreCreated: " + activity);
        int i2 = component2 + 55;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle bundle) {
        int i = 2 % 2;
        L.d(component3, "onActivityCreated: " + activity);
        int i2 = component2 + 9;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onActivityStarted(Activity activity) {
        int i = 2 % 2;
        L.d(component3, "onActivityStarted: " + activity);
        int i2 = ShareDataUIState + 31;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onActivityResumed(Activity activity) {
        int i = 2 % 2;
        L.d(component3, "onActivityResumed: " + activity);
        SessionOutManager.getInstance().onActivityResumed(activity);
        int i2 = component2 + 17;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onActivityPaused(Activity activity) {
        int i = 2 % 2;
        L.d(component3, "onActivityPaused: " + activity);
        int i2 = component2 + 123;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void onActivityStopped(Activity activity) {
        int i = 2 % 2;
        L.d(component3, "onActivityStopped: " + activity);
        int i2 = ShareDataUIState + 37;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onActivityDestroyed(Activity activity) {
        int i = 2 % 2;
        L.d(component3, "onActivityDestroyed: " + activity);
        int i2 = component2 + 75;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 70 / 0;
        }
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i = 2 % 2;
        int i2 = component2 + 31;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }
}
