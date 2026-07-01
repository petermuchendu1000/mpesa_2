package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import android.graphics.ImageFormat;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import kotlin.io.encoding.Base64;

public final class LoginSettingViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    static LoginSettingViewModel ShareDataUIState;
    private static int component1;
    private static int component2;
    private static byte[] component3;
    private static int copydefault;
    private static short[] equals;
    private static int getRequestBeneficiariesState;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {SignedBytes.MAX_POWER_OF_TWO, -61, 76, -90};
    private static final int $$b = 191;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copy = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r5, byte r6, int r7) {
        /*
            int r7 = 116 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginSettingViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r6 = r6 * 3
            int r1 = r6 + 1
            int r5 = r5 * 2
            int r5 = 4 - r5
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r6
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L21:
            int r3 = r3 + 1
            r4 = r0[r5]
        L25:
            int r5 = r5 + 1
            int r7 = r7 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginSettingViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(short, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0249  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r25, int r26, short r27, byte r28, int r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginSettingViewModel_HiltModules_KeyModule_Provide_LazyMapKey.a(int, int, short, byte, int, java.lang.Object[]):void");
    }

    static {
        getRequestBeneficiariesState = 1;
        component2();
        Object[] objArr = new Object[1];
        a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1698511658, KeyEvent.normalizeMetaState(0) + 1, (short) View.MeasureSpec.getSize(0), (byte) ((-26) - ExpandableListView.getPackedPositionType(0L)), ImageFormat.getBitsPerPixel(0) + 1955970718, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = copy + 67;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void component2() {
        copydefault = 1795798014;
        component2 = -238323872;
        component1 = 2057385711;
        component3 = new byte[]{-56, -50, 58, -19, Ascii.EM, -35, TarHeader.LF_CHR, -36, 32, TarHeader.LF_FIFO, -54, 58, -49, -64, -35, 42, -54, -51, TarHeader.LF_CONTIG, -20, -47, 13, -56, -50, 58, -51, 57, -35, TarHeader.LF_CHR, 60, -121, 10, -37, Base64.padSymbol, TarHeader.LF_DIR, 57, -35, TarHeader.LF_NORMAL, -5, 115, -62, TarHeader.LF_CONTIG, TarHeader.LF_CONTIG, -51, -54, TarHeader.LF_NORMAL, -61, -6, 117, -55, -58, TarHeader.LF_CONTIG, 59, -41, 62, -53, -60, 34, -60, -51, TarHeader.LF_LINK, -54, -7, 10, -53, 33, -39, 35, -62, -11, Ascii.SO, TarHeader.LF_LINK, -61, 41};
    }
}
