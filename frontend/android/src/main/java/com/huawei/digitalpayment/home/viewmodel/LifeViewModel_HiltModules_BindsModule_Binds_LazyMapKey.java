package com.huawei.digitalpayment.home.viewmodel;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getSmallIconId;
import kotlin.io.encoding.Base64;

public final class LifeViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static int ShareDataUIState;
    private static int component1;
    private static int component2;
    private static byte[] component3;
    static LifeViewModel copydefault;
    private static int equals;
    private static short[] getAsAtTimestamp;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {74, 75, -50, -9};
    private static final int $$b = 86;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getRequestBeneficiariesState = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r7, int r8, int r9) {
        /*
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r9 = r9 * 3
            int r9 = 1 - r9
            byte[] r0 = com.huawei.digitalpayment.home.viewmodel.LifeViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r8 = 116 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r5 = r2
            r8 = r7
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            int r7 = r7 + 1
            if (r5 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.viewmodel.LifeViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(int, int, int):java.lang.String");
    }

    private static void a(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(component1)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                byte b3 = (byte) 0;
                byte b4 = (byte) (b3 + 3);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(999 - (ViewConfiguration.getLongPressTimeout() >> 16), 31 - Color.blue(0), (char) (61685 - TextUtils.getTrimmedLength("")), 1874745193, false, $$c(b3, b4, (byte) (b4 - 3)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (!(!z)) {
                byte[] bArr = component3;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i6 = 0; i6 < length; i6++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                        if (objCopydefault2 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2984 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getLongPressTimeout() >> 16) + 48, (char) (54461 - MotionEvent.axisFromString("")), -1178636483, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
                        }
                        bArr2[i6] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = component3;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(component2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 + 3);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(((byte) KeyEvent.getModifierMetaStateMask()) + 1000, 31 - KeyEvent.keyCodeFromString(""), (char) (61686 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 1874745193, false, $$c(b7, b8, (byte) (b8 - 3)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) component1) ^ 7083766810336261929L)));
                } else {
                    iIntValue = (short) (((short) (((long) getAsAtTimestamp[i + ((int) (((long) component2) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) component1) ^ 7083766810336261929L)));
                }
            }
            if (iIntValue > 0) {
                int i7 = ((i + iIntValue) - 2) + ((int) (((long) component2) ^ 7083766810336261929L));
                if (z) {
                    int i8 = $11 + 87;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                getsmalliconid.copydefault = i7 + i4;
                Object[] objArr5 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(ShareDataUIState), sb};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault4 == null) {
                    int maximumFlingVelocity = 1697 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int i10 = 37 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                    byte length2 = (byte) $$a.length;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(maximumFlingVelocity, i10, cNormalizeMetaState, -1454191902, false, $$c((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = component3;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    int i11 = 0;
                    while (i11 < length3) {
                        int i12 = $10 + 95;
                        int i13 = i12 % 128;
                        $11 = i13;
                        int i14 = i12 % 2;
                        bArr5[i11] = (byte) (((long) bArr4[i11]) ^ 7083766810336261929L);
                        i11++;
                        int i15 = i13 + 55;
                        $10 = i15 % 128;
                        int i16 = i15 % 2;
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    int i17 = $10 + 89;
                    $11 = i17 % 128;
                    if (i17 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (!z2) {
                        short[] sArr = getAsAtTimestamp;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        byte[] bArr6 = component3;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                    }
                    sb.append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    getsmalliconid.component2++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static {
        equals = 0;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a((-1305774415) - KeyEvent.keyCodeFromString(""), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 23, (short) (86 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (byte) ((-111) - TextUtils.getOffsetAfter("", 0)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2100768493, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = getRequestBeneficiariesState + 89;
        equals = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void ShareDataUIState() {
        component2 = -1138753946;
        component1 = -238323905;
        ShareDataUIState = 1929619039;
        component3 = new byte[]{9, 104, Ascii.DC2, 38, 119, -37, 7, TarHeader.LF_LINK, 4, 34, TarHeader.LF_NORMAL, 62, Ascii.RS, 19, -41, 104, Ascii.DC2, 38, Ascii.ETB, 59, 7, TarHeader.LF_LINK, 36, -83, 42, Base64.padSymbol, TarHeader.LF_CHR, 104, 127, -1, 107, 106, Base64.padSymbol, 57, Ascii.GS, 34, 105, 108, Ascii.SO, 108, Ascii.ETB, TarHeader.LF_CHR, Ascii.SYN, 123, -42, 105, 3, Ascii.ESC, 1, 110, 127, -46, TarHeader.LF_CHR, 97};
    }
}
