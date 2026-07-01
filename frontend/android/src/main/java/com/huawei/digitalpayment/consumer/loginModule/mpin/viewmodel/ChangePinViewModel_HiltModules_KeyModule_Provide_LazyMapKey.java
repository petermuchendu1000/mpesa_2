package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import android.graphics.Color;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;

public final class ChangePinViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    static ChangePinViewModel ShareDataUIState;
    private static char[] component2;
    private static int copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {79, -7, -1, -17};
    private static final int $$b = 92;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, int r7, byte r8) {
        /*
            int r6 = r6 + 4
            int r8 = r8 + 110
            int r7 = r7 * 3
            int r0 = 1 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ChangePinViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L15
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ChangePinViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(byte, int, byte):java.lang.String");
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = 0;
        int i4 = iArr[0];
        byte b2 = 1;
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = component2;
        if (cArr != null) {
            int i8 = $11 + 115;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i10])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(657 - Color.blue(0), 14 - TextUtils.indexOf("", ""), (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i10] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i10++;
                    int i11 = $11 + 59;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
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
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            int i13 = $10 + 105;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr4 = new char[i5];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == b2) {
                    int i15 = iTrustedWebActivityService_Parcel.copydefault;
                    char c3 = cArr3[iTrustedWebActivityService_Parcel.copydefault];
                    try {
                        Object[] objArr3 = new Object[2];
                        objArr3[b2] = Integer.valueOf(c2);
                        objArr3[i3] = Integer.valueOf(c3);
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                        if (objCopydefault2 == null) {
                            int iCombineMeasuredStates = View.combineMeasuredStates(i3, i3) + 4502;
                            int i16 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 35;
                            char c4 = (char) ((TypedValue.complexToFloat(i3) > 0.0f ? 1 : (TypedValue.complexToFloat(i3) == 0.0f ? 0 : -1)) + 27897);
                            byte b3 = $$a[2];
                            byte b4 = (byte) (b3 + 1);
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iCombineMeasuredStates, i16, c4, -1464227204, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i15] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i17 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault3 == null) {
                        int scrollBarFadeDuration = 3580 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 28;
                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                        byte b5 = $$a[2];
                        byte b6 = (byte) (b5 + 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(scrollBarFadeDuration, keyRepeatDelay, cKeyCodeFromString, 1180380354, false, $$c(b5, b6, (byte) (b6 + 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i17] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1859;
                    int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 34;
                    char keyRepeatDelay2 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    byte[] bArr2 = $$a;
                    byte b7 = bArr2[2];
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(absoluteGravity, iIndexOf, keyRepeatDelay2, 80302927, false, $$c(b7, (byte) (b7 + 1), (byte) bArr2.length), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                i3 = 0;
                b2 = 1;
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            int i18 = $11 + 109;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            char[] cArr5 = new char[i5];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i20 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i20, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i20);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            while (true) {
                iTrustedWebActivityService_Parcel.copydefault = i;
                if (iTrustedWebActivityService_Parcel.copydefault >= i5) {
                    break;
                }
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i5 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                i = iTrustedWebActivityService_Parcel.copydefault + 1;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i21 = $11 + 9;
            $10 = i21 % 128;
            int i22 = i21 % 2;
            int i23 = 0;
            while (true) {
                iTrustedWebActivityService_Parcel.copydefault = i23;
                if (iTrustedWebActivityService_Parcel.copydefault >= i5) {
                    break;
                }
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                i23 = iTrustedWebActivityService_Parcel.copydefault + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static {
        copydefault = 0;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(new int[]{0, 80, 0, 41}, false, new byte[]{0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component1 + 101;
        copydefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 5 / 0;
        }
    }

    static void ShareDataUIState() {
        component2 = new char[]{33512, 33410, 33409, 33462, 33459, 33455, 33463, 33430, 33426, 33457, 33459, 33460, 33425, 33421, 33456, 33464, 33457, 33453, 33457, 33462, 33467, 33463, 33426, 33511, 33418, 33467, 33464, 33461, 33465, 33413, 33411, 33460, 33469, 33408, 33464, 33457, 33469, 33409, 33462, 33467, 33463, 33464, 33462, 33457, 33426, 33428, 33457, 33460, 33459, 33457, 33464, 33428, 33430, 33465, 33463, 33463, 33457, 33461, 33465, 33457, 33463, 33458, 33452, 33462, 33462, 33454, 33422, 33431, 33462, 33457, 33455, 33451, 33454, 33462, 33460, 33423, 33426, 33458, 33460, 33463};
    }
}
