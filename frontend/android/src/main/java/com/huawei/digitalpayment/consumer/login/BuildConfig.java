package com.huawei.digitalpayment.consumer.login;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;

public final class BuildConfig {
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String LIBRARY_PACKAGE_NAME;
    private static int component2;
    private static char[] component3;
    private static final byte[] $$a = {59, -24, -77, -23};
    private static final int $$b = 28;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 0;

    private static String $$c(byte b2, short s, short s2) {
        int i = 4 - (s2 * 3);
        byte[] bArr = $$a;
        int i2 = b2 * 3;
        int i3 = s + 110;
        byte[] bArr2 = new byte[1 - i2];
        int i4 = 0 - i2;
        int i5 = -1;
        if (bArr == null) {
            i3 = i4 + (-i);
            i++;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            int i7 = i;
            i3 += -bArr[i];
            i = i7 + 1;
            i5 = i6;
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        char[] cArr2;
        char c2;
        int i = 2;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr3 = component3;
        char c3 = '0';
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 91;
                $11 = i8 % 128;
                if (i8 % i == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i7])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(0, 0, 0) + 657, (ViewConfiguration.getTapTimeout() >> 16) + 14, (char) (65117 - TextUtils.indexOf("", c3)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                        }
                        cArr4[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i7 %= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i7])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 657, TextUtils.lastIndexOf("", '0', 0) + 15, (char) (65118 - Color.alpha(0)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr4[i7] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i7++;
                }
                i = 2;
                c3 = '0';
            }
            cArr3 = cArr4;
        }
        char[] cArr5 = new char[i4];
        System.arraycopy(cArr3, i3, cArr5, 0, i4);
        if (bArr != null) {
            int i9 = $10 + 1;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr2 = new char[i4];
                iTrustedWebActivityService_Parcel.copydefault = 1;
                c2 = 1;
            } else {
                cArr2 = new char[i4];
                iTrustedWebActivityService_Parcel.copydefault = 0;
                c2 = 0;
            }
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i10 = $11 + 93;
                $10 = i10 % 128;
                if (i10 % 2 == 0 ? bArr[iTrustedWebActivityService_Parcel.copydefault] != 1 : bArr[iTrustedWebActivityService_Parcel.copydefault] != 0) {
                    int i11 = iTrustedWebActivityService_Parcel.copydefault;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr5[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                        if (objCopydefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 + 5);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3579 - TextUtils.indexOf((CharSequence) "", '0', 0), 28 - View.resolveSizeAndState(0, 0, 0), (char) ((-1) - MotionEvent.axisFromString("")), 1180380354, false, $$c(b2, b3, (byte) (b3 - 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i11] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i12 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr5 = {Integer.valueOf(cArr5[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(4502 - (ViewConfiguration.getScrollBarSize() >> 8), 36 - Gravity.getAbsoluteGravity(0, 0), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 27896), -1464227204, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i12] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr2[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr6 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault5 == null) {
                    int packedPositionGroup = 1859 - ExpandableListView.getPackedPositionGroup(0L);
                    int keyRepeatDelay = 34 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                    byte length2 = (byte) $$a.length;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionGroup, keyRepeatDelay, offsetBefore, 80302927, false, $$c((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
                int i13 = $11 + 17;
                $10 = i13 % 128;
                int i14 = i13 % 2;
            }
            cArr5 = cArr2;
        }
        if (i6 > 0) {
            char[] cArr6 = new char[i4];
            System.arraycopy(cArr5, 0, cArr6, 0, i4);
            int i15 = i4 - i6;
            System.arraycopy(cArr6, 0, cArr5, i15, i6);
            System.arraycopy(cArr6, i6, cArr5, 0, i15);
        }
        if (z) {
            int i16 = $10 + 21;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                cArr = new char[i4];
                iTrustedWebActivityService_Parcel.copydefault = 1;
            } else {
                cArr = new char[i4];
                iTrustedWebActivityService_Parcel.copydefault = 0;
            }
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i17 = $10 + 39;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                cArr[iTrustedWebActivityService_Parcel.copydefault] = cArr5[(i4 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr5 = cArr;
        }
        if (i5 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i19 = $10 + 85;
                $11 = i19 % 128;
                int i20 = i19 % 2;
                cArr5[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr5[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr5);
    }

    static {
        component2 = 1;
        component2();
        Object[] objArr = new Object[1];
        a(new int[]{0, 40, 0, 0}, true, new byte[]{0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0}, objArr);
        LIBRARY_PACKAGE_NAME = ((String) objArr[0]).intern();
        int i = component1 + 97;
        component2 = i % 128;
        if (i % 2 == 0) {
            int i2 = 34 / 0;
        }
    }

    static void component2() {
        component3 = new char[]{33512, 33460, 33463, 33460, 33458, 33426, 33423, 33460, 33462, 33454, 33451, 33455, 33457, 33462, 33431, 33422, 33454, 33462, 33462, 33452, 33458, 33463, 33457, 33465, 33461, 33457, 33463, 33463, 33465, 33430, 33428, 33464, 33457, 33459, 33460, 33457, 33428, 33426, 33457, 33462};
    }
}
