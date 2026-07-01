package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import android.graphics.Color;
import android.media.AudioTrack;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;

public final class ChangePinOtpViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static byte[] ShareDataUIState;
    static ChangePinOtpViewModel component1;
    private static int component2;
    private static int component3;
    private static short[] copy;
    private static int copydefault;
    private static int getAsAtTimestamp;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {120, -62, 63, 57};
    private static final int $$b = 250;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int equals = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, byte r8) {
        /*
            int r6 = r6 * 4
            int r6 = 3 - r6
            int r8 = 116 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ChangePinOtpViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r7 = r7 * 2
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L20:
            int r6 = r6 + 1
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ChangePinOtpViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x02dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r24, int r25, short r26, byte r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 869
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ChangePinOtpViewModel_HiltModules_BindsModule_Binds_LazyMapKey.a(int, int, short, byte, int, java.lang.Object[]):void");
    }

    static {
        getAsAtTimestamp = 0;
        component3();
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 731155258, (-107) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (short) Color.green(0), (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 934127763 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = equals + 69;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    static void component3() {
        component3 = 631243759;
        copydefault = -238323901;
        component2 = 966336760;
        ShareDataUIState = new byte[]{-64, 46, 40, -36, Ascii.VT, -1, 59, -43, 58, -49, -43, Ascii.FF, -56, 44, TarHeader.LF_NORMAL, -62, -41, -48, 36, -48, Ascii.FF, 60, -21, 46, 40, -36, 43, -33, 59, -43, -38, 97, -23, 44, -48, 42, Ascii.SYN, -32, -48, -34, 56, -36, Ascii.VT, -10, 44, 43, -47, 42, Ascii.ETB, -107, 36, -47, -47, 43, 44, -42, 37, Ascii.FS, -109, 47, 32, -47, -35, TarHeader.LF_LINK, -40, 45, 34, -60, 34, 43, -41, 44, Ascii.US, -20, 45, -57, 63, -59, 36, 19, -24, -41, 37};
    }
}
