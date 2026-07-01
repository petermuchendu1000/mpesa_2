package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;

public final class ActiveConsumerViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static long ShareDataUIState;
    private static int component2;
    static ActiveConsumerViewModel copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {101, 74, 115, 66};
    private static final int $$b = 81;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, byte r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.ActiveConsumerViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r6 = r6 * 3
            int r6 = r6 + 4
            int r8 = r8 * 4
            int r8 = 103 - r8
            int r7 = r7 * 4
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L19
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.ActiveConsumerViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, int, byte):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(ShareDataUIState ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        int i3 = $10 + 83;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i5 = $11 + 63;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i7 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(ShareDataUIState)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> 16) + 7032, 33 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (63440 - ExpandableListView.getPackedPositionType(0L)), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1390 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 18 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 51269), -1883291598, false, $$c(b2, b3, b3), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArrComponent2, 4, cArrComponent2.length - 4);
    }

    static {
        component2 = 1;
        component1();
        Object[] objArr = new Object[1];
        a(1 - (Process.myPid() >> 22), new char[]{470, 437, 28841, 20223, 33014, 39538, 64745, 8439, 63834, 31127, 62913, 10634, 61563, 32407, 61154, 13925, 60179, 26237, 59265, 16209, 57895, 28506, 57476, 1064, 56795, 21567, 55413, 3331, 54522, 23872, 53599, 2590, 53124, 17145, 51757, 4856, 50835, 19412, 49994, 7125, 49597, 45221, 48361, 57523, 47475, 47537, 46536, 59796, 45174, 48799, 44774, 63095, 43779, 42609, 42941, 65370, 41526, 44887, 41090, 50275, 40408, 37927, 39033, 52518, 38119, 40197, 37212, 51728, 36858, 33448, 35333, 54010, 34438, 35787, 33558, 56280, 33181, 61649, 31970, 41138, 31055, 63927, 30157, 43415, 28752, 65183, 28369, 46718, 27439, 59005, 26548, 48968, 25122}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component1 + 27;
        component2 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component1() {
        ShareDataUIState = 2438880910705365672L;
    }
}
