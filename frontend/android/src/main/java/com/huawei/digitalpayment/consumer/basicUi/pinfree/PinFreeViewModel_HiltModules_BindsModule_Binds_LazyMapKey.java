package com.huawei.digitalpayment.consumer.basicUi.pinfree;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;

public final class PinFreeViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static long ShareDataUIState;
    static PinFreeViewModel component3;
    private static int copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {107, -21, -54, -113};
    private static final int $$b = 66;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, short r8) {
        /*
            int r7 = r7 * 4
            int r0 = r7 + 1
            int r6 = r6 * 2
            int r6 = r6 + 103
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r1 = com.huawei.digitalpayment.consumer.basicUi.pinfree.PinFreeViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2a:
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basicUi.pinfree.PinFreeViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, int, short):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(ShareDataUIState ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $11 + 71;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(ShareDataUIState)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 7032, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 35, (char) (63440 - View.getDefaultSize(0, 0)), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Drawable.resolveOpacity(0, 0) + 1390, Color.argb(0, 0, 0, 0) + 18, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 51268), -1883291598, false, $$c(b2, b3, b3), new Class[]{Object.class, Object.class});
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
        int i6 = $11 + 121;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    static {
        copydefault = 0;
        component1();
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf("", "", 0, 0), new char[]{32004, 734, 58101, 32103, 52379, 38841, 51336, 29613, 10572, 60291, 40100, 57300, 54561, 16383, 12427, 43943, 33037, 37841, 50412, 30615, 11749, 59194, 38933, 50018, 55773, 15131, 11296, 44877, 34224, 36664, 49222, 31532, 12682, 58181, 38000, 50958, 56417, 13476, 10699, 44257, 34885, 34949, 64940, 30912, 13329, 56575, 37259, 50355, 57357, 12504, 9699, 37009, 36065, 33843, 63819, 31827, 14541, 55320, 36099, 51281, 58529, 11379, 8563, 37930, 36993, 32833, 62792, 24588, 16224, 54707, 36489}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component2 + 95;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    static void component1() {
        ShareDataUIState = 7068362370068494745L;
    }
}
