package com.huawei.digitalpayment.consumer.sfcui.profile.viewmodel;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelAll;
import org.apache.commons.lang3.CharUtils;

public final class BiometricsViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static int ShareDataUIState;
    private static char component1;
    static BiometricsViewModel component2;
    private static char[] component3;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {112, 44, -46, -27};
    private static final int $$b = 202;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copydefault = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, byte r8) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 119
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.profile.viewmodel.BiometricsViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r6 = r6 * 2
            int r6 = 3 - r6
            int r8 = r8 * 3
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r6
            r4 = r8
            r3 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r6 = r6 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.viewmodel.BiometricsViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, byte, byte):java.lang.String");
    }

    private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        Object obj;
        int i4 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = component3;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((-16769794) - Color.rgb(0, 0, 0), 15 - Color.green(0), (char) (TextUtils.lastIndexOf("", '0', 0) + 64292), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i6 = $10 + 33;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(component1)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
            int i8 = 8;
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7422 - (ViewConfiguration.getWindowTouchSlop() >> 8), 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (64290 - TextUtils.indexOf((CharSequence) "", '0', 0)), 682917265, false, "v", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i9 = $11 + 105;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                int i11 = $10 + 119;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    cancelall.component2 = 1;
                } else {
                    cancelall.component2 = 0;
                }
                while (cancelall.component2 < i2) {
                    cancelall.component1 = cArr[cancelall.component2];
                    cancelall.component3 = cArr[cancelall.component2 + 1];
                    if (cancelall.component1 == cancelall.component3) {
                        cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                        cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                        i3 = i8;
                        obj = obj2;
                    } else {
                        Object[] objArr4 = new Object[13];
                        objArr4[12] = cancelall;
                        objArr4[11] = Integer.valueOf(cCharValue);
                        objArr4[10] = cancelall;
                        objArr4[9] = cancelall;
                        objArr4[i8] = Integer.valueOf(cCharValue);
                        objArr4[7] = cancelall;
                        objArr4[6] = cancelall;
                        objArr4[5] = Integer.valueOf(cCharValue);
                        objArr4[4] = cancelall;
                        objArr4[3] = cancelall;
                        objArr4[2] = Integer.valueOf(cCharValue);
                        objArr4[1] = cancelall;
                        objArr4[0] = cancelall;
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                        if (objCopydefault3 == null) {
                            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 7117;
                            int deadChar = KeyEvent.getDeadChar(0, 0) + 14;
                            char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 44463);
                            Class[] clsArr = new Class[13];
                            clsArr[0] = Object.class;
                            clsArr[1] = Object.class;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Object.class;
                            clsArr[4] = Object.class;
                            clsArr[5] = Integer.TYPE;
                            clsArr[6] = Object.class;
                            clsArr[7] = Object.class;
                            clsArr[i8] = Integer.TYPE;
                            clsArr[9] = Object.class;
                            clsArr[10] = Object.class;
                            clsArr[11] = Integer.TYPE;
                            clsArr[12] = Object.class;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(threadPriority, deadChar, jumpTapTimeout, 1150140696, false, "x", clsArr);
                        }
                        if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                            try {
                                Object[] objArr5 = new Object[11];
                                objArr5[10] = cancelall;
                                objArr5[9] = Integer.valueOf(cCharValue);
                                objArr5[i8] = cancelall;
                                objArr5[7] = Integer.valueOf(cCharValue);
                                objArr5[6] = Integer.valueOf(cCharValue);
                                objArr5[5] = cancelall;
                                objArr5[4] = cancelall;
                                objArr5[3] = Integer.valueOf(cCharValue);
                                objArr5[2] = Integer.valueOf(cCharValue);
                                objArr5[1] = cancelall;
                                objArr5[0] = cancelall;
                                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                                if (objCopydefault4 == null) {
                                    int gidForName = Process.getGidForName("") + 2945;
                                    int edgeSlop = 24 - (ViewConfiguration.getEdgeSlop() >> 16);
                                    char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> i8) + 27637);
                                    byte b3 = (byte) 0;
                                    byte b4 = b3;
                                    String str$$c = $$c(b3, b4, b4);
                                    i3 = 8;
                                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(gidForName, edgeSlop, touchSlop, 794909189, false, str$$c, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                } else {
                                    i3 = i8;
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                                int i12 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                                cArr4[cancelall.component2] = cArr2[iIntValue];
                                cArr4[cancelall.component2 + 1] = cArr2[i12];
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } else {
                            i3 = i8;
                            obj = null;
                            if (cancelall.copydefault == cancelall.ShareDataUIState) {
                                cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                                cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                                int i13 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                                int i14 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                                cArr4[cancelall.component2] = cArr2[i13];
                                cArr4[cancelall.component2 + 1] = cArr2[i14];
                                int i15 = $10 + 97;
                                $11 = i15 % 128;
                                int i16 = i15 % 2;
                            } else {
                                int i17 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                                int i18 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                                cArr4[cancelall.component2] = cArr2[i17];
                                cArr4[cancelall.component2 + 1] = cArr2[i18];
                            }
                        }
                    }
                    cancelall.component2 += 2;
                    obj2 = obj;
                    i8 = i3;
                }
            }
            int i19 = $11 + 21;
            $10 = i19 % 128;
            int i20 = i19 % 2;
            for (int i21 = 0; i21 < i; i21++) {
                int i22 = $11 + 99;
                $10 = i22 % 128;
                int i23 = i22 % 2;
                cArr4[i21] = (char) (cArr4[i21] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    static {
        ShareDataUIState = 1;
        component3();
        Object[] objArr = new Object[1];
        a(new char[]{5, 17, 19, CharUtils.CR, 22, 15, 16, 1, 18, 4, 19, 4, 4, 3, 0, CharUtils.CR, '\f', 21, 6, 14, 3, 19, 17, 14, 11, '\n', 5, 17, '\n', 7, 18, 19, 18, 14, '\n', '\t', 2, 5, 18, 2, 19, 14, '\n', 18, 1, 4, 24, 17, CharUtils.CR, 24, 4, 18, 23, 16, 19, 20, 17, 24, 11, 4, 0, 18, 19, 15, 11, 14, 2, '\b', 6, 15, 4, 18, 23, 6, 19, 20, 17, 24}, (byte) (13 - TextUtils.getTrimmedLength("")), 78 - Color.green(0), objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = copydefault + 27;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    static void component3() {
        component3 = new char[]{2022, 1986, 2023, 2025, 2041, 2035, 1050, 2019, 1997, 2032, 2036, 2017, 2030, 2034, 1966, 2031, 2006, 2037, 2029, 2021, 2024, 2039, 2028, 2038, 2020};
        component1 = (char) 12831;
    }
}
