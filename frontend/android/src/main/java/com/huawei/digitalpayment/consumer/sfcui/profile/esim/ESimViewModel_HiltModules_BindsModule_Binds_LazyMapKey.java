package com.huawei.digitalpayment.consumer.sfcui.profile.esim;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class ESimViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static char ShareDataUIState;
    private static char component1;
    static ESimViewModel component2;
    private static char component3;
    private static int copy;
    private static char copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {TarHeader.LF_SYMLINK, -82, -81, 124};
    private static final int $$b = 8;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component4 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, short r8) {
        /*
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r8 = r8 * 2
            int r8 = 111 - r8
            int r7 = r7 * 4
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2d
        L17:
            r3 = r2
        L18:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L28:
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2d:
            int r6 = r6 + 1
            int r8 = r8 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, byte, short):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i5 = $11 + 57;
            $10 = i5 % 128;
            int i6 = 58224;
            if (i5 % i3 != 0) {
                cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
            } else {
                cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            }
            int i7 = 0;
            while (i7 < 16) {
                int i8 = $10 + 109;
                $11 = i8 % 128;
                int i9 = i8 % i3;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (((long) ShareDataUIState) ^ 4374495167426960553L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(copydefault);
                    objArr2[i3] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(844 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 32 - TextUtils.getOffsetBefore("", 0), (char) (23251 - (ViewConfiguration.getLongPressTimeout() >> 16)), 592652048, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) component3) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component1)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(844 - TextUtils.getCapsMode("", 0, 0), TextUtils.lastIndexOf("", '0', 0) + 33, (char) (23251 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 592652048, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
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
                i2 = 2;
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(465 - Color.blue(0), Color.green(0) + 49, (char) ExpandableListView.getPackedPositionGroup(0L), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            } else {
                i2 = 2;
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            i3 = i2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        copy = 1;
        component1();
        Object[] objArr = new Object[1];
        a((-16777149) - Color.rgb(0, 0, 0), new char[]{26031, 59403, 52782, 59950, 42115, 64426, 7074, 11143, 22575, 59165, 61963, 19286, 17362, 40606, 463, 40787, 55055, 60537, 53831, 614, 9722, 41423, 5117, 63533, 40434, 10568, 26031, 59403, 39074, 40381, 32774, 17168, 55446, 56691, 64684, 23444, 9344, 6774, 63073, 15936, 53478, 27764, 6489, 58798, 54821, 9859, 3687, 46877, 21478, 46684, 41051, 2617, 52782, 59950, 1232, 6707, 35810, 64492, 2838, 5563, 'A', 7723, 28245, 48037, 37174, 13333, 43736, 51340}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component4 + 5;
        copy = i % 128;
        int i2 = i % 2;
    }

    static void component1() {
        component3 = (char) 20691;
        component1 = (char) 18303;
        ShareDataUIState = (char) 55940;
        copydefault = (char) 38168;
    }
}
