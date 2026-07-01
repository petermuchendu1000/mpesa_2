package com.huawei.digitalpayment.consumer.profile;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
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
    private static char[] ShareDataUIState;
    private static long component2;
    private static int component3;
    private static final byte[] $$a = {80, -19, -87, -22};
    private static final int $$b = 162;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 1;

    private static String $$c(int i, byte b2, short s) {
        int i2 = s * 4;
        int i3 = (i * 4) + 4;
        byte[] bArr = $$a;
        int i4 = b2 + 117;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3++;
            i4 = i3 + (-i4);
        }
        while (true) {
            int i6 = i4;
            int i7 = i3;
            i5++;
            bArr2[i5] = (byte) i6;
            if (i5 == i2) {
                return new String(bArr2, 0);
            }
            i3 = i7 + 1;
            i4 = i6 + (-bArr[i7]);
        }
    }

    private static void a(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i4 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(ShareDataUIState[i + i4])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    int iResolveSizeAndState = 1758 - View.resolveSizeAndState(0, 0, 0);
                    int i5 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 34;
                    char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                    byte length = (byte) $$a.length;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iResolveSizeAndState, i5, cIndexOf, 1159210934, false, $$c((byte) 0, length, (byte) (length - 4)), new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(component2), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(ImageFormat.getBitsPerPixel(0) + 3609, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29, (char) (ExpandableListView.getPackedPositionType(0L) + 7171), 1951385784, false, $$c(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {cancelnotification, cancelnotification};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 + 5);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4013 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24, (char) (27809 - AndroidCharacter.getMirror('0')), -1529629956, false, $$c(b4, b5, (byte) (b5 - 5)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
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
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr5 = {cancelnotification, cancelnotification};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault4 == null) {
                byte b6 = (byte) 0;
                byte b7 = (byte) (b6 + 5);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(4013 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 24, (char) ((Process.myPid() >> 22) + 27761), -1529629956, false, $$c(b6, b7, (byte) (b7 - 5)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
            int i6 = $11 + 5;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }
        String str = new String(cArr);
        int i8 = $11 + 83;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    static {
        component3 = 0;
        component3();
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf("", ""), (-16777174) - Color.rgb(0, 0, 0), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), objArr);
        LIBRARY_PACKAGE_NAME = ((String) objArr[0]).intern();
        int i = component1 + 63;
        component3 = i % 128;
        int i2 = i % 2;
    }

    static void component3() {
        ShareDataUIState = new char[]{3093, 25634, 56429, 13545, 44274, 1316, 32117, 54684, 19915, 42508, 7702, 30363, 61147, 18158, 48933, 6007, 36775, 59377, 22560, 45174, 10387, 32972, 63745, 20821, 51594, 8603, 39403, 61984, 27244, 49834, 15081, 37694, 2931, 25503, 56206, 19479, 42056, 7326, 29906, 60642, 17698, 48480};
        component2 = 7340651752529683533L;
    }
}
