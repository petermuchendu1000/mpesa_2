package com.huawei.digitalpayment.consumer.baselib;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import com.alibaba.ariver.resource.parser.tar.TarHeader;

public final class BuildConfig {
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String LIBRARY_PACKAGE_NAME;
    private static int ShareDataUIState;
    private static byte[] component1;
    private static int component2;
    private static short[] component3;
    private static int copydefault;
    private static int getRequestBeneficiariesState;
    private static final byte[] $$a = {99, TarHeader.LF_DIR, 44, 107};
    private static final int $$b = 221;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getAsAtTimestamp = 1;

    private static String $$c(short s, byte b2, int i) {
        int i2 = i * 3;
        int i3 = b2 + 4;
        byte[] bArr = $$a;
        int i4 = 116 - s;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i4 = (-i4) + i5;
            i3 = i3;
            i6 = -1;
        }
        while (true) {
            int i7 = i3 + 1;
            int i8 = i6 + 1;
            bArr2[i8] = (byte) i4;
            if (i8 == i5) {
                return new String(bArr2, 0);
            }
            i4 = (-bArr[i7]) + i4;
            i3 = i7;
            i6 = i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0237 A[PHI: r0
  0x0237: PHI (r0v9 int) = (r0v8 int), (r0v43 int) binds: [B:48:0x0235, B:45:0x0224] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0239 A[PHI: r0
  0x0239: PHI (r0v40 int) = (r0v8 int), (r0v43 int) binds: [B:48:0x0235, B:45:0x0224] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r26, int r27, short r28, byte r29, int r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.BuildConfig.a(int, int, short, byte, int, java.lang.Object[]):void");
    }

    static {
        getRequestBeneficiariesState = 0;
        component2();
        Object[] objArr = new Object[1];
        a(552982503 - Color.red(0), TextUtils.lastIndexOf("", '0') - 12, (short) (Gravity.getAbsoluteGravity(0, 0) + 42), (byte) (Color.rgb(0, 0, 0) + 16777216), KeyEvent.keyCodeFromString("") + 233130071, objArr);
        LIBRARY_PACKAGE_NAME = ((String) objArr[0]).intern();
        int i = getAsAtTimestamp + 105;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 != 0) {
            int i2 = 59 / 0;
        }
    }

    static void component2() {
        ShareDataUIState = 784424752;
        copydefault = -238323938;
        component2 = 64081701;
        component1 = new byte[]{-26, -6, -12, -31, -63, -4, 35, -69, -54, -25, -25, -15, -14, -4, -53, 34, -71, -11, -10, -25, -29, -57, -18, -13, -56, -22, -56, -15, -3, -14, 37, -78, -13, -19, -59, -21, -54, 57, -66, -3, -53, 41};
    }
}
