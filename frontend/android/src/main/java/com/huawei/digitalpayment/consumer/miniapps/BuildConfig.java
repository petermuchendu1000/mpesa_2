package com.huawei.digitalpayment.consumer.miniapps;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
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
    private static short[] ShareDataUIState;
    private static int component1;
    private static byte[] component2;
    private static int component3;
    private static int copy;
    private static int copydefault;
    private static final byte[] $$a = {117, -24, -14, 98};
    private static final int $$b = 169;
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
    private static java.lang.String $$c(byte r5, int r6, byte r7) {
        /*
            int r7 = r7 * 4
            int r0 = 1 - r7
            int r6 = r6 + 4
            int r5 = 116 - r5
            byte[] r1 = com.huawei.digitalpayment.consumer.miniapps.BuildConfig.$$a
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
            byte r4 = (byte) r5
            int r6 = r6 + 1
            r0[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r1[r6]
        L26:
            int r5 = r5 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.miniapps.BuildConfig.$$c(byte, int, byte):java.lang.String");
    }

    private static void a(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(component3)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                byte b3 = (byte) 3;
                byte b4 = (byte) (b3 - 4);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(999 - TextUtils.indexOf("", ""), 31 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (61685 - Drawable.resolveOpacity(0, 0)), 1874745193, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object obj = null;
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if (i5 != 0) {
                int i6 = $11 + 123;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                byte[] bArr = component2;
                long j = 0;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i7 = 0;
                    while (i7 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                        if (objCopydefault2 == null) {
                            int maximumFlingVelocity = 2984 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 48;
                            char c2 = (char) ((Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 54461);
                            byte b5 = (byte) 0;
                            byte b6 = (byte) (b5 - 1);
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(maximumFlingVelocity, iCombineMeasuredStates, c2, -1178636483, false, $$c(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i7] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                        i7++;
                        j = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i8 = $11 + 47;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    byte[] bArr3 = component2;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(copydefault)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault3 == null) {
                        byte b7 = (byte) 3;
                        byte b8 = (byte) (b7 - 4);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "") + 999, 32 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (61685 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 1874745193, false, $$c(b7, b8, (byte) (b8 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) component3) ^ 7083766810336261929L)));
                } else {
                    iIntValue = (short) (((short) (((long) ShareDataUIState[i + ((int) (((long) copydefault) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) component3) ^ 7083766810336261929L)));
                }
            }
            if (iIntValue > 0) {
                getsmalliconid.copydefault = ((i + iIntValue) - 2) + ((int) (((long) copydefault) ^ 7083766810336261929L)) + i5;
                Object[] objArr5 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(component1), sb};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault4 == null) {
                    int iIndexOf = 1696 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 37;
                    char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    byte length2 = (byte) $$a.length;
                    byte b9 = (byte) (length2 - 5);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, tapTimeout, minimumFlingVelocity, -1454191902, false, $$c(length2, b9, (byte) (b9 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = component2;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    int i10 = 0;
                    while (i10 < length3) {
                        int i11 = $10 + 61;
                        $11 = i11 % 128;
                        if (i11 % 2 == 0) {
                            bArr5[i10] = (byte) (((long) bArr4[i10]) - 7083766810336261929L);
                        } else {
                            bArr5[i10] = (byte) (((long) bArr4[i10]) ^ 7083766810336261929L);
                            i10++;
                        }
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i12 = $10 + 117;
                    int i13 = i12 % 128;
                    $11 = i13;
                    z = !(i12 % 2 == 0);
                    int i14 = i13 + 57;
                    $10 = i14 % 128;
                    if (i14 % 2 != 0) {
                        int i15 = 3 / 2;
                    }
                } else {
                    z = false;
                }
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    if (z) {
                        byte[] bArr6 = component2;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = ShareDataUIState;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    }
                    sb.append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    getsmalliconid.component2++;
                }
            }
            String string = sb.toString();
            int i16 = $10 + 107;
            $11 = i16 % 128;
            if (i16 % 2 != 0) {
                objArr[0] = string;
            } else {
                int i17 = 20 / 0;
                objArr[0] = string;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static {
        copy = 0;
        component1();
        Object[] objArr = new Object[1];
        a(505051728 - (ViewConfiguration.getEdgeSlop() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 29, (short) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1723193284, objArr);
        LIBRARY_PACKAGE_NAME = ((String) objArr[0]).intern();
        int i = getRequestBeneficiariesState + 75;
        copy = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component1() {
        copydefault = 271512217;
        component3 = -238323932;
        component1 = 1753309110;
        component2 = new byte[]{42, 41, 38, -47, -46, 44, -43, Ascii.SYN, -107, 36, -47, -47, 43, 44, -42, 37, Ascii.FS, -109, 47, 32, -47, -35, TarHeader.LF_LINK, -40, 45, 34, -60, 34, 43, -41, 44, Ascii.US, -20, 45, -57, 63, -59, 36, 19, -24, -41, 37, 41};
    }
}
