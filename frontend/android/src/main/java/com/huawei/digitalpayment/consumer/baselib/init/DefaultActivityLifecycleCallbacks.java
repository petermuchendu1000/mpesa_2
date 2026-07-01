package com.huawei.digitalpayment.consumer.baselib.init;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

public interface DefaultActivityLifecycleCallbacks extends Application.ActivityLifecycleCallbacks {
    @Override
    default void onActivityCreated(Activity activity, Bundle bundle) {
        int i = 2 % 2;
    }

    @Override
    default void onActivityDestroyed(Activity activity) {
        int i = 2 % 2;
    }

    @Override
    default void onActivityPaused(Activity activity) {
        int i = 2 % 2;
    }

    @Override
    default void onActivityResumed(Activity activity) {
        int i = 2 % 2;
    }

    @Override
    default void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i = 2 % 2;
    }

    @Override
    default void onActivityStarted(Activity activity) {
        int i = 2 % 2;
    }

    @Override
    default void onActivityStopped(Activity activity) {
        int i = 2 % 2;
    }
}
