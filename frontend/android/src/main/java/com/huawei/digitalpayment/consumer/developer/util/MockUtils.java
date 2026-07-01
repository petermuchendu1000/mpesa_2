package com.huawei.digitalpayment.consumer.developer.util;

import android.view.View;
import com.dynatrace.android.callback.Callback;

public class MockUtils {
    public static final String KEY_FIRST = "first";
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static final int component3 = 7;
    private static int copydefault = 0;
    private static int getRequestBeneficiariesState = 13 % 128;

    static void component2() {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        component1 = 0;
        int i5 = i3 + 55;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 0 / 0;
        }
    }

    public static void open(final View view) {
        int i = 2 % 2;
        final Runnable runnable = new Runnable() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public final void run() {
                int i2 = 2 % 2;
                int i3 = component1 + 83;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                MockUtils.component2();
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        view.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public final void onClick(View view2) {
                int i2 = 2 % 2;
                int i3 = component2 + 119;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                MockUtils.m10327$r8$lambda$ISJaHF1ibMmjoe8nxju9oS4jw(runnable, view, view2);
                int i5 = ShareDataUIState + 109;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i2 = copydefault + 115;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void copydefault(java.lang.Runnable r3, android.view.View r4, android.view.View r5) {
        /*
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.huawei.digitalpayment.consumer.developer.util.MockUtils.copydefault
            int r0 = r0 + 71
            int r1 = r0 % 128
            com.huawei.digitalpayment.consumer.developer.util.MockUtils.ShareDataUIState = r1
            int r0 = r0 % r5
            android.os.Handler r0 = com.blankj.utilcode.util.ThreadUtils.getMainHandler()
            r0.removeCallbacks(r3)
            int r0 = com.huawei.digitalpayment.consumer.developer.util.MockUtils.component1
            int r0 = r0 + 1
            com.huawei.digitalpayment.consumer.developer.util.MockUtils.component1 = r0
            r1 = 7
            if (r0 < r1) goto L5c
            int r0 = com.huawei.digitalpayment.consumer.developer.util.MockUtils.copydefault
            int r0 = r0 + 19
            int r1 = r0 % 128
            com.huawei.digitalpayment.consumer.developer.util.MockUtils.ShareDataUIState = r1
            int r0 = r0 % r5
            r5 = 0
            if (r0 != 0) goto L3a
            java.lang.Class<com.huawei.digitalpayment.consumer.baselib.config.IAppConfig> r0 = com.huawei.digitalpayment.consumer.baselib.config.IAppConfig.class
            java.lang.Object r0 = com.huawei.arouter.RouteUtils.getService(r0)
            com.huawei.digitalpayment.consumer.baselib.config.IAppConfig r0 = (com.huawei.digitalpayment.consumer.baselib.config.IAppConfig) r0
            boolean r0 = r0.isDebug()
            r1 = 38
            int r1 = r1 / r5
            if (r0 == 0) goto L5c
            goto L48
        L3a:
            java.lang.Class<com.huawei.digitalpayment.consumer.baselib.config.IAppConfig> r0 = com.huawei.digitalpayment.consumer.baselib.config.IAppConfig.class
            java.lang.Object r0 = com.huawei.arouter.RouteUtils.getService(r0)
            com.huawei.digitalpayment.consumer.baselib.config.IAppConfig r0 = (com.huawei.digitalpayment.consumer.baselib.config.IAppConfig) r0
            boolean r0 = r0.isDebug()
            if (r0 == 0) goto L5c
        L48:
            android.content.Context r0 = r4.getContext()
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r4 = r4.getContext()
            java.lang.Class<com.huawei.digitalpayment.consumer.developer.activity.DevActivity> r2 = com.huawei.digitalpayment.consumer.developer.activity.DevActivity.class
            r1.<init>(r4, r2)
            r0.startActivity(r1)
            com.huawei.digitalpayment.consumer.developer.util.MockUtils.component1 = r5
        L5c:
            android.os.Handler r4 = com.blankj.utilcode.util.ThreadUtils.getMainHandler()
            r0 = 300(0x12c, double:1.48E-321)
            r4.postDelayed(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.developer.util.MockUtils.copydefault(java.lang.Runnable, android.view.View, android.view.View):void");
    }

    public static void m10327$r8$lambda$ISJaHF1ibMmjoe8nxju9oS4jw(Runnable runnable, View view, View view2) {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        component1(runnable, view, view2);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = ShareDataUIState + 5;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        if (13 % 2 == 0) {
            int i = 21 / 0;
        }
    }

    /* JADX WARN: Finally extract failed */
    private static void component1(Runnable runnable, View view, View view2) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view2);
        try {
            if (i3 != 0) {
                copydefault(runnable, view, view2);
                Callback.onClick_exit();
                throw null;
            }
            copydefault(runnable, view, view2);
            Callback.onClick_exit();
            int i4 = copydefault + 19;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 20 / 0;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }
}
