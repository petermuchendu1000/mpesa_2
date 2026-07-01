package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;

public final class ResetPinVerifyIdViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static int component1;
    private static char[] component2;
    static ResetPinVerifyIdViewModel component3;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {46, -35, 45, 111};
    private static final int $$b = 49;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copydefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, byte r7, short r8) {
        /*
            int r6 = r6 * 3
            int r6 = 3 - r6
            int r7 = r7 * 3
            int r7 = 1 - r7
            int r8 = r8 + 110
            byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ResetPinVerifyIdViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L27
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            int r6 = r6 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r6]
        L27:
            int r8 = r8 + r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ResetPinVerifyIdViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(short, byte, short):java.lang.String");
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = component2;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = $11 + 93;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.normalizeMetaState(0) + 657, 14 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i10 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr3 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4502 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 36, (char) ((Process.myPid() >> 22) + 27897), -1464227204, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3580 - (ViewConfiguration.getJumpTapTimeout() >> 16), 27 - TextUtils.indexOf((CharSequence) "", '0'), (char) View.MeasureSpec.getSize(0), 1180380354, false, $$c(b4, b5, (byte) (b5 + 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1860 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 34 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) KeyEvent.normalizeMetaState(0), 80302927, false, $$c(b6, b6, (byte) $$a.length), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i12 = $11 + 69;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i14 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i14, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i14);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            int i15 = $11 + 5;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i4 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i17 = $11 + 25;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] * iArr[3]);
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
        component1 = 0;
        copydefault();
        Object[] objArr = new Object[1];
        a(new int[]{0, 87, 135, 0}, true, new byte[]{1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = copydefault + 17;
        component1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void copydefault() {
        component2 = new char[]{33446, 33328, 33332, 33327, 33338, 33334, 33322, 33329, 33337, 33339, 33282, 33335, 33321, 33329, 33323, 33325, 33339, 33334, 33325, 33340, 33334, 33324, 33324, 33324, 33341, 33304, 33291, 33328, 33332, 33327, 33322, 33318, 33322, 33329, 33321, 33286, 33290, 33325, 33324, 33322, 33291, 33295, 33328, 33320, 33324, 33327, 33338, 33339, 33325, 33328, 33325, 33323, 33291, 33288, 33325, 33327, 33319, 33316, 33320, 33322, 33327, 33296, 33287, 33319, 33327, 33327, 33317, 33323, 33328, 33322, 33330, 33326, 33322, 33328, 33328, 33330, 33295, 33293, 33329, 33322, 33324, 33325, 33322, 33293, 33291, 33322, 33327};
    }
}
