package com.huawei.digitalpayment.consumer.baselib.init;

import android.content.Context;
import android.content.res.Configuration;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;

public class DensityUtil {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private static int equals = 1;
    private static int getAsAtTimestamp;
    private static final float component2 = AppConfigManager.getAppConfig().getBaseWidth();
    private static float component1 = 0.0f;
    private static float component3 = 0.0f;

    static {
        int i = ShareDataUIState + 55;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002e A[PHI: r1
  0x002e: PHI (r1v6 android.util.DisplayMetrics) = (r1v5 android.util.DisplayMetrics), (r1v11 android.util.DisplayMetrics) binds: [B:8:0x002c, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void setCustomDensity(android.app.Activity r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.init.DensityUtil.getAsAtTimestamp
            int r1 = r1 + 97
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.init.DensityUtil.equals = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L20
            android.content.res.Resources r1 = r5.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r3 = com.huawei.digitalpayment.consumer.baselib.init.DensityUtil.component1
            r4 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L3b
            goto L2e
        L20:
            android.content.res.Resources r1 = r5.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r3 = com.huawei.digitalpayment.consumer.baselib.init.DensityUtil.component1
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 != 0) goto L3b
        L2e:
            float r3 = r1.density
            com.huawei.digitalpayment.consumer.baselib.init.DensityUtil.component1 = r3
            int r3 = com.huawei.digitalpayment.consumer.baselib.init.DensityUtil.equals
            int r3 = r3 + 93
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.baselib.init.DensityUtil.getAsAtTimestamp = r4
            int r3 = r3 % r0
        L3b:
            float r0 = com.huawei.digitalpayment.consumer.baselib.init.DensityUtil.component3
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L45
            float r0 = r1.scaledDensity
            com.huawei.digitalpayment.consumer.baselib.init.DensityUtil.component3 = r0
        L45:
            int r0 = r1.widthPixels
            float r0 = (float) r0
            float r2 = com.huawei.digitalpayment.consumer.baselib.init.DensityUtil.component2
            float r0 = r0 / r2
            float r2 = com.huawei.digitalpayment.consumer.baselib.init.DensityUtil.component3
            float r3 = com.huawei.digitalpayment.consumer.baselib.init.DensityUtil.component1
            float r2 = r2 / r3
            float r2 = r2 * r0
            r3 = 1126170624(0x43200000, float:160.0)
            float r3 = r3 * r0
            int r3 = (int) r3
            r1.density = r0
            r1.scaledDensity = r2
            r1.densityDpi = r3
            android.content.res.Resources r1 = r5.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            r1.density = r0
            r1.scaledDensity = r2
            r1.densityDpi = r3
            setDefaultDisplay(r5, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.init.DensityUtil.setCustomDensity(android.app.Activity):void");
    }

    public static void setDefaultDisplay(Context context, int i) {
        int i2 = 2 % 2;
        int i3 = equals + 89;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        Configuration configuration = context.getResources().getConfiguration();
        configuration.densityDpi = i;
        context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
        int i5 = getAsAtTimestamp + 107;
        equals = i5 % 128;
        int i6 = i5 % 2;
    }
}
