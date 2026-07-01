package com.huawei.digitalpayment.consumer.mpin.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.baselib.PaymentTranslucentActivity;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.cancel;
import kotlin.io.encoding.Base64;

public class ResetPinStartActivity extends PaymentTranslucentActivity<ViewModel> {
    private static final byte[] $$c = {35, -27, -128, TarHeader.LF_SYMLINK};
    private static final int $$f = 182;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {120, -62, 63, 57, Ascii.SO, 0, -61, 59, 10, 2, -6, 7, -5, -53, 58, 5, Ascii.VT, -11, -1, 1, 20, -12, -53, 71, -12, Ascii.DLE, 2, -8, 8, 1, 7, -67, 56, -1, 8, 2, 0, Ascii.SI, -66, Base64.padSymbol, 7, 8, -13, Ascii.SI, -2, -11, 13, -60, 36, 36, -11, 0, Ascii.SO, 1, -8, 7, 13, -9, 8, 1, 7, Ascii.ETB, -5, 19, -11, -31, Ascii.US, Ascii.NAK, -17, -10, -10, Ascii.FF, 35, -17, Ascii.NAK, -13, Ascii.SO, 0, 5, 1, 1, -7, Ascii.VT, 8, -63, 8, -63, 70, -11, -2, 4, 19, -9, Ascii.SI, -15, Ascii.NAK, -72, Base64.padSymbol, 7, 8, -13, Ascii.SI, -2, -11, 13, -60, 67, 3, -9, Ascii.SI, -15, Ascii.NAK, -3, 5, 3, -67, 58, 8, 5, 10, -20, 3, Ascii.FF, -5, -53, Ascii.SUB, 40, 5, 10, -20, 3, Ascii.FF, -5, -15, Ascii.SI, Ascii.FF, -4, -12, 19, 3, 5, -5, -63, 65, Ascii.SO, 3, Ascii.VT, -19, 3, 3, -3, Ascii.SYN, -7, 10, Ascii.SO, 0, 5, 1, 1, -7, Ascii.VT, 8, -64};
    private static final int $$e = 56;
    private static final byte[] $$a = {108, -1, -36, 99, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$b = 114;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private static char[] component1 = {30692, 30683, 30689, 30679, 30682, 30684, 30619, 30678, 30709, 30694, 30688, 30677, 30596, 30673, 30675, 30668, 30705, 30685, 30604, 30612, 30691, 30611, 30610, 30613, 30614, 30695, 30608, 30609, 30605, 30615, 30717, 30598, 30710, 30680, 30681, 30686, 30711};
    private static int ShareDataUIState = 321287749;
    private static boolean component2 = true;
    private static boolean component3 = true;
    private static char[] copydefault = {33517, 33463, 33452, 33464, 33408, 33450, 33447, 33443, 33443, 33426, 33375, 33445, 33454, 33441, 33441, 33374, 33456, 33445, 33444, 33450, 33375, 33458, 33456, 33447, 33750, 33750, 33327, 33329, 33327, 33750, 33790, 33751, 33749, 33750, 33327, 33323, 33322, 33749, 33790, 33750, 33328, 33325, 33748, 33752, 33750, 33750, 33328, 33324, 33748, 33790, 33750, 33325, 33322, 33322, 33749, 33752, 33325, 33748, 33791, 33790, 33789, 33751, 33751, 33790, 33748, 33321, 33324, 33750, 33748, 33324, 33326, 33751, 33750, 33752, 33728, 33749, 33322, 33746, 33746, 33322, 33325, 33323, 33321, 33324, 33323, 33322, 33322, 33360, 33728, 33750, 33329, 33330, 33753, 33729, 33728, 33752, 33327, 33329, 33328, 33325, 33325, 33327, 33752, 33751, 33328, 33753, 33753, 33329, 33752, 33753, 33329, 33752, 33755, 33332, 33754, 33750, 33750, 33750, 33326, 33325, 33324, 33329, 33328, 33327, 33754, 33754, 33328, 33751, 33750, 33327, 33332, 33332, 33755, 33731, 33729, 33750, 33327, 33328, 33327, 33328, 33752, 33755, 33753, 33749, 33750, 33754, 33329, 33328, 33329, 33327, 33752, 33404, 33347, 33347, 33400, 33343, 33282, 33342, 33342, 33290, 33343, 33342, 33284, 33293, 33340, 33293, 33347, 33344, 33340, 33347, 33342, 33343, 33293, 33291, 33284, 33289, 33347, 33289, 33282, 33297, 33347, 33285, 33283, 33295, 33348, 33293, 33280, 33297, 33341, 33281, 33343, 33294, 33280, 33297, 33341, 33291, 33348, 33342, 33343, 33297, 33295, 33342, 33297, 33293, 33280, 33290, 33342, 33348, 33296, 33295, 33403, 33406, 33344, 33344, 33404, 33345, 33405, 33406, 33292, 33407, 33403, 33402, 33405, 33514, 33423, 33424, 33422, 33508, 33510, 33423, 33421, 33512, 33515, 33513, 33509, 33509, 33515, 33513, 33509, 33508, 33508, 33512, 33426, 33423, 33511, 33424, 33426, 33512, 33420, 33421, 33421, 33419, 33507, 33507, 33506, 33422, 33423, 33508, 33510, 33480, 33432, 33460, 33460, 33466, 33460, 33462, 33459, 33452, 33449, 33465, 33439, 33429, 33461, 33464, 33465, 33476, 33515, 33515, 33511, 33511, 33512, 33512, 33514, 33515, 33513, 33517, 33422, 33405, 33366, 33456, 33453, 33448, 33362, 33405, 33362, 33362, 33404, 33364, 33366, 33404, 33361, 33361, 33363, 33366, 33367, 33366, 33404, 33365, 33454, 33364, 33362, 33450, 33451, 33449, 33450, 33450, 33362, 33362, 33451, 33364, 33364, 33366, 33405, 33363, 33450, 33452, 33453, 33364, 33405, 33406, 33365, 33362, 33363, 33451, 33363, 33366, 33454, 33452, 33365, 33405, 33364, 33365, 33363, 33364, 33407, 33406, 33367, 33366, 33362, 33361, 33455, 33320, 33746, 33321, 33280, 33282, 33321, 33743, 33322, 33323, 33747, 33321, 33342, 33319, 33746, 33321, 33320, 33322, 33281, 33281, 33281, 33320, 33322, 33283, 33284, 33281, 33343, 33280, 33341, 33341, 33280, 33343, 33280, 33283, 33322, 33322, 33285, 33324, 33324, 33280, 33320, 33323, 33283, 33282, 33280, 33343, 33280, 33281, 33321, 33745, 33745, 33320, 33343, 33342, 33281, 33323, 33745, 33320, 33322, 33323, 33323, 33746, 33319, 33341, 33522, 33412, 33412, 33411, 33408, 33471, 33410, 33410, 33410, 33411, 33408, 33478, 33514, 33512, 33515, 33516, 33513, 33510, 33511, 33513, 33513};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(byte r6, short r7, short r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinStartActivity.$$c
            int r6 = r6 + 68
            int r8 = r8 + 4
            int r7 = r7 * 3
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r6 = r7
            r3 = r8
            r4 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L29:
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinStartActivity.$$i(byte, short, short):java.lang.String");
    }

    private static void d(int i, short s, byte b2, Object[] objArr) {
        int i2 = 99 - i;
        byte[] bArr = $$a;
        int i3 = (b2 * 2) + 83;
        byte[] bArr2 = new byte[s + 4];
        int i4 = s + 3;
        int i5 = -1;
        if (bArr == null) {
            i3 = (i4 + i3) - 8;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            i2++;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3 = (i3 + bArr[i2]) - 8;
        }
    }

    private static void e(byte b2, byte b3, short s, Object[] objArr) {
        int i = 154 - (b2 * 3);
        int i2 = b3 * 6;
        byte[] bArr = $$d;
        int i3 = 105 - (s * 2);
        byte[] bArr2 = new byte[i2 + 10];
        int i4 = i2 + 9;
        int i5 = -1;
        if (bArr == null) {
            i3 = (i3 + i4) - 2;
            i++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 = (i3 + bArr[i]) - 2;
                i++;
            }
        }
    }

    private static void b(char[] cArr, int i, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = component1;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 93;
                $10 = i5 % 128;
                if (i5 % i2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                        if (objCopydefault == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3759 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)), ExpandableListView.getPackedPositionType(j) + 24, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), -1670574543, false, $$i(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i4--;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i4])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3760, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 23, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), -1670574543, false, $$i(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i4++;
                }
                i2 = 2;
                j = 0;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(ShareDataUIState)};
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7140 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 13 - KeyEvent.getDeadChar(0, 0), (char) Color.argb(0, 0, 0, 0), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
        int i6 = 689978476;
        if (component3) {
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            int i7 = $11 + 21;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            while (cancelVar.component3 < cancelVar.component1) {
                int i9 = $11 + 103;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr4[cancelVar.component3] = (char) (cArr2[bArr[cancelVar.component1 >> cancelVar.component3] - i] % iIntValue);
                    Object[] objArr5 = {cancelVar, cancelVar};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault4 == null) {
                        byte b6 = (byte) 5;
                        byte b7 = (byte) (b6 - 5);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0') + 2749, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 18, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 7644), -327556343, false, $$i(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                } else {
                    cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                    Object[] objArr6 = {cancelVar, cancelVar};
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault5 == null) {
                        byte b8 = (byte) 5;
                        byte b9 = (byte) (b8 - 5);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0) + 2749, 19 - ExpandableListView.getPackedPositionType(0L), (char) (7643 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), -327556343, false, $$i(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault5).invoke(null, objArr6);
                }
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!component2) {
            cancelVar.component1 = iArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr5[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                cancelVar.component3++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        cancelVar.component1 = cArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        cancelVar.component3 = 0;
        int i10 = $11 + 39;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        while (cancelVar.component3 < cancelVar.component1) {
            int i12 = $11 + 25;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
            Object[] objArr7 = {cancelVar, cancelVar};
            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(i6);
            if (objCopydefault6 == null) {
                byte b10 = (byte) 5;
                byte b11 = (byte) (b10 - 5);
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2748 - KeyEvent.getDeadChar(0, 0), View.MeasureSpec.getMode(0) + 19, (char) (7645 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), -327556343, false, $$i(b10, b11, (byte) (b11 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault6).invoke(null, objArr7);
            i6 = 689978476;
        }
        objArr[0] = new String(cArr6);
    }

    private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        char c2;
        int i = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = copydefault;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(657 - (Process.myPid() >> 22), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
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
        char[] cArr4 = new char[i3];
        System.arraycopy(cArr2, i2, cArr4, 0, i3);
        if (bArr != null) {
            int i7 = $11 + 45;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr = new char[i3];
                iTrustedWebActivityService_Parcel.copydefault = 1;
                c2 = 1;
            } else {
                cArr = new char[i3];
                iTrustedWebActivityService_Parcel.copydefault = 0;
                c2 = 0;
            }
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i8 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr3 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4502 - Drawable.resolveOpacity(0, 0), 36 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (27897 - View.MeasureSpec.getMode(0)), -1464227204, false, $$i((byte) 42, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i8] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                } else {
                    int i9 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault3 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3579, 27 - ImageFormat.getBitsPerPixel(0), (char) ((Process.getThreadPriority(0) + 20) >> 6), 1180380354, false, $$i((byte) 47, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i9] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b4 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1859 - (ViewConfiguration.getKeyRepeatDelay() >> 16), View.combineMeasuredStates(0, 0) + 34, (char) Drawable.resolveOpacity(0, 0), 80302927, false, $$i((byte) 46, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr4, 0, cArr5, 0, i3);
            int i10 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr4, i10, i5);
            System.arraycopy(cArr5, i5, cArr4, 0, i10);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr4[(i3 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr4 = cArr6;
        }
        if (i4 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                int i11 = $11 + 39;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                cArr4[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr4[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinStartActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinStartActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = getRequestBeneficiariesState + 111;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            b(null, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 98, new byte[]{-125, -127, -117, -124, -110, -111, -112, -114, -122, -113, -122, -114, -118, -115, -121, -116, -116, -127, -121, -125, -122, -123, -124, -125, -126, -127}, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            c(new int[]{5, 18, 12, 12}, true, null, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = getRequestBeneficiariesState + 115;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6619 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 42 - TextUtils.getOffsetAfter("", 0), (char) KeyEvent.getDeadChar(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6561 - MotionEvent.axisFromString(""), 'h' - AndroidCharacter.getMirror('0'), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), -960739708, false, "component3", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onPause();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(33:0|2|(2:(2:9|(2:11|(1:15)(1:14))(0))(1:16)|(8:734|18|(1:20)|21|22|23|(1:25)|26)(1:7))(0)|30|764|31|(2:772|33)|37|38|739|(5:40|41|(1:43)|44|45)(16:47|48|740|49|(2:749|51)|55|56|57|(1:59)|60|61|62|(1:64)|65|(1:67)|68)|46|69|(9:72|728|73|(1:75)|76|77|78|792|79)|114|(6:778|115|(1:117)|118|(1:120)|121)|(58:(3:123|(1:125)|126)(7:127|(2:129|(1:135)(1:134))(1:136)|(18:138|768|139|(1:141)|142|143|751|144|(1:146)|147|148|149|(1:151)|152|(1:154)(1:155)|156|(1:158)|159)(69:214|773|215|(1:217)|218|(3:220|(1:222)|223)(19:224|225|762|226|(1:228)|229|230|743|231|(1:233)|234|235|236|(1:238)|239|(1:241)|242|(1:244)|245)|246|(4:249|(3:810|251|813)(12:809|252|(3:254|(3:257|258|255)|814)|259|802|260|(1:262)|263|264|788|265|812)|811|247)|808|278|(3:759|303|(1:309)(1:308))(1:313)|314|796|315|(1:317)|318|786|319|(1:321)|322|346|742|347|(1:349)|350|(3:352|(1:354)|355)(20:356|357|730|358|(1:360)|361|362|794|363|(1:365)|366|367|368|(1:370)|371|(1:373)(1:374)|375|(1:377)|378|379)|380|(4:383|(2:385|817)(11:386|(3:388|(4:391|392|393|389)|818)|394|783|395|(1:397)|398|399|776|400|816)|401|381)|815|435|(1:437)|438|(3:440|(1:442)|443)(14:444|445|(1:447)|448|449|(1:451)|452|798|453|454|(1:456)|457|(1:459)|460)|461|(1:463)(9:464|(5:466|(1:468)(1:469)|828|(2:472|470)|827)|473|474|(1:476)|477|(1:479)|480|481)|482|(1:484)|485|(1:487)|488|(3:490|(1:492)|493)(16:495|496|(1:498)|499|(1:501)|502|503|(1:505)|506|732|507|508|(1:510)|511|(1:513)|514)|494|515|(1:517)(9:518|(3:520|(2:523|521)|826)|524|525|(1:527)|528|(1:530)|531|532)|533|785|534|(1:536)|537|(1:539)|540|(3:542|(1:544)|545)(17:546|(2:548|(1:554)(1:553))|(19:556|557|779|558|(1:560)|561|562|770|563|(1:565)|566|567|568|(1:570)|571|(1:573)|574|(1:576)|577)|632|(1:634)|635|(3:637|(1:639)|640)(13:642|745|643|644|(1:646)|647|760|648|649|(1:651)|652|(1:654)|655)|641|656|(6:659|660|(1:662)|663|664|665)|666|(1:668)|669|(3:671|(1:673)|674)(14:676|677|(1:679)|680|681|(1:683)|684|753|685|686|(1:688)|689|(1:691)|692)|675|693|(1:829)(7:696|697|(1:699)|700|701|702|703))|578|(4:581|(3:821|583|824)(12:820|584|(3:586|(3:589|590|587)|825)|591|755|592|(1:594)|595|596|737|597|823)|822|579)|819|632|(0)|635|(0)(0)|641|656|(0)|666|(0)|669|(0)(0)|675|693|(0)(0))|28|29|722|(1:724)(1:725))|796|315|(0)|318|786|319|(0)|322|346|742|347|(0)|350|(0)(0)|380|(1:381)|815|435|(0)|438|(0)(0)|461|(0)(0)|482|(0)|485|(0)|488|(0)(0)|494|515|(0)(0)|533|785|534|(0)|537|(0)|540|(0)(0)|578|(1:579)|819|632|(0)|635|(0)(0)|641|656|(0)|666|(0)|669|(0)(0)|675|693|(0)(0))|160|(4:163|(2:165|806)(11:166|(3:168|(3:171|172|169)|807)|173|735|174|(1:176)|177|178|800|179|805)|180|161)|804|214|773|215|(0)|218|(0)(0)|246|(1:247)|808|278|(0)(0)|314|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x11c1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x11c2, code lost:
    
        r6 = new java.lang.Object[1];
        c(new int[]{androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PHASE, 10, 0, 10}, true, new byte[]{0, 1, 0, 1, 1, 0, 0, 1, 1, 1}, r6);
        r2 = (java.lang.String) r6[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x11dd, code lost:
    
        r3 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r3);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r3.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x11f4, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x11f8, code lost:
    
        r3 = new java.util.ArrayList(2);
        r3.add(r1);
        r3.add(r2);
        r14 = -1;
        r4 = ((long) 1) & ((((long) 0) << 32) | (r14 - ((r14 >> 63) << 32)));
        r14 = 0;
        r1 = ((((long) 19) << 32) | (r14 - ((r14 >> 63) << 32))) | r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x1228, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x122c, code lost:
    
        if (r5 == null) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x122e, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6618, android.view.Gravity.getAbsoluteGravity(0, 0) + 42, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x1259, code lost:
    
        r5 = ((java.lang.reflect.Method) r5).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x1261, code lost:
    
        r7 = new java.lang.Object[]{660072367, java.lang.Long.valueOf(r1), r3, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(android.graphics.Color.blue(0) + 6562, android.graphics.ImageFormat.getBitsPerPixel(0) + 57, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
        r2 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinStartActivity.$$d;
        r8 = new java.lang.Object[1];
        e(r2[125(0x7d, float:1.75E-43)], r2[5], r2[107(0x6b, float:1.5E-43)], r8);
        r1.getMethod((java.lang.String) r8[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r5, r7);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x06a8 A[Catch: all -> 0x02a6, TryCatch #4 {all -> 0x02a6, blocks: (B:660:0x2f14, B:662:0x2f1a, B:663:0x2f46, B:697:0x326e, B:699:0x3274, B:700:0x3299, B:677:0x30ab, B:679:0x30ce, B:680:0x3117, B:626:0x2bd3, B:628:0x2bd9, B:629:0x2c04, B:525:0x24df, B:527:0x24e5, B:528:0x2511, B:530:0x254b, B:531:0x2591, B:496:0x21a2, B:498:0x21b7, B:499:0x21e9, B:501:0x221d, B:502:0x2299, B:474:0x1e52, B:476:0x1e58, B:477:0x1e86, B:479:0x1ec0, B:480:0x1f09, B:445:0x1bb9, B:447:0x1bce, B:448:0x1bff, B:429:0x19bc, B:431:0x19c2, B:432:0x19ea, B:340:0x144a, B:342:0x1450, B:343:0x147c, B:295:0x1228, B:297:0x122e, B:298:0x1259, B:208:0x0cec, B:210:0x0cf2, B:211:0x0d1c, B:108:0x06a2, B:110:0x06a8, B:111:0x06d8, B:18:0x00ff, B:20:0x0105, B:21:0x012c, B:23:0x0215, B:25:0x0247, B:26:0x02a0, B:347:0x1502, B:349:0x1508, B:350:0x1553, B:352:0x1560, B:354:0x1569, B:355:0x15ad, B:380:0x17e4, B:381:0x17e8, B:383:0x17ee, B:386:0x1808, B:389:0x1815, B:392:0x1822, B:404:0x1906, B:406:0x190c, B:407:0x190d, B:409:0x190f, B:411:0x1916, B:412:0x1917, B:356:0x15b8, B:368:0x16b6, B:370:0x16bc, B:371:0x1700, B:373:0x172a, B:375:0x1773, B:377:0x178a, B:378:0x17d2, B:414:0x1919, B:416:0x1920, B:417:0x1921, B:419:0x1923, B:421:0x192a, B:422:0x192b, B:303:0x12dd, B:305:0x12e3, B:326:0x13d3, B:328:0x13d9, B:329:0x13da, B:331:0x13dc, B:333:0x13e3, B:334:0x13e4, B:309:0x12ef, B:215:0x0da7, B:217:0x0dad, B:218:0x0df5, B:220:0x0e02, B:222:0x0e0b, B:223:0x0e4d, B:246:0x107b, B:247:0x107f, B:249:0x1085, B:252:0x109c, B:255:0x10a9, B:257:0x10ac, B:269:0x1197, B:271:0x119d, B:272:0x119e, B:274:0x11a0, B:276:0x11a7, B:277:0x11a8, B:224:0x0e58, B:236:0x0f5f, B:238:0x0f65, B:239:0x0fa6, B:241:0x0fd0, B:242:0x1016, B:244:0x102c, B:245:0x1075, B:280:0x11ae, B:282:0x11b5, B:283:0x11b6, B:285:0x11b8, B:287:0x11bf, B:288:0x11c0, B:115:0x0767, B:117:0x076d, B:118:0x07b7, B:120:0x07de, B:121:0x0820, B:123:0x0836, B:125:0x083f, B:126:0x0887, B:160:0x0b34, B:161:0x0b38, B:163:0x0b3e, B:166:0x0b58, B:169:0x0b6e, B:171:0x0b71, B:183:0x0c5e, B:185:0x0c64, B:186:0x0c65, B:188:0x0c67, B:190:0x0c6e, B:191:0x0c6f, B:129:0x089a, B:131:0x089e, B:138:0x08b2, B:149:0x0a0a, B:151:0x0a10, B:152:0x0a58, B:154:0x0a82, B:156:0x0acf, B:158:0x0ae6, B:159:0x0b2e, B:193:0x0c71, B:195:0x0c78, B:196:0x0c79, B:198:0x0c7b, B:200:0x0c82, B:201:0x0c83, B:135:0x08aa, B:534:0x269d, B:536:0x26a3, B:537:0x26eb, B:539:0x2712, B:540:0x2756, B:542:0x276c, B:544:0x2775, B:545:0x27b7, B:578:0x2a12, B:579:0x2a16, B:581:0x2a1c, B:584:0x2a34, B:587:0x2a41, B:589:0x2a44, B:601:0x2b29, B:603:0x2b2f, B:604:0x2b30, B:606:0x2b32, B:608:0x2b39, B:609:0x2b3a, B:548:0x27c6, B:550:0x27ca, B:554:0x27d6, B:556:0x27dc, B:568:0x28f0, B:570:0x28f6, B:571:0x293b, B:573:0x2965, B:574:0x29aa, B:576:0x29c0, B:577:0x2a0c, B:611:0x2b3c, B:613:0x2b43, B:614:0x2b44, B:616:0x2b46, B:618:0x2b4d, B:619:0x2b4e), top: B:734:0x00ff, inners: #9, #18, #26, #29, #33 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0dad A[Catch: all -> 0x11c1, TryCatch #26 {all -> 0x11c1, blocks: (B:215:0x0da7, B:217:0x0dad, B:218:0x0df5, B:220:0x0e02, B:222:0x0e0b, B:223:0x0e4d, B:246:0x107b, B:247:0x107f, B:249:0x1085, B:252:0x109c, B:255:0x10a9, B:257:0x10ac, B:269:0x1197, B:271:0x119d, B:272:0x119e, B:274:0x11a0, B:276:0x11a7, B:277:0x11a8, B:224:0x0e58, B:236:0x0f5f, B:238:0x0f65, B:239:0x0fa6, B:241:0x0fd0, B:242:0x1016, B:244:0x102c, B:245:0x1075, B:280:0x11ae, B:282:0x11b5, B:283:0x11b6, B:285:0x11b8, B:287:0x11bf, B:288:0x11c0, B:231:0x0ec7, B:233:0x0ee3, B:234:0x0f53, B:226:0x0e78, B:228:0x0e8d, B:229:0x0ec0, B:265:0x1114, B:260:0x10d8, B:262:0x10de, B:263:0x110c), top: B:773:0x0da7, outer: #4, inners: #10, #20, #35, #42 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0e02 A[Catch: all -> 0x11c1, TryCatch #26 {all -> 0x11c1, blocks: (B:215:0x0da7, B:217:0x0dad, B:218:0x0df5, B:220:0x0e02, B:222:0x0e0b, B:223:0x0e4d, B:246:0x107b, B:247:0x107f, B:249:0x1085, B:252:0x109c, B:255:0x10a9, B:257:0x10ac, B:269:0x1197, B:271:0x119d, B:272:0x119e, B:274:0x11a0, B:276:0x11a7, B:277:0x11a8, B:224:0x0e58, B:236:0x0f5f, B:238:0x0f65, B:239:0x0fa6, B:241:0x0fd0, B:242:0x1016, B:244:0x102c, B:245:0x1075, B:280:0x11ae, B:282:0x11b5, B:283:0x11b6, B:285:0x11b8, B:287:0x11bf, B:288:0x11c0, B:231:0x0ec7, B:233:0x0ee3, B:234:0x0f53, B:226:0x0e78, B:228:0x0e8d, B:229:0x0ec0, B:265:0x1114, B:260:0x10d8, B:262:0x10de, B:263:0x110c), top: B:773:0x0da7, outer: #4, inners: #10, #20, #35, #42 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0e58 A[Catch: all -> 0x11c1, TRY_LEAVE, TryCatch #26 {all -> 0x11c1, blocks: (B:215:0x0da7, B:217:0x0dad, B:218:0x0df5, B:220:0x0e02, B:222:0x0e0b, B:223:0x0e4d, B:246:0x107b, B:247:0x107f, B:249:0x1085, B:252:0x109c, B:255:0x10a9, B:257:0x10ac, B:269:0x1197, B:271:0x119d, B:272:0x119e, B:274:0x11a0, B:276:0x11a7, B:277:0x11a8, B:224:0x0e58, B:236:0x0f5f, B:238:0x0f65, B:239:0x0fa6, B:241:0x0fd0, B:242:0x1016, B:244:0x102c, B:245:0x1075, B:280:0x11ae, B:282:0x11b5, B:283:0x11b6, B:285:0x11b8, B:287:0x11bf, B:288:0x11c0, B:231:0x0ec7, B:233:0x0ee3, B:234:0x0f53, B:226:0x0e78, B:228:0x0e8d, B:229:0x0ec0, B:265:0x1114, B:260:0x10d8, B:262:0x10de, B:263:0x110c), top: B:773:0x0da7, outer: #4, inners: #10, #20, #35, #42 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x1085 A[Catch: all -> 0x11c1, TryCatch #26 {all -> 0x11c1, blocks: (B:215:0x0da7, B:217:0x0dad, B:218:0x0df5, B:220:0x0e02, B:222:0x0e0b, B:223:0x0e4d, B:246:0x107b, B:247:0x107f, B:249:0x1085, B:252:0x109c, B:255:0x10a9, B:257:0x10ac, B:269:0x1197, B:271:0x119d, B:272:0x119e, B:274:0x11a0, B:276:0x11a7, B:277:0x11a8, B:224:0x0e58, B:236:0x0f5f, B:238:0x0f65, B:239:0x0fa6, B:241:0x0fd0, B:242:0x1016, B:244:0x102c, B:245:0x1075, B:280:0x11ae, B:282:0x11b5, B:283:0x11b6, B:285:0x11b8, B:287:0x11bf, B:288:0x11c0, B:231:0x0ec7, B:233:0x0ee3, B:234:0x0f53, B:226:0x0e78, B:228:0x0e8d, B:229:0x0ec0, B:265:0x1114, B:260:0x10d8, B:262:0x10de, B:263:0x110c), top: B:773:0x0da7, outer: #4, inners: #10, #20, #35, #42 }] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x12fa  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x1311 A[Catch: all -> 0x13db, TryCatch #39 {all -> 0x13db, blocks: (B:315:0x12fc, B:317:0x1311, B:318:0x1344), top: B:796:0x12fc, outer: #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x1357 A[Catch: all -> 0x13d1, TryCatch #34 {all -> 0x13d1, blocks: (B:319:0x134a, B:321:0x1357, B:322:0x13c9), top: B:786:0x134a, outer: #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x1508 A[Catch: all -> 0x192c, TryCatch #9 {all -> 0x192c, blocks: (B:347:0x1502, B:349:0x1508, B:350:0x1553, B:352:0x1560, B:354:0x1569, B:355:0x15ad, B:380:0x17e4, B:381:0x17e8, B:383:0x17ee, B:386:0x1808, B:389:0x1815, B:392:0x1822, B:404:0x1906, B:406:0x190c, B:407:0x190d, B:409:0x190f, B:411:0x1916, B:412:0x1917, B:356:0x15b8, B:368:0x16b6, B:370:0x16bc, B:371:0x1700, B:373:0x172a, B:375:0x1773, B:377:0x178a, B:378:0x17d2, B:414:0x1919, B:416:0x1920, B:417:0x1921, B:419:0x1923, B:421:0x192a, B:422:0x192b, B:358:0x15d8, B:360:0x15ed, B:361:0x161f, B:400:0x1887, B:395:0x1851, B:397:0x1857, B:398:0x187f, B:363:0x1626, B:365:0x163b, B:366:0x16aa), top: B:742:0x1502, outer: #4, inners: #2, #28, #32, #38 }] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x1560 A[Catch: all -> 0x192c, TryCatch #9 {all -> 0x192c, blocks: (B:347:0x1502, B:349:0x1508, B:350:0x1553, B:352:0x1560, B:354:0x1569, B:355:0x15ad, B:380:0x17e4, B:381:0x17e8, B:383:0x17ee, B:386:0x1808, B:389:0x1815, B:392:0x1822, B:404:0x1906, B:406:0x190c, B:407:0x190d, B:409:0x190f, B:411:0x1916, B:412:0x1917, B:356:0x15b8, B:368:0x16b6, B:370:0x16bc, B:371:0x1700, B:373:0x172a, B:375:0x1773, B:377:0x178a, B:378:0x17d2, B:414:0x1919, B:416:0x1920, B:417:0x1921, B:419:0x1923, B:421:0x192a, B:422:0x192b, B:358:0x15d8, B:360:0x15ed, B:361:0x161f, B:400:0x1887, B:395:0x1851, B:397:0x1857, B:398:0x187f, B:363:0x1626, B:365:0x163b, B:366:0x16aa), top: B:742:0x1502, outer: #4, inners: #2, #28, #32, #38 }] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x15b8 A[Catch: all -> 0x192c, TRY_LEAVE, TryCatch #9 {all -> 0x192c, blocks: (B:347:0x1502, B:349:0x1508, B:350:0x1553, B:352:0x1560, B:354:0x1569, B:355:0x15ad, B:380:0x17e4, B:381:0x17e8, B:383:0x17ee, B:386:0x1808, B:389:0x1815, B:392:0x1822, B:404:0x1906, B:406:0x190c, B:407:0x190d, B:409:0x190f, B:411:0x1916, B:412:0x1917, B:356:0x15b8, B:368:0x16b6, B:370:0x16bc, B:371:0x1700, B:373:0x172a, B:375:0x1773, B:377:0x178a, B:378:0x17d2, B:414:0x1919, B:416:0x1920, B:417:0x1921, B:419:0x1923, B:421:0x192a, B:422:0x192b, B:358:0x15d8, B:360:0x15ed, B:361:0x161f, B:400:0x1887, B:395:0x1851, B:397:0x1857, B:398:0x187f, B:363:0x1626, B:365:0x163b, B:366:0x16aa), top: B:742:0x1502, outer: #4, inners: #2, #28, #32, #38 }] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x17ee A[Catch: all -> 0x192c, TryCatch #9 {all -> 0x192c, blocks: (B:347:0x1502, B:349:0x1508, B:350:0x1553, B:352:0x1560, B:354:0x1569, B:355:0x15ad, B:380:0x17e4, B:381:0x17e8, B:383:0x17ee, B:386:0x1808, B:389:0x1815, B:392:0x1822, B:404:0x1906, B:406:0x190c, B:407:0x190d, B:409:0x190f, B:411:0x1916, B:412:0x1917, B:356:0x15b8, B:368:0x16b6, B:370:0x16bc, B:371:0x1700, B:373:0x172a, B:375:0x1773, B:377:0x178a, B:378:0x17d2, B:414:0x1919, B:416:0x1920, B:417:0x1921, B:419:0x1923, B:421:0x192a, B:422:0x192b, B:358:0x15d8, B:360:0x15ed, B:361:0x161f, B:400:0x1887, B:395:0x1851, B:397:0x1857, B:398:0x187f, B:363:0x1626, B:365:0x163b, B:366:0x16aa), top: B:742:0x1502, outer: #4, inners: #2, #28, #32, #38 }] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x1a7d  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x1acd  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x1b9a  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x1d39  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x1e04  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x1ff4  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x2058  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x20b6  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x2184  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x23d4  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x2495  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x26a3 A[Catch: all -> 0x2b4f, TryCatch #33 {all -> 0x2b4f, blocks: (B:534:0x269d, B:536:0x26a3, B:537:0x26eb, B:539:0x2712, B:540:0x2756, B:542:0x276c, B:544:0x2775, B:545:0x27b7, B:578:0x2a12, B:579:0x2a16, B:581:0x2a1c, B:584:0x2a34, B:587:0x2a41, B:589:0x2a44, B:601:0x2b29, B:603:0x2b2f, B:604:0x2b30, B:606:0x2b32, B:608:0x2b39, B:609:0x2b3a, B:548:0x27c6, B:550:0x27ca, B:554:0x27d6, B:556:0x27dc, B:568:0x28f0, B:570:0x28f6, B:571:0x293b, B:573:0x2965, B:574:0x29aa, B:576:0x29c0, B:577:0x2a0c, B:611:0x2b3c, B:613:0x2b43, B:614:0x2b44, B:616:0x2b46, B:618:0x2b4d, B:619:0x2b4e, B:597:0x2aab, B:592:0x2a70, B:594:0x2a76, B:595:0x2aa3, B:563:0x2849, B:565:0x2868, B:566:0x28e4, B:558:0x27fc, B:560:0x2811, B:561:0x2842), top: B:785:0x269d, outer: #4, inners: #6, #16, #24, #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:539:0x2712 A[Catch: all -> 0x2b4f, TryCatch #33 {all -> 0x2b4f, blocks: (B:534:0x269d, B:536:0x26a3, B:537:0x26eb, B:539:0x2712, B:540:0x2756, B:542:0x276c, B:544:0x2775, B:545:0x27b7, B:578:0x2a12, B:579:0x2a16, B:581:0x2a1c, B:584:0x2a34, B:587:0x2a41, B:589:0x2a44, B:601:0x2b29, B:603:0x2b2f, B:604:0x2b30, B:606:0x2b32, B:608:0x2b39, B:609:0x2b3a, B:548:0x27c6, B:550:0x27ca, B:554:0x27d6, B:556:0x27dc, B:568:0x28f0, B:570:0x28f6, B:571:0x293b, B:573:0x2965, B:574:0x29aa, B:576:0x29c0, B:577:0x2a0c, B:611:0x2b3c, B:613:0x2b43, B:614:0x2b44, B:616:0x2b46, B:618:0x2b4d, B:619:0x2b4e, B:597:0x2aab, B:592:0x2a70, B:594:0x2a76, B:595:0x2aa3, B:563:0x2849, B:565:0x2868, B:566:0x28e4, B:558:0x27fc, B:560:0x2811, B:561:0x2842), top: B:785:0x269d, outer: #4, inners: #6, #16, #24, #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:542:0x276c A[Catch: all -> 0x2b4f, TryCatch #33 {all -> 0x2b4f, blocks: (B:534:0x269d, B:536:0x26a3, B:537:0x26eb, B:539:0x2712, B:540:0x2756, B:542:0x276c, B:544:0x2775, B:545:0x27b7, B:578:0x2a12, B:579:0x2a16, B:581:0x2a1c, B:584:0x2a34, B:587:0x2a41, B:589:0x2a44, B:601:0x2b29, B:603:0x2b2f, B:604:0x2b30, B:606:0x2b32, B:608:0x2b39, B:609:0x2b3a, B:548:0x27c6, B:550:0x27ca, B:554:0x27d6, B:556:0x27dc, B:568:0x28f0, B:570:0x28f6, B:571:0x293b, B:573:0x2965, B:574:0x29aa, B:576:0x29c0, B:577:0x2a0c, B:611:0x2b3c, B:613:0x2b43, B:614:0x2b44, B:616:0x2b46, B:618:0x2b4d, B:619:0x2b4e, B:597:0x2aab, B:592:0x2a70, B:594:0x2a76, B:595:0x2aa3, B:563:0x2849, B:565:0x2868, B:566:0x28e4, B:558:0x27fc, B:560:0x2811, B:561:0x2842), top: B:785:0x269d, outer: #4, inners: #6, #16, #24, #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:546:0x27c2  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x2a1c A[Catch: all -> 0x2b4f, TryCatch #33 {all -> 0x2b4f, blocks: (B:534:0x269d, B:536:0x26a3, B:537:0x26eb, B:539:0x2712, B:540:0x2756, B:542:0x276c, B:544:0x2775, B:545:0x27b7, B:578:0x2a12, B:579:0x2a16, B:581:0x2a1c, B:584:0x2a34, B:587:0x2a41, B:589:0x2a44, B:601:0x2b29, B:603:0x2b2f, B:604:0x2b30, B:606:0x2b32, B:608:0x2b39, B:609:0x2b3a, B:548:0x27c6, B:550:0x27ca, B:554:0x27d6, B:556:0x27dc, B:568:0x28f0, B:570:0x28f6, B:571:0x293b, B:573:0x2965, B:574:0x29aa, B:576:0x29c0, B:577:0x2a0c, B:611:0x2b3c, B:613:0x2b43, B:614:0x2b44, B:616:0x2b46, B:618:0x2b4d, B:619:0x2b4e, B:597:0x2aab, B:592:0x2a70, B:594:0x2a76, B:595:0x2aa3, B:563:0x2849, B:565:0x2868, B:566:0x28e4, B:558:0x27fc, B:560:0x2811, B:561:0x2842), top: B:785:0x269d, outer: #4, inners: #6, #16, #24, #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:634:0x2c9c  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x2ce4  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x2d33  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x2ef3  */
    /* JADX WARN: Removed duplicated region for block: B:668:0x2fd9  */
    /* JADX WARN: Removed duplicated region for block: B:671:0x3030  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x308d  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x324e  */
    /* JADX WARN: Removed duplicated region for block: B:724:0x3353  */
    /* JADX WARN: Removed duplicated region for block: B:725:0x3354  */
    /* JADX WARN: Removed duplicated region for block: B:759:0x12dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:829:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r11v48 */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r11v54 */
    /* JADX WARN: Type inference failed for: r11v55 */
    /* JADX WARN: Type inference failed for: r11v56 */
    /* JADX WARN: Type inference failed for: r11v57 */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r11v59 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v60 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 13477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinStartActivity.attachBaseContext(android.content.Context):void");
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 29;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = getAsAtTimestamp + 25;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
    }
}
