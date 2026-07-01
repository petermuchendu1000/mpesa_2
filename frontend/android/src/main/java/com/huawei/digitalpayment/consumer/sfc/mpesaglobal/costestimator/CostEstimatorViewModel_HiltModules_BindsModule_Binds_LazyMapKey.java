package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getActiveNotifications;

public final class CostEstimatorViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    static CostEstimatorViewModel ShareDataUIState;
    private static int[] component1;
    private static int component2;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {113, 66, TarHeader.LF_CHR, 67};
    private static final int $$b = 169;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component3 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r7, short r8, int r9) {
        /*
            int r9 = r9 * 4
            int r9 = r9 + 4
            int r8 = r8 * 4
            int r8 = 1 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r7 = r7 + 104
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r5 = r2
            goto L27
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L27:
            int r9 = -r9
            int r3 = r3 + 1
            int r7 = r7 + r9
            r9 = r3
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(short, short, int):java.lang.String");
    }

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        int[] iArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = component1;
        int i4 = 684241640;
        int i5 = 1;
        int i6 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i6] = Integer.valueOf(iArr3[i7]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i2;
                        byte b3 = (byte) (b2 - 2);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", i6, i6) + 4391, 37 - TextUtils.indexOf("", "", i6), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), -309236339, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr4[i7] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i7++;
                    i2 = 2;
                    i4 = 684241640;
                    i6 = 0;
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
            int i8 = 0;
            while (i8 < length3) {
                int i9 = $11 + 49;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                Object[] objArr3 = new Object[i5];
                objArr3[0] = Integer.valueOf(iArr6[i8]);
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 2;
                    byte b5 = (byte) (b4 - 2);
                    iArr2 = iArr6;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 4391, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 37, (char) (KeyEvent.getMaxKeyCode() >> 16), -309236339, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                } else {
                    iArr2 = iArr6;
                }
                iArr7[i8] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                i8++;
                iArr6 = iArr2;
                i5 = 1;
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
            int i11 = 0;
            for (int i12 = 16; i11 < i12; i12 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr5[i11];
                Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2968 - (ViewConfiguration.getTapTimeout() >> 16), Color.green(0) + 16, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 49872), 462826032, false, $$c(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i11++;
                int i13 = $11 + 89;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 3 / 4;
                }
            }
            int i15 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i15;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i16 = getactivenotifications.ShareDataUIState;
            int i17 = getactivenotifications.component2;
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
                byte b8 = (byte) 3;
                byte b9 = (byte) (b8 - 3);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2944 - TextUtils.indexOf("", ""), (ViewConfiguration.getScrollBarSize() >> 8) + 24, (char) (27637 - Color.argb(0, 0, 0, 0)), -1616366948, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
            c2 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i18 = $10 + 113;
        $11 = i18 % 128;
        if (i18 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        objArr[0] = str;
    }

    static {
        component2 = 1;
        component1();
        Object[] objArr = new Object[1];
        a(86 - Process.getGidForName(""), new int[]{1948769490, -1439033408, 322721768, 244644179, -1235705742, 639552495, 953444816, -2036913477, -1774731553, 1528823232, -1079061682, -70144405, -1319914052, 1178246471, 1954625128, 724887321, -647054242, -536129488, 1533602004, -1690974548, 2126628881, -751805607, -574120043, -606264872, 439008258, 1212798331, 1108062045, -321476271, -1299809892, -1063219178, -1557303277, 830800885, -1673511207, 2006717879, -1727467729, -539180027, -1032711069, -712442185, -1945448112, 152927404, -667837592, 797551448, 1965461368, 1293245233}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component3 + 23;
        component2 = i % 128;
        int i2 = i % 2;
    }

    static void component1() {
        component1 = new int[]{-642601177, -539159720, 1705765432, 1268656890, 621754140, 1912319924, -863693496, -1489210755, -887615722, -582975466, -559758889, -1875649148, 305174685, -1734561286, -125582715, -414953455, 1243661103, 1263744096};
    }
}
