package com.huawei.digitalpayment.consumer.subsui;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
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
    private static int ShareDataUIState;
    private static int component2;
    private static char component3;
    private static long copydefault;
    private static final byte[] $$a = {8, -40, 43, -43};
    private static final int $$b = 186;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r7, short r8, byte r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.subsui.BuildConfig.$$a
            int r7 = 99 - r7
            int r9 = r9 * 3
            int r9 = r9 + 1
            int r8 = r8 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L27
        L12:
            r3 = r2
        L13:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L27:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.subsui.BuildConfig.$$c(short, short, byte):java.lang.String");
    }

    private static void a(char[] cArr, char[] cArr2, char c2, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        while (iNotificationSideChannel.copydefault < length3) {
            int i5 = $10 + 111;
            $11 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 4037;
                    int iBlue = 31 - Color.blue(i4);
                    char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(i4, i4) + 19181);
                    byte b2 = (byte) i4;
                    byte b3 = (byte) (b2 - 1);
                    String str$$c = $$c(b2, b3, (byte) (b3 + 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(packedPositionGroup, iBlue, cMakeMeasureSpec, 1912513118, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    int i7 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7566;
                    int maxKeyCode = 11 - (KeyEvent.getMaxKeyCode() >> 16);
                    char c3 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(i4, i4) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i4, i4) == 0L ? 0 : -1)));
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i4] = Object.class;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i7, maxKeyCode, c3, 2006389106, false, "e", clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                int i8 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i8);
                objArr4[i4] = iNotificationSideChannel;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 1;
                    byte b5 = (byte) (-b4);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2459, ExpandableListView.getPackedPositionChild(0L) + 29, (char) ((-1) - TextUtils.lastIndexOf("", '0', i4)), 931716605, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 11 - TextUtils.getOffsetBefore("", 0), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (copydefault ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component2) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component3) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                int i9 = $11 + 71;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                i2 = 2;
                i4 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static {
        ShareDataUIState = 1;
        component1();
        Object[] objArr = new Object[1];
        a(new char[]{18802, 7779, 19005, 53733, 36860, 23216, 21692, 38734, 60373, 62794, 42285, 19813, 36747, 12839, 18773, 31554, 19273, 47994, 28562, 31943, 20826, 57474, 3310, 37934, 9541, 30512, 20684, 42811, 60280, 55912, 4110, 28013, 5762, 10754, 12665, 57275, 53873, 8018, 10203, 21053, 46763}, new char[]{9552, 63172, 55950, 1254}, (char) (59098 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (-1896430555) - (ViewConfiguration.getKeyRepeatDelay() >> 16), new char[]{21840, 50402, 10096, 55537}, objArr);
        LIBRARY_PACKAGE_NAME = ((String) objArr[0]).intern();
        int i = component1 + 45;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    static void component1() {
        copydefault = 1402919703613772193L;
        component2 = 1386857713;
        component3 = (char) 50417;
    }
}
