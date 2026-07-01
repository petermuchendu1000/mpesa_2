package com.huawei.digitalpayment.common.theme.viewmodel;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getActiveNotifications;

public final class RecentMiniAppViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    static RecentMiniAppViewModel component1;
    private static int[] component3;
    private static int copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {119, -40, Ascii.DLE, 123};
    private static final int $$b = 184;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, int r8) {
        /*
            int r7 = r7 * 2
            int r0 = 1 - r7
            byte[] r1 = com.huawei.digitalpayment.common.theme.viewmodel.RecentMiniAppViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r6 = 107 - r6
            int r8 = r8 * 2
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L29:
            int r8 = -r8
            int r3 = r3 + 1
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.viewmodel.RecentMiniAppViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(short, short, int):java.lang.String");
    }

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        String str;
        String str2 = "";
        int i2 = 2;
        int i3 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = component3;
        int i4 = 684241640;
        int i5 = 16;
        int i6 = 0;
        int i7 = 1;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 93;
                $11 = i9 % 128;
                if (i9 % i2 == 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i6] = Integer.valueOf(iArr2[i8]);
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4);
                        if (objCopydefault == null) {
                            byte b2 = (byte) 1;
                            byte b3 = (byte) (b2 - 1);
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> i5) + 4391, ((Process.getThreadPriority(i6) + 20) >> 6) + 37, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), -309236339, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        iArr3[i8] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i8])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 1;
                        byte b5 = (byte) (b4 - 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4391 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 37 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ExpandableListView.getPackedPositionChild(0L) + 1), -309236339, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    i8++;
                }
                i2 = 2;
                i4 = 684241640;
                i5 = 16;
                i6 = 0;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = component3;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                Object[] objArr4 = new Object[i7];
                objArr4[0] = Integer.valueOf(iArr5[i10]);
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault3 == null) {
                    int iAxisFromString = MotionEvent.axisFromString(str2) + 4392;
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 37;
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) str2, '0') + i7);
                    byte b6 = (byte) i7;
                    byte b7 = (byte) (b6 - 1);
                    str = str2;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iAxisFromString, doubleTapTimeout, cIndexOf, -309236339, false, $$c(b6, b7, b7), new Class[]{Integer.TYPE});
                } else {
                    str = str2;
                }
                iArr6[i10] = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                i10++;
                str2 = str;
                i7 = 1;
            }
            iArr5 = iArr6;
        }
        char c2 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        getactivenotifications.component1 = 0;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[c2] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr4);
            int i11 = 0;
            for (int i12 = 16; i11 < i12; i12 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr4[i11];
                Object[] objArr5 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 3;
                    byte b9 = (byte) (b8 - 3);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2968 - Color.alpha(0), 17 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 49871), 462826032, false, $$c(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i11++;
            }
            int i13 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i13;
            getactivenotifications.component2 ^= iArr4[16];
            getactivenotifications.ShareDataUIState ^= iArr4[17];
            int i14 = getactivenotifications.ShareDataUIState;
            int i15 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr4);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr6 = {getactivenotifications, getactivenotifications};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault5 == null) {
                byte b10 = (byte) 0;
                byte b11 = b10;
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2944 - (ViewConfiguration.getJumpTapTimeout() >> 16), ExpandableListView.getPackedPositionType(0L) + 24, (char) (27637 - (ViewConfiguration.getScrollBarSize() >> 8)), -1616366948, false, $$c(b10, b11, b11), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
            int i16 = $11 + 13;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            c2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        copydefault = 1;
        component2();
        Object[] objArr = new Object[1];
        a(72 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new int[]{510211311, -1223289147, 1731652870, -815158612, 1864995138, 855850653, -1514676873, -743870584, -238696841, 1277931082, 1454389584, 2119773945, 1985606075, 1895960118, 992935431, 1014693512, 479475073, -1403288321, 559171785, -65904885, -146174436, 1774357483, 1876376520, -1392758837, 621559126, -701068415, 2047211087, 832490835, 1777485807, 966457135, -996648421, 67045362, 1968798223, -1110116259, -718303715, 1257548137}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component2 + 67;
        copydefault = i % 128;
        if (i % 2 == 0) {
            int i2 = 2 / 0;
        }
    }

    static void component2() {
        component3 = new int[]{1800242340, 922271121, -1529199231, 1159962197, -1433278324, -233792137, -1522103753, -2019785890, -1548661401, 854958016, 288471053, 117759566, -801482768, -1919805794, 979825935, 938081030, 1186621904, -507887925};
    }
}
