package com.huawei.digitalpayment.consumer.sfc;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;

public final class BuildConfig {
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String FACEBOOK_URL = "facebook.com";
    public static final String GOOGLE_URL = "google.com";
    public static final String INSTAGRAM_URL = "instagram.com";
    public static final String LIBRARY_PACKAGE_NAME;
    public static final String MICROSOFT_URL = "microsoft.com";
    public static final String MTANDAO_SPEEDTEST_URL = "radio.speedtest.safaricom.com";
    public static final String SAFARICOM_URL = "safaricom.co.ke";
    private static int ShareDataUIState = 0;
    public static final String TIKTOK_URL = "tiktok.com";
    public static final String TWITTER_URL = "twitter.com";
    public static final String WHATSAPP_URL = "whatsapp.net";
    public static final String YOUTUBE_URL = "googlevideo.com";
    private static boolean component1;
    private static boolean component3;
    private static char[] copydefault;
    private static int getRequestBeneficiariesState;
    private static final byte[] $$a = {120, Ascii.VT, 65, 93};
    private static final int $$b = 171;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, int r7, byte r8) {
        /*
            int r6 = r6 * 3
            int r6 = 3 - r6
            int r8 = r8 * 4
            int r8 = 1 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.BuildConfig.$$a
            int r7 = r7 * 5
            int r7 = r7 + 68
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r7 = r8
            r4 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r6]
        L29:
            int r7 = r7 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.BuildConfig.$$c(short, int, byte):java.lang.String");
    }

    private static void a(int i, int[] iArr, byte[] bArr, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = copydefault;
        int i3 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i4]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3759 - TextUtils.lastIndexOf("", '0'), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.EM, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1670574543, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i4++;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(ShareDataUIState)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.getDeadChar(0, 0) + 7140, TextUtils.getOffsetAfter("", 0) + 13, (char) TextUtils.getOffsetAfter("", 0), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i5 = 689978476;
        if (component3) {
            int i6 = $11 + 57;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i8 = $10 + 107;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr4 = {cancelVar, cancelVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2748, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 19, (char) (7644 - View.MeasureSpec.getMode(0)), -327556343, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (component1) {
            int i10 = $10 + 83;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cancelVar.component1 = cArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i12 = $11 + 39;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    cArr5[cancelVar.component3] = (char) (cArr2[cArr[cancelVar.component1 >> cancelVar.component3] << i] >>> iIntValue);
                    Object[] objArr5 = {cancelVar, cancelVar};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i5);
                    if (objCopydefault4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 1);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2748 - View.MeasureSpec.getSize(0), 19 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (7644 - Color.green(0)), -327556343, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                } else {
                    cArr5[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    Object[] objArr6 = {cancelVar, cancelVar};
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault5 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 + 1);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.keyCodeFromString("") + 2748, TextUtils.getCapsMode("", 0, 0) + 19, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 7644), -327556343, false, $$c(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault5).invoke(null, objArr6);
                }
                i5 = 689978476;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i13 = 0;
        cancelVar.component1 = iArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        while (true) {
            cancelVar.component3 = i13;
            if (cancelVar.component3 >= cancelVar.component1) {
                objArr[0] = new String(cArr6);
                return;
            }
            int i14 = $10 + 63;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            cArr6[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
            i13 = cancelVar.component3 + 1;
        }
    }

    static {
        getRequestBeneficiariesState = 1;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(127 - (Process.myPid() >> 22), null, new byte[]{-127, -108, -110, -124, -109, -119, -125, -122, -110, -111, -126, -127, -124, -115, -111, -119, -125, -112, -121, -113, -114, -121, -115, -118, -116, -118, -117, -124, -118, -119, -120, -121, -122, -123, -124, -125, -126, -127}, null, objArr);
        LIBRARY_PACKAGE_NAME = ((String) objArr[0]).intern();
        int i = component2 + 87;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 == 0) {
            int i2 = 4 / 0;
        }
    }

    static void ShareDataUIState() {
        copydefault = new char[]{30248, 30236, 30242, 30429, 30247, 30234, 30254, 30228, 30250, 30246, 30251, 30244, 30235, 30243, 30239, 30230, 30237, 30232, 30233, 30245};
        ShareDataUIState = 321287823;
        component1 = true;
        component3 = true;
    }
}
