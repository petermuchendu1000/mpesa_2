package com.huawei.digitalpayment.checkout.viewmodel;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelNotification;
import kotlin.io.encoding.Base64;

public final class PayResultViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    static PayResultViewModel ShareDataUIState;
    private static long component1;
    private static char[] component2;
    private static int component3;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {Base64.padSymbol, -49, -70, 93};
    private static final int $$b = 151;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copydefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, int r7, int r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.checkout.viewmodel.PayResultViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r7 = r7 * 2
            int r1 = 1 - r7
            int r6 = r6 + 4
            int r8 = r8 + 117
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            int r3 = r3 + 1
            int r6 = r6 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.viewmodel.PayResultViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(byte, int, int):java.lang.String");
    }

    private static void a(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i4 = $10 + 69;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(component2[i + i6])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) (-1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "") + 1758, 33 - ExpandableListView.getPackedPositionChild(0L), (char) View.MeasureSpec.makeMeasureSpec(0, 0), 1159210934, false, $$c(b2, (byte) (b2 + 1), (byte) $$a.length), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(component1), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3607, 29 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (7171 - KeyEvent.keyCodeFromString("")), 1951385784, false, $$c(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b5 = (byte) (-1);
                    byte b6 = (byte) (b5 + 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4013 - (ViewConfiguration.getPressedStateDuration() >> 16), 24 - Color.blue(0), (char) (27760 - TextUtils.lastIndexOf("", '0')), -1529629956, false, $$c(b5, b6, (byte) (b6 + 5)), new Class[]{Object.class, Object.class});
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
            int i7 = $11 + 83;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr5 = {cancelnotification, cancelnotification};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault4 == null) {
                byte b7 = (byte) (-1);
                byte b8 = (byte) (b7 + 1);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(4013 - TextUtils.getTrimmedLength(""), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 25, (char) (27760 - TextUtils.lastIndexOf("", '0', 0)), -1529629956, false, $$c(b7, b8, (byte) (b8 + 5)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    static {
        component3 = 0;
        component1();
        Object[] objArr = new Object[1];
        a((Process.getThreadPriority(0) + 20) >> 6, TextUtils.indexOf("", "", 0) + 63, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = copydefault + 45;
        component3 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component1() {
        component2 = new char[]{3093, 21235, 45519, 4326, 30646, 54929, 13675, 37991, 64323, 23077, 47484, 6172, 32487, 56819, 15571, 33716, 58039, 16784, 41074, 1865, 26183, 50473, 9231, 35614, 59890, 18562, 45009, 3760, 28043, 52375, 4977, 29263, 53571, 12328, 38732, 62974, 21751, 48065, 6845, 31165, 55433, 16232, 40567, 64852, 23648, 41732, 539, 24825, 51140, 9945, 34225, 58525, 19346, 43632, 2428, 26713, 53027, 11803, 36159, 54263, 13002, 37329, 61622};
        component1 = -4523916629661691236L;
    }
}
