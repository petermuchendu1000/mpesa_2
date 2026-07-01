package com.huawei.digitalpayment.consumer.schedule.viewmodel;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.text.Typography;

public final class CreateAutomaticPaymentViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static char ShareDataUIState;
    private static char component1;
    static CreateAutomaticPaymentViewModel component2;
    private static char component3;
    private static char copydefault;
    private static int getRequestBeneficiariesState;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {78, -86, -128, -128};
    private static final int $$b = 236;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int equals = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, byte r7, short r8) {
        /*
            int r8 = r8 * 4
            int r8 = 3 - r8
            int r7 = r7 * 2
            int r0 = r7 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.schedule.viewmodel.CreateAutomaticPaymentViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r6 = r6 * 3
            int r6 = r6 + 111
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L30
        L16:
            r3 = r2
        L17:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.schedule.viewmodel.CreateAutomaticPaymentViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(byte, byte, short):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        int i4 = $10 + 21;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            cArr3[i3] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 39;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[i3];
                char[] cArr4 = cArr3;
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i6) ^ ((c3 << 4) + ((char) (((long) component3) ^ 4374495167426960553L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(copydefault)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(845 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 31 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (View.combineMeasuredStates(0, 0) + 23251), 592652048, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) component1) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(ShareDataUIState)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(843 - Process.getGidForName(""), TextUtils.indexOf((CharSequence) "", '0', 0) + 33, (char) (23251 - Color.green(0)), 592652048, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[iNotificationSideChannelDefault.component3] = cArr5[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr5[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getPressedStateDuration() >> 16) + 465, 49 - Color.green(0), (char) TextUtils.getTrimmedLength(""), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        getRequestBeneficiariesState = 0;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(85 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{12480, 48256, 51534, 32367, 35352, 45129, 10817, Typography.rightSingleQuote, 9436, 43058, 46464, 44850, 43842, 40352, 49627, 30703, 25664, 47318, 62491, 5742, 15058, 47207, 64835, 37486, 13222, 39262, 12480, 48256, 17157, 43754, 31087, 16450, 13538, 16094, 61773, 6897, 14803, 37277, 58055, 43139, 4992, 3483, 61505, 13472, 32220, 30528, 728, 16931, 35279, 59963, 3058, 32963, 62786, 1953, 49771, 64092, 29989, 11898, 41150, 60302, 701, 16944, 58004, 7153, 4185, 56137, 29726, 18247, 34432, 9779, 42294, 29062, 15382, 41233, 24635, 64398, 3227, 45697, 728, 16931, 5670, 27289, 3058, 32963, 17236, 1511}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = equals + 85;
        getRequestBeneficiariesState = i % 128;
        int i2 = i % 2;
    }

    static void ShareDataUIState() {
        component1 = (char) 34158;
        ShareDataUIState = (char) 55294;
        component3 = (char) 21342;
        copydefault = (char) 42523;
    }
}
