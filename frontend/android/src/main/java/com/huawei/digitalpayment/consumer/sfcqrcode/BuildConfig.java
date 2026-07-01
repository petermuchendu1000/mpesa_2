package com.huawei.digitalpayment.consumer.sfcqrcode;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getActiveNotifications;

public final class BuildConfig {
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String LIBRARY_PACKAGE_NAME;
    private static int[] component1;
    private static int component2;
    private static final byte[] $$a = {80, 83, -21, -55};
    private static final int $$b = 120;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component3 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, int r7, int r8) {
        /*
            int r7 = r7 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcqrcode.BuildConfig.$$a
            int r8 = r8 * 2
            int r1 = 1 - r8
            int r6 = r6 + 104
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2e
        L14:
            r3 = r2
        L15:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            int r6 = r6 + 1
            r1[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = r6 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcqrcode.BuildConfig.$$c(short, int, int):java.lang.String");
    }

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = component1;
        int i4 = 684241640;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int i7 = $10 + 117;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i2;
                        byte b3 = (byte) (b2 - 3);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4392 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 37 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), -309236339, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i9] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i9++;
                    i2 = 2;
                    i4 = 684241640;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = component1;
        if (iArr5 != null) {
            int i10 = $10 + 91;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                try {
                    Object[] objArr3 = new Object[i5];
                    objArr3[i6] = Integer.valueOf(iArr5[i12]);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 2;
                        byte b5 = (byte) (b4 - 3);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 4390, (ViewConfiguration.getTapTimeout() >> 16) + 37, (char) KeyEvent.keyCodeFromString(""), -309236339, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    i12++;
                    i5 = 1;
                    i6 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr5 = iArr6;
        }
        int i13 = i6;
        System.arraycopy(iArr5, i13, iArr4, i13, length2);
        getactivenotifications.component1 = i13;
        int i14 = $10 + 11;
        $11 = i14 % 128;
        int i15 = i14 % 2;
        while (getactivenotifications.component1 < iArr.length) {
            int i16 = $10 + 45;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr4);
            int i18 = 0;
            for (int i19 = 16; i18 < i19; i19 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr4[i18];
                try {
                    Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 - 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2968 - Color.argb(0, 0, 0, 0), 16 - KeyEvent.normalizeMetaState(0), (char) (49870 - ImageFormat.getBitsPerPixel(0)), 462826032, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                    getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                    getactivenotifications.component2 = iIntValue;
                    i18++;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            int i20 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i20;
            getactivenotifications.component2 ^= iArr4[16];
            getactivenotifications.ShareDataUIState ^= iArr4[17];
            int i21 = getactivenotifications.ShareDataUIState;
            int i22 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr4);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr5 = {getactivenotifications, getactivenotifications};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault4 == null) {
                byte b8 = (byte) 3;
                byte b9 = (byte) (b8 - 4);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getDoubleTapTimeout() >> 16) + 2944, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24, (char) (View.resolveSizeAndState(0, 0, 0) + 27637), -1616366948, false, $$c(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        component2 = 1;
        component2();
        Object[] objArr = new Object[1];
        a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 44, new int[]{-618412942, 2066658024, 938859581, -694030242, 1149191889, 1636309187, -1634883909, -1545350018, 70509877, 1815145655, -1101961120, -318708267, 841639212, 1856144655, -745963829, 927789405, -1830608277, 131020791, -1376615800, 2126616499, -127297908, -430678037}, objArr);
        LIBRARY_PACKAGE_NAME = ((String) objArr[0]).intern();
        int i = component3 + 85;
        component2 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void component2() {
        component1 = new int[]{-953892584, -1763827750, 2137539193, 1540304828, -194931922, -1197312233, 14046143, 877731615, -2026120841, 1413658730, 581787499, 1334716917, 565475312, -1255831595, -1924087215, -1075356759, -1378970132, -691153644};
    }
}
