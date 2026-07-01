package com.huawei.digitalpayment.common.theme.viewmodel;

import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.alibaba.griver.image.framework.utils.FileUtils;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class BalanceThemeViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static char ShareDataUIState;
    private static char component1;
    private static char component2;
    private static char component3;
    static BalanceThemeViewModel copydefault;
    private static int getRequestBeneficiariesState;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {120, -62, 63, 57};
    private static final int $$b = FileUtils.JPEG_MARKER_EOI;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int equals = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r7, int r8, int r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.common.theme.viewmodel.BalanceThemeViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r8 = r8 * 4
            int r8 = 111 - r8
            int r9 = r9 * 2
            int r9 = 1 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2c
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L27:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r6
        L2c:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.viewmodel.BalanceThemeViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, int, int):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i5 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        int i6 = $10 + 13;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i8 = $10 + 33;
            $11 = i8 % 128;
            int i9 = i8 % i3;
            cArr3[i5] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i10 = 58224;
            int i11 = i5;
            while (i11 < 16) {
                int i12 = $11 + 29;
                $10 = i12 % 128;
                int i13 = i12 % i3;
                char c2 = cArr3[1];
                char c3 = cArr3[i5];
                int i14 = (c3 + i10) ^ ((c3 << 4) + ((char) (((long) component1) ^ 4374495167426960553L)));
                int i15 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(component2);
                    objArr2[i3] = Integer.valueOf(i15);
                    objArr2[1] = Integer.valueOf(i14);
                    objArr2[i5] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int iLastIndexOf = 843 - TextUtils.lastIndexOf("", '0', i5, i5);
                        int i16 = (CdmaCellLocation.convertQuartSecToDecDegrees(i5) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i5) == 0.0d ? 0 : -1)) + 32;
                        char keyRepeatTimeout = (char) (23251 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        byte b2 = (byte) i5;
                        byte b3 = b2;
                        String str$$c = $$c(b2, b3, b3);
                        Class[] clsArr = new Class[4];
                        clsArr[i5] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf, i16, keyRepeatTimeout, 592652048, false, str$$c, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i10) ^ ((cCharValue << 4) + ((char) (((long) component3) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(ShareDataUIState)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(((byte) KeyEvent.getModifierMetaStateMask()) + 845, ImageFormat.getBitsPerPixel(0) + 33, (char) (23251 - TextUtils.getOffsetBefore("", 0)), 592652048, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i10 -= 40503;
                    i11++;
                    cArr3 = cArr4;
                    i3 = 2;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[iNotificationSideChannelDefault.component3] = cArr5[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr5[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                i2 = 2;
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(MotionEvent.axisFromString("") + 466, 49 - TextUtils.getOffsetBefore("", 0), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            } else {
                i2 = 2;
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            i3 = i2;
            cArr3 = cArr5;
            i5 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        getRequestBeneficiariesState = 1;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getPressedStateDuration() >> 16) + 70, new char[]{19939, 18998, 40987, 61310, 64135, 2135, 9401, 54123, 6620, 53571, 32653, 50621, 59040, 45550, 61597, 45042, 2893, 40098, 9340, 51793, 52150, 3389, 57959, 44793, 20810, 57930, 19939, 18998, 1882, 58952, 59260, 64581, 18580, 11134, 11720, 905, 31765, 14928, 46724, 47226, 24557, 52083, 48363, 34731, 6859, 50961, 16151, 25873, 13117, 40094, 2893, 40098, 45728, 28586, 23978, 63080, 40056, 37417, 23666, 571, 25827, 10169, 24557, 52083, 46144, 63318, 6859, 50961, 16151, 25873}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = equals + 59;
        getRequestBeneficiariesState = i % 128;
        int i2 = i % 2;
    }

    static void ShareDataUIState() {
        component3 = (char) 6519;
        ShareDataUIState = (char) 47652;
        component1 = (char) 47410;
        component2 = (char) 59228;
    }
}
