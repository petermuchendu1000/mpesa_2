package com.huawei.digitalpayment.consumer.baselib.session;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.L;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;

public class AppLifecycleObserver implements DefaultLifecycleObserver {
    private static final String ShareDataUIState = "AppLifecycleObserver";
    private static int component1 = 1;
    private static int copydefault;

    @Override
    public void onStart(LifecycleOwner lifecycleOwner) {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        L.d(ShareDataUIState, "onStart: ");
        if (i3 == 0) {
            throw null;
        }
        int i4 = copydefault + 105;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
    }

    @Override
    public void onCreate(LifecycleOwner lifecycleOwner) {
        int i = 2 % 2;
        int i2 = component1 + 71;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        L.d(ShareDataUIState, "onCreate: ");
        int i4 = copydefault + 117;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void onResume(LifecycleOwner lifecycleOwner) {
        int i = 2 % 2;
        boolean z = SPUtils.getInstance().getBoolean(SPConstant.LOGOUT2PIN);
        L.d(ShareDataUIState, "onResume logout2pin: " + z);
        if (z) {
            int i2 = component1 + 119;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            RouteUtils.routeWithExecute(RoutePathConstants.PIN_LOGIN);
            if (i3 != 0) {
                int i4 = 96 / 0;
            }
            int i5 = copydefault + 41;
            component1 = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    @Override
    public void onPause(LifecycleOwner lifecycleOwner) {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        L.d(ShareDataUIState, "onPause: ");
        int i4 = copydefault + 91;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void onStop(LifecycleOwner lifecycleOwner) {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        L.d(ShareDataUIState, "onStop: ");
        int i4 = copydefault + 25;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        int i = 2 % 2;
        int i2 = component1 + 91;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        L.d(ShareDataUIState, "onDestroy: ");
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = copydefault + 17;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }
}
