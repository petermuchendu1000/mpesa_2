package com.huawei.digitalpayment.consumer.fixeddata.viewmodel;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import kotlin.io.encoding.Base64;

public final class ManageAccountViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    static ManageAccountViewModel ShareDataUIState;
    private static byte[] component1;
    private static int component2;
    private static int component3;
    private static int copy;
    private static int copydefault;
    private static short[] getRequestBeneficiariesState;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {115, -125, 45, -41};
    private static final int $$b = 163;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getAsAtTimestamp = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r5, int r6, byte r7) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.ManageAccountViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r6 = 116 - r6
            int r5 = r5 * 4
            int r5 = r5 + 1
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r6
            r3 = r2
            r6 = r5
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            r4 = r0[r7]
        L25:
            int r7 = r7 + 1
            int r6 = r6 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.viewmodel.ManageAccountViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(int, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x025f A[PHI: r0
  0x025f: PHI (r0v9 int) = (r0v8 int), (r0v45 int) binds: [B:59:0x025d, B:56:0x024a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0261 A[PHI: r0
  0x0261: PHI (r0v42 int) = (r0v8 int), (r0v45 int) binds: [B:59:0x025d, B:56:0x024a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r24, int r25, short r26, byte r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 917
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.viewmodel.ManageAccountViewModel_HiltModules_KeyModule_Provide_LazyMapKey.a(int, int, short, byte, int, java.lang.Object[]):void");
    }

    static {
        copy = 1;
        component1();
        Object[] objArr = new Object[1];
        a(Color.alpha(0) - 982107998, 33 - (Process.myTid() >> 22), (short) (TextUtils.lastIndexOf("", '0') + 1), (byte) TextUtils.indexOf("", "", 0), (-1441022547) - Color.blue(0), objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = getAsAtTimestamp + 109;
        copy = i % 128;
        int i2 = i % 2;
    }

    static void component1() {
        copydefault = -884821897;
        component3 = -238323963;
        component2 = -1540409953;
        component1 = new byte[]{46, 40, -36, Ascii.VT, -1, 59, -43, 58, -53, 47, -48, 47, 37, 41, Ascii.VT, -11, -41, 47, -38, 36, Base64.padSymbol, TarHeader.LF_FIFO, -21, 46, 40, -36, 43, -33, 59, -43, -38, 97, -28, -60, 58, -44, 41, -42, -60, 38, 42, 17, -107, 36, -47, -47, 43, 44, -42, 37, Ascii.FS, -109, 47, 32, -47, -35, TarHeader.LF_LINK, -40, 45, 34, -60, 34, 43, -41, 44, Ascii.US, -20, 45, -57, 63, -59, 36, 19, -24, -41, 37, 41};
    }
}
