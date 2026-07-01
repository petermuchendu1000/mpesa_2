package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelNotification;

public final class CheckIdentityViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static long ShareDataUIState;
    static CheckIdentityViewModel component1;
    private static char[] component2;
    private static int copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {113, 46, 90, -12};
    private static final int $$b = 24;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component3 = 0;

    private static String $$c(byte b2, int i, byte b3) {
        int i2 = b2 * 3;
        byte[] bArr = $$a;
        int i3 = b3 + 117;
        int i4 = 3 - (i * 4);
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = i4 + (-i2);
            i4 = i4;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            int i6 = i4 + 1;
            if (i5 == i2) {
                return new String(bArr2, 0);
            }
            i3 += -bArr[i6];
            i4 = i6;
        }
    }

    private static void a(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        int i4 = $10 + 83;
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 % 4;
        }
        while (cancelnotification.copydefault < i2) {
            int i6 = $10 + 5;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(component2[i + i8])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getWindowTouchSlop() >> 8) + 1758, TextUtils.getOffsetAfter("", 0) + 34, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 1159210934, false, $$c(b2, b2, (byte) $$a.length), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(ShareDataUIState), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3607, 28 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (View.resolveSizeAndState(0, 0, 0) + 7171), 1951385784, false, $$c(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4013 - Color.red(0), Gravity.getAbsoluteGravity(0, 0) + 24, (char) (27761 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), -1529629956, false, $$c(b5, b6, (byte) (b6 + 5)), new Class[]{Object.class, Object.class});
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
        int i9 = $11 + 41;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        while (cancelnotification.copydefault < i2) {
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr5 = {cancelnotification, cancelnotification};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault4 == null) {
                byte b7 = (byte) 0;
                byte b8 = b7;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4013, 25 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (27761 - KeyEvent.normalizeMetaState(0)), -1529629956, false, $$c(b7, b8, (byte) (b8 + 5)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    static {
        copydefault = 1;
        component2();
        Object[] objArr = new Object[1];
        a(KeyEvent.getDeadChar(0, 0), 85 - KeyEvent.getDeadChar(0, 0), (char) (5864 - Color.argb(0, 0, 0, 0)), objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component3 + 67;
        copydefault = i % 128;
        if (i % 2 == 0) {
            int i2 = 99 / 0;
        }
    }

    static void component2() {
        component2 = new char[]{6909, 52186, 47269, 26929, 24154, 3900, 65021, 41668, 37795, 16500, 12574, 58915, 54515, 34262, 27309, 23407, 2127, 63785, 45032, 40142, 19899, 12916, 58185, 53293, 34530, 30595, 9379, 5496, 64068, 43826, 39393, 20166, 16283, 60519, 56582, 33299, 28925, 8654, 5781, 51069, 46187, 25874, 19444, 14546, 59798, 56948, 36618, 31767, 8929, 5058, 49297, 45409, 26124, 22287, 1509, 60102, 56193, 34912, 31055, 11795, 7407, 52685, 45786, 25416, 20534, 272, 63467, 42164, 38331, 31341, 11065, 6173, 52978, 49076, 27780, 23934, 524, 62232, 41441, 38572, 18339, 13418, 58684, 51722, 47342};
        ShareDataUIState = -4819249238152848035L;
    }
}
