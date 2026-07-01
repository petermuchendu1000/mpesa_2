package com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class NoExpiryViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static char ShareDataUIState;
    private static char component1;
    static NoExpiryViewModel component2;
    private static char component3;
    private static char copydefault;
    private static int equals;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {106, 40, -98, -117};
    private static final int $$b = 106;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getAsAtTimestamp = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, short r7, int r8) {
        /*
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r8 = r8 + 111
            int r6 = r6 * 3
            int r0 = 1 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.NoExpiryViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r7 = r7 + 1
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2d:
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.NoExpiryViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(byte, short, int):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        int i5 = $11 + 19;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i7 = $11 + 107;
            $10 = i7 % 128;
            int i8 = 58224;
            if (i7 % i3 != 0) {
                cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3 << 1];
                i2 = 1;
            } else {
                cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
                i2 = 0;
            }
            while (i2 < 16) {
                int i9 = $10 + 31;
                $11 = i9 % 128;
                int i10 = i9 % i3;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                int i11 = (c3 + i8) ^ ((c3 << 4) + ((char) (((long) component3) ^ 4374495167426960553L)));
                int i12 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(ShareDataUIState);
                    objArr2[i3] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(844 - ExpandableListView.getPackedPositionType(0L), 32 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0') + 23252), 592652048, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) copydefault) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component1)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 845, 32 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (23251 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 592652048, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i2++;
                    i3 = 2;
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
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Gravity.getAbsoluteGravity(0, 0) + 465, 50 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            int i13 = $10 + 31;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            i3 = 2;
        }
        String str = new String(cArr2, 0, i);
        int i15 = $11 + 17;
        $10 = i15 % 128;
        if (i15 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i16 = 41 / 0;
            objArr[0] = str;
        }
    }

    static {
        equals = 0;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(TextUtils.lastIndexOf("", '0', 0) + 79, new char[]{37743, 56056, 15063, 53679, 7235, 20510, 16291, 58461, 2736, 53819, 1227, 13717, 64427, 6776, 62967, 35504, 58098, 59935, 7105, 3171, 56378, 22868, 42431, 41519, 9330, 59177, 37743, 56056, 36147, 52134, 57172, 47112, 55112, 44140, 29884, 37790, 13110, 2352, 38406, 56159, 13395, 53680, 5815, 31139, 15139, 17951, 50082, 17662, 38180, 17731, 22376, 25226, 30343, 60511, 3815, 59094, 41327, 5934, 19884, 44097, 4242, 12015, 2298, 30546, 10923, 9666, 63614, 48075, 30687, 47086, 39470, 10037, 30618, 20083, 749, 49790, 49526, 48211}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = getAsAtTimestamp + 55;
        equals = i % 128;
        if (i % 2 != 0) {
            int i2 = 26 / 0;
        }
    }

    static void ShareDataUIState() {
        copydefault = (char) 42565;
        component1 = (char) 54061;
        component3 = (char) 43172;
        ShareDataUIState = (char) 5118;
    }
}
