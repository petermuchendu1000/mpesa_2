package com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel;

import android.graphics.Color;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;

public final class SendMoneyConfirmViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static int component1;
    private static long component2;
    static SendMoneyConfirmViewModel copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {66, 42, 112, 97};
    private static final int $$b = 177;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component3 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, short r7, byte r8) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 1
            int r8 = r8 * 3
            int r8 = 103 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.SendMoneyConfirmViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L27
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r7]
        L27:
            int r8 = r8 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.SendMoneyConfirmViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(byte, short, byte):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component2 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $11 + 83;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component2)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - View.MeasureSpec.getSize(0), View.resolveSize(0, 0) + 34, (char) (Color.red(0) + 63440), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1390 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 18 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (51269 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), -1883291598, false, $$c(b2, b3, b3), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
                    int i6 = $10 + 91;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArrComponent2, 4, cArrComponent2.length - 4);
    }

    static {
        component1 = 0;
        copydefault();
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getTouchSlop() >> 8, new char[]{36788, 36823, 51355, 34408, 36934, 14177, 32257, 29753, 60692, 29588, 37413, 4776, 19009, 54960, 61618, 45507, 42885, 18934, 24509, 19483, 1269, 11045, 47772, 60246, 25125, 36460, 6465, 35217, 57200, 25047, 33823, 9384, 15522, 50370, 58049, 50146, 39313, 42523, 16866, 24100, 63194, 6466, 44145, 64886, 21578, 64620, 2869, 39881, 45402, 24504, 27121, 14040, 11961, 13030, 54472, 54546, 35824, 37999, 13239, 28762, 59690, 30557, 40561, 3944, 18018, 60052, 64781, 44428, 41819, 19911, 23530, 18686, 142, 12044, 50834, 59190, 32193, 33326, 9553, 33352, 56072, 25972, 32824}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component3 + 17;
        component1 = i % 128;
        if (i % 2 != 0) {
            int i2 = 13 / 0;
        }
    }

    static void copydefault() {
        component2 = -1099842066182933469L;
    }
}
