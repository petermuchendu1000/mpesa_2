package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class LoginViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static char ShareDataUIState;
    private static int component1;
    private static int component2;
    static LoginViewModel component3;
    private static long copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {66, 42, 112, 97};
    private static final int $$b = 9;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getRequestBeneficiariesState = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, short r7, short r8) {
        /*
            int r8 = r8 + 98
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r6 = r6 * 2
            int r0 = 1 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.loginModule.login.viewmodel.LoginViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            int r8 = r8 + 1
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.login.viewmodel.LoginViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, short, short):java.lang.String");
    }

    private static void a(char[] cArr, char[] cArr2, char c2, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        while (iNotificationSideChannel.copydefault < length3) {
            int i3 = $10 + 105;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4037 - Drawable.resolveOpacity(0, 0), 32 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 19181), 1912513118, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0, 0) + 7568, 11 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 2006389106, false, "e", new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2459 - TextUtils.getOffsetBefore("", 0), 28 - TextUtils.getTrimmedLength(""), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 931716605, false, $$c(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 11 - Color.argb(0, 0, 0, 0), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[iNotificationSideChannel.copydefault])) ^ (copydefault ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component1) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) ShareDataUIState) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i5 = $11 + 117;
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    static {
        component2 = 0;
        component2();
        Object[] objArr = new Object[1];
        a(new char[]{30608, 22371, 2629, 36357, 11217, 15131, 41361, 39360, 15367, 18444, 26737, 13992, 57266, 31060, 14280, 40692, 29676, 4438, 13040, 48671, 15760, 35930, 49712, 56632, 14974, 65055, 26249, 4768, 14110, 59811, 30559, 22506, 31166, 54349, 61795, 50852, 1340, 27311, 42545, 56867, 63411, 23267, 17325, 31046, 1913, 27325, 33214, 910, 49547, 27676, 63514, 16835, 12211, 60474, 24975, 54680, 1619, 43710, 44673, 25980, 5675, 63312, 33644, 29307, 9036, 61687, 46077, 14780, 52993, 50386, 59262, 45984, 10252, 62778, 44993, 16140, 16629}, new char[]{56118, 45544, 39663, 6020}, (char) ((-16777216) - Color.rgb(0, 0, 0)), (-273553189) + (ViewConfiguration.getKeyRepeatDelay() >> 16), new char[]{0, 0, 0, 0}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = getRequestBeneficiariesState + 115;
        component2 = i % 128;
        int i2 = i % 2;
    }

    static void component2() {
        copydefault = -3780477796495014671L;
        component1 = -1205324094;
        ShareDataUIState = (char) 50417;
    }
}
