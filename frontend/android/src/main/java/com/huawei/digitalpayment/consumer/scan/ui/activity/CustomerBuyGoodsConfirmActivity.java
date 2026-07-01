package com.huawei.digitalpayment.consumer.scan.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.Editable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Observer;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.ColorUtils;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.common.listener.FilterFastClickListener;
import com.huawei.common.util.ToastUtils;
import com.huawei.common.widget.MPTextWatcher;
import com.huawei.common.widget.dialog.DialogBox;
import com.huawei.common.widget.keyboard.CustomKeyBroadPop;
import com.huawei.common.widget.keyboard.OnKeyListener;
import com.huawei.digitalpayment.checkout.constants.TradeTypeEnum;
import com.huawei.digitalpayment.checkout.manager.PayManager;
import com.huawei.digitalpayment.checkout.utils.ParameterUtils;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.util.AmountUtils;
import com.huawei.digitalpayment.consumer.baselib.widget.text.TypefaceManager;
import com.huawei.digitalpayment.consumer.qrcode.R;
import com.huawei.digitalpayment.consumer.qrcode.databinding.ActivityBuyGoodsConfirmBinding;
import com.huawei.digitalpayment.consumer.scan.viewmodel.ScanViewModel;
import com.huawei.digitalpayment.consumer.webview.interaction.function.StartAaPay;
import com.huawei.image.glide.Base64Mode;
import com.huawei.image.util.GlideUtils;
import com.safaricom.mpesa.logging.L;
import java.lang.reflect.Method;
import java.util.HashMap;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelAll;
import kotlin.io.encoding.Base64;
import org.bouncycastle.crypto.signers.PSSSigner;

public class CustomerBuyGoodsConfirmActivity extends Hilt_CustomerBuyGoodsConfirmActivity<ActivityBuyGoodsConfirmBinding, ScanViewModel> {
    private static short[] component2;
    String amount;
    String avatar;
    String businessType;
    String notes;
    String operatorCode;
    private CustomKeyBroadPop popupWindow;
    String publicName;
    String shortCode;
    String tradeType = "QrCode";
    private static final byte[] $$c = {93, TarHeader.LF_LINK, 76, -114};
    private static final int $$f = 49;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {32, 13, -54, -47, Ascii.DLE, 2, -59, 63, -4, 19, -62, TarHeader.LF_CONTIG, 6, -49, TarHeader.LF_CONTIG, 17, -6, Ascii.DC2, 1, -2, -1, -50, TarHeader.LF_CONTIG, 6, 20, -65, 69, 5, -7, 17, -13, Ascii.ETB, -7, 10, 3, -60, 56, Ascii.VT, Ascii.NAK, -72, 72, -9, 6, 6, 10, 3, -60, 69, 5, -7, 17, -13, Ascii.ETB, -7, 10, 3, -60, 72, -9, Ascii.SI, 3, 8, -6, Ascii.SI, -1, 7, Ascii.VT, -71, Ascii.FS, 35, 19, -13, 9, -35, 47, 4, -39, TarHeader.LF_CHR, 4, 7, -29, Ascii.ETB, Ascii.DLE, 8, -12, Ascii.DC2, 5, Ascii.DLE, 5, 13, -17, 5, 5, -1, Ascii.CAN, -5, Ascii.FF, Ascii.DLE, 2, 7, 3, 3, -5, 13, 10, -61};
    private static final int $$h = 156;
    private static final byte[] $$a = {113, 66, TarHeader.LF_CHR, 67, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$b = 204;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 1;
    private static int ShareDataUIState = -2064269345;
    private static int copydefault = -238323927;
    private static int component1 = -447902992;
    private static byte[] component3 = {68, 82, 70, 72, 67, -90, -90, 1, 88, -121, Ascii.RS, 65, 78, 67, 82, 74, 83, -28, -49, -121, -9, 110, 105, Ascii.RS, 103, 113, TarHeader.LF_FIFO, 96, 102, Ascii.RS, 120, Ascii.DLE, 124, 79, 126, 43, 109, 122, 94, 39, Ascii.SYN, Ascii.ETB, 104, 123, 19, 120, Ascii.DC2, 35, 57, 37, 59, 32, 34, -53, 34, Ascii.RS, Base64.padSymbol, 39, 39, -11, 32, 37, 36, 59, 37, Ascii.DC2, -14, Ascii.DC2, 56, -11, Ascii.NAK, 57, -10, Ascii.DLE, 36, 56, -11, Ascii.DLE, -9, Ascii.SYN, 46, 36, 57, -55, 105, -15, 38, Ascii.DLE, 39, -12, 107, 44, -52, -60, -53, -62, -62, -12, Ascii.RS, 9, Ascii.EM, 0, 124, 125, -33, 1, Ascii.NAK, 13, 68, -43, TarHeader.LF_CHR, 109, Ascii.SI, 119, 123, -96, 17, 123, 70, 95, 5, 75, 65, 123, 74, 79, 119, 113, -76, -127, -116, -116, -73, -115, -116, -114, -120, -29, -4, -17, -8, -27, -28, -7, -3, -31, -3, -69, PSSSigner.TRAILER_IMPLICIT, -74, -70, -80, PSSSigner.TRAILER_IMPLICIT, -76, -70, -74, -65, -57, 9, -58, -50, -59, -22, -58, TarHeader.LF_LINK, -22, -60, 9, -106, -61, TarHeader.LF_SYMLINK, -24, 9, -24, TarHeader.LF_CONTIG, -107, -62, 10, -59, -107, TarHeader.LF_SYMLINK, -40, -60, -59, -37, -64, -22, TarHeader.LF_NORMAL, -36, -109, 8, -106, -59, TarHeader.LF_SYMLINK, -58, -37, -59, -105, -58, -39, TarHeader.LF_NORMAL, -105, TarHeader.LF_FIFO, -60, -23, 8, -59, -59, -24, -62, TarHeader.LF_FIFO, -106, TarHeader.LF_CHR, -19, -60, -60, 8, -109, TarHeader.LF_NORMAL, -24, 76, PSSSigner.TRAILER_IMPLICIT, -106, -67, -65, 118, -70, -31, 72, PSSSigner.TRAILER_IMPLICIT, -108, -69, 79, -66, -108, 78, -21, -69, -67, -70, 72, -31, -72, -65, -94, -66, -71, -72, -67, -79, -92, -77, -70, 73, -18, -67, 72, -19, -94, 66, -23, -66, -92, -67, -71, -79, -72, 77, -70, -69, -21, -69, -69, -77, 72, -72, -21, 65, -24, 76, -90, -24, -72, -19, -25, -21, -31, -19, -27, -21, -25, -20, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41};
    private static char[] getAsAtTimestamp = {12825, 2028, 2030, 2022, 1967, 2041, 2031, 1985, 2020, 1971, 1975, 2024, 1970, 2027, 1976, 2003, 1972, 12830, 1978, 1968, 2038, 2035, 2002, 12831, 2029, 2036, 12829, 1977, 1974, 2019, 1987, 1973, 12824, 1965, 12819, 2017, 2037, 2023, 2018, 1966, 2034, 2021, 12828, 1969, 2025, 2033, 2032, 12818, 12827};
    private static char component4 = 12829;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(byte r6, short r7, int r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.scan.ui.activity.CustomerBuyGoodsConfirmActivity.$$c
            int r8 = r8 * 3
            int r1 = 1 - r8
            int r6 = 119 - r6
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.ui.activity.CustomerBuyGoodsConfirmActivity.$$i(byte, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(byte r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = 100 - r7
            int r5 = r5 * 2
            int r5 = r5 + 83
            byte[] r0 = com.huawei.digitalpayment.consumer.scan.ui.activity.CustomerBuyGoodsConfirmActivity.$$a
            int r1 = 28 - r6
            byte[] r1 = new byte[r1]
            int r6 = 27 - r6
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r7]
        L26:
            int r5 = r5 + r4
            int r7 = r7 + 1
            int r5 = r5 + (-8)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.ui.activity.CustomerBuyGoodsConfirmActivity.d(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 99
            int r6 = 84 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.scan.ui.activity.CustomerBuyGoodsConfirmActivity.$$g
            int r8 = r8 + 4
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            r3 = r0[r8]
        L24:
            int r7 = r7 + r3
            int r7 = r7 + (-4)
            int r8 = r8 + 1
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.ui.activity.CustomerBuyGoodsConfirmActivity.e(int, short, byte, java.lang.Object[]):void");
    }

    static ViewDataBinding access$000(CustomerBuyGoodsConfirmActivity customerBuyGoodsConfirmActivity) {
        int i = 2 % 2;
        int i2 = equals + 47;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = customerBuyGoodsConfirmActivity.binding;
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = equals + 57;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return binding;
    }

    @Override
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 97;
        equals = i2 % 128;
        int i3 = i2 % 2;
        if (!(!this.popupWindow.isShowing())) {
            this.popupWindow.hide();
            return;
        }
        super.onBackPressed();
        int i4 = getRequestBeneficiariesState + 103;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = equals + 83;
        getRequestBeneficiariesState = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            int i3 = R.layout.activity_buy_goods_confirm;
            obj.hashCode();
            throw null;
        }
        int i4 = R.layout.activity_buy_goods_confirm;
        int i5 = getRequestBeneficiariesState + 89;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    @Override
    public void initToolbar(String str) {
        int i = 2 % 2;
        int i2 = equals + 17;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.initToolbar(getString(R.string.transfer_payment));
        int i4 = equals + 9;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r25, byte r26, int r27, int r28, int r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.ui.activity.CustomerBuyGoodsConfirmActivity.b(short, byte, int, int, int, java.lang.Object[]):void");
    }

    private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        char c2;
        Object obj;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = getAsAtTimestamp;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7422 - TextUtils.getTrimmedLength(""), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 15, (char) (64290 - TextUtils.lastIndexOf("", '0', 0, 0)), 682917265, false, "v", new Class[]{Integer.TYPE});
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
            Object[] objArr3 = {Integer.valueOf(component4)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
            char c3 = '\b';
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7421 - MotionEvent.axisFromString(""), 15 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (64291 - (Process.myPid() >> 22)), 682917265, false, "v", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i5 = $11;
                int i6 = i5 + 21;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
                int i8 = i5 + 11;
                $10 = i8 % 128;
                int i9 = i8 % 2;
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                cancelall.component2 = 0;
                while (cancelall.component2 < i2) {
                    cancelall.component1 = cArr[cancelall.component2];
                    cancelall.component3 = cArr[cancelall.component2 + 1];
                    if (cancelall.component1 == cancelall.component3) {
                        int i10 = $11 + 83;
                        $10 = i10 % 128;
                        if (i10 % 2 != 0) {
                            cArr4[cancelall.component2] = (char) (cancelall.component1 / b2);
                            cArr4[cancelall.component2 >> 1] = (char) (cancelall.component3 - b2);
                        } else {
                            cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                            cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                        }
                        c2 = c3;
                        obj = obj2;
                    } else {
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
                            int tapTimeout = 7117 - (ViewConfiguration.getTapTimeout() >> 16);
                            int i11 = 14 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 44463);
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
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(tapTimeout, i11, packedPositionGroup, 1150140696, false, "x", clsArr);
                        }
                        if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                            int i12 = $11 + 9;
                            $10 = i12 % 128;
                            int i13 = i12 % 2;
                            try {
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
                                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 2944;
                                    int i14 = 25 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                    char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 27638);
                                    byte b3 = (byte) 0;
                                    byte b4 = b3;
                                    String str$$i = $$i(b3, b4, b4);
                                    c2 = '\b';
                                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(capsMode, i14, bitsPerPixel, 794909189, false, str$$i, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                } else {
                                    c2 = c3;
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                                int i15 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                                cArr4[cancelall.component2] = cArr2[iIntValue];
                                cArr4[cancelall.component2 + 1] = cArr2[i15];
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } else {
                            c2 = c3;
                            obj = null;
                            if (cancelall.copydefault == cancelall.ShareDataUIState) {
                                int i16 = $10 + 107;
                                $11 = i16 % 128;
                                int i17 = i16 % 2;
                                cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                                cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                                int i18 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                                int i19 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                                cArr4[cancelall.component2] = cArr2[i18];
                                cArr4[cancelall.component2 + 1] = cArr2[i19];
                            } else {
                                int i20 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                                int i21 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                                cArr4[cancelall.component2] = cArr2[i20];
                                cArr4[cancelall.component2 + 1] = cArr2[i21];
                            }
                        }
                    }
                    cancelall.component2 += 2;
                    obj2 = obj;
                    c3 = c2;
                }
            }
            for (int i22 = 0; i22 < i; i22++) {
                cArr4[i22] = (char) (cArr4[i22] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0170  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.ui.activity.CustomerBuyGoodsConfirmActivity.onCreate(android.os.Bundle):void");
    }

    private void initParams() {
        int i = 2 % 2;
        int i2 = equals + 55;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = getIntent();
        this.shortCode = intent.getStringExtra(KeysConstants.SHORT_CODE);
        this.publicName = intent.getStringExtra("publicName");
        this.amount = intent.getStringExtra("amount");
        this.notes = intent.getStringExtra(StartAaPay.KEY_NOTES);
        this.avatar = intent.getStringExtra("avatar");
        this.tradeType = intent.getStringExtra("tradeType");
        this.businessType = intent.getStringExtra("businessType");
        this.operatorCode = intent.getStringExtra("OperatorCode");
        int i4 = equals + 87;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private void lambda$initViews$0(View view) {
        int i = 2 % 2;
        int i2 = equals + 7;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        showAddNoteDialog();
        int i4 = getRequestBeneficiariesState + 21;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private void lambda$initViews$1(View view) {
        int i = 2 % 2;
        int i2 = equals + 77;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        showAddNoteDialog();
        if (i3 == 0) {
            throw null;
        }
    }

    private void lambda$initViews$2(View view) {
        int i = 2 % 2;
        int i2 = equals + 45;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        ((ActivityBuyGoodsConfirmBinding) this.binding).inputAmount.getEditText().requestFocus();
        ((ActivityBuyGoodsConfirmBinding) this.binding).inputAmount.getEditText().setSelection(((ActivityBuyGoodsConfirmBinding) this.binding).inputAmount.getEditText().getText().length());
        this.popupWindow.show();
        int i4 = equals + 97;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    protected void initViews() {
        int i = 2 % 2;
        TypefaceManager.INSTANCE.setTextStyle(((ActivityBuyGoodsConfirmBinding) this.binding).inputAmount.getEditText(), 1);
        TypefaceManager.INSTANCE.setTextStyle(((ActivityBuyGoodsConfirmBinding) this.binding).inputAmount.getStartUnit(), 1);
        ((ActivityBuyGoodsConfirmBinding) this.binding).inputAmount.setSymbol(AppConfigManager.getAppConfig().getSymbol());
        ((ActivityBuyGoodsConfirmBinding) this.binding).inputAmount.getEditText().requestFocus();
        ((ActivityBuyGoodsConfirmBinding) this.binding).tvAddNotes.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component3 + 65;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                CustomerBuyGoodsConfirmActivity.$r8$lambda$Qmkzfg3t3kCUxDyMrHG0x2lOLzM(this.f$0, view);
                int i5 = component3 + 109;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 5 / 0;
                }
            }
        });
        ((ActivityBuyGoodsConfirmBinding) this.binding).tvAmend.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 9;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                CustomerBuyGoodsConfirmActivity.$r8$lambda$8s6jCDvsdo3LBUc5uDBPDoUMeVo(this.f$0, view);
                int i5 = component3 + 115;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        ((ActivityBuyGoodsConfirmBinding) this.binding).tvTransferTo.setText(this.shortCode);
        ((ActivityBuyGoodsConfirmBinding) this.binding).tvOrgName.setText(this.publicName);
        ((ScanViewModel) this.viewModel).setNote(this.notes);
        if (TextUtils.isEmpty(this.amount)) {
            ((ActivityBuyGoodsConfirmBinding) this.binding).inputAmount.setOnInputViewParentClickListener(new View.OnClickListener() {
                private static int ShareDataUIState = 1;
                private static int copydefault;

                @Override
                public final void onClick(View view) {
                    int i2 = 2 % 2;
                    int i3 = ShareDataUIState + 59;
                    copydefault = i3 % 128;
                    int i4 = i3 % 2;
                    CustomerBuyGoodsConfirmActivity.$r8$lambda$RZTsTwZi0baEsiVBygsMfhtXzZU(this.f$0, view);
                    int i5 = copydefault + 97;
                    ShareDataUIState = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 18 / 0;
                    }
                }
            });
            this.popupWindow.attachToEditText(this, ((ActivityBuyGoodsConfirmBinding) this.binding).inputAmount.getEditText());
        } else {
            int i2 = equals + 19;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            try {
                ((ActivityBuyGoodsConfirmBinding) this.binding).inputAmount.setText(this.amount);
                ((ActivityBuyGoodsConfirmBinding) this.binding).inputAmount.setInputEnable(false);
                ((ActivityBuyGoodsConfirmBinding) this.binding).lbOk.setEnabled(true);
                this.popupWindow.setFinishEnable(true);
            } catch (Exception e) {
                if (e.getMessage() != null) {
                    L.INSTANCE.e(this.TAG, e.getMessage(), new Object[0]);
                }
            }
        }
        if (!TextUtils.isEmpty(this.notes)) {
            int i4 = equals + 7;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 == 0) {
                ((ActivityBuyGoodsConfirmBinding) this.binding).tvAddNotes.setEnabled(true);
            } else {
                ((ActivityBuyGoodsConfirmBinding) this.binding).tvAddNotes.setEnabled(false);
            }
            int i5 = equals + 25;
            getRequestBeneficiariesState = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 / 4;
            }
        }
        GlideUtils.load(new Base64Mode(this.avatar, "merchant-logo"), ((ActivityBuyGoodsConfirmBinding) this.binding).ivHead, R.mipmap.transfer_icon_merchant_default_head, R.mipmap.transfer_icon_merchant_default_head);
    }

    private void lambda$initClick$3(KeyEvent keyEvent) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 109;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            if (keyEvent.getKeyCode() != 90) {
                return;
            }
        } else if (keyEvent.getKeyCode() != 66) {
            return;
        }
        int i3 = getRequestBeneficiariesState + 95;
        equals = i3 % 128;
        int i4 = i3 % 2;
        onPayClick();
        if (i4 != 0) {
            throw null;
        }
    }

    private void initClick() {
        int i = 2 % 2;
        ((ActivityBuyGoodsConfirmBinding) this.binding).inputAmount.getEditText().addTextChangedListener(new MPTextWatcher() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public void afterTextChanged(Editable editable) {
                int i2 = 2 % 2;
                int i3 = copydefault + 19;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                boolean z = !TextUtils.isEmpty(editable);
                CustomerBuyGoodsConfirmActivity.m10951$$Nest$fgetpopupWindow(CustomerBuyGoodsConfirmActivity.this).setFinishEnable(z);
                ((ActivityBuyGoodsConfirmBinding) CustomerBuyGoodsConfirmActivity.access$000(CustomerBuyGoodsConfirmActivity.this)).lbOk.setEnabled(z);
                int i5 = ShareDataUIState + 55;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        this.popupWindow.setKeyListener(new OnKeyListener() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public final void dispatchKeyEvent(KeyEvent keyEvent) {
                int i2 = 2 % 2;
                int i3 = component3 + 75;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                CustomerBuyGoodsConfirmActivity.$r8$lambda$2yS4BBsdB6XAlsEKqtxRb6PqWHY(this.f$0, keyEvent);
                if (i4 != 0) {
                    int i5 = 73 / 0;
                }
            }
        });
        ((ActivityBuyGoodsConfirmBinding) this.binding).lbOk.setOnClickListener(new FilterFastClickListener() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public void onFilterClick(View view) {
                int i2 = 2 % 2;
                int i3 = copydefault + 89;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                CustomerBuyGoodsConfirmActivity.this.onPayClick();
                int i5 = ShareDataUIState + 123;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i2 = equals + 39;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    private void addObserve() {
        int i = 2 % 2;
        ((ScanViewModel) this.viewModel).getNote().observe(this, new Observer() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 79;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                CustomerBuyGoodsConfirmActivity.m10950$r8$lambda$u1XX2tC5ZoiEqKVjb1M3UeQnmI(this.f$0, (String) obj);
                int i5 = component1 + 93;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = getRequestBeneficiariesState + 63;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    private void lambda$addObserve$4(String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 87;
        equals = i2 % 128;
        int i3 = i2 % 2;
        if (TextUtils.isEmpty(str)) {
            int i4 = equals + 65;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 == 0) {
                ((ActivityBuyGoodsConfirmBinding) this.binding).tvAddNotes.setText(getString(R.string.designstandard_add_notes_optional));
                ((ActivityBuyGoodsConfirmBinding) this.binding).tvAddNotes.setTextColor(ColorUtils.getColor(R.color.colorPrimary));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ((ActivityBuyGoodsConfirmBinding) this.binding).tvAddNotes.setText(getString(R.string.designstandard_add_notes_optional));
            ((ActivityBuyGoodsConfirmBinding) this.binding).tvAddNotes.setTextColor(ColorUtils.getColor(R.color.colorPrimary));
        } else {
            ((ActivityBuyGoodsConfirmBinding) this.binding).tvAddNotes.setText(str);
            ((ActivityBuyGoodsConfirmBinding) this.binding).tvAddNotes.setTextColor(ColorUtils.getColor(R.color.colorGeneralText));
        }
        int i5 = getRequestBeneficiariesState + 27;
        equals = i5 % 128;
        int i6 = i5 % 2;
    }

    private void lambda$showAddNoteDialog$5(View view, String str) {
        int i = 2 % 2;
        int i2 = equals + 63;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        ((ScanViewModel) this.viewModel).setNote(str);
        if (TextUtils.isEmpty(str)) {
            ((ActivityBuyGoodsConfirmBinding) this.binding).tvAddNotes.setText(R.string.designstandard_add_notes_optional);
            ((ActivityBuyGoodsConfirmBinding) this.binding).setIsAmend(false);
            return;
        }
        ((ActivityBuyGoodsConfirmBinding) this.binding).tvAddNotes.setText(str);
        ((ActivityBuyGoodsConfirmBinding) this.binding).setIsAmend(true);
        int i4 = getRequestBeneficiariesState + 101;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    private void showAddNoteDialog() {
        int i = 2 % 2;
        hideKeyboardIfNeed();
        DialogBox.builder().setTitle(getString(R.string.receive_code_title6)).setLeftButtonText(getString(R.string.cancel)).setRightButtonText(getString(R.string.confirm)).setRightButtonListener(new DialogBox.DialogBoxListener() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public final void onButtonClick(View view, String str) {
                int i2 = 2 % 2;
                int i3 = copydefault + 65;
                ShareDataUIState = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    CustomerBuyGoodsConfirmActivity.$r8$lambda$ir6_OzDz8FwsAbAHqdkJS9iCpHI(this.f$0, view, str);
                    obj.hashCode();
                    throw null;
                }
                CustomerBuyGoodsConfirmActivity.$r8$lambda$ir6_OzDz8FwsAbAHqdkJS9iCpHI(this.f$0, view, str);
                int i4 = copydefault + 5;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }).setShowInputView(true).setInputContent(((ScanViewModel) this.viewModel).getNote().getValue()).setInputHint(getString(R.string.receive_code_button5)).build().show(getSupportFragmentManager(), "AddNoteDialog");
        int i2 = getRequestBeneficiariesState + 17;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 69;
        equals = i2 % 128;
        int i3 = i2 % 2;
        if (66 == keyEvent.getKeyCode()) {
            int i4 = getRequestBeneficiariesState + 101;
            equals = i4 % 128;
            if (i4 % 2 == 0 ? keyEvent.getAction() != 1 : keyEvent.getAction() != 1) {
                onPayClick();
                int i5 = getRequestBeneficiariesState + 69;
                equals = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public void onPayClick() {
        int i = 2 % 2;
        String amount = ((ActivityBuyGoodsConfirmBinding) this.binding).inputAmount.getAmount();
        this.amount = amount;
        if (TextUtils.isEmpty(amount)) {
            ToastUtils.showShortSafe(getString(R.string.designstandard_please_input_amount));
            return;
        }
        if (!ParameterUtils.isValidAmount(this.amount)) {
            int i2 = equals + 35;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            ToastUtils.showShortSafe(getString(R.string.designstandard_incorrect_amount_format));
            return;
        }
        HashMap map = new HashMap();
        map.put("amount", AmountUtils.INSTANCE.formatAmount(this.amount));
        map.put("note", ((ScanViewModel) this.viewModel).getNote().getValue());
        map.put("tradeType", this.tradeType);
        map.put("receiverShortCode", this.shortCode);
        if (!TextUtils.isEmpty(this.businessType)) {
            map.put("businessType", this.businessType);
        }
        if (!TextUtils.isEmpty(this.operatorCode)) {
            int i4 = equals + 65;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 == 0) {
                map.put("requesterOperatorCode", this.operatorCode);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            map.put("requesterOperatorCode", this.operatorCode);
        }
        PayManager.get().startPay(this, map, TradeTypeEnum.CUSTOMER_BUY_GOODS);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void hideKeyboardIfNeed() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.scan.ui.activity.CustomerBuyGoodsConfirmActivity.equals
            int r1 = r1 + 3
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.scan.ui.activity.CustomerBuyGoodsConfirmActivity.getRequestBeneficiariesState = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1c
            com.huawei.common.widget.keyboard.CustomKeyBroadPop r1 = r3.popupWindow
            boolean r1 = r1.isShowing()
            r2 = 52
            int r2 = r2 / 0
            r2 = 1
            if (r1 == r2) goto L24
            goto L32
        L1c:
            com.huawei.common.widget.keyboard.CustomKeyBroadPop r1 = r3.popupWindow
            boolean r1 = r1.isShowing()
            if (r1 == 0) goto L32
        L24:
            int r1 = com.huawei.digitalpayment.consumer.scan.ui.activity.CustomerBuyGoodsConfirmActivity.getRequestBeneficiariesState
            int r1 = r1 + 75
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.scan.ui.activity.CustomerBuyGoodsConfirmActivity.equals = r2
            int r1 = r1 % r0
            com.huawei.common.widget.keyboard.CustomKeyBroadPop r1 = r3.popupWindow
            r1.hide()
        L32:
            int r1 = com.huawei.digitalpayment.consumer.scan.ui.activity.CustomerBuyGoodsConfirmActivity.equals
            int r1 = r1 + 53
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.scan.ui.activity.CustomerBuyGoodsConfirmActivity.getRequestBeneficiariesState = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L3e
            return
        L3e:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.ui.activity.CustomerBuyGoodsConfirmActivity.hideKeyboardIfNeed():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x013c  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.ui.activity.CustomerBuyGoodsConfirmActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 23;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            int i4 = getRequestBeneficiariesState + 107;
            equals = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            b((short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 97), (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (-1967048929) - KeyEvent.getDeadChar(0, 0), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952792_res_0x7f130498).substring(2, 3).codePointAt(0) - 6, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952718_res_0x7f13044e).substring(6, 7).codePointAt(0) - 344391064, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            c(new char[]{'$', '+', 13812, 13812, '%', 6, 21, 11, 13814, 13814, 2, '+', 28, '$', 23, '.', 0, 3}, (byte) (Drawable.resolveOpacity(0, 0) + 12), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131953980_res_0x7f13093c).substring(0, 4).length() + 14, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i6 = getRequestBeneficiariesState + 105;
            equals = i6 % 128;
            try {
                if (i6 % 2 != 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - TextUtils.getTrimmedLength(""), 42 - ExpandableListView.getPackedPositionGroup(0L), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 55 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), -960739708, false, "component3", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    int i7 = 32 / 0;
                } else {
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionGroup(0L) + 6618, View.MeasureSpec.makeMeasureSpec(0, 0) + 42, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                    Object[] objArr4 = {baseContext};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(6563 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 56 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((-16777216) - Color.rgb(0, 0, 0)), -960739708, false, "component3", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault4).invoke(objInvoke2, objArr4);
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onPause();
        int i8 = equals + 53;
        getRequestBeneficiariesState = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r45) {
        /*
            Method dump skipped, instruction units count: 15477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.ui.activity.CustomerBuyGoodsConfirmActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$2yS4BBsdB6XAlsEKqtxRb6PqWHY(CustomerBuyGoodsConfirmActivity customerBuyGoodsConfirmActivity, KeyEvent keyEvent) {
        int i = 2 % 2;
        int i2 = equals + 43;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        customerBuyGoodsConfirmActivity.lambda$initClick$3(keyEvent);
        int i4 = equals + 123;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$8s6jCDvsdo3LBUc5uDBPDoUMeVo(CustomerBuyGoodsConfirmActivity customerBuyGoodsConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 25;
        equals = i2 % 128;
        int i3 = i2 % 2;
        m10953instrumented$1$initViews$V(customerBuyGoodsConfirmActivity, view);
        int i4 = getRequestBeneficiariesState + 103;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
    }

    public static void $r8$lambda$Qmkzfg3t3kCUxDyMrHG0x2lOLzM(CustomerBuyGoodsConfirmActivity customerBuyGoodsConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 51;
        equals = i2 % 128;
        int i3 = i2 % 2;
        m10952instrumented$0$initViews$V(customerBuyGoodsConfirmActivity, view);
        if (i3 != 0) {
            int i4 = 1 / 0;
        }
        int i5 = equals + 73;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void $r8$lambda$RZTsTwZi0baEsiVBygsMfhtXzZU(CustomerBuyGoodsConfirmActivity customerBuyGoodsConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 37;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        m10954instrumented$2$initViews$V(customerBuyGoodsConfirmActivity, view);
        int i4 = getRequestBeneficiariesState + 47;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$ir6_OzDz8FwsAbAHqdkJS9iCpHI(CustomerBuyGoodsConfirmActivity customerBuyGoodsConfirmActivity, View view, String str) {
        int i = 2 % 2;
        int i2 = equals + 49;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        customerBuyGoodsConfirmActivity.lambda$showAddNoteDialog$5(view, str);
        int i4 = getRequestBeneficiariesState + 15;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
    }

    public static void m10950$r8$lambda$u1XX2tC5ZoiEqKVjb1M3UeQnmI(CustomerBuyGoodsConfirmActivity customerBuyGoodsConfirmActivity, String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 11;
        equals = i2 % 128;
        int i3 = i2 % 2;
        customerBuyGoodsConfirmActivity.lambda$addObserve$4(str);
        int i4 = getRequestBeneficiariesState + 11;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static CustomKeyBroadPop m10951$$Nest$fgetpopupWindow(CustomerBuyGoodsConfirmActivity customerBuyGoodsConfirmActivity) {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 3;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        CustomKeyBroadPop customKeyBroadPop = customerBuyGoodsConfirmActivity.popupWindow;
        int i5 = i2 + 73;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 8 / 0;
        }
        return customKeyBroadPop;
    }

    private static void m10952instrumented$0$initViews$V(CustomerBuyGoodsConfirmActivity customerBuyGoodsConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 65;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                customerBuyGoodsConfirmActivity.lambda$initViews$0(view);
                Callback.onClick_exit();
                int i4 = 41 / 0;
            } else {
                customerBuyGoodsConfirmActivity.lambda$initViews$0(view);
                Callback.onClick_exit();
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m10953instrumented$1$initViews$V(CustomerBuyGoodsConfirmActivity customerBuyGoodsConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 67;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                customerBuyGoodsConfirmActivity.lambda$initViews$1(view);
                Callback.onClick_exit();
                int i4 = 99 / 0;
            } else {
                customerBuyGoodsConfirmActivity.lambda$initViews$1(view);
                Callback.onClick_exit();
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m10954instrumented$2$initViews$V(CustomerBuyGoodsConfirmActivity customerBuyGoodsConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 55;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            customerBuyGoodsConfirmActivity.lambda$initViews$2(view);
            Callback.onClick_exit();
            int i4 = equals + 1;
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
        int i2 = getRequestBeneficiariesState + 15;
        equals = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = getRequestBeneficiariesState + 33;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
