package com.huawei.digitalpayment.common.theme.viewmodel;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class ThemeViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static char ShareDataUIState;
    private static char component1;
    private static char component2;
    static ThemeViewModel component3;
    private static char copydefault;
    private static int getAsAtTimestamp;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {74, 75, -50, -9};
    private static final int $$b = 218;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component4 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, byte r7, byte r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.common.theme.viewmodel.ThemeViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r6 = r6 * 4
            int r6 = r6 + 111
            int r7 = r7 * 3
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.viewmodel.ThemeViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(short, byte, byte):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i4 = $10 + 27;
            $11 = i4 % 128;
            int i5 = 58224;
            if (i4 % i2 == 0) {
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3];
                int i6 = iNotificationSideChannelDefault.component3;
                cArr3[0] = cArr[0];
            } else {
                cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            }
            int i7 = 0;
            while (i7 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                int i8 = (c3 + i5) ^ ((c3 << 4) + ((char) (((long) component2) ^ 4374495167426960553L)));
                int i9 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(component1);
                    objArr2[i2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(844 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 32, (char) (23250 - TextUtils.lastIndexOf("", '0', 0)), 592652048, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) ShareDataUIState) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(copydefault)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(844 - TextUtils.getCapsMode("", 0, 0), 33 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 23250), 592652048, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i7++;
                    i2 = 2;
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
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionType(0L) + 465, (ViewConfiguration.getLongPressTimeout() >> 16) + 49, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            int i10 = $10 + 3;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            i2 = 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        getAsAtTimestamp = 1;
        component3();
        Object[] objArr = new Object[1];
        a(63 - ExpandableListView.getPackedPositionType(0L), new char[]{26031, 57047, 20959, 666, 52149, 22623, 25587, 27299, 42050, 39508, 34231, 28941, 40321, 30512, 51561, 49740, 56362, 43542, 12134, 11362, 36015, 24517, 55943, 58638, 28019, 49990, 26031, 57047, 23992, 10850, 10846, 24251, 38437, 39861, 16036, 12546, 31970, 30113, 48653, 33417, 23462, 53392, 19953, 39955, 21010, 17857, 34304, 40047, 42770, 13891, 16036, 12546, 31970, 30113, 48266, 37680, 51718, 12826, 16074, 64476, 58440, 56506, 29399, 5264}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component4 + 95;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    static void component3() {
        ShareDataUIState = (char) 64977;
        copydefault = (char) 548;
        component2 = (char) 49204;
        component1 = (char) 60710;
    }
}
