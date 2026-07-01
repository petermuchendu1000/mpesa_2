package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelNotification;

public final class MpesaGlobalDashboardViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static int ShareDataUIState;
    private static char[] component1;
    private static long component3;
    static MpesaGlobalDashboardViewModel copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {TarHeader.LF_NORMAL, 86, 58, 71};
    private static final int $$b = 115;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, int r7, byte r8) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 1
            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard.MpesaGlobalDashboardViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r6 = r6 + 117
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            int r3 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2b:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard.MpesaGlobalDashboardViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(byte, int, byte):java.lang.String");
    }

    private static void a(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        int i5 = $10 + 47;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (cancelnotification.copydefault < i2) {
            int i7 = $10 + 73;
            $11 = i7 % 128;
            if (i7 % i3 == 0) {
                int i8 = cancelnotification.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(component1[i >> i8])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                    if (objCopydefault == null) {
                        int i9 = 1759 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                        int iMakeMeasureSpec = 34 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                        byte length = (byte) $$a.length;
                        byte b2 = (byte) (length - 4);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i9, iMakeMeasureSpec, cNormalizeMetaState, 1159210934, false, $$c(length, b2, b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(component3), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                    if (objCopydefault2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3608 - (Process.myPid() >> 22), ((Process.getThreadPriority(0) + 20) >> 6) + 29, (char) (TextUtils.indexOf("", "", 0) + 7171), 1951385784, false, $$c(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i8] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {cancelnotification, cancelnotification};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                    if (objCopydefault3 == null) {
                        byte b5 = (byte) 5;
                        byte b6 = (byte) (b5 - 5);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.blue(0) + 4013, 24 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (TextUtils.lastIndexOf("", '0') + 27762), -1529629956, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i10 = cancelnotification.copydefault;
                Object[] objArr5 = {Integer.valueOf(component1[i + i10])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault4 == null) {
                    int iLastIndexOf = 1757 - TextUtils.lastIndexOf("", '0', 0);
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 34;
                    char trimmedLength = (char) TextUtils.getTrimmedLength("");
                    byte length2 = (byte) $$a.length;
                    byte b7 = (byte) (length2 - 4);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf, deadChar, trimmedLength, 1159210934, false, $$c(length2, b7, b7), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objCopydefault4).invoke(null, objArr5)).longValue()), Long.valueOf(i10), Long.valueOf(component3), Integer.valueOf(c2)};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault5 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(3608 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 29 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (Process.getGidForName("") + 7172), 1951385784, false, $$c(b8, b9, b9), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i10] = ((Long) ((Method) objCopydefault5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {cancelnotification, cancelnotification};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault6 == null) {
                    byte b10 = (byte) 5;
                    byte b11 = (byte) (b10 - 5);
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(4013 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 25, (char) ((Process.myTid() >> 22) + 27761), -1529629956, false, $$c(b10, b11, b11), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault6).invoke(null, objArr7);
            }
            i3 = 2;
        }
        char[] cArr = new char[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr8 = {cancelnotification, cancelnotification};
            Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault7 == null) {
                byte b12 = (byte) 5;
                byte b13 = (byte) (b12 - 5);
                objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 4012, 24 - (ViewConfiguration.getScrollBarSize() >> 8), (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 27761), -1529629956, false, $$c(b12, b13, b13), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    static {
        ShareDataUIState = 1;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 90 - KeyEvent.keyCodeFromString(""), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component2 + 51;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    static void ShareDataUIState() {
        component1 = new char[]{3093, 59718, 50853, 48197, 39266, 30424, 27693, 18840, 9963, 7240, 63982, 55047, 52331, 43458, 34605, 31891, 23015, 14165, 11432, 2586, 59235, 56528, 47673, 38801, 36074, 27167, 18355, 15644, 6780, 63430, 60705, 51866, 42995, 40251, 31430, 22520, 19788, 10926, 'B', 64866, 56030, 45092, 44435, 35554, 24645, 23977, 15115, 4197, 3527, 60213, 49366, 48639, 39771, 28846, 28180, 19325, 8401, 7728, 64386, 53495, 52764, 43928, 33028, 32370, 23493, 12552, 11855, 3015, 57637, 56975, 48109, 37187, 36490, 25600, 16755, 16075, 5152, 61834, 61157, 50261, 41378, 40751, 29809, 20958, 20269, 9392, 499, 65371, 54459, 45597};
        component3 = 3922584502522145065L;
    }
}
