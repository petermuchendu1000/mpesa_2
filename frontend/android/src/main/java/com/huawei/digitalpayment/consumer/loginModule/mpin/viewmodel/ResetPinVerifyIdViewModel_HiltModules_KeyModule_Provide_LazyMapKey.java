package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class ResetPinVerifyIdViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    static ResetPinVerifyIdViewModel ShareDataUIState;
    private static char component1;
    private static char component2;
    private static char component3;
    private static char copydefault;
    private static int getRequestBeneficiariesState;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {7, 80, 121, 38};
    private static final int $$b = 23;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component4 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, byte r7, byte r8) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 111
            byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ResetPinVerifyIdViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r7 = r7 * 3
            int r1 = r7 + 1
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            int r6 = r6 + 1
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ResetPinVerifyIdViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(byte, byte, byte):java.lang.String");
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
            int i4 = 0;
            while (i4 < 16) {
                int i5 = $11 + 107;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i3) ^ ((c3 << 4) + ((char) (((long) copydefault) ^ 4374495167426960553L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(component2)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) (-1);
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.getDeadChar(0, 0) + 844, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 32, (char) (23251 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 592652048, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i3) ^ ((cCharValue << 4) + ((char) (((long) component1) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component3)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.makeMeasureSpec(0, 0) + 844, TextUtils.indexOf("", "") + 32, (char) (Drawable.resolveOpacity(0, 0) + 23251), 592652048, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i3 -= 40503;
                    i4++;
                    int i7 = $10 + 39;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 5 % 2;
                    }
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
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(464 - ImageFormat.getBitsPerPixel(0), TextUtils.getTrimmedLength("") + 49, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        getRequestBeneficiariesState = 0;
        component3();
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getTapTimeout() >> 16) + 87, new char[]{42716, 11190, 166, 3796, 55764, 34418, 53762, 2324, 8661, 60248, 21587, 872, 44376, 48721, 35159, 36579, 17463, 49729, 64031, 10915, 1699, 20917, 30141, 34093, 34323, 35478, 42716, 11190, 20518, 34202, 25834, 64615, 12390, 48503, 31921, 59255, 41203, 18891, 16608, 40117, 23039, 24059, 15175, 60387, 23312, 37495, 50783, 31725, 57924, 30882, 52588, 52005, 26255, 20877, 49754, 25508, 17427, 30007, 22683, 29583, 25607, 18271, 56091, 9347, 22310, 28834, 4649, 37978, 16608, 40117, 43920, 63860, 9018, 1957, 17712, 62562, 62924, 61256, 39509, 12171, 49754, 25508, 23039, 24059, 22683, 29583, 45217, 53617}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component4 + 97;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void component3() {
        component1 = (char) 13758;
        component3 = (char) 60963;
        copydefault = (char) 59191;
        component2 = (char) 35044;
    }
}
