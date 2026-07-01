package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;

public final class ChangePinOtpViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static char[] ShareDataUIState;
    static ChangePinOtpViewModel component1;
    private static int component2;
    private static boolean component3;
    private static boolean copydefault;
    private static int getAsAtTimestamp;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {105, -91, -115, Ascii.US};
    private static final int $$b = 124;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copy = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, byte r7, short r8) {
        /*
            int r7 = r7 * 4
            int r0 = r7 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ChangePinOtpViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r6 = r6 * 5
            int r6 = 73 - r6
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ChangePinOtpViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(short, byte, short):java.lang.String");
    }

    private static void a(int i, int[] iArr, byte[] bArr, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = ShareDataUIState;
        long j = 0;
        if (cArr2 != null) {
            int i3 = $10 + 83;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (b2 - 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(((byte) KeyEvent.getModifierMetaStateMask()) + 3761, (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 23, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1670574543, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i5++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(component2)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7140 - KeyEvent.keyCodeFromString(""), 13 - View.MeasureSpec.getMode(0), (char) View.MeasureSpec.getSize(0), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i6 = 689978476;
        if (!(!copydefault)) {
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i7 = $10 + 45;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr4 = {cancelVar, cancelVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i6);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2748 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 19, (char) (7643 - Process.getGidForName("")), -327556343, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                i6 = 689978476;
            }
            String str = new String(cArr4);
            int i9 = $10 + 57;
            $11 = i9 % 128;
            if (i9 % 2 != 0) {
                objArr[0] = str;
                return;
            } else {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        if (!component3) {
            cancelVar.component1 = iArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr5[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                cancelVar.component3++;
                int i10 = $11 + 103;
                $10 = i10 % 128;
                int i11 = i10 % 2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i12 = $10 + 39;
        $11 = i12 % 128;
        int i13 = i12 % 2;
        cancelVar.component1 = cArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        cancelVar.component3 = 0;
        while (cancelVar.component3 < cancelVar.component1) {
            int i14 = $11 + 121;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
            Object[] objArr5 = {cancelVar, cancelVar};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
            if (objCopydefault4 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2747, 19 - KeyEvent.keyCodeFromString(""), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 7644), -327556343, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    static {
        getAsAtTimestamp = 1;
        component3();
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getPressedStateDuration() >> 16) + 127, null, new byte[]{-114, -119, -117, -126, -108, -120, -119, -118, -103, -113, -115, -104, -111, -118, -105, -119, -116, -111, -121, -123, -106, -124, -114, -119, -117, -126, -125, -120, -119, -118, -107, -124, -111, -118, -113, -125, -124, -119, -114, -122, -117, -126, -108, -111, -118, -116, -126, -114, -124, -109, -119, -125, -122, -110, -111, -126, -127, -124, -115, -111, -119, -125, -112, -121, -113, -114, -121, -115, -118, -116, -118, -117, -124, -118, -119, -120, -121, -122, -123, -124, -125, -126, -127}, null, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = copy + 111;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    static void component3() {
        ShareDataUIState = new char[]{30619, 30607, 30605, 30284, 30614, 30597, 30617, 30599, 30613, 30609, 30618, 30615, 30602, 30610, 30606, 30593, 30604, 30603, 30600, 30637, 30596, 30651, 30638, 30639, 30628};
        component2 = 321287806;
        component3 = true;
        copydefault = true;
    }
}
