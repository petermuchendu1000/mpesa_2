package com.huawei.common.util;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.TypedArray;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;

public class ActivityInfoUtils {
    public static final String CLASS_NAME = "com.android.internal.R$styleable";
    public static final String METHOD_NAME = "isTranslucentOrFloating";

    public static boolean isFloatingOrTranslucent(Activity activity) {
        boolean zBooleanValue = false;
        try {
            TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes((int[]) Class.forName(CLASS_NAME).getField("Window").get(null));
            final Method method = ActivityInfo.class.getMethod(METHOD_NAME, TypedArray.class);
            AccessController.doPrivileged(new PrivilegedAction<Void>() {
                @Override
                public Void run() {
                    method.setAccessible(true);
                    return null;
                }
            });
            zBooleanValue = ((Boolean) method.invoke(null, typedArrayObtainStyledAttributes)).booleanValue();
            AccessController.doPrivileged(new PrivilegedAction<Void>() {
                @Override
                public Void run() {
                    method.setAccessible(false);
                    return null;
                }
            });
            return zBooleanValue;
        } catch (Exception e) {
            L.e(e.getMessage());
            return zBooleanValue;
        }
    }
}
