package com.huawei.digitalpayment.consumer.riskui.ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.core.os.BundleKt;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.color.ColorUtils;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.MPTextWatcher;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.util.ActivityHelperKt;
import com.huawei.digitalpayment.consumer.risk.bean.ProcessVerifyParams;
import com.huawei.digitalpayment.consumer.risk.bean.SendOtpParams;
import com.huawei.digitalpayment.consumer.risk.constant.RiskConstant;
import com.huawei.digitalpayment.consumer.risk.ui.CommonRiskActivity;
import com.huawei.digitalpayment.consumer.risk.vm.RiskViewModel;
import com.huawei.digitalpayment.consumer.riskui.R;
import com.huawei.digitalpayment.consumer.riskui.databinding.ActivityVerifyOtpBinding;
import com.safaricom.mpesa.logging.L;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0016H\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0002J\u0012\u0010\u001f\u001a\u00020\u00162\b\u0010 \u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010!\u001a\u00020\"H\u0014J\b\u0010#\u001a\u00020\u0016H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\tR\u001b\u0010\u000f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0010\u0010\tR\u001b\u0010\u0012\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0013\u0010\t¨\u0006$"}, d2 = {"Lcom/huawei/digitalpayment/consumer/riskui/ui/RiskOtpVerifyActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcPaymentBaseActivity;", "Lcom/huawei/digitalpayment/consumer/riskui/databinding/ActivityVerifyOtpBinding;", "Lcom/huawei/digitalpayment/consumer/risk/vm/RiskViewModel;", "<init>", "()V", KeysConstants.KEY_LOGIN_TYPE, "", "getLoginType", "()Ljava/lang/String;", "loginType$delegate", "Lkotlin/Lazy;", KeysConstants.KEY_OTP_TYPE, "getOtpType", "otpType$delegate", "token", "getToken", "token$delegate", "initiatorMsisdn", "getInitiatorMsisdn", "initiatorMsisdn$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initView", "buildBundle", "params", "Lcom/huawei/digitalpayment/consumer/risk/bean/ProcessVerifyParams;", "initData", "observeData", "initToolbar", "title", "getLayoutId", "", "onBackPressed", "ConsumerRiskUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class RiskOtpVerifyActivity extends Hilt_RiskOtpVerifyActivity<ActivityVerifyOtpBinding, RiskViewModel> {
    private static short[] component2;
    private static final byte[] $$l = {93, TarHeader.LF_LINK, 76, -114};
    private static final int $$o = 34;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {Ascii.VT, -55, -20, -91, Ascii.DLE, 2, -59, 63, -4, 19, -62, TarHeader.LF_CONTIG, 6, -49, TarHeader.LF_CONTIG, 17, -6, Ascii.DC2, 1, -2, -1, -50, TarHeader.LF_CONTIG, 6, 20, -65, 69, 5, -7, 17, -13, Ascii.ETB, -7, 10, 3, -60, 56, Ascii.VT, Ascii.NAK, -72, 72, -9, 6, 6, 10, 3, -60, 69, 5, -7, 17, -13, Ascii.ETB, -7, 10, 3, -60, 72, -9, Ascii.SI, 3, 8, -6, Ascii.SI, -1, 7, Ascii.VT, -71, Ascii.FS, 35, 19, -13, 9, -35, 47, 4, -39, TarHeader.LF_CHR, 4, 7, -29, Ascii.ETB, Ascii.DLE, 8, -12, Ascii.DC2, 5, Ascii.DLE, 5, 13, -17, 5, 5, -1, Ascii.CAN, -5, Ascii.FF, Ascii.DLE, 2, 7, 3, 3, -5, 13, 10, -61, 8, 9, -4, 1, 9, Ascii.SO, -70, 57, Ascii.DLE, 7, 1, 10, 3, -7, 9, -5, Ascii.DC2, -65, 57, 9, -3, 17, 4, -5, Ascii.VT, Ascii.VT, -65, 38, 38, 1, -7, Ascii.NAK, -14, 6, 17, -27, 20, Ascii.DLE, 5, -7, -61, 36, 37, 5, -1, Ascii.CAN, -5, Ascii.FF, -39, 40, 7, 0, Ascii.VT, Ascii.DLE, 2, 7, 3, 3, -5, 13, 10, -62};
    private static final int $$k = 201;
    private static final byte[] $$d = {113, 66, TarHeader.LF_CHR, 67, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -12, Ascii.FF, -19, -15, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 106;
    private static int equals = 0;
    private static int component4 = 1;
    private static int component1 = 728145590;
    private static int copydefault = -238323967;
    private static int ShareDataUIState = 1223169320;
    private static byte[] component3 = {-79, -113, -77, -91, PSSSigner.TRAILER_IMPLICIT, -109, -109, 122, -75, -16, 75, -70, -69, PSSSigner.TRAILER_IMPLICIT, -113, -89, -116, -28, -17, -108, -3, -9, -116, -26, -4, -108, -2, -106, -14, -59, -12, -95, -29, -16, -44, -67, -20, -19, -18, -15, -23, -2, 98, 123, 104, 118, 99, 111, 96, 97, 101, 82, TarHeader.LF_NORMAL, 123, 124, Ascii.SYN, 101, 96, 119, 78, Ascii.US, Ascii.NAK, 17, Ascii.ETB, Ascii.FS, Ascii.RS, 39, Ascii.RS, 74, 105, 19, 19, 33, Ascii.FS, 17, Ascii.DLE, Ascii.ETB, 17, 78, 46, 78, 20, 33, 65, Ascii.NAK, 34, 76, Ascii.DLE, 20, 33, 76, 35, 66, Ascii.SUB, Ascii.DLE, Ascii.NAK, 37, 69, 45, Ascii.DC2, 76, 19, 32, 71, Ascii.CAN, 56, 97, TarHeader.LF_SYMLINK, TarHeader.LF_LINK, TarHeader.LF_CONTIG, Base64.padSymbol, -60, TarHeader.LF_CONTIG, TarHeader.LF_NORMAL, 101, TarHeader.LF_CHR, TarHeader.LF_NORMAL, 59, -39, 111, 9, -63, 98, 58, 10, 58, TarHeader.LF_LINK, TarHeader.LF_BLK, TarHeader.LF_NORMAL, -59, 110, -57, 100, TarHeader.LF_SYMLINK, -50, 110, 9, -51, 100, TarHeader.LF_CHR, -64, 98, 62, -59, 99, TarHeader.LF_LINK, TarHeader.LF_LINK, TarHeader.LF_SYMLINK, TarHeader.LF_FIFO, 62, TarHeader.LF_CHR, -59, TarHeader.LF_LINK, TarHeader.LF_BLK, 110, TarHeader.LF_FIFO, 58, -62, TarHeader.LF_BLK, TarHeader.LF_CHR, 110, TarHeader.LF_SYMLINK, TarHeader.LF_BLK, 63, TarHeader.LF_FIFO, -50, 111, -59, 121, -106, -17, -32, -122, -8, -33, -108, 85, 46, 82, -24, -25, -105, -112, -20, -45, -81, -112, -26, -37, -85, -105, -27, -36, -96, -102, -8, -123, -19, -105, -26, -101, -8, -123, -25, -48, 83, -24, -5, -105, -122, -6, -107, -102, -29, -99, 47, -91, -106, -59, -22, -21, -23, -107, -20, -107, -24, -89, -38, -107, -106, -22, -106, -18, -23, -100, -82, -22, -107, -23, -27, -7, -20, -25, -25, -23, -33, 40, -37, -44, -47, -48, -43, 41, -35, 41, Ascii.DC2, 68, Ascii.NAK, Ascii.GS, Ascii.DLE, 57, Ascii.NAK, 76, 57, 19, 68, 37, Ascii.RS, 65, 39, 68, 39, 66, 32, 17, 89, Ascii.DLE, 32, 65, Ascii.ETB, 19, Ascii.DLE, Ascii.SYN, Ascii.US, 57, 79, 107, 46, 71, 37, Ascii.DLE, 65, Ascii.NAK, Ascii.SYN, Ascii.DLE, 34, Ascii.NAK, 20, 79, 34, 69, 19, 36, 71, Ascii.DLE, Ascii.DLE, 39, 17, 69, 37, 78, 56, 19, 19, 71, 46, 79, 39, 101, 85, -113, 82, 84, 111, 83, -122, 97, 85, -115, 80, 100, 87, -115, 103, -128, 80, 82, 83, 97, -122, 81, 84, 91, 87, 94, 81, 82, 86, 93, -88, 83, 110, -121, 82, 97, -126, 91, 123, -114, 87, 93, 82, 94, 86, 81, 98, 83, 80, -128, 80, 80, -88, 97, 81, -128, 102, -127, 101, 95, -127, 81, Ascii.SYN, 105, 17, 107, Ascii.DLE, Ascii.DC2, 104, Ascii.SYN, Ascii.NAK, Ascii.ETB, Ascii.SI, 0, Ascii.SUB, Ascii.SO, 4, 0, Ascii.CAN, Ascii.SO, Ascii.SUB, 3, -96, -67, -72, -72, -93, -71, -72, -70, -92, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41};
    private static char[] getRequestBeneficiariesState = {2018, 1052, 2022, 2031, 1971, 2027, 2034, 1965, 1049, 1054, 2019, 2032, 1973, 1966, 2029, 1051, 2035, 1970, 1043, 2025, 1968, 1042, 1050, 1974, 2016, 1055, 2021, 2028, 2038, 1053, 2017, 2023, 1048, 2041, 2030, 2003, 2005, 1975, 1977, 2002, 2036, 1992, 1987, 2020, 1976, 1972, 1969, 2026, 2024};
    private static char getAsAtTimestamp = 12829;

    private final Lazy loginType = LazyKt.lazy(new Function0() {
        private static int component3 = 1;
        private static int copydefault;

        @Override
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = copydefault + 105;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            RiskOtpVerifyActivity riskOtpVerifyActivity = this.f$0;
            if (i3 != 0) {
                return RiskOtpVerifyActivity.$r8$lambda$Vfay2kFjrSk8GBoJR0RwaqI0U_U(riskOtpVerifyActivity);
            }
            RiskOtpVerifyActivity.$r8$lambda$Vfay2kFjrSk8GBoJR0RwaqI0U_U(riskOtpVerifyActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    });

    private final Lazy otpType = LazyKt.lazy(new Function0() {
        private static int ShareDataUIState = 1;
        private static int component2;

        @Override
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = component2 + 55;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            String str$r8$lambda$jd6IMJICm1Z3iTdoIbKDaCXNi3M = RiskOtpVerifyActivity.$r8$lambda$jd6IMJICm1Z3iTdoIbKDaCXNi3M();
            int i4 = ShareDataUIState + 43;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return str$r8$lambda$jd6IMJICm1Z3iTdoIbKDaCXNi3M;
        }
    });

    private final Lazy token = LazyKt.lazy(new Function0() {
        private static int component2 = 0;
        private static int component3 = 1;

        @Override
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = component3 + 89;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            RiskOtpVerifyActivity riskOtpVerifyActivity = this.f$0;
            if (i3 == 0) {
                return RiskOtpVerifyActivity.$r8$lambda$cpHsnz94bFNVvwRjrc0GbE7V8iA(riskOtpVerifyActivity);
            }
            RiskOtpVerifyActivity.$r8$lambda$cpHsnz94bFNVvwRjrc0GbE7V8iA(riskOtpVerifyActivity);
            throw null;
        }
    });

    private final Lazy initiatorMsisdn = LazyKt.lazy(new Function0() {
        private static int ShareDataUIState = 1;
        private static int component3;

        @Override
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = component3 + 59;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            String strM10945$r8$lambda$tTe0mzz5z2KAxP6mOwWOiEY4ss = RiskOtpVerifyActivity.m10945$r8$lambda$tTe0mzz5z2KAxP6mOwWOiEY4ss();
            int i4 = ShareDataUIState + 43;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return strM10945$r8$lambda$tTe0mzz5z2KAxP6mOwWOiEY4ss;
            }
            throw null;
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(int r6, byte r7, int r8) {
        /*
            int r6 = r6 + 112
            int r8 = r8 * 4
            int r8 = 3 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.riskui.ui.RiskOtpVerifyActivity.$$l
            int r7 = r7 * 3
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r8 = r8 + 1
            r3 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2b:
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.riskui.ui.RiskOtpVerifyActivity.$$r(int, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r8 = r8 * 2
            int r8 = 103 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.riskui.ui.RiskOtpVerifyActivity.$$d
            int r1 = 28 - r7
            byte[] r1 = new byte[r1]
            int r7 = 27 - r7
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r3 = r3 + r8
            int r6 = r6 + 1
            int r8 = r3 + (-8)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.riskui.ui.RiskOtpVerifyActivity.h(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(int r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 8
            int r6 = 107 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.riskui.ui.RiskOtpVerifyActivity.$$j
            int r1 = 84 - r5
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            int r5 = 83 - r5
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            r4 = r0[r7]
            int r3 = r3 + 1
        L28:
            int r6 = r6 + r4
            int r6 = r6 + (-4)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.riskui.ui.RiskOtpVerifyActivity.i(int, byte, int, java.lang.Object[]):void");
    }

    public static final ViewDataBinding access$getBinding$p(RiskOtpVerifyActivity riskOtpVerifyActivity) {
        int i = 2 % 2;
        int i2 = equals + 17;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = riskOtpVerifyActivity.binding;
        if (i3 == 0) {
            int i4 = 76 / 0;
        }
        int i5 = component4 + 25;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return binding;
        }
        throw null;
    }

    public static final ViewModel access$getViewModel$p(RiskOtpVerifyActivity riskOtpVerifyActivity) {
        int i = 2 % 2;
        int i2 = component4 + 53;
        equals = i2 % 128;
        int i3 = i2 % 2;
        VM vm = riskOtpVerifyActivity.viewModel;
        if (i3 != 0) {
            throw null;
        }
        int i4 = component4 + 35;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return vm;
    }

    private final String getLoginType() {
        String str;
        int i = 2 % 2;
        int i2 = component4 + 107;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            str = (String) this.loginType.getValue();
            int i3 = 89 / 0;
        } else {
            str = (String) this.loginType.getValue();
        }
        int i4 = component4 + 63;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final String loginType_delegate$lambda$0(RiskOtpVerifyActivity riskOtpVerifyActivity) {
        int i = 2 % 2;
        int i2 = component4 + 27;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(riskOtpVerifyActivity, "");
        Intent intent = riskOtpVerifyActivity.getIntent();
        if (intent == null) {
            return "";
        }
        int i4 = equals + 85;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            String stringExtra = intent.getStringExtra(KeysConstants.KEY_LOGIN_TYPE);
            return stringExtra == null ? "" : stringExtra;
        }
        intent.getStringExtra(KeysConstants.KEY_LOGIN_TYPE);
        throw null;
    }

    private final String getOtpType() {
        int i = 2 % 2;
        int i2 = component4 + 65;
        equals = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = (String) this.otpType.getValue();
        int i3 = equals + 99;
        component4 = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    private static final String otpType_delegate$lambda$1() {
        int i = 2 % 2;
        int i2 = component4 + 103;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 45;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return RiskConstant.OTP_TYPE_RISK_OTP;
    }

    private final String getToken() {
        int i = 2 % 2;
        int i2 = equals + 45;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = (String) this.token.getValue();
        int i3 = component4 + 23;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 12 / 0;
        }
        return str;
    }

    private static final String token_delegate$lambda$2(RiskOtpVerifyActivity riskOtpVerifyActivity) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(riskOtpVerifyActivity, "");
        Intent intent = riskOtpVerifyActivity.getIntent();
        if (intent != null) {
            int i2 = component4 + 95;
            equals = i2 % 128;
            int i3 = i2 % 2;
            String stringExtra = intent.getStringExtra("token");
            if (stringExtra != null) {
                return stringExtra;
            }
        }
        int i4 = equals + 43;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return "";
    }

    private final String getInitiatorMsisdn() {
        int i = 2 % 2;
        int i2 = equals + 67;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.initiatorMsisdn.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        String str = (String) value;
        int i4 = component4 + 117;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final String initiatorMsisdn_delegate$lambda$3() {
        int i = 2 % 2;
        int i2 = equals + 65;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            SPUtils.getInstance().getString("recent_login_phone_number");
            throw null;
        }
        String string = SPUtils.getInstance().getString("recent_login_phone_number");
        int i3 = component4 + 123;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 8 / 0;
        }
        return string;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.riskui.ui.RiskOtpVerifyActivity$observeData$1", f = "RiskOtpVerifyActivity.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    static final class component1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        int copydefault;

        /* JADX WARN: Removed duplicated region for block: B:17:0x0042 A[PHI: r1
  0x0042: PHI (r1v8 java.lang.Object) = (r1v4 java.lang.Object), (r1v9 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r3
  0x0024: PHI (r3v1 int) = (r3v0 int), (r3v5 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.riskui.ui.RiskOtpVerifyActivity.component1.component2
                int r1 = r1 + 107
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.riskui.ui.RiskOtpVerifyActivity.component1.ShareDataUIState = r2
                int r1 = r1 % r0
                r2 = 1
                if (r1 == 0) goto L1c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r5.copydefault
                r4 = 80
                int r4 = r4 / 0
                if (r3 == 0) goto L42
                goto L24
            L1c:
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r5.copydefault
                if (r3 == 0) goto L42
            L24:
                if (r3 != r2) goto L3a
                int r1 = com.huawei.digitalpayment.consumer.riskui.ui.RiskOtpVerifyActivity.component1.ShareDataUIState
                int r1 = r1 + 103
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.riskui.ui.RiskOtpVerifyActivity.component1.component2 = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L35
                kotlin.ResultKt.throwOnFailure(r6)
                goto L73
            L35:
                kotlin.ResultKt.throwOnFailure(r6)
                r6 = 0
                throw r6
            L3a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L42:
                kotlin.ResultKt.throwOnFailure(r6)
                com.huawei.digitalpayment.consumer.riskui.ui.RiskOtpVerifyActivity r6 = com.huawei.digitalpayment.consumer.riskui.ui.RiskOtpVerifyActivity.this
                androidx.lifecycle.ViewModel r6 = com.huawei.digitalpayment.consumer.riskui.ui.RiskOtpVerifyActivity.access$getViewModel$p(r6)
                com.huawei.digitalpayment.consumer.risk.vm.RiskViewModel r6 = (com.huawei.digitalpayment.consumer.risk.vm.RiskViewModel) r6
                kotlinx.coroutines.flow.StateFlow r6 = r6.uiState()
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.huawei.digitalpayment.consumer.riskui.ui.RiskOtpVerifyActivity$observeData$1$invokeSuspend$$inlined$map$1 r0 = new com.huawei.digitalpayment.consumer.riskui.ui.RiskOtpVerifyActivity$observeData$1$invokeSuspend$$inlined$map$1
                r0.<init>()
                kotlinx.coroutines.flow.Flow r0 = (kotlinx.coroutines.flow.Flow) r0
                kotlinx.coroutines.flow.Flow r6 = kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(r0)
                com.huawei.digitalpayment.consumer.riskui.ui.RiskOtpVerifyActivity$component1$5 r0 = new com.huawei.digitalpayment.consumer.riskui.ui.RiskOtpVerifyActivity$component1$5
                com.huawei.digitalpayment.consumer.riskui.ui.RiskOtpVerifyActivity r3 = com.huawei.digitalpayment.consumer.riskui.ui.RiskOtpVerifyActivity.this
                r0.<init>()
                kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                r3 = r5
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                r5.copydefault = r2
                java.lang.Object r6 = r6.collect(r0, r3)
                if (r6 != r1) goto L73
                return r1
            L73:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.riskui.ui.RiskOtpVerifyActivity.component1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        component1(Continuation<? super component1> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component1 component1Var = RiskOtpVerifyActivity.this.new component1(continuation);
            int i2 = component2 + 105;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return component1Var;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 3;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objShareDataUIState = ShareDataUIState(coroutineScope, continuation);
            int i4 = ShareDataUIState + 17;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return objShareDataUIState;
            }
            throw null;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 85;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component2 + 15;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01b1 A[PHI: r0
  0x01b1: PHI (r0v9 int) = (r0v8 int), (r0v45 int) binds: [B:39:0x01af, B:36:0x019d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b3 A[PHI: r0
  0x01b3: PHI (r0v42 int) = (r0v8 int), (r0v45 int) binds: [B:39:0x01af, B:36:0x019d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void f(int r24, byte r25, int r26, short r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.riskui.ui.RiskOtpVerifyActivity.f(int, byte, int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(int r32, char[] r33, byte r34, java.lang.Object[] r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 835
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.riskui.ui.RiskOtpVerifyActivity.g(int, char[], byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0140  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2855
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.riskui.ui.RiskOtpVerifyActivity.onCreate(android.os.Bundle):void");
    }

    private static final void initView$lambda$4(RiskOtpVerifyActivity riskOtpVerifyActivity, View view) {
        int i = 2 % 2;
        int i2 = component4 + 105;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(riskOtpVerifyActivity, "");
        riskOtpVerifyActivity.initData();
        int i4 = equals + 39;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void initView() {
        int i = 2 % 2;
        ((ActivityVerifyOtpBinding) this.binding).llTips.setBackgroundColor(ColorUtils.INSTANCE.withAlpha(0.2f, com.blankj.utilcode.util.ColorUtils.getColor(R.color.colorWarningDisable)));
        ((ActivityVerifyOtpBinding) this.binding).codeView.setListener(new View.OnClickListener() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = copydefault + 101;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                RiskOtpVerifyActivity.m10942$r8$lambda$YJpiquHsz0ZTXInp9Lc1Ht6LO4(this.f$0, view);
                int i5 = component3 + 11;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        ((ActivityVerifyOtpBinding) this.binding).codeView.getEditText().addTextChangedListener(new MPTextWatcher() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public void afterTextChanged(Editable s) {
                boolean z;
                int i2 = 2 % 2;
                int i3 = copydefault + 83;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    LoadingButton loadingButton = ((ActivityVerifyOtpBinding) RiskOtpVerifyActivity.access$getBinding$p(RiskOtpVerifyActivity.this)).btnContinue;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                LoadingButton loadingButton2 = ((ActivityVerifyOtpBinding) RiskOtpVerifyActivity.access$getBinding$p(RiskOtpVerifyActivity.this)).btnContinue;
                Editable editable = s;
                if (editable == null) {
                    z = true;
                } else if (editable.length() == 0) {
                    int i4 = component1 + 125;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                    z = true;
                } else {
                    int i6 = copydefault + 75;
                    component1 = i6 % 128;
                    int i7 = i6 % 2;
                    z = false;
                }
                loadingButton2.setEnabled(!z);
                int i8 = copydefault + 89;
                component1 = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 89 / 0;
                }
            }
        });
        ((ActivityVerifyOtpBinding) this.binding).btnContinue.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component2 + 43;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                RiskOtpVerifyActivity.m10944$r8$lambda$qjE3bFig83hO_viWUN2FCbQDiY(this.f$0, view);
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = equals + 1;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 23 / 0;
        }
    }

    private static final void initView$lambda$6(final RiskOtpVerifyActivity riskOtpVerifyActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(riskOtpVerifyActivity, "");
        RouteUtils.routeWithExecute(riskOtpVerifyActivity, RoutePathConstants.COMMON_RISK, riskOtpVerifyActivity.buildBundle(new ProcessVerifyParams(riskOtpVerifyActivity.getLoginType(), ((ActivityVerifyOtpBinding) riskOtpVerifyActivity.binding).codeView.getEditText().getText().toString(), riskOtpVerifyActivity.getOtpType(), null, null, null, null, riskOtpVerifyActivity.getInitiatorMsisdn(), null, riskOtpVerifyActivity.getToken(), 376, null)), ActivityHelperKt.buildLauncher(riskOtpVerifyActivity, new ActivityResultCallback() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public final void onActivityResult(Object obj) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 93;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                RiskOtpVerifyActivity.m10943$r8$lambda$nHCpO8CK2xZBe13Y_cYogUt0VE(this.f$0, (ActivityResult) obj);
                if (i4 != 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }));
        int i2 = equals + 47;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void initView$lambda$6$lambda$5(RiskOtpVerifyActivity riskOtpVerifyActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(riskOtpVerifyActivity, "");
        L l = L.INSTANCE;
        String str = riskOtpVerifyActivity.TAG;
        Intrinsics.checkNotNullExpressionValue(str, "");
        l.d(str, "onConfirmClick risk callback: " + activityResult, new Object[0]);
        if (activityResult.getResultCode() != -1) {
            return;
        }
        riskOtpVerifyActivity.finish();
        int i2 = component4 + 117;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 76 / 0;
        }
    }

    private final Bundle buildBundle(ProcessVerifyParams params) {
        Bundle extras;
        int i = 2 % 2;
        int i2 = equals + 37;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Bundle bundleBundleOf = BundleKt.bundleOf();
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            bundleBundleOf.putAll(extras);
            int i4 = equals + 71;
            component4 = i4 % 128;
            int i5 = i4 % 2;
        }
        bundleBundleOf.putSerializable(KeysConstants.KEY_RISK_PARAMS, params);
        bundleBundleOf.putBoolean(KeysConstants.KEY_HANDLE_ERROR_BY_SELF, true);
        int i6 = component4 + 91;
        equals = i6 % 128;
        if (i6 % 2 == 0) {
            return bundleBundleOf;
        }
        throw null;
    }

    private final void initData() {
        int i = 2 % 2;
        ((RiskViewModel) this.viewModel).sendOtp(new SendOtpParams(getOtpType(), getInitiatorMsisdn()));
        int i2 = equals + 121;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private final void observeData() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new component1(null), 3, null);
        int i2 = equals + 79;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = equals + 125;
        component4 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.initToolbar(getString(R.string.risk_further_authentication));
            obj.hashCode();
            throw null;
        }
        super.initToolbar(getString(R.string.risk_further_authentication));
        int i3 = component4 + 69;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = equals + 55;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_verify_otp;
        int i5 = equals + 11;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = equals + 45;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            super.onBackPressed();
            CommonRiskActivity.INSTANCE.setCallback(null);
            int i3 = equals + 59;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.onBackPressed();
        CommonRiskActivity.INSTANCE.setCallback(null);
        throw null;
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = equals + 115;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            getBaseContext();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i3 = equals + 47;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952718_res_0x7f13044e).substring(6, 7).length() + 626136689, (byte) ExpandableListView.getPackedPositionGroup(0L), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1188863555, (short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 25), Color.blue(0) - 14, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 626136604, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(27) - 108), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1188863557, (short) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 77), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952826_res_0x7f1304ba).substring(7, 8).length() - 23, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i5 = equals + 65;
            component4 = i5 % 128;
            int i6 = i5 % 2;
        }
        if (baseContext != null) {
            baseContext = (!((baseContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getTapTimeout() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 42, (char) TextUtils.getTrimmedLength(""), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - TextUtils.indexOf("", "", 0, 0), Color.green(0) + 56, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), -699576857, false, "component2", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x018f  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.riskui.ui.RiskOtpVerifyActivity.onPause():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0a66 A[Catch: all -> 0x05d9, TryCatch #33 {all -> 0x05d9, blocks: (B:118:0x0a60, B:120:0x0a66, B:121:0x0a8f, B:264:0x1245, B:266:0x124b, B:267:0x1274, B:426:0x1ab9, B:428:0x1abf, B:429:0x1aed, B:780:0x3704, B:782:0x370a, B:783:0x373a, B:817:0x3a52, B:819:0x3a58, B:820:0x3a79, B:797:0x3886, B:799:0x38a9, B:800:0x38fd, B:740:0x3365, B:742:0x336b, B:743:0x3393, B:634:0x2c5d, B:636:0x2c63, B:637:0x2c8a, B:639:0x2cc4, B:640:0x2d0d, B:604:0x28fd, B:606:0x2912, B:607:0x2943, B:609:0x2977, B:610:0x29f6, B:582:0x2586, B:584:0x258c, B:585:0x25b7, B:587:0x25f1, B:588:0x2638, B:555:0x22d5, B:557:0x22ea, B:558:0x231b, B:539:0x20c2, B:541:0x20c8, B:542:0x20ec, B:310:0x14b0, B:312:0x14b6, B:313:0x14e1, B:19:0x0269, B:21:0x026f, B:22:0x0296, B:24:0x0549, B:26:0x057b, B:27:0x05d3, B:643:0x2e20, B:645:0x2e26, B:646:0x2e6e, B:648:0x2e95, B:649:0x2edf, B:651:0x2ef2, B:653:0x2efb, B:654:0x2f40, B:692:0x31a8, B:693:0x31ac, B:695:0x31b2, B:698:0x31ca, B:701:0x31d7, B:703:0x31da, B:715:0x32bc, B:717:0x32c2, B:718:0x32c3, B:720:0x32c5, B:722:0x32cc, B:723:0x32cd, B:660:0x2f5b, B:665:0x2f6b, B:663:0x2f62, B:667:0x2f72, B:668:0x2f75, B:670:0x2f78, B:682:0x308e, B:684:0x3094, B:685:0x30d5, B:687:0x30ff, B:688:0x3147, B:690:0x315d, B:691:0x31a2, B:725:0x32cf, B:727:0x32d6, B:728:0x32d7, B:730:0x32d9, B:732:0x32e0, B:733:0x32e1, B:272:0x12fb, B:275:0x1309, B:296:0x13f4, B:298:0x13fa, B:299:0x13fb, B:301:0x13fd, B:303:0x1404, B:304:0x1405, B:279:0x1315), top: B:907:0x0269, inners: #40, #60 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0b16  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0b62 A[Catch: all -> 0x1164, PHI: r1
  0x0b62: PHI (r1v620 java.lang.Object) = (r1v619 java.lang.Object), (r1v667 java.lang.Object) binds: [B:126:0x0b14, B:128:0x0b17] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #41 {all -> 0x1164, blocks: (B:125:0x0b10, B:132:0x0b62), top: B:920:0x0b10 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0b89  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0bdf  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0bf7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0c60  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x1015 A[Catch: all -> 0x113c, TryCatch #13 {all -> 0x113c, blocks: (B:203:0x1007, B:204:0x100b, B:207:0x1015, B:210:0x102f, B:213:0x103b, B:215:0x103e, B:227:0x112a, B:229:0x1130, B:230:0x1131, B:232:0x1133, B:234:0x113a, B:235:0x113b, B:248:0x1152, B:250:0x1158, B:251:0x1159, B:197:0x0f88, B:199:0x0fa3, B:201:0x0fba, B:202:0x1001, B:242:0x1146, B:244:0x114c, B:245:0x114d, B:223:0x10aa, B:218:0x106b, B:220:0x1071, B:221:0x10a2), top: B:869:0x0bf5, inners: #2, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x124b A[Catch: all -> 0x05d9, TryCatch #33 {all -> 0x05d9, blocks: (B:118:0x0a60, B:120:0x0a66, B:121:0x0a8f, B:264:0x1245, B:266:0x124b, B:267:0x1274, B:426:0x1ab9, B:428:0x1abf, B:429:0x1aed, B:780:0x3704, B:782:0x370a, B:783:0x373a, B:817:0x3a52, B:819:0x3a58, B:820:0x3a79, B:797:0x3886, B:799:0x38a9, B:800:0x38fd, B:740:0x3365, B:742:0x336b, B:743:0x3393, B:634:0x2c5d, B:636:0x2c63, B:637:0x2c8a, B:639:0x2cc4, B:640:0x2d0d, B:604:0x28fd, B:606:0x2912, B:607:0x2943, B:609:0x2977, B:610:0x29f6, B:582:0x2586, B:584:0x258c, B:585:0x25b7, B:587:0x25f1, B:588:0x2638, B:555:0x22d5, B:557:0x22ea, B:558:0x231b, B:539:0x20c2, B:541:0x20c8, B:542:0x20ec, B:310:0x14b0, B:312:0x14b6, B:313:0x14e1, B:19:0x0269, B:21:0x026f, B:22:0x0296, B:24:0x0549, B:26:0x057b, B:27:0x05d3, B:643:0x2e20, B:645:0x2e26, B:646:0x2e6e, B:648:0x2e95, B:649:0x2edf, B:651:0x2ef2, B:653:0x2efb, B:654:0x2f40, B:692:0x31a8, B:693:0x31ac, B:695:0x31b2, B:698:0x31ca, B:701:0x31d7, B:703:0x31da, B:715:0x32bc, B:717:0x32c2, B:718:0x32c3, B:720:0x32c5, B:722:0x32cc, B:723:0x32cd, B:660:0x2f5b, B:665:0x2f6b, B:663:0x2f62, B:667:0x2f72, B:668:0x2f75, B:670:0x2f78, B:682:0x308e, B:684:0x3094, B:685:0x30d5, B:687:0x30ff, B:688:0x3147, B:690:0x315d, B:691:0x31a2, B:725:0x32cf, B:727:0x32d6, B:728:0x32d7, B:730:0x32d9, B:732:0x32e0, B:733:0x32e1, B:272:0x12fb, B:275:0x1309, B:296:0x13f4, B:298:0x13fa, B:299:0x13fb, B:301:0x13fd, B:303:0x1404, B:304:0x1405, B:279:0x1315), top: B:907:0x0269, inners: #40, #60 }] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x131e  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x1335 A[Catch: all -> 0x13fc, TryCatch #45 {all -> 0x13fc, blocks: (B:285:0x1320, B:287:0x1335, B:288:0x1363), top: B:927:0x1320, outer: #60 }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x1376 A[Catch: all -> 0x13f2, TryCatch #44 {all -> 0x13f2, blocks: (B:289:0x1369, B:291:0x1376, B:292:0x13ea), top: B:925:0x1369, outer: #60 }] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x156c  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x15bd A[Catch: all -> 0x19b3, PHI: r2 r9
  0x15bd: PHI (r2v590 java.lang.Object) = (r2v589 java.lang.Object), (r2v663 java.lang.Object) binds: [B:318:0x156a, B:320:0x156d] A[DONT_GENERATE, DONT_INLINE]
  0x15bd: PHI (r9v65 ??) = (r9v209 ??), (r9v210 ??) binds: [B:318:0x156a, B:320:0x156d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x19b3, blocks: (B:317:0x1566, B:324:0x15bd, B:333:0x1622, B:351:0x172f, B:354:0x1779), top: B:860:0x1566 }] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x15ca  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x1622 A[Catch: all -> 0x19b3, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x19b3, blocks: (B:317:0x1566, B:324:0x15bd, B:333:0x1622, B:351:0x172f, B:354:0x1779), top: B:860:0x1566 }] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x1860 A[Catch: all -> 0x1991, TryCatch #55 {all -> 0x1991, blocks: (B:367:0x1851, B:368:0x1855, B:371:0x1860, B:374:0x187b, B:356:0x1788, B:362:0x17ed, B:366:0x1849), top: B:947:0x1788 }] */
    /* JADX WARN: Removed duplicated region for block: B:428:0x1abf A[Catch: all -> 0x05d9, TryCatch #33 {all -> 0x05d9, blocks: (B:118:0x0a60, B:120:0x0a66, B:121:0x0a8f, B:264:0x1245, B:266:0x124b, B:267:0x1274, B:426:0x1ab9, B:428:0x1abf, B:429:0x1aed, B:780:0x3704, B:782:0x370a, B:783:0x373a, B:817:0x3a52, B:819:0x3a58, B:820:0x3a79, B:797:0x3886, B:799:0x38a9, B:800:0x38fd, B:740:0x3365, B:742:0x336b, B:743:0x3393, B:634:0x2c5d, B:636:0x2c63, B:637:0x2c8a, B:639:0x2cc4, B:640:0x2d0d, B:604:0x28fd, B:606:0x2912, B:607:0x2943, B:609:0x2977, B:610:0x29f6, B:582:0x2586, B:584:0x258c, B:585:0x25b7, B:587:0x25f1, B:588:0x2638, B:555:0x22d5, B:557:0x22ea, B:558:0x231b, B:539:0x20c2, B:541:0x20c8, B:542:0x20ec, B:310:0x14b0, B:312:0x14b6, B:313:0x14e1, B:19:0x0269, B:21:0x026f, B:22:0x0296, B:24:0x0549, B:26:0x057b, B:27:0x05d3, B:643:0x2e20, B:645:0x2e26, B:646:0x2e6e, B:648:0x2e95, B:649:0x2edf, B:651:0x2ef2, B:653:0x2efb, B:654:0x2f40, B:692:0x31a8, B:693:0x31ac, B:695:0x31b2, B:698:0x31ca, B:701:0x31d7, B:703:0x31da, B:715:0x32bc, B:717:0x32c2, B:718:0x32c3, B:720:0x32c5, B:722:0x32cc, B:723:0x32cd, B:660:0x2f5b, B:665:0x2f6b, B:663:0x2f62, B:667:0x2f72, B:668:0x2f75, B:670:0x2f78, B:682:0x308e, B:684:0x3094, B:685:0x30d5, B:687:0x30ff, B:688:0x3147, B:690:0x315d, B:691:0x31a2, B:725:0x32cf, B:727:0x32d6, B:728:0x32d7, B:730:0x32d9, B:732:0x32e0, B:733:0x32e1, B:272:0x12fb, B:275:0x1309, B:296:0x13f4, B:298:0x13fa, B:299:0x13fb, B:301:0x13fd, B:303:0x1404, B:304:0x1405, B:279:0x1315), top: B:907:0x0269, inners: #40, #60 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x1bcd  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x1bdc  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x1c3e A[Catch: all -> 0x1fc3, TRY_ENTER, TRY_LEAVE, TryCatch #19 {all -> 0x1fc3, blocks: (B:444:0x1bcf, B:485:0x1e78, B:486:0x1e7c, B:488:0x1e82, B:491:0x1e9c, B:453:0x1c3e, B:472:0x1d55, B:476:0x1da2, B:481:0x1e16, B:484:0x1e70), top: B:880:0x1bcf }] */
    /* JADX WARN: Removed duplicated region for block: B:488:0x1e82 A[Catch: all -> 0x1fc3, TryCatch #19 {all -> 0x1fc3, blocks: (B:444:0x1bcf, B:485:0x1e78, B:486:0x1e7c, B:488:0x1e82, B:491:0x1e9c, B:453:0x1c3e, B:472:0x1d55, B:476:0x1da2, B:481:0x1e16, B:484:0x1e70), top: B:880:0x1bcf }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x069c A[Catch: all -> 0x096b, TRY_ENTER, TRY_LEAVE, TryCatch #43 {all -> 0x096b, blocks: (B:32:0x05e4, B:39:0x0632, B:49:0x069c, B:59:0x0724, B:63:0x076e), top: B:923:0x05e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:541:0x20c8 A[Catch: all -> 0x05d9, TryCatch #33 {all -> 0x05d9, blocks: (B:118:0x0a60, B:120:0x0a66, B:121:0x0a8f, B:264:0x1245, B:266:0x124b, B:267:0x1274, B:426:0x1ab9, B:428:0x1abf, B:429:0x1aed, B:780:0x3704, B:782:0x370a, B:783:0x373a, B:817:0x3a52, B:819:0x3a58, B:820:0x3a79, B:797:0x3886, B:799:0x38a9, B:800:0x38fd, B:740:0x3365, B:742:0x336b, B:743:0x3393, B:634:0x2c5d, B:636:0x2c63, B:637:0x2c8a, B:639:0x2cc4, B:640:0x2d0d, B:604:0x28fd, B:606:0x2912, B:607:0x2943, B:609:0x2977, B:610:0x29f6, B:582:0x2586, B:584:0x258c, B:585:0x25b7, B:587:0x25f1, B:588:0x2638, B:555:0x22d5, B:557:0x22ea, B:558:0x231b, B:539:0x20c2, B:541:0x20c8, B:542:0x20ec, B:310:0x14b0, B:312:0x14b6, B:313:0x14e1, B:19:0x0269, B:21:0x026f, B:22:0x0296, B:24:0x0549, B:26:0x057b, B:27:0x05d3, B:643:0x2e20, B:645:0x2e26, B:646:0x2e6e, B:648:0x2e95, B:649:0x2edf, B:651:0x2ef2, B:653:0x2efb, B:654:0x2f40, B:692:0x31a8, B:693:0x31ac, B:695:0x31b2, B:698:0x31ca, B:701:0x31d7, B:703:0x31da, B:715:0x32bc, B:717:0x32c2, B:718:0x32c3, B:720:0x32c5, B:722:0x32cc, B:723:0x32cd, B:660:0x2f5b, B:665:0x2f6b, B:663:0x2f62, B:667:0x2f72, B:668:0x2f75, B:670:0x2f78, B:682:0x308e, B:684:0x3094, B:685:0x30d5, B:687:0x30ff, B:688:0x3147, B:690:0x315d, B:691:0x31a2, B:725:0x32cf, B:727:0x32d6, B:728:0x32d7, B:730:0x32d9, B:732:0x32e0, B:733:0x32e1, B:272:0x12fb, B:275:0x1309, B:296:0x13f4, B:298:0x13fa, B:299:0x13fb, B:301:0x13fd, B:303:0x1404, B:304:0x1405, B:279:0x1315), top: B:907:0x0269, inners: #40, #60 }] */
    /* JADX WARN: Removed duplicated region for block: B:547:0x217c  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x21cd  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x22b5  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x2459  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x253a  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x2751  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x27bc  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x280f  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x28dd  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x2b38  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x2c13  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x2e26 A[Catch: all -> 0x32e2, TryCatch #40 {all -> 0x32e2, blocks: (B:643:0x2e20, B:645:0x2e26, B:646:0x2e6e, B:648:0x2e95, B:649:0x2edf, B:651:0x2ef2, B:653:0x2efb, B:654:0x2f40, B:692:0x31a8, B:693:0x31ac, B:695:0x31b2, B:698:0x31ca, B:701:0x31d7, B:703:0x31da, B:715:0x32bc, B:717:0x32c2, B:718:0x32c3, B:720:0x32c5, B:722:0x32cc, B:723:0x32cd, B:660:0x2f5b, B:665:0x2f6b, B:663:0x2f62, B:667:0x2f72, B:668:0x2f75, B:670:0x2f78, B:682:0x308e, B:684:0x3094, B:685:0x30d5, B:687:0x30ff, B:688:0x3147, B:690:0x315d, B:691:0x31a2, B:725:0x32cf, B:727:0x32d6, B:728:0x32d7, B:730:0x32d9, B:732:0x32e0, B:733:0x32e1, B:711:0x3240, B:706:0x3206, B:708:0x320c, B:709:0x3238, B:677:0x2fe9, B:679:0x3008, B:680:0x3082, B:672:0x2f98, B:674:0x2fad, B:675:0x2fe2), top: B:919:0x2e20, outer: #33, inners: #12, #21, #27, #31 }] */
    /* JADX WARN: Removed duplicated region for block: B:648:0x2e95 A[Catch: all -> 0x32e2, TryCatch #40 {all -> 0x32e2, blocks: (B:643:0x2e20, B:645:0x2e26, B:646:0x2e6e, B:648:0x2e95, B:649:0x2edf, B:651:0x2ef2, B:653:0x2efb, B:654:0x2f40, B:692:0x31a8, B:693:0x31ac, B:695:0x31b2, B:698:0x31ca, B:701:0x31d7, B:703:0x31da, B:715:0x32bc, B:717:0x32c2, B:718:0x32c3, B:720:0x32c5, B:722:0x32cc, B:723:0x32cd, B:660:0x2f5b, B:665:0x2f6b, B:663:0x2f62, B:667:0x2f72, B:668:0x2f75, B:670:0x2f78, B:682:0x308e, B:684:0x3094, B:685:0x30d5, B:687:0x30ff, B:688:0x3147, B:690:0x315d, B:691:0x31a2, B:725:0x32cf, B:727:0x32d6, B:728:0x32d7, B:730:0x32d9, B:732:0x32e0, B:733:0x32e1, B:711:0x3240, B:706:0x3206, B:708:0x320c, B:709:0x3238, B:677:0x2fe9, B:679:0x3008, B:680:0x3082, B:672:0x2f98, B:674:0x2fad, B:675:0x2fe2), top: B:919:0x2e20, outer: #33, inners: #12, #21, #27, #31 }] */
    /* JADX WARN: Removed duplicated region for block: B:651:0x2ef2 A[Catch: all -> 0x32e2, TryCatch #40 {all -> 0x32e2, blocks: (B:643:0x2e20, B:645:0x2e26, B:646:0x2e6e, B:648:0x2e95, B:649:0x2edf, B:651:0x2ef2, B:653:0x2efb, B:654:0x2f40, B:692:0x31a8, B:693:0x31ac, B:695:0x31b2, B:698:0x31ca, B:701:0x31d7, B:703:0x31da, B:715:0x32bc, B:717:0x32c2, B:718:0x32c3, B:720:0x32c5, B:722:0x32cc, B:723:0x32cd, B:660:0x2f5b, B:665:0x2f6b, B:663:0x2f62, B:667:0x2f72, B:668:0x2f75, B:670:0x2f78, B:682:0x308e, B:684:0x3094, B:685:0x30d5, B:687:0x30ff, B:688:0x3147, B:690:0x315d, B:691:0x31a2, B:725:0x32cf, B:727:0x32d6, B:728:0x32d7, B:730:0x32d9, B:732:0x32e0, B:733:0x32e1, B:711:0x3240, B:706:0x3206, B:708:0x320c, B:709:0x3238, B:677:0x2fe9, B:679:0x3008, B:680:0x3082, B:672:0x2f98, B:674:0x2fad, B:675:0x2fe2), top: B:919:0x2e20, outer: #33, inners: #12, #21, #27, #31 }] */
    /* JADX WARN: Removed duplicated region for block: B:656:0x2f4b  */
    /* JADX WARN: Removed duplicated region for block: B:695:0x31b2 A[Catch: all -> 0x32e2, TryCatch #40 {all -> 0x32e2, blocks: (B:643:0x2e20, B:645:0x2e26, B:646:0x2e6e, B:648:0x2e95, B:649:0x2edf, B:651:0x2ef2, B:653:0x2efb, B:654:0x2f40, B:692:0x31a8, B:693:0x31ac, B:695:0x31b2, B:698:0x31ca, B:701:0x31d7, B:703:0x31da, B:715:0x32bc, B:717:0x32c2, B:718:0x32c3, B:720:0x32c5, B:722:0x32cc, B:723:0x32cd, B:660:0x2f5b, B:665:0x2f6b, B:663:0x2f62, B:667:0x2f72, B:668:0x2f75, B:670:0x2f78, B:682:0x308e, B:684:0x3094, B:685:0x30d5, B:687:0x30ff, B:688:0x3147, B:690:0x315d, B:691:0x31a2, B:725:0x32cf, B:727:0x32d6, B:728:0x32d7, B:730:0x32d9, B:732:0x32e0, B:733:0x32e1, B:711:0x3240, B:706:0x3206, B:708:0x320c, B:709:0x3238, B:677:0x2fe9, B:679:0x3008, B:680:0x3082, B:672:0x2f98, B:674:0x2fad, B:675:0x2fe2), top: B:919:0x2e20, outer: #33, inners: #12, #21, #27, #31 }] */
    /* JADX WARN: Removed duplicated region for block: B:748:0x341c  */
    /* JADX WARN: Removed duplicated region for block: B:751:0x346d  */
    /* JADX WARN: Removed duplicated region for block: B:762:0x3531  */
    /* JADX WARN: Removed duplicated region for block: B:779:0x36e4  */
    /* JADX WARN: Removed duplicated region for block: B:788:0x37c1  */
    /* JADX WARN: Removed duplicated region for block: B:791:0x3814  */
    /* JADX WARN: Removed duplicated region for block: B:796:0x3868  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:816:0x3a34  */
    /* JADX WARN: Removed duplicated region for block: B:891:0x1b75 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:957:0x12fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:985:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v172 */
    /* JADX WARN: Type inference failed for: r10v69, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v70, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v88 */
    /* JADX WARN: Type inference failed for: r11v182 */
    /* JADX WARN: Type inference failed for: r11v183, types: [long] */
    /* JADX WARN: Type inference failed for: r11v184 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v200 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v210 */
    /* JADX WARN: Type inference failed for: r11v211 */
    /* JADX WARN: Type inference failed for: r11v212 */
    /* JADX WARN: Type inference failed for: r11v213 */
    /* JADX WARN: Type inference failed for: r11v218 */
    /* JADX WARN: Type inference failed for: r11v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v223 */
    /* JADX WARN: Type inference failed for: r11v224 */
    /* JADX WARN: Type inference failed for: r11v225 */
    /* JADX WARN: Type inference failed for: r11v226 */
    /* JADX WARN: Type inference failed for: r12v100, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v256 */
    /* JADX WARN: Type inference failed for: r12v257 */
    /* JADX WARN: Type inference failed for: r12v258 */
    /* JADX WARN: Type inference failed for: r12v265, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v269 */
    /* JADX WARN: Type inference failed for: r12v270 */
    /* JADX WARN: Type inference failed for: r12v271 */
    /* JADX WARN: Type inference failed for: r12v273 */
    /* JADX WARN: Type inference failed for: r12v274 */
    /* JADX WARN: Type inference failed for: r12v275 */
    /* JADX WARN: Type inference failed for: r12v276 */
    /* JADX WARN: Type inference failed for: r12v277 */
    /* JADX WARN: Type inference failed for: r12v278 */
    /* JADX WARN: Type inference failed for: r12v279 */
    /* JADX WARN: Type inference failed for: r12v280 */
    /* JADX WARN: Type inference failed for: r12v281 */
    /* JADX WARN: Type inference failed for: r12v92 */
    /* JADX WARN: Type inference failed for: r12v97 */
    /* JADX WARN: Type inference failed for: r12v98 */
    /* JADX WARN: Type inference failed for: r12v99 */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v45 */
    /* JADX WARN: Type inference failed for: r14v46 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r28v10 */
    /* JADX WARN: Type inference failed for: r28v11 */
    /* JADX WARN: Type inference failed for: r28v20 */
    /* JADX WARN: Type inference failed for: r28v21 */
    /* JADX WARN: Type inference failed for: r28v22 */
    /* JADX WARN: Type inference failed for: r28v23 */
    /* JADX WARN: Type inference failed for: r28v24 */
    /* JADX WARN: Type inference failed for: r28v25 */
    /* JADX WARN: Type inference failed for: r28v29 */
    /* JADX WARN: Type inference failed for: r28v30 */
    /* JADX WARN: Type inference failed for: r28v31 */
    /* JADX WARN: Type inference failed for: r28v32 */
    /* JADX WARN: Type inference failed for: r28v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r28v34 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r28v42 */
    /* JADX WARN: Type inference failed for: r28v43 */
    /* JADX WARN: Type inference failed for: r28v44 */
    /* JADX WARN: Type inference failed for: r28v47 */
    /* JADX WARN: Type inference failed for: r28v48 */
    /* JADX WARN: Type inference failed for: r28v49 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r28v50 */
    /* JADX WARN: Type inference failed for: r28v51 */
    /* JADX WARN: Type inference failed for: r28v52 */
    /* JADX WARN: Type inference failed for: r28v53 */
    /* JADX WARN: Type inference failed for: r28v54 */
    /* JADX WARN: Type inference failed for: r28v55 */
    /* JADX WARN: Type inference failed for: r28v58 */
    /* JADX WARN: Type inference failed for: r28v6 */
    /* JADX WARN: Type inference failed for: r28v60, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r28v61 */
    /* JADX WARN: Type inference failed for: r28v62 */
    /* JADX WARN: Type inference failed for: r28v63 */
    /* JADX WARN: Type inference failed for: r28v64 */
    /* JADX WARN: Type inference failed for: r28v68 */
    /* JADX WARN: Type inference failed for: r28v69 */
    /* JADX WARN: Type inference failed for: r28v7 */
    /* JADX WARN: Type inference failed for: r28v70 */
    /* JADX WARN: Type inference failed for: r28v71 */
    /* JADX WARN: Type inference failed for: r28v72 */
    /* JADX WARN: Type inference failed for: r28v73 */
    /* JADX WARN: Type inference failed for: r28v74 */
    /* JADX WARN: Type inference failed for: r28v75 */
    /* JADX WARN: Type inference failed for: r28v76 */
    /* JADX WARN: Type inference failed for: r28v77 */
    /* JADX WARN: Type inference failed for: r28v78 */
    /* JADX WARN: Type inference failed for: r28v79 */
    /* JADX WARN: Type inference failed for: r28v8 */
    /* JADX WARN: Type inference failed for: r28v80 */
    /* JADX WARN: Type inference failed for: r28v81 */
    /* JADX WARN: Type inference failed for: r28v82 */
    /* JADX WARN: Type inference failed for: r28v83 */
    /* JADX WARN: Type inference failed for: r28v84 */
    /* JADX WARN: Type inference failed for: r28v85 */
    /* JADX WARN: Type inference failed for: r28v9 */
    /* JADX WARN: Type inference failed for: r32v10 */
    /* JADX WARN: Type inference failed for: r32v21 */
    /* JADX WARN: Type inference failed for: r32v9 */
    /* JADX WARN: Type inference failed for: r39v0 */
    /* JADX WARN: Type inference failed for: r39v1 */
    /* JADX WARN: Type inference failed for: r39v2 */
    /* JADX WARN: Type inference failed for: r39v29 */
    /* JADX WARN: Type inference failed for: r39v30 */
    /* JADX WARN: Type inference failed for: r39v32 */
    /* JADX WARN: Type inference failed for: r39v33 */
    /* JADX WARN: Type inference failed for: r39v34 */
    /* JADX WARN: Type inference failed for: r39v35 */
    /* JADX WARN: Type inference failed for: r39v36 */
    /* JADX WARN: Type inference failed for: r39v37 */
    /* JADX WARN: Type inference failed for: r39v38 */
    /* JADX WARN: Type inference failed for: r39v39 */
    /* JADX WARN: Type inference failed for: r39v40 */
    /* JADX WARN: Type inference failed for: r39v41 */
    /* JADX WARN: Type inference failed for: r39v42 */
    /* JADX WARN: Type inference failed for: r39v43 */
    /* JADX WARN: Type inference failed for: r39v44 */
    /* JADX WARN: Type inference failed for: r39v45 */
    /* JADX WARN: Type inference failed for: r39v46 */
    /* JADX WARN: Type inference failed for: r39v47 */
    /* JADX WARN: Type inference failed for: r39v48 */
    /* JADX WARN: Type inference failed for: r39v49 */
    /* JADX WARN: Type inference failed for: r3v441 */
    /* JADX WARN: Type inference failed for: r3v442, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v443 */
    /* JADX WARN: Type inference failed for: r3v444, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v445 */
    /* JADX WARN: Type inference failed for: r3v446 */
    /* JADX WARN: Type inference failed for: r3v459 */
    /* JADX WARN: Type inference failed for: r3v460 */
    /* JADX WARN: Type inference failed for: r3v709 */
    /* JADX WARN: Type inference failed for: r3v710 */
    /* JADX WARN: Type inference failed for: r4v104 */
    /* JADX WARN: Type inference failed for: r4v311 */
    /* JADX WARN: Type inference failed for: r4v381 */
    /* JADX WARN: Type inference failed for: r4v46, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v63, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v68 */
    /* JADX WARN: Type inference failed for: r9v124, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v125 */
    /* JADX WARN: Type inference failed for: r9v126 */
    /* JADX WARN: Type inference failed for: r9v129 */
    /* JADX WARN: Type inference failed for: r9v140 */
    /* JADX WARN: Type inference failed for: r9v141 */
    /* JADX WARN: Type inference failed for: r9v147, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v151 */
    /* JADX WARN: Type inference failed for: r9v197 */
    /* JADX WARN: Type inference failed for: r9v198 */
    /* JADX WARN: Type inference failed for: r9v199 */
    /* JADX WARN: Type inference failed for: r9v200 */
    /* JADX WARN: Type inference failed for: r9v201 */
    /* JADX WARN: Type inference failed for: r9v202 */
    /* JADX WARN: Type inference failed for: r9v203 */
    /* JADX WARN: Type inference failed for: r9v204 */
    /* JADX WARN: Type inference failed for: r9v205 */
    /* JADX WARN: Type inference failed for: r9v206 */
    /* JADX WARN: Type inference failed for: r9v207 */
    /* JADX WARN: Type inference failed for: r9v208 */
    /* JADX WARN: Type inference failed for: r9v209 */
    /* JADX WARN: Type inference failed for: r9v210 */
    /* JADX WARN: Type inference failed for: r9v211 */
    /* JADX WARN: Type inference failed for: r9v214 */
    /* JADX WARN: Type inference failed for: r9v215 */
    /* JADX WARN: Type inference failed for: r9v216 */
    /* JADX WARN: Type inference failed for: r9v217 */
    /* JADX WARN: Type inference failed for: r9v218 */
    /* JADX WARN: Type inference failed for: r9v219 */
    /* JADX WARN: Type inference failed for: r9v220 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v50 */
    /* JADX WARN: Type inference failed for: r9v51 */
    /* JADX WARN: Type inference failed for: r9v52, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v64 */
    /* JADX WARN: Type inference failed for: r9v65 */
    /* JADX WARN: Type inference failed for: r9v66 */
    /* JADX WARN: Type inference failed for: r9v67 */
    /* JADX WARN: Type inference failed for: r9v68 */
    /* JADX WARN: Type inference failed for: r9v70 */
    /* JADX WARN: Type inference failed for: r9v71 */
    /* JADX WARN: Type inference failed for: r9v79, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v81 */
    /* JADX WARN: Type inference failed for: r9v82 */
    /* JADX WARN: Type inference failed for: r9v83 */
    /* JADX WARN: Type inference failed for: r9v84 */
    /* JADX WARN: Type inference failed for: r9v85 */
    /* JADX WARN: Type inference failed for: r9v87 */
    /* JADX WARN: Type inference failed for: r9v88 */
    /* JADX WARN: Type inference failed for: r9v96 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 15386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.riskui.ui.RiskOtpVerifyActivity.attachBaseContext(android.content.Context):void");
    }

    public static String $r8$lambda$Vfay2kFjrSk8GBoJR0RwaqI0U_U(RiskOtpVerifyActivity riskOtpVerifyActivity) {
        int i = 2 % 2;
        int i2 = component4 + 111;
        equals = i2 % 128;
        int i3 = i2 % 2;
        String strLoginType_delegate$lambda$0 = loginType_delegate$lambda$0(riskOtpVerifyActivity);
        int i4 = equals + 89;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            return strLoginType_delegate$lambda$0;
        }
        throw null;
    }

    public static void m10942$r8$lambda$YJpiquHsz0ZTXInp9Lc1Ht6LO4(RiskOtpVerifyActivity riskOtpVerifyActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 71;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        m10946instrumented$0$initView$V(riskOtpVerifyActivity, view);
        int i4 = component4 + 81;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static String $r8$lambda$cpHsnz94bFNVvwRjrc0GbE7V8iA(RiskOtpVerifyActivity riskOtpVerifyActivity) {
        int i = 2 % 2;
        int i2 = component4 + 111;
        equals = i2 % 128;
        int i3 = i2 % 2;
        String str = token_delegate$lambda$2(riskOtpVerifyActivity);
        int i4 = equals + 49;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static String $r8$lambda$jd6IMJICm1Z3iTdoIbKDaCXNi3M() {
        int i = 2 % 2;
        int i2 = equals + 53;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            otpType_delegate$lambda$1();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strOtpType_delegate$lambda$1 = otpType_delegate$lambda$1();
        int i3 = component4 + 71;
        equals = i3 % 128;
        int i4 = i3 % 2;
        return strOtpType_delegate$lambda$1;
    }

    public static void m10943$r8$lambda$nHCpO8CK2xZBe13Y_cYogUt0VE(RiskOtpVerifyActivity riskOtpVerifyActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = equals + 3;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        initView$lambda$6$lambda$5(riskOtpVerifyActivity, activityResult);
        int i4 = equals + 93;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
    }

    public static void m10944$r8$lambda$qjE3bFig83hO_viWUN2FCbQDiY(RiskOtpVerifyActivity riskOtpVerifyActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 25;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        m10947instrumented$1$initView$V(riskOtpVerifyActivity, view);
        int i4 = component4 + 125;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public static String m10945$r8$lambda$tTe0mzz5z2KAxP6mOwWOiEY4ss() {
        int i = 2 % 2;
        int i2 = component4 + 65;
        equals = i2 % 128;
        int i3 = i2 % 2;
        String strInitiatorMsisdn_delegate$lambda$3 = initiatorMsisdn_delegate$lambda$3();
        int i4 = component4 + 75;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return strInitiatorMsisdn_delegate$lambda$3;
    }

    /* JADX WARN: Finally extract failed */
    private static void m10946instrumented$0$initView$V(RiskOtpVerifyActivity riskOtpVerifyActivity, View view) {
        int i = 2 % 2;
        int i2 = component4 + 69;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                initView$lambda$4(riskOtpVerifyActivity, view);
                Callback.onClick_exit();
                obj.hashCode();
                throw null;
            }
            initView$lambda$4(riskOtpVerifyActivity, view);
            Callback.onClick_exit();
            int i4 = component4 + 21;
            equals = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    private static void m10947instrumented$1$initView$V(RiskOtpVerifyActivity riskOtpVerifyActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 91;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                initView$lambda$6(riskOtpVerifyActivity, view);
                Callback.onClick_exit();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            initView$lambda$6(riskOtpVerifyActivity, view);
            Callback.onClick_exit();
            int i4 = component4 + 29;
            equals = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 61 / 0;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = equals + 65;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = equals + 87;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }
}
