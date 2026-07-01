package com.huawei.digitalpayment.consumer.base.sim;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import dagger.hilt.android.internal.managers.BroadcastReceiverComponentManager;
import dagger.hilt.internal.UnsafeCasts;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;

public abstract class Hilt_SimCardRemovalReceiver extends BroadcastReceiver {
    private static int ShareDataUIState;
    private static byte[] component1;
    private static short[] component2;
    private static int component3;
    private static char[] component4;
    private static int copydefault;
    private static int getRequestBeneficiariesState;
    private volatile boolean injected = false;
    private final Object injectedLock = new Object();
    private static final byte[] $$c = {109, 5, -57, 108};
    private static final int $$f = 77;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {115, Ascii.RS, 119, 102, -39, -25, -30, -26, -26, -18, -36, -33, 39, -39, -25, -30, -26, -26, -18, -36, -33, 38};
    private static final int $$h = 241;
    private static final byte[] $$a = {119, -40, Ascii.DLE, 123, Ascii.GS, Ascii.DC2, Ascii.SUB, -4, Ascii.DC2, Ascii.DC2, Ascii.FF, 37, 8, Ascii.EM, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -49, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -50, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -48, 38, 10, 34, 4, -16, 46, 36, -2, 5, 5, Ascii.ESC, TarHeader.LF_SYMLINK, -2, 36, 2};
    private static final int $$b = 124;
    private static int getAsAtTimestamp = 1;
    private static int copy = 0;
    private static int equals = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(byte r6, short r7, short r8) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.base.sim.Hilt_SimCardRemovalReceiver.$$c
            int r8 = 116 - r8
            int r7 = r7 * 2
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L27
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r6]
            r5 = r3
            r3 = r8
            r8 = r5
        L27:
            int r8 = -r8
            int r6 = r6 + 1
            int r8 = r8 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.sim.Hilt_SimCardRemovalReceiver.$$i(byte, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.base.sim.Hilt_SimCardRemovalReceiver.$$a
            int r7 = r7 * 16
            int r7 = r7 + 83
            int r6 = r6 + 4
            int r1 = r8 + 10
            byte[] r1 = new byte[r1]
            int r8 = r8 + 9
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2e
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            int r6 = r6 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r3 = r3 + r6
            int r6 = r3 + (-17)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.sim.Hilt_SimCardRemovalReceiver.b(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.base.sim.Hilt_SimCardRemovalReceiver.$$g
            int r7 = r7 * 9
            int r7 = 13 - r7
            int r8 = r8 * 3
            int r1 = r8 + 10
            int r6 = r6 * 3
            int r6 = r6 + 99
            byte[] r1 = new byte[r1]
            int r8 = r8 + 9
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L32
        L18:
            r3 = r2
        L19:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L32:
            int r7 = r7 + 1
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-27)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.sim.Hilt_SimCardRemovalReceiver.d(int, int, short, java.lang.Object[]):void");
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int length;
        char[] cArr;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = component4;
        if (cArr2 != null) {
            int i7 = $10 + 61;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            for (int i8 = 0; i8 < length; i8++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 657, 14 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (65118 - Color.green(0)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr[i8] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
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
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr2, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i9 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr3 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4502 - Color.green(0), 36 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 27897), -1464227204, false, $$i(b2, b3, (byte) (b3 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                } else {
                    int i10 = iTrustedWebActivityService_Parcel.copydefault;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3579, 27 - MotionEvent.axisFromString(""), (char) ('0' - AndroidCharacter.getMirror('0')), 1180380354, false, $$i(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i10] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1859, 34 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 80302927, false, $$i(b6, b7, (byte) (b7 + 2)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i11 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i11, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i11);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i4 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i12 = $11 + 97;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] / iArr[3]);
                    i = iTrustedWebActivityService_Parcel.copydefault;
                } else {
                    cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                    i = iTrustedWebActivityService_Parcel.copydefault + 1;
                }
                iTrustedWebActivityService_Parcel.copydefault = i;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(int r27, int r28, short r29, byte r30, int r31, java.lang.Object[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.sim.Hilt_SimCardRemovalReceiver.c(int, int, short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0ba6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0b84  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceive(android.content.Context r43, android.content.Intent r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6068
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.sim.Hilt_SimCardRemovalReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    protected void inject(Context context) {
        if (this.injected) {
            return;
        }
        synchronized (this.injectedLock) {
            if (!this.injected) {
                ((SimCardRemovalReceiver_GeneratedInjector) BroadcastReceiverComponentManager.generatedComponent(context)).injectSimCardRemovalReceiver((SimCardRemovalReceiver) UnsafeCasts.unsafeCast(this));
                this.injected = true;
            }
        }
    }

    static {
        getRequestBeneficiariesState = 0;
        component1();
        copydefault = 1033395543;
        component3 = -238323847;
        ShareDataUIState = 320186528;
        component1 = new byte[]{TarHeader.LF_LINK, 106, 97, Ascii.DC2, 123, 114, 6, 105, Ascii.DC2, 124, 106, 19, 101, Ascii.DC2, 69, 4, 120, Ascii.DLE, 107, 122, Ascii.RS, 107, 80, 78, 111, -40, 98, 120, Ascii.DLE, 122, Ascii.DC2, 126, 65, TarHeader.LF_NORMAL, 108, 101, Ascii.DC2, 110, 125, Ascii.US, 67, Ascii.ESC, 17, 113, 76, 38, 112, 106, 20, 122, 124, 7, 98, 118, Ascii.VT, 124, 17, 125, 112, 67, -46, 98, 120, Ascii.DLE, 122, Ascii.DC2, 126, 97, 80, 34, 19, -92, 47, 98, Ascii.SYN, 96, -84, 43, 122, Ascii.ETB, Ascii.ETB, 97, 98, 108, 123, 82, 41, 101, 102, Ascii.ETB, 19, 119, Ascii.RS, 99, 120, Ascii.SUB, 120, 97, 109, 98, 85, 34, 99, Ascii.GS, 117, Ascii.ESC, 122, -87, 46, 109, 123, 2, -3, 10, Ascii.RS, 32, TarHeader.LF_DIR, 62, 2, 62, 10, 116, -1, Ascii.FF, TarHeader.LF_FIFO, 58, 105, -35, Ascii.EM, TarHeader.LF_CHR, Ascii.CAN, 47, 10, Ascii.RS, 32, TarHeader.LF_DIR, 13, 56, 2, Ascii.ESC, 20, -9, 10, 62, TarHeader.LF_CHR, 10, Ascii.SI, 58, 8, Ascii.SO, 127, -50, TarHeader.LF_DIR, 13, 56, 2, 59, TarHeader.LF_BLK, 10, 62, 73, -50, 62, 8, 8, 60, TarHeader.LF_SYMLINK, 9, 73, -54, 59, Ascii.EM, TarHeader.LF_SYMLINK, 56, 74, -13, 2, 63, 63, 9, 10, TarHeader.LF_BLK, 3, 122, -15, 13, Ascii.SO, 63, 59, Ascii.US, 38, Ascii.VT, 0, 34, 0, 9, TarHeader.LF_DIR, 10, 125, -54, Ascii.VT, 37, Ascii.GS, 35, 2, 113, -10, TarHeader.LF_DIR, 3, 41, 41};
        int i = getAsAtTimestamp + 85;
        getRequestBeneficiariesState = i % 128;
        int i2 = i % 2;
    }

    static void component1() {
        component4 = new char[]{33512, 33455, 33460, 33462, 33464, 33465, 33464, 33462, 33458, 33416, 33415, 33462, 33459, 33452, 33449, 33465, 33439, 33423, 33454, 33425, 33430, 33465, 33421, 33403, 33348, 33348, 33404, 33401, 33391, 33393, 33396, 33398, 33402, 33399, 33401, 33399, 33390, 33316, 33743, 33316, 33755, 33752, 33312, 33745, 33746, 33740, 33330, 33303, 33758, 33751, 33316, 33753, 33303, 33517, 33467, 33462, 33414, 33418, 33458, 33461, 33419, 33471, 33449, 33457, 33457, 33454, 33462, 33467, 33465};
    }
}
