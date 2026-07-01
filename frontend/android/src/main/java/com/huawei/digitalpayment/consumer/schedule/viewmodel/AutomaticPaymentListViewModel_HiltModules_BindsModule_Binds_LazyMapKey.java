package com.huawei.digitalpayment.consumer.schedule.viewmodel;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;

public final class AutomaticPaymentListViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static int ShareDataUIState;
    private static boolean component1;
    private static char[] component2;
    static AutomaticPaymentListViewModel component3;
    private static int copy;
    private static boolean copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {40, 108, -113, 75};
    private static final int $$b = 24;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getRequestBeneficiariesState = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, short r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.schedule.viewmodel.AutomaticPaymentListViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r6 = r6 * 2
            int r1 = 1 - r6
            int r7 = r7 + 4
            int r8 = r8 * 5
            int r8 = 73 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            r3 = -1
            if (r0 != 0) goto L17
            r4 = r6
            r8 = r7
            goto L2b
        L17:
            r5 = r8
            r8 = r7
            r7 = r5
        L1a:
            int r3 = r3 + 1
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L29:
            r4 = r0[r8]
        L2b:
            int r7 = r7 + r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.schedule.viewmodel.AutomaticPaymentListViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, int, short):java.lang.String");
    }

    private static void a(int i, int[] iArr, byte[] bArr, char[] cArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr3 = component2;
        int i4 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 101;
                $10 = i6 % 128;
                int i7 = i6 % i2;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i4] = Integer.valueOf(cArr3[i5]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i4;
                        byte b3 = (byte) (b2 - 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3759 - MotionEvent.axisFromString(""), 24 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (TypedValue.complexToFraction(i4, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i4, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1670574543, false, $$c(b2, b3, (byte) (-b3)), new Class[]{Integer.TYPE});
                    }
                    cArr4[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i5++;
                    int i8 = $11 + 93;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    i2 = 2;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(ShareDataUIState)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getSize(0) + 7140, 13 - TextUtils.getOffsetBefore("", 0), (char) TextUtils.getTrimmedLength(""), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i10 = 689978476;
        if (component1) {
            cancelVar.component1 = bArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            int i11 = $11 + 19;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            while (cancelVar.component3 < cancelVar.component1) {
                int i13 = $10 + 125;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                cArr5[cancelVar.component3] = (char) (cArr3[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr4 = {cancelVar, cancelVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i10);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2748 - TextUtils.indexOf("", ""), 20 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (7643 - TextUtils.indexOf((CharSequence) "", '0')), -327556343, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                i10 = 689978476;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (copydefault) {
            int i15 = $11 + 79;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                cancelVar.component1 = cArr.length;
                cArr2 = new char[cancelVar.component1];
                cancelVar.component3 = 1;
            } else {
                cancelVar.component1 = cArr.length;
                cArr2 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
            }
            while (cancelVar.component3 < cancelVar.component1) {
                cArr2[cancelVar.component3] = (char) (cArr3[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2748 - (ViewConfiguration.getScrollDefaultDelay() >> 16), KeyEvent.getDeadChar(0, 0) + 19, (char) (7644 - View.combineMeasuredStates(0, 0)), -327556343, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr2);
            return;
        }
        int i16 = 0;
        cancelVar.component1 = iArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        while (true) {
            cancelVar.component3 = i16;
            if (cancelVar.component3 >= cancelVar.component1) {
                objArr[0] = new String(cArr6);
                return;
            } else {
                cArr6[cancelVar.component3] = (char) (cArr3[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                i16 = cancelVar.component3 + 1;
            }
        }
    }

    static {
        copy = 0;
        component1();
        Object[] objArr = new Object[1];
        a(128 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), null, new byte[]{-114, -119, -117, -126, -103, -120, -119, -118, -104, -115, -110, -118, -105, -115, -111, -119, -125, -112, -121, -106, -127, -118, -115, -121, -125, -126, -115, -122, -107, -124, -114, -119, -117, -126, -125, -120, -119, -118, -108, -124, -119, -114, -122, -117, -119, -123, -127, -110, -124, -109, -119, -125, -122, -110, -111, -126, -127, -124, -115, -111, -119, -125, -112, -121, -113, -114, -121, -115, -118, -116, -118, -117, -124, -118, -119, -120, -121, -122, -123, -124, -125, -126, -127}, null, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = getRequestBeneficiariesState + 69;
        copy = i % 128;
        if (i % 2 != 0) {
            int i2 = 61 / 0;
        }
    }

    static void component1() {
        component2 = new char[]{30403, 30263, 30261, 30452, 30270, 30253, 30401, 30255, 30269, 30265, 30402, 30271, 30258, 30266, 30262, 30249, 30260, 30259, 30256, 30252, 30433, 30422, 30426, 30412, 30421};
        ShareDataUIState = 321287846;
        copydefault = true;
        component1 = true;
    }
}
