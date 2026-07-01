package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;

public final class AboutViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    static AboutViewModel ShareDataUIState;
    private static long component2;
    private static int copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {113, 66, TarHeader.LF_CHR, 67};
    private static final int $$b = 82;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component3 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, short r7, byte r8) {
        /*
            int r7 = r7 * 2
            int r7 = 3 - r7
            int r6 = r6 * 2
            int r6 = 103 - r6
            int r8 = r8 * 4
            int r8 = r8 + 1
            byte[] r0 = com.huawei.digitalpayment.consumer.basicUi.viewmodel.AboutViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            int r7 = r7 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2d:
            int r7 = -r7
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basicUi.viewmodel.AboutViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, short, byte):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component2 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        int i3 = $10 + 39;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component2)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - (ViewConfiguration.getTouchSlop() >> 8), 35 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 63440), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1390 - (ViewConfiguration.getJumpTapTimeout() >> 16), 17 - TextUtils.lastIndexOf("", '0'), (char) (51268 - TextUtils.lastIndexOf("", '0', 0)), -1883291598, false, $$c(b2, b3, b3), new Class[]{Object.class, Object.class});
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
        int i6 = $11 + 15;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i7 = 52 / 0;
            objArr[0] = str;
        }
    }

    static {
        copydefault = 1;
        copydefault();
        Object[] objArr = new Object[1];
        a(1 - View.combineMeasuredStates(0, 0), new char[]{610, 513, 7245, 35234, 40403, 35373, 53304, 21957, 1486, 5139, 33258, 24024, 3471, 3267, 39273, 17671, 5447, 1161, 37226, 19795, 7443, 15550, 43183, 29882, 9423, 13691, 41214, 31985, 11406, 11636, 47156, 25660, 13392, 9709, 45158, 27770, 15399, 23984, 51201, 5033, 18407, 23157, 50050, 7148, 20383, 21027, 56201, 821, 22375, 19179, 54036, 2922, 24381, 17046, 60250, 13143, 26296, 31607, 58009, 14992, 28335, 29454, 64225, 8922, 30331, 27593, 62014, 10776, 32326, 25479, 2659}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component3 + 75;
        copydefault = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void copydefault() {
        component2 = 8953204837450820960L;
    }
}
