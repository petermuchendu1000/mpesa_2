package com.huawei.digitalpayment.consumer.basicUi.pinfree.viewmodel;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.primitives.SignedBytes;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;

public final class ManagePinFreeViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static final byte[] $$a = {SignedBytes.MAX_POWER_OF_TWO, -61, 76, -90};
    private static final int $$b = 87;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 1;
    static ManagePinFreeViewModel component2;
    private static char[] component3;
    private static int copydefault;
    public static String lazyClassKeyName;

    private static String $$c(short s, byte b2, int i) {
        byte[] bArr = $$a;
        int i2 = i + 4;
        int i3 = b2 * 4;
        int i4 = 115 - s;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i4 = (-i4) + i2;
            i6 = -1;
        }
        while (true) {
            int i7 = i2;
            int i8 = i4;
            int i9 = i6 + 1;
            bArr2[i9] = (byte) i8;
            if (i9 == i5) {
                return new String(bArr2, 0);
            }
            int i10 = i7 + 1;
            i2 = i10;
            i4 = (-bArr[i10]) + i8;
            i6 = i9;
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
        Throwable th = null;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = $11 + 1;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            for (int i8 = 0; i8 < length; i8++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(657 - View.MeasureSpec.getSize(0), View.resolveSize(0, 0) + 14, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 65117), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                int i9 = $11 + 77;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i11 = $11 + 77;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = iTrustedWebActivityService_Parcel.copydefault;
                        Object[] objArr3 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                        if (objCopydefault2 == null) {
                            int scrollBarSize = 4502 - (ViewConfiguration.getScrollBarSize() >> 8);
                            int iCombineMeasuredStates = 36 - View.combineMeasuredStates(0, 0);
                            char offsetAfter = (char) (27897 - TextUtils.getOffsetAfter("", 0));
                            byte b2 = (byte) ($$b & 13);
                            byte b3 = (byte) (b2 - 5);
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(scrollBarSize, iCombineMeasuredStates, offsetAfter, -1464227204, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objCopydefault2).invoke(th, objArr3)).charValue();
                        th.hashCode();
                        throw th;
                    }
                    int i13 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault3 == null) {
                        int iIndexOf = 4501 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int iIndexOf2 = 36 - TextUtils.indexOf("", "", 0, 0);
                        char c3 = (char) (27897 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                        byte b4 = (byte) ($$b & 13);
                        byte b5 = (byte) (b4 - 5);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, iIndexOf2, c3, -1464227204, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                    int i14 = $11 + 87;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                } else {
                    int i16 = iTrustedWebActivityService_Parcel.copydefault;
                    try {
                        Object[] objArr5 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                        if (objCopydefault4 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(3580 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.green(0) + 28, (char) KeyEvent.getDeadChar(0, 0), 1180380354, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i16] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                    } catch (Throwable th3) {
                        Throwable cause2 = th3.getCause();
                        if (cause2 == null) {
                            throw th3;
                        }
                        throw cause2;
                    }
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr6 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault5 == null) {
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1860;
                    int iIndexOf3 = TextUtils.indexOf("", "", 0, 0) + 34;
                    char cBlue = (char) Color.blue(0);
                    byte b8 = (byte) ($$b & 1);
                    byte b9 = (byte) (b8 - 1);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf, iIndexOf3, cBlue, 80302927, false, $$c(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
                th = null;
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
            int i18 = $11 + 49;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            char[] cArr6 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i3 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static {
        copydefault = 0;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(new int[]{0, 83, 54, 61}, true, null, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component1 + 25;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    static void ShareDataUIState() {
        component3 = new char[]{33467, 33405, 33348, 33349, 33402, 33404, 33394, 33348, 33344, 33395, 33467, 33348, 33348, 33399, 33347, 33403, 33344, 33401, 33467, 33344, 33364, 33350, 33344, 33398, 33352, 33351, 33467, 33399, 33348, 33404, 33396, 33398, 33403, 33402, 33350, 33467, 33397, 33403, 33348, 33404, 33392, 33352, 33401, 33405, 33352, 33397, 33344, 33346, 33344, 33349, 33467, 33344, 33348, 33394, 33352, 33396, 33345, 33467, 33404, 33402, 33350, 33405, 33348, 33349, 33402, 33372, 33394, 33348, 33344, 33363, 33348, 33348, 33399, 33443, 33403, 33344, 33369, 33348, 33346, 33352, 33403, 33352, 33372};
    }
}
