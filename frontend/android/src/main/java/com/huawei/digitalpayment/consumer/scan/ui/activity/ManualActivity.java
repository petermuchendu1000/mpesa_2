package com.huawei.digitalpayment.consumer.scan.ui.activity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.Observer;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.ColorUtils;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.FastClickUtils;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.ToastUtils;
import com.huawei.common.util.ViewUtils;
import com.huawei.common.widget.dialog.DialogManager;
import com.huawei.digitalpayment.checkout.constants.PayTradeTypeEnum;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import com.huawei.digitalpayment.consumer.baselib.util.AppConfigUtils;
import com.huawei.digitalpayment.consumer.qrcode.R;
import com.huawei.digitalpayment.consumer.qrcode.databinding.QrcodeActivityManualBinding;
import com.huawei.digitalpayment.consumer.scan.model.CustomerType;
import com.huawei.digitalpayment.consumer.scan.model.request.VerifyCashOutRequest;
import com.huawei.digitalpayment.consumer.scan.model.response.VerifyNumberResp;
import com.huawei.digitalpayment.consumer.scan.ui.dialog.QrCodeTipsDialog;
import com.huawei.digitalpayment.consumer.scan.viewmodel.ScanViewModel;
import com.huawei.payment.mvvm.Resource;
import com.huawei.payment.mvvm.Utils;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelAll;

public class ManualActivity extends Hilt_ManualActivity<QrcodeActivityManualBinding, ScanViewModel> {
    private static final byte[] $$l = {79, -7, -1, -17};
    private static final int $$o = 110;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {Ascii.SI, -12, 105, 108, -11, -12, 1, -4, -12, -17, 67, -60, -19, -10, -4, -13, -6, 4, -12, 2, -21, 62, -61, -8, -4, -26, 7, TarHeader.LF_SYMLINK, -66, -12, -13, 8, -20, -3, 6, -18, TarHeader.LF_CONTIG, -29, -40, -4, -26, 7, Ascii.GS, -51, -10, -4, -13, -6, 4, -12, 2, Ascii.NAK, -44, 1, -16, Ascii.US, -43, -10, -3, 65, -54, -28, 0, -24, 6, Ascii.SUB, -36, -26, Ascii.FF, 5, 5, -17, -40, Ascii.FF, -26, 8, -19, -5, -10, -6, -6, 2, -16, -13, 59, -19, -5, -10, -6, -6, 2, -16, -13, 58, -11, -12, 1, -4, -12, -17, 67, -60, -19, -10, -4, -13, -6, 4, -12, 2, -21, 62, -60, -12, 0, -20, -7, 2, -14, -14, 62, -41, -41, -4, 4, -24, Ascii.VT, -9, -20, Ascii.CAN, -23, -19, -8, 4, 58, -39, -40, -8, -2, -27, 2, -15, 36, -43, -10, -3, -14};
    private static final int $$k = 209;
    private static final byte[] $$d = {109, 5, -57, 108, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 102;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 1;
    private static char[] ShareDataUIState = {2003, 2005, 1970, 2029, 2020, 1972, 2037, 2018, 2007, 2034, 1995, 2001, 1969, 2041, 2025, 2004, 1968, 1973, 1993, 2033, 2031, 2032, 2017, 2036, 2027, 2035, 2021, 1975, 2038, 1987, 1971, 2023, 1994, 1985, 1978, 1966, 2006, 1977, 2030, 2000, 1976, 2026, 1974, 2022, 1967, 2024, 2019, 1992, 2028};
    private static char copydefault = 12829;
    private static long component2 = -3780477796495014671L;
    private static int component1 = -662034599;
    private static char component3 = 50417;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(byte r6, int r7, int r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.scan.ui.activity.ManualActivity.$$l
            int r6 = r6 * 4
            int r6 = 3 - r6
            int r7 = r7 + 98
            int r8 = r8 * 4
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.ui.activity.ManualActivity.$$r(byte, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = 99 - r8
            int r7 = r7 * 2
            int r7 = 103 - r7
            int r0 = 28 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.scan.ui.activity.ManualActivity.$$d
            byte[] r0 = new byte[r0]
            int r6 = 27 - r6
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L30
        L14:
            r3 = r2
        L15:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L30:
            int r3 = r3 + r7
            int r7 = r3 + (-8)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.ui.activity.ManualActivity.i(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(short r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.scan.ui.activity.ManualActivity.$$j
            int r5 = r5 * 9
            int r5 = 93 - r5
            int r7 = r7 * 8
            int r7 = r7 + 99
            int r1 = r6 + 10
            byte[] r1 = new byte[r1]
            int r6 = r6 + 9
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r5 = r5 + 1
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            r4 = r0[r5]
            int r3 = r3 + 1
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.ui.activity.ManualActivity.j(short, byte, int, java.lang.Object[]):void");
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = equals + 117;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.qrcode_activity_manual;
        int i5 = getRequestBeneficiariesState + 67;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override
    public void initToolbar(String str) {
        int i = 2 % 2;
        int i2 = equals + 81;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.initToolbar(getString(R.string.manual_title));
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
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
            int i5 = $11 + 95;
            $10 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int touchSlop = 4037 - (ViewConfiguration.getTouchSlop() >> 8);
                    int i7 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 30;
                    char cIndexOf = (char) (19181 - TextUtils.indexOf("", "", i4));
                    byte b2 = $$l[i2];
                    byte b3 = (byte) (b2 + 1);
                    byte b4 = (byte) (-b2);
                    String str$$r = $$r(b3, b4, (byte) (b4 - 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(touchSlop, i7, cIndexOf, 1912513118, false, str$$r, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    int i8 = 7566 - (ExpandableListView.getPackedPositionForChild(i4, i4) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i4, i4) == 0L ? 0 : -1));
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 11;
                    char c3 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i4] = Object.class;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i8, maximumDrawingCacheSize, c3, 2006389106, false, "e", clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                int i9 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i9);
                objArr4[i4] = iNotificationSideChannel;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    int iResolveSize = 2459 - View.resolveSize(i4, i4);
                    int iResolveSize2 = View.resolveSize(i4, i4) + 28;
                    char cIndexOf2 = (char) TextUtils.indexOf("", "", i4, i4);
                    byte b5 = (byte) ($$l[2] + 1);
                    byte b6 = b5;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iResolveSize, iResolveSize2, cIndexOf2, 931716605, false, $$r(b5, b6, b6), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7566, 10 - MotionEvent.axisFromString(""), (char) KeyEvent.keyCodeFromString(""), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component2 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component1) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component3) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                int i10 = $11 + 87;
                $10 = i10 % 128;
                int i11 = i10 % 2;
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
        int i12 = $11 + 81;
        $10 = i12 % 128;
        int i13 = i12 % 2;
        objArr[0] = str;
    }

    private static void g(int i, char[] cArr, byte b2, Object[] objArr) throws Throwable {
        int i2;
        char c2;
        Object obj;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = ShareDataUIState;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7422 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (64291 - View.resolveSizeAndState(0, 0, 0)), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
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
        try {
            Object[] objArr3 = {Integer.valueOf(copydefault)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
            long j = 0;
            char c3 = '\b';
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7423 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 15, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i5 = $10 + 43;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    i2 = i + 66;
                    cArr4[i2] = (char) (cArr[i2] + b2);
                } else {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b2);
                }
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                int i6 = $11 + 3;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    cancelall.component2 = 1;
                } else {
                    cancelall.component2 = 0;
                }
                while (cancelall.component2 < i2) {
                    cancelall.component1 = cArr[cancelall.component2];
                    cancelall.component3 = cArr[cancelall.component2 + 1];
                    if (cancelall.component1 == cancelall.component3) {
                        int i7 = $11 + 3;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                        cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                        c2 = c3;
                        obj = obj2;
                    } else {
                        try {
                            Object[] objArr4 = new Object[13];
                            objArr4[12] = cancelall;
                            objArr4[11] = Integer.valueOf(cCharValue);
                            objArr4[10] = cancelall;
                            objArr4[9] = cancelall;
                            objArr4[c3] = Integer.valueOf(cCharValue);
                            objArr4[7] = cancelall;
                            objArr4[6] = cancelall;
                            objArr4[5] = Integer.valueOf(cCharValue);
                            objArr4[4] = cancelall;
                            objArr4[3] = cancelall;
                            objArr4[2] = Integer.valueOf(cCharValue);
                            objArr4[1] = cancelall;
                            objArr4[0] = cancelall;
                            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                            if (objCopydefault3 == null) {
                                int i9 = (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 7117;
                                int iMyTid = 14 - (Process.myTid() >> 22);
                                char cBlue = (char) (Color.blue(0) + 44463);
                                Class[] clsArr = new Class[13];
                                clsArr[0] = Object.class;
                                clsArr[1] = Object.class;
                                clsArr[2] = Integer.TYPE;
                                clsArr[3] = Object.class;
                                clsArr[4] = Object.class;
                                clsArr[5] = Integer.TYPE;
                                clsArr[6] = Object.class;
                                clsArr[7] = Object.class;
                                clsArr[c3] = Integer.TYPE;
                                clsArr[9] = Object.class;
                                clsArr[10] = Object.class;
                                clsArr[11] = Integer.TYPE;
                                clsArr[12] = Object.class;
                                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i9, iMyTid, cBlue, 1150140696, false, "x", clsArr);
                            }
                            if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                                Object[] objArr5 = new Object[11];
                                objArr5[10] = cancelall;
                                objArr5[9] = Integer.valueOf(cCharValue);
                                objArr5[c3] = cancelall;
                                objArr5[7] = Integer.valueOf(cCharValue);
                                objArr5[6] = Integer.valueOf(cCharValue);
                                objArr5[5] = cancelall;
                                objArr5[4] = cancelall;
                                objArr5[3] = Integer.valueOf(cCharValue);
                                objArr5[2] = Integer.valueOf(cCharValue);
                                objArr5[1] = cancelall;
                                objArr5[0] = cancelall;
                                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                                if (objCopydefault4 == null) {
                                    int iResolveSize = View.resolveSize(0, 0) + 2944;
                                    int jumpTapTimeout = 24 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                    char mode = (char) (27637 - View.MeasureSpec.getMode(0));
                                    byte b3 = $$l[2];
                                    byte b4 = (byte) (b3 + 1);
                                    String str$$r = $$r(b4, (byte) (b4 | Ascii.NAK), (byte) (b3 + 1));
                                    c2 = '\b';
                                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iResolveSize, jumpTapTimeout, mode, 794909189, false, str$$r, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                } else {
                                    c2 = c3;
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                                int i10 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                                cArr4[cancelall.component2] = cArr2[iIntValue];
                                cArr4[cancelall.component2 + 1] = cArr2[i10];
                            } else {
                                c2 = c3;
                                obj = null;
                                if (cancelall.copydefault == cancelall.ShareDataUIState) {
                                    cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                                    cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                                    int i11 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                                    int i12 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                                    cArr4[cancelall.component2] = cArr2[i11];
                                    cArr4[cancelall.component2 + 1] = cArr2[i12];
                                } else {
                                    int i13 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                                    int i14 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                                    cArr4[cancelall.component2] = cArr2[i13];
                                    cArr4[cancelall.component2 + 1] = cArr2[i14];
                                }
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    cancelall.component2 += 2;
                    int i15 = $10 + 89;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    obj2 = obj;
                    c3 = c2;
                    j = 0;
                }
            }
            for (int i17 = 0; i17 < i; i17++) {
                cArr4[i17] = (char) (cArr4[i17] ^ 13722);
            }
            String str = new String(cArr4);
            int i18 = $11 + 11;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            objArr[0] = str;
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00a3  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.ui.activity.ManualActivity.onCreate(android.os.Bundle):void");
    }

    private void initView() {
        int i = 2 % 2;
        getWindow().setBackgroundDrawable(new ColorDrawable(ColorUtils.getColor(R.color.colorBackgroundFloating)));
        ViewUtils.softInputAdjustResize(getWindow(), ((QrcodeActivityManualBinding) this.binding).getRoot());
        if (AppConfigUtils.isLayoutRTL()) {
            int i2 = getRequestBeneficiariesState + 87;
            equals = i2 % 128;
            int i3 = i2 % 2;
            ((QrcodeActivityManualBinding) this.binding).inputText.getEditText().setGravity(8388629);
            ((QrcodeActivityManualBinding) this.binding).inputText.getEditText().setTextDirection(3);
            int i4 = getRequestBeneficiariesState + 7;
            equals = i4 % 128;
            int i5 = i4 % 2;
        }
        int iWithAlpha = com.huawei.common.util.color.ColorUtils.INSTANCE.withAlpha(0.3f, getColor(R.color.colorPrimary));
        ((QrcodeActivityManualBinding) this.binding).viewStep1.setBackgroundColor(iWithAlpha);
        ((QrcodeActivityManualBinding) this.binding).viewStep2.setBackgroundColor(iWithAlpha);
        ((QrcodeActivityManualBinding) this.binding).rbPayToMerchant.setChecked(true);
        ((QrcodeActivityManualBinding) this.binding).rbCashOutAgent.setChecked(false);
    }

    private void lambda$initListener$0(View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 7;
        equals = i2 % 128;
        int i3 = i2 % 2;
        ((QrcodeActivityManualBinding) this.binding).rbPayToMerchant.setChecked(true);
        ((QrcodeActivityManualBinding) this.binding).rbCashOutAgent.setChecked(false);
        int i4 = getRequestBeneficiariesState + 119;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    private void lambda$initListener$1(View view) {
        int i = 2 % 2;
        int i2 = equals + 63;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            ((QrcodeActivityManualBinding) this.binding).rbPayToMerchant.setChecked(true);
            ((QrcodeActivityManualBinding) this.binding).rbCashOutAgent.setChecked(false);
        } else {
            ((QrcodeActivityManualBinding) this.binding).rbPayToMerchant.setChecked(false);
            ((QrcodeActivityManualBinding) this.binding).rbCashOutAgent.setChecked(true);
        }
    }

    private void lambda$initListener$2(View view) {
        int i = 2 % 2;
        if (!TextUtils.isEmpty(((QrcodeActivityManualBinding) this.binding).inputText.getText())) {
            if (((QrcodeActivityManualBinding) this.binding).rbPayToMerchant.isChecked()) {
                int i2 = equals + 81;
                getRequestBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
                payToMerchant();
            } else if (((QrcodeActivityManualBinding) this.binding).rbCashOutAgent.isChecked()) {
                cashOutAgent();
            }
            int i4 = getRequestBeneficiariesState + 25;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        int i6 = equals + 67;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 != 0) {
            ToastUtils.showShort(getString(R.string.qrcode_enter_tips));
        } else {
            ToastUtils.showShort(getString(R.string.qrcode_enter_tips));
            throw null;
        }
    }

    private void initListener() {
        int i = 2 % 2;
        FastClickUtils.setOnClickListener(((QrcodeActivityManualBinding) this.binding).llPayToMerchant, new View.OnClickListener() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 39;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    ManualActivity.$r8$lambda$pBGThvx2fRenMfuEprNg6S6TVFM(this.f$0, view);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ManualActivity.$r8$lambda$pBGThvx2fRenMfuEprNg6S6TVFM(this.f$0, view);
                int i4 = copydefault + 59;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        FastClickUtils.setOnClickListener(((QrcodeActivityManualBinding) this.binding).llCashOutAgent, new View.OnClickListener() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = copydefault + 43;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                ManualActivity.m10955$r8$lambda$Qji1dp9c0On2ekqBLko27VbwAg(this.f$0, view);
                int i5 = ShareDataUIState + 99;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        ((QrcodeActivityManualBinding) this.binding).lbStart.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 115;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                ManualActivity.$r8$lambda$gHOUe94a1e37xJjZEyj316ts0xU(this.f$0, view);
                int i5 = copydefault + 107;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        ((QrcodeActivityManualBinding) this.binding).inputText.getEditText().setHint(R.string.manual_placeholder);
        int i2 = getRequestBeneficiariesState + 3;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    private void cashOutAgent() {
        int i = 2 % 2;
        String strTrim = ((QrcodeActivityManualBinding) this.binding).inputText.getText().trim();
        if (TextUtils.isEmpty(strTrim)) {
            int i2 = getRequestBeneficiariesState + 105;
            equals = i2 % 128;
            int i3 = i2 % 2;
            ToastUtils.showLong(getResources().getString(R.string.enter_short_code));
            return;
        }
        ((ScanViewModel) this.viewModel).verifyCashOut(new VerifyCashOutRequest(strTrim, strTrim));
        int i4 = equals + 19;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        ((com.huawei.digitalpayment.consumer.scan.viewmodel.ScanViewModel) r4.viewModel).verifyBuyGoodsTransfer(new com.huawei.digitalpayment.consumer.scan.model.request.VerifyBuyGoodsRequest(r1));
        r1 = com.huawei.digitalpayment.consumer.scan.ui.activity.ManualActivity.getRequestBeneficiariesState + 29;
        com.huawei.digitalpayment.consumer.scan.ui.activity.ManualActivity.equals = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
    
        com.huawei.common.util.ToastUtils.showLong(getResources().getString(com.huawei.digitalpayment.consumer.qrcode.R.string.enter_short_code));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void payToMerchant() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.scan.ui.activity.ManualActivity.getRequestBeneficiariesState
            int r1 = r1 + 85
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.scan.ui.activity.ManualActivity.equals = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L27
            Binding extends androidx.databinding.ViewDataBinding r1 = r4.binding
            com.huawei.digitalpayment.consumer.qrcode.databinding.QrcodeActivityManualBinding r1 = (com.huawei.digitalpayment.consumer.qrcode.databinding.QrcodeActivityManualBinding) r1
            com.huawei.common.widget.input.CommonInputView r1 = r1.inputText
            java.lang.String r1 = r1.getText()
            java.lang.String r1 = r1.trim()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 24
            int r3 = r3 / 0
            if (r2 == 0) goto L49
            goto L3b
        L27:
            Binding extends androidx.databinding.ViewDataBinding r1 = r4.binding
            com.huawei.digitalpayment.consumer.qrcode.databinding.QrcodeActivityManualBinding r1 = (com.huawei.digitalpayment.consumer.qrcode.databinding.QrcodeActivityManualBinding) r1
            com.huawei.common.widget.input.CommonInputView r1 = r1.inputText
            java.lang.String r1 = r1.getText()
            java.lang.String r1 = r1.trim()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L49
        L3b:
            android.content.res.Resources r0 = r4.getResources()
            int r1 = com.huawei.digitalpayment.consumer.qrcode.R.string.enter_short_code
            java.lang.String r0 = r0.getString(r1)
            com.huawei.common.util.ToastUtils.showLong(r0)
            return
        L49:
            VM extends androidx.lifecycle.ViewModel r2 = r4.viewModel
            com.huawei.digitalpayment.consumer.scan.viewmodel.ScanViewModel r2 = (com.huawei.digitalpayment.consumer.scan.viewmodel.ScanViewModel) r2
            com.huawei.digitalpayment.consumer.scan.model.request.VerifyBuyGoodsRequest r3 = new com.huawei.digitalpayment.consumer.scan.model.request.VerifyBuyGoodsRequest
            r3.<init>(r1)
            r2.verifyBuyGoodsTransfer(r3)
            int r1 = com.huawei.digitalpayment.consumer.scan.ui.activity.ManualActivity.getRequestBeneficiariesState
            int r1 = r1 + 29
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.scan.ui.activity.ManualActivity.equals = r2
            int r1 = r1 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.ui.activity.ManualActivity.payToMerchant():void");
    }

    private void lambda$addObserver$3(Resource resource) {
        int i = 2 % 2;
        int i2 = equals + 115;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            if (!(!resource.loading())) {
                DialogManager.showLoading(this.activity);
                return;
            }
            DialogManager.hideLoading(this.activity);
            if (resource.error()) {
                int i3 = equals + 91;
                getRequestBeneficiariesState = i3 % 128;
                int i4 = i3 % 2;
                Utils.toastError(resource);
                int i5 = equals + 33;
                getRequestBeneficiariesState = i5 % 128;
                int i6 = i5 % 2;
            }
            if (resource.success()) {
                VerifyNumberResp verifyNumberResp = (VerifyNumberResp) resource.getData();
                if (CustomerType.REGISTERED.getName().equals(verifyNumberResp.getCustomerType())) {
                    toRegisteredP2pTransfer(verifyNumberResp);
                    return;
                } else {
                    showQrcodeTipsDialog(verifyNumberResp);
                    return;
                }
            }
            return;
        }
        resource.loading();
        throw null;
    }

    private void lambda$addObserver$4(Resource resource) {
        int i = 2 % 2;
        if (resource.loading()) {
            DialogManager.showLoading(this.activity);
            return;
        }
        DialogManager.hideLoading(this.activity);
        if (resource.error()) {
            Utils.toastError(resource);
        }
        if (resource.success()) {
            int i2 = equals + 21;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            toBuyGoods((VerifyNumberResp) resource.getData());
        }
        int i4 = getRequestBeneficiariesState + 111;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    private void addObserver() {
        int i = 2 % 2;
        ((ScanViewModel) this.viewModel).getVerifyP2pTransfer().observe(this, new Observer() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = component2 + 107;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    ManualActivity.$r8$lambda$b1Pm5Mw28Rjzxp3zJix1vgQW4eo(this.f$0, (Resource) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                ManualActivity.$r8$lambda$b1Pm5Mw28Rjzxp3zJix1vgQW4eo(this.f$0, (Resource) obj);
                int i4 = component2 + 27;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 47 / 0;
                }
            }
        });
        ((ScanViewModel) this.viewModel).getVerifyBuyGoodsTransfer().observe(this, new Observer() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 91;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                ManualActivity.$r8$lambda$0M_ZsQviykuB1DdACnrG7sClYsw(this.f$0, (Resource) obj);
                if (i4 != 0) {
                    int i5 = 26 / 0;
                }
            }
        });
        ((ScanViewModel) this.viewModel).getVerifyCashOut().observe(this, new Observer() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = component2 + 89;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                ManualActivity.$r8$lambda$axR3xxbqgnX1XHLMdpWwjRwwOU0(this.f$0, (Resource) obj);
                int i5 = component3 + 91;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        int i2 = getRequestBeneficiariesState + 41;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    private void lambda$addObserver$5(Resource resource) {
        int i = 2 % 2;
        int i2 = equals + 113;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        if (resource.loading()) {
            DialogManager.showLoading(this.activity);
            return;
        }
        DialogManager.hideLoading(this.activity);
        if (resource.error()) {
            int i4 = equals + 97;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 != 0) {
                Utils.toastError(resource);
            } else {
                Utils.toastError(resource);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        if (resource.success()) {
            toCashOut((VerifyNumberResp) resource.getData());
        }
    }

    private void toCashOut(VerifyNumberResp verifyNumberResp) {
        String string;
        int i = 2 % 2;
        int i2 = equals + 89;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            string = SPUtils.getInstance().getString(SPConstant.MINIAPP_CASH_OUT_UEL, "");
            int i3 = 33 / 0;
            if (TextUtils.isEmpty(string)) {
                return;
            }
        } else {
            string = SPUtils.getInstance().getString(SPConstant.MINIAPP_CASH_OUT_UEL, "");
            if (TextUtils.isEmpty(string)) {
                return;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString(KeysConstants.SHORT_CODE, verifyNumberResp.getShortCode());
        bundle.putString("publicName", verifyNumberResp.getPublicName());
        RouteUtils.routeWithExecute(string, bundle);
        int i4 = equals + 31;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    private void lambda$showQrcodeTipsDialog$6(VerifyNumberResp verifyNumberResp, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 87;
        equals = i2 % 128;
        int i3 = i2 % 2;
        toUnregisteredP2pTransfer(verifyNumberResp);
        int i4 = getRequestBeneficiariesState + 7;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    private void showQrcodeTipsDialog(final VerifyNumberResp verifyNumberResp) {
        int i = 2 % 2;
        new QrCodeTipsDialog.Builder().setContent(getString(R.string.this_phone_number_not_registered)).setLeftButtonText(getString(R.string.no_give_up)).setRightButtonText(getString(R.string.yes_still_transfer)).setRightClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component2 + 17;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                ManualActivity.$r8$lambda$1zNO_BbK3DrePFPJEb_CP9RTsl0(this.f$0, verifyNumberResp, view);
                int i5 = component2 + 5;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
        }).build().show(getSupportFragmentManager(), "tipsDialog");
        int i2 = equals + 51;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    private void toBuyGoods(VerifyNumberResp verifyNumberResp) {
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        bundle.putString(KeysConstants.SHORT_CODE, verifyNumberResp.getShortCode());
        bundle.putString("publicName", verifyNumberResp.getPublicName());
        bundle.putString("avatar", verifyNumberResp.getAvatar());
        bundle.putString("tradeType", PayTradeTypeEnum.NATIVE_APP.getTradeType());
        RouteUtils.routeWithExecute(RoutePathConstants.CUSTOMER_BUY_GOODS, bundle);
        int i2 = equals + 37;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 55 / 0;
        }
    }

    private void toRegisteredP2pTransfer(VerifyNumberResp verifyNumberResp) {
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        bundle.putString("msisdn", verifyNumberResp.getMsisdn());
        bundle.putString("publicName", verifyNumberResp.getPublicName());
        bundle.putString("tradeType", PayTradeTypeEnum.NATIVE_APP.getTradeType());
        bundle.putString("customerType", verifyNumberResp.getCustomerType());
        bundle.putString("avatar", verifyNumberResp.getAvatar());
        RouteUtils.routeWithExecute(RoutePathConstants.P2P_TRANSFER, bundle);
        int i2 = equals + 65;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    private void toUnregisteredP2pTransfer(VerifyNumberResp verifyNumberResp) {
        int i = 2 % 2;
        int i2 = equals + 111;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        toRegisteredP2pTransfer(verifyNumberResp);
        int i4 = equals + 85;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0102  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.ui.activity.ManualActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x011d  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.ui.activity.ManualActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(60:836|49|(1:51)|52|53|76|(11:885|77|(3:79|866|80)|85|86|877|(5:88|89|(1:91)|92|93)(25:94|95|878|96|97|864|98|(2:821|100)|104|105|849|106|(2:853|108)|112|113|114|(3:116|814|117)|121|122|838|123|(3:125|851|126)(1:128)|129|(1:131)|132)|133|(4:136|(2:138|913)(11:139|(3:141|(3:144|145|142)|914)|148|825|149|(1:151)|152|153|816|154|912)|155|134)|911|167)|201|(8:829|202|(1:204)|205|(3:207|(1:209)|210)(14:212|213|819|214|(1:216)|217|218|219|(1:221)|222|(1:224)|225|(1:227)|228)|211|229|(9:232|810|233|(1:235)|236|237|238|802|239))|269|(8:876|270|(1:272)|273|(3:275|(1:277)|278)(19:279|280|868|281|(1:283)|284|285|857|286|(1:288)|289|290|291|(1:293)|294|(1:296)|297|(1:299)|300)|301|(4:304|(3:893|306|896)(12:891|307|(3:309|(3:312|313|310)|897)|314|845|315|(1:317)|318|319|834|320|895)|894|302)|892)|355|(8:889|356|(2:789|358)|363|(1:365)|366|367|859)|(5:369|370|(1:372)|373|374)(45:375|(3:791|377|(1:383)(1:382))(1:387)|(20:881|389|872|390|(2:823|392)|396|397|860|398|(3:400|870|401)|405|406|407|(1:409)|410|(1:412)(1:414)|415|(1:417)|418|419)|469|485|(1:487)|488|(1:490)|491|(3:493|(1:495)|496)(16:498|499|(1:501)|502|(1:504)|505|506|(1:508)|509|862|510|511|(1:513)(1:514)|515|(1:517)|518)|497|519|(1:521)(9:522|(3:524|(2:527|525)|910)|528|529|(1:531)|532|(1:534)|535|536)|537|(1:539)|540|(3:542|(1:544)|545)(14:546|547|(1:549)|550|551|(1:553)|554|874|555|556|(1:558)(1:559)|560|(1:562)|563)|564|(1:566)(9:567|(3:569|(2:572|570)|909)|573|574|(1:576)|577|(1:579)|580|581)|582|827|583|(2:840|585)|589|(2:591|592)|593|594|(4:596|597|(1:599)|600)(26:(2:602|(1:608)(1:607))|(22:610|611|801|612|613|812|614|(1:616)|617|618|804|619|(1:621)|622|623|624|(1:626)|627|(1:629)|630|(1:632)|633)(15:678|693|(1:695)|696|(3:698|(1:700)|701)(13:703|799|704|705|(1:707)|708|887|709|710|(1:712)|713|(1:715)|716)|702|717|(6:720|721|(1:723)|724|725|726)|727|(1:729)|730|(3:732|(1:734)|735)(14:737|738|(1:740)|741|742|(1:744)|745|830|746|747|(1:749)|750|(1:752)|753)|736|754|(1:915)(7:757|758|(1:760)|761|762|763|764))|681|682|806|683|686|687|(1:689)|690|691|692|693|(0)|696|(0)(0)|702|717|(0)|727|(0)|730|(0)(0)|736|754|(0)(0))|634|(4:637|(3:904|639|907)(12:903|640|(3:642|(3:645|646|643)|908)|647|797|648|(1:650)|651|652|793|653|906)|905|635)|902|693|(0)|696|(0)(0)|702|717|(0)|727|(0)|730|(0)(0)|736|754|(0)(0))|420|421|(4:424|(2:426|900)(11:427|(3:429|(3:432|433|430)|901)|434|843|435|(1:437)|438|439|832|440|899)|441|422)|898|469|485|(0)|488|(0)|491|(0)(0)|497|519|(0)(0)|537|(0)|540|(0)(0)|564|(0)(0)|582|827|583|(0)|589|(0)|593|594|(0)(0)|634|(1:635)|902|693|(0)|696|(0)(0)|702|717|(0)|727|(0)|730|(0)(0)|736|754|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:679:0x2fde, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:680:0x2fdf, code lost:
    
        r4 = r34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0ccd A[Catch: all -> 0x056d, TryCatch #29 {all -> 0x056d, blocks: (B:195:0x0cc7, B:197:0x0ccd, B:198:0x0cf6, B:479:0x1dd9, B:481:0x1ddf, B:482:0x1e07, B:721:0x33cb, B:723:0x33d1, B:724:0x33fa, B:758:0x36fa, B:760:0x3700, B:761:0x3727, B:738:0x354c, B:740:0x356f, B:741:0x35ba, B:687:0x307e, B:689:0x3084, B:690:0x30ab, B:574:0x2984, B:576:0x298a, B:577:0x29b0, B:579:0x29ea, B:580:0x2a32, B:547:0x26c0, B:549:0x26d5, B:550:0x2704, B:529:0x2398, B:531:0x239e, B:532:0x23c7, B:534:0x2401, B:535:0x244c, B:499:0x204a, B:501:0x205f, B:502:0x2094, B:504:0x20c8, B:505:0x2147, B:349:0x16ad, B:351:0x16b3, B:352:0x16da, B:263:0x116b, B:265:0x1171, B:266:0x119b, B:70:0x06fe, B:72:0x0704, B:73:0x072f, B:19:0x0285, B:21:0x028b, B:22:0x02b7, B:24:0x04de, B:26:0x0510, B:27:0x0565), top: B:841:0x0285 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0d7d A[Catch: all -> 0x10e2, TryCatch #22 {all -> 0x10e2, blocks: (B:202:0x0d77, B:204:0x0d7d, B:205:0x0dbf, B:207:0x0dcc, B:209:0x0dd5, B:210:0x0e23, B:229:0x0fd3, B:237:0x103f, B:243:0x10c6, B:245:0x10cc, B:246:0x10cd, B:248:0x10cf, B:250:0x10d6, B:251:0x10d7, B:212:0x0e2f, B:219:0x0eb9, B:221:0x0ebf, B:222:0x0f07, B:224:0x0f31, B:225:0x0f75, B:227:0x0f8b, B:228:0x0fcb, B:253:0x10d9, B:255:0x10e0, B:256:0x10e1, B:239:0x104f, B:233:0x1008, B:235:0x100e, B:236:0x1038, B:214:0x0e4f, B:216:0x0e61, B:217:0x0ead), top: B:829:0x0d77, outer: #16, inners: #8, #12, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0dcc A[Catch: all -> 0x10e2, TryCatch #22 {all -> 0x10e2, blocks: (B:202:0x0d77, B:204:0x0d7d, B:205:0x0dbf, B:207:0x0dcc, B:209:0x0dd5, B:210:0x0e23, B:229:0x0fd3, B:237:0x103f, B:243:0x10c6, B:245:0x10cc, B:246:0x10cd, B:248:0x10cf, B:250:0x10d6, B:251:0x10d7, B:212:0x0e2f, B:219:0x0eb9, B:221:0x0ebf, B:222:0x0f07, B:224:0x0f31, B:225:0x0f75, B:227:0x0f8b, B:228:0x0fcb, B:253:0x10d9, B:255:0x10e0, B:256:0x10e1, B:239:0x104f, B:233:0x1008, B:235:0x100e, B:236:0x1038, B:214:0x0e4f, B:216:0x0e61, B:217:0x0ead), top: B:829:0x0d77, outer: #16, inners: #8, #12, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0e2f A[Catch: all -> 0x10e2, TRY_LEAVE, TryCatch #22 {all -> 0x10e2, blocks: (B:202:0x0d77, B:204:0x0d7d, B:205:0x0dbf, B:207:0x0dcc, B:209:0x0dd5, B:210:0x0e23, B:229:0x0fd3, B:237:0x103f, B:243:0x10c6, B:245:0x10cc, B:246:0x10cd, B:248:0x10cf, B:250:0x10d6, B:251:0x10d7, B:212:0x0e2f, B:219:0x0eb9, B:221:0x0ebf, B:222:0x0f07, B:224:0x0f31, B:225:0x0f75, B:227:0x0f8b, B:228:0x0fcb, B:253:0x10d9, B:255:0x10e0, B:256:0x10e1, B:239:0x104f, B:233:0x1008, B:235:0x100e, B:236:0x1038, B:214:0x0e4f, B:216:0x0e61, B:217:0x0ead), top: B:829:0x0d77, outer: #16, inners: #8, #12, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0fe5  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x1221 A[Catch: all -> 0x160e, TryCatch #47 {all -> 0x160e, blocks: (B:270:0x121b, B:272:0x1221, B:273:0x1269, B:275:0x1276, B:277:0x127f, B:278:0x12bf, B:301:0x14d8, B:302:0x14dc, B:304:0x14e2, B:307:0x14fa, B:310:0x1507, B:312:0x150a, B:324:0x15e8, B:326:0x15ee, B:327:0x15ef, B:329:0x15f1, B:331:0x15f8, B:332:0x15f9, B:279:0x12ca, B:291:0x13ba, B:293:0x13c0, B:294:0x1400, B:296:0x142a, B:297:0x1471, B:299:0x1487, B:300:0x14d2, B:334:0x15fb, B:336:0x1602, B:337:0x1603, B:339:0x1605, B:341:0x160c, B:342:0x160d, B:320:0x156c, B:315:0x1536, B:317:0x153c, B:318:0x1564, B:286:0x1332, B:288:0x1347, B:289:0x13ae, B:281:0x12ea, B:283:0x12ff, B:284:0x132b), top: B:876:0x121b, outer: #16, inners: #25, #31, #37, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x1276 A[Catch: all -> 0x160e, TryCatch #47 {all -> 0x160e, blocks: (B:270:0x121b, B:272:0x1221, B:273:0x1269, B:275:0x1276, B:277:0x127f, B:278:0x12bf, B:301:0x14d8, B:302:0x14dc, B:304:0x14e2, B:307:0x14fa, B:310:0x1507, B:312:0x150a, B:324:0x15e8, B:326:0x15ee, B:327:0x15ef, B:329:0x15f1, B:331:0x15f8, B:332:0x15f9, B:279:0x12ca, B:291:0x13ba, B:293:0x13c0, B:294:0x1400, B:296:0x142a, B:297:0x1471, B:299:0x1487, B:300:0x14d2, B:334:0x15fb, B:336:0x1602, B:337:0x1603, B:339:0x1605, B:341:0x160c, B:342:0x160d, B:320:0x156c, B:315:0x1536, B:317:0x153c, B:318:0x1564, B:286:0x1332, B:288:0x1347, B:289:0x13ae, B:281:0x12ea, B:283:0x12ff, B:284:0x132b), top: B:876:0x121b, outer: #16, inners: #25, #31, #37, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x12ca A[Catch: all -> 0x160e, TRY_LEAVE, TryCatch #47 {all -> 0x160e, blocks: (B:270:0x121b, B:272:0x1221, B:273:0x1269, B:275:0x1276, B:277:0x127f, B:278:0x12bf, B:301:0x14d8, B:302:0x14dc, B:304:0x14e2, B:307:0x14fa, B:310:0x1507, B:312:0x150a, B:324:0x15e8, B:326:0x15ee, B:327:0x15ef, B:329:0x15f1, B:331:0x15f8, B:332:0x15f9, B:279:0x12ca, B:291:0x13ba, B:293:0x13c0, B:294:0x1400, B:296:0x142a, B:297:0x1471, B:299:0x1487, B:300:0x14d2, B:334:0x15fb, B:336:0x1602, B:337:0x1603, B:339:0x1605, B:341:0x160c, B:342:0x160d, B:320:0x156c, B:315:0x1536, B:317:0x153c, B:318:0x1564, B:286:0x1332, B:288:0x1347, B:289:0x13ae, B:281:0x12ea, B:283:0x12ff, B:284:0x132b), top: B:876:0x121b, outer: #16, inners: #25, #31, #37, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x14e2 A[Catch: all -> 0x160e, TryCatch #47 {all -> 0x160e, blocks: (B:270:0x121b, B:272:0x1221, B:273:0x1269, B:275:0x1276, B:277:0x127f, B:278:0x12bf, B:301:0x14d8, B:302:0x14dc, B:304:0x14e2, B:307:0x14fa, B:310:0x1507, B:312:0x150a, B:324:0x15e8, B:326:0x15ee, B:327:0x15ef, B:329:0x15f1, B:331:0x15f8, B:332:0x15f9, B:279:0x12ca, B:291:0x13ba, B:293:0x13c0, B:294:0x1400, B:296:0x142a, B:297:0x1471, B:299:0x1487, B:300:0x14d2, B:334:0x15fb, B:336:0x1602, B:337:0x1603, B:339:0x1605, B:341:0x160c, B:342:0x160d, B:320:0x156c, B:315:0x1536, B:317:0x153c, B:318:0x1564, B:286:0x1332, B:288:0x1347, B:289:0x13ae, B:281:0x12ea, B:283:0x12ff, B:284:0x132b), top: B:876:0x121b, outer: #16, inners: #25, #31, #37, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x17d8 A[Catch: all -> 0x17a9, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x17a9, blocks: (B:358:0x175e, B:365:0x17d8, B:370:0x1839, B:372:0x183f, B:373:0x1884), top: B:789:0x175e }] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x1836  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x1894  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x1bdf A[Catch: all -> 0x1d14, TryCatch #51 {all -> 0x1d14, blocks: (B:420:0x1bcc, B:422:0x1bd9, B:424:0x1bdf, B:427:0x1bfa, B:389:0x18b5, B:407:0x1a9a, B:410:0x1ae5, B:415:0x1b5b, B:418:0x1bbc), top: B:881:0x18b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:481:0x1ddf A[Catch: all -> 0x056d, TryCatch #29 {all -> 0x056d, blocks: (B:195:0x0cc7, B:197:0x0ccd, B:198:0x0cf6, B:479:0x1dd9, B:481:0x1ddf, B:482:0x1e07, B:721:0x33cb, B:723:0x33d1, B:724:0x33fa, B:758:0x36fa, B:760:0x3700, B:761:0x3727, B:738:0x354c, B:740:0x356f, B:741:0x35ba, B:687:0x307e, B:689:0x3084, B:690:0x30ab, B:574:0x2984, B:576:0x298a, B:577:0x29b0, B:579:0x29ea, B:580:0x2a32, B:547:0x26c0, B:549:0x26d5, B:550:0x2704, B:529:0x2398, B:531:0x239e, B:532:0x23c7, B:534:0x2401, B:535:0x244c, B:499:0x204a, B:501:0x205f, B:502:0x2094, B:504:0x20c8, B:505:0x2147, B:349:0x16ad, B:351:0x16b3, B:352:0x16da, B:263:0x116b, B:265:0x1171, B:266:0x119b, B:70:0x06fe, B:72:0x0704, B:73:0x072f, B:19:0x0285, B:21:0x028b, B:22:0x02b7, B:24:0x04de, B:26:0x0510, B:27:0x0565), top: B:841:0x0285 }] */
    /* JADX WARN: Removed duplicated region for block: B:487:0x1e94  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x1efe  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x1f54  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x202a  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x2286  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x2359  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x256a  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x25b7  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x269e  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x2845  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x293b  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x2b9a  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x2bf5  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x2c44  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x2ea3 A[Catch: all -> 0x2fc4, TryCatch #7 {all -> 0x2fc4, blocks: (B:634:0x2e97, B:635:0x2e9b, B:637:0x2ea3, B:640:0x2eba, B:643:0x2ed1, B:645:0x2ed4, B:657:0x2fb2, B:659:0x2fb8, B:660:0x2fb9, B:662:0x2fbb, B:664:0x2fc2, B:665:0x2fc3, B:612:0x2c6a, B:624:0x2d71, B:626:0x2d77, B:627:0x2dbd, B:629:0x2de7, B:630:0x2e32, B:632:0x2e48, B:633:0x2e91, B:669:0x2fc7, B:671:0x2fce, B:672:0x2fcf, B:674:0x2fd1, B:676:0x2fd8, B:677:0x2fd9, B:653:0x2f3a, B:648:0x2f00, B:650:0x2f06, B:651:0x2f32, B:619:0x2ccc, B:621:0x2ceb, B:622:0x2d65, B:614:0x2c7e, B:616:0x2c93, B:617:0x2cc5), top: B:801:0x2c6a, inners: #3, #5, #9, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:689:0x3084 A[Catch: all -> 0x056d, TryCatch #29 {all -> 0x056d, blocks: (B:195:0x0cc7, B:197:0x0ccd, B:198:0x0cf6, B:479:0x1dd9, B:481:0x1ddf, B:482:0x1e07, B:721:0x33cb, B:723:0x33d1, B:724:0x33fa, B:758:0x36fa, B:760:0x3700, B:761:0x3727, B:738:0x354c, B:740:0x356f, B:741:0x35ba, B:687:0x307e, B:689:0x3084, B:690:0x30ab, B:574:0x2984, B:576:0x298a, B:577:0x29b0, B:579:0x29ea, B:580:0x2a32, B:547:0x26c0, B:549:0x26d5, B:550:0x2704, B:529:0x2398, B:531:0x239e, B:532:0x23c7, B:534:0x2401, B:535:0x244c, B:499:0x204a, B:501:0x205f, B:502:0x2094, B:504:0x20c8, B:505:0x2147, B:349:0x16ad, B:351:0x16b3, B:352:0x16da, B:263:0x116b, B:265:0x1171, B:266:0x119b, B:70:0x06fe, B:72:0x0704, B:73:0x072f, B:19:0x0285, B:21:0x028b, B:22:0x02b7, B:24:0x04de, B:26:0x0510, B:27:0x0565), top: B:841:0x0285 }] */
    /* JADX WARN: Removed duplicated region for block: B:695:0x313a  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x3189  */
    /* JADX WARN: Removed duplicated region for block: B:703:0x31ed  */
    /* JADX WARN: Removed duplicated region for block: B:720:0x33ab  */
    /* JADX WARN: Removed duplicated region for block: B:729:0x3485  */
    /* JADX WARN: Removed duplicated region for block: B:732:0x34da  */
    /* JADX WARN: Removed duplicated region for block: B:737:0x352e  */
    /* JADX WARN: Removed duplicated region for block: B:757:0x36da  */
    /* JADX WARN: Removed duplicated region for block: B:789:0x175e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:840:0x2b27 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:915:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v100, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v105 */
    /* JADX WARN: Type inference failed for: r11v106 */
    /* JADX WARN: Type inference failed for: r11v107 */
    /* JADX WARN: Type inference failed for: r11v108 */
    /* JADX WARN: Type inference failed for: r11v110 */
    /* JADX WARN: Type inference failed for: r11v113 */
    /* JADX WARN: Type inference failed for: r11v135 */
    /* JADX WARN: Type inference failed for: r11v136 */
    /* JADX WARN: Type inference failed for: r11v137 */
    /* JADX WARN: Type inference failed for: r11v138 */
    /* JADX WARN: Type inference failed for: r11v139 */
    /* JADX WARN: Type inference failed for: r11v140 */
    /* JADX WARN: Type inference failed for: r11v141 */
    /* JADX WARN: Type inference failed for: r11v142 */
    /* JADX WARN: Type inference failed for: r11v74 */
    /* JADX WARN: Type inference failed for: r11v75 */
    /* JADX WARN: Type inference failed for: r11v76 */
    /* JADX WARN: Type inference failed for: r11v77, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v82 */
    /* JADX WARN: Type inference failed for: r11v83 */
    /* JADX WARN: Type inference failed for: r11v84 */
    /* JADX WARN: Type inference failed for: r13v132 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v51 */
    /* JADX WARN: Type inference failed for: r14v52 */
    /* JADX WARN: Type inference failed for: r14v53 */
    /* JADX WARN: Type inference failed for: r14v54 */
    /* JADX WARN: Type inference failed for: r14v55 */
    /* JADX WARN: Type inference failed for: r14v56 */
    /* JADX WARN: Type inference failed for: r1v213 */
    /* JADX WARN: Type inference failed for: r1v219, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r1v226 */
    /* JADX WARN: Type inference failed for: r1v246 */
    /* JADX WARN: Type inference failed for: r1v252 */
    /* JADX WARN: Type inference failed for: r1v253 */
    /* JADX WARN: Type inference failed for: r1v263, types: [int] */
    /* JADX WARN: Type inference failed for: r1v264 */
    /* JADX WARN: Type inference failed for: r1v265 */
    /* JADX WARN: Type inference failed for: r1v266 */
    /* JADX WARN: Type inference failed for: r1v267 */
    /* JADX WARN: Type inference failed for: r1v268 */
    /* JADX WARN: Type inference failed for: r1v269 */
    /* JADX WARN: Type inference failed for: r1v276 */
    /* JADX WARN: Type inference failed for: r1v412 */
    /* JADX WARN: Type inference failed for: r1v413 */
    /* JADX WARN: Type inference failed for: r1v414 */
    /* JADX WARN: Type inference failed for: r1v415 */
    /* JADX WARN: Type inference failed for: r1v416 */
    /* JADX WARN: Type inference failed for: r1v417 */
    /* JADX WARN: Type inference failed for: r1v418 */
    /* JADX WARN: Type inference failed for: r1v419 */
    /* JADX WARN: Type inference failed for: r1v420 */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r1v68 */
    /* JADX WARN: Type inference failed for: r2v390 */
    /* JADX WARN: Type inference failed for: r2v573 */
    /* JADX WARN: Type inference failed for: r2v574 */
    /* JADX WARN: Type inference failed for: r2v583, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v598 */
    /* JADX WARN: Type inference failed for: r2v802 */
    /* JADX WARN: Type inference failed for: r33v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r33v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r33v21 */
    /* JADX WARN: Type inference failed for: r33v22 */
    /* JADX WARN: Type inference failed for: r33v23 */
    /* JADX WARN: Type inference failed for: r33v34 */
    /* JADX WARN: Type inference failed for: r33v35 */
    /* JADX WARN: Type inference failed for: r33v36 */
    /* JADX WARN: Type inference failed for: r33v39 */
    /* JADX WARN: Type inference failed for: r33v40 */
    /* JADX WARN: Type inference failed for: r33v41 */
    /* JADX WARN: Type inference failed for: r33v57 */
    /* JADX WARN: Type inference failed for: r33v58 */
    /* JADX WARN: Type inference failed for: r33v59 */
    /* JADX WARN: Type inference failed for: r33v60 */
    /* JADX WARN: Type inference failed for: r33v61 */
    /* JADX WARN: Type inference failed for: r33v7 */
    /* JADX WARN: Type inference failed for: r33v8 */
    /* JADX WARN: Type inference failed for: r33v9 */
    /* JADX WARN: Type inference failed for: r34v100 */
    /* JADX WARN: Type inference failed for: r34v105 */
    /* JADX WARN: Type inference failed for: r34v107 */
    /* JADX WARN: Type inference failed for: r34v110 */
    /* JADX WARN: Type inference failed for: r34v111 */
    /* JADX WARN: Type inference failed for: r34v112 */
    /* JADX WARN: Type inference failed for: r34v113 */
    /* JADX WARN: Type inference failed for: r34v114 */
    /* JADX WARN: Type inference failed for: r34v119 */
    /* JADX WARN: Type inference failed for: r34v126 */
    /* JADX WARN: Type inference failed for: r34v136 */
    /* JADX WARN: Type inference failed for: r34v138 */
    /* JADX WARN: Type inference failed for: r34v14 */
    /* JADX WARN: Type inference failed for: r34v140 */
    /* JADX WARN: Type inference failed for: r34v141 */
    /* JADX WARN: Type inference failed for: r34v142 */
    /* JADX WARN: Type inference failed for: r34v143 */
    /* JADX WARN: Type inference failed for: r34v147 */
    /* JADX WARN: Type inference failed for: r34v148 */
    /* JADX WARN: Type inference failed for: r34v151 */
    /* JADX WARN: Type inference failed for: r34v153 */
    /* JADX WARN: Type inference failed for: r34v154 */
    /* JADX WARN: Type inference failed for: r34v157 */
    /* JADX WARN: Type inference failed for: r34v158 */
    /* JADX WARN: Type inference failed for: r34v175 */
    /* JADX WARN: Type inference failed for: r34v176 */
    /* JADX WARN: Type inference failed for: r34v177 */
    /* JADX WARN: Type inference failed for: r34v178 */
    /* JADX WARN: Type inference failed for: r34v179 */
    /* JADX WARN: Type inference failed for: r34v180 */
    /* JADX WARN: Type inference failed for: r34v183 */
    /* JADX WARN: Type inference failed for: r34v184 */
    /* JADX WARN: Type inference failed for: r34v185 */
    /* JADX WARN: Type inference failed for: r34v186 */
    /* JADX WARN: Type inference failed for: r34v187 */
    /* JADX WARN: Type inference failed for: r34v188 */
    /* JADX WARN: Type inference failed for: r34v189 */
    /* JADX WARN: Type inference failed for: r34v190 */
    /* JADX WARN: Type inference failed for: r34v193 */
    /* JADX WARN: Type inference failed for: r34v194 */
    /* JADX WARN: Type inference failed for: r34v195 */
    /* JADX WARN: Type inference failed for: r34v196 */
    /* JADX WARN: Type inference failed for: r34v197 */
    /* JADX WARN: Type inference failed for: r34v198 */
    /* JADX WARN: Type inference failed for: r34v199 */
    /* JADX WARN: Type inference failed for: r34v20 */
    /* JADX WARN: Type inference failed for: r34v200 */
    /* JADX WARN: Type inference failed for: r34v201 */
    /* JADX WARN: Type inference failed for: r34v202 */
    /* JADX WARN: Type inference failed for: r34v203 */
    /* JADX WARN: Type inference failed for: r34v204 */
    /* JADX WARN: Type inference failed for: r34v205 */
    /* JADX WARN: Type inference failed for: r34v206 */
    /* JADX WARN: Type inference failed for: r34v207 */
    /* JADX WARN: Type inference failed for: r34v208 */
    /* JADX WARN: Type inference failed for: r34v209 */
    /* JADX WARN: Type inference failed for: r34v210 */
    /* JADX WARN: Type inference failed for: r34v211 */
    /* JADX WARN: Type inference failed for: r34v212 */
    /* JADX WARN: Type inference failed for: r34v213 */
    /* JADX WARN: Type inference failed for: r34v214 */
    /* JADX WARN: Type inference failed for: r34v215 */
    /* JADX WARN: Type inference failed for: r34v216 */
    /* JADX WARN: Type inference failed for: r34v217 */
    /* JADX WARN: Type inference failed for: r34v218 */
    /* JADX WARN: Type inference failed for: r34v219 */
    /* JADX WARN: Type inference failed for: r34v22 */
    /* JADX WARN: Type inference failed for: r34v220 */
    /* JADX WARN: Type inference failed for: r34v221 */
    /* JADX WARN: Type inference failed for: r34v222 */
    /* JADX WARN: Type inference failed for: r34v223 */
    /* JADX WARN: Type inference failed for: r34v224 */
    /* JADX WARN: Type inference failed for: r34v225 */
    /* JADX WARN: Type inference failed for: r34v226 */
    /* JADX WARN: Type inference failed for: r34v227 */
    /* JADX WARN: Type inference failed for: r34v228 */
    /* JADX WARN: Type inference failed for: r34v229 */
    /* JADX WARN: Type inference failed for: r34v23 */
    /* JADX WARN: Type inference failed for: r34v230 */
    /* JADX WARN: Type inference failed for: r34v233 */
    /* JADX WARN: Type inference failed for: r34v234 */
    /* JADX WARN: Type inference failed for: r34v235 */
    /* JADX WARN: Type inference failed for: r34v236 */
    /* JADX WARN: Type inference failed for: r34v237 */
    /* JADX WARN: Type inference failed for: r34v238 */
    /* JADX WARN: Type inference failed for: r34v239 */
    /* JADX WARN: Type inference failed for: r34v24 */
    /* JADX WARN: Type inference failed for: r34v240 */
    /* JADX WARN: Type inference failed for: r34v241 */
    /* JADX WARN: Type inference failed for: r34v242 */
    /* JADX WARN: Type inference failed for: r34v243 */
    /* JADX WARN: Type inference failed for: r34v244 */
    /* JADX WARN: Type inference failed for: r34v245 */
    /* JADX WARN: Type inference failed for: r34v246 */
    /* JADX WARN: Type inference failed for: r34v247 */
    /* JADX WARN: Type inference failed for: r34v248 */
    /* JADX WARN: Type inference failed for: r34v249 */
    /* JADX WARN: Type inference failed for: r34v25 */
    /* JADX WARN: Type inference failed for: r34v250 */
    /* JADX WARN: Type inference failed for: r34v251 */
    /* JADX WARN: Type inference failed for: r34v252 */
    /* JADX WARN: Type inference failed for: r34v253 */
    /* JADX WARN: Type inference failed for: r34v254 */
    /* JADX WARN: Type inference failed for: r34v33 */
    /* JADX WARN: Type inference failed for: r34v34 */
    /* JADX WARN: Type inference failed for: r34v4 */
    /* JADX WARN: Type inference failed for: r34v41 */
    /* JADX WARN: Type inference failed for: r34v42 */
    /* JADX WARN: Type inference failed for: r34v6 */
    /* JADX WARN: Type inference failed for: r34v61 */
    /* JADX WARN: Type inference failed for: r34v62 */
    /* JADX WARN: Type inference failed for: r34v63 */
    /* JADX WARN: Type inference failed for: r34v65 */
    /* JADX WARN: Type inference failed for: r34v66 */
    /* JADX WARN: Type inference failed for: r34v67 */
    /* JADX WARN: Type inference failed for: r34v68 */
    /* JADX WARN: Type inference failed for: r34v7 */
    /* JADX WARN: Type inference failed for: r34v70 */
    /* JADX WARN: Type inference failed for: r34v71 */
    /* JADX WARN: Type inference failed for: r34v73 */
    /* JADX WARN: Type inference failed for: r34v77 */
    /* JADX WARN: Type inference failed for: r34v79 */
    /* JADX WARN: Type inference failed for: r34v82 */
    /* JADX WARN: Type inference failed for: r34v83 */
    /* JADX WARN: Type inference failed for: r34v84 */
    /* JADX WARN: Type inference failed for: r34v87 */
    /* JADX WARN: Type inference failed for: r34v88 */
    /* JADX WARN: Type inference failed for: r34v89 */
    /* JADX WARN: Type inference failed for: r34v90 */
    /* JADX WARN: Type inference failed for: r34v91 */
    /* JADX WARN: Type inference failed for: r34v92 */
    /* JADX WARN: Type inference failed for: r34v98 */
    /* JADX WARN: Type inference failed for: r34v99 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v124, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v125 */
    /* JADX WARN: Type inference failed for: r3v126 */
    /* JADX WARN: Type inference failed for: r3v127 */
    /* JADX WARN: Type inference failed for: r3v128 */
    /* JADX WARN: Type inference failed for: r3v140 */
    /* JADX WARN: Type inference failed for: r3v141 */
    /* JADX WARN: Type inference failed for: r3v142 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v219 */
    /* JADX WARN: Type inference failed for: r4v220, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v243 */
    /* JADX WARN: Type inference failed for: r4v244 */
    /* JADX WARN: Type inference failed for: r4v245 */
    /* JADX WARN: Type inference failed for: r4v250 */
    /* JADX WARN: Type inference failed for: r4v253, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v254 */
    /* JADX WARN: Type inference failed for: r4v255 */
    /* JADX WARN: Type inference failed for: r4v256 */
    /* JADX WARN: Type inference failed for: r4v638 */
    /* JADX WARN: Type inference failed for: r4v639 */
    /* JADX WARN: Type inference failed for: r4v640 */
    /* JADX WARN: Type inference failed for: r5v296 */
    /* JADX WARN: Type inference failed for: r5v309 */
    /* JADX WARN: Type inference failed for: r5v38, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v546 */
    /* JADX WARN: Type inference failed for: r5v547 */
    /* JADX WARN: Type inference failed for: r5v69, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v70 */
    /* JADX WARN: Type inference failed for: r7v155, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v251 */
    /* JADX WARN: Type inference failed for: r7v252 */
    /* JADX WARN: Type inference failed for: r7v253 */
    /* JADX WARN: Type inference failed for: r7v254 */
    /* JADX WARN: Type inference failed for: r7v255 */
    /* JADX WARN: Type inference failed for: r7v267 */
    /* JADX WARN: Type inference failed for: r7v297 */
    /* JADX WARN: Type inference failed for: r7v298 */
    /* JADX WARN: Type inference failed for: r7v299 */
    /* JADX WARN: Type inference failed for: r9v295, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v370 */
    /* JADX WARN: Type inference failed for: r9v374 */
    /* JADX WARN: Type inference failed for: r9v375 */
    /* JADX WARN: Type inference failed for: r9v377 */
    /* JADX WARN: Type inference failed for: r9v379 */
    /* JADX WARN: Type inference failed for: r9v381 */
    /* JADX WARN: Type inference failed for: r9v383 */
    /* JADX WARN: Type inference failed for: r9v385 */
    /* JADX WARN: Type inference failed for: r9v399 */
    /* JADX WARN: Type inference failed for: r9v406 */
    /* JADX WARN: Type inference failed for: r9v407 */
    /* JADX WARN: Type inference failed for: r9v408 */
    /* JADX WARN: Type inference failed for: r9v413 */
    /* JADX WARN: Type inference failed for: r9v414 */
    /* JADX WARN: Type inference failed for: r9v418 */
    /* JADX WARN: Type inference failed for: r9v419 */
    /* JADX WARN: Type inference failed for: r9v443 */
    /* JADX WARN: Type inference failed for: r9v444 */
    /* JADX WARN: Type inference failed for: r9v445 */
    /* JADX WARN: Type inference failed for: r9v446 */
    /* JADX WARN: Type inference failed for: r9v447 */
    /* JADX WARN: Type inference failed for: r9v64 */
    /* JADX WARN: Type inference failed for: r9v69 */
    /* JADX WARN: Type inference failed for: r9v70 */
    /* JADX WARN: Type inference failed for: r9v71 */
    /* JADX WARN: Type inference failed for: r9v72 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r50) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 15118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.ui.activity.ManualActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$0M_ZsQviykuB1DdACnrG7sClYsw(ManualActivity manualActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 27;
        equals = i2 % 128;
        int i3 = i2 % 2;
        manualActivity.lambda$addObserver$4(resource);
        int i4 = equals + 9;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$1zNO_BbK3DrePFPJEb_CP9RTsl0(ManualActivity manualActivity, VerifyNumberResp verifyNumberResp, View view) {
        int i = 2 % 2;
        int i2 = equals + 85;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        m10957x9fbc8800(manualActivity, verifyNumberResp, view);
        if (i3 == 0) {
            throw null;
        }
    }

    public static void m10955$r8$lambda$Qji1dp9c0On2ekqBLko27VbwAg(ManualActivity manualActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 125;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        m10958instrumented$1$initListener$V(manualActivity, view);
        int i4 = getRequestBeneficiariesState + 95;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$axR3xxbqgnX1XHLMdpWwjRwwOU0(ManualActivity manualActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 119;
        equals = i2 % 128;
        int i3 = i2 % 2;
        manualActivity.lambda$addObserver$5(resource);
        int i4 = getRequestBeneficiariesState + 101;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static void $r8$lambda$b1Pm5Mw28Rjzxp3zJix1vgQW4eo(ManualActivity manualActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = equals + 67;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        manualActivity.lambda$addObserver$3(resource);
        int i4 = equals + 35;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$gHOUe94a1e37xJjZEyj316ts0xU(ManualActivity manualActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 51;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        m10959instrumented$2$initListener$V(manualActivity, view);
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        int i5 = getRequestBeneficiariesState + 123;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 30 / 0;
        }
    }

    public static void $r8$lambda$pBGThvx2fRenMfuEprNg6S6TVFM(ManualActivity manualActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 71;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        m10956instrumented$0$initListener$V(manualActivity, view);
        int i4 = equals + 1;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void m10956instrumented$0$initListener$V(ManualActivity manualActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 35;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            manualActivity.lambda$initListener$0(view);
            Callback.onClick_exit();
            int i4 = getRequestBeneficiariesState + 65;
            equals = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 91 / 0;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m10957x9fbc8800(ManualActivity manualActivity, VerifyNumberResp verifyNumberResp, View view) {
        int i = 2 % 2;
        int i2 = equals + 35;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            manualActivity.lambda$showQrcodeTipsDialog$6(verifyNumberResp, view);
            Callback.onClick_exit();
            int i4 = equals + 103;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m10958instrumented$1$initListener$V(ManualActivity manualActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 47;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                manualActivity.lambda$initListener$1(view);
                Callback.onClick_exit();
            } else {
                manualActivity.lambda$initListener$1(view);
                Callback.onClick_exit();
                throw null;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    private static void m10959instrumented$2$initListener$V(ManualActivity manualActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 17;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                manualActivity.lambda$initListener$2(view);
                Callback.onClick_exit();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            manualActivity.lambda$initListener$2(view);
            Callback.onClick_exit();
            int i4 = equals + 125;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = equals + 83;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            throw null;
        }
        int i4 = equals + 101;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
