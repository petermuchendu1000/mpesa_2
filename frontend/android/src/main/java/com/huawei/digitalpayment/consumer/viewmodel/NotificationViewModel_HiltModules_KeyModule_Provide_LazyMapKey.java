package com.huawei.digitalpayment.consumer.viewmodel;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;

public final class NotificationViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static int ShareDataUIState;
    private static char[] component2;
    static NotificationViewModel component3;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {35, -27, -128, TarHeader.LF_SYMLINK};
    private static final int $$b = 134;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, short r7, short r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.viewmodel.NotificationViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r7 = r7 * 4
            int r1 = 1 - r7
            int r6 = 115 - r6
            int r8 = r8 * 2
            int r8 = r8 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L29:
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.viewmodel.NotificationViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(byte, short, short):java.lang.String");
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i4 = iArr[0];
        byte b2 = 1;
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = component2;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 55;
                $10 = i9 % 128;
                int i10 = i9 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetBefore("", 0) + 657, TextUtils.getOffsetBefore("", 0) + 14, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 65117), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i8++;
                    i2 = 2;
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
            char[] cArr4 = new char[i5];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == b2) {
                    int i11 = $10 + 93;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = iTrustedWebActivityService_Parcel.copydefault;
                        char c3 = cArr3[iTrustedWebActivityService_Parcel.copydefault];
                        Object[] objArr3 = new Object[2];
                        objArr3[b2] = Integer.valueOf(c2);
                        objArr3[0] = Integer.valueOf(c3);
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                        if (objCopydefault2 == null) {
                            int iBlue = 4502 - Color.blue(0);
                            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 36;
                            char cIndexOf = (char) (TextUtils.indexOf("", "") + 27897);
                            byte b3 = (byte) 5;
                            byte b4 = (byte) (b3 - 5);
                            String str$$c = $$c(b3, b4, b4);
                            Class[] clsArr = new Class[2];
                            clsArr[0] = Integer.TYPE;
                            clsArr[b2] = Integer.TYPE;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iBlue, tapTimeout, cIndexOf, -1464227204, false, str$$c, clsArr);
                        }
                        Object obj = null;
                        cArr4[i12] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                        obj.hashCode();
                        throw null;
                    }
                    int i13 = iTrustedWebActivityService_Parcel.copydefault;
                    char c4 = cArr3[iTrustedWebActivityService_Parcel.copydefault];
                    Object[] objArr4 = new Object[2];
                    objArr4[b2] = Integer.valueOf(c2);
                    objArr4[0] = Integer.valueOf(c4);
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault3 == null) {
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4502;
                        int deadChar = 36 - KeyEvent.getDeadChar(0, 0);
                        char cRed = (char) (Color.red(0) + 27897);
                        byte b5 = (byte) 5;
                        byte b6 = (byte) (b5 - 5);
                        String str$$c2 = $$c(b5, b6, b6);
                        Class[] clsArr2 = new Class[2];
                        clsArr2[0] = Integer.TYPE;
                        clsArr2[b2] = Integer.TYPE;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(scrollBarFadeDuration, deadChar, cRed, -1464227204, false, str$$c2, clsArr2);
                    }
                    cArr4[i13] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                } else {
                    int i14 = iTrustedWebActivityService_Parcel.copydefault;
                    char c5 = cArr3[iTrustedWebActivityService_Parcel.copydefault];
                    Object[] objArr5 = new Object[2];
                    objArr5[b2] = Integer.valueOf(c2);
                    objArr5[0] = Integer.valueOf(c5);
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault4 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3580, 28 - TextUtils.indexOf("", ""), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 1180380354, false, $$c(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr6 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault5 == null) {
                    byte b9 = (byte) 1;
                    byte b10 = (byte) (b9 - 1);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1859, (ViewConfiguration.getLongPressTimeout() >> 16) + 34, (char) ((Process.getThreadPriority(0) + 20) >> 6), 80302927, false, $$c(b9, b10, b10), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
                b2 = 1;
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i15 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i15, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i15);
        }
        if (z) {
            int i16 = $11 + 95;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            char[] cArr6 = new char[i5];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                int i18 = $10 + 123;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[i5 >>> iTrustedWebActivityService_Parcel.copydefault];
                    i = iTrustedWebActivityService_Parcel.copydefault;
                } else {
                    cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i5 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                    i = iTrustedWebActivityService_Parcel.copydefault + 1;
                }
                iTrustedWebActivityService_Parcel.copydefault = i;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static {
        ShareDataUIState = 0;
        component3();
        Object[] objArr = new Object[1];
        a(new int[]{0, 66, 0, 0}, true, new byte[]{0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component1 + 7;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void component3() {
        component2 = new char[]{33513, 33463, 33467, 33462, 33409, 33469, 33457, 33464, 33408, 33469, 33457, 33459, 33457, 33461, 33469, 33465, 33464, 33464, 33457, 33454, 33409, 33505, 33426, 33463, 33467, 33462, 33457, 33453, 33457, 33464, 33456, 33421, 33423, 33460, 33462, 33454, 33451, 33455, 33457, 33462, 33431, 33422, 33454, 33462, 33462, 33452, 33458, 33463, 33457, 33465, 33461, 33457, 33463, 33463, 33465, 33430, 33428, 33464, 33457, 33459, 33460, 33457, 33428, 33426, 33457, 33462};
    }
}
