package com.huawei.digitalpayment.consumer.qrcode.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.alipay.plus.security.lite.SecLiteException;
import com.blankj.utilcode.constant.CacheConstants;
import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.BarUtils;
import com.blankj.utilcode.util.ScreenUtils;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.ToastUtils;
import com.huawei.common.util.color.ColorUtils;
import com.huawei.common.widget.CommonCheckBox;
import com.huawei.common.widget.Gloading;
import com.huawei.digitalpayment.checkout.constants.TradeTypeEnum;
import com.huawei.digitalpayment.checkout.manager.PayManager;
import com.huawei.digitalpayment.checkout.model.response.TransferResp;
import com.huawei.digitalpayment.consumer.base.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import com.huawei.digitalpayment.consumer.baselib.service.IBalanceService;
import com.huawei.digitalpayment.consumer.baselib.util.DensityUtils;
import com.huawei.digitalpayment.consumer.qrcode.bean.AuthNoticeResp;
import com.huawei.digitalpayment.consumer.qrcode.bean.PaymentQrResp;
import com.huawei.digitalpayment.consumer.qrcode.databinding.ActivityPayCodeBinding;
import com.huawei.digitalpayment.consumer.qrcode.utils.QrCodeUtils;
import com.huawei.digitalpayment.consumer.qrcode.viewmodel.PayViewCodeModel;
import com.huawei.digitalpayment.consumer.service.IHomeModule2Service;
import com.huawei.hms.hmsscankit.ScanUtil;
import com.huawei.hms.hmsscankit.WriterException;
import com.huawei.hms.ml.scan.HmsBuildBitmapOption;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.mpesa.lifestyle.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.INotificationSideChannel;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import org.apache.commons.lang3.CharUtils;

public class PayCodeActivity extends Hilt_PayCodeActivity<ActivityPayCodeBinding, PayViewCodeModel> {
    private static long ShareDataUIState;
    private static char component1;
    private static int component2;
    private static char component3;
    private static char copy;
    private static char copydefault;
    private static int getAsAtTimestamp;
    private static char getRequestBeneficiariesState;
    private static int getSponsorBeneficiariesState;
    private Gloading.Holder holder;
    private PopupWindow popWindow;
    private long refreshFreq;
    private static final byte[] $$l = {110, -114, 93, -109};
    private static final int $$o = 69;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {107, -21, -54, -113, Ascii.ETB, 9, Ascii.SO, 10, 10, 2, 20, 17, -56, Ascii.ETB, 9, -52, 68, 19, Ascii.VT, 3, Ascii.DLE, 4, -44, 62, Ascii.CAN, 1, Ascii.EM, 8, 5, 6, -43, 74, -1, Ascii.RS, -4, Ascii.CAN, 2, 3, Ascii.SYN, -51, 70, Ascii.DLE, 17, -4, Ascii.CAN, 7, -2, Ascii.SYN, -51, 45, Ascii.FS, Ascii.FS, -4, 13, Ascii.DC2, 0, Ascii.FF, Ascii.NAK, 4, -7, 40, -4, Ascii.FS, Ascii.FF, -3, -17, TarHeader.LF_NORMAL, 17, -40, 60, Ascii.VT, -6, 35, -74, Ascii.CAN, Ascii.ETB, 9, Ascii.SO, 10, 10, 2, 20, 17, -54, 32, 4, Ascii.FS, -2, -22, 40, Ascii.RS, -8, -1, -1, Ascii.NAK, 44, -8, Ascii.RS, -4};
    private static final int $$k = 122;
    private static final byte[] $$d = {66, -42, -1, 80, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 232;
    private static int ArtificialStackFrames = 0;
    private static int equals = 0;
    private static int component4 = 1;
    private Handler handler = new Handler();
    private Runnable runnable = new Runnable() {
        private static int component1 = 0;
        private static int component3 = 1;

        @Override
        public void run() {
            int i = 2 % 2;
            int i2 = component1 + 21;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                ((PayViewCodeModel) PayCodeActivity.access$000(PayCodeActivity.this)).refreshQrCode();
                PayCodeActivity.m10895$$Nest$fgethandler(PayCodeActivity.this).postDelayed(this, PayCodeActivity.m10896$$Nest$fgetrefreshFreq(PayCodeActivity.this));
            } else {
                ((PayViewCodeModel) PayCodeActivity.access$000(PayCodeActivity.this)).refreshQrCode();
                PayCodeActivity.m10895$$Nest$fgethandler(PayCodeActivity.this).postDelayed(this, PayCodeActivity.m10896$$Nest$fgetrefreshFreq(PayCodeActivity.this));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(short r6, int r7, byte r8) {
        /*
            int r6 = r6 + 65
            byte[] r0 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.PayCodeActivity.$$l
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r8 = r8 * 4
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.ui.activity.PayCodeActivity.$$r(short, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.PayCodeActivity.$$d
            int r6 = r6 + 4
            int r1 = r8 + 4
            int r7 = r7 * 2
            int r7 = 103 - r7
            byte[] r1 = new byte[r1]
            int r8 = r8 + 3
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2e
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r3 = r3 + r6
            int r6 = r3 + (-8)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.ui.activity.PayCodeActivity.g(int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void k(int r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 10
            int r7 = r7 * 16
            int r7 = r7 + 83
            byte[] r0 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.PayCodeActivity.$$j
            int r8 = r8 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2a
        L12:
            r3 = r2
        L13:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2a:
            int r8 = r8 + r7
            int r7 = r8 + (-11)
            r8 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.ui.activity.PayCodeActivity.k(int, int, byte, java.lang.Object[]):void");
    }

    static ViewModel access$000(PayCodeActivity payCodeActivity) {
        int i = 2 % 2;
        int i2 = component4 + 1;
        equals = i2 % 128;
        int i3 = i2 % 2;
        VM vm = payCodeActivity.viewModel;
        if (i3 != 0) {
            throw null;
        }
        int i4 = equals + 125;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            return vm;
        }
        throw null;
    }

    static ViewDataBinding access$100(PayCodeActivity payCodeActivity) {
        int i = 2 % 2;
        int i2 = equals + 45;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = payCodeActivity.binding;
        if (i3 != 0) {
            return binding;
        }
        throw null;
    }

    static ViewModel access$200(PayCodeActivity payCodeActivity) {
        int i = 2 % 2;
        int i2 = component4 + 87;
        equals = i2 % 128;
        int i3 = i2 % 2;
        VM vm = payCodeActivity.viewModel;
        int i4 = equals + 25;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return vm;
    }

    private static void h(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i5 = $10 + 35;
            $11 = i5 % 128;
            int i6 = i5 % i3;
            cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i7 = 58224;
            int i8 = 0;
            while (i8 < 16) {
                int i9 = $11 + 43;
                $10 = i9 % 128;
                int i10 = i9 % i3;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                int i11 = (c3 + i7) ^ ((c3 << 4) + ((char) (((long) getRequestBeneficiariesState) ^ 4374495167426960553L)));
                int i12 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(copy);
                    objArr2[i3] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 844, 32 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 23251), 592652048, false, $$r((byte) 46, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) copydefault) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component3)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(844 - KeyEvent.keyCodeFromString(""), View.getDefaultSize(0, 0) + 32, (char) (TextUtils.indexOf("", "", 0, 0) + 23251), 592652048, false, $$r((byte) 46, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
                    i3 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[iNotificationSideChannelDefault.component3] = cArr3[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr3[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                i2 = 2;
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 464, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 49, (char) ('0' - AndroidCharacter.getMirror('0')), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            } else {
                i2 = 2;
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            i3 = i2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void j(char c2, char[] cArr, int i, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        int i5 = $10 + 9;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (iNotificationSideChannel.copydefault < length3) {
            int i7 = $11 + 65;
            $10 = i7 % 128;
            int i8 = i7 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int iIndexOf = 4036 - TextUtils.indexOf((CharSequence) "", '0', i4);
                    int iIndexOf2 = TextUtils.indexOf("", "") + 31;
                    char absoluteGravity = (char) (Gravity.getAbsoluteGravity(i4, i4) + 19181);
                    byte b2 = (byte) i4;
                    String str$$r = $$r((byte) ($$o >>> 1), b2, b2);
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, iIndexOf2, absoluteGravity, 1912513118, false, str$$r, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    int capsMode = 7567 - TextUtils.getCapsMode("", i4, i4);
                    int iIndexOf3 = 11 - TextUtils.indexOf("", "", i4);
                    char cMyPid = (char) (Process.myPid() >> 22);
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i4] = Object.class;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(capsMode, iIndexOf3, cMyPid, 2006389106, false, "e", clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                int i9 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i9);
                objArr4[i4] = iNotificationSideChannel;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b3 = (byte) i4;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2459 - TextUtils.indexOf("", "", i4), 27 - ExpandableListView.getPackedPositionChild(0L), (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 931716605, false, $$r((byte) 33, b3, b3), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getCapsMode("", 0, 0) + 7567, (ViewConfiguration.getPressedStateDuration() >> 16) + 11, (char) (Process.myPid() >> 22), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr2[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (ShareDataUIState ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component2) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component1) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                int i10 = $11 + 13;
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
        objArr[0] = new String(cArr6);
    }

    private static void i(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i) {
            int i5 = $11 + 119;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i3 + iTrustedWebActivityServiceStub.component3);
            int i7 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(getAsAtTimestamp)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3784 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 38, (char) (TextUtils.lastIndexOf("", '0') + 26861), 2015799920, false, $$r(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Drawable.resolveOpacity(0, 0) + 7406, TextUtils.getCapsMode("", 0, 0) + 16, (char) View.combineMeasuredStates(0, 0), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            iTrustedWebActivityServiceStub.component1 = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i - iTrustedWebActivityServiceStub.component1);
            int i8 = $11 + 17;
            $10 = i8 % 128;
            int i9 = i8 % 2;
        }
        if (z) {
            int i10 = $11 + 15;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i) {
                int i12 = $11 + 79;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTouchSlop() >> 8) + 7406, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 16, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i14 = $10 + 99;
        $11 = i14 % 128;
        int i15 = i14 % 2;
        objArr[0] = str;
    }

    @Override
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        h(View.MeasureSpec.makeMeasureSpec(0, 0) + 18, new char[]{19342, 12701, 28655, 2407, 62397, 11408, 19093, 28742, 1100, 22926, 44340, 58546, 12370, 21624, 46526, 16329, 54911, 58169}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 24, new char[]{57894, 2271, 42638, 14082, 16299, 62932}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 79, new char[]{19342, 12701, 28655, 2407, 62397, 11408, 19093, 28742, 31498, 59721, 16132, 48594, 53769, 38675, 15998, 12354, 30623, 60405, 51196, 48278, 32410, 53481, 9324, 61936, 30176, 54187}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, new char[]{26873, 49311, 55894, 12031, 6926, 21389, 12043, 33950, 64669, 32146, 42127, 18461, 46963, 2744, 15998, 12354, 50823, 51660}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i2 = component4 + 119;
                equals = i2 % 128;
                if (i2 % 2 != 0) {
                    boolean z = baseContext instanceof ContextWrapper;
                    throw null;
                }
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((-16770598) - Color.rgb(0, 0, 0), 42 - TextUtils.getOffsetBefore("", 0), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    i(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 51, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 22, new char[]{28, 65520, 65519, 31, 65514, 65522, JSONLexer.EOI, 27, 65517, 65520, 65517, 65518, 65513, 65517, 65519, JSONLexer.EOI, 28, 65522, 65515, 65514, 65513, JSONLexer.EOI, 30, 31, 31, JSONLexer.EOI, 27, 65517, 31, 65521, 65517, 30, 65519, 65516, JSONLexer.EOI, 65518, 65518, 65514, 27, 65519, 30, 65516, 65522, 65522, 65519, 28, 65513, 30}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 269, true, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    i(63 - TextUtils.lastIndexOf("", '0', 0), KeyEvent.keyCodeFromString("") + 2, new char[]{65522, 65525, 65518, ' ', 65519, 65517, 65516, 65520, 31, 31, 65518, '\"', 65517, 65520, 65525, 65522, 31, 31, 65519, 65516, 65524, 30, 65516, '\"', 65516, 65519, 65524, 31, ' ', 65519, 65522, 65524, 65522, 30, 65516, 65524, 31, 30, '!', ' ', 65517, 31, 31, 65524, 65525, 65517, '\"', 65521, 65521, 65517, ' ', 65518, 29, 30, 65523, 65524, '\"', 65524, 65522, 65519, 65525, 65524, 65519, 65525}, 267 - (Process.myTid() >> 22), false, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    h(64 - KeyEvent.getDeadChar(0, 0), new char[]{56894, 34740, 53238, 6094, 23826, 28206, 30485, 51937, 230, 14118, 26917, 1693, 28454, 24791, 3126, 54389, 34441, 22297, 31111, 53563, 65093, 63570, 45605, 20436, 32529, 15419, 27009, 6790, 5293, 41850, 48047, 37807, 48084, 14323, 6528, 62074, 54548, 35713, 47904, 18459, 1602, 36600, 20029, 33246, 40063, 63038, 54669, 8134, 58361, 58554, 28934, 280, 54071, 54717, 3803, 29145, 19802, 31377, 37464, 35614, 65343, 1334, 26258, 55463}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    h(72 - (ViewConfiguration.getScrollBarSize() >> 8), new char[]{37351, 41097, 41559, 47122, 22968, 45646, 23935, 24625, 6598, 41428, 19194, 28351, 48047, 37807, 9535, 21629, 23826, 28206, 1648, 5330, 51845, 28111, 53845, 43147, 57087, 5407, 45904, 38188, 43095, 23126, 26438, 42670, 4831, 57014, 61020, 7442, 11500, 50980, 63117, 28762, 24047, 24457, 43280, 13316, 63117, 28762, 63913, 64855, 43446, 38592, 58590, 46771, 31498, 59721, 32403, 1925, 10294, 51386, 11941, 5520, 36080, 63598, 26915, 34071, 36030, 46861, 40069, 42606, 6926, 21389, 62369, 33568}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    i(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952718_res_0x7f13044e).substring(6, 7).codePointAt(0) - 26, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131954889_res_0x7f130cc9).substring(0, 1).codePointAt(0) - 8224, new char[]{65532, 7, 1, 65532, 2, 65535}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(14) + 140, true, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952303_res_0x7f1302af).substring(0, 2).length() + 34, new char[]{19291, 4728, 42560, 6233, 12649, 12656, 42569, 48387, 19563, 11471, 52723, 21219, 62784, 26858, 9535, 21629, 55472, 8111, 54990, 14282, 22757, 11040, 34482, 20406, 5881, 4504, 28166, 7789, 50276, 38381, 37847, 52793, 61211, 1908, 28454, 24791}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6561, View.getDefaultSize(0, 0) + 56, (char) TextUtils.getOffsetAfter("", 0), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            int keyRepeatTimeout = 2405 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int scrollBarFadeDuration = 26 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
            byte b2 = (byte) ($$e & 48);
            byte[] bArr = $$d;
            Object[] objArr13 = new Object[1];
            g(b2, bArr[64], bArr[66], objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatTimeout, scrollBarFadeDuration, cLastIndexOf, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                int i3 = 2405 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int i4 = 27 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                byte[] bArr2 = $$d;
                Object[] objArr14 = new Object[1];
                g((byte) 35, bArr2[64], bArr2[20], objArr14);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i3, i4, cLastIndexOf2, 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            i(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952747_res_0x7f13046b).substring(22, 23).length() + 15, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 13, new char[]{'\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11}, 297 - Color.red(0), false, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            i(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 13, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(24) + SecLiteException.ERROR_API_KEY_OR_SIGN, new char[]{65535, '\b', 14, 3, 14, 19, 65506, 65531, CharUtils.CR, 2, 65501, '\t', 65534, 65535, 3, 65534}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 272, false, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i5 = component4 + 19;
            equals = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, -1631485702};
                byte[] bArr3 = $$j;
                Object[] objArr18 = new Object[1];
                k(bArr3[25], bArr3[27], (byte) 53, objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                k(bArr3[25], bArr3[32], bArr3[55], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 2406;
                    int i7 = 27 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    char size = (char) View.MeasureSpec.getSize(0);
                    byte[] bArr4 = $$d;
                    Object[] objArr20 = new Object[1];
                    g((byte) 35, bArr4[64], bArr4[20], objArr20);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf, i7, size, 24929979, false, (String) objArr20[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 7, new char[]{19342, 12701, 28655, 2407, 62397, 11408, 19093, 28742, 1100, 22926, 28099, 10141, 60920, 17539, 10768, 12218, 61007, 9424, 4119, 62683, 61578, 51658}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    i(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(12) - 94, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(19) - 34, new char[]{CharUtils.CR, 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 273, true, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2405;
                        int iResolveOpacity = 26 - Drawable.resolveOpacity(0, 0);
                        char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        byte[] bArr5 = $$d;
                        Object[] objArr23 = new Object[1];
                        g((byte) (bArr5[59] + 1), bArr5[66], (byte) (-bArr5[71]), objArr23);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(doubleTapTimeout, iResolveOpacity, minimumFlingVelocity, -1843538389, false, (String) objArr23[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        int packedPositionType = 2405 - ExpandableListView.getPackedPositionType(0L);
                        int iRed = Color.red(0) + 26;
                        char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        byte b3 = (byte) ($$e & 48);
                        byte[] bArr6 = $$d;
                        Object[] objArr24 = new Object[1];
                        g(b3, bArr6[64], bArr6[66], objArr24);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionType, iRed, keyRepeatDelay, -2047739879, false, (String) objArr24[0], null);
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
        int i8 = ((int[]) objArr[0])[0];
        int i9 = ((int[]) objArr[2])[0];
        if (i9 != i8) {
            long j = -1;
            long j2 = ((long) (i9 ^ i8)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6618 - View.resolveSize(0, 0), 43 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            try {
                Object[] objArr25 = {43703093, Long.valueOf(j4), new ArrayList(), null, true};
                Class cls6 = (Class) ITrustedWebActivityCallbackDefault.copydefault(6562 - TextUtils.getOffsetBefore("", 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 55, (char) TextUtils.getOffsetAfter("", 0));
                byte[] bArr7 = $$j;
                Object[] objArr26 = new Object[1];
                k(bArr7[25], bArr7[40], bArr7[55], objArr26);
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
        initView();
        addObserver();
    }

    protected void initView() {
        int i = 2 % 2;
        ((ActivityPayCodeBinding) this.binding).llCoollect.setBackgroundColor(ColorUtils.INSTANCE.withAlpha(0.1f, com.blankj.utilcode.util.ColorUtils.getColor(com.huawei.digitalpayment.consumer.qrcode.R.color.colorGround)));
        ((IHomeModule2Service) RouteUtils.getService(IHomeModule2Service.class)).refreshBalance();
        getWindow().setBackgroundDrawable(new ColorDrawable(com.blankj.utilcode.util.ColorUtils.getColor(com.huawei.digitalpayment.consumer.qrcode.R.color.colorPrimary)));
        boolean z = SPUtils.getInstance().getBoolean(SPConstant.IS_PAY_GUIDE_CHECKED, false);
        ((ActivityPayCodeBinding) this.binding).ivCheck.setChecked(z);
        ((ActivityPayCodeBinding) this.binding).ivCheck.setText(getString(com.huawei.digitalpayment.consumer.qrcode.R.string.scan_code_title3));
        if (z) {
            int i2 = component4 + 101;
            equals = i2 % 128;
            int i3 = i2 % 2;
            ((ActivityPayCodeBinding) this.binding).cvScanPayView.cvScanPayView.setVisibility(0);
            ((ActivityPayCodeBinding) this.binding).llPayGuide.setVisibility(8);
            ((PayViewCodeModel) this.viewModel).getPaymentCodeList();
            int i4 = equals + 101;
            component4 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            ((ActivityPayCodeBinding) this.binding).llPayGuide.setVisibility(0);
        }
        ((ActivityPayCodeBinding) this.binding).ivCheck.setOnClickListener(new CommonCheckBox.OnClickListener() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public void onClick(View view, int i6, boolean z2) {
                int i7 = 2 % 2;
                int i8 = copydefault + 93;
                component3 = i8 % 128;
                int i9 = i8 % 2;
                SPUtils.getInstance().put(SPConstant.IS_PAY_GUIDE_CHECKED, z2);
                ((ActivityPayCodeBinding) PayCodeActivity.access$100(PayCodeActivity.this)).ivCheck.setChecked(z2);
                int i10 = component3 + 9;
                copydefault = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 80 / 0;
                }
            }
        });
        ((IBalanceService) RouteUtils.getService(IBalanceService.class)).getBalance().observe(this, new Observer() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public final void onChanged(Object obj) throws Throwable {
                int i6 = 2 % 2;
                int i7 = copydefault + 27;
                component2 = i7 % 128;
                int i8 = i7 % 2;
                PayCodeActivity.m10892$r8$lambda$DhXFEM9uoz8YadB77ZInCj31Q(this.f$0, (String) obj);
                int i9 = copydefault + 51;
                component2 = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 77 / 0;
                }
            }
        });
        ((ActivityPayCodeBinding) this.binding).btnOk.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public final void onClick(View view) {
                int i6 = 2 % 2;
                int i7 = component2 + 37;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
                PayCodeActivity.$r8$lambda$MMADutGsPn2NopJaAcsZacZFyoc(this.f$0, view);
                int i9 = component2 + 75;
                ShareDataUIState = i9 % 128;
                int i10 = i9 % 2;
            }
        });
        ((ActivityPayCodeBinding) this.binding).cvScanPayView.ivBarCode.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public final void onClick(View view) {
                int i6 = 2 % 2;
                int i7 = ShareDataUIState + 79;
                component2 = i7 % 128;
                if (i7 % 2 != 0) {
                    PayCodeActivity.$r8$lambda$ZUakv801c3WtS336SUQcrpAD5jo(this.f$0, view);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                PayCodeActivity.$r8$lambda$ZUakv801c3WtS336SUQcrpAD5jo(this.f$0, view);
                int i8 = component2 + 15;
                ShareDataUIState = i8 % 128;
                int i9 = i8 % 2;
            }
        });
        ((ActivityPayCodeBinding) this.binding).llCoollect.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public final void onClick(View view) {
                int i6 = 2 % 2;
                int i7 = component3 + 121;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
                PayCodeActivity.m10894$r8$lambda$c3HYqk9NyYf6zTXXeMMwZS7_I(this.f$0, view);
                if (i8 != 0) {
                    int i9 = 63 / 0;
                }
            }
        });
    }

    private void lambda$initView$0(String str) throws Throwable {
        int length;
        Object[] objArr;
        char c2;
        int i = 2 % 2;
        int i2 = component4 + 67;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-862225659);
        if (objCopydefault == null) {
            int iIndexOf = TextUtils.indexOf("", "") + 2026;
            int i4 = 23 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            char keyRepeatDelay = (char) (6164 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
            byte b2 = $$d[2];
            Object[] objArr2 = new Object[1];
            g(b2, (byte) (b2 & 10), r2[54], objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, i4, keyRepeatDelay, 163751008, false, (String) objArr2[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr3 = new Object[1];
        h(TextUtils.getTrimmedLength("") + 22, new char[]{19342, 12701, 28655, 2407, 62397, 11408, 19093, 28742, 1100, 22926, 28099, 10141, 60920, 17539, 10768, 12218, 61007, 9424, 4119, 62683, 61578, 51658}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        i(15 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 13 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), new char[]{CharUtils.CR, 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2}, (-16776914) - Color.rgb(0, 0, 0), true, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-744988891);
        if (objCopydefault2 == null) {
            int i5 = 2026 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 23;
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 6165);
            byte[] bArr = $$d;
            Object[] objArr5 = new Object[1];
            g(bArr[26], bArr[64], bArr[20], objArr5);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i5, threadPriority, cLastIndexOf, 381780032, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-744065370);
            if (objCopydefault3 == null) {
                int iAxisFromString = MotionEvent.axisFromString("") + 2027;
                int iArgb = Color.argb(0, 0, 0, 0) + 23;
                char cIndexOf = (char) (6164 - TextUtils.indexOf("", ""));
                byte[] bArr2 = $$d;
                Object[] objArr6 = new Object[1];
                g(bArr2[50], bArr2[64], bArr2[20], objArr6);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iAxisFromString, iArgb, cIndexOf, 385853891, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new int[1], new int[]{i}, strArr, new int[]{i}};
            int i6 = ((int[]) objArr7[1])[0];
            int i7 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[2];
            int i8 = (int) Runtime.getRuntime().totalMemory();
            int i9 = ~i8;
            int i10 = (~((-1680105636) | i9)) | 1679835139 | (~(412527840 | i9));
            int i11 = ((((-1655744275) + (((~(i8 | (-412257345))) | i10) * 590)) + (i10 * (-1180))) + (((~((-412527841) | i9)) | (~(i9 | 1680105635))) * 590)) - 1078150747;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[0])[0] = i13 ^ (i13 << 5);
            c2 = 3;
        } else {
            if (str != null) {
                length = str.length();
                int i14 = component4 + 87;
                equals = i14 % 128;
                if (i14 % 2 != 0) {
                    int i15 = 3 / 3;
                }
            } else {
                length = 0;
            }
            int i16 = component4 + 63;
            equals = i16 % 128;
            int i17 = i16 % 2;
            try {
                Object[] objArr8 = {null, Integer.valueOf(length), 0, -1078150747};
                Object[] objArr9 = new Object[1];
                j((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), new char[]{0, 0, 0, 0}, (ViewConfiguration.getLongPressTimeout() >> 16) - 1288059452, new char[]{3968, 11713, 43332, 6757, 20012, 37903, 31574, 1652, 17147, 4258, 36660, 21915, 20721, 42798, 35869, 18140, 38953, 11161, 58061, 62999, 36901, 44611, 39201, 20395, 48504, 36125, 44190, 35822, 16384, 19789, 55621, 25638, 16692, 34580, 2115, 60067, 54498, 10000, 51794, 34824, 34603, 60071, 12485, 58336, 22094, 18921, 19721, 64089, 60065, 26804, 829, 63427, 34911, 4313, 60305, 38119, 62563, 39128, 10117, 47042, 22424, 39623, 20211, 2870, 41105, 7893, 15012, 49051, 64524, 54952, 12555, 14742, 54362, 35685, 27946, 9113, 47392, 37278, 51924, 32944, 19311, 39179, 13222, 17359, 12950}, new char[]{50233, 14789, 7859, 17672}, objArr9);
                Class<?> cls2 = Class.forName(((String) objArr9[0]).intern());
                byte[] bArr3 = $$j;
                Object[] objArr10 = new Object[1];
                k(bArr3[25], bArr3[32], bArr3[55], objArr10);
                objArr = (Object[]) cls2.getMethod((String) objArr10[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr8);
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-744065370);
                if (objCopydefault4 == null) {
                    int iLastIndexOf = 2025 - TextUtils.lastIndexOf("", '0', 0);
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 23;
                    char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 6164);
                    byte[] bArr4 = $$d;
                    Object[] objArr11 = new Object[1];
                    g(bArr4[50], bArr4[64], bArr4[20], objArr11);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf, deadChar, cMakeMeasureSpec, 385853891, false, (String) objArr11[0], null);
                }
                ((Field) objCopydefault4).set(null, objArr);
                try {
                    Object[] objArr12 = new Object[1];
                    h(22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{19342, 12701, 28655, 2407, 62397, 11408, 19093, 28742, 1100, 22926, 28099, 10141, 60920, 17539, 10768, 12218, 61007, 9424, 4119, 62683, 61578, 51658}, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    i(14 - TextUtils.indexOf((CharSequence) "", '0'), 12 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{CharUtils.CR, 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2}, 302 - TextUtils.getTrimmedLength(""), true, objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-744988891);
                    if (objCopydefault5 == null) {
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 2026;
                        int maxKeyCode = 23 - (KeyEvent.getMaxKeyCode() >> 16);
                        char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 6164);
                        byte[] bArr5 = $$d;
                        Object[] objArr14 = new Object[1];
                        g(bArr5[26], bArr5[64], bArr5[20], objArr14);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iResolveOpacity, maxKeyCode, cResolveOpacity, 381780032, false, (String) objArr14[0], null);
                    }
                    ((Field) objCopydefault5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-862225659);
                    if (objCopydefault6 == null) {
                        int iArgb2 = Color.argb(0, 0, 0, 0) + 2026;
                        int iIndexOf2 = 23 - TextUtils.indexOf("", "", 0, 0);
                        char cIndexOf2 = (char) (TextUtils.indexOf("", "", 0) + 6164);
                        byte b3 = $$d[2];
                        Object[] objArr15 = new Object[1];
                        g(b3, (byte) (b3 & 10), r3[54], objArr15);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(iArgb2, iIndexOf2, cIndexOf2, 163751008, false, (String) objArr15[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf2);
                    c2 = 3;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i18 = ((int[]) objArr[c2])[0];
        int i19 = ((int[]) objArr[1])[0];
        if (i19 == i18) {
            Object[] objArr16 = {new int[1], new int[]{i}, strArr, new int[]{i}};
            int i20 = ((int[]) objArr[0])[0];
            int i21 = ((int[]) objArr[1])[0];
            int i22 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[2];
            int iMyUid = Process.myUid();
            int i23 = i20 + 1043301818 + (((~(iMyUid | 1539563254)) | (-553070222)) * (-465)) + ((1539563254 | (~((-553070222) | iMyUid))) * 930) + ((iMyUid | (-540286986)) * 465);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr16[0])[0] = i25 ^ (i25 << 5);
            Object[] objArr17 = {new int[1], new int[]{i}, strArr2, new int[]{i}};
            int i26 = ((int[]) objArr16[0])[0];
            int i27 = ((int[]) objArr16[1])[0];
            int i28 = ((int[]) objArr16[3])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i29 = ~iIdentityHashCode;
            int i30 = i26 + 1002506283 + (((~((-30815846) | i29)) | 12850692 | (~((-2061817631) | i29))) * (-1136)) + (((~((-30815846) | iIdentityHashCode)) | (~((-2061817631) | iIdentityHashCode)) | (~(2079782783 | i29))) * (-568)) + (((~(iIdentityHashCode | (-12850693))) | (~(i29 | 2061817630)) | (~(30815845 | i29))) * 568);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr17[0])[0] = i32 ^ (i32 << 5);
            TextView textView = ((ActivityPayCodeBinding) this.binding).cvScanPayView.tvBalance;
            int i33 = com.huawei.digitalpayment.consumer.qrcode.R.string.qrcode_balance_unit;
            String currency = AppConfigManager.getAppConfig().getCurrency();
            int i34 = ((int[]) objArr17[0])[0];
            int i35 = i34 * i34;
            int i36 = -(134037430 * i34);
            int i37 = (((i35 ^ i36) + ((i35 & i36) << 1)) - (~(-(i34 * 445172382)))) - 1;
            int i38 = ((i37 | 1209445092) << 1) - (1209445092 ^ i37);
            int i39 = i38 >> 29;
            int i40 = (((i39 | (-15)) << 1) - (i39 ^ (-15))) / 8;
            int i41 = (i38 - (~(((i40 | 1) << 1) - (i40 ^ 1)))) - 1;
            int i42 = i38 >> 28;
            int i43 = (-(i41 ^ ((((i42 ^ (-31)) + ((i42 & (-31)) << 1)) / 16) + 1))) + 5;
            int i44 = i43 >> 18;
            Object[] objArr18 = new Object[12600 / ((i43 & (-(((((i44 | (-32767)) << 1) - (i44 ^ (-32767))) / 16384) + 2))) * 1260)];
            objArr18[0] = str;
            objArr18[1] = currency;
            textView.setText(getString(i33, objArr18));
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i45 = 2;
        String[] strArr3 = (String[]) objArr[2];
        if (strArr3 != null) {
            int i46 = 0;
            while (i46 < strArr3.length) {
                int i47 = component4 + 13;
                equals = i47 % 128;
                int i48 = i47 % i45;
                arrayList.add(strArr3[i46]);
                i46++;
                i45 = 2;
            }
        }
        long j2 = -1;
        long j3 = ((long) (i18 ^ i19)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
        long j4 = 0;
        long j5 = j3 | (((long) 10) << 32) | (j4 - ((j4 >> 63) << 32));
        try {
            Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault7 == null) {
                objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getLongPressTimeout() >> 16) + 6618, TextUtils.indexOf("", "", 0, 0) + 42, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
            Object[] objArr19 = {-145745958, Long.valueOf(j5), arrayList, null, false, false};
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 57 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault8).invoke(objInvoke, objArr19);
            Object[] objArr20 = {new int[1], new int[]{i}, strArr, new int[]{i}};
            int i49 = ((int[]) objArr[0])[0];
            int i50 = ((int[]) objArr[1])[0];
            int i51 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[2];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i52 = i49 + ((((~((-1207220004) | r5)) | (~(iIdentityHashCode2 | 885413472))) * 959) - 1577150779) + (((~(iIdentityHashCode2 | (-1207220004))) | (~((~iIdentityHashCode2) | 885413472))) * 959);
            int i53 = (i52 << 13) ^ i52;
            int i54 = i53 ^ (i53 >>> 17);
            ((int[]) objArr20[0])[0] = i54 ^ (i54 << 5);
            throw new RuntimeException(String.valueOf(i19));
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private void lambda$initView$1(View view) {
        LinearLayout linearLayout;
        int i;
        int i2 = 2 % 2;
        int i3 = component4 + 17;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            ((ActivityPayCodeBinding) this.binding).cvScanPayView.cvScanPayView.setVisibility(1);
            linearLayout = ((ActivityPayCodeBinding) this.binding).llPayGuide;
            i = 41;
        } else {
            ((ActivityPayCodeBinding) this.binding).cvScanPayView.cvScanPayView.setVisibility(0);
            linearLayout = ((ActivityPayCodeBinding) this.binding).llPayGuide;
            i = 8;
        }
        linearLayout.setVisibility(i);
        ((PayViewCodeModel) this.viewModel).getPaymentCodeList();
    }

    private void lambda$initView$2(View view) {
        int i = 2 % 2;
        int i2 = equals + 61;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        showBarCodeBig();
        int i4 = equals + 53;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    private void lambda$initView$3(View view) {
        int i = 2 % 2;
        int i2 = equals + 85;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            RouteUtils.routeWithExecute(this.activity, RoutePathConstants.RECEIVE);
            throw null;
        }
        RouteUtils.routeWithExecute(this.activity, RoutePathConstants.RECEIVE);
        int i3 = equals + 23;
        component4 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 26 / 0;
        }
    }

    private void lambda$addObserver$4(Resource resource) {
        int i = 2 % 2;
        int i2 = component4 + 75;
        equals = i2 % 128;
        int i3 = i2 % 2;
        if (resource.loading()) {
            showLoading();
            return;
        }
        if (resource.error()) {
            this.holder.showLoadFailed();
            this.handler.removeCallbacks(this.runnable);
            ToastUtils.showShort(resource.getMessage());
            int i4 = component4 + 13;
            equals = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        if (resource.success()) {
            ((PayViewCodeModel) this.viewModel).refreshQrCode();
            this.handler.removeCallbacks(this.runnable);
            long j = Long.parseLong(((PaymentQrResp) resource.getData()).getRefreshFreq()) * 1000;
            this.refreshFreq = j;
            this.handler.postDelayed(this.runnable, j);
            ((ActivityPayCodeBinding) this.binding).cvScanPayView.tvUpdateAfterMinute.setText(QrCodeUtils.getRefreshText(((PaymentQrResp) resource.getData()).getRefreshFreq(), getString(com.huawei.digitalpayment.consumer.qrcode.R.string.update_minute), getString(com.huawei.digitalpayment.consumer.qrcode.R.string.update_minute_secend), getString(com.huawei.digitalpayment.consumer.qrcode.R.string.update_second)));
        }
    }

    private void lambda$addObserver$5(Resource resource) {
        int i = 2 % 2;
        int i2 = component4 + 107;
        equals = i2 % 128;
        int i3 = i2 % 2;
        if (!(!resource.loading())) {
            showLoading();
            return;
        }
        if (resource.error()) {
            ToastUtils.showShort(resource.getMessage());
            return;
        }
        if (resource.success()) {
            int i4 = equals + 51;
            component4 = i4 % 128;
            if (i4 % 2 != 0) {
                ((PayViewCodeModel) this.viewModel).setQueryOrderInfoTimer();
            } else {
                ((PayViewCodeModel) this.viewModel).setQueryOrderInfoTimer();
                throw null;
            }
        }
    }

    private void addObserver() {
        int i = 2 % 2;
        ((PayViewCodeModel) this.viewModel).getPaymentQrRespData().observe(this, new Observer() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = component2 + 113;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                PayCodeActivity.$r8$lambda$XRPm4DrTNXR4CAHOknsUrjjQkD0(this.f$0, (Resource) obj);
                if (i4 == 0) {
                    int i5 = 65 / 0;
                }
            }
        });
        ((PayViewCodeModel) this.viewModel).getAuthCodesBeanData().observe(this, new Observer() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = component2 + 25;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                PayCodeActivity.$r8$lambda$pXtF6XdIMrCqZHCGze58UXmQCJY(this.f$0, (PaymentQrResp.AuthCodesBean) obj);
                if (i4 != 0) {
                    throw null;
                }
            }
        });
        ((PayViewCodeModel) this.viewModel).getEnablePaymentCodeData().observe(this, new Observer() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 13;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                PayCodeActivity.$r8$lambda$_PFxo02wyxAEE5YLHZxyx9S1_9k(this.f$0, (Resource) obj);
                int i5 = component2 + 31;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        ((PayViewCodeModel) this.viewModel).getAuthNoticeRespData().observe(this, new Observer() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 37;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                PayCodeActivity.$r8$lambda$9wXygNTGAmTr9xFxNSAoDSjtsIo(this.f$0, (Resource) obj);
                if (i4 != 0) {
                    throw null;
                }
            }
        });
        int i2 = component4 + 29;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    private void lambda$addObserver$6(Resource resource) {
        int i = 2 % 2;
        int i2 = component4 + 13;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            resource.loading();
            throw null;
        }
        if (!(!resource.loading())) {
            showLoading();
            int i3 = component4 + 25;
            equals = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        if (resource.error()) {
            ToastUtils.showShort(resource.getMessage());
            return;
        }
        if (Boolean.parseBoolean(((AuthNoticeResp) resource.getData()).getExist())) {
            int i5 = equals + 59;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            if (resource.success()) {
                pay((AuthNoticeResp) resource.getData());
            }
        }
        int i7 = equals + 109;
        component4 = i7 % 128;
        int i8 = i7 % 2;
    }

    public void showLoading() {
        int i = 2 % 2;
        int i2 = component4 + 15;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            if (this.holder == null) {
                this.holder = Gloading.getDefault().wrap(((ActivityPayCodeBinding) this.binding).cvScanPayView.cvScanPayView).withRetry(new Runnable() {
                    private static int ShareDataUIState = 1;
                    private static int component1;

                    @Override
                    public final void run() throws Throwable {
                        int i3 = 2 % 2;
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(67 - View.resolveSizeAndState(0, 0, 0), 33 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (19695 - ImageFormat.getBitsPerPixel(0)), 518907119, false, "component3", null);
                        }
                        int i4 = ((Field) objCopydefault).getInt(null);
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
                        if (objCopydefault2 == null) {
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(37 - TextUtils.getTrimmedLength(""), 30 - View.MeasureSpec.getMode(0), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 55511118, false, "component2", null);
                        }
                        int i5 = ((Field) objCopydefault2).getInt(null);
                        long j = i5;
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
                        if (objCopydefault3 == null) {
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(37 - View.MeasureSpec.getMode(0), View.MeasureSpec.makeMeasureSpec(0, 0) + 30, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 58536393, false, "component3", null);
                        }
                        int i6 = ((Field) objCopydefault3).getInt(null);
                        long j2 = -1;
                        long j3 = j2 ^ (-2902583163196472780L);
                        long jIdentityHashCode = (((long) System.identityHashCode(this)) | (-2902583163196472780L)) ^ j2;
                        long j4 = (((long) (-391)) * 3695286616840677204L) + (((long) (-195)) * (-2902583163196472780L)) + (((long) (-196)) * (((j3 | 3695286616840677204L) ^ j2) | jIdentityHashCode)) + (((long) 392) * (-576465158961944716L)) + (((long) 196) * ((j2 ^ ((3695286616840677204L ^ j2) | j3)) | jIdentityHashCode));
                        int i7 = component1 + 43;
                        ShareDataUIState = i7 % 128;
                        int i8 = i7 % 2;
                        int i9 = 0;
                        while (true) {
                            for (int i10 = 0; i10 != 8; i10++) {
                                int i11 = component1 + 123;
                                ShareDataUIState = i11 % 128;
                                int i12 = i11 % 2;
                                i6 = (((((int) (j >> i10)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
                            }
                            if (i9 != 0) {
                                break;
                            }
                            i9++;
                            j = j4;
                        }
                        if (i6 != i4) {
                            int i13 = component1 + 99;
                            ShareDataUIState = i13 % 128;
                            int i14 = i13 % 2;
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
                            if (objCopydefault4 == null) {
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0, 0) + 68, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 33, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 19696), 1457147715, false, "copydefault", null);
                            }
                            Object obj = ((Field) objCopydefault4).get(null);
                            long j5 = -1;
                            long j6 = 0;
                            long j7 = (((long) (i5 ^ i4)) & ((((long) 0) << 32) | (j5 - ((j5 >> 63) << 32)))) | (((long) 1) << 32) | (j6 - ((j6 >> 63) << 32));
                            try {
                                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                                if (objCopydefault5 == null) {
                                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(6619 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 43 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) Color.red(0), 428292935, false, "ShareDataUIState", new Class[0]);
                                }
                                Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                                Object[] objArr = {1716657019, Long.valueOf(j7), obj, null, false, false};
                                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                                if (objCopydefault6 == null) {
                                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetAfter("", 0) + 6562, KeyEvent.keyCodeFromString("") + 56, (char) (ViewConfiguration.getPressedStateDuration() >> 16), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                                }
                                ((Method) objCopydefault6).invoke(objInvoke, objArr);
                                throw null;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        PayCodeActivity.m10893$r8$lambda$J0QjkxYwByhkqWzSGQXvm0UTDU(this.f$0);
                    }
                });
                int i3 = component4 + 61;
                equals = i3 % 128;
                int i4 = i3 % 2;
            }
            this.holder.showLoading();
            return;
        }
        throw null;
    }

    private void retry() {
        int i = 2 % 2;
        int i2 = equals + 63;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        ((PayViewCodeModel) this.viewModel).getPaymentCodeList();
        int i4 = component4 + 93;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    private void refreshQrCode(PaymentQrResp.AuthCodesBean authCodesBean) {
        int i = 2 % 2;
        int i2 = component4 + 113;
        equals = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (authCodesBean != null) {
            Bitmap bitmapBuildCode = buildCode(authCodesBean.getQrCode(), HmsScan.QRCODE_SCAN_TYPE, DensityUtils.dp2px(this, 142.0f), DensityUtils.dp2px(this, 142.0f));
            Bitmap bitmapBuildCode2 = buildCode(authCodesBean.getBarCode(), HmsScan.CODE128_SCAN_TYPE, DensityUtils.dp2px(this, 293.0f), DensityUtils.dp2px(this, 96.0f));
            ((ActivityPayCodeBinding) this.binding).cvScanPayView.ivBarCode.setImageBitmap(null);
            ((ActivityPayCodeBinding) this.binding).cvScanPayView.ivQrCode.setImageBitmap(null);
            ((ActivityPayCodeBinding) this.binding).cvScanPayView.ivBarCode.setImageBitmap(bitmapBuildCode2);
            ((ActivityPayCodeBinding) this.binding).cvScanPayView.ivQrCode.setImageBitmap(bitmapBuildCode);
            setBarCodeBig(authCodesBean.getBarCode());
            ((PayViewCodeModel) this.viewModel).enablePaymentCode(authCodesBean.getCodeId());
            ((PayViewCodeModel) this.viewModel).saveQrListResp();
            return;
        }
        ((PayViewCodeModel) this.viewModel).getPaymentCodeList();
        int i3 = component4 + 19;
        equals = i3 % 128;
        int i4 = i3 % 2;
    }

    private Bitmap buildCode(String str, int i, int i2, int i3) {
        int i4 = 2 % 2;
        try {
            Bitmap bitmapBuildBitmap = ScanUtil.buildBitmap(str, i, i2, i3, new HmsBuildBitmapOption.Creator().setBitmapBackgroundColor(-1).setBitmapColor(-16777216).setBitmapMargin(0).create());
            int i5 = component4 + 99;
            equals = i5 % 128;
            int i6 = i5 % 2;
            return bitmapBuildBitmap;
        } catch (WriterException unused) {
            return null;
        }
    }

    private void setBarCodeBig(String str) {
        int i = 2 % 2;
        View viewInflate = LayoutInflater.from(this).inflate(com.huawei.digitalpayment.consumer.qrcode.R.layout.layout_bar_code_big, (ViewGroup) null);
        PopupWindow popupWindow = new PopupWindow(viewInflate, -1, -1, true);
        this.popWindow = popupWindow;
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        this.popWindow.setClippingEnabled(false);
        BarUtils.setNavBarColor(this, -1);
        TextView textView = (TextView) viewInflate.findViewById(com.huawei.digitalpayment.consumer.qrcode.R.id.tv_bar_code_num);
        ImageView imageView = (ImageView) viewInflate.findViewById(com.huawei.digitalpayment.consumer.qrcode.R.id.iv_bar_code_big);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(com.huawei.digitalpayment.consumer.qrcode.R.id.ll_content);
        ((LinearLayout) viewInflate.findViewById(com.huawei.digitalpayment.consumer.qrcode.R.id.content_layout)).setLayoutParams(new LinearLayout.LayoutParams(ScreenUtils.getScreenHeight(), ScreenUtils.getScreenWidth()));
        if (textView != null) {
            int i2 = component4 + 83;
            equals = i2 % 128;
            int i3 = i2 % 2;
            textView.setText(str);
        }
        if (imageView != null) {
            imageView.setImageBitmap(buildCode(str, HmsScan.CODE128_SCAN_TYPE, DensityUtils.dp2px(this, 640.0f), DensityUtils.dp2px(this, 194.0f)));
            int i4 = equals + 5;
            component4 = i4 % 128;
            int i5 = i4 % 2;
        }
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() {
                private static int ShareDataUIState = 1;
                private static int component3;

                @Override
                public final void onClick(View view) {
                    int i6 = 2 % 2;
                    int i7 = component3 + 85;
                    ShareDataUIState = i7 % 128;
                    int i8 = i7 % 2;
                    PayCodeActivity.$r8$lambda$_r3idRKDuchDneoxWF4Gk8SWEG0(this.f$0, view);
                    int i9 = ShareDataUIState + 11;
                    component3 = i9 % 128;
                    if (i9 % 2 == 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
  0x001b: PHI (r1v3 android.widget.PopupWindow) = (r1v2 android.widget.PopupWindow), (r1v6 android.widget.PopupWindow) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void lambda$setBarCodeBig$7(android.view.View r4) {
        /*
            r3 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.PayCodeActivity.component4
            int r1 = r0 + 11
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.qrcode.ui.activity.PayCodeActivity.equals = r2
            int r1 = r1 % r4
            if (r1 == 0) goto L17
            android.widget.PopupWindow r1 = r3.popWindow
            r2 = 56
            int r2 = r2 / 0
            if (r1 == 0) goto L33
            goto L1b
        L17:
            android.widget.PopupWindow r1 = r3.popWindow
            if (r1 == 0) goto L33
        L1b:
            int r0 = r0 + 33
            int r2 = r0 % 128
            com.huawei.digitalpayment.consumer.qrcode.ui.activity.PayCodeActivity.equals = r2
            int r0 = r0 % r4
            r1.dismiss()
            if (r0 != 0) goto L31
            int r0 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.PayCodeActivity.component4
            int r0 = r0 + 109
            int r1 = r0 % 128
            com.huawei.digitalpayment.consumer.qrcode.ui.activity.PayCodeActivity.equals = r1
            int r0 = r0 % r4
            goto L33
        L31:
            r4 = 0
            throw r4
        L33:
            int r0 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.PayCodeActivity.component4
            int r0 = r0 + 69
            int r1 = r0 % 128
            com.huawei.digitalpayment.consumer.qrcode.ui.activity.PayCodeActivity.equals = r1
            int r0 = r0 % r4
            if (r0 == 0) goto L42
            r4 = 78
            int r4 = r4 / 0
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.ui.activity.PayCodeActivity.lambda$setBarCodeBig$7(android.view.View):void");
    }

    private void showBarCodeBig() {
        int i = 2 % 2;
        PopupWindow popupWindow = this.popWindow;
        if (popupWindow != null) {
            int i2 = equals + 29;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            popupWindow.showAtLocation(((ActivityPayCodeBinding) this.binding).llPayGuide, 0, 0, 0);
        }
        int i4 = component4 + 125;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public void pay(AuthNoticeResp authNoticeResp) {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put("appId", authNoticeResp.getAppId());
        map.put(KeysConstants.KEY_MERCH_CODE, authNoticeResp.getMerchCode());
        map.put("tradeType", authNoticeResp.getTradeType());
        map.put(com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants.PREPAY_ID, authNoticeResp.getPrepayId());
        ActivityUtils.getTopActivity();
        PayManager.get().startPay(this, map, TradeTypeEnum.H5_CHECKOUT, new ApiCallback<TransferResp>(this) {
            private static int component1 = 1;
            private static int component3;

            @Override
            public void onSuccess(TransferResp transferResp) {
                int i2 = 2 % 2;
                int i3 = component1 + 95;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                copydefault(transferResp);
                if (i4 != 0) {
                    throw null;
                }
                int i5 = component1 + 51;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 12 / 0;
                }
            }

            public void copydefault(TransferResp transferResp) {
                int i2 = 2 % 2;
                Bundle bundle = new Bundle();
                bundle.putSerializable(com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants.KEY_TRANSFER_RESP, transferResp);
                ((IHomeModule2Service) RouteUtils.getService(IHomeModule2Service.class)).refreshBalance();
                RouteUtils.routeWithExecute(RoutePathConstants.COMMON_SUCCESS, bundle);
                int i3 = component1 + 81;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component1 + 107;
                component3 = i3 % 128;
                int i4 = i3 % 2;
            }
        }, new ApiCallback<Resource>() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public void onSuccess(Resource resource) {
                int i2 = 2 % 2;
                int i3 = component3 + 55;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                component1(resource);
                int i5 = component3 + 85;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void component1(Resource resource) {
                int i2 = 2 % 2;
                if (!(!resource.success())) {
                    int i3 = ShareDataUIState + 13;
                    component3 = i3 % 128;
                    if (i3 % 2 != 0) {
                        ((PayViewCodeModel) PayCodeActivity.access$200(PayCodeActivity.this)).refreshQrCode();
                        int i4 = 88 / 0;
                    } else {
                        ((PayViewCodeModel) PayCodeActivity.access$200(PayCodeActivity.this)).refreshQrCode();
                    }
                }
                int i5 = ShareDataUIState + 93;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 88 / 0;
                }
            }
        });
        int i2 = equals + 107;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void initToolbar(String str) {
        int i = 2 % 2;
        int i2 = component4 + 13;
        equals = i2 % 128;
        int i3 = i2 % 2;
        super.initToolbar(getString(com.huawei.digitalpayment.consumer.qrcode.R.string.scan_code_title1));
        int i4 = equals + 19;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = equals + 51;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = com.huawei.digitalpayment.consumer.qrcode.R.layout.activity_pay_code;
        int i5 = equals + 81;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = component4 + 91;
        equals = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        Handler handler = this.handler;
        if (handler != null) {
            int i4 = equals + 125;
            component4 = i4 % 128;
            if (i4 % 2 == 0) {
                handler.removeCallbacks(this.runnable);
                this.handler = null;
                int i5 = 15 / 0;
            } else {
                handler.removeCallbacks(this.runnable);
                this.handler = null;
            }
            int i6 = equals + 51;
            component4 = i6 % 128;
            int i7 = i6 % 2;
        }
        ((PayViewCodeModel) this.viewModel).cancel();
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = equals + 49;
        component4 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getBaseContext();
            obj.hashCode();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            h(26 - (Process.myPid() >> 22), new char[]{19342, 12701, 28655, 2407, 62397, 11408, 19093, 28742, 31498, 59721, 16132, 48594, 53769, 38675, 15998, 12354, 30623, 60405, 51196, 48278, 32410, 53481, 9324, 61936, 30176, 54187}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952717_res_0x7f13044d).substring(6, 7).codePointAt(0) - 14, new char[]{26873, 49311, 55894, 12031, 6926, 21389, 12043, 33950, 64669, 32146, 42127, 18461, 46963, 2744, 15998, 12354, 50823, 51660}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i3 = component4 + 33;
            equals = i3 % 128;
            int i4 = i3 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6617 - TextUtils.lastIndexOf("", '0', 0), 42 - Color.alpha(0), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6563 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 56, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), -699576857, false, "component2", new Class[]{Context.class});
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
        super.onResume();
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 71, new char[]{19342, 12701, 28655, 2407, 62397, 11408, 19093, 28742, 31498, 59721, 16132, 48594, 53769, 38675, 15998, 12354, 30623, 60405, 51196, 48278, 32410, 53481, 9324, 61936, 30176, 54187}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            h((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, new char[]{26873, 49311, 55894, 12031, 6926, 21389, 12043, 33950, 64669, 32146, 42127, 18461, 46963, 2744, 15998, 12354, 50823, 51660}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = component4 + 57;
            equals = i2 % 128;
            if (i2 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                obj.hashCode();
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i3 = component4 + 97;
            equals = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 6618, TextUtils.getTrimmedLength("") + 42, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0, 0) + 6563, 56 - (KeyEvent.getMaxKeyCode() >> 16), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), -960739708, false, "component3", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                int i5 = component4 + 75;
                equals = i5 % 128;
                int i6 = i5 % 2;
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
    /* JADX WARN: Removed duplicated region for block: B:1014:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x09de A[Catch: all -> 0x04c5, TryCatch #17 {all -> 0x04c5, blocks: (B:135:0x09d8, B:137:0x09de, B:138:0x0a0a, B:418:0x18f2, B:420:0x18f8, B:421:0x191f, B:546:0x1ec2, B:548:0x1ec8, B:549:0x1ef5, B:777:0x344d, B:779:0x3453, B:780:0x347d, B:814:0x379c, B:816:0x37a2, B:817:0x37ca, B:794:0x35cc, B:796:0x35ef, B:797:0x3647, B:743:0x2fc4, B:745:0x2fca, B:746:0x2ff3, B:625:0x2880, B:627:0x2886, B:628:0x28b5, B:630:0x28ef, B:631:0x293c, B:598:0x25ca, B:600:0x25df, B:601:0x2615, B:839:0x38b4, B:841:0x38ba, B:842:0x38e7, B:844:0x3921, B:845:0x3966, B:566:0x2149, B:568:0x215e, B:569:0x218a, B:571:0x21be, B:572:0x2235, B:273:0x1128, B:275:0x112e, B:276:0x115c, B:183:0x0c16, B:185:0x0c1c, B:186:0x0c45, B:19:0x01ed, B:21:0x01f3, B:22:0x0222, B:24:0x0430, B:26:0x0462, B:27:0x04bf, B:145:0x0aa0, B:147:0x0aa4, B:169:0x0b9b, B:171:0x0ba1, B:172:0x0ba2, B:174:0x0ba4, B:176:0x0bab, B:177:0x0bac, B:151:0x0ab0, B:154:0x0ab9, B:155:0x0abc, B:158:0x0abf, B:160:0x0ad4, B:161:0x0b06, B:162:0x0b0c, B:164:0x0b19, B:165:0x0b8f), top: B:890:0x01ed, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0a94  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0abd  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0ad4 A[Catch: all -> 0x0ba3, TryCatch #1 {all -> 0x0ba3, blocks: (B:158:0x0abf, B:160:0x0ad4, B:161:0x0b06), top: B:861:0x0abf, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0b19 A[Catch: all -> 0x0b99, TryCatch #62 {all -> 0x0b99, blocks: (B:162:0x0b0c, B:164:0x0b19, B:165:0x0b8f), top: B:974:0x0b0c, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0d29  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0d89 A[Catch: all -> 0x1062, TRY_ENTER, TRY_LEAVE, TryCatch #28 {all -> 0x1062, blocks: (B:190:0x0cc6, B:196:0x0d1c, B:206:0x0d89, B:216:0x0e1d, B:220:0x0e67), top: B:910:0x0cc6 }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0f52  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x112e A[Catch: all -> 0x04c5, TryCatch #17 {all -> 0x04c5, blocks: (B:135:0x09d8, B:137:0x09de, B:138:0x0a0a, B:418:0x18f2, B:420:0x18f8, B:421:0x191f, B:546:0x1ec2, B:548:0x1ec8, B:549:0x1ef5, B:777:0x344d, B:779:0x3453, B:780:0x347d, B:814:0x379c, B:816:0x37a2, B:817:0x37ca, B:794:0x35cc, B:796:0x35ef, B:797:0x3647, B:743:0x2fc4, B:745:0x2fca, B:746:0x2ff3, B:625:0x2880, B:627:0x2886, B:628:0x28b5, B:630:0x28ef, B:631:0x293c, B:598:0x25ca, B:600:0x25df, B:601:0x2615, B:839:0x38b4, B:841:0x38ba, B:842:0x38e7, B:844:0x3921, B:845:0x3966, B:566:0x2149, B:568:0x215e, B:569:0x218a, B:571:0x21be, B:572:0x2235, B:273:0x1128, B:275:0x112e, B:276:0x115c, B:183:0x0c16, B:185:0x0c1c, B:186:0x0c45, B:19:0x01ed, B:21:0x01f3, B:22:0x0222, B:24:0x0430, B:26:0x0462, B:27:0x04bf, B:145:0x0aa0, B:147:0x0aa4, B:169:0x0b9b, B:171:0x0ba1, B:172:0x0ba2, B:174:0x0ba4, B:176:0x0bab, B:177:0x0bac, B:151:0x0ab0, B:154:0x0ab9, B:155:0x0abc, B:158:0x0abf, B:160:0x0ad4, B:161:0x0b06, B:162:0x0b0c, B:164:0x0b19, B:165:0x0b8f), top: B:890:0x01ed, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x11e8  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x1230 A[Catch: all -> 0x183c, PHI: r1
  0x1230: PHI (r1v594 java.lang.Object) = (r1v593 java.lang.Object), (r1v636 java.lang.Object) binds: [B:281:0x11e6, B:283:0x11e9] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #13 {all -> 0x183c, blocks: (B:280:0x11e2, B:287:0x1230, B:289:0x1257), top: B:882:0x11e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x1257 A[Catch: all -> 0x183c, TRY_LEAVE, TryCatch #13 {all -> 0x183c, blocks: (B:280:0x11e2, B:287:0x1230, B:289:0x1257), top: B:882:0x11e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x12a0  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x12b8 A[Catch: all -> 0x183a, TryCatch #11 {all -> 0x183a, blocks: (B:291:0x1289, B:293:0x12a2, B:295:0x12b8, B:297:0x12c1, B:298:0x130b, B:381:0x1802, B:383:0x1808, B:384:0x1809, B:386:0x180b, B:388:0x1812, B:389:0x1813, B:301:0x131c, B:303:0x1320, B:310:0x1334, B:403:0x182f, B:405:0x1835, B:406:0x1836, B:397:0x1823, B:399:0x1829, B:400:0x182a, B:307:0x132c, B:377:0x177f, B:372:0x174a, B:374:0x1750, B:375:0x1777), top: B:879:0x1289, inners: #45, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x1318  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x16cb  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x18f8 A[Catch: all -> 0x04c5, TryCatch #17 {all -> 0x04c5, blocks: (B:135:0x09d8, B:137:0x09de, B:138:0x0a0a, B:418:0x18f2, B:420:0x18f8, B:421:0x191f, B:546:0x1ec2, B:548:0x1ec8, B:549:0x1ef5, B:777:0x344d, B:779:0x3453, B:780:0x347d, B:814:0x379c, B:816:0x37a2, B:817:0x37ca, B:794:0x35cc, B:796:0x35ef, B:797:0x3647, B:743:0x2fc4, B:745:0x2fca, B:746:0x2ff3, B:625:0x2880, B:627:0x2886, B:628:0x28b5, B:630:0x28ef, B:631:0x293c, B:598:0x25ca, B:600:0x25df, B:601:0x2615, B:839:0x38b4, B:841:0x38ba, B:842:0x38e7, B:844:0x3921, B:845:0x3966, B:566:0x2149, B:568:0x215e, B:569:0x218a, B:571:0x21be, B:572:0x2235, B:273:0x1128, B:275:0x112e, B:276:0x115c, B:183:0x0c16, B:185:0x0c1c, B:186:0x0c45, B:19:0x01ed, B:21:0x01f3, B:22:0x0222, B:24:0x0430, B:26:0x0462, B:27:0x04bf, B:145:0x0aa0, B:147:0x0aa4, B:169:0x0b9b, B:171:0x0ba1, B:172:0x0ba2, B:174:0x0ba4, B:176:0x0bab, B:177:0x0bac, B:151:0x0ab0, B:154:0x0ab9, B:155:0x0abc, B:158:0x0abf, B:160:0x0ad4, B:161:0x0b06, B:162:0x0b0c, B:164:0x0b19, B:165:0x0b8f), top: B:890:0x01ed, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:435:0x1a0c  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x1a6e A[Catch: all -> 0x1e31, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x1e31, blocks: (B:425:0x19a9, B:432:0x19ff, B:441:0x1a6e), top: B:874:0x19a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:486:0x1cc2 A[Catch: all -> 0x1e00, TryCatch #47 {all -> 0x1e00, blocks: (B:483:0x1cb8, B:484:0x1cbc, B:486:0x1cc2, B:489:0x1cde, B:479:0x1c54, B:482:0x1cb0), top: B:946:0x1c54 }] */
    /* JADX WARN: Removed duplicated region for block: B:548:0x1ec8 A[Catch: all -> 0x04c5, TryCatch #17 {all -> 0x04c5, blocks: (B:135:0x09d8, B:137:0x09de, B:138:0x0a0a, B:418:0x18f2, B:420:0x18f8, B:421:0x191f, B:546:0x1ec2, B:548:0x1ec8, B:549:0x1ef5, B:777:0x344d, B:779:0x3453, B:780:0x347d, B:814:0x379c, B:816:0x37a2, B:817:0x37ca, B:794:0x35cc, B:796:0x35ef, B:797:0x3647, B:743:0x2fc4, B:745:0x2fca, B:746:0x2ff3, B:625:0x2880, B:627:0x2886, B:628:0x28b5, B:630:0x28ef, B:631:0x293c, B:598:0x25ca, B:600:0x25df, B:601:0x2615, B:839:0x38b4, B:841:0x38ba, B:842:0x38e7, B:844:0x3921, B:845:0x3966, B:566:0x2149, B:568:0x215e, B:569:0x218a, B:571:0x21be, B:572:0x2235, B:273:0x1128, B:275:0x112e, B:276:0x115c, B:183:0x0c16, B:185:0x0c1c, B:186:0x0c45, B:19:0x01ed, B:21:0x01f3, B:22:0x0222, B:24:0x0430, B:26:0x0462, B:27:0x04bf, B:145:0x0aa0, B:147:0x0aa4, B:169:0x0b9b, B:171:0x0ba1, B:172:0x0ba2, B:174:0x0ba4, B:176:0x0bab, B:177:0x0bac, B:151:0x0ab0, B:154:0x0ab9, B:155:0x0abc, B:158:0x0abf, B:160:0x0ad4, B:161:0x0b06, B:162:0x0b0c, B:164:0x0b19, B:165:0x0b8f), top: B:890:0x01ed, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:554:0x1f83  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x1fed  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x204b  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x2129  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x2371  */
    /* JADX WARN: Removed duplicated region for block: B:745:0x2fca A[Catch: all -> 0x04c5, TryCatch #17 {all -> 0x04c5, blocks: (B:135:0x09d8, B:137:0x09de, B:138:0x0a0a, B:418:0x18f2, B:420:0x18f8, B:421:0x191f, B:546:0x1ec2, B:548:0x1ec8, B:549:0x1ef5, B:777:0x344d, B:779:0x3453, B:780:0x347d, B:814:0x379c, B:816:0x37a2, B:817:0x37ca, B:794:0x35cc, B:796:0x35ef, B:797:0x3647, B:743:0x2fc4, B:745:0x2fca, B:746:0x2ff3, B:625:0x2880, B:627:0x2886, B:628:0x28b5, B:630:0x28ef, B:631:0x293c, B:598:0x25ca, B:600:0x25df, B:601:0x2615, B:839:0x38b4, B:841:0x38ba, B:842:0x38e7, B:844:0x3921, B:845:0x3966, B:566:0x2149, B:568:0x215e, B:569:0x218a, B:571:0x21be, B:572:0x2235, B:273:0x1128, B:275:0x112e, B:276:0x115c, B:183:0x0c16, B:185:0x0c1c, B:186:0x0c45, B:19:0x01ed, B:21:0x01f3, B:22:0x0222, B:24:0x0430, B:26:0x0462, B:27:0x04bf, B:145:0x0aa0, B:147:0x0aa4, B:169:0x0b9b, B:171:0x0ba1, B:172:0x0ba2, B:174:0x0ba4, B:176:0x0bab, B:177:0x0bac, B:151:0x0ab0, B:154:0x0ab9, B:155:0x0abc, B:158:0x0abf, B:160:0x0ad4, B:161:0x0b06, B:162:0x0b0c, B:164:0x0b19, B:165:0x0b8f), top: B:890:0x01ed, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:751:0x3084  */
    /* JADX WARN: Removed duplicated region for block: B:754:0x30d7  */
    /* JADX WARN: Removed duplicated region for block: B:759:0x3130  */
    /* JADX WARN: Removed duplicated region for block: B:776:0x342b  */
    /* JADX WARN: Removed duplicated region for block: B:785:0x350c  */
    /* JADX WARN: Removed duplicated region for block: B:788:0x3562  */
    /* JADX WARN: Removed duplicated region for block: B:793:0x35ae  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:813:0x377e  */
    /* JADX WARN: Removed duplicated region for block: B:832:0x387b  */
    /* JADX WARN: Removed duplicated region for block: B:932:0x19af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:969:0x0ccc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v108 */
    /* JADX WARN: Type inference failed for: r11v109 */
    /* JADX WARN: Type inference failed for: r11v110 */
    /* JADX WARN: Type inference failed for: r11v111 */
    /* JADX WARN: Type inference failed for: r11v112 */
    /* JADX WARN: Type inference failed for: r11v119 */
    /* JADX WARN: Type inference failed for: r11v121 */
    /* JADX WARN: Type inference failed for: r11v131 */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v198 */
    /* JADX WARN: Type inference failed for: r12v114 */
    /* JADX WARN: Type inference failed for: r12v115 */
    /* JADX WARN: Type inference failed for: r12v116 */
    /* JADX WARN: Type inference failed for: r12v157 */
    /* JADX WARN: Type inference failed for: r12v158 */
    /* JADX WARN: Type inference failed for: r12v159 */
    /* JADX WARN: Type inference failed for: r12v173 */
    /* JADX WARN: Type inference failed for: r12v174 */
    /* JADX WARN: Type inference failed for: r12v178 */
    /* JADX WARN: Type inference failed for: r12v181 */
    /* JADX WARN: Type inference failed for: r12v183 */
    /* JADX WARN: Type inference failed for: r12v184 */
    /* JADX WARN: Type inference failed for: r12v185 */
    /* JADX WARN: Type inference failed for: r12v186 */
    /* JADX WARN: Type inference failed for: r12v187 */
    /* JADX WARN: Type inference failed for: r12v188 */
    /* JADX WARN: Type inference failed for: r13v47 */
    /* JADX WARN: Type inference failed for: r1v614 */
    /* JADX WARN: Type inference failed for: r1v619, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v704 */
    /* JADX WARN: Type inference failed for: r26v10 */
    /* JADX WARN: Type inference failed for: r26v11 */
    /* JADX WARN: Type inference failed for: r26v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v13 */
    /* JADX WARN: Type inference failed for: r26v14 */
    /* JADX WARN: Type inference failed for: r26v15 */
    /* JADX WARN: Type inference failed for: r26v16 */
    /* JADX WARN: Type inference failed for: r26v17 */
    /* JADX WARN: Type inference failed for: r26v18 */
    /* JADX WARN: Type inference failed for: r26v19 */
    /* JADX WARN: Type inference failed for: r26v23 */
    /* JADX WARN: Type inference failed for: r26v24 */
    /* JADX WARN: Type inference failed for: r26v25 */
    /* JADX WARN: Type inference failed for: r26v26 */
    /* JADX WARN: Type inference failed for: r26v27 */
    /* JADX WARN: Type inference failed for: r26v28 */
    /* JADX WARN: Type inference failed for: r26v47 */
    /* JADX WARN: Type inference failed for: r26v48 */
    /* JADX WARN: Type inference failed for: r26v49 */
    /* JADX WARN: Type inference failed for: r26v50 */
    /* JADX WARN: Type inference failed for: r26v9 */
    /* JADX WARN: Type inference failed for: r2v637, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r30v17 */
    /* JADX WARN: Type inference failed for: r30v18 */
    /* JADX WARN: Type inference failed for: r30v19 */
    /* JADX WARN: Type inference failed for: r30v20 */
    /* JADX WARN: Type inference failed for: r30v21 */
    /* JADX WARN: Type inference failed for: r30v22 */
    /* JADX WARN: Type inference failed for: r30v23 */
    /* JADX WARN: Type inference failed for: r30v24 */
    /* JADX WARN: Type inference failed for: r30v25 */
    /* JADX WARN: Type inference failed for: r30v26 */
    /* JADX WARN: Type inference failed for: r30v27 */
    /* JADX WARN: Type inference failed for: r30v28 */
    /* JADX WARN: Type inference failed for: r30v29 */
    /* JADX WARN: Type inference failed for: r30v3 */
    /* JADX WARN: Type inference failed for: r30v30 */
    /* JADX WARN: Type inference failed for: r30v31 */
    /* JADX WARN: Type inference failed for: r30v32 */
    /* JADX WARN: Type inference failed for: r30v33 */
    /* JADX WARN: Type inference failed for: r30v37 */
    /* JADX WARN: Type inference failed for: r30v4 */
    /* JADX WARN: Type inference failed for: r30v41 */
    /* JADX WARN: Type inference failed for: r30v42 */
    /* JADX WARN: Type inference failed for: r30v43 */
    /* JADX WARN: Type inference failed for: r30v44 */
    /* JADX WARN: Type inference failed for: r30v45 */
    /* JADX WARN: Type inference failed for: r30v46 */
    /* JADX WARN: Type inference failed for: r30v47 */
    /* JADX WARN: Type inference failed for: r30v5 */
    /* JADX WARN: Type inference failed for: r30v6 */
    /* JADX WARN: Type inference failed for: r30v7 */
    /* JADX WARN: Type inference failed for: r5v170 */
    /* JADX WARN: Type inference failed for: r5v236 */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v555 */
    /* JADX WARN: Type inference failed for: r8v109 */
    /* JADX WARN: Type inference failed for: r8v132, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v133 */
    /* JADX WARN: Type inference failed for: r8v134 */
    /* JADX WARN: Type inference failed for: r8v137 */
    /* JADX WARN: Type inference failed for: r8v144 */
    /* JADX WARN: Type inference failed for: r8v145 */
    /* JADX WARN: Type inference failed for: r8v146 */
    /* JADX WARN: Type inference failed for: r8v160, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r8v169 */
    /* JADX WARN: Type inference failed for: r8v170 */
    /* JADX WARN: Type inference failed for: r8v174 */
    /* JADX WARN: Type inference failed for: r8v177 */
    /* JADX WARN: Type inference failed for: r8v178 */
    /* JADX WARN: Type inference failed for: r8v179 */
    /* JADX WARN: Type inference failed for: r8v180 */
    /* JADX WARN: Type inference failed for: r8v181 */
    /* JADX WARN: Type inference failed for: r8v185, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v188 */
    /* JADX WARN: Type inference failed for: r8v189 */
    /* JADX WARN: Type inference failed for: r8v193 */
    /* JADX WARN: Type inference failed for: r8v194 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v242 */
    /* JADX WARN: Type inference failed for: r8v243 */
    /* JADX WARN: Type inference failed for: r8v245, types: [int[]] */
    /* JADX WARN: Type inference failed for: r8v246 */
    /* JADX WARN: Type inference failed for: r8v266 */
    /* JADX WARN: Type inference failed for: r8v283 */
    /* JADX WARN: Type inference failed for: r8v284 */
    /* JADX WARN: Type inference failed for: r8v285 */
    /* JADX WARN: Type inference failed for: r8v286 */
    /* JADX WARN: Type inference failed for: r8v287 */
    /* JADX WARN: Type inference failed for: r8v288 */
    /* JADX WARN: Type inference failed for: r8v289 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v290 */
    /* JADX WARN: Type inference failed for: r8v291 */
    /* JADX WARN: Type inference failed for: r8v292 */
    /* JADX WARN: Type inference failed for: r8v293 */
    /* JADX WARN: Type inference failed for: r8v294 */
    /* JADX WARN: Type inference failed for: r8v295 */
    /* JADX WARN: Type inference failed for: r8v296 */
    /* JADX WARN: Type inference failed for: r8v297 */
    /* JADX WARN: Type inference failed for: r8v298 */
    /* JADX WARN: Type inference failed for: r8v299 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v300 */
    /* JADX WARN: Type inference failed for: r8v301 */
    /* JADX WARN: Type inference failed for: r8v302 */
    /* JADX WARN: Type inference failed for: r8v303 */
    /* JADX WARN: Type inference failed for: r8v304 */
    /* JADX WARN: Type inference failed for: r8v305 */
    /* JADX WARN: Type inference failed for: r8v306 */
    /* JADX WARN: Type inference failed for: r8v307 */
    /* JADX WARN: Type inference failed for: r8v308 */
    /* JADX WARN: Type inference failed for: r8v309 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v310 */
    /* JADX WARN: Type inference failed for: r8v311 */
    /* JADX WARN: Type inference failed for: r8v312 */
    /* JADX WARN: Type inference failed for: r8v313 */
    /* JADX WARN: Type inference failed for: r8v314 */
    /* JADX WARN: Type inference failed for: r8v315 */
    /* JADX WARN: Type inference failed for: r8v317 */
    /* JADX WARN: Type inference failed for: r8v318 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v73 */
    /* JADX WARN: Type inference failed for: r8v75 */
    /* JADX WARN: Type inference failed for: r8v76 */
    /* JADX WARN: Type inference failed for: r8v77 */
    /* JADX WARN: Type inference failed for: r8v78 */
    /* JADX WARN: Type inference failed for: r8v79 */
    /* JADX WARN: Type inference failed for: r8v81 */
    /* JADX WARN: Type inference failed for: r8v82 */
    /* JADX WARN: Type inference failed for: r8v89, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v92 */
    /* JADX WARN: Type inference failed for: r8v93 */
    /* JADX WARN: Type inference failed for: r8v94 */
    /* JADX WARN: Type inference failed for: r8v95 */
    /* JADX WARN: Type inference failed for: r8v96 */
    /* JADX WARN: Type inference failed for: r8v97 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 15788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.ui.activity.PayCodeActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$9wXygNTGAmTr9xFxNSAoDSjtsIo(PayCodeActivity payCodeActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = component4 + 87;
        equals = i2 % 128;
        int i3 = i2 % 2;
        payCodeActivity.lambda$addObserver$6(resource);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void m10892$r8$lambda$DhXFEM9uoz8YadB77ZInCj31Q(PayCodeActivity payCodeActivity, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = component4 + 91;
        equals = i2 % 128;
        int i3 = i2 % 2;
        payCodeActivity.lambda$initView$0(str);
        int i4 = component4 + 3;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
    }

    public static void m10893$r8$lambda$J0QjkxYwByhkqWzSGQXvm0UTDU(PayCodeActivity payCodeActivity) {
        int i = 2 % 2;
        int i2 = component4 + 107;
        equals = i2 % 128;
        int i3 = i2 % 2;
        payCodeActivity.retry();
        int i4 = component4 + 51;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$MMADutGsPn2NopJaAcsZacZFyoc(PayCodeActivity payCodeActivity, View view) {
        int i = 2 % 2;
        int i2 = component4 + 71;
        equals = i2 % 128;
        int i3 = i2 % 2;
        m10898instrumented$1$initView$V(payCodeActivity, view);
        int i4 = equals + 11;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$XRPm4DrTNXR4CAHOknsUrjjQkD0(PayCodeActivity payCodeActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = equals + 41;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        payCodeActivity.lambda$addObserver$4(resource);
        int i4 = equals + 85;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static void $r8$lambda$ZUakv801c3WtS336SUQcrpAD5jo(PayCodeActivity payCodeActivity, View view) {
        int i = 2 % 2;
        int i2 = component4 + 75;
        equals = i2 % 128;
        int i3 = i2 % 2;
        m10899instrumented$2$initView$V(payCodeActivity, view);
        int i4 = equals + 59;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$_PFxo02wyxAEE5YLHZxyx9S1_9k(PayCodeActivity payCodeActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = component4 + 65;
        equals = i2 % 128;
        int i3 = i2 % 2;
        payCodeActivity.lambda$addObserver$5(resource);
        int i4 = component4 + 105;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$_r3idRKDuchDneoxWF4Gk8SWEG0(PayCodeActivity payCodeActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 61;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        m10897instrumented$0$setBarCodeBig$LjavalangStringV(payCodeActivity, view);
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
    }

    public static void m10894$r8$lambda$c3HYqk9NyYf6zTXXeMMwZS7_I(PayCodeActivity payCodeActivity, View view) {
        int i = 2 % 2;
        int i2 = component4 + 15;
        equals = i2 % 128;
        int i3 = i2 % 2;
        m10900instrumented$3$initView$V(payCodeActivity, view);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$pXtF6XdIMrCqZHCGze58UXmQCJY(PayCodeActivity payCodeActivity, PaymentQrResp.AuthCodesBean authCodesBean) {
        int i = 2 % 2;
        int i2 = component4 + 7;
        equals = i2 % 128;
        int i3 = i2 % 2;
        payCodeActivity.refreshQrCode(authCodesBean);
        int i4 = component4 + 15;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static Handler m10895$$Nest$fgethandler(PayCodeActivity payCodeActivity) {
        int i = 2 % 2;
        int i2 = component4 + 59;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        Handler handler = payCodeActivity.handler;
        int i5 = i3 + 21;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return handler;
    }

    static long m10896$$Nest$fgetrefreshFreq(PayCodeActivity payCodeActivity) {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 37;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        long j = payCodeActivity.refreshFreq;
        int i5 = i2 + 107;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    private static void m10897instrumented$0$setBarCodeBig$LjavalangStringV(PayCodeActivity payCodeActivity, View view) {
        int i = 2 % 2;
        int i2 = component4 + 101;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                payCodeActivity.lambda$setBarCodeBig$7(view);
                Callback.onClick_exit();
            } else {
                payCodeActivity.lambda$setBarCodeBig$7(view);
                Callback.onClick_exit();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m10898instrumented$1$initView$V(PayCodeActivity payCodeActivity, View view) {
        int i = 2 % 2;
        int i2 = component4 + 13;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                payCodeActivity.lambda$initView$1(view);
                throw null;
            }
            payCodeActivity.lambda$initView$1(view);
            Callback.onClick_exit();
            int i4 = component4 + 65;
            equals = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        } finally {
            Callback.onClick_exit();
        }
    }

    private static void m10899instrumented$2$initView$V(PayCodeActivity payCodeActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 9;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            payCodeActivity.lambda$initView$2(view);
            Callback.onClick_exit();
            int i4 = component4 + 73;
            equals = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m10900instrumented$3$initView$V(PayCodeActivity payCodeActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 97;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                payCodeActivity.lambda$initView$3(view);
                Callback.onClick_exit();
                int i4 = 40 / 0;
            } else {
                payCodeActivity.lambda$initView$3(view);
                Callback.onClick_exit();
            }
            int i5 = component4 + 55;
            equals = i5 % 128;
            int i6 = i5 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = component4 + 93;
        equals = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
        int i4 = component4 + 85;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        getSponsorBeneficiariesState = 1;
        copydefault();
        ShareDataUIState = -3780477796495014671L;
        component2 = 1386857713;
        component1 = (char) 40843;
        int i = ArtificialStackFrames + 89;
        getSponsorBeneficiariesState = i % 128;
        int i2 = i % 2;
    }

    static void copydefault() {
        copydefault = (char) 26425;
        component3 = (char) 37506;
        getRequestBeneficiariesState = (char) 16381;
        copy = (char) 60419;
        getAsAtTimestamp = -890926498;
    }
}
