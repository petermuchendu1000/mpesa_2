package com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel;

import android.graphics.ImageFormat;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getActiveNotifications;

public final class ServicePinViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    static ServicePinViewModel component1;
    private static int component2;
    private static int[] component3;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {13, 38, -109, 117};
    private static final int $$b = 148;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copydefault = 1;

    private static String $$c(short s, short s2, int i) {
        int i2 = s * 4;
        int i3 = i + 104;
        byte[] bArr = $$a;
        int i4 = s2 + 4;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = (-i3) + i2;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i2) {
                return new String(bArr2, 0);
            }
            i4++;
            i3 = (-bArr[i4]) + i3;
            i5 = i6;
        }
    }

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = component3;
        int i4 = 684241640;
        int i5 = 16;
        int i6 = 1;
        int i7 = 0;
        if (iArr2 != null) {
            int i8 = $11 + 21;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i10 = 0;
            while (i10 < length) {
                int i11 = $10 + 101;
                $11 = i11 % 128;
                if (i11 % i2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i10])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4);
                        if (objCopydefault == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 - 1);
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4391 - (ViewConfiguration.getScrollDefaultDelay() >> i5), 37 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) View.resolveSizeAndState(0, 0, 0), -309236339, false, $$c(b2, b3, (byte) (b3 + 3)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i10] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                        i10 %= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i10])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror('0') + 4343, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), -309236339, false, $$c(b4, b5, (byte) (b5 + 3)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i10] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    i10++;
                }
                int i12 = $10 + 113;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                i2 = 2;
                i4 = 684241640;
                i5 = 16;
            }
            int i14 = $11 + 93;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = component3;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i16 = 0;
            while (i16 < length3) {
                Object[] objArr4 = new Object[i6];
                objArr4[i7] = Integer.valueOf(iArr5[i16]);
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) i7;
                    byte b7 = (byte) (b6 - 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getSize(i7) + 4391, KeyEvent.getDeadChar(i7, i7) + 37, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), -309236339, false, $$c(b6, b7, (byte) (b7 + 3)), new Class[]{Integer.TYPE});
                }
                iArr6[i16] = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                i16++;
                i6 = 1;
                i7 = 0;
            }
            iArr5 = iArr6;
        }
        int i17 = i7;
        System.arraycopy(iArr5, i17, iArr4, i17, length2);
        getactivenotifications.component1 = i17;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[i17] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr4);
            int i18 = 0;
            for (int i19 = 16; i18 < i19; i19 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr4[i18];
                Object[] objArr5 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 - 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2968 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getWindowTouchSlop() >> 8) + 16, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 49871), 462826032, false, $$c(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i18++;
            }
            int i20 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i20;
            getactivenotifications.component2 ^= iArr4[16];
            getactivenotifications.ShareDataUIState ^= iArr4[17];
            int i21 = getactivenotifications.ShareDataUIState;
            int i22 = getactivenotifications.component2;
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
                byte b11 = (byte) (b10 - 1);
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2944 - View.MeasureSpec.getSize(0), View.combineMeasuredStates(0, 0) + 24, (char) (27637 - KeyEvent.getDeadChar(0, 0)), -1616366948, false, $$c(b10, b11, (byte) (b11 + 4)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
            i17 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        component2 = 0;
        component2();
        Object[] objArr = new Object[1];
        a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 81, new int[]{272158190, -737857800, 398312198, -1956510011, 1139590931, 552988501, -1429058490, -470284749, -1730353230, -490458184, -282668835, -603457290, 598934978, 194834388, -673874328, 1906839622, -739116506, -1573362786, -129896489, 1039562568, 819677927, -1432458115, 1383305944, 1888147851, -1731757684, 550686006, -1007556497, -1615493302, -2006347530, 1588192015, 1874777804, -1696623823, -1156283291, 893543258, -181089933, -1138517067, 1519231002, -2059141889, -336667215, -428746940, 94709445, 337272298}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = copydefault + 101;
        component2 = i % 128;
        int i2 = i % 2;
    }

    static void component2() {
        component3 = new int[]{-946581735, 966081544, -598683309, -403371508, -536322828, 1372115671, 453659711, -66862258, 787979016, 144674984, 1098660732, 1217282957, -1884599245, -805366874, 30505744, 1024700703, -654045563, -1731425};
    }
}
