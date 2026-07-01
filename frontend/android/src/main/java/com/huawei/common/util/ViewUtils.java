package com.huawei.common.util;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.blankj.utilcode.util.BarUtils;
import com.blankj.utilcode.util.Utils;

public class ViewUtils {
    private static int ShareDataUIState = -1;
    private static final String component2 = "statusBarHeight";

    public static void adjustRTL(View... viewArr) {
        for (View view : viewArr) {
            if (AppInfoUtils.isLayoutRTL(view.getContext())) {
                view.setTextDirection(4);
            } else {
                view.setTextDirection(3);
            }
        }
    }

    public static void softInputAdjustResize(Window window, View view) {
        window.setSoftInputMode(16);
        view.setFitsSystemWindows(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.topMargin -= getStatusBarHeight(view.getContext());
        view.setLayoutParams(marginLayoutParams);
    }

    public static void setGone(boolean z, View... viewArr) {
        for (View view : viewArr) {
            if (z) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public static void setInvisible(boolean z, View... viewArr) {
        for (View view : viewArr) {
            if (z) {
                view.setVisibility(4);
            } else {
                view.setVisibility(0);
            }
        }
    }

    @Deprecated
    public static int getStatusBarHeight() {
        return getStatusBarHeight(Utils.getApp());
    }

    public static int getStatusBarHeight(Context context) {
        if (ShareDataUIState == -1) {
            ShareDataUIState = SPUtils.getInstance(context).getInt("statusBarHeight");
        }
        int i = ShareDataUIState;
        return i > 0 ? i : BarUtils.getStatusBarHeight();
    }

    public static int getCurrentStatusBarHeight() {
        return ShareDataUIState;
    }

    public static void setStatusBarHeight(int i) {
        if (i > 0) {
            SPUtils.getInstance().put("statusBarHeight", i);
            ShareDataUIState = i;
        }
    }
}
