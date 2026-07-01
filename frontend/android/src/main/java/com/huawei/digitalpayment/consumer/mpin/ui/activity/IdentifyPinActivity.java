package com.huawei.digitalpayment.consumer.mpin.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
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
import com.blankj.utilcode.util.ActivityUtils;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.baselibs2.utils.encrypt.EncryptManager;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.databinding.ActivityBasePinBinding;
import com.huawei.digitalpayment.consumer.baselib.http.HttpStatus;
import com.huawei.digitalpayment.consumer.baselib.pin.model.PinType;
import com.huawei.digitalpayment.consumer.baselib.service.ILoginService;
import com.huawei.digitalpayment.consumer.baselib.util.encrypt.EncryptUtils;
import com.huawei.digitalpayment.consumer.login.util.MaximunDialogUtils;
import com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.IdentifyPinViewModel;
import com.huawei.digitalpayment.consumer.loginModule.register.request.AuthSensitiveOperationParams;
import com.huawei.payment.mvvm.Resource;
import com.huawei.payment.mvvm.Utils;
import com.safaricom.mpesa.lifestyle.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;

public class IdentifyPinActivity extends Hilt_IdentifyPinActivity<ActivityBasePinBinding, IdentifyPinViewModel> {
    private String encryptPin;
    private String encryptPin2;
    private static final byte[] $$l = {7, 80, 121, 38};
    private static final int $$o = 64;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$s = {Ascii.VT, -55, -20, -91, Ascii.DC2, 4, -57, SignedBytes.MAX_POWER_OF_TWO, 19, -14, Ascii.FS, -12, 10, -53, 60, Ascii.VT, 4, 8, 17, -13, 17, 10, -9, Ascii.RS, -6, -2, Ascii.SI, Ascii.FF, -64, 59, Ascii.DC2, 5, Ascii.VT, 8, -2, -2, 19, -62, 79, -12, 3, Ascii.SUB, -7, 2, Ascii.CAN, -67, 65, Ascii.VT, Ascii.FF, -9, 19, -11, 8, Ascii.ETB, -5, Ascii.FF, 5, -58, 62, Ascii.NAK, -1, -5, Ascii.ETB, -5, Ascii.FF, 5, -58, 43, 39, -13, Ascii.ETB, 8, -30, Ascii.ETB, Ascii.RS, -79, Ascii.ETB, Ascii.DC2, 7, Ascii.SI, -15, 7, 7, 1, Ascii.SUB, -3, Ascii.SO, Ascii.DC2, 4, 9, 5, 5, -3, Ascii.SI, Ascii.FF, -59, Ascii.DC2, 4, -57, 75, -12, Ascii.VT, 1, Ascii.ETB, -3, 0, Ascii.DC2, 4, -57, 75, -5, -1, Ascii.ETB, -7, 5, Ascii.ETB, -6, -53, 59, Ascii.DC2, 4, 9, 5, 10, -8, -49, 59, Ascii.DC2, 5, -2, 9, Ascii.SI, 1, -6, Ascii.EM, -5, Ascii.FF, 5, -58, Ascii.ESC, TarHeader.LF_SYMLINK, 5, -2, 9, Ascii.SI, 1, -30, 43, -2, Ascii.SI, -32, TarHeader.LF_LINK, -9, Ascii.SO, -67, 35, 40, Ascii.ETB, -5, Ascii.FF, 5, -37, 43, 7, 13, -70, 37, TarHeader.LF_DIR, -7, 2, Ascii.EM, 1, 9, Ascii.ESC, -1, Ascii.ETB, -7, -27, 35, Ascii.EM, -13, -6, -6, Ascii.DLE, 39, -13, Ascii.EM, -9};
    private static final int $$t = 63;
    private static final byte[] $$d = {Ascii.ETB, -38, -83, 70, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 106;
    private static int copydefault = 0;
    private static int equals = 1;
    private static char[] component1 = {33429, 33349, 33347, 33345, 33404, 33344, 33350, 33443, 33374, 33403, 33372, 33453, 33355, 33404, 33347, 33352, 33344, 33401, 33525, 33464, 33452, 33463, 33465, 33480, 33432, 33463, 33455, 33424, 33512, 33421, 33460, 33457, 33456, 33456, 33457, 33449, 33465, 33409, 33458, 33460, 33468, 33469, 33469, 33464, 33462, 33460, 33455, 33459, 33465, 33518, 33459, 33452, 33453, 33460, 33462, 33454, 33413, 33415, 33455, 33457, 33461, 33465, 33469, 33461, 33457, 33459, 33457, 33518, 33428, 33514, 33514, 33515, 33517, 33517, 33514, 33428, 33469, 33425, 33514, 33518, 33519, 33431, 33468, 33466, 33465, 33468, 33470, 33428, 33426, 33424, 33513, 33427, 33426, 33515, 33429, 33428, 33514, 33516, 33430, 33427, 33426, 33427, 33513, 33510, 33512, 33427, 33430, 33429, 33467, 33426, 33513, 33425, 33428, 33514, 33426, 33409, 33379, 33381, 33389, 33385, 33385, 33356, 33446, 33346, 33348, 33349, 33379, 33386, 33392, 33388, 33387, 33354, 33354, 33386, 33390, 33358, 33352, 33384, 33389, 33358, 33357, 33387, 33389, 33387, 33379, 33380, 33387, 33387, 33389, 33387, 33384, 33356, 33349, 33379, 33388, 33396, 33387, 33388, 33395, 33387, 33385, 33384, 33349, 33358, 33396, 33353, 33441, 33443, 33444, 33442, 33443, 33443, 33442, 33353, 33354, 33441, 33375, 33440, 33441, 33444, 33447, 33442, 33344, 33381, 33380, 33378, 33384, 33423, 33346, 33345, 33344, 33347, 33407, 33515, 33457, 33454, 33462, 33467, 33465, 33464, 33467, 33462, 33414, 33418, 33458, 33461, 33419, 33471, 33449, 33535, 33435, 33435, 33435, 33431, 33431, 33432, 33432, 33434, 33435, 33433, 33534, 33438, 33437, 33434, 33434, 33436, 33438, 33439, 33438, 33438, 33437, 33476, 33512, 33514, 33515, 33513, 33512, 33513, 33513, 33514, 33516, 33517, 33516, 33424, 33425, 33429, 33430, 33469, 33470, 33427, 33426, 33428, 33427, 33468, 33428, 33515, 33517, 33429, 33426, 33514, 33426, 33425, 33428, 33469, 33468, 33427, 33516, 33515, 33513, 33426, 33468, 33429, 33427, 33427, 33514, 33425, 33425, 33513, 33513, 33512, 33514, 33513, 33425, 33427, 33517, 33428, 33467, 33429, 33430, 33429, 33426, 33424, 33424, 33467, 33429, 33427, 33467, 33425, 33425, 33468, 33425, 33511, 33516, 33519, 33429, 33468, 33477, 33515, 33515, 33428, 33426, 33427, 33468, 33425, 33512, 33427, 33469, 33429, 33428, 33465, 33427, 33516, 33514, 33427, 33468, 33426, 33512, 33511, 33425, 33468, 33429, 33429, 33428, 33426, 33467, 33429, 33515, 33512, 33513, 33426, 33467, 33467, 33427, 33515, 33514, 33513, 33514, 33516, 33517, 33429, 33426, 33514, 33430, 33430, 33519, 33428, 33428, 33517, 33514, 33513, 33514, 33511, 33511, 33514, 33513, 33515, 33518, 33517, 33428, 33426, 33452, 33457, 33453, 33451, 33455, 33457, 33456, 33457, 33452, 33454, 33457};
    private static long component3 = -452590444373712689L;
    private static int component2 = 1386857713;
    private static char ShareDataUIState = 50417;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(byte r6, byte r7, short r8) {
        /*
            int r6 = 115 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.IdentifyPinActivity.$$l
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r8 = r8 * 4
            int r8 = 4 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r8]
        L24:
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.IdentifyPinActivity.$$r(byte, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(int r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = 28 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.IdentifyPinActivity.$$d
            int r9 = r9 * 2
            int r9 = r9 + 83
            int r8 = 100 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r9 = r8
            r4 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L29:
            int r3 = r3 + r8
            int r8 = r9 + 1
            int r9 = r3 + (-8)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.IdentifyPinActivity.i(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.IdentifyPinActivity.$$s
            int r6 = r6 * 16
            int r6 = r6 + 83
            int r8 = r8 + 4
            int r1 = r7 + 10
            byte[] r1 = new byte[r1]
            int r7 = r7 + 9
            r2 = 0
            if (r0 != 0) goto L15
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2d:
            int r6 = r6 + r8
            int r6 = r6 + (-6)
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.IdentifyPinActivity.j(int, short, short, java.lang.Object[]):void");
    }

    private static void h(int i, char[] cArr, char[] cArr2, char[] cArr3, char c2, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        while (iNotificationSideChannel.copydefault < length3) {
            int i5 = $11 + 101;
            $10 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int gidForName = Process.getGidForName("") + 4038;
                    int trimmedLength = 31 - TextUtils.getTrimmedLength("");
                    char cMyPid = (char) (19181 - (Process.myPid() >> 22));
                    byte b2 = (byte) ($$o >>> i2);
                    byte b3 = (byte) i4;
                    String str$$r = $$r(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(gidForName, trimmedLength, cMyPid, 1912513118, false, str$$r, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    int maximumFlingVelocity = 7567 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int i7 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10;
                    char c3 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i4] = Object.class;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(maximumFlingVelocity, i7, c3, 2006389106, false, "e", clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                int i8 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i8);
                objArr4[i4] = iNotificationSideChannel;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) i4;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(MotionEvent.axisFromString("") + 2460, ExpandableListView.getPackedPositionChild(0L) + 29, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), 931716605, false, $$r((byte) 17, b4, b4), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetAfter("", 0) + 7567, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 11, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component3 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component2) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) ShareDataUIState) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
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
        String str = new String(cArr6);
        int i9 = $11 + 45;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        objArr[0] = str;
    }

    private static void g(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = component1;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((Process.myTid() >> 22) + 657, 14 - (Process.myTid() >> 22), (char) (65118 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                int i7 = $11 + 55;
                $10 = i7 % 128;
                if (i7 % 2 == 0 ? bArr[iTrustedWebActivityService_Parcel.copydefault] == 1 : bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i8 = iTrustedWebActivityService_Parcel.copydefault;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                        if (objCopydefault2 == null) {
                            byte b2 = (byte) 5;
                            byte b3 = (byte) (b2 - 5);
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionType(0L) + 4502, View.getDefaultSize(0, 0) + 36, (char) (View.resolveSizeAndState(0, 0, 0) + 27897), -1464227204, false, $$r(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i8] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i9 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.blue(0) + 3580, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28, (char) KeyEvent.normalizeMetaState(0), 1180380354, false, $$r(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (b6 - 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1859 - (ViewConfiguration.getTapTimeout() >> 16), 34 - (Process.myPid() >> 22), (char) Drawable.resolveOpacity(0, 0), 80302927, false, $$r(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i10 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i10, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i10);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i3 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            int i11 = $10 + 57;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                iTrustedWebActivityService_Parcel.copydefault = 1;
            } else {
                iTrustedWebActivityService_Parcel.copydefault = 0;
            }
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    @Override
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = copydefault + 79;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        g(new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0}, new int[]{0, 18, 51, 0}, false, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        g(new byte[]{1, 0, 0, 1, 1}, new int[]{18, 5, 0, 3}, true, objArr3);
        Object obj = null;
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                g(new byte[]{0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1}, new int[]{23, 26, 0, 19}, false, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                g(new byte[]{1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1}, new int[]{49, 18, 0, 0}, false, objArr5);
                Method method = cls2.getMethod((String) objArr5[0], new Class[0]);
                baseContext = (Context) method.invoke(null, null);
            }
            if (baseContext != null) {
                int i4 = copydefault + 1;
                equals = i4 % 128;
                if (i4 % 2 == 0) {
                    boolean z = baseContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getSize(0) + 6618, 42 - ExpandableListView.getPackedPositionType(0L), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    g(new byte[]{0, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0}, new int[]{67, 48, 0, 0}, true, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952720_res_0x7f130450).substring(6, 7).length() - 1, new char[]{61573, 57860, 22187, 54059, 2298, 39654, 48585, 41864, 46273, 49261, 49078, 59668, 34705, 34832, 60662, 34834, 15326, 8363, 41138, 6279, 21523, 49827, 39346, 45186, 20653, 9127, 7653, 60319, 7001, 43922, 17680, 31280, 32918, 32053, 41447, 63657, 19423, 21142, 22258, 5882, 53659, 24446, 52174, 5984, 7444, 47442, 61305, 51062, 34944, 25060, 63217, 56614, 18735, 48553, 16838, 59974, 24897, 46113, 20325, 26840, 41601, 31450, 52982, 38263}, new char[]{53307, 40866, 37015, 18621}, new char[]{42046, 54519, 6170, 12849}, (char) ((Process.getThreadPriority(0) + 20) >> 6), objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 111, new char[]{55579, 62550, 28822, 5657, 2461, 32889, 35820, 32329, 26902, 45203, 31262, 51753, 49940, 18505, 35711, 23194, 41824, 41694, 38519, 38348, 6359, 58513, 18237, 45247, 16226, 19054, 15056, 49338, 24384, 12991, 55675, 26061, 43726, 40699, 63642, 49294, 56978, 12938, 2716, 23686, 44254, 56901, 2136, 34206, 62029, 35821, 39513, 35924, 26867, 14749, 32376, 55355, 16304, 7178, 60663, 27399, 3395, 5590, 26523, 54639, 13975, 42342, 20450, 9107}, new char[]{59717, 50210, 20686, 31166}, new char[]{42046, 54519, 6170, 12849}, (char) View.resolveSize(0, 0), objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    g(new byte[]{0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0}, new int[]{115, 72, 73, 0}, true, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    g(new byte[]{0, 1, 0, 1, 1, 1}, new int[]{187, 6, 109, 0}, true, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(21) - 105, new char[]{54759, 45928, 37746, 6297, 57463, 43399, 45533, 63834, 7137, 56757, 24410, 18765, 32984, 25334, 32413, 64026, 9473, 59919, 5859, 56774, 15494, 751, 34715, 32310, 56347, 17789, 244, 65091, 18405, 61631, 41141, 26054, 61365, 11603, 5318, 61572}, new char[]{30649, 30101, 38418, 42971}, new char[]{42046, 54519, 6170, 12849}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 99), objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Drawable.resolveOpacity(0, 0) + 6562, View.resolveSizeAndState(0, 0, 0) + 56, (char) View.MeasureSpec.getSize(0), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            int iArgb = 2405 - Color.argb(0, 0, 0, 0);
            int i5 = 26 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            byte[] bArr = $$d;
            byte b2 = (byte) (-bArr[38]);
            Object[] objArr13 = new Object[1];
            i(b2, (byte) (b2 << 2), (byte) (-bArr[22]), objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iArgb, i5, maximumDrawingCacheSize, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                int keyRepeatTimeout = 2405 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int trimmedLength = TextUtils.getTrimmedLength("") + 26;
                char cMyPid = (char) (Process.myPid() >> 22);
                Object[] objArr14 = new Object[1];
                i(r0[95], (byte) 93, (byte) (-$$d[22]), objArr14);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatTimeout, trimmedLength, cMyPid, 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, new char[]{31550, 12086, 47253, 16755, 21849, 65179, 20789, 17100, 49187, 41048, 12689, 43164, 15225, 38297, 41363, 9831}, new char[]{34212, 12481, 52403, 61926}, new char[]{42046, 54519, 6170, 12849}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) + 58970), objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            g(new byte[]{1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1}, new int[]{193, 16, 0, 6}, true, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, 71078439};
                byte[] bArr2 = $$s;
                Object[] objArr18 = new Object[1];
                j(bArr2[83], bArr2[7], bArr2[60], objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b3 = bArr2[83];
                Object[] objArr19 = new Object[1];
                j(b3, b3, (short) 72, objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int iIndexOf = TextUtils.indexOf("", "", 0) + 2405;
                    int gidForName = Process.getGidForName("") + 27;
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                    Object[] objArr20 = new Object[1];
                    i(r5[95], (byte) 93, (byte) (-$$d[22]), objArr20);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, gidForName, cIndexOf, 24929979, false, (String) objArr20[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131954889_res_0x7f130cc9).substring(0, 1).codePointAt(0) - 8226, new char[]{55056, 63954, 7444, 50891, 21278, 49295, 1499, 44701, 5385, 25771, 3074, 41366, 7394, 31904, 7182, 48006, 13485, 7833, 26456, 63124, 18672, 13723}, new char[]{49838, 23788, 6164, 43694}, new char[]{42046, 54519, 6170, 12849}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 99), objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    h(128733159 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), new char[]{48554, 16122, 44355, 30121, 50054, 61020, 37561, 55003, 15418, 45757, 53806, 32962, 26842, 51025, 24387}, new char[]{59133, 44111, 40711, 55412}, new char[]{42046, 54519, 6170, 12849}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131954659_res_0x7f130be3).substring(6, 9).codePointAt(1) + 29739), objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 2405;
                        int iAlpha = 26 - Color.alpha(0);
                        char tapTimeout2 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        byte b4 = $$d[33];
                        Object[] objArr23 = new Object[1];
                        i(b4, (byte) (b4 | 84), (byte) ($$e & 31), objArr23);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(tapTimeout, iAlpha, tapTimeout2, -1843538389, false, (String) objArr23[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        int i6 = 2406 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int packedPositionType = 26 - ExpandableListView.getPackedPositionType(0L);
                        char cRgb = (char) ((-16777216) - Color.rgb(0, 0, 0));
                        byte[] bArr3 = $$d;
                        byte b5 = (byte) (-bArr3[38]);
                        Object[] objArr24 = new Object[1];
                        i(b5, (byte) (b5 << 2), (byte) (-bArr3[22]), objArr24);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(i6, packedPositionType, cRgb, -2047739879, false, (String) objArr24[0], null);
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
        int i7 = ((int[]) objArr[0])[0];
        int i8 = ((int[]) objArr[2])[0];
        if (i8 != i7) {
            long j = -1;
            long j2 = ((long) (i8 ^ i7)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), View.combineMeasuredStates(0, 0) + 42, (char) (MotionEvent.axisFromString("") + 1), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            try {
                Object[] objArr25 = {464922185, Long.valueOf(j4), new ArrayList(), null, true};
                Class cls6 = (Class) ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0) + 6563, Process.getGidForName("") + 57, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                byte[] bArr4 = $$s;
                byte b6 = bArr4[83];
                byte b7 = bArr4[105];
                Object[] objArr26 = new Object[1];
                j(b6, b7, (short) (b7 | 82), objArr26);
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
        addObserve();
    }

    private void addObserve() {
        int i = 2 % 2;
        ((IdentifyPinViewModel) this.viewModel).getData().observe(this, new Observer() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 25;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                IdentifyPinActivity.$r8$lambda$U_pawDt_ENgLNM46C9YvMfwkmvo(this.f$0, (Resource) obj);
                int i5 = component1 + 7;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = copydefault + 123;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    private void lambda$addObserve$0(Resource resource) {
        int i = 2 % 2;
        Utils.showOrHideLoading(this, resource);
        if (resource.error()) {
            int i2 = copydefault + 65;
            equals = i2 % 128;
            int i3 = i2 % 2;
            ((ActivityBasePinBinding) this.binding).etCode.showError(resource.getMessage());
            ((ActivityBasePinBinding) this.binding).etCode.clear();
            if (HttpStatus.CONSUMER_PIN_ERROR_MAXIMUM.equals(resource.getException().getResponseCode())) {
                MaximunDialogUtils.INSTANCE.showMaximunDialog(this);
            }
        }
        if (resource.success()) {
            Intent intent = new Intent();
            intent.putExtra(KeysConstants.KEY_ENCRYPT_PIN, this.encryptPin);
            intent.putExtra(KeysConstants.KEY_ENCRYPT_PIN2, this.encryptPin2);
            setResult(-1, intent);
            finish();
            int i4 = copydefault + 55;
            equals = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override
    public void onForgetClick() {
        int i = 2 % 2;
        ((ILoginService) RouteUtils.getService(ILoginService.class)).resetPin(new ApiCallback<Boolean>() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public void onSuccess(Boolean bool) {
                int i2 = 2 % 2;
                int i3 = component2 + 85;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                component2(bool);
                int i5 = component1 + 9;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            public void component2(Boolean bool) {
                int i2 = 2 % 2;
                int i3 = component1 + 33;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    ActivityUtils.finishToActivity((Activity) IdentifyPinActivity.this, true, false);
                } else {
                    ActivityUtils.finishToActivity((Activity) IdentifyPinActivity.this, false, true);
                }
                int i4 = component2 + 63;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = copydefault + 27;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 96 / 0;
        }
    }

    @Override
    public void onConfirmClick(String str) {
        int i = 2 % 2;
        this.encryptPin = EncryptUtils.encryptWithPinKey(str);
        this.encryptPin2 = EncryptManager.INSTANCE.encrypt(str);
        ((IdentifyPinViewModel) this.viewModel).authSensitiveOperation(new AuthSensitiveOperationParams(EncryptUtils.encryptWithPinKey(str)));
        int i2 = copydefault + 115;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public PinType getPinType() {
        int i = 2 % 2;
        PinType pinType = new PinType(getString(com.huawei.digitalpayment.consumer.login.R.string.onboarding_identity_pin_title1), getString(com.huawei.digitalpayment.consumer.login.R.string.onboarding_identity_pin_tips1, new Object[]{String.valueOf(AppConfigManager.getAppConfig().getPinLimit())}), getString(com.huawei.digitalpayment.consumer.login.R.string.onboarding_identity_pin_button2), getString(com.huawei.digitalpayment.consumer.login.R.string.onboarding_identity_pin_button1));
        int i2 = copydefault + 105;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return pinType;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.IdentifyPinActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = copydefault + 123;
        equals = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getBaseContext();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            g(new byte[]{0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1}, new int[]{23, 26, 0, 19}, false, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(new byte[]{1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1}, new int[]{49, 18, 0, 0}, false, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i3 = equals + 57;
            copydefault = i3 % 128;
            try {
                if (i3 % 2 != 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 42, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6561 - ImageFormat.getBitsPerPixel(0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 55, (char) TextUtils.getCapsMode("", 0, 0), -960739708, false, "component3", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    obj.hashCode();
                    throw null;
                }
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0) + 6618, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 41, (char) KeyEvent.keyCodeFromString(""), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6562, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 56, (char) View.resolveSizeAndState(0, 0, 0), -960739708, false, "component3", new Class[]{Context.class});
                }
                ((Method) objCopydefault4).invoke(objInvoke2, objArr4);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0902 A[Catch: all -> 0x0407, TryCatch #37 {all -> 0x0407, blocks: (B:139:0x08fc, B:141:0x0902, B:142:0x0930, B:360:0x152c, B:362:0x1532, B:363:0x1565, B:479:0x1b7c, B:481:0x1b82, B:482:0x1bac, B:681:0x2dee, B:683:0x2df4, B:684:0x2e1e, B:718:0x3136, B:720:0x313c, B:721:0x315d, B:698:0x2f73, B:700:0x2f96, B:701:0x2fe6, B:641:0x2a46, B:643:0x2a4c, B:644:0x2a77, B:741:0x3231, B:743:0x3237, B:744:0x3262, B:746:0x329c, B:747:0x32df, B:530:0x2248, B:532:0x225d, B:533:0x228d, B:759:0x33ae, B:761:0x33b4, B:762:0x33d8, B:764:0x3412, B:765:0x3451, B:499:0x1deb, B:501:0x1e00, B:502:0x1e33, B:504:0x1e67, B:505:0x1ee2, B:252:0x0fbd, B:254:0x0fc3, B:255:0x0ff2, B:207:0x0d98, B:209:0x0d9e, B:210:0x0dca, B:19:0x01c6, B:21:0x01cc, B:22:0x01f5, B:24:0x0377, B:26:0x03a9, B:27:0x0401), top: B:847:0x01c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x09c4 A[Catch: all -> 0x0d30, TryCatch #8 {all -> 0x0d30, blocks: (B:146:0x09be, B:148:0x09c4, B:149:0x0a04, B:151:0x0a11, B:153:0x0a1a, B:154:0x0a60, B:173:0x0c1d, B:181:0x0c7f, B:187:0x0d14, B:189:0x0d1a, B:190:0x0d1b, B:192:0x0d1d, B:194:0x0d24, B:195:0x0d25, B:156:0x0a6c, B:163:0x0af8, B:165:0x0afe, B:166:0x0b43, B:168:0x0b6d, B:169:0x0bbc, B:171:0x0bd2, B:172:0x0c15, B:197:0x0d27, B:199:0x0d2e, B:200:0x0d2f, B:158:0x0a8c, B:160:0x0a9e, B:161:0x0aec, B:183:0x0c8f, B:177:0x0c4d, B:179:0x0c53, B:180:0x0c78), top: B:795:0x09be, outer: #29, inners: #2, #42, #49 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0a11 A[Catch: all -> 0x0d30, TryCatch #8 {all -> 0x0d30, blocks: (B:146:0x09be, B:148:0x09c4, B:149:0x0a04, B:151:0x0a11, B:153:0x0a1a, B:154:0x0a60, B:173:0x0c1d, B:181:0x0c7f, B:187:0x0d14, B:189:0x0d1a, B:190:0x0d1b, B:192:0x0d1d, B:194:0x0d24, B:195:0x0d25, B:156:0x0a6c, B:163:0x0af8, B:165:0x0afe, B:166:0x0b43, B:168:0x0b6d, B:169:0x0bbc, B:171:0x0bd2, B:172:0x0c15, B:197:0x0d27, B:199:0x0d2e, B:200:0x0d2f, B:158:0x0a8c, B:160:0x0a9e, B:161:0x0aec, B:183:0x0c8f, B:177:0x0c4d, B:179:0x0c53, B:180:0x0c78), top: B:795:0x09be, outer: #29, inners: #2, #42, #49 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0a6c A[Catch: all -> 0x0d30, TRY_LEAVE, TryCatch #8 {all -> 0x0d30, blocks: (B:146:0x09be, B:148:0x09c4, B:149:0x0a04, B:151:0x0a11, B:153:0x0a1a, B:154:0x0a60, B:173:0x0c1d, B:181:0x0c7f, B:187:0x0d14, B:189:0x0d1a, B:190:0x0d1b, B:192:0x0d1d, B:194:0x0d24, B:195:0x0d25, B:156:0x0a6c, B:163:0x0af8, B:165:0x0afe, B:166:0x0b43, B:168:0x0b6d, B:169:0x0bbc, B:171:0x0bd2, B:172:0x0c15, B:197:0x0d27, B:199:0x0d2e, B:200:0x0d2f, B:158:0x0a8c, B:160:0x0a9e, B:161:0x0aec, B:183:0x0c8f, B:177:0x0c4d, B:179:0x0c53, B:180:0x0c78), top: B:795:0x09be, outer: #29, inners: #2, #42, #49 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0c2f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0e6b  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0e82 A[Catch: all -> 0x0f4c, TryCatch #22 {all -> 0x0f4c, blocks: (B:227:0x0e6d, B:229:0x0e82, B:230:0x0eb5), top: B:820:0x0e6d, outer: #25 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0ec8 A[Catch: all -> 0x0f42, TryCatch #14 {all -> 0x0f42, blocks: (B:231:0x0ebb, B:233:0x0ec8, B:234:0x0f3a), top: B:806:0x0ebb, outer: #25 }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x107a  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x10d7  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x112c A[Catch: all -> 0x14c5, TRY_ENTER, TRY_LEAVE, TryCatch #18 {all -> 0x14c5, blocks: (B:259:0x1074, B:266:0x10ca, B:305:0x1360, B:306:0x1364, B:308:0x136a, B:311:0x1386, B:275:0x112c, B:293:0x1235, B:296:0x1280, B:301:0x12f7, B:304:0x1358), top: B:812:0x1074 }] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x136a A[Catch: all -> 0x14c5, TryCatch #18 {all -> 0x14c5, blocks: (B:259:0x1074, B:266:0x10ca, B:305:0x1360, B:306:0x1364, B:308:0x136a, B:311:0x1386, B:275:0x112c, B:293:0x1235, B:296:0x1280, B:301:0x12f7, B:304:0x1358), top: B:812:0x1074 }] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x1532 A[Catch: all -> 0x0407, TryCatch #37 {all -> 0x0407, blocks: (B:139:0x08fc, B:141:0x0902, B:142:0x0930, B:360:0x152c, B:362:0x1532, B:363:0x1565, B:479:0x1b7c, B:481:0x1b82, B:482:0x1bac, B:681:0x2dee, B:683:0x2df4, B:684:0x2e1e, B:718:0x3136, B:720:0x313c, B:721:0x315d, B:698:0x2f73, B:700:0x2f96, B:701:0x2fe6, B:641:0x2a46, B:643:0x2a4c, B:644:0x2a77, B:741:0x3231, B:743:0x3237, B:744:0x3262, B:746:0x329c, B:747:0x32df, B:530:0x2248, B:532:0x225d, B:533:0x228d, B:759:0x33ae, B:761:0x33b4, B:762:0x33d8, B:764:0x3412, B:765:0x3451, B:499:0x1deb, B:501:0x1e00, B:502:0x1e33, B:504:0x1e67, B:505:0x1ee2, B:252:0x0fbd, B:254:0x0fc3, B:255:0x0ff2, B:207:0x0d98, B:209:0x0d9e, B:210:0x0dca, B:19:0x01c6, B:21:0x01cc, B:22:0x01f5, B:24:0x0377, B:26:0x03a9, B:27:0x0401), top: B:847:0x01c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x15fc  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x1672  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x16cd  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x172c  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x19dd A[Catch: all -> 0x1afd, TryCatch #33 {all -> 0x1afd, blocks: (B:426:0x19d3, B:427:0x19d7, B:429:0x19dd, B:432:0x19f7, B:435:0x1a03, B:437:0x1a06, B:449:0x1aeb, B:451:0x1af1, B:452:0x1af2, B:454:0x1af4, B:456:0x1afb, B:457:0x1afc, B:404:0x1769, B:415:0x18ad, B:417:0x18b3, B:418:0x18f8, B:420:0x1922, B:422:0x196b, B:424:0x1982, B:425:0x19cd, B:461:0x1b00, B:463:0x1b07, B:464:0x1b08, B:466:0x1b0a, B:468:0x1b11, B:469:0x1b12, B:445:0x1a6a, B:440:0x1a34, B:442:0x1a3a, B:443:0x1a62, B:410:0x1803, B:412:0x1827, B:413:0x18a1, B:405:0x17b8, B:407:0x17cc, B:408:0x17fc), top: B:840:0x1769, inners: #26, #30, #34, #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:481:0x1b82 A[Catch: all -> 0x0407, TryCatch #37 {all -> 0x0407, blocks: (B:139:0x08fc, B:141:0x0902, B:142:0x0930, B:360:0x152c, B:362:0x1532, B:363:0x1565, B:479:0x1b7c, B:481:0x1b82, B:482:0x1bac, B:681:0x2dee, B:683:0x2df4, B:684:0x2e1e, B:718:0x3136, B:720:0x313c, B:721:0x315d, B:698:0x2f73, B:700:0x2f96, B:701:0x2fe6, B:641:0x2a46, B:643:0x2a4c, B:644:0x2a77, B:741:0x3231, B:743:0x3237, B:744:0x3262, B:746:0x329c, B:747:0x32df, B:530:0x2248, B:532:0x225d, B:533:0x228d, B:759:0x33ae, B:761:0x33b4, B:762:0x33d8, B:764:0x3412, B:765:0x3451, B:499:0x1deb, B:501:0x1e00, B:502:0x1e33, B:504:0x1e67, B:505:0x1ee2, B:252:0x0fbd, B:254:0x0fc3, B:255:0x0ff2, B:207:0x0d98, B:209:0x0d9e, B:210:0x0dca, B:19:0x01c6, B:21:0x01cc, B:22:0x01f5, B:24:0x0377, B:26:0x03a9, B:27:0x0401), top: B:847:0x01c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:487:0x1c42  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x1cab  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x1d02  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x1dcd  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x201b  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x2b03  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x2b52  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x2c11  */
    /* JADX WARN: Removed duplicated region for block: B:680:0x2dcf  */
    /* JADX WARN: Removed duplicated region for block: B:689:0x2eb0  */
    /* JADX WARN: Removed duplicated region for block: B:692:0x2f07  */
    /* JADX WARN: Removed duplicated region for block: B:697:0x2f55  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x3118  */
    /* JADX WARN: Removed duplicated region for block: B:752:0x3373  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:826:0x0e52 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:898:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v53 */
    /* JADX WARN: Type inference failed for: r12v58 */
    /* JADX WARN: Type inference failed for: r12v59 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r12v68 */
    /* JADX WARN: Type inference failed for: r12v69 */
    /* JADX WARN: Type inference failed for: r12v70 */
    /* JADX WARN: Type inference failed for: r35v100 */
    /* JADX WARN: Type inference failed for: r35v101 */
    /* JADX WARN: Type inference failed for: r35v106 */
    /* JADX WARN: Type inference failed for: r35v107 */
    /* JADX WARN: Type inference failed for: r35v109 */
    /* JADX WARN: Type inference failed for: r35v116 */
    /* JADX WARN: Type inference failed for: r35v119 */
    /* JADX WARN: Type inference failed for: r35v121 */
    /* JADX WARN: Type inference failed for: r35v123 */
    /* JADX WARN: Type inference failed for: r35v124 */
    /* JADX WARN: Type inference failed for: r35v125 */
    /* JADX WARN: Type inference failed for: r35v128 */
    /* JADX WARN: Type inference failed for: r35v129 */
    /* JADX WARN: Type inference failed for: r35v130 */
    /* JADX WARN: Type inference failed for: r35v135 */
    /* JADX WARN: Type inference failed for: r35v15 */
    /* JADX WARN: Type inference failed for: r35v150 */
    /* JADX WARN: Type inference failed for: r35v151 */
    /* JADX WARN: Type inference failed for: r35v152 */
    /* JADX WARN: Type inference failed for: r35v153 */
    /* JADX WARN: Type inference failed for: r35v154 */
    /* JADX WARN: Type inference failed for: r35v155 */
    /* JADX WARN: Type inference failed for: r35v156 */
    /* JADX WARN: Type inference failed for: r35v157 */
    /* JADX WARN: Type inference failed for: r35v158 */
    /* JADX WARN: Type inference failed for: r35v159 */
    /* JADX WARN: Type inference failed for: r35v16 */
    /* JADX WARN: Type inference failed for: r35v160 */
    /* JADX WARN: Type inference failed for: r35v161 */
    /* JADX WARN: Type inference failed for: r35v162 */
    /* JADX WARN: Type inference failed for: r35v163 */
    /* JADX WARN: Type inference failed for: r35v164 */
    /* JADX WARN: Type inference failed for: r35v165 */
    /* JADX WARN: Type inference failed for: r35v166 */
    /* JADX WARN: Type inference failed for: r35v167 */
    /* JADX WARN: Type inference failed for: r35v168 */
    /* JADX WARN: Type inference failed for: r35v169 */
    /* JADX WARN: Type inference failed for: r35v17 */
    /* JADX WARN: Type inference failed for: r35v170 */
    /* JADX WARN: Type inference failed for: r35v171 */
    /* JADX WARN: Type inference failed for: r35v172 */
    /* JADX WARN: Type inference failed for: r35v175 */
    /* JADX WARN: Type inference failed for: r35v176 */
    /* JADX WARN: Type inference failed for: r35v177 */
    /* JADX WARN: Type inference failed for: r35v178 */
    /* JADX WARN: Type inference failed for: r35v179 */
    /* JADX WARN: Type inference failed for: r35v18 */
    /* JADX WARN: Type inference failed for: r35v180 */
    /* JADX WARN: Type inference failed for: r35v181 */
    /* JADX WARN: Type inference failed for: r35v182 */
    /* JADX WARN: Type inference failed for: r35v185 */
    /* JADX WARN: Type inference failed for: r35v186 */
    /* JADX WARN: Type inference failed for: r35v187 */
    /* JADX WARN: Type inference failed for: r35v188 */
    /* JADX WARN: Type inference failed for: r35v189 */
    /* JADX WARN: Type inference failed for: r35v190 */
    /* JADX WARN: Type inference failed for: r35v191 */
    /* JADX WARN: Type inference failed for: r35v192 */
    /* JADX WARN: Type inference failed for: r35v193 */
    /* JADX WARN: Type inference failed for: r35v194 */
    /* JADX WARN: Type inference failed for: r35v195 */
    /* JADX WARN: Type inference failed for: r35v196 */
    /* JADX WARN: Type inference failed for: r35v197 */
    /* JADX WARN: Type inference failed for: r35v198 */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Type inference failed for: r35v74 */
    /* JADX WARN: Type inference failed for: r35v75 */
    /* JADX WARN: Type inference failed for: r35v76 */
    /* JADX WARN: Type inference failed for: r35v77 */
    /* JADX WARN: Type inference failed for: r35v78 */
    /* JADX WARN: Type inference failed for: r35v8 */
    /* JADX WARN: Type inference failed for: r35v80 */
    /* JADX WARN: Type inference failed for: r35v81 */
    /* JADX WARN: Type inference failed for: r35v86 */
    /* JADX WARN: Type inference failed for: r35v87 */
    /* JADX WARN: Type inference failed for: r35v88 */
    /* JADX WARN: Type inference failed for: r35v89 */
    /* JADX WARN: Type inference failed for: r35v91 */
    /* JADX WARN: Type inference failed for: r35v93 */
    /* JADX WARN: Type inference failed for: r35v94 */
    /* JADX WARN: Type inference failed for: r35v97 */
    /* JADX WARN: Type inference failed for: r35v98 */
    /* JADX WARN: Type inference failed for: r35v99 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v446 */
    /* JADX WARN: Type inference failed for: r4v467 */
    /* JADX WARN: Type inference failed for: r4v468 */
    /* JADX WARN: Type inference failed for: r4v469 */
    /* JADX WARN: Type inference failed for: r4v470 */
    /* JADX WARN: Type inference failed for: r4v471 */
    /* JADX WARN: Type inference failed for: r4v475 */
    /* JADX WARN: Type inference failed for: r4v477 */
    /* JADX WARN: Type inference failed for: r4v481 */
    /* JADX WARN: Type inference failed for: r4v484 */
    /* JADX WARN: Type inference failed for: r4v485 */
    /* JADX WARN: Type inference failed for: r4v486 */
    /* JADX WARN: Type inference failed for: r4v487 */
    /* JADX WARN: Type inference failed for: r4v488 */
    /* JADX WARN: Type inference failed for: r4v489 */
    /* JADX WARN: Type inference failed for: r8v102 */
    /* JADX WARN: Type inference failed for: r8v103, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v104 */
    /* JADX WARN: Type inference failed for: r8v105 */
    /* JADX WARN: Type inference failed for: r8v106 */
    /* JADX WARN: Type inference failed for: r8v115 */
    /* JADX WARN: Type inference failed for: r8v271 */
    /* JADX WARN: Type inference failed for: r8v272 */
    /* JADX WARN: Type inference failed for: r8v273 */
    /* JADX WARN: Type inference failed for: r8v53 */
    /* JADX WARN: Type inference failed for: r8v54 */
    /* JADX WARN: Type inference failed for: r8v55, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v99 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r51) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.IdentifyPinActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$U_pawDt_ENgLNM46C9YvMfwkmvo(IdentifyPinActivity identifyPinActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = equals + 89;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        identifyPinActivity.lambda$addObserve$0(resource);
        if (i3 != 0) {
            int i4 = 61 / 0;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        equals = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = copydefault + 119;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }
}
