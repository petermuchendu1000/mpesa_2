package com.huawei.digitalpayment.consumer.sfcfixeddata;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelNotification;

public final class BuildConfig {
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String LIBRARY_PACKAGE_NAME;
    private static char[] ShareDataUIState;
    private static int component3;
    private static long copydefault;
    private static final byte[] $$a = {121, -58, 81, 67};
    private static final int $$b = 3;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, short r7, byte r8) {
        /*
            int r6 = r6 * 2
            int r6 = 4 - r6
            int r7 = 122 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcfixeddata.BuildConfig.$$a
            int r8 = r8 * 2
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L29:
            int r6 = -r6
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcfixeddata.BuildConfig.$$c(byte, short, byte):java.lang.String");
    }

    private static void a(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i4 = $10 + 7;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(ShareDataUIState[i + i6])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) ($$b - 3);
                    byte b3 = (byte) (b2 + 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTouchSlop() >> 8) + 1758, (ViewConfiguration.getPressedStateDuration() >> 16) + 34, (char) (ViewConfiguration.getTouchSlop() >> 8), 1159210934, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(copydefault), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    int gidForName = Process.getGidForName("") + 3609;
                    int i7 = 30 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 7171);
                    byte b4 = (byte) ($$b - 3);
                    byte b5 = (byte) (b4 + 5);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(gidForName, i7, threadPriority, 1951385784, false, $$c(b4, b5, (byte) (b5 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    int i8 = 4013 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int i9 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23;
                    char cCombineMeasuredStates = (char) (27761 - View.combineMeasuredStates(0, 0));
                    byte b6 = (byte) ($$b - 3);
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i8, i9, cCombineMeasuredStates, -1529629956, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i10 = $11 + 27;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            try {
                Object[] objArr5 = {cancelnotification, cancelnotification};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault4 == null) {
                    int i12 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 4012;
                    int absoluteGravity = 24 - Gravity.getAbsoluteGravity(0, 0);
                    char maximumFlingVelocity = (char) (27761 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    byte b8 = (byte) ($$b - 3);
                    byte b9 = b8;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i12, absoluteGravity, maximumFlingVelocity, -1529629956, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArr);
    }

    static {
        component3 = 0;
        component2();
        Object[] objArr = new Object[1];
        a((-16777216) - Color.rgb(0, 0, 0), 47 - View.getDefaultSize(0, 0), (char) TextUtils.getOffsetAfter("", 0), objArr);
        LIBRARY_PACKAGE_NAME = ((String) objArr[0]).intern();
        int i = component2 + 113;
        component3 = i % 128;
        int i2 = i % 2;
    }

    static void component2() {
        ShareDataUIState = new char[]{3093, 27607, 50055, 15154, 37670, 2821, 25283, 55971, 12899, 43553, 596, 31176, 53687, 18791, 41307, 6416, 28919, 59572, 16506, 47197, 4119, 36861, 59303, 24474, 46930, 12102, 34553, 65187, 22160, 52819, 9767, 40425, 62931, 28042, 50436, 15663, 38120, 3283, 25732, 56445, 13374, 37869, 3038, 25480, 56191, 13108, 43795};
        copydefault = 3763935643819666360L;
    }
}
