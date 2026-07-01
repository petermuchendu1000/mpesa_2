package com.huawei.digitalpayment.consumer.scan.viewmodel;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class ScanViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static char ShareDataUIState;
    static ScanViewModel component1;
    private static char component2;
    private static char component3;
    private static char copydefault;
    private static int getRequestBeneficiariesState;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {59, -24, -77, -23};
    private static final int $$b = 43;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component4 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, int r7, short r8) {
        /*
            int r8 = r8 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.scan.viewmodel.ScanViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r6 = r6 * 2
            int r6 = 111 - r6
            int r7 = r7 * 3
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L17
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2d:
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.viewmodel.ScanViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(short, int, short):java.lang.String");
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
        int i6 = $11 + 59;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i8 = $11 + 89;
            $10 = i8 % 128;
            int i9 = i8 % i3;
            cArr3[i5] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i10 = $10 + 79;
            $11 = i10 % 128;
            int i11 = i10 % i3;
            int i12 = 58224;
            int i13 = i5;
            while (i13 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[i5];
                int i14 = (c3 + i12) ^ ((c3 << 4) + ((char) (((long) copydefault) ^ 4374495167426960553L)));
                int i15 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(component2);
                    objArr2[i3] = Integer.valueOf(i15);
                    objArr2[1] = Integer.valueOf(i14);
                    objArr2[i5] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int threadPriority = 844 - ((Process.getThreadPriority(i5) + 20) >> 6);
                        int gidForName = 31 - Process.getGidForName("");
                        char cArgb = (char) (Color.argb(i5, i5, i5, i5) + 23251);
                        byte b2 = (byte) i5;
                        byte b3 = b2;
                        String str$$c = $$c(b2, b3, (byte) (b3 - 1));
                        Class[] clsArr = new Class[4];
                        clsArr[i5] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(threadPriority, gidForName, cArgb, 592652048, false, str$$c, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i12) ^ ((cCharValue << 4) + ((char) (((long) component3) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(ShareDataUIState)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.blue(0) + 844, TextUtils.indexOf((CharSequence) "", '0', 0) + 33, (char) (23250 - ImageFormat.getBitsPerPixel(0)), 592652048, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i12 -= 40503;
                    i13++;
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
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 465, 49 - KeyEvent.normalizeMetaState(0), (char) ((Process.getThreadPriority(0) + 20) >> 6), 1194533216, false, "m", new Class[]{Object.class, Object.class});
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
        getRequestBeneficiariesState = 0;
        component3();
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getJumpTapTimeout() >> 16) + 63, new char[]{24441, 49313, 25712, 9970, 57864, 65167, 43569, 6439, 62359, 11950, 38084, 52056, 48929, 27948, 50746, 41186, 5576, 52798, 21437, 37570, 53754, 13107, 30387, 28447, 959, 4921, 24441, 49313, 2325, 61456, 65127, 51520, 22266, 14816, 57322, 36112, 19931, 48523, 45490, 38094, 35820, 1961, 59559, 20768, 63286, 1276, 37933, 65028, 20142, 40253, 47302, 61129, 45743, 59947, 1648, 38558, 59559, 20768, 8866, 27773, 37933, 65028, 65035, 25297}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component4 + 37;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 != 0) {
            int i2 = 61 / 0;
        }
    }

    static void component3() {
        component3 = (char) 18699;
        ShareDataUIState = (char) 40571;
        copydefault = (char) 60341;
        component2 = (char) 5662;
    }
}
