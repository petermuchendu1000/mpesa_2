package com.huawei.digitalpayment.consumer.baselib.util;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.WindowManager;

public class DensityUtils {
    public static final float ROUNDING = 0.5f;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;

    private DensityUtils() {
        throw new UnsupportedOperationException("Cannot instantiate the object");
    }

    public static int dp2px(Context context, float f) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        float f2 = context.getResources().getDisplayMetrics().density;
        int i4 = (int) ((i3 == 0 ? f - f2 : f * f2) + 0.5f);
        int i5 = ShareDataUIState + 81;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public static int sp2px(Context context, float f) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iApplyDimension = (int) TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
        int i4 = component1 + 101;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iApplyDimension;
    }

    public static int px2sp(Context context, float f) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = (int) ((f / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
        int i5 = component1 + 103;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public static int px2dp(Context context, float f) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        float f2 = context.getResources().getDisplayMetrics().density;
        int i4 = (int) (i3 == 0 ? (f * f2) / 0.5f : (f / f2) + 0.5f);
        int i5 = ShareDataUIState + 5;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public static DisplayMetrics getWindowDisplayMetrics(Context context) {
        int i = 2 % 2;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int i2 = ShareDataUIState + 81;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return displayMetrics;
    }
}
