package com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.notify;

public final class BillManagerViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static final byte[] $$a = {4, -80, 45, 109};
    private static final int $$b = 176;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ShareDataUIState = 0;
    private static int component2;
    static BillManagerViewModel component3;
    private static long copydefault;
    public static String lazyClassKeyName;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, byte r8) {
        /*
            int r8 = r8 * 3
            int r8 = 105 - r8
            int r6 = r6 * 4
            int r6 = 3 - r6
            int r7 = r7 * 4
            int r7 = r7 + 1
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            int r6 = r6 + 1
            r3 = r0[r6]
        L28:
            int r8 = r8 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(int, byte, byte):java.lang.String");
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
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3314 - AndroidCharacter.getMirror('0'), ((byte) KeyEvent.getModifierMetaStateMask()) + 34, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 60268), -834797019, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (copydefault ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(687 - (ViewConfiguration.getFadingEdgeLength() >> 16), 34 - Color.argb(0, 0, 0, 0), (char) (TextUtils.lastIndexOf("", '0', 0) + 60374), -1969106284, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i4 = $11 + 61;
                $10 = i4 % 128;
                int i5 = i4 % 2;
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
        int i6 = $11 + 91;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (notifyVar.copydefault < cArr.length) {
            int i8 = $10 + 105;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr4 = {notifyVar, notifyVar};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(687 - (ViewConfiguration.getLongPressTimeout() >> 16), 34 - (ViewConfiguration.getTapTimeout() >> 16), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 60373), -1969106284, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    static {
        component2 = 1;
        component2();
        Object[] objArr = new Object[1];
        a(27330 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{42951, 52490, 29259, 59337, 3272, 45588, 10051, 19604, 61897, 26372, 35840, 12683, 42689, 52238, 28995, 59039, 3029, 45337, 9798, 19350, 61641, 26140, 35671, 12445, 42440, 52051, 28765, 58768, 2774, 45066, 9551, 19094, 65505, 25911, 35368, 16308, 42214, 51746, 32631, 58538, 2466, 48957, 9323, 18876, 65257, 25703, 35199, 16034, 41914, 51511, 32383, 58299, 2300, 48700, 9075, 18621, 65021, 25402, 34939, 15789, 41654, 51227, 32115, 58039, 6024, 48360, 8711, 22345, 64641, 25030, 38663, 15441, 41402, 54980, 31755, 57688, 5797, 48070, 8462, 22094, 64408}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = ShareDataUIState + 67;
        component2 = i % 128;
        if (i % 2 == 0) {
            int i2 = 83 / 0;
        }
    }

    static void component2() {
        copydefault = -7583949308033685618L;
    }
}
