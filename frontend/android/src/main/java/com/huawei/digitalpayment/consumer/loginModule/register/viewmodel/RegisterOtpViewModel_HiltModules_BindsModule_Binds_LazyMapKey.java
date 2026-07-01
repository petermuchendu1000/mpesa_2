package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
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

public final class RegisterOtpViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static byte[] ShareDataUIState;
    private static int component1;
    private static int component2;
    static RegisterOtpViewModel component3;
    private static short[] component4;
    private static int copydefault;
    private static int getAsAtTimestamp;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {2, 105, -126, -86};
    private static final int $$b = 100;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int equals = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r7, int r8, short r9) {
        /*
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r8 = r8 * 2
            int r8 = 1 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.RegisterOtpViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r9 = 116 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2b
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = r7 + r3
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.RegisterOtpViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, int, short):java.lang.String");
    }

    private static void a(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        int i5;
        int length;
        byte[] bArr;
        int i6 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(component2)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetBefore("", 0) + 999, 31 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (61685 - View.getDefaultSize(0, 0)), 1874745193, false, $$c(b3, b4, (byte) (b4 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            char c2 = '0';
            if (z) {
                int i7 = $10;
                int i8 = i7 + 75;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                byte[] bArr2 = ShareDataUIState;
                if (bArr2 != null) {
                    int i10 = i7 + 107;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    int i11 = 0;
                    while (i11 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i11])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                        if (objCopydefault2 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "") + 2984, KeyEvent.getDeadChar(0, 0) + 48, (char) (TextUtils.indexOf("", c2) + 54463), -1178636483, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
                        }
                        bArr[i11] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                        i11++;
                        c2 = '0';
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = ShareDataUIState;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(component1)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getTrimmedLength("") + 999, 31 - KeyEvent.getDeadChar(0, 0), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 61685), 1874745193, false, $$c(b7, b8, (byte) (b8 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) component2) ^ 7083766810336261929L)));
                    j = 7083766810336261929L;
                } else {
                    j = 7083766810336261929L;
                    iIntValue = (short) (((short) (((long) component4[i + ((int) (((long) component1) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) component2) ^ 7083766810336261929L)));
                }
            } else {
                j = 7083766810336261929L;
            }
            if (iIntValue > 0) {
                int i12 = ((i + iIntValue) - 2) + ((int) (((long) component1) ^ j));
                if (z) {
                    int i13 = $10 + 31;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    i4 = 1;
                } else {
                    int i15 = $10 + 43;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    i4 = 0;
                }
                getsmalliconid.copydefault = i12 + i4;
                Object[] objArr5 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(copydefault), sb};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault4 == null) {
                    byte b9 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0, 0) + 1698, (ViewConfiguration.getEdgeSlop() >> 16) + 37, (char) TextUtils.getOffsetBefore("", 0), -1454191902, false, $$c(b9, b9, (byte) $$a.length), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = ShareDataUIState;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i17 = 0;
                    while (i17 < length2) {
                        int i18 = $10 + 73;
                        $11 = i18 % 128;
                        if (i18 % 2 == 0) {
                            bArr5[i17] = (byte) (((long) bArr4[i17]) % 7083766810336261929L);
                            i17--;
                        } else {
                            bArr5[i17] = (byte) (((long) bArr4[i17]) ^ 7083766810336261929L);
                            i17++;
                        }
                    }
                    int i19 = $10 + 1;
                    $11 = i19 % 128;
                    int i20 = i19 % 2;
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    if (!(!z2)) {
                        int i21 = $11 + 79;
                        $10 = i21 % 128;
                        if (i21 % 2 != 0) {
                            byte[] bArr6 = ShareDataUIState;
                            getsmalliconid.copydefault = getsmalliconid.copydefault;
                            i5 = getsmalliconid.component3 * (((byte) (((byte) (((long) bArr6[r8]) | 7083766810336261929L)) / s)) ^ b2);
                        } else {
                            byte[] bArr7 = ShareDataUIState;
                            getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                            i5 = getsmalliconid.component3 + (((byte) (((byte) (((long) bArr7[r8]) ^ 7083766810336261929L)) + s)) ^ b2);
                        }
                        getsmalliconid.component1 = (char) i5;
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
        getAsAtTimestamp = 1;
        component1();
        Object[] objArr = new Object[1];
        a((-1559330868) - Drawable.resolveOpacity(0, 0), AndroidCharacter.getMirror('0') - 'i', (short) (ViewConfiguration.getScrollBarSize() >> 8), (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1323772363 - Color.rgb(0, 0, 0), objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = equals + 103;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    static void component1() {
        component1 = -1388644579;
        component2 = -238323951;
        copydefault = 1104388529;
        ShareDataUIState = new byte[]{TarHeader.LF_CONTIG, 46, 40, -36, Ascii.VT, -1, 59, -43, 58, -49, -43, Ascii.FF, -12, 36, -40, 40, 35, 43, 43, 58, 13, -21, 46, 40, -36, 43, -33, 59, -43, -38, 97, -107, 36, -40, 40, 35, 43, 43, -38, 109, -32, -48, -34, 56, -36, Ascii.VT, -10, 44, 43, -47, 42, Ascii.ETB, -107, 36, -47, -47, 43, 44, -42, 37, Ascii.FS, -109, 47, 32, -47, -35, TarHeader.LF_LINK, -40, 45, 34, -60, 34, 43, -41, 44, Ascii.US, -20, 45, -57, 63, -59, 36, 19, -24, -41, 37};
    }
}
