package com.huawei.digitalpayment.common.theme.viewmodel;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class TipsThemeViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    static TipsThemeViewModel ShareDataUIState;
    private static long component1;
    private static char component2;
    private static int component3;
    private static int copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {69, -38, -90, 81};
    private static final int $$b = 45;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component4 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, int r7, byte r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.common.theme.viewmodel.TipsThemeViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r8 = r8 * 3
            int r1 = r8 + 1
            int r7 = 99 - r7
            int r6 = r6 * 4
            int r6 = 3 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r6 = r6 + 1
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.viewmodel.TipsThemeViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(byte, int, byte):java.lang.String");
    }

    private static void a(char[] cArr, char[] cArr2, char c2, int i, char[] cArr3, Object[] objArr) throws Throwable {
        char c3;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        int i5 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        int i6 = $10 + 3;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (iNotificationSideChannel.copydefault < length3) {
            int i8 = $11 + 85;
            $10 = i8 % 128;
            int i9 = i8 % i3;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int iRed = 4037 - Color.red(i5);
                    int iResolveSize = 31 - View.resolveSize(i5, i5);
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', i5, i5) + 19182);
                    byte b2 = (byte) i5;
                    byte b3 = b2;
                    String str$$c = $$c(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i5] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iRed, iResolveSize, cIndexOf, 1912513118, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    int capsMode = TextUtils.getCapsMode("", i5, i5) + 7567;
                    int iRgb = (-16777205) - Color.rgb(i5, i5, i5);
                    char c4 = (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i5] = Object.class;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(capsMode, iRgb, c4, 2006389106, false, "e", clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                int i10 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i10);
                objArr4[i5] = iNotificationSideChannel;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    int minimumFlingVelocity = 2459 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int iMyTid = (Process.myTid() >> 22) + 28;
                    char threadPriority = (char) ((Process.getThreadPriority(i5) + 20) >> 6);
                    byte b4 = (byte) i5;
                    byte b5 = (byte) (b4 + 1);
                    String str$$c2 = $$c(b4, b5, (byte) (b5 - 1));
                    c3 = 3;
                    Class[] clsArr3 = new Class[3];
                    clsArr3[i5] = Object.class;
                    clsArr3[1] = Integer.TYPE;
                    clsArr3[2] = Integer.TYPE;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(minimumFlingVelocity, iMyTid, threadPriority, 931716605, false, str$$c2, clsArr3);
                } else {
                    c3 = 3;
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                int i11 = cArr4[iIntValue2] * 32718;
                Object[] objArr5 = new Object[2];
                objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                objArr5[i5] = Integer.valueOf(i11);
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    int i12 = 7568 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int iMyPid = (Process.myPid() >> 22) + 11;
                    char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                    i2 = 2;
                    Class[] clsArr4 = new Class[2];
                    clsArr4[i5] = Integer.TYPE;
                    clsArr4[1] = Integer.TYPE;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i12, iMyPid, edgeSlop, 475017187, false, "d", clsArr4);
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) ((((long) ((int) (((long) component3) ^ (-3780477796495014671L)))) ^ (((long) (cArr4[iIntValue2] ^ cArr[iNotificationSideChannel.copydefault])) ^ (component1 ^ (-3780477796495014671L)))) ^ ((long) ((char) (((long) component2) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                i3 = i2;
                i5 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static {
        copydefault = 0;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(new char[]{13435, 22148, 46429, 32862, 49385, 4983, 24056, 9513, 39385, 39071, 25049, 34880, 36689, 28625, 42703, 60212, 48132, 21754, 54805, 13665, 54467, 26780, 44617, 44458, 4601, 13375, 47197, 38150, 57108, 8341, 21933, 37502, 21677, 37019, 57940, 38832, 48820, 40092, 47618, 17307, 62947, 4440, 45910, 17689, 4517, 10735, 62880, 15125, 43711, '6', 49378, 43994, 18799, 10377, 11592, 23781, 27651, 51767, 17752, 47456, 56236, 56798, 26579, 3280, 1147, 1174, 11138}, new char[]{47605, 47279, 61368, 11778}, (char) (752 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (-1195855943) + (ViewConfiguration.getFadingEdgeLength() >> 16), new char[]{0, 0, 0, 0}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component4 + 33;
        copydefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void ShareDataUIState() {
        component1 = -3780477796495014671L;
        component3 = 540766951;
        component2 = (char) 50417;
    }
}
