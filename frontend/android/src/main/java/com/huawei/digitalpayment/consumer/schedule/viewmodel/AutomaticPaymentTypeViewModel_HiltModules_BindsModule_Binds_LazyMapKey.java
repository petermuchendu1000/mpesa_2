package com.huawei.digitalpayment.consumer.schedule.viewmodel;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelAll;
import org.apache.commons.lang3.CharUtils;

public final class AutomaticPaymentTypeViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static char[] ShareDataUIState;
    private static char component1;
    private static int component3;
    static AutomaticPaymentTypeViewModel copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {120, -46, -95, -23};
    private static final int $$b = 173;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, short r6, short r7) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 119
            int r5 = r5 * 3
            int r5 = 4 - r5
            int r7 = r7 * 4
            int r0 = r7 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.schedule.viewmodel.AutomaticPaymentTypeViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r6
            r6 = r7
            r3 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r1[r5]
        L27:
            int r6 = r6 + r4
            int r5 = r5 + 1
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.schedule.viewmodel.AutomaticPaymentTypeViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(byte, short, short):java.lang.String");
    }

    private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3 = 2;
        int i4 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr3 = ShareDataUIState;
        float f = 0.0f;
        Object obj2 = null;
        if (cArr3 != null) {
            int i5 = $10 + 101;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7422 - View.MeasureSpec.getMode(0), 15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (64292 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1))), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i6++;
                    int i7 = $10 + 11;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i9 = $10 + 15;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr3 = cArr2;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(component1)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
            char c2 = '0';
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 7423, 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i11 = $10 + 109;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    i2 = i + 7;
                    cArr4[i2] = (char) (cArr[i2] - b2);
                } else {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b2);
                }
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                cancelall.component2 = 0;
                while (cancelall.component2 < i2) {
                    cancelall.component1 = cArr[cancelall.component2];
                    cancelall.component3 = cArr[cancelall.component2 + 1];
                    if (cancelall.component1 == cancelall.component3) {
                        int i12 = $10 + 11;
                        $11 = i12 % 128;
                        int i13 = i12 % i3;
                        cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                        cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = new Object[13];
                        objArr4[12] = cancelall;
                        objArr4[11] = Integer.valueOf(cCharValue);
                        objArr4[10] = cancelall;
                        objArr4[9] = cancelall;
                        objArr4[8] = Integer.valueOf(cCharValue);
                        objArr4[7] = cancelall;
                        objArr4[6] = cancelall;
                        objArr4[5] = Integer.valueOf(cCharValue);
                        objArr4[4] = cancelall;
                        objArr4[3] = cancelall;
                        objArr4[i3] = Integer.valueOf(cCharValue);
                        objArr4[1] = cancelall;
                        objArr4[0] = cancelall;
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                        if (objCopydefault3 == null) {
                            int iLastIndexOf = 7116 - TextUtils.lastIndexOf("", c2, 0, 0);
                            int i14 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 13;
                            char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 44463);
                            Class[] clsArr = new Class[13];
                            clsArr[0] = Object.class;
                            clsArr[1] = Object.class;
                            clsArr[i3] = Integer.TYPE;
                            clsArr[3] = Object.class;
                            clsArr[4] = Object.class;
                            clsArr[5] = Integer.TYPE;
                            clsArr[6] = Object.class;
                            clsArr[7] = Object.class;
                            clsArr[8] = Integer.TYPE;
                            clsArr[9] = Object.class;
                            clsArr[10] = Object.class;
                            clsArr[11] = Integer.TYPE;
                            clsArr[12] = Object.class;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf, i14, windowTouchSlop, 1150140696, false, "x", clsArr);
                        }
                        if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                            int i15 = $10 + 107;
                            $11 = i15 % 128;
                            int i16 = i15 % i3;
                            Object[] objArr5 = new Object[11];
                            objArr5[10] = cancelall;
                            objArr5[9] = Integer.valueOf(cCharValue);
                            objArr5[8] = cancelall;
                            objArr5[7] = Integer.valueOf(cCharValue);
                            objArr5[6] = Integer.valueOf(cCharValue);
                            objArr5[5] = cancelall;
                            objArr5[4] = cancelall;
                            objArr5[3] = Integer.valueOf(cCharValue);
                            objArr5[i3] = Integer.valueOf(cCharValue);
                            objArr5[1] = cancelall;
                            objArr5[0] = cancelall;
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                            if (objCopydefault4 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2944 - View.resolveSize(0, 0), Color.blue(0) + 24, (char) (27638 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 794909189, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                            int i17 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr3[iIntValue];
                            cArr4[cancelall.component2 + 1] = cArr3[i17];
                        } else {
                            obj = null;
                            if (cancelall.copydefault == cancelall.ShareDataUIState) {
                                int i18 = $11 + 15;
                                $10 = i18 % 128;
                                int i19 = i18 % 2;
                                cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                                cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                                int i20 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                                int i21 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                                cArr4[cancelall.component2] = cArr3[i20];
                                cArr4[cancelall.component2 + 1] = cArr3[i21];
                            } else {
                                int i22 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                                int i23 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                                cArr4[cancelall.component2] = cArr3[i22];
                                cArr4[cancelall.component2 + 1] = cArr3[i23];
                            }
                        }
                    }
                    cancelall.component2 += 2;
                    c2 = '0';
                    obj2 = obj;
                    i3 = 2;
                }
            }
            for (int i24 = 0; i24 < i; i24++) {
                cArr4[i24] = (char) (cArr4[i24] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static {
        component3 = 0;
        component1();
        Object[] objArr = new Object[1];
        a(new char[]{23, 21, 11, 0, 3, 22, 23, 11, 15, 7, 3, 16, '\n', 20, '\b', 0, 22, 11, 21, 1, 5, 11, 18, 15, 4, 2, 23, 21, 24, 14, 20, CharUtils.CR, 18, 7, 4, 6, 2, 7, 18, 19, 22, CharUtils.CR, 16, 2, 0, '\t', 18, '\f', 15, 0, 19, 18, 11, 2, '\b', 22, 0, 23, 11, 20, 0, '\b', 24, '\f', 1, 11, '\f', 15, 18, 4, 16, 11, 17, 18, 5, '\n', 18, '\f', 20, 21, 19, 18, 13820}, (byte) (6 - View.MeasureSpec.makeMeasureSpec(0, 0)), Color.argb(0, 0, 0, 0) + 83, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component2 + 3;
        component3 = i % 128;
        int i2 = i % 2;
    }

    static void component1() {
        ShareDataUIState = new char[]{2006, 1966, 2024, 2036, 2038, 2025, 2041, 1985, 2034, 2035, 2029, 2004, 2028, 2039, 2000, 2023, 2032, 2021, 2020, 2030, 2031, 2017, 2019, 2037, 1997};
        component1 = (char) 12831;
    }
}
