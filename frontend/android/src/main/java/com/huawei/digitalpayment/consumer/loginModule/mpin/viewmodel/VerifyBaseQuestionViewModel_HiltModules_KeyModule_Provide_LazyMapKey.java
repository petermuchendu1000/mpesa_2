package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getActiveNotifications;

public final class VerifyBaseQuestionViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    static VerifyBaseQuestionViewModel ShareDataUIState;
    private static int[] component1;
    private static int copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {105, -91, -115, Ascii.US};
    private static final int $$b = 9;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component3 = 0;

    private static String $$c(int i, short s, byte b2) {
        int i2 = 107 - b2;
        int i3 = i * 2;
        byte[] bArr = $$a;
        int i4 = 3 - (s * 4);
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2 += -i3;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            i4++;
            if (i5 == i3) {
                return new String(bArr2, 0);
            }
            i2 += -bArr[i4];
        }
    }

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        int[] iArr2;
        int i2 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = component1;
        long j = 0;
        int i3 = 684241640;
        int i4 = 1;
        int i5 = 0;
        if (iArr3 != null) {
            int i6 = $10 + 59;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i5] = Integer.valueOf(iArr3[i8]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i3);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i5;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.green(i5) + 4391, 36 - ExpandableListView.getPackedPositionChild(j), (char) TextUtils.indexOf("", "", i5, i5), -309236339, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr4[i8] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i8++;
                    int i9 = $10 + 31;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    j = 0;
                    i3 = 684241640;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = component1;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                int i12 = $10 + i4;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                Object[] objArr3 = new Object[i4];
                objArr3[0] = Integer.valueOf(iArr6[i11]);
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    iArr2 = iArr6;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4391 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getPressedStateDuration() >> 16) + 37, (char) ((-1) - Process.getGidForName("")), -309236339, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                } else {
                    iArr2 = iArr6;
                }
                iArr7[i11] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                i11++;
                iArr6 = iArr2;
                i4 = 1;
            }
            iArr6 = iArr7;
        }
        char c2 = 0;
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        getactivenotifications.component1 = 0;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[c2] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr5[i14];
                Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2967 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 16 - Color.blue(0), (char) (49871 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 462826032, false, $$c(b6, b7, (byte) (b7 + 3)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i14++;
            }
            int i16 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i16;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i17 = getactivenotifications.ShareDataUIState;
            int i18 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr5);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr5 = {getactivenotifications, getactivenotifications};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2943 - TextUtils.lastIndexOf("", '0', 0), 24 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (Process.getGidForName("") + 27638), -1616366948, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
            c2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        copydefault = 1;
        component3();
        Object[] objArr = new Object[1];
        a(89 - ExpandableListView.getPackedPositionGroup(0L), new int[]{1533323865, 95147428, -484594430, -1612456395, -1367574242, -167933148, 238725093, -1511186102, 588711101, -1779120585, 1607616949, 560103243, 1077088530, -13612560, 1773136953, -795480526, 2064634419, -1804010986, -458578893, 345215167, 919258511, -7946883, 1791739792, 1779785001, -1752398524, 879873029, -1131009262, -896666531, 365494055, 1441571829, 414020116, 1720637033, -1810623720, -1423847725, -865473238, -674302244, -1891275942, -1044958356, 408416525, -262659263, 1151644645, 611927600, -1890980538, -1390437715, -1278213591, 974352401}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component3 + 5;
        copydefault = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component3() {
        component1 = new int[]{-499783668, -1736990018, -577178944, 531157716, -1968568616, 974827446, -792688736, 1931866347, 748370954, -1539335685, 80733980, -1049977209, -664246820, -641277410, 1655678961, 948257376, 1579335252, 238228479};
    }
}
