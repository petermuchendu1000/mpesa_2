package com.huawei.digitalpayment.common.theme.viewmodel;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getSmallIconId;

public final class ThemePreviewViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static int ShareDataUIState;
    private static byte[] component1;
    private static int component2;
    private static int component3;
    private static int component4;
    static ThemePreviewViewModel copydefault;
    private static short[] equals;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {98, -3, -80, -4};
    private static final int $$b = 161;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getRequestBeneficiariesState = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, int r6, short r7) {
        /*
            int r7 = r7 * 2
            int r0 = 1 - r7
            int r5 = r5 + 4
            int r6 = r6 + 112
            byte[] r1 = com.huawei.digitalpayment.common.theme.viewmodel.ThemePreviewViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L14
            r4 = r7
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r5 = r5 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r1[r5]
        L26:
            int r6 = r6 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.viewmodel.ThemePreviewViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(byte, int, short):java.lang.String");
    }

    private static void a(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        int i5 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(component3)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            int i6 = -1;
            float f = 0.0f;
            if (objCopydefault == null) {
                byte b3 = (byte) (-1);
                byte b4 = (byte) (-b3);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(999 - KeyEvent.getDeadChar(0, 0), 32 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (61685 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 1874745193, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $11 + 23;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 == 0) {
                j = 7083766810336261929L;
            } else {
                byte[] bArr = component1;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = $10 + 73;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = 3 % 5;
                    }
                    int i11 = 0;
                    while (i11 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault2 == null) {
                                int keyRepeatTimeout = 2984 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                int i12 = (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 48;
                                char cRgb = (char) ((-16722754) - Color.rgb(0, 0, 0));
                                byte b5 = (byte) i6;
                                byte length2 = (byte) $$a.length;
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatTimeout, i12, cRgb, -1178636483, false, $$c(b5, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i11] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                            i11++;
                            i6 = -1;
                            f = 0.0f;
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
                    byte[] bArr3 = component1;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(component2)};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                        if (objCopydefault3 == null) {
                            byte b6 = (byte) (-1);
                            byte b7 = (byte) (-b6);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(999 - (ViewConfiguration.getFadingEdgeLength() >> 16), MotionEvent.axisFromString("") + 32, (char) (61685 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 1874745193, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) component3) ^ 7083766810336261929L)));
                        j = 7083766810336261929L;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    j = 7083766810336261929L;
                    iIntValue = (short) (((short) (((long) equals[i + ((int) (((long) component2) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) component3) ^ 7083766810336261929L)));
                }
            }
            if (iIntValue > 0) {
                getsmalliconid.copydefault = ((i + iIntValue) - 2) + ((int) (((long) component2) ^ j)) + i4;
                Object[] objArr5 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(ShareDataUIState), sb};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) (-1);
                    byte b9 = (byte) (b8 + 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1697 - TextUtils.getOffsetBefore("", 0), 37 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1454191902, false, $$c(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = component1;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    int i13 = 0;
                    while (i13 < length3) {
                        int i14 = $11 + 117;
                        $10 = i14 % 128;
                        if (i14 % 2 != 0) {
                            bArr5[i13] = (byte) (((long) bArr4[i13]) + 7083766810336261929L);
                            i13 >>= 1;
                        } else {
                            bArr5[i13] = (byte) (((long) bArr4[i13]) ^ 7083766810336261929L);
                            i13++;
                        }
                    }
                    int i15 = $11 + 81;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    bArr4 = bArr5;
                }
                boolean z = !(bArr4 == null);
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    if (!z) {
                        short[] sArr = equals;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        byte[] bArr6 = component1;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    }
                    sb.append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    getsmalliconid.component2++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    static {
        component4 = 0;
        component1();
        Object[] objArr = new Object[1];
        a((-1943210958) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (-63) - (ViewConfiguration.getWindowTouchSlop() >> 8), (short) TextUtils.getTrimmedLength(""), (byte) (52 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 598426181, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = getRequestBeneficiariesState + 111;
        component4 = i % 128;
        if (i % 2 != 0) {
            int i2 = 94 / 0;
        }
    }

    static void component1() {
        component2 = -2112324378;
        component3 = -238323945;
        ShareDataUIState = -765446783;
        component1 = new byte[]{33, Ascii.SUB, Ascii.FS, -24, 63, -53, Ascii.SI, -31, Ascii.SO, -62, Ascii.SI, -31, -18, Ascii.FF, -18, 63, -10, -27, Ascii.NAK, -32, 9, 59, -33, Ascii.SUB, Ascii.FS, -24, Ascii.US, -21, Ascii.SI, -31, -18, 85, -44, -27, Ascii.NAK, -32, -23, 91, -35, -30, Ascii.US, Ascii.GS, -29, 17, 40, -89, Ascii.ESC, 20, -27, -23, 5, -20, Ascii.EM, Ascii.SYN, -16, Ascii.SYN, Ascii.US, -29, Ascii.CAN, 43, -40, Ascii.EM, -13, Ascii.VT, -15, Ascii.DLE, 39, -36, -29, 17};
    }
}
