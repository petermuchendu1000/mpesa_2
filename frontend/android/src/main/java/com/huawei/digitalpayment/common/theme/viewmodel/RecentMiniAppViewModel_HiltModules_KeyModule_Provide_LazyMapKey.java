package com.huawei.digitalpayment.common.theme.viewmodel;

import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.primitives.SignedBytes;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelAll;
import org.apache.commons.lang3.CharUtils;

public final class RecentMiniAppViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static char ShareDataUIState;
    private static char[] component1;
    static RecentMiniAppViewModel component3;
    private static int copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {5, SignedBytes.MAX_POWER_OF_TWO, 127, 81};
    private static final int $$b = 74;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, short r7, int r8) {
        /*
            int r8 = r8 * 3
            int r8 = 119 - r8
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r6 = r6 * 3
            int r6 = 1 - r6
            byte[] r0 = com.huawei.digitalpayment.common.theme.viewmodel.RecentMiniAppViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r7]
        L26:
            int r8 = r8 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.viewmodel.RecentMiniAppViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(int, short, int):java.lang.String");
    }

    private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = component1;
        char c2 = '0';
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 43;
                $10 = i7 % 128;
                if (i7 % i4 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatDelay() >> 16) + 7422, (Process.myTid() >> 22) + 15, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i6--;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7470 - AndroidCharacter.getMirror('0'), 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (64291 - View.combineMeasuredStates(0, 0)), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i6++;
                }
                i4 = 2;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(ShareDataUIState)};
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7422 - (Process.myPid() >> 22), 15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 64292), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i8 = $11 + 43;
            $10 = i8 % 128;
            int i9 = i8 % 2;
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
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    obj = obj2;
                } else {
                    Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", c2, 0) + 7118, 14 - TextUtils.getOffsetAfter("", 0), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 44463), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue() == cancelall.getAsAtTimestamp) {
                        int i10 = $10 + 35;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        Object[] objArr6 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault5 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2944 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 24 - (ViewConfiguration.getEdgeSlop() >> 16), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 27636), 794909189, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objCopydefault5).invoke(null, objArr6)).intValue();
                        int i12 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr2[i12];
                    } else {
                        obj = null;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i13 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i14 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[i13];
                            cArr4[cancelall.component2 + 1] = cArr2[i14];
                        } else {
                            int i15 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i16 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr2[i15];
                            cArr4[cancelall.component2 + 1] = cArr2[i16];
                            int i17 = $11 + 27;
                            $10 = i17 % 128;
                            i3 = 2;
                            int i18 = i17 % 2;
                            cancelall.component2 += i3;
                            obj2 = obj;
                            c2 = '0';
                        }
                    }
                }
                i3 = 2;
                cancelall.component2 += i3;
                obj2 = obj;
                c2 = '0';
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static {
        copydefault = 1;
        component1();
        Object[] objArr = new Object[1];
        a(new char[]{'\f', 11, 20, 23, '\t', 1, 16, 2, 21, 1, 20, 17, 24, 11, 22, 24, 18, '\f', '\f', 22, 19, 23, 15, 21, 24, 23, '\f', 11, 13866, 13866, 15, 0, 23, 24, 11, 21, 21, 19, 2, 7, 1, 21, 4, 21, 15, 20, 18, 11, 20, 7, 21, 16, 15, 21, 3, '\b', 22, 21, 24, 6, 13853, 13853, 1, 20, 21, 6, 0, CharUtils.CR, 16, 17, 13865}, (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 51), 71 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component2 + 29;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    static void component1() {
        component1 = new char[]{2006, 2039, 2038, 1997, 2037, 2002, 2024, 2032, 2007, 1985, 2031, 2019, 2005, 2028, 2023, 2020, 2021, 2017, 2041, 2004, 2030, 2025, 1966, 2036, 2029};
        ShareDataUIState = (char) 12831;
    }
}
