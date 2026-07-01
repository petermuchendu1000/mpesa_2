package com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel;

import android.graphics.Color;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.fastjson.parser.JSONLexer;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelAll;

public final class FavouriteBundlesViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static char ShareDataUIState;
    private static int component2;
    static FavouriteBundlesViewModel component3;
    private static char[] copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {46, -95, Ascii.VT, -87};
    private static final int $$b = 230;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r7, short r8, byte r9) {
        /*
            int r9 = r9 + 4
            int r7 = r7 * 3
            int r7 = r7 + 1
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.FavouriteBundlesViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r8 = r8 * 2
            int r8 = 119 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r8 = r9
            r4 = r2
            goto L2a
        L15:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L28:
            r3 = r0[r8]
        L2a:
            int r3 = -r3
            int r9 = r9 + r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.FavouriteBundlesViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(byte, short, byte):java.lang.String");
    }

    private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = copydefault;
        char c2 = '0';
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7422 - Color.red(0), 16 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (64290 - TextUtils.indexOf("", c2, 0)), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i4++;
                    c2 = '0';
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
            Object[] objArr3 = {Integer.valueOf(ShareDataUIState)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
            long j = 0;
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.normalizeMetaState(0) + 7422, 16 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (64291 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 682917265, false, "v", new Class[]{Integer.TYPE});
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
                    cancelall.component1 = cArr[cancelall.component2];
                    cancelall.component3 = cArr[cancelall.component2 + 1];
                    if (cancelall.component1 == cancelall.component3) {
                        cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                        cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    } else {
                        try {
                            Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                            if (objCopydefault3 == null) {
                                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionChild(j) + 7118, View.MeasureSpec.makeMeasureSpec(0, 0) + 14, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 44463), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                                int i5 = $10 + 45;
                                $11 = i5 % 128;
                                int i6 = i5 % 2;
                                Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                                if (objCopydefault4 == null) {
                                    byte b3 = (byte) 0;
                                    byte b4 = b3;
                                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2992 - AndroidCharacter.getMirror('0'), 24 - View.getDefaultSize(0, 0), (char) (27637 - KeyEvent.normalizeMetaState(0)), 794909189, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                                int i7 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                                cArr4[cancelall.component2] = cArr2[iIntValue];
                                cArr4[cancelall.component2 + 1] = cArr2[i7];
                            } else if (cancelall.copydefault == cancelall.ShareDataUIState) {
                                int i8 = $11 + 1;
                                $10 = i8 % 128;
                                int i9 = i8 % 2;
                                cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                                cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                                int i10 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                                int i11 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                                cArr4[cancelall.component2] = cArr2[i10];
                                cArr4[cancelall.component2 + 1] = cArr2[i11];
                            } else {
                                int i12 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                                int i13 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                                cArr4[cancelall.component2] = cArr2[i12];
                                cArr4[cancelall.component2 + 1] = cArr2[i13];
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
                    j = 0;
                }
            }
            for (int i14 = 0; i14 < i; i14++) {
                cArr4[i14] = (char) (cArr4[i14] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    static {
        component2 = 0;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(new char[]{28, '#', 15, '!', 14, 28, '#', 18, 18, 4, 28, 3, 2, 18, 1, 24, 31, 6, 6, '\"', 15, '\b', 23, 20, JSONLexer.EOI, 28, 28, '#', 23, 7, 27, '\b', 21, 16, 29, '\t', 23, '#', 24, 2, 28, 29, ' ', 20, 29, 27, 22, 1, '\n', 19, '\t', 29, 30, 5, 23, 18, '\n', '!', '\n', 28, '\t', 25, 24, 0, 30, '#', 27, 14, 1, 24, 18, 16, 25, 20, 1, '\n', 23, '\n', 30, 2, 23, 18, 4, 31, '\n', 28, 13921}, (byte) (107 - Color.alpha(0)), Gravity.getAbsoluteGravity(0, 0) + 87, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component1 + 37;
        component2 = i % 128;
        if (i % 2 != 0) {
            int i2 = 92 / 0;
        }
    }

    static void ShareDataUIState() {
        copydefault = new char[]{2025, 1997, 1053, 1055, 2020, 2016, 1051, 2028, 1049, 2029, 2032, 2035, 1986, 1054, 2041, 2034, 2024, 2022, 1990, 2030, 2023, 1042, 2021, 2039, 1048, 2036, 2037, 1966, 2018, 2019, 2017, 1050, 2006, 1052, 2031, 2038};
        ShareDataUIState = (char) 12828;
    }
}
