package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getActiveNotifications;

public final class SendToMobileViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static int ShareDataUIState;
    static SendToMobileViewModel component2;
    private static int[] copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {110, -114, 93, -109};
    private static final int $$b = 247;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, byte r7, short r8) {
        /*
            int r7 = r7 + 4
            int r6 = r6 + 104
            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r8 = r8 * 4
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r6 = r7
            r4 = r8
            r3 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L28:
            int r4 = -r4
            int r7 = r7 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(byte, byte, short):java.lang.String");
    }

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        int[] iArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = copydefault;
        int i4 = 17;
        int i5 = 684241640;
        int i6 = 1;
        int i7 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i8 = $11 + 111;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 0;
            while (i10 < length) {
                int i11 = $11 + i4;
                $10 = i11 % 128;
                if (i11 % i2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i10])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i5);
                        if (objCopydefault == null) {
                            int i12 = 4392 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            int i13 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 37;
                            char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                            byte b2 = (byte) ($$b & 10);
                            byte b3 = (byte) (b2 - 3);
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i12, i13, fadingEdgeLength, -309236339, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        iArr4[i10] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                        i10 >>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr3[i10])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        int deadChar = 4391 - KeyEvent.getDeadChar(0, 0);
                        int iRgb = (-16777179) - Color.rgb(0, 0, 0);
                        char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        byte b4 = (byte) ($$b & 10);
                        byte b5 = (byte) (b4 - 3);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(deadChar, iRgb, scrollBarFadeDuration, -309236339, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr4[i10] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    i10++;
                }
                i2 = 2;
                i4 = 17;
                i5 = 684241640;
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = copydefault;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i14 = 0;
            while (i14 < length3) {
                Object[] objArr4 = new Object[i6];
                objArr4[i7] = Integer.valueOf(iArr6[i14]);
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault3 == null) {
                    int defaultSize = View.getDefaultSize(i7, i7) + 4391;
                    int pressedStateDuration = 37 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                    byte b6 = (byte) ($$b & 10);
                    byte b7 = (byte) (b6 - 3);
                    iArr2 = iArr6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(defaultSize, pressedStateDuration, cLastIndexOf, -309236339, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE});
                } else {
                    iArr2 = iArr6;
                }
                iArr7[i14] = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                i14++;
                iArr6 = iArr2;
                i6 = 1;
                i7 = 0;
            }
            iArr6 = iArr7;
        }
        int i15 = i7;
        System.arraycopy(iArr6, i15, iArr5, i15, length2);
        getactivenotifications.component1 = i15;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            int i16 = 0;
            for (int i17 = 16; i16 < i17; i17 = 16) {
                int i18 = $10 + 67;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    getactivenotifications.ShareDataUIState ^= iArr5[i16];
                    Object[] objArr5 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                    if (objCopydefault4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 - 1);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2967 - ((byte) KeyEvent.getModifierMetaStateMask()), 16 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (49872 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 462826032, false, $$c(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                    getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                    getactivenotifications.component2 = iIntValue;
                    i16 += 14;
                } else {
                    getactivenotifications.ShareDataUIState ^= iArr5[i16];
                    Object[] objArr6 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                    if (objCopydefault5 == null) {
                        byte b10 = (byte) 0;
                        byte b11 = (byte) (b10 - 1);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2968 - TextUtils.getOffsetAfter("", 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 15, (char) (49871 - View.getDefaultSize(0, 0)), 462826032, false, $$c(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault5).invoke(null, objArr6)).intValue();
                    getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                    getactivenotifications.component2 = iIntValue2;
                    i16++;
                }
            }
            int i19 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i19;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i20 = getactivenotifications.ShareDataUIState;
            int i21 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr5);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr7 = {getactivenotifications, getactivenotifications};
            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault6 == null) {
                int i22 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2944;
                int iAxisFromString = 23 - MotionEvent.axisFromString("");
                char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 27637);
                byte b12 = (byte) ($$b & 11);
                byte b13 = (byte) (b12 - 4);
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(i22, iAxisFromString, maximumFlingVelocity, -1616366948, false, $$c(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault6).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        ShareDataUIState = 0;
        component2();
        Object[] objArr = new Object[1];
        a(85 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), new int[]{289546588, -90125638, 864060111, -2078872367, 800935212, -858886288, -1072869718, 1768220946, 131314461, -1934926767, -194200794, -1332686103, 704078483, -938242222, 630666474, -910428817, -966019486, 356283162, -1697260462, -986757276, -179116499, -1474733514, 264917363, -738880661, -908152590, -1754118121, -1633203050, 1450338907, -1559202931, -1009544304, -1638434183, 2082260473, -582011001, 692066624, 1593597624, 1158263330, -1364760300, -1617003231, -1816751124, -1626605143, 1307278676, 1592537692, 1413163844, 207337714}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component1 + 125;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component2() {
        copydefault = new int[]{337126666, 1793536567, 2120785947, 549307243, 1468315370, -1117358493, -1696325, 1731284380, -1210906861, -293800791, 1260282820, 693802940, -2123706293, -1720125917, 39950015, 647081436, 385920889, -1953204816};
    }
}
