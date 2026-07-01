package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.notify;

public final class RegisterVerifyViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static long ShareDataUIState;
    static RegisterVerifyViewModel component1;
    private static int component2;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {81, 99, 107, 124};
    private static final int $$b = 17;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copydefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, int r6, byte r7) {
        /*
            int r6 = r6 * 3
            int r6 = 4 - r6
            int r7 = r7 * 4
            int r0 = r7 + 1
            int r5 = r5 * 3
            int r5 = 105 - r5
            byte[] r1 = com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.RegisterVerifyViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r5
            r5 = r7
            r3 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r1[r6]
        L27:
            int r6 = r6 + 1
            int r5 = r5 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.RegisterVerifyViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(byte, int, byte):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        int i3 = $10 + 123;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (notifyVar.copydefault < cArr.length) {
            int i5 = notifyVar.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    int i6 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3266;
                    int packedPositionGroup = 33 - ExpandableListView.getPackedPositionGroup(0L);
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 60269);
                    byte b2 = (byte) ($$b & 7);
                    byte b3 = (byte) (b2 - 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i6, packedPositionGroup, cIndexOf, -834797019, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (ShareDataUIState ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(0, 0, 0) + 687, (KeyEvent.getMaxKeyCode() >> 16) + 34, (char) (TextUtils.indexOf("", "", 0) + 60373), -1969106284, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i7 = $10 + 79;
                $11 = i7 % 128;
                int i8 = i7 % 2;
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
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            try {
                Object[] objArr4 = {notifyVar, notifyVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((KeyEvent.getMaxKeyCode() >> 16) + 687, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 33, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 60372), -1969106284, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr2);
    }

    static {
        component2 = 0;
        copydefault();
        Object[] objArr = new Object[1];
        a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 35676, new char[]{54883, 23858, 49367, 29753, 64284, 28324, 37455, 6652, 35981, 12332, 42892, 10907, 24117, 50654, 18815, 64519, 25521, 38721, 6906, 33158, 13629, 47308, 12187, 21301, 50892, 19003, 61713, 25760, 59458, 8186, 33427, 13870, 48581, 8335, 21620, 56283, 20347, 61974, 31143, 60741, 4293, 34698, 2854, 48874, 9616, 43324, 56472, 16481, 63253, 31402, 60995, 5620, 39056, 3108, 46060, 9941, 43566, 53724, 17783, 51224, 32673, 58182, 5858, 40326, 300, 46259, 15272, 44850, 53971, 18040, 52509, 28863, 58445, 27639, 40628, 602, 35310, 15504, 41008, 55242, 23366, 52740, 30127, 63824, 27849, 37774, 1882, 35582, 12692}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = copydefault + 53;
        component2 = i % 128;
        if (i % 2 != 0) {
            int i2 = 29 / 0;
        }
    }

    static void copydefault() {
        ShareDataUIState = -933094782192560598L;
    }
}
