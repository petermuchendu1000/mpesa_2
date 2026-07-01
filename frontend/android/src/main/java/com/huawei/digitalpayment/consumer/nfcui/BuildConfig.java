package com.huawei.digitalpayment.consumer.nfcui;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelNotification;

public final class BuildConfig {
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String LIBRARY_PACKAGE_NAME;
    private static long ShareDataUIState;
    private static char[] component1;
    private static int component3;
    private static final byte[] $$a = {TarHeader.LF_SYMLINK, -82, -81, 124};
    private static final int $$b = 108;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r5, int r6, short r7) {
        /*
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r5 = 122 - r5
            int r6 = r6 * 2
            int r0 = r6 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.nfcui.BuildConfig.$$a
            byte[] r0 = new byte[r0]
            r2 = -1
            if (r1 != 0) goto L14
            r3 = r2
            r2 = r7
            goto L2b
        L14:
            r4 = r7
            r7 = r5
            r5 = r4
        L17:
            int r2 = r2 + 1
            byte r3 = (byte) r7
            r0[r2] = r3
            if (r2 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            return r5
        L25:
            r3 = r1[r5]
            r4 = r2
            r2 = r5
            r5 = r3
            r3 = r4
        L2b:
            int r5 = -r5
            int r7 = r7 + r5
            int r5 = r2 + 1
            r2 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.nfcui.BuildConfig.$$c(int, int, short):java.lang.String");
    }

    private static void a(int i, int i2, char c2, Object[] objArr) throws Throwable {
        long j;
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (true) {
            j = 0;
            if (cancelnotification.copydefault >= i2) {
                break;
            }
            int i4 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(component1[i + i4])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) 1;
                    byte b3 = (byte) (b2 - 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1758 - (ViewConfiguration.getPressedStateDuration() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 33, (char) Color.argb(0, 0, 0, 0), 1159210934, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(ShareDataUIState), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 5;
                        byte b5 = (byte) (b4 - 5);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getDoubleTapTimeout() >> 16) + 3608, (ViewConfiguration.getFadingEdgeLength() >> 16) + 29, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 7171), 1951385784, false, $$c(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {cancelnotification, cancelnotification};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                        if (objCopydefault3 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4013, ((Process.getThreadPriority(0) + 20) >> 6) + 24, (char) (27761 - Color.blue(0)), -1529629956, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        int i5 = $10 + 73;
                        $11 = i5 % 128;
                        int i6 = i5 % 2;
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
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        char[] cArr = new char[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i7 = $10 + 99;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            try {
                Object[] objArr5 = {cancelnotification, cancelnotification};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(4014 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)), 25 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), (char) (27761 - (ViewConfiguration.getFadingEdgeLength() >> 16)), -1529629956, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                j = 0;
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr);
    }

    static {
        component3 = 0;
        component1();
        Object[] objArr = new Object[1];
        a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 40, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), objArr);
        LIBRARY_PACKAGE_NAME = ((String) objArr[0]).intern();
        int i = component2 + 75;
        component3 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component1() {
        component1 = new char[]{3093, 22518, 48069, 8085, 25506, 51112, 11149, 36744, 54123, 14200, 39694, 65367, 17195, 42802, 2829, 28419, 45799, 5829, 31432, 57002, 8867, 34432, 60057, 20065, 37482, 62991, 23123, 48684, 572, 26134, 51713, 11754, 29171, 54731, 14822, 40373, 57740, 17822, 43385, 3446};
        ShareDataUIState = 6294033821006714777L;
    }
}
