package com.huawei.digitalpayment.consumer.developer;

import android.graphics.drawable.Drawable;
import android.widget.ExpandableListView;

public final class BuildConfig {
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String LIBRARY_PACKAGE_NAME;
    private static long component1;
    private static char[] component2;
    private static int component3;
    private static final byte[] $$a = {66, 42, 112, 97};
    private static final int $$b = 252;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ShareDataUIState = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r7, short r8, int r9) {
        /*
            int r8 = r8 * 4
            int r8 = r8 + 4
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r9 = 122 - r9
            byte[] r0 = com.huawei.digitalpayment.consumer.developer.BuildConfig.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r8
            goto L29
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L29:
            int r8 = r8 + r3
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.developer.BuildConfig.$$c(int, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r29, int r30, char r31, java.lang.Object[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.developer.BuildConfig.a(int, int, char, java.lang.Object[]):void");
    }

    static {
        component3 = 0;
        copydefault();
        Object[] objArr = new Object[1];
        a(Drawable.resolveOpacity(0, 0), ExpandableListView.getPackedPositionChild(0L) + 45, (char) ExpandableListView.getPackedPositionType(0L), objArr);
        LIBRARY_PACKAGE_NAME = ((String) objArr[0]).intern();
        int i = ShareDataUIState + 81;
        component3 = i % 128;
        int i2 = i % 2;
    }

    static void copydefault() {
        component2 = new char[]{3093, 2093, 1139, 196, 7374, 6407, 5423, 4461, 11699, 10699, 9808, 8750, 15983, 15029, 14023, 13070, 20311, 19310, 18350, 17355, 22559, 21599, 20587, 27828, 26850, 25932, 24925, 32101, 31144, 30177, 29211, 36439, 35475, 34480, 33456, 40718, 39747, 38788, 37803, 45046, 42041, 41042, 48283, 47288};
        component1 = 5401673807626045506L;
    }
}
