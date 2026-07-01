package com.huawei.digitalpayment.common.theme.viewmodel;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;

public final class TipsThemeViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    static TipsThemeViewModel component1;
    private static char[] component3;
    private static int copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {99, TarHeader.LF_DIR, 44, 107};
    private static final int $$b = 109;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, int r7, byte r8) {
        /*
            int r7 = r7 + 110
            int r8 = r8 * 2
            int r8 = 4 - r8
            byte[] r0 = com.huawei.digitalpayment.common.theme.viewmodel.TipsThemeViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r6 = r6 * 3
            int r6 = r6 + 1
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r8]
        L24:
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.viewmodel.TipsThemeViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(short, int, byte):java.lang.String");
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = component3;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(656 - TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 14, (char) (TextUtils.getOffsetAfter("", 0) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
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
            int i8 = $10 + 109;
            $11 = i8 % 128;
            int i9 = 2;
            int i10 = i8 % 2;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i11 = $10 + 67;
                $11 = i11 % 128;
                int i12 = i11 % i9;
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i13 = iTrustedWebActivityService_Parcel.copydefault;
                    char c3 = cArr3[iTrustedWebActivityService_Parcel.copydefault];
                    try {
                        Object[] objArr3 = new Object[i9];
                        objArr3[1] = Integer.valueOf(c2);
                        objArr3[0] = Integer.valueOf(c3);
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                        if (objCopydefault2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4502, 36 - View.MeasureSpec.getMode(0), (char) (View.resolveSizeAndState(0, 0, 0) + 27897), -1464227204, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i14 = iTrustedWebActivityService_Parcel.copydefault;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 + 5);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((KeyEvent.getMaxKeyCode() >> 16) + 3580, Drawable.resolveOpacity(0, 0) + 28, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 1180380354, false, $$c(b4, b5, (byte) (b5 - 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    int i15 = 1859 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int i16 = 35 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    byte length2 = (byte) $$a.length;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i15, i16, doubleTapTimeout, 80302927, false, $$c((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                int i17 = $11 + 5;
                $10 = i17 % 128;
                int i18 = i17 % 2;
                i9 = 2;
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i19 = $10 + 101;
            $11 = i19 % 128;
            if (i19 % 2 == 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 1, cArr5, 1, i4);
                System.arraycopy(cArr5, 0, cArr3, i4 - i6, i6);
                System.arraycopy(cArr5, i6, cArr3, 0, i4 >>> i6);
            } else {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i20 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr3, i20, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i20);
            }
        }
        if (!(!z)) {
            char[] cArr7 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i21 = $10 + 19;
                $11 = i21 % 128;
                if (i21 % 2 == 0) {
                    cArr7[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i4 % iTrustedWebActivityService_Parcel.copydefault) << 1];
                    i = iTrustedWebActivityService_Parcel.copydefault >>> 1;
                } else {
                    cArr7[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i4 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                    i = iTrustedWebActivityService_Parcel.copydefault + 1;
                }
                iTrustedWebActivityService_Parcel.copydefault = i;
            }
            cArr3 = cArr7;
        }
        if (i5 > 0) {
            int i22 = $10 + 71;
            $11 = i22 % 128;
            int i23 = i22 % 2;
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static {
        copydefault = 0;
        component1();
        Object[] objArr = new Object[1];
        a(new int[]{0, 67, 0, 0}, false, new byte[]{1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component2 + 85;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    static void component1() {
        component3 = new char[]{33518, 33462, 33457, 33426, 33428, 33457, 33460, 33459, 33457, 33464, 33428, 33430, 33465, 33463, 33463, 33457, 33461, 33465, 33457, 33463, 33458, 33452, 33462, 33462, 33454, 33422, 33431, 33462, 33457, 33458, 33457, 33457, 33425, 33422, 33457, 33465, 33462, 33462, 33430, 33421, 33456, 33464, 33457, 33453, 33457, 33462, 33467, 33463, 33426, 33438, 33409, 33459, 33454, 33468, 33409, 33465, 33462, 33462, 33410, 33408, 33464, 33457, 33469, 33409, 33462, 33467, 33463};
    }
}
