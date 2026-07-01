package com.huawei.digitalpayment.consumer.fixeddata.viewmodel;

import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;

public final class FamilyShareDashboardViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static char[] component1;
    private static int component3;
    static FamilyShareDashboardViewModel copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {119, -40, Ascii.DLE, 123};
    private static final int $$b = 166;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, byte r8) {
        /*
            int r7 = r7 * 4
            int r0 = 1 - r7
            int r6 = 115 - r6
            int r8 = r8 * 4
            int r8 = 4 - r8
            byte[] r1 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2b:
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, byte, byte):java.lang.String");
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = component1;
        if (cArr != null) {
            int i6 = $11 + 69;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i8 = 0; i8 < length; i8++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getLongPressTimeout() >> 16) + 657, View.resolveSize(0, 0) + 14, (char) (65118 - (ViewConfiguration.getScrollBarSize() >> 8)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            int i9 = $11 + 33;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                int i11 = $10 + 33;
                $11 = i11 % 128;
                if (i11 % 2 != 0 ? bArr[iTrustedWebActivityService_Parcel.copydefault] != 1 : bArr[iTrustedWebActivityService_Parcel.copydefault] != 0) {
                    int i12 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr3 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3580 - (ViewConfiguration.getEdgeSlop() >> 16), 28 - KeyEvent.normalizeMetaState(0), (char) (Process.myTid() >> 22), 1180380354, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                } else {
                    int i13 = iTrustedWebActivityService_Parcel.copydefault;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) 5;
                            byte b5 = (byte) (b4 - 5);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getWindowTouchSlop() >> 8) + 4502, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 35, (char) (27897 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), -1464227204, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (b6 - 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(View.combineMeasuredStates(0, 0) + 1859, AndroidCharacter.getMirror('0') - 14, (char) TextUtils.getTrimmedLength(""), 80302927, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i14 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i14, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i14);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            int i15 = $10 + 107;
            $11 = i15 % 128;
            int i16 = 2;
            int i17 = i15 % 2;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                int i18 = $10 + 107;
                $11 = i18 % 128;
                int i19 = i18 % i16;
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i3 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
                i16 = 2;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        String str = new String(cArr3);
        int i20 = $10 + 81;
        $11 = i20 % 128;
        int i21 = i20 % 2;
        objArr[0] = str;
    }

    static {
        component3 = 1;
        component1();
        Object[] objArr = new Object[1];
        a(new int[]{0, 84, 76, 80}, true, null, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component2 + 17;
        component3 = i % 128;
        int i2 = i % 2;
    }

    static void component1() {
        component1 = new char[]{33350, 33308, 33390, 33386, 33405, 33391, 33377, 33394, 33380, 33393, 33387, 33376, 33394, 33359, 33390, 33377, 33394, 33387, 33344, 33306, 33383, 33386, 33382, 33394, 33357, 33445, 33383, 33390, 33391, 33380, 33382, 33308, 33390, 33386, 33309, 33445, 33394, 33311, 33394, 33391, 33391, 33390, 33307, 33386, 33389, 33445, 33377, 33390, 33382, 33310, 33376, 33381, 33380, 33392, 33445, 33311, 33381, 33390, 33382, 33306, 33394, 33379, 33383, 33394, 33311, 33386, 33388, 33386, 33391, 33445, 33386, 33390, 33308, 33394, 33310, 33387, 33445, 33382, 33380, 33392, 33383, 33390, 33391, 33380};
    }
}
