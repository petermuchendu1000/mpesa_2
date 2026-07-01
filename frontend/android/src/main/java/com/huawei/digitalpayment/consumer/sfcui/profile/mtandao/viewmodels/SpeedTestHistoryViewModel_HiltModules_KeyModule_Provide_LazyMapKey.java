package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.alibaba.fastjson.parser.JSONLexer;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelAll;
import org.apache.commons.lang3.CharUtils;

public final class SpeedTestHistoryViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static int ShareDataUIState;
    private static char component1;
    private static char[] component3;
    static SpeedTestHistoryViewModel copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {77, -67, -125, 9};
    private static final int $$b = 239;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r7, byte r8, int r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestHistoryViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r7 = r7 * 2
            int r7 = 1 - r7
            int r9 = r9 * 3
            int r9 = r9 + 119
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2b
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2b:
            int r8 = r8 + r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestHistoryViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(short, byte, int):java.lang.String");
    }

    private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        char c2;
        Object obj;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = component3;
        char c3 = 6;
        int i4 = 8;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 89;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarSize() >> i4) + 7422, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                        if (objCopydefault2 == null) {
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7421 - MotionEvent.axisFromString(""), (ViewConfiguration.getFadingEdgeLength() >> 16) + 15, (char) (64291 - ((Process.getThreadPriority(0) + 20) >> 6)), 682917265, false, "v", new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i5++;
                i4 = 8;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(component1)};
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7423 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 15, (char) (TextUtils.lastIndexOf("", '0') + 64292), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i7 = $10 + 5;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
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
                    c2 = c3;
                    obj = obj2;
                } else {
                    Object[] objArr5 = new Object[13];
                    objArr5[12] = cancelall;
                    objArr5[11] = Integer.valueOf(cCharValue);
                    objArr5[10] = cancelall;
                    objArr5[9] = cancelall;
                    objArr5[8] = Integer.valueOf(cCharValue);
                    objArr5[7] = cancelall;
                    objArr5[c3] = cancelall;
                    objArr5[5] = Integer.valueOf(cCharValue);
                    objArr5[4] = cancelall;
                    objArr5[3] = cancelall;
                    objArr5[2] = Integer.valueOf(cCharValue);
                    objArr5[1] = cancelall;
                    objArr5[0] = cancelall;
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault4 == null) {
                        int scrollDefaultDelay = 7117 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int iGreen = Color.green(0) + 14;
                        char cMyTid = (char) (44463 - (Process.myTid() >> 22));
                        Class[] clsArr = new Class[13];
                        clsArr[0] = Object.class;
                        clsArr[1] = Object.class;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Object.class;
                        clsArr[4] = Object.class;
                        clsArr[5] = Integer.TYPE;
                        clsArr[c3] = Object.class;
                        clsArr[7] = Object.class;
                        clsArr[8] = Integer.TYPE;
                        clsArr[9] = Object.class;
                        clsArr[10] = Object.class;
                        clsArr[11] = Integer.TYPE;
                        clsArr[12] = Object.class;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(scrollDefaultDelay, iGreen, cMyTid, 1150140696, false, "x", clsArr);
                    }
                    if (((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue() == cancelall.getAsAtTimestamp) {
                        int i8 = $10 + 107;
                        $11 = i8 % 128;
                        int i9 = i8 % 2;
                        Object[] objArr6 = new Object[11];
                        objArr6[10] = cancelall;
                        objArr6[9] = Integer.valueOf(cCharValue);
                        objArr6[8] = cancelall;
                        objArr6[7] = Integer.valueOf(cCharValue);
                        objArr6[c3] = Integer.valueOf(cCharValue);
                        objArr6[5] = cancelall;
                        objArr6[4] = cancelall;
                        objArr6[3] = Integer.valueOf(cCharValue);
                        objArr6[2] = Integer.valueOf(cCharValue);
                        objArr6[1] = cancelall;
                        objArr6[0] = cancelall;
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault5 == null) {
                            int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2944;
                            int iIndexOf = 23 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                            char c4 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 27636);
                            byte b3 = (byte) 0;
                            byte b4 = (byte) (b3 - 1);
                            String str$$c = $$c(b3, b4, (byte) (b4 + 1));
                            c2 = 6;
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(scrollDefaultDelay2, iIndexOf, c4, 794909189, false, str$$c, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c2 = c3;
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objCopydefault5).invoke(null, objArr6)).intValue();
                        int i10 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr2[i10];
                    } else {
                        c2 = c3;
                        obj = null;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i11 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i12 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[i11];
                            cArr4[cancelall.component2 + 1] = cArr2[i12];
                        } else {
                            int i13 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i14 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr2[i13];
                            cArr4[cancelall.component2 + 1] = cArr2[i14];
                        }
                    }
                }
                cancelall.component2 += 2;
                obj2 = obj;
                c3 = c2;
            }
        }
        int i15 = 0;
        while (i15 < i) {
            int i16 = $10 + 45;
            int i17 = i16 % 128;
            $11 = i17;
            int i18 = i16 % 2;
            cArr4[i15] = (char) (cArr4[i15] ^ 13722);
            i15++;
            int i19 = i17 + 67;
            $10 = i19 % 128;
            int i20 = i19 % 2;
        }
        objArr[0] = new String(cArr4);
    }

    static {
        ShareDataUIState = 0;
        component2();
        Object[] objArr = new Object[1];
        a(new char[]{5, '!', 30, '\n', 22, '\"', '\b', 22, 15, 24, '\t', '\f', 29, '\t', 28, JSONLexer.EOI, 11, 4, '\"', '\t', '\n', 31, 18, 0, 24, 7, 5, '!', 31, 18, '\"', 4, 14, 6, 7, 18, 5, 4, 29, 28, '\t', 30, 11, ' ', 3, 28, 0, 17, '\n', 30, 28, 7, '!', '\f', 11, '\"', 7, '\f', 24, 15, 22, ' ', '!', 17, 17, 0, 18, 7, 21, '#', 13888, 13888, 14, 3, CharUtils.CR, 18, 24, 1, 25, 21, 29, 31, '\t', '\b', '!', JSONLexer.EOI, 14, 18, 23, 5, 16, CharUtils.CR, 13879}, (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 65), 94 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component2 + 111;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component2() {
        component3 = new char[]{1992, 1993, 2004, 2019, 2022, 2028, 1966, 2041, 2034, 1996, 2017, 2023, 2021, 2038, 1986, 2020, 2024, 1997, 1984, 2035, 2039, 1999, 1998, 2003, 1985, 2036, 1990, 2025, 2037, 1991, 2030, 1987, 2006, 2032, 2029, 2031};
        component1 = (char) 12828;
    }
}
