package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getSmallIconId;
import kotlin.io.encoding.Base64;

public final class SplashViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    static SplashViewModel ShareDataUIState;
    private static int component1;
    private static int component2;
    private static byte[] component3;
    private static int component4;
    private static int copydefault;
    private static short[] getRequestBeneficiariesState;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {73, 121, -48, -56};
    private static final int $$b = 103;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getAsAtTimestamp = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r7, int r8, int r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.basicUi.viewmodel.SplashViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r8 = r8 * 3
            int r8 = 1 - r8
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r9 = 116 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r9 = r7
            r3 = r8
            r4 = r2
            goto L29
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L29:
            int r7 = -r7
            int r9 = r9 + 1
            int r7 = r7 + r3
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basicUi.viewmodel.SplashViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(short, int, int):java.lang.String");
    }

    private static void a(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        int length;
        byte[] bArr;
        int i5 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(copydefault)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.keyCodeFromString("") + 999, 31 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (KeyEvent.keyCodeFromString("") + 61685), 1874745193, false, $$c(b3, b4, (byte) (b4 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                int i6 = $11 + 91;
                int i7 = i6 % 128;
                $10 = i7;
                int i8 = i6 % 2;
                byte[] bArr2 = component3;
                if (bArr2 != null) {
                    int i9 = i7 + 91;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    for (int i10 = 0; i10 < length; i10++) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i10])};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault2 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2984 - (Process.myPid() >> 22), TextUtils.indexOf((CharSequence) "", '0', 0) + 49, (char) (View.resolveSizeAndState(0, 0, 0) + 54462), -1178636483, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
                            }
                            bArr[i10] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = component3;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(component1)};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                        if (objCopydefault3 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1000 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 31 - View.resolveSizeAndState(0, 0, 0), (char) (61685 - (Process.myTid() >> 22)), 1874745193, false, $$c(b7, b8, (byte) (b8 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) copydefault) ^ 7083766810336261929L)));
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
                    iIntValue = (short) (((short) (((long) getRequestBeneficiariesState[i + ((int) (((long) component1) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) copydefault) ^ 7083766810336261929L)));
                }
            } else {
                j = 7083766810336261929L;
            }
            if (iIntValue > 0) {
                int i11 = ((i + iIntValue) - 2) + ((int) (((long) component1) ^ j));
                if (!(!z)) {
                    int i12 = $11 + 57;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                getsmalliconid.copydefault = i11 + i4;
                Object[] objArr5 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(component2), sb};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault4 == null) {
                    byte b9 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1696, 37 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (Process.myPid() >> 22), -1454191902, false, $$c(b9, b9, (byte) $$a.length), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = component3;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i14 = 0; i14 < length2; i14++) {
                        bArr5[i14] = (byte) (((long) bArr4[i14]) ^ 7083766810336261929L);
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = component3;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = getRequestBeneficiariesState;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
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
        a(KeyEvent.getDeadChar(0, 0) - 1198007998, ImageFormat.getBitsPerPixel(0) - 24, (short) Color.alpha(0), (byte) (ImageFormat.getBitsPerPixel(0) + 1), 639749471 - (Process.myTid() >> 22), objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = getAsAtTimestamp + 97;
        component4 = i % 128;
        int i2 = i % 2;
    }

    static void component1() {
        component1 = -1230810729;
        copydefault = -238323852;
        component2 = 672482349;
        component3 = new byte[]{46, 40, -36, Ascii.VT, -1, 59, -43, 58, -57, -36, 59, -36, -43, TarHeader.LF_BLK, Ascii.FF, -21, 46, 40, -36, 43, -33, 59, -43, -38, 97, -20, Base64.padSymbol, -37, -45, -33, 59, -42, Ascii.GS, -107, 36, -47, -47, 43, 44, -42, 37, Ascii.FS, -109, 47, 32, -47, -35, TarHeader.LF_LINK, -40, 45, 34, -60, 34, 43, -41, 44, Ascii.US, -20, 45, -57, 63, -59, 36, 19, -24, -41, 37, 41};
    }
}
