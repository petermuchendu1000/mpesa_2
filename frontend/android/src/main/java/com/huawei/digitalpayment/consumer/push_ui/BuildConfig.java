package com.huawei.digitalpayment.consumer.push_ui;

import android.graphics.Color;
import android.graphics.PointF;
import android.view.View;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;

public final class BuildConfig {
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String LIBRARY_PACKAGE_NAME;
    private static int ShareDataUIState;
    private static int component1;
    private static int component2;
    private static short[] component3;
    private static int copy;
    private static byte[] copydefault;
    private static final byte[] $$a = {7, 75, -84, -52};
    private static final int $$b = 86;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component4 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, byte r7, byte r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.push_ui.BuildConfig.$$a
            int r6 = r6 + 4
            int r8 = 116 - r8
            int r7 = r7 * 2
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.push_ui.BuildConfig.$$c(short, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r27, int r28, short r29, byte r30, int r31, java.lang.Object[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.push_ui.BuildConfig.a(int, int, short, byte, int, java.lang.Object[]):void");
    }

    static {
        copy = 0;
        component2();
        Object[] objArr = new Object[1];
        a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1814353078, Color.argb(0, 0, 0, 0) - 58, (short) ((-106) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (byte) View.resolveSizeAndState(0, 0, 0), 1946366851 - Color.blue(0), objArr);
        LIBRARY_PACKAGE_NAME = ((String) objArr[0]).intern();
        int i = component4 + 47;
        copy = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void component2() {
        ShareDataUIState = -1645239393;
        component2 = -238323891;
        component1 = 2050472905;
        copydefault = new byte[]{119, -87, 72, 118, 65, 70, -123, Ascii.SI, 94, 75, 75, 69, 70, SignedBytes.MAX_POWER_OF_TWO, 95, -74, 13, 89, 90, 75, 119, -85, 114, 71, 92, 126, 92, 69, 65, 70, -119, 6, 71, 113, -87, 127, 94, -115, 2, 65, 95, 41};
    }
}
