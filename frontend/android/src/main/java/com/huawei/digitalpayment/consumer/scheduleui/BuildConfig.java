package com.huawei.digitalpayment.consumer.scheduleui;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import org.bouncycastle.crypto.signers.PSSSigner;

public final class BuildConfig {
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String LIBRARY_PACKAGE_NAME;
    private static int component1;
    private static long component2;
    private static final byte[] $$a = {68, 4, -12, PSSSigner.TRAILER_IMPLICIT};
    private static final int $$b = 249;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copydefault = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, short r7, short r8) {
        /*
            int r7 = r7 * 3
            int r0 = r7 + 1
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r1 = com.huawei.digitalpayment.consumer.scheduleui.BuildConfig.$$a
            int r6 = r6 * 3
            int r6 = 103 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2a
        L17:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L26:
            r4 = r1[r6]
            int r3 = r3 + 1
        L2a:
            int r8 = r8 + r4
            int r6 = r6 + 1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.BuildConfig.$$c(byte, short, short):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component2 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        int i3 = $10 + 43;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i5 = $11 + 31;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i7 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component2)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7031 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 34, (char) (63440 - KeyEvent.keyCodeFromString("")), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1390, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 17, (char) (51269 - Color.green(0)), -1883291598, false, $$c(b2, b3, b3), new Class[]{Object.class, Object.class});
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
        int i8 = $11 + 117;
        $10 = i8 % 128;
        if (i8 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i9 = 5 / 0;
            objArr[0] = str;
        }
    }

    static {
        component1 = 1;
        copydefault();
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getMaximumFlingVelocity() >> 16, new char[]{32150, 32245, 11824, 16438, 14285, 34324, 29567, 51852, 7094, 20895, 55611, 13469, 45411, 51323, 49068, 40758, 20263, 25149, 9635, 63982, 58583, 40174, 35842, 25507, 33415, 13991, 29407, 51812, 6226, 20828, 55425, 13341, 46592, 52169, 48991, 40663, 20403, 26000, 9596, 63633, 58749, 40002, 35839, 25422, 33587, 13886, 29095, 52711, 6375}, objArr);
        LIBRARY_PACKAGE_NAME = ((String) objArr[0]).intern();
        int i = copydefault + 103;
        component1 = i % 128;
        if (i % 2 == 0) {
            int i2 = 97 / 0;
        }
    }

    static void copydefault() {
        component2 = -7685283464428243709L;
    }
}
