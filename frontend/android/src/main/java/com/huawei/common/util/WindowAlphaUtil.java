package com.huawei.common.util;

import android.app.Activity;
import android.view.WindowManager;

public class WindowAlphaUtil {
    public static void setWindowAlpha(Activity activity, float f) {
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        attributes.alpha = f;
        activity.getWindow().setAttributes(attributes);
    }
}
