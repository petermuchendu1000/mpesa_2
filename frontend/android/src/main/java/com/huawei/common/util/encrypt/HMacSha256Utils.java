package com.huawei.common.util.encrypt;

import android.os.Process;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.Locale;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;

public final class HMacSha256Utils {
    private static final String component1 = "HMacSha256Utils";
    private static final byte[] $$c = {89, 120, -98, -110};
    private static final int $$d = 228;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {35, -27, -128, TarHeader.LF_SYMLINK, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -39};
    private static final int $$b = 21;
    private static int component2 = 0;
    private static int ShareDataUIState = 1;
    private static long component3 = -6429798760506410422L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(int r5, int r6, int r7) {
        /*
            int r6 = r6 * 4
            int r0 = r6 + 1
            int r5 = r5 * 4
            int r5 = r5 + 4
            byte[] r1 = com.huawei.common.util.encrypt.HMacSha256Utils.$$c
            int r7 = r7 * 4
            int r7 = r7 + 103
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r1[r5]
        L26:
            int r4 = -r4
            int r7 = r7 + r4
            int r5 = r5 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.util.encrypt.HMacSha256Utils.$$e(int, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 9
            int r0 = r6 + 1
            int r8 = r8 * 9
            int r8 = 13 - r8
            byte[] r1 = com.huawei.common.util.encrypt.HMacSha256Utils.$$a
            int r7 = r7 + 97
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2c
        L14:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2c:
            int r8 = r8 + r7
            int r7 = r3 + 1
            int r8 = r8 + (-27)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.util.encrypt.HMacSha256Utils.a(short, byte, short, java.lang.Object[]):void");
    }

    private HMacSha256Utils() {
        throw new AssertionError("Must not instantiate constant utility class");
    }

    public static boolean compareHash(String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = component2 + 119;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        boolean zEquals = str.equals(hashMacSha256(str2, str3));
        int i4 = ShareDataUIState + 71;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return zEquals;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component3 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        int i3 = $11 + 65;
        while (true) {
            $10 = i3 % 128;
            int i4 = i3 % 2;
            if (iTrustedWebActivityServiceDefault.copydefault >= cArrComponent2.length) {
                objArr[0] = new String(cArrComponent2, 4, cArrComponent2.length - 4);
                return;
            }
            int i5 = $10 + 93;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i7 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component3)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7031, ((Process.getThreadPriority(0) + 20) >> 6) + 34, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 63440), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1391 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 17 - MotionEvent.axisFromString(""), (char) (51269 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), -1883291598, false, $$e(b2, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                i3 = $11 + 53;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0383, code lost:
    
        r0 = java.lang.Long.TYPE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0386, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0573  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String hashMacSha256(java.lang.String r30, java.lang.String r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.util.encrypt.HMacSha256Utils.hashMacSha256(java.lang.String, java.lang.String):java.lang.String");
    }

    private static String component2(byte[] bArr) {
        Object obj;
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            obj = null;
            if (bArr == null) {
                break;
            }
            int i3 = ShareDataUIState + 125;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                int length = bArr.length;
                throw null;
            }
            if (i2 >= bArr.length) {
                break;
            }
            String hexString = Integer.toHexString(bArr[i2] & 255);
            if (hexString.length() == 1) {
                int i4 = ShareDataUIState + 49;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                sb.append('0');
            }
            sb.append(hexString);
            i2++;
        }
        String lowerCase = sb.toString().toLowerCase(Locale.ENGLISH);
        int i6 = component2 + 25;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 != 0) {
            return lowerCase;
        }
        obj.hashCode();
        throw null;
    }
}
