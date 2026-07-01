package com.huawei.digitalpayment.consumer.sfcui.costcalculator;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;

public final class CostCalculatorViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static char[] ShareDataUIState;
    private static int component1;
    static CostCalculatorViewModel copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {35, -27, -128, TarHeader.LF_SYMLINK};
    private static final int $$b = 253;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component3 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, short r7, byte r8) {
        /*
            int r7 = r7 * 3
            int r0 = r7 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r8 = 115 - r8
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r8
            r3 = r2
            r8 = r6
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L1f
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L1f:
            int r3 = r3 + 1
            int r6 = r6 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L28:
            int r4 = -r4
            int r6 = r6 + r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(int, short, byte):java.lang.String");
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
        char[] cArr = ShareDataUIState;
        long j = 0;
        if (cArr != null) {
            int i8 = $11 + 17;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                int i11 = $11 + 57;
                $10 = i11 % 128;
                if (i11 % i2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i10])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(657 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14, (char) ((SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 65117), 1951305196, false, "l", new Class[]{Integer.TYPE});
                        }
                        cArr2[i10] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i10 <<= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i10])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((KeyEvent.getMaxKeyCode() >> 16) + 657, 14 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (KeyEvent.normalizeMetaState(0) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i10] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i10++;
                }
                i2 = 2;
                j = 0;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i12 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault3 == null) {
                        byte b2 = (byte) (-1);
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getCapsMode("", 0, 0) + 4502, TextUtils.indexOf("", "", 0) + 36, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 27897), -1464227204, false, $$c(b2, b3, (byte) (b3 + 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                } else {
                    int i13 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr5 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault4 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "") + 3580, 27 - ImageFormat.getBitsPerPixel(0), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 1180380354, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr6 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault5 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetBefore("", 0) + 1859, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 33, (char) Color.green(0), 80302927, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i14 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i14, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i14);
        }
        if (z) {
            char[] cArr6 = new char[i5];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                int i15 = $11 + 99;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
                    cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i5 % iTrustedWebActivityService_Parcel.copydefault) - 1];
                    i = iTrustedWebActivityService_Parcel.copydefault;
                } else {
                    cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i5 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                    i = iTrustedWebActivityService_Parcel.copydefault + 1;
                }
                iTrustedWebActivityService_Parcel.copydefault = i;
                int i16 = $11 + 109;
                $10 = i16 % 128;
                int i17 = i16 % 2;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i18 = $11 + 107;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static {
        component1 = 1;
        copydefault();
        Object[] objArr = new Object[1];
        a(new int[]{0, 79, 0, 0}, false, new byte[]{1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component3 + 95;
        component1 = i % 128;
        if (i % 2 == 0) {
            int i2 = 32 / 0;
        }
    }

    static void copydefault() {
        ShareDataUIState = new char[]{33518, 33462, 33457, 33426, 33428, 33457, 33460, 33459, 33457, 33464, 33428, 33430, 33465, 33463, 33463, 33457, 33461, 33465, 33457, 33463, 33458, 33452, 33462, 33462, 33454, 33422, 33431, 33462, 33457, 33455, 33451, 33454, 33462, 33460, 33423, 33423, 33459, 33467, 33459, 33456, 33428, 33431, 33462, 33454, 33452, 33460, 33469, 33465, 33464, 33459, 33455, 33465, 33461, 33454, 33455, 33423, 33511, 33414, 33454, 33452, 33412, 33421, 33465, 33464, 33459, 33455, 33465, 33461, 33454, 33455, 33467, 33408, 33464, 33457, 33469, 33409, 33462, 33467, 33463};
    }
}
