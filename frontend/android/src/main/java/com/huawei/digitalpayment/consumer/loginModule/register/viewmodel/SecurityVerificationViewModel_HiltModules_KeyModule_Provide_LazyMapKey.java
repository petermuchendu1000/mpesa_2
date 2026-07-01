package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import android.graphics.Color;
import android.os.Process;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;

public final class SecurityVerificationViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static int ShareDataUIState;
    private static long component3;
    static SecurityVerificationViewModel copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {68, -127, 122, -15};
    private static final int $$b = 187;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, short r7, int r8) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 103
            int r8 = r8 * 2
            int r8 = r8 + 4
            int r7 = r7 * 2
            int r0 = 1 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.SecurityVerificationViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r8 = -r8
            int r3 = r3 + 1
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.SecurityVerificationViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(int, short, int):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component3 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        int i3 = $10 + 103;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i5 = $10 + 17;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i7 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component3)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarSize() >> 8) + 7032, 34 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (Color.green(0) + 63440), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1390, 18 - Color.green(0), (char) ((Process.myTid() >> 22) + 51269), -1883291598, false, $$c(b2, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrComponent2, 4, cArrComponent2.length - 4);
    }

    static {
        ShareDataUIState = 1;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getDoubleTapTimeout() >> 16, new char[]{63084, 62991, 12651, 34264, 2314, 62889, 51760, 25140, 5692, 4409, 42396, 16933, 13945, 61725, 50443, 41678, 22189, 53723, 58628, 33430, 30445, 45448, 1317, 58203, 38669, 36929, 9464, 49948, 46920, 28794, 17574, 8997, 55178, 20719, 25720, 1007, 63433, 12470, 33883, 25526, 6139, 4971, 42964, 16508, 13329, 62299, 51073, 40991, 21608, 54041, 59139, 32976, 29865, 46019, 1916, 57481, 38080, 37769, 10031, 49436, 46346, 29309, 18144, 8573, 54601, 21043, 26281, 295, 62848, 12970, 34406, 25087, 5559, 4793, 42511, 16827, 13800, 62093, 49651, 42575, 21046, 54613, 57739, 34315, 29295, 46341, 417, 59091, 37531, 38338, 8523, 50843, 45785, 30115, 16648, 9893, 54016, 21625, 24801}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component2 + 65;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    static void ShareDataUIState() {
        component3 = -772927987913780065L;
    }
}
