package com.huawei.digitalpayment.common.theme.viewmodel;

import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getActiveNotifications;

public final class ThemeViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static int[] component1;
    private static int component2;
    static ThemeViewModel component3;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {120, 65, 99, 57};
    private static final int $$b = 227;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copydefault = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, byte r8) {
        /*
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r8 = 107 - r8
            int r6 = r6 * 2
            int r0 = 1 - r6
            byte[] r1 = com.huawei.digitalpayment.common.theme.viewmodel.ThemeViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2a
        L17:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1b:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L28:
            r3 = r1[r8]
        L2a:
            int r3 = -r3
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.viewmodel.ThemeViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(int, int, byte):java.lang.String");
    }

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int[] iArr3;
        int length2;
        int[] iArr4;
        int i2;
        int i3 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr5 = component1;
        long j = 0;
        int i4 = 684241640;
        int i5 = 1;
        int i6 = 0;
        if (iArr5 != null) {
            int i7 = $11 + 5;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length2 = iArr5.length;
                iArr4 = new int[length2];
                i2 = 1;
            } else {
                length2 = iArr5.length;
                iArr4 = new int[length2];
                i2 = 0;
            }
            int i8 = i2;
            while (i8 < length2) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i6] = Integer.valueOf(iArr5[i8]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i6;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionChild(j) + 4392, 37 - ((Process.getThreadPriority(i6) + 20) >> 6), (char) (TextUtils.lastIndexOf("", '0', i6) + 1), -309236339, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr4[i8] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i8++;
                    int i9 = $10 + 35;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    j = 0;
                    i4 = 684241640;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr5 = iArr4;
        }
        int length3 = iArr5.length;
        int[] iArr6 = new int[length3];
        int[] iArr7 = component1;
        int i11 = 16;
        if (iArr7 != null) {
            int i12 = $10 + 93;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                length = iArr7.length;
                iArr2 = new int[length];
            } else {
                length = iArr7.length;
                iArr2 = new int[length];
            }
            int i13 = 0;
            while (i13 < length) {
                int i14 = $10 + 69;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                Object[] objArr3 = new Object[i5];
                objArr3[0] = Integer.valueOf(iArr7[i13]);
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    iArr3 = iArr7;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4391 - (ViewConfiguration.getMinimumFlingVelocity() >> i11), (KeyEvent.getMaxKeyCode() >> 16) + 37, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), -309236339, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                } else {
                    iArr3 = iArr7;
                }
                iArr2[i13] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                i13++;
                iArr7 = iArr3;
                i11 = 16;
                i5 = 1;
            }
            iArr7 = iArr2;
        }
        System.arraycopy(iArr7, 0, iArr6, 0, length3);
        getactivenotifications.component1 = 0;
        while (getactivenotifications.component1 < iArr.length) {
            int i16 = $10 + 25;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr6);
            int i18 = 0;
            for (int i19 = 16; i18 < i19; i19 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr6[i18];
                Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2968, 16 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (49871 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 462826032, false, $$c(b6, b7, (byte) (b7 + 3)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i18++;
            }
            int i20 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i20;
            getactivenotifications.component2 ^= iArr6[16];
            getactivenotifications.ShareDataUIState ^= iArr6[17];
            int i21 = getactivenotifications.ShareDataUIState;
            int i22 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr6);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr5 = {getactivenotifications, getactivenotifications};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetAfter("", 0) + 2944, 24 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (27637 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), -1616366948, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        component2 = 1;
        copydefault();
        Object[] objArr = new Object[1];
        a(63 - View.MeasureSpec.getMode(0), new int[]{-1500747422, 1145354695, 1519626987, -502985949, 1445030613, -747601729, 655718336, 1718328619, -291310632, -1502305738, -1489971803, -1436153624, -1833099196, -114223976, -1853243511, 506191968, 763552921, -1092934341, 83597458, 486203010, 52618344, 1872427405, -1199792835, 2087353316, -1733860412, -2128816619, -1873795377, 43701822, 74556106, 1590360777, 910823385, -1267690014}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = copydefault + 27;
        component2 = i % 128;
        int i2 = i % 2;
    }

    static void copydefault() {
        component1 = new int[]{1212915426, 928165141, -544416813, 1285026495, 2036517448, -1203411001, 618579781, -168026375, -997810922, 1924099431, 1530562009, -1459922211, 681292172, 972891244, 291841450, 457114882, -1457094074, 1433755763};
    }
}
