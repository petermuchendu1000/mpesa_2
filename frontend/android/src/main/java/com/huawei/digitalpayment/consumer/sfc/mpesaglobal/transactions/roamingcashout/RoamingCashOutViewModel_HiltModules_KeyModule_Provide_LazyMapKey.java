package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout;

import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.notify;

public final class RoamingCashOutViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    static RoamingCashOutViewModel component1;
    private static int component2;
    private static long component3;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {84, 79, Ascii.SYN, 41};
    private static final int $$b = 41;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copydefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r5, short r6, int r7) {
        /*
            int r6 = r6 * 3
            int r0 = r6 + 1
            int r5 = r5 * 3
            int r5 = 105 - r5
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r5
            r5 = r6
            r3 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
        L27:
            int r7 = r7 + 1
            int r5 = r5 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(int, short, int):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $11 + 73;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = notifyVar.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    int i6 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3266;
                    int i7 = 34 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 60268);
                    byte b2 = (byte) ($$b & 7);
                    byte b3 = (byte) (b2 - 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i6, i7, capsMode, -834797019, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (component3 ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionChild(0L) + 688, (ViewConfiguration.getJumpTapTimeout() >> 16) + 34, (char) (60374 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), -1969106284, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i8 = $11 + 33;
                $10 = i8 % 128;
                int i9 = i8 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i10 = $11 + 19;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
                Object[] objArr4 = {notifyVar, notifyVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionChild(0L) + 688, 34 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 60373), -1969106284, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                int i11 = 51 / 0;
            } else {
                cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
                try {
                    Object[] objArr5 = {notifyVar, notifyVar};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(((Process.getThreadPriority(0) + 20) >> 6) + 687, 34 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (MotionEvent.axisFromString("") + 60374), -1969106284, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
        }
        String str = new String(cArr2);
        int i12 = $11 + 33;
        $10 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    static {
        component2 = 0;
        component1();
        Object[] objArr = new Object[1];
        a(14369 - View.MeasureSpec.getSize(0), new char[]{24912, 22909, 4380, 51582, 33247, 31203, 12692, 59811, 41054, 39027, 20567, 2108, 49366, 47353, 28820, 10408, 58178, 56174, 37649, 19233, 990, 64491, 45952, 27562, 8799, 6692, 53770, 35367, 17089, 15101, 62104, 43681, 25974, 23808, 5503, 52675, 34289, 32149, 13819, 60505, 42091, 39967, 21546, 3289, 50424, 48274, 29874, 12126, 59234, 57102, 38767, 20436, 2037, 65415, 47019, 28247, 9834, 7689, 54845, 36545, 18144, 16000, 63166, 45314, 26881, 8509, 6608, 53757, 35230, 16824, 14418, 61559, 43034, 24617, 22737, 4343, 51338, 32938, 31507, 13134, 60172, 41763, 39884, 21481, 2953, 50081, 47718, 29285, 10776, 57890, 56038, 37629, 19099, 664, 64836, 46441, 27940, 9727, 7678, 54676, 36274, 17498}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = copydefault + 25;
        component2 = i % 128;
        int i2 = i % 2;
    }

    static void component1() {
        component3 = -5252258841379610343L;
    }
}
