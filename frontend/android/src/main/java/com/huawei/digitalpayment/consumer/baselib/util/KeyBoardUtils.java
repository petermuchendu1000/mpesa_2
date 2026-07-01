package com.huawei.digitalpayment.consumer.baselib.util;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class KeyBoardUtils {
    private static int component1 = 0;
    private static int component2 = 1;
    private static final String component3 = "keyboardTagView";

    public static void hideSoftInput(View view) {
        int i = 2 % 2;
        int i2 = component1 + 109;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getApplicationContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                return;
            }
            int i3 = component2 + 83;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static void hideSoftInput(Activity activity) {
        int i = 2 % 2;
        if (activity != null) {
            hideSoftInput(activity.getWindow());
            int i2 = component1 + 15;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = component1 + 107;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[PHI: r1
  0x0032: PHI (r1v7 android.view.View) = (r1v6 android.view.View), (r1v11 android.view.View) binds: [B:13:0x0030, B:10:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void hideSoftInput(android.view.Window r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            if (r6 != 0) goto L6
            return
        L6:
            android.view.View r1 = r6.getCurrentFocus()
            if (r1 != 0) goto L50
            int r1 = com.huawei.digitalpayment.consumer.baselib.util.KeyBoardUtils.component1
            int r1 = r1 + 47
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.util.KeyBoardUtils.component2 = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = "keyboardTagView"
            if (r1 != 0) goto L28
            android.view.View r1 = r6.getDecorView()
            android.view.View r4 = r1.findViewWithTag(r3)
            r5 = 45
            int r5 = r5 / r2
            if (r4 != 0) goto L4c
            goto L32
        L28:
            android.view.View r1 = r6.getDecorView()
            android.view.View r4 = r1.findViewWithTag(r3)
            if (r4 != 0) goto L4c
        L32:
            android.widget.EditText r4 = new android.widget.EditText
            android.content.Context r6 = r6.getContext()
            r4.<init>(r6)
            r4.setTag(r3)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.addView(r4, r2, r2)
            int r6 = com.huawei.digitalpayment.consumer.baselib.util.KeyBoardUtils.component2
            int r6 = r6 + 5
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.baselib.util.KeyBoardUtils.component1 = r1
            int r6 = r6 % r0
        L4c:
            r1 = r4
            r1.requestFocus()
        L50:
            hideSoftInput(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.util.KeyBoardUtils.hideSoftInput(android.view.Window):void");
    }
}
