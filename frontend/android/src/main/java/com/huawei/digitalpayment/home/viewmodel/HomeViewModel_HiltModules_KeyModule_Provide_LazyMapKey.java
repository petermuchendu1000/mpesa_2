package com.huawei.digitalpayment.home.viewmodel;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;

public final class HomeViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static boolean ShareDataUIState;
    private static char[] component1;
    private static boolean component2;
    static HomeViewModel component3;
    private static int copydefault;
    private static int getAsAtTimestamp;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {102, Ascii.GS, -34, 39};
    private static final int $$b = 207;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getRequestBeneficiariesState = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, short r7, int r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.home.viewmodel.HomeViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r6 = r6 + 4
            int r8 = r8 * 5
            int r8 = 73 - r8
            int r7 = r7 * 4
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.viewmodel.HomeViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(int, short, int):java.lang.String");
    }

    private static void a(int i, int[] iArr, byte[] bArr, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = component1;
        int i4 = -1;
        int i5 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = $11 + 47;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 3 / 5;
            }
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 47;
                $11 = i9 % 128;
                if (i9 % i2 == 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i5] = Integer.valueOf(cArr2[i8]);
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                        if (objCopydefault == null) {
                            byte b2 = (byte) i4;
                            byte b3 = (byte) (b2 + 1);
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3760 - TextUtils.getOffsetAfter("", i5), 24 - (KeyEvent.getMaxKeyCode() >> 16), (char) ((-1) - MotionEvent.axisFromString("")), -1670574543, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i8] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i8])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                        if (objCopydefault2 == null) {
                            byte b4 = (byte) (-1);
                            byte b5 = (byte) (b4 + 1);
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getJumpTapTimeout() >> 16) + 3760, (ViewConfiguration.getJumpTapTimeout() >> 16) + 24, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1670574543, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i8] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                        i8++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i2 = 2;
                i4 = -1;
                i5 = 0;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(copydefault)};
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        long j = 0;
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7140 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 13, (char) TextUtils.indexOf("", "", 0), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
        if (!(!ShareDataUIState)) {
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i10 = $11 + 83;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 + 1) / cancelVar.component3] + i] / iIntValue);
                    Object[] objArr5 = {cancelVar, cancelVar};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault4 == null) {
                        byte b6 = (byte) (-1);
                        byte b7 = (byte) (b6 + 1);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2749, ExpandableListView.getPackedPositionType(0L) + 19, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 7645), -327556343, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                } else {
                    cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                    Object[] objArr6 = {cancelVar, cancelVar};
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault5 == null) {
                        byte b8 = (byte) (-1);
                        byte b9 = (byte) (b8 + 1);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2747, TextUtils.indexOf("", "") + 19, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7644), -327556343, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault5).invoke(null, objArr6);
                }
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (component2) {
            cancelVar.component1 = cArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i11 = $10 + 73;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    cArr5[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 >>> 1) / cancelVar.component3] - i] / iIntValue);
                    Object[] objArr7 = {cancelVar, cancelVar};
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault6 == null) {
                        byte b10 = (byte) (-1);
                        byte b11 = (byte) (b10 + 1);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2748, Color.blue(0) + 19, (char) (7644 - (ViewConfiguration.getFadingEdgeLength() >> 16)), -327556343, false, $$c(b10, b11, b11), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault6).invoke(null, objArr7);
                } else {
                    cArr5[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    Object[] objArr8 = {cancelVar, cancelVar};
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault7 == null) {
                        byte b12 = (byte) (-1);
                        byte b13 = (byte) (b12 + 1);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(2747 - Process.getGidForName(""), 20 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)), (char) (Gravity.getAbsoluteGravity(0, 0) + 7644), -327556343, false, $$c(b12, b13, b13), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault7).invoke(null, objArr8);
                    j = 0;
                }
            }
            objArr[0] = new String(cArr5);
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
                cArr6[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                i12 = cancelVar.component3 + 1;
            }
        }
    }

    static {
        getAsAtTimestamp = 1;
        component2();
        Object[] objArr = new Object[1];
        a(127 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), null, new byte[]{-114, -119, -117, -126, -107, -120, -119, -118, -108, -119, -125, -126, -109, -124, -114, -119, -117, -126, -125, -120, -119, -118, -110, -124, -119, -125, -126, -123, -124, -115, -111, -119, -125, -112, -121, -113, -114, -121, -115, -118, -116, -118, -117, -124, -118, -119, -120, -121, -122, -123, -124, -125, -126, -127}, null, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = getRequestBeneficiariesState + 113;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    static void component2() {
        component1 = new char[]{30219, 30335, 30333, 30268, 30214, 30325, 30217, 30327, 30213, 30209, 30218, 30215, 30330, 30210, 30334, 30321, 30332, 30324, 30246, 30228, 30237};
        copydefault = 321287918;
        component2 = true;
        ShareDataUIState = true;
    }
}
