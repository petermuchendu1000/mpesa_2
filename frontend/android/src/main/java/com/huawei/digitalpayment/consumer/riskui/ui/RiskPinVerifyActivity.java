package com.huawei.digitalpayment.consumer.riskui.ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.core.os.BundleKt;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.ActivityUtils;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.service.ILoginService;
import com.huawei.digitalpayment.consumer.baselib.util.ActivityHelperKt;
import com.huawei.digitalpayment.consumer.baselib.util.encrypt.EncryptUtils;
import com.huawei.digitalpayment.consumer.risk.bean.ProcessVerifyParams;
import com.huawei.digitalpayment.consumer.risk.ui.CommonRiskActivity;
import com.huawei.digitalpayment.consumer.riskui.R;
import com.huawei.digitalpayment.consumer.riskui.databinding.ActivityVerifyPinBinding;
import com.safaricom.mpesa.logging.L;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.cancelNotification;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0012\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u0014J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0014J\b\u0010\u001e\u001a\u00020\u001fH\u0014J\u0012\u0010 \u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\"\u001a\u00020#H\u0014J\b\u0010$\u001a\u00020\u0015H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\tR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012¨\u0006%"}, d2 = {"Lcom/huawei/digitalpayment/consumer/riskui/ui/RiskPinVerifyActivity;", "Lcom/huawei/digitalpayment/consumer/baselib/pin/ui/activity/BasePinActivity;", "Lcom/huawei/digitalpayment/consumer/riskui/databinding/ActivityVerifyPinBinding;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", KeysConstants.KEY_LOGIN_TYPE, "", "getLoginType", "()Ljava/lang/String;", "loginType$delegate", "Lkotlin/Lazy;", "token", "getToken", "token$delegate", KeysConstants.KEY_SUPPORT_FORGET_PIN, "", "getSupportForgetPin", "()Z", "supportForgetPin$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onConfirmClick", "pin", "buildBundle", "params", "Lcom/huawei/digitalpayment/consumer/risk/bean/ProcessVerifyParams;", "onForgetClick", "getPinType", "Lcom/huawei/digitalpayment/consumer/baselib/pin/model/PinType;", "initToolbar", "title", "getLayoutId", "", "onBackPressed", "ConsumerRiskUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class RiskPinVerifyActivity extends Hilt_RiskPinVerifyActivity<ActivityVerifyPinBinding, ViewModel> {
    private static final byte[] $$l = {80, -19, -87, -22};
    private static final int $$o = 78;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$s = {66, -42, -1, 80, 5, 6, -7, -2, 6, Ascii.VT, -73, TarHeader.LF_FIFO, 13, 4, -2, 7, 0, -10, 6, -8, Ascii.SI, PSSSigner.TRAILER_IMPLICIT, TarHeader.LF_FIFO, 6, -6, Ascii.SO, 1, -8, 8, 8, PSSSigner.TRAILER_IMPLICIT, 35, 35, -2, -10, Ascii.DC2, -17, 3, Ascii.SO, -30, 17, 13, 2, -10, -64, 33, 34, 2, -4, Ascii.NAK, -8, 9, -42, 37, 4, -3, 8, 13, -1, 4, 0, 0, -8, 10, 7, -65, 13, -1, 4, 0, 0, -8, 10, 7, -64, 13, -1, -62, 58, 3, Ascii.FF, -11, Ascii.SO, -18, -51, TarHeader.LF_DIR, 0, Ascii.DC2, 3, -14, 7, 9, -15, -52, 67, -11, 3, 17, -12, -3, 19, -17, Ascii.SO, -67, 72, 0, -10, 4, -61, 35, Ascii.DC2, 7, -1, -17, Ascii.ETB, Ascii.DC2, -20, -33, Ascii.US, Ascii.FF, -8, 19, -8, -10, 20, -4, 4};
    private static final int $$t = 138;
    private static final byte[] $$d = {94, -43, -105, 125, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 153;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private static char ShareDataUIState = 3635;
    private static char component3 = 41855;
    private static char copydefault = 23810;
    private static char component1 = 11008;
    private static char[] component2 = {45664, 19899, 19954, 19757, 19815, 19665, 19597, 19542, 19462, 20418, 20470, 20402, 20335, 20341, 20190, 20116, 20041, 19977, 18884, 18943, 18864, 18796, 18801, 18571, 18574, 18451, 18518, 19335, 19369, 19426, 19246, 19314, 19081, 19164, 18962, 18963, 17811, 17854, 17891, 17707, 17780, 17572, 17631, 17424, 17501, 18305, 18351, 18351, 18235, 18288, 18107, 18050, 17925, 17995, 16795, 16870, 16873, 16681, 16761, 16560, 16607, 16407, 16405, 17287, 17402, 17312, 17187, 17259, 17073, 17093, 16918, 16970, 45581, 19905, 19871, 19795, 19797, 19688, 19628, 19576, 19512, 20406, 20466, 20371, 20288, 20232, 20192, 20131, 49809, 15707, 15635, 15811, 15760, 15474, 15398, 15600, 15496, 16230, 16205, 16157, 16367, 16268, 15998, 15924, 53610, 11938, 12001, 11820, 11896, 12161, 12229, 12116, 12124, 11399, 11491, 11477, 11302, 11363, 11677, 11719, 11542, 11647, 10905, 10913, 10980, 10803, 3150, 62336, 62414, 62227, 62302, 62118, 62187, 62015, 62072, 61883, 61828, 7125, 58445, 58457, 58582, 58572, 58674, 58744, 58869, 58856, 59000, 58896, 58972, 59090, 59035, 59232, 59262, 59381, 59313, 57387, 57408, 57438, 57475, 57549, 57702, 57641, 57834, 57778, 57898, 57877, 57867, 57991, 58008, 58218, 58224, 58340, 58290, 60535, 60486, 60428, 60634, 60622, 60767, 60708, 60856, 60900, 61049, 60944, 60942, 61061, 61085, 61195, 61300, 61420, 61413, 59437, 59467, 59480, 59544, 59548, 59737, 59687, 59881, 59874, 59945, 33256, 32296, 32358, 32443, 32510, 32527, 32578, 32658, 32720, 31762, 31781, 3138, 62339, 62401, 62231, 62291, 62115, 62187, 62005, 62071, 61887, 61824, 3150, 62340, 62400, 62234, 62291, 62118, 62184, 62002, 62071, 61883, 3138, 62339, 62401, 62231, 62291, 62115, 62187, 62005, 62071, 61887};
    private static long component4 = -7407561515673455695L;

    private final Lazy loginType = LazyKt.lazy(new Function0() {
        private static int ShareDataUIState = 1;
        private static int component2;

        @Override
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = component2 + 39;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            String str$r8$lambda$Ez0G_ZRN31MeAyKXPO1DUG6qIbM = RiskPinVerifyActivity.$r8$lambda$Ez0G_ZRN31MeAyKXPO1DUG6qIbM(this.f$0);
            int i4 = component2 + 75;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return str$r8$lambda$Ez0G_ZRN31MeAyKXPO1DUG6qIbM;
            }
            throw null;
        }
    });

    private final Lazy token = LazyKt.lazy(new Function0() {
        private static int component1 = 1;
        private static int component2;

        @Override
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = component2 + 101;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            String str$r8$lambda$iJ1X6ursmDehHh8PQeOk8HkT8bM = RiskPinVerifyActivity.$r8$lambda$iJ1X6ursmDehHh8PQeOk8HkT8bM(this.f$0);
            int i4 = component1 + 17;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return str$r8$lambda$iJ1X6ursmDehHh8PQeOk8HkT8bM;
            }
            throw null;
        }
    });

    private final Lazy supportForgetPin = LazyKt.lazy(new Function0() {
        private static int ShareDataUIState = 1;
        private static int component1;

        @Override
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = component1 + 47;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Boolean boolValueOf = Boolean.valueOf(RiskPinVerifyActivity.$r8$lambda$W_ggKvz55Wdu4aCUl_38cQwx7gw(this.f$0));
            int i4 = component1 + 17;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return boolValueOf;
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(int r5, short r6, int r7) {
        /*
            int r6 = 122 - r6
            int r5 = r5 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.riskui.ui.RiskPinVerifyActivity.$$l
            int r7 = r7 * 2
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L14
            r4 = r7
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r5 = r5 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            r4 = r0[r5]
            int r3 = r3 + 1
        L26:
            int r4 = -r4
            int r6 = r6 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.riskui.ui.RiskPinVerifyActivity.$$r(int, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(int r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 83
            int r0 = r6 + 4
            int r5 = 100 - r5
            byte[] r1 = com.huawei.digitalpayment.consumer.riskui.ui.RiskPinVerifyActivity.$$d
            byte[] r0 = new byte[r0]
            int r6 = r6 + 3
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L25:
            r3 = r1[r5]
        L27:
            int r7 = r7 + r3
            int r7 = r7 + (-8)
            int r5 = r5 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.riskui.ui.RiskPinVerifyActivity.i(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(int r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 8
            int r7 = r7 + 99
            byte[] r0 = com.huawei.digitalpayment.consumer.riskui.ui.RiskPinVerifyActivity.$$s
            int r5 = r5 + 10
            int r6 = 75 - r6
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r5
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L23:
            r4 = r0[r6]
        L25:
            int r6 = r6 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-1)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.riskui.ui.RiskPinVerifyActivity.j(int, int, byte, java.lang.Object[]):void");
    }

    private final String getLoginType() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 93;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = (String) this.loginType.getValue();
        int i3 = getAsAtTimestamp + 5;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r4 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (r4 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.String loginType_delegate$lambda$0(com.huawei.digitalpayment.consumer.riskui.ui.RiskPinVerifyActivity r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            android.content.Intent r4 = r4.getIntent()
            if (r4 == 0) goto L2b
            int r2 = com.huawei.digitalpayment.consumer.riskui.ui.RiskPinVerifyActivity.getRequestBeneficiariesState
            int r2 = r2 + 101
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.riskui.ui.RiskPinVerifyActivity.getAsAtTimestamp = r3
            int r2 = r2 % r0
            java.lang.String r3 = "loginType"
            java.lang.String r4 = r4.getStringExtra(r3)
            if (r2 == 0) goto L26
            r2 = 52
            int r2 = r2 / 0
            if (r4 != 0) goto L29
            goto L2b
        L26:
            if (r4 != 0) goto L29
            goto L2b
        L29:
            r1 = r4
            goto L34
        L2b:
            int r4 = com.huawei.digitalpayment.consumer.riskui.ui.RiskPinVerifyActivity.getRequestBeneficiariesState
            int r4 = r4 + 79
            int r2 = r4 % 128
            com.huawei.digitalpayment.consumer.riskui.ui.RiskPinVerifyActivity.getAsAtTimestamp = r2
            int r4 = r4 % r0
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.riskui.ui.RiskPinVerifyActivity.loginType_delegate$lambda$0(com.huawei.digitalpayment.consumer.riskui.ui.RiskPinVerifyActivity):java.lang.String");
    }

    private final String getToken() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 97;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.token.getValue();
        int i4 = getAsAtTimestamp + 113;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 65 / 0;
        }
        return str;
    }

    private static final String token_delegate$lambda$1(RiskPinVerifyActivity riskPinVerifyActivity) {
        String stringExtra;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 101;
        getRequestBeneficiariesState = i2 % 128;
        Object obj = null;
        String str = "";
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(riskPinVerifyActivity, "");
            riskPinVerifyActivity.getIntent();
            throw null;
        }
        Intrinsics.checkNotNullParameter(riskPinVerifyActivity, "");
        Intent intent = riskPinVerifyActivity.getIntent();
        if (intent != null && (stringExtra = intent.getStringExtra("token")) != null) {
            str = stringExtra;
        }
        int i3 = getRequestBeneficiariesState + 69;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    private final boolean getSupportForgetPin() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 95;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) this.supportForgetPin.getValue();
        if (i3 != 0) {
            return bool.booleanValue();
        }
        bool.booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean supportForgetPin_delegate$lambda$2(RiskPinVerifyActivity riskPinVerifyActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 71;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(riskPinVerifyActivity, "");
        Intent intent = riskPinVerifyActivity.getIntent();
        boolean booleanExtra = intent != null ? intent.getBooleanExtra(KeysConstants.KEY_SUPPORT_FORGET_PIN, true) : true;
        int i4 = getRequestBeneficiariesState + 51;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return booleanExtra;
    }

    private static void h(char c2, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i) {
            int i5 = $11 + 45;
            $10 = i5 % 128;
            if (i5 % i3 != 0) {
                int i6 = cancelnotification.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(component2[i2 * i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                    if (objCopydefault == null) {
                        byte b2 = (byte) (-1);
                        byte b3 = (byte) (-b2);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1758 - Color.argb(0, 0, 0, 0), 34 - TextUtils.getTrimmedLength(""), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 1159210934, false, $$r(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    long jLongValue = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue();
                    long j = i6;
                    long j2 = component4;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(c2);
                    objArr3[i3] = Long.valueOf(j2);
                    objArr3[1] = Long.valueOf(j);
                    objArr3[0] = Long.valueOf(jLongValue);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                    if (objCopydefault2 == null) {
                        int mode = View.MeasureSpec.getMode(0) + 3608;
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 29;
                        char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 7171);
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 & 5);
                        String str$$r = $$r(b4, b5, (byte) (b5 - 5));
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Long.TYPE;
                        clsArr[1] = Long.TYPE;
                        clsArr[i3] = Long.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(mode, jumpTapTimeout, packedPositionType, 1951385784, false, str$$r, clsArr);
                    }
                    jArr[i6] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {cancelnotification, cancelnotification};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                    if (objCopydefault3 == null) {
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 4014;
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 24;
                        char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 27761);
                        byte b6 = (byte) (-1);
                        byte b7 = (byte) (b6 + 1);
                        String str$$r2 = $$r(b6, b7, b7);
                        Class[] clsArr2 = new Class[i3];
                        clsArr2[0] = Object.class;
                        clsArr2[1] = Object.class;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(bitsPerPixel, windowTouchSlop, threadPriority, -1529629956, false, str$$r2, clsArr2);
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = cancelnotification.copydefault;
                Object[] objArr5 = {Integer.valueOf(component2[i2 + i7])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) (-1);
                    byte b9 = (byte) (-b8);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1758 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 34 - ExpandableListView.getPackedPositionType(0L), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1159210934, false, $$r(b8, b9, (byte) (b9 - 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objCopydefault4).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(component4), Integer.valueOf(c2)};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault5 == null) {
                    byte b10 = (byte) (-1);
                    byte b11 = (byte) (b10 & 5);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3607, TextUtils.indexOf("", "") + 29, (char) (7171 - (ViewConfiguration.getPressedStateDuration() >> 16)), 1951385784, false, $$r(b10, b11, (byte) (b11 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objCopydefault5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {cancelnotification, cancelnotification};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault6 == null) {
                    byte b12 = (byte) (-1);
                    byte b13 = (byte) (b12 + 1);
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(((Process.getThreadPriority(0) + 20) >> 6) + 4013, 'H' - AndroidCharacter.getMirror('0'), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 27761), -1529629956, false, $$r(b12, b13, b13), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault6).invoke(null, objArr7);
                i3 = 2;
            }
        }
        char[] cArr = new char[i];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i) {
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr8 = {cancelnotification, cancelnotification};
            Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault7 == null) {
                byte b14 = (byte) (-1);
                byte b15 = (byte) (b14 + 1);
                objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(4012 - ((byte) KeyEvent.getModifierMetaStateMask()), 24 - View.combineMeasuredStates(0, 0), (char) (27761 - View.resolveSizeAndState(0, 0, 0)), -1529629956, false, $$r(b14, b15, b15), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault7).invoke(null, objArr8);
        }
        String str = new String(cArr);
        int i8 = $11 + 121;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    private static void g(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i4 = $10 + 77;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[i3];
                int i8 = i7;
                int i9 = (c3 + i6) ^ ((c3 << 4) + ((char) (((long) copydefault) ^ 4374495167426960553L)));
                int i10 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(component1);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i3] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int i11 = (TypedValue.complexToFraction(i3, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i3, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 844;
                        int iRed = Color.red(i3) + 32;
                        char c4 = (char) (23250 - (ExpandableListView.getPackedPositionForChild(i3, i3) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i3, i3) == 0L ? 0 : -1)));
                        byte b2 = (byte) (-1);
                        String str$$r = $$r(b2, (byte) (b2 & Ascii.VT), (byte) i3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i11, iRed, c4, 592652048, false, str$$r, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) ShareDataUIState) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component3)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b3 = (byte) (-1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 843, 32 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (23251 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 592652048, false, $$r(b3, (byte) (b3 & Ascii.VT), (byte) 0), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i8 + 1;
                    int i12 = $11 + 123;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    cArr3 = cArr4;
                    i3 = 0;
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
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.argb(0, 0, 0, 0) + 465, (ViewConfiguration.getJumpTapTimeout() >> 16) + 49, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i14 = $11 + 57;
        $10 = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a5  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.riskui.ui.RiskPinVerifyActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public void onConfirmClick(String pin) {
        int i = 2 % 2;
        RouteUtils.routeWithExecute(this, RoutePathConstants.COMMON_RISK, buildBundle(new ProcessVerifyParams(getLoginType(), null, null, null, null, EncryptUtils.encryptWithPinKey(pin), AppConfigManager.getAppConfig().getPinKeyVersion(), null, null, getToken(), 414, null)), ActivityHelperKt.buildLauncher(this, new ActivityResultCallback() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public final void onActivityResult(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 107;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                RiskPinVerifyActivity riskPinVerifyActivity = this.f$0;
                ActivityResult activityResult = (ActivityResult) obj;
                if (i4 == 0) {
                    RiskPinVerifyActivity.$r8$lambda$HcFQEkVv2qfLDUu3V9hCSPTz5zE(riskPinVerifyActivity, activityResult);
                } else {
                    RiskPinVerifyActivity.$r8$lambda$HcFQEkVv2qfLDUu3V9hCSPTz5zE(riskPinVerifyActivity, activityResult);
                    throw null;
                }
            }
        }));
        int i2 = getAsAtTimestamp + 85;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 98 / 0;
        }
    }

    private static final void onConfirmClick$lambda$3(RiskPinVerifyActivity riskPinVerifyActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(riskPinVerifyActivity, "");
        L l = L.INSTANCE;
        String str = riskPinVerifyActivity.TAG;
        Intrinsics.checkNotNullExpressionValue(str, "");
        l.d(str, "onConfirmClick risk callback: " + activityResult, new Object[0]);
        if (activityResult.getResultCode() == -1) {
            riskPinVerifyActivity.finish();
            return;
        }
        int i2 = getAsAtTimestamp + 15;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private final Bundle buildBundle(ProcessVerifyParams params) {
        int i = 2 % 2;
        Bundle bundleBundleOf = BundleKt.bundleOf();
        Intent intent = getIntent();
        if (intent != null) {
            int i2 = getRequestBeneficiariesState + 101;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            Bundle extras = intent.getExtras();
            if (extras != null) {
                int i4 = getAsAtTimestamp + 77;
                getRequestBeneficiariesState = i4 % 128;
                if (i4 % 2 == 0) {
                    bundleBundleOf.putAll(extras);
                    throw null;
                }
                bundleBundleOf.putAll(extras);
                int i5 = getRequestBeneficiariesState + 55;
                getAsAtTimestamp = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        bundleBundleOf.putSerializable(KeysConstants.KEY_RISK_PARAMS, params);
        bundleBundleOf.putBoolean(KeysConstants.KEY_HANDLE_ERROR_BY_SELF, true);
        return bundleBundleOf;
    }

    @Override
    public void onForgetClick() {
        int i = 2 % 2;
        ((ILoginService) RouteUtils.getService(ILoginService.class)).resetPin(new ApiCallback<Boolean>() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(Boolean bool) {
                int i2 = 2 % 2;
                int i3 = component1 + 63;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(bool);
                int i5 = component1 + 5;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 54 / 0;
                }
            }

            public void onSuccess2(Boolean value) {
                int i2 = 2 % 2;
                int i3 = component1 + 91;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                ActivityUtils.finishToActivity((Activity) RiskPinVerifyActivity.this, false, true);
                int i5 = copydefault + 77;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = getAsAtTimestamp + 49;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 13 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[PHI: r1 r2
  0x0070: PHI (r1v6 java.lang.String) = (r1v5 java.lang.String), (r1v13 java.lang.String) binds: [B:8:0x0052, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]
  0x0070: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v8 java.lang.String) binds: [B:8:0x0052, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0054 A[PHI: r1 r2
  0x0054: PHI (r1v11 java.lang.String) = (r1v5 java.lang.String), (r1v13 java.lang.String) binds: [B:8:0x0052, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]
  0x0054: PHI (r2v6 java.lang.String) = (r2v2 java.lang.String), (r2v8 java.lang.String) binds: [B:8:0x0052, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.huawei.digitalpayment.consumer.baselib.pin.model.PinType getPinType() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.riskui.ui.RiskPinVerifyActivity.getRequestBeneficiariesState
            int r1 = r1 + 65
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.riskui.ui.RiskPinVerifyActivity.getAsAtTimestamp = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L32
            int r1 = com.huawei.digitalpayment.consumer.riskui.R.string.risk_further_enter_the_pin
            java.lang.String r1 = r6.getString(r1)
            int r2 = com.huawei.digitalpayment.consumer.riskui.R.string.risk_further_please_enter_pin
            com.huawei.digitalpayment.consumer.baselib.config.IAppConfig r3 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.getAppConfig()
            int r3 = r3.getPinLimit()
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r5[r4] = r3
            java.lang.String r2 = r6.getString(r2, r5)
            boolean r3 = r6.getSupportForgetPin()
            if (r3 == r4) goto L54
            goto L70
        L32:
            int r1 = com.huawei.digitalpayment.consumer.riskui.R.string.risk_further_enter_the_pin
            java.lang.String r1 = r6.getString(r1)
            int r2 = com.huawei.digitalpayment.consumer.riskui.R.string.risk_further_please_enter_pin
            com.huawei.digitalpayment.consumer.baselib.config.IAppConfig r3 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.getAppConfig()
            int r3 = r3.getPinLimit()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r2 = r6.getString(r2, r3)
            boolean r3 = r6.getSupportForgetPin()
            if (r3 == 0) goto L70
        L54:
            int r3 = com.huawei.digitalpayment.consumer.riskui.ui.RiskPinVerifyActivity.getAsAtTimestamp
            int r3 = r3 + 123
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.riskui.ui.RiskPinVerifyActivity.getRequestBeneficiariesState = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L66
            int r3 = com.huawei.digitalpayment.consumer.riskui.R.string.risk_further_forget_pin
            java.lang.String r3 = r6.getString(r3)
            goto L72
        L66:
            int r0 = com.huawei.digitalpayment.consumer.riskui.R.string.risk_further_forget_pin
            r6.getString(r0)
            r0 = 0
            r0.hashCode()
            throw r0
        L70:
            java.lang.String r3 = ""
        L72:
            int r4 = com.huawei.digitalpayment.consumer.riskui.R.string.risk_further_continue
            java.lang.String r4 = r6.getString(r4)
            com.huawei.digitalpayment.consumer.baselib.pin.model.PinType r5 = new com.huawei.digitalpayment.consumer.baselib.pin.model.PinType
            r5.<init>(r1, r2, r3, r4)
            int r1 = com.huawei.digitalpayment.consumer.riskui.ui.RiskPinVerifyActivity.getAsAtTimestamp
            int r1 = r1 + 23
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.riskui.ui.RiskPinVerifyActivity.getRequestBeneficiariesState = r2
            int r1 = r1 % r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.riskui.ui.RiskPinVerifyActivity.getPinType():com.huawei.digitalpayment.consumer.baselib.pin.model.PinType");
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 77;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        super.initToolbar(getString(R.string.risk_further_authentication));
        int i4 = getRequestBeneficiariesState + 7;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 55;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = R.layout.activity_verify_pin;
            throw null;
        }
        int i4 = R.layout.activity_verify_pin;
        int i5 = getRequestBeneficiariesState + 97;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    @Override
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 115;
        getRequestBeneficiariesState = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.onBackPressed();
            CommonRiskActivity.INSTANCE.setCallback(null);
        } else {
            super.onBackPressed();
            CommonRiskActivity.INSTANCE.setCallback(null);
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ab  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.riskui.ui.RiskPinVerifyActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(17) - 89, new char[]{2834, 18789, 59687, 42535, 11276, 2698, 51559, 55554, 22133, 48116, 52869, 22345, 37547, 40044, 52802, 27254, 61694, 27973, 40230, 42562, 16708, 32753, 11373, 5271, 53126, 44579}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(18 - (ViewConfiguration.getTapTimeout() >> 16), new char[]{32318, 45856, 35166, 11350, 24850, 63087, 4857, 62450, 14462, 16033, 34471, 37999, 53620, 34604, 52802, 27254, 40353, 12556}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = getAsAtTimestamp + 97;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i4 = getAsAtTimestamp + 61;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getLongPressTimeout() >> 16) + 6618, 41 - TextUtils.lastIndexOf("", '0', 0), (char) View.MeasureSpec.makeMeasureSpec(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6561, 56 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), -960739708, false, "component3", new Class[]{Context.class});
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0b0c A[Catch: all -> 0x0c31, TryCatch #7 {all -> 0x0c31, blocks: (B:144:0x0b02, B:145:0x0b06, B:147:0x0b0c, B:150:0x0b27, B:134:0x0a30, B:140:0x0a9c, B:143:0x0afa), top: B:802:0x0a30 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0d00 A[Catch: all -> 0x044e, TryCatch #26 {all -> 0x044e, blocks: (B:312:0x127f, B:314:0x1285, B:315:0x12ad, B:673:0x2db5, B:675:0x2dbb, B:676:0x2de5, B:707:0x30ef, B:709:0x30f5, B:710:0x3123, B:744:0x345b, B:746:0x3461, B:747:0x348e, B:724:0x3285, B:726:0x32a8, B:727:0x3300, B:767:0x3570, B:769:0x3576, B:770:0x3599, B:772:0x35d3, B:773:0x3618, B:534:0x24a6, B:536:0x24bb, B:537:0x24ee, B:539:0x2522, B:540:0x259e, B:511:0x2120, B:513:0x2126, B:514:0x2151, B:516:0x218b, B:517:0x21d1, B:484:0x1e8a, B:486:0x1e9f, B:487:0x1ed2, B:468:0x1c9b, B:470:0x1ca1, B:471:0x1ccb, B:381:0x1719, B:383:0x171f, B:384:0x1748, B:204:0x0cfa, B:206:0x0d00, B:207:0x0d25, B:72:0x05fe, B:74:0x0604, B:75:0x062d, B:20:0x023d, B:22:0x0243, B:23:0x0269, B:25:0x03bf, B:27:0x03f1, B:28:0x0448, B:388:0x17ca, B:390:0x17d0, B:391:0x1817, B:393:0x1824, B:395:0x182d, B:396:0x186e, B:420:0x1a99, B:421:0x1a9d, B:423:0x1aa3, B:426:0x1aba, B:429:0x1ac7, B:431:0x1aca, B:443:0x1bb9, B:445:0x1bbf, B:446:0x1bc0, B:448:0x1bc2, B:450:0x1bc9, B:451:0x1bca, B:397:0x1879, B:409:0x197d, B:411:0x1983, B:412:0x19c5, B:414:0x19ef, B:416:0x1a32, B:418:0x1a49, B:419:0x1a91, B:453:0x1bcc, B:455:0x1bd3, B:456:0x1bd4, B:458:0x1bd6, B:460:0x1bdd, B:461:0x1bde, B:35:0x0464, B:37:0x0468, B:58:0x0550, B:60:0x0556, B:61:0x0557, B:63:0x0559, B:65:0x0560, B:66:0x0561, B:41:0x0474, B:319:0x132f, B:321:0x1335, B:322:0x137a, B:324:0x1387, B:326:0x1390, B:327:0x13d4, B:347:0x1590, B:355:0x15ff, B:361:0x167e, B:363:0x1684, B:364:0x1685, B:366:0x1687, B:368:0x168e, B:369:0x168f, B:329:0x13e0, B:336:0x1468, B:338:0x146e, B:339:0x14b6, B:341:0x14e0, B:343:0x1528, B:345:0x153f, B:346:0x1586, B:371:0x1691, B:373:0x1698, B:374:0x1699), top: B:838:0x023d, inners: #34, #39, #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0daa  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0e01  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0e5f A[Catch: all -> 0x11ce, TRY_ENTER, TRY_LEAVE, TryCatch #27 {all -> 0x11ce, blocks: (B:211:0x0da4, B:218:0x0df4, B:227:0x0e5f, B:245:0x0f65, B:248:0x0fb2), top: B:839:0x0da4 }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x109c A[Catch: all -> 0x11b4, TryCatch #8 {all -> 0x11b4, blocks: (B:258:0x1092, B:259:0x1096, B:261:0x109c, B:264:0x10b4, B:267:0x10c1, B:269:0x10c4, B:281:0x11a2, B:283:0x11a8, B:284:0x11a9, B:286:0x11ab, B:288:0x11b2, B:289:0x11b3, B:250:0x0fc1, B:252:0x0fde, B:254:0x102d, B:256:0x1044, B:257:0x108a, B:294:0x11ba, B:296:0x11c0, B:297:0x11c1, B:300:0x11c6, B:302:0x11cc, B:303:0x11cd, B:277:0x112b, B:272:0x10f0, B:274:0x10f6, B:275:0x1123), top: B:804:0x0dff, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x1285 A[Catch: all -> 0x044e, TryCatch #26 {all -> 0x044e, blocks: (B:312:0x127f, B:314:0x1285, B:315:0x12ad, B:673:0x2db5, B:675:0x2dbb, B:676:0x2de5, B:707:0x30ef, B:709:0x30f5, B:710:0x3123, B:744:0x345b, B:746:0x3461, B:747:0x348e, B:724:0x3285, B:726:0x32a8, B:727:0x3300, B:767:0x3570, B:769:0x3576, B:770:0x3599, B:772:0x35d3, B:773:0x3618, B:534:0x24a6, B:536:0x24bb, B:537:0x24ee, B:539:0x2522, B:540:0x259e, B:511:0x2120, B:513:0x2126, B:514:0x2151, B:516:0x218b, B:517:0x21d1, B:484:0x1e8a, B:486:0x1e9f, B:487:0x1ed2, B:468:0x1c9b, B:470:0x1ca1, B:471:0x1ccb, B:381:0x1719, B:383:0x171f, B:384:0x1748, B:204:0x0cfa, B:206:0x0d00, B:207:0x0d25, B:72:0x05fe, B:74:0x0604, B:75:0x062d, B:20:0x023d, B:22:0x0243, B:23:0x0269, B:25:0x03bf, B:27:0x03f1, B:28:0x0448, B:388:0x17ca, B:390:0x17d0, B:391:0x1817, B:393:0x1824, B:395:0x182d, B:396:0x186e, B:420:0x1a99, B:421:0x1a9d, B:423:0x1aa3, B:426:0x1aba, B:429:0x1ac7, B:431:0x1aca, B:443:0x1bb9, B:445:0x1bbf, B:446:0x1bc0, B:448:0x1bc2, B:450:0x1bc9, B:451:0x1bca, B:397:0x1879, B:409:0x197d, B:411:0x1983, B:412:0x19c5, B:414:0x19ef, B:416:0x1a32, B:418:0x1a49, B:419:0x1a91, B:453:0x1bcc, B:455:0x1bd3, B:456:0x1bd4, B:458:0x1bd6, B:460:0x1bdd, B:461:0x1bde, B:35:0x0464, B:37:0x0468, B:58:0x0550, B:60:0x0556, B:61:0x0557, B:63:0x0559, B:65:0x0560, B:66:0x0561, B:41:0x0474, B:319:0x132f, B:321:0x1335, B:322:0x137a, B:324:0x1387, B:326:0x1390, B:327:0x13d4, B:347:0x1590, B:355:0x15ff, B:361:0x167e, B:363:0x1684, B:364:0x1685, B:366:0x1687, B:368:0x168e, B:369:0x168f, B:329:0x13e0, B:336:0x1468, B:338:0x146e, B:339:0x14b6, B:341:0x14e0, B:343:0x1528, B:345:0x153f, B:346:0x1586, B:371:0x1691, B:373:0x1698, B:374:0x1699), top: B:838:0x023d, inners: #34, #39, #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x1335 A[Catch: all -> 0x169a, TryCatch #51 {all -> 0x169a, blocks: (B:319:0x132f, B:321:0x1335, B:322:0x137a, B:324:0x1387, B:326:0x1390, B:327:0x13d4, B:347:0x1590, B:355:0x15ff, B:361:0x167e, B:363:0x1684, B:364:0x1685, B:366:0x1687, B:368:0x168e, B:369:0x168f, B:329:0x13e0, B:336:0x1468, B:338:0x146e, B:339:0x14b6, B:341:0x14e0, B:343:0x1528, B:345:0x153f, B:346:0x1586, B:371:0x1691, B:373:0x1698, B:374:0x1699, B:357:0x1605, B:351:0x15c3, B:353:0x15c9, B:354:0x15f8, B:331:0x1400, B:333:0x1412, B:334:0x145c), top: B:883:0x132f, outer: #26, inners: #40, #45, #47 }] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x1387 A[Catch: all -> 0x169a, TryCatch #51 {all -> 0x169a, blocks: (B:319:0x132f, B:321:0x1335, B:322:0x137a, B:324:0x1387, B:326:0x1390, B:327:0x13d4, B:347:0x1590, B:355:0x15ff, B:361:0x167e, B:363:0x1684, B:364:0x1685, B:366:0x1687, B:368:0x168e, B:369:0x168f, B:329:0x13e0, B:336:0x1468, B:338:0x146e, B:339:0x14b6, B:341:0x14e0, B:343:0x1528, B:345:0x153f, B:346:0x1586, B:371:0x1691, B:373:0x1698, B:374:0x1699, B:357:0x1605, B:351:0x15c3, B:353:0x15c9, B:354:0x15f8, B:331:0x1400, B:333:0x1412, B:334:0x145c), top: B:883:0x132f, outer: #26, inners: #40, #45, #47 }] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x13e0 A[Catch: all -> 0x169a, TRY_LEAVE, TryCatch #51 {all -> 0x169a, blocks: (B:319:0x132f, B:321:0x1335, B:322:0x137a, B:324:0x1387, B:326:0x1390, B:327:0x13d4, B:347:0x1590, B:355:0x15ff, B:361:0x167e, B:363:0x1684, B:364:0x1685, B:366:0x1687, B:368:0x168e, B:369:0x168f, B:329:0x13e0, B:336:0x1468, B:338:0x146e, B:339:0x14b6, B:341:0x14e0, B:343:0x1528, B:345:0x153f, B:346:0x1586, B:371:0x1691, B:373:0x1698, B:374:0x1699, B:357:0x1605, B:351:0x15c3, B:353:0x15c9, B:354:0x15f8, B:331:0x1400, B:333:0x1412, B:334:0x145c), top: B:883:0x132f, outer: #26, inners: #40, #45, #47 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x15a2  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x17d0 A[Catch: all -> 0x1bdf, TryCatch #34 {all -> 0x1bdf, blocks: (B:388:0x17ca, B:390:0x17d0, B:391:0x1817, B:393:0x1824, B:395:0x182d, B:396:0x186e, B:420:0x1a99, B:421:0x1a9d, B:423:0x1aa3, B:426:0x1aba, B:429:0x1ac7, B:431:0x1aca, B:443:0x1bb9, B:445:0x1bbf, B:446:0x1bc0, B:448:0x1bc2, B:450:0x1bc9, B:451:0x1bca, B:397:0x1879, B:409:0x197d, B:411:0x1983, B:412:0x19c5, B:414:0x19ef, B:416:0x1a32, B:418:0x1a49, B:419:0x1a91, B:453:0x1bcc, B:455:0x1bd3, B:456:0x1bd4, B:458:0x1bd6, B:460:0x1bdd, B:461:0x1bde, B:439:0x1b3b, B:434:0x1af5, B:436:0x1afb, B:437:0x1b22, B:404:0x18e5, B:406:0x1901, B:407:0x1971, B:399:0x1899, B:401:0x18ae, B:402:0x18de), top: B:853:0x17ca, outer: #26, inners: #12, #16, #23, #32 }] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x1824 A[Catch: all -> 0x1bdf, TryCatch #34 {all -> 0x1bdf, blocks: (B:388:0x17ca, B:390:0x17d0, B:391:0x1817, B:393:0x1824, B:395:0x182d, B:396:0x186e, B:420:0x1a99, B:421:0x1a9d, B:423:0x1aa3, B:426:0x1aba, B:429:0x1ac7, B:431:0x1aca, B:443:0x1bb9, B:445:0x1bbf, B:446:0x1bc0, B:448:0x1bc2, B:450:0x1bc9, B:451:0x1bca, B:397:0x1879, B:409:0x197d, B:411:0x1983, B:412:0x19c5, B:414:0x19ef, B:416:0x1a32, B:418:0x1a49, B:419:0x1a91, B:453:0x1bcc, B:455:0x1bd3, B:456:0x1bd4, B:458:0x1bd6, B:460:0x1bdd, B:461:0x1bde, B:439:0x1b3b, B:434:0x1af5, B:436:0x1afb, B:437:0x1b22, B:404:0x18e5, B:406:0x1901, B:407:0x1971, B:399:0x1899, B:401:0x18ae, B:402:0x18de), top: B:853:0x17ca, outer: #26, inners: #12, #16, #23, #32 }] */
    /* JADX WARN: Removed duplicated region for block: B:397:0x1879 A[Catch: all -> 0x1bdf, TRY_LEAVE, TryCatch #34 {all -> 0x1bdf, blocks: (B:388:0x17ca, B:390:0x17d0, B:391:0x1817, B:393:0x1824, B:395:0x182d, B:396:0x186e, B:420:0x1a99, B:421:0x1a9d, B:423:0x1aa3, B:426:0x1aba, B:429:0x1ac7, B:431:0x1aca, B:443:0x1bb9, B:445:0x1bbf, B:446:0x1bc0, B:448:0x1bc2, B:450:0x1bc9, B:451:0x1bca, B:397:0x1879, B:409:0x197d, B:411:0x1983, B:412:0x19c5, B:414:0x19ef, B:416:0x1a32, B:418:0x1a49, B:419:0x1a91, B:453:0x1bcc, B:455:0x1bd3, B:456:0x1bd4, B:458:0x1bd6, B:460:0x1bdd, B:461:0x1bde, B:439:0x1b3b, B:434:0x1af5, B:436:0x1afb, B:437:0x1b22, B:404:0x18e5, B:406:0x1901, B:407:0x1971, B:399:0x1899, B:401:0x18ae, B:402:0x18de), top: B:853:0x17ca, outer: #26, inners: #12, #16, #23, #32 }] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x1aa3 A[Catch: all -> 0x1bdf, TryCatch #34 {all -> 0x1bdf, blocks: (B:388:0x17ca, B:390:0x17d0, B:391:0x1817, B:393:0x1824, B:395:0x182d, B:396:0x186e, B:420:0x1a99, B:421:0x1a9d, B:423:0x1aa3, B:426:0x1aba, B:429:0x1ac7, B:431:0x1aca, B:443:0x1bb9, B:445:0x1bbf, B:446:0x1bc0, B:448:0x1bc2, B:450:0x1bc9, B:451:0x1bca, B:397:0x1879, B:409:0x197d, B:411:0x1983, B:412:0x19c5, B:414:0x19ef, B:416:0x1a32, B:418:0x1a49, B:419:0x1a91, B:453:0x1bcc, B:455:0x1bd3, B:456:0x1bd4, B:458:0x1bd6, B:460:0x1bdd, B:461:0x1bde, B:439:0x1b3b, B:434:0x1af5, B:436:0x1afb, B:437:0x1b22, B:404:0x18e5, B:406:0x1901, B:407:0x1971, B:399:0x1899, B:401:0x18ae, B:402:0x18de), top: B:853:0x17ca, outer: #26, inners: #12, #16, #23, #32 }] */
    /* JADX WARN: Removed duplicated region for block: B:476:0x1d52  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x1da5  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x1e6a  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x201f  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x20e1  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x22d4  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x2341  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x2386  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x239c  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x2488  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x26e5  */
    /* JADX WARN: Removed duplicated region for block: B:675:0x2dbb A[Catch: all -> 0x044e, TryCatch #26 {all -> 0x044e, blocks: (B:312:0x127f, B:314:0x1285, B:315:0x12ad, B:673:0x2db5, B:675:0x2dbb, B:676:0x2de5, B:707:0x30ef, B:709:0x30f5, B:710:0x3123, B:744:0x345b, B:746:0x3461, B:747:0x348e, B:724:0x3285, B:726:0x32a8, B:727:0x3300, B:767:0x3570, B:769:0x3576, B:770:0x3599, B:772:0x35d3, B:773:0x3618, B:534:0x24a6, B:536:0x24bb, B:537:0x24ee, B:539:0x2522, B:540:0x259e, B:511:0x2120, B:513:0x2126, B:514:0x2151, B:516:0x218b, B:517:0x21d1, B:484:0x1e8a, B:486:0x1e9f, B:487:0x1ed2, B:468:0x1c9b, B:470:0x1ca1, B:471:0x1ccb, B:381:0x1719, B:383:0x171f, B:384:0x1748, B:204:0x0cfa, B:206:0x0d00, B:207:0x0d25, B:72:0x05fe, B:74:0x0604, B:75:0x062d, B:20:0x023d, B:22:0x0243, B:23:0x0269, B:25:0x03bf, B:27:0x03f1, B:28:0x0448, B:388:0x17ca, B:390:0x17d0, B:391:0x1817, B:393:0x1824, B:395:0x182d, B:396:0x186e, B:420:0x1a99, B:421:0x1a9d, B:423:0x1aa3, B:426:0x1aba, B:429:0x1ac7, B:431:0x1aca, B:443:0x1bb9, B:445:0x1bbf, B:446:0x1bc0, B:448:0x1bc2, B:450:0x1bc9, B:451:0x1bca, B:397:0x1879, B:409:0x197d, B:411:0x1983, B:412:0x19c5, B:414:0x19ef, B:416:0x1a32, B:418:0x1a49, B:419:0x1a91, B:453:0x1bcc, B:455:0x1bd3, B:456:0x1bd4, B:458:0x1bd6, B:460:0x1bdd, B:461:0x1bde, B:35:0x0464, B:37:0x0468, B:58:0x0550, B:60:0x0556, B:61:0x0557, B:63:0x0559, B:65:0x0560, B:66:0x0561, B:41:0x0474, B:319:0x132f, B:321:0x1335, B:322:0x137a, B:324:0x1387, B:326:0x1390, B:327:0x13d4, B:347:0x1590, B:355:0x15ff, B:361:0x167e, B:363:0x1684, B:364:0x1685, B:366:0x1687, B:368:0x168e, B:369:0x168f, B:329:0x13e0, B:336:0x1468, B:338:0x146e, B:339:0x14b6, B:341:0x14e0, B:343:0x1528, B:345:0x153f, B:346:0x1586, B:371:0x1691, B:373:0x1698, B:374:0x1699), top: B:838:0x023d, inners: #34, #39, #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:681:0x2e6a  */
    /* JADX WARN: Removed duplicated region for block: B:684:0x2ebc  */
    /* JADX WARN: Removed duplicated region for block: B:689:0x2f14  */
    /* JADX WARN: Removed duplicated region for block: B:706:0x30ce  */
    /* JADX WARN: Removed duplicated region for block: B:715:0x31b9  */
    /* JADX WARN: Removed duplicated region for block: B:718:0x320d  */
    /* JADX WARN: Removed duplicated region for block: B:723:0x3267  */
    /* JADX WARN: Removed duplicated region for block: B:743:0x343b  */
    /* JADX WARN: Removed duplicated region for block: B:760:0x352e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:913:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0779  */
    /* JADX WARN: Type inference failed for: r28v10 */
    /* JADX WARN: Type inference failed for: r28v11 */
    /* JADX WARN: Type inference failed for: r28v12 */
    /* JADX WARN: Type inference failed for: r28v13 */
    /* JADX WARN: Type inference failed for: r28v26 */
    /* JADX WARN: Type inference failed for: r28v27 */
    /* JADX WARN: Type inference failed for: r6v502 */
    /* JADX WARN: Type inference failed for: r8v132 */
    /* JADX WARN: Type inference failed for: r8v163 */
    /* JADX WARN: Type inference failed for: r8v82, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v93, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v212 */
    /* JADX WARN: Type inference failed for: r9v213 */
    /* JADX WARN: Type inference failed for: r9v214 */
    /* JADX WARN: Type inference failed for: r9v235 */
    /* JADX WARN: Type inference failed for: r9v236 */
    /* JADX WARN: Type inference failed for: r9v239 */
    /* JADX WARN: Type inference failed for: r9v242 */
    /* JADX WARN: Type inference failed for: r9v301 */
    /* JADX WARN: Type inference failed for: r9v316 */
    /* JADX WARN: Type inference failed for: r9v317 */
    /* JADX WARN: Type inference failed for: r9v319, types: [int[]] */
    /* JADX WARN: Type inference failed for: r9v331 */
    /* JADX WARN: Type inference failed for: r9v332 */
    /* JADX WARN: Type inference failed for: r9v344 */
    /* JADX WARN: Type inference failed for: r9v345 */
    /* JADX WARN: Type inference failed for: r9v346 */
    /* JADX WARN: Type inference failed for: r9v347 */
    /* JADX WARN: Type inference failed for: r9v348 */
    /* JADX WARN: Type inference failed for: r9v349 */
    /* JADX WARN: Type inference failed for: r9v350 */
    /* JADX WARN: Type inference failed for: r9v351 */
    /* JADX WARN: Type inference failed for: r9v352 */
    /* JADX WARN: Type inference failed for: r9v353 */
    /* JADX WARN: Type inference failed for: r9v354 */
    /* JADX WARN: Type inference failed for: r9v355 */
    /* JADX WARN: Type inference failed for: r9v356 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v61, types: [java.lang.String] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r49) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.riskui.ui.RiskPinVerifyActivity.attachBaseContext(android.content.Context):void");
    }

    public static String $r8$lambda$Ez0G_ZRN31MeAyKXPO1DUG6qIbM(RiskPinVerifyActivity riskPinVerifyActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 11;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return loginType_delegate$lambda$0(riskPinVerifyActivity);
        }
        loginType_delegate$lambda$0(riskPinVerifyActivity);
        throw null;
    }

    public static void $r8$lambda$HcFQEkVv2qfLDUu3V9hCSPTz5zE(RiskPinVerifyActivity riskPinVerifyActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 109;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        onConfirmClick$lambda$3(riskPinVerifyActivity, activityResult);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean $r8$lambda$W_ggKvz55Wdu4aCUl_38cQwx7gw(RiskPinVerifyActivity riskPinVerifyActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 51;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return supportForgetPin_delegate$lambda$2(riskPinVerifyActivity);
        }
        supportForgetPin_delegate$lambda$2(riskPinVerifyActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String $r8$lambda$iJ1X6ursmDehHh8PQeOk8HkT8bM(RiskPinVerifyActivity riskPinVerifyActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 25;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String str = token_delegate$lambda$1(riskPinVerifyActivity);
        int i4 = getAsAtTimestamp + 109;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 93;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onStart();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = getAsAtTimestamp + 59;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
