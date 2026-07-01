package com.huawei.digitalpayment.consumer.basicModule;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getSmallIconId;

public final class BuildConfig {
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String LIBRARY_PACKAGE_NAME;
    private static byte[] ShareDataUIState;
    private static short[] component1;
    private static int component2;
    private static int component3;
    private static int copydefault;
    private static int getAsAtTimestamp;
    private static final byte[] $$a = {70, -47, -65, TarHeader.LF_BLK};
    private static final int $$b = 131;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getRequestBeneficiariesState = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, short r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.basicModule.BuildConfig.$$a
            int r6 = r6 + 112
            int r8 = r8 * 2
            int r1 = 1 - r8
            int r7 = r7 * 3
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2b:
            int r6 = -r6
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basicModule.BuildConfig.$$c(int, byte, short):java.lang.String");
    }

    private static void a(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4 = 2;
        int i5 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(component2)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 999;
                int i6 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31;
                char cBlue = (char) (Color.blue(0) + 61685);
                byte b3 = (byte) ($$b & 5);
                byte b4 = (byte) (b3 - 1);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(maximumDrawingCacheSize, i6, cBlue, 1874745193, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            int i7 = iIntValue == -1 ? 1 : 0;
            if (i7 != 0) {
                byte[] bArr = ShareDataUIState;
                if (bArr != null) {
                    int i8 = $10 + 91;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i10 = 0;
                    while (i10 < length) {
                        int i11 = $10 + 99;
                        $11 = i11 % 128;
                        int i12 = i11 % i4;
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault2 == null) {
                                int keyRepeatTimeout = 2984 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 48;
                                char pressedStateDuration = (char) (54462 - (ViewConfiguration.getPressedStateDuration() >> 16));
                                byte length2 = (byte) $$a.length;
                                byte b5 = (byte) (length2 - 4);
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatTimeout, keyRepeatDelay, pressedStateDuration, -1178636483, false, $$c(length2, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr2[i10] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                            i10++;
                            i4 = 2;
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
                    byte[] bArr3 = ShareDataUIState;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(component3)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault3 == null) {
                        int i13 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 998;
                        int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 31;
                        char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 61685);
                        byte b6 = (byte) ($$b & 5);
                        byte b7 = (byte) (b6 - 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i13, maximumDrawingCacheSize2, threadPriority, 1874745193, false, $$c(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) component2) ^ 7083766810336261929L)));
                } else {
                    iIntValue = (short) (((short) (((long) component1[i + ((int) (((long) component3) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) component2) ^ 7083766810336261929L)));
                }
            }
            if (iIntValue > 0) {
                int i14 = $11 + 17;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                getsmalliconid.copydefault = ((i + iIntValue) - 2) + ((int) (((long) component3) ^ 7083766810336261929L)) + i7;
                Object[] objArr5 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(copydefault), sb};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0, 0) + 1697, 36 - TextUtils.indexOf((CharSequence) "", '0'), (char) Color.argb(0, 0, 0, 0), -1454191902, false, $$c(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = ShareDataUIState;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    for (int i16 = 0; i16 < length3; i16++) {
                        int i17 = $11 + 51;
                        $10 = i17 % 128;
                        int i18 = i17 % 2;
                        bArr5[i16] = (byte) (((long) bArr4[i16]) ^ 7083766810336261929L);
                    }
                    int i19 = $10 + 69;
                    $11 = i19 % 128;
                    int i20 = i19 % 2;
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    z = true;
                } else {
                    int i21 = $11 + 55;
                    $10 = i21 % 128;
                    int i22 = i21 % 2;
                    z = false;
                }
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    int i23 = $10 + 125;
                    int i24 = i23 % 128;
                    $11 = i24;
                    int i25 = i23 % 2;
                    if (z) {
                        int i26 = i24 + 117;
                        $10 = i26 % 128;
                        int i27 = i26 % 2;
                        byte[] bArr6 = ShareDataUIState;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r4]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = component1;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r4]) ^ 7083766810336261929L)) + s)) ^ b2));
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

    static {
        getAsAtTimestamp = 1;
        component3();
        Object[] objArr = new Object[1];
        a((Process.myPid() >> 22) + 1432162899, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 79, (short) (TextUtils.lastIndexOf("", '0', 0) + 103), (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 111), (ViewConfiguration.getJumpTapTimeout() >> 16) + 654697515, objArr);
        LIBRARY_PACKAGE_NAME = ((String) objArr[0]).intern();
        int i = getRequestBeneficiariesState + 11;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    static void component3() {
        component3 = 1533647492;
        component2 = -238323868;
        copydefault = 691104529;
        ShareDataUIState = new byte[]{-56, 43, 41, TarHeader.LF_CHR, -41, 100, 60, 44, 40, TarHeader.LF_BLK, 33, Ascii.SYN, -18, Ascii.US, 42, 42, 4, 7, 33, Ascii.RS, Ascii.ETB, -20, Ascii.CAN, Ascii.ESC, 42, -42, 10, -45, 6, Ascii.GS, 63, Ascii.GS, 4, 32, 7, 104, -57, 6, TarHeader.LF_NORMAL, 8, 62, Ascii.US, 108, -61, 32, Ascii.RS};
    }
}
