package com.huawei.common.module;

import android.content.Context;

public interface UserLifecycle extends Comparable<UserLifecycle> {
    int getPriority();

    void loginFail(Context context, boolean z);

    void onAfterLogin(Context context, String str, boolean z);

    void onLogout(Context context);

    @Override
    default int compareTo(UserLifecycle userLifecycle) {
        if (userLifecycle != null) {
            return Integer.compare(userLifecycle.getPriority(), getPriority());
        }
        return 0;
    }
}
