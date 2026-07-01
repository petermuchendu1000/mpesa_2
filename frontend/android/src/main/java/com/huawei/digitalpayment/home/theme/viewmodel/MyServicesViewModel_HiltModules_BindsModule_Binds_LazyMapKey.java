package com.huawei.digitalpayment.home.theme.viewmodel;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.primitives.SignedBytes;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class MyServicesViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static int ShareDataUIState;
    private static char component1;
    private static int component2;
    private static long component3;
    static MyServicesViewModel copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {SignedBytes.MAX_POWER_OF_TWO, -61, 76, -90};
    private static final int $$b = 229;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component4 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, byte r7, int r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.home.theme.viewmodel.MyServicesViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r8 = r8 * 2
            int r1 = r8 + 1
            int r6 = r6 * 2
            int r6 = 3 - r6
            int r7 = 99 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.theme.viewmodel.MyServicesViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(byte, byte, int):java.lang.String");
    }

    private static void a(char[] cArr, char[] cArr2, char c2, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        int i5 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        int i6 = $11 + 83;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (iNotificationSideChannel.copydefault < length3) {
            int i8 = $11 + 105;
            $10 = i8 % 128;
            int i9 = i8 % i3;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int iRed = 4037 - Color.red(i5);
                    int keyRepeatDelay = 31 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    char c3 = (char) (19182 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    byte b2 = (byte) i5;
                    byte b3 = b2;
                    String str$$c = $$c(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i5] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iRed, keyRepeatDelay, c3, 1912513118, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        int keyRepeatTimeout = 7567 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int i10 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10;
                        char cRgb = (char) ((-16777216) - Color.rgb(i5, i5, i5));
                        Class[] clsArr2 = new Class[1];
                        clsArr2[i5] = Object.class;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatTimeout, i10, cRgb, 2006389106, false, "e", clsArr2);
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    int i11 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                    try {
                        Object[] objArr4 = new Object[3];
                        objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                        objArr4[1] = Integer.valueOf(i11);
                        objArr4[i5] = iNotificationSideChannel;
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) i5;
                            byte b5 = (byte) (b4 + 1);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2459 - TextUtils.indexOf("", "", i5, i5), MotionEvent.axisFromString("") + 29, (char) Color.blue(i5), 931716605, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                            if (objCopydefault4 == null) {
                                i2 = 2;
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - (ViewConfiguration.getTapTimeout() >> 16), 11 - Color.alpha(0), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                            } else {
                                i2 = 2;
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = iNotificationSideChannel.component3;
                            cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component3 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component2) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component1) ^ (-3780477796495014671L)))));
                            iNotificationSideChannel.copydefault++;
                            i3 = i2;
                            i5 = 0;
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
        ShareDataUIState = 0;
        component3();
        Object[] objArr = new Object[1];
        a(new char[]{46074, 28177, 48143, 17186, 10550, 48113, 31100, 26132, 47059, 47526, 61615, 1097, 55694, 25341, 13918, 30441, 49700, 28047, 8812, 26962, 44179, 10368, 64287, 58826, 3635, 7926, 13506, 14696, 30009, 29602, 7883, 32564, 31442, 16729, 36115, 17833, 4831, 35274, 42446, 29471, 37334, 6268, 47130, 8505, 20067, 21058, 33278, 19619, 5818, 62627, 7242, 19107, 57495, 53648, 63882, 41977, 1107, 12386, 1555, 54990, 43877, 14702, 443, 52028, 62911, 57702}, new char[]{17606, 60018, 36224, 59414}, (char) (5773 - View.resolveSizeAndState(0, 0, 0)), View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{28888, 1781, 11474, 22087}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component4 + 83;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            int i2 = 65 / 0;
        }
    }

    static void component3() {
        component3 = -7075674347744218071L;
        component2 = 1386857713;
        component1 = (char) 50417;
    }
}
