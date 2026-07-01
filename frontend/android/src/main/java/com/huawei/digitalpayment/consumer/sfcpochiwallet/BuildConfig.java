package com.huawei.digitalpayment.consumer.sfcpochiwallet;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getActiveNotifications;

public final class BuildConfig {
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String LIBRARY_PACKAGE_NAME;
    private static int ShareDataUIState;
    private static int[] component3;
    private static final byte[] $$a = {108, -1, -36, 99};
    private static final int $$b = 183;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, short r7, int r8) {
        /*
            int r6 = r6 * 3
            int r0 = 1 - r6
            int r8 = 107 - r8
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcpochiwallet.BuildConfig.$$a
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            r3 = r1[r7]
            r5 = r3
            r3 = r8
            r8 = r5
        L29:
            int r8 = -r8
            int r7 = r7 + 1
            int r8 = r8 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcpochiwallet.BuildConfig.$$c(byte, short, int):java.lang.String");
    }

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        int[] iArr2;
        int i2 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = component3;
        int i3 = 684241640;
        int i4 = 1;
        int i5 = 0;
        if (iArr3 != null) {
            int i6 = $11;
            int i7 = i6 + 57;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i9 = i6 + 107;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 0;
            while (i11 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i11])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i3);
                    if (objCopydefault == null) {
                        int i12 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 4390;
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 37;
                        char cArgb = (char) Color.argb(0, 0, 0, 0);
                        byte b2 = $$a[1];
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i12, iCombineMeasuredStates, cArgb, -309236339, false, $$c(b3, b3, (byte) (-b2)), new Class[]{Integer.TYPE});
                    }
                    iArr4[i11] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i11++;
                    i3 = 684241640;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = component3;
        if (iArr6 != null) {
            int i13 = $10;
            int i14 = i13 + 111;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i16 = i13 + 41;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            int i18 = 0;
            while (i18 < length3) {
                Object[] objArr3 = new Object[i4];
                objArr3[i5] = Integer.valueOf(iArr6[i18]);
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault2 == null) {
                    int i19 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 4390;
                    int i20 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36;
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', i5, i5) + 1);
                    byte b4 = $$a[i4];
                    byte b5 = (byte) (b4 + 1);
                    iArr2 = iArr6;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i19, i20, cIndexOf, -309236339, false, $$c(b5, b5, (byte) (-b4)), new Class[]{Integer.TYPE});
                } else {
                    iArr2 = iArr6;
                }
                iArr7[i18] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                i18++;
                iArr6 = iArr2;
                i4 = 1;
                i5 = 0;
            }
            iArr6 = iArr7;
        }
        int i21 = i5;
        System.arraycopy(iArr6, i21, iArr5, i21, length2);
        getactivenotifications.component1 = i21;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            int i22 = 0;
            while (i22 < 16) {
                int i23 = $10 + 115;
                $11 = i23 % 128;
                int i24 = i23 % 2;
                getactivenotifications.ShareDataUIState ^= iArr5[i22];
                Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault3 == null) {
                    int offsetAfter = 2968 - TextUtils.getOffsetAfter("", 0);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 17;
                    char threadPriority = (char) (49871 - ((Process.getThreadPriority(0) + 20) >> 6));
                    byte b6 = (byte) ($$a[1] + 1);
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(offsetAfter, iLastIndexOf, threadPriority, 462826032, false, $$c(b6, b7, (byte) (b7 + 3)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i22++;
                int i25 = $11 + 109;
                $10 = i25 % 128;
                int i26 = i25 % 2;
            }
            int i27 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i27;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i28 = getactivenotifications.ShareDataUIState;
            int i29 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr5);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr5 = {getactivenotifications, getactivenotifications};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault4 == null) {
                int iBlue = Color.blue(0) + 2944;
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 24;
                char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 27636);
                byte b8 = (byte) ($$a[1] + 1);
                byte b9 = b8;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iBlue, keyRepeatTimeout, c2, -1616366948, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        ShareDataUIState = 0;
        component1();
        Object[] objArr = new Object[1];
        a(48 - TextUtils.lastIndexOf("", '0', 0), new int[]{1945364000, -2104043497, 2076918843, -2106252019, 400422370, 117334876, 1041615848, 55298372, 1048822752, 1743300931, -1316149924, -1131986186, 1165334891, -1389607480, 1551273479, 212420618, 169218546, 1480894769, 961941803, -1093324973, 1122105516, -819345096, -1382298207, -912928019, -1172282565, 1211545907}, objArr);
        LIBRARY_PACKAGE_NAME = ((String) objArr[0]).intern();
        int i = component2 + 33;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            int i2 = 45 / 0;
        }
    }

    static void component1() {
        component3 = new int[]{-1415652068, 746195165, 1537238429, 377267026, 180751808, -2028566167, 1050005489, -665188532, 485607411, -507001699, 1844008120, 429604376, 991797862, -311020776, 1471896163, 5944272, -1243496681, -256205682};
    }
}
