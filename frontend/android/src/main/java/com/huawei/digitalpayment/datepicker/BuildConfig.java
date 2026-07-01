package com.huawei.digitalpayment.datepicker;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.notify;

public final class BuildConfig {
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String LIBRARY_PACKAGE_NAME;
    private static int component2;
    private static long copydefault;
    private static final byte[] $$a = {125, 44, 8, -98};
    private static final int $$b = 144;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ShareDataUIState = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, int r7, short r8) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 102
            byte[] r0 = com.huawei.digitalpayment.datepicker.BuildConfig.$$a
            int r7 = r7 * 2
            int r7 = 4 - r7
            int r8 = r8 * 4
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.datepicker.BuildConfig.$$c(short, int, short):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        int i3 = $11 + 7;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 4 / 5;
        }
        while (notifyVar.copydefault < cArr.length) {
            int i5 = $10 + 61;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = notifyVar.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.argb(0, 0, 0, 0) + 3266, 33 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (60316 - AndroidCharacter.getMirror('0')), -834797019, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (copydefault ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 1;
                    byte b5 = (byte) (b4 - 1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(688 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 34, (char) (60373 - ExpandableListView.getPackedPositionType(0L)), -1969106284, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i8 = $10 + 107;
                $11 = i8 % 128;
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
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr4 = {notifyVar, notifyVar};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault3 == null) {
                byte b6 = (byte) 1;
                byte b7 = (byte) (b6 - 1);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.keyCodeFromString("") + 687, View.resolveSize(0, 0) + 34, (char) (60373 - Color.alpha(0)), -1969106284, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    static {
        component2 = 1;
        copydefault();
        Object[] objArr = new Object[1];
        a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 42852, new char[]{24318, 63895, 4154, 43164, 50017, 6673, 45730, 52521, 26064, 48249, 55105, 28590, 34376, 57051, 31090, 36866, 10412, 17220, 39927, 12931, 19712, 58809, 15446, 21728, 61329, 1646, 24251, 63835, 4581, 43145, 49979, 7119, 45662, 51955, 26002, 48160}, objArr);
        LIBRARY_PACKAGE_NAME = ((String) objArr[0]).intern();
        int i = ShareDataUIState + 7;
        component2 = i % 128;
        int i2 = i % 2;
    }

    static void copydefault() {
        copydefault = -8920879908166050121L;
    }
}
