package com.huawei.digitalpayment.checkout.viewmodel;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;

public final class EasyCheckoutViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static final byte[] $$a = {Ascii.SI, 58, -59};
    private static final int $$b = 38;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ShareDataUIState = 0;
    private static char[] component1;
    private static int component2;
    static EasyCheckoutViewModel copydefault;
    public static String lazyClassKeyName;

    private static String $$c(int i, short s, short s2) {
        byte[] bArr = $$a;
        int i2 = 115 - i;
        int i3 = s2 * 2;
        int i4 = s + 3;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            int i6 = i4 + (-i3);
            i4 = i4;
            i2 = i6;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            int i7 = i4 + 1;
            if (i5 == i3) {
                return new String(bArr2, 0);
            }
            i4 = i7;
            i2 += -bArr[i7];
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        int i4 = 1;
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = component1;
        char c2 = '0';
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[i4];
                    objArr2[0] = Integer.valueOf(cArr[i8]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 657, TextUtils.indexOf("", c2, 0, 0) + 15, (char) (65118 - (Process.myTid() >> 22)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i8++;
                    i4 = 1;
                    c2 = '0';
                    j = 0;
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
        System.arraycopy(cArr, i3, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c3 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] != 1) {
                    int i9 = iTrustedWebActivityService_Parcel.copydefault;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c3)};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                        if (objCopydefault2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 - 1);
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.alpha(0) + 3580, ExpandableListView.getPackedPositionGroup(0L) + 28, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 1180380354, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i9] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i10 = $11 + 123;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = iTrustedWebActivityService_Parcel.copydefault;
                        Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c3)};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) (-1);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0) + 4503, 36 - (ViewConfiguration.getTouchSlop() >> 8), (char) (TextUtils.indexOf("", "") + 27897), -1464227204, false, $$c((byte) 5, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                        int i12 = 41 / 0;
                    } else {
                        int i13 = iTrustedWebActivityService_Parcel.copydefault;
                        Object[] objArr5 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c3)};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                        if (objCopydefault4 == null) {
                            byte b5 = (byte) (-1);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionChild(0L) + 4503, 35 - ImageFormat.getBitsPerPixel(0), (char) (27897 - Color.alpha(0)), -1464227204, false, $$c((byte) 5, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                    }
                }
                c3 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr6 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault5 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (-b6);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0, 0) + 1860, (ViewConfiguration.getEdgeSlop() >> 16) + 34, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 80302927, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            int i14 = $10 + 125;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                char[] cArr5 = new char[i5];
                System.arraycopy(cArr3, 1, cArr5, 1, i5);
                System.arraycopy(cArr5, 1, cArr3, i5 % i7, i7);
                System.arraycopy(cArr5, i7, cArr3, 1, i5 - i7);
            } else {
                char[] cArr6 = new char[i5];
                System.arraycopy(cArr3, 0, cArr6, 0, i5);
                int i15 = i5 - i7;
                System.arraycopy(cArr6, 0, cArr3, i15, i7);
                System.arraycopy(cArr6, i7, cArr3, 0, i15);
            }
        }
        if (z) {
            char[] cArr7 = new char[i5];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                int i16 = $10 + 35;
                $11 = i16 % 128;
                if (i16 % 2 == 0) {
                    i = 1;
                    cArr7[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i5 >>> iTrustedWebActivityService_Parcel.copydefault) + 1];
                } else {
                    i = 1;
                    cArr7[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i5 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                }
                iTrustedWebActivityService_Parcel.copydefault += i;
            }
            cArr3 = cArr7;
        }
        if (i6 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            int i17 = $10 + 67;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static {
        component2 = 1;
        component2();
        Object[] objArr = new Object[1];
        a(new int[]{0, 66, 0, 0}, true, new byte[]{0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = ShareDataUIState + 115;
        component2 = i % 128;
        if (i % 2 == 0) {
            int i2 = 26 / 0;
        }
    }

    static void component2() {
        component1 = new char[]{33513, 33463, 33467, 33462, 33409, 33469, 33457, 33464, 33408, 33466, 33451, 33453, 33458, 33464, 33467, 33465, 33418, 33409, 33449, 33461, 33420, 33510, 33426, 33463, 33467, 33462, 33457, 33453, 33457, 33464, 33456, 33421, 33422, 33451, 33453, 33458, 33464, 33467, 33465, 33466, 33431, 33422, 33454, 33462, 33462, 33452, 33458, 33463, 33457, 33465, 33461, 33457, 33463, 33463, 33465, 33430, 33428, 33464, 33457, 33459, 33460, 33457, 33428, 33426, 33457, 33462};
    }
}
