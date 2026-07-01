package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;

public final class SpeedTestViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static int component1;
    static SpeedTestViewModel component2;
    private static long component3;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {9, 8, 112, 107};
    private static final int $$b = 85;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copydefault = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, byte r7, byte r8) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r8 = r8 * 3
            int r0 = r8 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r6 = r6 * 2
            int r6 = r6 + 103
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2a
        L17:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L28:
            r3 = r1[r6]
        L2a:
            int r7 = r7 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(short, byte, byte):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component3 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $11 + 51;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component3)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTapTimeout() >> 16) + 7032, KeyEvent.normalizeMetaState(0) + 34, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 63439), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1389, TextUtils.indexOf((CharSequence) "", '0', 0) + 19, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 51268), -1883291598, false, $$c(b2, b3, b3), new Class[]{Object.class, Object.class});
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
        String str = new String(cArrComponent2, 4, cArrComponent2.length - 4);
        int i6 = $10 + 27;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    static {
        component1 = 1;
        copydefault();
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf("", "") + 1, new char[]{4518, 15046, 53592, 4549, 2515, 10174, 60187, 24248, 26002, 43968, 32691, 49669, 63867, 16224, 62352, 13898, 19675, 16522, 18035, 48638, 49335, 54317, 55990, 8455, 21523, 22600, 44743, 38060, 44026, 60887, 9581, 6353, 16204, 28974, 47519, 35959, 45859, 34115, 3192, 62341, 1788, 3830, 32839, 26427, 39440, 37401, 5356, 60257, 60980, 10148, 60182, 24207, 26072, 43980, 32594, 49703, 63844, 16225, 62435, 13901, 19584, 16559, 17927, 48635, 49333, 54480, 55973, 8478, 21507, 22653, 44741, 38136, 44009, 60805, 9591, 6359, 16314, 28957, 47515, 35869, 45830, 34171, 3123, 62383, 1761, 3788, 32873, 26562, 39503, 37385}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = copydefault + 19;
        component1 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void copydefault() {
        component3 = 1462505161717133702L;
    }
}
