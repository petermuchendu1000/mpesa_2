package com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles;

import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;

public final class SearchBundlesViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static final byte[] $$a = {74, 75, -50, -9};
    private static final int $$b = 100;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ShareDataUIState = 1;
    static SearchBundlesViewModel component2;
    private static char[] component3;
    private static int copydefault;
    public static String lazyClassKeyName;

    private static String $$c(short s, int i, short s2) {
        int i2 = s * 4;
        int i3 = i + 4;
        byte[] bArr = $$a;
        int i4 = 115 - s2;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i4 = (-i4) + i5;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            i3++;
            i4 = (-bArr[i3]) + i4;
            i6 = i7;
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        char c2;
        int i = 2;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = component3;
        char c3 = '0';
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 115;
                $11 = i8 % 128;
                int i9 = i8 % i;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetAfter("", 0) + 657, 13 - ImageFormat.getBitsPerPixel(0), (char) (65117 - TextUtils.indexOf("", c3)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i7++;
                    i = 2;
                    c3 = '0';
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
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            int i10 = $11 + 83;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                cArr = new char[i4];
                iTrustedWebActivityService_Parcel.copydefault = 1;
                c2 = 1;
            } else {
                cArr = new char[i4];
                iTrustedWebActivityService_Parcel.copydefault = 0;
                c2 = 0;
            }
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i11 = $10 + 91;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = iTrustedWebActivityService_Parcel.copydefault;
                        Object[] objArr3 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                        if (objCopydefault2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 - 1);
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollDefaultDelay() >> 16) + 4502, 36 - View.combineMeasuredStates(0, 0), (char) (27945 - AndroidCharacter.getMirror('0')), -1464227204, false, $$c(b2, b3, (byte) (b3 & 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        Object obj = null;
                        cArr[i12] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                        obj.hashCode();
                        throw null;
                    }
                    int i13 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4502 - TextUtils.getOffsetAfter("", 0), 35 - MotionEvent.axisFromString(""), (char) (KeyEvent.keyCodeFromString("") + 27897), -1464227204, false, $$c(b4, b5, (byte) (b5 & 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i13] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                } else {
                    int i14 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr5 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 - 1);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3580, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 28, (char) View.MeasureSpec.makeMeasureSpec(0, 0), 1180380354, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i14] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr6 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault5 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 - 1);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1859, Drawable.resolveOpacity(0, 0) + 34, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 80302927, false, $$c(b8, b9, (byte) (-b9)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
            cArr4 = cArr;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr4, 0, cArr5, 0, i4);
            int i15 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr4, i15, i6);
            System.arraycopy(cArr5, i6, cArr4, 0, i15);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i16 = $10 + 39;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr4[(i4 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr4 = cArr6;
        }
        if (i5 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr4[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr4[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
                int i18 = $10 + 113;
                $11 = i18 % 128;
                int i19 = i18 % 2;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static {
        copydefault = 0;
        copydefault();
        Object[] objArr = new Object[1];
        a(new int[]{0, 88, 0, 30}, true, new byte[]{1, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = ShareDataUIState + 99;
        copydefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void copydefault() {
        component3 = new char[]{33510, 33455, 33457, 33462, 33431, 33422, 33454, 33462, 33462, 33452, 33458, 33463, 33457, 33465, 33461, 33457, 33463, 33463, 33465, 33430, 33428, 33464, 33457, 33459, 33460, 33457, 33428, 33426, 33457, 33462, 33464, 33463, 33467, 33462, 33409, 33469, 33457, 33464, 33408, 33467, 33459, 33463, 33463, 33462, 33454, 33412, 33418, 33466, 33461, 33462, 33468, 33411, 33439, 33423, 33459, 33463, 33463, 33462, 33454, 33460, 33466, 33466, 33461, 33462, 33468, 33459, 33423, 33423, 33459, 33463, 33463, 33462, 33454, 33460, 33458, 33448, 33460, 33431, 33428, 33456, 33459, 33467, 33459, 33423, 33423, 33460, 33462, 33454};
    }
}
