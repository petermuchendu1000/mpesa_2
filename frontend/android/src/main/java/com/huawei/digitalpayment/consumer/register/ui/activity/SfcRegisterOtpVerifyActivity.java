package com.huawei.digitalpayment.consumer.register.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Observer;
import androidx.work.WorkRequest;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.griver.base.common.utils.ToastUtils;
import com.blankj.utilcode.constant.CacheConstants;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.common.widget.MPTextWatcher;
import com.huawei.common.widget.toast.CommonToast;
import com.huawei.digitalpayment.consumer.base.sms.SmsAutoFill;
import com.huawei.digitalpayment.consumer.base.ui.widget.SafeInputKeyboard;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.dialog.CommonDialog;
import com.huawei.digitalpayment.consumer.baselib.util.DialogUtils;
import com.huawei.digitalpayment.consumer.baselib.util.PhoneUtils;
import com.huawei.digitalpayment.consumer.baselib.util.SpannableStringUtils;
import com.huawei.digitalpayment.consumer.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.login.R;
import com.huawei.digitalpayment.consumer.login.databinding.ActivitySfcRegisterOtpVerifyBinding;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model.LocalQueryLoginType;
import com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.RegisterOtpViewModel;
import com.huawei.digitalpayment.consumer.risk.bean.ProcessVerifyParams;
import com.huawei.digitalpayment.consumer.service.ILoginModuleService;
import com.huawei.digitalpayment.consumer.service.IRiskService;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;
import com.huawei.payment.mvvm.Utils;
import dagger.hilt.android.AndroidEntryPoint;
import j$.util.DesugarTimeZone;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Function;
import kotlin.INotificationSideChannel;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.cancelAll;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.lang3.CharUtils;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0012\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0002J\b\u0010\u001b\u001a\u00020\u0015H\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0002J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u0015H\u0002J\u0010\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0018H\u0002J\u0012\u0010$\u001a\u00020\u00152\b\u0010%\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010&\u001a\u00020\u00152\b\u0010'\u001a\u0004\u0018\u00010\u0007H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006("}, d2 = {"Lcom/huawei/digitalpayment/consumer/register/ui/activity/SfcRegisterOtpVerifyActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcPaymentBaseActivity;", "Lcom/huawei/digitalpayment/consumer/login/databinding/ActivitySfcRegisterOtpVerifyBinding;", "Lcom/huawei/digitalpayment/consumer/loginModule/register/viewmodel/RegisterOtpViewModel;", "<init>", "()V", "TERMS_CONDITIONS", "", KeysConstants.KEY_ONE_STEP_REGISTER_TAG, "", KeysConstants.KEY_ASYNC_REGISTER_TAG, "isNewRegister", "initiatorCode", "queryLoginType", "Lcom/huawei/digitalpayment/consumer/loginModule/login/data/source/local/model/LocalQueryLoginType;", "getLayoutId", "", "downTimer", "com/huawei/digitalpayment/consumer/register/ui/activity/SfcRegisterOtpVerifyActivity$downTimer$1", "Lcom/huawei/digitalpayment/consumer/register/ui/activity/SfcRegisterOtpVerifyActivity$downTimer$1;", "startTimer", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "registerSms", "initListener", "initView", "getSmsCode", "addObserver", "onVerifyError", ToastUtils.TYPE.TYPE_EXCEPTION, "Lcom/huawei/common/exception/BaseException;", "processVerify", "toNext", "result", "autoLogin", KeysConstants.KEY_FORWARD, "initToolbar", "title", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SfcRegisterOtpVerifyActivity extends Hilt_SfcRegisterOtpVerifyActivity<ActivitySfcRegisterOtpVerifyBinding, RegisterOtpViewModel> {
    public static final int $stable = 8;
    private static int ArtificialStackFrames;
    private static char ShareDataUIState;
    private static char component1;
    private static char[] component2;
    private static int component3;
    private static char component4;
    private static char copy;
    private static long copydefault;
    private static char getAsAtTimestamp;
    private static char getRequestBeneficiariesState;
    private boolean asyncRegisterTag;
    private String initiatorCode;
    private boolean isNewRegister;
    private boolean oneStepRegisterTag;
    private LocalQueryLoginType queryLoginType;
    private static final byte[] $$l = {Ascii.GS, -59, -25, -119};
    private static final int $$o = 180;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {104, -2, Ascii.CAN, -74, -23, -9, TarHeader.LF_BLK, PSSSigner.TRAILER_IMPLICIT, -19, -11, -3, -16, -4, 44, -62, -24, -1, -25, -8, -5, -6, 43, -74, 1, -30, 4, -24, -2, -3, -22, TarHeader.LF_CHR, -70, -16, -17, 4, -24, -7, 2, -22, TarHeader.LF_CHR, -45, -28, -28, 4, -13, -18, 0, -12, -21, -4, 7, -40, 4, -28, -12, 3, 17, -48, -17, 40, -60, -11, 6, -35, 74, -24, -23, -9, -14, -10, -10, -2, -20, -17, 56, -23, -9, -14, -10, -10, -2, -20, -17, TarHeader.LF_FIFO};
    private static final int $$k = 170;
    private static final byte[] $$d = {115, Ascii.RS, 119, 102, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 30;
    private static int getSponsorBeneficiariesState = 1;
    private static int equals = 0;
    private static int getShareableDataState = 1;
    private final String TERMS_CONDITIONS = "native://app/loginModule/smsSelfRegister/verify/success";
    private SfcRegisterOtpVerifyActivity$downTimer$1 downTimer = new CountDownTimer() {
        private static int ShareDataUIState = 1;
        private static int component3;

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
            ((ActivitySfcRegisterOtpVerifyBinding) SfcRegisterOtpVerifyActivity.access$getBinding$p(this.component1)).tvCountDown.setText(str2);
            int i2 = component3 + 7;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public void onFinish() {
            TextView textView;
            int i;
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 107;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                textView = ((ActivitySfcRegisterOtpVerifyBinding) SfcRegisterOtpVerifyActivity.access$getBinding$p(this.component1)).tvCountDown;
                i = 91;
            } else {
                textView = ((ActivitySfcRegisterOtpVerifyBinding) SfcRegisterOtpVerifyActivity.access$getBinding$p(this.component1)).tvCountDown;
                i = 8;
            }
            textView.setVisibility(i);
            int i4 = ShareDataUIState + 97;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
    };

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component1 implements Observer, FunctionAdapter {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        private final Function1 copydefault;

        component1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        public final boolean equals(Object obj) {
            boolean z;
            int i = 2 % 2;
            int i2 = ShareDataUIState + 15;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                z = true;
                if (!(obj instanceof Observer)) {
                    return true;
                }
            } else {
                z = false;
                if (!(obj instanceof Observer)) {
                    return false;
                }
            }
            if (!(obj instanceof FunctionAdapter)) {
                return z;
            }
            boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            int i3 = component2 + 97;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return zAreEqual;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 69;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.copydefault;
            int i5 = i3 + 111;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 23;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                getFunctionDelegate().hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = ShareDataUIState + 83;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 23;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            this.copydefault.invoke(obj);
            if (i3 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(byte r7, int r8, short r9) {
        /*
            int r7 = r7 + 98
            byte[] r0 = com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterOtpVerifyActivity.$$l
            int r8 = r8 + 4
            int r9 = r9 * 4
            int r9 = 1 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r5 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L20
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L20:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L28:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r3
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterOtpVerifyActivity.$$r(byte, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = r6 + 4
            int r8 = r8 * 2
            int r8 = 103 - r8
            int r7 = 99 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterOtpVerifyActivity.$$d
            byte[] r0 = new byte[r0]
            int r6 = r6 + 3
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r7 = r7 + 1
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r7 = r7 + r4
            int r7 = r7 + (-8)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterOtpVerifyActivity.i(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(byte r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterOtpVerifyActivity.$$j
            int r8 = r8 + 4
            int r9 = r9 * 3
            int r9 = r9 + 99
            int r7 = r7 * 53
            int r7 = r7 + 10
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r9 = r8
            r5 = r2
            goto L2c
        L15:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L19:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            int r9 = r9 + 1
            r3 = r0[r9]
        L2c:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterOtpVerifyActivity.j(byte, short, int, java.lang.Object[]):void");
    }

    public static final ViewDataBinding access$getBinding$p(SfcRegisterOtpVerifyActivity sfcRegisterOtpVerifyActivity) {
        int i = 2 % 2;
        int i2 = equals + 81;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Binding binding = sfcRegisterOtpVerifyActivity.binding;
        if (i3 == 0) {
            throw null;
        }
        int i4 = equals + 7;
        getShareableDataState = i4 % 128;
        if (i4 % 2 != 0) {
            return binding;
        }
        obj.hashCode();
        throw null;
    }

    public static final void access$onVerifyError(SfcRegisterOtpVerifyActivity sfcRegisterOtpVerifyActivity, BaseException baseException) {
        int i = 2 % 2;
        int i2 = equals + 29;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        sfcRegisterOtpVerifyActivity.onVerifyError(baseException);
        if (i3 == 0) {
            throw null;
        }
        int i4 = equals + 57;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void access$toNext(SfcRegisterOtpVerifyActivity sfcRegisterOtpVerifyActivity, Bundle bundle) {
        int i = 2 % 2;
        int i2 = equals + 121;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        sfcRegisterOtpVerifyActivity.toNext(bundle);
        int i4 = getShareableDataState + 37;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = equals + 119;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_sfc_register_otp_verify;
        int i5 = getShareableDataState + 61;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    private final void startTimer() {
        TextView textView;
        int i;
        int i2 = 2 % 2;
        int i3 = getShareableDataState + 115;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            start();
            ((ActivitySfcRegisterOtpVerifyBinding) this.binding).etCode.requestFocus();
            textView = ((ActivitySfcRegisterOtpVerifyBinding) this.binding).tvCountDown;
            i = 1;
        } else {
            start();
            ((ActivitySfcRegisterOtpVerifyBinding) this.binding).etCode.requestFocus();
            textView = ((ActivitySfcRegisterOtpVerifyBinding) this.binding).tvCountDown;
            i = 0;
        }
        textView.setVisibility(i);
    }

    private static void h(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        int i3 = $10 + 109;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i5 = $11 + 25;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i7 = 58224;
            for (int i8 = 0; i8 < 16; i8++) {
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i7) ^ ((c3 << 4) + ((char) (((long) getAsAtTimestamp) ^ 4374495167426960553L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(getRequestBeneficiariesState)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) (-1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(844 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 32, (char) (23251 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 592652048, false, $$r((byte) 13, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) copy) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component4)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b3 = (byte) (-1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Drawable.resolveOpacity(0, 0) + 844, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 31, (char) (23252 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 592652048, false, $$r((byte) 13, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
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
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(465 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 49 - View.combineMeasuredStates(0, 0), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void k(char c2, char[] cArr, int i, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
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
        while (iNotificationSideChannel.copydefault < length3) {
            int i5 = $11 + 75;
            $10 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int threadPriority = 4037 - ((Process.getThreadPriority(i4) + 20) >> 6);
                    int fadingEdgeLength = 31 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 19182);
                    byte b2 = (byte) 1;
                    byte b3 = (byte) (-b2);
                    String str$$r = $$r(b2, b3, (byte) (b3 + 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(threadPriority, fadingEdgeLength, cLastIndexOf, 1912513118, false, str$$r, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    int iMyPid = (Process.myPid() >> 22) + 7567;
                    int iResolveOpacity = 11 - Drawable.resolveOpacity(i4, i4);
                    char c3 = (char) ((ExpandableListView.getPackedPositionForChild(i4, i4) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i4, i4) == 0L ? 0 : -1)) + 1);
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i4] = Object.class;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iMyPid, iResolveOpacity, c3, 2006389106, false, "e", clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                int i7 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i7);
                objArr4[i4] = iNotificationSideChannel;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) i4;
                    byte b5 = (byte) (b4 - 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(i4, i4, i4) + 2459, TextUtils.indexOf("", "") + 28, (char) ((-1) - ImageFormat.getBitsPerPixel(i4)), 931716605, false, $$r(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), MotionEvent.axisFromString("") + 12, (char) ExpandableListView.getPackedPositionType(0L), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr2[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (copydefault ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component3) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) ShareDataUIState) ^ (-3780477796495014671L)))));
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
        int i8 = $10 + 99;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    private static void g(int i, byte b2, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = component2;
        int i4 = 64291;
        Object obj2 = null;
        if (cArr2 != null) {
            int i5 = $10;
            int i6 = i5 + 9;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = i5 + 5;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 0;
            while (i10 < length) {
                int i11 = $10 + 105;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i10])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getTrimmedLength("") + 7422, View.resolveSizeAndState(0, 0, 0) + 15, (char) (KeyEvent.normalizeMetaState(0) + i4), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i10] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i10++;
                    int i13 = $11 + 15;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    i4 = 64291;
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
        Object[] objArr3 = {Integer.valueOf(component1)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        long j = 0;
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7422 - ExpandableListView.getPackedPositionGroup(0L), 15 - (ViewConfiguration.getTapTimeout() >> 16), (char) (KeyEvent.keyCodeFromString("") + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i15 = $10 + 61;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            cancelall.component2 = 0;
            while (cancelall.component2 < i2) {
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7117 - (Process.myTid() >> 22), (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 13, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 44462), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                        int i17 = $10 + 11;
                        $11 = i17 % 128;
                        int i18 = i17 % 2;
                        Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault4 == null) {
                            byte b3 = (byte) (-1);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2945 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 25, (char) (View.combineMeasuredStates(0, 0) + 27637), 794909189, false, $$r((byte) 21, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                        int i19 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr2[i19];
                    } else {
                        obj = null;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i20 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i21 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[i20];
                            cArr4[cancelall.component2 + 1] = cArr2[i21];
                        } else {
                            int i22 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i23 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr2[i22];
                            cArr4[cancelall.component2 + 1] = cArr2[i23];
                        }
                    }
                }
                cancelall.component2 += 2;
                obj2 = obj;
                j = 0;
            }
        }
        for (int i24 = 0; i24 < i; i24++) {
            cArr4[i24] = (char) (cArr4[i24] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952785_res_0x7f130491).substring(2, 3).codePointAt(0) - 14, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952785_res_0x7f130491).substring(2, 3).codePointAt(0) - 7), new char[]{20, '0', '\n', '\f', '*', 19, CharUtils.CR, 2, '+', JSONLexer.EOI, 0, 5, '\f', '.', 0, 23, 13826, 13826}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(13) - 41, new char[]{15593, 41613, 35437, 15300, 39443, 42860}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i2 = getShareableDataState + 27;
                equals = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr4 = new Object[1];
                g(26 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(22) - 56), new char[]{20, '0', '\n', '\f', '*', 19, CharUtils.CR, 2, '\t', '\"', '\"', 2, 1, 3, 14, 21, 28, 19, '\b', 28, '\n', 5, 7, 25, 7, '\n'}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 96, new char[]{23553, 29899, 54484, 725, 57086, 16103, 11458, 25890, 39007, 7202, 65185, 41864, 62036, 26463, 23827, 61285, 56077, 59987}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                if ((!(baseContext instanceof ContextWrapper)) || ((ContextWrapper) baseContext).getBaseContext() != null) {
                    baseContext = baseContext.getApplicationContext();
                    int i4 = equals + 111;
                    getShareableDataState = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    baseContext = null;
                }
            }
            if (baseContext != null) {
                int i6 = equals + 83;
                getShareableDataState = i6 % 128;
                int i7 = i6 % 2;
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 41 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (Process.myPid() >> 22), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952832_res_0x7f1304c0).substring(0, 1).codePointAt(0) + 11, new char[]{22554, 23505, 62048, 7542, 47560, 15625, 63650, 23212, 9758, 9646, 35761, 56491, 23102, 15332, 15413, 6078, 27236, 57884, 31083, 49643, 43525, 25867, 51872, 17852, 28095, 12695, 44931, 48085, 13278, 40004, 60819, 64375, 38724, 33811, 51123, 32856, 37732, 7404, 62036, 26463, 4874, 46066, 16860, 56544, 25697, 8594, 64700, 53636}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    g((ViewConfiguration.getLongPressTimeout() >> 16) + 64, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131953647_res_0x7f1307ef).substring(0, 4).codePointAt(1) + 77), new char[]{23, '\n', '\"', 18, 24, 19, 13940, 13940, 22, '-', 14, 18, '(', '%', 13940, 13940, '!', 25, '+', CharUtils.CR, 22, '/', 25, '!', AbstractJsonLexerKt.COMMA, 6, 11, 30, ')', '+', '+', 15, 27, '/', 1, '\t', 23, 7, 16, 6, 6, AbstractJsonLexerKt.COMMA, ')', 18, AbstractJsonLexerKt.COMMA, 15, 17, 14, '\n', 23, 7, '\t', 20, '.', AbstractJsonLexerKt.COMMA, '*', '\'', 29, ')', '.', '\'', '.', '%', '('}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952856_res_0x7f1304d8).substring(9, 10).length() + 63, new char[]{19181, 61752, 36713, 22310, 53273, 58519, 57799, 6884, 27614, 38724, 50280, 47998, 61421, 61133, 46300, 54112, 4144, 29249, 31083, 49643, 42612, 61252, 25765, 38841, 9571, 15730, 31094, 32547, 36885, 49090, 18273, 5091, 13074, 49321, 37469, 64022, 20727, 34449, 43549, 27164, 30799, 351, 31641, 54346, 31823, 52850, 54523, 6791, 33643, 43967, 43422, 21242, 25160, 47619, 62842, 12748, 16098, 22679, 12758, 21592, 4874, 46066, 58817, 22942}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    g(72 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952719_res_0x7f13044f).substring(6, 7).length() + 18), new char[]{0, '\n', '\t', 28, 21, '+', 13768, 13768, '%', 15, '.', 20, 29, '.', 18, 17, 15, ')', 13755, 13755, 18, 19, 1, '\t', 0, CharUtils.CR, 4, '\n', 27, 7, '\t', 0, '\b', 27, CharUtils.CR, 0, ')', 30, 7, '\f', '\b', 23, ')', '!', 7, '\f', 27, 0, 5, AbstractJsonLexerKt.COMMA, 4, '+', '\t', '\"', 18, '*', 20, '#', '#', 23, 21, '\b', '/', ' ', 25, '-', JSONLexer.EOI, 28, 27, '#', '\b', 21}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 23, (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 4), new char[]{')', 4, 14, 18, 4, '\"'}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952832_res_0x7f1304c0).substring(0, 1).codePointAt(0) - 1, new char[]{9800, 7322, 55471, 21979, 5972, 55936, 16281, 6825, 36044, 22999, 27066, 29126, 16273, 15276, 42969, 33526, 9086, 8412, 12352, 13165, 27887, 40385, 64644, 33002, 51872, 17852, 38823, 46804, 22953, 16040, 1986, 45058, 63178, 32047, 61421, 61133}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - View.MeasureSpec.getMode(0), 56 - (ViewConfiguration.getTouchSlop() >> 8), (char) (KeyEvent.getMaxKeyCode() >> 16), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr12);
                    int i8 = equals + 125;
                    getShareableDataState = i8 % 128;
                    int i9 = i8 % 2;
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
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2405;
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 26;
            char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
            byte b2 = $$d[33];
            Object[] objArr13 = new Object[1];
            i(b2, (byte) (b2 | 96), r6[31], objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(maximumDrawingCacheSize, packedPositionGroup, fadingEdgeLength, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                int iKeyCodeFromString = 2405 - KeyEvent.keyCodeFromString("");
                int trimmedLength = TextUtils.getTrimmedLength("") + 26;
                char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                byte[] bArr = $$d;
                Object[] objArr14 = new Object[1];
                i(bArr[8], (byte) 93, bArr[31], objArr14);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iKeyCodeFromString, trimmedLength, scrollBarFadeDuration, 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(21) - 89, new char[]{65381, 12069, 44612, 20905, 9987, 17123, 16809, 4470, 51845, 43277, 9997, 57795, 32492, 56929, 40417, 54991}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            g(TextUtils.getTrimmedLength("") + 16, (byte) (48 - (ViewConfiguration.getEdgeSlop() >> 16)), new char[]{16, 7, 27, '#', 14, 21, '\b', 28, ')', 7, 24, 1, JSONLexer.EOI, AbstractJsonLexerKt.COMMA, 7, 23}, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i10 = getShareableDataState + 39;
            equals = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, 1178629147};
                byte[] bArr2 = $$j;
                Object[] objArr18 = new Object[1];
                j(bArr2[23], bArr2[16], bArr2[46], objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b3 = bArr2[46];
                byte b4 = b3;
                Object[] objArr19 = new Object[1];
                j(b4, (byte) (b4 | Base64.padSymbol), b3, objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    byte[] bArr3 = $$d;
                    Object[] objArr20 = new Object[1];
                    i(bArr3[8], (byte) 93, bArr3[31], objArr20);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2404 - Process.getGidForName(""), (Process.myTid() >> 22) + 26, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 24929979, false, (String) objArr20[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952805_res_0x7f1304a5).substring(19, 20).length() + 21, (byte) (TextUtils.indexOf((CharSequence) "", '0') + 40), new char[]{20, '0', '\n', '\f', '*', 19, CharUtils.CR, 2, '+', JSONLexer.EOI, CharUtils.CR, '\"', '$', 29, 14, 28, 2, 22, '(', '-', 3, AbstractJsonLexerKt.COMMA}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(23) - 86, new char[]{39587, 7944, 45118, 57990, 40401, 39941, 8251, 50457, 38724, 33811, 53124, 27409, 30289, 2105, 54849, 7830}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2405;
                        int mode = 26 - View.MeasureSpec.getMode(0);
                        char cIndexOf = (char) TextUtils.indexOf("", "");
                        Object[] objArr23 = new Object[1];
                        i((byte) (-$$d[38]), (byte) 84, r9[33], objArr23);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(scrollDefaultDelay, mode, cIndexOf, -1843538389, false, (String) objArr23[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 2406;
                        int iIndexOf = 25 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        byte b5 = $$d[33];
                        Object[] objArr24 = new Object[1];
                        i(b5, (byte) (b5 | 96), r7[31], objArr24);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(modifierMetaStateMask, iIndexOf, minimumFlingVelocity, -2047739879, false, (String) objArr24[0], null);
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
        int i12 = ((int[]) objArr[0])[0];
        int i13 = ((int[]) objArr[2])[0];
        if (i13 != i12) {
            long j = -1;
            long j2 = ((long) (i13 ^ i12)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 6618, 42 - ExpandableListView.getPackedPositionType(0L), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            try {
                Object[] objArr25 = {1608107444, Long.valueOf(j4), new ArrayList(), null, true};
                Class cls6 = (Class) ITrustedWebActivityCallbackDefault.copydefault(6562 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 56 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ExpandableListView.getPackedPositionType(0L));
                byte[] bArr4 = $$j;
                byte b6 = bArr4[46];
                Object[] objArr26 = new Object[1];
                j(b6, (byte) (-bArr4[31]), b6, objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(savedInstanceState);
        initView();
        initListener();
        getSmsCode();
        registerSms();
        addObserver();
    }

    private final void registerSms() {
        int i = 2 % 2;
        getLifecycle().addObserver(new SmsAutoFill(new ApiCallback<String>() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public void onSuccess(String str) {
                int i2 = 2 % 2;
                int i3 = copydefault + 3;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Object obj = null;
                onSuccess2(str);
                if (i4 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i5 = copydefault + 89;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            public void onSuccess2(String value) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 45;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                ((ActivitySfcRegisterOtpVerifyBinding) SfcRegisterOtpVerifyActivity.access$getBinding$p(SfcRegisterOtpVerifyActivity.this)).etCode.setText(value);
                ((ActivitySfcRegisterOtpVerifyBinding) SfcRegisterOtpVerifyActivity.access$getBinding$p(SfcRegisterOtpVerifyActivity.this)).btnConfirm.performClick();
                int i5 = copydefault + 5;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
        }));
        int i2 = equals + 15;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void initListener$lambda$0(SfcRegisterOtpVerifyActivity sfcRegisterOtpVerifyActivity, View view) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 59;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(sfcRegisterOtpVerifyActivity, "");
        sfcRegisterOtpVerifyActivity.getSmsCode();
        int i4 = getShareableDataState + 71;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void initListener$lambda$1(com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterOtpVerifyActivity r2, android.view.View r3) {
        /*
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterOtpVerifyActivity.getShareableDataState
            int r0 = r0 + 93
            int r1 = r0 % 128
            com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterOtpVerifyActivity.equals = r1
            int r0 = r0 % r3
            java.lang.String r1 = ""
            if (r0 == 0) goto L2c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            Binding extends androidx.databinding.ViewDataBinding r0 = r2.binding
            com.huawei.digitalpayment.consumer.login.databinding.ActivitySfcRegisterOtpVerifyBinding r0 = (com.huawei.digitalpayment.consumer.login.databinding.ActivitySfcRegisterOtpVerifyBinding) r0
            com.huawei.digitalpayment.consumer.baselib.widget.code.CodeEditText r0 = r0.etCode
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.initiatorCode = r0
            boolean r0 = r2.isNewRegister
            r1 = 10
            int r1 = r1 / 0
            if (r0 == 0) goto L47
            goto L43
        L2c:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            Binding extends androidx.databinding.ViewDataBinding r0 = r2.binding
            com.huawei.digitalpayment.consumer.login.databinding.ActivitySfcRegisterOtpVerifyBinding r0 = (com.huawei.digitalpayment.consumer.login.databinding.ActivitySfcRegisterOtpVerifyBinding) r0
            com.huawei.digitalpayment.consumer.baselib.widget.code.CodeEditText r0 = r0.etCode
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.initiatorCode = r0
            boolean r0 = r2.isNewRegister
            if (r0 == 0) goto L47
        L43:
            r2.processVerify()
            goto L58
        L47:
            VM extends androidx.lifecycle.ViewModel r0 = r2.viewModel
            com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.RegisterOtpViewModel r0 = (com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.RegisterOtpViewModel) r0
            java.lang.String r2 = r2.initiatorCode
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            com.huawei.digitalpayment.consumer.loginModule.register.request.OtpRegisterParams r1 = new com.huawei.digitalpayment.consumer.loginModule.register.request.OtpRegisterParams
            r1.<init>(r2)
            r0.registerSmsCodeVerify2(r1)
        L58:
            int r2 = com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterOtpVerifyActivity.equals
            int r2 = r2 + 15
            int r0 = r2 % 128
            com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterOtpVerifyActivity.getShareableDataState = r0
            int r2 = r2 % r3
            if (r2 == 0) goto L64
            return
        L64:
            r2 = 0
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterOtpVerifyActivity.initListener$lambda$1(com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterOtpVerifyActivity, android.view.View):void");
    }

    private final void initListener() {
        int i = 2 % 2;
        ((ActivitySfcRegisterOtpVerifyBinding) this.binding).etCode.setGravity(1);
        ((ActivitySfcRegisterOtpVerifyBinding) this.binding).tvResend.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = copydefault + 119;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    SfcRegisterOtpVerifyActivity.$r8$lambda$L0y6Y2If_Ea8VTr26GBVdf9toRA(this.f$0, view);
                    int i4 = 29 / 0;
                } else {
                    SfcRegisterOtpVerifyActivity.$r8$lambda$L0y6Y2If_Ea8VTr26GBVdf9toRA(this.f$0, view);
                }
                int i5 = copydefault + 73;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        ((ActivitySfcRegisterOtpVerifyBinding) this.binding).btnConfirm.setOnClickListener(new View.OnClickListener() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = copydefault + 125;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                SfcRegisterOtpVerifyActivity.$r8$lambda$ZEfhsTiLK47Fj7WcwaGh2VTyh2Q(this.f$0, view);
                int i5 = component2 + 87;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        });
        ((ActivitySfcRegisterOtpVerifyBinding) this.binding).virtualKeyboardView.setOnInputListener(new SafeInputKeyboard.OnInputListener() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public void onDelete() {
                int i2 = 2 % 2;
                int i3 = copydefault + 93;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                ((ActivitySfcRegisterOtpVerifyBinding) SfcRegisterOtpVerifyActivity.access$getBinding$p(SfcRegisterOtpVerifyActivity.this)).etCode.remove();
                if (i4 == 0) {
                    int i5 = 56 / 0;
                }
            }

            @Override
            public void onInput(char c2) {
                int i2 = 2 % 2;
                int i3 = component2 + 113;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                ViewDataBinding viewDataBindingAccess$getBinding$p = SfcRegisterOtpVerifyActivity.access$getBinding$p(SfcRegisterOtpVerifyActivity.this);
                if (i4 == 0) {
                    ((ActivitySfcRegisterOtpVerifyBinding) viewDataBindingAccess$getBinding$p).etCode.add(Character.valueOf(c2).toString());
                    return;
                }
                ((ActivitySfcRegisterOtpVerifyBinding) viewDataBindingAccess$getBinding$p).etCode.add(Character.valueOf(c2).toString());
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onBiometric(String value) {
                int i2 = 2 % 2;
                int i3 = component2 + 71;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(value, "");
                int i5 = component2 + 107;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onForget() {
                int i2 = 2 % 2;
                int i3 = copydefault + 69;
                component2 = i3 % 128;
                int i4 = i3 % 2;
            }
        });
        ((ActivitySfcRegisterOtpVerifyBinding) this.binding).ivBack.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component2 + 103;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                SfcRegisterOtpVerifyActivity.$r8$lambda$SrZ748iwBWmFCsUP_yXnaSmusgo(this.f$0, view);
                int i5 = component2 + 59;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 66 / 0;
                }
            }
        });
        int i2 = getShareableDataState + 83;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void initListener$lambda$2(SfcRegisterOtpVerifyActivity sfcRegisterOtpVerifyActivity, View view) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 1;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(sfcRegisterOtpVerifyActivity, "");
            sfcRegisterOtpVerifyActivity.finish();
            int i3 = 3 / 0;
        } else {
            Intrinsics.checkNotNullParameter(sfcRegisterOtpVerifyActivity, "");
            sfcRegisterOtpVerifyActivity.finish();
        }
        int i4 = equals + 33;
        getShareableDataState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void initView() {
        int i = 2 % 2;
        TextView textView = ((ActivitySfcRegisterOtpVerifyBinding) this.binding).tvTips;
        int i2 = R.string.send_message_tips;
        SfcPhoneNumberUtil.Companion companion = SfcPhoneNumberUtil.INSTANCE;
        String recentLoginPhone = PhoneUtils.getRecentLoginPhone();
        Intrinsics.checkNotNullExpressionValue(recentLoginPhone, "");
        textView.setText(getString(i2, new Object[]{companion.formatPhoneNumber(recentLoginPhone, true)}));
        ((ActivitySfcRegisterOtpVerifyBinding) this.binding).etCode.setMaxEms(AppConfigManager.getAppConfig().getOtpLimit());
        ((ActivitySfcRegisterOtpVerifyBinding) this.binding).etCode.addTextChangedListener(new MPTextWatcher() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public void afterTextChanged(Editable s) {
                boolean z;
                int i3 = 2 % 2;
                int i4 = copydefault + 31;
                ShareDataUIState = i4 % 128;
                boolean z2 = false;
                if (i4 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(s, "");
                    super.afterTextChanged(s);
                    if (TextUtils.isEmpty(s)) {
                        z2 = true;
                    } else {
                        z = true;
                        ((ActivitySfcRegisterOtpVerifyBinding) SfcRegisterOtpVerifyActivity.access$getBinding$p(SfcRegisterOtpVerifyActivity.this)).etCode.setError(false);
                        int i5 = ShareDataUIState + 13;
                        copydefault = i5 % 128;
                        int i6 = i5 % 2;
                        z2 = z;
                    }
                } else {
                    Intrinsics.checkNotNullParameter(s, "");
                    super.afterTextChanged(s);
                    if (!TextUtils.isEmpty(s)) {
                        z = false;
                        ((ActivitySfcRegisterOtpVerifyBinding) SfcRegisterOtpVerifyActivity.access$getBinding$p(SfcRegisterOtpVerifyActivity.this)).etCode.setError(false);
                        int i52 = ShareDataUIState + 13;
                        copydefault = i52 % 128;
                        int i62 = i52 % 2;
                        z2 = z;
                    }
                }
                ((ActivitySfcRegisterOtpVerifyBinding) SfcRegisterOtpVerifyActivity.access$getBinding$p(SfcRegisterOtpVerifyActivity.this)).btnConfirm.setEnabled(s.length() != AppConfigManager.getAppConfig().getOtpLimit() ? z2 : true);
            }
        });
        int i3 = equals + 25;
        getShareableDataState = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 80 / 0;
        }
    }

    private final void getSmsCode() {
        int i = 2 % 2;
        Serializable serializableExtra = getIntent().getSerializableExtra("queryLoginType");
        if (serializableExtra instanceof LocalQueryLoginType) {
            int i2 = equals + 69;
            getShareableDataState = i2 % 128;
            if (i2 % 2 == 0) {
                this.queryLoginType = (LocalQueryLoginType) serializableExtra;
                int i3 = 26 / 0;
            } else {
                this.queryLoginType = (LocalQueryLoginType) serializableExtra;
            }
        }
        this.asyncRegisterTag = getIntent().getBooleanExtra(KeysConstants.KEY_ASYNC_REGISTER_TAG, false);
        this.isNewRegister = getIntent().getBooleanExtra(KeysConstants.KEY_NEW_PROCESS, false);
        LocalQueryLoginType localQueryLoginType = this.queryLoginType;
        if (localQueryLoginType != null) {
            Intrinsics.checkNotNull(localQueryLoginType);
            this.oneStepRegisterTag = Intrinsics.areEqual((Object) true, (Object) localQueryLoginType.getOneStepRegisterTag());
            int i4 = getShareableDataState + 117;
            equals = i4 % 128;
            int i5 = i4 % 2;
        }
        BaseRequestParams baseRequestParams = new BaseRequestParams();
        LocalQueryLoginType localQueryLoginType2 = this.queryLoginType;
        if (localQueryLoginType2 != null) {
            Intrinsics.checkNotNull(localQueryLoginType2);
            if (!TextUtils.isEmpty(localQueryLoginType2.getOtpTpe())) {
                HashMap map = new HashMap();
                LocalQueryLoginType localQueryLoginType3 = this.queryLoginType;
                Intrinsics.checkNotNull(localQueryLoginType3);
                map.put(KeysConstants.KEY_OTP_TYPE, localQueryLoginType3.getOtpTpe());
                baseRequestParams.setExtension(map);
            }
        }
        ((RegisterOtpViewModel) this.viewModel).sendRegisterSms(baseRequestParams);
    }

    private static final void addObserver$lambda$4$lambda$3(SfcRegisterOtpVerifyActivity sfcRegisterOtpVerifyActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = equals + 87;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(sfcRegisterOtpVerifyActivity, "");
        ((RegisterOtpViewModel) sfcRegisterOtpVerifyActivity.viewModel).cancel();
        int i4 = getShareableDataState + 81;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit addObserver$lambda$4(final SfcRegisterOtpVerifyActivity sfcRegisterOtpVerifyActivity, Resource resource) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sfcRegisterOtpVerifyActivity, "");
        Intrinsics.checkNotNullParameter(resource, "");
        Utils.showOrHideLoading(sfcRegisterOtpVerifyActivity, resource, new DialogInterface.OnCancelListener() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                int i2 = 2 % 2;
                int i3 = component1 + 57;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    SfcRegisterOtpVerifyActivity.m10936$r8$lambda$8yr4lb7rlPrhUm21nwDXxxau4(this.f$0, dialogInterface);
                    int i4 = 84 / 0;
                } else {
                    SfcRegisterOtpVerifyActivity.m10936$r8$lambda$8yr4lb7rlPrhUm21nwDXxxau4(this.f$0, dialogInterface);
                }
                int i5 = ShareDataUIState + 101;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        if (resource.error()) {
            int i2 = getShareableDataState + 95;
            equals = i2 % 128;
            int i3 = i2 % 2;
            BaseException exception = resource.getException();
            Intrinsics.checkNotNullExpressionValue(exception, "");
            sfcRegisterOtpVerifyActivity.onVerifyError(exception);
            return Unit.INSTANCE;
        }
        if (resource.success()) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(KeysConstants.KEY_ONE_STEP_REGISTER_TAG, sfcRegisterOtpVerifyActivity.oneStepRegisterTag);
            bundle.putBoolean(KeysConstants.KEY_ASYNC_REGISTER_TAG, sfcRegisterOtpVerifyActivity.asyncRegisterTag);
            bundle.putSerializable(KeysConstants.KEY_REGISTER_KYC_INFO, (Serializable) resource.getData());
            RouteUtils.routeWithExecute(RoutePathConstants.TERMS_AND_CONDITIONS, bundle);
            sfcRegisterOtpVerifyActivity.finish();
        }
        Unit unit = Unit.INSTANCE;
        int i4 = equals + 95;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void addObserver() {
        int i = 2 % 2;
        SfcRegisterOtpVerifyActivity sfcRegisterOtpVerifyActivity = this;
        ((RegisterOtpViewModel) this.viewModel).getRegisterLiveData().observe(sfcRegisterOtpVerifyActivity, new component1(new Function1() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 113;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Unit unit$r8$lambda$uvSyNPP0www5geMY87K6slu1v2s = SfcRegisterOtpVerifyActivity.$r8$lambda$uvSyNPP0www5geMY87K6slu1v2s(this.f$0, (Resource) obj);
                int i5 = component3 + 49;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return unit$r8$lambda$uvSyNPP0www5geMY87K6slu1v2s;
            }
        }));
        ((RegisterOtpViewModel) this.viewModel).getSmsData().observe(sfcRegisterOtpVerifyActivity, new component1(new Function1() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 67;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Unit unit$r8$lambda$uEmPZrgidL59CMQ8R2EdQtjk0MY = SfcRegisterOtpVerifyActivity.$r8$lambda$uEmPZrgidL59CMQ8R2EdQtjk0MY(this.f$0, (Resource) obj);
                int i5 = ShareDataUIState + 29;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    return unit$r8$lambda$uEmPZrgidL59CMQ8R2EdQtjk0MY;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }));
        int i2 = equals + 17;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit addObserver$lambda$5(SfcRegisterOtpVerifyActivity sfcRegisterOtpVerifyActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 83;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(sfcRegisterOtpVerifyActivity, "");
        Intrinsics.checkNotNullParameter(resource, "");
        Utils.showOrHideLoading(sfcRegisterOtpVerifyActivity, resource);
        Utils.toastError(resource);
        if (!(!resource.success())) {
            int i4 = getShareableDataState + 121;
            equals = i4 % 128;
            if (i4 % 2 != 0) {
                sfcRegisterOtpVerifyActivity.startTimer();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            sfcRegisterOtpVerifyActivity.startTimer();
            int i5 = equals + 113;
            getShareableDataState = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    private final void onVerifyError(BaseException exception) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 79;
        equals = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ((ActivitySfcRegisterOtpVerifyBinding) this.binding).etCode.showError(exception.getMessage());
            ((ActivitySfcRegisterOtpVerifyBinding) this.binding).etCode.clear();
            if (Intrinsics.areEqual("timeout", exception.getResponseCode())) {
                DialogUtils.showConnectTimeOutDialog(this, new CommonDialog.OnClickListener() {
                    private static int ShareDataUIState = 0;
                    private static int component1 = 1;

                    @Override
                    public final void onClick(CommonDialog commonDialog) {
                        int i3 = 2 % 2;
                        int i4 = ShareDataUIState + 9;
                        component1 = i4 % 128;
                        int i5 = i4 % 2;
                        SfcRegisterOtpVerifyActivity.$r8$lambda$qTGesGQmoClA2ez0gmbG0tU3tpc(commonDialog);
                        int i6 = component1 + 47;
                        ShareDataUIState = i6 % 128;
                        if (i6 % 2 != 0) {
                            throw null;
                        }
                    }
                });
            }
            int i3 = getShareableDataState + 7;
            equals = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        ((ActivitySfcRegisterOtpVerifyBinding) this.binding).etCode.showError(exception.getMessage());
        ((ActivitySfcRegisterOtpVerifyBinding) this.binding).etCode.clear();
        Intrinsics.areEqual("timeout", exception.getResponseCode());
        throw null;
    }

    private static final void onVerifyError$lambda$6(CommonDialog commonDialog) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 123;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(commonDialog, "");
            commonDialog.dismiss();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(commonDialog, "");
        commonDialog.dismiss();
        int i3 = getShareableDataState + 35;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 87 / 0;
        }
    }

    private final void processVerify() {
        String loginType;
        int i = 2 % 2;
        int i2 = equals + 41;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            LocalQueryLoginType localQueryLoginType = this.queryLoginType;
            Intrinsics.checkNotNull(localQueryLoginType);
            if (localQueryLoginType.getLoginType() != null) {
                LocalQueryLoginType localQueryLoginType2 = this.queryLoginType;
                Intrinsics.checkNotNull(localQueryLoginType2);
                loginType = localQueryLoginType2.getLoginType();
            } else {
                int i3 = equals + 91;
                getShareableDataState = i3 % 128;
                int i4 = i3 % 2;
                loginType = "";
            }
            Intrinsics.checkNotNull(loginType);
            String str = this.initiatorCode;
            LocalQueryLoginType localQueryLoginType3 = this.queryLoginType;
            Intrinsics.checkNotNull(localQueryLoginType3);
            ProcessVerifyParams processVerifyParams = new ProcessVerifyParams(loginType, str, localQueryLoginType3.getOtpTpe(), SPUtils.getInstance().getString("recent_login_phone_number"));
            Bundle bundle = new Bundle();
            bundle.putSerializable(KeysConstants.KEY_RISK_PARAMS, processVerifyParams);
            ((IRiskService) RouteUtils.getService(IRiskService.class)).startProcess(bundle, new ApiCallback<Bundle>() {
                private static int ShareDataUIState = 0;
                private static int component1 = 1;

                @Override
                public void onSuccess(Bundle bundle2) {
                    int i5 = 2 % 2;
                    int i6 = ShareDataUIState + 13;
                    component1 = i6 % 128;
                    int i7 = i6 % 2;
                    onSuccess2(bundle2);
                    if (i7 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    int i8 = ShareDataUIState + 51;
                    component1 = i8 % 128;
                    int i9 = i8 % 2;
                }

                public void onSuccess2(Bundle result) {
                    int i5 = 2 % 2;
                    int i6 = component1 + 23;
                    ShareDataUIState = i6 % 128;
                    if (i6 % 2 != 0) {
                        Intrinsics.checkNotNullParameter(result, "");
                        SfcRegisterOtpVerifyActivity.access$toNext(SfcRegisterOtpVerifyActivity.this, result);
                        int i7 = 8 / 0;
                    } else {
                        Intrinsics.checkNotNullParameter(result, "");
                        SfcRegisterOtpVerifyActivity.access$toNext(SfcRegisterOtpVerifyActivity.this, result);
                    }
                    int i8 = component1 + 29;
                    ShareDataUIState = i8 % 128;
                    int i9 = i8 % 2;
                }

                @Override
                public void onError(BaseException e) {
                    int i5 = 2 % 2;
                    int i6 = ShareDataUIState + 101;
                    component1 = i6 % 128;
                    int i7 = i6 % 2;
                    Intrinsics.checkNotNullParameter(e, "");
                    SfcRegisterOtpVerifyActivity.access$onVerifyError(SfcRegisterOtpVerifyActivity.this, e);
                    int i8 = ShareDataUIState + 91;
                    component1 = i8 % 128;
                    if (i8 % 2 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            });
            return;
        }
        LocalQueryLoginType localQueryLoginType4 = this.queryLoginType;
        Intrinsics.checkNotNull(localQueryLoginType4);
        localQueryLoginType4.getLoginType();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void toNext(android.os.Bundle r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterOtpVerifyActivity.equals
            int r1 = r1 + 125
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterOtpVerifyActivity.getShareableDataState = r2
            int r1 = r1 % r0
            java.lang.String r1 = "forward"
            java.lang.String r1 = r7.getString(r1)
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L1c
            goto L44
        L1c:
            int r2 = com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterOtpVerifyActivity.equals
            int r2 = r2 + 75
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterOtpVerifyActivity.getShareableDataState = r3
            int r2 = r2 % r0
            r3 = 0
            java.lang.String r4 = "/mainModule/new/main"
            if (r2 != 0) goto L36
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r2 = 1
            r5 = 5
            boolean r2 = kotlin.text.StringsKt.endsWith$default(r1, r4, r2, r5, r3)
            if (r2 == 0) goto L44
            goto L40
        L36:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r2 = 0
            boolean r2 = kotlin.text.StringsKt.endsWith$default(r1, r4, r2, r0, r3)
            if (r2 == 0) goto L44
        L40:
            r6.autoLogin(r1)
            goto L91
        L44:
            com.huawei.digitalpayment.consumer.loginModule.register.model.OtpRegisterResp r2 = new com.huawei.digitalpayment.consumer.loginModule.register.model.OtpRegisterResp
            r2.<init>()
            java.lang.String r3 = "kycFields"
            java.lang.String r4 = ""
            java.lang.String r3 = r7.getString(r3, r4)
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L6c
            com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterOtpVerifyActivity$toNext$kycFields$1 r4 = new com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterOtpVerifyActivity$toNext$kycFields$1
            r4.<init>()
            java.lang.reflect.Type r4 = r4.getType()
            java.lang.Object r3 = com.blankj.utilcode.util.GsonUtils.fromJson(r3, r4)
            java.util.List r3 = (java.util.List) r3
            r2.setKycFields(r3)
        L6c:
            java.lang.String r3 = "oneStepRegisterTag"
            boolean r4 = r6.oneStepRegisterTag
            r7.putBoolean(r3, r4)
            java.lang.String r3 = "asyncRegisterTag"
            boolean r4 = r6.asyncRegisterTag
            r7.putBoolean(r3, r4)
            java.lang.String r3 = "RegisterKycInfo"
            java.io.Serializable r2 = (java.io.Serializable) r2
            r7.putSerializable(r3, r2)
            java.lang.String r2 = r6.TERMS_CONDITIONS
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r1)
            if (r2 == 0) goto L8b
            java.lang.String r1 = "/loginModule/termsAndConditions"
        L8b:
            r2 = r6
            android.app.Activity r2 = (android.app.Activity) r2
            com.huawei.arouter.RouteUtils.routeWithExecute(r2, r1, r7)
        L91:
            int r7 = com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterOtpVerifyActivity.equals
            int r7 = r7 + 39
            int r1 = r7 % 128
            com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterOtpVerifyActivity.getShareableDataState = r1
            int r7 = r7 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterOtpVerifyActivity.toNext(android.os.Bundle):void");
    }

    private final void autoLogin(final String forward) {
        int i = 2 % 2;
        ((ILoginModuleService) RouteUtils.getService(ILoginModuleService.class)).autoLogin(new ApiCallback<BaseResp>() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 47;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(baseResp);
                int i5 = ShareDataUIState + 57;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onSuccess2(BaseResp value) {
                int i2 = 2 % 2;
                int i3 = component2 + 109;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                RouteUtils.routeWithExecute(forward);
                int i5 = ShareDataUIState + 93;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component2 + 65;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                CommonToast.showText(e.getMessage());
                int i5 = component2 + 63;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i2 = getShareableDataState + 29;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = getShareableDataState + 121;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = getShareableDataState + 119;
            equals = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(20) - 82, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952785_res_0x7f130491).substring(2, 3).length() + 45), new char[]{20, '0', '\n', '\f', '*', 19, CharUtils.CR, 2, '\t', '\"', '\"', 2, 1, 3, 14, 21, 28, 19, '\b', 28, '\n', 5, 7, 25, 7, '\n'}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952718_res_0x7f13044e).substring(6, 7).length() + 17, new char[]{23553, 29899, 54484, 725, 57086, 16103, 11458, 25890, 39007, 7202, 65185, 41864, 62036, 26463, 23827, 61285, 56077, 59987}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i6 = equals + 109;
            getShareableDataState = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - TextUtils.getOffsetBefore("", 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 41, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 56 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) KeyEvent.getDeadChar(0, 0), -699576857, false, "component2", new Class[]{Context.class});
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
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131955137_res_0x7f130dc1).substring(0, 3).codePointAt(0) - 11, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952717_res_0x7f13044d).substring(6, 7).length() + 45), new char[]{20, '0', '\n', '\f', '*', 19, CharUtils.CR, 2, '\t', '\"', '\"', 2, 1, 3, 14, 21, 28, 19, '\b', 28, '\n', 5, 7, 25, 7, '\n'}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            h((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 18, new char[]{23553, 29899, 54484, 725, 57086, 16103, 11458, 25890, 39007, 7202, 65185, 41864, 62036, 26463, 23827, 61285, 56077, 59987}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i2 = getShareableDataState + 29;
            equals = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 / 5;
            }
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 42, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(((byte) KeyEvent.getModifierMetaStateMask()) + 6563, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 56, (char) ExpandableListView.getPackedPositionType(0L), -960739708, false, "component3", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                int i4 = getShareableDataState + 1;
                equals = i4 % 128;
                int i5 = i4 % 2;
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
    /* JADX WARN: Removed duplicated region for block: B:165:0x0a98 A[Catch: all -> 0x03fe, TryCatch #45 {all -> 0x03fe, blocks: (B:389:0x173a, B:391:0x1740, B:392:0x176d, B:506:0x1cb0, B:508:0x1cb6, B:509:0x1ce0, B:699:0x2b7f, B:701:0x2b85, B:702:0x2bab, B:733:0x300a, B:735:0x3010, B:736:0x303c, B:777:0x33cc, B:779:0x33d2, B:780:0x33fa, B:757:0x31f5, B:759:0x3218, B:760:0x326d, B:800:0x34d1, B:802:0x34d7, B:803:0x3508, B:805:0x3542, B:806:0x358d, B:558:0x2389, B:560:0x239e, B:561:0x23cf, B:818:0x3660, B:820:0x3666, B:821:0x3692, B:823:0x36cc, B:824:0x3719, B:527:0x1f14, B:529:0x1f29, B:530:0x1f59, B:532:0x1f8d, B:533:0x2002, B:264:0x104e, B:266:0x1054, B:267:0x107e, B:163:0x0a92, B:165:0x0a98, B:166:0x0ac6, B:70:0x05b9, B:72:0x05bf, B:73:0x05e5, B:19:0x01a5, B:21:0x01ab, B:22:0x01d2, B:24:0x036c, B:26:0x039e, B:27:0x03f8, B:33:0x040c, B:35:0x0410, B:56:0x04fd, B:58:0x0503, B:59:0x0504, B:61:0x0506, B:63:0x050d, B:64:0x050e, B:39:0x041c, B:49:0x0471, B:51:0x047e, B:52:0x04f1, B:45:0x0427, B:47:0x043c, B:48:0x046b, B:170:0x0b4d, B:172:0x0b53, B:173:0x0b99, B:179:0x0bb5, B:181:0x0bbb, B:182:0x0bfd, B:183:0x0c06, B:184:0x0c07, B:186:0x0c10, B:187:0x0c57, B:211:0x0e88, B:212:0x0e8c, B:216:0x0e9e, B:222:0x0ecd, B:225:0x0eda, B:227:0x0edd, B:239:0x0fc2, B:241:0x0fc8, B:242:0x0fc9, B:244:0x0fcb, B:246:0x0fd2, B:247:0x0fd3, B:219:0x0eb6, B:188:0x0c62, B:200:0x0d6d, B:202:0x0d73, B:203:0x0db6, B:205:0x0de0, B:207:0x0e25, B:209:0x0e3c, B:210:0x0e80, B:249:0x0fd5, B:251:0x0fdc, B:252:0x0fdd, B:254:0x0fdf, B:256:0x0fe6, B:257:0x0fe7, B:235:0x0f46, B:230:0x0f0a, B:232:0x0f10, B:233:0x0f3e, B:195:0x0cd3, B:197:0x0cef, B:198:0x0d61, B:190:0x0c82, B:192:0x0c97, B:193:0x0ccc), top: B:921:0x01a5, inners: #0, #35 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0b53 A[Catch: all -> 0x0fe8, TryCatch #35 {all -> 0x0fe8, blocks: (B:170:0x0b4d, B:172:0x0b53, B:173:0x0b99, B:179:0x0bb5, B:181:0x0bbb, B:182:0x0bfd, B:183:0x0c06, B:184:0x0c07, B:186:0x0c10, B:187:0x0c57, B:211:0x0e88, B:212:0x0e8c, B:216:0x0e9e, B:222:0x0ecd, B:225:0x0eda, B:227:0x0edd, B:239:0x0fc2, B:241:0x0fc8, B:242:0x0fc9, B:244:0x0fcb, B:246:0x0fd2, B:247:0x0fd3, B:219:0x0eb6, B:188:0x0c62, B:200:0x0d6d, B:202:0x0d73, B:203:0x0db6, B:205:0x0de0, B:207:0x0e25, B:209:0x0e3c, B:210:0x0e80, B:249:0x0fd5, B:251:0x0fdc, B:252:0x0fdd, B:254:0x0fdf, B:256:0x0fe6, B:257:0x0fe7, B:235:0x0f46, B:230:0x0f0a, B:232:0x0f10, B:233:0x0f3e, B:195:0x0cd3, B:197:0x0cef, B:198:0x0d61, B:190:0x0c82, B:192:0x0c97, B:193:0x0ccc), top: B:903:0x0b4d, outer: #45, inners: #15, #22, #26, #31 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0ba6  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0c62 A[Catch: all -> 0x0fe8, TRY_LEAVE, TryCatch #35 {all -> 0x0fe8, blocks: (B:170:0x0b4d, B:172:0x0b53, B:173:0x0b99, B:179:0x0bb5, B:181:0x0bbb, B:182:0x0bfd, B:183:0x0c06, B:184:0x0c07, B:186:0x0c10, B:187:0x0c57, B:211:0x0e88, B:212:0x0e8c, B:216:0x0e9e, B:222:0x0ecd, B:225:0x0eda, B:227:0x0edd, B:239:0x0fc2, B:241:0x0fc8, B:242:0x0fc9, B:244:0x0fcb, B:246:0x0fd2, B:247:0x0fd3, B:219:0x0eb6, B:188:0x0c62, B:200:0x0d6d, B:202:0x0d73, B:203:0x0db6, B:205:0x0de0, B:207:0x0e25, B:209:0x0e3c, B:210:0x0e80, B:249:0x0fd5, B:251:0x0fdc, B:252:0x0fdd, B:254:0x0fdf, B:256:0x0fe6, B:257:0x0fe7, B:235:0x0f46, B:230:0x0f0a, B:232:0x0f10, B:233:0x0f3e, B:195:0x0cd3, B:197:0x0cef, B:198:0x0d61, B:190:0x0c82, B:192:0x0c97, B:193:0x0ccc), top: B:903:0x0b4d, outer: #45, inners: #15, #22, #26, #31 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0e92  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0ed9  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0f10 A[Catch: all -> 0x0fca, TryCatch #22 {all -> 0x0fca, blocks: (B:230:0x0f0a, B:232:0x0f10, B:233:0x0f3e), top: B:878:0x0f0a, outer: #35 }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x1108  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x1153 A[Catch: all -> 0x16af, PHI: r1
  0x1153: PHI (r1v477 java.lang.Object) = (r1v476 java.lang.Object), (r1v512 java.lang.Object) binds: [B:272:0x1106, B:274:0x110a] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #7 {all -> 0x16af, blocks: (B:271:0x1102, B:278:0x1153, B:280:0x117a), top: B:850:0x1102 }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x117a A[Catch: all -> 0x16af, TRY_LEAVE, TryCatch #7 {all -> 0x16af, blocks: (B:271:0x1102, B:278:0x1153, B:280:0x117a), top: B:850:0x1102 }] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x11be  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x11d4 A[Catch: all -> 0x16ad, TryCatch #5 {all -> 0x16ad, blocks: (B:282:0x11a7, B:284:0x11c0, B:286:0x11d4, B:288:0x11dd, B:289:0x1224, B:357:0x167f, B:359:0x1685, B:360:0x1686, B:362:0x1688, B:364:0x168f, B:365:0x1690, B:295:0x1241, B:297:0x1245, B:306:0x1260, B:317:0x1432, B:319:0x1438, B:320:0x1480, B:370:0x169a, B:372:0x16a1, B:373:0x16a2, B:375:0x16a4, B:377:0x16ab, B:378:0x16ac, B:301:0x1251, B:302:0x1256, B:303:0x125c, B:307:0x133a, B:309:0x134e, B:310:0x1384, B:353:0x15fd, B:348:0x15c5, B:350:0x15cb, B:351:0x15f5, B:312:0x138b, B:314:0x13af, B:315:0x1426), top: B:847:0x11a7, inners: #1, #44, #50, #59 }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x1231  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x1566 A[Catch: all -> 0x1695, TryCatch #56 {all -> 0x1695, blocks: (B:332:0x155c, B:333:0x1560, B:335:0x1566, B:338:0x1581, B:322:0x148f, B:328:0x14f5, B:331:0x1554), top: B:942:0x148f }] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x1740 A[Catch: all -> 0x03fe, TryCatch #45 {all -> 0x03fe, blocks: (B:389:0x173a, B:391:0x1740, B:392:0x176d, B:506:0x1cb0, B:508:0x1cb6, B:509:0x1ce0, B:699:0x2b7f, B:701:0x2b85, B:702:0x2bab, B:733:0x300a, B:735:0x3010, B:736:0x303c, B:777:0x33cc, B:779:0x33d2, B:780:0x33fa, B:757:0x31f5, B:759:0x3218, B:760:0x326d, B:800:0x34d1, B:802:0x34d7, B:803:0x3508, B:805:0x3542, B:806:0x358d, B:558:0x2389, B:560:0x239e, B:561:0x23cf, B:818:0x3660, B:820:0x3666, B:821:0x3692, B:823:0x36cc, B:824:0x3719, B:527:0x1f14, B:529:0x1f29, B:530:0x1f59, B:532:0x1f8d, B:533:0x2002, B:264:0x104e, B:266:0x1054, B:267:0x107e, B:163:0x0a92, B:165:0x0a98, B:166:0x0ac6, B:70:0x05b9, B:72:0x05bf, B:73:0x05e5, B:19:0x01a5, B:21:0x01ab, B:22:0x01d2, B:24:0x036c, B:26:0x039e, B:27:0x03f8, B:33:0x040c, B:35:0x0410, B:56:0x04fd, B:58:0x0503, B:59:0x0504, B:61:0x0506, B:63:0x050d, B:64:0x050e, B:39:0x041c, B:49:0x0471, B:51:0x047e, B:52:0x04f1, B:45:0x0427, B:47:0x043c, B:48:0x046b, B:170:0x0b4d, B:172:0x0b53, B:173:0x0b99, B:179:0x0bb5, B:181:0x0bbb, B:182:0x0bfd, B:183:0x0c06, B:184:0x0c07, B:186:0x0c10, B:187:0x0c57, B:211:0x0e88, B:212:0x0e8c, B:216:0x0e9e, B:222:0x0ecd, B:225:0x0eda, B:227:0x0edd, B:239:0x0fc2, B:241:0x0fc8, B:242:0x0fc9, B:244:0x0fcb, B:246:0x0fd2, B:247:0x0fd3, B:219:0x0eb6, B:188:0x0c62, B:200:0x0d6d, B:202:0x0d73, B:203:0x0db6, B:205:0x0de0, B:207:0x0e25, B:209:0x0e3c, B:210:0x0e80, B:249:0x0fd5, B:251:0x0fdc, B:252:0x0fdd, B:254:0x0fdf, B:256:0x0fe6, B:257:0x0fe7, B:235:0x0f46, B:230:0x0f0a, B:232:0x0f10, B:233:0x0f3e, B:195:0x0cd3, B:197:0x0cef, B:198:0x0d61, B:190:0x0c82, B:192:0x0c97, B:193:0x0ccc), top: B:921:0x01a5, inners: #0, #35 }] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x1844 A[Catch: all -> 0x1c46, PHI: r1
  0x1844: PHI (r1v401 java.lang.Object) = (r1v395 java.lang.Object), (r1v400 java.lang.Object) binds: [B:397:0x17f9, B:398:0x17fb] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #17 {all -> 0x1c46, blocks: (B:396:0x17f5, B:402:0x1844, B:411:0x18ad, B:429:0x19b4, B:433:0x19ff), top: B:868:0x17f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:405:0x1851  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x18ad A[Catch: all -> 0x1c46, TRY_ENTER, TRY_LEAVE, TryCatch #17 {all -> 0x1c46, blocks: (B:396:0x17f5, B:402:0x1844, B:411:0x18ad, B:429:0x19b4, B:433:0x19ff), top: B:868:0x17f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:450:0x1ae9 A[Catch: all -> 0x1c29, TryCatch #4 {all -> 0x1c29, blocks: (B:447:0x1adf, B:448:0x1ae3, B:450:0x1ae9, B:453:0x1b05, B:435:0x1a0e, B:441:0x1a73, B:445:0x1acd), top: B:845:0x1a0e }] */
    /* JADX WARN: Removed duplicated region for block: B:508:0x1cb6 A[Catch: all -> 0x03fe, TryCatch #45 {all -> 0x03fe, blocks: (B:389:0x173a, B:391:0x1740, B:392:0x176d, B:506:0x1cb0, B:508:0x1cb6, B:509:0x1ce0, B:699:0x2b7f, B:701:0x2b85, B:702:0x2bab, B:733:0x300a, B:735:0x3010, B:736:0x303c, B:777:0x33cc, B:779:0x33d2, B:780:0x33fa, B:757:0x31f5, B:759:0x3218, B:760:0x326d, B:800:0x34d1, B:802:0x34d7, B:803:0x3508, B:805:0x3542, B:806:0x358d, B:558:0x2389, B:560:0x239e, B:561:0x23cf, B:818:0x3660, B:820:0x3666, B:821:0x3692, B:823:0x36cc, B:824:0x3719, B:527:0x1f14, B:529:0x1f29, B:530:0x1f59, B:532:0x1f8d, B:533:0x2002, B:264:0x104e, B:266:0x1054, B:267:0x107e, B:163:0x0a92, B:165:0x0a98, B:166:0x0ac6, B:70:0x05b9, B:72:0x05bf, B:73:0x05e5, B:19:0x01a5, B:21:0x01ab, B:22:0x01d2, B:24:0x036c, B:26:0x039e, B:27:0x03f8, B:33:0x040c, B:35:0x0410, B:56:0x04fd, B:58:0x0503, B:59:0x0504, B:61:0x0506, B:63:0x050d, B:64:0x050e, B:39:0x041c, B:49:0x0471, B:51:0x047e, B:52:0x04f1, B:45:0x0427, B:47:0x043c, B:48:0x046b, B:170:0x0b4d, B:172:0x0b53, B:173:0x0b99, B:179:0x0bb5, B:181:0x0bbb, B:182:0x0bfd, B:183:0x0c06, B:184:0x0c07, B:186:0x0c10, B:187:0x0c57, B:211:0x0e88, B:212:0x0e8c, B:216:0x0e9e, B:222:0x0ecd, B:225:0x0eda, B:227:0x0edd, B:239:0x0fc2, B:241:0x0fc8, B:242:0x0fc9, B:244:0x0fcb, B:246:0x0fd2, B:247:0x0fd3, B:219:0x0eb6, B:188:0x0c62, B:200:0x0d6d, B:202:0x0d73, B:203:0x0db6, B:205:0x0de0, B:207:0x0e25, B:209:0x0e3c, B:210:0x0e80, B:249:0x0fd5, B:251:0x0fdc, B:252:0x0fdd, B:254:0x0fdf, B:256:0x0fe6, B:257:0x0fe7, B:235:0x0f46, B:230:0x0f0a, B:232:0x0f10, B:233:0x0f3e, B:195:0x0cd3, B:197:0x0cef, B:198:0x0d61, B:190:0x0c82, B:192:0x0c97, B:193:0x0ccc), top: B:921:0x01a5, inners: #0, #35 }] */
    /* JADX WARN: Removed duplicated region for block: B:514:0x1d67  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x1dd8  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x1e1d  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x1e32  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x1ef6  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x213e  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x2b85 A[Catch: all -> 0x03fe, TryCatch #45 {all -> 0x03fe, blocks: (B:389:0x173a, B:391:0x1740, B:392:0x176d, B:506:0x1cb0, B:508:0x1cb6, B:509:0x1ce0, B:699:0x2b7f, B:701:0x2b85, B:702:0x2bab, B:733:0x300a, B:735:0x3010, B:736:0x303c, B:777:0x33cc, B:779:0x33d2, B:780:0x33fa, B:757:0x31f5, B:759:0x3218, B:760:0x326d, B:800:0x34d1, B:802:0x34d7, B:803:0x3508, B:805:0x3542, B:806:0x358d, B:558:0x2389, B:560:0x239e, B:561:0x23cf, B:818:0x3660, B:820:0x3666, B:821:0x3692, B:823:0x36cc, B:824:0x3719, B:527:0x1f14, B:529:0x1f29, B:530:0x1f59, B:532:0x1f8d, B:533:0x2002, B:264:0x104e, B:266:0x1054, B:267:0x107e, B:163:0x0a92, B:165:0x0a98, B:166:0x0ac6, B:70:0x05b9, B:72:0x05bf, B:73:0x05e5, B:19:0x01a5, B:21:0x01ab, B:22:0x01d2, B:24:0x036c, B:26:0x039e, B:27:0x03f8, B:33:0x040c, B:35:0x0410, B:56:0x04fd, B:58:0x0503, B:59:0x0504, B:61:0x0506, B:63:0x050d, B:64:0x050e, B:39:0x041c, B:49:0x0471, B:51:0x047e, B:52:0x04f1, B:45:0x0427, B:47:0x043c, B:48:0x046b, B:170:0x0b4d, B:172:0x0b53, B:173:0x0b99, B:179:0x0bb5, B:181:0x0bbb, B:182:0x0bfd, B:183:0x0c06, B:184:0x0c07, B:186:0x0c10, B:187:0x0c57, B:211:0x0e88, B:212:0x0e8c, B:216:0x0e9e, B:222:0x0ecd, B:225:0x0eda, B:227:0x0edd, B:239:0x0fc2, B:241:0x0fc8, B:242:0x0fc9, B:244:0x0fcb, B:246:0x0fd2, B:247:0x0fd3, B:219:0x0eb6, B:188:0x0c62, B:200:0x0d6d, B:202:0x0d73, B:203:0x0db6, B:205:0x0de0, B:207:0x0e25, B:209:0x0e3c, B:210:0x0e80, B:249:0x0fd5, B:251:0x0fdc, B:252:0x0fdd, B:254:0x0fdf, B:256:0x0fe6, B:257:0x0fe7, B:235:0x0f46, B:230:0x0f0a, B:232:0x0f10, B:233:0x0f3e, B:195:0x0cd3, B:197:0x0cef, B:198:0x0d61, B:190:0x0c82, B:192:0x0c97, B:193:0x0ccc), top: B:921:0x01a5, inners: #0, #35 }] */
    /* JADX WARN: Removed duplicated region for block: B:707:0x2c3b  */
    /* JADX WARN: Removed duplicated region for block: B:710:0x2c89  */
    /* JADX WARN: Removed duplicated region for block: B:715:0x2cdd  */
    /* JADX WARN: Removed duplicated region for block: B:732:0x2fe9  */
    /* JADX WARN: Removed duplicated region for block: B:741:0x30cc  */
    /* JADX WARN: Removed duplicated region for block: B:744:0x311f  */
    /* JADX WARN: Removed duplicated region for block: B:756:0x31d7  */
    /* JADX WARN: Removed duplicated region for block: B:776:0x33ae  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:811:0x3629  */
    /* JADX WARN: Removed duplicated region for block: B:862:0x17fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:978:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v187, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v198 */
    /* JADX WARN: Type inference failed for: r10v199 */
    /* JADX WARN: Type inference failed for: r10v200 */
    /* JADX WARN: Type inference failed for: r10v201 */
    /* JADX WARN: Type inference failed for: r10v204 */
    /* JADX WARN: Type inference failed for: r10v205 */
    /* JADX WARN: Type inference failed for: r10v264 */
    /* JADX WARN: Type inference failed for: r10v265 */
    /* JADX WARN: Type inference failed for: r11v106 */
    /* JADX WARN: Type inference failed for: r11v107 */
    /* JADX WARN: Type inference failed for: r11v108 */
    /* JADX WARN: Type inference failed for: r11v109 */
    /* JADX WARN: Type inference failed for: r11v150 */
    /* JADX WARN: Type inference failed for: r11v151 */
    /* JADX WARN: Type inference failed for: r11v152 */
    /* JADX WARN: Type inference failed for: r11v153 */
    /* JADX WARN: Type inference failed for: r11v154 */
    /* JADX WARN: Type inference failed for: r11v76 */
    /* JADX WARN: Type inference failed for: r11v77 */
    /* JADX WARN: Type inference failed for: r11v78 */
    /* JADX WARN: Type inference failed for: r11v90 */
    /* JADX WARN: Type inference failed for: r11v91 */
    /* JADX WARN: Type inference failed for: r11v92 */
    /* JADX WARN: Type inference failed for: r11v93 */
    /* JADX WARN: Type inference failed for: r13v168 */
    /* JADX WARN: Type inference failed for: r13v169, types: [long] */
    /* JADX WARN: Type inference failed for: r13v170 */
    /* JADX WARN: Type inference failed for: r13v171 */
    /* JADX WARN: Type inference failed for: r13v180 */
    /* JADX WARN: Type inference failed for: r13v183 */
    /* JADX WARN: Type inference failed for: r13v184 */
    /* JADX WARN: Type inference failed for: r13v195 */
    /* JADX WARN: Type inference failed for: r13v196 */
    /* JADX WARN: Type inference failed for: r13v197 */
    /* JADX WARN: Type inference failed for: r13v198 */
    /* JADX WARN: Type inference failed for: r13v199 */
    /* JADX WARN: Type inference failed for: r13v200 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v104 */
    /* JADX WARN: Type inference failed for: r14v105 */
    /* JADX WARN: Type inference failed for: r14v106 */
    /* JADX WARN: Type inference failed for: r14v107 */
    /* JADX WARN: Type inference failed for: r14v108, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r14v109 */
    /* JADX WARN: Type inference failed for: r14v111, types: [byte] */
    /* JADX WARN: Type inference failed for: r14v112 */
    /* JADX WARN: Type inference failed for: r14v113 */
    /* JADX WARN: Type inference failed for: r14v114 */
    /* JADX WARN: Type inference failed for: r14v115 */
    /* JADX WARN: Type inference failed for: r14v116 */
    /* JADX WARN: Type inference failed for: r14v125 */
    /* JADX WARN: Type inference failed for: r14v126 */
    /* JADX WARN: Type inference failed for: r14v127 */
    /* JADX WARN: Type inference failed for: r14v135, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r14v137 */
    /* JADX WARN: Type inference failed for: r14v139 */
    /* JADX WARN: Type inference failed for: r14v144 */
    /* JADX WARN: Type inference failed for: r14v148 */
    /* JADX WARN: Type inference failed for: r14v156 */
    /* JADX WARN: Type inference failed for: r14v170 */
    /* JADX WARN: Type inference failed for: r14v171 */
    /* JADX WARN: Type inference failed for: r14v172 */
    /* JADX WARN: Type inference failed for: r14v173 */
    /* JADX WARN: Type inference failed for: r14v174 */
    /* JADX WARN: Type inference failed for: r14v175 */
    /* JADX WARN: Type inference failed for: r14v176 */
    /* JADX WARN: Type inference failed for: r14v177 */
    /* JADX WARN: Type inference failed for: r14v178 */
    /* JADX WARN: Type inference failed for: r14v179 */
    /* JADX WARN: Type inference failed for: r14v180 */
    /* JADX WARN: Type inference failed for: r14v181 */
    /* JADX WARN: Type inference failed for: r14v182 */
    /* JADX WARN: Type inference failed for: r14v183 */
    /* JADX WARN: Type inference failed for: r14v184 */
    /* JADX WARN: Type inference failed for: r14v185 */
    /* JADX WARN: Type inference failed for: r14v186 */
    /* JADX WARN: Type inference failed for: r14v187 */
    /* JADX WARN: Type inference failed for: r14v188 */
    /* JADX WARN: Type inference failed for: r14v189 */
    /* JADX WARN: Type inference failed for: r14v190 */
    /* JADX WARN: Type inference failed for: r14v191 */
    /* JADX WARN: Type inference failed for: r14v192 */
    /* JADX WARN: Type inference failed for: r14v193 */
    /* JADX WARN: Type inference failed for: r14v194 */
    /* JADX WARN: Type inference failed for: r14v195 */
    /* JADX WARN: Type inference failed for: r14v196 */
    /* JADX WARN: Type inference failed for: r14v197 */
    /* JADX WARN: Type inference failed for: r14v198 */
    /* JADX WARN: Type inference failed for: r14v199 */
    /* JADX WARN: Type inference failed for: r14v200 */
    /* JADX WARN: Type inference failed for: r14v201 */
    /* JADX WARN: Type inference failed for: r14v202 */
    /* JADX WARN: Type inference failed for: r14v203 */
    /* JADX WARN: Type inference failed for: r14v204 */
    /* JADX WARN: Type inference failed for: r14v205 */
    /* JADX WARN: Type inference failed for: r14v206 */
    /* JADX WARN: Type inference failed for: r14v207 */
    /* JADX WARN: Type inference failed for: r14v208 */
    /* JADX WARN: Type inference failed for: r14v209 */
    /* JADX WARN: Type inference failed for: r14v210 */
    /* JADX WARN: Type inference failed for: r14v211 */
    /* JADX WARN: Type inference failed for: r14v212 */
    /* JADX WARN: Type inference failed for: r14v213 */
    /* JADX WARN: Type inference failed for: r14v214 */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r14v54, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r14v55 */
    /* JADX WARN: Type inference failed for: r14v56 */
    /* JADX WARN: Type inference failed for: r14v57 */
    /* JADX WARN: Type inference failed for: r14v58 */
    /* JADX WARN: Type inference failed for: r14v59 */
    /* JADX WARN: Type inference failed for: r14v60 */
    /* JADX WARN: Type inference failed for: r14v61, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v66 */
    /* JADX WARN: Type inference failed for: r14v67 */
    /* JADX WARN: Type inference failed for: r14v68 */
    /* JADX WARN: Type inference failed for: r14v69 */
    /* JADX WARN: Type inference failed for: r14v70 */
    /* JADX WARN: Type inference failed for: r14v71 */
    /* JADX WARN: Type inference failed for: r14v72 */
    /* JADX WARN: Type inference failed for: r14v77 */
    /* JADX WARN: Type inference failed for: r14v78 */
    /* JADX WARN: Type inference failed for: r14v79 */
    /* JADX WARN: Type inference failed for: r14v80 */
    /* JADX WARN: Type inference failed for: r14v82 */
    /* JADX WARN: Type inference failed for: r14v83 */
    /* JADX WARN: Type inference failed for: r14v84 */
    /* JADX WARN: Type inference failed for: r14v85 */
    /* JADX WARN: Type inference failed for: r14v86 */
    /* JADX WARN: Type inference failed for: r14v88, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r14v89 */
    /* JADX WARN: Type inference failed for: r14v90 */
    /* JADX WARN: Type inference failed for: r14v91 */
    /* JADX WARN: Type inference failed for: r14v92 */
    /* JADX WARN: Type inference failed for: r14v93 */
    /* JADX WARN: Type inference failed for: r2v760, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r34v1 */
    /* JADX WARN: Type inference failed for: r34v14 */
    /* JADX WARN: Type inference failed for: r34v16 */
    /* JADX WARN: Type inference failed for: r34v2 */
    /* JADX WARN: Type inference failed for: r34v21 */
    /* JADX WARN: Type inference failed for: r34v25 */
    /* JADX WARN: Type inference failed for: r34v26 */
    /* JADX WARN: Type inference failed for: r34v3 */
    /* JADX WARN: Type inference failed for: r34v30 */
    /* JADX WARN: Type inference failed for: r34v31 */
    /* JADX WARN: Type inference failed for: r34v32 */
    /* JADX WARN: Type inference failed for: r34v33 */
    /* JADX WARN: Type inference failed for: r34v34 */
    /* JADX WARN: Type inference failed for: r34v35 */
    /* JADX WARN: Type inference failed for: r34v36 */
    /* JADX WARN: Type inference failed for: r34v37 */
    /* JADX WARN: Type inference failed for: r34v38 */
    /* JADX WARN: Type inference failed for: r34v39 */
    /* JADX WARN: Type inference failed for: r34v4 */
    /* JADX WARN: Type inference failed for: r34v43 */
    /* JADX WARN: Type inference failed for: r34v44 */
    /* JADX WARN: Type inference failed for: r34v45 */
    /* JADX WARN: Type inference failed for: r34v46 */
    /* JADX WARN: Type inference failed for: r34v47 */
    /* JADX WARN: Type inference failed for: r34v48 */
    /* JADX WARN: Type inference failed for: r34v49 */
    /* JADX WARN: Type inference failed for: r34v50 */
    /* JADX WARN: Type inference failed for: r34v54 */
    /* JADX WARN: Type inference failed for: r34v55 */
    /* JADX WARN: Type inference failed for: r34v56 */
    /* JADX WARN: Type inference failed for: r34v57 */
    /* JADX WARN: Type inference failed for: r34v58 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v521 */
    /* JADX WARN: Type inference failed for: r7v212, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v216, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v241 */
    /* JADX WARN: Type inference failed for: r7v343 */
    /* JADX WARN: Type inference failed for: r7v344 */
    /* JADX WARN: Type inference failed for: r7v345 */
    /* JADX WARN: Type inference failed for: r7v365 */
    /* JADX WARN: Type inference failed for: r7v380 */
    /* JADX WARN: Type inference failed for: r7v388 */
    /* JADX WARN: Type inference failed for: r7v389 */
    /* JADX WARN: Type inference failed for: r7v69 */
    /* JADX WARN: Type inference failed for: r7v70, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v109 */
    /* JADX WARN: Type inference failed for: r8v160 */
    /* JADX WARN: Type inference failed for: r8v161 */
    /* JADX WARN: Type inference failed for: r8v162 */
    /* JADX WARN: Type inference failed for: r8v163 */
    /* JADX WARN: Type inference failed for: r8v164 */
    /* JADX WARN: Type inference failed for: r8v169 */
    /* JADX WARN: Type inference failed for: r8v181, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v184 */
    /* JADX WARN: Type inference failed for: r8v185 */
    /* JADX WARN: Type inference failed for: r8v186 */
    /* JADX WARN: Type inference failed for: r8v187 */
    /* JADX WARN: Type inference failed for: r8v190 */
    /* JADX WARN: Type inference failed for: r8v191 */
    /* JADX WARN: Type inference failed for: r8v237 */
    /* JADX WARN: Type inference failed for: r8v369 */
    /* JADX WARN: Type inference failed for: r8v370 */
    /* JADX WARN: Type inference failed for: r8v371 */
    /* JADX WARN: Type inference failed for: r8v372 */
    /* JADX WARN: Type inference failed for: r8v373 */
    /* JADX WARN: Type inference failed for: r8v77, types: [java.lang.String] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 15100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SfcRegisterOtpVerifyActivity.attachBaseContext(android.content.Context):void");
    }

    public static void m10936$r8$lambda$8yr4lb7rlPrhUm21nwDXxxau4(SfcRegisterOtpVerifyActivity sfcRegisterOtpVerifyActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = equals + 5;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        addObserver$lambda$4$lambda$3(sfcRegisterOtpVerifyActivity, dialogInterface);
        if (i3 == 0) {
            int i4 = 93 / 0;
        }
    }

    public static void $r8$lambda$L0y6Y2If_Ea8VTr26GBVdf9toRA(SfcRegisterOtpVerifyActivity sfcRegisterOtpVerifyActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 63;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        m10937instrumented$0$initListener$V(sfcRegisterOtpVerifyActivity, view);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = getShareableDataState + 25;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$SrZ748iwBWmFCsUP_yXnaSmusgo(SfcRegisterOtpVerifyActivity sfcRegisterOtpVerifyActivity, View view) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 69;
        equals = i2 % 128;
        int i3 = i2 % 2;
        m10939instrumented$2$initListener$V(sfcRegisterOtpVerifyActivity, view);
        int i4 = getShareableDataState + 117;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$ZEfhsTiLK47Fj7WcwaGh2VTyh2Q(SfcRegisterOtpVerifyActivity sfcRegisterOtpVerifyActivity, View view) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 47;
        equals = i2 % 128;
        int i3 = i2 % 2;
        m10938instrumented$1$initListener$V(sfcRegisterOtpVerifyActivity, view);
        int i4 = getShareableDataState + 101;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$qTGesGQmoClA2ez0gmbG0tU3tpc(CommonDialog commonDialog) {
        int i = 2 % 2;
        int i2 = equals + 43;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        onVerifyError$lambda$6(commonDialog);
        int i4 = equals + 63;
        getShareableDataState = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Unit $r8$lambda$uEmPZrgidL59CMQ8R2EdQtjk0MY(SfcRegisterOtpVerifyActivity sfcRegisterOtpVerifyActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = equals + 29;
        getShareableDataState = i2 % 128;
        if (i2 % 2 == 0) {
            addObserver$lambda$5(sfcRegisterOtpVerifyActivity, resource);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitAddObserver$lambda$5 = addObserver$lambda$5(sfcRegisterOtpVerifyActivity, resource);
        int i3 = getShareableDataState + 39;
        equals = i3 % 128;
        int i4 = i3 % 2;
        return unitAddObserver$lambda$5;
    }

    public static Unit $r8$lambda$uvSyNPP0www5geMY87K6slu1v2s(SfcRegisterOtpVerifyActivity sfcRegisterOtpVerifyActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = equals + 109;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAddObserver$lambda$4 = addObserver$lambda$4(sfcRegisterOtpVerifyActivity, resource);
        int i4 = getShareableDataState + 35;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAddObserver$lambda$4;
        }
        throw null;
    }

    static {
        ArtificialStackFrames = 0;
        component2();
        copydefault();
        int i = getSponsorBeneficiariesState + 51;
        ArtificialStackFrames = i % 128;
        int i2 = i % 2;
    }

    private static void m10937instrumented$0$initListener$V(SfcRegisterOtpVerifyActivity sfcRegisterOtpVerifyActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 105;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                initListener$lambda$0(sfcRegisterOtpVerifyActivity, view);
                Callback.onClick_exit();
                int i4 = 10 / 0;
            } else {
                initListener$lambda$0(sfcRegisterOtpVerifyActivity, view);
                Callback.onClick_exit();
            }
            int i5 = equals + 23;
            getShareableDataState = i5 % 128;
            int i6 = i5 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m10938instrumented$1$initListener$V(SfcRegisterOtpVerifyActivity sfcRegisterOtpVerifyActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 13;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            initListener$lambda$1(sfcRegisterOtpVerifyActivity, view);
            Callback.onClick_exit();
            int i4 = equals + 9;
            getShareableDataState = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m10939instrumented$2$initListener$V(SfcRegisterOtpVerifyActivity sfcRegisterOtpVerifyActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 29;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            initListener$lambda$2(sfcRegisterOtpVerifyActivity, view);
            Callback.onClick_exit();
            int i4 = getShareableDataState + 55;
            equals = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 121;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = equals + 85;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = getShareableDataState + 79;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
    }

    static void copydefault() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 75;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        copydefault = -3780477796495014671L;
        component3 = 1386857713;
        ShareDataUIState = (char) 14696;
        if (i4 != 0) {
            int i5 = 98 / 0;
        }
        int i6 = i3 + 25;
        getShareableDataState = i6 % 128;
        int i7 = i6 % 2;
    }

    static void component2() {
        component2 = new char[]{1985, 2029, 2019, 2024, 2000, 2042, 1966, 2036, 2018, 2020, 2046, 2034, 2004, 2017, 2025, 1989, 1973, 1972, 1975, 1988, 1969, 2021, 2035, 1987, 1970, 1990, 1968, 2003, 2043, 2041, 2032, 1991, 1971, 2038, 2037, 1992, 1974, 2023, 2028, 1977, 2033, 2030, 1978, 2022, 2040, 2027, 1967, 2031, 1976};
        component1 = (char) 12829;
        copy = (char) 38836;
        component4 = (char) 26457;
        getAsAtTimestamp = (char) 1346;
        getRequestBeneficiariesState = (char) 224;
    }
}
