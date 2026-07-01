package com.huawei.digitalpayment.checkoutUi;

import android.text.TextUtils;
import android.view.View;

public final class BuildConfig {
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String LIBRARY_PACKAGE_NAME;
    private static int component1;
    private static char[] component2;
    private static long copydefault;
    private static final byte[] $$a = {13, 38, -109, 117};
    private static final int $$b = 4;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ShareDataUIState = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r5, int r6, byte r7) {
        /*
            int r5 = r5 * 3
            int r5 = 4 - r5
            int r6 = 122 - r6
            byte[] r0 = com.huawei.digitalpayment.checkoutUi.BuildConfig.$$a
            int r7 = r7 * 4
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            r3 = r0[r5]
        L24:
            int r5 = r5 + 1
            int r6 = r6 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkoutUi.BuildConfig.$$c(short, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r23, int r24, char r25, java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkoutUi.BuildConfig.a(int, int, char, java.lang.Object[]):void");
    }

    static {
        component1 = 1;
        component2();
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf("", "", 0, 0), 36 - View.getDefaultSize(0, 0), (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
        LIBRARY_PACKAGE_NAME = ((String) objArr[0]).intern();
        int i = ShareDataUIState + 97;
        component1 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component2() {
        component2 = new char[]{3093, 44085, 19523, 60636, 36014, 11487, 52511, 27957, 3443, 44435, 19936, 60918, 36367, 11821, 52855, 28310, 3799, 44790, 20254, 61267, 36735, 12167, 53211, 28652, 2082, 43028, 18541, 59578, 35011, 10473, 51509, 26957, 2435, 43438, 18939, 59931};
        copydefault = -5244702709250151334L;
    }
}
