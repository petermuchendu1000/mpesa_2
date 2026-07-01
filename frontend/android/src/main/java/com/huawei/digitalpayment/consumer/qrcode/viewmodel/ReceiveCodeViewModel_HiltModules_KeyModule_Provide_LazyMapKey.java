package com.huawei.digitalpayment.consumer.qrcode.viewmodel;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getActiveNotifications;

public final class ReceiveCodeViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static final byte[] $$a = {119, -27, 13, -93};
    private static final int $$b = 43;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ShareDataUIState = 0;
    private static int component1;
    static ReceiveCodeViewModel component2;
    private static int[] copydefault;
    public static String lazyClassKeyName;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, byte r7, byte r8) {
        /*
            int r7 = 107 - r7
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r8 = r8 * 4
            int r8 = r8 + 1
            byte[] r0 = com.huawei.digitalpayment.consumer.qrcode.viewmodel.ReceiveCodeViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r6]
        L24:
            int r6 = r6 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.viewmodel.ReceiveCodeViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(byte, byte, byte):java.lang.String");
    }

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = copydefault;
        int i5 = 684241640;
        char c2 = '0';
        int i6 = 1;
        int i7 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 35;
                $10 = i9 % 128;
                int i10 = i9 % i3;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i7] = Integer.valueOf(iArr2[i8]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i5);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i7;
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4390 - TextUtils.lastIndexOf("", c2), (KeyEvent.getMaxKeyCode() >> 16) + 37, (char) (TextUtils.indexOf("", c2, i7, i7) + 1), -309236339, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i8++;
                    int i11 = $11 + 59;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    i3 = 2;
                    i5 = 684241640;
                    c2 = '0';
                    i7 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = copydefault;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                int i14 = $10 + 21;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    Object[] objArr3 = new Object[i6];
                    objArr3[0] = Integer.valueOf(iArr5[i13]);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        i2 = length3;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4391 - Color.red(0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 37, (char) View.resolveSize(0, 0), -309236339, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                    } else {
                        i2 = length3;
                    }
                    iArr6[i13] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                } else {
                    i2 = length3;
                    Object[] objArr4 = {Integer.valueOf(iArr5[i13])};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4390 - ImageFormat.getBitsPerPixel(0), MotionEvent.axisFromString("") + 38, (char) ((-1) - Process.getGidForName("")), -309236339, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i13] = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                    i13++;
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
            int i15 = 0;
            for (int i16 = 16; i15 < i16; i16 = 16) {
                int i17 = $11 + 25;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    getactivenotifications.ShareDataUIState ^= iArr4[i15];
                    try {
                        Object[] objArr5 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                        if (objCopydefault4 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = (byte) (b8 + 3);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 2969, ((Process.getThreadPriority(0) + 20) >> 6) + 16, (char) ((Process.myPid() >> 22) + 49871), 462826032, false, $$c(b8, b9, (byte) (b9 - 3)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                        getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                        getactivenotifications.component2 = iIntValue;
                        i15 += 117;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    getactivenotifications.ShareDataUIState ^= iArr4[i15];
                    Object[] objArr6 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                    if (objCopydefault5 == null) {
                        byte b10 = (byte) 0;
                        byte b11 = (byte) (b10 + 3);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(Gravity.getAbsoluteGravity(0, 0) + 2968, 15 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (49919 - AndroidCharacter.getMirror('0')), 462826032, false, $$c(b10, b11, (byte) (b11 - 3)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault5).invoke(null, objArr6)).intValue();
                    getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                    getactivenotifications.component2 = iIntValue2;
                    i15++;
                }
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
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2943, 25 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (27636 - ((byte) KeyEvent.getModifierMetaStateMask())), -1616366948, false, $$c(b12, b13, b13), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault6).invoke(null, objArr7);
            int i21 = $11 + 83;
            $10 = i21 % 128;
            int i22 = i21 % 2;
            c3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        component1 = 1;
        component1();
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getLongPressTimeout() >> 16) + 72, new int[]{-1457931618, -1995328517, 1402631166, 910768978, 959768388, 390886881, 337068236, 1140688855, -861820188, 396369767, -1156996004, 2108487371, -2015028144, 1160697251, 367627895, 406945100, 772363934, 1407592416, 1575136485, -69568318, -711204349, 1058074807, -847560476, 145573555, -2015860449, 792336318, -1120222324, -1350022983, -850003691, -2053964103, 1549000490, -875050062, 360066758, -1313753971, 451385213, 1964010088}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = ShareDataUIState + 51;
        component1 = i % 128;
        int i2 = i % 2;
    }

    static void component1() {
        copydefault = new int[]{-3535680, -1848107576, 1414629113, -822611952, 1034385212, 245726066, -840888977, -550516246, -743075664, -150473251, -1705070522, -719927960, -185516849, -1540492218, 1393928210, -1000473414, 185269331, -650047103};
    }
}
