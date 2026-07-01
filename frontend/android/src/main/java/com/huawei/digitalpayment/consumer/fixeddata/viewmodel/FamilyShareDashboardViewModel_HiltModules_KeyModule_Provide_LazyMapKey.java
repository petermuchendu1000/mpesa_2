package com.huawei.digitalpayment.consumer.fixeddata.viewmodel;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class FamilyShareDashboardViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    static FamilyShareDashboardViewModel ShareDataUIState;
    private static int component1;
    private static long component2;
    private static char component3;
    private static int copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {102, Ascii.GS, -34, 39};
    private static final int $$b = 252;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component4 = 1;

    private static String $$c(byte b2, int i, byte b3) {
        byte[] bArr = $$a;
        int i2 = b3 * 3;
        int i3 = (b2 * 2) + 4;
        int i4 = 99 - i;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i3++;
            i4 = i3 + (-i4);
        }
        while (true) {
            int i7 = i4;
            int i8 = i3;
            i6++;
            bArr2[i6] = (byte) i7;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i3 = i8 + 1;
            i4 = i7 + (-bArr[i8]);
        }
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
            int i5 = $10 + 85;
            $11 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i4) + 4038;
                    int iIndexOf2 = 31 - TextUtils.indexOf("", "", i4);
                    char c3 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19181);
                    byte b2 = (byte) i4;
                    byte b3 = b2;
                    String str$$c = $$c(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, iIndexOf2, c3, 1912513118, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    int iResolveSizeAndState = 7567 - View.resolveSizeAndState(i4, i4, i4);
                    int i7 = 12 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    char cBlue = (char) Color.blue(i4);
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i4] = Object.class;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iResolveSizeAndState, i7, cBlue, 2006389106, false, "e", clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                int i8 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i8);
                objArr4[i4] = iNotificationSideChannel;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) i4;
                    byte b5 = (byte) (b4 + 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(ImageFormat.getBitsPerPixel(i4) + 2460, (CdmaCellLocation.convertQuartSecToDecDegrees(i4) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i4) == 0.0d ? 0 : -1)) + 28, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 931716605, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 7566, TextUtils.indexOf("", "", 0, 0) + 11, (char) TextUtils.getCapsMode("", 0, 0), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component2 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) copydefault) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component3) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
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
        String str = new String(cArr6);
        int i9 = $11 + 25;
        $10 = i9 % 128;
        if (i9 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i10 = 20 / 0;
            objArr[0] = str;
        }
    }

    static {
        component1 = 0;
        copydefault();
        Object[] objArr = new Object[1];
        a(new char[]{25786, 46411, 8795, 42996, 45646, 48644, 45342, 62032, 29308, 20504, 20510, 5948, 44666, 57996, 20324, 6814, 60764, 6170, 56994, 22697, 47006, 58572, 29250, 21495, 48187, 60602, 47781, 45311, 47049, 53667, 57108, 12869, 48926, 19400, 64841, 45824, 1547, 33253, 9390, 20025, 31299, 55659, 56896, 10613, 52044, 37057, 63779, 36295, 1235, 58669, 28417, 56785, 37862, 7050, 58084, 7004, 64357, 53516, 25046, 40644, 53253, 43256, 12915, 22312, 31302, 26399, 42546, 41673, 41780, 8406, 6405, 50098, 23962, 47558, 27910, 23092, 17941, 38525, 16113, 55896, 29781, 37732, 51728, 62872}, new char[]{35574, 43895, 5662, 39295}, (char) (32534 - (ViewConfiguration.getLongPressTimeout() >> 16)), ViewConfiguration.getScrollDefaultDelay() >> 16, new char[]{0, 0, 0, 0}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component4 + 25;
        component1 = i % 128;
        int i2 = i % 2;
    }

    static void copydefault() {
        component2 = -3780477796495014671L;
        copydefault = 1386857713;
        component3 = (char) 54568;
    }
}
