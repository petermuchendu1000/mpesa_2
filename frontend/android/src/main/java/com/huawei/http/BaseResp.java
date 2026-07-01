package com.huawei.http;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.common.base.Ascii;
import com.google.gson.annotations.Expose;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;

public class BaseResp implements Serializable {
    private static final long serialVersionUID = 4823784496486148578L;

    @Extension
    @Expose
    private Map<String, Object> extension;
    private String responseCode;
    private String responseDesc;
    private String serverTimestamp;
    private static final byte[] $$j = {1, -128, 109, -128};
    private static final int $$k = 230;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {119, -40, Ascii.DLE, 123, 38, Ascii.CAN, Ascii.GS, Ascii.EM, Ascii.EM, 17, 35, 32, -39};
    private static final int $$h = 128;
    private static int component1 = 0;
    private static int ShareDataUIState = 1;
    private static char[] component3 = {33514, 33464, 33462, 33458, 33416, 33415, 33462, 33459, 33452, 33449, 33465, 33439, 33423, 33454, 33425, 33430, 33465, 33459, 33455, 33460, 33462, 33464, 33433, 33357, 33347, 33349, 33352, 33354, 33358, 33355, 33357, 33355, 33346, 33351, 33359, 33368, 33368, 33514, 33466, 33460, 33460, 33432, 33426, 33465, 33464, 33461, 33429, 33439, 33465, 33449, 33452, 33459, 33462, 33372, 33754, 33749, 33317, 33321, 33745, 33748, 33322, 33758, 33736, 33744, 33744, 33741, 33749, 33754, 33752};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$l(short r6, short r7, int r8) {
        /*
            byte[] r0 = com.huawei.http.BaseResp.$$j
            int r8 = r8 + 110
            int r6 = r6 * 3
            int r1 = 1 - r6
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.http.BaseResp.$$l(short, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void f(byte r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r8 = r8 * 4
            int r8 = r8 + 10
            int r9 = r9 * 4
            int r9 = r9 + 99
            byte[] r0 = com.huawei.http.BaseResp.$$g
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2c
        L17:
            r3 = r2
            r6 = r9
            r9 = r7
            r7 = r6
        L1b:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r0[r9]
        L2c:
            int r7 = r7 + r3
            int r9 = r9 + 1
            int r7 = r7 + (-26)
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.http.BaseResp.f(byte, int, short, java.lang.Object[]):void");
    }

    public BaseResp() {
    }

    public BaseResp(String str, String str2) {
        this.responseCode = str;
        this.responseDesc = str2;
    }

    public BaseResp(String str, String str2, String str3, String str4, String str5, String str6) {
        this.responseCode = str;
        this.responseDesc = str2;
    }

    public String getResponseCode() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 19;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.responseCode;
        int i5 = i2 + 89;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setResponseCode(String str) {
        int i = 2 % 2;
        int i2 = component1 + 99;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.responseCode = str;
        int i5 = i3 + 103;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getResponseDesc() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.responseDesc;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setResponseDesc(String str) {
        int i = 2 % 2;
        int i2 = component1 + 75;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.responseDesc = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void e(boolean z, int[] iArr, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        int i = 2;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = component3;
        if (cArr2 != null) {
            int i7 = $10 + 33;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 117;
                $11 = i10 % 128;
                if (i10 % i == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.keyCodeFromString("") + 657, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 14, (char) (65118 - Color.red(0)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                        }
                        cArr3[i9] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i9])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(657 - TextUtils.getCapsMode("", 0, 0), 14 - View.resolveSizeAndState(0, 0, 0), (char) (Color.red(0) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i9++;
                }
                i = 2;
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            int i11 = $11 + 11;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                cArr = new char[i4];
                iTrustedWebActivityService_Parcel.copydefault = 1;
            } else {
                cArr = new char[i4];
                iTrustedWebActivityService_Parcel.copydefault = 0;
            }
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i12 = $10 + 67;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i14 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault3 == null) {
                        int i15 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4502;
                        int gidForName = 35 - Process.getGidForName("");
                        char windowTouchSlop = (char) (27897 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                        byte b2 = $$j[0];
                        byte b3 = (byte) (b2 - 1);
                        byte b4 = (byte) (-b2);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i15, gidForName, windowTouchSlop, -1464227204, false, $$l(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i14] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                } else {
                    int i16 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr5 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault4 == null) {
                        int tapTimeout = 3580 - (ViewConfiguration.getTapTimeout() >> 16);
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 28;
                        char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                        byte b5 = $$j[0];
                        byte b6 = (byte) (b5 - 1);
                        byte b7 = (byte) (-b5);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(tapTimeout, edgeSlop, offsetBefore, 1180380354, false, $$l(b6, b7, (byte) (b7 & 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i16] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr6 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault5 == null) {
                    int deadChar = 1859 - KeyEvent.getDeadChar(0, 0);
                    int windowTouchSlop2 = 34 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    char cIndexOf = (char) TextUtils.indexOf("", "");
                    byte[] bArr2 = $$j;
                    byte b8 = bArr2[0];
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(deadChar, windowTouchSlop2, cIndexOf, 80302927, false, $$l((byte) (b8 - 1), (byte) (-b8), (byte) bArr2.length), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
                int i17 = $10 + 91;
                $11 = i17 % 128;
                int i18 = i17 % 2;
            }
            cArr4 = cArr;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr4, 0, cArr5, 0, i4);
            int i19 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr4, i19, i6);
            System.arraycopy(cArr5, i6, cArr4, 0, i19);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr4[(i4 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr4 = cArr6;
        }
        if (i5 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr4[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr4[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    public String getServerTimestamp() throws Throwable {
        int i;
        int i2 = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-609868791);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(67 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 33, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 19696), 520092524, false, "component2", null);
        }
        int i3 = ((Field) objCopydefault).getInt(null);
        Object[] objArr = new Object[1];
        e(true, new int[]{0, 22, 0, 0}, new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        e(false, new int[]{22, 15, 44, 6}, new byte[]{1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1}, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = -1;
        long j2 = j ^ 3130767699822839326L;
        long jUptimeMillis = (int) SystemClock.uptimeMillis();
        long j3 = 283;
        long j4 = j ^ 1324955396783670999L;
        long j5 = (((long) 284) * 3130767699822839326L) + (((long) (-282)) * 1324955396783670999L) + (((long) (-283)) * (((j2 | 1324955396783670999L) ^ j) | ((j2 | jUptimeMillis) ^ j))) + (((j4 | 3130767699822839326L) ^ j) * j3) + (j3 * (j ^ (jUptimeMillis | (j2 | j4))));
        int i4 = 0;
        long j6 = jLongValue;
        while (true) {
            if (i4 != 10) {
                int i5 = component1 + 125;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-148291260);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(36 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 31 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 846241313, false, "copydefault", null);
                    }
                    i = ((Field) objCopydefault2).getInt(null);
                } else {
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-148291260);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(37 - TextUtils.getTrimmedLength(""), 30 - ExpandableListView.getPackedPositionType(0L), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 846241313, false, "copydefault", null);
                    }
                    i = ((Field) objCopydefault3).getInt(null);
                }
                int i6 = 0;
                long j7 = j6;
                while (true) {
                    for (int i7 = 0; i7 != 8; i7++) {
                        i = (((((int) (j7 >> i7)) & 255) + (i << 6)) + (i << 16)) - i;
                    }
                    if (i6 != 0) {
                        break;
                    }
                    i6++;
                    j7 = j5;
                }
                if (i == i3) {
                    break;
                }
                j6 -= 1024;
                i4++;
            } else {
                Object[] objArr3 = new Object[1];
                e(false, new int[]{37, 16, 0, 0}, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                e(true, new int[]{53, 16, 161, 0}, new byte[]{0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1}, objArr4);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr5 = {1113584571};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-22556863);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getJumpTapTimeout() >> 16) + 1663, 9 - TextUtils.indexOf((CharSequence) "", '0'), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 1006506020, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -1574640472, ((Constructor) objCopydefault4).newInstance(objArr5), false};
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1259975545);
                    if (objCopydefault5 == null) {
                        int mirror = AndroidCharacter.getMirror('0') + 1406;
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 22;
                        char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        Object[] objArr7 = new Object[1];
                        f(b2, b3, b3, objArr7);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(mirror, fadingEdgeLength, cMakeMeasureSpec, 1908380642, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) ITrustedWebActivityCallbackDefault.copydefault(1591 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 39 - TextUtils.getOffsetAfter("", 0), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1)), Boolean.TYPE});
                    }
                    Object[] objArr8 = (Object[]) ((Method) objCopydefault5).invoke(null, objArr6);
                    int i8 = ((int[]) objArr8[2])[0];
                    int i9 = ((int[]) objArr8[1])[0];
                    if (i9 != i8) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr8[3];
                        if (strArr != null) {
                            int i10 = ShareDataUIState + 1;
                            component1 = i10 % 128;
                            int i11 = i10 % 2;
                            for (String str : strArr) {
                                arrayList.add(str);
                            }
                        }
                        long j8 = -1;
                        long j9 = 0;
                        long j10 = (((long) (i9 ^ i8)) & ((((long) 0) << 32) | (j8 - ((j8 >> 63) << 32)))) | (((long) 1) << 32) | (j9 - ((j9 >> 63) << 32));
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                        if (objCopydefault6 == null) {
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getLongPressTimeout() >> 16) + 6618, 42 - (ViewConfiguration.getTapTimeout() >> 16), (char) Gravity.getAbsoluteGravity(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                        }
                        Object objInvoke = ((Method) objCopydefault6).invoke(null, null);
                        Object[] objArr9 = {1113584571, Long.valueOf(j10), arrayList, null, false, false};
                        Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                        if (objCopydefault7 == null) {
                            objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(Color.green(0) + 6562, 56 - View.combineMeasuredStates(0, 0), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                        }
                        ((Method) objCopydefault7).invoke(objInvoke, objArr9);
                        int[] iArr = new int[i9];
                        int i12 = i9 - 1;
                        iArr[i12] = 1;
                        Toast.makeText((Context) null, iArr[((i9 * i12) % 2) - 1], 1).show();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        }
        return this.serverTimestamp;
    }

    public void setServerTimestamp(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.serverTimestamp = str;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 101;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 81 / 0;
        }
    }

    public int getCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        component1 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                Integer.parseInt(this.responseCode);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i3 = Integer.parseInt(this.responseCode);
            int i4 = ShareDataUIState + 101;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return i3;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public Map<String, Object> getExtension() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Map<String, Object> map = this.extension;
        int i5 = i3 + 31;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 70 / 0;
        }
        return map;
    }

    public void setExtension(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 51;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.extension = map;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 79;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 28 / 0;
        }
    }

    public void copyExtension(BaseResp baseResp) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (baseResp != null && baseResp.getExtension() != null) {
            setExtension(baseResp.getExtension());
            int i3 = ShareDataUIState + 77;
            component1 = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = component1 + 3;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public Object getExtensionByKey(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        if (this.extension != null) {
            int i5 = i3 + 31;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            if (!TextUtils.isEmpty(str)) {
                return this.extension.get(str);
            }
        }
        int i7 = component1 + 53;
        ShareDataUIState = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        throw null;
    }
}
