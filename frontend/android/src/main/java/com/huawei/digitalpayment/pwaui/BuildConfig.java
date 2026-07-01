package com.huawei.digitalpayment.pwaui;

import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;

public final class BuildConfig {
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String LIBRARY_PACKAGE_NAME;
    private static long ShareDataUIState;
    private static int component2;
    private static char[] copydefault;
    private static final byte[] $$a = {70, -47, -65, TarHeader.LF_BLK};
    private static final int $$b = 125;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, int r7, short r8) {
        /*
            int r8 = r8 + 117
            int r6 = r6 * 3
            int r6 = r6 + 4
            int r7 = r7 * 2
            int r0 = 1 - r7
            byte[] r1 = com.huawei.digitalpayment.pwaui.BuildConfig.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwaui.BuildConfig.$$c(byte, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r25, int r26, char r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwaui.BuildConfig.a(int, int, char, java.lang.Object[]):void");
    }

    static {
        component2 = 0;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getKeyRepeatTimeout() >> 16, 31 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
        LIBRARY_PACKAGE_NAME = ((String) objArr[0]).intern();
        int i = component1 + 69;
        component2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void ShareDataUIState() {
        copydefault = new char[]{3093, 37161, 13947, 56264, 30942, 7667, 41783, 16465, 58771, 35503, 12216, 52482, 21087, 63329, 38079, 14802, 57111, 31786, 358, 42631, 19407, 59627, 36403, 4936, 45186, 21992, 64230, 38929, 15703, 49779, 26559};
        ShareDataUIState = -8018715403195018938L;
    }
}
