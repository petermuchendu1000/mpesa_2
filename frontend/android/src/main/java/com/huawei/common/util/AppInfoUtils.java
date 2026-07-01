package com.huawei.common.util;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.blankj.utilcode.util.Utils;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.UUID;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getActiveNotifications;

public class AppInfoUtils {
    private static final byte[] $$c = {118, 33, 67, 92};
    private static final int $$f = 34;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {68, -127, 122, -15, -39, -25, -30, -26, -26, -18, -36, -33, 39, -39, -28, -36};
    private static final int $$e = 145;
    private static final byte[] $$a = {78, -86, -128, -128, -2, Ascii.SI, -36, 17, 2, 8, -10, 6, -2, -28, 37, -8, 9};
    private static final int $$b = 146;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int[] copydefault = {126174308, -1031871957, -1320042192, -926516366, 642554969, -762254620, 1241113747, -534481099, 174859846, 1646054382, 1627596038, 1454274213, -1259165266, 766575762, -1775845001, -1907729658, 826244009, 311792937};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(int r6, short r7, short r8) {
        /*
            byte[] r0 = com.huawei.common.util.AppInfoUtils.$$c
            int r6 = r6 * 2
            int r1 = 1 - r6
            int r8 = r8 * 2
            int r8 = 3 - r8
            int r7 = 107 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2e
        L17:
            r3 = r2
        L18:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.util.AppInfoUtils.$$g(int, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r7 = r7 * 3
            int r7 = 103 - r7
            byte[] r0 = com.huawei.common.util.AppInfoUtils.$$a
            int r8 = r8 * 4
            int r1 = 14 - r8
            byte[] r1 = new byte[r1]
            int r8 = 13 - r8
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r6
            goto L30
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.util.AppInfoUtils.a(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 3
            int r0 = r7 + 1
            byte[] r1 = com.huawei.common.util.AppInfoUtils.$$d
            int r6 = r6 + 98
            int r5 = r5 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r4 = r7
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r5 = r5 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r1[r5]
        L26:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-27)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.util.AppInfoUtils.b(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x028d A[Catch: NameNotFoundException | RuntimeException -> 0x070c, NameNotFoundException | RuntimeException -> 0x070c, TryCatch #6 {NameNotFoundException | RuntimeException -> 0x070c, blocks: (B:3:0x0003, B:5:0x0070, B:6:0x009e, B:10:0x00b3, B:10:0x00b3, B:12:0x00d8, B:12:0x00d8, B:17:0x0180, B:17:0x0180, B:19:0x01bf, B:19:0x01bf, B:26:0x0217, B:26:0x0217, B:28:0x021b, B:28:0x021b, B:33:0x0233, B:33:0x0233, B:39:0x0284, B:39:0x0284, B:41:0x028d, B:41:0x028d, B:42:0x02c7, B:42:0x02c7, B:44:0x02d6, B:44:0x02d6, B:45:0x0316, B:45:0x0316, B:53:0x0390, B:53:0x0390, B:55:0x0396, B:55:0x0396, B:56:0x0397, B:56:0x0397, B:36:0x0259, B:36:0x0259, B:58:0x0399, B:58:0x0399, B:59:0x039c, B:59:0x039c, B:64:0x03a9, B:64:0x03a9, B:66:0x03af, B:66:0x03af, B:67:0x03b0, B:67:0x03b0, B:68:0x03b1, B:68:0x03b1, B:70:0x03ba, B:70:0x03ba, B:71:0x03f4, B:71:0x03f4, B:82:0x04c6, B:82:0x04c6, B:91:0x0591, B:91:0x0591, B:100:0x05a3, B:100:0x05a3, B:102:0x05a7, B:102:0x05a7, B:110:0x05b6, B:110:0x05b6, B:123:0x0687, B:123:0x0687, B:124:0x0691, B:124:0x0691, B:126:0x0693, B:126:0x0693, B:128:0x0699, B:128:0x0699, B:129:0x069a, B:129:0x069a, B:131:0x069c, B:131:0x069c, B:133:0x06a2, B:133:0x06a2, B:134:0x06a3, B:134:0x06a3, B:135:0x06a4, B:135:0x06a4, B:138:0x06c2, B:138:0x06c2, B:143:0x06d5, B:143:0x06d5, B:144:0x06db, B:144:0x06db, B:146:0x06e1, B:146:0x06e1, B:147:0x06e4, B:147:0x06e4, B:151:0x06f5, B:151:0x06f5, B:103:0x05ac, B:103:0x05ac, B:105:0x05af, B:105:0x05af, B:106:0x05b2, B:106:0x05b2, B:154:0x06fb, B:154:0x06fb, B:156:0x0701, B:156:0x0701, B:157:0x0702, B:157:0x0702, B:159:0x0704, B:159:0x0704, B:161:0x070a, B:161:0x070a, B:162:0x070b, B:162:0x070b), top: B:177:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02d6 A[Catch: NameNotFoundException | RuntimeException -> 0x070c, NameNotFoundException | RuntimeException -> 0x070c, TryCatch #6 {NameNotFoundException | RuntimeException -> 0x070c, blocks: (B:3:0x0003, B:5:0x0070, B:6:0x009e, B:10:0x00b3, B:10:0x00b3, B:12:0x00d8, B:12:0x00d8, B:17:0x0180, B:17:0x0180, B:19:0x01bf, B:19:0x01bf, B:26:0x0217, B:26:0x0217, B:28:0x021b, B:28:0x021b, B:33:0x0233, B:33:0x0233, B:39:0x0284, B:39:0x0284, B:41:0x028d, B:41:0x028d, B:42:0x02c7, B:42:0x02c7, B:44:0x02d6, B:44:0x02d6, B:45:0x0316, B:45:0x0316, B:53:0x0390, B:53:0x0390, B:55:0x0396, B:55:0x0396, B:56:0x0397, B:56:0x0397, B:36:0x0259, B:36:0x0259, B:58:0x0399, B:58:0x0399, B:59:0x039c, B:59:0x039c, B:64:0x03a9, B:64:0x03a9, B:66:0x03af, B:66:0x03af, B:67:0x03b0, B:67:0x03b0, B:68:0x03b1, B:68:0x03b1, B:70:0x03ba, B:70:0x03ba, B:71:0x03f4, B:71:0x03f4, B:82:0x04c6, B:82:0x04c6, B:91:0x0591, B:91:0x0591, B:100:0x05a3, B:100:0x05a3, B:102:0x05a7, B:102:0x05a7, B:110:0x05b6, B:110:0x05b6, B:123:0x0687, B:123:0x0687, B:124:0x0691, B:124:0x0691, B:126:0x0693, B:126:0x0693, B:128:0x0699, B:128:0x0699, B:129:0x069a, B:129:0x069a, B:131:0x069c, B:131:0x069c, B:133:0x06a2, B:133:0x06a2, B:134:0x06a3, B:134:0x06a3, B:135:0x06a4, B:135:0x06a4, B:138:0x06c2, B:138:0x06c2, B:143:0x06d5, B:143:0x06d5, B:144:0x06db, B:144:0x06db, B:146:0x06e1, B:146:0x06e1, B:147:0x06e4, B:147:0x06e4, B:151:0x06f5, B:151:0x06f5, B:103:0x05ac, B:103:0x05ac, B:105:0x05af, B:105:0x05af, B:106:0x05b2, B:106:0x05b2, B:154:0x06fb, B:154:0x06fb, B:156:0x0701, B:156:0x0701, B:157:0x0702, B:157:0x0702, B:159:0x0704, B:159:0x0704, B:161:0x070a, B:161:0x070a, B:162:0x070b, B:162:0x070b), top: B:177:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0334 A[Catch: all -> 0x038f, TryCatch #10 {all -> 0x038f, blocks: (B:47:0x031e, B:49:0x0334, B:50:0x0382), top: B:184:0x031e }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x059a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getVersionName() {
        /*
            Method dump skipped, instruction units count: 2040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.util.AppInfoUtils.getVersionName():java.lang.String");
    }

    public static String getAndroidID() {
        int i = 2 % 2;
        int i2 = component1 + 55;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            String string = Settings.Secure.getString(Utils.getApp().getContentResolver(), "android_id");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            int i3 = component3 + 25;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            String string2 = UUID.randomUUID().toString();
            if (i4 != 0) {
                int i5 = 72 / 0;
            }
            return string2;
        }
        TextUtils.isEmpty(Settings.Secure.getString(Utils.getApp().getContentResolver(), "android_id"));
        throw null;
    }

    @Deprecated
    public static boolean isLayoutRTL() {
        int i = 2 % 2;
        int i2 = component1 + 9;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Application app = Utils.getApp();
        if (i3 != 0) {
            return isLayoutRTL(app);
        }
        isLayoutRTL(app);
        throw null;
    }

    public static boolean isLayoutRTL(Context context) {
        int i = 2 % 2;
        int i2 = component1 + 123;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        if (context.getResources().getConfiguration().getLayoutDirection() != 1) {
            return false;
        }
        int i4 = component3 + 111;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private static void c(int i, int[] iArr, Object[] objArr) throws Throwable {
        int[] iArr2;
        int i2 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = copydefault;
        long j = 0;
        int i3 = 684241640;
        int i4 = 1;
        int i5 = 0;
        if (iArr3 != null) {
            int i6 = $10 + 49;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i8])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i3);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4391 - (ViewConfiguration.getScrollBarSize() >> 8), ExpandableListView.getPackedPositionType(j) + 37, (char) (Process.myTid() >> 22), -309236339, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr4[i8] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i8++;
                    j = 0;
                    i3 = 684241640;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = copydefault;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                try {
                    Object[] objArr3 = new Object[i4];
                    objArr3[i5] = Integer.valueOf(iArr6[i9]);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) i5;
                        byte b5 = (byte) (b4 + 1);
                        iArr2 = iArr6;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4391 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 37, (char) ((-1) - Process.getGidForName("")), -309236339, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                    } else {
                        iArr2 = iArr6;
                    }
                    iArr7[i9] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    i9++;
                    iArr6 = iArr2;
                    i4 = 1;
                    i5 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr6 = iArr7;
        }
        int i10 = i5;
        System.arraycopy(iArr6, i10, iArr5, i10, length2);
        getactivenotifications.component1 = i10;
        int i11 = $10 + 33;
        $11 = i11 % 128;
        int i12 = i11 % 2;
        while (getactivenotifications.component1 < iArr.length) {
            int i13 = $11 + 91;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            int i15 = $10 + 19;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            for (int i17 = 0; i17 < 16; i17++) {
                getactivenotifications.ShareDataUIState ^= iArr5[i17];
                Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 3);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2968 - Drawable.resolveOpacity(0, 0), 15 - Process.getGidForName(""), (char) (49870 - TextUtils.indexOf((CharSequence) "", '0')), 462826032, false, $$g(b6, b7, (byte) (b7 - 3)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
            }
            int i18 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i18;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i19 = getactivenotifications.ShareDataUIState;
            int i20 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr5);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr5 = {getactivenotifications, getactivenotifications};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2945 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 24 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (27637 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), -1616366948, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
