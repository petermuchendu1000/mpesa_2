package com.huawei.digitalpayment.customer.dynamics.widget.signature;

import android.view.ViewTreeObserver;

public class ViewTreeObserverCompat {
    private static int ShareDataUIState = 1;
    private static int component2;

    public static void removeOnGlobalLayoutListener(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        int i = 2 % 2;
        int i2 = component2 + 15;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
