package com.huawei.digitalpayment.home.viewmodel;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;

public final class RecentMiniAppViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static final byte[] $$a = {112, 44, -46, -27};
    private static final int $$b = 109;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ShareDataUIState = 0;
    private static int component2;
    private static long component3;
    static RecentMiniAppViewModel copydefault;
    public static String lazyClassKeyName;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, int r7, short r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.home.viewmodel.RecentMiniAppViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r8 = r8 * 4
            int r8 = r8 + 4
            int r6 = r6 * 2
            int r1 = r6 + 1
            int r7 = r7 * 4
            int r7 = r7 + 103
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L29:
            int r8 = -r8
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.viewmodel.RecentMiniAppViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(short, int, short):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component3 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        int i3 = $10 + 89;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i5 = $11 + 3;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i7 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component3)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 7032, 34 - TextUtils.indexOf("", "", 0), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 63439), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1390 - TextUtils.getCapsMode("", 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 19, (char) (51269 - KeyEvent.getDeadChar(0, 0)), -1883291598, false, $$c(b2, b3, b3), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
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
        component2 = 1;
        component2();
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getLongPressTimeout() >> 16, new char[]{49470, 48916, 49501, 5550, 32948, 16671, 59659, 31670, 14534, 18581, 58263, 29823, 12923, 20217, 64104, 28316, 11751, 21607, 64703, 26396, 10015, 23516, 63190, 25017, 7831, 24909, 51539, 23078, 6186, 26878, 50158, 21591, 5027, 28197, 55864, 20190, 3543, 30101, 56465, 18293, 1857, 31492, 55059, 16868, 32432, 322, 43427, 14875, 30827, 2286, 40994, 13477, 29591, 3678, 47695, 11545, 27934, 5584, 48352, 10145, 25787, 6951, 46923, 8663, 24106, 8869, 35322}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = ShareDataUIState + 25;
        component2 = i % 128;
        int i2 = i % 2;
    }

    static void component2() {
        component3 = 7995869432421208821L;
    }
}
