package com.huawei.digitalpayment.consumer.baselib.util;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.Utils;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelAll;

public class IdentityPinUtils {
    private static final String component1;
    private static char[] component3;
    private static int component4;
    private static char copydefault;
    private static final byte[] $$a = {99, TarHeader.LF_DIR, 44, 107};
    private static final int $$b = 35;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getRequestBeneficiariesState = 0;
    private static int component2 = 0;
    private static int ShareDataUIState = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, short r8) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 119
            byte[] r0 = com.huawei.digitalpayment.consumer.baselib.util.IdentityPinUtils.$$a
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r7 = -r7
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.util.IdentityPinUtils.$$c(int, int, short):java.lang.String");
    }

    public static Intent getIdentityPinIntent() {
        int i = 2 % 2;
        Intent intent = new Intent();
        String packageName = Utils.getApp().getPackageName();
        Object[] objArr = new Object[1];
        a(new char[]{'\n', 6, 15, 0, 16, 4, 24, 7, 11, 21, 0, 20, 19, 21, 21, 1, 23, 17, 2, 23, 0, 14, 7, '\t', 22, 21, '\n', 6, 7, 18, 0, 11, 7, 1, 0, 15, 1, 18, 5, 23, 6, 21, 21, 23, 16, 1, 19, 11, 21, 1, 0, 24, 5, 17, 7, '\t', 1, 21, 24, 3, 11, 17, 5, 3, 16, 1, 19, 11, 21, 1, 13846}, (byte) (51 - (ViewConfiguration.getEdgeSlop() >> 16)), ((Process.getThreadPriority(0) + 20) >> 6) + 71, objArr);
        intent.setClassName(packageName, ((String) objArr[0]).intern());
        int i2 = component2 + 39;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return intent;
    }

    private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = component3;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = $10 + 73;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0) + 7423, 16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (64291 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(copydefault)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7422, 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (TextUtils.lastIndexOf("", '0') + 64292), 682917265, false, "v", new Class[]{Integer.TYPE});
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
                int i7 = $11 + 69;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    obj = obj2;
                } else {
                    try {
                        Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                        if (objCopydefault3 == null) {
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> 16) + 7117, 14 - Color.argb(0, 0, 0, 0), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 44463), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                            Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                            if (objCopydefault4 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2944 - (ViewConfiguration.getWindowTouchSlop() >> 8), 24 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (27637 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 794909189, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                            int i9 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[iIntValue];
                            cArr4[cancelall.component2 + 1] = cArr2[i9];
                        } else {
                            obj = null;
                            if (cancelall.copydefault == cancelall.ShareDataUIState) {
                                int i10 = $11 + 53;
                                $10 = i10 % 128;
                                int i11 = i10 % 2;
                                cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                                cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                                int i12 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                                int i13 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                                cArr4[cancelall.component2] = cArr2[i12];
                                cArr4[cancelall.component2 + 1] = cArr2[i13];
                            } else {
                                int i14 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                                int i15 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                                cArr4[cancelall.component2] = cArr2[i14];
                                cArr4[cancelall.component2 + 1] = cArr2[i15];
                            }
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                cancelall.component2 += 2;
                obj2 = obj;
            }
        }
        int i16 = 0;
        while (i16 < i) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
            i16++;
            int i17 = $11 + 39;
            $10 = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 2 / 5;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static {
        component4 = 1;
        component3();
        Object[] objArr = new Object[1];
        a(new char[]{'\n', 6, 15, 0, 16, 4, 24, 7, 11, 21, 0, 20, 19, 21, 21, 1, 23, 17, 2, 23, 0, 14, 7, '\t', 22, 21, '\n', 6, 7, 18, 0, 11, 7, 1, 0, 15, 1, 18, 5, 23, 6, 21, 21, 23, 16, 1, 19, 11, 21, 1, 0, 24, 5, 17, 7, '\t', 1, 21, 24, 3, 11, 17, 5, 3, 16, 1, 19, 11, 21, 1, 13846}, (byte) (51 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 71, objArr);
        component1 = ((String) objArr[0]).intern();
        int i = getRequestBeneficiariesState + 71;
        component4 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void component3() {
        component3 = new char[]{1985, 2037, 2034, 2032, 2041, 2031, 2021, 1993, 2030, 2039, 2029, 2019, 2000, 1990, 2038, 2020, 2025, 2035, 2028, 2024, 1966, 2036, 2017, 2022, 2023};
        copydefault = (char) 12831;
    }
}
