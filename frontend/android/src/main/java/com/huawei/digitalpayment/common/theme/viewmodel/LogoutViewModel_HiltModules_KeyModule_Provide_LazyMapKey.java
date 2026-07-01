package com.huawei.digitalpayment.common.theme.viewmodel;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelNotification;

public final class LogoutViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static final byte[] $$a = {70, -47, -65, TarHeader.LF_BLK};
    private static final int $$b = 106;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ShareDataUIState = 1;
    private static long component1;
    private static int component2;
    static LogoutViewModel component3;
    private static char[] copydefault;
    public static String lazyClassKeyName;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, int r7, byte r8) {
        /*
            int r6 = r6 + 4
            byte[] r0 = com.huawei.digitalpayment.common.theme.viewmodel.LogoutViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r8 = r8 * 4
            int r1 = r8 + 1
            int r7 = 122 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L27
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r6]
            r5 = r3
            r3 = r7
            r7 = r5
        L27:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.viewmodel.LogoutViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(byte, int, byte):java.lang.String");
    }

    private static void a(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i4 = $11 + 43;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(copydefault[i + i6])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (-b2);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1759 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), Color.blue(0) + 34, (char) (ImageFormat.getBitsPerPixel(0) + 1), 1159210934, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(component1), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 & 5);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3607 - TextUtils.lastIndexOf("", '0'), 29 - TextUtils.indexOf("", "", 0, 0), (char) (7172 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 1951385784, false, $$c(b4, b5, (byte) (b5 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 4012, ImageFormat.getBitsPerPixel(0) + 25, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 27760), -1529629956, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            try {
                Object[] objArr5 = {cancelnotification, cancelnotification};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) (-1);
                    byte b9 = (byte) (b8 + 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(4012 - Process.getGidForName(""), 24 - Color.green(0), (char) (27761 - TextUtils.getTrimmedLength("")), -1529629956, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        String str = new String(cArr);
        int i7 = $11 + 99;
        $10 = i7 % 128;
        if (i7 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i8 = 65 / 0;
            objArr[0] = str;
        }
    }

    static {
        component2 = 0;
        component1();
        Object[] objArr = new Object[1];
        a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 64, (char) (KeyEvent.getMaxKeyCode() >> 16), objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = ShareDataUIState + 37;
        component2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component1() {
        copydefault = new char[]{3093, 59576, 50521, 41403, 40602, 31526, 22481, 19558, 10523, 1462, 57874, 57081, 48019, 36924, 36049, 26989, 17927, 8875, 8020, 64484, 53403, 52526, 43461, 34415, 25370, 24545, 13391, 4322, 3463, 59942, 50887, 41831, 39032, 29891, 20860, 19984, 10943, 1878, 58302, 55431, 46391, 37338, 36459, 27408, 18357, 15455, 6397, 62869, 53864, 52971, 43883, 32770, 31917, 22870, 13812, 4791, 3879, 60362, 49275, 48416, 39333, 30287, 21229, 20357};
        component1 = 4806805595988355287L;
    }
}
