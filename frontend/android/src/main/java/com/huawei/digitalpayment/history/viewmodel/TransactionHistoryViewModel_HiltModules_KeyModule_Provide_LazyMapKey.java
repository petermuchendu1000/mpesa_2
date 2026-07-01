package com.huawei.digitalpayment.history.viewmodel;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelAll;

public final class TransactionHistoryViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static char ShareDataUIState;
    static TransactionHistoryViewModel component1;
    private static int component2;
    private static char[] copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {115, -125, 45, -41};
    private static final int $$b = 143;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component3 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, short r7, byte r8) {
        /*
            int r7 = r7 * 2
            int r0 = 1 - r7
            int r6 = r6 * 3
            int r6 = r6 + 119
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r1 = com.huawei.digitalpayment.history.viewmodel.TransactionHistoryViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r3 = r3 + 1
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.viewmodel.TransactionHistoryViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(byte, short, byte):java.lang.String");
    }

    private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = copydefault;
        int i5 = 64290;
        if (cArr2 != null) {
            int i6 = $11 + 121;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 63;
                $10 = i9 % 128;
                if (i9 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7422 - (ViewConfiguration.getEdgeSlop() >> 16), 15 - (Process.myTid() >> 22), (char) (i5 - TextUtils.lastIndexOf("", '0', 0)), 682917265, false, "v", new Class[]{Integer.TYPE});
                        }
                        cArr3[i8] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i8])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 7422, 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (64291 - ((Process.getThreadPriority(0) + 20) >> 6)), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i8++;
                }
                i3 = 2;
                i5 = 64290;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(ShareDataUIState)};
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7422 - (KeyEvent.getMaxKeyCode() >> 16), 15 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (64290 - TextUtils.lastIndexOf("", '0', 0)), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i10 = $11 + 61;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                i2 = i + 1;
                cArr4[i2] = (char) (cArr[i2] >>> b2);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i11 = $10 + 101;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cancelall.component2 = 0;
            while (cancelall.component2 < i2) {
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                } else {
                    Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7117 - Color.argb(0, 0, 0, 0), TextUtils.indexOf("", "", 0) + 14, (char) (44463 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue() == cancelall.getAsAtTimestamp) {
                        int i13 = $10 + 49;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        Object[] objArr6 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault5 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2944 - TextUtils.indexOf("", "", 0), 23 - ImageFormat.getBitsPerPixel(0), (char) (Color.green(0) + 27637), 794909189, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objCopydefault5).invoke(null, objArr6)).intValue();
                        int i15 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr2[i15];
                    } else if (cancelall.copydefault == cancelall.ShareDataUIState) {
                        int i16 = $11 + 85;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
                        cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                        cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                        int i18 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                        int i19 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[i18];
                        cArr4[cancelall.component2 + 1] = cArr2[i19];
                    } else {
                        int i20 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                        int i21 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                        cArr4[cancelall.component2] = cArr2[i20];
                        cArr4[cancelall.component2 + 1] = cArr2[i21];
                    }
                }
                cancelall.component2 += 2;
            }
        }
        int i22 = $10 + 107;
        $11 = i22 % 128;
        int i23 = i22 % 2;
        for (int i24 = 0; i24 < i; i24++) {
            cArr4[i24] = (char) (cArr4[i24] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static {
        component2 = 0;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(new char[]{16, 14, 6, 4, 24, '\n', 22, 11, '\b', 7, 6, 21, '\b', 21, '\b', 11, 23, 6, 23, 22, 4, 14, '\b', 2, 11, 3, 21, 5, 23, 18, '\f', 11, 21, 4, 1, 7, '\f', 17, 6, 14, 17, 6, 6, 3, 5, 15, 23, 1, 16, 23, 18, 14, 11, 16, 0, 18, '\b', 16, 14, '\f', 14, 20, 16, 7, '\f', 17, 6, '\n', 17, 6, 13879}, (byte) (Drawable.resolveOpacity(0, 0) + 65), Color.blue(0) + 71, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component3 + 115;
        component2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void ShareDataUIState() {
        copydefault = new char[]{2004, 1966, 2038, 2030, 2005, 1997, 2025, 2021, 2028, 2029, 2034, 2031, 2039, 2036, 2037, 1992, 2020, 2006, 2035, 2019, 2024, 2017, 2032, 2023, 2041};
        ShareDataUIState = (char) 12831;
    }
}
