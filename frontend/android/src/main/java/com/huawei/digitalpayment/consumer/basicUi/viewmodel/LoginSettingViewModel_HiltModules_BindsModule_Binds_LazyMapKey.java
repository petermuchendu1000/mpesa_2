package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.notify;

public final class LoginSettingViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static final byte[] $$a = {Ascii.SI, -12, 105, 108};
    private static final int $$b = 170;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ShareDataUIState = 0;
    private static int component1;
    static LoginSettingViewModel component2;
    private static long copydefault;
    public static String lazyClassKeyName;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, short r7, byte r8) {
        /*
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginSettingViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r8 = r8 * 3
            int r8 = r8 + 102
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r5 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r6]
        L26:
            int r8 = r8 + r3
            int r6 = r6 + 1
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginSettingViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(byte, short, byte):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $11 + 109;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = notifyVar.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3265, Color.green(0) + 33, (char) ((Process.myTid() >> 22) + 60268), -834797019, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (copydefault ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(687 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 34 - View.MeasureSpec.getMode(0), (char) (View.MeasureSpec.getSize(0) + 60373), -1969106284, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        int i6 = $11 + 67;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (notifyVar.copydefault < cArr.length) {
            int i8 = $10 + 9;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr4 = {notifyVar, notifyVar};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(687 - ExpandableListView.getPackedPositionType(0L), (-16777182) - Color.rgb(0, 0, 0), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 60372), -1969106284, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    static {
        component1 = 1;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a((KeyEvent.getMaxKeyCode() >> 16) + 19207, new char[]{4938, 22593, 34122, 61970, 16221, 25727, 53602, 7791, 19316, 45183, 64833, 10752, 38676, 56341, 2338, 30260, 41784, 59442, 21799, 33485, 53212, 13527, 25046, 44774, 7157, 16552, 36348, 64251, 10115, 27793, 55694, 1693, 29612, 47292, 58857, 21182, 40884, 52057, 12362, 32091, 43620, 5983, 23585, 35186, 63092, 9079, 26652, 54541, 534, 20250, 46098, 57632, 11883, 39702, 49212, 3535, 31432, 42952, 60652, 22993, 34553, 62454, 14578, 26110, 53902, 8120, 17550, 45465, 65154, 11143, 37036, 56764, 2740, 30650}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = ShareDataUIState + 107;
        component1 = i % 128;
        int i2 = i % 2;
    }

    static void ShareDataUIState() {
        copydefault = -2936667760211881213L;
    }
}
