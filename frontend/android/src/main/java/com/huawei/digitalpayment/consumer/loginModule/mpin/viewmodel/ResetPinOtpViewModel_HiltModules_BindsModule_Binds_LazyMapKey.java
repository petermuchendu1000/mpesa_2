package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getActiveNotifications;

public final class ResetPinOtpViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static final byte[] $$a = {68, -127, 122, -15};
    private static final int $$b = 13;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ShareDataUIState = 1;
    private static int component1;
    private static int[] component2;
    static ResetPinOtpViewModel component3;
    public static String lazyClassKeyName;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, short r7, int r8) {
        /*
            int r7 = 107 - r7
            int r8 = r8 * 2
            int r0 = 1 - r8
            byte[] r1 = com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ResetPinOtpViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            int r7 = r7 + 1
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ResetPinOtpViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(byte, short, int):java.lang.String");
    }

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        String str;
        String str2 = "";
        int i3 = 2;
        int i4 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = component2;
        int i5 = 684241640;
        int i6 = 16;
        int i7 = 1;
        int i8 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i9 = $11 + 79;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 0;
            while (i11 < length2) {
                int i12 = $11 + 51;
                $10 = i12 % 128;
                int i13 = i12 % i3;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i8] = Integer.valueOf(iArr3[i11]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i5);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i8;
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getJumpTapTimeout() >> i6) + 4391, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 36, (char) Gravity.getAbsoluteGravity(i8, i8), -309236339, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr4[i11] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i11++;
                    i3 = 2;
                    i5 = 684241640;
                    i6 = 16;
                    i8 = 0;
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
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = component2;
        if (iArr6 != null) {
            int i14 = $11 + 61;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                Object[] objArr3 = new Object[i7];
                objArr3[0] = Integer.valueOf(iArr6[i2]);
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    str = str2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4391 - KeyEvent.keyCodeFromString(str2), 37 - TextUtils.getTrimmedLength(str2), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -309236339, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                } else {
                    str = str2;
                }
                iArr2[i2] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                i2++;
                str2 = str;
                i7 = 1;
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        getactivenotifications.component1 = 0;
        while (getactivenotifications.component1 < iArr.length) {
            int i15 = $11 + 85;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            int i17 = 0;
            for (int i18 = 16; i17 < i18; i18 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr5[i17];
                Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 3);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2968, 15 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (49871 - ExpandableListView.getPackedPositionType(0L)), 462826032, false, $$c(b6, b7, (byte) (b7 - 3)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i17++;
                int i19 = $11 + 107;
                $10 = i19 % 128;
                if (i19 % 2 != 0) {
                    int i20 = 3 % 5;
                }
            }
            int i21 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i21;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i22 = getactivenotifications.ShareDataUIState;
            int i23 = getactivenotifications.component2;
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
                byte b8 = (byte) 0;
                byte b9 = b8;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getPressedStateDuration() >> 16) + 2944, 24 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (27637 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), -1616366948, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        component1 = 0;
        component1();
        Object[] objArr = new Object[1];
        a(Color.green(0) + 82, new int[]{1836406441, 1662687325, 443503494, 1803098416, -1011210813, -1631794325, -1653911879, 840426509, 2080595877, 1690380084, -2037804777, 1468291087, -315250695, -1255192647, -816768106, 535130544, -922357690, 5100447, 1611041552, 230939840, 1947705947, -1681682128, 1412683091, -945072564, 884948522, -985952364, -1857326882, 1976038794, -2059436422, -1729437708, -335271673, -685655722, -138720774, 404358029, 1536622962, -653754849, -1140669126, 1173830258, -467174464, 425089479, -487864798, -476330}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = ShareDataUIState + 61;
        component1 = i % 128;
        if (i % 2 != 0) {
            int i2 = 49 / 0;
        }
    }

    static void component1() {
        component2 = new int[]{-1141854304, 484478088, 2012245497, 1443497264, 132273950, -1368631029, 1584968875, -901476306, -1386805489, 1593527872, 1149078042, 1936723977, -1732778579, 1105265321, 1123929020, 1774295969, 601813376, -568514276};
    }
}
