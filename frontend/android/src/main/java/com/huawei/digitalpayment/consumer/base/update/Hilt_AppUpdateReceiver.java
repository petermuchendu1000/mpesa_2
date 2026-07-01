package com.huawei.digitalpayment.consumer.base.update;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import dagger.hilt.android.internal.managers.BroadcastReceiverComponentManager;
import dagger.hilt.internal.UnsafeCasts;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelAll;
import kotlin.getSmallIconId;
import org.bouncycastle.crypto.signers.PSSSigner;

public abstract class Hilt_AppUpdateReceiver extends BroadcastReceiver {
    private static int ArtificialStackFrames;
    private static int ShareDataUIState;
    private static int component1;
    private static byte[] component2;
    private static short[] component3;
    private static int copydefault;
    private static char getAsAtTimestamp;
    private static char[] getRequestBeneficiariesState;
    private volatile boolean injected = false;
    private final Object injectedLock = new Object();
    private static final byte[] $$l = {102, Ascii.FF, 98, 84};
    private static final int $$m = 100;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {20, 103, 109, TarHeader.LF_BLK, -12, 2, -3, 1, 1, 9, -9, -6, 66, -12, 2, 63, -51, -11, 3, 7, 1, -1, 1, TarHeader.LF_CHR, -51, -17, 9, -13, 17, -13, 68, PSSSigner.TRAILER_IMPLICIT, 13, -14, 4, -6, 3, Ascii.SI, -2, TarHeader.LF_CONTIG, PSSSigner.TRAILER_IMPLICIT, -3, 7, -6, Ascii.VT, -4, 8, TarHeader.LF_CONTIG, -36, -35, 7, -6, Ascii.VT, -4, 8, Ascii.SI, -15, -13, -1, 10, -6, 1, 43, -37, 3, 2, -8, 6, -13, -12, -1, -9, Ascii.NAK, -1, -1, 5, -20, 9, -8};
    private static final int $$k = 100;
    private static final byte[] $$d = {Ascii.VT, -55, -20, -91, -29, -18, -26, 4, -18, -18, -12, -37, -8, -25, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_LINK, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_SYMLINK, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_NORMAL, -38, -10, -34, -4, Ascii.DLE, -46, -36, 2, -5, -5, -27, -50, 2, -36, -2};
    private static final int $$e = 87;
    private static int equals = 0;
    private static int copy = 0;
    private static int component4 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$n(byte r7, byte r8, short r9) {
        /*
            int r9 = 119 - r9
            byte[] r0 = com.huawei.digitalpayment.consumer.base.update.Hilt_AppUpdateReceiver.$$l
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r8 = r8 * 4
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r9 = r8
            r4 = r2
            goto L28
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L28:
            int r8 = r8 + r3
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.update.Hilt_AppUpdateReceiver.$$n(byte, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(short r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r0 = r5 + 10
            int r7 = r7 * 16
            int r7 = 99 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.base.update.Hilt_AppUpdateReceiver.$$d
            int r6 = 40 - r6
            byte[] r0 = new byte[r0]
            int r5 = r5 + 9
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r6]
        L28:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-17)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.update.Hilt_AppUpdateReceiver.e(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = r8 + 99
            int r0 = r6 + 10
            int r7 = r7 + 4
            byte[] r1 = com.huawei.digitalpayment.consumer.base.update.Hilt_AppUpdateReceiver.$$j
            byte[] r0 = new byte[r0]
            int r6 = r6 + 9
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            int r8 = r8 + 1
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.update.Hilt_AppUpdateReceiver.g(int, int, byte, java.lang.Object[]):void");
    }

    private static void f(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(component1)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 999, 31 - (ViewConfiguration.getTapTimeout() >> 16), (char) (61686 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 1874745193, false, $$n(b3, b4, (byte) (b4 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            char c2 = '0';
            if ((i5 ^ 1) != 1) {
                byte[] bArr = component2;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i6 = 0;
                    while (i6 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault2 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2984 - (ViewConfiguration.getScrollBarSize() >> 8), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 47, (char) (TextUtils.indexOf("", c2) + 54463), -1178636483, false, $$n(b5, b6, (byte) (b6 + 3)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i6] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                            i6++;
                            c2 = '0';
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i7 = $11 + 37;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    byte[] bArr3 = component2;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(ShareDataUIState)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTapTimeout() >> 16) + 999, 30 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) ((-16715531) - Color.rgb(0, 0, 0)), 1874745193, false, $$n(b7, b8, (byte) (b8 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) component1) ^ 7083766810336261929L)));
                } else {
                    iIntValue = (short) (((short) (((long) component3[i + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) component1) ^ 7083766810336261929L)));
                }
            }
            if (iIntValue > 0) {
                int i9 = $10 + 31;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                getsmalliconid.copydefault = ((i + iIntValue) - 2) + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L)) + ((i5 ^ 1) ^ 1);
                Object[] objArr5 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(copydefault), sb};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault4 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = b9;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 1698, 37 - View.MeasureSpec.getSize(0), (char) ((-1) - MotionEvent.axisFromString("")), -1454191902, false, $$n(b9, b10, (byte) (b10 | 7)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = component2;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i11 = 0; i11 < length2; i11++) {
                        int i12 = $10 + 35;
                        $11 = i12 % 128;
                        int i13 = i12 % 2;
                        bArr5[i11] = (byte) (((long) bArr4[i11]) ^ 7083766810336261929L);
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                getsmalliconid.component2 = 1;
                int i14 = $10 + 27;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                while (getsmalliconid.component2 < iIntValue) {
                    if (z) {
                        byte[] bArr6 = component2;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = component3;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    }
                    sb.append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    getsmalliconid.component2++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private static void d(int i, char[] cArr, byte b2, Object[] objArr) throws Throwable {
        int i2;
        char c2;
        Object obj;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = getRequestBeneficiariesState;
        int i6 = 64291;
        Object obj2 = null;
        int i7 = 7;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + i7;
                $10 = i9 % 128;
                if (i9 % i4 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7422 - Color.argb(0, 0, 0, 0), 15 - View.combineMeasuredStates(0, 0), (char) (i6 - View.getDefaultSize(0, 0)), 682917265, false, "v", new Class[]{Integer.TYPE});
                        }
                        cArr3[i8] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i8 %= 0;
                        i4 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i8])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getMode(0) + 7422, AndroidCharacter.getMirror('0') - '!', (char) (KeyEvent.getDeadChar(0, 0) + i6), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i8++;
                    i4 = 2;
                    i6 = 64291;
                }
                i7 = 7;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(getAsAtTimestamp)};
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        char c3 = '\b';
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7422 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 15 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (64291 - ExpandableListView.getPackedPositionType(0L)), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i10 = $10 + 51;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cancelall.component2 = 0;
            while (cancelall.component2 < i2) {
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    c2 = c3;
                    obj = obj2;
                    i3 = 2;
                } else {
                    Object[] objArr5 = new Object[13];
                    objArr5[12] = cancelall;
                    objArr5[11] = Integer.valueOf(cCharValue);
                    objArr5[10] = cancelall;
                    objArr5[9] = cancelall;
                    objArr5[c3] = Integer.valueOf(cCharValue);
                    objArr5[7] = cancelall;
                    objArr5[6] = cancelall;
                    objArr5[5] = Integer.valueOf(cCharValue);
                    objArr5[4] = cancelall;
                    objArr5[3] = cancelall;
                    objArr5[2] = Integer.valueOf(cCharValue);
                    objArr5[1] = cancelall;
                    objArr5[0] = cancelall;
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault4 == null) {
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7117;
                        int maxKeyCode = 14 - (KeyEvent.getMaxKeyCode() >> 16);
                        char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 44463);
                        Class[] clsArr = new Class[13];
                        clsArr[0] = Object.class;
                        clsArr[1] = Object.class;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Object.class;
                        clsArr[4] = Object.class;
                        clsArr[5] = Integer.TYPE;
                        clsArr[6] = Object.class;
                        clsArr[7] = Object.class;
                        clsArr[c3] = Integer.TYPE;
                        clsArr[9] = Object.class;
                        clsArr[10] = Object.class;
                        clsArr[11] = Integer.TYPE;
                        clsArr[12] = Object.class;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(minimumFlingVelocity, maxKeyCode, keyRepeatDelay, 1150140696, false, "x", clsArr);
                    }
                    if (((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue() == cancelall.getAsAtTimestamp) {
                        Object[] objArr6 = new Object[11];
                        objArr6[10] = cancelall;
                        objArr6[9] = Integer.valueOf(cCharValue);
                        objArr6[c3] = cancelall;
                        objArr6[7] = Integer.valueOf(cCharValue);
                        objArr6[6] = Integer.valueOf(cCharValue);
                        objArr6[5] = cancelall;
                        objArr6[4] = cancelall;
                        objArr6[3] = Integer.valueOf(cCharValue);
                        objArr6[2] = Integer.valueOf(cCharValue);
                        objArr6[1] = cancelall;
                        objArr6[0] = cancelall;
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault5 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            c2 = '\b';
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2943 - MotionEvent.axisFromString(""), 24 - TextUtils.getOffsetAfter("", 0), (char) (View.combineMeasuredStates(0, 0) + 27637), 794909189, false, $$n(b3, b4, b4), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c2 = c3;
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objCopydefault5).invoke(null, objArr6)).intValue();
                        int i12 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr2[i12];
                    } else {
                        c2 = c3;
                        obj = null;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i13 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i14 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[i13];
                            cArr4[cancelall.component2 + 1] = cArr2[i14];
                        } else {
                            int i15 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i16 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr2[i15];
                            cArr4[cancelall.component2 + 1] = cArr2[i16];
                            int i17 = $10 + 95;
                            $11 = i17 % 128;
                            i3 = 2;
                            int i18 = i17 % 2;
                        }
                    }
                    i3 = 2;
                }
                cancelall.component2 += i3;
                obj2 = obj;
                c3 = c2;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            int i20 = $11 + 71;
            $10 = i20 % 128;
            int i21 = i20 % 2;
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0c8d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x083d  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceive(android.content.Context r36, android.content.Intent r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.update.Hilt_AppUpdateReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    protected void inject(Context context) {
        if (this.injected) {
            return;
        }
        synchronized (this.injectedLock) {
            if (!this.injected) {
                ((AppUpdateReceiver_GeneratedInjector) BroadcastReceiverComponentManager.generatedComponent(context)).injectAppUpdateReceiver((AppUpdateReceiver) UnsafeCasts.unsafeCast(this));
                this.injected = true;
            }
        }
    }

    static {
        ArtificialStackFrames = 1;
        component3();
        ShareDataUIState = -328179994;
        component1 = -238323925;
        copydefault = 1020472130;
        component2 = new byte[]{Ascii.SUB, Ascii.FF, -94, Ascii.SO, 115, 123, 84, Ascii.SI, 94, 124, -89, -62, 87, Ascii.SUB, Ascii.FF, -94, Ascii.SO, 115, 122, -83, 80, 114, 10, 0, 92, 82, Ascii.SO, 115, 111, -93, Ascii.EM, -96, 13, 94, -70, 121, 84, -93, 126, 19, 92, 82, Ascii.SO, 83, Ascii.SI, -93, Ascii.EM, 0, -19, -39, 86, 2, 82, -85, 83, 83, 0, -111, 106, Ascii.SUB, Ascii.FF, -94, Ascii.SO, 115, 100, 94, 83, Ascii.GS, 80, 71, -39, 86, Ascii.GS, Ascii.GS, 83, 94, 4, -87, 78, -37, 95, -86, Ascii.GS, 1, -67, 2, 81, -88, TarHeader.LF_FIFO, -88, 83, 7, 94, 79, Ascii.RS, 81, TarHeader.LF_CONTIG, -81, 9, 86, 91, Ascii.DC2, 7, -87, 41};
        int i = equals + 103;
        ArtificialStackFrames = i % 128;
        int i2 = i % 2;
    }

    static void component3() {
        getRequestBeneficiariesState = new char[]{2024, 2030, 1987, 2025, 2038, 2035, 2026, 2018, 2034, 2029, 2031, 2021, 1992, 2019, 2017, 1966, 2032, 2041, 2023, 2002, 2027, 2028, 2036, 2003, 2020};
        getAsAtTimestamp = (char) 12831;
    }
}
