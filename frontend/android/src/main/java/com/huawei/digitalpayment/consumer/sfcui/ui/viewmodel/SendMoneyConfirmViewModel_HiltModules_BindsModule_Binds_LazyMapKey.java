package com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel;

import android.graphics.Color;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;

public final class SendMoneyConfirmViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static int ShareDataUIState;
    static SendMoneyConfirmViewModel component1;
    private static char[] component3;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {93, -40, 95, -94};
    private static final int $$b = 142;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copydefault = 0;

    private static String $$c(short s, byte b2, byte b3) {
        int i = s * 4;
        int i2 = b3 + 110;
        int i3 = b2 + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i];
        int i4 = 0 - i;
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i2 = (-i3) + i4;
            i3 = i3;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i2;
            int i7 = i3 + 1;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            i5 = i6;
            i2 = (-bArr[i7]) + i2;
            i3 = i7;
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = component3;
        char c2 = '0';
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(657 - Color.blue(0), 13 - TextUtils.indexOf("", c2), (char) (Gravity.getAbsoluteGravity(0, 0) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i6++;
                    c2 = '0';
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
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            int i7 = $10 + 5;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            char[] cArr4 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            int i9 = $11 + 3;
            $10 = i9 % 128;
            int i10 = 2;
            int i11 = i9 % 2;
            char c3 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                int i12 = $11 + 31;
                $10 = i12 % 128;
                if (i12 % i10 == 0 ? bArr[iTrustedWebActivityService_Parcel.copydefault] != 1 : bArr[iTrustedWebActivityService_Parcel.copydefault] != 1) {
                    int i13 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr3 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c3)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3580, 28 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 1180380354, false, $$c(b2, b3, (byte) (b3 & 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                } else {
                    int i14 = $11 + 17;
                    $10 = i14 % 128;
                    if (i14 % 2 != 0) {
                        int i15 = iTrustedWebActivityService_Parcel.copydefault;
                        Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c3)};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 - 1);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.makeMeasureSpec(0, 0) + 4502, 36 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (KeyEvent.getDeadChar(0, 0) + 27897), -1464227204, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i15] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                        throw null;
                    }
                    int i16 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr5 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c3)};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 - 1);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(4502 - (ViewConfiguration.getTapTimeout() >> 16), 36 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (27897 - Gravity.getAbsoluteGravity(0, 0)), -1464227204, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i16] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                }
                c3 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr6 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault5 == null) {
                    byte b8 = (byte) 0;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1859 - TextUtils.indexOf("", ""), 34 - (ViewConfiguration.getTapTimeout() >> 16), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 80302927, false, $$c(b8, (byte) (b8 - 1), (byte) $$a.length), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
                i10 = 2;
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i17 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i17, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i17);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i3 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            int i18 = $10 + 5;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static {
        ShareDataUIState = 1;
        component3();
        Object[] objArr = new Object[1];
        a(new int[]{0, 79, 0, 62}, true, new byte[]{1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = copydefault + 15;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    static void component3() {
        component3 = new char[]{33517, 33462, 33457, 33409, 33415, 33462, 33462, 33411, 33439, 33426, 33463, 33467, 33462, 33457, 33453, 33457, 33464, 33456, 33421, 33428, 33456, 33422, 33428, 33456, 33459, 33467, 33459, 33423, 33423, 33460, 33462, 33454, 33451, 33455, 33457, 33462, 33431, 33422, 33454, 33462, 33462, 33452, 33458, 33463, 33457, 33465, 33461, 33457, 33463, 33463, 33465, 33430, 33428, 33464, 33457, 33459, 33460, 33457, 33428, 33426, 33457, 33462, 33464, 33463, 33467, 33462, 33409, 33469, 33457, 33464, 33408, 33470, 33456, 33458, 33464, 33461, 33457, 33414, 33409};
    }
}
