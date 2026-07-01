package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class RegisterOtpViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static char ShareDataUIState;
    private static char component1;
    static RegisterOtpViewModel component2;
    private static char component3;
    private static int component4;
    private static char copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {111, -17, Ascii.VT, -125};
    private static final int $$b = 208;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int equals = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, int r7, byte r8) {
        /*
            int r6 = r6 * 4
            int r6 = 111 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.RegisterOtpViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r8 = r8 * 4
            int r1 = 1 - r8
            int r7 = r7 * 3
            int r7 = 3 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2d
        L18:
            r3 = r2
        L19:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L28:
            r3 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2d:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.RegisterOtpViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(byte, int, byte):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        char c2;
        int i2 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            cArr3[i3] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i4 = $10 + 77;
            $11 = i4 % 128;
            char c3 = 3;
            if (i4 % 2 == 0) {
                int i5 = 3 % 3;
            }
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                char c4 = cArr3[1];
                char c5 = cArr3[i3];
                int i8 = (c5 + i6) ^ ((c5 << 4) + ((char) (((long) copydefault) ^ 4374495167426960553L)));
                int i9 = c5 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[c3] = Integer.valueOf(component3);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c4);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int bitsPerPixel = 843 - ImageFormat.getBitsPerPixel(i3);
                        int i10 = 33 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                        char c6 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23250);
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        String str$$c = $$c(b2, b3, b3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(bitsPerPixel, i10, c6, 592652048, false, str$$c, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) component1) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(ShareDataUIState)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        int iResolveOpacity = 844 - Drawable.resolveOpacity(0, 0);
                        int iAlpha = Color.alpha(0) + 32;
                        char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 23251);
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        String str$$c2 = $$c(b4, b5, b5);
                        c2 = 3;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iResolveOpacity, iAlpha, maxKeyCode, 592652048, false, str$$c2, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    } else {
                        c2 = 3;
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    c3 = c2;
                    cArr3 = cArr4;
                    i3 = 0;
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
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getLongPressTimeout() >> 16) + 465, ExpandableListView.getPackedPositionType(0L) + 49, (char) (AndroidCharacter.getMirror('0') - '0'), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            int i11 = $10 + 25;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        component4 = 0;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf("", "") + 86, new char[]{36194, 23168, 65053, 3584, 22946, 28378, 29643, 15110, 62707, 53124, 3282, 46719, 26120, 61387, 16460, 48383, 46271, 11912, 49830, 35960, 44217, 27544, 2020, 24077, 38019, 32670, 36194, 23168, 19585, 16038, 50913, 55183, 24789, 52258, 20645, 2116, 59177, 62626, 12855, 6483, 27317, 63198, 19126, 11592, 16819, 38953, 15168, 46252, 61588, 63391, 23860, 60132, 21790, 18511, 22918, 50587, 21542, 59830, 43972, 55458, 13912, 61354, 48116, 53453, 1346, 34527, 55035, 41040, 44940, 39886, 27394, 7709, 24789, 52258, 3171, 27169, 4984, 37129, 24066, 3163, 16508, 61768, 4953, 40299, 56996, 42040}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = equals + 49;
        component4 = i % 128;
        int i2 = i % 2;
    }

    static void ShareDataUIState() {
        component1 = (char) 65317;
        ShareDataUIState = (char) 18671;
        copydefault = (char) 43498;
        component3 = (char) 53630;
    }
}
