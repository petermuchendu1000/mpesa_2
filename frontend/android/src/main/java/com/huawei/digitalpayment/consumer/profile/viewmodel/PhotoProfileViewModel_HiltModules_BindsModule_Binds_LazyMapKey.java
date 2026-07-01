package com.huawei.digitalpayment.consumer.profile.viewmodel;

import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelAll;
import org.apache.commons.lang3.CharUtils;

public final class PhotoProfileViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static char ShareDataUIState;
    private static char[] component1;
    static PhotoProfileViewModel component3;
    private static int copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {101, 74, 115, 66};
    private static final int $$b = 168;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, byte r8) {
        /*
            int r7 = r7 * 4
            int r7 = 119 - r7
            int r8 = r8 * 4
            int r0 = 1 - r8
            int r6 = r6 + 4
            byte[] r1 = com.huawei.digitalpayment.consumer.profile.viewmodel.PhotoProfileViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r1[r6]
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
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profile.viewmodel.PhotoProfileViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(short, short, byte):java.lang.String");
    }

    private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr3 = component1;
        long j = 0;
        if (cArr3 != null) {
            int i4 = $11 + 83;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7422 - View.MeasureSpec.makeMeasureSpec(0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 16, (char) (Gravity.getAbsoluteGravity(0, 0) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i5++;
                    j = 0;
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
        Object[] objArr3 = {Integer.valueOf(ShareDataUIState)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7422 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
            int i6 = $11 + 21;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i8 = $10 + 53;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cancelall.component2 = 0;
            while (cancelall.component2 < i2) {
                int i10 = $10 + 45;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    int i12 = $10 + 81;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        cArr4[cancelall.component2] = (char) (cancelall.component1 % b2);
                        cArr4[cancelall.component2 - 1] = (char) (cancelall.component3 % b2);
                    } else {
                        cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                        cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    }
                } else {
                    Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7117 - TextUtils.getTrimmedLength(""), 14 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (44463 - Color.blue(0)), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                        Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault4 == null) {
                            byte b3 = (byte) (-1);
                            byte b4 = (byte) (b3 + 1);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((KeyEvent.getMaxKeyCode() >> 16) + 2944, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23, (char) (KeyEvent.keyCodeFromString("") + 27637), 794909189, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                        int i13 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr3[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr3[i13];
                        int i14 = $11 + 9;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                    } else if (cancelall.copydefault == cancelall.ShareDataUIState) {
                        int i16 = $11 + 55;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
                        cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                        cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                        int i18 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                        int i19 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr3[i18];
                        cArr4[cancelall.component2 + 1] = cArr3[i19];
                    } else {
                        int i20 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                        int i21 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                        cArr4[cancelall.component2] = cArr3[i20];
                        cArr4[cancelall.component2 + 1] = cArr3[i21];
                    }
                }
                cancelall.component2 += 2;
            }
        }
        for (int i22 = 0; i22 < i; i22++) {
            cArr4[i22] = (char) (cArr4[i22] ^ 13722);
        }
        String str = new String(cArr4);
        int i23 = $10 + 125;
        $11 = i23 % 128;
        if (i23 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        objArr[0] = str;
    }

    static {
        copydefault = 0;
        component2();
        Object[] objArr = new Object[1];
        a(new char[]{23, '\b', '\n', CharUtils.CR, '\f', 6, 5, 7, 24, 23, '\n', 7, 2, 7, 23, 7, 7, 19, 24, 6, '\t', 19, 24, 21, 7, CharUtils.CR, 23, '\b', 21, 15, '\t', '\f', 24, 18, 11, 22, 18, 4, '\f', 23, 18, 22, 14, 22, 23, 24, '\t', 11, 0, '\b', 22, 18, CharUtils.CR, 11, CharUtils.CR, 1, CharUtils.CR, '\b', 14, 15, '\b', 18, 2, 22, 20, 3, 23, 24, 5, 16, 0, '\b', 22, 18}, (byte) (-TextUtils.indexOf((CharSequence) "", '0', 0)), 74 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component2 + 73;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    static void component2() {
        component1 = new char[]{2006, 2007, 2023, 2031, 2041, 2020, 2039, 2037, 2036, 2017, 2000, 2024, 1966, 2022, 2029, 1997, 2035, 2028, 2019, 2034, 2030, 2032, 2025, 2021, 2038};
        ShareDataUIState = (char) 12831;
    }
}
