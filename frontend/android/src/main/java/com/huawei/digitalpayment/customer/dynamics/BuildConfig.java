package com.huawei.digitalpayment.customer.dynamics;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelNotification;

public final class BuildConfig {
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String LIBRARY_PACKAGE_NAME;
    private static char[] component1;
    private static int component3;
    private static long copydefault;
    private static final byte[] $$a = {70, 83, 77, 1};
    private static final int $$b = 48;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, int r8) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 4
            int r8 = 122 - r8
            int r7 = r7 * 2
            int r0 = 1 - r7
            byte[] r1 = com.huawei.digitalpayment.customer.dynamics.BuildConfig.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r8 = r8 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.customer.dynamics.BuildConfig.$$c(int, int, int):java.lang.String");
    }

    private static void a(int i, int i2, char c2, Object[] objArr) throws Throwable {
        char c3;
        int i3 = 2;
        int i4 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (true) {
            c3 = 3;
            if (cancelnotification.copydefault >= i2) {
                break;
            }
            int i5 = $11 + 33;
            $10 = i5 % 128;
            if (i5 % i3 != 0) {
                int i6 = cancelnotification.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(component1[i >>> i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                    if (objCopydefault == null) {
                        int iResolveSizeAndState = 1758 - View.resolveSizeAndState(0, 0, 0);
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 34;
                        char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte b2 = $$a[3];
                        byte b3 = (byte) (b2 - 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iResolveSizeAndState, scrollBarSize, longPressTimeout, 1159210934, false, $$c(b3, b3, b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(copydefault), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                    if (objCopydefault2 == null) {
                        int i7 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3608;
                        int bitsPerPixel = 28 - ImageFormat.getBitsPerPixel(0);
                        char cMyTid = (char) (7171 - (Process.myTid() >> 22));
                        byte b4 = (byte) ($$a[3] - 1);
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i7, bitsPerPixel, cMyTid, 1951385784, false, $$c(b4, b5, (byte) (b5 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {cancelnotification, cancelnotification};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                    if (objCopydefault3 == null) {
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 4013;
                        int i8 = 24 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        char trimmedLength = (char) (27761 - TextUtils.getTrimmedLength(""));
                        byte b6 = (byte) ($$a[3] - 1);
                        byte b7 = b6;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(tapTimeout, i8, trimmedLength, -1529629956, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
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
                int i9 = cancelnotification.copydefault;
                Object[] objArr5 = {Integer.valueOf(component1[i + i9])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault4 == null) {
                    int i10 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1757;
                    int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 34;
                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                    byte b8 = $$a[3];
                    byte b9 = (byte) (b8 - 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i10, iIndexOf, cResolveSizeAndState, 1159210934, false, $$c(b9, b9, b8), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objCopydefault4).invoke(null, objArr5)).longValue()), Long.valueOf(i9), Long.valueOf(copydefault), Integer.valueOf(c2)};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault5 == null) {
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 3609;
                    int iIndexOf2 = TextUtils.indexOf("", "", 0) + 29;
                    char c4 = (char) (7170 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    byte b10 = (byte) ($$a[3] - 1);
                    byte b11 = b10;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf, iIndexOf2, c4, 1951385784, false, $$c(b10, b11, (byte) (b11 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i9] = ((Long) ((Method) objCopydefault5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {cancelnotification, cancelnotification};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault6 == null) {
                    int scrollBarFadeDuration = 4013 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int iLastIndexOf2 = 23 - TextUtils.lastIndexOf("", '0', 0, 0);
                    char c5 = (char) (27761 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                    byte b12 = (byte) ($$a[3] - 1);
                    byte b13 = b12;
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(scrollBarFadeDuration, iLastIndexOf2, c5, -1529629956, false, $$c(b12, b13, b13), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault6).invoke(null, objArr7);
            }
            i3 = 2;
        }
        char[] cArr = new char[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i11 = $11 + 47;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            try {
                Object[] objArr8 = {cancelnotification, cancelnotification};
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault7 == null) {
                    byte b14 = (byte) ($$a[c3] - 1);
                    byte b15 = b14;
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.makeMeasureSpec(0, 0) + 4013, 24 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (27760 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), -1529629956, false, $$c(b14, b15, b15), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault7).invoke(null, objArr8);
                c3 = 3;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        String str = new String(cArr);
        int i13 = $10 + 107;
        $11 = i13 % 128;
        int i14 = i13 % 2;
        objArr[0] = str;
    }

    static {
        component3 = 1;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, 43 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (29169 - TextUtils.getOffsetAfter("", 0)), objArr);
        LIBRARY_PACKAGE_NAME = ((String) objArr[0]).intern();
        int i = component2 + 89;
        component3 = i % 128;
        int i2 = i % 2;
    }

    static void ShareDataUIState() {
        component1 = new char[]{32228, 28376, 23434, 17465, 12591, 8706, 3782, 64416, 58466, 53598, 49737, 44787, 39854, 33936, 29006, 25123, 20198, 15323, 9367, 4470, 574, 61210, 56258, 50361, 45427, 41497, 36612, 31714, 25780, 20867, 16968, 12090, 7138, 1221, 61897, 57971, 53054, 47129, 42182, 37306, 33390, 28500, 22548};
        copydefault = -3246480716777578682L;
    }
}
