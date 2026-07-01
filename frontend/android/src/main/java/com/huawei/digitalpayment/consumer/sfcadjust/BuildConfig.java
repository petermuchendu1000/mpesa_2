package com.huawei.digitalpayment.consumer.sfcadjust;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getSmallIconId;

public final class BuildConfig {
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String LIBRARY_PACKAGE_NAME;
    private static short[] ShareDataUIState;
    private static int component1;
    private static byte[] component2;
    private static int component3;
    private static int copydefault;
    private static int equals;
    private static final byte[] $$a = {9, 8, 112, 107};
    private static final int $$b = 227;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getAsAtTimestamp = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, byte r7, short r8) {
        /*
            int r6 = r6 * 4
            int r0 = 1 - r6
            int r8 = r8 * 2
            int r8 = 4 - r8
            int r7 = r7 + 112
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcadjust.BuildConfig.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r3 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2b:
            int r7 = -r7
            int r3 = r3 + 1
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcadjust.BuildConfig.$$c(short, byte, short):java.lang.String");
    }

    private static void a(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        long j;
        int i4;
        int i5 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(component3)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            long j2 = 0;
            if (objCopydefault == null) {
                byte b3 = (byte) 0;
                byte b4 = (byte) (b3 + 1);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 998, (ViewConfiguration.getPressedStateDuration() >> 16) + 31, (char) (61685 - Color.red(0)), 1874745193, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                z = true;
            } else {
                int i6 = $11 + 99;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                z = false;
            }
            if (z) {
                byte[] bArr = component2;
                if (bArr != null) {
                    int i8 = $11 + 99;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i10 = 0;
                    while (i10 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                        if (objCopydefault2 == null) {
                            int iBlue = Color.blue(0) + 2984;
                            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(j2) + 48;
                            char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 54462);
                            byte length2 = (byte) $$a.length;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iBlue, packedPositionGroup, deadChar, -1178636483, false, $$c((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i10] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                        i10++;
                        j2 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = component2;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(component1)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault3 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(998 - MotionEvent.axisFromString(""), (ViewConfiguration.getEdgeSlop() >> 16) + 31, (char) (Color.rgb(0, 0, 0) + 16838901), 1874745193, false, $$c(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) component3) ^ 7083766810336261929L)));
                    j = 7083766810336261929L;
                } else {
                    j = 7083766810336261929L;
                    iIntValue = (short) (((short) (((long) ShareDataUIState[i + ((int) (((long) component1) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) component3) ^ 7083766810336261929L)));
                }
            } else {
                j = 7083766810336261929L;
            }
            if (iIntValue > 0) {
                int i11 = ((i + iIntValue) - 2) + ((int) (((long) component1) ^ j));
                if (!z) {
                    int i12 = $10 + 61;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    i4 = 0;
                } else {
                    int i14 = $10 + 35;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    i4 = 1;
                }
                getsmalliconid.copydefault = i11 + i4;
                Object[] objArr5 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(copydefault), sb};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1697 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 38, (char) ((-1) - Process.getGidForName("")), -1454191902, false, $$c(b7, b8, b8), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = component2;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    for (int i16 = 0; i16 < length3; i16++) {
                        bArr5[i16] = (byte) (((long) bArr4[i16]) ^ 7083766810336261929L);
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    if (!z2) {
                        short[] sArr = ShareDataUIState;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        byte[] bArr6 = component2;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
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
        equals = 1;
        component2();
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 2001386661, (-19) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (short) (64 - TextUtils.indexOf("", "", 0)), (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1803606680 - TextUtils.getCapsMode("", 0, 0), objArr);
        LIBRARY_PACKAGE_NAME = ((String) objArr[0]).intern();
        int i = getAsAtTimestamp + 125;
        equals = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component2() {
        component1 = -2038314099;
        component3 = -238323910;
        copydefault = 1706316514;
        component2 = new byte[]{TarHeader.LF_NORMAL, -24, -105, -30, -17, -22, -105, -108, -102, 44, 85, -28, -111, -111, -21, -20, -106, -27, -36, 83, -17, -32, -111, -99, -15, -104, -19, -30, -124, -30, -21, -105, -20, -33, -84, -19, -121, -1, -123, -28, -45, -88, -105, -27};
    }
}
