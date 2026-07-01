package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import io.ktor.util.date.GMTDateParser;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;

public final class CheckIdentityViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static long component1;
    private static int component3;
    static CheckIdentityViewModel copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {79, Ascii.ETB, 89, Ascii.VT};
    private static final int $$b = 22;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, short r8) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 103
            byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.login.viewmodel.CheckIdentityViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r8 = r8 * 2
            int r1 = r8 + 1
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.login.viewmodel.CheckIdentityViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, byte, short):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component1 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        int i3 = $11 + 111;
        while (true) {
            $10 = i3 % 128;
            int i4 = i3 % 2;
            if (iTrustedWebActivityServiceDefault.copydefault >= cArrComponent2.length) {
                objArr[0] = new String(cArrComponent2, 4, cArrComponent2.length - 4);
                return;
            }
            int i5 = $10 + 103;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i7 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component1)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7033 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 34, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 63439), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0') + 1391, Process.getGidForName("") + 19, (char) (51269 - Color.green(0)), -1883291598, false, $$c(b2, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                i3 = $11 + 69;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    static {
        component3 = 0;
        copydefault();
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getPressedStateDuration() >> 16, new char[]{28386, 43412, 10971, 28289, 58654, 38771, 22438, 24232, 38058, 37193, 23946, 20689, 39623, 39733, 23461, 19106, 33003, 34075, 16834, 19602, 34307, 36592, 20283, 16743, 35899, 35025, 29966, 31560, 45654, 45810, 29544, 32041, 47212, 48271, 31070, 30475, 49031, 42606, 25829, 27114, 42413, 41051, 25218, 25544, 44015, 43571, 26863, 26035, 53742, 21529, 5765, 40842, 55053, 20987, 7202, 36968, 56684, 23498, 6658, 35395, 50005, 17841, GMTDateParser.DAY_OF_MONTH, 35874, 51559, 20368, 3589, 34341, 52362, 18809, 13736, 47341, 62091, 29528, 13198, 45768, 63702, 32053, 14847, 46271, 65236, 26389, 10190, 44689, 58415, 24819, 11567, 41827, 59950}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component2 + 33;
        component3 = i % 128;
        if (i % 2 != 0) {
            int i2 = 45 / 0;
        }
    }

    static void copydefault() {
        component1 = 248684187460375065L;
    }
}
