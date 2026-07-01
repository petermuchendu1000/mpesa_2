package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;

public final class ChangeLanguageViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static final byte[] $$a = {78, -86, -128, -128};
    private static final int $$b = 116;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ShareDataUIState = 0;
    static ChangeLanguageViewModel component1;
    private static int component2;
    private static long copydefault;
    public static String lazyClassKeyName;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r5, byte r6, byte r7) {
        /*
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r6 = r6 * 2
            int r0 = 1 - r6
            int r5 = r5 * 4
            int r5 = r5 + 103
            byte[] r1 = com.huawei.digitalpayment.consumer.basicUi.viewmodel.ChangeLanguageViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L19
            r4 = r5
            r5 = r6
            r3 = r2
            goto L29
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L25:
            int r3 = r3 + 1
            r4 = r1[r7]
        L29:
            int r5 = r5 + r4
            int r7 = r7 + 1
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basicUi.viewmodel.ChangeLanguageViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(short, byte, byte):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(copydefault ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i3 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(copydefault)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "") + 7032, 34 - Color.red(0), (char) (TextUtils.indexOf("", "", 0, 0) + 63440), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i3] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1390 - Color.argb(0, 0, 0, 0), MotionEvent.axisFromString("") + 19, (char) (Color.red(0) + 51269), -1883291598, false, $$c(b2, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i4 = $10 + 25;
                $11 = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrComponent2, 4, cArrComponent2.length - 4);
        int i6 = $11 + 119;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    static {
        component2 = 1;
        component2();
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getTouchSlop() >> 8) + 1, new char[]{1457, 30579, 18818, 1490, 34331, 44001, 23597, 49605, 36630, 49701, 61385, 6224, 36332, 3621, 9194, 54335, 18828, 19023, 26505, 36875, 5536, 30312, 48012, 27890, 53572, 45709, 65405, 10457, 40301, 65266, 13143, 58564, 22811, 15051, 30501, 41122, 9524, 26342, 19266, 31873, 57644, 41219, 36577, 14180, 44284, 60677, 49802, 62285, 26860, 10541, 1719, 53042, 13454, 21824, 23225, 35615, 61683, 37187, 40592, 18422, 48215, 56731, 53873, 967, 30836, 6582, 5719, 57306, 17424, 17875, 27177, 39829, 4, 33269, 44575, 22442, 52262, 52712, 58849, 4727}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = ShareDataUIState + 69;
        component2 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void component2() {
        copydefault = 184923051499576726L;
    }
}
