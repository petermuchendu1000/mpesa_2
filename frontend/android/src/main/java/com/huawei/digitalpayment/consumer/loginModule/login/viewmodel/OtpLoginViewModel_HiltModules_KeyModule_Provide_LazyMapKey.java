package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;

public final class OtpLoginViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static final byte[] $$a = {109, 5, -57, 108};
    private static final int $$b = 234;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 1;
    static OtpLoginViewModel component2;
    private static int component3;
    private static long copydefault;
    public static String lazyClassKeyName;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, short r7, short r8) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 103
            byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.login.viewmodel.OtpLoginViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r6 = r6 * 4
            int r1 = r6 + 1
            int r7 = r7 * 2
            int r7 = 3 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.login.viewmodel.OtpLoginViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(int, short, short):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(copydefault ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $10 + 61;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(copydefault)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> 16) + 7032, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 35, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 63440), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarSize() >> 8) + 1390, TextUtils.indexOf("", "", 0) + 18, (char) (51269 - (ViewConfiguration.getEdgeSlop() >> 16)), -1883291598, false, $$c(b2, b3, b3), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
                    int i6 = $11 + 27;
                    $10 = i6 % 128;
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
        component3 = 0;
        component2();
        Object[] objArr = new Object[1];
        a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, new char[]{3921, 3890, 32137, 65109, 62568, 60708, 10634, 46350, 10497, 23515, 54289, 60191, 17220, 8703, 45702, 49396, 32144, 2105, 26761, 9900, 38864, 54890, 18088, 7265, 45104, 48291, 16245, 29222, 60021, 39576, 5419, 43039, 1207, 24845, 62453, 33237, 16116, 20308, 43478, 59276, 22726, 5513, 34393, 56646, 28972, 62393, 31756, 13093, 43861, 55803, 23182, 26868, 50590, 40993, 12529, 20142, 65447, 36472, 61113, 42093, 6198, 21659, 51047, 39508, 12924, 13010, 48494, 61495, 27813, 6422, 39924, 10703, 34446, 59207, 29086, 4030, 41160, 52595, 11871, 25949, 55574, 43962, 1029, 23348}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component1 + 19;
        component3 = i % 128;
        int i2 = i % 2;
    }

    static void component2() {
        copydefault = -5795534338290113249L;
    }
}
