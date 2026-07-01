package com.huawei.digitalpayment.consumer.sfcui.bonga.transfer;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.MutableState;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.safaricom.designsystem.components.radio.IRadioButton;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.Unit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.crypto.signers.PSSSigner;

public final class TransferBongaRouteKt$$ExternalSyntheticLambda3 implements Function1 {
    public final MutableState f$0;
    private static final byte[] $$c = {TarHeader.LF_CHR, -39, 98, -44};
    private static final int $$f = 137;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {46, -95, Ascii.VT, -87, -39, -25, -30, -26, -26, -18, -36, -33, 39, -39, -28, -36};
    private static final int $$e = 95;
    private static final byte[] $$a = {80, 83, -21, -55, -15, 8, -16, 1, 4, 3, TarHeader.LF_BLK, -55, -14, -1, -8, 13, -11, -8, 68, PSSSigner.TRAILER_IMPLICIT, 1, Base64.padSymbol, -36, -19, -4, -10, 8, -8, 0, Ascii.SYN, -22, -15, Ascii.VT, -8, 0, -15, 0, -17, 34, -19, -4, -10, 8, -8, 0, Ascii.SUB, -39, 6, -11};
    private static final int $$b = 100;
    private static int component1 = 0;
    private static int ShareDataUIState = 1;
    private static char[] component2 = {33514, 33466, 33460, 33460, 33432, 33426, 33465, 33464, 33461, 33429, 33423, 33460, 33466, 33462, 33463, 33467, 33460, 33422, 33506, 33414, 33459, 33457, 33460, 33462, 33516, 33465, 33459, 33471, 33409, 33462, 33465, 33464, 33464, 33464, 33460, 33453, 33514, 33466, 33460, 33460, 33432, 33426, 33465, 33464, 33461, 33429, 33423, 33460, 33466, 33462, 33463, 33467, 33460, 33422, 33506, 33409, 33462, 33465, 33464, 33464, 33464, 33460, 33517, 33458, 33456, 33457, 33461, 33416, 33471, 33457, 33430, 33358, 33352, 33361, 33369, 33352, 33344, 33345, 33348, 33363, 33358, 33344, 33354, 33471, 33376, 33306, 33380, 33390, 33309, 33309, 33311, 33309, 33306, 33306, 33307, 33379, 33376, 33298, 33308, 33306};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(int r6, int r7, short r8) {
        /*
            int r7 = r7 + 4
            int r8 = 115 - r8
            int r6 = r6 * 4
            int r0 = r6 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.bonga.transfer.TransferBongaRouteKt$$ExternalSyntheticLambda3.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2a
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.bonga.transfer.TransferBongaRouteKt$$ExternalSyntheticLambda3.$$g(int, int, short):java.lang.String");
    }

    public TransferBongaRouteKt$$ExternalSyntheticLambda3(MutableState mutableState) {
        this.f$0 = mutableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 19
            int r6 = 33 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.bonga.transfer.TransferBongaRouteKt$$ExternalSyntheticLambda3.$$a
            int r8 = r8 + 4
            int r7 = r7 * 6
            int r7 = 103 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            int r8 = r8 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-2)
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.bonga.transfer.TransferBongaRouteKt$$ExternalSyntheticLambda3.a(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 3
            int r9 = r9 + 1
            int r7 = 100 - r7
            int r8 = r8 * 9
            int r8 = 13 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.bonga.transfer.TransferBongaRouteKt$$ExternalSyntheticLambda3.$$d
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r8
            r3 = r9
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r6
        L2a:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-27)
            int r7 = r7 + 1
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.bonga.transfer.TransferBongaRouteKt$$ExternalSyntheticLambda3.b(int, int, byte, java.lang.Object[]):void");
    }

    @Override
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 125;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Unit unit$r8$lambda$8EUQWeVqil9wWl0nS8gBIFKwjnQ = TransferBongaRouteKt.$r8$lambda$8EUQWeVqil9wWl0nS8gBIFKwjnQ(this.f$0, (IRadioButton) obj);
        int i4 = ShareDataUIState + 33;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return unit$r8$lambda$8EUQWeVqil9wWl0nS8gBIFKwjnQ;
    }

    private static void c(boolean z, int[] iArr, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int length;
        char[] cArr;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr2 = component2;
        if (cArr2 != null) {
            int i9 = $11 + 67;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i10 = $10 + 25;
                $11 = i10 % 128;
                int i11 = i10 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i2])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(MotionEvent.axisFromString("") + 658, 14 - View.MeasureSpec.getSize(0), (char) (65119 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr[i2] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i2++;
                    i3 = 2;
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
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr2, i5, cArr3, 0, i6);
        if (bArr != null) {
            char[] cArr4 = new char[i6];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i6) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i12 = $11 + 55;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        int i13 = iTrustedWebActivityService_Parcel.copydefault;
                        Object[] objArr3 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                        if (objCopydefault2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 - 1);
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4503 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 36 - View.MeasureSpec.getMode(0), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 27897), -1464227204, false, $$g(b2, b3, (byte) (b3 & 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                        throw null;
                    }
                    int i14 = iTrustedWebActivityService_Parcel.copydefault;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 - 1);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0, 0) + 4502, (ViewConfiguration.getLongPressTimeout() >> 16) + 36, (char) (27897 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), -1464227204, false, $$g(b4, b5, (byte) (b5 & 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i15 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr5 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 - 1);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTapTimeout() >> 16) + 3580, (ViewConfiguration.getPressedStateDuration() >> 16) + 28, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 1180380354, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr6 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault5 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 - 1);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1859, 34 - KeyEvent.keyCodeFromString(""), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 80302927, false, $$g(b8, b9, (byte) (-b9)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            int i16 = $11 + 119;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                char[] cArr5 = new char[i6];
                System.arraycopy(cArr3, 0, cArr5, 0, i6);
                System.arraycopy(cArr5, 1, cArr3, i6 + i8, i8);
                System.arraycopy(cArr5, i8, cArr3, 0, i6 >> i8);
            } else {
                char[] cArr6 = new char[i6];
                System.arraycopy(cArr3, 0, cArr6, 0, i6);
                int i17 = i6 - i8;
                System.arraycopy(cArr6, 0, cArr3, i17, i8);
                System.arraycopy(cArr6, i8, cArr3, 0, i17);
            }
        }
        if (z) {
            int i18 = $10 + 95;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            char[] cArr7 = new char[i6];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i6) {
                int i20 = $10 + 33;
                $11 = i20 % 128;
                if (i20 % 2 == 0) {
                    int i21 = iTrustedWebActivityService_Parcel.copydefault;
                    int i22 = i6 / iTrustedWebActivityService_Parcel.copydefault;
                    cArr7[i21] = cArr3[0];
                    i = iTrustedWebActivityService_Parcel.copydefault;
                } else {
                    cArr7[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i6 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                    i = iTrustedWebActivityService_Parcel.copydefault + 1;
                }
                iTrustedWebActivityService_Parcel.copydefault = i;
            }
            cArr3 = cArr7;
        }
        if (i7 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i6) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0634, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x030e, code lost:
    
        r4 = com.huawei.digitalpayment.consumer.sfcui.bonga.transfer.TransferBongaRouteKt$$ExternalSyntheticLambda3.ShareDataUIState;
        r5 = (r4 & 97) + (r4 | 97);
        com.huawei.digitalpayment.consumer.sfcui.bonga.transfer.TransferBongaRouteKt$$ExternalSyntheticLambda3.component1 = r5 % 128;
        r5 = r5 % 2;
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0321, code lost:
    
        if (r5 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0323, code lost:
    
        r4 = 1341 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0);
        r21 = 33 - android.graphics.Color.alpha(0);
        r5 = (char) (android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0) + 6426);
        r6 = (byte) (com.huawei.digitalpayment.consumer.sfcui.bonga.transfer.TransferBongaRouteKt$$ExternalSyntheticLambda3.$$e & 1);
        r7 = r6;
        r10 = new java.lang.Object[1];
        b(r6, r7, (byte) (r7 + 2), r10);
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r4, r21, r5, 1443979249, false, (java.lang.String) r10[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x035c, code lost:
    
        ((java.lang.reflect.Field) r5).set(null, r14);
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0368, code lost:
    
        if (r5 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x036a, code lost:
    
        r4 = (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1342;
        r21 = 33 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
        r5 = (char) (6425 - android.view.View.resolveSize(0, 0));
        r6 = (byte) (com.huawei.digitalpayment.consumer.sfcui.bonga.transfer.TransferBongaRouteKt$$ExternalSyntheticLambda3.$$e & 1);
        r7 = r6;
        r10 = new java.lang.Object[1];
        b(r6, r7, (byte) (r7 + 2), r10);
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r4, r21, r5, 1443979249, false, (java.lang.String) r10[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x03aa, code lost:
    
        r5 = new java.lang.Object[]{0L, ((java.lang.reflect.Field) r5).get(null)};
        r4 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(812318566);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x03bd, code lost:
    
        if (r4 != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x03bf, code lost:
    
        r4 = (android.view.KeyEvent.getMaxKeyCode() >> 16) + 1342;
        r21 = 33 - (android.view.ViewConfiguration.getTapTimeout() >> 16);
        r6 = (char) (6425 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
        r7 = (byte) 0;
        r9 = r7;
        r12 = new java.lang.Object[1];
        b(r7, r9, r9, r12);
        r4 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r4, r21, r6, -181198845, false, (java.lang.String) r12[0], new java.lang.Class[]{java.lang.Long.TYPE, java.lang.reflect.Method.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x03ff, code lost:
    
        ((java.lang.Long) ((java.lang.reflect.Method) r4).invoke(null, r5)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x062c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x062d, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0631, code lost:
    
        if (r1 != null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0633, code lost:
    
        throw r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x040b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0230 A[Catch: all -> 0x0428, TRY_ENTER, TryCatch #0 {all -> 0x0428, blocks: (B:10:0x010d, B:13:0x0133, B:14:0x0145, B:16:0x015d, B:18:0x0174, B:21:0x0195, B:22:0x01b9, B:24:0x01e1, B:27:0x01fa, B:34:0x0230, B:35:0x0242, B:37:0x025a, B:41:0x028a, B:36:0x0247, B:30:0x020a, B:23:0x01bc, B:15:0x014a), top: B:101:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0247 A[Catch: all -> 0x0428, TryCatch #0 {all -> 0x0428, blocks: (B:10:0x010d, B:13:0x0133, B:14:0x0145, B:16:0x015d, B:18:0x0174, B:21:0x0195, B:22:0x01b9, B:24:0x01e1, B:27:0x01fa, B:34:0x0230, B:35:0x0242, B:37:0x025a, B:41:0x028a, B:36:0x0247, B:30:0x020a, B:23:0x01bc, B:15:0x014a), top: B:101:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0614  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int component1(java.util.List r27) {
        /*
            Method dump skipped, instruction units count: 1768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.bonga.transfer.TransferBongaRouteKt$$ExternalSyntheticLambda3.component1(java.util.List):int");
    }
}
