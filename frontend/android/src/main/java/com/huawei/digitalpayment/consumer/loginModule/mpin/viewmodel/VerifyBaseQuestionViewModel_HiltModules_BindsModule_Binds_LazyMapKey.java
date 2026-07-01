package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import android.graphics.Color;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.io.encoding.Base64;
import kotlin.notify;

public final class VerifyBaseQuestionViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    static VerifyBaseQuestionViewModel ShareDataUIState;
    private static long component2;
    private static int component3;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {Base64.padSymbol, -49, -70, 93};
    private static final int $$b = 106;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copydefault = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r7, int r8, short r9) {
        /*
            int r7 = r7 * 3
            int r7 = 1 - r7
            int r8 = r8 * 2
            int r8 = r8 + 4
            int r9 = r9 * 3
            int r9 = r9 + 102
            byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.VerifyBaseQuestionViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r9 = r8
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2b:
            int r8 = r8 + r3
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.VerifyBaseQuestionViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(byte, int, short):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = notifyVar.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3265, 33 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (60268 - (KeyEvent.getMaxKeyCode() >> 16)), -834797019, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (component2 ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(687 - View.MeasureSpec.getSize(0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 34, (char) (60373 - ExpandableListView.getPackedPositionType(0L)), -1969106284, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i4 = $10 + 13;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr4 = {notifyVar, notifyVar};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(687 - TextUtils.getCapsMode("", 0, 0), 34 - Color.red(0), (char) (60373 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), -1969106284, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
        }
        String str = new String(cArr2);
        int i6 = $11 + 15;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    static {
        component3 = 1;
        component2();
        Object[] objArr = new Object[1];
        a(1999 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{40716, 39119, 37020, 34860, 32827, 47121, 45524, 43441, 41330, 55617, 53591, 51950, 49842, 64139, 62036, 59962, 58366, 7100, 5009, 2899, 826, 15609, 13504, 11416, 9331, 23670, 21514, 19925, 17829, 32111, 30040, 27923, 26346, 40626, 38463, 36430, 34332, 49123, 47036, 44936, 42874, 57127, 55549, 53471, 51351, 49257, 63603, 61443, 59855, 57753, 6511, 4476, 2325, 733, 15008, 12897, 10826, 8727, 23533, 21439, 19335, 17170, 31515, 29947, 27869, 25737, 40023, 37947, 36305, 34245, 48518, 46435, 44294, 42269, 57052, 54969, 52847, 50757, 65042, 63456, 61321, 59257, 8004, 5893, 4302, 2235, 129, 14419, 12331}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = copydefault + 73;
        component3 = i % 128;
        int i2 = i % 2;
    }

    static void component2() {
        component2 = 4830755368544247621L;
    }
}
