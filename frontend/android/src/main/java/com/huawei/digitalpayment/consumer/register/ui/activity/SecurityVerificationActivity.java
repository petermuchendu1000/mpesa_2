package com.huawei.digitalpayment.consumer.register.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.FastClickUtils;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.TimeUtils;
import com.huawei.common.util.ViewUtils;
import com.huawei.common.widget.MPTextWatcher;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.toast.CommonToast;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.dialog.BaseDatePickerDialog;
import com.huawei.digitalpayment.consumer.baselib.dialog.SingleSelectDialog;
import com.huawei.digitalpayment.consumer.baselib.service.ICommonService;
import com.huawei.digitalpayment.consumer.baselib.util.encrypt.EncryptUtils;
import com.huawei.digitalpayment.consumer.login.R;
import com.huawei.digitalpayment.consumer.login.databinding.ActivitySecurityVerificationBinding;
import com.huawei.digitalpayment.consumer.login.util.LoginUtils;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.register.data.LocalQuestionItem;
import com.huawei.digitalpayment.consumer.loginModule.register.data.QuerySecurityQuestionParams;
import com.huawei.digitalpayment.consumer.loginModule.register.request.ActiveConsumerParams;
import com.huawei.digitalpayment.consumer.loginModule.register.request.QAItem;
import com.huawei.digitalpayment.consumer.loginModule.register.request.RegisterParams;
import com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.SecretVerifyUiState;
import com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.SecurityVerificationViewModel;
import com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.ImtConstants;
import com.huawei.digitalpayment.form.validator.ValidatorManager;
import com.huawei.digitalpayment.form.validator.response.LocalValidatorItem;
import com.huawei.digitalpayment.form.validator.response.ValidatorCheckResult;
import com.huawei.payment.mvvm.Resource;
import com.huawei.payment.mvvm.Utils;
import dagger.hilt.android.AndroidEntryPoint;
import io.ktor.util.date.GMTDateParser;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import kotlin.Function;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.cancelAll;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.notify;
import kotlin.onSubMenuSelected;
import kotlin.text.Regex;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 52\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00015B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\u0012\u0010#\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010%\u001a\u00020 H\u0002J\b\u0010&\u001a\u00020 H\u0002J\b\u0010'\u001a\u00020 H\u0002J\b\u0010(\u001a\u00020 H\u0002J\b\u0010)\u001a\u00020 H\u0002J\b\u0010*\u001a\u00020 H\u0002J\u0016\u0010+\u001a\u00020 2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0010H\u0002J\b\u0010.\u001a\u00020 H\u0002J\u0012\u0010/\u001a\u00020 2\b\u00100\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u00101\u001a\u000202H\u0014J\u0012\u00103\u001a\u00020 2\b\u00104\u001a\u0004\u0018\u00010\u0007H\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\tR\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/huawei/digitalpayment/consumer/register/ui/activity/SecurityVerificationActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcPaymentBaseActivity;", "Lcom/huawei/digitalpayment/consumer/login/databinding/ActivitySecurityVerificationBinding;", "Lcom/huawei/digitalpayment/consumer/loginModule/register/viewmodel/SecurityVerificationViewModel;", "<init>", "()V", "oldPin", "", "getOldPin", "()Ljava/lang/String;", "oldPin$delegate", "Lkotlin/Lazy;", "newPin", "getNewPin", "newPin$delegate", "questionList", "", "Lcom/huawei/digitalpayment/consumer/loginModule/register/data/LocalQuestionItem;", "questionDialog", "Lcom/huawei/digitalpayment/consumer/baselib/dialog/SingleSelectDialog;", "registerParams", "Lcom/huawei/digitalpayment/consumer/loginModule/register/request/RegisterParams;", "datePickerDialog", "Lcom/huawei/digitalpayment/consumer/baselib/dialog/BaseDatePickerDialog;", "selectedCalendar", "Ljava/util/Calendar;", "validatorItem", "Lcom/huawei/digitalpayment/form/validator/response/LocalValidatorItem;", KeysConstants.KEY_ONE_STEP_REGISTER_TAG, "", KeysConstants.KEY_ASYNC_REGISTER_TAG, "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onItemSelected", "item", "showDatePickerDialog", "showQuestionDialog", "observeData", "checkAnswer", "updateUi", "initData", "toRegister", "qaList", "Lcom/huawei/digitalpayment/consumer/loginModule/register/request/QAItem;", "initView", "initToolbar", "title", "getLayoutId", "", "toRegisterResult", "des", "Companion", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SecurityVerificationActivity extends Hilt_SecurityVerificationActivity<ActivitySecurityVerificationBinding, SecurityVerificationViewModel> {
    public static final int $stable;

    public static final Companion INSTANCE;
    public static final String FORMAT_DATE_SHOW = "dd/MM/yyyy";
    public static final String QA = "Qa";
    private static char[] component1;
    private static char component2;
    private static long component3;
    private static int getRequestBeneficiariesState;
    private boolean asyncRegisterTag;
    private BaseDatePickerDialog datePickerDialog;
    private boolean oneStepRegisterTag;
    private SingleSelectDialog<LocalQuestionItem> questionDialog;
    private List<LocalQuestionItem> questionList;
    private RegisterParams registerParams;
    private Calendar selectedCalendar;
    private LocalValidatorItem validatorItem;
    private static final byte[] $$l = {107, -21, -54, -113};
    private static final int $$o = 182;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {113, 66, TarHeader.LF_CHR, 67, Ascii.VT, -3, -64, TarHeader.LF_SYMLINK, 10, -4, -8, -2, 0, -2, -52, TarHeader.LF_SYMLINK, Ascii.DLE, -10, Ascii.FF, -18, Ascii.FF, -69, TarHeader.LF_SYMLINK, Ascii.SO, -1, -67, Ascii.DC2, 46, -1, -35, 32, -12, 0, -66, 13, -15, Ascii.FF, Ascii.VT, -3, 2, -2, -2, -10, 8, 5, -66, Ascii.VT, -3, -64, 56, 1, 10, -13, Ascii.FF, -20, -53, TarHeader.LF_CHR, -2, Ascii.DLE, 1, -16, 5, 7, -17, -54, 65, -13, 1, Ascii.SI, -14, -5, 17, -19, Ascii.FF, -69, 70, -2, -12, 2, -63, 33, Ascii.DLE, 5, -3, -19, Ascii.NAK, Ascii.DLE, -22, -35, Ascii.GS, 10, -10, 17, -10, -12, Ascii.DC2, -6, 2, Ascii.VT, -3, 2, -2, -2, -10, 8, 5, -67};
    private static final int $$k = 227;
    private static final byte[] $$d = {57, Ascii.SYN, -21, -92, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -12, Ascii.FF, -19, -15, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 59, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 40;
    private static int component4 = 1;
    private static int copydefault = 0;
    private static int ShareDataUIState = 1;

    private final Lazy oldPin = LazyKt.lazy(new Function0() {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        @Override
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = component2 + 49;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            String str$r8$lambda$fJqafAnEsHgVbvSSoMxxXW_q4S8 = SecurityVerificationActivity.$r8$lambda$fJqafAnEsHgVbvSSoMxxXW_q4S8(this.f$0);
            if (i3 != 0) {
                int i4 = 26 / 0;
            }
            return str$r8$lambda$fJqafAnEsHgVbvSSoMxxXW_q4S8;
        }
    });

    private final Lazy newPin = LazyKt.lazy(new Function0() {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        @Override
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = component3 + 53;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            String str$r8$lambda$ZH9N2EcJylBUw_Is62NSXxgrMjs = SecurityVerificationActivity.$r8$lambda$ZH9N2EcJylBUw_Is62NSXxgrMjs(this.f$0);
            if (i3 != 0) {
                int i4 = 12 / 0;
            }
            return str$r8$lambda$ZH9N2EcJylBUw_Is62NSXxgrMjs;
        }
    });

    private static String $$r(short s, short s2, short s3) {
        int i = s * 2;
        int i2 = 119 - s3;
        byte[] bArr = $$l;
        int i3 = (s2 * 4) + 4;
        byte[] bArr2 = new byte[i + 1];
        int i4 = -1;
        if (bArr == null) {
            i2 = (-i2) + i;
            i3++;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i2;
            if (i5 == i) {
                return new String(bArr2, 0);
            }
            i2 = (-bArr[i3]) + i2;
            i3++;
            i4 = i5;
        }
    }

    private static void h(byte b2, short s, short s2, Object[] objArr) {
        byte[] bArr = $$d;
        int i = 103 - (s * 2);
        int i2 = b2 + 4;
        byte[] bArr2 = new byte[28 - s2];
        int i3 = 27 - s2;
        int i4 = -1;
        if (bArr == null) {
            i4 = -1;
            i = (i3 + (-i2)) - 8;
            i2++;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i;
            if (i5 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i6 = i;
            i4 = i5;
            i = (i6 + (-bArr[i2])) - 8;
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 99
            byte[] r0 = com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.$$j
            int r7 = r7 + 4
            int r6 = 53 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r6
            goto L27
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r7]
        L27:
            int r8 = r8 + r3
            int r8 = r8 + 1
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.i(int, int, int, java.lang.Object[]):void");
    }

    public static final void access$checkAnswer(SecurityVerificationActivity securityVerificationActivity) {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        securityVerificationActivity.checkAnswer();
        int i4 = ShareDataUIState + 81;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final String access$getNewPin(SecurityVerificationActivity securityVerificationActivity) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String newPin = securityVerificationActivity.getNewPin();
        int i4 = ShareDataUIState + 99;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return newPin;
    }

    public static final List access$getQuestionList$p(SecurityVerificationActivity securityVerificationActivity) {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        List<LocalQuestionItem> list = securityVerificationActivity.questionList;
        int i5 = i3 + 13;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public static final ViewModel access$getViewModel$p(SecurityVerificationActivity securityVerificationActivity) {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        VM vm = securityVerificationActivity.viewModel;
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = copydefault + 69;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return vm;
    }

    public static final void access$initData(SecurityVerificationActivity securityVerificationActivity) {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        securityVerificationActivity.initData();
        int i4 = copydefault + 39;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final void access$onItemSelected(SecurityVerificationActivity securityVerificationActivity, LocalQuestionItem localQuestionItem) {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        securityVerificationActivity.onItemSelected(localQuestionItem);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = copydefault + 31;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 21 / 0;
        }
    }

    public static final void access$setQuestionList$p(SecurityVerificationActivity securityVerificationActivity, List list) {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Object obj = null;
        securityVerificationActivity.questionList = list;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 111;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final void access$setValidatorItem$p(SecurityVerificationActivity securityVerificationActivity, LocalValidatorItem localValidatorItem) {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        securityVerificationActivity.validatorItem = localValidatorItem;
        if (i3 == 0) {
            throw null;
        }
    }

    public static final void access$updateUi(SecurityVerificationActivity securityVerificationActivity) {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        securityVerificationActivity.updateUi();
        int i4 = ShareDataUIState + 51;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component3 implements Observer, FunctionAdapter {
        private final Function1 copydefault;
        private static final byte[] $$c = {34, -56, Ascii.SUB, -92};
        private static final int $$f = 204;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {Ascii.SI, 58, -59, -18, -4, 57, -57, -17, -3, 1, -5, -7, -5, 45, -57, -23, 3, -19, Ascii.VT, -19, 62, -61, -15, 1, -8, -11, 3, TarHeader.LF_LINK, -57, -21, 1, TarHeader.LF_DIR, -42, -18, -4, -9, -5, -5, 3, -15, -12, Base64.padSymbol};
        private static final int $$e = 249;
        private static final byte[] $$a = {80, 83, -21, -55, -28, -14, -19, -15, -15, -7, -25, -22, TarHeader.LF_LINK, -28, -17, -25, 5, -17, -17, -11, -36, -7, -24, -37, -9, -33, -3, 17, -45, -35, 3, -4, -4, -26, -49, 3, -35, -1};
        private static final int $$b = 197;
        private static int component2 = 0;
        private static int component1 = 1;
        private static long component3 = -763249476836067010L;

        private static String $$g(int i, int i2, int i3) {
            int i4 = 103 - (i * 4);
            int i5 = i3 * 4;
            int i6 = i2 + 4;
            byte[] bArr = $$c;
            byte[] bArr2 = new byte[i5 + 1];
            int i7 = -1;
            if (bArr == null) {
                i4 += i6;
                i6 = i6;
                i7 = -1;
            }
            while (true) {
                int i8 = i7 + 1;
                bArr2[i8] = (byte) i4;
                if (i8 == i5) {
                    return new String(bArr2, 0);
                }
                int i9 = i6 + 1;
                i4 += bArr[i9];
                i6 = i9;
                i7 = i8;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r7, short r8, int r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.component3.$$a
                int r7 = r7 * 16
                int r7 = r7 + 83
                int r8 = 16 - r8
                int r9 = 22 - r9
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L13
                r3 = r9
                r4 = r2
                r9 = r8
                goto L2b
            L13:
                r3 = r2
            L14:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r8) goto L23
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L23:
                int r9 = r9 + 1
                r3 = r0[r9]
                r6 = r9
                r9 = r7
                r7 = r3
                r3 = r6
            L2b:
                int r7 = -r7
                int r9 = r9 + r7
                int r7 = r9 + (-16)
                r9 = r3
                r3 = r4
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.component3.a(int, short, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void c(byte r6, byte r7, short r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.component3.$$d
                int r7 = r7 * 30
                int r7 = r7 + 3
                int r6 = r6 * 21
                int r6 = r6 + 10
                int r8 = r8 * 4
                int r8 = 99 - r8
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L17
                r4 = r6
                r8 = r7
                r3 = r2
                goto L2c
            L17:
                r3 = r2
                r5 = r8
                r8 = r7
                r7 = r5
            L1b:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L2a
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L2a:
                r4 = r0[r8]
            L2c:
                int r4 = -r4
                int r7 = r7 + r4
                int r7 = r7 + (-6)
                int r8 = r8 + 1
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.component3.c(byte, byte, short, java.lang.Object[]):void");
        }

        private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
            char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component3 ^ 6728534956745174161L, cArr, i);
            iTrustedWebActivityServiceDefault.copydefault = 4;
            int i3 = $11 + 99;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
                int i5 = $11 + 51;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
                int i7 = iTrustedWebActivityServiceDefault.copydefault;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component3)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(MotionEvent.axisFromString("") + 7033, ImageFormat.getBitsPerPixel(0) + 35, (char) (63441 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrComponent2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1389 - ExpandableListView.getPackedPositionChild(0L), Color.blue(0) + 18, (char) (51269 - View.resolveSizeAndState(0, 0, 0)), -1883291598, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
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
            objArr[0] = new String(cArrComponent2, 4, cArrComponent2.length - 4);
        }

        public final boolean equals(Object obj) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            boolean z = obj instanceof Observer;
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-411944782);
            if (objCopydefault == null) {
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 1115;
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 23;
                char cRed = (char) Color.red(0);
                byte[] bArr = $$a;
                byte b2 = (byte) (-bArr[37]);
                Object[] objArr2 = new Object[1];
                a(b2, (byte) (b2 + 5), (byte) (-bArr[6]), objArr2);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(offsetBefore, iLastIndexOf, cRed, 573302743, false, (String) objArr2[0], null);
            }
            Object obj2 = null;
            long j = ((Field) objCopydefault).getLong(null);
            Object[] objArr3 = new Object[1];
            b(1 - Color.blue(0), new char[]{31233, 54279, 29124, 56314, 31328, 454, 56062, 23173, 11474, 63493, 29626, 3101, 55062, 22355, 10556, 62764, 32332, 3479, 56866, 24286, 8348, 58587, 30694, GMTDateParser.HOURS, 52174, 21303}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((ViewConfiguration.getEdgeSlop() >> 16) + 1, new char[]{29786, 49571, 64736, 11033, 29759, 5216, 22495, 43620, 8853, 60845, 65182, 64642, 55623, 17125, 42074, 1512, 28679, 6189, 21271}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-8046594);
            if (objCopydefault2 == null) {
                int threadPriority = 1115 - ((Process.getThreadPriority(0) + 20) >> 6);
                int mode = View.MeasureSpec.getMode(0) + 22;
                char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                byte[] bArr2 = $$a;
                byte b3 = (byte) (-bArr2[37]);
                byte b4 = bArr2[16];
                Object[] objArr5 = new Object[1];
                a(b3, b4, (byte) (b4 + 5), objArr5);
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(threadPriority, mode, cNormalizeMetaState, 987555995, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-84684464);
                if (objCopydefault3 == null) {
                    int threadPriority2 = 1115 - ((Process.getThreadPriority(0) + 20) >> 6);
                    int iBlue = 22 - Color.blue(0);
                    char cBlue = (char) Color.blue(0);
                    byte b5 = (byte) ($$a[37] + 1);
                    byte b6 = b5;
                    Object[] objArr6 = new Object[1];
                    a(b5, b6, b6, objArr6);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(threadPriority2, iBlue, cBlue, 1068109365, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int i2 = ~(Process.myPid() | 825071541);
                int i3 = (((-344208817) | i2) * (-658)) + 1211377289 + ((i2 | (-900577206)) * 658) + 1272034835;
                int i4 = (i3 << 13) ^ i3;
                int i5 = i4 ^ (i4 >>> 17);
                ((int[]) objArr[0])[0] = i5 ^ (i5 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                b(-Process.getGidForName(""), new char[]{38219, 44838, 63865, 45008, 38186, 31463, 21059, 11951, 50072, 33572, 64263, 30775, 14418, 11377, 41439, 33147, 37182, 30374, 22175, 11000, 53197, 40912, 65347, 29780, 9395, 10261, 41985, 40204, 40258, 29013}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                b(-TextUtils.lastIndexOf("", '0'), new char[]{23664, 27219, 60173, 20146, 23571, 49033, 16417, 53197, 2729, 18006, 59747, 39226, 61816, 59652, 46007, 24670, 22567, 46033, 17643, 52122, 1775, 23202}, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i6 = component1 + 73;
                    component2 = i6 % 128;
                    if (i6 % 2 != 0) {
                        boolean z2 = applicationContext instanceof ContextWrapper;
                        throw null;
                    }
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                b(-ImageFormat.getBitsPerPixel(0), new char[]{55165, 51942, 47244, 28302, 55063, 7976, 5028, 61410, 33263, 59105, 47863, 47401, 31330, 18927, 57353, 16498, 54074, 4977, 6011, 60322}, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                b((ViewConfiguration.getWindowTouchSlop() >> 8) + 1, new char[]{5121, 56574, 54378, 18403, 5224, 2357, 32593, 50816, 17097, 61692, 54788, 36947, 47409, 24504, 36047, 26894, 4214, 1394, 31644, 49863}, objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 1, 1272034835};
                    byte[] bArr3 = $$d;
                    byte b7 = bArr3[9];
                    byte b8 = (byte) (b7 - 1);
                    Object[] objArr13 = new Object[1];
                    c(b7, b8, b8, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b9 = bArr3[9];
                    byte b10 = (byte) (b9 - 1);
                    byte b11 = b9;
                    Object[] objArr14 = new Object[1];
                    c(b10, b11, (byte) (b11 - 1), objArr14);
                    objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-84684464);
                        if (objCopydefault4 == null) {
                            int i7 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1114;
                            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 22;
                            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                            byte b12 = (byte) ($$a[37] + 1);
                            byte b13 = b12;
                            Object[] objArr15 = new Object[1];
                            a(b12, b13, b13, objArr15);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i7, tapTimeout, packedPositionGroup, 1068109365, false, (String) objArr15[0], null);
                        }
                        ((Field) objCopydefault4).set(null, objArr);
                        try {
                            Object[] objArr16 = new Object[1];
                            b((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), new char[]{31233, 54279, 29124, 56314, 31328, 454, 56062, 23173, 11474, 63493, 29626, 3101, 55062, 22355, 10556, 62764, 32332, 3479, 56866, 24286, 8348, 58587, 30694, GMTDateParser.HOURS, 52174, 21303}, objArr16);
                            Class<?> cls5 = Class.forName((String) objArr16[0]);
                            Object[] objArr17 = new Object[1];
                            b(TextUtils.indexOf("", "") + 1, new char[]{29786, 49571, 64736, 11033, 29759, 5216, 22495, 43620, 8853, 60845, 65182, 64642, 55623, 17125, 42074, 1512, 28679, 6189, 21271}, objArr17);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-8046594);
                            if (objCopydefault5 == null) {
                                int i8 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1114;
                                int packedPositionGroup2 = 22 - ExpandableListView.getPackedPositionGroup(0L);
                                char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                byte[] bArr4 = $$a;
                                byte b14 = (byte) (-bArr4[37]);
                                byte b15 = bArr4[16];
                                Object[] objArr18 = new Object[1];
                                a(b14, b15, (byte) (b15 + 5), objArr18);
                                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i8, packedPositionGroup2, c2, 987555995, false, (String) objArr18[0], null);
                            }
                            ((Field) objCopydefault5).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-411944782);
                            if (objCopydefault6 == null) {
                                int packedPositionChild = 1114 - ExpandableListView.getPackedPositionChild(0L);
                                int jumpTapTimeout = 22 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                char c3 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                byte[] bArr5 = $$a;
                                byte b16 = (byte) (-bArr5[37]);
                                Object[] objArr19 = new Object[1];
                                a(b16, (byte) (b16 + 5), (byte) (-bArr5[6]), objArr19);
                                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionChild, jumpTapTimeout, c3, 573302743, false, (String) objArr19[0], null);
                            }
                            ((Field) objCopydefault6).set(null, lValueOf2);
                            int i9 = component1 + 123;
                            component2 = i9 % 128;
                            int i10 = i9 % 2;
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i11 = ((int[]) objArr[1])[0];
            int i12 = ((int[]) objArr[2])[0];
            if (i12 != i11) {
                long j2 = -1;
                long j3 = ((long) (i12 ^ i11)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
                long j4 = 0;
                long j5 = j3 | (((long) 5) << 32) | (j4 - ((j4 >> 63) << 32));
                try {
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault7 == null) {
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0) + 6619, 42 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
                    Object[] objArr20 = {-322661219, Long.valueOf(j5), new ArrayList(), null, false, false};
                    Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                    if (objCopydefault8 == null) {
                        objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (Process.myPid() >> 22) + 56, (char) View.getDefaultSize(0, 0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                    }
                    ((Method) objCopydefault8).invoke(objInvoke, objArr20);
                    int i13 = ((int[]) objArr[0])[0];
                    Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                    int i14 = ~System.identityHashCode(this);
                    int i15 = i13 + (-1351014801) + (((~(i14 | 751208370)) | 16781312) * (-160)) + (((~(i14 | 558010882)) | 751208370) * 160);
                    int i16 = (i15 << 13) ^ i15;
                    int i17 = i16 ^ (i16 >>> 17);
                    ((int[]) objArr21[0])[0] = i17 ^ (i17 << 5);
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            int i18 = component1 + 115;
            component2 = i18 % 128;
            int i19 = i18 % 2;
            int i20 = ((int[]) objArr[0])[0];
            Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i21 = ~iIdentityHashCode;
            int i22 = i20 + 191694172 + (((~((-1054867133) | i21)) | (~(861669644 | i21))) * (-867)) + (((~((-1054867133) | iIdentityHashCode)) | 209974960 | (~(861669644 | iIdentityHashCode))) * (-1734)) + (((~(iIdentityHashCode | 1071644604)) | (~(i21 | (-209974961))) | (~((-844892173) | iIdentityHashCode))) * 867);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr22[0])[0] = i24 ^ (i24 << 5);
            int i25 = ((int[]) objArr22[0])[0];
            Object[] objArr23 = {new int[1], new int[]{((int[]) objArr22[1])[0]}, new int[]{((int[]) objArr22[2])[0]}, (String[]) objArr22[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i26 = i25 + (-483695264) + (((~((~iIdentityHashCode2) | (-462381196))) | (-269183708)) * (-235)) + (((~((-462381196) | iIdentityHashCode2)) | (-269183708)) * (-470)) + (((~(iIdentityHashCode2 | (-269181068))) | (-462383836)) * 235);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr23[0])[0] = i28 ^ (i28 << 5);
            if (!z || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i29 = component2 + 75;
            component1 = i29 % 128;
            if (i29 % 2 != 0) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            obj2.hashCode();
            throw null;
        }

        component3(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 89;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.copydefault;
            int i5 = i2 + 1;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 95;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                getFunctionDelegate().hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = component1 + 125;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 41;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            this.copydefault.invoke(obj);
            if (i3 != 0) {
                int i4 = 88 / 0;
            }
        }
    }

    private final String getOldPin() {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.oldPin.getValue();
        if (i3 != 0) {
            return (String) value;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r4 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
    
        if (r4 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.String oldPin_delegate$lambda$0(com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.copydefault
            int r1 = r1 + 79
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.ShareDataUIState = r2
            int r1 = r1 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            android.content.Intent r4 = r4.getIntent()
            if (r4 == 0) goto L33
            int r2 = com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.copydefault
            int r2 = r2 + 49
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.ShareDataUIState = r3
            int r2 = r2 % r0
            java.lang.String r3 = "tempPin"
            java.lang.String r4 = r4.getStringExtra(r3)
            if (r2 != 0) goto L31
            r2 = 81
            int r2 = r2 / 0
            if (r4 != 0) goto L2f
            goto L33
        L2f:
            r1 = r4
            goto L41
        L31:
            if (r4 != 0) goto L2f
        L33:
            int r4 = com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.ShareDataUIState
            int r4 = r4 + 113
            int r2 = r4 % 128
            com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.copydefault = r2
            int r4 = r4 % r0
            if (r4 == 0) goto L41
            r4 = 5
            int r4 = r4 % 3
        L41:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.oldPin_delegate$lambda$0(com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity):java.lang.String");
    }

    private final String getNewPin() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.newPin.getValue();
        if (i3 == 0) {
            return (String) value;
        }
        throw null;
    }

    private static final String newPin_delegate$lambda$1(SecurityVerificationActivity securityVerificationActivity) {
        String stringExtra;
        int i = 2 % 2;
        int i2 = copydefault + 121;
        ShareDataUIState = i2 % 128;
        String str = "";
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(securityVerificationActivity, "");
            securityVerificationActivity.getIntent();
            throw null;
        }
        Intrinsics.checkNotNullParameter(securityVerificationActivity, "");
        Intent intent = securityVerificationActivity.getIntent();
        if (intent != null && (stringExtra = intent.getStringExtra("creationPin")) != null) {
            str = stringExtra;
        }
        int i3 = copydefault + 47;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $10 + 39;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = notifyVar.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3265 - ExpandableListView.getPackedPositionChild(0L), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33, (char) (TextUtils.getCapsMode("", 0, 0) + 60268), -834797019, false, $$r(b2, b3, (byte) (b3 | 17)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() / (component3 - 5431355972723572778L);
                    try {
                        Object[] objArr3 = {notifyVar, notifyVar};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                        if (objCopydefault2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 686, 34 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (60372 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), -1969106284, false, $$r(b4, b5, (byte) (b5 | Ascii.SO)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault2).invoke(null, objArr3);
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
            } else {
                int i5 = notifyVar.copydefault;
                Object[] objArr4 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.blue(0) + 3266, 33 - Color.red(0), (char) (Color.green(0) + 60268), -834797019, false, $$r(b6, b7, (byte) (b7 | 17)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objCopydefault3).invoke(null, objArr4)).longValue() ^ (component3 ^ 5431355972723572778L);
                Object[] objArr5 = {notifyVar, notifyVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(686 - MotionEvent.axisFromString(""), 34 - KeyEvent.getDeadChar(0, 0), (char) (TextUtils.getTrimmedLength("") + 60373), -1969106284, false, $$r(b8, b9, (byte) (b9 | Ascii.SO)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        int i6 = $10 + 15;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (notifyVar.copydefault < cArr.length) {
            int i8 = $11 + 97;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr6 = {notifyVar, notifyVar};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault5 == null) {
                byte b10 = (byte) 0;
                byte b11 = b10;
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getDoubleTapTimeout() >> 16) + 687, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 34, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 60374), -1969106284, false, $$r(b10, b11, (byte) (b11 | Ascii.SO)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$1", f = "SecurityVerificationActivity.kt", i = {}, l = {139}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component3 = 0;
        private static int copydefault = 1;
        int ShareDataUIState;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass5<T> implements FlowCollector {
            private static int ShareDataUIState = 1;
            private static int component3;
            final SecurityVerificationActivity copydefault;

            @Override
            public Object emit(Object obj, Continuation continuation) {
                int i = 2 % 2;
                int i2 = component3 + 119;
                ShareDataUIState = i2 % 128;
                Resource<List<LocalQuestionItem>> resource = (Resource) obj;
                if (i2 % 2 != 0) {
                    return component2(resource, (Continuation<? super Unit>) continuation);
                }
                component2(resource, (Continuation<? super Unit>) continuation);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            private static final void component1(SecurityVerificationActivity securityVerificationActivity, View view) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 61;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(securityVerificationActivity, "");
                    SecurityVerificationActivity.access$initData(securityVerificationActivity);
                } else {
                    Intrinsics.checkNotNullParameter(securityVerificationActivity, "");
                    SecurityVerificationActivity.access$initData(securityVerificationActivity);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
            
                return kotlin.Unit.INSTANCE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
            
                com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.access$setQuestionList$p(r2.copydefault, r3.getData());
                r3 = com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.access$getQuestionList$p(r2.copydefault);
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
            
                if (r3 == null) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
            
                r0 = com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.copydefault.AnonymousClass5.ShareDataUIState + 45;
                com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.copydefault.AnonymousClass5.component3 = r0 % 128;
                r0 = r0 % 2;
                r3 = (com.huawei.digitalpayment.consumer.loginModule.register.data.LocalQuestionItem) kotlin.collections.CollectionsKt.firstOrNull(r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
            
                if (r3 == null) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
            
                ((com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.SecurityVerificationViewModel) com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.access$getViewModel$p(r2.copydefault)).selectQuestion(r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
            
                return kotlin.Unit.INSTANCE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
            
                if (r3.error() != false) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
            
                if (r3.error() != false) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
            
                r3 = r2.copydefault;
                com.huawei.digitalpayment.consumer.baselib.util.LoadUtils.showError(r3, new com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$1$2$$ExternalSyntheticLambda0(r3));
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object component2(com.huawei.payment.mvvm.Resource<java.util.List<com.huawei.digitalpayment.consumer.loginModule.register.data.LocalQuestionItem>> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                /*
                    r2 = this;
                    r4 = 2
                    int r0 = r4 % r4
                    int r0 = com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.copydefault.AnonymousClass5.component3
                    int r0 = r0 + 27
                    int r1 = r0 % 128
                    com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.copydefault.AnonymousClass5.ShareDataUIState = r1
                    int r0 = r0 % r4
                    r1 = 0
                    if (r0 != 0) goto L1d
                    com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity r0 = r2.copydefault
                    androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
                    com.huawei.payment.mvvm.Utils.showOrHideLoading(r0, r3, r1)
                    boolean r0 = r3.error()
                    if (r0 == 0) goto L3a
                    goto L2a
                L1d:
                    com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity r0 = r2.copydefault
                    androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
                    com.huawei.payment.mvvm.Utils.showOrHideLoading(r0, r3, r1)
                    boolean r0 = r3.error()
                    if (r0 == 0) goto L3a
                L2a:
                    com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity r3 = r2.copydefault
                    r4 = r3
                    android.app.Activity r4 = (android.app.Activity) r4
                    com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$1$2$$ExternalSyntheticLambda0 r0 = new com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$1$2$$ExternalSyntheticLambda0
                    r0.<init>()
                    com.huawei.digitalpayment.consumer.baselib.util.LoadUtils.showError(r4, r0)
                    kotlin.Unit r3 = kotlin.Unit.INSTANCE
                    return r3
                L3a:
                    com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity r0 = r2.copydefault
                    java.lang.Object r3 = r3.getData()
                    java.util.List r3 = (java.util.List) r3
                    com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.access$setQuestionList$p(r0, r3)
                    com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity r3 = r2.copydefault
                    java.util.List r3 = com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.access$getQuestionList$p(r3)
                    if (r3 == 0) goto L69
                    int r0 = com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.copydefault.AnonymousClass5.ShareDataUIState
                    int r0 = r0 + 45
                    int r1 = r0 % 128
                    com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.copydefault.AnonymousClass5.component3 = r1
                    int r0 = r0 % r4
                    java.lang.Object r3 = kotlin.collections.CollectionsKt.firstOrNull(r3)
                    com.huawei.digitalpayment.consumer.loginModule.register.data.LocalQuestionItem r3 = (com.huawei.digitalpayment.consumer.loginModule.register.data.LocalQuestionItem) r3
                    if (r3 == 0) goto L69
                    com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity r4 = r2.copydefault
                    androidx.lifecycle.ViewModel r4 = com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.access$getViewModel$p(r4)
                    com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.SecurityVerificationViewModel r4 = (com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.SecurityVerificationViewModel) r4
                    r4.selectQuestion(r3)
                L69:
                    kotlin.Unit r3 = kotlin.Unit.INSTANCE
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.copydefault.AnonymousClass5.component2(com.huawei.payment.mvvm.Resource, kotlin.coroutines.Continuation):java.lang.Object");
            }

            public static void ShareDataUIState(SecurityVerificationActivity securityVerificationActivity, View view) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 105;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                component2(securityVerificationActivity, view);
                int i4 = component3 + 21;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
            }

            AnonymousClass5(SecurityVerificationActivity securityVerificationActivity) {
                this.copydefault = securityVerificationActivity;
            }

            /* JADX WARN: Finally extract failed */
            private static void component2(SecurityVerificationActivity securityVerificationActivity, View view) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 101;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Callback.onClick_enter(view);
                try {
                    if (i3 != 0) {
                        component1(securityVerificationActivity, view);
                        Callback.onClick_exit();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    component1(securityVerificationActivity, view);
                    Callback.onClick_exit();
                    int i4 = component3 + 27;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                } catch (Throwable th) {
                    Callback.onClick_exit();
                    throw th;
                }
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.ShareDataUIState;
            if (i2 != 0) {
                int i3 = component3 + 117;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                final StateFlow<SecretVerifyUiState> stateFlowUiState = ((SecurityVerificationViewModel) SecurityVerificationActivity.access$getViewModel$p(SecurityVerificationActivity.this)).uiState();
                this.ShareDataUIState = 1;
                if (FlowKt.distinctUntilChanged(new Flow<Resource<List<? extends LocalQuestionItem>>>() {
                    private static int ShareDataUIState = 1;
                    private static int component1;

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        private static int component1 = 1;
                        private static int component3;
                        final FlowCollector copydefault;

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$1$invokeSuspend$$inlined$map$1$2", f = "SecurityVerificationActivity.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            private static int component1 = 1;
                            private static int component2;
                            Object L$0;
                            int label;
                            Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override
                            public final Object invokeSuspend(Object obj) {
                                int i = 2 % 2;
                                int i2 = component1 + 23;
                                component2 = i2 % 128;
                                int i3 = i2 % 2;
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                Object obj2 = null;
                                Object objEmit = AnonymousClass2.this.emit(null, this);
                                int i4 = component2 + 107;
                                component1 = i4 % 128;
                                if (i4 % 2 != 0) {
                                    return objEmit;
                                }
                                obj2.hashCode();
                                throw null;
                            }
                        }

                        /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
                        @Override
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                            /*
                                r5 = this;
                                r0 = 2
                                int r1 = r0 % r0
                                int r1 = com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3
                                int r1 = r1 + 51
                                int r2 = r1 % 128
                                com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component1 = r2
                                int r1 = r1 % r0
                                if (r1 == 0) goto L68
                                boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r1 == 0) goto L22
                                r1 = r7
                                com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$1$invokeSuspend$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                                int r2 = r1.label
                                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                                r2 = r2 & r3
                                if (r2 == 0) goto L22
                                int r7 = r1.label
                                int r7 = r7 + r3
                                r1.label = r7
                                goto L27
                            L22:
                                com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$1$invokeSuspend$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$1$invokeSuspend$$inlined$map$1$2$1
                                r1.<init>(r7)
                            L27:
                                java.lang.Object r7 = r1.result
                                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r3 = r1.label
                                r4 = 1
                                if (r3 == 0) goto L4e
                                int r6 = com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component1
                                int r6 = r6 + 31
                                int r1 = r6 % 128
                                com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3 = r1
                                int r6 = r6 % r0
                                if (r6 == 0) goto L40
                                if (r3 != 0) goto L46
                                goto L42
                            L40:
                                if (r3 != r4) goto L46
                            L42:
                                kotlin.ResultKt.throwOnFailure(r7)
                                goto L65
                            L46:
                                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                r6.<init>(r7)
                                throw r6
                            L4e:
                                kotlin.ResultKt.throwOnFailure(r7)
                                kotlinx.coroutines.flow.FlowCollector r7 = r5.copydefault
                                r0 = r1
                                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                                com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.SecretVerifyUiState r6 = (com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.SecretVerifyUiState) r6
                                com.huawei.payment.mvvm.Resource r6 = r6.getQuestions()
                                r1.label = r4
                                java.lang.Object r6 = r7.emit(r6, r1)
                                if (r6 != r2) goto L65
                                return r2
                            L65:
                                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                return r6
                            L68:
                                boolean r6 = r7 instanceof com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                r6 = 0
                                throw r6
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.copydefault = flowCollector;
                        }
                    }

                    @Override
                    public Object collect(FlowCollector<? super Resource<List<? extends LocalQuestionItem>>> flowCollector, Continuation continuation) {
                        int i5 = 2 % 2;
                        Object objCollect = stateFlowUiState.collect(new AnonymousClass2(flowCollector), continuation);
                        if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            int i6 = ShareDataUIState + 71;
                            component1 = i6 % 128;
                            if (i6 % 2 != 0) {
                                int i7 = 70 / 0;
                            }
                            return objCollect;
                        }
                        Unit unit = Unit.INSTANCE;
                        int i8 = ShareDataUIState + 19;
                        component1 = i8 % 128;
                        int i9 = i8 % 2;
                        return unit;
                    }
                }).collect(new AnonymousClass5(SecurityVerificationActivity.this), this) == coroutine_suspended) {
                    int i5 = component3 + 69;
                    int i6 = i5 % 128;
                    copydefault = i6;
                    int i7 = i5 % 2;
                    int i8 = i6 + 23;
                    component3 = i8 % 128;
                    if (i8 % 2 == 0) {
                        return coroutine_suspended;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }
            return Unit.INSTANCE;
        }

        copydefault(Continuation<? super copydefault> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = SecurityVerificationActivity.this.new copydefault(continuation);
            int i2 = component3 + 47;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 6 / 0;
            }
            return copydefaultVar;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 83;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent1 = component1(coroutineScope, continuation);
            int i4 = component3 + 69;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return objComponent1;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 13;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            copydefault copydefaultVar = (copydefault) create(coroutineScope, continuation);
            if (i3 == 0) {
                copydefaultVar.invokeSuspend(Unit.INSTANCE);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = copydefaultVar.invokeSuspend(Unit.INSTANCE);
            int i4 = copydefault + 115;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$2", f = "SecurityVerificationActivity.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 1;
        private static int component3;
        int component2;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 33;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.component2;
            if (i4 != 0) {
                int i5 = component1 + 9;
                int i6 = i5 % 128;
                component3 = i6;
                int i7 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = i6 + 15;
                component1 = i8 % 128;
                if (i8 % 2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    throw null;
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                final StateFlow<SecretVerifyUiState> stateFlowUiState = ((SecurityVerificationViewModel) SecurityVerificationActivity.access$getViewModel$p(SecurityVerificationActivity.this)).uiState();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<LocalQuestionItem>() {
                    private static int component1 = 1;
                    private static int copydefault;

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        private static int ShareDataUIState = 0;
                        private static int component3 = 1;
                        final FlowCollector component1;

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$2$invokeSuspend$$inlined$map$1$2", f = "SecurityVerificationActivity.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            private static int component2 = 1;
                            private static int component3;
                            Object L$0;
                            int label;
                            Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override
                            public final Object invokeSuspend(Object obj) {
                                int i = 2 % 2;
                                int i2 = component3 + 83;
                                component2 = i2 % 128;
                                int i3 = i2 % 2;
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                Object objEmit = AnonymousClass2.this.emit(null, this);
                                int i4 = component3 + 1;
                                component2 = i4 % 128;
                                if (i4 % 2 != 0) {
                                    return objEmit;
                                }
                                throw null;
                            }
                        }

                        /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[PHI: r2
  0x0030: PHI (r2v7 com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$2$invokeSuspend$$inlined$map$1$2$1) = 
  (r2v6 com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$2$invokeSuspend$$inlined$map$1$2$1)
  (r2v9 com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$2$invokeSuspend$$inlined$map$1$2$1)
 binds: [B:10:0x002e, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
                        @Override
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                            /*
                                r5 = this;
                                r0 = 2
                                int r1 = r0 % r0
                                int r1 = com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.component3
                                int r1 = r1 + 57
                                int r2 = r1 % 128
                                com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState = r2
                                int r1 = r1 % r0
                                boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r1 == 0) goto L36
                                int r2 = r2 + 115
                                int r1 = r2 % 128
                                com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.component3 = r1
                                int r2 = r2 % r0
                                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                if (r2 != 0) goto L28
                                r2 = r7
                                com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$2$invokeSuspend$$inlined$map$1$2$1 r2 = (com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r2
                                int r3 = r2.label
                                r3 = r3 & r1
                                r4 = 45
                                int r4 = r4 / 0
                                if (r3 == 0) goto L36
                                goto L30
                            L28:
                                r2 = r7
                                com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$2$invokeSuspend$$inlined$map$1$2$1 r2 = (com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r2
                                int r3 = r2.label
                                r3 = r3 & r1
                                if (r3 == 0) goto L36
                            L30:
                                int r7 = r2.label
                                int r7 = r7 + r1
                                r2.label = r7
                                goto L3b
                            L36:
                                com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$2$invokeSuspend$$inlined$map$1$2$1 r2 = new com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$2$invokeSuspend$$inlined$map$1$2$1
                                r2.<init>(r7)
                            L3b:
                                java.lang.Object r7 = r2.result
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r3 = r2.label
                                r4 = 1
                                if (r3 == 0) goto L6f
                                int r6 = com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.component3
                                int r6 = r6 + 5
                                int r1 = r6 % 128
                                com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState = r1
                                int r6 = r6 % r0
                                if (r6 == 0) goto L54
                                if (r3 != 0) goto L67
                                goto L56
                            L54:
                                if (r3 != r4) goto L67
                            L56:
                                kotlin.ResultKt.throwOnFailure(r7)
                                int r6 = com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.component3
                                int r6 = r6 + 101
                                int r7 = r6 % 128
                                com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState = r7
                                int r6 = r6 % r0
                                if (r6 == 0) goto L86
                                int r0 = r0 % 5
                                goto L86
                            L67:
                                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                r6.<init>(r7)
                                throw r6
                            L6f:
                                kotlin.ResultKt.throwOnFailure(r7)
                                kotlinx.coroutines.flow.FlowCollector r7 = r5.component1
                                r0 = r2
                                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                                com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.SecretVerifyUiState r6 = (com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.SecretVerifyUiState) r6
                                com.huawei.digitalpayment.consumer.loginModule.register.data.LocalQuestionItem r6 = r6.getSelectedQuestion()
                                r2.label = r4
                                java.lang.Object r6 = r7.emit(r6, r2)
                                if (r6 != r1) goto L86
                                return r1
                            L86:
                                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                return r6
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.component1 = flowCollector;
                        }
                    }

                    @Override
                    public Object collect(FlowCollector<? super LocalQuestionItem> flowCollector, Continuation continuation) {
                        int i9 = 2 % 2;
                        Object objCollect = stateFlowUiState.collect(new AnonymousClass2(flowCollector), continuation);
                        if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            int i10 = component1 + 49;
                            copydefault = i10 % 128;
                            if (i10 % 2 == 0) {
                                return objCollect;
                            }
                            throw null;
                        }
                        Unit unit = Unit.INSTANCE;
                        int i11 = copydefault + 15;
                        component1 = i11 % 128;
                        int i12 = i11 % 2;
                        return unit;
                    }
                });
                final SecurityVerificationActivity securityVerificationActivity = SecurityVerificationActivity.this;
                this.component2 = 1;
                if (flowDistinctUntilChanged.collect(new FlowCollector() {
                    private static int component3 = 0;
                    private static int copydefault = 1;

                    @Override
                    public Object emit(Object obj2, Continuation continuation) {
                        int i9 = 2 % 2;
                        int i10 = component3 + 71;
                        copydefault = i10 % 128;
                        int i11 = i10 % 2;
                        Object objComponent1 = component1((LocalQuestionItem) obj2, continuation);
                        if (i11 == 0) {
                            int i12 = 64 / 0;
                        }
                        int i13 = component3 + 53;
                        copydefault = i13 % 128;
                        if (i13 % 2 != 0) {
                            return objComponent1;
                        }
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }

                    public final Object component1(LocalQuestionItem localQuestionItem, Continuation<? super Unit> continuation) {
                        int i9 = 2 % 2;
                        int i10 = copydefault + 43;
                        component3 = i10 % 128;
                        if (i10 % 2 != 0) {
                            SecurityVerificationActivity.access$onItemSelected(securityVerificationActivity, localQuestionItem);
                            int i11 = 8 / 0;
                            return Unit.INSTANCE;
                        }
                        SecurityVerificationActivity.access$onItemSelected(securityVerificationActivity, localQuestionItem);
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    int i9 = component1 + 71;
                    component3 = i9 % 128;
                    int i10 = i9 % 2;
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        component2(Continuation<? super component2> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = SecurityVerificationActivity.this.new component2(continuation);
            int i2 = component3 + 13;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return component2Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 125;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent1 = component1(coroutineScope, continuation);
            int i4 = component3 + 19;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return objComponent1;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 1;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component1 + 27;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 30 / 0;
            }
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$3", f = "SecurityVerificationActivity.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, s = {})
    static final class ShareDataUIState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int component3 = 1;
        int component2;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component2;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<SecretVerifyUiState> stateFlowUiState = ((SecurityVerificationViewModel) SecurityVerificationActivity.access$getViewModel$p(SecurityVerificationActivity.this)).uiState();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Resource<LocalLoginInfo>>() {
                    private static int component1 = 0;
                    private static int component3 = 1;

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        private static int ShareDataUIState = 1;
                        private static int component2;
                        final FlowCollector component3;

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$3$invokeSuspend$$inlined$map$1$2", f = "SecurityVerificationActivity.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            private static int component3 = 1;
                            private static int copydefault;
                            Object L$0;
                            int label;
                            Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override
                            public final Object invokeSuspend(Object obj) {
                                Object objEmit;
                                int i = 2 % 2;
                                int i2 = component3 + 47;
                                copydefault = i2 % 128;
                                int i3 = i2 % 2;
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                if (i3 != 0) {
                                    objEmit = anonymousClass2.emit(null, this);
                                    int i4 = 64 / 0;
                                } else {
                                    objEmit = anonymousClass2.emit(null, this);
                                }
                                int i5 = copydefault + 105;
                                component3 = i5 % 128;
                                if (i5 % 2 != 0) {
                                    return objEmit;
                                }
                                throw null;
                            }
                        }

                        /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
                        @Override
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                            /*
                                r5 = this;
                                r0 = 2
                                int r1 = r0 % r0
                                int r1 = com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$3$invokeSuspend$$inlined$map$1.AnonymousClass2.component2
                                int r1 = r1 + 101
                                int r2 = r1 % 128
                                com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$3$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState = r2
                                int r1 = r1 % r0
                                if (r1 == 0) goto L71
                                boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$3$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r1 == 0) goto L2b
                                r1 = r7
                                com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$3$invokeSuspend$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$3$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                                int r2 = r1.label
                                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                                r2 = r2 & r3
                                if (r2 == 0) goto L2b
                                int r7 = com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$3$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState
                                int r7 = r7 + 79
                                int r2 = r7 % 128
                                com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$3$invokeSuspend$$inlined$map$1.AnonymousClass2.component2 = r2
                                int r7 = r7 % r0
                                int r7 = r1.label
                                int r7 = r7 + r3
                                r1.label = r7
                                goto L30
                            L2b:
                                com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$3$invokeSuspend$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$3$invokeSuspend$$inlined$map$1$2$1
                                r1.<init>(r7)
                            L30:
                                java.lang.Object r7 = r1.result
                                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r3 = r1.label
                                r4 = 1
                                if (r3 == 0) goto L57
                                int r6 = com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$3$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState
                                int r6 = r6 + 37
                                int r1 = r6 % 128
                                com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$3$invokeSuspend$$inlined$map$1.AnonymousClass2.component2 = r1
                                int r6 = r6 % r0
                                if (r6 == 0) goto L49
                                if (r3 != r4) goto L4f
                                goto L4b
                            L49:
                                if (r3 != r4) goto L4f
                            L4b:
                                kotlin.ResultKt.throwOnFailure(r7)
                                goto L6e
                            L4f:
                                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                r6.<init>(r7)
                                throw r6
                            L57:
                                kotlin.ResultKt.throwOnFailure(r7)
                                kotlinx.coroutines.flow.FlowCollector r7 = r5.component3
                                r0 = r1
                                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                                com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.SecretVerifyUiState r6 = (com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.SecretVerifyUiState) r6
                                com.huawei.payment.mvvm.Resource r6 = r6.getActive()
                                r1.label = r4
                                java.lang.Object r6 = r7.emit(r6, r1)
                                if (r6 != r2) goto L6e
                                return r2
                            L6e:
                                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                return r6
                            L71:
                                boolean r6 = r7 instanceof com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$3$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                r6 = 0
                                throw r6
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity$observeData$3$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.component3 = flowCollector;
                        }
                    }

                    @Override
                    public Object collect(FlowCollector<? super Resource<LocalLoginInfo>> flowCollector, Continuation continuation) {
                        int i3 = 2 % 2;
                        Object objCollect = stateFlowUiState.collect(new AnonymousClass2(flowCollector), continuation);
                        if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            return Unit.INSTANCE;
                        }
                        int i4 = component1;
                        int i5 = i4 + 37;
                        component3 = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i6 = 31 / 0;
                        }
                        int i7 = i4 + 13;
                        component3 = i7 % 128;
                        if (i7 % 2 != 0) {
                            return objCollect;
                        }
                        throw null;
                    }
                });
                final SecurityVerificationActivity securityVerificationActivity = SecurityVerificationActivity.this;
                this.component2 = 1;
                if (flowDistinctUntilChanged.collect(new FlowCollector() {
                    private static int ShareDataUIState = 1;
                    private static int component3;

                    @Override
                    public Object emit(Object obj2, Continuation continuation) {
                        int i3 = 2 % 2;
                        int i4 = component3 + 113;
                        ShareDataUIState = i4 % 128;
                        int i5 = i4 % 2;
                        Object objCopydefault = copydefault((Resource) obj2, continuation);
                        if (i5 == 0) {
                            int i6 = 26 / 0;
                        }
                        int i7 = component3 + 117;
                        ShareDataUIState = i7 % 128;
                        int i8 = i7 % 2;
                        return objCopydefault;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
                    
                        if ((r0 % 2) == 0) goto L17;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
                    
                        if (((com.huawei.digitalpayment.consumer.baselib.service.ICommonService) com.huawei.arouter.RouteUtils.getService(com.huawei.digitalpayment.consumer.baselib.service.ICommonService.class)).dealError(r1, r4.getException()) == false) goto L15;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
                    
                        return kotlin.Unit.INSTANCE;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
                    
                        com.huawei.common.widget.toast.CommonToast.showText(r4.getMessage());
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
                    
                        return kotlin.Unit.INSTANCE;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
                    
                        ((com.huawei.digitalpayment.consumer.baselib.service.ICommonService) com.huawei.arouter.RouteUtils.getService(com.huawei.digitalpayment.consumer.baselib.service.ICommonService.class)).dealError(r1, r4.getException());
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
                    
                        throw null;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
                    
                        if ((!r4.success()) == false) goto L22;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
                    
                        r4 = r4.getData();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(r4);
                        r4 = r4;
                        r0 = r4.getExecute();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
                    
                        if (r0 == null) goto L31;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
                    
                        r1 = com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.ShareDataUIState.AnonymousClass2.ShareDataUIState + 101;
                        com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.ShareDataUIState.AnonymousClass2.component3 = r1 % 128;
                        r1 = r1 % 2;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
                    
                        if (r0.length() != 0) goto L29;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:26:0x0096, code lost:
                    
                        r0 = com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.ShareDataUIState.AnonymousClass2.component3 + 17;
                        com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.ShareDataUIState.AnonymousClass2.ShareDataUIState = r0 % 128;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
                    
                        if ((r0 % 2) != 0) goto L31;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
                    
                        r0 = 4 % 2;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:
                    
                        com.huawei.arouter.RouteUtils.routeWithExecute(r1, r4.getExecute());
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b1, code lost:
                    
                        return kotlin.Unit.INSTANCE;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
                    
                        com.huawei.digitalpayment.consumer.login.util.LoginUtils.guideOpenBiometricLogin(com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.access$getNewPin(r1), r4);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
                    
                        return kotlin.Unit.INSTANCE;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
                    
                        if (r4.error() != false) goto L9;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
                    
                        if (r4.error() != false) goto L9;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
                    
                        r0 = com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.ShareDataUIState.AnonymousClass2.component3 + 105;
                        com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.ShareDataUIState.AnonymousClass2.ShareDataUIState = r0 % 128;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object copydefault(com.huawei.payment.mvvm.Resource<com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo> r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
                        /*
                            r3 = this;
                            r5 = 2
                            int r0 = r5 % r5
                            int r0 = com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.ShareDataUIState.AnonymousClass2.component3
                            int r0 = r0 + 95
                            int r1 = r0 % 128
                            com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.ShareDataUIState.AnonymousClass2.ShareDataUIState = r1
                            int r0 = r0 % r5
                            r1 = 0
                            if (r0 != 0) goto L1d
                            com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity r0 = r1
                            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
                            com.huawei.payment.mvvm.Utils.showOrHideLoading(r0, r4, r1)
                            boolean r0 = r4.error()
                            if (r0 == 0) goto L6d
                            goto L2a
                        L1d:
                            com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity r0 = r1
                            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
                            com.huawei.payment.mvvm.Utils.showOrHideLoading(r0, r4, r1)
                            boolean r0 = r4.error()
                            if (r0 == 0) goto L6d
                        L2a:
                            int r0 = com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.ShareDataUIState.AnonymousClass2.component3
                            int r0 = r0 + 105
                            int r1 = r0 % 128
                            com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.ShareDataUIState.AnonymousClass2.ShareDataUIState = r1
                            int r0 = r0 % r5
                            if (r0 == 0) goto L58
                            java.lang.Class<com.huawei.digitalpayment.consumer.baselib.service.ICommonService> r5 = com.huawei.digitalpayment.consumer.baselib.service.ICommonService.class
                            java.lang.Object r5 = com.huawei.arouter.RouteUtils.getService(r5)
                            com.huawei.digitalpayment.consumer.baselib.service.ICommonService r5 = (com.huawei.digitalpayment.consumer.baselib.service.ICommonService) r5
                            com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity r0 = r1
                            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
                            com.huawei.common.exception.BaseException r1 = r4.getException()
                            boolean r5 = r5.dealError(r0, r1)
                            if (r5 == 0) goto L4e
                            kotlin.Unit r4 = kotlin.Unit.INSTANCE
                            return r4
                        L4e:
                            java.lang.String r4 = r4.getMessage()
                            com.huawei.common.widget.toast.CommonToast.showText(r4)
                            kotlin.Unit r4 = kotlin.Unit.INSTANCE
                            return r4
                        L58:
                            java.lang.Class<com.huawei.digitalpayment.consumer.baselib.service.ICommonService> r5 = com.huawei.digitalpayment.consumer.baselib.service.ICommonService.class
                            java.lang.Object r5 = com.huawei.arouter.RouteUtils.getService(r5)
                            com.huawei.digitalpayment.consumer.baselib.service.ICommonService r5 = (com.huawei.digitalpayment.consumer.baselib.service.ICommonService) r5
                            com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity r0 = r1
                            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
                            com.huawei.common.exception.BaseException r4 = r4.getException()
                            r5.dealError(r0, r4)
                            r4 = 0
                            throw r4
                        L6d:
                            boolean r0 = r4.success()
                            r0 = r0 ^ 1
                            if (r0 == 0) goto L76
                            goto Lbb
                        L76:
                            java.lang.Object r4 = r4.getData()
                            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
                            com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo r4 = (com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo) r4
                            java.lang.String r0 = r4.getExecute()
                            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                            if (r0 == 0) goto Lb2
                            int r1 = com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.ShareDataUIState.AnonymousClass2.ShareDataUIState
                            int r1 = r1 + 101
                            int r2 = r1 % 128
                            com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.ShareDataUIState.AnonymousClass2.component3 = r2
                            int r1 = r1 % r5
                            int r0 = r0.length()
                            if (r0 != 0) goto La4
                            int r0 = com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.ShareDataUIState.AnonymousClass2.component3
                            int r0 = r0 + 17
                            int r1 = r0 % 128
                            com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.ShareDataUIState.AnonymousClass2.ShareDataUIState = r1
                            int r0 = r0 % r5
                            if (r0 != 0) goto Lb2
                            r0 = 4
                            int r0 = r0 % r5
                            goto Lb2
                        La4:
                            com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity r5 = r1
                            android.app.Activity r5 = (android.app.Activity) r5
                            java.lang.String r4 = r4.getExecute()
                            com.huawei.arouter.RouteUtils.routeWithExecute(r5, r4)
                            kotlin.Unit r4 = kotlin.Unit.INSTANCE
                            return r4
                        Lb2:
                            com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity r5 = r1
                            java.lang.String r5 = com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.access$getNewPin(r5)
                            com.huawei.digitalpayment.consumer.login.util.LoginUtils.guideOpenBiometricLogin(r5, r4)
                        Lbb:
                            kotlin.Unit r4 = kotlin.Unit.INSTANCE
                            return r4
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.ShareDataUIState.AnonymousClass2.copydefault(com.huawei.payment.mvvm.Resource, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }, this) == coroutine_suspended) {
                    int i3 = component3;
                    int i4 = i3 + 101;
                    component1 = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = i3 + 27;
                    component1 = i6 % 128;
                    int i7 = i6 % 2;
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = component1 + 115;
                component3 = i8 % 128;
                int i9 = i8 % 2;
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        ShareDataUIState(Continuation<? super ShareDataUIState> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            ShareDataUIState shareDataUIState = SecurityVerificationActivity.this.new ShareDataUIState(continuation);
            int i2 = component1 + 25;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 10 / 0;
            }
            return shareDataUIState;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 37;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent3 = component3(coroutineScope, continuation);
            int i4 = component3 + 123;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return objComponent3;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 69;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((ShareDataUIState) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component3 + 61;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }
    }

    private static void g(int i, char[] cArr, byte b2, Object[] objArr) throws Throwable {
        int i2;
        char c2;
        Object obj;
        int length;
        char[] cArr2;
        int i3;
        int i4 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr3 = component1;
        long j = 0;
        Object obj2 = null;
        if (cArr3 != null) {
            int i5 = $11 + 99;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 7421, 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (64291 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr2[i3] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i3++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(component2)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        char c3 = '\b';
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7422 - (ViewConfiguration.getWindowTouchSlop() >> 8), 15 - Color.green(0), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i6 = $10;
            int i7 = i6 + 83;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
            int i9 = i6 + 7;
            $11 = i9 % 128;
            int i10 = i9 % 2;
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            cancelall.component2 = 0;
            while (cancelall.component2 < i2) {
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
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
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 7117;
                        int mirror = '>' - AndroidCharacter.getMirror('0');
                        char cArgb = (char) (Color.argb(0, 0, 0, 0) + 44463);
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
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iKeyCodeFromString, mirror, cArgb, 1150140696, false, "x", clsArr);
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
                            int i11 = 2945 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            int packedPositionType = 24 - ExpandableListView.getPackedPositionType(0L);
                            char c4 = (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 27636);
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            String str$$r = $$r(b3, b4, b4);
                            c2 = '\b';
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i11, packedPositionType, c4, 794909189, false, str$$r, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c2 = c3;
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                        int i12 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr3[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr3[i12];
                    } else {
                        c2 = c3;
                        obj = null;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            int i13 = $10 + 15;
                            $11 = i13 % 128;
                            int i14 = i13 % 2;
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i15 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i16 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr3[i15];
                            cArr4[cancelall.component2 + 1] = cArr3[i16];
                        } else {
                            int i17 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i18 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr3[i17];
                            cArr4[cancelall.component2 + 1] = cArr3[i18];
                        }
                    }
                }
                cancelall.component2 += 2;
                obj2 = obj;
                c3 = c2;
            }
        }
        int i19 = 0;
        while (i19 < i) {
            int i20 = $10 + 75;
            $11 = i20 % 128;
            if (i20 % 2 == 0) {
                cArr4[i19] = (char) (cArr4[i19] ^ 18287);
                i19 += 112;
            } else {
                cArr4[i19] = (char) (cArr4[i19] ^ 13722);
                i19++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/register/ui/activity/SecurityVerificationActivity$Companion;", "", "<init>", "()V", "FORMAT_DATE_SHOW", "", "QA", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0098  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.onCreate(android.os.Bundle):void");
    }

    private static final void onItemSelected$lambda$2(SecurityVerificationActivity securityVerificationActivity, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(securityVerificationActivity, "");
        securityVerificationActivity.showDatePickerDialog();
        int i4 = ShareDataUIState + 73;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 83 / 0;
        }
    }

    private final void onItemSelected(LocalQuestionItem item) {
        String inputType;
        int i = 2 % 2;
        ((ActivitySecurityVerificationBinding) this.binding).inputQuestion.getEditText().setText(item != null ? item.getName() : null);
        this.selectedCalendar = null;
        ((ActivitySecurityVerificationBinding) this.binding).inputAnswer.getEditText().setText((CharSequence) null);
        CommonInputView commonInputView = ((ActivitySecurityVerificationBinding) this.binding).inputAnswer;
        if (item != null) {
            int i2 = copydefault + 53;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                item.getInputType();
                throw null;
            }
            inputType = item.getInputType();
        } else {
            inputType = null;
        }
        commonInputView.setInputEnable(!Intrinsics.areEqual(inputType, ResetPinVerifySecretQuestionActivity.INSTANCE.getINPUT_TYPE_DATE()));
        if (Intrinsics.areEqual(item != null ? item.getInputType() : null, ResetPinVerifySecretQuestionActivity.INSTANCE.getINPUT_TYPE_DATE())) {
            ((ActivitySecurityVerificationBinding) this.binding).inputAnswer.setOnInputViewParentClickListener(new View.OnClickListener() {
                private static int component2 = 0;
                private static int component3 = 1;

                @Override
                public final void onClick(View view) {
                    int i3 = 2 % 2;
                    int i4 = component2 + 83;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                    SecurityVerificationActivity.m10926$r8$lambda$nelgG1d_b2nlSwlNvZAWn4tWus(this.f$0, view);
                    int i6 = component3 + 1;
                    component2 = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 23 / 0;
                    }
                }
            });
        } else {
            ((ActivitySecurityVerificationBinding) this.binding).inputAnswer.setOnInputViewParentClickListener(null);
            int i3 = copydefault + 119;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
        }
        checkAnswer();
    }

    private static final void showDatePickerDialog$lambda$3(SecurityVerificationActivity securityVerificationActivity, View view) {
        Calendar selectedCalendar;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(securityVerificationActivity, "");
        BaseDatePickerDialog baseDatePickerDialog = securityVerificationActivity.datePickerDialog;
        if (baseDatePickerDialog != null) {
            baseDatePickerDialog.dismiss();
        }
        BaseDatePickerDialog baseDatePickerDialog2 = securityVerificationActivity.datePickerDialog;
        if (baseDatePickerDialog2 != null) {
            selectedCalendar = baseDatePickerDialog2.getSelectedCalendar();
        } else {
            int i4 = ShareDataUIState + 33;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            selectedCalendar = null;
        }
        securityVerificationActivity.selectedCalendar = selectedCalendar;
        EditText editText = ((ActivitySecurityVerificationBinding) securityVerificationActivity.binding).inputAnswer.getEditText();
        Calendar calendar = securityVerificationActivity.selectedCalendar;
        editText.setText(TimeUtils.formatTime(calendar != null ? calendar.getTime() : null, "dd/MM/yyyy"));
        int i6 = copydefault + 71;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    private final void showDatePickerDialog() {
        int i = 2 % 2;
        BaseDatePickerDialog baseDatePickerDialog = new BaseDatePickerDialog(getString(R.string.base_dateTime), null, null, this.selectedCalendar);
        this.datePickerDialog = baseDatePickerDialog;
        baseDatePickerDialog.setOnConfirmClickListener(new View.OnClickListener() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = copydefault + 79;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                SecurityVerificationActivity.$r8$lambda$koWNxzGPRkuKdecm_C5ndlhIEy8(this.f$0, view);
                if (i4 != 0) {
                    throw null;
                }
            }
        });
        BaseDatePickerDialog baseDatePickerDialog2 = this.datePickerDialog;
        if (baseDatePickerDialog2 != null) {
            int i2 = copydefault + 69;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            baseDatePickerDialog2.show(getSupportFragmentManager(), "DatePicker");
            int i4 = copydefault + 13;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final void showQuestionDialog$lambda$5(SecurityVerificationActivity securityVerificationActivity, LocalQuestionItem localQuestionItem) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(securityVerificationActivity, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(securityVerificationActivity, "");
        if (localQuestionItem != null) {
            int i3 = ShareDataUIState;
            int i4 = i3 + 39;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            SingleSelectDialog<LocalQuestionItem> singleSelectDialog = securityVerificationActivity.questionDialog;
            if (singleSelectDialog != null) {
                int i6 = i3 + 109;
                copydefault = i6 % 128;
                if (i6 % 2 != 0) {
                    singleSelectDialog.dismiss();
                    throw null;
                }
                singleSelectDialog.dismiss();
            }
            ((SecurityVerificationViewModel) securityVerificationActivity.viewModel).selectQuestion(localQuestionItem);
        }
    }

    private final void showQuestionDialog() {
        int i = 2 % 2;
        SingleSelectDialog<LocalQuestionItem> singleSelectDialog = new SingleSelectDialog<>(getString(R.string.login_secret_question), getString(R.string.login_selected), this.questionList, new SingleSelectDialog.OnItemSelectedListener() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public final void onItemSelected(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 51;
                component2 = i3 % 128;
                Object obj2 = null;
                if (i3 % 2 == 0) {
                    SecurityVerificationActivity.$r8$lambda$K4YRLGDo5MQm5ryIyNdrEvcxv3k(this.f$0, (LocalQuestionItem) obj);
                    obj2.hashCode();
                    throw null;
                }
                SecurityVerificationActivity.$r8$lambda$K4YRLGDo5MQm5ryIyNdrEvcxv3k(this.f$0, (LocalQuestionItem) obj);
                int i4 = component1 + 119;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                obj2.hashCode();
                throw null;
            }
        }, ((SecurityVerificationViewModel) this.viewModel).uiState().getValue().getSelectedQuestion());
        this.questionDialog = singleSelectDialog;
        singleSelectDialog.show(getSupportFragmentManager(), "QuestionDialog");
        int i2 = ShareDataUIState + 69;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private final void observeData() {
        int i = 2 % 2;
        SecurityVerificationActivity securityVerificationActivity = this;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(securityVerificationActivity), null, null, new copydefault(null), 3, null);
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(securityVerificationActivity), null, null, new component2(null), 3, null);
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(securityVerificationActivity), null, null, new ShareDataUIState(null), 3, null);
        ((SecurityVerificationViewModel) this.viewModel).getRegisterData().observe(securityVerificationActivity, new component3(new Function1() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component2 + 1;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Unit unit$r8$lambda$BHPdni_VKwd6Y2kNG9fcNsE_Ruo = SecurityVerificationActivity.$r8$lambda$BHPdni_VKwd6Y2kNG9fcNsE_Ruo(this.f$0, (Resource) obj);
                int i5 = component2 + 51;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    return unit$r8$lambda$BHPdni_VKwd6Y2kNG9fcNsE_Ruo;
                }
                throw null;
            }
        }));
        int i2 = ShareDataUIState + 115;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit observeData$lambda$6(SecurityVerificationActivity securityVerificationActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(securityVerificationActivity, "");
        Intrinsics.checkNotNullParameter(resource, "");
        SecurityVerificationActivity securityVerificationActivity2 = securityVerificationActivity;
        Utils.showOrHideLoading((FragmentActivity) securityVerificationActivity2, resource, false);
        if (resource.error()) {
            if (!((ICommonService) RouteUtils.getService(ICommonService.class)).dealError(securityVerificationActivity2, resource.getException())) {
                CommonToast.showText(resource.getMessage());
                return Unit.INSTANCE;
            }
            int i4 = copydefault + 109;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return Unit.INSTANCE;
        }
        if (resource.success()) {
            LocalLoginInfo localLoginInfo = (LocalLoginInfo) resource.getData();
            if (securityVerificationActivity.asyncRegisterTag) {
                int i6 = copydefault + 123;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                securityVerificationActivity.toRegisterResult(localLoginInfo.getAsyncRegisterDesc());
                securityVerificationActivity.finish();
                return Unit.INSTANCE;
            }
            String execute = localLoginInfo.getExecute();
            if (execute != null && execute.length() != 0) {
                RouteUtils.routeWithExecute(securityVerificationActivity, localLoginInfo.getExecute());
                return Unit.INSTANCE;
            }
            LoginUtils.guideOpenBiometricLogin(securityVerificationActivity.getNewPin(), localLoginInfo);
        }
        return Unit.INSTANCE;
    }

    private final void checkAnswer() {
        boolean zMatches;
        String pattern;
        String pattern2;
        int i = 2 % 2;
        Object obj = null;
        ((ActivitySecurityVerificationBinding) this.binding).inputAnswer.showError(null);
        String text = ((ActivitySecurityVerificationBinding) this.binding).inputAnswer.getText();
        String str = text;
        if (str.length() > 0) {
            int i2 = ShareDataUIState + 41;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            zMatches = true;
        } else {
            int i4 = copydefault + 57;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            zMatches = false;
        }
        if (this.validatorItem != null) {
            ValidatorCheckResult validatorCheckResultCheckValidator = ValidatorManager.INSTANCE.checkValidator(this.validatorItem, text);
            boolean zComponent1 = validatorCheckResultCheckValidator.component1();
            String strComponent2 = validatorCheckResultCheckValidator.component2();
            if (str.length() > 0 && !zComponent1) {
                CommonInputView commonInputView = ((ActivitySecurityVerificationBinding) this.binding).inputAnswer;
                String str2 = strComponent2;
                if (str2 == null || str2.length() == 0) {
                    strComponent2 = getString(R.string.login_answer_input_error);
                }
                commonInputView.showError(strComponent2);
            }
        } else {
            LocalQuestionItem selectedQuestion = ((SecurityVerificationViewModel) this.viewModel).uiState().getValue().getSelectedQuestion();
            if (selectedQuestion != null) {
                int i6 = copydefault + 117;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 == 0) {
                    pattern = selectedQuestion.getPattern();
                    int i7 = 5 / 0;
                } else {
                    pattern = selectedQuestion.getPattern();
                }
            } else {
                pattern = null;
            }
            String str3 = pattern;
            if (str3 != null && str3.length() != 0) {
                LocalQuestionItem selectedQuestion2 = ((SecurityVerificationViewModel) this.viewModel).uiState().getValue().getSelectedQuestion();
                if (selectedQuestion2 != null) {
                    int i8 = ShareDataUIState + 89;
                    copydefault = i8 % 128;
                    int i9 = i8 % 2;
                    pattern2 = selectedQuestion2.getPattern();
                } else {
                    pattern2 = null;
                }
                Intrinsics.checkNotNull(pattern2);
                zMatches = new Regex(pattern2).matches(str);
                if (str.length() > 0) {
                    int i10 = copydefault + 75;
                    int i11 = i10 % 128;
                    ShareDataUIState = i11;
                    int i12 = i10 % 2;
                    if (!zMatches) {
                        int i13 = i11 + 49;
                        copydefault = i13 % 128;
                        if (i13 % 2 != 0) {
                            ((ActivitySecurityVerificationBinding) this.binding).inputAnswer.showError(getString(R.string.login_answer_input_error));
                            obj.hashCode();
                            throw null;
                        }
                        ((ActivitySecurityVerificationBinding) this.binding).inputAnswer.showError(getString(R.string.login_answer_input_error));
                        int i14 = copydefault + 67;
                        ShareDataUIState = i14 % 128;
                        int i15 = i14 % 2;
                    }
                }
            }
        }
        ((ActivitySecurityVerificationBinding) this.binding).btnContinue.setEnabled(zMatches);
    }

    private final void updateUi() {
        LocalValidatorItem localValidatorItem;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            localValidatorItem = this.validatorItem;
            int i3 = 57 / 0;
            if (localValidatorItem == null) {
                return;
            }
        } else {
            localValidatorItem = this.validatorItem;
            if (localValidatorItem == null) {
                return;
            }
        }
        if (localValidatorItem.getInputHint().length() > 0) {
            ((ActivitySecurityVerificationBinding) this.binding).inputAnswer.getEditText().setHint(localValidatorItem.getInputHint());
        }
        ((ActivitySecurityVerificationBinding) this.binding).inputAnswer.getEditText().setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(localValidatorItem.getMaxLength())});
        int i4 = copydefault + 41;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
    }

    private final void initData() {
        int i = 2 % 2;
        SecurityVerificationViewModel securityVerificationViewModel = (SecurityVerificationViewModel) this.viewModel;
        String string = SPUtils.getInstance().getString("recent_login_phone_number");
        Intrinsics.checkNotNullExpressionValue(string, "");
        securityVerificationViewModel.queryQuestions(new QuerySecurityQuestionParams(string));
        ValidatorManager.INSTANCE.refreshValidatorConfig("Qa", new ApiCallback<Boolean>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public void onSuccess(Boolean bool) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 23;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(bool);
                int i5 = component1 + 1;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onSuccess2(Boolean value) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 123;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    SecurityVerificationActivity.access$setValidatorItem$p(SecurityVerificationActivity.this, ValidatorManager.INSTANCE.getValidatorItem(ImtConstants.KEY_ANSWER, "Qa"));
                    SecurityVerificationActivity.access$updateUi(SecurityVerificationActivity.this);
                } else {
                    SecurityVerificationActivity.access$setValidatorItem$p(SecurityVerificationActivity.this, ValidatorManager.INSTANCE.getValidatorItem(ImtConstants.KEY_ANSWER, "Qa"));
                    SecurityVerificationActivity.access$updateUi(SecurityVerificationActivity.this);
                    throw null;
                }
            }
        });
        int i2 = ShareDataUIState + 5;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void toRegister(List<QAItem> qaList) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (this.registerParams != null) {
            HashMap map = new HashMap();
            map.put("initiatorPin", EncryptUtils.encryptWithPinKey(getNewPin()));
            map.put("pinVersion", AppConfigManager.getAppConfig().getPinKeyVersion());
            map.put("qaList", qaList);
            RegisterParams registerParams = this.registerParams;
            Object obj = null;
            if (registerParams != null) {
                int i4 = copydefault + 51;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    registerParams.setExtension(map);
                    obj.hashCode();
                    throw null;
                }
                registerParams.setExtension(map);
            }
            if (!this.asyncRegisterTag) {
                RegisterParams registerParams2 = this.registerParams;
                if (registerParams2 != null) {
                    ((SecurityVerificationViewModel) this.viewModel).registerWithKyc(registerParams2);
                    return;
                }
                return;
            }
            int i5 = ShareDataUIState + 21;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            RegisterParams registerParams3 = this.registerParams;
            if (registerParams3 != null) {
                ((SecurityVerificationViewModel) this.viewModel).asyncRegisterWithKyc(registerParams3);
            }
        }
    }

    private static final void initView$lambda$9(SecurityVerificationActivity securityVerificationActivity, View view) {
        String code;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(securityVerificationActivity, "");
        LocalQuestionItem selectedQuestion = ((SecurityVerificationViewModel) securityVerificationActivity.viewModel).uiState().getValue().getSelectedQuestion();
        if (selectedQuestion == null || (code = selectedQuestion.getCode()) == null) {
            return;
        }
        String text = ((ActivitySecurityVerificationBinding) securityVerificationActivity.binding).inputAnswer.getText();
        if (TextUtils.isEmpty(securityVerificationActivity.getOldPin())) {
            securityVerificationActivity.toRegister(CollectionsKt.listOf(new QAItem(code, text)));
            int i4 = copydefault + 3;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        SecurityVerificationViewModel securityVerificationViewModel = (SecurityVerificationViewModel) securityVerificationActivity.viewModel;
        String strEncryptWithPinKey = EncryptUtils.encryptWithPinKey(securityVerificationActivity.getOldPin());
        Intrinsics.checkNotNullExpressionValue(strEncryptWithPinKey, "");
        String strEncryptWithPinKey2 = EncryptUtils.encryptWithPinKey(securityVerificationActivity.getNewPin());
        Intrinsics.checkNotNullExpressionValue(strEncryptWithPinKey2, "");
        securityVerificationViewModel.activeConsumer(new ActiveConsumerParams(strEncryptWithPinKey, strEncryptWithPinKey2, CollectionsKt.listOf(new QAItem(code, text))));
    }

    private static final void initView$lambda$10(SecurityVerificationActivity securityVerificationActivity, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(securityVerificationActivity, "");
            securityVerificationActivity.showQuestionDialog();
        } else {
            Intrinsics.checkNotNullParameter(securityVerificationActivity, "");
            securityVerificationActivity.showQuestionDialog();
            throw null;
        }
    }

    private final void initView() {
        int i = 2 % 2;
        ViewUtils.softInputAdjustResize(getWindow(), ((ActivitySecurityVerificationBinding) this.binding).getRoot());
        FastClickUtils.setOnClickListener(((ActivitySecurityVerificationBinding) this.binding).btnContinue, new View.OnClickListener() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 121;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                SecurityVerificationActivity.m10925$r8$lambda$hWxgNz4B5BMQj1jss2WBw7fR4(this.f$0, view);
                int i5 = ShareDataUIState + 11;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        FastClickUtils.setOnClickListener(((ActivitySecurityVerificationBinding) this.binding).inputQuestion, new View.OnClickListener() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 125;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                SecurityVerificationActivity.$r8$lambda$KgrauVEFh2C_1LesSYEz6jPvhtM(this.f$0, view);
                int i5 = component1 + 125;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        ((ActivitySecurityVerificationBinding) this.binding).inputAnswer.getEditText().addTextChangedListener(new MPTextWatcher() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public void afterTextChanged(Editable s) {
                int i2 = 2 % 2;
                int i3 = component1 + 63;
                copydefault = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    SecurityVerificationActivity.access$checkAnswer(SecurityVerificationActivity.this);
                    obj.hashCode();
                    throw null;
                }
                SecurityVerificationActivity.access$checkAnswer(SecurityVerificationActivity.this);
                int i4 = component1 + 43;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i2 = ShareDataUIState + 69;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 38 / 0;
        }
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        super.initToolbar("");
        if (i3 != 0) {
            throw null;
        }
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_security_verification;
        if (i3 != 0) {
            return i4;
        }
        throw null;
    }

    private final void toRegisterResult(String des) {
        int i = 2 % 2;
        Bundle bundle = new Bundle(2);
        bundle.putString(KeysConstants.KEY_EXECUTE, RoutePathConstants.LOGIN);
        bundle.putString(KeysConstants.PAGE_TITLE, getString(R.string.onboarding_register_result_success));
        bundle.putString(KeysConstants.PAGE_DESCRIPTION, des);
        bundle.putBoolean(KeysConstants.KEY_IS_TO_EXECUTE, true);
        bundle.putString(KeysConstants.PAGE_BUTTON, getString(R.string.base_ok));
        RouteUtils.routeWithExecute(RoutePathConstants.SIMPLE_RESULT, bundle);
        int i2 = ShareDataUIState + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b0  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.onPause():void");
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r42) {
        /*
            Method dump skipped, instruction units count: 14704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SecurityVerificationActivity.attachBaseContext(android.content.Context):void");
    }

    public static Unit $r8$lambda$BHPdni_VKwd6Y2kNG9fcNsE_Ruo(SecurityVerificationActivity securityVerificationActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Unit unitObserveData$lambda$6 = observeData$lambda$6(securityVerificationActivity, resource);
        int i4 = ShareDataUIState + 17;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return unitObserveData$lambda$6;
    }

    public static void $r8$lambda$K4YRLGDo5MQm5ryIyNdrEvcxv3k(SecurityVerificationActivity securityVerificationActivity, LocalQuestionItem localQuestionItem) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        showQuestionDialog$lambda$5(securityVerificationActivity, localQuestionItem);
        int i4 = copydefault + 109;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
    }

    public static void $r8$lambda$KgrauVEFh2C_1LesSYEz6jPvhtM(SecurityVerificationActivity securityVerificationActivity, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        m10930instrumented$1$initView$V(securityVerificationActivity, view);
        int i4 = ShareDataUIState + 33;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static String $r8$lambda$ZH9N2EcJylBUw_Is62NSXxgrMjs(SecurityVerificationActivity securityVerificationActivity) {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String strNewPin_delegate$lambda$1 = newPin_delegate$lambda$1(securityVerificationActivity);
        int i4 = copydefault + 79;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
        return strNewPin_delegate$lambda$1;
    }

    public static String $r8$lambda$fJqafAnEsHgVbvSSoMxxXW_q4S8(SecurityVerificationActivity securityVerificationActivity) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String strOldPin_delegate$lambda$0 = oldPin_delegate$lambda$0(securityVerificationActivity);
        int i4 = ShareDataUIState + 71;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return strOldPin_delegate$lambda$0;
    }

    public static void m10925$r8$lambda$hWxgNz4B5BMQj1jss2WBw7fR4(SecurityVerificationActivity securityVerificationActivity, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        m10927instrumented$0$initView$V(securityVerificationActivity, view);
        if (i3 == 0) {
            throw null;
        }
    }

    public static void $r8$lambda$koWNxzGPRkuKdecm_C5ndlhIEy8(SecurityVerificationActivity securityVerificationActivity, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        m10929instrumented$0$showDatePickerDialog$V(securityVerificationActivity, view);
        int i4 = ShareDataUIState + 31;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void m10926$r8$lambda$nelgG1d_b2nlSwlNvZAWn4tWus(SecurityVerificationActivity securityVerificationActivity, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        m10928x61c6d7f1(securityVerificationActivity, view);
        int i4 = ShareDataUIState + 61;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static {
        getRequestBeneficiariesState = 0;
        component1();
        INSTANCE = new Companion(null);
        $stable = 8;
        int i = component4 + 57;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 != 0) {
            int i2 = 85 / 0;
        }
    }

    private static void m10927instrumented$0$initView$V(SecurityVerificationActivity securityVerificationActivity, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            initView$lambda$9(securityVerificationActivity, view);
            Callback.onClick_exit();
            int i4 = ShareDataUIState + 25;
            copydefault = i4 % 128;
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

    private static void m10928x61c6d7f1(SecurityVerificationActivity securityVerificationActivity, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                onItemSelected$lambda$2(securityVerificationActivity, view);
            } else {
                onItemSelected$lambda$2(securityVerificationActivity, view);
                Callback.onClick_exit();
                throw null;
            }
        } finally {
            Callback.onClick_exit();
        }
    }

    private static void m10929instrumented$0$showDatePickerDialog$V(SecurityVerificationActivity securityVerificationActivity, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            showDatePickerDialog$lambda$3(securityVerificationActivity, view);
            Callback.onClick_exit();
            int i4 = ShareDataUIState + 27;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m10930instrumented$1$initView$V(SecurityVerificationActivity securityVerificationActivity, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            initView$lambda$10(securityVerificationActivity, view);
            Callback.onClick_exit();
            int i4 = ShareDataUIState + 59;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 62 / 0;
        }
        int i5 = copydefault + 61;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    static void component1() {
        component3 = 6438858498009153650L;
        component1 = new char[]{2023, 1966, 2041, 1970, 1972, 1051, 1042, 1052, 2019, 2036, 2034, 1053, 2035, 1976, 1049, 1048, 1968, 2004, 1040, 1054, 2032, 2022, 1055, 2020, 2030, 1050, 1992, 2024, 2028, 1975, 2017, 1987, 2031, 2025, 1973, 2018, 2021, 1974, 1985, 1043, 1977, 2026, 1971, 2002, 1041, 2029, 2003, 1969, 2038};
        component2 = (char) 12829;
    }
}
