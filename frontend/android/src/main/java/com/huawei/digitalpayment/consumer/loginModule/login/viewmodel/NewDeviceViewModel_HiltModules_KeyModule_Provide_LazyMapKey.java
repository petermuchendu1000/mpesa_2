package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;

public final class NewDeviceViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    static NewDeviceViewModel ShareDataUIState;
    private static boolean component1;
    private static int component2;
    private static char[] component3;
    private static boolean copydefault;
    private static int equals;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {7, 80, 121, 38};
    private static final int $$b = 75;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getRequestBeneficiariesState = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, byte r7, short r8) {
        /*
            int r7 = r7 + 4
            int r8 = r8 * 3
            int r8 = 1 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.login.viewmodel.NewDeviceViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r6 = r6 * 5
            int r6 = 73 - r6
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r7]
        L26:
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.login.viewmodel.NewDeviceViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(byte, byte, short):java.lang.String");
    }

    private static void a(int i, int[] iArr, byte[] bArr, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        char[] cArr2;
        int i3 = 2;
        int i4 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr3 = component3;
        int i5 = 1;
        int i6 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 77;
                $10 = i8 % 128;
                if (i8 % i3 != 0) {
                    try {
                        Object[] objArr2 = new Object[i5];
                        objArr2[i6] = Integer.valueOf(cArr3[i7]);
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                        if (objCopydefault == null) {
                            int iMyPid = 3760 - (Process.myPid() >> 22);
                            int iAlpha = Color.alpha(i6) + 24;
                            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                            byte b2 = (byte) ($$b & 5);
                            byte b3 = (byte) (-b2);
                            String str$$c = $$c(b2, b3, (byte) (b3 + 1));
                            Class[] clsArr = new Class[i5];
                            clsArr[0] = Integer.TYPE;
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iMyPid, iAlpha, touchSlop, -1670574543, false, str$$c, clsArr);
                        }
                        cArr4[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = new Object[i5];
                    objArr3[0] = Integer.valueOf(cArr3[i7]);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault2 == null) {
                        int iMakeMeasureSpec = 3760 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24;
                        char touchSlop2 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                        byte b4 = (byte) ($$b & 5);
                        byte b5 = (byte) (-b4);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iMakeMeasureSpec, scrollBarFadeDuration, touchSlop2, -1670574543, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr4[i7] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i7++;
                }
                int i9 = $10 + 73;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                i3 = 2;
                i5 = 1;
                i6 = 0;
            }
            cArr3 = cArr4;
        }
        try {
            Object[] objArr4 = {Integer.valueOf(component2)};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.argb(0, 0, 0, 0) + 7140, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12, (char) (ViewConfiguration.getLongPressTimeout() >> 16), 1487437377, false, "C", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
            if (component1) {
                int i11 = $11 + 73;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                cancelVar.component1 = bArr.length;
                char[] cArr5 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr5[cancelVar.component3] = (char) (cArr3[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                    Object[] objArr5 = {cancelVar, cancelVar};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 - 1);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2748 - KeyEvent.keyCodeFromString(""), (ViewConfiguration.getPressedStateDuration() >> 16) + 19, (char) (7644 - TextUtils.getOffsetBefore("", 0)), -327556343, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr5);
                return;
            }
            if (copydefault) {
                int i13 = $10 + 5;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
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
                    cArr2[cancelVar.component3] = (char) (cArr3[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    Object[] objArr6 = {cancelVar, cancelVar};
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault5 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 - 1);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2748 - View.MeasureSpec.getMode(0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 18, (char) (7645 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), -327556343, false, $$c(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault5).invoke(null, objArr6);
                }
                String str = new String(cArr2);
                int i14 = $10 + 103;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                objArr[0] = str;
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
                }
                int i17 = $10 + 11;
                $11 = i17 % 128;
                if (i17 % 2 == 0) {
                    cArr6[cancelVar.component3] = (char) (cArr3[iArr[(cancelVar.component1 << 1) + cancelVar.component3] >>> i] >> iIntValue);
                    i16 = cancelVar.component3 - 1;
                } else {
                    cArr6[cancelVar.component3] = (char) (cArr3[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    i16 = cancelVar.component3 + 1;
                }
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static {
        equals = 1;
        component2();
        Object[] objArr = new Object[1];
        a(127 - Color.alpha(0), null, new byte[]{-114, -119, -117, -126, -108, -120, -119, -118, -104, -119, -127, -118, -107, -119, -105, -120, -119, -106, -124, -114, -119, -117, -126, -125, -120, -119, -118, -107, -124, -111, -118, -116, -126, -114, -124, -119, -114, -122, -117, -126, -108, -111, -118, -116, -126, -114, -124, -109, -119, -125, -122, -110, -111, -126, -127, -124, -115, -111, -119, -125, -112, -121, -113, -114, -121, -115, -118, -116, -118, -117, -124, -118, -119, -120, -121, -122, -123, -124, -125, -126, -127}, null, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = getRequestBeneficiariesState + 5;
        equals = i % 128;
        if (i % 2 == 0) {
            int i2 = 90 / 0;
        }
    }

    static void component2() {
        component3 = new char[]{30224, 30212, 30218, 30405, 30223, 30210, 30230, 30332, 30226, 30222, 30227, 30220, 30211, 30219, 30215, 30334, 30213, 30208, 30209, 30250, 30333, 30245, 30259, 30237};
        component2 = 321287927;
        copydefault = true;
        component1 = true;
    }
}
