package com.safaricom.designsystem.components.buttons.base;

import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.safaricom.designsystem.components.buttons.base.ComposableSingletons$BasicOutlinedButtonKt;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.Unit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;

public final class ComposableSingletons$BasicOutlinedButtonKt$lambda2$1$$ExternalSyntheticLambda0 implements Function0 {
    private static final byte[] $$c = {44, 39, Base64.padSymbol, Ascii.GS};
    private static final int $$f = 27;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {34, -66, 77, Ascii.DC2, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -39, 39, Ascii.FS, 36};
    private static final int $$e = 10;
    private static final byte[] $$a = {9, 8, 112, 107, 6, -24, Ascii.DC2, -26, 71, -67, 6, -18, 67, -72, -3, 4, 59, -40, -3, 4, 6, -47, -2, -9, Ascii.FF, -22, 1, -8, 2, -14, 6, -24, Ascii.DC2, TarHeader.LF_NORMAL, -72, Ascii.VT, -1, -21, 0, 6, -14, -8, 72, -40, -21, -1, -21, 0, 10, Ascii.DLE, -18, -16, 7, -14, -1};
    private static final int $$b = 222;
    private static int component2 = 0;
    private static int component3 = 1;
    private static char[] ShareDataUIState = {33509, 33457, 33460, 33462, 33464, 33466, 33460, 33460, 33432, 33426, 33465, 33464, 33461, 33429, 33423, 33460, 33466, 33462, 33463, 33467, 33460, 33422, 33506, 33414, 33510, 33453, 33460, 33464, 33464, 33464, 33465, 33462, 33409, 33471, 33459, 33465, 33519, 33460, 33460, 33466, 33457, 33460, 33464, 33464, 33464, 33465, 33462, 33409, 33506, 33422, 33460, 33467, 33463, 33462, 33466, 33460, 33423, 33429, 33461, 33464, 33465, 33426, 33437, 33362, 33360, 33361, 33365, 33448, 33375, 33361, 33517, 33461, 33451, 33465, 33470, 33455, 33452, 33451, 33459, 33412, 33468, 33459, 33465, 33511, 33461, 33459, 33458, 33465, 33459, 33469, 33415, 33462, 33462, 33464, 33462, 33459, 33459, 33460, 33468, 33465};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(byte r5, short r6, short r7) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 4
            byte[] r0 = com.safaricom.designsystem.components.buttons.base.ComposableSingletons$BasicOutlinedButtonKt$lambda2$1$$ExternalSyntheticLambda0.$$c
            int r5 = r5 * 2
            int r1 = r5 + 1
            int r7 = 115 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L20:
            int r3 = r3 + 1
            r4 = r0[r6]
        L24:
            int r4 = -r4
            int r6 = r6 + 1
            int r7 = r7 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.designsystem.components.buttons.base.ComposableSingletons$BasicOutlinedButtonKt$lambda2$1$$ExternalSyntheticLambda0.$$g(byte, short, short):java.lang.String");
    }

    private static void a(byte b2, byte b3, byte b4, Object[] objArr) {
        int i = 106 - b4;
        byte[] bArr = $$a;
        int i2 = b2 * 2;
        int i3 = 29 - b3;
        byte[] bArr2 = new byte[i2 + 4];
        int i4 = i2 + 3;
        int i5 = -1;
        if (bArr == null) {
            i = (i + (-i4)) - 3;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3++;
                i = (i + (-bArr[i3])) - 3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 3
            int r0 = r5 + 1
            byte[] r1 = com.safaricom.designsystem.components.buttons.base.ComposableSingletons$BasicOutlinedButtonKt$lambda2$1$$ExternalSyntheticLambda0.$$d
            int r7 = r7 * 9
            int r7 = 13 - r7
            int r6 = 100 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L24:
            r3 = r1[r7]
        L26:
            int r7 = r7 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-27)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.designsystem.components.buttons.base.ComposableSingletons$BasicOutlinedButtonKt$lambda2$1$$ExternalSyntheticLambda0.b(byte, short, int, java.lang.Object[]):void");
    }

    @Override
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = component2 + 25;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitComponent3 = ComposableSingletons$BasicOutlinedButtonKt.component3.component3();
        int i4 = component3 + 119;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return unitComponent3;
    }

    private static void c(boolean z, int[] iArr, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = ShareDataUIState;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 657, View.getDefaultSize(0, 0) + 14, (char) (65119 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1))), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i6++;
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
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            int i7 = $11 + 109;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            char[] cArr4 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                int i9 = $10 + 73;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i11 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr3 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4502 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 35, (char) (TextUtils.getOffsetAfter("", 0) + 27897), -1464227204, false, $$g(b2, b3, (byte) (b3 + 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3580 - (ViewConfiguration.getWindowTouchSlop() >> 8), Gravity.getAbsoluteGravity(0, 0) + 28, (char) (ViewConfiguration.getPressedStateDuration() >> 16), 1180380354, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1907 - AndroidCharacter.getMirror('0'), 34 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 80302927, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i13 = $10 + 121;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i15 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i15, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i15);
            int i16 = $10 + 115;
            $11 = i16 % 128;
            int i17 = i16 % 2;
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
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x059d  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int copydefault(java.util.List r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.designsystem.components.buttons.base.ComposableSingletons$BasicOutlinedButtonKt$lambda2$1$$ExternalSyntheticLambda0.copydefault(java.util.List):int");
    }
}
