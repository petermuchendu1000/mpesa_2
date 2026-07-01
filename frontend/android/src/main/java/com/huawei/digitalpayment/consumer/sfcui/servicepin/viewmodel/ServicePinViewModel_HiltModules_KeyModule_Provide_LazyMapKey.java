package com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class ServicePinViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static final byte[] $$a = {1, -53, Ascii.US, 101};
    private static final int $$b = 221;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ShareDataUIState = 0;
    private static int component1;
    static ServicePinViewModel component2;
    private static long component3;
    private static int copy;
    private static char copydefault;
    public static String lazyClassKeyName;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, int r6, int r7) {
        /*
            int r7 = r7 * 3
            int r0 = 1 - r7
            int r5 = 99 - r5
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel.ServicePinViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L17
            r3 = r6
            r5 = r7
            r4 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L25:
            r3 = r1[r6]
        L27:
            int r6 = r6 + 1
            int r3 = -r3
            int r5 = r5 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel.ServicePinViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(byte, int, int):java.lang.String");
    }

    private static void a(char[] cArr, char[] cArr2, char c2, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
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
        while (iNotificationSideChannel.copydefault < length3) {
            int i4 = $10 + 11;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int size = View.MeasureSpec.getSize(0) + 4037;
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31;
                    char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 19181);
                    byte b2 = (byte) ($$a[0] - 1);
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(size, scrollBarFadeDuration, capsMode, 1912513118, false, $$c(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollDefaultDelay() >> 16) + 7567, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 11, (char) KeyEvent.keyCodeFromString(""), 2006389106, false, "e", new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                        if (objCopydefault3 == null) {
                            int iIndexOf = 2459 - TextUtils.indexOf("", "", 0, 0);
                            int iBlue = 28 - Color.blue(0);
                            char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            byte b4 = $$a[0];
                            byte b5 = (byte) (b4 - 1);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, iBlue, keyRepeatDelay, 931716605, false, $$c(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                            if (objCopydefault4 == null) {
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getJumpTapTimeout() >> 16) + 7567, (-16777205) - Color.rgb(0, 0, 0), (char) (ViewConfiguration.getEdgeSlop() >> 16), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = iNotificationSideChannel.component3;
                            cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component3 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component1) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) copydefault) ^ (-3780477796495014671L)))));
                            iNotificationSideChannel.copydefault++;
                            i2 = 2;
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
        String str = new String(cArr6);
        int i6 = $11 + 103;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    static {
        copy = 1;
        component1();
        Object[] objArr = new Object[1];
        a(new char[]{22380, 1298, 25659, 39799, 11920, 39276, 21706, 54461, 34470, 15227, 15652, 47284, 36315, 64645, 17869, 64079, 24885, 1374, 43801, 47018, 42895, 16262, 22747, 38443, 54779, 1421, 50292, 55899, 61453, 41634, 27041, 61896, 27884, 54223, 37995, 38263, 15113, 33271, 27067, 4138, 29187, 64415, 46797, 49195, 6481, '^', 1214, 49829, 34628, 31168, 58547, 61721, 24074, 30502, 58108, 38128, 9970, 23426, 29612, 40674, 43053, 57805, 9417, 58832, 30421, 40246, 22604, 19772, 395, 4184, 16054, 513, 25002, 9396, 3004, 30788, 21553, 37394, 43599, 55144, 12581}, new char[]{7407, 55504, 24284, 65423}, (char) (View.MeasureSpec.getSize(0) + 36702), (-589770724) - (ViewConfiguration.getEdgeSlop() >> 16), new char[]{0, 0, 0, 0}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = ShareDataUIState + 63;
        copy = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component1() {
        component3 = -3780477796495014671L;
        component1 = 1386857713;
        copydefault = (char) 21176;
    }
}
