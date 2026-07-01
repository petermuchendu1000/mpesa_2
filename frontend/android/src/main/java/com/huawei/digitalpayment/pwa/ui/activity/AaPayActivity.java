package com.huawei.digitalpayment.pwa.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.Observer;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.ToastUtils;
import com.huawei.common.widget.dialog.DialogManager;
import com.huawei.common.widget.dialog.LoadingDialog;
import com.huawei.digitalpayment.pwa.model.response.GetH5AccessTokenResp;
import com.huawei.digitalpayment.pwa.model.response.ScanQrResp;
import com.huawei.digitalpayment.pwa.model.resquest.AnalysisResultRequest;
import com.huawei.digitalpayment.pwa.model.resquest.H5AccessTokenRequest;
import com.huawei.digitalpayment.pwa.viewmodel.PwaViewModel;
import com.huawei.digitalpayment.pwaui.R;
import com.huawei.digitalpayment.pwaui.databinding.LayoutTransparentBinding;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.mpesa.logging.L;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelNotification;
import kotlin.io.encoding.Base64;

public class AaPayActivity extends Hilt_AaPayActivity<LayoutTransparentBinding, PwaViewModel> {
    private LoadingDialog mLoadingDialog;
    String qrCode;
    private HashMap<String, String> queryParams = new HashMap<>();
    String urlString;
    private static final byte[] $$c = {120, 65, 99, 57};
    private static final int $$f = 190;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {73, 121, -48, -56, -14, 0, Base64.padSymbol, -59, -10, -2, 6, -7, 5, TarHeader.LF_DIR, -58, -5, -11, Ascii.VT, 1, -1, -20, Ascii.FF, TarHeader.LF_DIR, -71, Ascii.FF, -16, -2, 8, -8, -1, -7, 67, -56, 1, -8, -2, 0, -15, 66, -61, -7, -8, 13, -15, 2, Ascii.VT, -13, 60, -36, -36, Ascii.VT, 0, -14, -1, 8, -7, -13, 9, -8, -1, -7, -23, 5, -19, Ascii.VT, Ascii.US, -31, -21, 17, 10, 10, -12, -35, 17, -21, 13, -14, 0, -5, -1, -1, 7, -11, -8, 63, -6, -7, 6, 1, -7, -12, 72, -55, -14, -5, 1, -8, -1, 9, -7, 7, -16, 67, -56, -3, 1, -21, Ascii.FF, TarHeader.LF_CONTIG, -61, -7, -8, 13, -15, 2, Ascii.VT, -13, 60, -24, -35, 1, -21, Ascii.FF, 34, -46, -5, 1, -8, -1, 9, -7, 7, Ascii.SUB, -39, 6, -11, 36, -38, -5, 2, 70, -49, -23, 5, -19, Ascii.VT, Ascii.US, -31, -21, 17, 10, 10, -12, -35, 17, -21, 13, -14, 0, -5, -1, -1, 7, -11, -8, SignedBytes.MAX_POWER_OF_TWO};
    private static final int $$h = 107;
    private static final byte[] $$a = {120, -46, -95, -23, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -12, Ascii.FF, -19, -15, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$b = 150;
    private static int getRequestBeneficiariesState = 0;
    private static int getAsAtTimestamp = 1;
    private static char ShareDataUIState = 18968;
    private static char copydefault = 59494;
    private static char component2 = 25897;
    private static char component3 = 58617;
    private static char[] component1 = {54051, 18933, 59039, 865, 47138, 3095, 38541, 14787, 56406, 26440, 2443, 44185, 14173, 55894, 31943, 2004, 43545, 19799, 55199, 31375, 7454, 41012, 19109, 60903, 28709, 6975, 48559, 16620, 60285, 36466, 4284, 48036, 24116, 57644, 35821, 11948, 45422, 21587, 65301, 33154, 9409, 53004, 21061, 62681, 40857, 8720, 50512, 28562, 62165, 38170, 14427, 49822, 25994, 47413, 9121, 36016, 26992, 53823, 48377, 6632, 33322, 28453, 51635, 45730, 8037, 63526, 25323, 53240, 43066, 5396, 65493, 22683, 50435, 44575, 2187, 62875, 24154, 15119, 42390, 3799, 60226, 21513, 16069, 39821, 1051, 57719, 19005, 13472, 37347, 31274, 59241, 16890, 10986, 38708, 28717, 56042, 18336, 8249, 36136, 30702, 53416, 48387, 9751, 32898, 28099, 54872, 45845, 7565, 34449, 25409, 52230, 46794, 5001, 64588, 22788, 50125, 44160, 3102, 38592, 14726, 56384, 26381, 2438, 44245, 14103, 55888, 31889, 2010, 43543, 19805, 55242, 31454, 7453, 41063, 19106, 60896, 28706, 7018, 48555, 16569, 60282, 36456, 4336, 48042, 24178, 57643, 35821, 11966, 45419, 21591, 65287, 33222, 9438, 53081, 21001, 62683, 40842, 8770, 50455, 28627, 62101, 38223, 14366, 49871, 26054, 2165, 37691, 13823, 55551, 25471, 1580, 43251, 13303, 54895, 31018, 997, 42661, 18813, 60472, 30373, 6590, 48324, 18203, 59927, 36038, 6043, 47698, 23822, 59339, 27109, 62322, 23652, 47601, 701, 27768, 51567, 21241, 49084, 6499, 25125, 53231, 10409, 45686, 7977, 30954, 50580, 12117, 34824, 5510, 32413, 55387, 9551, 36546, 60295, 29974, 56833, 15250, 33921, 61007, 19204, 54473, 12704, 39607, 58482, 16695, 64536, 26321, 51584, 11349, 38740, 63956, 23711, 51026, 10757, 35982, 63413, 23133, 48409, 10204, 35467, 60737, 3103, 38608, 14743, 56414, 26378, 2517, 44174, 14145, 55854, 31941, 1937, 43592, 19757, 55235, 31374, 7501, 30759, 58090, 19878, 43122, 4897, 32229, 55470, 17190, 44601, 2279, 29692, 56899, 14631, 41967, 3758, 27005, 54283, 16103, 39310, 1103, 28429, 51655, 3091, 38616, 14739, 56384, 26381, 2521, 44190, 14186, 55811, 31941, 1934, 43604, 19719, 55233, 31375, 23815, 51098, 26753, 36119, 13834, 22729, 64908, 26136, 35602, 11655, 22160, 64341, 7244, 34440, 11212, 19547, 61815, 7094, 48291, 8497, 18984, 60648, 4521, 47675, 57187, 16805, 60130, 3955, 45115, 55976, 32699, 57389, 1304, 44551, 53404, 30163, 40465, 861, 42392, 52951, 29524, 37952, 16004, 41873, 50266, 26954, 37852, 13515, 22887, 49786, 25827, 35237, 12858, 22318, 63977, 25334, 34674, 10295, 21164, 63456, 6185, 48490, 10238, 18620, 34792, 7460, 45616, 22518, 60650, 33402, 10091, 48378, 20898, 63282, 35965, 8624, 50943, 23662, 61737, 38635, 11204, 49408, 26189, 64386, 37071, 13835, 52041, 24798, 1496, 39698, 12295, 54679, 27352, 'N', 42335, 15005, 57256, 29920, 2605, 44910, 17582, 55791, 32549, 5231, 43442, 20210, 58467, 31091, 7869, 46078, 18745, 60972, 33670, 6290, 48720, 21327, 59534, 36250, 9054, 47182, 24007, 62085, 34839, 11602, 49823, 26505, 64841, 37465, 31507, 57815, 20122, 43861, 4118, 32475, 56220, 16475, 44302, 3011};
    private static long equals = 5081553297498805940L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(byte r5, short r6, int r7) {
        /*
            int r6 = r6 + 111
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r5 = r5 * 4
            int r0 = 1 - r5
            byte[] r1 = com.huawei.digitalpayment.pwa.ui.activity.AaPayActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L16
            r3 = r5
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            r3 = r1[r7]
        L26:
            int r3 = -r3
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.ui.activity.AaPayActivity.$$i(byte, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = 103 - r6
            int r0 = r8 + 4
            byte[] r1 = com.huawei.digitalpayment.pwa.ui.activity.AaPayActivity.$$a
            int r7 = 100 - r7
            byte[] r0 = new byte[r0]
            int r8 = r8 + 3
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2b:
            int r6 = -r6
            int r3 = r3 + 1
            int r7 = r7 + r6
            int r6 = r7 + (-8)
            r7 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.ui.activity.AaPayActivity.d(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            byte[] r0 = com.huawei.digitalpayment.pwa.ui.activity.AaPayActivity.$$g
            int r8 = r8 * 3
            int r8 = r8 + 10
            int r7 = r7 * 8
            int r7 = 107 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2e
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            int r6 = r6 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-2)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.ui.activity.AaPayActivity.e(int, short, short, java.lang.Object[]):void");
    }

    private static void c(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        int i4 = $10 + 59;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (cancelnotification.copydefault < i2) {
            int i6 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(component1[i + i6])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTapTimeout() >> 16) + 1758, View.MeasureSpec.getSize(0) + 34, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 1159210934, false, $$i(b2, (byte) (b2 | 10), b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(equals), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b3 = (byte) 0;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3609 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 29, (char) (7171 - Color.red(0)), 1951385784, false, $$i(b3, (byte) (b3 | 6), b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4013, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23, (char) (TextUtils.indexOf("", "") + 27761), -1529629956, false, $$i(b4, (byte) (b4 | Ascii.VT), b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i7 = $10 + 37;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                try {
                    Object[] objArr5 = {cancelnotification, cancelnotification};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                    if (objCopydefault4 == null) {
                        byte b5 = (byte) 0;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4013, (ViewConfiguration.getEdgeSlop() >> 16) + 24, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 27761), -1529629956, false, $$i(b5, (byte) (b5 | Ascii.VT), b5), new Class[]{Object.class, Object.class});
                    }
                    Object obj = null;
                    ((Method) objCopydefault4).invoke(null, objArr5);
                    obj.hashCode();
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr6 = {cancelnotification, cancelnotification};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault5 == null) {
                byte b6 = (byte) 0;
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(Color.rgb(0, 0, 0) + 16781229, Color.green(0) + 24, (char) (TextUtils.indexOf((CharSequence) "", '0') + 27762), -1529629956, false, $$i(b6, (byte) (b6 | Ascii.VT), b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr);
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            cArr3[i4] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i5 = 58224;
            int i6 = i4;
            while (i6 < 16) {
                int i7 = $10 + 107;
                $11 = i7 % 128;
                int i8 = i7 % i2;
                char c2 = cArr3[1];
                char c3 = cArr3[i4];
                int i9 = (c3 + i5) ^ ((c3 << 4) + ((char) (((long) component2) ^ 4374495167426960553L)));
                int i10 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(component3);
                    objArr2[i2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i4] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int windowTouchSlop = 844 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int iResolveSizeAndState = View.resolveSizeAndState(i4, i4, i4) + 32;
                        char c4 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(i4) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i4) == 0.0d ? 0 : -1)) + 23251);
                        byte b2 = (byte) i4;
                        byte b3 = b2;
                        String str$$i = $$i(b2, b3, b3);
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(windowTouchSlop, iResolveSizeAndState, c4, 592652048, false, str$$i, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) ShareDataUIState) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(copydefault)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(844 - (KeyEvent.getMaxKeyCode() >> 16), Process.getGidForName("") + 33, (char) (KeyEvent.normalizeMetaState(0) + 23251), 592652048, false, $$i(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    cArr3 = cArr4;
                    i2 = 2;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[iNotificationSideChannelDefault.component3] = cArr5[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr5[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(465 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 48 - Process.getGidForName(""), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            cArr3 = cArr5;
            i2 = 2;
            i4 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i11 = $10 + 47;
        $11 = i11 % 128;
        int i12 = i11 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x015b  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.ui.activity.AaPayActivity.onCreate(android.os.Bundle):void");
    }

    private void initObserver() {
        int i = 2 % 2;
        ((PwaViewModel) this.viewModel).getScanLiveData().observe(this, new Observer<Resource<ScanQrResp>>() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public void onChanged(Resource<ScanQrResp> resource) {
                int i2 = 2 % 2;
                int i3 = component3 + 23;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                copydefault(resource);
                int i5 = component2 + 3;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 65 / 0;
                }
            }

            public void copydefault(Resource<ScanQrResp> resource) {
                int i2 = 2 % 2;
                if (!(!resource.loading())) {
                    int i3 = component2 + 43;
                    component3 = i3 % 128;
                    if (i3 % 2 != 0) {
                        DialogManager.showLoading(AaPayActivity.this);
                        return;
                    }
                    DialogManager.showLoading(AaPayActivity.this);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                DialogManager.hideLoading(AaPayActivity.this);
                if (resource.success()) {
                    AaPayActivity.m12245$$Nest$mqueryQrCodeResult(AaPayActivity.this, resource.getData());
                }
                if (!(!resource.error())) {
                    int i4 = component2 + 19;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                    ToastUtils.showShort(resource.getException().getResponseDesc());
                }
            }
        });
        ((PwaViewModel) this.viewModel).getGetTokenLiveData().observe(this, new Observer<Resource<GetH5AccessTokenResp>>() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public void onChanged(Resource<GetH5AccessTokenResp> resource) throws Throwable {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 7;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                copydefault(resource);
                if (i4 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void copydefault(Resource<GetH5AccessTokenResp> resource) throws Throwable {
                int i2 = 2 % 2;
                Object obj = null;
                if (!(!resource.loading())) {
                    int i3 = ShareDataUIState + 65;
                    component1 = i3 % 128;
                    if (i3 % 2 != 0) {
                        DialogManager.showLoading(AaPayActivity.this);
                        return;
                    } else {
                        DialogManager.showLoading(AaPayActivity.this);
                        throw null;
                    }
                }
                DialogManager.hideLoading(AaPayActivity.this);
                if (resource.success()) {
                    int i4 = ShareDataUIState + 29;
                    component1 = i4 % 128;
                    if (i4 % 2 != 0) {
                        AaPayActivity.m12243$$Nest$mgetAccessTokenResult(AaPayActivity.this, resource.getData());
                    } else {
                        AaPayActivity.m12243$$Nest$mgetAccessTokenResult(AaPayActivity.this, resource.getData());
                        obj.hashCode();
                        throw null;
                    }
                }
                if (!resource.error()) {
                    return;
                }
                int i5 = ShareDataUIState + 13;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                AaPayActivity.m12244$$Nest$mgetAccessTokenResultFail(AaPayActivity.this);
            }
        });
        int i2 = getRequestBeneficiariesState + 51;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
    }

    private void initData() {
        int i = 2 % 2;
        this.qrCode = getIntent().getStringExtra("qrCode");
        String stringExtra = getIntent().getStringExtra(RouteUtils.SCHEME_EXECUTE_KEY);
        this.urlString = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            int i2 = getRequestBeneficiariesState + 123;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            finish();
            return;
        }
        parseUri(this.urlString);
        int i4 = getAsAtTimestamp + 1;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    private void parseUri(String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 11;
        getAsAtTimestamp = i2 % 128;
        Uri uri = null;
        if (i2 % 2 == 0) {
            Uri.parse(str);
            uri.hashCode();
            throw null;
        }
        uri = Uri.parse(str);
        if (uri == null) {
            return;
        }
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme)) {
            return;
        }
        redirect(scheme.toLowerCase(Locale.ENGLISH));
        int i3 = getAsAtTimestamp + 125;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 57 / 0;
        }
    }

    private void redirect(String str) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 7;
        getRequestBeneficiariesState = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            str.equals(RouteUtils.SCHEME_NATIVE);
            throw null;
        }
        if (str.equals(RouteUtils.SCHEME_NATIVE)) {
            if (TextUtils.isEmpty(this.qrCode)) {
                return;
            }
            ((PwaViewModel) this.viewModel).analysisResult(new AnalysisResultRequest(this.qrCode, "Scan"));
        } else {
            finish();
        }
        int i3 = getRequestBeneficiariesState + 27;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private void queryQrCodeResult(ScanQrResp scanQrResp) {
        Uri uri;
        int i = 2 % 2;
        if (scanQrResp == null) {
            int i2 = getRequestBeneficiariesState + 75;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            finish();
            return;
        }
        if (!isAAPay(scanQrResp)) {
            finish();
            int i4 = getAsAtTimestamp + 5;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        Map<String, String> params = scanQrResp.getParams();
        this.queryParams.put("qrCode", this.qrCode);
        this.queryParams.putAll(params);
        String execute = scanQrResp.getExecute();
        if (TextUtils.isEmpty(execute)) {
            finish();
            return;
        }
        try {
            uri = Uri.parse(execute);
        } catch (Exception e) {
            L.INSTANCE.d(e.getMessage(), new Object[0]);
            finish();
        }
        if (uri == null) {
            finish();
            int i5 = getRequestBeneficiariesState + 103;
            getAsAtTimestamp = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            return;
        }
        ((PwaViewModel) this.viewModel).getH5AccessToken(new H5AccessTokenRequest(new URI(uri.toString()).getHost()));
        int i6 = getAsAtTimestamp + 47;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
    }

    private boolean isAAPay(ScanQrResp scanQrResp) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 57;
        getRequestBeneficiariesState = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Map<String, String> params = scanQrResp.getParams();
            if (params != null) {
                return params.containsValue("AAPay");
            }
            int i3 = getAsAtTimestamp + 61;
            getRequestBeneficiariesState = i3 % 128;
            if (i3 % 2 == 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        }
        scanQrResp.getParams();
        throw null;
    }

    private void getAccessTokenResult(GetH5AccessTokenResp getH5AccessTokenResp) throws Throwable {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 107;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        if (getH5AccessTokenResp == null) {
            int i5 = i3 + 31;
            getAsAtTimestamp = i5 % 128;
            if (i5 % 2 != 0) {
                finish();
                return;
            } else {
                finish();
                int i6 = 21 / 0;
                return;
            }
        }
        String accessToken = getH5AccessTokenResp.getAccessToken();
        String tradeType = getH5AccessTokenResp.getTradeType();
        String appId = getH5AccessTokenResp.getAppId();
        String url = getH5AccessTokenResp.getUrl();
        if (TextUtils.isEmpty(accessToken) || TextUtils.isEmpty(url)) {
            finish();
            return;
        }
        if (this.queryParams == null) {
            this.queryParams = new HashMap<>();
            int i7 = getRequestBeneficiariesState + 99;
            getAsAtTimestamp = i7 % 128;
            int i8 = i7 % 2;
        }
        this.queryParams.put("tradeType", tradeType);
        this.queryParams.put("token", accessToken);
        this.queryParams.put("appId", appId);
        RouteUtils.routeWithExecute(this, url, this.queryParams);
        finish();
    }

    private void getAccessTokenResultFail() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 81;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        finish();
        int i4 = getRequestBeneficiariesState + 67;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 101;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = R.layout.layout_transparent;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = R.layout.layout_transparent;
        int i5 = getAsAtTimestamp + 11;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = getRequestBeneficiariesState + 57;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            b(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(27) - 82, new char[]{41519, 58247, 46166, 57926, 55632, 62748, 20646, 59587, 49849, 45008, 23594, 4976, 60551, 48082, 28388, 51886, 22934, 41319, 25098, 18780, 51180, 43507, 58290, 16588, 59891, 41985}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(18 - (ViewConfiguration.getPressedStateDuration() >> 16), new char[]{30665, 36700, 37471, 16807, 33801, 32576, 9503, 5754, 59691, 6119, 54303, 52540, 64399, 4144, 28388, 51886, 34883, 20561}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i4 = getAsAtTimestamp + 13;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 42, (char) ((-16777216) - Color.rgb(0, 0, 0)), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetBefore("", 0) + 6562, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 55, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -699576857, false, "component2", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                int i6 = getAsAtTimestamp + 87;
                getRequestBeneficiariesState = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onResume();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0095  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.ui.activity.AaPayActivity.onPause():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1008:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x08c3 A[Catch: all -> 0x04ac, TryCatch #9 {all -> 0x04ac, blocks: (B:325:0x13e3, B:327:0x13e9, B:328:0x1418, B:538:0x1dd5, B:540:0x1ddb, B:541:0x1e06, B:770:0x31f6, B:772:0x31fc, B:773:0x3224, B:807:0x3557, B:809:0x355d, B:810:0x358c, B:787:0x3380, B:789:0x33a3, B:790:0x33fb, B:736:0x2ec7, B:738:0x2ecd, B:739:0x2ef6, B:833:0x3672, B:835:0x3678, B:836:0x369a, B:838:0x36d4, B:839:0x3710, B:605:0x268c, B:607:0x26a1, B:608:0x26d1, B:587:0x2388, B:589:0x238e, B:590:0x23b4, B:592:0x23ee, B:593:0x2436, B:558:0x2032, B:560:0x2047, B:561:0x2076, B:563:0x20aa, B:564:0x2128, B:370:0x1623, B:372:0x1629, B:373:0x1655, B:215:0x0e5e, B:217:0x0e64, B:218:0x0e8e, B:116:0x08bd, B:118:0x08c3, B:119:0x08ee, B:19:0x0270, B:21:0x0276, B:22:0x029a, B:24:0x041b, B:26:0x044d, B:27:0x04a6, B:333:0x14a2, B:335:0x14a6, B:356:0x1591, B:358:0x1597, B:359:0x1598, B:361:0x159a, B:363:0x15a1, B:364:0x15a2, B:339:0x14b2, B:127:0x0988, B:129:0x098e, B:130:0x09cf, B:132:0x09dc, B:134:0x09e5, B:135:0x0a28, B:158:0x0c56, B:159:0x0c5a, B:163:0x0c6c, B:169:0x0c9b, B:172:0x0cb2, B:176:0x0cc1, B:177:0x0cc9, B:189:0x0db4, B:191:0x0dba, B:192:0x0dbb, B:194:0x0dbd, B:196:0x0dc4, B:197:0x0dc5, B:166:0x0c84, B:136:0x0a33, B:148:0x0b3b, B:150:0x0b41, B:151:0x0b83, B:153:0x0bad, B:154:0x0bf5, B:156:0x0c0b, B:157:0x0c50, B:200:0x0dcb, B:202:0x0dd2, B:203:0x0dd3, B:205:0x0dd5, B:207:0x0ddc, B:208:0x0ddd), top: B:873:0x0270, inners: #16, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0901  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x098e A[Catch: all -> 0x0dde, TryCatch #34 {all -> 0x0dde, blocks: (B:127:0x0988, B:129:0x098e, B:130:0x09cf, B:132:0x09dc, B:134:0x09e5, B:135:0x0a28, B:158:0x0c56, B:159:0x0c5a, B:163:0x0c6c, B:169:0x0c9b, B:172:0x0cb2, B:176:0x0cc1, B:177:0x0cc9, B:189:0x0db4, B:191:0x0dba, B:192:0x0dbb, B:194:0x0dbd, B:196:0x0dc4, B:197:0x0dc5, B:166:0x0c84, B:136:0x0a33, B:148:0x0b3b, B:150:0x0b41, B:151:0x0b83, B:153:0x0bad, B:154:0x0bf5, B:156:0x0c0b, B:157:0x0c50, B:200:0x0dcb, B:202:0x0dd2, B:203:0x0dd3, B:205:0x0dd5, B:207:0x0ddc, B:208:0x0ddd, B:185:0x0d2f, B:180:0x0cf5, B:182:0x0cfb, B:183:0x0d27, B:143:0x0aa3, B:145:0x0abf, B:146:0x0b2f, B:138:0x0a53, B:140:0x0a68, B:141:0x0a9c), top: B:919:0x0988, outer: #9, inners: #13, #20, #24, #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x09dc A[Catch: all -> 0x0dde, TryCatch #34 {all -> 0x0dde, blocks: (B:127:0x0988, B:129:0x098e, B:130:0x09cf, B:132:0x09dc, B:134:0x09e5, B:135:0x0a28, B:158:0x0c56, B:159:0x0c5a, B:163:0x0c6c, B:169:0x0c9b, B:172:0x0cb2, B:176:0x0cc1, B:177:0x0cc9, B:189:0x0db4, B:191:0x0dba, B:192:0x0dbb, B:194:0x0dbd, B:196:0x0dc4, B:197:0x0dc5, B:166:0x0c84, B:136:0x0a33, B:148:0x0b3b, B:150:0x0b41, B:151:0x0b83, B:153:0x0bad, B:154:0x0bf5, B:156:0x0c0b, B:157:0x0c50, B:200:0x0dcb, B:202:0x0dd2, B:203:0x0dd3, B:205:0x0dd5, B:207:0x0ddc, B:208:0x0ddd, B:185:0x0d2f, B:180:0x0cf5, B:182:0x0cfb, B:183:0x0d27, B:143:0x0aa3, B:145:0x0abf, B:146:0x0b2f, B:138:0x0a53, B:140:0x0a68, B:141:0x0a9c), top: B:919:0x0988, outer: #9, inners: #13, #20, #24, #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0a33 A[Catch: all -> 0x0dde, TRY_LEAVE, TryCatch #34 {all -> 0x0dde, blocks: (B:127:0x0988, B:129:0x098e, B:130:0x09cf, B:132:0x09dc, B:134:0x09e5, B:135:0x0a28, B:158:0x0c56, B:159:0x0c5a, B:163:0x0c6c, B:169:0x0c9b, B:172:0x0cb2, B:176:0x0cc1, B:177:0x0cc9, B:189:0x0db4, B:191:0x0dba, B:192:0x0dbb, B:194:0x0dbd, B:196:0x0dc4, B:197:0x0dc5, B:166:0x0c84, B:136:0x0a33, B:148:0x0b3b, B:150:0x0b41, B:151:0x0b83, B:153:0x0bad, B:154:0x0bf5, B:156:0x0c0b, B:157:0x0c50, B:200:0x0dcb, B:202:0x0dd2, B:203:0x0dd3, B:205:0x0dd5, B:207:0x0ddc, B:208:0x0ddd, B:185:0x0d2f, B:180:0x0cf5, B:182:0x0cfb, B:183:0x0d27, B:143:0x0aa3, B:145:0x0abf, B:146:0x0b2f, B:138:0x0a53, B:140:0x0a68, B:141:0x0a9c), top: B:919:0x0988, outer: #9, inners: #13, #20, #24, #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0c60  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0ca7  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0cfb A[Catch: all -> 0x0dbc, TryCatch #20 {all -> 0x0dbc, blocks: (B:180:0x0cf5, B:182:0x0cfb, B:183:0x0d27), top: B:892:0x0cf5, outer: #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0f18  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0f74  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0fd2 A[Catch: all -> 0x1360, TRY_ENTER, TRY_LEAVE, TryCatch #36 {all -> 0x1360, blocks: (B:222:0x0f12, B:229:0x0f67, B:269:0x120a, B:270:0x120e, B:272:0x1214, B:275:0x1230, B:238:0x0fd2, B:256:0x10df, B:259:0x112b, B:264:0x11a4, B:268:0x1202), top: B:922:0x0f12 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x1214 A[Catch: all -> 0x1360, TryCatch #36 {all -> 0x1360, blocks: (B:222:0x0f12, B:229:0x0f67, B:269:0x120a, B:270:0x120e, B:272:0x1214, B:275:0x1230, B:238:0x0fd2, B:256:0x10df, B:259:0x112b, B:264:0x11a4, B:268:0x1202), top: B:922:0x0f12 }] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x13e9 A[Catch: all -> 0x04ac, TryCatch #9 {all -> 0x04ac, blocks: (B:325:0x13e3, B:327:0x13e9, B:328:0x1418, B:538:0x1dd5, B:540:0x1ddb, B:541:0x1e06, B:770:0x31f6, B:772:0x31fc, B:773:0x3224, B:807:0x3557, B:809:0x355d, B:810:0x358c, B:787:0x3380, B:789:0x33a3, B:790:0x33fb, B:736:0x2ec7, B:738:0x2ecd, B:739:0x2ef6, B:833:0x3672, B:835:0x3678, B:836:0x369a, B:838:0x36d4, B:839:0x3710, B:605:0x268c, B:607:0x26a1, B:608:0x26d1, B:587:0x2388, B:589:0x238e, B:590:0x23b4, B:592:0x23ee, B:593:0x2436, B:558:0x2032, B:560:0x2047, B:561:0x2076, B:563:0x20aa, B:564:0x2128, B:370:0x1623, B:372:0x1629, B:373:0x1655, B:215:0x0e5e, B:217:0x0e64, B:218:0x0e8e, B:116:0x08bd, B:118:0x08c3, B:119:0x08ee, B:19:0x0270, B:21:0x0276, B:22:0x029a, B:24:0x041b, B:26:0x044d, B:27:0x04a6, B:333:0x14a2, B:335:0x14a6, B:356:0x1591, B:358:0x1597, B:359:0x1598, B:361:0x159a, B:363:0x15a1, B:364:0x15a2, B:339:0x14b2, B:127:0x0988, B:129:0x098e, B:130:0x09cf, B:132:0x09dc, B:134:0x09e5, B:135:0x0a28, B:158:0x0c56, B:159:0x0c5a, B:163:0x0c6c, B:169:0x0c9b, B:172:0x0cb2, B:176:0x0cc1, B:177:0x0cc9, B:189:0x0db4, B:191:0x0dba, B:192:0x0dbb, B:194:0x0dbd, B:196:0x0dc4, B:197:0x0dc5, B:166:0x0c84, B:136:0x0a33, B:148:0x0b3b, B:150:0x0b41, B:151:0x0b83, B:153:0x0bad, B:154:0x0bf5, B:156:0x0c0b, B:157:0x0c50, B:200:0x0dcb, B:202:0x0dd2, B:203:0x0dd3, B:205:0x0dd5, B:207:0x0ddc, B:208:0x0ddd), top: B:873:0x0270, inners: #16, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x14bb  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x14d2 A[Catch: all -> 0x1599, TryCatch #60 {all -> 0x1599, blocks: (B:345:0x14bd, B:347:0x14d2, B:348:0x1503), top: B:968:0x14bd, outer: #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x1516 A[Catch: all -> 0x158f, TryCatch #54 {all -> 0x158f, blocks: (B:349:0x1509, B:351:0x1516, B:352:0x1584), top: B:957:0x1509, outer: #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x16dd  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x172c A[Catch: all -> 0x1d6f, PHI: r2
  0x172c: PHI (r2v485 java.lang.Object) = (r2v484 java.lang.Object), (r2v581 java.lang.Object) binds: [B:378:0x16db, B:380:0x16de] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #43 {all -> 0x1d6f, blocks: (B:377:0x16d7, B:384:0x172c), top: B:936:0x16d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x17a7  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x17bc  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x188a  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x1bfa A[Catch: all -> 0x1d3c, TryCatch #19 {all -> 0x1d3c, blocks: (B:469:0x1bf0, B:470:0x1bf4, B:472:0x1bfa, B:475:0x1c16, B:458:0x1b22, B:464:0x1b8a, B:468:0x1be8), top: B:890:0x1b22 }] */
    /* JADX WARN: Removed duplicated region for block: B:540:0x1ddb A[Catch: all -> 0x04ac, TryCatch #9 {all -> 0x04ac, blocks: (B:325:0x13e3, B:327:0x13e9, B:328:0x1418, B:538:0x1dd5, B:540:0x1ddb, B:541:0x1e06, B:770:0x31f6, B:772:0x31fc, B:773:0x3224, B:807:0x3557, B:809:0x355d, B:810:0x358c, B:787:0x3380, B:789:0x33a3, B:790:0x33fb, B:736:0x2ec7, B:738:0x2ecd, B:739:0x2ef6, B:833:0x3672, B:835:0x3678, B:836:0x369a, B:838:0x36d4, B:839:0x3710, B:605:0x268c, B:607:0x26a1, B:608:0x26d1, B:587:0x2388, B:589:0x238e, B:590:0x23b4, B:592:0x23ee, B:593:0x2436, B:558:0x2032, B:560:0x2047, B:561:0x2076, B:563:0x20aa, B:564:0x2128, B:370:0x1623, B:372:0x1629, B:373:0x1655, B:215:0x0e5e, B:217:0x0e64, B:218:0x0e8e, B:116:0x08bd, B:118:0x08c3, B:119:0x08ee, B:19:0x0270, B:21:0x0276, B:22:0x029a, B:24:0x041b, B:26:0x044d, B:27:0x04a6, B:333:0x14a2, B:335:0x14a6, B:356:0x1591, B:358:0x1597, B:359:0x1598, B:361:0x159a, B:363:0x15a1, B:364:0x15a2, B:339:0x14b2, B:127:0x0988, B:129:0x098e, B:130:0x09cf, B:132:0x09dc, B:134:0x09e5, B:135:0x0a28, B:158:0x0c56, B:159:0x0c5a, B:163:0x0c6c, B:169:0x0c9b, B:172:0x0cb2, B:176:0x0cc1, B:177:0x0cc9, B:189:0x0db4, B:191:0x0dba, B:192:0x0dbb, B:194:0x0dbd, B:196:0x0dc4, B:197:0x0dc5, B:166:0x0c84, B:136:0x0a33, B:148:0x0b3b, B:150:0x0b41, B:151:0x0b83, B:153:0x0bad, B:154:0x0bf5, B:156:0x0c0b, B:157:0x0c50, B:200:0x0dcb, B:202:0x0dd2, B:203:0x0dd3, B:205:0x0dd5, B:207:0x0ddc, B:208:0x0ddd), top: B:873:0x0270, inners: #16, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:546:0x1e91  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x1eff  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x1f5a  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x2013  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x2264  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x234a  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x2546  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x259a  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x266c  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x2815  */
    /* JADX WARN: Removed duplicated region for block: B:738:0x2ecd A[Catch: all -> 0x04ac, TryCatch #9 {all -> 0x04ac, blocks: (B:325:0x13e3, B:327:0x13e9, B:328:0x1418, B:538:0x1dd5, B:540:0x1ddb, B:541:0x1e06, B:770:0x31f6, B:772:0x31fc, B:773:0x3224, B:807:0x3557, B:809:0x355d, B:810:0x358c, B:787:0x3380, B:789:0x33a3, B:790:0x33fb, B:736:0x2ec7, B:738:0x2ecd, B:739:0x2ef6, B:833:0x3672, B:835:0x3678, B:836:0x369a, B:838:0x36d4, B:839:0x3710, B:605:0x268c, B:607:0x26a1, B:608:0x26d1, B:587:0x2388, B:589:0x238e, B:590:0x23b4, B:592:0x23ee, B:593:0x2436, B:558:0x2032, B:560:0x2047, B:561:0x2076, B:563:0x20aa, B:564:0x2128, B:370:0x1623, B:372:0x1629, B:373:0x1655, B:215:0x0e5e, B:217:0x0e64, B:218:0x0e8e, B:116:0x08bd, B:118:0x08c3, B:119:0x08ee, B:19:0x0270, B:21:0x0276, B:22:0x029a, B:24:0x041b, B:26:0x044d, B:27:0x04a6, B:333:0x14a2, B:335:0x14a6, B:356:0x1591, B:358:0x1597, B:359:0x1598, B:361:0x159a, B:363:0x15a1, B:364:0x15a2, B:339:0x14b2, B:127:0x0988, B:129:0x098e, B:130:0x09cf, B:132:0x09dc, B:134:0x09e5, B:135:0x0a28, B:158:0x0c56, B:159:0x0c5a, B:163:0x0c6c, B:169:0x0c9b, B:172:0x0cb2, B:176:0x0cc1, B:177:0x0cc9, B:189:0x0db4, B:191:0x0dba, B:192:0x0dbb, B:194:0x0dbd, B:196:0x0dc4, B:197:0x0dc5, B:166:0x0c84, B:136:0x0a33, B:148:0x0b3b, B:150:0x0b41, B:151:0x0b83, B:153:0x0bad, B:154:0x0bf5, B:156:0x0c0b, B:157:0x0c50, B:200:0x0dcb, B:202:0x0dd2, B:203:0x0dd3, B:205:0x0dd5, B:207:0x0ddc, B:208:0x0ddd), top: B:873:0x0270, inners: #16, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:744:0x2f7c  */
    /* JADX WARN: Removed duplicated region for block: B:747:0x2fcc  */
    /* JADX WARN: Removed duplicated region for block: B:752:0x3023  */
    /* JADX WARN: Removed duplicated region for block: B:769:0x31d8  */
    /* JADX WARN: Removed duplicated region for block: B:778:0x32b3  */
    /* JADX WARN: Removed duplicated region for block: B:781:0x330a  */
    /* JADX WARN: Removed duplicated region for block: B:786:0x3362  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:806:0x3537  */
    /* JADX WARN: Removed duplicated region for block: B:815:0x3620  */
    /* JADX WARN: Removed duplicated region for block: B:826:0x363b  */
    /* JADX WARN: Removed duplicated region for block: B:855:0x1754 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:885:0x14a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v140 */
    /* JADX WARN: Type inference failed for: r11v141, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v142 */
    /* JADX WARN: Type inference failed for: r11v145 */
    /* JADX WARN: Type inference failed for: r11v146 */
    /* JADX WARN: Type inference failed for: r11v147 */
    /* JADX WARN: Type inference failed for: r11v150, types: [long] */
    /* JADX WARN: Type inference failed for: r11v151 */
    /* JADX WARN: Type inference failed for: r11v152 */
    /* JADX WARN: Type inference failed for: r11v172 */
    /* JADX WARN: Type inference failed for: r11v176 */
    /* JADX WARN: Type inference failed for: r11v187 */
    /* JADX WARN: Type inference failed for: r11v189 */
    /* JADX WARN: Type inference failed for: r11v190, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v194 */
    /* JADX WARN: Type inference failed for: r11v195 */
    /* JADX WARN: Type inference failed for: r11v196 */
    /* JADX WARN: Type inference failed for: r11v197 */
    /* JADX WARN: Type inference failed for: r11v200 */
    /* JADX WARN: Type inference failed for: r11v292 */
    /* JADX WARN: Type inference failed for: r11v293 */
    /* JADX WARN: Type inference failed for: r11v294 */
    /* JADX WARN: Type inference failed for: r11v295 */
    /* JADX WARN: Type inference failed for: r11v296 */
    /* JADX WARN: Type inference failed for: r11v297 */
    /* JADX WARN: Type inference failed for: r11v298 */
    /* JADX WARN: Type inference failed for: r11v299 */
    /* JADX WARN: Type inference failed for: r11v300 */
    /* JADX WARN: Type inference failed for: r11v54 */
    /* JADX WARN: Type inference failed for: r11v55 */
    /* JADX WARN: Type inference failed for: r11v56, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v195 */
    /* JADX WARN: Type inference failed for: r12v234 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r13v138 */
    /* JADX WARN: Type inference failed for: r13v140 */
    /* JADX WARN: Type inference failed for: r13v141 */
    /* JADX WARN: Type inference failed for: r13v143 */
    /* JADX WARN: Type inference failed for: r13v144 */
    /* JADX WARN: Type inference failed for: r13v145 */
    /* JADX WARN: Type inference failed for: r13v146 */
    /* JADX WARN: Type inference failed for: r13v147 */
    /* JADX WARN: Type inference failed for: r13v154 */
    /* JADX WARN: Type inference failed for: r13v159 */
    /* JADX WARN: Type inference failed for: r13v160 */
    /* JADX WARN: Type inference failed for: r13v162 */
    /* JADX WARN: Type inference failed for: r13v163 */
    /* JADX WARN: Type inference failed for: r13v164 */
    /* JADX WARN: Type inference failed for: r13v165 */
    /* JADX WARN: Type inference failed for: r13v166 */
    /* JADX WARN: Type inference failed for: r13v167 */
    /* JADX WARN: Type inference failed for: r13v168 */
    /* JADX WARN: Type inference failed for: r13v169 */
    /* JADX WARN: Type inference failed for: r13v55 */
    /* JADX WARN: Type inference failed for: r13v56 */
    /* JADX WARN: Type inference failed for: r13v57 */
    /* JADX WARN: Type inference failed for: r13v58, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v59 */
    /* JADX WARN: Type inference failed for: r15v100 */
    /* JADX WARN: Type inference failed for: r15v101 */
    /* JADX WARN: Type inference failed for: r15v102 */
    /* JADX WARN: Type inference failed for: r15v103, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r15v104 */
    /* JADX WARN: Type inference failed for: r15v105 */
    /* JADX WARN: Type inference failed for: r15v111 */
    /* JADX WARN: Type inference failed for: r15v112 */
    /* JADX WARN: Type inference failed for: r15v113 */
    /* JADX WARN: Type inference failed for: r15v114 */
    /* JADX WARN: Type inference failed for: r15v115 */
    /* JADX WARN: Type inference failed for: r15v116 */
    /* JADX WARN: Type inference failed for: r15v117 */
    /* JADX WARN: Type inference failed for: r15v118 */
    /* JADX WARN: Type inference failed for: r15v119 */
    /* JADX WARN: Type inference failed for: r15v120 */
    /* JADX WARN: Type inference failed for: r15v121 */
    /* JADX WARN: Type inference failed for: r15v122 */
    /* JADX WARN: Type inference failed for: r15v123 */
    /* JADX WARN: Type inference failed for: r15v124 */
    /* JADX WARN: Type inference failed for: r15v125 */
    /* JADX WARN: Type inference failed for: r15v126 */
    /* JADX WARN: Type inference failed for: r15v127 */
    /* JADX WARN: Type inference failed for: r15v128 */
    /* JADX WARN: Type inference failed for: r15v129 */
    /* JADX WARN: Type inference failed for: r15v130 */
    /* JADX WARN: Type inference failed for: r15v131 */
    /* JADX WARN: Type inference failed for: r15v132 */
    /* JADX WARN: Type inference failed for: r15v133 */
    /* JADX WARN: Type inference failed for: r15v134 */
    /* JADX WARN: Type inference failed for: r15v135 */
    /* JADX WARN: Type inference failed for: r15v136 */
    /* JADX WARN: Type inference failed for: r15v137 */
    /* JADX WARN: Type inference failed for: r15v138 */
    /* JADX WARN: Type inference failed for: r15v139 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v41 */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v49 */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v53 */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v59 */
    /* JADX WARN: Type inference failed for: r15v60 */
    /* JADX WARN: Type inference failed for: r15v62 */
    /* JADX WARN: Type inference failed for: r15v63 */
    /* JADX WARN: Type inference failed for: r15v64 */
    /* JADX WARN: Type inference failed for: r15v65 */
    /* JADX WARN: Type inference failed for: r15v66 */
    /* JADX WARN: Type inference failed for: r15v67 */
    /* JADX WARN: Type inference failed for: r15v68 */
    /* JADX WARN: Type inference failed for: r15v69 */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v71 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v76 */
    /* JADX WARN: Type inference failed for: r15v77 */
    /* JADX WARN: Type inference failed for: r15v78 */
    /* JADX WARN: Type inference failed for: r15v79 */
    /* JADX WARN: Type inference failed for: r15v80 */
    /* JADX WARN: Type inference failed for: r15v81 */
    /* JADX WARN: Type inference failed for: r15v82 */
    /* JADX WARN: Type inference failed for: r15v83 */
    /* JADX WARN: Type inference failed for: r15v84 */
    /* JADX WARN: Type inference failed for: r15v85 */
    /* JADX WARN: Type inference failed for: r15v86 */
    /* JADX WARN: Type inference failed for: r15v89 */
    /* JADX WARN: Type inference failed for: r15v90 */
    /* JADX WARN: Type inference failed for: r15v91 */
    /* JADX WARN: Type inference failed for: r15v92 */
    /* JADX WARN: Type inference failed for: r15v93 */
    /* JADX WARN: Type inference failed for: r15v94 */
    /* JADX WARN: Type inference failed for: r15v96 */
    /* JADX WARN: Type inference failed for: r15v97 */
    /* JADX WARN: Type inference failed for: r15v98 */
    /* JADX WARN: Type inference failed for: r35v0 */
    /* JADX WARN: Type inference failed for: r35v1 */
    /* JADX WARN: Type inference failed for: r35v10 */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Type inference failed for: r35v4 */
    /* JADX WARN: Type inference failed for: r35v5 */
    /* JADX WARN: Type inference failed for: r35v6 */
    /* JADX WARN: Type inference failed for: r35v7 */
    /* JADX WARN: Type inference failed for: r35v8 */
    /* JADX WARN: Type inference failed for: r35v9 */
    /* JADX WARN: Type inference failed for: r3v314 */
    /* JADX WARN: Type inference failed for: r3v44, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v45, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v98 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v229 */
    /* JADX WARN: Type inference failed for: r7v230 */
    /* JADX WARN: Type inference failed for: r7v231 */
    /* JADX WARN: Type inference failed for: r7v232 */
    /* JADX WARN: Type inference failed for: r7v233 */
    /* JADX WARN: Type inference failed for: r7v236 */
    /* JADX WARN: Type inference failed for: r7v241 */
    /* JADX WARN: Type inference failed for: r7v243 */
    /* JADX WARN: Type inference failed for: r7v244 */
    /* JADX WARN: Type inference failed for: r7v248 */
    /* JADX WARN: Type inference failed for: r7v250 */
    /* JADX WARN: Type inference failed for: r7v253 */
    /* JADX WARN: Type inference failed for: r7v254 */
    /* JADX WARN: Type inference failed for: r7v255 */
    /* JADX WARN: Type inference failed for: r7v256 */
    /* JADX WARN: Type inference failed for: r7v257 */
    /* JADX WARN: Type inference failed for: r7v258 */
    /* JADX WARN: Type inference failed for: r7v259 */
    /* JADX WARN: Type inference failed for: r7v260 */
    /* JADX WARN: Type inference failed for: r7v261 */
    /* JADX WARN: Type inference failed for: r7v262 */
    /* JADX WARN: Type inference failed for: r7v263 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v131 */
    /* JADX WARN: Type inference failed for: r8v386 */
    /* JADX WARN: Type inference failed for: r8v96, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v99, types: [java.lang.String] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.ui.activity.AaPayActivity.attachBaseContext(android.content.Context):void");
    }

    static void m12243$$Nest$mgetAccessTokenResult(AaPayActivity aaPayActivity, GetH5AccessTokenResp getH5AccessTokenResp) throws Throwable {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 77;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        aaPayActivity.getAccessTokenResult(getH5AccessTokenResp);
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
    }

    static void m12244$$Nest$mgetAccessTokenResultFail(AaPayActivity aaPayActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 31;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        aaPayActivity.getAccessTokenResultFail();
        int i4 = getRequestBeneficiariesState + 49;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    static void m12245$$Nest$mqueryQrCodeResult(AaPayActivity aaPayActivity, ScanQrResp scanQrResp) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 105;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        aaPayActivity.queryQrCodeResult(scanQrResp);
        int i4 = getAsAtTimestamp + 63;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
    }

    @Override
    public void initToolbar(String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 9;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 7;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        int i5 = getRequestBeneficiariesState + 95;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
    }
}
