package com.huawei.digitalpayment.consumer.home.ui.screen;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.Composer;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelNotification;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class GlobalSearchScreenKt$$ExternalSyntheticLambda3 implements Function2 {
    public final String f$0;
    public final String f$1;
    public final Function1 f$2;
    public final int f$3;
    private static final byte[] $$c = {4, -80, 45, 109};
    private static final int $$f = 79;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {Ascii.VT, -55, -20, -91, -39, -25, -30, -26, -26, -18, -36, -33, 39, -39, -28, -36};
    private static final int $$e = 158;
    private static final byte[] $$a = {68, -127, 122, -15, 1, Ascii.US, -11, 33, -64, 63, Ascii.EM, 17, 1, Ascii.SO, 5, -55, Ascii.US, TarHeader.LF_NORMAL, 17, 2, 7, Ascii.ETB, Ascii.NAK, -31, 45, Ascii.SI, -3, Ascii.NAK};
    private static final int $$b = 172;
    private static int copydefault = 0;
    private static int ShareDataUIState = 1;
    private static char[] component3 = {3833, 17450, 39765, 61050, 9693, 30919, 53218, 1301, 22580, 44837, 58001, 14782, 36053, 49671, 6438, 27736, 41831, 63205, 19950, 33022, 54791, 11587, 24684, 47007, 2868, 16878, 40599, 60310, 8284, 32015, 51754, 221, 24058, 43694, 59217, 15464, 23637, 5766, 51705, 48342, 30577, 10859, 40270, 22457, 2712, 64905, 45117, 27410, 56953, 37035, 19338, 16116, 61899, 42057, 8002, 53848, 33979, 32750, 13001, 58686, 22554, 4949, 20095, 1213, 56296, 44799, 25858, 14407, 36720, 17819, 48745, 62643, 11210, 24276, 38155, 51266, 32619, 46484, 59552, 8130, 20999, 35126, 15435, 3089, 18123, 39346, 60590, 10103, 31292, 52487, 2035, 23251, 44442, 57443, 15180, 36354, 49399, 7126, 28347, 41349};
    private static long component1 = 8704916125564159662L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(byte r6, byte r7, int r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.home.ui.screen.GlobalSearchScreenKt$$ExternalSyntheticLambda3.$$c
            int r7 = r7 * 2
            int r1 = 1 - r7
            int r6 = r6 + 117
            int r8 = r8 * 2
            int r8 = 4 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L17
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2a:
            int r8 = -r8
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.screen.GlobalSearchScreenKt$$ExternalSyntheticLambda3.$$g(byte, byte, int):java.lang.String");
    }

    public GlobalSearchScreenKt$$ExternalSyntheticLambda3(String str, String str2, Function1 function1, int i) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = function1;
        this.f$3 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.home.ui.screen.GlobalSearchScreenKt$$ExternalSyntheticLambda3.$$a
            int r7 = r7 * 6
            int r7 = 106 - r7
            int r9 = r9 * 12
            int r9 = r9 + 7
            int r8 = r8 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r5 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            int r8 = r8 + 1
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2b:
            int r7 = r7 + r8
            int r7 = r7 + (-10)
            r8 = r3
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.screen.GlobalSearchScreenKt$$ExternalSyntheticLambda3.a(byte, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r6 = r6 * 3
            int r0 = 10 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.home.ui.screen.GlobalSearchScreenKt$$ExternalSyntheticLambda3.$$d
            int r7 = 100 - r7
            byte[] r0 = new byte[r0]
            int r6 = 9 - r6
            r2 = 0
            if (r1 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2d:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-27)
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.screen.GlobalSearchScreenKt$$ExternalSyntheticLambda3.b(byte, short, int, java.lang.Object[]):void");
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return GlobalSearchScreenKt.$r8$lambda$HK0oa3s4bcTWBHRsG3uEOI8fIrU(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, ((Integer) obj2).intValue());
        }
        GlobalSearchScreenKt.$r8$lambda$HK0oa3s4bcTWBHRsG3uEOI8fIrU(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, ((Integer) obj2).intValue());
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    private static void c(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i];
        cancelnotification.copydefault = 0;
        int i5 = $10 + 101;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 2 / 4;
        }
        while (cancelnotification.copydefault < i) {
            int i7 = $10 + 7;
            $11 = i7 % 128;
            int i8 = i7 % i3;
            int i9 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(component3[i2 + i9])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    int iIndexOf = 1757 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    int trimmedLength = TextUtils.getTrimmedLength("") + 34;
                    char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                    byte length = (byte) $$c.length;
                    byte b2 = (byte) (length - 4);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, trimmedLength, threadPriority, 1159210934, false, $$g(length, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i9), Long.valueOf(component1), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getSize(0) + 3608, KeyEvent.keyCodeFromString("") + 29, (char) (7171 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 1951385784, false, $$g(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i9] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    int i10 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4013;
                    int iIndexOf2 = 23 - TextUtils.indexOf((CharSequence) "", '0');
                    char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 27761);
                    byte b5 = (byte) ($$f & 21);
                    byte b6 = (byte) (b5 - 5);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i10, iIndexOf2, cResolveSizeAndState, -1529629956, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                int i11 = $11 + 61;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                i3 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i) {
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr5 = {cancelnotification, cancelnotification};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault4 == null) {
                int deadChar = 4013 - KeyEvent.getDeadChar(0, 0);
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24;
                char cGreen = (char) (Color.green(0) + 27761);
                byte b7 = (byte) ($$f & 21);
                byte b8 = (byte) (b7 - 5);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(deadChar, scrollBarFadeDuration, cGreen, -1529629956, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0973  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x06c7 A[PHI: r0 r4
  0x06c7: PHI (r0v115 java.lang.Object[]) = (r0v114 java.lang.Object[]), (r0v194 java.lang.Object[]) binds: [B:65:0x06c5, B:60:0x0691] A[DONT_GENERATE, DONT_INLINE]
  0x06c7: PHI (r4v138 char) = (r4v137 char), (r4v150 char) binds: [B:65:0x06c5, B:60:0x0691] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int component2(java.util.List r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3121
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.screen.GlobalSearchScreenKt$$ExternalSyntheticLambda3.component2(java.util.List):int");
    }
}
