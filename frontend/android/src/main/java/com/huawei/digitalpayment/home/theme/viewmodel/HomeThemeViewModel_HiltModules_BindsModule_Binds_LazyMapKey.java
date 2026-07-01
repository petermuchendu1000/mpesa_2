package com.huawei.digitalpayment.home.theme.viewmodel;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.notify;

public final class HomeThemeViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    static HomeThemeViewModel ShareDataUIState;
    private static long component3;
    private static int copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {13, 38, -109, 117};
    private static final int $$b = 150;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r5, byte r6, short r7) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 102
            int r7 = r7 + 4
            byte[] r0 = com.huawei.digitalpayment.home.theme.viewmodel.HomeThemeViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r5 = r5 * 2
            int r1 = 1 - r5
            byte[] r1 = new byte[r1]
            r2 = 0
            int r5 = 0 - r5
            if (r0 != 0) goto L17
            r3 = r6
            r4 = r2
            r6 = r5
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L27:
            r3 = r0[r7]
        L29:
            int r6 = r6 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.theme.viewmodel.HomeThemeViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(short, byte, short):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $10 + 117;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = notifyVar.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3265 - TextUtils.lastIndexOf("", '0', 0, 0), View.MeasureSpec.getMode(0) + 33, (char) (60268 - Color.alpha(0)), -834797019, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (component3 ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0) + 687, 34 - TextUtils.getTrimmedLength(""), (char) (60372 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), -1969106284, false, $$c(b4, b5, (byte) (-b5)), new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i6 = $10 + 79;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr4 = {notifyVar, notifyVar};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault3 == null) {
                byte b6 = (byte) 0;
                byte b7 = (byte) (b6 + 1);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 687, 34 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 60373), -1969106284, false, $$c(b6, b7, (byte) (-b7)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            int i8 = $10 + 1;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 % 3;
            }
        }
        objArr[0] = new String(cArr2);
    }

    static {
        copydefault = 0;
        component3();
        Object[] objArr = new Object[1];
        a(58658 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), new char[]{33809, 24892, 20061, 11071, 4254, 64930, 56021, 51170, 44319, 35378, 30486, 23677, 14743, 9912, 981, 59625, 54787, 45871, 38992, 34144, 25247, 20394, 13505, 4587, 65310, 58469, 49472, 44646, 35715, 28842, 23938, 15097, 8250, 3414, 60029, 55188, 48376, 39361, 34557, 27664, 18733, 13910, 4983, 63645, 58811, 49875, 44978, 38197, 29229, 24398, 17509, 8629, 3758, 60354, 53481, 48640, 39708, 32834, 28013, 19102, 14211, 7360, 63976, 59144, 52318}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component2 + 101;
        copydefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 72 / 0;
        }
    }

    static void component3() {
        component3 = -4489223646614125480L;
    }
}
