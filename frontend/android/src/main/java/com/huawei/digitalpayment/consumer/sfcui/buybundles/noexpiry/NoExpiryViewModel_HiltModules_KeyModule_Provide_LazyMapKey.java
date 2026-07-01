package com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class NoExpiryViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static char ShareDataUIState;
    private static char component1;
    private static char component2;
    private static char component3;
    static NoExpiryViewModel copydefault;
    private static int equals;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {13, 38, -109, 117};
    private static final int $$b = 161;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getAsAtTimestamp = 1;

    private static String $$c(int i, byte b2, short s) {
        int i2 = 3 - (i * 2);
        int i3 = (s * 3) + 111;
        int i4 = b2 * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i3 = (-i2) + i3;
            i2 = i2;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i3;
            int i8 = i2 + 1;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            i6 = i7;
            i3 = (-bArr[i8]) + i3;
            i2 = i8;
        }
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i5 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            cArr3[i5] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i6 = 58224;
            int i7 = i5;
            while (i7 < 16) {
                int i8 = $11 + 65;
                $10 = i8 % 128;
                int i9 = i8 % i3;
                char c2 = cArr3[1];
                char c3 = cArr3[i5];
                int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (((long) component2) ^ 4374495167426960553L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(ShareDataUIState);
                    objArr2[i3] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i5] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int capsMode = TextUtils.getCapsMode("", i5, i5) + 844;
                        int gidForName = Process.getGidForName("") + 33;
                        char c4 = (char) ((TypedValue.complexToFloat(i5) > 0.0f ? 1 : (TypedValue.complexToFloat(i5) == 0.0f ? 0 : -1)) + 23251);
                        byte b2 = (byte) i5;
                        byte b3 = b2;
                        String str$$c = $$c(b2, b3, b3);
                        Class[] clsArr = new Class[4];
                        clsArr[i5] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(capsMode, gidForName, c4, 592652048, false, str$$c, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) component3) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component1)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(843 - TextUtils.indexOf((CharSequence) "", '0'), 31 - TextUtils.lastIndexOf("", '0', 0, 0), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 23250), 592652048, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    int i12 = $10 + 37;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    cArr3 = cArr4;
                    i3 = 2;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[iNotificationSideChannelDefault.component3] = cArr5[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr5[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                i2 = 2;
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getDoubleTapTimeout() >> 16) + 465, 50 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (ViewConfiguration.getScrollBarSize() >> 8), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            } else {
                i2 = 2;
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            i3 = i2;
            cArr3 = cArr5;
            i5 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        equals = 0;
        component3();
        Object[] objArr = new Object[1];
        a(78 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new char[]{58093, 60895, 32994, 17123, 56976, 20766, 51025, 1981, 34366, 30389, 61371, 59975, 37491, 22355, 36473, 25694, 44605, 31146, 45487, 54394, 8471, 38876, 44335, 1281, 45038, 64848, 58093, 60895, 23079, 21679, 49388, 23513, 45743, 52304, 15975, 24677, 41783, 33563, 22530, 12143, 20306, 5110, 26625, 18336, 16265, 27134, 61455, 31911, 44072, 675, 4208, 16985, 21830, 16602, 3025, 179, 835, 25899, 35510, 8075, 3445, 38083, 37499, 23902, 5068, 22207, 53103, 51417, 27460, 24852, 23717, 59629, 36655, 65188, 20475, 26728, 939, 58355}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = getAsAtTimestamp + 91;
        equals = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component3() {
        component3 = (char) 55681;
        component1 = (char) 27179;
        component2 = (char) 25080;
        ShareDataUIState = (char) 13009;
    }
}
