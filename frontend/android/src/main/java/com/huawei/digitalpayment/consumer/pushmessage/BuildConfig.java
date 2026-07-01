package com.huawei.digitalpayment.consumer.pushmessage;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;

public final class BuildConfig {
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String LIBRARY_PACKAGE_NAME;
    private static boolean ShareDataUIState;
    private static boolean component1;
    private static int component2;
    private static int component3;
    private static char[] copydefault;
    private static final byte[] $$a = {125, 44, 8, -98};
    private static final int $$b = 110;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component4 = 1;

    private static String $$c(byte b2, byte b3, short s) {
        byte[] bArr = $$a;
        int i = s * 2;
        int i2 = (b3 * 5) + 68;
        int i3 = 3 - (b2 * 4);
        byte[] bArr2 = new byte[i + 1];
        int i4 = -1;
        if (bArr == null) {
            i4 = -1;
            i2 = (-i3) + i;
            i3 = i3;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i2;
            if (i5 == i) {
                return new String(bArr2, 0);
            }
            int i6 = i3 + 1;
            i4 = i5;
            i2 = (-bArr[i6]) + i2;
            i3 = i6;
        }
    }

    private static void a(int i, int[] iArr, byte[] bArr, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        char[] cArr2;
        int length;
        char[] cArr3;
        int i3;
        int i4 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr4 = copydefault;
        char c2 = '0';
        int i5 = 0;
        if (cArr4 != null) {
            int i6 = $11 + 83;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length = cArr4.length;
                cArr3 = new char[length];
                i3 = 1;
            } else {
                length = cArr4.length;
                cArr3 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i5] = Integer.valueOf(cArr4[i3]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i5;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3760 - KeyEvent.getDeadChar(i5, i5), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 23, (char) (TextUtils.lastIndexOf("", c2) + 1), -1670574543, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i3++;
                    c2 = '0';
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i7 = $11 + 123;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr4 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(component3)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getPressedStateDuration() >> 16) + 7140, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        if (!(!component1)) {
            cancelVar.component1 = bArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            int i9 = $11 + 47;
            $10 = i9 % 128;
            while (true) {
                int i10 = i9 % 2;
                if (cancelVar.component3 >= cancelVar.component1) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                cArr5[cancelVar.component3] = (char) (cArr4[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr4 = {cancelVar, cancelVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0) + 2749, TextUtils.indexOf("", "", 0) + 19, (char) (7644 - ExpandableListView.getPackedPositionType(0L)), -327556343, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                i9 = $10 + 31;
                $11 = i9 % 128;
            }
        } else {
            if (ShareDataUIState) {
                int i11 = $10 + 61;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    cancelVar.component1 = cArr.length;
                    cArr2 = new char[cancelVar.component1];
                    i2 = 0;
                } else {
                    i2 = 0;
                    cancelVar.component1 = cArr.length;
                    cArr2 = new char[cancelVar.component1];
                }
                cancelVar.component3 = i2;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr2[cancelVar.component3] = (char) (cArr4[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    Object[] objArr5 = {cancelVar, cancelVar};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 1);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollDefaultDelay() >> 16) + 2748, 19 - Color.alpha(0), (char) (7643 - ((byte) KeyEvent.getModifierMetaStateMask())), -327556343, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr2);
                return;
            }
            int i12 = 0;
            cancelVar.component1 = iArr.length;
            char[] cArr6 = new char[cancelVar.component1];
            while (true) {
                cancelVar.component3 = i12;
                if (cancelVar.component3 >= cancelVar.component1) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[cancelVar.component3] = (char) (cArr4[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    i12 = cancelVar.component3 + 1;
                }
            }
        }
    }

    static {
        component2 = 0;
        component1();
        Object[] objArr = new Object[1];
        a(Process.getGidForName("") + 128, null, new byte[]{-119, -116, -121, -110, -110, -119, -125, -123, -110, -122, -113, -124, -109, -119, -125, -122, -110, -111, -126, -127, -124, -115, -111, -119, -125, -112, -121, -113, -114, -121, -115, -118, -116, -118, -117, -124, -118, -119, -120, -121, -122, -123, -124, -125, -126, -127}, null, objArr);
        LIBRARY_PACKAGE_NAME = ((String) objArr[0]).intern();
        int i = component4 + 13;
        component2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void component1() {
        copydefault = new char[]{30291, 30279, 30277, 30212, 30286, 30653, 30289, 30655, 30285, 30281, 30290, 30287, 30274, 30282, 30278, 30649, 30276, 30275, 30272};
        component3 = 321287734;
        ShareDataUIState = true;
        component1 = true;
    }
}
