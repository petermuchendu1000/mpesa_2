package com.huawei.digitalpayment.consumer.homeui;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelNotification;

public final class BuildConfig {
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String LIBRARY_PACKAGE_NAME;
    private static long ShareDataUIState;
    private static char[] component2;
    private static int copydefault;
    private static final byte[] $$a = {9, 8, 112, 107};
    private static final int $$b = 207;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component3 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r7, short r8, short r9) {
        /*
            int r9 = r9 + 117
            byte[] r0 = com.huawei.digitalpayment.consumer.homeui.BuildConfig.$$a
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r8 = r8 * 2
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L27
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            r3 = r0[r7]
            r6 = r3
            r3 = r9
            r9 = r6
        L27:
            int r7 = r7 + 1
            int r9 = -r9
            int r9 = r9 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.homeui.BuildConfig.$$c(short, short, short):java.lang.String");
    }

    private static void a(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i5 = $10 + 107;
            $11 = i5 % 128;
            int i6 = i5 % i3;
            int i7 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(component2[i + i7])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.blue(0) + 1758, 34 - (Process.myPid() >> 22), (char) TextUtils.getCapsMode("", 0, 0), 1159210934, false, $$c(b2, b2, (byte) $$a.length), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(ShareDataUIState), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3608, ((Process.getThreadPriority(0) + 20) >> 6) + 29, (char) (7171 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 1951385784, false, $$c(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4013, 24 - (ViewConfiguration.getTapTimeout() >> 16), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 27762), -1529629956, false, $$c(b5, b6, (byte) (b6 + 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                i3 = 2;
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
        int i8 = $10 + 5;
        $11 = i8 % 128;
        int i9 = 2;
        int i10 = i8 % 2;
        while (cancelnotification.copydefault < i2) {
            int i11 = $11 + 49;
            $10 = i11 % 128;
            int i12 = i11 % i9;
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr5 = {cancelnotification, cancelnotification};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault4 == null) {
                byte b7 = (byte) 0;
                byte b8 = b7;
                i9 = 2;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4013, 24 - (ViewConfiguration.getTouchSlop() >> 8), (char) (27761 - (ViewConfiguration.getTapTimeout() >> 16)), -1529629956, false, $$c(b7, b8, (byte) (b8 + 5)), new Class[]{Object.class, Object.class});
            } else {
                i9 = 2;
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    static {
        copydefault = 1;
        component2();
        Object[] objArr = new Object[1];
        a(1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 41 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (View.getDefaultSize(0, 0) + 48287), objArr);
        LIBRARY_PACKAGE_NAME = ((String) objArr[0]).intern();
        int i = component3 + 41;
        copydefault = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void component2() {
        component2 = new char[]{45194, 46897, 49130, 42978, 44637, 38415, 40642, 34463, 36148, 62959, 64993, 58448, 60436, 54469, 56450, 49956, 52216, 13218, 14919, 8733, 10972, 4743, 6454, 502, 2485, 28696, 30748, 24779, 26755, 28449, 22510, 24493, 18028, 19980, 46729, 48772, 42298, 44535, 38310, 40061, 33816};
        ShareDataUIState = 5808275415221013441L;
    }
}
