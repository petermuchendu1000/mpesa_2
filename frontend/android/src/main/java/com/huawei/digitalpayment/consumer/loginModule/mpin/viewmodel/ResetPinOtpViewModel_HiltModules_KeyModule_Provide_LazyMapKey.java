package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelAll;
import org.apache.commons.lang3.CharUtils;

public final class ResetPinOtpViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    static ResetPinOtpViewModel ShareDataUIState;
    private static char[] component2;
    private static char component3;
    private static int copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {79, -7, -1, -17};
    private static final int $$b = 28;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, short r8) {
        /*
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r8 = r8 * 2
            int r8 = r8 + 119
            byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ResetPinOtpViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r6 = r6 * 2
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L19
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ResetPinOtpViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(short, short, short):java.lang.String");
    }

    private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = component2;
        Object obj2 = null;
        if (cArr2 != null) {
            int i4 = $10 + 89;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                int i7 = $10 + 23;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(0, 0, 0) + 7422, View.combineMeasuredStates(0, 0) + 15, (char) (64291 - Color.red(0)), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i9 = $11 + 31;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(component3)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(0, 0, 0) + 7422, 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (AndroidCharacter.getMirror('0') + 64243), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i11 = $11 + 125;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            cancelall.component2 = 0;
            while (cancelall.component2 < i2) {
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    int i13 = $11 + 9;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        cArr4[cancelall.component2] = (char) (cancelall.component1 >> b2);
                        cArr4[cancelall.component2] = (char) (cancelall.component3 * b2);
                    } else {
                        cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                        cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    }
                    obj = obj2;
                } else {
                    Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7117 - Color.alpha(0), 15 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (Drawable.resolveOpacity(0, 0) + 44463), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                        int i14 = $10 + 87;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                        Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault4 == null) {
                            int bitsPerPixel = 2943 - ImageFormat.getBitsPerPixel(0);
                            int iResolveSizeAndState = 24 - View.resolveSizeAndState(0, 0, 0);
                            char c2 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27637);
                            byte b3 = (byte) ($$a[2] + 1);
                            byte b4 = b3;
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(bitsPerPixel, iResolveSizeAndState, c2, 794909189, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                        int i16 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr2[i16];
                    } else {
                        obj = null;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i17 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i18 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[i17];
                            cArr4[cancelall.component2 + 1] = cArr2[i18];
                        } else {
                            int i19 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i20 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr2[i19];
                            cArr4[cancelall.component2 + 1] = cArr2[i20];
                        }
                    }
                }
                cancelall.component2 += 2;
                obj2 = obj;
            }
        }
        for (int i21 = 0; i21 < i; i21++) {
            cArr4[i21] = (char) (cArr4[i21] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static {
        copydefault = 0;
        component2();
        Object[] objArr = new Object[1];
        a(new char[]{16, '\b', 1, 0, 11, 17, 6, 4, '\f', 20, 3, 24, 20, 17, 24, '\f', 7, 4, '\t', 5, '\n', 3, '\f', 5, 19, '\t', 16, '\b', 6, '\f', 15, 1, '\f', 15, 0, 3, 5, 16, 2, '\f', 6, 7, 21, 18, 0, '\f', 0, 1, 7, 23, '\t', 2, 20, 23, 11, 0, 1, 5, 20, CharUtils.CR, 3, 0, 20, 11, '\f', 11, CharUtils.CR, 4, 2, '\f', 24, 19, 5, 23, 20, '\f', 0, 6, '\b', 21, '\f', 0}, (byte) (Color.red(0) + 55), 81 - TextUtils.lastIndexOf("", '0', 0, 0), objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component1 + 1;
        copydefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 82 / 0;
        }
    }

    static void component2() {
        component2 = new char[]{2029, 2039, 2028, 2000, 1966, 1997, 2031, 2030, 2032, 2017, 2021, 2035, 2024, 2041, 2036, 2023, 2037, 2034, 2019, 1999, 2006, 2002, 2025, 2020, 2038};
        component3 = (char) 12831;
    }
}
