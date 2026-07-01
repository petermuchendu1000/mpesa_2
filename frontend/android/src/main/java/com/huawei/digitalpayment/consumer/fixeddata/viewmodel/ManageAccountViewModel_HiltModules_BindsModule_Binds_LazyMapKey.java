package com.huawei.digitalpayment.consumer.fixeddata.viewmodel;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getSmallIconId;

public final class ManageAccountViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static byte[] ShareDataUIState;
    private static int component1;
    static ManageAccountViewModel component2;
    private static int component3;
    private static int component4;
    private static short[] copy;
    private static int copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {66, -42, -1, 80};
    private static final int $$b = 225;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getRequestBeneficiariesState = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, int r6, int r7) {
        /*
            int r6 = r6 * 2
            int r0 = 1 - r6
            int r5 = 116 - r5
            int r7 = r7 + 4
            byte[] r1 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.ManageAccountViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r7 = r7 + 1
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            r4 = r1[r7]
            int r3 = r3 + 1
        L26:
            int r4 = -r4
            int r5 = r5 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.viewmodel.ManageAccountViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(byte, int, int):java.lang.String");
    }

    private static void a(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int length;
        byte[] bArr;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(copydefault)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            char c2 = '0';
            if (objCopydefault == null) {
                byte b3 = (byte) 3;
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.keyCodeFromString("") + 999, 30 - TextUtils.lastIndexOf("", '0'), (char) (61686 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 1874745193, false, $$c(b3, (byte) (b3 - 3), $$a[2]), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i8 = $10 + 119;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr2 = ShareDataUIState;
                if (bArr2 != null) {
                    int i10 = $10 + 31;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i5 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i5 = 0;
                    }
                    while (i5 < length) {
                        int i11 = $11 + 119;
                        $10 = i11 % 128;
                        int i12 = i11 % i6;
                        Object[] objArr3 = {Integer.valueOf(bArr2[i5])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                        if (objCopydefault2 == null) {
                            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 2984;
                            int iIndexOf = TextUtils.indexOf("", c2) + 49;
                            char cRed = (char) (54462 - Color.red(0));
                            byte b4 = $$a[i6];
                            byte b5 = (byte) (b4 + 1);
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(maxKeyCode, iIndexOf, cRed, -1178636483, false, $$c(b5, b5, b4), new Class[]{Integer.TYPE});
                        }
                        bArr[i5] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                        i5++;
                        i6 = 2;
                        c2 = '0';
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = ShareDataUIState;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(component1)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) 3;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(999 - TextUtils.indexOf("", "", 0), TextUtils.lastIndexOf("", '0') + 32, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 61684), 1874745193, false, $$c(b6, (byte) (b6 - 3), $$a[2]), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) copydefault) ^ 7083766810336261929L)));
                } else {
                    iIntValue = (short) (((short) (((long) copy[i + ((int) (((long) component1) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) copydefault) ^ 7083766810336261929L)));
                }
            }
            if (iIntValue > 0) {
                int i13 = $10;
                int i14 = i13 + 123;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                int i16 = ((i + iIntValue) - 2) + ((int) (((long) component1) ^ 7083766810336261929L));
                if (z) {
                    int i17 = i13 + 83;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                getsmalliconid.copydefault = i16 + i4;
                Object[] objArr5 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(component3), sb};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault4 == null) {
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 1697;
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 37;
                    char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                    byte length2 = (byte) $$a.length;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iResolveOpacity, scrollBarSize, cIndexOf, -1454191902, false, $$c(length2, (byte) (length2 - 4), r9[2]), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = ShareDataUIState;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    int i19 = $10 + 77;
                    $11 = i19 % 128;
                    int i20 = i19 % 2;
                    for (int i21 = 0; i21 < length3; i21++) {
                        bArr5[i21] = (byte) (((long) bArr4[i21]) ^ 7083766810336261929L);
                    }
                    int i22 = $11 + 111;
                    $10 = i22 % 128;
                    int i23 = i22 % 2;
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = ShareDataUIState;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = copy;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
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
        component4 = 0;
        component2();
        Object[] objArr = new Object[1];
        a(917749507 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (-103) - KeyEvent.getDeadChar(0, 0), (short) (View.resolveSize(0, 0) - 119), (byte) View.combineMeasuredStates(0, 0), View.MeasureSpec.getMode(0) - 800813952, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = getRequestBeneficiariesState + 39;
        component4 = i % 128;
        int i2 = i % 2;
    }

    static void component2() {
        component1 = 948385751;
        copydefault = -238323889;
        component3 = -563084086;
        ShareDataUIState = new byte[]{-50, 87, 81, 69, -80, 100, -96, 90, -93, 112, 84, 89, 84, -86, 94, -80, 122, 92, 84, 67, -83, -94, -65, Ascii.DLE, 87, 81, 69, 80, 68, -96, 90, 67, -106, 109, 77, -93, 93, 94, 95, 77, -81, 83, -122, Ascii.SUB, -83, 70, 70, 80, 85, 95, -86, -123, Ascii.CAN, 84, -87, 70, 66, -90, 65, 82, -85, 77, -85, 80, 92, 85, -124, Ascii.NAK, 82, 76, -92, 74, -83, -104, 17, 92, -86};
    }
}
