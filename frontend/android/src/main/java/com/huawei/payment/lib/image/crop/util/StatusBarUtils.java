package com.huawei.payment.lib.image.crop.util;

import android.app.Activity;
import android.view.View;
import android.view.Window;

public class StatusBarUtils {
    private static int component2 = Integer.MAX_VALUE;
    private static int component3 = Integer.MAX_VALUE;

    public static void saveStatusBarStyle(Activity activity) {
        if (activity == null || activity.getWindow() == null) {
            return;
        }
        component2 = activity.getWindow().getStatusBarColor();
        component3 = activity.getWindow().getDecorView().getSystemUiVisibility();
    }

    public static void resetStatusBarStyle(Activity activity) {
        if (activity == null || activity.getWindow() == null) {
            return;
        }
        if (component2 != Integer.MAX_VALUE) {
            activity.getWindow().setStatusBarColor(component2);
        }
        if (component3 != Integer.MAX_VALUE) {
            activity.getWindow().getDecorView().setSystemUiVisibility(component3);
        }
    }

    public static void setStatusBarColor(Activity activity, int i) {
        if (activity == null || activity.getWindow() == null) {
            return;
        }
        activity.getWindow().setStatusBarColor(i);
    }

    public static void setStatusBarLightMode(Activity activity, boolean z) {
        if (activity == null || activity.getWindow() == null) {
            return;
        }
        setStatusBarLightMode(activity.getWindow(), z);
    }

    public static void setStatusBarLightMode(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }
}
