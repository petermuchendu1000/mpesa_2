package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getSmallIconId;

public final class IntroScreensViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static int ShareDataUIState;
    private static int component1;
    private static int component2;
    private static byte[] component3;
    private static short[] component4;
    static IntroScreensViewModel copydefault;
    private static int getAsAtTimestamp;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {1, -53, Ascii.US, 101};
    private static final int $$b = 255;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copy = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, byte r6, short r7) {
        /*
            int r6 = r6 + 112
            int r5 = r5 * 2
            int r5 = r5 + 4
            int r7 = r7 * 2
            int r0 = r7 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.basicUi.viewmodel.IntroScreensViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r6 = r5
            r3 = r7
            r4 = r2
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            r3 = r1[r5]
        L25:
            int r5 = r5 + 1
            int r6 = r6 + r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basicUi.viewmodel.IntroScreensViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(byte, byte, short):java.lang.String");
    }

    private static void a(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        long j;
        boolean z;
        int i4;
        int i5 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(component1)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                int iResolveSize = View.resolveSize(0, 0) + 999;
                int mirror = AndroidCharacter.getMirror('0') - 17;
                char cArgb = (char) (Color.argb(0, 0, 0, 0) + 61685);
                byte b3 = $$a[0];
                byte b4 = (byte) (b3 - 1);
                byte b5 = b3;
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iResolveSize, mirror, cArgb, 1874745193, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            long j2 = 0;
            if (i6 == 0) {
                j = 7083766810336261929L;
            } else {
                byte[] bArr = component3;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i7 = 0;
                    while (i7 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                        if (objCopydefault2 == null) {
                            int i8 = 2984 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int i9 = (ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1)) + 47;
                            char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 54462);
                            byte b6 = (byte) (r11[0] - 1);
                            byte length2 = (byte) $$a.length;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i8, i9, threadPriority, -1178636483, false, $$c(b6, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i7] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                        i7++;
                        j2 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i10 = $10 + 91;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        byte[] bArr3 = component3;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(component2)};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                        if (objCopydefault3 == null) {
                            int scrollBarSize = 999 - (ViewConfiguration.getScrollBarSize() >> 8);
                            int i11 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 30;
                            char scrollDefaultDelay = (char) (61685 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                            byte b7 = $$a[0];
                            byte b8 = (byte) (b7 - 1);
                            byte b9 = b7;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(scrollBarSize, i11, scrollDefaultDelay, 1874745193, false, $$c(b8, b9, (byte) (b9 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i4 = ((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) & 7083766810336261929L)) / ((int) (((long) component1) + 7083766810336261929L));
                    } else {
                        byte[] bArr4 = component3;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(component2)};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                        if (objCopydefault4 == null) {
                            int i12 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 999;
                            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 31;
                            char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 61685);
                            byte b10 = $$a[0];
                            byte b11 = (byte) (b10 - 1);
                            byte b12 = b10;
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i12, iKeyCodeFromString, maximumDrawingCacheSize, 1874745193, false, $$c(b11, b12, (byte) (b12 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i4 = ((byte) (((long) bArr4[((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) component1) ^ 7083766810336261929L));
                    }
                    iIntValue = (byte) i4;
                    int i13 = $11 + 93;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    j = 7083766810336261929L;
                } else {
                    j = 7083766810336261929L;
                    iIntValue = (short) (((short) (((long) component4[i + ((int) (((long) component2) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) component1) ^ 7083766810336261929L)));
                }
            }
            if (iIntValue > 0) {
                getsmalliconid.copydefault = ((i + iIntValue) - 2) + ((int) (((long) component2) ^ j)) + i6;
                Object[] objArr6 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(ShareDataUIState), sb};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault5 == null) {
                    int i15 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1696;
                    int touchSlop = 37 - (ViewConfiguration.getTouchSlop() >> 8);
                    char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    byte b13 = (byte) ($$a[0] - 1);
                    byte b14 = b13;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i15, touchSlop, maximumFlingVelocity, -1454191902, false, $$c(b13, b14, b14), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault5).invoke(null, objArr6)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr5 = component3;
                if (bArr5 != null) {
                    int i16 = $10 + 65;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                    int length3 = bArr5.length;
                    byte[] bArr6 = new byte[length3];
                    for (int i18 = 0; i18 < length3; i18++) {
                        bArr6[i18] = (byte) (((long) bArr5[i18]) ^ 7083766810336261929L);
                    }
                    bArr5 = bArr6;
                }
                if (bArr5 != null) {
                    int i19 = $10 + 125;
                    $11 = i19 % 128;
                    int i20 = i19 % 2;
                    z = true;
                } else {
                    z = false;
                }
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    int i21 = $10 + 85;
                    $11 = i21 % 128;
                    int i22 = i21 % 2;
                    if (z) {
                        byte[] bArr7 = component3;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr7[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = component4;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                    }
                    sb.append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    getsmalliconid.component2++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static {
        getAsAtTimestamp = 0;
        component2();
        Object[] objArr = new Object[1];
        a(Color.red(0) + 1896579991, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 4, (short) ((-8) - KeyEvent.keyCodeFromString("")), (byte) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 51), (-1275935891) - View.getDefaultSize(0, 0), objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = copy + 73;
        getAsAtTimestamp = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component2() {
        component2 = 2134838080;
        component1 = -238323858;
        ShareDataUIState = -1111077921;
        component3 = new byte[]{Ascii.NAK, 19, -25, TarHeader.LF_NORMAL, -60, 0, -2, 1, -15, Ascii.ETB, 107, Ascii.DC2, -31, 109, 2, -10, -1, -4, 20, TarHeader.LF_CONTIG, Ascii.EM, -48, Ascii.NAK, 19, -25, Ascii.DLE, -28, 0, -2, -31, -86, -41, 6, -32, -8, -28, 0, -3, 38, -66, 111, -6, -6, Ascii.DLE, Ascii.ETB, -3, 110, 39, -72, 20, 107, -6, -26, Ascii.SUB, -29, Ascii.SYN, 105, -49, 105, Ascii.DLE, -4, Ascii.ETB, 36, -41, Ascii.SYN, -52, 4, -50, 111, 56, -45, -4, 110, 41};
    }
}
