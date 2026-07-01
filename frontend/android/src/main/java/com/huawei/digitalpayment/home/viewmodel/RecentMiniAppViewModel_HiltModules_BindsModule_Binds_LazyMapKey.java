package com.huawei.digitalpayment.home.viewmodel;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.primitives.SignedBytes;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class RecentMiniAppViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static char ShareDataUIState;
    static RecentMiniAppViewModel component1;
    private static char component2;
    private static char component3;
    private static int component4;
    private static char copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {5, SignedBytes.MAX_POWER_OF_TWO, 127, 81};
    private static final int $$b = 159;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getAsAtTimestamp = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, int r8) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 1
            byte[] r0 = com.huawei.digitalpayment.home.viewmodel.RecentMiniAppViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r8 = 111 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L27
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r7]
        L27:
            int r8 = r8 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.viewmodel.RecentMiniAppViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, int, int):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i3 = 58224;
            for (int i4 = 0; i4 < 16; i4++) {
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i3) ^ ((c3 << 4) + ((char) (((long) component3) ^ 4374495167426960553L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(copydefault)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(845 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 33 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (23251 - TextUtils.indexOf("", "", 0, 0)), 592652048, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i3) ^ ((cCharValue << 4) + ((char) (((long) component2) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(ShareDataUIState)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 844, 32 - (ViewConfiguration.getTouchSlop() >> 8), (char) (23251 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 592652048, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i3 -= 40503;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[iNotificationSideChannelDefault.component3] = cArr3[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr3[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0, 0) + 466, 49 - (Process.myPid() >> 22), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            int i5 = $11 + 101;
            $10 = i5 % 128;
            int i6 = i5 % 2;
        }
        String str = new String(cArr2, 0, i);
        int i7 = $10 + 37;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }

    static {
        component4 = 0;
        component3();
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getLongPressTimeout() >> 16) + 63, new char[]{63787, 20556, 4097, 64341, 60115, 46521, 19718, 57014, 47860, 32900, 59475, 38687, 43074, 30607, 17556, 54123, 4198, 14062, 63738, 10319, 16265, 6535, 14430, 13247, 46921, 40842, 37995, 37289, 40013, 13754, 34414, 52280, 18484, 32363, 48693, 14696, 39317, 58348, 2971, 5419, 43731, 170, 23527, 9753, 14430, 13247, 9813, 17249, 23035, 56220, 6729, 29293, 7874, 63062, 34123, 6541, 2036, 18320, 55843, 52409, 6103, 63350, 34935, 19973}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = getAsAtTimestamp + 37;
        component4 = i % 128;
        int i2 = i % 2;
    }

    static void component3() {
        component2 = (char) 44412;
        ShareDataUIState = (char) 16253;
        component3 = (char) 24774;
        copydefault = (char) 38354;
    }
}
