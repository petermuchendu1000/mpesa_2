package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;

public final class IdentifyPinViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static int ShareDataUIState;
    static IdentifyPinViewModel component1;
    private static char[] copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {9, 8, 112, 107};
    private static final int $$b = 129;
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
    private static java.lang.String $$c(short r5, byte r6, byte r7) {
        /*
            int r7 = 115 - r7
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.IdentifyPinViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r5 = r5 * 4
            int r1 = r5 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r5
            r7 = r6
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
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.IdentifyPinViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(short, byte, byte):java.lang.String");
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        char[] cArr;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        byte b2 = 1;
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = copydefault;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(657 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 14 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            char[] cArr5 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i8 = $11 + 73;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == b2) {
                    int i10 = iTrustedWebActivityService_Parcel.copydefault;
                    char c3 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                    Object[] objArr3 = new Object[2];
                    objArr3[b2] = Integer.valueOf(c2);
                    objArr3[0] = Integer.valueOf(c3);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault2 == null) {
                        int iMyPid = (Process.myPid() >> 22) + 4502;
                        int modifierMetaStateMask = 35 - ((byte) KeyEvent.getModifierMetaStateMask());
                        char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 27898);
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        String str$$c = $$c(b3, b4, (byte) (b4 + 5));
                        Class[] clsArr = new Class[2];
                        clsArr[0] = Integer.TYPE;
                        clsArr[b2] = Integer.TYPE;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iMyPid, modifierMetaStateMask, bitsPerPixel, -1464227204, false, str$$c, clsArr);
                    }
                    cArr5[i10] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = iTrustedWebActivityService_Parcel.copydefault;
                    char c4 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                    try {
                        Object[] objArr4 = new Object[2];
                        objArr4[b2] = Integer.valueOf(c2);
                        objArr4[0] = Integer.valueOf(c4);
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                        if (objCopydefault3 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3580 - Color.red(0), 28 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) TextUtils.getOffsetAfter("", 0), 1180380354, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i11] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c2 = cArr5[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1859 - KeyEvent.keyCodeFromString(""), ExpandableListView.getPackedPositionChild(0L) + 35, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 80302927, false, $$c(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                int i12 = $11 + 53;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                b2 = 1;
            }
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            int i14 = $10 + 87;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr6 = new char[i4];
            System.arraycopy(cArr4, 0, cArr6, 0, i4);
            int i16 = i4 - i6;
            System.arraycopy(cArr6, 0, cArr4, i16, i6);
            System.arraycopy(cArr6, i6, cArr4, 0, i16);
        }
        if (z) {
            int i17 = $10 + 15;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                cArr = new char[i4];
                i = 1;
                iTrustedWebActivityService_Parcel.copydefault = 1;
            } else {
                i = 1;
                cArr = new char[i4];
                iTrustedWebActivityService_Parcel.copydefault = 0;
            }
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr[iTrustedWebActivityService_Parcel.copydefault] = cArr4[(i4 - iTrustedWebActivityService_Parcel.copydefault) - i];
                iTrustedWebActivityService_Parcel.copydefault += i;
                i = 1;
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            int i18 = $10 + 53;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i20 = $10 + 105;
                $11 = i20 % 128;
                int i21 = i20 % 2;
                cArr4[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr4[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static {
        ShareDataUIState = 1;
        component3();
        Object[] objArr = new Object[1];
        a(new int[]{0, 82, 0, 3}, false, new byte[]{0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component3 + 91;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component3() {
        copydefault = new char[]{33517, 33467, 33463, 33464, 33462, 33457, 33426, 33428, 33457, 33460, 33459, 33457, 33464, 33428, 33430, 33465, 33463, 33463, 33457, 33461, 33465, 33457, 33463, 33458, 33452, 33462, 33462, 33454, 33422, 33431, 33462, 33457, 33455, 33451, 33454, 33462, 33460, 33423, 33426, 33458, 33460, 33463, 33460, 33410, 33409, 33462, 33459, 33455, 33463, 33430, 33426, 33457, 33459, 33460, 33425, 33421, 33456, 33464, 33457, 33453, 33457, 33462, 33467, 33463, 33426, 33508, 33417, 33467, 33462, 33454, 33457, 33464, 33456, 33467, 33411, 33460, 33469, 33408, 33464, 33457, 33469, 33409};
    }
}
