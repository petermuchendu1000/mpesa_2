package com.huawei.digitalpayment.common.theme.viewmodel;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelAll;
import org.apache.commons.lang3.CharUtils;

public final class LogoutViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static final byte[] $$a = {78, -86, -128, -128};
    private static final int $$b = 84;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ShareDataUIState = 0;
    static LogoutViewModel component1;
    private static int component2;
    private static char[] component3;
    private static char copydefault;
    public static String lazyClassKeyName;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, int r7, int r8) {
        /*
            int r8 = r8 * 2
            int r0 = 1 - r8
            int r6 = r6 * 2
            int r6 = r6 + 119
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r1 = com.huawei.digitalpayment.common.theme.viewmodel.LogoutViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L19
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L29:
            r3 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2e:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.viewmodel.LogoutViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(short, int, int):java.lang.String");
    }

    private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        char[] cArr2;
        int i3;
        int i4 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr3 = component3;
        int i5 = 64291;
        if (cArr3 != null) {
            int i6 = $11 + 15;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTapTimeout() >> 16) + 7422, 15 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (i5 - (KeyEvent.getMaxKeyCode() >> 16)), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr2[i3] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i3++;
                    int i7 = $10 + 55;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    i5 = 64291;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(copydefault)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        long j = 0;
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7423 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (TextUtils.indexOf("", "") + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i9 = $10 + 81;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cancelall.component2 = 1;
            } else {
                cancelall.component2 = 0;
            }
            while (cancelall.component2 < i2) {
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    int i10 = $11 + 45;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        cArr4[cancelall.component2] = (char) (cancelall.component1 << b2);
                        cArr4[cancelall.component2] = (char) (cancelall.component3 % b2);
                    } else {
                        cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                        cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    }
                } else {
                    Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7116 - ExpandableListView.getPackedPositionChild(j), 14 - View.combineMeasuredStates(0, 0), (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 44463), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                        int i11 = $10 + 11;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((-16774272) - Color.rgb(0, 0, 0), 24 - KeyEvent.getDeadChar(0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27638), 794909189, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                        int i13 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr3[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr3[i13];
                    } else if (cancelall.copydefault == cancelall.ShareDataUIState) {
                        cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                        cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                        int i14 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                        int i15 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr3[i14];
                        cArr4[cancelall.component2 + 1] = cArr3[i15];
                    } else {
                        int i16 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                        int i17 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                        cArr4[cancelall.component2] = cArr3[i16];
                        cArr4[cancelall.component2 + 1] = cArr3[i17];
                    }
                }
                cancelall.component2 += 2;
                j = 0;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static {
        component2 = 1;
        component3();
        Object[] objArr = new Object[1];
        a(new char[]{11, 1, 5, 4, 18, '\f', 11, '\f', 4, '\t', 1, 3, 0, 24, 2, '\t', CharUtils.CR, 15, 15, 11, 14, 7, 21, 4, 5, 2, 11, 1, 13870, 13870, 1, 6, 2, 5, 19, 22, 14, 4, 4, '\n', '\t', 4, 14, 6, 22, 1, 23, 19, 5, '\n', 22, 21, 23, 11, 5, 17, '\t', 4, CharUtils.CR, 6, 22, 1, 23, 19}, (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 55), 63 - TextUtils.lastIndexOf("", '0', 0), objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = ShareDataUIState + 103;
        component2 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component3() {
        component3 = new char[]{1966, 2030, 2020, 1954, 2025, 1996, 2019, 2036, 1997, 2029, 2017, 2039, 2041, 2037, 2038, 2006, 2032, 2024, 2028, 1965, 2023, 2031, 1967, 1964, 2021};
        copydefault = (char) 12831;
    }
}
