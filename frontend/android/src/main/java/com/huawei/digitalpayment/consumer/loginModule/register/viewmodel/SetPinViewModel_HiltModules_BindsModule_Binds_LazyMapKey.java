package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelNotification;

public final class SetPinViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    static SetPinViewModel ShareDataUIState;
    private static char[] component1;
    private static long component2;
    private static int component3;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {Ascii.VT, -55, -20, -91};
    private static final int $$b = 114;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copydefault = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r7, byte r8, int r9) {
        /*
            int r9 = r9 * 2
            int r9 = r9 + 1
            byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.SetPinViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r8 = 122 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r4 = r2
            goto L27
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            r3 = r0[r7]
            r6 = r3
            r3 = r8
            r8 = r6
        L27:
            int r8 = -r8
            int r7 = r7 + 1
            int r8 = r8 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.SetPinViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(short, byte, int):java.lang.String");
    }

    private static void a(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i5 = $11 + 65;
            $10 = i5 % 128;
            if (i5 % i3 != 0) {
                int i6 = cancelnotification.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(component1[i + i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1757 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 34, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 1159210934, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(component2), Integer.valueOf(c2)};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                        if (objCopydefault2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 + 5);
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetBefore("", 0) + 3608, 29 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 7171), 1951385784, false, $$c(b4, b5, (byte) (b5 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i6] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {cancelnotification, cancelnotification};
                            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                            if (objCopydefault3 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4013 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 23 - MotionEvent.axisFromString(""), (char) (27761 - View.resolveSize(0, 0)), -1529629956, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objCopydefault3).invoke(null, objArr4);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } else {
                int i7 = cancelnotification.copydefault;
                Object[] objArr5 = {Integer.valueOf(component1[i + i7])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 + 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1758 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), ExpandableListView.getPackedPositionChild(0L) + 35, (char) KeyEvent.normalizeMetaState(0), 1159210934, false, $$c(b8, b9, (byte) (b9 - 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objCopydefault4).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(component2), Integer.valueOf(c2)};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault5 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 + 5);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(3608 - (ViewConfiguration.getTouchSlop() >> 8), 29 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 7171), 1951385784, false, $$c(b10, b11, (byte) (b11 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objCopydefault5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {cancelnotification, cancelnotification};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault6 == null) {
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(4012 - ((byte) KeyEvent.getModifierMetaStateMask()), 24 - Color.alpha(0), (char) (27762 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), -1529629956, false, $$c(b12, b13, b13), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault6).invoke(null, objArr7);
            }
            i3 = 2;
        }
        char[] cArr = new char[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i8 = $10 + 125;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr8 = {cancelnotification, cancelnotification};
            Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault7 == null) {
                byte b14 = (byte) 0;
                byte b15 = b14;
                objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.keyCodeFromString("") + 4013, MotionEvent.axisFromString("") + 25, (char) (27760 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), -1529629956, false, $$c(b14, b15, b15), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    static {
        component3 = 1;
        component3();
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 81, (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 18994), objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = copydefault + 49;
        component3 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component3() {
        component1 = new char[]{17959, 40907, 62953, 52170, 8620, 1873, 23909, 45843, 35105, 61133, 50346, 6784, 28845, 22083, 44141, 33296, 55333, 12744, 6132, 28037, 17341, 39241, 65377, 54538, 11056, 138, 26343, 48267, 37546, 59479, 52849, 9225, 31265, 21462, 43434, 36744, 58795, 15171, 4461, 30474, 19721, 41675, 63712, 56977, 13480, 2625, 24618, 17942, 39969, 62915, 52205, 8599, 1968, 23873, 45942, 35146, 61234, 50381, 6881, 28819, 22185, 44107, 33376, 55297, 15912, 6026, 28119, 17281, 39344, 65396, 54637, 11018, 274, 26317, 48353, 37523, 59529, 52811, 9312, 31233, 20520};
        component2 = -1885633960987863658L;
    }
}
