package com.huawei.digitalpayment.consumer.webview.init;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.Observer;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.constant.CacheConstants;
import com.didi.drouter.api.Extend;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.safe.SafeUri;
import com.huawei.common.util.L;
import com.huawei.common.util.ToastUtils;
import com.huawei.common.widget.dialog.DialogManager;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.util.UriUtils;
import com.huawei.digitalpayment.consumer.webview.model.resp.GetH5AccessTokenResp;
import com.huawei.digitalpayment.consumer.webview.util.WebViewUtils;
import com.huawei.digitalpayment.consumer.webview.viewmodel.WebViewViewModel;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.mpesa.lifestyle.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.cancel;
import org.bouncycastle.crypto.signers.PSSSigner;

public class WebDispatcherActivity extends Hilt_WebDispatcherActivity<WebViewViewModel> {
    String queryParams;
    String urlString;
    private static final byte[] $$l = {120, Ascii.VT, 65, 93};
    private static final int $$o = 86;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$s = {TarHeader.LF_NORMAL, -42, 66, -37, -11, 3, SignedBytes.MAX_POWER_OF_TWO, -69, 19, -18, 7, 2, 0, 3, -1, 66, -71, Ascii.SO, 5, -17, 8, Ascii.DLE, -5, 3, -12, Ascii.SI, -10, -4, 2, Ascii.VT, -4, Ascii.VT, -4, 7, 3, -18, 6, -2, 69, -35, 47, -71, Ascii.FF, -23, Ascii.VT, -5, 2, -11, 0, -8, Ascii.SYN, 0, 0, 6, -19, 10, -7, -11, 3, -2, 2, 2, 10, -8, -5, 66, -11, 3, SignedBytes.MAX_POWER_OF_TWO, -56, -7, 1, 9, -4, 8, 56, -55, -2, -8, Ascii.SO, 4, 2, -17, Ascii.SI, 56, PSSSigner.TRAILER_IMPLICIT, Ascii.SI, -13, 1, Ascii.VT, -5, 2, -4, 70, -53, 4, -5, 1, 3, -12, 69, -58, -4, -5, Ascii.DLE, -12, 5, Ascii.SO, -10, 63, -33, -33, Ascii.SO, 3, -11, 2, Ascii.VT, -4, -10, Ascii.FF, -5, 2, -4, -20, 8, -16, Ascii.SO, 34, -28, -18, 20, 13, 13, -9, -32, 20, -18, Ascii.DLE};
    private static final int $$t = 157;
    private static final byte[] $$d = {90, 10, -103, 87, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -12, Ascii.FF, -19, -15, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 87;
    private static int component4 = 0;
    private static int getRequestBeneficiariesState = 1;
    private static char[] component2 = {30424, 30415, 30421, 30411, 30414, 30416, 30351, 30410, 30441, 30426, 30420, 30412, 30400, 30436, 30404, 30405, 30456, 30409, 30413, 30336, 30344, 30423, 30343, 30342, 30345, 30346, 30427, 30340, 30341, 30337, 30347, 30417, 30339, 30350, 30422, 30408, 30407, 30449, 30458, 30442, 30418};
    private static int component3 = 321287865;
    private static boolean copydefault = true;
    private static boolean ShareDataUIState = true;
    private static char[] component1 = {33368, 33739, 33737, 33735, 33730, 33734, 33740, 33321, 33323, 33738, 33730, 33315, 33339, 33312, 33735, 33732, 33731, 33731, 33732, 33788, 33740, 33748, 33733, 33735, 33743, 33744, 33411, 33345, 33346, 33344, 33366, 33368, 33345, 33407, 33370, 33373, 33371, 33367, 33367, 33373, 33371, 33367, 33366, 33366, 33370, 33348, 33345, 33369, 33346, 33348, 33370, 33406, 33407, 33407, 33405, 33365, 33365, 33364, 33344, 33345, 33366, 33368, 33512, 33461, 33458, 33451, 33448, 33464, 33438, 33428, 33460, 33463, 33464, 33425, 33431, 33459, 33459, 33465, 33517, 33462, 33460, 33457, 33455, 33465, 33468, 33412, 33412, 33467, 33459, 33454, 33463, 33465, 33463, 33466, 33297, 33297, 33297, 33293, 33293, 33294, 33294, 33296, 33297, 33295, 33477, 33515, 33512, 33514, 33514, 33513, 33513, 33511, 33510, 33513, 33477, 33516, 33514, 33513, 33513, 33512, 33513, 33515, 33514, 33512};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(int r6, byte r7, short r8) {
        /*
            int r7 = r7 * 4
            int r0 = r7 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.webview.init.WebDispatcherActivity.$$l
            int r8 = r8 + 4
            int r6 = 115 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2c
        L12:
            r3 = r2
        L13:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.webview.init.WebDispatcherActivity.$$r(int, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = 99 - r7
            int r6 = r6 * 2
            int r6 = r6 + 83
            byte[] r0 = com.huawei.digitalpayment.consumer.webview.init.WebDispatcherActivity.$$d
            int r1 = r8 + 4
            byte[] r1 = new byte[r1]
            int r8 = r8 + 3
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2f
        L14:
            r3 = r2
        L15:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r6 = r6 + 1
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-8)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.webview.init.WebDispatcherActivity.i(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 16
            int r8 = 99 - r8
            int r6 = r6 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.webview.init.WebDispatcherActivity.$$s
            int r1 = r7 + 10
            byte[] r1 = new byte[r1]
            int r7 = r7 + 9
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r6 = r6 + 1
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2d:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.webview.init.WebDispatcherActivity.j(byte, short, int, java.lang.Object[]):void");
    }

    private static void g(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = component2;
        char c2 = '0';
        int i3 = 0;
        if (cArr2 != null) {
            int i4 = $10 + 3;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i6]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i3;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(MotionEvent.axisFromString("") + 3761, AndroidCharacter.getMirror(c2) - 24, (char) (Process.myTid() >> 22), -1670574543, false, $$r((byte) 47, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i6++;
                    int i7 = $10 + 49;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    c2 = '0';
                    i3 = 0;
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
        Object[] objArr3 = {Integer.valueOf(component3)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7140 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.lastIndexOf("", '0') + 14, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i9 = 42;
        long j = 0;
        if (ShareDataUIState) {
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i10 = $10 + 101;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr4 = {cancelVar, cancelVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault3 == null) {
                    byte b3 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> 16) + 2748, 18 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)), (char) (TextUtils.getTrimmedLength("") + 7644), -327556343, false, $$r((byte) i9, b3, (byte) (b3 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                i9 = 42;
                j = 0;
            }
            String str = new String(cArr4);
            int i12 = $10 + 9;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            objArr[0] = str;
            return;
        }
        if (!copydefault) {
            cancelVar.component1 = iArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            int i14 = $11 + 1;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            while (cancelVar.component3 < cancelVar.component1) {
                int i16 = $11 + 43;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                cArr5[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                cancelVar.component3++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i18 = $11 + 91;
        $10 = i18 % 128;
        int i19 = i18 % 2;
        cancelVar.component1 = cArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        cancelVar.component3 = 0;
        int i20 = $11 + 11;
        $10 = i20 % 128;
        int i21 = i20 % 2;
        while (cancelVar.component3 < cancelVar.component1) {
            cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
            Object[] objArr5 = {cancelVar, cancelVar};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
            if (objCopydefault4 == null) {
                byte b4 = (byte) 0;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2748 - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 18, (char) (TextUtils.lastIndexOf("", '0', 0) + 7645), -327556343, false, $$r((byte) 42, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    private static void h(byte[] bArr, boolean z, int[] iArr, Object[] objArr) throws Throwable {
        char[] cArr;
        char c2;
        int i = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = component1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 657, 14 - ExpandableListView.getPackedPositionType(0L), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 65117), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i6++;
                    int i7 = $11 + 29;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
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
            int i9 = $10 + 11;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
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
                    int i10 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr3 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 5;
                        byte b3 = (byte) (b2 - 5);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0, 0) + 4503, Process.getGidForName("") + 37, (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27897), -1464227204, false, $$r(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i10] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3628 - AndroidCharacter.getMirror('0'), 27 - MotionEvent.axisFromString(""), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 1180380354, false, $$r(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i11] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (b6 - 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.keyCodeFromString("") + 1859, Color.red(0) + 34, (char) TextUtils.indexOf("", "", 0, 0), 80302927, false, $$r(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr4, 0, cArr5, 0, i3);
            int i12 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr4, i12, i5);
            System.arraycopy(cArr5, i5, cArr4, 0, i12);
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
                int i13 = $11 + 7;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                cArr4[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr4[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    @Override
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 98, new byte[]{-120, -120, -117, -118, -123, -124, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, null, null, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 98, new byte[]{-125, -122, -114, -115, -116}, null, null, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                h(new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1}, false, new int[]{0, 26, 173, 0}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952716_res_0x7f13044c).substring(6, 7).codePointAt(0) + 95, new byte[]{-126, -123, -122, -112, -127, -118, -122, -109, -110, -110, -111, -112, -126, -117, -124, -124, -113, -118}, null, null, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getEdgeSlop() >> 16), 42 - ExpandableListView.getPackedPositionType(0L), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 98, new byte[]{-101, -99, -104, -99, -100, -103, -99, -105, -127, -118, -108, -97, -107, -103, -127, -117, -106, -106, -127, -101, -99, -106, -98, -99, -117, -105, -102, -127, -100, -100, -107, -101, -105, -117, -102, -108, -108, -105, -118, -103, -117, -118, -104, -105, -106, -107, -108, -127}, null, null, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(20) + 19, new byte[]{-108, -105, -108, -102, -98, -108, -102, -105, -98, -106, -98, -104, -101, -127, -97, -125, -107, -100, -100, -106, -107, -108, -98, -118, -118, -107, -125, -117, -101, -118, -98, -103, -101, -105, -98, -105, -102, -125, -118, -98, -102, -103, -106, -103, -101, -98, -103, -102, -118, -118, -105, -108, -99, -107, -106, -97, -118, -118, -99, -103, -107, -102, -125, -97}, null, null, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    g((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, new byte[]{-118, -100, -99, -105, -97, -98, -117, -127, -101, -103, -103, -107, -108, -118, -104, -107, -118, -97, -108, -103, -104, -108, -105, -104, -117, -98, -125, -107, -103, -118, -105, -103, -106, -102, -102, -125, -102, -105, -125, -99, -105, -98, -104, -97, -100, -100, -118, -117, -101, -100, -103, -104, -106, -118, -118, -105, -100, -97, -105, -107, -125, -98, -106, -103}, null, null, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    g(126 - ExpandableListView.getPackedPositionChild(0L), new byte[]{-120, -112, -126, -117, -91, -117, -94, -97, -91, -94, -112, -120, -117, -93, -126, -122, -94, -122, -110, -127, -94, -116, -123, -118, -121, -117, -124, -127, -113, -92, -120, -125, -124, -127, -113, -93, -121, -112, -120, -127, -118, -112, -127, -117, -124, -96, -112, -121, -101, -118, -104, -99, -97, -97, -105, -107, -100, -99, -106, -102, -104, -98, -100, -105, -94, -94, -95, -120, -110, -112, -112, -96}, null, null, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    g(AndroidCharacter.getMirror('0') + 'O', new byte[]{-102, -121, -99, -107, -121, -108}, null, null, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    h(new byte[]{0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1}, false, new int[]{26, 36, 84, 0}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6563 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), TextUtils.getTrimmedLength("") + 56, (char) Color.red(0), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr12);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
        if (objCopydefault3 == null) {
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 2405;
            int i2 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 25;
            char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            byte[] bArr = $$d;
            Object[] objArr13 = new Object[1];
            i(bArr[22], (byte) 96, bArr[33], objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(tapTimeout, i2, scrollBarFadeDuration, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            int i3 = getRequestBeneficiariesState + 1;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                int modifierMetaStateMask = 2404 - ((byte) KeyEvent.getModifierMetaStateMask());
                int gidForName = Process.getGidForName("") + 27;
                char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                byte[] bArr2 = $$d;
                byte b2 = bArr2[22];
                Object[] objArr14 = new Object[1];
                i(b2, (byte) (b2 | 85), (byte) (-bArr2[8]), objArr14);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(modifierMetaStateMask, gidForName, maxKeyCode, 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            h(new byte[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, true, new int[]{62, 16, 1, 0}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 98, new byte[]{-117, -125, -123, -89, -96, -120, -127, -90, -115, -112, -122, -112, -126, -117, -125, -122}, null, null, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i5 = component4 + 91;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, -279368970};
                byte[] bArr3 = $$s;
                Object[] objArr18 = new Object[1];
                j(bArr3[14], bArr3[127], bArr3[12], objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                j((byte) (-bArr3[1]), bArr3[71], bArr3[12], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int i7 = 2405 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 26;
                    char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte[] bArr4 = $$d;
                    byte b3 = bArr4[22];
                    Object[] objArr20 = new Object[1];
                    i(b3, (byte) (b3 | 85), (byte) (-bArr4[8]), objArr20);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i7, jumpTapTimeout, pressedStateDuration, 24929979, false, (String) objArr20[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    g(126 - MotionEvent.axisFromString(""), new byte[]{-87, -118, -123, -109, -89, -116, -117, -112, -120, -115, -88, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, null, null, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    h(new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, true, new int[]{78, 15, 0, 0}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        int i8 = 2405 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int maximumDrawingCacheSize = 26 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                        byte[] bArr5 = $$d;
                        Object[] objArr23 = new Object[1];
                        i(bArr5[1], (byte) ($$e - 3), bArr5[38], objArr23);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(i8, maximumDrawingCacheSize, capsMode, -1843538389, false, (String) objArr23[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2405;
                        int defaultSize = 26 - View.getDefaultSize(0, 0);
                        char gidForName2 = (char) ((-1) - Process.getGidForName(""));
                        byte[] bArr6 = $$d;
                        Object[] objArr24 = new Object[1];
                        i(bArr6[22], (byte) 96, bArr6[33], objArr24);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(fadingEdgeLength, defaultSize, gidForName2, -2047739879, false, (String) objArr24[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i9 = ((int[]) objArr[0])[0];
        int i10 = ((int[]) objArr[2])[0];
        if (i10 != i9) {
            long j = -1;
            long j2 = ((long) (i10 ^ i9)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6618 - View.resolveSizeAndState(0, 0, 0), 42 - (Process.myTid() >> 22), (char) View.MeasureSpec.makeMeasureSpec(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            int i11 = getRequestBeneficiariesState + 109;
            component4 = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr25 = {1133253468, Long.valueOf(j4), arrayList, null, true};
                Class cls6 = (Class) ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6562, 56 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                byte b4 = $$s[12];
                Object[] objArr26 = new Object[1];
                j((byte) 52, b4, b4, objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(bundle);
        this.queryParams = getIntent().getStringExtra("queryParams");
        this.urlString = getIntent().getStringExtra(RouteUtils.SCHEME_EXECUTE_KEY);
        L.d(this.TAG, "onCreate: urlString=" + this.urlString);
        L.d(this.TAG, "onCreate: queryParams=" + this.queryParams);
        redirect();
        addObserver();
    }

    private void addObserver() {
        int i = 2 % 2;
        ((WebViewViewModel) this.viewModel).getH5AccessTokenResp().observe(this, new Observer() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 43;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                WebDispatcherActivity.$r8$lambda$U1b848CcAbF5xjOP4z9QwmTR0rc(this.f$0, (Resource) obj);
                int i5 = copydefault + 19;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 78 / 0;
                }
            }
        });
        int i2 = component4 + 21;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    private void lambda$addObserver$0(Resource resource) {
        int i = 2 % 2;
        if (resource.loading()) {
            int i2 = getRequestBeneficiariesState + 95;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            DialogManager.showLoading(this);
        } else {
            DialogManager.hideLoading(this);
            int i4 = component4 + 37;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 % 4;
            }
        }
        if (resource.error()) {
            finish();
            ToastUtils.showLong(resource.getMessage());
        } else if (resource.success()) {
            getAccessTokenSuccess((GetH5AccessTokenResp) resource.getData());
        }
    }

    private void redirect() {
        int i = 2 % 2;
        if (!(!TextUtils.isEmpty(this.urlString))) {
            int i2 = getRequestBeneficiariesState + 65;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            finish();
            return;
        }
        Uri uri = SafeUri.parse(this.urlString);
        if (uri != null) {
            String scheme = uri.getScheme();
            if (!TextUtils.isEmpty(scheme)) {
                String lowerCase = scheme.toLowerCase(Locale.ENGLISH);
                lowerCase.hashCode();
                if (lowerCase.equals("coupon")) {
                    finish();
                    return;
                } else if (!(!lowerCase.equals(RouteUtils.SCHEME_MERCHANT))) {
                    ((WebViewViewModel) this.viewModel).getH5AccessToken(uri.getHost());
                    return;
                } else {
                    finish();
                    return;
                }
            }
            int i4 = getRequestBeneficiariesState + 111;
            component4 = i4 % 128;
            if (i4 % 2 == 0) {
                finish();
                return;
            } else {
                finish();
                throw null;
            }
        }
        int i5 = getRequestBeneficiariesState + 81;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        finish();
    }

    private void getAccessTokenSuccess(GetH5AccessTokenResp getH5AccessTokenResp) {
        int i = 2 % 2;
        String accessToken = getH5AccessTokenResp.getAccessToken();
        String url = getH5AccessTokenResp.getUrl();
        if (TextUtils.isEmpty(accessToken)) {
            finish();
            return;
        }
        if (!TextUtils.isEmpty(url)) {
            RouteUtils.routeWithExecute(addAccessTokenRespToUrl(getH5AccessTokenResp, addQuerysToUrl(this.queryParams, url)));
            finish();
            int i2 = getRequestBeneficiariesState + 75;
            component4 = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i3 = getRequestBeneficiariesState + 11;
        component4 = i3 % 128;
        if (i3 % 2 == 0) {
            finish();
        } else {
            finish();
            int i4 = 96 / 0;
        }
    }

    private String addAccessTokenRespToUrl(GetH5AccessTokenResp getH5AccessTokenResp, String str) {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put("appId", getH5AccessTokenResp.getAppId());
        map.put("token", getH5AccessTokenResp.getAccessToken());
        map.put("tradeType", getH5AccessTokenResp.getTradeType());
        String appendUrl = WebViewUtils.getAppendUrl(str, map);
        int i2 = component4 + 43;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return appendUrl;
    }

    private String addQuerysToUrl(String str, String str2) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 35;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        if (TextUtils.isEmpty(str)) {
            int i4 = component4 + 111;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            return str2;
        }
        Uri uri = SafeUri.parse(str);
        if (uri == null) {
            int i6 = component4 + 35;
            getRequestBeneficiariesState = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 56 / 0;
            }
            return str2;
        }
        HashMap<String, String> querys = UriUtils.parseQuerys(uri);
        querys.remove(Extend.REQUEST_BUILD_URI);
        querys.remove(KeysConstants.FUNCTION_NAME);
        querys.remove(KeysConstants.FUNCTION_ICON);
        return UriUtils.getAppendUrl(str2, querys);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.webview.init.WebDispatcherActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = getRequestBeneficiariesState + 107;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            h(new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1}, false, new int[]{0, 26, 173, 0}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952847_res_0x7f1304cf).substring(21, 22).codePointAt(0) + 95, new byte[]{-126, -123, -122, -112, -127, -118, -122, -109, -110, -110, -111, -112, -126, -117, -124, -124, -113, -118}, null, null, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = getRequestBeneficiariesState + 49;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i6 = component4 + 67;
                getRequestBeneficiariesState = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.green(0) + 6618, View.getDefaultSize(0, 0) + 42, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6561, View.MeasureSpec.getSize(0) + 56, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), -960739708, false, "component3", new Class[]{Context.class});
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

    /* JADX WARN: Can't wrap try/catch for region: R(84:840|121|122|828|123|(0)|126|(0)(0)|154|(1:155)|930|208|924|209|(0)|217|(0)|221|222|(6:841|(0)(0)|286|(1:287)|954|340)|(0)(0)|368|837|369|(0)|372|829|373|(0)|376|377|400|831|401|(0)|407|408|915|(0)(0)|447|(1:448)|937|507|(0)|510|(0)(0)|533|(0)(0)|553|(0)|556|(0)|559|(0)(0)|565|586|(0)(0)|604|886|605|(0)|611|(0)|614|615|858|(0)(0)|665|(1:666)|941|728|(0)|731|(0)(0)|737|752|(0)|762|(0)|765|(0)(0)|771|789|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(86:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|903|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|(10:909|32|(2:859|34)|38|39|888|(5:41|42|(1:44)|45|46)(19:48|49|901|50|51|889|52|(2:848|54)|58|59|60|(2:826|62)|66|67|68|(1:70)|71|(1:73)|74)|47|75|(9:78|880|79|(1:81)|82|83|84|872|85))|122|828|123|(1:125)|126|(3:128|(1:130)|131)(19:132|133|922|134|(1:136)|137|138|913|139|(1:141)|142|143|144|(1:146)|147|(1:149)|150|(1:152)|153)|154|(4:157|(3:932|159|935)(12:931|160|(3:162|(3:165|166|163)|936)|167|907|168|(1:170)|171|172|897|173|934)|933|155)|930|208|(8:924|209|(3:211|926|212)|217|(2:219|220)|221|222|841)|(5:224|225|(1:227)|228|229)(68:230|(3:232|839|(66:234|(2:236|(2:238|(2:240|248)(1:241))(4:242|243|244|245))(1:248)|(3:855|357|(1:363)(1:362))(1:367)|368|837|369|(1:371)|372|829|373|(1:375)|376|377|400|831|401|(2:852|403)|407|408|915|(5:410|411|(1:413)|414|415)(21:416|417|928|418|(2:822|420)|424|425|916|426|(2:835|428)|432|433|434|(1:436)|437|438|439|(1:441)(1:442)|443|(1:445)|446)|447|(4:450|(2:452|939)(11:453|(3:455|(3:458|459|456)|940)|460|905|461|(1:463)|464|465|895|466|938)|467|448)|937|507|(1:509)|510|(3:512|(1:514)|515)(14:516|517|(1:519)|520|521|(1:523)|524|867|525|526|(1:528)|529|(1:531)|532)|533|(1:535)(9:536|(3:538|(4:541|(3:950|543|953)(1:952)|951|539)|949)|544|545|(1:547)|548|(1:550)|551|552)|553|(1:555)|556|(1:558)|559|(3:561|(1:563)|564)(16:566|567|(1:569)|570|(1:572)|573|574|(1:576)|577|878|578|579|(1:581)|582|(1:584)|585)|565|586|(1:588)(9:589|(3:591|(2:594|592)|948)|595|596|(1:598)|599|(1:601)|602|603)|604|886|605|(2:871|607)|611|(1:613)|614|615|858|(5:617|618|(1:620)|621|622)(27:623|(16:625|(3:627|(3:629|632|(1:634)(1:635))|636)(2:630|(2:632|(0)(0))(1:636))|728|(1:730)|731|(3:733|(1:735)|736)(13:738|824|739|740|(1:742)|743|891|744|745|(1:747)|748|(1:750)|751)|737|752|(6:755|756|(1:758)|759|760|761)|762|(1:764)|765|(3:767|(1:769)|770)(14:772|773|(1:775)|776|777|(1:779)|780|846|781|782|(1:784)|785|(1:787)|788)|771|789|(1:958)(7:792|793|(1:795)|796|797|798|799))|(19:638|639|874|640|(2:869|642)|646|647|863|648|(3:650|861|651)(1:652)|653|654|655|(1:657)|658|(1:660)|661|(1:663)|664)(15:713|728|(0)|731|(0)(0)|737|752|(0)|762|(0)|765|(0)(0)|771|789|(0)(0))|716|717|833|718|721|722|(1:724)|725|726|727|728|(0)|731|(0)(0)|737|752|(0)|762|(0)|765|(0)(0)|771|789|(0)(0))|665|(4:668|(3:943|670|946)(12:942|671|(3:673|(3:676|677|674)|947)|678|853|679|(1:681)|682|683|842|684|945)|944|666)|941|728|(0)|731|(0)(0)|737|752|(0)|762|(0)|765|(0)(0)|771|789|(0)(0))(4:251|252|253|254))(1:255)|(19:918|257|911|258|(2:850|260)|264|265|899|266|(2:884|268)|272|273|274|(1:276)|277|(1:279)(1:281)|282|(1:284)|285)|340|(0)(0)|368|837|369|(0)|372|829|373|(0)|376|377|400|831|401|(0)|407|408|915|(0)(0)|447|(1:448)|937|507|(0)|510|(0)(0)|533|(0)(0)|553|(0)|556|(0)|559|(0)(0)|565|586|(0)(0)|604|886|605|(0)|611|(0)|614|615|858|(0)(0)|665|(1:666)|941|728|(0)|731|(0)(0)|737|752|(0)|762|(0)|765|(0)(0)|771|789|(0)(0))|286|(4:289|(3:291|292|(2:297|956)(11:298|(3:300|(3:303|304|301)|957)|305|882|306|(1:308)|309|310|876|311|955))(2:295|(0)(0))|312|287)|954|340|(0)(0)|368|837|369|(0)|372|829|373|(0)|376|377|400|831|401|(0)|407|408|915|(0)(0)|447|(1:448)|937|507|(0)|510|(0)(0)|533|(0)(0)|553|(0)|556|(0)|559|(0)(0)|565|586|(0)(0)|604|886|605|(0)|611|(0)|614|615|858|(0)(0)|665|(1:666)|941|728|(0)|731|(0)(0)|737|752|(0)|762|(0)|765|(0)(0)|771|789|(0)(0)|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(95:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|903|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|909|32|(2:859|34)|38|39|888|(5:41|42|(1:44)|45|46)(19:48|49|901|50|51|889|52|(2:848|54)|58|59|60|(2:826|62)|66|67|68|(1:70)|71|(1:73)|74)|47|75|(9:78|880|79|(1:81)|82|83|84|872|85)|122|828|123|(1:125)|126|(3:128|(1:130)|131)(19:132|133|922|134|(1:136)|137|138|913|139|(1:141)|142|143|144|(1:146)|147|(1:149)|150|(1:152)|153)|154|(4:157|(3:932|159|935)(12:931|160|(3:162|(3:165|166|163)|936)|167|907|168|(1:170)|171|172|897|173|934)|933|155)|930|208|(8:924|209|(3:211|926|212)|217|(2:219|220)|221|222|841)|(5:224|225|(1:227)|228|229)(68:230|(3:232|839|(66:234|(2:236|(2:238|(2:240|248)(1:241))(4:242|243|244|245))(1:248)|(3:855|357|(1:363)(1:362))(1:367)|368|837|369|(1:371)|372|829|373|(1:375)|376|377|400|831|401|(2:852|403)|407|408|915|(5:410|411|(1:413)|414|415)(21:416|417|928|418|(2:822|420)|424|425|916|426|(2:835|428)|432|433|434|(1:436)|437|438|439|(1:441)(1:442)|443|(1:445)|446)|447|(4:450|(2:452|939)(11:453|(3:455|(3:458|459|456)|940)|460|905|461|(1:463)|464|465|895|466|938)|467|448)|937|507|(1:509)|510|(3:512|(1:514)|515)(14:516|517|(1:519)|520|521|(1:523)|524|867|525|526|(1:528)|529|(1:531)|532)|533|(1:535)(9:536|(3:538|(4:541|(3:950|543|953)(1:952)|951|539)|949)|544|545|(1:547)|548|(1:550)|551|552)|553|(1:555)|556|(1:558)|559|(3:561|(1:563)|564)(16:566|567|(1:569)|570|(1:572)|573|574|(1:576)|577|878|578|579|(1:581)|582|(1:584)|585)|565|586|(1:588)(9:589|(3:591|(2:594|592)|948)|595|596|(1:598)|599|(1:601)|602|603)|604|886|605|(2:871|607)|611|(1:613)|614|615|858|(5:617|618|(1:620)|621|622)(27:623|(16:625|(3:627|(3:629|632|(1:634)(1:635))|636)(2:630|(2:632|(0)(0))(1:636))|728|(1:730)|731|(3:733|(1:735)|736)(13:738|824|739|740|(1:742)|743|891|744|745|(1:747)|748|(1:750)|751)|737|752|(6:755|756|(1:758)|759|760|761)|762|(1:764)|765|(3:767|(1:769)|770)(14:772|773|(1:775)|776|777|(1:779)|780|846|781|782|(1:784)|785|(1:787)|788)|771|789|(1:958)(7:792|793|(1:795)|796|797|798|799))|(19:638|639|874|640|(2:869|642)|646|647|863|648|(3:650|861|651)(1:652)|653|654|655|(1:657)|658|(1:660)|661|(1:663)|664)(15:713|728|(0)|731|(0)(0)|737|752|(0)|762|(0)|765|(0)(0)|771|789|(0)(0))|716|717|833|718|721|722|(1:724)|725|726|727|728|(0)|731|(0)(0)|737|752|(0)|762|(0)|765|(0)(0)|771|789|(0)(0))|665|(4:668|(3:943|670|946)(12:942|671|(3:673|(3:676|677|674)|947)|678|853|679|(1:681)|682|683|842|684|945)|944|666)|941|728|(0)|731|(0)(0)|737|752|(0)|762|(0)|765|(0)(0)|771|789|(0)(0))(4:251|252|253|254))(1:255)|(19:918|257|911|258|(2:850|260)|264|265|899|266|(2:884|268)|272|273|274|(1:276)|277|(1:279)(1:281)|282|(1:284)|285)|340|(0)(0)|368|837|369|(0)|372|829|373|(0)|376|377|400|831|401|(0)|407|408|915|(0)(0)|447|(1:448)|937|507|(0)|510|(0)(0)|533|(0)(0)|553|(0)|556|(0)|559|(0)(0)|565|586|(0)(0)|604|886|605|(0)|611|(0)|614|615|858|(0)(0)|665|(1:666)|941|728|(0)|731|(0)(0)|737|752|(0)|762|(0)|765|(0)(0)|771|789|(0)(0))|286|(4:289|(3:291|292|(2:297|956)(11:298|(3:300|(3:303|304|301)|957)|305|882|306|(1:308)|309|310|876|311|955))(2:295|(0)(0))|312|287)|954|340|(0)(0)|368|837|369|(0)|372|829|373|(0)|376|377|400|831|401|(0)|407|408|915|(0)(0)|447|(1:448)|937|507|(0)|510|(0)(0)|533|(0)(0)|553|(0)|556|(0)|559|(0)(0)|565|586|(0)(0)|604|886|605|(0)|611|(0)|614|615|858|(0)(0)|665|(1:666)|941|728|(0)|731|(0)(0)|737|752|(0)|762|(0)|765|(0)(0)|771|789|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x1a12, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x1a13, code lost:
    
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x1a2a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x1a2b, code lost:
    
        r7 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x1a2c, code lost:
    
        r1 = r0;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:697:0x2cd5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:698:0x2cd6, code lost:
    
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x2cf5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:715:0x2cf6, code lost:
    
        r3 = r26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x06fd A[Catch: all -> 0x0305, TryCatch #46 {all -> 0x0305, blocks: (B:350:0x1308, B:352:0x130e, B:353:0x1337, B:756:0x30a1, B:758:0x30a7, B:759:0x30cf, B:793:0x33ea, B:795:0x33f0, B:796:0x3413, B:773:0x3220, B:775:0x3243, B:776:0x3297, B:722:0x2d61, B:724:0x2d67, B:725:0x2d98, B:596:0x2645, B:598:0x264b, B:599:0x267b, B:601:0x26b5, B:602:0x2700, B:567:0x22e4, B:569:0x22f9, B:570:0x232b, B:572:0x235f, B:573:0x23db, B:545:0x1f5b, B:547:0x1f61, B:548:0x1f8e, B:550:0x1fc8, B:551:0x2014, B:517:0x1c9f, B:519:0x1cb4, B:520:0x1ce8, B:501:0x1aae, B:503:0x1ab4, B:504:0x1adb, B:394:0x154c, B:396:0x1552, B:397:0x1580, B:202:0x0c0f, B:204:0x0c15, B:205:0x0c3e, B:116:0x06f7, B:118:0x06fd, B:119:0x0727, B:19:0x0123, B:21:0x0129, B:22:0x014f, B:24:0x0271, B:26:0x02a2, B:27:0x02ff), top: B:903:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x07b6 A[Catch: all -> 0x0ba6, TryCatch #3 {all -> 0x0ba6, blocks: (B:123:0x07b0, B:125:0x07b6, B:126:0x07f8, B:128:0x0805, B:130:0x080e, B:131:0x0850, B:154:0x0a74, B:155:0x0a78, B:157:0x0a7e, B:160:0x0a95, B:163:0x0aa2, B:165:0x0aa5, B:177:0x0b80, B:179:0x0b86, B:180:0x0b87, B:182:0x0b89, B:184:0x0b90, B:185:0x0b91, B:132:0x085b, B:144:0x0963, B:146:0x0969, B:147:0x09aa, B:149:0x09d4, B:150:0x0a17, B:152:0x0a2d, B:153:0x0a6e, B:187:0x0b93, B:189:0x0b9a, B:190:0x0b9b, B:192:0x0b9d, B:194:0x0ba4, B:195:0x0ba5, B:173:0x0b08, B:168:0x0ad1, B:170:0x0ad7, B:171:0x0b00, B:139:0x08cd, B:141:0x08e9, B:142:0x0957, B:134:0x087b, B:136:0x0890, B:137:0x08c6), top: B:828:0x07b0, outer: #10, inners: #43, #48, #51, #56 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0805 A[Catch: all -> 0x0ba6, TryCatch #3 {all -> 0x0ba6, blocks: (B:123:0x07b0, B:125:0x07b6, B:126:0x07f8, B:128:0x0805, B:130:0x080e, B:131:0x0850, B:154:0x0a74, B:155:0x0a78, B:157:0x0a7e, B:160:0x0a95, B:163:0x0aa2, B:165:0x0aa5, B:177:0x0b80, B:179:0x0b86, B:180:0x0b87, B:182:0x0b89, B:184:0x0b90, B:185:0x0b91, B:132:0x085b, B:144:0x0963, B:146:0x0969, B:147:0x09aa, B:149:0x09d4, B:150:0x0a17, B:152:0x0a2d, B:153:0x0a6e, B:187:0x0b93, B:189:0x0b9a, B:190:0x0b9b, B:192:0x0b9d, B:194:0x0ba4, B:195:0x0ba5, B:173:0x0b08, B:168:0x0ad1, B:170:0x0ad7, B:171:0x0b00, B:139:0x08cd, B:141:0x08e9, B:142:0x0957, B:134:0x087b, B:136:0x0890, B:137:0x08c6), top: B:828:0x07b0, outer: #10, inners: #43, #48, #51, #56 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x085b A[Catch: all -> 0x0ba6, TRY_LEAVE, TryCatch #3 {all -> 0x0ba6, blocks: (B:123:0x07b0, B:125:0x07b6, B:126:0x07f8, B:128:0x0805, B:130:0x080e, B:131:0x0850, B:154:0x0a74, B:155:0x0a78, B:157:0x0a7e, B:160:0x0a95, B:163:0x0aa2, B:165:0x0aa5, B:177:0x0b80, B:179:0x0b86, B:180:0x0b87, B:182:0x0b89, B:184:0x0b90, B:185:0x0b91, B:132:0x085b, B:144:0x0963, B:146:0x0969, B:147:0x09aa, B:149:0x09d4, B:150:0x0a17, B:152:0x0a2d, B:153:0x0a6e, B:187:0x0b93, B:189:0x0b9a, B:190:0x0b9b, B:192:0x0b9d, B:194:0x0ba4, B:195:0x0ba5, B:173:0x0b08, B:168:0x0ad1, B:170:0x0ad7, B:171:0x0b00, B:139:0x08cd, B:141:0x08e9, B:142:0x0957, B:134:0x087b, B:136:0x0890, B:137:0x08c6), top: B:828:0x07b0, outer: #10, inners: #43, #48, #51, #56 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0a7e A[Catch: all -> 0x0ba6, TryCatch #3 {all -> 0x0ba6, blocks: (B:123:0x07b0, B:125:0x07b6, B:126:0x07f8, B:128:0x0805, B:130:0x080e, B:131:0x0850, B:154:0x0a74, B:155:0x0a78, B:157:0x0a7e, B:160:0x0a95, B:163:0x0aa2, B:165:0x0aa5, B:177:0x0b80, B:179:0x0b86, B:180:0x0b87, B:182:0x0b89, B:184:0x0b90, B:185:0x0b91, B:132:0x085b, B:144:0x0963, B:146:0x0969, B:147:0x09aa, B:149:0x09d4, B:150:0x0a17, B:152:0x0a2d, B:153:0x0a6e, B:187:0x0b93, B:189:0x0b9a, B:190:0x0b9b, B:192:0x0b9d, B:194:0x0ba4, B:195:0x0ba5, B:173:0x0b08, B:168:0x0ad1, B:170:0x0ad7, B:171:0x0b00, B:139:0x08cd, B:141:0x08e9, B:142:0x0957, B:134:0x087b, B:136:0x0890, B:137:0x08c6), top: B:828:0x07b0, outer: #10, inners: #43, #48, #51, #56 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0cd5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0d4c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0da6  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0e03  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x1135  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x1170 A[PHI: r7
  0x1170: PHI (r7v146 ??) = (r7v247 ??), (r7v248 ??) binds: [B:296:0x116e, B:293:0x1156] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x1173 A[Catch: all -> 0x1295, PHI: r3 r4 r5 r6
  0x1173: PHI (r3v427 java.lang.Object[]) = (r3v426 java.lang.Object[]), (r3v445 java.lang.Object[]) binds: [B:296:0x116e, B:293:0x1156] A[DONT_GENERATE, DONT_INLINE]
  0x1173: PHI (r4v548 char) = (r4v547 char), (r4v564 char) binds: [B:296:0x116e, B:293:0x1156] A[DONT_GENERATE, DONT_INLINE]
  0x1173: PHI (r5v507 int) = (r5v506 int), (r5v521 int) binds: [B:296:0x116e, B:293:0x1156] A[DONT_GENERATE, DONT_INLINE]
  0x1173: PHI (r6v515 int) = (r6v617 int), (r6v618 int) binds: [B:296:0x116e, B:293:0x1156] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #54 {all -> 0x1295, blocks: (B:286:0x112b, B:287:0x112f, B:298:0x1173, B:295:0x1159, B:257:0x0e4c, B:274:0x1005, B:277:0x1053, B:282:0x10c8, B:285:0x1125), top: B:918:0x0e4c }] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x130e A[Catch: all -> 0x0305, TryCatch #46 {all -> 0x0305, blocks: (B:350:0x1308, B:352:0x130e, B:353:0x1337, B:756:0x30a1, B:758:0x30a7, B:759:0x30cf, B:793:0x33ea, B:795:0x33f0, B:796:0x3413, B:773:0x3220, B:775:0x3243, B:776:0x3297, B:722:0x2d61, B:724:0x2d67, B:725:0x2d98, B:596:0x2645, B:598:0x264b, B:599:0x267b, B:601:0x26b5, B:602:0x2700, B:567:0x22e4, B:569:0x22f9, B:570:0x232b, B:572:0x235f, B:573:0x23db, B:545:0x1f5b, B:547:0x1f61, B:548:0x1f8e, B:550:0x1fc8, B:551:0x2014, B:517:0x1c9f, B:519:0x1cb4, B:520:0x1ce8, B:501:0x1aae, B:503:0x1ab4, B:504:0x1adb, B:394:0x154c, B:396:0x1552, B:397:0x1580, B:202:0x0c0f, B:204:0x0c15, B:205:0x0c3e, B:116:0x06f7, B:118:0x06fd, B:119:0x0727, B:19:0x0123, B:21:0x0129, B:22:0x014f, B:24:0x0271, B:26:0x02a2, B:27:0x02ff), top: B:903:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x13d0  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x13e7 A[Catch: all -> 0x14b2, TryCatch #8 {all -> 0x14b2, blocks: (B:369:0x13d2, B:371:0x13e7, B:372:0x141d), top: B:837:0x13d2, outer: #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x1430 A[Catch: all -> 0x14a8, TryCatch #4 {all -> 0x14a8, blocks: (B:373:0x1423, B:375:0x1430, B:376:0x149f), top: B:829:0x1423, outer: #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x165b  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x16be A[Catch: all -> 0x1a2a, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x1a2a, blocks: (B:401:0x15ff, B:407:0x164e, B:416:0x16be, B:434:0x17c2, B:437:0x180d), top: B:831:0x15ff }] */
    /* JADX WARN: Removed duplicated region for block: B:450:0x18ee A[Catch: all -> 0x1a12, TryCatch #52 {all -> 0x1a12, blocks: (B:447:0x18e4, B:448:0x18e8, B:450:0x18ee, B:453:0x1908, B:456:0x1915, B:458:0x1918, B:470:0x1a00, B:472:0x1a06, B:473:0x1a07, B:475:0x1a09, B:477:0x1a10, B:478:0x1a11, B:439:0x181b, B:441:0x1838, B:443:0x1883, B:445:0x1899, B:446:0x18dc, B:483:0x1a17, B:485:0x1a1d, B:486:0x1a1e, B:489:0x1a22, B:491:0x1a28, B:492:0x1a29, B:466:0x1981, B:461:0x1946, B:463:0x194c, B:464:0x1979), top: B:915:0x1659, inners: #42, #47 }] */
    /* JADX WARN: Removed duplicated region for block: B:503:0x1ab4 A[Catch: all -> 0x0305, TryCatch #46 {all -> 0x0305, blocks: (B:350:0x1308, B:352:0x130e, B:353:0x1337, B:756:0x30a1, B:758:0x30a7, B:759:0x30cf, B:793:0x33ea, B:795:0x33f0, B:796:0x3413, B:773:0x3220, B:775:0x3243, B:776:0x3297, B:722:0x2d61, B:724:0x2d67, B:725:0x2d98, B:596:0x2645, B:598:0x264b, B:599:0x267b, B:601:0x26b5, B:602:0x2700, B:567:0x22e4, B:569:0x22f9, B:570:0x232b, B:572:0x235f, B:573:0x23db, B:545:0x1f5b, B:547:0x1f61, B:548:0x1f8e, B:550:0x1fc8, B:551:0x2014, B:517:0x1c9f, B:519:0x1cb4, B:520:0x1ce8, B:501:0x1aae, B:503:0x1ab4, B:504:0x1adb, B:394:0x154c, B:396:0x1552, B:397:0x1580, B:202:0x0c0f, B:204:0x0c15, B:205:0x0c3e, B:116:0x06f7, B:118:0x06fd, B:119:0x0727, B:19:0x0123, B:21:0x0129, B:22:0x014f, B:24:0x0271, B:26:0x02a2, B:27:0x02ff), top: B:903:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:509:0x1b60  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x1bb2  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x1c7f  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x1e2a  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x1f0c  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x211f  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x2187  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x21e1  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x22c4  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x2517  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x2604  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x288e A[Catch: all -> 0x2861, TRY_ENTER, TRY_LEAVE, TryCatch #28 {all -> 0x2861, blocks: (B:607:0x281d, B:613:0x288e, B:618:0x28ee, B:620:0x28f4, B:621:0x293a, B:627:0x2957, B:632:0x2964, B:636:0x2970, B:630:0x2960), top: B:871:0x281d }] */
    /* JADX WARN: Removed duplicated region for block: B:617:0x28eb  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x2947  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x296d  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x296e  */
    /* JADX WARN: Removed duplicated region for block: B:668:0x2bb5 A[Catch: all -> 0x2cd5, TryCatch #21 {all -> 0x2cd5, blocks: (B:665:0x2bab, B:666:0x2baf, B:668:0x2bb5, B:671:0x2bcd, B:674:0x2bda, B:676:0x2bdd, B:688:0x2cc3, B:690:0x2cc9, B:691:0x2cca, B:693:0x2ccc, B:695:0x2cd3, B:696:0x2cd4, B:655:0x2a96, B:657:0x2a9c, B:658:0x2ade, B:660:0x2b08, B:661:0x2b4a, B:663:0x2b60, B:664:0x2ba5, B:703:0x2cdc, B:705:0x2ce3, B:706:0x2ce4, B:709:0x2ce9, B:711:0x2cef, B:712:0x2cf0, B:684:0x2c48, B:679:0x2c09, B:681:0x2c0f, B:682:0x2c40), top: B:858:0x28e9, inners: #12, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:724:0x2d67 A[Catch: all -> 0x0305, TryCatch #46 {all -> 0x0305, blocks: (B:350:0x1308, B:352:0x130e, B:353:0x1337, B:756:0x30a1, B:758:0x30a7, B:759:0x30cf, B:793:0x33ea, B:795:0x33f0, B:796:0x3413, B:773:0x3220, B:775:0x3243, B:776:0x3297, B:722:0x2d61, B:724:0x2d67, B:725:0x2d98, B:596:0x2645, B:598:0x264b, B:599:0x267b, B:601:0x26b5, B:602:0x2700, B:567:0x22e4, B:569:0x22f9, B:570:0x232b, B:572:0x235f, B:573:0x23db, B:545:0x1f5b, B:547:0x1f61, B:548:0x1f8e, B:550:0x1fc8, B:551:0x2014, B:517:0x1c9f, B:519:0x1cb4, B:520:0x1ce8, B:501:0x1aae, B:503:0x1ab4, B:504:0x1adb, B:394:0x154c, B:396:0x1552, B:397:0x1580, B:202:0x0c0f, B:204:0x0c15, B:205:0x0c3e, B:116:0x06f7, B:118:0x06fd, B:119:0x0727, B:19:0x0123, B:21:0x0129, B:22:0x014f, B:24:0x0271, B:26:0x02a2, B:27:0x02ff), top: B:903:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:730:0x2e1b  */
    /* JADX WARN: Removed duplicated region for block: B:733:0x2e6a  */
    /* JADX WARN: Removed duplicated region for block: B:738:0x2ec4  */
    /* JADX WARN: Removed duplicated region for block: B:755:0x307e  */
    /* JADX WARN: Removed duplicated region for block: B:764:0x315a  */
    /* JADX WARN: Removed duplicated region for block: B:767:0x31b1  */
    /* JADX WARN: Removed duplicated region for block: B:772:0x3202  */
    /* JADX WARN: Removed duplicated region for block: B:792:0x33ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:852:0x1605 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:855:0x13b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:871:0x281d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:958:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v125 */
    /* JADX WARN: Type inference failed for: r11v126 */
    /* JADX WARN: Type inference failed for: r11v127 */
    /* JADX WARN: Type inference failed for: r11v128 */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v51, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v52, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v62 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v111 */
    /* JADX WARN: Type inference failed for: r12v112 */
    /* JADX WARN: Type inference failed for: r12v113 */
    /* JADX WARN: Type inference failed for: r12v114 */
    /* JADX WARN: Type inference failed for: r12v116 */
    /* JADX WARN: Type inference failed for: r12v117 */
    /* JADX WARN: Type inference failed for: r12v120 */
    /* JADX WARN: Type inference failed for: r12v121 */
    /* JADX WARN: Type inference failed for: r12v129 */
    /* JADX WARN: Type inference failed for: r12v130 */
    /* JADX WARN: Type inference failed for: r12v131 */
    /* JADX WARN: Type inference failed for: r12v132 */
    /* JADX WARN: Type inference failed for: r12v136 */
    /* JADX WARN: Type inference failed for: r12v137 */
    /* JADX WARN: Type inference failed for: r12v138 */
    /* JADX WARN: Type inference failed for: r12v144 */
    /* JADX WARN: Type inference failed for: r12v145 */
    /* JADX WARN: Type inference failed for: r12v146 */
    /* JADX WARN: Type inference failed for: r12v148 */
    /* JADX WARN: Type inference failed for: r12v150, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v151 */
    /* JADX WARN: Type inference failed for: r12v152 */
    /* JADX WARN: Type inference failed for: r12v154 */
    /* JADX WARN: Type inference failed for: r12v155 */
    /* JADX WARN: Type inference failed for: r12v156 */
    /* JADX WARN: Type inference failed for: r12v158 */
    /* JADX WARN: Type inference failed for: r12v159 */
    /* JADX WARN: Type inference failed for: r12v160 */
    /* JADX WARN: Type inference failed for: r12v161 */
    /* JADX WARN: Type inference failed for: r12v170 */
    /* JADX WARN: Type inference failed for: r12v171 */
    /* JADX WARN: Type inference failed for: r12v172 */
    /* JADX WARN: Type inference failed for: r12v173 */
    /* JADX WARN: Type inference failed for: r12v174 */
    /* JADX WARN: Type inference failed for: r12v175 */
    /* JADX WARN: Type inference failed for: r12v176 */
    /* JADX WARN: Type inference failed for: r12v177 */
    /* JADX WARN: Type inference failed for: r12v178 */
    /* JADX WARN: Type inference failed for: r12v179 */
    /* JADX WARN: Type inference failed for: r12v180 */
    /* JADX WARN: Type inference failed for: r12v181 */
    /* JADX WARN: Type inference failed for: r12v182 */
    /* JADX WARN: Type inference failed for: r12v183 */
    /* JADX WARN: Type inference failed for: r12v184 */
    /* JADX WARN: Type inference failed for: r12v185 */
    /* JADX WARN: Type inference failed for: r12v186 */
    /* JADX WARN: Type inference failed for: r12v187 */
    /* JADX WARN: Type inference failed for: r12v188 */
    /* JADX WARN: Type inference failed for: r12v189 */
    /* JADX WARN: Type inference failed for: r12v190 */
    /* JADX WARN: Type inference failed for: r12v191 */
    /* JADX WARN: Type inference failed for: r12v192 */
    /* JADX WARN: Type inference failed for: r12v193 */
    /* JADX WARN: Type inference failed for: r12v194 */
    /* JADX WARN: Type inference failed for: r12v195 */
    /* JADX WARN: Type inference failed for: r12v196 */
    /* JADX WARN: Type inference failed for: r12v197 */
    /* JADX WARN: Type inference failed for: r12v198 */
    /* JADX WARN: Type inference failed for: r12v199 */
    /* JADX WARN: Type inference failed for: r12v200 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r12v53 */
    /* JADX WARN: Type inference failed for: r12v54 */
    /* JADX WARN: Type inference failed for: r12v55 */
    /* JADX WARN: Type inference failed for: r12v56 */
    /* JADX WARN: Type inference failed for: r12v57 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r1v568 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v579, types: [int] */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v580 */
    /* JADX WARN: Type inference failed for: r1v581 */
    /* JADX WARN: Type inference failed for: r1v582 */
    /* JADX WARN: Type inference failed for: r1v583 */
    /* JADX WARN: Type inference failed for: r1v584 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v591 */
    /* JADX WARN: Type inference failed for: r1v595 */
    /* JADX WARN: Type inference failed for: r1v596 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v698 */
    /* JADX WARN: Type inference failed for: r1v699 */
    /* JADX WARN: Type inference failed for: r1v700 */
    /* JADX WARN: Type inference failed for: r1v701 */
    /* JADX WARN: Type inference failed for: r1v702 */
    /* JADX WARN: Type inference failed for: r1v703 */
    /* JADX WARN: Type inference failed for: r1v704 */
    /* JADX WARN: Type inference failed for: r26v23 */
    /* JADX WARN: Type inference failed for: r26v24 */
    /* JADX WARN: Type inference failed for: r26v58 */
    /* JADX WARN: Type inference failed for: r2v525, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v529 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v547 */
    /* JADX WARN: Type inference failed for: r2v548 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v562, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v582 */
    /* JADX WARN: Type inference failed for: r2v684 */
    /* JADX WARN: Type inference failed for: r2v685 */
    /* JADX WARN: Type inference failed for: r3v159 */
    /* JADX WARN: Type inference failed for: r3v160 */
    /* JADX WARN: Type inference failed for: r3v161 */
    /* JADX WARN: Type inference failed for: r3v162, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v170 */
    /* JADX WARN: Type inference failed for: r3v176, types: [long] */
    /* JADX WARN: Type inference failed for: r3v177 */
    /* JADX WARN: Type inference failed for: r3v178 */
    /* JADX WARN: Type inference failed for: r3v205 */
    /* JADX WARN: Type inference failed for: r3v206 */
    /* JADX WARN: Type inference failed for: r3v538 */
    /* JADX WARN: Type inference failed for: r3v540 */
    /* JADX WARN: Type inference failed for: r3v541 */
    /* JADX WARN: Type inference failed for: r4v608 */
    /* JADX WARN: Type inference failed for: r7v104 */
    /* JADX WARN: Type inference failed for: r7v126, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v127 */
    /* JADX WARN: Type inference failed for: r7v128 */
    /* JADX WARN: Type inference failed for: r7v129 */
    /* JADX WARN: Type inference failed for: r7v133 */
    /* JADX WARN: Type inference failed for: r7v141 */
    /* JADX WARN: Type inference failed for: r7v142 */
    /* JADX WARN: Type inference failed for: r7v143 */
    /* JADX WARN: Type inference failed for: r7v146 */
    /* JADX WARN: Type inference failed for: r7v147 */
    /* JADX WARN: Type inference failed for: r7v157 */
    /* JADX WARN: Type inference failed for: r7v160 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v228 */
    /* JADX WARN: Type inference failed for: r7v229 */
    /* JADX WARN: Type inference failed for: r7v230 */
    /* JADX WARN: Type inference failed for: r7v231 */
    /* JADX WARN: Type inference failed for: r7v232 */
    /* JADX WARN: Type inference failed for: r7v233 */
    /* JADX WARN: Type inference failed for: r7v234 */
    /* JADX WARN: Type inference failed for: r7v235 */
    /* JADX WARN: Type inference failed for: r7v236 */
    /* JADX WARN: Type inference failed for: r7v237 */
    /* JADX WARN: Type inference failed for: r7v238 */
    /* JADX WARN: Type inference failed for: r7v239 */
    /* JADX WARN: Type inference failed for: r7v240 */
    /* JADX WARN: Type inference failed for: r7v241 */
    /* JADX WARN: Type inference failed for: r7v242 */
    /* JADX WARN: Type inference failed for: r7v243 */
    /* JADX WARN: Type inference failed for: r7v244 */
    /* JADX WARN: Type inference failed for: r7v245 */
    /* JADX WARN: Type inference failed for: r7v246 */
    /* JADX WARN: Type inference failed for: r7v247 */
    /* JADX WARN: Type inference failed for: r7v248 */
    /* JADX WARN: Type inference failed for: r7v249 */
    /* JADX WARN: Type inference failed for: r7v250 */
    /* JADX WARN: Type inference failed for: r7v251 */
    /* JADX WARN: Type inference failed for: r7v252 */
    /* JADX WARN: Type inference failed for: r7v253 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r7v65 */
    /* JADX WARN: Type inference failed for: r7v66 */
    /* JADX WARN: Type inference failed for: r7v67 */
    /* JADX WARN: Type inference failed for: r7v70 */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v77, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v82 */
    /* JADX WARN: Type inference failed for: r7v83 */
    /* JADX WARN: Type inference failed for: r7v87 */
    /* JADX WARN: Type inference failed for: r7v88 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v322 */
    /* JADX WARN: Type inference failed for: r8v323 */
    /* JADX WARN: Type inference failed for: r8v324 */
    /* JADX WARN: Type inference failed for: r8v325 */
    /* JADX WARN: Type inference failed for: r8v346 */
    /* JADX WARN: Type inference failed for: r8v347 */
    /* JADX WARN: Type inference failed for: r8v348 */
    /* JADX WARN: Type inference failed for: r8v349 */
    /* JADX WARN: Type inference failed for: r8v356 */
    /* JADX WARN: Type inference failed for: r8v361 */
    /* JADX WARN: Type inference failed for: r8v362 */
    /* JADX WARN: Type inference failed for: r8v366 */
    /* JADX WARN: Type inference failed for: r8v367 */
    /* JADX WARN: Type inference failed for: r8v368 */
    /* JADX WARN: Type inference failed for: r8v369 */
    /* JADX WARN: Type inference failed for: r8v370 */
    /* JADX WARN: Type inference failed for: r8v371 */
    /* JADX WARN: Type inference failed for: r8v372 */
    /* JADX WARN: Type inference failed for: r9v157 */
    /* JADX WARN: Type inference failed for: r9v179 */
    /* JADX WARN: Type inference failed for: r9v24, types: [java.lang.String] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 13889
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.webview.init.WebDispatcherActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$U1b848CcAbF5xjOP4z9QwmTR0rc(WebDispatcherActivity webDispatcherActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = component4 + 61;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        webDispatcherActivity.lambda$addObserver$0(resource);
        if (i3 == 0) {
            throw null;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 95;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
    }
}
