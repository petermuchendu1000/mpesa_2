package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class GetPinTokenViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static int ShareDataUIState;
    private static char component1;
    static GetPinTokenViewModel component2;
    private static long copydefault;
    private static int getAsAtTimestamp;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {87, -2, Ascii.VT, -41};
    private static final int $$b = 37;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component3 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, byte r8) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 1
            byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.GetPinTokenViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r8 = 99 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L25
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r3 = r0[r7]
        L25:
            int r8 = r8 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.GetPinTokenViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, int, byte):java.lang.String");
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
        while (iNotificationSideChannel.copydefault < length3) {
            int i6 = $11 + 59;
            $10 = i6 % 128;
            int i7 = i6 % i3;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int iMakeMeasureSpec = 4037 - View.MeasureSpec.makeMeasureSpec(i5, i5);
                    int doubleTapTimeout = 31 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    char cIndexOf = (char) (19181 - TextUtils.indexOf("", ""));
                    byte b2 = (byte) i5;
                    byte b3 = b2;
                    String str$$c = $$c(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i5] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iMakeMeasureSpec, doubleTapTimeout, cIndexOf, 1912513118, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        int iBlue = 7567 - Color.blue(i5);
                        int i8 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10;
                        char cResolveSizeAndState = (char) View.resolveSizeAndState(i5, i5, i5);
                        Class[] clsArr2 = new Class[1];
                        clsArr2[i5] = Object.class;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iBlue, i8, cResolveSizeAndState, 2006389106, false, "e", clsArr2);
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    int i9 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                    try {
                        Object[] objArr4 = new Object[3];
                        objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                        objArr4[1] = Integer.valueOf(i9);
                        objArr4[i5] = iNotificationSideChannel;
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) i5;
                            byte b5 = b4;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', i5, i5) + 2460, 28 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) KeyEvent.getDeadChar(i5, i5), 931716605, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                            if (objCopydefault4 == null) {
                                i2 = 2;
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 11 - TextUtils.indexOf("", ""), (char) (Process.myTid() >> 22), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                            } else {
                                i2 = 2;
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = iNotificationSideChannel.component3;
                            cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (copydefault ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) ShareDataUIState) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component1) ^ (-3780477796495014671L)))));
                            iNotificationSideChannel.copydefault++;
                            int i10 = $10 + 25;
                            $11 = i10 % 128;
                            int i11 = i10 % 2;
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
        getAsAtTimestamp = 1;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(new char[]{47305, 11322, 28271, 4560, 39163, 4699, 10118, 49776, 3436, 48853, 64939, 12548, 29573, 27181, 45805, 51385, 7652, 60992, 19871, 6491, 50001, 56820, 28822, 54531, 45658, 44654, 60157, 52459, 10240, 36673, 48156, 64637, 35266, 45210, 24959, 27102, 31619, 47953, 48060, 33447, 34443, 9599, 22102, 4972, 41387, 54390, 59370, 8285, 62269, 46432, 18450, 6313, 17723, 42404, 45370, 32339, 23815, 11952, 1089, 2818, 31592, 38650, 17635, 21814, 16482, 55671, 13088, 27279, 30552, 51310, 26025, 7408, 10369, 52649, 59912, 54572, 33361, 18151, 7053, 55284, 53027, 41080}, new char[]{12758, 11327, 55379, 40348}, (char) (40152 - (KeyEvent.getMaxKeyCode() >> 16)), ViewConfiguration.getScrollBarFadeDuration() >> 16, new char[]{27693, 25939, 19166, 22341}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component3 + 57;
        getAsAtTimestamp = i % 128;
        if (i % 2 == 0) {
            int i2 = 83 / 0;
        }
    }

    static void ShareDataUIState() {
        copydefault = -7148266322089301796L;
        ShareDataUIState = 1386857713;
        component1 = (char) 50417;
    }
}
