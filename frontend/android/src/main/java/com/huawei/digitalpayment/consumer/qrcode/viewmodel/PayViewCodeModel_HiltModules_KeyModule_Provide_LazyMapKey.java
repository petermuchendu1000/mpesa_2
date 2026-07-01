package com.huawei.digitalpayment.consumer.qrcode.viewmodel;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;

public final class PayViewCodeModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static int ShareDataUIState;
    private static int component1;
    private static int component2;
    static PayViewCodeModel component3;
    private static int component4;
    private static short[] copy;
    private static byte[] copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {59, -24, -77, -23};
    private static final int $$b = 45;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getRequestBeneficiariesState = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, byte r7, short r8) {
        /*
            int r8 = 116 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.qrcode.viewmodel.PayViewCodeModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r7 = r7 + 4
            int r6 = r6 * 4
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            int r7 = r7 + 1
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.viewmodel.PayViewCodeModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(short, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01e7 A[PHI: r0
  0x01e7: PHI (r0v9 int) = (r0v8 int), (r0v38 int) binds: [B:42:0x01e5, B:39:0x01d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e9 A[PHI: r0
  0x01e9: PHI (r0v35 int) = (r0v8 int), (r0v38 int) binds: [B:42:0x01e5, B:39:0x01d4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r25, int r26, short r27, byte r28, int r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 769
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.viewmodel.PayViewCodeModel_HiltModules_KeyModule_Provide_LazyMapKey.a(int, int, short, byte, int, java.lang.Object[]):void");
    }

    static {
        component4 = 0;
        component2();
        Object[] objArr = new Object[1];
        a(Color.red(0) - 916621752, (-109) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (short) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 14), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 707841645, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = getRequestBeneficiariesState + 87;
        component4 = i % 128;
        if (i % 2 != 0) {
            int i2 = 71 / 0;
        }
    }

    static void component2() {
        component1 = -949354863;
        component2 = -238323899;
        ShareDataUIState = 604260060;
        copydefault = new byte[]{-15, 35, 37, -47, 6, -52, 37, -47, 8, -24, TarHeader.LF_FIFO, -40, TarHeader.LF_CONTIG, -7, 60, TarHeader.LF_DIR, 6, -26, 35, 37, -47, 38, -46, TarHeader.LF_FIFO, -40, -41, 108, -19, 37, -47, 40, -43, 37, 103, -104, 41, -36, -36, 38, 33, -37, 40, 17, -98, 34, 45, -36, -48, 60, -43, 32, 47, -55, 47, 38, -38, 33, Ascii.DC2, -31, 32, -54, TarHeader.LF_SYMLINK, -56, 41, Ascii.RS, -27, -38, 40};
    }
}
