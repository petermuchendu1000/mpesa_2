package com.huawei.digitalpayment.consumer.login.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.Editable;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.work.WorkRequest;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alipay.plus.security.lite.SecLiteException;
import com.blankj.utilcode.constant.CacheConstants;
import com.blankj.utilcode.util.ActivityUtils;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.gson.Gson;
import com.huawei.arouter.RouteUtils;
import com.huawei.biometric.constants.BiometricConstants;
import com.huawei.biometric.service.IBiometricService;
import com.huawei.biometric.util.BiometricHelper2;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.module.UserLifecycleManager;
import com.huawei.common.safe.SafeUri;
import com.huawei.common.util.FastClickUtils;
import com.huawei.common.util.SPUtils;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.MPTextWatcher;
import com.huawei.digitalpayment.consumer.base.sms.SmsAutoFill;
import com.huawei.digitalpayment.consumer.base.ui.widget.SafeOtpInputKeyboard;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import com.huawei.digitalpayment.consumer.baselib.dialog.CommonDialog;
import com.huawei.digitalpayment.consumer.baselib.init.TokenHelper;
import com.huawei.digitalpayment.consumer.baselib.util.DialogUtils;
import com.huawei.digitalpayment.consumer.baselib.util.PhoneUtils;
import com.huawei.digitalpayment.consumer.baselib.util.SpannableStringUtils;
import com.huawei.digitalpayment.consumer.login.R;
import com.huawei.digitalpayment.consumer.login.databinding.ActivityOtpVerifyBinding;
import com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity;
import com.huawei.digitalpayment.consumer.login.util.LoginUtils;
import com.huawei.digitalpayment.consumer.login.util.RiskUtil;
import com.huawei.digitalpayment.consumer.login.viewmodel.GmsLoginViewModel;
import com.huawei.digitalpayment.consumer.login.vm.BiometricLoginViewModel;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model.LocalQueryLoginType;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model.SmsCodeType;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.OtpLoginParams;
import com.huawei.digitalpayment.consumer.loginModule.login.viewmodel.OtpLoginViewModel;
import com.huawei.digitalpayment.consumer.risk.bean.ProcessVerifyParams;
import com.huawei.digitalpayment.consumer.risk.constant.RiskConstant;
import com.huawei.digitalpayment.consumer.service.ILoginModuleService;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;
import com.huawei.payment.mvvm.Utils;
import com.safaricom.mpesa.logging.L;
import dagger.hilt.android.AndroidEntryPoint;
import j$.util.DesugarTimeZone;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Function;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.cancelNotification;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u001f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\b\u0010!\u001a\u00020\"H\u0002J\u0012\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\b\u0010&\u001a\u00020\"H\u0002J\b\u0010'\u001a\u00020\"H\u0002J\b\u0010(\u001a\u00020\"H\u0002J\b\u0010)\u001a\u00020\"H\u0014J\u0017\u0010*\u001a\u00020\"2\b\u0010+\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0002\u0010,J\b\u0010-\u001a\u00020\"H\u0002J\b\u0010.\u001a\u00020\"H\u0002J\b\u0010/\u001a\u00020\"H\u0002J\b\u00100\u001a\u00020\"H\u0002J\b\u00101\u001a\u00020\"H\u0002J\b\u00102\u001a\u00020\"H\u0002J\b\u00103\u001a\u00020\"H\u0002J\u0012\u00104\u001a\u00020\"2\b\u00105\u001a\u0004\u0018\u00010\u0007H\u0002J\u0018\u00106\u001a\u00020\"2\u000e\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010908H\u0002J\u0018\u0010:\u001a\u00020\"2\u0006\u0010;\u001a\u00020<2\u0006\u0010\u001a\u001a\u00020\u0007H\u0002J\u0012\u0010=\u001a\u00020\"2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010>\u001a\u00020\"2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010?\u001a\u00020\"2\b\u0010@\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010A\u001a\u00020\"H\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010 ¨\u0006B"}, d2 = {"Lcom/huawei/digitalpayment/consumer/login/ui/activity/OtpVerifyActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcBaseActivity;", "Lcom/huawei/digitalpayment/consumer/login/databinding/ActivityOtpVerifyBinding;", "Lcom/huawei/digitalpayment/consumer/loginModule/login/viewmodel/OtpLoginViewModel;", "<init>", "()V", "NEW_DEVICE_LOGIN", "", "OPERATION_FAILED", "GMS_LOGIN", "loginViewModel", "Lcom/huawei/digitalpayment/consumer/login/vm/BiometricLoginViewModel;", "gmsLoginViewModel", "Lcom/huawei/digitalpayment/consumer/login/viewmodel/GmsLoginViewModel;", "getGmsLoginViewModel", "()Lcom/huawei/digitalpayment/consumer/login/viewmodel/GmsLoginViewModel;", "setGmsLoginViewModel", "(Lcom/huawei/digitalpayment/consumer/login/viewmodel/GmsLoginViewModel;)V", KeysConstants.KEY_IS_SUPPORT_FINGERPRINT_LOGIN, "", KeysConstants.KEY_IS_SUPPORT_FACE_LOGIN, KeysConstants.KEY_IS_SUPPORT_PIN_LOGIN, "localQueryLoginType", "Lcom/huawei/digitalpayment/consumer/loginModule/login/data/source/local/model/LocalQueryLoginType;", "isChanged", "tempToken", KeysConstants.KEY_LOGIN_TYPE, "canSendSms", "getLayoutId", "", "downTimer", "com/huawei/digitalpayment/consumer/login/ui/activity/OtpVerifyActivity$downTimer$1", "Lcom/huawei/digitalpayment/consumer/login/ui/activity/OtpVerifyActivity$downTimer$1;", "startTimer", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "registerSms", "initListener", "initView", "onResume", "showLoginPriority", "aBoolean", "(Ljava/lang/Boolean;)V", "showLastLogin", BiometricConstants.KEY_ALIAS_FINGERPRINT_LOGIN, BiometricConstants.KEY_ALIAS_FACE_ID_LOGIN, "initBiometricViewModelIfNeed", "getSmsCode", "sendSms", "addObserver", "saveLoginType", "biometricType", "onLoginResponse", "loginInfoResource", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/loginModule/login/data/source/local/LocalLoginInfo;", "doRiskProcess", "params", "Lcom/huawei/digitalpayment/consumer/risk/bean/ProcessVerifyParams;", "doLogin", "autoLogin", "initToolbar", "title", "onBackPressed", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class OtpVerifyActivity extends Hilt_OtpVerifyActivity<ActivityOtpVerifyBinding, OtpLoginViewModel> {
    public static final int $stable = 8;
    private static int ArtificialStackFrames;
    private static char ShareDataUIState;
    private static long component1;
    private static int component2;
    private static long component3;
    private static int component4;
    private static int copy;
    private static char[] copydefault;
    private static byte[] equals;
    private static int getAsAtTimestamp;
    private static short[] getRequestBeneficiariesState;
    private boolean canSendSms;
    public GmsLoginViewModel gmsLoginViewModel;
    private boolean isChanged;
    private boolean isSupportPin;
    private LocalQueryLoginType localQueryLoginType;
    private String loginType;
    private BiometricLoginViewModel loginViewModel;
    private boolean supportFaceLogin;
    private boolean supportFingerprintLogin;
    private String tempToken;
    private static final byte[] $$l = {Ascii.GS, -59, -25, -119};
    private static final int $$o = 36;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$s = {81, 99, 107, 124, -17, -3, 58, -74, 13, -10, 0, -22, 4, 1, -17, -3, 58, -59, -6, -19, 5, -3, -12, -10, -11, 1, -6, 10, -13, 58, -58, -17, -3, -8, -4, -4, 4, -14, -11, -4, SignedBytes.MAX_POWER_OF_TWO, -58, -10, -6, -12, Base64.padSymbol, -25, -36, -23, 9, Ascii.SUB, -40, -8, -13, 10, -18, 42, -42, -6, -12, 32, -46, 75, -5, -38, -56, -1, 10, -18, -1, 8, -16, 20, -43, 6, -11, 7, -2, -20, 6, 1, Ascii.DC2, -26, -17, 6, -7, -2, 44, -17, -3, -8, -4, -4, 4, -14, -11, Base64.padSymbol, -17, -3, -8, -4, -4, 4, -14, -11, 60, -17, -6, -14, Ascii.DLE, -6, -6, 0, -25, 4, -13};
    private static final int $$t = 240;
    private static final byte[] $$d = {70, -47, -65, TarHeader.LF_BLK, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 2;
    private static int getSponsorBeneficiariesState = 0;
    private static int hashCode = 0;
    private static int toString = 1;
    private final String NEW_DEVICE_LOGIN = RiskConstant.LOGIN_TYPE_NEW_DEVICE_LOGIN;
    private final String OPERATION_FAILED = "error.common.verify_process_operation_failed";
    private final String GMS_LOGIN = "GSMLogin";
    private OtpVerifyActivity$downTimer$1 downTimer = new CountDownTimer() {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        {
            super(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, 1000L);
        }

        @Override
        public void onTick(long millisUntilFinished) {
            int i = 2 % 2;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss", Locale.ENGLISH);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            String str = simpleDateFormat.format(new Date(millisUntilFinished));
            Intrinsics.checkNotNullExpressionValue(str, "");
            String str2 = str;
            SpannableStringUtils.INSTANCE.medium(SpannableStringUtils.INSTANCE.bold(new SpannableString(str2), new String[0]), str);
            ((ActivityOtpVerifyBinding) OtpVerifyActivity.access$getBinding$p(this.component3)).tvCountDown.setText(str2);
            int i2 = copydefault + 115;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override
        public void onFinish() {
            TextView textView;
            int i;
            int i2 = 2 % 2;
            int i3 = copydefault + 99;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                ((ActivityOtpVerifyBinding) OtpVerifyActivity.access$getBinding$p(this.component3)).tvCountDown.setVisibility(78);
                textView = ((ActivityOtpVerifyBinding) OtpVerifyActivity.access$getBinding$p(this.component3)).tvResend;
                i = 1;
            } else {
                ((ActivityOtpVerifyBinding) OtpVerifyActivity.access$getBinding$p(this.component3)).tvCountDown.setVisibility(8);
                textView = ((ActivityOtpVerifyBinding) OtpVerifyActivity.access$getBinding$p(this.component3)).tvResend;
                i = 0;
            }
            textView.setVisibility(i);
        }
    };

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component3 implements Observer, FunctionAdapter {
        private static int component2 = 0;
        private static int component3 = 1;
        private final Function1 component1;

        component3(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.component1 = function1;
        }

        public final boolean equals(Object obj) {
            boolean zAreEqual;
            int i = 2 % 2;
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                int i2 = component2 + 35;
                component3 = i2 % 128;
                int i3 = i2 % 2;
            } else {
                zAreEqual = false;
            }
            int i4 = component3 + 79;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return zAreEqual;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 21;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.component1;
            int i5 = i2 + 119;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                return function1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 3;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                getFunctionDelegate().hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = component2 + 121;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 46 / 0;
            }
            return iHashCode;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 27;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                this.component1.invoke(obj);
                int i3 = 52 / 0;
            } else {
                this.component1.invoke(obj);
            }
            int i4 = component3 + 113;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static String $$r(short s, int i, int i2) {
        byte[] bArr = $$l;
        int i3 = s + 4;
        int i4 = i * 2;
        int i5 = i2 + 98;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        int i7 = -1;
        if (bArr == null) {
            i5 = (-i5) + i6;
            i7 = -1;
        }
        while (true) {
            int i8 = i7 + 1;
            bArr2[i8] = (byte) i5;
            if (i8 == i6) {
                return new String(bArr2, 0);
            }
            i3++;
            i5 = (-bArr[i3]) + i5;
            i7 = i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(byte r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 2
            int r5 = r5 + 83
            byte[] r0 = com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity.$$d
            int r7 = r7 + 4
            int r1 = r6 + 4
            byte[] r1 = new byte[r1]
            int r6 = r6 + 3
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r5
            r5 = r6
            r3 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
        L27:
            int r5 = r5 + r4
            int r5 = r5 + (-8)
            int r7 = r7 + 1
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity.i(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r0 = r7 + 10
            byte[] r1 = com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity.$$s
            int r6 = r6 * 2
            int r6 = 99 - r6
            int r5 = r5 * 3
            int r5 = r5 + 4
            byte[] r0 = new byte[r0]
            int r7 = r7 + 9
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r6
            r4 = r2
            r6 = r5
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L27:
            r3 = r1[r5]
        L29:
            int r3 = -r3
            int r5 = r5 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-5)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity.j(int, short, short, java.lang.Object[]):void");
    }

    public static final void access$doLogin(OtpVerifyActivity otpVerifyActivity, String str) {
        int i = 2 % 2;
        int i2 = hashCode + 71;
        toString = i2 % 128;
        int i3 = i2 % 2;
        otpVerifyActivity.doLogin(str);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$doRiskProcess(OtpVerifyActivity otpVerifyActivity, ProcessVerifyParams processVerifyParams, String str) {
        int i = 2 % 2;
        int i2 = toString + 109;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        otpVerifyActivity.doRiskProcess(processVerifyParams, str);
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        int i5 = toString + 41;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final ViewDataBinding access$getBinding$p(OtpVerifyActivity otpVerifyActivity) {
        int i = 2 % 2;
        int i2 = toString + 51;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = otpVerifyActivity.binding;
        if (i3 != 0) {
            int i4 = 19 / 0;
        }
        int i5 = hashCode + 113;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return binding;
    }

    public static final LocalQueryLoginType access$getLocalQueryLoginType$p(OtpVerifyActivity otpVerifyActivity) {
        int i = 2 % 2;
        int i2 = hashCode + 55;
        toString = i2 % 128;
        int i3 = i2 % 2;
        LocalQueryLoginType localQueryLoginType = otpVerifyActivity.localQueryLoginType;
        if (i3 != 0) {
            return localQueryLoginType;
        }
        throw null;
    }

    public static final BiometricLoginViewModel access$getLoginViewModel$p(OtpVerifyActivity otpVerifyActivity) {
        int i = 2 % 2;
        int i2 = toString + 93;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        BiometricLoginViewModel biometricLoginViewModel = otpVerifyActivity.loginViewModel;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 1;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return biometricLoginViewModel;
    }

    public static final String access$getNEW_DEVICE_LOGIN$p(OtpVerifyActivity otpVerifyActivity) {
        int i = 2 % 2;
        int i2 = toString + 17;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        String str = otpVerifyActivity.NEW_DEVICE_LOGIN;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 27;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final void access$initBiometricViewModelIfNeed(OtpVerifyActivity otpVerifyActivity) {
        int i = 2 % 2;
        int i2 = toString + 89;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        otpVerifyActivity.initBiometricViewModelIfNeed();
        int i4 = toString + 77;
        hashCode = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$onLoginResponse(OtpVerifyActivity otpVerifyActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = hashCode + 49;
        toString = i2 % 128;
        int i3 = i2 % 2;
        otpVerifyActivity.onLoginResponse(resource);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$saveLoginType(OtpVerifyActivity otpVerifyActivity, String str) {
        int i = 2 % 2;
        int i2 = hashCode + 55;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        otpVerifyActivity.saveLoginType(str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = toString + 63;
        hashCode = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final void access$setLoginType$p(OtpVerifyActivity otpVerifyActivity, String str) {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 59;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        otpVerifyActivity.loginType = str;
        int i5 = i2 + 3;
        hashCode = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$showLoginPriority(OtpVerifyActivity otpVerifyActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = toString + 63;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        otpVerifyActivity.showLoginPriority(bool);
        int i4 = hashCode + 97;
        toString = i4 % 128;
        int i5 = i4 % 2;
    }

    public final GmsLoginViewModel getGmsLoginViewModel() {
        int i = 2 % 2;
        int i2 = hashCode + 125;
        toString = i2 % 128;
        int i3 = i2 % 2;
        GmsLoginViewModel gmsLoginViewModel = this.gmsLoginViewModel;
        if (gmsLoginViewModel != null) {
            return gmsLoginViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = toString + 49;
        hashCode = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final void setGmsLoginViewModel(GmsLoginViewModel gmsLoginViewModel) {
        int i = 2 % 2;
        int i2 = hashCode + 87;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(gmsLoginViewModel, "");
            this.gmsLoginViewModel = gmsLoginViewModel;
            throw null;
        }
        Intrinsics.checkNotNullParameter(gmsLoginViewModel, "");
        this.gmsLoginViewModel = gmsLoginViewModel;
        int i3 = toString + 111;
        hashCode = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = toString + 91;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_otp_verify;
        int i5 = hashCode + 93;
        toString = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void k(int i, char c2, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i) {
            int i4 = $11 + 81;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(copydefault[i2 + i6])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1758 - ExpandableListView.getPackedPositionType(0L), 34 - (ViewConfiguration.getEdgeSlop() >> 16), (char) ((-16777216) - Color.rgb(0, 0, 0)), 1159210934, false, $$r(b2, b3, (byte) (b3 | Ascii.ETB)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(component3), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3608 - ExpandableListView.getPackedPositionType(0L), Color.blue(0) + 29, (char) (ImageFormat.getBitsPerPixel(0) + 7172), 1951385784, false, $$r(b4, b5, (byte) (b5 | 19)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4012 - TextUtils.indexOf((CharSequence) "", '0', 0), 24 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 27760), -1529629956, false, $$r(b6, b7, (byte) (b7 | Ascii.CAN)), new Class[]{Object.class, Object.class});
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
        char[] cArr = new char[i];
        cancelnotification.copydefault = 0;
        int i7 = $11 + 21;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        while (cancelnotification.copydefault < i) {
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr5 = {cancelnotification, cancelnotification};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault4 == null) {
                byte b8 = (byte) (-1);
                byte b9 = (byte) (b8 + 1);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(4012 - MotionEvent.axisFromString(""), 24 - (ViewConfiguration.getTapTimeout() >> 16), (char) (MotionEvent.axisFromString("") + 27762), -1529629956, false, $$r(b8, b9, (byte) (b9 | Ascii.CAN)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    private final void startTimer() {
        int i = 2 % 2;
        int i2 = hashCode + 99;
        toString = i2 % 128;
        int i3 = i2 % 2;
        start();
        ((ActivityOtpVerifyBinding) this.binding).etCode.requestFocus();
        ((ActivityOtpVerifyBinding) this.binding).tvCountDown.setVisibility(0);
        ((ActivityOtpVerifyBinding) this.binding).tvResend.setVisibility(8);
        int i4 = hashCode + 41;
        toString = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static void g(int i, char[] cArr, char[] cArr2, char[] cArr3, char c2, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        while (iNotificationSideChannel.copydefault < length3) {
            int i3 = $11 + 29;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(ImageFormat.getBitsPerPixel(0) + 4038, View.resolveSizeAndState(0, 0, 0) + 31, (char) (19181 - TextUtils.getOffsetAfter("", 0)), 1912513118, false, $$r(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7566, 11 - View.combineMeasuredStates(0, 0), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 2006389106, false, "e", new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) (-1);
                            byte b5 = (byte) (b4 + 1);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0, 0) + 2460, TextUtils.indexOf("", "", 0) + 28, (char) KeyEvent.getDeadChar(0, 0), 931716605, false, $$r(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                            if (objCopydefault4 == null) {
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7568 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = iNotificationSideChannel.component3;
                            cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[iNotificationSideChannel.copydefault])) ^ (component1 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component2) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) ShareDataUIState) ^ (-3780477796495014671L)))));
                            iNotificationSideChannel.copydefault++;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr6);
        int i5 = $10 + 117;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/huawei/digitalpayment/consumer/login/ui/activity/OtpVerifyActivity$registerSms$1", "Lcom/huawei/common/listener/ApiCallback;", "", "onSuccess", "", "value", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C08431 implements ApiCallback<String> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;

        C08431() {
        }

        @Override
        public void onSuccess(String str) {
            int i = 2 % 2;
            int i2 = component1 + 51;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            onSuccess2(str);
            int i4 = ShareDataUIState + 39;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }

        public void onSuccess2(String value) {
            int i = 2 % 2;
            ((ActivityOtpVerifyBinding) OtpVerifyActivity.access$getBinding$p(OtpVerifyActivity.this)).etCode.setText(value);
            LoadingButton loadingButton = ((ActivityOtpVerifyBinding) OtpVerifyActivity.access$getBinding$p(OtpVerifyActivity.this)).btnConfirm;
            final OtpVerifyActivity otpVerifyActivity = OtpVerifyActivity.this;
            loadingButton.postDelayed(new Runnable() {
                private static int component2 = 0;
                private static int copydefault = 1;

                @Override
                public final void run() {
                    int i2 = 2 % 2;
                    int i3 = component2 + 23;
                    copydefault = i3 % 128;
                    int i4 = i3 % 2;
                    OtpVerifyActivity.C08431.$r8$lambda$QH4fvWRJS45j6vwMga5rZyCna8E(otpVerifyActivity);
                    if (i4 == 0) {
                        throw null;
                    }
                }
            }, 500L);
            int i2 = ShareDataUIState + 113;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final void component1(OtpVerifyActivity otpVerifyActivity) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 35;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(otpVerifyActivity, "");
                ((ActivityOtpVerifyBinding) OtpVerifyActivity.access$getBinding$p(otpVerifyActivity)).btnConfirm.performClick();
            } else {
                Intrinsics.checkNotNullParameter(otpVerifyActivity, "");
                ((ActivityOtpVerifyBinding) OtpVerifyActivity.access$getBinding$p(otpVerifyActivity)).btnConfirm.performClick();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public static void $r8$lambda$QH4fvWRJS45j6vwMga5rZyCna8E(OtpVerifyActivity otpVerifyActivity) {
            int i = 2 % 2;
            int i2 = component1 + 109;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            component1(otpVerifyActivity);
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0247 A[PHI: r0
  0x0247: PHI (r0v9 int) = (r0v8 int), (r0v34 int) binds: [B:52:0x0245, B:49:0x0234] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0251 A[PHI: r0
  0x0251: PHI (r0v31 int) = (r0v8 int), (r0v34 int) binds: [B:52:0x0245, B:49:0x0234] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(short r25, byte r26, int r27, int r28, int r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 879
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity.h(short, byte, int, int, int, java.lang.Object[]):void");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        Object[] objArr;
        OtpVerifyActivity otpVerifyActivity;
        boolean z;
        boolean zAreEqual;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952847_res_0x7f1304cf).substring(21, 22).codePointAt(0) - 32, new char[]{63705, 59949, 50134, 56009, 3852, 1699, 60678, 53574, 51946, 43246, 45157, 49205, 50333, 28032, 35161, 8528, 8120, 27980}, new char[]{62502, 33505, 41411, 13479}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952718_res_0x7f13044e).substring(6, 7).codePointAt(0) + 42881), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        g((-428540939) - Color.argb(0, 0, 0, 0), new char[]{3492, 18083, 5740, 20683, 21659}, new char[]{62860, 29947, 21734, 2993}, new char[]{0, 0, 0, 0}, (char) (ImageFormat.getBitsPerPixel(0) + 45397), objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                h((short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(13) - 46), (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952721_res_0x7f130451).substring(6, 7).codePointAt(0) - 32), View.resolveSize(0, 0) - 1725821616, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 30, View.getDefaultSize(0, 0) - 71734102, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, new char[]{7582, 59345, 38849, 44885, 47401, 31528, 59036, 30289, 40634, 29016, 34839, 52442, 11290, 46450, 58337, 5389, 34554, 52718}, new char[]{28025, 55392, 24509, 14878}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952847_res_0x7f1304cf).substring(21, 22).codePointAt(0) + 7743), objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                    int i2 = toString + 83;
                    hashCode = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 4 / 3;
                    }
                    baseContext = null;
                } else {
                    baseContext = baseContext.getApplicationContext();
                }
            }
            if (baseContext != null) {
                int i4 = toString + 9;
                hashCode = i4 % 128;
                int i5 = i4 % 2;
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        try {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6617, 42 - Color.green(0), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 428292935, false, "ShareDataUIState", new Class[0]);
                        } catch (Throwable th) {
                            th = th;
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    h((short) Color.alpha(0), (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952767_res_0x7f13047f).substring(12, 13).codePointAt(0) - 32), TextUtils.getOffsetBefore("", 0) - 1725821591, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(25) - 95, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952747_res_0x7f13046b).substring(22, 23).codePointAt(0) - 71734134, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    g(ViewConfiguration.getScrollDefaultDelay() >> 16, new char[]{20990, 25935, 4802, 37847, 46820, 29708, 38045, 64111, 57852, 59882, 34674, 37495, 3802, 1155, 33917, 39030, 33015, 8508, 48344, 35057, 4232, 21263, 39855, 58801, 37335, 43772, 7174, 29983, 19015, 20862, 50144, 28229, 49445, 22257, 60414, 53388, 16287, 27195, 32996, 45591, 29910, 17223, 47692, 28219, 39914, 46401, 7186, 57894, 19896, 52142, 17647, 37526, 44248, 15052, 29263, 20298, 15828, 45617, 2133, 7521, 48569, 42627, 11483, 63355}, new char[]{1406, 16720, 18285, 52198}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952718_res_0x7f13044e).substring(6, 7).length() - 1), objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    g(Process.myPid() >> 22, new char[]{21830, 6150, 52530, 12590, 26807, 19077, 17891, 26078, 25735, 58182, 12220, 59657, 55806, 16924, 48638, 43647, 15293, 27413, 33554, 7528, 63754, 13116, 18732, 50630, 22340, 399, 52348, 58650, 57658, 26337, 41519, 38302, 47778, 31977, 28881, 37177, 62838, 45114, 23451, 43024, 36242, 25125, 35876, 19675, 48858, 38398, 44069, 13952, 49653, 64121, 17721, 20269, 45711, 55214, 55734, 37904, 44663, 57686, 64780, 1229, 11792, 12843, 38047, 16883}, new char[]{41763, 47591, 21703, 22490}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952720_res_0x7f130450).substring(6, 7).length() - 1), objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    g(TextUtils.indexOf("", "", 0, 0), new char[]{611, 22050, 23724, 55312, 20248, 31285, 56080, 65169, 6538, 5818, 57074, 47198, 7134, 58473, 52571, 59791, 10400, 49279, 2013, 328, 58125, 35578, 739, 51033, 22704, 42547, 37527, 13366, 5758, 15624, 12816, 9924, 42655, 62755, 33954, 51897, 49509, 61696, 50094, 30163, 445, 38688, 47869, 38729, 30137, 9515, 41064, 9345, 54267, 44195, 56419, 65275, 39215, 49210, 48498, 27275, 27688, 9004, 49265, 59395, 275, 21771, 10509, 1052, 31635, 64964, 22999, 45034, 9952, 18414, 17037, 60631}, new char[]{7096, 21870, 43776, 63875}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131954889_res_0x7f130cc9).substring(0, 1).codePointAt(0) - 8226), objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    h((short) Drawable.resolveOpacity(0, 0), (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131954589_res_0x7f130b9d).substring(0, 2).length() - 1725821546, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952303_res_0x7f1302af).substring(0, 2).codePointAt(1) - 67, (-71734143) - TextUtils.indexOf((CharSequence) "", '0'), objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    g(View.getDefaultSize(0, 0), new char[]{39240, 60279, 42480, 5030, 8317, 40836, 32886, 20790, 60264, 36560, 43202, 190, 32487, 16389, 49396, 31602, 35083, 34039, 35182, 27171, 40184, 38760, 37279, 25505, 61565, 29419, 42160, 61405, 41195, 15661, 26077, 25838, 27714, 14691, 3503, 14268}, new char[]{10298, 22486, 58334, 36209}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29), objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 56, (char) Color.red(0), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr12);
                    int i6 = hashCode + 9;
                    toString = i6 % 128;
                    int i7 = i6 % 2;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
        if (objCopydefault3 == null) {
            int iMyTid = 2405 - (Process.myTid() >> 22);
            int i8 = 27 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            byte[] bArr = $$d;
            byte b2 = (byte) (-bArr[22]);
            byte b3 = bArr[33];
            Object[] objArr13 = new Object[1];
            i(b2, b3, b3, objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iMyTid, i8, maximumDrawingCacheSize, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                int i9 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2405;
                int i10 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 25;
                char maximumDrawingCacheSize2 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                Object[] objArr14 = new Object[1];
                i((byte) (-$$d[22]), r0[8], r0[67], objArr14);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i9, i10, maximumDrawingCacheSize2, 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(14) - 109, new char[]{13078, 13740, 1507, 40430, 1317, 55897, 15736, 52736, 35395, 22725, 35924, 63329, 45389, 38029, 35434, 63388}, new char[]{13211, 10016, 37535, 18894}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(19) + 52836), objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            h((short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(16) + SecLiteException.ERROR_API_KEY_OR_SIGN), (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952747_res_0x7f13046b).substring(22, 23).codePointAt(0) - 1725821571, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(24) - 126, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952792_res_0x7f130498).substring(2, 3).length() - 71734095, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i11 = toString + 35;
            hashCode = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, 835579948};
                byte[] bArr2 = $$s;
                byte b4 = bArr2[10];
                Object[] objArr18 = new Object[1];
                j(b4, b4, bArr2[62], objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b5 = bArr2[10];
                Object[] objArr19 = new Object[1];
                j((byte) 28, b5, b5, objArr19);
                Object[] objArr20 = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int iAlpha = Color.alpha(0) + 2405;
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 26;
                    char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    Object[] objArr21 = new Object[1];
                    i((byte) (-$$d[22]), r5[8], r5[67], objArr21);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iAlpha, scrollDefaultDelay, scrollBarFadeDuration, 24929979, false, (String) objArr21[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr20);
                try {
                    Object[] objArr22 = new Object[1];
                    h((short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952781_res_0x7f13048d).substring(14, 15).length() - 1), (byte) TextUtils.indexOf("", ""), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 1725821524, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 34, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 71734131, objArr22);
                    Class<?> cls5 = Class.forName((String) objArr22[0]);
                    Object[] objArr23 = new Object[1];
                    h((short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952303_res_0x7f1302af).substring(0, 2).codePointAt(0) - 49), (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952715_res_0x7f13044b).substring(6, 7).length() - 1), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131954889_res_0x7f130cc9).substring(0, 1).codePointAt(0) - 1725829729, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952717_res_0x7f13044d).substring(6, 7).length() - 13, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952717_res_0x7f13044d).substring(6, 7).codePointAt(0) - 71734130, objArr23);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr23[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        int keyRepeatDelay = 2405 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int iIndexOf = TextUtils.indexOf("", "") + 26;
                        char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                        Object[] objArr24 = new Object[1];
                        i((byte) ($$e | 8), (byte) (-$$d[38]), r8[21], objArr24);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatDelay, iIndexOf, deadChar, -1843538389, false, (String) objArr24[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2405;
                        int i13 = 27 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                        byte[] bArr3 = $$d;
                        byte b6 = (byte) (-bArr3[22]);
                        byte b7 = bArr3[33];
                        Object[] objArr25 = new Object[1];
                        i(b6, b7, b7, objArr25);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(doubleTapTimeout, i13, cIndexOf, -2047739879, false, (String) objArr25[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf2);
                    objArr = objArr20;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 == null) {
                    throw th3;
                }
                throw cause2;
            }
        }
        int i14 = ((int[]) objArr[0])[0];
        int i15 = ((int[]) objArr[2])[0];
        if (i15 != i14) {
            long j = -1;
            long j2 = ((long) (i15 ^ i14)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32)) | j2;
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 6618, 42 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            try {
                Object[] objArr26 = {705129339, Long.valueOf(j4), new ArrayList(), null, true};
                Class cls6 = (Class) ITrustedWebActivityCallbackDefault.copydefault(6562 - View.resolveSizeAndState(0, 0, 0), 56 - KeyEvent.getDeadChar(0, 0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16));
                byte[] bArr4 = $$s;
                byte b8 = (byte) (bArr4[60] - 1);
                byte b9 = bArr4[10];
                Object[] objArr27 = new Object[1];
                j(b8, b9, b9, objArr27);
                cls6.getMethod((String) objArr27[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr26);
            } catch (Throwable th4) {
                Throwable cause3 = th4.getCause();
                if (cause3 == null) {
                    throw th4;
                }
                throw cause3;
            }
        }
        super.onCreate(savedInstanceState);
        try {
            otpVerifyActivity = this;
        } catch (Exception e) {
            e = e;
            otpVerifyActivity = this;
        }
        try {
            otpVerifyActivity.localQueryLoginType = (LocalQueryLoginType) getIntent().getSerializableExtra("queryLoginType");
        } catch (Exception e2) {
            e = e2;
            String message = e.getMessage();
            if (message != null) {
                L l = L.INSTANCE;
                String str6 = otpVerifyActivity.TAG;
                Intrinsics.checkNotNullExpressionValue(str6, "");
                l.d(str6, message, new Object[0]);
                int i16 = toString + 29;
                hashCode = i16 % 128;
                int i17 = i16 % 2;
            }
        }
        LocalQueryLoginType localQueryLoginType = otpVerifyActivity.localQueryLoginType;
        if (localQueryLoginType != null) {
            if (localQueryLoginType != null) {
                z = true;
                zAreEqual = Intrinsics.areEqual((Object) true, (Object) localQueryLoginType.getSupportFingerprintLogin());
            } else {
                z = true;
                zAreEqual = false;
            }
            otpVerifyActivity.supportFingerprintLogin = zAreEqual;
            LocalQueryLoginType localQueryLoginType2 = otpVerifyActivity.localQueryLoginType;
            otpVerifyActivity.supportFaceLogin = localQueryLoginType2 != null ? Intrinsics.areEqual(Boolean.valueOf(z), localQueryLoginType2.getSupportFaceLogin()) : false;
            LocalQueryLoginType localQueryLoginType3 = otpVerifyActivity.localQueryLoginType;
            otpVerifyActivity.isSupportPin = localQueryLoginType3 != null ? Intrinsics.areEqual(Boolean.valueOf(z), localQueryLoginType3.isSupportPin()) : false;
        } else {
            otpVerifyActivity.supportFingerprintLogin = getIntent().getBooleanExtra(KeysConstants.KEY_IS_SUPPORT_FINGERPRINT_LOGIN, false);
            otpVerifyActivity.supportFaceLogin = getIntent().getBooleanExtra(KeysConstants.KEY_IS_SUPPORT_FACE_LOGIN, false);
            otpVerifyActivity.isSupportPin = getIntent().getBooleanExtra(KeysConstants.KEY_IS_SUPPORT_PIN_LOGIN, true);
        }
        otpVerifyActivity.setGmsLoginViewModel((GmsLoginViewModel) new ViewModelProvider(otpVerifyActivity).get(GmsLoginViewModel.class));
        otpVerifyActivity.isChanged = getIntent().getBooleanExtra("isChange", false);
        ((ActivityOtpVerifyBinding) otpVerifyActivity.binding).tvTitle.setVisibility(0);
        otpVerifyActivity.tempToken = getIntent().getStringExtra("token");
        ((ActivityOtpVerifyBinding) otpVerifyActivity.binding).tvTitle.setTextDirection(3);
        addObserver();
        SPUtils.getInstance().put(SPConstant.KEY_SHOW_AD, true);
        ((IBiometricService) RouteUtils.getService(IBiometricService.class)).checkBiometricChange(otpVerifyActivity, new ApiCallback<Boolean>() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public void onSuccess(Boolean bool) {
                int i18 = 2 % 2;
                int i19 = component1 + 73;
                ShareDataUIState = i19 % 128;
                int i20 = i19 % 2;
                onSuccess2(bool);
                if (i20 != 0) {
                    int i21 = 22 / 0;
                }
                int i22 = component1 + 103;
                ShareDataUIState = i22 % 128;
                if (i22 % 2 != 0) {
                    int i23 = 54 / 0;
                }
            }

            public void onSuccess2(Boolean aBoolean) {
                int i18 = 2 % 2;
                int i19 = ShareDataUIState + 93;
                component1 = i19 % 128;
                int i20 = i19 % 2;
                super.onSuccess(aBoolean);
                OtpVerifyActivity.access$showLoginPriority(OtpVerifyActivity.this, aBoolean);
                int i21 = component1 + 111;
                ShareDataUIState = i21 % 128;
                if (i21 % 2 != 0) {
                    throw null;
                }
            }
        });
        initView();
        initListener();
        registerSms();
        getSmsCode();
    }

    private final void registerSms() {
        int i = 2 % 2;
        getLifecycle().addObserver(new SmsAutoFill(new C08431()));
        int i2 = hashCode + 75;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 58 / 0;
        }
    }

    private static final void initListener$lambda$1(OtpVerifyActivity otpVerifyActivity, View view) {
        String str = "";
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(otpVerifyActivity, "");
        String strValueOf = String.valueOf(((ActivityOtpVerifyBinding) otpVerifyActivity.binding).etCode.getText());
        L.INSTANCE.d("Time", "开始登录 " + System.currentTimeMillis(), new Object[0]);
        LocalQueryLoginType localQueryLoginType = otpVerifyActivity.localQueryLoginType;
        if (localQueryLoginType != null) {
            int i2 = hashCode + 57;
            toString = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (localQueryLoginType != null && Intrinsics.areEqual((Object) true, (Object) localQueryLoginType.getNewProcess())) {
                LocalQueryLoginType localQueryLoginType2 = otpVerifyActivity.localQueryLoginType;
                if (localQueryLoginType2 != null) {
                    int i3 = toString + 59;
                    hashCode = i3 % 128;
                    if (i3 % 2 != 0) {
                        localQueryLoginType2.getLoginType();
                        throw null;
                    }
                    String loginType = localQueryLoginType2.getLoginType();
                    if (loginType != null) {
                        str = loginType;
                    }
                }
                otpVerifyActivity.doRiskProcess(new ProcessVerifyParams(str, strValueOf, "Login", SPUtils.getInstance().getString("recent_login_phone_number")), "3");
                return;
            }
        }
        ((OtpLoginViewModel) otpVerifyActivity.viewModel).otpLogin(new OtpLoginParams(strValueOf));
    }

    private static final void initListener$lambda$2(OtpVerifyActivity otpVerifyActivity, View view) {
        int i = 2 % 2;
        int i2 = toString + 75;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(otpVerifyActivity, "");
        otpVerifyActivity.onBackPressed();
        int i4 = toString + 101;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void initListener() {
        int i = 2 % 2;
        FastClickUtils.setOnClickListener(((ActivityOtpVerifyBinding) this.binding).btnConfirm, new View.OnClickListener() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component3 + 15;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                OtpVerifyActivity.$r8$lambda$7ICo_Kmrqi9oRkNOpXqVKShsl1M(this.f$0, view);
                int i5 = ShareDataUIState + 85;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        ((ActivityOtpVerifyBinding) this.binding).virtualKeyboardView.setOnInputListener(new SafeOtpInputKeyboard.OnInputListener() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public void onDelete() {
                int i2 = 2 % 2;
                int i3 = component3 + 41;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    ((ActivityOtpVerifyBinding) OtpVerifyActivity.access$getBinding$p(OtpVerifyActivity.this)).etCode.remove();
                    throw null;
                }
                ((ActivityOtpVerifyBinding) OtpVerifyActivity.access$getBinding$p(OtpVerifyActivity.this)).etCode.remove();
                int i4 = ShareDataUIState + 1;
                component3 = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override
            public void onInput(char c2) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 71;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                ((ActivityOtpVerifyBinding) OtpVerifyActivity.access$getBinding$p(OtpVerifyActivity.this)).etCode.add(Character.valueOf(c2).toString());
                int i5 = component3 + 81;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onBiometric(String value) {
                int i2 = 2 % 2;
                int i3 = component3 + 89;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(value, "");
                int i5 = ShareDataUIState + 83;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onForget() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 11;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
            }
        });
        ((ActivityOtpVerifyBinding) this.binding).ivBack.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component3 + 25;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                OtpVerifyActivity.m10655$r8$lambda$FKpK94vWAOce7DwLqSghHGD5jQ(this.f$0, view);
                int i5 = component1 + 13;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        ((ActivityOtpVerifyBinding) this.binding).tvResend.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component2 + 81;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                OtpVerifyActivity.m10656$r8$lambda$JfO70Fo39Z9sGeFxiFY0TUQ54g(this.f$0, view);
                if (i4 != 0) {
                    int i5 = 15 / 0;
                }
            }
        });
        int i2 = toString + 25;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 10 / 0;
        }
    }

    private static final void initListener$lambda$3(OtpVerifyActivity otpVerifyActivity, View view) {
        int i = 2 % 2;
        int i2 = hashCode + 119;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(otpVerifyActivity, "");
        otpVerifyActivity.getSmsCode();
        int i4 = hashCode + 121;
        toString = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
    }

    private final void initView() {
        int i = 2 % 2;
        ((ActivityOtpVerifyBinding) this.binding).tvResend.setText(Html.fromHtml("<u>" + getString(R.string.resend) + "</u>"));
        ((ActivityOtpVerifyBinding) this.binding).etCode.setGravity(1);
        TextView textView = ((ActivityOtpVerifyBinding) this.binding).tvTips;
        int i2 = R.string.send_message_tips;
        SfcPhoneNumberUtil.Companion companion = SfcPhoneNumberUtil.INSTANCE;
        String recentLoginPhone = PhoneUtils.getRecentLoginPhone();
        Intrinsics.checkNotNullExpressionValue(recentLoginPhone, "");
        textView.setText(getString(i2, new Object[]{companion.formatPhoneNumber(recentLoginPhone, true)}));
        ((ActivityOtpVerifyBinding) this.binding).etCode.setMaxEms(AppConfigManager.getAppConfig().getOtpLimit());
        ((ActivityOtpVerifyBinding) this.binding).etCode.addTextChangedListener(new MPTextWatcher() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public void afterTextChanged(Editable s) {
                int i3 = 2 % 2;
                int i4 = copydefault + 67;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(s, "");
                super.afterTextChanged(s);
                boolean z = true;
                if (!TextUtils.isEmpty(s)) {
                    int i6 = ShareDataUIState + 109;
                    copydefault = i6 % 128;
                    int i7 = i6 % 2;
                    ((ActivityOtpVerifyBinding) OtpVerifyActivity.access$getBinding$p(OtpVerifyActivity.this)).etCode.setError(false);
                }
                LoadingButton loadingButton = ((ActivityOtpVerifyBinding) OtpVerifyActivity.access$getBinding$p(OtpVerifyActivity.this)).btnConfirm;
                if (s.length() == AppConfigManager.getAppConfig().getOtpLimit()) {
                    int i8 = copydefault + 11;
                    int i9 = i8 % 128;
                    ShareDataUIState = i9;
                    int i10 = i8 % 2;
                    int i11 = i9 + 39;
                    copydefault = i11 % 128;
                    int i12 = i11 % 2;
                } else {
                    z = false;
                }
                loadingButton.setEnabled(z);
            }
        });
        int i3 = toString + 31;
        hashCode = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x014c  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity.onResume():void");
    }

    private final void showLoginPriority(Boolean aBoolean) {
        int i = 2 % 2;
        int i2 = hashCode + 69;
        toString = i2 % 128;
        int i3 = i2 % 2;
        if (this.isChanged || Intrinsics.areEqual((Object) aBoolean, (Object) true)) {
            sendSms();
            int i4 = hashCode + 101;
            toString = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        for (String str : LoginUtils.getLoginPriorityList()) {
            if (Intrinsics.areEqual(str, "0") && BiometricHelper2.getInstance().isOpenFaceIdLogin()) {
                int i6 = toString + 35;
                int i7 = i6 % 128;
                hashCode = i7;
                int i8 = i6 % 2;
                if (this.supportFaceLogin) {
                    int i9 = i7 + 7;
                    toString = i9 % 128;
                    if (i9 % 2 != 0) {
                        faceIdLogin();
                        return;
                    } else {
                        faceIdLogin();
                        int i10 = 30 / 0;
                        return;
                    }
                }
            }
            if (Intrinsics.areEqual(str, "1") && BiometricHelper2.getInstance().isOpenFingerprintLogin()) {
                int i11 = toString + 99;
                hashCode = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 62 / 0;
                    if (this.supportFingerprintLogin) {
                        fingerprintLogin();
                        return;
                    }
                } else if (this.supportFingerprintLogin) {
                    fingerprintLogin();
                    return;
                }
            }
            if (Intrinsics.areEqual(str, "3")) {
                sendSms();
                return;
            }
            if (Intrinsics.areEqual(str, "4")) {
                int i13 = toString + 91;
                hashCode = i13 % 128;
                if (i13 % 2 == 0) {
                    showLastLogin();
                    return;
                } else {
                    showLastLogin();
                    throw null;
                }
            }
        }
    }

    private final void showLastLogin() {
        int i = 2 % 2;
        int i2 = hashCode + 91;
        toString = i2 % 128;
        int i3 = i2 % 2;
        String string = SPUtils.getInstance(AppConfigManager.SP_APP).getString(SPConstant.KEY_LAST_LOGIN_TYPE);
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (Intrinsics.areEqual(string, "0") && BiometricHelper2.getInstance().isOpenFaceIdLogin()) {
            int i4 = hashCode + 83;
            toString = i4 % 128;
            int i5 = i4 % 2;
            if (this.supportFaceLogin) {
                faceIdLogin();
                return;
            }
        }
        if (Intrinsics.areEqual(string, "1")) {
            int i6 = hashCode + 21;
            toString = i6 % 128;
            Object obj = null;
            if (i6 % 2 == 0) {
                BiometricHelper2.getInstance().isOpenFingerprintLogin();
                obj.hashCode();
                throw null;
            }
            if (BiometricHelper2.getInstance().isOpenFingerprintLogin()) {
                int i7 = toString + 29;
                hashCode = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
                if (this.supportFingerprintLogin) {
                    fingerprintLogin();
                    return;
                }
            }
        }
        sendSms();
    }

    private final void fingerprintLogin() {
        int i = 2 % 2;
        BiometricHelper2.getInstance().loginWithFingerprint(new ApiCallback<String>() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(String str) {
                int i2 = 2 % 2;
                int i3 = component1 + 79;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(str);
                int i5 = copydefault + 61;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onSuccess2(String value) {
                String loginType;
                int i2 = 2 % 2;
                OtpVerifyActivity.access$initBiometricViewModelIfNeed(OtpVerifyActivity.this);
                if (OtpVerifyActivity.access$getLocalQueryLoginType$p(OtpVerifyActivity.this) != null) {
                    LocalQueryLoginType localQueryLoginTypeAccess$getLocalQueryLoginType$p = OtpVerifyActivity.access$getLocalQueryLoginType$p(OtpVerifyActivity.this);
                    if (localQueryLoginTypeAccess$getLocalQueryLoginType$p != null) {
                        int i3 = copydefault + 55;
                        component1 = i3 % 128;
                        int i4 = i3 % 2;
                        if (Intrinsics.areEqual((Object) true, (Object) localQueryLoginTypeAccess$getLocalQueryLoginType$p.getNewProcess())) {
                            LocalQueryLoginType localQueryLoginTypeAccess$getLocalQueryLoginType$p2 = OtpVerifyActivity.access$getLocalQueryLoginType$p(OtpVerifyActivity.this);
                            if (localQueryLoginTypeAccess$getLocalQueryLoginType$p2 != null) {
                                int i5 = component1 + 107;
                                copydefault = i5 % 128;
                                int i6 = i5 % 2;
                                loginType = localQueryLoginTypeAccess$getLocalQueryLoginType$p2.getLoginType();
                            } else {
                                loginType = null;
                            }
                            if (loginType == null) {
                                int i7 = component1 + 99;
                                copydefault = i7 % 128;
                                int i8 = i7 % 2;
                                loginType = "";
                            }
                            ProcessVerifyParams processVerifyParams = new ProcessVerifyParams(loginType);
                            processVerifyParams.addParams("initiatorMsisdn", PhoneUtils.getRecentLoginPhone());
                            processVerifyParams.addParams("credential", value);
                            processVerifyParams.addParams("biometricType", "01");
                            processVerifyParams.addParams("initiatorMsisdn", PhoneUtils.getRecentLoginPhone());
                            OtpVerifyActivity.access$doRiskProcess(OtpVerifyActivity.this, processVerifyParams, "01");
                            return;
                        }
                    } else {
                        int i9 = copydefault + 11;
                        component1 = i9 % 128;
                        int i10 = i9 % 2;
                    }
                }
                BiometricLoginViewModel biometricLoginViewModelAccess$getLoginViewModel$p = OtpVerifyActivity.access$getLoginViewModel$p(OtpVerifyActivity.this);
                if (biometricLoginViewModelAccess$getLoginViewModel$p != null) {
                    biometricLoginViewModelAccess$getLoginViewModel$p.fingerprintLogin(value);
                    int i11 = component1 + 27;
                    copydefault = i11 % 128;
                    int i12 = i11 % 2;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
            
                if ((r4 % 2) == 0) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
            
                r4 = 3 / 5;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
            
                com.huawei.common.widget.toast.CommonToast.showText(r4.getMessage());
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
            
                if (r4.getCode() == 32) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
            
                if (r4.getCode() == 7) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
            
                com.huawei.common.widget.toast.CommonToast.showText(com.huawei.digitalpayment.consumer.login.R.string.biometric_the_operation_is_too_frequent_please_try_again_later);
                r4 = com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity.C08401.copydefault + 103;
                com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity.C08401.component1 = r4 % 128;
             */
            @Override
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onError(com.huawei.common.exception.BaseException r4) {
                /*
                    r3 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity.C08401.component1
                    int r1 = r1 + 97
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity.C08401.copydefault = r2
                    int r1 = r1 % r0
                    java.lang.String r2 = ""
                    if (r1 != 0) goto L1c
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
                    int r1 = r4.getCode()
                    r2 = 32
                    if (r1 != r2) goto L3a
                    goto L26
                L1c:
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
                    int r1 = r4.getCode()
                    r2 = 7
                    if (r1 != r2) goto L3a
                L26:
                    int r4 = com.huawei.digitalpayment.consumer.login.R.string.biometric_the_operation_is_too_frequent_please_try_again_later
                    com.huawei.common.widget.toast.CommonToast.showText(r4)
                    int r4 = com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity.C08401.copydefault
                    int r4 = r4 + 103
                    int r1 = r4 % 128
                    com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity.C08401.component1 = r1
                    int r4 = r4 % r0
                    if (r4 == 0) goto L41
                    r4 = 3
                    int r4 = r4 / 5
                    goto L41
                L3a:
                    java.lang.String r4 = r4.getMessage()
                    com.huawei.common.widget.toast.CommonToast.showText(r4)
                L41:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity.C08401.onError(com.huawei.common.exception.BaseException):void");
            }
        });
        int i2 = toString + 53;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 66 / 0;
        }
    }

    private final void faceIdLogin() {
        int i = 2 % 2;
        BiometricHelper2.getInstance().loginWithFaceId(new ApiCallback<String>() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public void onSuccess(String str) {
                int i2 = 2 % 2;
                int i3 = component2 + 17;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(str);
                if (i4 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onSuccess2(String value) {
                int i2 = 2 % 2;
                int i3 = component2 + 9;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                OtpVerifyActivity.access$initBiometricViewModelIfNeed(OtpVerifyActivity.this);
                if (OtpVerifyActivity.access$getLocalQueryLoginType$p(OtpVerifyActivity.this) != null) {
                    int i5 = component2 + 79;
                    component1 = i5 % 128;
                    if (i5 % 2 == 0) {
                        OtpVerifyActivity.access$getLocalQueryLoginType$p(OtpVerifyActivity.this);
                        loginType.hashCode();
                        throw null;
                    }
                    LocalQueryLoginType localQueryLoginTypeAccess$getLocalQueryLoginType$p = OtpVerifyActivity.access$getLocalQueryLoginType$p(OtpVerifyActivity.this);
                    if (localQueryLoginTypeAccess$getLocalQueryLoginType$p != null && Intrinsics.areEqual((Object) true, (Object) localQueryLoginTypeAccess$getLocalQueryLoginType$p.getNewProcess())) {
                        int i6 = component2 + 109;
                        component1 = i6 % 128;
                        int i7 = i6 % 2;
                        LocalQueryLoginType localQueryLoginTypeAccess$getLocalQueryLoginType$p2 = OtpVerifyActivity.access$getLocalQueryLoginType$p(OtpVerifyActivity.this);
                        loginType = localQueryLoginTypeAccess$getLocalQueryLoginType$p2 != null ? localQueryLoginTypeAccess$getLocalQueryLoginType$p2.getLoginType() : null;
                        if (loginType == null) {
                            int i8 = component2 + 61;
                            component1 = i8 % 128;
                            int i9 = i8 % 2;
                            loginType = "";
                        }
                        ProcessVerifyParams processVerifyParams = new ProcessVerifyParams(loginType);
                        processVerifyParams.addParams("initiatorMsisdn", PhoneUtils.getRecentLoginPhone());
                        processVerifyParams.addParams("credential", value);
                        processVerifyParams.addParams("biometricType", "00");
                        OtpVerifyActivity.access$doRiskProcess(OtpVerifyActivity.this, processVerifyParams, "00");
                        return;
                    }
                }
                BiometricLoginViewModel biometricLoginViewModelAccess$getLoginViewModel$p = OtpVerifyActivity.access$getLoginViewModel$p(OtpVerifyActivity.this);
                if (biometricLoginViewModelAccess$getLoginViewModel$p != null) {
                    int i10 = component2 + 59;
                    component1 = i10 % 128;
                    int i11 = i10 % 2;
                    biometricLoginViewModelAccess$getLoginViewModel$p.faceIdLogin(value);
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
            
                com.huawei.common.widget.toast.CommonToast.showText(r4.getMessage());
                r4 = com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity.C08391.component1 + 123;
                com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity.C08391.component2 = r4 % 128;
                r4 = r4 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
            
                if (r4.getCode() == 39) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
            
                if (r4.getCode() == 7) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
            
                com.huawei.common.widget.toast.CommonToast.showText(com.huawei.digitalpayment.consumer.login.R.string.biometric_the_operation_is_too_frequent_please_try_again_later);
             */
            @Override
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onError(com.huawei.common.exception.BaseException r4) {
                /*
                    r3 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity.C08391.component1
                    int r1 = r1 + 9
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity.C08391.component2 = r2
                    int r1 = r1 % r0
                    java.lang.String r2 = ""
                    if (r1 == 0) goto L1c
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
                    int r1 = r4.getCode()
                    r2 = 39
                    if (r1 != r2) goto L2c
                    goto L26
                L1c:
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
                    int r1 = r4.getCode()
                    r2 = 7
                    if (r1 != r2) goto L2c
                L26:
                    int r4 = com.huawei.digitalpayment.consumer.login.R.string.biometric_the_operation_is_too_frequent_please_try_again_later
                    com.huawei.common.widget.toast.CommonToast.showText(r4)
                    goto L3c
                L2c:
                    java.lang.String r4 = r4.getMessage()
                    com.huawei.common.widget.toast.CommonToast.showText(r4)
                    int r4 = com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity.C08391.component1
                    int r4 = r4 + 123
                    int r1 = r4 % 128
                    com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity.C08391.component2 = r1
                    int r4 = r4 % r0
                L3c:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity.C08391.onError(com.huawei.common.exception.BaseException):void");
            }
        });
        int i2 = toString + 29;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void initBiometricViewModelIfNeed() {
        int i = 2 % 2;
        int i2 = toString + 91;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.loginViewModel == null) {
            BiometricLoginViewModel biometricLoginViewModel = (BiometricLoginViewModel) new ViewModelProvider(this).get(BiometricLoginViewModel.class);
            this.loginViewModel = biometricLoginViewModel;
            if (biometricLoginViewModel != null) {
                int i3 = hashCode + 99;
                toString = i3 % 128;
                int i4 = i3 % 2;
                LiveData<Resource<LocalLoginInfo>> data = biometricLoginViewModel.getData();
                if (data != null) {
                    data.observe(this, new component3(new Function1() {
                        private static int ShareDataUIState = 0;
                        private static int copydefault = 1;

                        @Override
                        public final Object invoke(Object obj2) {
                            Unit unitM10657$r8$lambda$ROFxVYJRTw0MpX7g2osMPaE0BU;
                            int i5 = 2 % 2;
                            int i6 = copydefault + 53;
                            ShareDataUIState = i6 % 128;
                            if (i6 % 2 != 0) {
                                unitM10657$r8$lambda$ROFxVYJRTw0MpX7g2osMPaE0BU = OtpVerifyActivity.m10657$r8$lambda$ROFxVYJRTw0MpX7g2osMPaE0BU(this.f$0, (Resource) obj2);
                                int i7 = 59 / 0;
                            } else {
                                unitM10657$r8$lambda$ROFxVYJRTw0MpX7g2osMPaE0BU = OtpVerifyActivity.m10657$r8$lambda$ROFxVYJRTw0MpX7g2osMPaE0BU(this.f$0, (Resource) obj2);
                            }
                            int i8 = ShareDataUIState + 23;
                            copydefault = i8 % 128;
                            if (i8 % 2 != 0) {
                                return unitM10657$r8$lambda$ROFxVYJRTw0MpX7g2osMPaE0BU;
                            }
                            throw null;
                        }
                    }));
                    int i5 = hashCode + 101;
                    toString = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 2 / 5;
                    }
                }
            }
        }
    }

    private static final Unit initBiometricViewModelIfNeed$lambda$4(OtpVerifyActivity otpVerifyActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = hashCode + 19;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(otpVerifyActivity, "");
        Intrinsics.checkNotNullParameter(resource, "");
        otpVerifyActivity.onLoginResponse(resource);
        Unit unit = Unit.INSTANCE;
        int i4 = hashCode + 5;
        toString = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
        return unit;
    }

    private final void getSmsCode() {
        int i = 2 % 2;
        if (this.canSendSms) {
            int i2 = toString + 47;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
            sendSms();
            int i4 = hashCode + 119;
            toString = i4 % 128;
            int i5 = i4 % 2;
        }
        this.canSendSms = true;
    }

    private final void sendSms() {
        int i = 2 % 2;
        ((OtpLoginViewModel) this.viewModel).sendLoginSms(new BaseRequestParams());
        int i2 = toString + 41;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit addObserver$lambda$5(OtpVerifyActivity otpVerifyActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = toString + 93;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(otpVerifyActivity, "");
        if (resource.success()) {
            int i4 = toString + 11;
            hashCode = i4 % 128;
            if (i4 % 2 != 0) {
                otpVerifyActivity.saveLoginType("3");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            otpVerifyActivity.saveLoginType("3");
        }
        Intrinsics.checkNotNull(resource);
        otpVerifyActivity.onLoginResponse(resource);
        return Unit.INSTANCE;
    }

    private static final Unit addObserver$lambda$6(OtpVerifyActivity otpVerifyActivity, Resource resource) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(otpVerifyActivity, "");
        Intrinsics.checkNotNullParameter(resource, "");
        Utils.showOrHideLoading(otpVerifyActivity, resource);
        Utils.toastError(resource);
        if (resource.success()) {
            int i2 = hashCode + 101;
            toString = i2 % 128;
            if (i2 % 2 == 0) {
                otpVerifyActivity.startTimer();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            otpVerifyActivity.startTimer();
            int i3 = toString + 37;
            hashCode = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    private final void addObserver() {
        int i = 2 % 2;
        OtpVerifyActivity otpVerifyActivity = this;
        ((OtpLoginViewModel) this.viewModel).getData().observe(otpVerifyActivity, new component3(new Function1() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 95;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                Unit unit$r8$lambda$mgCIkbMjQsdA_oS7dG8KzkIQT_A = OtpVerifyActivity.$r8$lambda$mgCIkbMjQsdA_oS7dG8KzkIQT_A(this.f$0, (Resource) obj);
                int i5 = component2 + 111;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return unit$r8$lambda$mgCIkbMjQsdA_oS7dG8KzkIQT_A;
            }
        }));
        ((OtpLoginViewModel) this.viewModel).getSmsData().observe(otpVerifyActivity, new component3(new Function1() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 97;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    OtpVerifyActivity.m10658$r8$lambda$mAhlqIVE1Mbi1kNTUNTVksQuqw(this.f$0, (Resource) obj);
                    throw null;
                }
                Unit unitM10658$r8$lambda$mAhlqIVE1Mbi1kNTUNTVksQuqw = OtpVerifyActivity.m10658$r8$lambda$mAhlqIVE1Mbi1kNTUNTVksQuqw(this.f$0, (Resource) obj);
                int i4 = ShareDataUIState + 25;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 / 0;
                }
                return unitM10658$r8$lambda$mAhlqIVE1Mbi1kNTUNTVksQuqw;
            }
        }));
        getGmsLoginViewModel().loginData().observe(otpVerifyActivity, new component3(new Function1() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 7;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    OtpVerifyActivity.$r8$lambda$y6snsSE7M9htVRPK6P1Y2Y7ITTs(this.f$0, (Resource) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unit$r8$lambda$y6snsSE7M9htVRPK6P1Y2Y7ITTs = OtpVerifyActivity.$r8$lambda$y6snsSE7M9htVRPK6P1Y2Y7ITTs(this.f$0, (Resource) obj);
                int i4 = component1 + 83;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return unit$r8$lambda$y6snsSE7M9htVRPK6P1Y2Y7ITTs;
            }
        }));
        int i2 = hashCode + 41;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit addObserver$lambda$7(com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity r5, com.huawei.payment.mvvm.Resource r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            r2 = r5
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            com.huawei.payment.mvvm.Utils.showOrHideLoading(r2, r6)
            com.huawei.payment.mvvm.Utils.toastError(r6)
            boolean r2 = r6.success()
            if (r2 == 0) goto L85
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            com.huawei.digitalpayment.consumer.base.util.GsmHelper r3 = com.huawei.digitalpayment.consumer.base.util.GsmHelper.INSTANCE
            r4 = 1
            r3.setGsmLoginRequest(r4)
            java.lang.Object r3 = r6.getData()
            java.io.Serializable r3 = (java.io.Serializable) r3
            java.lang.String r4 = "localLoginInfo"
            r2.putSerializable(r4, r3)
            java.lang.Object r6 = r6.getData()
            com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo r6 = (com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo) r6
            java.lang.String r6 = r6.getToken()
            java.lang.String r3 = "token"
            r2.putString(r3, r6)
            com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model.LocalQueryLoginType r6 = r5.localQueryLoginType
            if (r6 == 0) goto L60
            int r3 = com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity.hashCode
            int r3 = r3 + 33
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity.toString = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L58
            java.lang.String r6 = r6.getLoginType()
            if (r6 != 0) goto L56
            goto L60
        L56:
            r1 = r6
            goto L69
        L58:
            r6.getLoginType()
            r5 = 0
            r5.hashCode()
            throw r5
        L60:
            int r6 = com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity.hashCode
            int r6 = r6 + 13
            int r3 = r6 % 128
            com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity.toString = r3
            int r6 = r6 % r0
        L69:
            java.lang.String r6 = "loginType"
            r2.putString(r6, r1)
            java.lang.String r6 = "forward"
            java.lang.String r1 = "/mainModule/main"
            r2.putString(r6, r1)
            android.app.Activity r5 = (android.app.Activity) r5
            java.lang.String r6 = "/loginModule/termsAndConditions"
            com.huawei.arouter.RouteUtils.routeWithExecute(r5, r6, r2)
            int r5 = com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity.hashCode
            int r5 = r5 + 9
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity.toString = r6
            int r5 = r5 % r0
        L85:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity.addObserver$lambda$7(com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity, com.huawei.payment.mvvm.Resource):kotlin.Unit");
    }

    private final void saveLoginType(String biometricType) {
        int i = 2 % 2;
        int i2 = toString + 13;
        hashCode = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (Intrinsics.areEqual("00", biometricType)) {
                SPUtils.getInstance(AppConfigManager.SP_APP).put(SPConstant.KEY_LAST_LOGIN_TYPE, "0");
            } else if (!(!Intrinsics.areEqual("01", biometricType))) {
                SPUtils.getInstance(AppConfigManager.SP_APP).put(SPConstant.KEY_LAST_LOGIN_TYPE, "1");
            } else {
                SPUtils.getInstance(AppConfigManager.SP_APP).put(SPConstant.KEY_LAST_LOGIN_TYPE, "3");
            }
            int i3 = toString + 51;
            hashCode = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        Intrinsics.areEqual("00", biometricType);
        obj.hashCode();
        throw null;
    }

    private static final void onLoginResponse$lambda$8(CommonDialog commonDialog) {
        int i = 2 % 2;
        int i2 = hashCode + 93;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(commonDialog, "");
        commonDialog.dismiss();
        int i4 = hashCode + 37;
        toString = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onLoginResponse(Resource<LocalLoginInfo> loginInfoResource) {
        String execute;
        String execute2;
        int i = 2 % 2;
        OtpVerifyActivity otpVerifyActivity = this;
        Utils.showOrHideLoading(otpVerifyActivity, loginInfoResource);
        if (loginInfoResource.error()) {
            ((ActivityOtpVerifyBinding) this.binding).etCode.showError(loginInfoResource.getMessage());
            ((ActivityOtpVerifyBinding) this.binding).etCode.clear();
            if (Intrinsics.areEqual("timeout", loginInfoResource.getException().getResponseCode())) {
                DialogUtils.showConnectTimeOutDialog(otpVerifyActivity, new CommonDialog.OnClickListener() {
                    private static int component1 = 0;
                    private static int component3 = 1;

                    @Override
                    public final void onClick(CommonDialog commonDialog) {
                        int i2 = 2 % 2;
                        int i3 = component1 + 35;
                        component3 = i3 % 128;
                        int i4 = i3 % 2;
                        OtpVerifyActivity.$r8$lambda$tU5c_nApca94g97sDchit2v5T7g(commonDialog);
                        int i5 = component1 + 53;
                        component3 = i5 % 128;
                        int i6 = i5 % 2;
                    }
                });
                int i2 = hashCode + 79;
                toString = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            if (TextUtils.equals(this.OPERATION_FAILED, loginInfoResource.getException().getResponseCode())) {
                ActivityUtils.finishAllActivitiesExceptNewest();
                TokenHelper.INSTANCE.clearToken();
                RouteUtils.routeWithExecute(this, RoutePathConstants.LOGIN);
                finish();
                return;
            }
            return;
        }
        if (loginInfoResource.success()) {
            LocalLoginInfo data = loginInfoResource.getData();
            if (TextUtils.isEmpty(data != null ? data.getExecute() : null)) {
                UserLifecycleManager.get().loginSuccess(this, new Gson().toJson(data), false);
                RouteUtils.routeWithExecute(RoutePathConstants.MAIN);
                return;
            }
            if (data != null) {
                int i4 = toString + 59;
                hashCode = i4 % 128;
                if (i4 % 2 != 0) {
                    data.getExecute();
                    throw null;
                }
                execute = data.getExecute();
            } else {
                execute = null;
            }
            Uri uri = SafeUri.parse(execute);
            if (uri == null) {
                return;
            }
            if (TextUtils.equals(uri.getPath(), "/loginModule/otpVerifyNewDevice")) {
                int i5 = toString + 9;
                hashCode = i5 % 128;
                if (i5 % 2 != 0) {
                    loginType.hashCode();
                    throw null;
                }
                OtpVerifyActivity otpVerifyActivity2 = this;
                loginType = data != null ? data.getExecute() : null;
                RouteUtils.routeWithExecute(otpVerifyActivity2, loginType + "?smsCodeType=" + SmsCodeType.NEW_DEVICE_SMS_CODE.getSmsCode());
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putSerializable("queryLoginType", this.localQueryLoginType);
            if (data != null) {
                execute2 = data.getExecute();
            } else {
                int i6 = hashCode + 91;
                toString = i6 % 128;
                int i7 = i6 % 2;
                execute2 = null;
            }
            String str = this.NEW_DEVICE_LOGIN;
            LocalQueryLoginType localQueryLoginType = this.localQueryLoginType;
            if (localQueryLoginType != null) {
                int i8 = hashCode + 15;
                toString = i8 % 128;
                int i9 = i8 % 2;
                loginType = localQueryLoginType.getLoginType();
            }
            if (Intrinsics.areEqual(str, loginType)) {
                execute2 = com.huawei.digitalpayment.consumer.constants.RoutePathConstants.TERMS_AND_CONDITIONS;
            }
            RouteUtils.routeWithExecute(this, execute2, bundle);
            finish();
            int i10 = hashCode + 105;
            toString = i10 % 128;
            int i11 = i10 % 2;
        }
    }

    private final void doRiskProcess(ProcessVerifyParams params, final String loginType) {
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(this.tempToken)) {
            int i2 = hashCode + 15;
            toString = i2 % 128;
            if (i2 % 2 != 0) {
                String str = this.tempToken;
                if (str == null) {
                    str = "";
                }
                params.setToken(str);
                TokenHelper.INSTANCE.clearToken();
            } else {
                throw null;
            }
        }
        bundle.putSerializable(KeysConstants.KEY_RISK_PARAMS, params);
        RiskUtil.INSTANCE.startProcess(this, bundle, new ApiCallback<Bundle>() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(Bundle bundle2) {
                int i3 = 2 % 2;
                int i4 = copydefault + 11;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                onSuccess2(bundle2);
                int i6 = ShareDataUIState + 125;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
            }

            public void onSuccess2(Bundle result) {
                int i3 = 2 % 2;
                Intrinsics.checkNotNullParameter(result, "");
                String string = result.getString(KeysConstants.KEY_FORWARD);
                if (!TextUtils.isEmpty(string)) {
                    int i4 = ShareDataUIState + 23;
                    int i5 = i4 % 128;
                    copydefault = i5;
                    int i6 = i4 % 2;
                    if (string != null) {
                        int i7 = i5 + 79;
                        ShareDataUIState = i7 % 128;
                        if (i7 % 2 == 0 ? StringsKt.endsWith$default(string, RoutePathConstants.NEW_MAIN, false, 2, (Object) null) : !StringsKt.endsWith$default(string, RoutePathConstants.NEW_MAIN, false, 3, (Object) null)) {
                            int i8 = copydefault + 1;
                            ShareDataUIState = i8 % 128;
                            if (i8 % 2 == 0) {
                                OtpVerifyActivity.access$setLoginType$p(OtpVerifyActivity.this, loginType);
                                OtpVerifyActivity.access$doLogin(OtpVerifyActivity.this, loginType);
                                return;
                            } else {
                                OtpVerifyActivity.access$setLoginType$p(OtpVerifyActivity.this, loginType);
                                OtpVerifyActivity.access$doLogin(OtpVerifyActivity.this, loginType);
                                int i9 = 98 / 0;
                                return;
                            }
                        }
                    }
                }
                String strAccess$getNEW_DEVICE_LOGIN$p = OtpVerifyActivity.access$getNEW_DEVICE_LOGIN$p(OtpVerifyActivity.this);
                LocalQueryLoginType localQueryLoginTypeAccess$getLocalQueryLoginType$p = OtpVerifyActivity.access$getLocalQueryLoginType$p(OtpVerifyActivity.this);
                if (Intrinsics.areEqual(strAccess$getNEW_DEVICE_LOGIN$p, localQueryLoginTypeAccess$getLocalQueryLoginType$p != null ? localQueryLoginTypeAccess$getLocalQueryLoginType$p.getLoginType() : null)) {
                    int i10 = copydefault + 45;
                    ShareDataUIState = i10 % 128;
                    if (i10 % 2 != 0) {
                        throw null;
                    }
                    string = com.huawei.digitalpayment.consumer.constants.RoutePathConstants.TERMS_AND_CONDITIONS;
                }
                RouteUtils.routeWithExecute(OtpVerifyActivity.this, string, result);
                OtpVerifyActivity.this.finish();
            }

            @Override
            public void onError(BaseException exception) {
                int i3 = 2 % 2;
                int i4 = ShareDataUIState + 33;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(exception, "");
                OtpVerifyActivity otpVerifyActivity = OtpVerifyActivity.this;
                Resource resourceError = Resource.error(exception, null);
                Intrinsics.checkNotNullExpressionValue(resourceError, "");
                OtpVerifyActivity.access$onLoginResponse(otpVerifyActivity, resourceError);
                int i6 = copydefault + 63;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 88 / 0;
                }
            }
        });
        int i3 = toString + 101;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void doLogin(String loginType) {
        String loginType2;
        int i = 2 % 2;
        LocalQueryLoginType localQueryLoginType = this.localQueryLoginType;
        if (localQueryLoginType != null) {
            if (localQueryLoginType != null) {
                int i2 = toString + 79;
                hashCode = i2 % 128;
                int i3 = i2 % 2;
                loginType2 = localQueryLoginType.getLoginType();
            } else {
                int i4 = toString + 69;
                hashCode = i4 % 128;
                int i5 = i4 % 2;
                loginType2 = null;
            }
            if (TextUtils.equals(loginType2, this.GMS_LOGIN)) {
                getGmsLoginViewModel().gmsLogin();
                return;
            }
        }
        autoLogin(loginType);
        int i6 = toString + 27;
        hashCode = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 42 / 0;
        }
    }

    private final void autoLogin(final String loginType) {
        int i = 2 % 2;
        Resource<LocalLoginInfo> resourceLoading = Resource.loading(null);
        Intrinsics.checkNotNullExpressionValue(resourceLoading, "");
        onLoginResponse(resourceLoading);
        ((ILoginModuleService) RouteUtils.getService(ILoginModuleService.class)).autoLogin(new ApiCallback<BaseResp>() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 23;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(baseResp);
                if (i4 == 0) {
                    int i5 = 14 / 0;
                }
            }

            public void onSuccess2(BaseResp baseResp) {
                int i2 = 2 % 2;
                Object obj = null;
                if (baseResp instanceof LocalLoginInfo) {
                    int i3 = copydefault + 71;
                    component2 = i3 % 128;
                    if (i3 % 2 != 0) {
                        OtpVerifyActivity.access$saveLoginType(OtpVerifyActivity.this, loginType);
                        OtpVerifyActivity otpVerifyActivity = OtpVerifyActivity.this;
                        Resource resourceSuccess = Resource.success(baseResp);
                        Intrinsics.checkNotNullExpressionValue(resourceSuccess, "");
                        OtpVerifyActivity.access$onLoginResponse(otpVerifyActivity, resourceSuccess);
                        obj.hashCode();
                        throw null;
                    }
                    OtpVerifyActivity.access$saveLoginType(OtpVerifyActivity.this, loginType);
                    OtpVerifyActivity otpVerifyActivity2 = OtpVerifyActivity.this;
                    Resource resourceSuccess2 = Resource.success(baseResp);
                    Intrinsics.checkNotNullExpressionValue(resourceSuccess2, "");
                    OtpVerifyActivity.access$onLoginResponse(otpVerifyActivity2, resourceSuccess2);
                } else {
                    OtpVerifyActivity otpVerifyActivity3 = OtpVerifyActivity.this;
                    Resource resourceError = Resource.error(new BaseException(OtpVerifyActivity.this.getString(R.string.login_auto_login_failed)), null);
                    Intrinsics.checkNotNullExpressionValue(resourceError, "");
                    OtpVerifyActivity.access$onLoginResponse(otpVerifyActivity3, resourceError);
                }
                int i4 = component2 + 17;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException exception) {
                int i2 = 2 % 2;
                int i3 = copydefault + 31;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(exception, "");
                    OtpVerifyActivity otpVerifyActivity = OtpVerifyActivity.this;
                    Resource resourceError = Resource.error(exception, null);
                    Intrinsics.checkNotNullExpressionValue(resourceError, "");
                    OtpVerifyActivity.access$onLoginResponse(otpVerifyActivity, resourceError);
                    return;
                }
                Intrinsics.checkNotNullParameter(exception, "");
                OtpVerifyActivity otpVerifyActivity2 = OtpVerifyActivity.this;
                Resource resourceError2 = Resource.error(exception, null);
                Intrinsics.checkNotNullExpressionValue(resourceError2, "");
                OtpVerifyActivity.access$onLoginResponse(otpVerifyActivity2, resourceError2);
                throw null;
            }
        });
        int i2 = toString + 105;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 36 / 0;
        }
    }

    @Override
    @Deprecated(message = "Deprecated in Java")
    public void onBackPressed() {
        int i = 2 % 2;
        Bundle bundle = new Bundle(1);
        bundle.putBoolean(KeysConstants.IS_CHECKED_SERVICE, true);
        RouteUtils.routeWithExecute(getIntent().getStringExtra(KeysConstants.KEY_EXECUTE), bundle);
        super.onBackPressed();
        int i2 = hashCode + 33;
        toString = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x016c  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(104:0|2|(2:(2:7|(1:13)(1:12))(1:14)|(9:16|823|17|(1:19)|20|21|22|(1:24)|25)(1:29))(0)|30|(3:855|32|(1:38)(1:37))(1:42)|43|824|44|(1:46)|47|813|48|(1:50)|51|75|840|76|(1:78)|79|80|(4:82|83|(1:85)|86)(25:87|88|834|89|90|826|91|(2:903|93)|97|98|821|99|(2:918|101)|105|106|107|(2:882|109)|113|114|817|115|(2:819|117)(1:119)|120|(2:122|123)|124)|125|(4:128|(2:130|923)(11:131|(5:133|(1:135)(1:136)|925|(3:139|140|137)|924)|143|912|144|(1:146)|147|148|901|149|922)|150|126)|921|162|192|892|193|(2:873|195)|199|200|881|(5:202|203|(1:205)|206|207)(25:208|209|884|210|211|864|212|(2:841|214)|218|219|858|220|(2:860|222)|226|227|228|(3:230|830|231)|235|236|856|237|(3:239|849|240)(1:242)|243|(1:245)|246)|247|(4:250|(2:252|928)(11:253|(3:255|(3:258|259|256)|929)|262|847|263|(1:265)|266|267|836|268|927)|269|248)|926|281|314|815|315|(3:317|872|318)|322|(1:324)|325|326|894|(4:328|329|(1:331)|332)(56:333|(54:335|(2:337|(2:339|(2:341|345)(1:342))(2:343|344))(1:345)|441|905|442|(1:444)|445|(3:447|(1:449)|450)(14:452|453|890|454|(1:456)|457|458|459|(1:461)|462|(1:464)|465|(1:467)|468)|451|469|(9:472|875|473|(1:475)|476|477|478|866|479)|509|(1:511)|512|(1:514)|515|(3:517|(1:519)|520)(16:522|523|(1:525)|526|(1:528)|529|530|(1:532)|533|832|534|535|(1:537)|538|(1:540)|541)|521|542|(1:544)(9:545|(3:547|(2:550|548)|943)|551|552|(1:554)|555|(1:557)|558|559)|560|(1:562)|563|(3:565|(1:567)|568)(14:569|570|(1:572)|573|574|(1:576)|577|843|578|579|(1:581)|582|(1:584)|585)|586|(1:588)(9:589|(3:591|(4:594|(3:939|596|942)(3:938|597|941)|940|592)|937)|598|599|(1:601)|602|(1:604)|605|606)|607|809|608|(2:851|610)|614|615|920|616|(1:618)|619|(3:621|(1:623)|624)(17:625|(2:627|(1:633)(1:632))|(19:635|636|910|637|(1:639)|640|641|899|642|(1:644)|645|646|647|(1:649)|650|(1:652)|653|(1:655)|656)|715|(1:717)|718|(3:720|(1:722)|723)(13:725|886|726|727|(1:729)|730|853|731|732|(1:734)|735|(1:737)|738)|724|739|(6:742|743|(1:745)|746|747|748)|749|(1:751)|752|(3:754|(1:756)|757)(14:759|760|(1:762)|763|764|(1:766)|767|811|768|769|(1:771)|772|(1:774)|775)|758|776|(1:948)(7:779|780|(1:782)|783|784|785|786))|657|(4:660|(3:932|662|935)(12:931|663|(3:665|(3:668|669|666)|936)|670|888|671|(1:673)|674|675|870|676|934)|933|658)|930|715|(0)|718|(0)(0)|724|739|(0)|749|(0)|752|(0)(0)|758|776|(0)(0))(1:347)|(18:349|906|350|(2:862|352)|356|357|897|358|(2:908|360)|364|365|366|(2:368|369)|370|(1:372)(1:374)|375|(1:377)|378)|425|441|905|442|(0)|445|(0)(0)|451|469|(0)|509|(0)|512|(0)|515|(0)(0)|521|542|(0)(0)|560|(0)|563|(0)(0)|586|(0)(0)|607|809|608|(0)|614|615|920|616|(0)|619|(0)(0)|657|(1:658)|930|715|(0)|718|(0)(0)|724|739|(0)|749|(0)|752|(0)(0)|758|776|(0)(0))|379|(4:382|(2:384|946)(11:385|(3:387|(3:390|391|388)|947)|392|877|393|(1:395)|396|397|868|398|945)|399|380)|944|425|441|905|442|(0)|445|(0)(0)|451|469|(0)|509|(0)|512|(0)|515|(0)(0)|521|542|(0)(0)|560|(0)|563|(0)(0)|586|(0)(0)|607|809|608|(0)|614|615|920|616|(0)|619|(0)(0)|657|(1:658)|930|715|(0)|718|(0)(0)|724|739|(0)|749|(0)|752|(0)(0)|758|776|(0)(0)|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(68:813|48|(1:50)|51|75|(10:840|76|(1:78)|79|80|(4:82|83|(1:85)|86)(25:87|88|834|89|90|826|91|(2:903|93)|97|98|821|99|(2:918|101)|105|106|107|(2:882|109)|113|114|817|115|(2:819|117)(1:119)|120|(2:122|123)|124)|125|(4:128|(2:130|923)(11:131|(5:133|(1:135)(1:136)|925|(3:139|140|137)|924)|143|912|144|(1:146)|147|148|901|149|922)|150|126)|921|162)|192|(11:892|193|(2:873|195)|199|200|881|(5:202|203|(1:205)|206|207)(25:208|209|884|210|211|864|212|(2:841|214)|218|219|858|220|(2:860|222)|226|227|228|(3:230|830|231)|235|236|856|237|(3:239|849|240)(1:242)|243|(1:245)|246)|247|(4:250|(2:252|928)(11:253|(3:255|(3:258|259|256)|929)|262|847|263|(1:265)|266|267|836|268|927)|269|248)|926|281)|314|(7:815|315|(3:317|872|318)|322|(1:324)|325|326)|(1:894)|(4:328|329|(1:331)|332)(56:333|(54:335|(2:337|(2:339|(2:341|345)(1:342))(2:343|344))(1:345)|441|905|442|(1:444)|445|(3:447|(1:449)|450)(14:452|453|890|454|(1:456)|457|458|459|(1:461)|462|(1:464)|465|(1:467)|468)|451|469|(9:472|875|473|(1:475)|476|477|478|866|479)|509|(1:511)|512|(1:514)|515|(3:517|(1:519)|520)(16:522|523|(1:525)|526|(1:528)|529|530|(1:532)|533|832|534|535|(1:537)|538|(1:540)|541)|521|542|(1:544)(9:545|(3:547|(2:550|548)|943)|551|552|(1:554)|555|(1:557)|558|559)|560|(1:562)|563|(3:565|(1:567)|568)(14:569|570|(1:572)|573|574|(1:576)|577|843|578|579|(1:581)|582|(1:584)|585)|586|(1:588)(9:589|(3:591|(4:594|(3:939|596|942)(3:938|597|941)|940|592)|937)|598|599|(1:601)|602|(1:604)|605|606)|607|809|608|(2:851|610)|614|615|920|616|(1:618)|619|(3:621|(1:623)|624)(17:625|(2:627|(1:633)(1:632))|(19:635|636|910|637|(1:639)|640|641|899|642|(1:644)|645|646|647|(1:649)|650|(1:652)|653|(1:655)|656)|715|(1:717)|718|(3:720|(1:722)|723)(13:725|886|726|727|(1:729)|730|853|731|732|(1:734)|735|(1:737)|738)|724|739|(6:742|743|(1:745)|746|747|748)|749|(1:751)|752|(3:754|(1:756)|757)(14:759|760|(1:762)|763|764|(1:766)|767|811|768|769|(1:771)|772|(1:774)|775)|758|776|(1:948)(7:779|780|(1:782)|783|784|785|786))|657|(4:660|(3:932|662|935)(12:931|663|(3:665|(3:668|669|666)|936)|670|888|671|(1:673)|674|675|870|676|934)|933|658)|930|715|(0)|718|(0)(0)|724|739|(0)|749|(0)|752|(0)(0)|758|776|(0)(0))(1:347)|(18:349|906|350|(2:862|352)|356|357|897|358|(2:908|360)|364|365|366|(2:368|369)|370|(1:372)(1:374)|375|(1:377)|378)|425|441|905|442|(0)|445|(0)(0)|451|469|(0)|509|(0)|512|(0)|515|(0)(0)|521|542|(0)(0)|560|(0)|563|(0)(0)|586|(0)(0)|607|809|608|(0)|614|615|920|616|(0)|619|(0)(0)|657|(1:658)|930|715|(0)|718|(0)(0)|724|739|(0)|749|(0)|752|(0)(0)|758|776|(0)(0))|379|(4:382|(2:384|946)(11:385|(3:387|(3:390|391|388)|947)|392|877|393|(1:395)|396|397|868|398|945)|399|380)|944|425|441|905|442|(0)|445|(0)(0)|451|469|(0)|509|(0)|512|(0)|515|(0)(0)|521|542|(0)(0)|560|(0)|563|(0)(0)|586|(0)(0)|607|809|608|(0)|614|615|920|616|(0)|619|(0)(0)|657|(1:658)|930|715|(0)|718|(0)(0)|724|739|(0)|749|(0)|752|(0)(0)|758|776|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x208e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x208f, code lost:
    
        r10 = new java.lang.Object[1];
        g(((android.content.Context) java.lang.Class.forName(r29).getMethod(r6, new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1883265981, new char[]{35351, 11651, 42694, 35202, 28015, 6017, 55518, 19694, 29470, 56947, 56827}, new char[]{55854, 16475, 57456, 64605}, new char[]{0, 0, 0, 0}, (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1))), r10);
        r3 = (java.lang.String) r10[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x20e5, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r2);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x20fc, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x2100, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r1 = -1;
        r13 = 0;
        r1 = (((r1 - ((r1 >> 63) << 32)) | (((long) 0) << 32)) & ((long) 1)) | ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x2131, code lost:
    
        r3 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x2135, code lost:
    
        if (r3 == null) goto L505;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x2137, code lost:
    
        r3 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(android.text.TextUtils.indexOf((java.lang.CharSequence) r7, '0', 0, 0) + 6619, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) + 41, (char) android.view.Gravity.getAbsoluteGravity(0, 0), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x215f, code lost:
    
        r3 = ((java.lang.reflect.Method) r3).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x2167, code lost:
    
        r8 = new java.lang.Object[]{1415636354, java.lang.Long.valueOf(r1), r2, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault((android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 6561, 56 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) android.graphics.Color.blue(0));
        r2 = com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity.$$s;
        r5 = (byte) (r2[60] - 1);
        r2 = r2[10];
        r12 = new java.lang.Object[1];
        j(r5, r2, r2, r12);
        r1.getMethod((java.lang.String) r12[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r3, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:699:0x331f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:701:0x3321, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:702:0x3322, code lost:
    
        r9 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:703:0x3324, code lost:
    
        r1 = r0;
        r9 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0f07 A[Catch: all -> 0x072d, TryCatch #7 {all -> 0x072d, blocks: (B:308:0x14f3, B:310:0x14f9, B:311:0x1522, B:434:0x1c7a, B:436:0x1c80, B:438:0x1cae, B:743:0x3b14, B:745:0x3b1a, B:746:0x3b44, B:780:0x3e44, B:782:0x3e4a, B:783:0x3e6f, B:760:0x3c8f, B:762:0x3cb2, B:763:0x3d04, B:709:0x33ce, B:711:0x33d4, B:712:0x3401, B:599:0x2ce7, B:601:0x2ced, B:602:0x2d15, B:604:0x2d4f, B:605:0x2d96, B:570:0x2a13, B:572:0x2a28, B:573:0x2a5d, B:552:0x2708, B:554:0x270e, B:555:0x2736, B:557:0x2770, B:558:0x27ba, B:523:0x2393, B:525:0x23a8, B:526:0x23dd, B:528:0x2411, B:529:0x2490, B:503:0x2131, B:505:0x2137, B:506:0x215f, B:186:0x0f01, B:188:0x0f07, B:189:0x0f31, B:69:0x0935, B:71:0x093b, B:72:0x0963, B:17:0x0365, B:19:0x036b, B:20:0x0397, B:22:0x06a5, B:24:0x06d7, B:25:0x0727, B:32:0x0746, B:34:0x074a, B:55:0x0826, B:57:0x082c, B:58:0x082d, B:60:0x082f, B:62:0x0836, B:63:0x0837, B:38:0x0756, B:442:0x1d31, B:444:0x1d37, B:445:0x1d7a, B:447:0x1d87, B:449:0x1d90, B:450:0x1dd1, B:469:0x1f83, B:477:0x1ff0, B:483:0x2072, B:485:0x2078, B:486:0x2079, B:488:0x207b, B:490:0x2082, B:491:0x2083, B:452:0x1ddd, B:459:0x1e67, B:461:0x1e6d, B:462:0x1eb1, B:464:0x1edb, B:465:0x1f23, B:467:0x1f39, B:468:0x1f7b, B:493:0x2085, B:495:0x208c, B:496:0x208d), top: B:823:0x0365, inners: #24, #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x1010  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x105e A[Catch: all -> 0x1404, TRY_ENTER, TRY_LEAVE, TryCatch #44 {all -> 0x1404, blocks: (B:193:0x0fb4, B:199:0x1003, B:208:0x105e), top: B:892:0x0fb4 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x12a3 A[Catch: all -> 0x13dc, TryCatch #25 {all -> 0x13dc, blocks: (B:247:0x1299, B:248:0x129d, B:250:0x12a3, B:253:0x12bd, B:237:0x11d6, B:243:0x1238, B:246:0x1291), top: B:856:0x11d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x14f9 A[Catch: all -> 0x072d, TryCatch #7 {all -> 0x072d, blocks: (B:308:0x14f3, B:310:0x14f9, B:311:0x1522, B:434:0x1c7a, B:436:0x1c80, B:438:0x1cae, B:743:0x3b14, B:745:0x3b1a, B:746:0x3b44, B:780:0x3e44, B:782:0x3e4a, B:783:0x3e6f, B:760:0x3c8f, B:762:0x3cb2, B:763:0x3d04, B:709:0x33ce, B:711:0x33d4, B:712:0x3401, B:599:0x2ce7, B:601:0x2ced, B:602:0x2d15, B:604:0x2d4f, B:605:0x2d96, B:570:0x2a13, B:572:0x2a28, B:573:0x2a5d, B:552:0x2708, B:554:0x270e, B:555:0x2736, B:557:0x2770, B:558:0x27ba, B:523:0x2393, B:525:0x23a8, B:526:0x23dd, B:528:0x2411, B:529:0x2490, B:503:0x2131, B:505:0x2137, B:506:0x215f, B:186:0x0f01, B:188:0x0f07, B:189:0x0f31, B:69:0x0935, B:71:0x093b, B:72:0x0963, B:17:0x0365, B:19:0x036b, B:20:0x0397, B:22:0x06a5, B:24:0x06d7, B:25:0x0727, B:32:0x0746, B:34:0x074a, B:55:0x0826, B:57:0x082c, B:58:0x082d, B:60:0x082f, B:62:0x0836, B:63:0x0837, B:38:0x0756, B:442:0x1d31, B:444:0x1d37, B:445:0x1d7a, B:447:0x1d87, B:449:0x1d90, B:450:0x1dd1, B:469:0x1f83, B:477:0x1ff0, B:483:0x2072, B:485:0x2078, B:486:0x2079, B:488:0x207b, B:490:0x2082, B:491:0x2083, B:452:0x1ddd, B:459:0x1e67, B:461:0x1e6d, B:462:0x1eb1, B:464:0x1edb, B:465:0x1f23, B:467:0x1f39, B:468:0x1f7b, B:493:0x2085, B:495:0x208c, B:496:0x208d), top: B:823:0x0365, inners: #24, #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x15b5  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x1625 A[Catch: all -> 0x15f8, TRY_ENTER, TRY_LEAVE, TryCatch #33 {all -> 0x15f8, blocks: (B:318:0x15b6, B:324:0x1625, B:329:0x1680, B:331:0x1686, B:332:0x16ce, B:388:0x1a7b, B:390:0x1a7e, B:335:0x16e1, B:339:0x16f1, B:369:0x192f, B:372:0x199f, B:377:0x19fb, B:343:0x16fd, B:344:0x1707, B:345:0x1708), top: B:872:0x15b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x167d  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x16dd  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x1a53 A[Catch: all -> 0x1ba5, TryCatch #3 {all -> 0x1ba5, blocks: (B:315:0x15af, B:322:0x15fe, B:325:0x166a, B:379:0x1a47, B:380:0x1a4b, B:382:0x1a53, B:385:0x1a6f, B:349:0x1710, B:366:0x1927, B:370:0x1975, B:375:0x19e4, B:378:0x1a41), top: B:815:0x15af }] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x1c80 A[Catch: all -> 0x072d, TryCatch #7 {all -> 0x072d, blocks: (B:308:0x14f3, B:310:0x14f9, B:311:0x1522, B:434:0x1c7a, B:436:0x1c80, B:438:0x1cae, B:743:0x3b14, B:745:0x3b1a, B:746:0x3b44, B:780:0x3e44, B:782:0x3e4a, B:783:0x3e6f, B:760:0x3c8f, B:762:0x3cb2, B:763:0x3d04, B:709:0x33ce, B:711:0x33d4, B:712:0x3401, B:599:0x2ce7, B:601:0x2ced, B:602:0x2d15, B:604:0x2d4f, B:605:0x2d96, B:570:0x2a13, B:572:0x2a28, B:573:0x2a5d, B:552:0x2708, B:554:0x270e, B:555:0x2736, B:557:0x2770, B:558:0x27ba, B:523:0x2393, B:525:0x23a8, B:526:0x23dd, B:528:0x2411, B:529:0x2490, B:503:0x2131, B:505:0x2137, B:506:0x215f, B:186:0x0f01, B:188:0x0f07, B:189:0x0f31, B:69:0x0935, B:71:0x093b, B:72:0x0963, B:17:0x0365, B:19:0x036b, B:20:0x0397, B:22:0x06a5, B:24:0x06d7, B:25:0x0727, B:32:0x0746, B:34:0x074a, B:55:0x0826, B:57:0x082c, B:58:0x082d, B:60:0x082f, B:62:0x0836, B:63:0x0837, B:38:0x0756, B:442:0x1d31, B:444:0x1d37, B:445:0x1d7a, B:447:0x1d87, B:449:0x1d90, B:450:0x1dd1, B:469:0x1f83, B:477:0x1ff0, B:483:0x2072, B:485:0x2078, B:486:0x2079, B:488:0x207b, B:490:0x2082, B:491:0x2083, B:452:0x1ddd, B:459:0x1e67, B:461:0x1e6d, B:462:0x1eb1, B:464:0x1edb, B:465:0x1f23, B:467:0x1f39, B:468:0x1f7b, B:493:0x2085, B:495:0x208c, B:496:0x208d), top: B:823:0x0365, inners: #24, #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x1cac  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x1d37 A[Catch: all -> 0x208e, TryCatch #51 {all -> 0x208e, blocks: (B:442:0x1d31, B:444:0x1d37, B:445:0x1d7a, B:447:0x1d87, B:449:0x1d90, B:450:0x1dd1, B:469:0x1f83, B:477:0x1ff0, B:483:0x2072, B:485:0x2078, B:486:0x2079, B:488:0x207b, B:490:0x2082, B:491:0x2083, B:452:0x1ddd, B:459:0x1e67, B:461:0x1e6d, B:462:0x1eb1, B:464:0x1edb, B:465:0x1f23, B:467:0x1f39, B:468:0x1f7b, B:493:0x2085, B:495:0x208c, B:496:0x208d, B:479:0x1ff6, B:473:0x1fb7, B:475:0x1fbd, B:476:0x1fe9, B:454:0x1dfd, B:456:0x1e0f, B:457:0x1e5b), top: B:905:0x1d31, outer: #7, inners: #30, #35, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:447:0x1d87 A[Catch: all -> 0x208e, TryCatch #51 {all -> 0x208e, blocks: (B:442:0x1d31, B:444:0x1d37, B:445:0x1d7a, B:447:0x1d87, B:449:0x1d90, B:450:0x1dd1, B:469:0x1f83, B:477:0x1ff0, B:483:0x2072, B:485:0x2078, B:486:0x2079, B:488:0x207b, B:490:0x2082, B:491:0x2083, B:452:0x1ddd, B:459:0x1e67, B:461:0x1e6d, B:462:0x1eb1, B:464:0x1edb, B:465:0x1f23, B:467:0x1f39, B:468:0x1f7b, B:493:0x2085, B:495:0x208c, B:496:0x208d, B:479:0x1ff6, B:473:0x1fb7, B:475:0x1fbd, B:476:0x1fe9, B:454:0x1dfd, B:456:0x1e0f, B:457:0x1e5b), top: B:905:0x1d31, outer: #7, inners: #30, #35, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:452:0x1ddd A[Catch: all -> 0x208e, TRY_LEAVE, TryCatch #51 {all -> 0x208e, blocks: (B:442:0x1d31, B:444:0x1d37, B:445:0x1d7a, B:447:0x1d87, B:449:0x1d90, B:450:0x1dd1, B:469:0x1f83, B:477:0x1ff0, B:483:0x2072, B:485:0x2078, B:486:0x2079, B:488:0x207b, B:490:0x2082, B:491:0x2083, B:452:0x1ddd, B:459:0x1e67, B:461:0x1e6d, B:462:0x1eb1, B:464:0x1edb, B:465:0x1f23, B:467:0x1f39, B:468:0x1f7b, B:493:0x2085, B:495:0x208c, B:496:0x208d, B:479:0x1ff6, B:473:0x1fb7, B:475:0x1fbd, B:476:0x1fe9, B:454:0x1dfd, B:456:0x1e0f, B:457:0x1e5b), top: B:905:0x1d31, outer: #7, inners: #30, #35, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:472:0x1f95  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x21e9  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x2256  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x22a9  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x2375  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x25c1  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x26bd  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x28c5  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x2914  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x29f3  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x2b9b  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x2c92  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x2f05 A[Catch: all -> 0x331f, TryCatch #59 {all -> 0x331f, blocks: (B:616:0x2eec, B:618:0x2f05, B:619:0x2f47, B:621:0x2f5a, B:623:0x2f63, B:624:0x2fa6, B:657:0x31e9, B:658:0x31ed, B:660:0x31f3, B:663:0x320b, B:666:0x3218, B:668:0x321b, B:680:0x32f9, B:682:0x32ff, B:683:0x3300, B:685:0x3302, B:687:0x3309, B:688:0x330a, B:627:0x2fb5, B:629:0x2fb9, B:633:0x2fc5, B:635:0x2fcb, B:647:0x30db, B:649:0x30e1, B:650:0x3121, B:652:0x314b, B:653:0x318e, B:655:0x31a4, B:656:0x31e3, B:690:0x330c, B:692:0x3313, B:693:0x3314, B:695:0x3316, B:697:0x331d, B:698:0x331e, B:676:0x327a, B:671:0x3247, B:673:0x324d, B:674:0x3272, B:642:0x3039, B:644:0x3058, B:645:0x30cf, B:637:0x2feb, B:639:0x3000, B:640:0x3032), top: B:920:0x2eec, inners: #32, #42, #48, #54 }] */
    /* JADX WARN: Removed duplicated region for block: B:621:0x2f5a A[Catch: all -> 0x331f, TryCatch #59 {all -> 0x331f, blocks: (B:616:0x2eec, B:618:0x2f05, B:619:0x2f47, B:621:0x2f5a, B:623:0x2f63, B:624:0x2fa6, B:657:0x31e9, B:658:0x31ed, B:660:0x31f3, B:663:0x320b, B:666:0x3218, B:668:0x321b, B:680:0x32f9, B:682:0x32ff, B:683:0x3300, B:685:0x3302, B:687:0x3309, B:688:0x330a, B:627:0x2fb5, B:629:0x2fb9, B:633:0x2fc5, B:635:0x2fcb, B:647:0x30db, B:649:0x30e1, B:650:0x3121, B:652:0x314b, B:653:0x318e, B:655:0x31a4, B:656:0x31e3, B:690:0x330c, B:692:0x3313, B:693:0x3314, B:695:0x3316, B:697:0x331d, B:698:0x331e, B:676:0x327a, B:671:0x3247, B:673:0x324d, B:674:0x3272, B:642:0x3039, B:644:0x3058, B:645:0x30cf, B:637:0x2feb, B:639:0x3000, B:640:0x3032), top: B:920:0x2eec, inners: #32, #42, #48, #54 }] */
    /* JADX WARN: Removed duplicated region for block: B:625:0x2fb1  */
    /* JADX WARN: Removed duplicated region for block: B:660:0x31f3 A[Catch: all -> 0x331f, TryCatch #59 {all -> 0x331f, blocks: (B:616:0x2eec, B:618:0x2f05, B:619:0x2f47, B:621:0x2f5a, B:623:0x2f63, B:624:0x2fa6, B:657:0x31e9, B:658:0x31ed, B:660:0x31f3, B:663:0x320b, B:666:0x3218, B:668:0x321b, B:680:0x32f9, B:682:0x32ff, B:683:0x3300, B:685:0x3302, B:687:0x3309, B:688:0x330a, B:627:0x2fb5, B:629:0x2fb9, B:633:0x2fc5, B:635:0x2fcb, B:647:0x30db, B:649:0x30e1, B:650:0x3121, B:652:0x314b, B:653:0x318e, B:655:0x31a4, B:656:0x31e3, B:690:0x330c, B:692:0x3313, B:693:0x3314, B:695:0x3316, B:697:0x331d, B:698:0x331e, B:676:0x327a, B:671:0x3247, B:673:0x324d, B:674:0x3272, B:642:0x3039, B:644:0x3058, B:645:0x30cf, B:637:0x2feb, B:639:0x3000, B:640:0x3032), top: B:920:0x2eec, inners: #32, #42, #48, #54 }] */
    /* JADX WARN: Removed duplicated region for block: B:711:0x33d4 A[Catch: all -> 0x072d, TryCatch #7 {all -> 0x072d, blocks: (B:308:0x14f3, B:310:0x14f9, B:311:0x1522, B:434:0x1c7a, B:436:0x1c80, B:438:0x1cae, B:743:0x3b14, B:745:0x3b1a, B:746:0x3b44, B:780:0x3e44, B:782:0x3e4a, B:783:0x3e6f, B:760:0x3c8f, B:762:0x3cb2, B:763:0x3d04, B:709:0x33ce, B:711:0x33d4, B:712:0x3401, B:599:0x2ce7, B:601:0x2ced, B:602:0x2d15, B:604:0x2d4f, B:605:0x2d96, B:570:0x2a13, B:572:0x2a28, B:573:0x2a5d, B:552:0x2708, B:554:0x270e, B:555:0x2736, B:557:0x2770, B:558:0x27ba, B:523:0x2393, B:525:0x23a8, B:526:0x23dd, B:528:0x2411, B:529:0x2490, B:503:0x2131, B:505:0x2137, B:506:0x215f, B:186:0x0f01, B:188:0x0f07, B:189:0x0f31, B:69:0x0935, B:71:0x093b, B:72:0x0963, B:17:0x0365, B:19:0x036b, B:20:0x0397, B:22:0x06a5, B:24:0x06d7, B:25:0x0727, B:32:0x0746, B:34:0x074a, B:55:0x0826, B:57:0x082c, B:58:0x082d, B:60:0x082f, B:62:0x0836, B:63:0x0837, B:38:0x0756, B:442:0x1d31, B:444:0x1d37, B:445:0x1d7a, B:447:0x1d87, B:449:0x1d90, B:450:0x1dd1, B:469:0x1f83, B:477:0x1ff0, B:483:0x2072, B:485:0x2078, B:486:0x2079, B:488:0x207b, B:490:0x2082, B:491:0x2083, B:452:0x1ddd, B:459:0x1e67, B:461:0x1e6d, B:462:0x1eb1, B:464:0x1edb, B:465:0x1f23, B:467:0x1f39, B:468:0x1f7b, B:493:0x2085, B:495:0x208c, B:496:0x208d), top: B:823:0x0365, inners: #24, #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:717:0x348b  */
    /* JADX WARN: Removed duplicated region for block: B:720:0x34d7  */
    /* JADX WARN: Removed duplicated region for block: B:725:0x3532  */
    /* JADX WARN: Removed duplicated region for block: B:742:0x3af1  */
    /* JADX WARN: Removed duplicated region for block: B:751:0x3bd3  */
    /* JADX WARN: Removed duplicated region for block: B:754:0x3c22  */
    /* JADX WARN: Removed duplicated region for block: B:759:0x3c71  */
    /* JADX WARN: Removed duplicated region for block: B:779:0x3e26  */
    /* JADX WARN: Removed duplicated region for block: B:851:0x2e94 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:873:0x0fba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:948:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v100 */
    /* JADX WARN: Type inference failed for: r11v140 */
    /* JADX WARN: Type inference failed for: r11v141 */
    /* JADX WARN: Type inference failed for: r11v142 */
    /* JADX WARN: Type inference failed for: r11v143 */
    /* JADX WARN: Type inference failed for: r11v144 */
    /* JADX WARN: Type inference failed for: r11v145 */
    /* JADX WARN: Type inference failed for: r11v146 */
    /* JADX WARN: Type inference failed for: r11v82 */
    /* JADX WARN: Type inference failed for: r11v83 */
    /* JADX WARN: Type inference failed for: r11v84, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v91 */
    /* JADX WARN: Type inference failed for: r11v92 */
    /* JADX WARN: Type inference failed for: r11v93 */
    /* JADX WARN: Type inference failed for: r11v94 */
    /* JADX WARN: Type inference failed for: r11v95 */
    /* JADX WARN: Type inference failed for: r11v96, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v97 */
    /* JADX WARN: Type inference failed for: r11v98 */
    /* JADX WARN: Type inference failed for: r11v99 */
    /* JADX WARN: Type inference failed for: r22v14 */
    /* JADX WARN: Type inference failed for: r22v15 */
    /* JADX WARN: Type inference failed for: r22v16 */
    /* JADX WARN: Type inference failed for: r22v17 */
    /* JADX WARN: Type inference failed for: r22v18 */
    /* JADX WARN: Type inference failed for: r22v19 */
    /* JADX WARN: Type inference failed for: r22v21 */
    /* JADX WARN: Type inference failed for: r22v31 */
    /* JADX WARN: Type inference failed for: r22v32 */
    /* JADX WARN: Type inference failed for: r22v40 */
    /* JADX WARN: Type inference failed for: r22v42 */
    /* JADX WARN: Type inference failed for: r22v43 */
    /* JADX WARN: Type inference failed for: r22v44 */
    /* JADX WARN: Type inference failed for: r22v46 */
    /* JADX WARN: Type inference failed for: r22v47 */
    /* JADX WARN: Type inference failed for: r22v49 */
    /* JADX WARN: Type inference failed for: r22v50 */
    /* JADX WARN: Type inference failed for: r22v51 */
    /* JADX WARN: Type inference failed for: r22v59 */
    /* JADX WARN: Type inference failed for: r22v60 */
    /* JADX WARN: Type inference failed for: r22v61 */
    /* JADX WARN: Type inference failed for: r22v62 */
    /* JADX WARN: Type inference failed for: r22v63 */
    /* JADX WARN: Type inference failed for: r22v64 */
    /* JADX WARN: Type inference failed for: r22v65 */
    /* JADX WARN: Type inference failed for: r22v66 */
    /* JADX WARN: Type inference failed for: r22v71 */
    /* JADX WARN: Type inference failed for: r22v78 */
    /* JADX WARN: Type inference failed for: r22v79 */
    /* JADX WARN: Type inference failed for: r22v80 */
    /* JADX WARN: Type inference failed for: r22v81 */
    /* JADX WARN: Type inference failed for: r22v82 */
    /* JADX WARN: Type inference failed for: r22v83 */
    /* JADX WARN: Type inference failed for: r22v84 */
    /* JADX WARN: Type inference failed for: r22v85 */
    /* JADX WARN: Type inference failed for: r22v86 */
    /* JADX WARN: Type inference failed for: r22v87 */
    /* JADX WARN: Type inference failed for: r22v88 */
    /* JADX WARN: Type inference failed for: r22v89 */
    /* JADX WARN: Type inference failed for: r22v90 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r4v172 */
    /* JADX WARN: Type inference failed for: r4v253 */
    /* JADX WARN: Type inference failed for: r4v254 */
    /* JADX WARN: Type inference failed for: r4v274 */
    /* JADX WARN: Type inference failed for: r4v275 */
    /* JADX WARN: Type inference failed for: r4v276 */
    /* JADX WARN: Type inference failed for: r4v62, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v72, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v30, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v305, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v306 */
    /* JADX WARN: Type inference failed for: r6v327 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v100 */
    /* JADX WARN: Type inference failed for: r7v101 */
    /* JADX WARN: Type inference failed for: r7v102 */
    /* JADX WARN: Type inference failed for: r7v116 */
    /* JADX WARN: Type inference failed for: r7v117 */
    /* JADX WARN: Type inference failed for: r7v118 */
    /* JADX WARN: Type inference failed for: r7v119 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r8v548 */
    /* JADX WARN: Type inference failed for: r9v100 */
    /* JADX WARN: Type inference failed for: r9v102 */
    /* JADX WARN: Type inference failed for: r9v103 */
    /* JADX WARN: Type inference failed for: r9v104 */
    /* JADX WARN: Type inference failed for: r9v105 */
    /* JADX WARN: Type inference failed for: r9v116, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v117 */
    /* JADX WARN: Type inference failed for: r9v120 */
    /* JADX WARN: Type inference failed for: r9v121 */
    /* JADX WARN: Type inference failed for: r9v122 */
    /* JADX WARN: Type inference failed for: r9v123 */
    /* JADX WARN: Type inference failed for: r9v129 */
    /* JADX WARN: Type inference failed for: r9v154 */
    /* JADX WARN: Type inference failed for: r9v155 */
    /* JADX WARN: Type inference failed for: r9v157, types: [int[]] */
    /* JADX WARN: Type inference failed for: r9v171 */
    /* JADX WARN: Type inference failed for: r9v176 */
    /* JADX WARN: Type inference failed for: r9v177 */
    /* JADX WARN: Type inference failed for: r9v208 */
    /* JADX WARN: Type inference failed for: r9v209 */
    /* JADX WARN: Type inference failed for: r9v210 */
    /* JADX WARN: Type inference failed for: r9v211 */
    /* JADX WARN: Type inference failed for: r9v212 */
    /* JADX WARN: Type inference failed for: r9v213 */
    /* JADX WARN: Type inference failed for: r9v214 */
    /* JADX WARN: Type inference failed for: r9v215 */
    /* JADX WARN: Type inference failed for: r9v216 */
    /* JADX WARN: Type inference failed for: r9v217 */
    /* JADX WARN: Type inference failed for: r9v218 */
    /* JADX WARN: Type inference failed for: r9v219 */
    /* JADX WARN: Type inference failed for: r9v220 */
    /* JADX WARN: Type inference failed for: r9v221 */
    /* JADX WARN: Type inference failed for: r9v222 */
    /* JADX WARN: Type inference failed for: r9v223 */
    /* JADX WARN: Type inference failed for: r9v224 */
    /* JADX WARN: Type inference failed for: r9v225 */
    /* JADX WARN: Type inference failed for: r9v59 */
    /* JADX WARN: Type inference failed for: r9v60 */
    /* JADX WARN: Type inference failed for: r9v61 */
    /* JADX WARN: Type inference failed for: r9v62, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v87 */
    /* JADX WARN: Type inference failed for: r9v88 */
    /* JADX WARN: Type inference failed for: r9v89 */
    /* JADX WARN: Type inference failed for: r9v90, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v97 */
    /* JADX WARN: Type inference failed for: r9v99, types: [java.lang.String] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 16994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.login.ui.activity.OtpVerifyActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$7ICo_Kmrqi9oRkNOpXqVKShsl1M(OtpVerifyActivity otpVerifyActivity, View view) {
        int i = 2 % 2;
        int i2 = toString + 13;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        m10659instrumented$0$initListener$V(otpVerifyActivity, view);
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
    }

    public static void m10655$r8$lambda$FKpK94vWAOce7DwLqSghHGD5jQ(OtpVerifyActivity otpVerifyActivity, View view) {
        int i = 2 % 2;
        int i2 = hashCode + 97;
        toString = i2 % 128;
        int i3 = i2 % 2;
        m10660instrumented$1$initListener$V(otpVerifyActivity, view);
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
    }

    public static void m10656$r8$lambda$JfO70Fo39Z9sGeFxiFY0TUQ54g(OtpVerifyActivity otpVerifyActivity, View view) {
        int i = 2 % 2;
        int i2 = toString + 123;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        m10661instrumented$2$initListener$V(otpVerifyActivity, view);
        int i4 = toString + 29;
        hashCode = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
    }

    public static Unit m10657$r8$lambda$ROFxVYJRTw0MpX7g2osMPaE0BU(OtpVerifyActivity otpVerifyActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = hashCode + 125;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Unit unitInitBiometricViewModelIfNeed$lambda$4 = initBiometricViewModelIfNeed$lambda$4(otpVerifyActivity, resource);
        if (i3 == 0) {
            int i4 = 47 / 0;
        }
        return unitInitBiometricViewModelIfNeed$lambda$4;
    }

    public static Unit m10658$r8$lambda$mAhlqIVE1Mbi1kNTUNTVksQuqw(OtpVerifyActivity otpVerifyActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = hashCode + 7;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAddObserver$lambda$6 = addObserver$lambda$6(otpVerifyActivity, resource);
        int i4 = hashCode + 85;
        toString = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAddObserver$lambda$6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Unit $r8$lambda$mgCIkbMjQsdA_oS7dG8KzkIQT_A(OtpVerifyActivity otpVerifyActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = toString + 79;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAddObserver$lambda$5 = addObserver$lambda$5(otpVerifyActivity, resource);
        int i4 = hashCode + 77;
        toString = i4 % 128;
        int i5 = i4 % 2;
        return unitAddObserver$lambda$5;
    }

    public static void $r8$lambda$tU5c_nApca94g97sDchit2v5T7g(CommonDialog commonDialog) {
        int i = 2 % 2;
        int i2 = toString + 51;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        onLoginResponse$lambda$8(commonDialog);
        int i4 = toString + 105;
        hashCode = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
    }

    public static Unit $r8$lambda$y6snsSE7M9htVRPK6P1Y2Y7ITTs(OtpVerifyActivity otpVerifyActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = hashCode + 63;
        toString = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            addObserver$lambda$7(otpVerifyActivity, resource);
            obj.hashCode();
            throw null;
        }
        Unit unitAddObserver$lambda$7 = addObserver$lambda$7(otpVerifyActivity, resource);
        int i3 = hashCode + 35;
        toString = i3 % 128;
        if (i3 % 2 != 0) {
            return unitAddObserver$lambda$7;
        }
        throw null;
    }

    static {
        ArtificialStackFrames = 1;
        copydefault();
        ShareDataUIState();
        int i = getSponsorBeneficiariesState + 77;
        ArtificialStackFrames = i % 128;
        int i2 = i % 2;
    }

    private static void m10659instrumented$0$initListener$V(OtpVerifyActivity otpVerifyActivity, View view) {
        int i = 2 % 2;
        int i2 = toString + 113;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                initListener$lambda$1(otpVerifyActivity, view);
                Callback.onClick_exit();
            } else {
                initListener$lambda$1(otpVerifyActivity, view);
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

    private static void m10660instrumented$1$initListener$V(OtpVerifyActivity otpVerifyActivity, View view) {
        int i = 2 % 2;
        int i2 = toString + 45;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            initListener$lambda$2(otpVerifyActivity, view);
            Callback.onClick_exit();
            int i4 = hashCode + 1;
            toString = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 18 / 0;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m10661instrumented$2$initListener$V(OtpVerifyActivity otpVerifyActivity, View view) {
        int i = 2 % 2;
        int i2 = hashCode + 73;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            initListener$lambda$3(otpVerifyActivity, view);
            Callback.onClick_exit();
            int i4 = hashCode + 33;
            toString = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = hashCode + 111;
        toString = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = hashCode + 15;
        toString = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = toString + 123;
        hashCode = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static void ShareDataUIState() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 9;
        toString = i3 % 128;
        int i4 = i3 % 2;
        copydefault = new char[]{404, 36863, 7508, 43756, 14339, 51585, 22524, 58705, 29354, 1, 37343, 8190, 44362, 15019, 51260, 22922, 59366, 30028, 697, 36915, 8578, 45033, 15688, 51928, 22571, 59862, 30690, 1349, 37597, 8239, 45456, 16355, 52594, 23234, 59511, 31120, 2030, 38265, 8914, 45106, 16778, 53227, 23934, 60116, 30757, 2437, 38674, 9520, 45797, 16402};
        component3 = 6200362272542523921L;
        int i5 = i2 + 61;
        toString = i5 % 128;
        int i6 = i5 % 2;
    }

    static void copydefault() {
        component1 = -3780477796495014671L;
        component2 = 1386857713;
        ShareDataUIState = (char) 25884;
        copy = -1760131687;
        getAsAtTimestamp = -238323918;
        component4 = -175250274;
        equals = new byte[]{42, -43, -38, 35, Base64.padSymbol, -14, 44, 34, -38, 36, -36, 56, Ascii.VT, 58, -105, 41, 38, Ascii.SUB, -29, -46, -45, -44, 39, -33, 36, 7, -44, 42, -42, 44, -43, -41, -4, -41, 3, 46, 40, 40, -26, -43, -42, 41, 44, -42, 7, -25, 7, 45, -26, 6, 42, -5, 5, 41, 45, -26, 5, -8, Ascii.ESC, -45, 41, 42, -6, Ascii.SUB, -30, 43, 5, 40, -7, Ascii.FS, -47, -15, 44, -45, 42, 42, -36, 40, -36, 5, -14, -36, 59, TarHeader.LF_NORMAL, -26, 44, 34, -36, 47, 32, 40, -46, 33, -35, 42, 0, -1, 33, -40, 40, -45, Ascii.SI, Ascii.FF, -110, 45, 104, -29, -46, -45, -44, 39, -33, 36, -47, 45, -36, 33, 34, -43, 58, -57, -42, -37, 42, 38, -36, 46, 43, -43, -41, 40, 45, -42, 45, -45, 44, -48, -48, 45, 40, 40, -45, 41, 40, 42, -44, 41, 41, 41, 41, 41, 41, 41, 41};
    }
}
