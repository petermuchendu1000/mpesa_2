package com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getActiveNotifications;

public final class OfferBundleViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static final byte[] $$a = {Ascii.GS, -26, 91, 68};
    private static final int $$b = 41;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ShareDataUIState = 0;
    private static int component1;
    private static int[] component3;
    static OfferBundleViewModel copydefault;
    public static String lazyClassKeyName;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r7, byte r8, short r9) {
        /*
            int r9 = r9 * 3
            int r9 = r9 + 1
            int r7 = r7 + 104
            int r8 = r8 * 4
            int r8 = 4 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r7 = r9
            r5 = r2
            goto L28
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L28:
            int r8 = -r8
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(short, byte, short):java.lang.String");
    }

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int[] iArr3;
        int length2;
        int[] iArr4;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr5 = component3;
        int i6 = 684241640;
        int i7 = 1;
        int i8 = 0;
        if (iArr5 != null) {
            int i9 = $11 + 69;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                length2 = iArr5.length;
                iArr4 = new int[length2];
                i3 = 1;
            } else {
                length2 = iArr5.length;
                iArr4 = new int[length2];
                i3 = 0;
            }
            while (i3 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr5[i3])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i6);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i4;
                        byte b3 = (byte) (b2 - 2);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4391 - View.MeasureSpec.getSize(0), KeyEvent.normalizeMetaState(0) + 37, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -309236339, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr4[i3] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i3++;
                    i4 = 2;
                    i6 = 684241640;
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
        int[] iArr7 = component3;
        if (iArr7 != null) {
            int i10 = $10 + 25;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                length = iArr7.length;
                iArr2 = new int[length];
            } else {
                length = iArr7.length;
                iArr2 = new int[length];
            }
            int i11 = 0;
            while (i11 < length) {
                int i12 = $10 + 63;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                Object[] objArr3 = new Object[i7];
                objArr3[i8] = Integer.valueOf(iArr7[i11]);
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 2;
                    byte b5 = (byte) (b4 - 2);
                    iArr3 = iArr7;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.red(i8) + 4391, 37 - TextUtils.getOffsetAfter("", i8), (char) (ViewConfiguration.getTapTimeout() >> 16), -309236339, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                } else {
                    iArr3 = iArr7;
                }
                iArr2[i11] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                i11++;
                iArr7 = iArr3;
                i7 = 1;
                i8 = 0;
            }
            i2 = i8;
            iArr7 = iArr2;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr7, i2, iArr6, i2, length3);
        getactivenotifications.component1 = i2;
        while (getactivenotifications.component1 < iArr.length) {
            int i14 = $10 + 125;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr6);
            int i16 = 0;
            for (int i17 = 16; i16 < i17; i17 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr6[i16];
                Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2968 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (Process.myPid() >> 22) + 16, (char) (49872 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 462826032, false, $$c(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i16++;
            }
            int i18 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i18;
            getactivenotifications.component2 ^= iArr6[16];
            getactivenotifications.ShareDataUIState ^= iArr6[17];
            int i19 = getactivenotifications.ShareDataUIState;
            int i20 = getactivenotifications.component2;
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
                byte b8 = (byte) 3;
                byte b9 = (byte) (b8 - 3);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSize(0, 0) + 2944, 25 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (27637 - TextUtils.getOffsetBefore("", 0)), -1616366948, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
            int i21 = $10 + 1;
            $11 = i21 % 128;
            int i22 = i21 % 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        component1 = 1;
        component1();
        Object[] objArr = new Object[1];
        a(Color.argb(0, 0, 0, 0) + 82, new int[]{-1185657417, 516020617, 1295120488, 417194096, 1022502167, -998381539, -1297821929, -1980132619, -2125011527, 1998721594, 1102438336, -1290257693, -9218591, 267166920, -1268793074, -1126145379, 1502229025, -64122337, 1354812875, 559867858, 146642229, 1304505328, 1807627945, 184479475, -175229212, -1075645640, -960045736, -1772355739, 181162745, 867511981, -842680986, -419640943, -1655625648, 558713227, -297091587, -3447890, 868297652, -357515762, -2081123123, -2044180338, 1931195868, 1826203089}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = ShareDataUIState + 93;
        component1 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component1() {
        component3 = new int[]{-1972722387, -1354034580, 1594459277, 1007283809, 1364139492, 1707964781, 565755184, -1271044011, -1104128815, 1349300147, 1235406584, 1461188166, 916871641, 708811479, -1565057634, 1603004896, 770999274, 1085314910};
    }
}
