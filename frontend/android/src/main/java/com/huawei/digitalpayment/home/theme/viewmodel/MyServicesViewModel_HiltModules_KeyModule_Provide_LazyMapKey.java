package com.huawei.digitalpayment.home.theme.viewmodel;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelAll;
import org.apache.commons.lang3.CharUtils;

public final class MyServicesViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static char ShareDataUIState;
    static MyServicesViewModel component2;
    private static int component3;
    private static char[] copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {73, 121, -48, -56};
    private static final int $$b = 31;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, int r8) {
        /*
            int r7 = r7 * 3
            int r7 = 119 - r7
            int r6 = r6 * 4
            int r0 = 1 - r6
            byte[] r1 = com.huawei.digitalpayment.home.theme.viewmodel.MyServicesViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r8 = r8 * 3
            int r8 = 3 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L19
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2f
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L27:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2f:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.theme.viewmodel.MyServicesViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(int, int, int):java.lang.String");
    }

    private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        char c2;
        Object obj;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = copydefault;
        char c3 = '0';
        Object obj2 = null;
        if (cArr2 != null) {
            int i6 = $11 + 57;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 23;
                $10 = i9 % 128;
                if (i9 % i4 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((-16769794) - Color.rgb(0, 0, 0), 15 - View.resolveSize(0, 0), (char) (64291 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 682917265, false, "v", new Class[]{Integer.TYPE});
                        }
                        cArr3[i8] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i8 = 0;
                        i4 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i8])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                        if (objCopydefault2 == null) {
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 7421, 14 - TextUtils.indexOf("", c3, 0, 0), (char) (64291 - (Process.myPid() >> 22)), 682917265, false, "v", new Class[]{Integer.TYPE});
                        }
                        cArr3[i8] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                        i8++;
                        i4 = 2;
                        c3 = '0';
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(ShareDataUIState)};
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7422, 15 - TextUtils.getOffsetBefore("", 0), (char) (64291 - Color.red(0)), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        char c4 = 5;
        if (i % 2 != 0) {
            int i10 = $11 + 5;
            $10 = i10 % 128;
            int i11 = i10 % 2;
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
                    c2 = c4;
                    obj = obj2;
                    i3 = 2;
                } else {
                    Object[] objArr5 = new Object[13];
                    objArr5[12] = cancelall;
                    objArr5[11] = Integer.valueOf(cCharValue);
                    objArr5[10] = cancelall;
                    objArr5[9] = cancelall;
                    objArr5[8] = Integer.valueOf(cCharValue);
                    objArr5[7] = cancelall;
                    objArr5[6] = cancelall;
                    objArr5[c4] = Integer.valueOf(cCharValue);
                    objArr5[4] = cancelall;
                    objArr5[3] = cancelall;
                    objArr5[2] = Integer.valueOf(cCharValue);
                    objArr5[1] = cancelall;
                    objArr5[0] = cancelall;
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault4 == null) {
                        int trimmedLength = 7117 - TextUtils.getTrimmedLength("");
                        int i12 = 15 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        char mirror = (char) (44511 - AndroidCharacter.getMirror('0'));
                        Class[] clsArr = new Class[13];
                        clsArr[0] = Object.class;
                        clsArr[1] = Object.class;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Object.class;
                        clsArr[4] = Object.class;
                        clsArr[c4] = Integer.TYPE;
                        clsArr[6] = Object.class;
                        clsArr[7] = Object.class;
                        clsArr[8] = Integer.TYPE;
                        clsArr[9] = Object.class;
                        clsArr[10] = Object.class;
                        clsArr[11] = Integer.TYPE;
                        clsArr[12] = Object.class;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(trimmedLength, i12, mirror, 1150140696, false, "x", clsArr);
                    }
                    if (((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue() == cancelall.getAsAtTimestamp) {
                        Object[] objArr6 = new Object[11];
                        objArr6[10] = cancelall;
                        objArr6[9] = Integer.valueOf(cCharValue);
                        objArr6[8] = cancelall;
                        objArr6[7] = Integer.valueOf(cCharValue);
                        objArr6[6] = Integer.valueOf(cCharValue);
                        objArr6[c4] = cancelall;
                        objArr6[4] = cancelall;
                        objArr6[3] = Integer.valueOf(cCharValue);
                        objArr6[2] = Integer.valueOf(cCharValue);
                        objArr6[1] = cancelall;
                        objArr6[0] = cancelall;
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault5 == null) {
                            int pressedStateDuration = 2944 - (ViewConfiguration.getPressedStateDuration() >> 16);
                            int edgeSlop = 24 - (ViewConfiguration.getEdgeSlop() >> 16);
                            char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 27637);
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            String str$$c = $$c(b3, b4, b4);
                            c2 = 5;
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(pressedStateDuration, edgeSlop, deadChar, 794909189, false, str$$c, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c2 = c4;
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objCopydefault5).invoke(null, objArr6)).intValue();
                        int i13 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr2[i13];
                    } else {
                        c2 = c4;
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
                            int i18 = $11 + 123;
                            $10 = i18 % 128;
                            i3 = 2;
                            int i19 = i18 % 2;
                        }
                    }
                    i3 = 2;
                }
                cancelall.component2 += i3;
                obj2 = obj;
                c4 = c2;
            }
        }
        for (int i20 = 0; i20 < i; i20++) {
            cArr4[i20] = (char) (cArr4[i20] ^ 13722);
        }
        String str = new String(cArr4);
        int i21 = $11 + 111;
        $10 = i21 % 128;
        if (i21 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i22 = 80 / 0;
            objArr[0] = str;
        }
    }

    static {
        component3 = 1;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(new char[]{0, 7, 23, CharUtils.CR, 20, '\f', 6, 4, '\n', 2, '\t', 18, 2, 5, 5, 20, '\b', 24, 24, 5, '\b', 16, CharUtils.CR, '\f', 18, 5, 20, 7, 17, CharUtils.CR, 5, 18, 2, 17, 17, CharUtils.CR, '\t', 23, 2, '\n', 3, 16, '\t', 15, CharUtils.CR, 22, CharUtils.CR, '\b', '\t', 11, 14, 2, 20, 4, 7, 17, 22, 16, 2, '\n', 2, 4, '\t', 15, CharUtils.CR, 22}, (byte) (103 - Process.getGidForName("")), 66 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component1 + 115;
        component3 = i % 128;
        if (i % 2 == 0) {
            int i2 = 67 / 0;
        }
    }

    static void ShareDataUIState() {
        copydefault = new char[]{2025, 2039, 2019, 1997, 2034, 2031, 2041, 2023, 1966, 2017, 2037, 2030, 2021, 2016, 2003, 2036, 2018, 2006, 2029, 2020, 2032, 2035, 2024, 2028, 2038};
        ShareDataUIState = (char) 12831;
    }
}
