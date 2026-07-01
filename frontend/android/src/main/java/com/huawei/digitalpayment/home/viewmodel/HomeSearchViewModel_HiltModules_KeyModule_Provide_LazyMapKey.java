package com.huawei.digitalpayment.home.viewmodel;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelAll;
import org.apache.commons.lang3.CharUtils;

public final class HomeSearchViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static char[] ShareDataUIState;
    private static char component1;
    static HomeSearchViewModel component3;
    private static int copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {126, 1, Ascii.SUB, -71};
    private static final int $$b = 235;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, short r7, byte r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.home.viewmodel.HomeSearchViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r8 = r8 * 2
            int r8 = r8 + 1
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r6 = r6 * 3
            int r6 = r6 + 119
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2c
        L17:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            int r3 = r3 + 1
            if (r3 != r8) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L2a:
            r4 = r0[r6]
        L2c:
            int r7 = r7 + r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.viewmodel.HomeSearchViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(int, short, byte):java.lang.String");
    }

    private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        long j;
        int i3 = 2;
        int i4 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = ShareDataUIState;
        Object obj = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 55;
                $11 = i6 % 128;
                if (i6 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 7422, 15 - Color.red(0), (char) (ImageFormat.getBitsPerPixel(0) + 64292), 682917265, false, "v", new Class[]{Integer.TYPE});
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
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7422 - Color.green(0), TextUtils.lastIndexOf("", '0', 0) + 16, (char) (Color.alpha(0) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                        i5++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i3 = 2;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(component1)};
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        long j2 = 0;
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollDefaultDelay() >> 16) + 7422, 15 - View.MeasureSpec.getMode(0), (char) (64292 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i7 = $11 + 45;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                i2 = i + 47;
                cArr4[i2] = (char) (cArr[i2] >> b2);
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
                    int i8 = $11 + 105;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    j = j2;
                } else {
                    Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7117 - Drawable.resolveOpacity(0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14, (char) (44463 - (ViewConfiguration.getTouchSlop() >> 8)), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objCopydefault4).invoke(obj, objArr5)).intValue() == cancelall.getAsAtTimestamp) {
                        int i10 = $11 + 75;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        Object[] objArr6 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault5 == null) {
                            j = 0;
                            int i12 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2943;
                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 24;
                            char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27638);
                            byte b3 = (byte) ($$a[1] - 1);
                            byte b4 = b3;
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i12, iNormalizeMetaState, c2, 794909189, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            j = 0;
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objCopydefault5).invoke(null, objArr6)).intValue();
                        int i13 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr2[i13];
                    } else {
                        j = 0;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            int i14 = $10 + 109;
                            $11 = i14 % 128;
                            int i15 = i14 % 2;
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i16 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i17 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[i16];
                            cArr4[cancelall.component2 + 1] = cArr2[i17];
                        } else {
                            int i18 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i19 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr2[i18];
                            cArr4[cancelall.component2 + 1] = cArr2[i19];
                        }
                    }
                }
                cancelall.component2 += 2;
                j2 = j;
            }
        }
        for (int i20 = 0; i20 < i; i20++) {
            cArr4[i20] = (char) (cArr4[i20] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static {
        copydefault = 0;
        copydefault();
        Object[] objArr = new Object[1];
        a(new char[]{1, 21, 21, 2, 15, 2, 22, '\b', 1, '\f', 4, 21, '\f', 14, '\n', 21, 24, CharUtils.CR, CharUtils.CR, 20, 17, 2, 0, 17, 21, 0, 18, 17, 2, 7, 2, 4, '\f', 1, '\f', 2, 19, 21, 4, '\f', 4, 6, 17, 21, 3, 7, 3, 22, 6, 20, 18, 19, '\f', 1, '\b', 7, 19, 21, 4, '\f'}, (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 4), (ViewConfiguration.getLongPressTimeout() >> 16) + 60, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component2 + 17;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    static void copydefault() {
        ShareDataUIState = new char[]{2037, 1966, 2021, 2038, 2027, 2034, 1997, 2039, 2003, 1992, 2032, 2025, 2041, 2023, 2028, 2030, 2031, 2024, 2006, 2026, 2036, 2019, 2029, 2017, 2020};
        component1 = (char) 12831;
    }
}
