package com.huawei.digitalpayment.pwa.viewmodel;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getActiveNotifications;

public final class PwaViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static int[] ShareDataUIState;
    private static int component1;
    static PwaViewModel component2;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {74, 75, -50, -9};
    private static final int $$b = 7;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copydefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, short r7, int r8) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 1
            int r6 = r6 + 104
            int r7 = r7 * 3
            int r7 = 4 - r7
            byte[] r0 = com.huawei.digitalpayment.pwa.viewmodel.PwaViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r7]
        L24:
            int r7 = r7 + 1
            int r6 = r6 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.viewmodel.PwaViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, short, int):java.lang.String");
    }

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        int[] iArr2;
        int length;
        int[] iArr3;
        int i2 = 2;
        int i3 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = ShareDataUIState;
        int i4 = 684241640;
        int i5 = 17;
        int i6 = 1;
        int i7 = 0;
        if (iArr4 != null) {
            int i8 = $10 + 67;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = iArr4.length;
                iArr3 = new int[length];
            } else {
                length = iArr4.length;
                iArr3 = new int[length];
            }
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + i5;
                $10 = i10 % 128;
                int i11 = i10 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr4[i9])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4);
                    if (objCopydefault == null) {
                        byte b2 = (byte) ($$b - 5);
                        byte b3 = (byte) (b2 - 2);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.normalizeMetaState(0) + 4391, KeyEvent.normalizeMetaState(0) + 37, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), -309236339, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i9] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i9++;
                    i2 = 2;
                    i4 = 684241640;
                    i5 = 17;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr4 = iArr3;
        }
        int length2 = iArr4.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = ShareDataUIState;
        if (iArr6 != null) {
            int i12 = $11 + 107;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i14 = 0;
            while (i14 < length3) {
                Object[] objArr3 = new Object[i6];
                objArr3[i7] = Integer.valueOf(iArr6[i14]);
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault2 == null) {
                    int iIndexOf = 4391 - TextUtils.indexOf("", "");
                    int gidForName = 36 - Process.getGidForName("");
                    char deadChar = (char) KeyEvent.getDeadChar(i7, i7);
                    byte b4 = (byte) ($$b - 5);
                    byte b5 = (byte) (b4 - 2);
                    iArr2 = iArr6;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, gidForName, deadChar, -309236339, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                } else {
                    iArr2 = iArr6;
                }
                iArr7[i14] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
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
            int i16 = $10 + 119;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            for (int i18 = 0; i18 < 16; i18++) {
                getactivenotifications.ShareDataUIState ^= iArr5[i18];
                Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2968 - View.resolveSizeAndState(0, 0, 0), 16 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (49871 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 462826032, false, $$c(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
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
            Object[] objArr5 = {getactivenotifications, getactivenotifications};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault4 == null) {
                int i22 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2943;
                int iKeyCodeFromString = 24 - KeyEvent.keyCodeFromString("");
                char cRgb = (char) (Color.rgb(0, 0, 0) + 16804853);
                byte b8 = (byte) ($$b - 4);
                byte b9 = (byte) (b8 - 3);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i22, iKeyCodeFromString, cRgb, -1616366948, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        component1 = 0;
        component1();
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0', 0) + 53, new int[]{-746136324, 1035667648, 490557232, -151834236, 1647350864, -34982047, 1196659756, -1413520647, -530794106, 730048971, -1463456929, -1865185177, -1068032097, -1012925718, -1862183870, -199083289, 1940078601, 977408792, 1079413624, -1713184740, 1797535858, -1060974471, -244412505, -355646229, -214955651, 1517429115}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = copydefault + 53;
        component1 = i % 128;
        int i2 = i % 2;
    }

    static void component1() {
        ShareDataUIState = new int[]{1351272969, 1816918742, -504742604, 1442028692, -1140859183, 1262006254, -1327668303, 1210807553, -844645766, 583424336, 1236075373, -1501764641, -971480128, -558845014, 88112603, -1287061214, 921202444, -1973584570};
    }
}
