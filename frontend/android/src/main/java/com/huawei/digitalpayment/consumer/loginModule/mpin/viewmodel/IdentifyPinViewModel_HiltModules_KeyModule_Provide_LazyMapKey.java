package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.text.Typography;

public final class IdentifyPinViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static char ShareDataUIState;
    static IdentifyPinViewModel component1;
    private static char component2;
    private static char component3;
    private static char copydefault;
    private static int equals;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {110, -114, 93, -109};
    private static final int $$b = 124;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copy = 0;

    private static String $$c(byte b2, int i, short s) {
        int i2 = 4 - (s * 2);
        int i3 = 111 - (b2 * 3);
        byte[] bArr = $$a;
        int i4 = i * 3;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i3 += i2;
            i2++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            int i8 = i2;
            i3 += bArr[i2];
            i2 = i8 + 1;
            i6 = i7;
        }
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            cArr3[i4] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i5 = 58224;
            int i6 = i4;
            while (i6 < 16) {
                int i7 = $10 + 113;
                $11 = i7 % 128;
                int i8 = i7 % i2;
                char c2 = cArr3[1];
                char c3 = cArr3[i4];
                int i9 = (c3 + i5) ^ ((c3 << 4) + ((char) (((long) ShareDataUIState) ^ 4374495167426960553L)));
                int i10 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(component3);
                    objArr2[i2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i4] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 845;
                        int i11 = 33 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        char cResolveSizeAndState = (char) (View.resolveSizeAndState(i4, i4, i4) + 23251);
                        byte b2 = (byte) i4;
                        byte b3 = b2;
                        String str$$c = $$c(b2, b3, b3);
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(modifierMetaStateMask, i11, cResolveSizeAndState, 592652048, false, str$$c, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) copydefault) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(845 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 31 - TextUtils.lastIndexOf("", '0', 0), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23251), 592652048, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    cArr3 = cArr4;
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
            char[] cArr5 = cArr3;
            cArr2[iNotificationSideChannelDefault.component3] = cArr5[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr5[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(464 - ExpandableListView.getPackedPositionChild(0L), 48 - Process.getGidForName(""), (char) TextUtils.getCapsMode("", 0, 0), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            int i12 = $11 + 83;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr3 = cArr5;
            i2 = 2;
            i4 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i14 = $10 + 31;
        $11 = i14 % 128;
        int i15 = i14 % 2;
        objArr[0] = str;
    }

    static {
        equals = 1;
        component2();
        Object[] objArr = new Object[1];
        a(82 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{4234, 10892, 50836, 22146, 64814, 56667, 37562, 18463, 41485, 33881, 46609, 34716, 43475, 59883, 44777, 30112, 51503, 30556, 32467, 52025, 41513, 43327, 4806, 40979, 61742, Typography.paragraph, 4234, 10892, 11213, 14059, 14820, 47295, 4296, 64355, 49060, 58465, 44548, 22169, 6264, 60915, 29485, 2517, 14939, 53692, 21057, 42246, 35005, 62875, 37613, 60037, 51509, 33874, 53832, 48095, 19704, 61451, 18769, 17831, 62957, 62461, 64629, 31110, 58432, 50638, 4806, 40979, 31704, 33448, 41984, 18479, 44446, 28588, 46675, 64369, 3743, 2831, 63041, 47122, 10652, 43580, 40893, 53254}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = copy + 89;
        equals = i % 128;
        int i2 = i % 2;
    }

    static void component2() {
        copydefault = (char) 49349;
        component2 = (char) 62291;
        ShareDataUIState = (char) 20736;
        component3 = (char) 5494;
    }
}
