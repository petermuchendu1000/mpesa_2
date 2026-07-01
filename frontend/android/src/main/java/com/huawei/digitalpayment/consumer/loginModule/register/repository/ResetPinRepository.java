package com.huawei.digitalpayment.consumer.loginModule.register.repository;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.loginModule.register.request.ReSetPinParams;
import com.huawei.http.BaseResp;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;

public class ResetPinRepository extends PaymentRequest<BaseResp> {
    private static final byte[] $$c = {7, 75, -84, -52};
    private static final int $$d = 136;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {84, 79, Ascii.SYN, 41, -12, -1, -9, -12, -1, -9, Ascii.NAK, -1, -1, 5, -20, 9, -8};
    private static final int $$b = 153;
    private static int copydefault = 0;
    private static int component2 = 1;
    private static char[] ShareDataUIState = {33534, 33410, 33457, 33467, 33467, 33465, 33466, 33469, 33415, 33387, 33385, 33404, 33396, 33381, 33391, 33514, 33466, 33460, 33460, 33432, 33426, 33465, 33464, 33461, 33429, 33438, 33409, 33458, 33455, 33452, 33459, 33470, 33464, 33463, 33517, 33467, 33469, 33462, 33468, 33408, 33464, 33469, 33461, 33468, 33468, 33454, 33460, 33458, 33454, 33480, 33515, 33458, 33460, 33468, 33469, 33469, 33464, 33462, 33460, 33455, 33459, 33465, 33430, 33432, 33463, 33455, 33424, 33512, 33421, 33460, 33457, 33456, 33456, 33457, 33449, 33465, 33364, 33732, 33790, 33728, 33790, 33730, 33738, 33734, 33730, 33790, 33788, 33748, 33746, 33787, 33731, 33729, 33786, 33785};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(short r7, int r8, int r9) {
        /*
            int r8 = r8 + 4
            int r9 = r9 * 4
            int r9 = r9 + 1
            byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.register.repository.ResetPinRepository.$$c
            int r7 = 115 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r7 = r9
            r4 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L21
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L21:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L28:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.register.repository.ResetPinRepository.$$e(short, int, int):java.lang.String");
    }

    private static void b(int i, short s, byte b2, Object[] objArr) {
        int i2 = 6 - (s * 3);
        int i3 = (i * 4) + 99;
        int i4 = b2 * 7;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[11 - i4];
        int i5 = 10 - i4;
        int i6 = -1;
        if (bArr == null) {
            int i7 = i2 + (-i5);
            i2 = i2;
            i3 = i7;
        }
        while (true) {
            int i8 = i2 + 1;
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2 = i8;
            i3 += -bArr[i8];
        }
    }

    public ResetPinRepository(ReSetPinParams reSetPinParams) {
        addParams(reSetPinParams);
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component2 + 17;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 67;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return "resetPin";
    }

    private static void a(boolean z, int[] iArr, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int length;
        char[] cArr;
        int i2;
        int i3 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = ShareDataUIState;
        if (cArr2 != null) {
            int i8 = $11 + 41;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i2])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollDefaultDelay() >> 16) + 657, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 13, (char) (65118 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr[i2] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i2++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr2, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i9 = iTrustedWebActivityService_Parcel.copydefault;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                        if (objCopydefault2 == null) {
                            byte b2 = (byte) (-1);
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 4503, Drawable.resolveOpacity(0, 0) + 36, (char) (27897 - View.resolveSizeAndState(0, 0, 0)), -1464227204, false, $$e((byte) 5, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
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
                    int i10 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3580 - (ViewConfiguration.getEdgeSlop() >> 16), 28 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) Color.alpha(0), 1180380354, false, $$e(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b5 = (byte) 1;
                    byte b6 = (byte) (-b5);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1860 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 33 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (KeyEvent.getMaxKeyCode() >> 16), 80302927, false, $$e(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                int i11 = $11 + 85;
                $10 = i11 % 128;
                int i12 = i11 % 2;
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i13 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i13, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i13);
        }
        if (z) {
            int i14 = $10 + 25;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr6 = new char[i5];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                int i16 = $11 + 27;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(iTrustedWebActivityService_Parcel.copydefault + i5) - 1];
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
                int i17 = $11 + 73;
                $10 = i17 % 128;
                int i18 = i17 % 2;
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
                int i19 = $11 + 107;
                $10 = i19 % 128;
                int i20 = i19 % 2;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0839 A[PHI: r2 r9
  0x0839: PHI (r2v2 ??) = (r2v1 ??), (r2v0 ??), (r2v0 ??) binds: [B:129:0x0839, B:102:0x0836, B:99:0x0827] A[DONT_GENERATE, DONT_INLINE]
  0x0839: PHI (r9v15 int) = (r9v14 int), (r9v13 int), (r9v13 int) binds: [B:129:0x0839, B:102:0x0836, B:99:0x0827] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x088b -> B:110:0x0893). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x088d -> B:111:0x0894). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object[] component1(java.lang.Class r34, int r35, int r36, int r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.register.repository.ResetPinRepository.component1(java.lang.Class, int, int, int):java.lang.Object[]");
    }
}
