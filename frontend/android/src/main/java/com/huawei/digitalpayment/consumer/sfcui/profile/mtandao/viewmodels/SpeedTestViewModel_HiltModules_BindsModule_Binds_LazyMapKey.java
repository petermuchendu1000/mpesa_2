package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels;

import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getActiveNotifications;

public final class SpeedTestViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static int ShareDataUIState;
    private static int[] component2;
    static SpeedTestViewModel component3;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {93, -40, 95, -94};
    private static final int $$b = 38;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, byte r7, int r8) {
        /*
            int r7 = r7 * 2
            int r7 = 3 - r7
            int r6 = r6 * 2
            int r0 = 1 - r6
            int r8 = r8 + 104
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            int r7 = r7 + 1
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(byte, byte, int):java.lang.String");
    }

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = component2;
        char c2 = '0';
        int i5 = 684241640;
        int i6 = 1;
        int i7 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 113;
                $10 = i9 % 128;
                if (i9 % i3 != 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i7] = Integer.valueOf(iArr2[i8]);
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i5);
                        if (objCopydefault == null) {
                            byte b2 = (byte) i7;
                            byte b3 = b2;
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", c2, i7, i7) + 4392, 36 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (ViewConfiguration.getEdgeSlop() >> 16), -309236339, false, $$c(b2, b3, (byte) (b3 + 2)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i8] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                        i8 <<= 1;
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
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4391 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 37, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), -309236339, false, $$c(b4, b5, (byte) (b5 + 2)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    i8++;
                }
                i3 = 2;
                c2 = '0';
                i5 = 684241640;
                i7 = 0;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = component2;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                int i11 = $11 + 39;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    try {
                        Object[] objArr4 = new Object[i6];
                        objArr4[0] = Integer.valueOf(iArr5[i10]);
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                        if (objCopydefault3 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            i2 = length3;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "") + 4391, 37 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), -309236339, false, $$c(b6, b7, (byte) (b7 + 2)), new Class[]{Integer.TYPE});
                        } else {
                            i2 = length3;
                        }
                        iArr6[i10] = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    i2 = length3;
                    Object[] objArr5 = {Integer.valueOf(iArr5[i10])};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror('0') + 4343, 37 - TextUtils.getOffsetBefore("", 0), (char) TextUtils.getCapsMode("", 0, 0), -309236339, false, $$c(b8, b9, (byte) (b9 + 2)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                    i10++;
                }
                length3 = i2;
                i6 = 1;
            }
            iArr5 = iArr6;
        }
        char c3 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        getactivenotifications.component1 = 0;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[c3] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr4);
            int i12 = $10 + 45;
            $11 = i12 % 128;
            int i13 = 2;
            int i14 = i12 % 2;
            int i15 = 0;
            while (i15 < 16) {
                int i16 = $10 + 3;
                $11 = i16 % 128;
                int i17 = i16 % i13;
                getactivenotifications.ShareDataUIState ^= iArr4[i15];
                Object[] objArr6 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault5 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.getDeadChar(0, 0) + 2968, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 16, (char) (AndroidCharacter.getMirror('0') + 49823), 462826032, false, $$c(b10, b11, b11), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault5).invoke(null, objArr6)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i15++;
                i13 = 2;
            }
            int i18 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i18;
            getactivenotifications.component2 ^= iArr4[16];
            getactivenotifications.ShareDataUIState ^= iArr4[17];
            int i19 = getactivenotifications.ShareDataUIState;
            int i20 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr4);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr7 = {getactivenotifications, getactivenotifications};
            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault6 == null) {
                byte b12 = (byte) 0;
                byte b13 = b12;
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.makeMeasureSpec(0, 0) + 2944, TextUtils.getOffsetAfter("", 0) + 24, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27636), -1616366948, false, $$c(b12, b13, (byte) (b13 + 3)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault6).invoke(null, objArr7);
            c3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        ShareDataUIState = 0;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(ExpandableListView.getPackedPositionChild(0L) + 87, new int[]{-1479241574, -1243753166, 2018513738, -554243436, 1317165094, -1393236857, 1791336911, -1810063587, 131877725, 1613548471, 1824297347, -1933314251, 754023915, -528602605, 1152097489, 711508122, 1805360750, 1581382862, 991168483, 1694127654, 535389345, -2109279445, -13961940, -633648654, 1929449463, 405571329, -1941689281, 1274969839, -1680342889, -1523727910, 225021152, 794191930, -417946569, -446687842, 1006448556, -935029668, -1783328807, -450702489, 304344202, 897611119, 767189138, -2017413608, -1696523298, 794634836}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component1 + 27;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void ShareDataUIState() {
        component2 = new int[]{-86964211, 852615095, 338270355, 2029687885, 1814454029, 2000500210, 307189494, -1902688537, -1619588194, 1395328617, 1682839182, 642361151, 374595049, -712297032, 571547109, -1147316194, 1205946254, -914897525};
    }
}
