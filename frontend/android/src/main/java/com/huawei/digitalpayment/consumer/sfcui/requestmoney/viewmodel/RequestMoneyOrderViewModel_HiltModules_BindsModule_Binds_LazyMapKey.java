package com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel;

import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import kotlin.io.encoding.Base64;

public final class RequestMoneyOrderViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static int ShareDataUIState;
    static RequestMoneyOrderViewModel component1;
    private static int component2;
    private static byte[] component3;
    private static short[] component4;
    private static int copydefault;
    private static int getAsAtTimestamp;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {4, 8, -22, -73};
    private static final int $$b = 178;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copy = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r5, int r6, short r7) {
        /*
            int r5 = r5 + 4
            int r6 = r6 * 4
            int r0 = r6 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel.RequestMoneyOrderViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r7 = r7 + 112
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            int r5 = r5 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            r3 = r1[r5]
        L24:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel.RequestMoneyOrderViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r28, int r29, short r30, byte r31, int r32, java.lang.Object[] r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel.RequestMoneyOrderViewModel_HiltModules_BindsModule_Binds_LazyMapKey.a(int, int, short, byte, int, java.lang.Object[]):void");
    }

    static {
        getAsAtTimestamp = 0;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getTapTimeout() >> 16) - 287277259, KeyEvent.keyCodeFromString("") - 39, (short) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (byte) (TextUtils.lastIndexOf("", '0') + 1), 18180 - AndroidCharacter.getMirror('0'), objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = copy + 9;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    static void ShareDataUIState() {
        copydefault = -522913822;
        ShareDataUIState = -238323953;
        component2 = -949891418;
        component3 = new byte[]{Ascii.GS, 46, 40, -36, Ascii.VT, -1, 59, -43, 58, -51, 36, 40, -37, 10, -1, Base64.padSymbol, -34, -42, Ascii.VT, -16, 40, 39, -39, 45, 37, 58, 13, -21, 46, 40, -36, 43, -33, 59, -43, -38, 97, -100, Base64.padSymbol, -34, -42, 43, -48, 40, 39, -39, 45, 37, -38, 109, -20, -35, 59, -44, -38, 108, -107, 36, -47, -47, 43, 44, -42, 37, Ascii.FS, -109, 47, 32, -47, -35, TarHeader.LF_LINK, -40, 45, 34, -60, 34, 43, -41, 44, Ascii.US, -20, 45, -57, 63, -59, 36, 19, -24, -41, 37};
    }
}
