package com.huawei.digitalpayment.consumer.qrcode.viewmodel;

import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;

public final class ReceiveCodeViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static int ShareDataUIState;
    private static int component1;
    private static byte[] component2;
    static ReceiveCodeViewModel component3;
    private static int copydefault;
    private static int getAsAtTimestamp;
    private static short[] getRequestBeneficiariesState;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {20, 103, 109, TarHeader.LF_BLK};
    private static final int $$b = 104;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component4 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r5, byte r6, byte r7) {
        /*
            int r5 = r5 * 2
            int r5 = 3 - r5
            int r6 = r6 * 2
            int r6 = 1 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.qrcode.viewmodel.ReceiveCodeViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r7 = r7 + 112
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            int r5 = r5 + 1
            r4 = r0[r5]
        L26:
            int r7 = r7 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.viewmodel.ReceiveCodeViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r25, int r26, short r27, byte r28, int r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.viewmodel.ReceiveCodeViewModel_HiltModules_BindsModule_Binds_LazyMapKey.a(int, int, short, byte, int, java.lang.Object[]):void");
    }

    static {
        getAsAtTimestamp = 1;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(193595613 - (Process.myPid() >> 22), (ViewConfiguration.getWindowTouchSlop() >> 8) + 26, (short) View.MeasureSpec.getMode(0), (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 60), (ViewConfiguration.getEdgeSlop() >> 16) + 766516095, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component4 + 5;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    static void ShareDataUIState() {
        ShareDataUIState = 96370698;
        copydefault = -238323961;
        component1 = 595891149;
        component2 = new byte[]{-21, -19, Ascii.EM, -50, 58, -2, Ascii.DLE, -1, Ascii.GS, -19, Ascii.EM, -64, TarHeader.LF_SYMLINK, 3, -31, -24, -18, Ascii.DC2, -1, -56, 46, -21, -19, Ascii.EM, -18, Ascii.SUB, -2, Ascii.DLE, Ascii.US, -92, 37, -19, Ascii.EM, -32, Ascii.GS, -19, -81, 80, -31, 20, 20, -18, -23, 19, -32, -39, 86, -22, -27, 20, Ascii.CAN, -12, Ascii.GS, -24, -25, 1, -25, -18, Ascii.DC2, -23, -38, 41, -24, 2, -6, 0, -31, -42, 45, Ascii.DC2, -32, 41};
    }
}
