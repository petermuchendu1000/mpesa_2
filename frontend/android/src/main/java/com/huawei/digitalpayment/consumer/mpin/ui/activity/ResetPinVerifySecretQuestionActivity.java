package com.huawei.digitalpayment.consumer.mpin.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.safe.SafeUri;
import com.huawei.common.util.FastClickUtils;
import com.huawei.common.util.TimeUtils;
import com.huawei.common.util.ViewUtils;
import com.huawei.common.util.color.ColorUtils;
import com.huawei.common.widget.MPTextWatcher;
import com.huawei.common.widget.dialog.DialogManager;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.toast.CommonToast;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.dialog.BaseDatePickerDialog;
import com.huawei.digitalpayment.consumer.baselib.dialog.SingleSelectDialog;
import com.huawei.digitalpayment.consumer.constants.Keys;
import com.huawei.digitalpayment.consumer.login.R;
import com.huawei.digitalpayment.consumer.login.databinding.ActivityResetPinVerifySecretQuestionBinding;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifySecurityQuestionResp;
import com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.VerifySecretUiState;
import com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.VerifySecurityQuestionViewModel;
import com.huawei.digitalpayment.consumer.loginModule.register.data.LocalQuestionItem;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.ImtConstants;
import com.huawei.digitalpayment.form.validator.ValidatorManager;
import com.huawei.digitalpayment.form.validator.response.LocalValidatorItem;
import com.huawei.digitalpayment.form.validator.response.ValidatorCheckResult;
import com.huawei.http.BaseRequestParams;
import com.huawei.payment.mvvm.Resource;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.cancelNotification;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlin.text.Regex;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001&B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0002J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0002J\b\u0010\u001b\u001a\u00020\u0012H\u0002J\u0012\u0010\u001c\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\u001e\u001a\u00020\u0012H\u0002J\b\u0010\u001f\u001a\u00020\u0012H\u0002J\b\u0010 \u001a\u00020\u0012H\u0002J\u0012\u0010!\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\b\u0010$\u001a\u00020%H\u0014R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/huawei/digitalpayment/consumer/mpin/ui/activity/ResetPinVerifySecretQuestionActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcPaymentBaseActivity;", "Lcom/huawei/digitalpayment/consumer/login/databinding/ActivityResetPinVerifySecretQuestionBinding;", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/viewmodel/VerifySecurityQuestionViewModel;", "<init>", "()V", "questionList", "", "Lcom/huawei/digitalpayment/consumer/loginModule/register/data/LocalQuestionItem;", "questionDialog", "Lcom/huawei/digitalpayment/consumer/baselib/dialog/SingleSelectDialog;", "datePickerDialog", "Lcom/huawei/digitalpayment/consumer/baselib/dialog/BaseDatePickerDialog;", "selectedCalendar", "Ljava/util/Calendar;", "validatorItem", "Lcom/huawei/digitalpayment/form/validator/response/LocalValidatorItem;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initView", "initData", "updateUi", "observeData", "verify", "onVerifyResult", "observeVerify", "onItemSelected", "item", "checkAnswer", "showDatePickerDialog", "showQuestionDialog", "initToolbar", "title", "", "getLayoutId", "", "Companion", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class ResetPinVerifySecretQuestionActivity extends Hilt_ResetPinVerifySecretQuestionActivity<ActivityResetPinVerifySecretQuestionBinding, VerifySecurityQuestionViewModel> {
    public static final int $stable;

    public static final Companion INSTANCE;
    private static final String INPUT_TYPE_DATE;
    private static char[] ShareDataUIState;
    private static char[] component1;
    private static char[] component2;
    private static int component4;
    private static long copydefault;
    private BaseDatePickerDialog datePickerDialog;
    private SingleSelectDialog<LocalQuestionItem> questionDialog;
    private List<LocalQuestionItem> questionList;
    private Calendar selectedCalendar;
    private LocalValidatorItem validatorItem;
    private static final byte[] $$l = {113, 46, 90, -12};
    private static final int $$o = 115;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {89, 120, -98, -110, Ascii.FS, Ascii.SO, 19, Ascii.SI, Ascii.SI, 7, Ascii.EM, Ascii.SYN, -50, Ascii.FS, Ascii.SO, 19, Ascii.SI, Ascii.SI, 7, Ascii.EM, Ascii.SYN, -49, 37, 9, 33, 3, -17, 45, 35, -3, 4, 4, Ascii.SUB, TarHeader.LF_LINK, -3, 35, 1};
    private static final int $$k = 233;
    private static final byte[] $$d = {Ascii.GS, -59, -25, -119, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 31;
    private static int copy = 1;
    private static int component3 = 0;
    private static int getAsAtTimestamp = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(short r6, byte r7, int r8) {
        /*
            int r8 = 122 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity.$$l
            int r7 = r7 * 3
            int r1 = r7 + 1
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2a
        L13:
            r3 = r2
        L14:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity.$$r(short, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = 103 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity.$$d
            int r7 = r7 + 4
            int r1 = r8 + 4
            byte[] r1 = new byte[r1]
            int r8 = r8 + 3
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2a:
            int r7 = r7 + r6
            int r6 = r3 + 1
            int r7 = r7 + (-8)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity.h(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(byte r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 9
            int r7 = r7 + 4
            int r8 = r8 * 16
            int r8 = 99 - r8
            int r9 = r9 * 6
            int r9 = r9 + 10
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity.$$j
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r5 = r2
            r8 = r7
            goto L2f
        L17:
            r3 = r2
        L18:
            r6 = r8
            r8 = r7
            r7 = r6
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r6
        L2f:
            int r7 = r7 + 1
            int r8 = r8 + r3
            int r8 = r8 + (-16)
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity.j(byte, byte, byte, java.lang.Object[]):void");
    }

    public static final void access$checkAnswer(ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity) {
        int i = 2 % 2;
        int i2 = component3 + 23;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        resetPinVerifySecretQuestionActivity.checkAnswer();
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        int i5 = component3 + 41;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final AppCompatActivity access$getActivity$p(ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity) {
        int i = 2 % 2;
        int i2 = component3 + 73;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        AppCompatActivity appCompatActivity = resetPinVerifySecretQuestionActivity.activity;
        if (i3 == 0) {
            int i4 = 56 / 0;
        }
        int i5 = component3 + 97;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return appCompatActivity;
    }

    public static final String access$getINPUT_TYPE_DATE$cp() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 33;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        String str = INPUT_TYPE_DATE;
        int i5 = i2 + 3;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final List access$getQuestionList$p(ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 49;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        List<LocalQuestionItem> list = resetPinVerifySecretQuestionActivity.questionList;
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
        return list;
    }

    public static final ViewModel access$getViewModel$p(ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity) {
        int i = 2 % 2;
        int i2 = component3 + 23;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        VM vm = resetPinVerifySecretQuestionActivity.viewModel;
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
        int i5 = component3 + 101;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 36 / 0;
        }
        return vm;
    }

    public static final void access$initData(ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        resetPinVerifySecretQuestionActivity.initData();
        int i4 = component3 + 39;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void access$onItemSelected(ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity, LocalQuestionItem localQuestionItem) {
        int i = 2 % 2;
        int i2 = component3 + 65;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        resetPinVerifySecretQuestionActivity.onItemSelected(localQuestionItem);
        int i4 = getAsAtTimestamp + 95;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$onVerifyResult(ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 91;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        resetPinVerifySecretQuestionActivity.onVerifyResult();
        if (i3 != 0) {
            throw null;
        }
        int i4 = component3 + 5;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void access$setQuestionList$p(ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity, List list) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 121;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        resetPinVerifySecretQuestionActivity.questionList = list;
        if (i4 != 0) {
            int i5 = 57 / 0;
        }
        int i6 = i2 + 33;
        component3 = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final void access$setValidatorItem$p(ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity, LocalValidatorItem localValidatorItem) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 109;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        resetPinVerifySecretQuestionActivity.validatorItem = localValidatorItem;
        int i5 = i3 + 89;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void access$updateUi(ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 5;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        resetPinVerifySecretQuestionActivity.updateUi();
        if (i3 != 0) {
            throw null;
        }
    }

    private static void f(char c2, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i4 = $11 + 125;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(component1[i + i6])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1758 - View.resolveSize(0, 0), 35 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((-1) - TextUtils.lastIndexOf("", '0')), 1159210934, false, $$r(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(copydefault), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3608 - (ViewConfiguration.getDoubleTapTimeout() >> 16), KeyEvent.normalizeMetaState(0) + 29, (char) (7171 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 1951385784, false, $$r(b4, b5, (byte) (b5 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4013 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 23, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 27761), -1529629956, false, $$r(b6, b7, b7), new Class[]{Object.class, Object.class});
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
            int i7 = $10 + 63;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr5 = {cancelnotification, cancelnotification};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault4 == null) {
                byte b8 = (byte) (-1);
                byte b9 = (byte) (b8 + 1);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(4014 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), Color.rgb(0, 0, 0) + 16777240, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 27761), -1529629956, false, $$r(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
            int i9 = $10 + 73;
            $11 = i9 % 128;
            int i10 = i9 % 2;
        }
        objArr[0] = new String(cArr);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$1", f = "ResetPinVerifySecretQuestionActivity.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 1;
        private static int component2;
        int ShareDataUIState;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass5<T> implements FlowCollector {
            private static int component1 = 1;
            private static int component2;
            final ResetPinVerifySecretQuestionActivity ShareDataUIState;

            @Override
            public Object emit(Object obj, Continuation continuation) {
                int i = 2 % 2;
                int i2 = component2 + 39;
                component1 = i2 % 128;
                Resource<List<LocalQuestionItem>> resource = (Resource) obj;
                if (i2 % 2 != 0) {
                    return ShareDataUIState(resource, (Continuation<? super Unit>) continuation);
                }
                ShareDataUIState(resource, (Continuation<? super Unit>) continuation);
                throw null;
            }

            private static final void component1(ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity, View view) {
                int i = 2 % 2;
                int i2 = component1 + 7;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(resetPinVerifySecretQuestionActivity, "");
                ResetPinVerifySecretQuestionActivity.access$initData(resetPinVerifySecretQuestionActivity);
                int i4 = component2 + 119;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
            
                return kotlin.Unit.INSTANCE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
            
                com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity.access$setQuestionList$p(r2.ShareDataUIState, r3.getData());
                r3 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity.access$getQuestionList$p(r2.ShareDataUIState);
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
            
                if (r3 == null) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
            
                r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity.copydefault.AnonymousClass5.component2 + 33;
                com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity.copydefault.AnonymousClass5.component1 = r0 % 128;
                r0 = r0 % 2;
                r3 = (com.huawei.digitalpayment.consumer.loginModule.register.data.LocalQuestionItem) kotlin.collections.CollectionsKt.firstOrNull(r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
            
                if (r3 == null) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
            
                r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity.copydefault.AnonymousClass5.component2 + 29;
                com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity.copydefault.AnonymousClass5.component1 = r0 % 128;
                r0 = r0 % 2;
                ((com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.VerifySecurityQuestionViewModel) com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity.access$getViewModel$p(r2.ShareDataUIState)).selectQuestion(r3);
                r3 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity.copydefault.AnonymousClass5.component2 + 25;
                com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity.copydefault.AnonymousClass5.component1 = r3 % 128;
                r3 = r3 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
            
                return kotlin.Unit.INSTANCE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
            
                if (r3.error() != false) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
            
                if (r3.error() != false) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
            
                r3 = r2.ShareDataUIState;
                com.huawei.digitalpayment.consumer.baselib.util.LoadUtils.showError(r3, new com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$1$2$$ExternalSyntheticLambda0(r3));
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object ShareDataUIState(com.huawei.payment.mvvm.Resource<java.util.List<com.huawei.digitalpayment.consumer.loginModule.register.data.LocalQuestionItem>> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                /*
                    r2 = this;
                    r4 = 2
                    int r0 = r4 % r4
                    int r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity.copydefault.AnonymousClass5.component2
                    int r0 = r0 + 101
                    int r1 = r0 % 128
                    com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity.copydefault.AnonymousClass5.component1 = r1
                    int r0 = r0 % r4
                    r1 = 0
                    if (r0 != 0) goto L1d
                    com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity r0 = r2.ShareDataUIState
                    androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
                    com.huawei.payment.mvvm.Utils.showOrHideLoading(r0, r3, r1)
                    boolean r0 = r3.error()
                    if (r0 == 0) goto L3a
                    goto L2a
                L1d:
                    com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity r0 = r2.ShareDataUIState
                    androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
                    com.huawei.payment.mvvm.Utils.showOrHideLoading(r0, r3, r1)
                    boolean r0 = r3.error()
                    if (r0 == 0) goto L3a
                L2a:
                    com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity r3 = r2.ShareDataUIState
                    r4 = r3
                    android.app.Activity r4 = (android.app.Activity) r4
                    com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$1$2$$ExternalSyntheticLambda0 r0 = new com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$1$2$$ExternalSyntheticLambda0
                    r0.<init>()
                    com.huawei.digitalpayment.consumer.baselib.util.LoadUtils.showError(r4, r0)
                    kotlin.Unit r3 = kotlin.Unit.INSTANCE
                    return r3
                L3a:
                    com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity r0 = r2.ShareDataUIState
                    java.lang.Object r3 = r3.getData()
                    java.util.List r3 = (java.util.List) r3
                    com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity.access$setQuestionList$p(r0, r3)
                    com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity r3 = r2.ShareDataUIState
                    java.util.List r3 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity.access$getQuestionList$p(r3)
                    if (r3 == 0) goto L7b
                    int r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity.copydefault.AnonymousClass5.component2
                    int r0 = r0 + 33
                    int r1 = r0 % 128
                    com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity.copydefault.AnonymousClass5.component1 = r1
                    int r0 = r0 % r4
                    java.lang.Object r3 = kotlin.collections.CollectionsKt.firstOrNull(r3)
                    com.huawei.digitalpayment.consumer.loginModule.register.data.LocalQuestionItem r3 = (com.huawei.digitalpayment.consumer.loginModule.register.data.LocalQuestionItem) r3
                    if (r3 == 0) goto L7b
                    int r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity.copydefault.AnonymousClass5.component2
                    int r0 = r0 + 29
                    int r1 = r0 % 128
                    com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity.copydefault.AnonymousClass5.component1 = r1
                    int r0 = r0 % r4
                    com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity r0 = r2.ShareDataUIState
                    androidx.lifecycle.ViewModel r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity.access$getViewModel$p(r0)
                    com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.VerifySecurityQuestionViewModel r0 = (com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.VerifySecurityQuestionViewModel) r0
                    r0.selectQuestion(r3)
                    int r3 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity.copydefault.AnonymousClass5.component2
                    int r3 = r3 + 25
                    int r0 = r3 % 128
                    com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity.copydefault.AnonymousClass5.component1 = r0
                    int r3 = r3 % r4
                L7b:
                    kotlin.Unit r3 = kotlin.Unit.INSTANCE
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity.copydefault.AnonymousClass5.ShareDataUIState(com.huawei.payment.mvvm.Resource, kotlin.coroutines.Continuation):java.lang.Object");
            }

            public static void ShareDataUIState(ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity, View view) {
                int i = 2 % 2;
                int i2 = component2 + 23;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                copydefault(resetPinVerifySecretQuestionActivity, view);
                int i4 = component2 + 77;
                component1 = i4 % 128;
                int i5 = i4 % 2;
            }

            AnonymousClass5(ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity) {
                this.ShareDataUIState = resetPinVerifySecretQuestionActivity;
            }

            private static void copydefault(ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity, View view) {
                int i = 2 % 2;
                int i2 = component1 + 19;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Callback.onClick_enter(view);
                try {
                    component1(resetPinVerifySecretQuestionActivity, view);
                    Callback.onClick_exit();
                    int i4 = component1 + 67;
                    component2 = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 79 / 0;
                    }
                } catch (Throwable th) {
                    Callback.onClick_exit();
                    throw th;
                }
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 115;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.ShareDataUIState;
            if (i4 != 0) {
                int i5 = component2 + 27;
                component1 = i5 % 128;
                if (i5 % 2 != 0 ? i4 != 1 : i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                final StateFlow<VerifySecretUiState> stateFlowUiState = ((VerifySecurityQuestionViewModel) ResetPinVerifySecretQuestionActivity.access$getViewModel$p(ResetPinVerifySecretQuestionActivity.this)).uiState();
                this.ShareDataUIState = 1;
                if (FlowKt.distinctUntilChanged(new Flow<Resource<List<? extends LocalQuestionItem>>>() {
                    private static int ShareDataUIState = 1;
                    private static int component1;

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        private static int component2 = 1;
                        private static int copydefault;
                        final FlowCollector ShareDataUIState;

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$1$invokeSuspend$$inlined$map$1$2", f = "ResetPinVerifySecretQuestionActivity.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            private static int component3 = 0;
                            private static int copydefault = 1;
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
                                int i2 = copydefault + 81;
                                component3 = i2 % 128;
                                int i3 = i2 % 2;
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                if (i3 != 0) {
                                    objEmit = anonymousClass2.emit(null, this);
                                    int i4 = 6 / 0;
                                } else {
                                    objEmit = anonymousClass2.emit(null, this);
                                }
                                int i5 = component3 + 89;
                                copydefault = i5 % 128;
                                int i6 = i5 % 2;
                                return objEmit;
                            }
                        }

                        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
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
                                boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r1 == 0) goto L28
                                r1 = r7
                                com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$1$invokeSuspend$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                                int r2 = r1.label
                                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                                r2 = r2 & r3
                                if (r2 == 0) goto L28
                                int r7 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault
                                int r7 = r7 + 43
                                int r2 = r7 % 128
                                com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2 = r2
                                int r7 = r7 % r0
                                if (r7 != 0) goto L22
                                int r7 = r1.label
                                int r7 = r7 << r3
                                r1.label = r7
                                goto L2d
                            L22:
                                int r7 = r1.label
                                int r7 = r7 + r3
                                r1.label = r7
                                goto L2d
                            L28:
                                com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$1$invokeSuspend$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$1$invokeSuspend$$inlined$map$1$2$1
                                r1.<init>(r7)
                            L2d:
                                java.lang.Object r7 = r1.result
                                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r3 = r1.label
                                r4 = 1
                                if (r3 == 0) goto L4f
                                int r6 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2
                                int r6 = r6 + 79
                                int r1 = r6 % 128
                                com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault = r1
                                int r6 = r6 % r0
                                if (r3 != r4) goto L47
                                kotlin.ResultKt.throwOnFailure(r7)
                                goto L66
                            L47:
                                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                r6.<init>(r7)
                                throw r6
                            L4f:
                                kotlin.ResultKt.throwOnFailure(r7)
                                kotlinx.coroutines.flow.FlowCollector r7 = r5.ShareDataUIState
                                r3 = r1
                                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                                com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.VerifySecretUiState r6 = (com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.VerifySecretUiState) r6
                                com.huawei.payment.mvvm.Resource r6 = r6.getQuestions()
                                r1.label = r4
                                java.lang.Object r6 = r7.emit(r6, r1)
                                if (r6 != r2) goto L66
                                return r2
                            L66:
                                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                int r7 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault
                                int r7 = r7 + 7
                                int r1 = r7 % 128
                                com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2 = r1
                                int r7 = r7 % r0
                                return r6
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.ShareDataUIState = flowCollector;
                        }
                    }

                    @Override
                    public Object collect(FlowCollector<? super Resource<List<? extends LocalQuestionItem>>> flowCollector, Continuation continuation) {
                        int i6 = 2 % 2;
                        Object objCollect = stateFlowUiState.collect(new AnonymousClass2(flowCollector), continuation);
                        if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            return Unit.INSTANCE;
                        }
                        int i7 = component1;
                        int i8 = i7 + 101;
                        ShareDataUIState = i8 % 128;
                        int i9 = i8 % 2;
                        int i10 = i7 + 21;
                        ShareDataUIState = i10 % 128;
                        if (i10 % 2 != 0) {
                            return objCollect;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }).collect(new AnonymousClass5(ResetPinVerifySecretQuestionActivity.this), this) == coroutine_suspended) {
                    int i6 = component2 + 107;
                    component1 = i6 % 128;
                    if (i6 % 2 != 0) {
                        return coroutine_suspended;
                    }
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
            copydefault copydefaultVar = ResetPinVerifySecretQuestionActivity.this.new copydefault(continuation);
            int i2 = component1 + 121;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return copydefaultVar;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 91;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent3 = component3(coroutineScope, continuation);
            int i4 = component2 + 111;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return objComponent3;
        }

        public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 63;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            copydefault copydefaultVar = (copydefault) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return copydefaultVar.invokeSuspend(unit);
            }
            copydefaultVar.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$2", f = "ResetPinVerifySecretQuestionActivity.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
    static final class ShareDataUIState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component2 = 1;
        private static int copydefault;
        int component1;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component1;
            if (i2 != 0) {
                int i3 = copydefault + 43;
                component2 = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                final StateFlow<VerifySecretUiState> stateFlowUiState = ((VerifySecurityQuestionViewModel) ResetPinVerifySecretQuestionActivity.access$getViewModel$p(ResetPinVerifySecretQuestionActivity.this)).uiState();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<LocalQuestionItem>() {
                    private static int ShareDataUIState = 1;
                    private static int component3;

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        private static int component2 = 0;
                        private static int copydefault = 1;
                        final FlowCollector component1;

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$2$invokeSuspend$$inlined$map$1$2", f = "ResetPinVerifySecretQuestionActivity.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
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
                                int i2 = component3 + 21;
                                component2 = i2 % 128;
                                int i3 = i2 % 2;
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                if (i3 != 0) {
                                    return anonymousClass2.emit(null, this);
                                }
                                int i4 = 91 / 0;
                                return anonymousClass2.emit(null, this);
                            }
                        }

                        /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
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
                                boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r1 == 0) goto L2b
                                int r1 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault
                                int r1 = r1 + 47
                                int r2 = r1 % 128
                                com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.component2 = r2
                                int r1 = r1 % r0
                                if (r1 != 0) goto L22
                                r1 = r7
                                com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$2$invokeSuspend$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                                int r2 = r1.label
                                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                                r2 = r2 & r3
                                if (r2 == 0) goto L2b
                                int r7 = r1.label
                                int r7 = r7 + r3
                                r1.label = r7
                                goto L39
                            L22:
                                com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$2$invokeSuspend$$inlined$map$1$2$1 r7 = (com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r7
                                int r6 = r7.label
                                r6 = 0
                                r6.hashCode()
                                throw r6
                            L2b:
                                com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$2$invokeSuspend$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$2$invokeSuspend$$inlined$map$1$2$1
                                r1.<init>(r7)
                                int r7 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.component2
                                int r7 = r7 + 119
                                int r2 = r7 % 128
                                com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault = r2
                                int r7 = r7 % r0
                            L39:
                                java.lang.Object r7 = r1.result
                                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r3 = r1.label
                                r4 = 1
                                if (r3 == 0) goto L60
                                int r6 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.component2
                                int r6 = r6 + 113
                                int r1 = r6 % 128
                                com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault = r1
                                int r6 = r6 % r0
                                if (r6 != 0) goto L52
                                if (r3 != 0) goto L58
                                goto L54
                            L52:
                                if (r3 != r4) goto L58
                            L54:
                                kotlin.ResultKt.throwOnFailure(r7)
                                goto L80
                            L58:
                                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                r6.<init>(r7)
                                throw r6
                            L60:
                                kotlin.ResultKt.throwOnFailure(r7)
                                kotlinx.coroutines.flow.FlowCollector r7 = r5.component1
                                r3 = r1
                                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                                com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.VerifySecretUiState r6 = (com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.VerifySecretUiState) r6
                                com.huawei.digitalpayment.consumer.loginModule.register.data.LocalQuestionItem r6 = r6.getSelectedQuestion()
                                r1.label = r4
                                java.lang.Object r6 = r7.emit(r6, r1)
                                if (r6 != r2) goto L80
                                int r6 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault
                                int r6 = r6 + 3
                                int r7 = r6 % 128
                                com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.component2 = r7
                                int r6 = r6 % r0
                                return r2
                            L80:
                                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                int r7 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault
                                int r7 = r7 + 85
                                int r1 = r7 % 128
                                com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.component2 = r1
                                int r7 = r7 % r0
                                if (r7 == 0) goto L8f
                                int r0 = r0 / 0
                            L8f:
                                return r6
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeData$2$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.component1 = flowCollector;
                        }
                    }

                    @Override
                    public Object collect(FlowCollector<? super LocalQuestionItem> flowCollector, Continuation continuation) {
                        int i4 = 2 % 2;
                        Object objCollect = stateFlowUiState.collect(new AnonymousClass2(flowCollector), continuation);
                        if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            int i5 = ShareDataUIState + 105;
                            component3 = i5 % 128;
                            int i6 = i5 % 2;
                            return objCollect;
                        }
                        Unit unit = Unit.INSTANCE;
                        int i7 = ShareDataUIState + 121;
                        component3 = i7 % 128;
                        int i8 = i7 % 2;
                        return unit;
                    }
                });
                final ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity = ResetPinVerifySecretQuestionActivity.this;
                this.component1 = 1;
                if (flowDistinctUntilChanged.collect(new FlowCollector() {
                    private static int ShareDataUIState = 0;
                    private static int component2 = 1;

                    @Override
                    public Object emit(Object obj2, Continuation continuation) {
                        int i4 = 2 % 2;
                        int i5 = component2 + 17;
                        ShareDataUIState = i5 % 128;
                        int i6 = i5 % 2;
                        Object objCopydefault = copydefault((LocalQuestionItem) obj2, continuation);
                        if (i6 != 0) {
                            int i7 = 4 / 0;
                        }
                        int i8 = component2 + 103;
                        ShareDataUIState = i8 % 128;
                        int i9 = i8 % 2;
                        return objCopydefault;
                    }

                    public final Object copydefault(LocalQuestionItem localQuestionItem, Continuation<? super Unit> continuation) {
                        int i4 = 2 % 2;
                        int i5 = ShareDataUIState + 39;
                        component2 = i5 % 128;
                        if (i5 % 2 != 0) {
                            ResetPinVerifySecretQuestionActivity.access$onItemSelected(resetPinVerifySecretQuestionActivity, localQuestionItem);
                            Unit unit = Unit.INSTANCE;
                            int i6 = ShareDataUIState + 85;
                            component2 = i6 % 128;
                            if (i6 % 2 == 0) {
                                int i7 = 28 / 0;
                            }
                            return unit;
                        }
                        ResetPinVerifySecretQuestionActivity.access$onItemSelected(resetPinVerifySecretQuestionActivity, localQuestionItem);
                        Unit unit2 = Unit.INSTANCE;
                        throw null;
                    }
                }, this) == coroutine_suspended) {
                    int i4 = copydefault + 103;
                    int i5 = i4 % 128;
                    component2 = i5;
                    if (i4 % 2 == 0) {
                        int i6 = 90 / 0;
                    }
                    int i7 = i5 + 91;
                    copydefault = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 82 / 0;
                    }
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        ShareDataUIState(Continuation<? super ShareDataUIState> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            ShareDataUIState shareDataUIState = ResetPinVerifySecretQuestionActivity.this.new ShareDataUIState(continuation);
            int i2 = copydefault + 7;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return shareDataUIState;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 101;
            copydefault = i2 % 128;
            Object obj = null;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                component2(coroutineScope2, continuation2);
                obj.hashCode();
                throw null;
            }
            Object objComponent2 = component2(coroutineScope2, continuation2);
            int i3 = copydefault + 23;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                return objComponent2;
            }
            throw null;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 27;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            ShareDataUIState shareDataUIState = (ShareDataUIState) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return shareDataUIState.invokeSuspend(unit);
            }
            shareDataUIState.invokeSuspend(unit);
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeVerify$1", f = "ResetPinVerifySecretQuestionActivity.kt", i = {}, l = {WSContextConstant.HANDSHAKE_SEND_SIZE}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 1;
        private static int component2;
        int ShareDataUIState;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.ShareDataUIState;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<VerifySecretUiState> stateFlowUiState = ((VerifySecurityQuestionViewModel) ResetPinVerifySecretQuestionActivity.access$getViewModel$p(ResetPinVerifySecretQuestionActivity.this)).uiState();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Resource<VerifySecurityQuestionResp>>() {
                    private static int ShareDataUIState = 1;
                    private static int component3;

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        private static int component2 = 1;
                        private static int component3;
                        final FlowCollector ShareDataUIState;

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeVerify$1$invokeSuspend$$inlined$map$1$2", f = "ResetPinVerifySecretQuestionActivity.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            private static int component1 = 0;
                            private static int component3 = 1;
                            Object L$0;
                            int label;
                            Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override
                            public final Object invokeSuspend(Object obj) {
                                int i = 2 % 2;
                                int i2 = component1 + 117;
                                component3 = i2 % 128;
                                int i3 = i2 % 2;
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                AnonymousClass1 anonymousClass1 = this;
                                if (i3 != 0) {
                                    return anonymousClass2.emit(null, anonymousClass1);
                                }
                                anonymousClass2.emit(null, anonymousClass1);
                                throw null;
                            }
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
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
                                int r1 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeVerify$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2
                                int r1 = r1 + 81
                                int r2 = r1 % 128
                                com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeVerify$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3 = r2
                                int r1 = r1 % r0
                                boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeVerify$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r1 == 0) goto L20
                                r1 = r7
                                com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeVerify$1$invokeSuspend$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeVerify$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                                int r2 = r1.label
                                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                                r2 = r2 & r3
                                if (r2 == 0) goto L20
                                int r7 = r1.label
                                int r7 = r7 + r3
                                r1.label = r7
                                goto L25
                            L20:
                                com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeVerify$1$invokeSuspend$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeVerify$1$invokeSuspend$$inlined$map$1$2$1
                                r1.<init>(r7)
                            L25:
                                java.lang.Object r7 = r1.result
                                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r3 = r1.label
                                r4 = 1
                                if (r3 == 0) goto L4e
                                if (r3 != r4) goto L46
                                int r6 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeVerify$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3
                                int r6 = r6 + 7
                                int r1 = r6 % 128
                                com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeVerify$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2 = r1
                                int r6 = r6 % r0
                                if (r6 == 0) goto L41
                                kotlin.ResultKt.throwOnFailure(r7)
                                goto L6e
                            L41:
                                kotlin.ResultKt.throwOnFailure(r7)
                                r6 = 0
                                throw r6
                            L46:
                                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                r6.<init>(r7)
                                throw r6
                            L4e:
                                kotlin.ResultKt.throwOnFailure(r7)
                                kotlinx.coroutines.flow.FlowCollector r7 = r5.ShareDataUIState
                                r3 = r1
                                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                                com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.VerifySecretUiState r6 = (com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.VerifySecretUiState) r6
                                com.huawei.payment.mvvm.Resource r6 = r6.getVerify()
                                r1.label = r4
                                java.lang.Object r6 = r7.emit(r6, r1)
                                if (r6 != r2) goto L6e
                                int r6 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeVerify$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2
                                int r6 = r6 + 107
                                int r7 = r6 % 128
                                com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeVerify$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3 = r7
                                int r6 = r6 % r0
                                return r2
                            L6e:
                                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                return r6
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity$observeVerify$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.ShareDataUIState = flowCollector;
                        }
                    }

                    @Override
                    public Object collect(FlowCollector<? super Resource<VerifySecurityQuestionResp>> flowCollector, Continuation continuation) {
                        int i3 = 2 % 2;
                        Object objCollect = stateFlowUiState.collect(new AnonymousClass2(flowCollector), continuation);
                        if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            return Unit.INSTANCE;
                        }
                        int i4 = component3 + 13;
                        int i5 = i4 % 128;
                        ShareDataUIState = i5;
                        if (i4 % 2 == 0) {
                            int i6 = 14 / 0;
                        }
                        int i7 = i5 + 35;
                        component3 = i7 % 128;
                        int i8 = i7 % 2;
                        return objCollect;
                    }
                });
                final ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity = ResetPinVerifySecretQuestionActivity.this;
                this.ShareDataUIState = 1;
                if (flowDistinctUntilChanged.collect(new FlowCollector() {
                    private static int component2 = 0;
                    private static int component3 = 1;

                    @Override
                    public Object emit(Object obj2, Continuation continuation) {
                        int i3 = 2 % 2;
                        int i4 = component2 + 55;
                        component3 = i4 % 128;
                        int i5 = i4 % 2;
                        Object objShareDataUIState = ShareDataUIState((Resource) obj2, continuation);
                        int i6 = component2 + 29;
                        component3 = i6 % 128;
                        int i7 = i6 % 2;
                        return objShareDataUIState;
                    }

                    public final Object ShareDataUIState(Resource<VerifySecurityQuestionResp> resource, Continuation<? super Unit> continuation) {
                        int i3 = 2 % 2;
                        if (!resource.loading()) {
                            DialogManager.hideLoading(ResetPinVerifySecretQuestionActivity.access$getActivity$p(resetPinVerifySecretQuestionActivity));
                        } else {
                            int i4 = component2 + 53;
                            component3 = i4 % 128;
                            int i5 = i4 % 2;
                            DialogManager.showLoading(ResetPinVerifySecretQuestionActivity.access$getActivity$p(resetPinVerifySecretQuestionActivity));
                        }
                        if (!resource.error()) {
                            if (resource.success()) {
                                ResetPinVerifySecretQuestionActivity.access$onVerifyResult(resetPinVerifySecretQuestionActivity);
                            }
                            return Unit.INSTANCE;
                        }
                        int i6 = component2 + 113;
                        component3 = i6 % 128;
                        if (i6 % 2 != 0) {
                            CommonToast.showText(resource.getMessage());
                            return Unit.INSTANCE;
                        }
                        CommonToast.showText(resource.getMessage());
                        Unit unit = Unit.INSTANCE;
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }, this) == coroutine_suspended) {
                    int i3 = component2 + 31;
                    component1 = i3 % 128;
                    if (i3 % 2 != 0) {
                        return coroutine_suspended;
                    }
                    throw null;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i4 = component2 + 53;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        component3(Continuation<? super component3> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component3 component3Var = ResetPinVerifySecretQuestionActivity.this.new component3(continuation);
            int i2 = component2 + 111;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return component3Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 23;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent3 = component3(coroutineScope, continuation);
            int i4 = component1 + 119;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return objComponent3;
        }

        public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 65;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            component3 component3Var = (component3) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                component3Var.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = component3Var.invokeSuspend(unit);
            int i4 = component1 + 15;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }
    }

    private static void g(byte[] bArr, boolean z, int[] iArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = component2;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 67;
                $11 = i9 % 128;
                int i10 = i9 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(656 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 14, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i8++;
                    i2 = 2;
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
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i11 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr3 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) (-1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4502 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 36, (char) (27898 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), -1464227204, false, $$r(b2, (byte) (b2 + 1), (byte) (-$$l[3])), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = iTrustedWebActivityService_Parcel.copydefault;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                        if (objCopydefault3 == null) {
                            byte b3 = (byte) (-1);
                            byte b4 = (byte) (b3 + 1);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3580 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 28, (char) (ViewConfiguration.getTapTimeout() >> 16), 1180380354, false, $$r(b3, b4, (byte) (b4 | 7)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b5 = (byte) (-1);
                    byte b6 = (byte) (b5 + 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 1860, 34 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 80302927, false, $$r(b5, b6, (byte) (b6 | 8)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i13 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i13, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i13);
        }
        if (z) {
            int i14 = $10 + 119;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr6 = new char[i5];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i5 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i16 = $10 + 23;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                int i18 = $10 + 17;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] % iArr[5]);
                    i = iTrustedWebActivityService_Parcel.copydefault;
                } else {
                    cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                    i = iTrustedWebActivityService_Parcel.copydefault + 1;
                }
                iTrustedWebActivityService_Parcel.copydefault = i;
            }
        }
        String str = new String(cArr3);
        int i19 = $10 + 69;
        $11 = i19 % 128;
        int i20 = i19 % 2;
        objArr[0] = str;
    }

    private static void i(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = ShareDataUIState;
        if (cArr != null) {
            int i7 = $11 + 29;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 89;
                $11 = i10 % 128;
                if (i10 % i == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 657, 14 - View.MeasureSpec.getSize(0), (char) (Color.red(0) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                        }
                        cArr2[i9] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i9])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionType(0L) + 657, TextUtils.indexOf("", "", 0, 0) + 14, (char) (View.MeasureSpec.getMode(0) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i9++;
                }
                i = 2;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i11 = $10 + 71;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    int i13 = iTrustedWebActivityService_Parcel.copydefault;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                        if (objCopydefault3 == null) {
                            byte b2 = (byte) (-1);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4502 - View.combineMeasuredStates(0, 0), 37 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((Process.myTid() >> 22) + 27897), -1464227204, false, $$r(b2, (byte) (b2 + 1), (byte) (-$$l[3])), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i14 = iTrustedWebActivityService_Parcel.copydefault;
                    try {
                        Object[] objArr5 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                        if (objCopydefault4 == null) {
                            byte b3 = (byte) (-1);
                            byte b4 = (byte) (b3 + 1);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetAfter("", 0) + 3580, 27 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 1180380354, false, $$r(b3, b4, (byte) (b4 | 7)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr6 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault5 == null) {
                    byte b5 = (byte) (-1);
                    byte b6 = (byte) (b5 + 1);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((KeyEvent.getMaxKeyCode() >> 16) + 1859, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 34, (char) (ViewConfiguration.getLongPressTimeout() >> 16), 80302927, false, $$r(b5, b6, (byte) (b6 | 8)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i15 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i15, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i15);
        }
        if (z) {
            int i16 = $11 + 99;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            char[] cArr6 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i18 = $11 + 15;
                $10 = i18 % 128;
                if (i18 % 2 != 0) {
                    cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[i4 << iTrustedWebActivityService_Parcel.copydefault];
                } else {
                    cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i4 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                }
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/mpin/ui/activity/ResetPinVerifySecretQuestionActivity$Companion;", "", "<init>", "()V", "INPUT_TYPE_DATE", "", "getINPUT_TYPE_DATE", "()Ljava/lang/String;", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        private Companion() {
        }

        public final String getINPUT_TYPE_DATE() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 19;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                ResetPinVerifySecretQuestionActivity.access$getINPUT_TYPE_DATE$cp();
                throw null;
            }
            String strAccess$getINPUT_TYPE_DATE$cp = ResetPinVerifySecretQuestionActivity.access$getINPUT_TYPE_DATE$cp();
            int i3 = component3 + 75;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 / 0;
            }
            return strAccess$getINPUT_TYPE_DATE$cp;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x012e  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity.onCreate(android.os.Bundle):void");
    }

    private static final void initView$lambda$0(ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 3;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resetPinVerifySecretQuestionActivity, "");
        resetPinVerifySecretQuestionActivity.verify();
        int i4 = getAsAtTimestamp + 33;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final void initView$lambda$1(ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity, View view) {
        int i = 2 % 2;
        int i2 = component3 + 97;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resetPinVerifySecretQuestionActivity, "");
        resetPinVerifySecretQuestionActivity.showQuestionDialog();
        int i4 = getAsAtTimestamp + 27;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void initView() {
        int i = 2 % 2;
        ViewUtils.softInputAdjustResize(getWindow(), ((ActivityResetPinVerifySecretQuestionBinding) this.binding).getRoot());
        ((ActivityResetPinVerifySecretQuestionBinding) this.binding).resetPinVerifyTipParent.setBackgroundColor(ColorUtils.INSTANCE.withAlpha(0.2f, com.blankj.utilcode.util.ColorUtils.getColor(R.color.colorWarningDisable)));
        FastClickUtils.setOnClickListener(((ActivityResetPinVerifySecretQuestionBinding) this.binding).btnNext, new View.OnClickListener() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 47;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    ResetPinVerifySecretQuestionActivity.$r8$lambda$rANPs6DQWKFuPTYan9rnbxajGRU(this.f$0, view);
                    throw null;
                }
                ResetPinVerifySecretQuestionActivity.$r8$lambda$rANPs6DQWKFuPTYan9rnbxajGRU(this.f$0, view);
                int i4 = component3 + 39;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 88 / 0;
                }
            }
        });
        FastClickUtils.setOnClickListener(((ActivityResetPinVerifySecretQuestionBinding) this.binding).inputQuestion, new ResetPinVerifySecretQuestionActivity$$ExternalSyntheticLambda3(this));
        ((ActivityResetPinVerifySecretQuestionBinding) this.binding).inputAnswer.getEditText().addTextChangedListener(new MPTextWatcher() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public void afterTextChanged(Editable s) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 119;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                ResetPinVerifySecretQuestionActivity.access$checkAnswer(ResetPinVerifySecretQuestionActivity.this);
                int i5 = ShareDataUIState + 119;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        final String iVRNumber = AppConfigManager.getAppConfig().getIVRNumber();
        String str = iVRNumber;
        if (str != null) {
            int i2 = getAsAtTimestamp + 47;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 11 / 0;
                if (str.length() == 0) {
                    return;
                }
            } else if (str.length() == 0) {
                return;
            }
            ((ActivityResetPinVerifySecretQuestionBinding) this.binding).groupCall.setVisibility(0);
            FastClickUtils.setOnClickListener(((ActivityResetPinVerifySecretQuestionBinding) this.binding).tvCallTitle, new View.OnClickListener() {
                private static int component1 = 1;
                private static int component3;

                @Override
                public final void onClick(View view) {
                    int i4 = 2 % 2;
                    int i5 = component1 + 15;
                    component3 = i5 % 128;
                    if (i5 % 2 != 0) {
                        ResetPinVerifySecretQuestionActivity.m10775$r8$lambda$zXJ050tHZVmHE9CvhaGhDnSvrM(iVRNumber, this, view);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    ResetPinVerifySecretQuestionActivity.m10775$r8$lambda$zXJ050tHZVmHE9CvhaGhDnSvrM(iVRNumber, this, view);
                    int i6 = component1 + 5;
                    component3 = i6 % 128;
                    int i7 = i6 % 2;
                }
            });
            int i4 = getAsAtTimestamp + 31;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final void initView$lambda$2(String str, ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(resetPinVerifySecretQuestionActivity, "");
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(SafeUri.parse("tel:" + str));
        resetPinVerifySecretQuestionActivity.startActivity(intent);
        int i2 = getAsAtTimestamp + 91;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void initData() {
        int i = 2 % 2;
        ((VerifySecurityQuestionViewModel) this.viewModel).queryQuestions(new BaseRequestParams());
        ValidatorManager.INSTANCE.refreshValidatorConfig("Qa", new ApiCallback<Boolean>() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public void onSuccess(Boolean bool) {
                int i2 = 2 % 2;
                int i3 = component2 + 97;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(bool);
                int i5 = ShareDataUIState + 87;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            public void onSuccess2(Boolean value) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 109;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    ResetPinVerifySecretQuestionActivity.access$setValidatorItem$p(ResetPinVerifySecretQuestionActivity.this, ValidatorManager.INSTANCE.getValidatorItem(ImtConstants.KEY_ANSWER, "Qa"));
                    ResetPinVerifySecretQuestionActivity.access$updateUi(ResetPinVerifySecretQuestionActivity.this);
                    throw null;
                }
                ResetPinVerifySecretQuestionActivity.access$setValidatorItem$p(ResetPinVerifySecretQuestionActivity.this, ValidatorManager.INSTANCE.getValidatorItem(ImtConstants.KEY_ANSWER, "Qa"));
                ResetPinVerifySecretQuestionActivity.access$updateUi(ResetPinVerifySecretQuestionActivity.this);
                int i4 = ShareDataUIState + 17;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i2 = getAsAtTimestamp + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void updateUi() {
        int i = 2 % 2;
        int i2 = component3 + 19;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        LocalValidatorItem localValidatorItem = this.validatorItem;
        if (localValidatorItem == null) {
            return;
        }
        if (localValidatorItem.getInputHint().length() > 0) {
            int i4 = component3 + 9;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 != 0) {
                ((ActivityResetPinVerifySecretQuestionBinding) this.binding).inputAnswer.getEditText().setHint(localValidatorItem.getInputHint());
            } else {
                ((ActivityResetPinVerifySecretQuestionBinding) this.binding).inputAnswer.getEditText().setHint(localValidatorItem.getInputHint());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        ((ActivityResetPinVerifySecretQuestionBinding) this.binding).inputAnswer.getEditText().setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(localValidatorItem.getMaxLength())});
        int i5 = component3 + 101;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void observeData() {
        int i = 2 % 2;
        ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity = this;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(resetPinVerifySecretQuestionActivity), null, null, new copydefault(null), 3, null);
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(resetPinVerifySecretQuestionActivity), null, null, new ShareDataUIState(null), 3, null);
        observeVerify();
        int i2 = getAsAtTimestamp + 115;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 27 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r2
  0x0022: PHI (r2v5 android.content.Intent) = (r2v4 android.content.Intent), (r2v22 android.content.Intent) binds: [B:8:0x0020, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void verify() {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity.verify():void");
    }

    private final void onVerifyResult() {
        Parcelable parcelableExtra;
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra(Keys.VERIFY_TYPE)) {
            Intent intent2 = getIntent();
            if (intent2 != null) {
                int i2 = getAsAtTimestamp + 79;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                parcelableExtra = intent2.getParcelableExtra(Keys.VERIFY_TYPE);
                int i4 = getAsAtTimestamp + 123;
                component3 = i4 % 128;
                int i5 = i4 % 2;
            } else {
                parcelableExtra = null;
            }
            bundle.putParcelable(Keys.VERIFY_TYPE, parcelableExtra);
        }
        RouteUtils.routeWithExecute(RoutePathConstants.RESET_PIN_TEMP_PIN, bundle);
        finish();
    }

    private final void observeVerify() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new component3(null), 3, null);
        int i2 = component3 + 43;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 91 / 0;
        }
    }

    private static final void onItemSelected$lambda$3(ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity, View view) {
        int i = 2 % 2;
        int i2 = component3 + 55;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resetPinVerifySecretQuestionActivity, "");
        resetPinVerifySecretQuestionActivity.showDatePickerDialog();
        int i4 = getAsAtTimestamp + 101;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
    }

    private final void onItemSelected(LocalQuestionItem item) {
        String name;
        String inputType;
        int i = 2 % 2;
        int i2 = component3 + 107;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        EditText editText = ((ActivityResetPinVerifySecretQuestionBinding) this.binding).inputQuestion.getEditText();
        if (item != null) {
            int i4 = getAsAtTimestamp + 37;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                item.getName();
                throw null;
            }
            name = item.getName();
            int i5 = component3 + 43;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
        } else {
            name = null;
        }
        editText.setText(name);
        this.selectedCalendar = null;
        ((ActivityResetPinVerifySecretQuestionBinding) this.binding).inputAnswer.getEditText().setText((CharSequence) null);
        CommonInputView commonInputView = ((ActivityResetPinVerifySecretQuestionBinding) this.binding).inputAnswer;
        String inputType2 = item != null ? item.getInputType() : null;
        String str = INPUT_TYPE_DATE;
        commonInputView.setInputEnable(!Intrinsics.areEqual(inputType2, str));
        if (item != null) {
            inputType = item.getInputType();
        } else {
            int i7 = component3 + 73;
            getAsAtTimestamp = i7 % 128;
            int i8 = i7 % 2;
            inputType = null;
        }
        if (Intrinsics.areEqual(inputType, str)) {
            ((ActivityResetPinVerifySecretQuestionBinding) this.binding).inputAnswer.setOnInputViewParentClickListener(new View.OnClickListener() {
                private static int component1 = 1;
                private static int component3;

                @Override
                public final void onClick(View view) {
                    int i9 = 2 % 2;
                    int i10 = component1 + 43;
                    component3 = i10 % 128;
                    int i11 = i10 % 2;
                    ResetPinVerifySecretQuestionActivity.$r8$lambda$Jdt7ju6D9dSnHEg_EkKuC2Lny7o(this.f$0, view);
                    if (i11 != 0) {
                        int i12 = 77 / 0;
                    }
                }
            });
        } else {
            ((ActivityResetPinVerifySecretQuestionBinding) this.binding).inputAnswer.setOnInputViewParentClickListener(null);
        }
        checkAnswer();
    }

    private final void checkAnswer() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 121;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String pattern = null;
        ((ActivityResetPinVerifySecretQuestionBinding) this.binding).inputAnswer.showError(null);
        String text = ((ActivityResetPinVerifySecretQuestionBinding) this.binding).inputAnswer.getText();
        String str = text;
        boolean zMatches = false;
        if (str.length() > 0) {
            int i4 = component3 + 17;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 != 0) {
                zMatches = true;
            }
        }
        if (this.validatorItem != null) {
            int i5 = component3 + 119;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            ValidatorCheckResult validatorCheckResultCheckValidator = ValidatorManager.INSTANCE.checkValidator(this.validatorItem, text);
            boolean zComponent1 = validatorCheckResultCheckValidator.component1();
            String strComponent2 = validatorCheckResultCheckValidator.component2();
            if (str.length() > 0) {
                int i7 = component3;
                int i8 = i7 + 115;
                getAsAtTimestamp = i8 % 128;
                int i9 = i8 % 2;
                if (!zComponent1) {
                    int i10 = i7 + 109;
                    getAsAtTimestamp = i10 % 128;
                    int i11 = i10 % 2;
                    CommonInputView commonInputView = ((ActivityResetPinVerifySecretQuestionBinding) this.binding).inputAnswer;
                    String str2 = strComponent2;
                    if (str2 == null || str2.length() == 0) {
                        strComponent2 = getString(R.string.login_answer_input_error);
                    }
                    commonInputView.showError(strComponent2);
                }
            }
        } else {
            LocalQuestionItem selectedQuestion = ((VerifySecurityQuestionViewModel) this.viewModel).uiState().getValue().getSelectedQuestion();
            String pattern2 = selectedQuestion != null ? selectedQuestion.getPattern() : null;
            if (pattern2 != null && pattern2.length() != 0) {
                LocalQuestionItem selectedQuestion2 = ((VerifySecurityQuestionViewModel) this.viewModel).uiState().getValue().getSelectedQuestion();
                if (selectedQuestion2 != null) {
                    pattern = selectedQuestion2.getPattern();
                    int i12 = component3 + 23;
                    getAsAtTimestamp = i12 % 128;
                    int i13 = i12 % 2;
                }
                Intrinsics.checkNotNull(pattern);
                zMatches = new Regex(pattern).matches(str);
                if (str.length() > 0 && !zMatches) {
                    ((ActivityResetPinVerifySecretQuestionBinding) this.binding).inputAnswer.showError(getString(R.string.login_answer_input_error));
                }
            }
        }
        ((ActivityResetPinVerifySecretQuestionBinding) this.binding).btnNext.setEnabled(zMatches);
    }

    private static final void showDatePickerDialog$lambda$4(ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity, View view) {
        Calendar selectedCalendar;
        int i = 2 % 2;
        int i2 = component3 + 63;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(resetPinVerifySecretQuestionActivity, "");
            BaseDatePickerDialog baseDatePickerDialog = resetPinVerifySecretQuestionActivity.datePickerDialog;
            date.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(resetPinVerifySecretQuestionActivity, "");
        BaseDatePickerDialog baseDatePickerDialog2 = resetPinVerifySecretQuestionActivity.datePickerDialog;
        if (baseDatePickerDialog2 != null) {
            baseDatePickerDialog2.dismiss();
        }
        BaseDatePickerDialog baseDatePickerDialog3 = resetPinVerifySecretQuestionActivity.datePickerDialog;
        if (baseDatePickerDialog3 != null) {
            selectedCalendar = baseDatePickerDialog3.getSelectedCalendar();
        } else {
            int i3 = getAsAtTimestamp + 71;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            selectedCalendar = null;
        }
        resetPinVerifySecretQuestionActivity.selectedCalendar = selectedCalendar;
        EditText editText = ((ActivityResetPinVerifySecretQuestionBinding) resetPinVerifySecretQuestionActivity.binding).inputAnswer.getEditText();
        Calendar calendar = resetPinVerifySecretQuestionActivity.selectedCalendar;
        editText.setText(TimeUtils.formatTime(calendar != null ? calendar.getTime() : null, "dd/MM/yyyy"));
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
                int i3 = component1 + 7;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                ResetPinVerifySecretQuestionActivity.$r8$lambda$AXESHu3K5W15yAlGo719djDBANI(this.f$0, view);
                int i5 = component1 + 1;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        BaseDatePickerDialog baseDatePickerDialog2 = this.datePickerDialog;
        if (baseDatePickerDialog2 != null) {
            int i2 = getAsAtTimestamp + 39;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                baseDatePickerDialog2.show(getSupportFragmentManager(), "DatePicker");
                throw null;
            }
            baseDatePickerDialog2.show(getSupportFragmentManager(), "DatePicker");
        }
        int i3 = getAsAtTimestamp + 85;
        component3 = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final void showQuestionDialog$lambda$6(ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity, LocalQuestionItem localQuestionItem) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(resetPinVerifySecretQuestionActivity, "");
        if (localQuestionItem != null) {
            int i2 = component3;
            int i3 = i2 + 109;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            SingleSelectDialog<LocalQuestionItem> singleSelectDialog = resetPinVerifySecretQuestionActivity.questionDialog;
            if (singleSelectDialog != null) {
                int i5 = i2 + 123;
                getAsAtTimestamp = i5 % 128;
                int i6 = i5 % 2;
                singleSelectDialog.dismiss();
            }
            ((VerifySecurityQuestionViewModel) resetPinVerifySecretQuestionActivity.viewModel).selectQuestion(localQuestionItem);
        }
    }

    private final void showQuestionDialog() {
        int i = 2 % 2;
        SingleSelectDialog<LocalQuestionItem> singleSelectDialog = new SingleSelectDialog<>(getString(R.string.login_mpin_secret_question), getString(R.string.login_selected), this.questionList, new SingleSelectDialog.OnItemSelectedListener() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public final void onItemSelected(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 93;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                ResetPinVerifySecretQuestionActivity.$r8$lambda$4tnECQNmPbrCfixu_JynQ_77lsA(this.f$0, (LocalQuestionItem) obj);
                int i5 = component1 + 73;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
        }, ((VerifySecurityQuestionViewModel) this.viewModel).uiState().getValue().getSelectedQuestion());
        this.questionDialog = singleSelectDialog;
        singleSelectDialog.show(getSupportFragmentManager(), "QuestionDialog");
        int i2 = component3 + 55;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 89;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        super.initToolbar(getString(R.string.login_mpin_security_verification));
        int i4 = component3 + 75;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = component3 + 9;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_reset_pin_verify_secret_question;
        int i5 = getAsAtTimestamp + 5;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    static {
        component4 = 0;
        component1();
        copydefault();
        INSTANCE = new Companion(null);
        $stable = 8;
        INPUT_TYPE_DATE = "date";
        int i = copy + 19;
        component4 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 59;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = getAsAtTimestamp + 35;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            f((char) (23905 - ExpandableListView.getPackedPositionGroup(0L)), View.resolveSize(0, 0) + 18, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952717_res_0x7f13044d).substring(6, 7).codePointAt(0) - 6, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(null, true, new int[]{5, 18, 156, 3}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i6 = component3 + 53;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 42 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) TextUtils.getCapsMode("", 0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 56 - Color.argb(0, 0, 0, 0), (char) Gravity.getAbsoluteGravity(0, 0), -699576857, false, "component2", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity.onPause():void");
    }

    /*  JADX ERROR: StackOverflowError in pass: FixTypesVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.visitors.typeinference.TypeCompare.compareTypes(TypeCompare.java:65)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:451)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        */
    @Override
    public void attachBaseContext(android.content.Context r43) {
        /*
            Method dump skipped, instruction units count: 13950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifySecretQuestionActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$4tnECQNmPbrCfixu_JynQ_77lsA(ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity, LocalQuestionItem localQuestionItem) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 15;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        showQuestionDialog$lambda$6(resetPinVerifySecretQuestionActivity, localQuestionItem);
        if (i3 != 0) {
            int i4 = 71 / 0;
        }
        int i5 = getAsAtTimestamp + 61;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void $r8$lambda$AXESHu3K5W15yAlGo719djDBANI(ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 115;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        m10778instrumented$0$showDatePickerDialog$V(resetPinVerifySecretQuestionActivity, view);
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
        int i5 = getAsAtTimestamp + 97;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void $r8$lambda$Jdt7ju6D9dSnHEg_EkKuC2Lny7o(ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity, View view) {
        int i = 2 % 2;
        int i2 = component3 + 53;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        m10777x61c6d7f1(resetPinVerifySecretQuestionActivity, view);
        int i4 = component3 + 53;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$TAZTEhHZsIaTEJgIhJvLj_sYWzs(ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 119;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        m10779instrumented$1$initView$V(resetPinVerifySecretQuestionActivity, view);
        int i4 = component3 + 109;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$rANPs6DQWKFuPTYan9rnbxajGRU(ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 85;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        m10776instrumented$0$initView$V(resetPinVerifySecretQuestionActivity, view);
        int i4 = getAsAtTimestamp + 79;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void m10775$r8$lambda$zXJ050tHZVmHE9CvhaGhDnSvrM(String str, ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 61;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        m10780instrumented$2$initView$V(str, resetPinVerifySecretQuestionActivity, view);
        int i4 = component3 + 99;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Finally extract failed */
    private static void m10776instrumented$0$initView$V(ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 47;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                initView$lambda$0(resetPinVerifySecretQuestionActivity, view);
                Callback.onClick_exit();
                obj.hashCode();
                throw null;
            }
            initView$lambda$0(resetPinVerifySecretQuestionActivity, view);
            Callback.onClick_exit();
            int i4 = component3 + 97;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    private static void m10777x61c6d7f1(ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity, View view) {
        int i = 2 % 2;
        int i2 = component3 + 9;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                onItemSelected$lambda$3(resetPinVerifySecretQuestionActivity, view);
                Callback.onClick_exit();
                obj.hashCode();
                throw null;
            }
            onItemSelected$lambda$3(resetPinVerifySecretQuestionActivity, view);
            Callback.onClick_exit();
            int i4 = getAsAtTimestamp + 69;
            component3 = i4 % 128;
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

    private static void m10778instrumented$0$showDatePickerDialog$V(ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 65;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                showDatePickerDialog$lambda$4(resetPinVerifySecretQuestionActivity, view);
                throw null;
            }
            showDatePickerDialog$lambda$4(resetPinVerifySecretQuestionActivity, view);
            Callback.onClick_exit();
            int i4 = getAsAtTimestamp + 85;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        } finally {
            Callback.onClick_exit();
        }
    }

    private static void m10779instrumented$1$initView$V(ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            initView$lambda$1(resetPinVerifySecretQuestionActivity, view);
            Callback.onClick_exit();
            int i4 = getAsAtTimestamp + 21;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m10780instrumented$2$initView$V(String str, ResetPinVerifySecretQuestionActivity resetPinVerifySecretQuestionActivity, View view) {
        int i = 2 % 2;
        int i2 = component3 + 1;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                initView$lambda$2(str, resetPinVerifySecretQuestionActivity, view);
            } else {
                initView$lambda$2(str, resetPinVerifySecretQuestionActivity, view);
                Callback.onClick_exit();
                throw null;
            }
        } finally {
            Callback.onClick_exit();
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 69;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void copydefault() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 105;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            ShareDataUIState = new char[]{33518, 33462, 33457, 33426, 33428, 33457, 33460, 33459, 33457, 33464, 33428, 33430, 33465, 33463, 33463, 33457, 33461, 33465, 33457, 33463, 33458, 33452, 33462, 33462, 33454, 33422, 33431, 33462, 33457, 33455, 33451, 33454, 33462, 33460, 33423, 33423, 33460, 33466, 33465, 33467, 33459, 33455, 33463, 33458, 33456, 33428, 33422, 33456, 33428, 33432, 33469, 33469, 33463, 33453, 33459, 33460, 33423, 33512, 33412, 33451, 33454, 33457, 33464, 33461, 33457, 33465, 33414, 33415, 33458, 33452, 33462, 33462, 33454, 33413, 33421, 33469, 33463, 33453, 33459, 33460, 33515, 33467, 33462, 33460, 33419, 33421, 33461, 33458, 33466, 33463, 33463, 33462, 33460, 33412, 33412, 33461, 33460, 33466, 33462, 33430, 33522, 33522, 33524, 33524, 33531, 33515, 33409, 33449, 33459, 33460, 33455, 33464, 33465, 33408, 33465, 33452, 33454, 33457, 33465, 33459, 33457, 33465, 33416, 33417, 33464, 33464, 33468, 33469, 33431, 33430, 33462, 33457, 33426, 33428, 33457, 33460, 33459, 33457, 33464, 33428, 33430, 33465, 33463, 33463, 33457, 33461, 33465, 33457, 33463, 33458, 33452, 33462, 33462, 33454, 33422, 33431, 33462, 33457, 33455, 33451, 33454, 33462, 33460, 33423, 33429, 33464, 33455, 33457, 33467, 33467, 33469, 33461, 33461, 33432, 33422, 33456, 33428, 33423, 33460, 33461, 33460, 33466, 33462, 33425, 33509, 33420, 33464, 33460, 33461, 33453, 33465, 33410, 33467, 33462, 33460, 33419, 33421, 33461, 33458, 33466, 33463, 33463, 33462, 33460, 33412, 33412, 33461, 33460, 33466, 33462, 33411, 33408, 33427, 33514, 33420, 33464, 33460, 33461, 33453, 33465};
            int i4 = 8 / 0;
        } else {
            ShareDataUIState = new char[]{33518, 33462, 33457, 33426, 33428, 33457, 33460, 33459, 33457, 33464, 33428, 33430, 33465, 33463, 33463, 33457, 33461, 33465, 33457, 33463, 33458, 33452, 33462, 33462, 33454, 33422, 33431, 33462, 33457, 33455, 33451, 33454, 33462, 33460, 33423, 33423, 33460, 33466, 33465, 33467, 33459, 33455, 33463, 33458, 33456, 33428, 33422, 33456, 33428, 33432, 33469, 33469, 33463, 33453, 33459, 33460, 33423, 33512, 33412, 33451, 33454, 33457, 33464, 33461, 33457, 33465, 33414, 33415, 33458, 33452, 33462, 33462, 33454, 33413, 33421, 33469, 33463, 33453, 33459, 33460, 33515, 33467, 33462, 33460, 33419, 33421, 33461, 33458, 33466, 33463, 33463, 33462, 33460, 33412, 33412, 33461, 33460, 33466, 33462, 33430, 33522, 33522, 33524, 33524, 33531, 33515, 33409, 33449, 33459, 33460, 33455, 33464, 33465, 33408, 33465, 33452, 33454, 33457, 33465, 33459, 33457, 33465, 33416, 33417, 33464, 33464, 33468, 33469, 33431, 33430, 33462, 33457, 33426, 33428, 33457, 33460, 33459, 33457, 33464, 33428, 33430, 33465, 33463, 33463, 33457, 33461, 33465, 33457, 33463, 33458, 33452, 33462, 33462, 33454, 33422, 33431, 33462, 33457, 33455, 33451, 33454, 33462, 33460, 33423, 33429, 33464, 33455, 33457, 33467, 33467, 33469, 33461, 33461, 33432, 33422, 33456, 33428, 33423, 33460, 33461, 33460, 33466, 33462, 33425, 33509, 33420, 33464, 33460, 33461, 33453, 33465, 33410, 33467, 33462, 33460, 33419, 33421, 33461, 33458, 33466, 33463, 33463, 33462, 33460, 33412, 33412, 33461, 33460, 33466, 33462, 33411, 33408, 33427, 33514, 33420, 33464, 33460, 33461, 33453, 33465};
        }
        int i5 = i2 + 81;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    static void component1() {
        component1 = new char[]{3095, 51241, 33904, 16535, 7389, 55530, 38196, 20751, 11665, 59836, 42418, 25149, 15944, 64100, 46779, 29388, 20245, 2884, 20854, 38216, 55569, 7670, 16828, 34187, 51285, 3182, 28926, 46302, 63629, 16162, 25370, 42761, 60365, 12193, 4721, 22079, 39441, 57037, 663, 18810, 36179, 61717, 13806, 31162, 38717, 21332, 7951, 56233, 34734, 17310, 3609, 51822, 46820, 29318, 16000, 63870, 42281, 24850, 11671, 59829, 54318, 36908, 23579, 6346, 50409, 36714, 19292, 14174, 62448, 49069, 31680, 9795, 57954, 44720, 27268, 22229, 4377, 56684, 39406, 17886, 394, 52336, 34937, 29770, 12482, 64689, 42854, 25426, 12036, 60406, 55206, 37825, 5381, 53539, 40303, 22939, 1494, 49658, 3103, 51235, 33905, 16523, 7366, 55530, 38180, 20824, 11702, 59822, 42479, 25093, 15993, 64100, 46780, 29388, 3143, 51312, 33829, 16594, 7307, 55483, 38246, 20760, 11727, 59895, 42408, 54027, 5940, 23349, 40896, 50117, 1958, 18978, 36352, 62169, 14010, 31456, 48414, 57672, 9514, 27128, 44425, 36887, 54336, 6264, 23716, 32976, 51975, 3888, 29492, 46995, 64458, 16298, 25129, 42591, 60122, 11966, 4847, 21803, 39248, 56712, 440, 17889, 34835, 52300, 12405, 29865, 47322, 58206, 10045, 27498, 44954, 37832, 55214, 6709, 24114, 33477, 50889, 2801, 19830, 45319, 62852, 14828, 32189, 40986, 58444, 10360, 27901, 20616, 39691, 16915, 34341, 51825, 3718, 21213, 38626, 56117, 8015, 25499, 42927, 60402, 3150, 51314, 33836, 16604, 7307, 55472, 38244, 20756, 11719, 59901, 20492, 37940, 55392, 7319, 16580, 34034, 51493, 3419, 29066, 46527, 63978, 33729, 18422, 2990, 53074, 37640, 22326, 6884, 56976, 41540, 26234};
        copydefault = -6180569344027342777L;
        component2 = new char[]{33525, 33408, 33465, 33463, 33452, 33745, 33742, 33312, 33749, 33748, 33754, 33743, 33314, 33312, 33754, 33751, 33747, 33747, 33282, 33743, 33749, 33758, 33745, 33478, 33428, 33428, 33517, 33519, 33517, 33428, 33468, 33429, 33427, 33428, 33517, 33513, 33512, 33427, 33468, 33428, 33518, 33515, 33426, 33430, 33428, 33428, 33518, 33514, 33426, 33468, 33428, 33515, 33512, 33512, 33427, 33430, 33515, 33426, 33469, 33468, 33467, 33429, 33429, 33468, 33426, 33511, 33514, 33428, 33426, 33514, 33516, 33429, 33428, 33430, 33470, 33427, 33512, 33424, 33424, 33512, 33515, 33513, 33511, 33514, 33513, 33512, 33512, 33476, 33425, 33467, 33468, 33427, 33514, 33516, 33515, 33516, 33429, 33425, 33424, 33428, 33430, 33427, 33515, 33514, 33515, 33514, 33425, 33468, 33470, 33430, 33519, 33519, 33514, 33425, 33426, 33515, 33429, 33429, 33514, 33515, 33516, 33511, 33512, 33513, 33425, 33425, 33425, 33429, 33519, 33430, 33427, 33516, 33428, 33427, 33516, 33428, 33428, 33515, 33426, 33427, 33514, 33512, 33512, 33515, 33516, 33514, 33427, 33467, 33468, 33428, 33517, 33515, 33457, 33451, 33453, 33454, 33417, 33515, 33520, 33517, 33514, 33513, 33512, 33514, 33427, 33426, 33515, 33516, 33516, 33515, 33517, 33516, 33514, 33426, 33469, 33431, 33422, 33457, 33458, 33460, 33468, 33461, 33460, 33469, 33461, 33452, 33422, 33429, 33457, 33460, 33462, 33460, 33460, 33453, 33452, 33460, 33462, 33460, 33430, 33431, 33462, 33457, 33425, 33431, 33463, 33459, 33427, 33427, 33460, 33461, 33465, 33459, 33452, 33422, 33421, 33419, 33519, 33429, 33458, 33458, 33462, 33454, 33452, 33329, 33733, 33332, 33331, 33329, 33734, 33334, 33731, 33335, 33328, 33331, 33734, 33329, 33326, 33331, 33327, 33730, 33331, 33730, 33329, 33338, 33733, 33335, 33331, 33734, 33338, 33329, 33330, 33330, 33331, 33338, 33335, 33327, 33335, 33335, 33338, 33526, 33439, 33429, 33461, 33464, 33465, 33426, 33432, 33460, 33460, 33466, 33460, 33462, 33459, 33452, 33449, 33374, 33751, 33749, 33747, 33742, 33746, 33752, 33333, 33328, 33741, 33326, 33342, 33752, 33736, 33739, 33746, 33749, 33318, 33319, 33745, 33749, 33751, 33420, 33401, 33393, 33388, 33397, 33399, 33397, 33400, 33396, 33394, 33391, 33389, 33399, 33402, 33346, 33516, 33424, 33425, 33429, 33430, 33469, 33470, 33427, 33426, 33428, 33427, 33468, 33428, 33515, 33517, 33429, 33426, 33514, 33426, 33425, 33428, 33469, 33468, 33427, 33516, 33515, 33513, 33426, 33468, 33429, 33427, 33427, 33514, 33425, 33425, 33513, 33513, 33512, 33514, 33513, 33425, 33427, 33517, 33428, 33467, 33429, 33430, 33429, 33426, 33424, 33424, 33467, 33429, 33427, 33467, 33425, 33425, 33468, 33425, 33511, 33516, 33519, 33429, 33468, 33479, 33516, 33512, 33514, 33515, 33513, 33512, 33513, 33513, 33514, 33516};
    }
}
