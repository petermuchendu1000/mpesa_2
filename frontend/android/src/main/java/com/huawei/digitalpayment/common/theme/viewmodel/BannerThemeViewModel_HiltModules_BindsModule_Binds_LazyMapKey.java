package com.huawei.digitalpayment.common.theme.viewmodel;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class BannerThemeViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static long ShareDataUIState;
    static BannerThemeViewModel component1;
    private static int component2;
    private static char component3;
    private static int copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {TarHeader.LF_BLK, -107, 59, -11};
    private static final int $$b = 146;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copy = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r7, byte r8, byte r9) {
        /*
            int r9 = r9 + 4
            int r8 = 99 - r8
            byte[] r0 = com.huawei.digitalpayment.common.theme.viewmodel.BannerThemeViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r7 = r7 * 3
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r5 = r2
            r9 = r7
            goto L29
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            int r9 = r9 + 1
            if (r5 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L29:
            int r8 = -r8
            int r8 = r8 + r9
            r9 = r3
            r3 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.viewmodel.BannerThemeViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(short, byte, byte):java.lang.String");
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
            int i5 = $10 + 23;
            $11 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int iCombineMeasuredStates = 4037 - View.combineMeasuredStates(i4, i4);
                    int maxKeyCode = 31 - (KeyEvent.getMaxKeyCode() >> 16);
                    char c3 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 19180);
                    byte b2 = (byte) i4;
                    byte b3 = b2;
                    String str$$c = $$c(b2, b3, (byte) (b3 - 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iCombineMeasuredStates, maxKeyCode, c3, 1912513118, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    int edgeSlop = 7567 - (ViewConfiguration.getEdgeSlop() >> 16);
                    int iMyPid = (Process.myPid() >> 22) + 11;
                    char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i4] = Object.class;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(edgeSlop, iMyPid, pressedStateDuration, 2006389106, false, "e", clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                int i7 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i7);
                objArr4[i4] = iNotificationSideChannel;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) i4;
                    byte b5 = (byte) (b4 + 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2458, 27 - TextUtils.indexOf((CharSequence) "", '0', i4, i4), (char) ((-1) - TextUtils.lastIndexOf("", '0')), 931716605, false, $$c(b4, b5, (byte) (-b5)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7566 - TextUtils.indexOf((CharSequence) "", '0'), 11 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (ShareDataUIState ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) copydefault) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component3) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                int i8 = $11 + 69;
                $10 = i8 % 128;
                int i9 = i8 % 2;
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
        component2 = 0;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(new char[]{65335, 65518, 14664, 44219, 12510, 14616, 36002, 28550, 52172, 3229, 47761, 10854, 45732, 36470, 44023, 50115, 57181, 8731, 44362, 49131, 50396, 47594, 65432, 20020, 12106, 25935, 14623, 60528, 38618, 1907, 3811, 30892, 8124, 29565, 38029, 23689, 16712, 64911, 32179, 63783, 53289, 2885, 50427, 29708, 59385, 6280, 18705, 4752, 58683, 51929, 59288, 54598, 37785, 39191, 47824, 5506, 35578, 13081, 16733, 33069, 27478, 29576, 39647, 45065, 39870, 36512, 58907, 42691, 14046}, new char[]{59515, 54212, 36074, 24477}, (char) (ExpandableListView.getPackedPositionChild(0L) + 40333), (-355220248) - TextUtils.getOffsetBefore("", 0), new char[]{49836, 48737, 51305, 44715}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = copy + 21;
        component2 = i % 128;
        int i2 = i % 2;
    }

    static void ShareDataUIState() {
        ShareDataUIState = 7287601624498308701L;
        copydefault = 1386857713;
        component3 = (char) 50417;
    }
}
