package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelAll;
import org.apache.commons.lang3.CharUtils;

public final class PinLoginViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    static PinLoginViewModel ShareDataUIState;
    private static char[] component1;
    private static int component3;
    private static char copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {34, -66, 77, Ascii.DC2};
    private static final int $$b = 35;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r5, byte r6, byte r7) {
        /*
            int r5 = r5 * 2
            int r0 = 1 - r5
            byte[] r1 = com.huawei.digitalpayment.consumer.loginModule.login.viewmodel.PinLoginViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r6 = r6 * 3
            int r6 = r6 + 4
            int r7 = r7 * 4
            int r7 = 119 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L18
            r4 = r5
            r3 = r2
            goto L28
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            int r3 = r3 + 1
            r4 = r1[r6]
        L28:
            int r6 = r6 + 1
            int r4 = -r4
            int r7 = r7 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.login.viewmodel.PinLoginViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(short, byte, byte):java.lang.String");
    }

    private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = component1;
        Object obj2 = null;
        float f = 0.0f;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)) + 7422, 16 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i4++;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(copydefault)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7422, 15 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (64291 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 682917265, false, "v", new Class[]{Integer.TYPE});
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
                cancelall.component2 = 0;
                while (cancelall.component2 < i2) {
                    int i5 = $10 + 99;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    cancelall.component1 = cArr[cancelall.component2];
                    cancelall.component3 = cArr[cancelall.component2 + 1];
                    if (cancelall.component1 == cancelall.component3) {
                        int i7 = $10 + 19;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
                        cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                        cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                        int i9 = $10 + 99;
                        $11 = i9 % 128;
                        int i10 = i9 % 2;
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                        if (objCopydefault3 == null) {
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7117 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14, (char) (44463 - (ViewConfiguration.getEdgeSlop() >> 16)), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                            int i11 = $11 + 121;
                            $10 = i11 % 128;
                            int i12 = i11 % 2;
                            Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                            if (objCopydefault4 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2944 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24, (char) (27637 - Color.argb(0, 0, 0, 0)), 794909189, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                            int i13 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[iIntValue];
                            cArr4[cancelall.component2 + 1] = cArr2[i13];
                        } else {
                            obj = null;
                            if (cancelall.copydefault == cancelall.ShareDataUIState) {
                                cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                                cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                                int i14 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                                int i15 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                                cArr4[cancelall.component2] = cArr2[i14];
                                cArr4[cancelall.component2 + 1] = cArr2[i15];
                            } else {
                                int i16 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                                int i17 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                                cArr4[cancelall.component2] = cArr2[i16];
                                cArr4[cancelall.component2 + 1] = cArr2[i17];
                            }
                        }
                    }
                    cancelall.component2 += 2;
                    obj2 = obj;
                }
            }
            int i18 = 0;
            while (i18 < i) {
                int i19 = $10 + 29;
                $11 = i19 % 128;
                if (i19 % 2 == 0) {
                    cArr4[i18] = (char) (cArr4[i18] ^ 11549);
                    i18 += 102;
                } else {
                    cArr4[i18] = (char) (cArr4[i18] ^ 13722);
                    i18++;
                }
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
        component3 = 1;
        component3();
        Object[] objArr = new Object[1];
        a(new char[]{0, 22, 2, 18, 14, 24, '\t', 22, '\t', CharUtils.CR, 16, '\f', CharUtils.CR, 24, '\n', 4, '\b', 17, '\f', 5, 2, 4, 6, 18, 2, 15, 0, 22, 15, 6, 18, 4, 7, 23, 18, 19, 21, 24, 11, 19, '\n', 23, 14, 16, 23, CharUtils.CR, 18, 19, 21, 24, 11, 19, 22, 17, CharUtils.CR, '\t', 23, 4, 21, '\n', CharUtils.CR, 23, 19, 2, 11, 19, 20, 0, 24, CharUtils.CR, 21, 11, CharUtils.CR, '\t', 23, 14, 21, '\n', CharUtils.CR, 23}, (byte) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 12), TextUtils.lastIndexOf("", '0', 0) + 81, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component2 + 43;
        component3 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void component3() {
        component1 = new char[]{2036, 2041, 2019, 2029, 2000, 2035, 2006, 2017, 2021, 2024, 2032, 2020, 2038, 1997, 2025, 1996, 2030, 1966, 2028, 2037, 2031, 2026, 2034, 2023, 2039};
        copydefault = (char) 12831;
    }
}
