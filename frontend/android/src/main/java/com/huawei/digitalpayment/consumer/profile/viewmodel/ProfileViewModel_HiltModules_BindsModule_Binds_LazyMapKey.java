package com.huawei.digitalpayment.consumer.profile.viewmodel;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class ProfileViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static char ShareDataUIState;
    static ProfileViewModel component1;
    private static char component2;
    private static char component3;
    private static char copydefault;
    private static int getRequestBeneficiariesState;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {7, 80, 121, 38};
    private static final int $$b = 146;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copy = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r7, byte r8, short r9) {
        /*
            int r7 = r7 * 3
            int r7 = 111 - r7
            int r8 = r8 * 4
            int r8 = r8 + 1
            int r9 = r9 * 4
            int r9 = 4 - r9
            byte[] r0 = com.huawei.digitalpayment.consumer.profile.viewmodel.ProfileViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r8
            r3 = r9
            r4 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2a:
            int r9 = -r9
            int r7 = r7 + r9
            int r9 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profile.viewmodel.ProfileViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, byte, short):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            cArr3[i4] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i5 = 58224;
            int i6 = i4;
            while (i6 < 16) {
                int i7 = $11 + 119;
                $10 = i7 % 128;
                int i8 = i7 % i2;
                char c2 = cArr3[1];
                char c3 = cArr3[i4];
                int i9 = (c3 + i5) ^ ((c3 << 4) + ((char) (((long) copydefault) ^ 4374495167426960553L)));
                int i10 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(ShareDataUIState);
                    objArr2[i2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i4] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int threadPriority = ((Process.getThreadPriority(i4) + 20) >> 6) + 844;
                        int iArgb = 32 - Color.argb(i4, i4, i4, i4);
                        char cIndexOf = (char) (TextUtils.indexOf("", "") + 23251);
                        byte b2 = (byte) i4;
                        byte b3 = b2;
                        String str$$c = $$c(b2, b3, b3);
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(threadPriority, iArgb, cIndexOf, 592652048, false, str$$c, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) component2) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component3)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(844 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 33 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (23251 - TextUtils.indexOf("", "", 0, 0)), 592652048, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    cArr3 = cArr4;
                    i2 = 2;
                    i4 = 0;
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
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTapTimeout() >> 16) + 465, (ViewConfiguration.getWindowTouchSlop() >> 8) + 49, (char) (Process.myTid() >> 22), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            int i11 = $11 + 109;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            i2 = 2;
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        getRequestBeneficiariesState = 0;
        component3();
        Object[] objArr = new Object[1];
        a('u' - AndroidCharacter.getMirror('0'), new char[]{28188, 46014, 43996, 846, 48474, 25567, 31977, 24885, 58456, 45295, 38050, 26370, 9188, 15968, 23277, 30708, 47133, 3958, 1514, 19169, 51886, 49750, 30694, 43639, 63855, 14468, 28188, 46014, 55644, 2279, 32315, 18986, 32764, 24207, 16940, 56636, 4047, 26116, 48858, 50680, 6112, 51655, 64050, 32917, 38393, 10722, 63888, 37596, 32822, 19026, 1950, 52064, 19988, 4719, 4047, 26116, 48858, 50680, 6112, 51655, 2424, 60935, 226, 12044, 53608, 495, 25570, 49223, 51994, 59215}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = copy + 99;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void component3() {
        component2 = (char) 38374;
        component3 = (char) 30194;
        copydefault = (char) 58389;
        ShareDataUIState = (char) 9929;
    }
}
