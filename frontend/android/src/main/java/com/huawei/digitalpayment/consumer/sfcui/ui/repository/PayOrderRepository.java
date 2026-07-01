package com.huawei.digitalpayment.consumer.sfcui.ui.repository;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.huawei.digitalpayment.checkout.model.request.PayRequest;
import com.huawei.digitalpayment.checkout.model.response.TransferResp;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;

public class PayOrderRepository extends PaymentRequest<TransferResp> {
    private static final byte[] $$c = {20, 103, 109, TarHeader.LF_BLK};
    private static final int $$f = 65;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {115, -125, 45, -41, -39, -25, -30, -26, -26, -18, -36, -33, 39, -39, -28, -36};
    private static final int $$e = 184;
    private static final byte[] $$a = {2, 105, -126, -86, 2, -10, 10};
    private static final int $$b = 118;
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private static long component2 = 5257548578350061410L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(byte r6, byte r7, short r8) {
        /*
            int r6 = r6 * 3
            int r0 = 1 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.PayOrderRepository.$$c
            int r7 = r7 * 2
            int r7 = r7 + 103
            int r8 = r8 * 4
            int r8 = 4 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r8 = -r8
            int r3 = r3 + 1
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.repository.PayOrderRepository.$$g(byte, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r0 = 4 - r8
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r6 = r6 * 2
            int r6 = r6 + 111
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.PayOrderRepository.$$a
            byte[] r0 = new byte[r0]
            int r8 = 3 - r8
            r2 = -1
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L32
        L18:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1c:
            int r3 = r3 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L2c
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r0, r7)
            r9[r7] = r6
            return
        L2c:
            r4 = r1[r6]
            r5 = r3
            r3 = r6
            r6 = r4
            r4 = r5
        L32:
            int r7 = r7 + r6
            int r7 = r7 + r2
            int r6 = r3 + 1
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.repository.PayOrderRepository.a(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r0 = r6 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.PayOrderRepository.$$d
            int r8 = r8 * 9
            int r8 = 13 - r8
            int r7 = r7 + 98
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r3 = r3 + 1
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-27)
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.repository.PayOrderRepository.b(byte, short, byte, java.lang.Object[]):void");
    }

    public PayOrderRepository(PayRequest payRequest) {
        addParams(payRequest);
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component3 + 91;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 91;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return "h5PayOrder";
        }
        throw null;
    }

    private static void c(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component2 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $10 + 77;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component2)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getLongPressTimeout() >> 16) + 7032, 34 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 63440), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1389 - TextUtils.lastIndexOf("", '0', 0), Color.alpha(0) + 18, (char) (51269 - (ViewConfiguration.getTapTimeout() >> 16)), -1883291598, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
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
        int i6 = $10 + 45;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i7 = 39 / 0;
            objArr[0] = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x055d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int component2(java.util.List r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.repository.PayOrderRepository.component2(java.util.List):int");
    }
}
