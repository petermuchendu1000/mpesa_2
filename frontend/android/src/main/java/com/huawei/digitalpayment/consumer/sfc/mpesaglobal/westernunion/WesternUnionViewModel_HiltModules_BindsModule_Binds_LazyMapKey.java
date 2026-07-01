package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelAll;
import org.apache.commons.lang3.CharUtils;

public final class WesternUnionViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    static WesternUnionViewModel ShareDataUIState;
    private static int component1;
    private static char component3;
    private static char[] copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {69, -50, 81, 75};
    private static final int $$b = 195;
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
    private static java.lang.String $$c(short r5, byte r6, short r7) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r6 = r6 * 3
            int r6 = 119 - r6
            int r5 = r5 * 2
            int r5 = 4 - r5
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            r4 = r0[r5]
        L26:
            int r6 = r6 + r4
            int r5 = r5 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(short, byte, short):java.lang.String");
    }

    private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2;
        int i4 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = copydefault;
        Object obj2 = null;
        if (cArr2 != null) {
            int i5 = $10 + 19;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getMode(0) + 7422, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15, (char) (ExpandableListView.getPackedPositionChild(0L) + 64292), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i7++;
                    int i8 = $11 + 95;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
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
        Object[] objArr3 = {Integer.valueOf(component3)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7422 - TextUtils.indexOf("", "", 0), 15 - View.resolveSize(0, 0), (char) ((Process.myPid() >> 22) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
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
                int i10 = $11 + 49;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    int i12 = $10 + 77;
                    $11 = i12 % 128;
                    int i13 = i12 % i3;
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
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 7117;
                        int iGreen = Color.green(0) + 14;
                        char cIndexOf = (char) (44462 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
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
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(scrollDefaultDelay, iGreen, cIndexOf, 1150140696, false, "x", clsArr);
                    }
                    if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                        int i14 = $10 + 55;
                        $11 = i14 % 128;
                        int i15 = i14 % i3;
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
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2943, 24 - TextUtils.getTrimmedLength(""), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 27637), 794909189, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                        int i16 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr2[i16];
                    } else {
                        obj = null;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            int i17 = $11 + 87;
                            $10 = i17 % 128;
                            int i18 = i17 % 2;
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i19 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i20 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[i19];
                            cArr4[cancelall.component2 + 1] = cArr2[i20];
                        } else {
                            int i21 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i22 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr2[i21];
                            cArr4[cancelall.component2 + 1] = cArr2[i22];
                        }
                    }
                }
                cancelall.component2 += 2;
                obj2 = obj;
                i3 = 2;
            }
        }
        for (int i23 = 0; i23 < i; i23++) {
            cArr4[i23] = (char) (cArr4[i23] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static {
        component1 = 1;
        copydefault();
        Object[] objArr = new Object[1];
        a(new char[]{'\t', CharUtils.CR, 16, 23, 21, 0, 15, 5, CharUtils.CR, 22, 22, 23, 22, '\b', 21, 18, '\f', 15, 20, 15, '\b', 16, '\n', 7, 21, 1, '\t', CharUtils.CR, '\t', 20, 3, 16, CharUtils.CR, 14, 22, 20, CharUtils.CR, 6, 23, 16, 17, '\n', 20, 14, '\f', 22, 19, '\t', '\f', 15, 20, 1, 14, 22, 17, 11, '\n', '\b', 0, 6, 24, CharUtils.CR, 6, 20, 17, 14, 21, 19, CharUtils.CR, 14, '\b', 0, '\b', 20, '\n', '\t', 3, 22, '\n', 2, 14, 19, 2, 17, 13897}, (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 83), 85 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component2 + 77;
        component1 = i % 128;
        int i2 = i % 2;
    }

    static void copydefault() {
        copydefault = new char[]{2039, 2037, 2006, 2005, 2018, 2030, 2041, 2023, 2019, 1997, 2017, 2022, 2021, 2034, 2031, 2032, 2036, 2028, 2029, 2007, 2024, 1966, 2020, 2025, 2035};
        component3 = (char) 12831;
    }
}
