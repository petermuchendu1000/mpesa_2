package com.huawei.digitalpayment.consumer.remoteconfig;

import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;

public final class BuildConfig {
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String LIBRARY_PACKAGE_NAME;
    private static int component2;
    private static long copydefault;
    private static final byte[] $$a = {109, 5, -57, 108};
    private static final int $$b = 250;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ShareDataUIState = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r7, short r8, int r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.remoteconfig.BuildConfig.$$a
            int r7 = r7 * 4
            int r7 = r7 + 1
            int r8 = r8 * 2
            int r8 = r8 + 4
            int r9 = r9 * 4
            int r9 = 103 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r5 = r2
            r9 = r8
            goto L2a
        L17:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L1b:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L28:
            r3 = r0[r9]
        L2a:
            int r3 = -r3
            int r8 = r8 + r3
            int r9 = r9 + 1
            r3 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.remoteconfig.BuildConfig.$$c(int, short, int):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(copydefault ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $10 + 77;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(copydefault)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 35, (char) (TextUtils.lastIndexOf("", '0') + 63441), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0) + 1391, 18 - KeyEvent.getDeadChar(0, 0), (char) (51268 - TextUtils.lastIndexOf("", '0', 0, 0)), -1883291598, false, $$c(b2, b3, b3), new Class[]{Object.class, Object.class});
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
        int i6 = $10 + 91;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    static {
        component2 = 0;
        component3();
        Object[] objArr = new Object[1];
        a(1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{58388, 58487, 32395, 11890, 16329, 23422, 44101, 39127, 57544, 15135, 43293, 37682, 60697, 13431, 42398, 38901, 60001, 12709, 48749, 35497, 63141, 11546, 47912, 36168, 62441, 9815, 47049, 32795, 63576, 9152, 45187, 33966, 50326, 7393, 36161, 48992, 49617, 6196, 35238, 45611, 52773, 5479, 33459, 46801, 52089, 3805, 40831, 43423, 55246, 2571, 38915}, objArr);
        LIBRARY_PACKAGE_NAME = ((String) objArr[0]).intern();
        int i = ShareDataUIState + 59;
        component2 = i % 128;
        int i2 = i % 2;
    }

    static void component3() {
        copydefault = -1544475215150486084L;
    }
}
