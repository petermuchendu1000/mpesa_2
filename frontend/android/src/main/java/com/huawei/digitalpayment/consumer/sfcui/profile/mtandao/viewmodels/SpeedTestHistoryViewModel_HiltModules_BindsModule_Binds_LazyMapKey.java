package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.text.Typography;

public final class SpeedTestHistoryViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static char ShareDataUIState;
    private static char component1;
    static SpeedTestHistoryViewModel component2;
    private static char component3;
    private static char copydefault;
    private static int getRequestBeneficiariesState;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {70, 83, 77, 1};
    private static final int $$b = 80;
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
    private static java.lang.String $$c(int r5, int r6, short r7) {
        /*
            int r5 = r5 * 2
            int r0 = r5 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestHistoryViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r6 = r6 * 3
            int r6 = r6 + 111
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            r4 = r1[r7]
            int r3 = r3 + 1
        L26:
            int r7 = r7 + 1
            int r4 = -r4
            int r6 = r6 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestHistoryViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, int, short):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i5 = $11 + 9;
            $10 = i5 % 128;
            int i6 = i5 % i3;
            cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i7 = 58224;
            int i8 = 0;
            while (i8 < 16) {
                int i9 = $11 + 91;
                $10 = i9 % 128;
                int i10 = i9 % i3;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                int i11 = (c3 + i7) ^ ((c3 << 4) + ((char) (((long) component3) ^ 4374495167426960553L)));
                int i12 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(component1);
                    objArr2[i3] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) ($$a[3] - 1);
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 843, TextUtils.lastIndexOf("", '0', 0) + 33, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 23251), 592652048, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) ShareDataUIState) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(copydefault)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 844;
                        int iBlue = 32 - Color.blue(0);
                        char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 23251);
                        byte b4 = (byte) ($$a[3] - 1);
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(maximumDrawingCacheSize, iBlue, offsetBefore, 592652048, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
                    i3 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[iNotificationSideChannelDefault.component3] = cArr3[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr3[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                i2 = 2;
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(466 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), View.getDefaultSize(0, 0) + 49, (char) ExpandableListView.getPackedPositionGroup(0L), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            } else {
                i2 = 2;
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            i3 = i2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        getRequestBeneficiariesState = 1;
        component3();
        Object[] objArr = new Object[1];
        a(92 - MotionEvent.axisFromString(""), new char[]{44724, 29382, 42289, 28656, 51085, 36024, 34020, 62777, 38397, 47334, 11766, 20637, 39960, 29489, 10118, 8462, 20330, 11211, 20017, 35561, 3791, 47403, 33507, 39595, 47414, 28083, 44724, 29382, 26540, Typography.euro, 51793, 13490, 41818, 48014, 51112, 22730, 17651, 51921, 10747, 44005, 14032, 23516, 47868, 31854, 9470, 4964, 34651, 25558, 59415, 38674, 53265, 16018, 43620, 62581, 26687, 56637, 36267, 3882, 38778, 16217, 19614, 39884, 26809, 51167, 44659, 23291, 27646, 64077, 12832, 14537, 33801, 15585, 57989, 30739, 20763, 23796, 20606, 16321, 12105, 17662, 13536, 51019, 13190, 20684, 5690, 7756, 7522, 47564, 22270, 40736, 6011, 45108, 31316, 6586}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component4 + 27;
        getRequestBeneficiariesState = i % 128;
        int i2 = i % 2;
    }

    static void component3() {
        ShareDataUIState = (char) 50404;
        copydefault = (char) 1840;
        component3 = (char) 52279;
        component1 = (char) 16204;
    }
}
