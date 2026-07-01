package com.huawei.digitalpayment.consumer.sfcui.profile.viewmodel;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.notify;

public final class BiometricsViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static long component1;
    private static int component3;
    static BiometricsViewModel copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {78, -86, -128, -128};
    private static final int $$b = 178;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, byte r8) {
        /*
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.profile.viewmodel.BiometricsViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r8 = r8 * 2
            int r8 = r8 + 1
            int r7 = r7 * 3
            int r7 = 105 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r7 = r7 + 1
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.viewmodel.BiometricsViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(int, int, byte):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $11 + 13;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = notifyVar.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.getDeadChar(0, 0) + 3266, 33 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 60268), -834797019, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() / (component1 / 5431355972723572778L);
                    Object[] objArr3 = {notifyVar, notifyVar};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(686 - Process.getGidForName(""), 34 - TextUtils.getOffsetAfter("", 0), (char) (60373 - Color.alpha(0)), -1969106284, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = notifyVar.copydefault;
                Object[] objArr4 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3266 - KeyEvent.keyCodeFromString(""), 33 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (MotionEvent.axisFromString("") + 60269), -834797019, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objCopydefault3).invoke(null, objArr4)).longValue() ^ (component1 ^ 5431355972723572778L);
                Object[] objArr5 = {notifyVar, notifyVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(687 - ExpandableListView.getPackedPositionGroup(0L), 35 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 60373), -1969106284, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr6 = {notifyVar, notifyVar};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault5 == null) {
                byte b10 = (byte) 0;
                byte b11 = b10;
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(687 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ((byte) KeyEvent.getModifierMetaStateMask()) + 35, (char) (60373 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), -1969106284, false, $$c(b10, b11, b11), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
            int i6 = $11 + 21;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    static {
        component3 = 1;
        component3();
        Object[] objArr = new Object[1];
        a(27509 - (ViewConfiguration.getScrollDefaultDelay() >> 16), new char[]{63989, 37516, 12049, 48103, 21546, 57514, 32073, 2514, 41563, 16098, 52010, 26613, 61571, 36096, 6553, 45625, 20135, 56127, 30684, 'X', 40139, 10594, 50685, 24187, 60186, 34773, 4119, 44206, 14644, 54692, 28245, 64208, 38739, 9201, 48178, 18714, 58756, 32284, 2749, 42796, 13296, 52315, 22742, 62814, 33260, 6766, 46844, 17288, 56392, 26757, 1317, 37308, 10789, 50882, 21335, 61393, 30827, 5367, 41274, 14883, 54931, 25368, 65453, 34872, 9378, 45393, 19925, 58986, 29425, 3913, 38913, 13440, 49417, 23942, 63019, 33461, 8015, 43979}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component2 + 125;
        component3 = i % 128;
        int i2 = i % 2;
    }

    static void component3() {
        component1 = 1607922313787701692L;
    }
}
