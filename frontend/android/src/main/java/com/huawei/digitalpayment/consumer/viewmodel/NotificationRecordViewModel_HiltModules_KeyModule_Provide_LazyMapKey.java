package com.huawei.digitalpayment.consumer.viewmodel;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class NotificationRecordViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static char ShareDataUIState;
    private static char component1;
    static NotificationRecordViewModel component2;
    private static char component3;
    private static int component4;
    private static char copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {106, 40, -98, -117};
    private static final int $$b = 128;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int equals = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, short r7, byte r8) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 1
            byte[] r0 = com.huawei.digitalpayment.consumer.viewmodel.NotificationRecordViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r8 = r8 * 2
            int r8 = 111 - r8
            int r7 = r7 * 2
            int r7 = 3 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2c
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r7 = r7 + r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.viewmodel.NotificationRecordViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(int, short, byte):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        int i4 = $10 + 73;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            cArr3[i3] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $10 + 23;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[i3];
                int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (((long) copydefault) ^ 4374495167426960553L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(ShareDataUIState);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int i12 = 844 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 32;
                        char packedPositionGroup = (char) (23251 - ExpandableListView.getPackedPositionGroup(0L));
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        String str$$c = $$c(b2, b3, b3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i12, keyRepeatDelay, packedPositionGroup, 592652048, false, str$$c, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) component3) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component1)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(844 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 32 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (23252 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 592652048, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    int i13 = $11 + 51;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
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
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionChild(0L) + 466, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 49, (char) KeyEvent.getDeadChar(0, 0), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        component4 = 1;
        copydefault();
        Object[] objArr = new Object[1];
        a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 71, new char[]{49113, 25000, 4247, 27691, 5180, 37020, 58330, 21039, 59255, 16708, 15216, 55380, 34088, 36303, 46834, 1147, 19198, 9760, 29443, 5959, 37973, 30596, 18928, 61504, 51043, 44147, 49113, 25000, 3611, 44681, 60198, 19008, 50829, 2066, 40158, 41102, 38392, 54886, 34862, 338, 50607, 56365, 987, 55382, 33202, 30033, 27587, 46445, 35300, 14707, 13229, 29612, 20725, 60638, 2371, 32461, 35066, 28467, 2577, 15709, 55217, 27074, 8666, 10049, 38392, 54886, 51045, 19560, 50607, 56365, 987, 55382}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = equals + 97;
        component4 = i % 128;
        if (i % 2 == 0) {
            int i2 = 36 / 0;
        }
    }

    static void copydefault() {
        component3 = (char) 58975;
        component1 = (char) 36027;
        copydefault = (char) 40748;
        ShareDataUIState = (char) 32391;
    }
}
