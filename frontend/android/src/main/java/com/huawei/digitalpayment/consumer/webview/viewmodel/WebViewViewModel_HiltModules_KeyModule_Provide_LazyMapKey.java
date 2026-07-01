package com.huawei.digitalpayment.consumer.webview.viewmodel;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class WebViewViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static long ShareDataUIState;
    private static int component1;
    private static char component2;
    private static int copy;
    static WebViewViewModel copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {118, 33, 67, 92};
    private static final int $$b = 2;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component3 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r5, byte r6, int r7) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.webview.viewmodel.WebViewViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r6 = r6 * 4
            int r6 = 4 - r6
            int r7 = 99 - r7
            int r5 = r5 * 2
            int r1 = r5 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r5
            r4 = r6
            r3 = r2
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L21:
            r4 = r0[r6]
            int r3 = r3 + 1
        L25:
            int r6 = r6 + 1
            int r7 = r7 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.webview.viewmodel.WebViewViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(short, byte, int):java.lang.String");
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
        int i5 = $10 + 71;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (iNotificationSideChannel.copydefault < length3) {
            int i7 = $10 + 113;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int gidForName = 4036 - Process.getGidForName("");
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 31;
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 19182);
                    byte b2 = (byte) ($$b - i2);
                    byte b3 = b2;
                    String str$$c = $$c(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(gidForName, scrollBarSize, cLastIndexOf, 1912513118, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        int i9 = 7567 - (TypedValue.complexToFloat(i4) > 0.0f ? 1 : (TypedValue.complexToFloat(i4) == 0.0f ? 0 : -1));
                        int windowTouchSlop = 11 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        char c3 = (char) ((ExpandableListView.getPackedPositionForChild(i4, i4) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i4, i4) == 0L ? 0 : -1)) + 1);
                        Class[] clsArr2 = new Class[1];
                        clsArr2[i4] = Object.class;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i9, windowTouchSlop, c3, 2006389106, false, "e", clsArr2);
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    int i10 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                    try {
                        Object[] objArr4 = new Object[3];
                        objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                        objArr4[1] = Integer.valueOf(i10);
                        objArr4[i4] = iNotificationSideChannel;
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) ($$b - 2);
                            byte b5 = b4;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2458, View.resolveSize(i4, i4) + 28, (char) Color.red(i4), 931716605, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                            if (objCopydefault4 == null) {
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - KeyEvent.normalizeMetaState(0), 11 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = iNotificationSideChannel.component3;
                            cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (ShareDataUIState ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component1) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component2) ^ (-3780477796495014671L)))));
                            iNotificationSideChannel.copydefault++;
                            int i11 = $11 + 111;
                            $10 = i11 % 128;
                            int i12 = i11 % 2;
                            i2 = 2;
                            i4 = 0;
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
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static {
        copy = 1;
        component3();
        Object[] objArr = new Object[1];
        a(new char[]{35934, 51032, 15830, 49625, 46399, 56286, 10115, 7586, 2810, 41166, 65064, 37728, 12444, 29962, 768, 8439, 49437, 27567, 53087, 15356, 33572, 29869, 13321, 53078, 57196, 42559, 46034, 30155, 1516, 7018, 21480, 59669, 51397, 57196, 63690, 40657, 34630, 57103, 15529, 3919, 13838, 39574, 12231, 18606, 52245, 32091, 43889, 48553, 61854, 1093, 24543, 50819, 53496, 45425, 26380, 11131, 56936, 38285, 28288, 25509, 48823, 6437, 53875, 18925, 34105, 35380, 22028, 15400, 54357}, new char[]{37823, 54742, 30255, 36687}, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 20341), 802543251 - ExpandableListView.getPackedPositionGroup(0L), new char[]{0, 0, 0, 0}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component3 + 11;
        copy = i % 128;
        int i2 = i % 2;
    }

    static void component3() {
        ShareDataUIState = -3780477796495014671L;
        component1 = 1386857713;
        component2 = (char) 60743;
    }
}
