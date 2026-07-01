package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout;

import android.media.AudioTrack;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;

public final class RoamingCashOutViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static long ShareDataUIState;
    static RoamingCashOutViewModel component1;
    private static int component3;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {94, -53, Ascii.FS, -60};
    private static final int $$b = 92;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, int r7, int r8) {
        /*
            int r7 = r7 * 3
            int r0 = 1 - r7
            int r8 = r8 * 2
            int r8 = 103 - r8
            int r6 = r6 * 2
            int r6 = 4 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r8 = -r8
            int r8 = r8 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(byte, int, int):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(ShareDataUIState ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $11 + 99;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(ShareDataUIState)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarSize() >> 8) + 7032, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 34, (char) (63440 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1390 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 17 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 51269), -1883291598, false, $$c(b2, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i6 = $11 + 87;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrComponent2, 4, cArrComponent2.length - 4);
    }

    static {
        component3 = 1;
        component3();
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getWindowTouchSlop() >> 8, new char[]{64630, 64533, 23030, 7896, 54326, 18150, 30503, 40676, 17353, 23516, 8039, 35299, 22562, 54240, 37003, 23148, 52471, 10470, 52676, 58740, 6135, 28117, 2789, 8281, 23255, 41692, 18424, 27486, 40402, 59271, 64742, 46663, 57552, 15570, 14840, 61773, 11219, 28971, 30427, 15275, 28328, 46642, 46035, 18109, 45494, 2860, 59542, 33193, 62649, 16429, 9602, 52386, 16311, 34069, 25339, 6028, 33436, 55824, 40883, 21123, 50567, 7946, 54449, 40321, 2193, 21519, 4542, 55502, 21380, 43382, 20308, 25589, 38503, 61055, 33882, 44787, 55655, 9082, 49485, 59879, 7275, 30837, 32259, 13522, 26489, 48472, 47992, 32721, 43584, 62038, 61534, 47825, 60757, 14145, 11594, 50653, 12362, 35959, 27236, 197, 31553, 49812, 42778, 19260, 48683, 1981}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component2 + 31;
        component3 = i % 128;
        if (i % 2 == 0) {
            int i2 = 25 / 0;
        }
    }

    static void component3() {
        ShareDataUIState = -7140843461207981521L;
    }
}
