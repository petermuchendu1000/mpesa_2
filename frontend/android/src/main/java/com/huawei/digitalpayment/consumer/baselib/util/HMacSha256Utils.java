package com.huawei.digitalpayment.consumer.baselib.util;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;

public final class HMacSha256Utils {
    private static final String copydefault = "HMacSha256Utils";
    private static final byte[] $$c = {46, -35, 45, 111};
    private static final int $$d = 246;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {94, -53, Ascii.FS, -60, -39, -25, -30, -26, -26, -18, -36, -33, 39};
    private static final int $$b = 239;
    private static int component3 = 0;
    private static int component1 = 1;
    private static long component2 = -6647425558005936981L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(byte r6, short r7, short r8) {
        /*
            int r7 = r7 * 4
            int r0 = r7 + 1
            int r8 = r8 + 4
            byte[] r1 = com.huawei.digitalpayment.consumer.baselib.util.HMacSha256Utils.$$c
            int r6 = r6 * 2
            int r6 = r6 + 103
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r8 = r8 + r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.util.HMacSha256Utils.$$e(byte, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 9
            int r0 = 10 - r8
            byte[] r1 = com.huawei.digitalpayment.consumer.baselib.util.HMacSha256Utils.$$a
            int r7 = r7 * 9
            int r7 = 13 - r7
            int r6 = r6 + 97
            byte[] r0 = new byte[r0]
            int r8 = 9 - r8
            r2 = 0
            if (r1 != 0) goto L17
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2c
        L17:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r1[r6]
        L2c:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-27)
            int r6 = r6 + 1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.util.HMacSha256Utils.a(byte, short, int, java.lang.Object[]):void");
    }

    private HMacSha256Utils() {
        throw new AssertionError("Must not instantiate constant utility class");
    }

    public static boolean compareHash(String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = component3 + 23;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zEquals = str.equals(hashMacSha256(str2, str3));
        int i4 = component1 + 23;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return zEquals;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component2 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        int i3 = $10 + 107;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i5 = $10 + 79;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i7 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component2)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 34 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (63440 - (ViewConfiguration.getLongPressTimeout() >> 16)), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1390 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 18, (char) (TextUtils.indexOf("", "", 0, 0) + 51269), -1883291598, false, $$e(b2, b3, (byte) (b3 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrComponent2, 4, cArrComponent2.length - 4);
        int i8 = $11 + 119;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x021b A[Catch: Exception -> 0x06a1, IllegalArgumentException -> 0x06ad, PHI: r3
  0x021b: PHI (r3v94 java.lang.Object[]) = (r3v93 java.lang.Object[]), (r3v132 java.lang.Object[]) binds: [B:31:0x0219, B:27:0x01d0] A[DONT_GENERATE, DONT_INLINE], TryCatch #14 {IllegalArgumentException -> 0x06ad, Exception -> 0x06a1, blocks: (B:3:0x0009, B:5:0x0011, B:7:0x0017, B:9:0x003b, B:10:0x0070, B:12:0x007c, B:14:0x00a3, B:17:0x0135, B:19:0x0174, B:25:0x01ce, B:32:0x021b, B:34:0x0226, B:36:0x024a, B:38:0x0253, B:39:0x0298, B:41:0x02a7, B:42:0x02e5, B:50:0x035e, B:52:0x0364, B:53:0x0365, B:30:0x0217, B:54:0x0366, B:56:0x0370, B:58:0x0376, B:59:0x0377, B:60:0x0378, B:62:0x0381, B:63:0x03b8, B:74:0x0482), top: B:187:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0541 A[Catch: Exception -> 0x067d, IllegalArgumentException -> 0x0681, TRY_ENTER, TryCatch #15 {IllegalArgumentException -> 0x0681, Exception -> 0x067d, blocks: (B:76:0x04c1, B:88:0x0536, B:97:0x0541, B:99:0x0545, B:101:0x054b), top: B:185:0x04c1 }] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v29, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v41, types: [int] */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r12v53 */
    /* JADX WARN: Type inference failed for: r12v54 */
    /* JADX WARN: Type inference failed for: r12v55 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String hashMacSha256(java.lang.String r30, java.lang.String r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.util.HMacSha256Utils.hashMacSha256(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037 A[PHI: r3
  0x0037: PHI (r3v8 java.lang.String) = (r3v6 java.lang.String), (r3v11 java.lang.String) binds: [B:12:0x0035, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String component2(byte[] r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
        L9:
            if (r6 == 0) goto L4c
            int r3 = r6.length
            if (r2 >= r3) goto L4c
            int r3 = com.huawei.digitalpayment.consumer.baselib.util.HMacSha256Utils.component1
            int r3 = r3 + 73
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.baselib.util.HMacSha256Utils.component3 = r4
            int r3 = r3 % r0
            r4 = 1
            if (r3 == 0) goto L29
            r3 = r6[r2]
            r3 = r3 & 31233(0x7a01, float:4.3767E-41)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            int r5 = r3.length()
            if (r5 != r4) goto L46
            goto L37
        L29:
            r3 = r6[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            int r5 = r3.length()
            if (r5 != r4) goto L46
        L37:
            r4 = 48
            r1.append(r4)
            int r4 = com.huawei.digitalpayment.consumer.baselib.util.HMacSha256Utils.component3
            int r4 = r4 + 27
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.baselib.util.HMacSha256Utils.component1 = r5
            int r4 = r4 % 2
        L46:
            r1.append(r3)
            int r2 = r2 + 1
            goto L9
        L4c:
            java.lang.String r6 = r1.toString()
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r6 = r6.toLowerCase(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.util.HMacSha256Utils.component2(byte[]):java.lang.String");
    }
}
