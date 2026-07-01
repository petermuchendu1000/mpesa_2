package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;

public final class SplashViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static final byte[] $$a = {41, -64, -63, -4};
    private static final int $$b = 247;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ShareDataUIState = 1;
    private static char[] component1;
    static SplashViewModel component2;
    private static int copydefault;
    public static String lazyClassKeyName;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r5, short r6, byte r7) {
        /*
            int r5 = r5 * 3
            int r0 = 1 - r5
            int r6 = r6 + 4
            int r7 = r7 + 110
            byte[] r1 = com.huawei.digitalpayment.consumer.basicUi.viewmodel.SplashViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L14
            r3 = r5
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            int r6 = r6 + 1
            r3 = r1[r6]
        L26:
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basicUi.viewmodel.SplashViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(short, short, byte):java.lang.String");
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = component1;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 83;
                $11 = i9 % 128;
                if (i9 % i2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(657 - (ViewConfiguration.getTouchSlop() >> 8), 14 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (65118 - View.resolveSizeAndState(0, 0, 0)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i8--;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i8])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(656 - Process.getGidForName(""), Gravity.getAbsoluteGravity(0, 0) + 14, (char) (65119 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i8++;
                }
                i2 = 2;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            int i10 = $11 + 55;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i5];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i12 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4502 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 36, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 27896), -1464227204, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                    int i13 = $11 + 121;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                } else {
                    int i15 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr5 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(3581 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 28 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) TextUtils.getOffsetAfter("", 0), 1180380354, false, $$c(b4, b5, (byte) (b5 & 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr6 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault5 == null) {
                    byte b6 = (byte) 0;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarSize() >> 8) + 1859, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 34, (char) (Process.myTid() >> 22), 80302927, false, $$c(b6, (byte) (b6 - 1), (byte) $$a.length), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i16 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i16, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i16);
        }
        if (z) {
            char[] cArr6 = new char[i5];
            loop2: while (true) {
                iTrustedWebActivityService_Parcel.copydefault = 0;
                while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                    int i17 = $10 + 123;
                    $11 = i17 % 128;
                    if (i17 % 2 == 0) {
                        break;
                    }
                    cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i5 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                    iTrustedWebActivityService_Parcel.copydefault++;
                }
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i5 >>> iTrustedWebActivityService_Parcel.copydefault) + 1];
                int i18 = iTrustedWebActivityService_Parcel.copydefault;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i19 = $11 + 3;
            $10 = i19 % 128;
            int i20 = i19 % 2;
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                int i21 = $11 + 73;
                $10 = i21 % 128;
                if (i21 % 2 != 0) {
                    cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] / iArr[3]);
                    i = iTrustedWebActivityService_Parcel.copydefault % 1;
                } else {
                    cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                    i = iTrustedWebActivityService_Parcel.copydefault + 1;
                }
                iTrustedWebActivityService_Parcel.copydefault = i;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static {
        copydefault = 0;
        copydefault();
        Object[] objArr = new Object[1];
        a(new int[]{0, 68, 166, 11}, false, new byte[]{1, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = ShareDataUIState + 71;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    static void copydefault() {
        component1 = new char[]{33363, 33740, 33754, 33754, 33746, 33739, 33751, 33755, 33744, 33749, 33745, 33746, 33744, 33739, 33324, 33326, 33739, 33742, 33741, 33739, 33746, 33326, 33328, 33747, 33745, 33745, 33739, 33743, 33747, 33739, 33745, 33740, 33734, 33744, 33744, 33736, 33320, 33329, 33744, 33739, 33737, 33733, 33736, 33744, 33742, 33321, 33329, 33752, 33743, 33739, 33747, 33757, 33754, 33326, 33319, 33738, 33746, 33739, 33735, 33739, 33744, 33749, 33745, 33324, 33337, 33752, 33739, 33747};
    }
}
