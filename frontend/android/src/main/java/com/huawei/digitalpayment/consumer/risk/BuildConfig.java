package com.huawei.digitalpayment.consumer.risk;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class BuildConfig {
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String LIBRARY_PACKAGE_NAME;
    private static long ShareDataUIState;
    private static int component1;
    private static char component3;
    private static int copydefault;
    private static final byte[] $$a = {78, -86, -128, -128};
    private static final int $$b = 9;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, byte r7, int r8) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 1
            int r7 = r7 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.risk.BuildConfig.$$a
            int r8 = 99 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r6
            r5 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r8
            int r7 = r7 + 1
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r7]
        L24:
            int r8 = r8 + r3
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.risk.BuildConfig.$$c(short, byte, int):java.lang.String");
    }

    private static void a(char[] cArr, char[] cArr2, char c2, int i, char[] cArr3, Object[] objArr) throws Throwable {
        char c3;
        int i2 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        int i3 = $11 + 3;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (iNotificationSideChannel.copydefault < length3) {
            int i5 = $11 + 107;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4037 - (ViewConfiguration.getEdgeSlop() >> 16), 31 - (ViewConfiguration.getScrollBarSize() >> 8), (char) ((Process.myPid() >> 22) + 19181), 1912513118, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7567 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 12, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 2006389106, false, "e", new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    c3 = 3;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2458 - TextUtils.indexOf((CharSequence) "", '0', 0), Color.alpha(0) + 28, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 931716605, false, $$c(b4, b5, (byte) (-b5)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                } else {
                    c3 = 3;
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7566, 11 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) Color.argb(0, 0, 0, 0), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[iNotificationSideChannel.copydefault])) ^ (ShareDataUIState ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) copydefault) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component3) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i7 = $10 + 25;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }

    static {
        component1 = 0;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(new char[]{11895, 5691, 59744, 28553, 30978, 24171, 64137, 7874, 33796, 25321, 27571, 41742, 63569, 62667, 31772, 57172, 41375, 5027, 22530, 55162, 13389, 63900, 21425, 39138, 22569, 26322, 13981, 44316, 28779, 23435, 36584, 50728, 56857, 9653, 11665, 60830, 1389, 39942, 46874}, new char[]{63496, 29024, 50491, 61399}, (char) (55236 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 997286136 - View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{40387, 57594, 4364, 1074}, objArr);
        LIBRARY_PACKAGE_NAME = ((String) objArr[0]).intern();
        int i = component2 + 21;
        component1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void ShareDataUIState() {
        ShareDataUIState = -3478157194408273614L;
        copydefault = 1386857713;
        component3 = (char) 50417;
    }
}
