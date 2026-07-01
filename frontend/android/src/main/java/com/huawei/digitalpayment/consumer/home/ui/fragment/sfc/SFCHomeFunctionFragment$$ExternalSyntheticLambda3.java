package com.huawei.digitalpayment.consumer.home.ui.fragment.sfc;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.getLock;

public final class SFCHomeFunctionFragment$$ExternalSyntheticLambda3 implements View.OnClickListener {
    public final SFCHomeFunctionFragment f$0;
    private static final byte[] $$a = {40, 108, -113, 75};
    private static final int $$b = 131;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 0;
    private static int copydefault = 1;
    private static long component3 = -2226102546147946725L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, byte r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCHomeFunctionFragment$$ExternalSyntheticLambda3.$$a
            int r8 = r8 + 4
            int r7 = r7 * 4
            int r7 = 103 - r7
            int r6 = r6 * 2
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2d
        L17:
            r3 = r2
        L18:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2d:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCHomeFunctionFragment$$ExternalSyntheticLambda3.$$c(short, short, byte):java.lang.String");
    }

    public SFCHomeFunctionFragment$$ExternalSyntheticLambda3(SFCHomeFunctionFragment sFCHomeFunctionFragment) {
        this.f$0 = sFCHomeFunctionFragment;
    }

    @Override
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = component1 + 71;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        SFCHomeFunctionFragment.$r8$lambda$UJcA0pRrNRuRRfO2RiVR7_7nQBA(this.f$0, view);
        int i4 = component1 + 69;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component3 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i3 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component3)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - TextUtils.indexOf("", "", 0), 33 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (63440 - Color.blue(0)), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i3] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1390 - (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.lastIndexOf("", '0', 0) + 19, (char) (View.resolveSizeAndState(0, 0, 0) + 51269), -1883291598, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i4 = $11 + 5;
                $10 = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrComponent2, 4, cArrComponent2.length - 4);
        int i6 = $10 + 105;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i7 = 38 / 0;
            objArr[0] = str;
        }
    }

    public static void ShareDataUIState() throws Throwable {
        int i = 2 % 2;
        int i2 = component1 + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Member[] memberArr = getLock.component2;
        Object[] objArr = new Object[1];
        a((-1) - TextUtils.indexOf((CharSequence) "", '0'), new char[]{50180, 50279, 48369, 57108, 22864, 6676, 40489, 12452, 19012, 19766, 3085, 41637, 55345, 49986, 47642, 23710, 28181, 45716, 10421, 53110, 64709, 8375, 42644, 31051, 693, 38606, 54505, 60188, 36992, 1189, 17719, 26101, 10098, 64032, 62217, 6095, 46369, 26697, 24874, 33191, 15117, 56941, 40781, 12405, 18929, 19850, 3482, 41566, 57290, 50138, 48121, 23605, 28032, 45562, 10704, 52747, 64546, 10006, 42533, 30876, 577, 38200, 54389, 60093, 36921, 2877, 16975, 25729, 9974, 64158, 61601, 5988, 46303, 26861, 28351, 33076, 15031, 57066, 40157, 13064, 18568, 19482, 3377, 44519, 57201, 49704, 47877, 24525, 27945, 45168, 10607, 51584, 62225, 9838, 42938, 30801, 488, 38391, 54744, 60007, 38844, 3023, 17377, 25656, 9602, 63970, 61888, 5825, 46189, 28421, 28160, 32978, 14937, 56647, 40053, 12961, 18472, 21370, 2633, 44168, 57064, 49794, 47359}, objArr);
        memberArr[0] = Class.forName(((String) objArr[0]).intern()).getDeclaredField("component2");
        int i4 = component1 + 107;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
