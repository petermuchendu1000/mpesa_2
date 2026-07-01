package com.huawei.digitalpayment.common.theme.viewmodel;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;

public final class BalanceThemeViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    static BalanceThemeViewModel component1;
    private static int component2;
    private static long component3;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {20, 103, 109, TarHeader.LF_BLK};
    private static final int $$b = 86;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copydefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, int r7, short r8) {
        /*
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r6 = r6 * 2
            int r6 = 103 - r6
            byte[] r0 = com.huawei.digitalpayment.common.theme.viewmodel.BalanceThemeViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r7 = r7 * 2
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L19
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2f
        L19:
            r3 = r2
        L1a:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L2a:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2f:
            int r8 = r8 + 1
            int r6 = r6 + r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.viewmodel.BalanceThemeViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(byte, int, short):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component3 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        int i3 = $10 + 19;
        $11 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 2 % 4;
        }
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i5 = $11 + 57;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i7 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component3)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7032, 34 - (KeyEvent.getMaxKeyCode() >> 16), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 63439), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getMode(0) + 1390, 18 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 51269), -1883291598, false, $$c(b2, b3, b3), new Class[]{Object.class, Object.class});
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
        component2 = 0;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{27856, 27827, 59128, 7278, 25810, 17398, 37197, 45875, 34652, 64198, 34149, 40782, 47997, 52934, 43334, 35617, 44821, 41644, 56613, 63253, 49953, 46731, 49440, 58348, 63453, 35438, 62929, 53191, 60412, 40465, 6651, 15322, 8065, 29238, 3475, 10175, 13278, 17923, 12712, 5016, 10169, 23030, 9226, 30831, 23121, 11754, 18559, 25672, 20083, 463, 31753, 20525, 25166, 5509, 24593, 48129, 38437, 59789, 37943, 43244, 35580, 64887, 47325, 38136, 48873, 53613, 44277, 32980, 53991, 42266, 53391, 60601, 50833, 47391}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = copydefault + 51;
        component2 = i % 128;
        int i2 = i % 2;
    }

    static void ShareDataUIState() {
        component3 = 3094299010629097064L;
    }
}
