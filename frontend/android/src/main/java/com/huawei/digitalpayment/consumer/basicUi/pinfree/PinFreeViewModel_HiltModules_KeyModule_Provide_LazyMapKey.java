package com.huawei.digitalpayment.consumer.basicUi.pinfree;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getActiveNotifications;

public final class PinFreeViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    static PinFreeViewModel ShareDataUIState;
    private static int component1;
    private static int[] component2;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {90, 10, -103, 87};
    private static final int $$b = 75;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component3 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, byte r8) {
        /*
            int r8 = r8 * 3
            int r0 = r8 + 1
            int r7 = 107 - r7
            int r6 = r6 * 2
            int r6 = 4 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.basicUi.pinfree.PinFreeViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basicUi.pinfree.PinFreeViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(int, int, byte):java.lang.String");
    }

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        int[] iArr2;
        int i2 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = component2;
        int i3 = 684241640;
        int i4 = 1;
        int i5 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 1;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i6])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i3);
                        if (objCopydefault == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 + 1);
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(((byte) KeyEvent.getModifierMetaStateMask()) + 4392, 37 - KeyEvent.getDeadChar(0, 0), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -309236339, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                        }
                        iArr4[i6] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr3[i6])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4391 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 37 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), -309236339, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr4[i6] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                }
                i6++;
                i3 = 684241640;
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = component2;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                Object[] objArr4 = new Object[i4];
                objArr4[i5] = Integer.valueOf(iArr6[i8]);
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) i5;
                    byte b7 = (byte) (b6 + 1);
                    iArr2 = iArr6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4391 - TextUtils.indexOf("", "", i5, i5), ((Process.getThreadPriority(i5) + 20) >> 6) + 37, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), -309236339, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE});
                } else {
                    iArr2 = iArr6;
                }
                iArr7[i8] = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                i8++;
                iArr6 = iArr2;
                i4 = 1;
                i5 = 0;
            }
            iArr6 = iArr7;
        }
        int i9 = i5;
        System.arraycopy(iArr6, i9, iArr5, i9, length2);
        getactivenotifications.component1 = i9;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[i9] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            int i10 = $11 + 47;
            $10 = i10 % 128;
            int i11 = 2;
            int i12 = i10 % 2;
            int i13 = 0;
            while (i13 < 16) {
                int i14 = $10 + 3;
                $11 = i14 % 128;
                int i15 = i14 % i11;
                getactivenotifications.ShareDataUIState ^= iArr5[i13];
                Object[] objArr5 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 + 3);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2967 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 16, (char) (49871 - View.MeasureSpec.getSize(0)), 462826032, false, $$c(b8, b9, (byte) (b9 - 3)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i13++;
                i11 = 2;
            }
            int i16 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i16;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i17 = getactivenotifications.ShareDataUIState;
            int i18 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr5);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr6 = {getactivenotifications, getactivenotifications};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault5 == null) {
                byte b10 = (byte) 0;
                byte b11 = b10;
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2944 - (ViewConfiguration.getEdgeSlop() >> 16), 24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (ExpandableListView.getPackedPositionChild(0L) + 27638), -1616366948, false, $$c(b10, b11, b11), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
            int i19 = $10 + 1;
            $11 = i19 % 128;
            int i20 = i19 % 2;
            i9 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        component1 = 0;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(67 - (Process.myTid() >> 22), new int[]{969276203, -1911898603, -66871692, -1442138872, 1407428925, 1859995857, 1302311359, -808551357, -414937997, -410053296, -1444459826, 242969645, -1524543140, 1561070814, 2088145065, -1890430128, -1052322704, 373073645, 812465538, -2045513632, -385902126, -1985502990, -60688119, 1635254857, -1344336556, -885949602, -136204671, 162884171, 1686668382, -1388016245, -1655177719, -733904739, 2137692446, -1146021030}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component3 + 55;
        component1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void ShareDataUIState() {
        component2 = new int[]{-274451485, 827660551, -1551992133, 1616989559, 658089779, -300664189, 820271752, 191590942, -681277881, 2130700931, 1928055913, 27456726, 115303433, -547828509, -1660115045, -1092843920, -251400763, 1772549555};
    }
}
