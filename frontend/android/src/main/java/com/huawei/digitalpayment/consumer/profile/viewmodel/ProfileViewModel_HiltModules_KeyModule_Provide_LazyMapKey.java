package com.huawei.digitalpayment.consumer.profile.viewmodel;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelNotification;

public final class ProfileViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static char[] ShareDataUIState;
    static ProfileViewModel component2;
    private static int component3;
    private static long copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {57, Ascii.SYN, -21, -92};
    private static final int $$b = 145;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r7, int r8, int r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.profile.viewmodel.ProfileViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r8 = 122 - r8
            int r9 = r9 + 4
            int r7 = r7 * 2
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r9
            r5 = r2
            goto L27
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            int r9 = r9 + 1
            if (r5 != r7) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L27:
            int r9 = -r9
            int r8 = r8 + r9
            r9 = r3
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profile.viewmodel.ProfileViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(int, int, int):java.lang.String");
    }

    private static void a(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i4 = $11 + 15;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = cancelnotification.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(ShareDataUIState[i / i5])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getLongPressTimeout() >> 16) + 1758, 33 - TextUtils.lastIndexOf("", '0'), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 1159210934, false, $$c(b2, b3, (byte) (-b3)), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(copydefault), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3608 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 30 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 7171), 1951385784, false, $$c(b4, (byte) (b4 + 5), (byte) (-1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {cancelnotification, cancelnotification};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                    if (objCopydefault3 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((KeyEvent.getMaxKeyCode() >> 16) + 4013, 24 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (27762 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), -1529629956, false, $$c(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
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
                int i6 = cancelnotification.copydefault;
                Object[] objArr5 = {Integer.valueOf(ShareDataUIState[i + i6])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 + 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1758 - (ViewConfiguration.getEdgeSlop() >> 16), 34 - KeyEvent.getDeadChar(0, 0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 1159210934, false, $$c(b7, b8, (byte) (-b8)), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objCopydefault4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(copydefault), Integer.valueOf(c2)};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault5 == null) {
                    byte b9 = (byte) 0;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3607, 30 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (KeyEvent.normalizeMetaState(0) + 7171), 1951385784, false, $$c(b9, (byte) (b9 + 5), (byte) (-1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objCopydefault5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {cancelnotification, cancelnotification};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault6 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(4013 - (ViewConfiguration.getLongPressTimeout() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 25, (char) (27761 - Color.green(0)), -1529629956, false, $$c(b10, b11, (byte) (b11 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr8 = {cancelnotification, cancelnotification};
            Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault7 == null) {
                byte b12 = (byte) 0;
                byte b13 = b12;
                objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4013, 24 - TextUtils.indexOf("", "", 0), (char) (27761 - KeyEvent.keyCodeFromString("")), -1529629956, false, $$c(b12, b13, (byte) (b13 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault7).invoke(null, objArr8);
            int i7 = $10 + 125;
            $11 = i7 % 128;
            int i8 = i7 % 2;
        }
        objArr[0] = new String(cArr);
    }

    static {
        component3 = 0;
        component2();
        Object[] objArr = new Object[1];
        a(((byte) KeyEvent.getModifierMetaStateMask()) + 1, (ViewConfiguration.getWindowTouchSlop() >> 8) + 69, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component1 + 113;
        component3 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component2() {
        ShareDataUIState = new char[]{3093, 15153, 25163, 43296, 53438, 8139, 18151, 36377, 46419, 64631, 11208, 21162, 39423, 49433, 2095, 14170, 32407, 42418, 60630, 7151, 17199, 35411, 45411, 63616, 10178, 28336, 38405, 56609, 1144, 13197, 31411, 41411, 59667, 4140, 24328, 34430, 52644, 62673, 9184, 27399, 37466, 55675, 200, 20408, 30463, 48667, 58673, 11331, 23449, 33466, 51651, 61666, 14456, 26478, 44660, 54657, 7376, 19447, 29450, 47659, 57664, 10391, 22435, 40665, 50747, 3377, 13378, 25451, 43706};
        copydefault = -9011085350464373922L;
    }
}
