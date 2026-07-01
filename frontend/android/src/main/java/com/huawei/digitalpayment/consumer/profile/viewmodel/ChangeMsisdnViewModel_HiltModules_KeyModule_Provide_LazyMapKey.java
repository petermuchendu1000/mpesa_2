package com.huawei.digitalpayment.consumer.profile.viewmodel;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getSmallIconId;

public final class ChangeMsisdnViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static byte[] ShareDataUIState;
    static ChangeMsisdnViewModel component1;
    private static int component2;
    private static int component3;
    private static int copy;
    private static int copydefault;
    private static short[] getAsAtTimestamp;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {66, 42, 112, 97};
    private static final int $$b = 93;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getRequestBeneficiariesState = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r7, byte r8, byte r9) {
        /*
            int r8 = r8 + 112
            int r9 = r9 * 2
            int r9 = r9 + 1
            int r7 = r7 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.profile.viewmodel.ChangeMsisdnViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r7
            r3 = r9
            r5 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r6
        L28:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profile.viewmodel.ChangeMsisdnViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(byte, byte, byte):java.lang.String");
    }

    private static void a(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4;
        char c2;
        int length;
        byte[] bArr;
        int i5;
        int length2;
        byte[] bArr2;
        int i6;
        int i7 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(component2)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            int i8 = -1;
            if (objCopydefault == null) {
                byte b3 = (byte) (-1);
                byte b4 = (byte) (-b3);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionType(0L) + 999, 31 - (Process.myTid() >> 22), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 61685), 1874745193, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                int i9 = $11;
                int i10 = i9 + 103;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                byte[] bArr3 = ShareDataUIState;
                if (bArr3 != null) {
                    int i12 = i9 + 117;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        length2 = bArr3.length;
                        bArr2 = new byte[length2];
                        i6 = 1;
                    } else {
                        length2 = bArr3.length;
                        bArr2 = new byte[length2];
                        i6 = 0;
                    }
                    while (i6 < length2) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr3[i6])};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault2 == null) {
                                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 2984;
                                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 48;
                                char size = (char) (54462 - View.MeasureSpec.getSize(0));
                                byte b5 = (byte) i8;
                                byte length3 = (byte) $$a.length;
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(windowTouchSlop, doubleTapTimeout, size, -1178636483, false, $$c(b5, length3, (byte) (length3 - 4)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i6] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                            i6++;
                            i8 = -1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr3 = bArr2;
                }
                if (bArr3 != null) {
                    int i13 = $10 + 101;
                    $11 = i13 % 128;
                    if (i13 % 2 == 0) {
                        byte[] bArr4 = ShareDataUIState;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(component3)};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                        if (objCopydefault3 == null) {
                            byte b6 = (byte) (-1);
                            byte b7 = (byte) (-b6);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 999, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 31, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 61685), 1874745193, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (((long) bArr4[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) & 7083766810336261929L)) * ((int) (((long) component2) % 7083766810336261929L));
                    } else {
                        byte[] bArr5 = ShareDataUIState;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(component3)};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                        if (objCopydefault4 == null) {
                            byte b8 = (byte) (-1);
                            byte b9 = (byte) (-b8);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 998, Color.red(0) + 31, (char) (TextUtils.lastIndexOf("", '0') + 61686), 1874745193, false, $$c(b8, b9, (byte) (b9 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (((long) bArr5[((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) component2) ^ 7083766810336261929L));
                    }
                    iIntValue = (byte) i5;
                } else {
                    iIntValue = (short) (((short) (((long) getAsAtTimestamp[i + ((int) (((long) component3) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) component2) ^ 7083766810336261929L)));
                    int i14 = $11 + 43;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                }
            }
            if (iIntValue > 0) {
                int i16 = $11;
                int i17 = i16 + 81;
                $10 = i17 % 128;
                int i18 = i17 % 2;
                int i19 = ((i + iIntValue) - 2) + ((int) (((long) component3) ^ 7083766810336261929L));
                if (z) {
                    i4 = 1;
                } else {
                    int i20 = i16 + 45;
                    $10 = i20 % 128;
                    int i21 = i20 % 2;
                    i4 = 0;
                }
                getsmalliconid.copydefault = i19 + i4;
                Object[] objArr6 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(copydefault), sb};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault5 == null) {
                    byte b10 = (byte) (-1);
                    byte b11 = (byte) (b10 + 1);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1745 - AndroidCharacter.getMirror('0'), 37 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1454191902, false, $$c(b10, b11, b11), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault5).invoke(null, objArr6)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr6 = ShareDataUIState;
                if (bArr6 != null) {
                    int i22 = $11 + 31;
                    $10 = i22 % 128;
                    if (i22 % 2 != 0) {
                        length = bArr6.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr6.length;
                        bArr = new byte[length];
                    }
                    for (int i23 = 0; i23 < length; i23++) {
                        bArr[i23] = (byte) (((long) bArr6[i23]) ^ 7083766810336261929L);
                    }
                    bArr6 = bArr;
                }
                boolean z2 = bArr6 != null;
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    if (z2) {
                        int i24 = $10 + 5;
                        $11 = i24 % 128;
                        if (i24 % 2 == 0) {
                            byte[] bArr7 = ShareDataUIState;
                            getsmalliconid.copydefault = getsmalliconid.copydefault % 0;
                            c2 = (char) (getsmalliconid.component3 >>> (((byte) (((byte) (((long) bArr7[r8]) + 7083766810336261929L)) >> s)) ^ b2));
                        } else {
                            byte[] bArr8 = ShareDataUIState;
                            getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                            c2 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr8[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                        }
                        getsmalliconid.component1 = c2;
                    } else {
                        short[] sArr = getAsAtTimestamp;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                    }
                    sb.append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    getsmalliconid.component2++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static {
        copy = 1;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(1149121024 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-68) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (short) KeyEvent.getDeadChar(0, 0), (byte) ((ViewConfiguration.getEdgeSlop() >> 16) - 123), TextUtils.lastIndexOf("", '0') - 170918615, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = getRequestBeneficiariesState + 123;
        copy = i % 128;
        int i2 = i % 2;
    }

    static void ShareDataUIState() {
        component3 = 1246411049;
        component2 = -238323862;
        copydefault = -67406830;
        ShareDataUIState = new byte[]{46, -85, -83, 89, -114, 122, -66, 80, -65, 68, -90, 93, -90, 90, -118, 68, 82, 85, -95, 85, -119, -71, 110, -85, -83, 89, -82, 90, -66, 80, 95, -28, 101, 85, -81, -81, 91, 81, -82, -18, Ascii.DLE, -95, 84, 84, -82, -87, 83, -96, -103, Ascii.SYN, -86, -91, 84, 88, -76, 93, -88, -89, 65, -89, -82, 82, -87, -102, 105, -88, 66, -70, SignedBytes.MAX_POWER_OF_TWO, -95, -106, 109, 82, -96};
    }
}
