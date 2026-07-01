package com.huawei.digitalpayment.consumer.profileui;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;

public final class BuildConfig {
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String LIBRARY_PACKAGE_NAME;
    private static char[] component1;
    private static int component2;
    private static final byte[] $$a = {70, 83, 77, 1};
    private static final int $$b = 17;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ShareDataUIState = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r7, short r8, int r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.profileui.BuildConfig.$$a
            int r9 = r9 * 2
            int r9 = r9 + 4
            int r8 = 115 - r8
            int r7 = r7 * 2
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r7
            goto L29
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L29:
            int r8 = -r8
            int r8 = r8 + r9
            int r9 = r3 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.BuildConfig.$$c(short, short, int):java.lang.String");
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        char c2;
        int i = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = component1;
        Object obj = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(658 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 13 - ImageFormat.getBitsPerPixel(0), (char) (65118 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
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
        char[] cArr4 = new char[i3];
        System.arraycopy(cArr2, i2, cArr4, 0, i3);
        if (bArr != null) {
            int i7 = $10 + 75;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr = new char[i3];
                iTrustedWebActivityService_Parcel.copydefault = 0;
                c2 = 1;
            } else {
                cArr = new char[i3];
                iTrustedWebActivityService_Parcel.copydefault = 0;
                c2 = 0;
            }
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                int i8 = $11 + 63;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i10 = iTrustedWebActivityService_Parcel.copydefault;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                        if (objCopydefault2 == null) {
                            int iRgb = (-16772714) - Color.rgb(0, 0, 0);
                            int maximumFlingVelocity = 36 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 27898);
                            byte b2 = (byte) ($$a[3] - 1);
                            byte b3 = (byte) (b2 + 5);
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iRgb, maximumFlingVelocity, cIndexOf, -1464227204, false, $$c(b2, b3, (byte) (b3 - 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i10] = ((Character) ((Method) objCopydefault2).invoke(obj, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i11 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault3 == null) {
                        int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3580;
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 28;
                        char keyRepeatTimeout2 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        byte b4 = (byte) ($$a[3] - 1);
                        byte b5 = b4;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(maximumFlingVelocity2, keyRepeatTimeout, keyRepeatTimeout2, 1180380354, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i11] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    int iNormalizeMetaState = 1859 - KeyEvent.normalizeMetaState(0);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 35;
                    char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    byte b6 = $$a[3];
                    byte b7 = (byte) (b6 - 1);
                    byte b8 = b6;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iNormalizeMetaState, iIndexOf, longPressTimeout, 80302927, false, $$c(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                obj = null;
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            int i12 = $11 + 3;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr4, 0, cArr5, 1, i3);
                System.arraycopy(cArr5, 0, cArr4, i3 >>> i5, i5);
                System.arraycopy(cArr5, i5, cArr4, 0, i3 % i5);
            } else {
                char[] cArr6 = new char[i3];
                System.arraycopy(cArr4, 0, cArr6, 0, i3);
                int i13 = i3 - i5;
                System.arraycopy(cArr6, 0, cArr4, i13, i5);
                System.arraycopy(cArr6, i5, cArr4, 0, i13);
            }
        }
        if (z) {
            char[] cArr7 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                int i14 = $11 + 89;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                cArr7[iTrustedWebActivityService_Parcel.copydefault] = cArr4[(i3 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr4 = cArr7;
        }
        if (i4 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr4[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr4[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static {
        component2 = 1;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(new int[]{0, 44, 0, 23}, true, new byte[]{1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0}, objArr);
        LIBRARY_PACKAGE_NAME = ((String) objArr[0]).intern();
        int i = ShareDataUIState + 101;
        component2 = i % 128;
        int i2 = i % 2;
    }

    static void ShareDataUIState() {
        component1 = new char[]{33517, 33462, 33452, 33458, 33463, 33457, 33465, 33461, 33457, 33463, 33463, 33465, 33430, 33428, 33464, 33457, 33459, 33460, 33457, 33428, 33426, 33457, 33462, 33465, 33456, 33458, 33463, 33461, 33464, 33461, 33455, 33454, 33424, 33423, 33460, 33462, 33454, 33451, 33455, 33457, 33462, 33431, 33422, 33454};
    }
}
