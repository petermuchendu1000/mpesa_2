package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import android.graphics.PointF;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;

public final class ResetPinTempPinViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static long ShareDataUIState;
    private static int component1;
    static ResetPinTempPinViewModel component2;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {4, 8, -22, -73};
    private static final int $$b = 84;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component3 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, short r7, int r8) {
        /*
            int r7 = r7 * 3
            int r0 = 1 - r7
            int r6 = r6 + 4
            byte[] r1 = com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ResetPinTempPinViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r8 = r8 * 4
            int r8 = 103 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L17
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2c
        L17:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L26:
            int r3 = r3 + 1
            int r8 = r8 + 1
            r4 = r1[r8]
        L2c:
            int r6 = r6 + r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ResetPinTempPinViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(byte, short, int):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(ShareDataUIState ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $10 + 109;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(ShareDataUIState)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 7032, 34 - TextUtils.indexOf("", ""), (char) (63440 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror('0') + 1342, 17 - TextUtils.indexOf((CharSequence) "", '0'), (char) (51269 - (ViewConfiguration.getPressedStateDuration() >> 16)), -1883291598, false, $$c(b2, b3, b3), new Class[]{Object.class, Object.class});
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
        int i6 = $10 + 1;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    static {
        component1 = 0;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), new char[]{25153, 25122, 4501, 45970, 29451, 30237, 1024, 11517, 59885, 40395, 10202, 45280, 30124, 2331, 43865, 17471, 49508, 30033, 8026, 51307, 19760, 57702, 33439, 21378, 55532, 28323, 63182, 59337, 9389, 55980, 31236, 27396, 45171, 17973, 61014, 65346, 15364, 45672, 21041, 33439, 35786, 16313, 55730, 5849, 6052, 44029, 19955, 39438, 25409, 5939, 45437, 11858, 61185, 33603, 9569, 45613, 31427, 2183, 43182, 17840, 50836, 29901, 7395, 51694, 21073, 57416, 32785, 23850, 56946, 27743, 62539, 57667, 10796, 55696, 31663, 29874, 45540, 17858, 61415, 63730, 15779, 45344, 21274, 35898, 35174, 15623, 51008, 4167, 5424, 43362}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component3 + 65;
        component1 = i % 128;
        if (i % 2 != 0) {
            int i2 = 69 / 0;
        }
    }

    static void ShareDataUIState() {
        ShareDataUIState = -1447343765572006304L;
    }
}
