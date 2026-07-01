package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getActiveNotifications;

public final class ResetPinTempPinViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    static ResetPinTempPinViewModel ShareDataUIState;
    private static int[] component1;
    private static int copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {5, -4, -80, 1};
    private static final int $$b = 20;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component3 = 0;

    private static String $$c(int i, short s, short s2) {
        int i2 = s2 * 4;
        int i3 = 107 - s;
        int i4 = 4 - (i * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = i4 + (-i2);
            i4++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i2) {
                return new String(bArr2, 0);
            }
            int i6 = i3;
            int i7 = i4 + 1;
            i3 = i6 + (-bArr[i4]);
            i4 = i7;
        }
    }

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = component1;
        int i4 = 684241640;
        long j = 0;
        int i5 = 0;
        int i6 = 1;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 107;
                $11 = i8 % 128;
                if (i8 % i2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4);
                        if (objCopydefault == null) {
                            int i9 = (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 4391;
                            int doubleTapTimeout = 37 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                            byte b2 = $$a[3];
                            byte b3 = (byte) (b2 - 1);
                            byte b4 = b2;
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i9, doubleTapTimeout, windowTouchSlop, -309236339, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        int iMyPid = 4391 - (Process.myPid() >> 22);
                        int iGreen = 37 - Color.green(0);
                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                        byte b5 = $$a[3];
                        byte b6 = (byte) (b5 - 1);
                        byte b7 = b5;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iMyPid, iGreen, cCombineMeasuredStates, -309236339, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    i7++;
                }
                i2 = 2;
                i4 = 684241640;
                j = 0;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = component1;
        if (iArr5 != null) {
            int i10 = $11 + 115;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                int i13 = $10 + 81;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    try {
                        Object[] objArr4 = new Object[i6];
                        objArr4[i5] = Integer.valueOf(iArr5[i12]);
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                        if (objCopydefault3 == null) {
                            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4391;
                            int i14 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 36;
                            char c2 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                            byte b8 = $$a[3];
                            byte b9 = (byte) (b8 - 1);
                            byte b10 = b8;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(maximumFlingVelocity, i14, c2, -309236339, false, $$c(b9, b10, (byte) (b10 - 1)), new Class[]{Integer.TYPE});
                        }
                        iArr6[i12] = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                        i12 %= 0;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    Object[] objArr5 = {Integer.valueOf(iArr5[i12])};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault4 == null) {
                        int iMakeMeasureSpec = 4391 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 38;
                        char cMyPid = (char) (Process.myPid() >> 22);
                        byte b11 = $$a[3];
                        byte b12 = (byte) (b11 - 1);
                        byte b13 = b11;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iMakeMeasureSpec, packedPositionChild, cMyPid, -309236339, false, $$c(b12, b13, (byte) (b13 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                    i12++;
                }
                i5 = 0;
                i6 = 1;
            }
            iArr5 = iArr6;
        }
        int i15 = i5;
        System.arraycopy(iArr5, i15, iArr4, i15, length2);
        getactivenotifications.component1 = i15;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[i15] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr4);
            int i16 = 0;
            for (int i17 = 16; i16 < i17; i17 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr4[i16];
                Object[] objArr6 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault5 == null) {
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2968;
                    int i18 = 17 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 49871);
                    byte b14 = (byte) ($$a[3] - 1);
                    byte b15 = (byte) (b14 + 3);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(fadingEdgeLength, i18, trimmedLength, 462826032, false, $$c(b14, b15, (byte) (b15 - 3)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault5).invoke(null, objArr6)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i16++;
            }
            int i19 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i19;
            getactivenotifications.component2 ^= iArr4[16];
            getactivenotifications.ShareDataUIState ^= iArr4[17];
            int i20 = getactivenotifications.ShareDataUIState;
            int i21 = getactivenotifications.component2;
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
                int bitsPerPixel = 2943 - ImageFormat.getBitsPerPixel(0);
                int packedPositionType = 24 - ExpandableListView.getPackedPositionType(0L);
                char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 27638);
                byte b16 = (byte) ($$a[3] - 1);
                byte b17 = b16;
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(bitsPerPixel, packedPositionType, modifierMetaStateMask, -1616366948, false, $$c(b16, b17, b17), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault6).invoke(null, objArr7);
            i15 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i22 = $10 + 61;
        $11 = i22 % 128;
        int i23 = i22 % 2;
        objArr[0] = str;
    }

    static {
        copydefault = 1;
        copydefault();
        Object[] objArr = new Object[1];
        a(ImageFormat.getBitsPerPixel(0) + 87, new int[]{75482787, 1620183108, -653279263, 340134485, -115281140, -1026701918, -996961873, 685389002, -987308983, -1568052920, -543562987, -1969543283, 2295336, 1282897918, 1150350839, 403908722, 1739103255, -522848809, 53290417, 1079195170, -396920201, -2034699015, -194382300, 1147077608, -1288532393, -1244203029, -606055766, 176418475, -138667332, 1035278618, -1114790479, 209329699, -1358624177, 1041701649, 1319402968, 1085128193, 720155891, 1614744258, 373717879, 68699937, -314110311, 1178825295, 839301117, 2008210893}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component3 + 31;
        copydefault = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void copydefault() {
        component1 = new int[]{692263152, 211647052, 78114995, 683357931, 1072690917, -1308005713, -1574067674, 146953544, 801086125, 316316672, 1950091072, 734093646, 2006920240, -441397573, 1330117309, -257326849, 745167634, 201709666};
    }
}
